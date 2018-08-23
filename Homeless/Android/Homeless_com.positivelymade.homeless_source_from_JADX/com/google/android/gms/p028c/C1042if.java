package com.google.android.gms.p028c;

import java.util.Map;

public class C1042if<K, V> {
    static Object[] f3576b;
    static int f3577c;
    static Object[] f3578d;
    static int f3579e;
    int[] f3580f = id.f3584a;
    Object[] f3581g = id.f3586c;
    int f3582h = 0;

    private static void m5235a(int[] iArr, Object[] objArr, int i) {
        int i2;
        if (iArr.length == 8) {
            synchronized (ic.class) {
                if (f3579e < 10) {
                    objArr[0] = f3578d;
                    objArr[1] = iArr;
                    for (i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f3578d = objArr;
                    f3579e++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (ic.class) {
                if (f3577c < 10) {
                    objArr[0] = f3576b;
                    objArr[1] = iArr;
                    for (i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f3576b = objArr;
                    f3577c++;
                }
            }
        }
    }

    private void m5236e(int i) {
        Object[] objArr;
        if (i == 8) {
            synchronized (ic.class) {
                if (f3578d != null) {
                    objArr = f3578d;
                    this.f3581g = objArr;
                    f3578d = (Object[]) objArr[0];
                    this.f3580f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f3579e--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (ic.class) {
                if (f3576b != null) {
                    objArr = f3576b;
                    this.f3581g = objArr;
                    f3576b = (Object[]) objArr[0];
                    this.f3580f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f3577c--;
                    return;
                }
            }
        }
        this.f3580f = new int[i];
        this.f3581g = new Object[(i << 1)];
    }

    int m5237a() {
        int i = this.f3582h;
        if (i == 0) {
            return -1;
        }
        int a = id.m5246a(this.f3580f, i, 0);
        if (a < 0 || this.f3581g[a << 1] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f3580f[i2] == 0) {
            if (this.f3581g[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        a--;
        while (a >= 0 && this.f3580f[a] == 0) {
            if (this.f3581g[a << 1] == null) {
                return a;
            }
            a--;
        }
        return i2 ^ -1;
    }

    int m5238a(Object obj) {
        int i = 1;
        int i2 = this.f3582h * 2;
        Object[] objArr = this.f3581g;
        if (obj == null) {
            while (i < i2) {
                if (objArr[i] == null) {
                    return i >> 1;
                }
                i += 2;
            }
        } else {
            while (i < i2) {
                if (obj.equals(objArr[i])) {
                    return i >> 1;
                }
                i += 2;
            }
        }
        return -1;
    }

    int m5239a(Object obj, int i) {
        int i2 = this.f3582h;
        if (i2 == 0) {
            return -1;
        }
        int a = id.m5246a(this.f3580f, i2, i);
        if (a < 0 || obj.equals(this.f3581g[a << 1])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f3580f[i3] == i) {
            if (obj.equals(this.f3581g[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        a--;
        while (a >= 0 && this.f3580f[a] == i) {
            if (obj.equals(this.f3581g[a << 1])) {
                return a;
            }
            a--;
        }
        return i3 ^ -1;
    }

    public V m5240a(int i, V v) {
        int i2 = (i << 1) + 1;
        V v2 = this.f3581g[i2];
        this.f3581g[i2] = v;
        return v2;
    }

    public void m5241a(int i) {
        if (this.f3580f.length < i) {
            Object obj = this.f3580f;
            Object obj2 = this.f3581g;
            m5236e(i);
            if (this.f3582h > 0) {
                System.arraycopy(obj, 0, this.f3580f, 0, this.f3582h);
                System.arraycopy(obj2, 0, this.f3581g, 0, this.f3582h << 1);
            }
            C1042if.m5235a(obj, obj2, this.f3582h);
        }
    }

    public K m5242b(int i) {
        return this.f3581g[i << 1];
    }

    public V m5243c(int i) {
        return this.f3581g[(i << 1) + 1];
    }

    public void clear() {
        if (this.f3582h != 0) {
            C1042if.m5235a(this.f3580f, this.f3581g, this.f3582h);
            this.f3580f = id.f3584a;
            this.f3581g = id.f3586c;
            this.f3582h = 0;
        }
    }

    public boolean containsKey(Object obj) {
        return obj == null ? m5237a() >= 0 : m5239a(obj, obj.hashCode()) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m5238a(obj) >= 0;
    }

    public V m5244d(int i) {
        int i2 = 8;
        V v = this.f3581g[(i << 1) + 1];
        if (this.f3582h <= 1) {
            C1042if.m5235a(this.f3580f, this.f3581g, this.f3582h);
            this.f3580f = id.f3584a;
            this.f3581g = id.f3586c;
            this.f3582h = 0;
        } else if (this.f3580f.length <= 8 || this.f3582h >= this.f3580f.length / 3) {
            this.f3582h--;
            if (i < this.f3582h) {
                System.arraycopy(this.f3580f, i + 1, this.f3580f, i, this.f3582h - i);
                System.arraycopy(this.f3581g, (i + 1) << 1, this.f3581g, i << 1, (this.f3582h - i) << 1);
            }
            this.f3581g[this.f3582h << 1] = null;
            this.f3581g[(this.f3582h << 1) + 1] = null;
        } else {
            if (this.f3582h > 8) {
                i2 = this.f3582h + (this.f3582h >> 1);
            }
            Object obj = this.f3580f;
            Object obj2 = this.f3581g;
            m5236e(i2);
            this.f3582h--;
            if (i > 0) {
                System.arraycopy(obj, 0, this.f3580f, 0, i);
                System.arraycopy(obj2, 0, this.f3581g, 0, i << 1);
            }
            if (i < this.f3582h) {
                System.arraycopy(obj, i + 1, this.f3580f, i, this.f3582h - i);
                System.arraycopy(obj2, (i + 1) << 1, this.f3581g, i << 1, (this.f3582h - i) << 1);
            }
        }
        return v;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        int i = 0;
        while (i < this.f3582h) {
            try {
                Object b = m5242b(i);
                Object c = m5243c(i);
                Object obj2 = map.get(b);
                if (c == null) {
                    if (obj2 != null || !map.containsKey(b)) {
                        return false;
                    }
                } else if (!c.equals(obj2)) {
                    return false;
                }
                i++;
            } catch (NullPointerException e) {
                return false;
            } catch (ClassCastException e2) {
                return false;
            }
        }
        return true;
    }

    public V get(Object obj) {
        int a = obj == null ? m5237a() : m5239a(obj, obj.hashCode());
        return a >= 0 ? this.f3581g[(a << 1) + 1] : null;
    }

    public int hashCode() {
        int[] iArr = this.f3580f;
        Object[] objArr = this.f3581g;
        int i = this.f3582h;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public boolean isEmpty() {
        return this.f3582h <= 0;
    }

    public V put(K k, V v) {
        int a;
        int i;
        int i2 = 8;
        if (k == null) {
            a = m5237a();
            i = 0;
        } else {
            i = k.hashCode();
            a = m5239a((Object) k, i);
        }
        if (a >= 0) {
            int i3 = (a << 1) + 1;
            V v2 = this.f3581g[i3];
            this.f3581g[i3] = v;
            return v2;
        }
        a ^= -1;
        if (this.f3582h >= this.f3580f.length) {
            if (this.f3582h >= 8) {
                i2 = this.f3582h + (this.f3582h >> 1);
            } else if (this.f3582h < 4) {
                i2 = 4;
            }
            Object obj = this.f3580f;
            Object obj2 = this.f3581g;
            m5236e(i2);
            if (this.f3580f.length > 0) {
                System.arraycopy(obj, 0, this.f3580f, 0, obj.length);
                System.arraycopy(obj2, 0, this.f3581g, 0, obj2.length);
            }
            C1042if.m5235a(obj, obj2, this.f3582h);
        }
        if (a < this.f3582h) {
            System.arraycopy(this.f3580f, a, this.f3580f, a + 1, this.f3582h - a);
            System.arraycopy(this.f3581g, a << 1, this.f3581g, (a + 1) << 1, (this.f3582h - a) << 1);
        }
        this.f3580f[a] = i;
        this.f3581g[a << 1] = k;
        this.f3581g[(a << 1) + 1] = v;
        this.f3582h++;
        return null;
    }

    public V remove(Object obj) {
        int a = obj == null ? m5237a() : m5239a(obj, obj.hashCode());
        return a >= 0 ? m5244d(a) : null;
    }

    public int size() {
        return this.f3582h;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f3582h * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.f3582h; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            C1042if b = m5242b(i);
            if (b != this) {
                stringBuilder.append(b);
            } else {
                stringBuilder.append("(this Map)");
            }
            stringBuilder.append('=');
            b = m5243c(i);
            if (b != this) {
                stringBuilder.append(b);
            } else {
                stringBuilder.append("(this Map)");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
