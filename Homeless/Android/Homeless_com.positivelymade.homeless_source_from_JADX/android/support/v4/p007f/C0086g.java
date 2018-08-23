package android.support.v4.p007f;

import java.util.Map;

public class C0086g<K, V> {
    static Object[] f264b;
    static int f265c;
    static Object[] f266d;
    static int f267e;
    int[] f268f;
    Object[] f269g;
    int f270h;

    public C0086g() {
        this.f268f = C0088b.f272a;
        this.f269g = C0088b.f274c;
        this.f270h = 0;
    }

    public C0086g(int i) {
        if (i == 0) {
            this.f268f = C0088b.f272a;
            this.f269g = C0088b.f274c;
        } else {
            m458e(i);
        }
        this.f270h = 0;
    }

    private static void m457a(int[] iArr, Object[] objArr, int i) {
        int i2;
        if (iArr.length == 8) {
            synchronized (C0087a.class) {
                if (f267e < 10) {
                    objArr[0] = f266d;
                    objArr[1] = iArr;
                    for (i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f266d = objArr;
                    f267e++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0087a.class) {
                if (f265c < 10) {
                    objArr[0] = f264b;
                    objArr[1] = iArr;
                    for (i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f264b = objArr;
                    f265c++;
                }
            }
        }
    }

    private void m458e(int i) {
        Object[] objArr;
        if (i == 8) {
            synchronized (C0087a.class) {
                if (f266d != null) {
                    objArr = f266d;
                    this.f269g = objArr;
                    f266d = (Object[]) objArr[0];
                    this.f268f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f267e--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0087a.class) {
                if (f264b != null) {
                    objArr = f264b;
                    this.f269g = objArr;
                    f264b = (Object[]) objArr[0];
                    this.f268f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f265c--;
                    return;
                }
            }
        }
        this.f268f = new int[i];
        this.f269g = new Object[(i << 1)];
    }

    int m459a() {
        int i = this.f270h;
        if (i == 0) {
            return -1;
        }
        int a = C0088b.m471a(this.f268f, i, 0);
        if (a < 0 || this.f269g[a << 1] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f268f[i2] == 0) {
            if (this.f269g[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        a--;
        while (a >= 0 && this.f268f[a] == 0) {
            if (this.f269g[a << 1] == null) {
                return a;
            }
            a--;
        }
        return i2 ^ -1;
    }

    public int m460a(Object obj) {
        return obj == null ? m459a() : m461a(obj, obj.hashCode());
    }

    int m461a(Object obj, int i) {
        int i2 = this.f270h;
        if (i2 == 0) {
            return -1;
        }
        int a = C0088b.m471a(this.f268f, i2, i);
        if (a < 0 || obj.equals(this.f269g[a << 1])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f268f[i3] == i) {
            if (obj.equals(this.f269g[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        a--;
        while (a >= 0 && this.f268f[a] == i) {
            if (obj.equals(this.f269g[a << 1])) {
                return a;
            }
            a--;
        }
        return i3 ^ -1;
    }

    public V m462a(int i, V v) {
        int i2 = (i << 1) + 1;
        V v2 = this.f269g[i2];
        this.f269g[i2] = v;
        return v2;
    }

    public void m463a(int i) {
        if (this.f268f.length < i) {
            Object obj = this.f268f;
            Object obj2 = this.f269g;
            m458e(i);
            if (this.f270h > 0) {
                System.arraycopy(obj, 0, this.f268f, 0, this.f270h);
                System.arraycopy(obj2, 0, this.f269g, 0, this.f270h << 1);
            }
            C0086g.m457a(obj, obj2, this.f270h);
        }
    }

    int m464b(Object obj) {
        int i = 1;
        int i2 = this.f270h * 2;
        Object[] objArr = this.f269g;
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

    public K m465b(int i) {
        return this.f269g[i << 1];
    }

    public V m466c(int i) {
        return this.f269g[(i << 1) + 1];
    }

    public void clear() {
        if (this.f270h != 0) {
            C0086g.m457a(this.f268f, this.f269g, this.f270h);
            this.f268f = C0088b.f272a;
            this.f269g = C0088b.f274c;
            this.f270h = 0;
        }
    }

    public boolean containsKey(Object obj) {
        return m460a(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m464b(obj) >= 0;
    }

    public V m467d(int i) {
        int i2 = 8;
        V v = this.f269g[(i << 1) + 1];
        if (this.f270h <= 1) {
            C0086g.m457a(this.f268f, this.f269g, this.f270h);
            this.f268f = C0088b.f272a;
            this.f269g = C0088b.f274c;
            this.f270h = 0;
        } else if (this.f268f.length <= 8 || this.f270h >= this.f268f.length / 3) {
            this.f270h--;
            if (i < this.f270h) {
                System.arraycopy(this.f268f, i + 1, this.f268f, i, this.f270h - i);
                System.arraycopy(this.f269g, (i + 1) << 1, this.f269g, i << 1, (this.f270h - i) << 1);
            }
            this.f269g[this.f270h << 1] = null;
            this.f269g[(this.f270h << 1) + 1] = null;
        } else {
            if (this.f270h > 8) {
                i2 = this.f270h + (this.f270h >> 1);
            }
            Object obj = this.f268f;
            Object obj2 = this.f269g;
            m458e(i2);
            this.f270h--;
            if (i > 0) {
                System.arraycopy(obj, 0, this.f268f, 0, i);
                System.arraycopy(obj2, 0, this.f269g, 0, i << 1);
            }
            if (i < this.f270h) {
                System.arraycopy(obj, i + 1, this.f268f, i, this.f270h - i);
                System.arraycopy(obj2, (i + 1) << 1, this.f269g, i << 1, (this.f270h - i) << 1);
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
        while (i < this.f270h) {
            try {
                Object b = m465b(i);
                Object c = m466c(i);
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
        int a = m460a(obj);
        return a >= 0 ? this.f269g[(a << 1) + 1] : null;
    }

    public int hashCode() {
        int[] iArr = this.f268f;
        Object[] objArr = this.f269g;
        int i = this.f270h;
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
        return this.f270h <= 0;
    }

    public V put(K k, V v) {
        int a;
        int i;
        int i2 = 8;
        if (k == null) {
            a = m459a();
            i = 0;
        } else {
            i = k.hashCode();
            a = m461a((Object) k, i);
        }
        if (a >= 0) {
            int i3 = (a << 1) + 1;
            V v2 = this.f269g[i3];
            this.f269g[i3] = v;
            return v2;
        }
        a ^= -1;
        if (this.f270h >= this.f268f.length) {
            if (this.f270h >= 8) {
                i2 = this.f270h + (this.f270h >> 1);
            } else if (this.f270h < 4) {
                i2 = 4;
            }
            Object obj = this.f268f;
            Object obj2 = this.f269g;
            m458e(i2);
            if (this.f268f.length > 0) {
                System.arraycopy(obj, 0, this.f268f, 0, obj.length);
                System.arraycopy(obj2, 0, this.f269g, 0, obj2.length);
            }
            C0086g.m457a(obj, obj2, this.f270h);
        }
        if (a < this.f270h) {
            System.arraycopy(this.f268f, a, this.f268f, a + 1, this.f270h - a);
            System.arraycopy(this.f269g, a << 1, this.f269g, (a + 1) << 1, (this.f270h - a) << 1);
        }
        this.f268f[a] = i;
        this.f269g[a << 1] = k;
        this.f269g[(a << 1) + 1] = v;
        this.f270h++;
        return null;
    }

    public V remove(Object obj) {
        int a = m460a(obj);
        return a >= 0 ? m467d(a) : null;
    }

    public int size() {
        return this.f270h;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f270h * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.f270h; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            C0086g b = m465b(i);
            if (b != this) {
                stringBuilder.append(b);
            } else {
                stringBuilder.append("(this Map)");
            }
            stringBuilder.append('=');
            b = m466c(i);
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
