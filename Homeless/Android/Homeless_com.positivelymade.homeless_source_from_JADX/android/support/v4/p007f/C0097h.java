package android.support.v4.p007f;

public class C0097h<E> implements Cloneable {
    private static final Object f297a = new Object();
    private boolean f298b;
    private int[] f299c;
    private Object[] f300d;
    private int f301e;

    public C0097h() {
        this(10);
    }

    public C0097h(int i) {
        this.f298b = false;
        if (i == 0) {
            this.f299c = C0088b.f272a;
            this.f300d = C0088b.f274c;
        } else {
            int a = C0088b.m470a(i);
            this.f299c = new int[a];
            this.f300d = new Object[a];
        }
        this.f301e = 0;
    }

    private void m485d() {
        int i = this.f301e;
        int[] iArr = this.f299c;
        Object[] objArr = this.f300d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f297a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f298b = false;
        this.f301e = i2;
    }

    public C0097h<E> m486a() {
        try {
            C0097h<E> c0097h = (C0097h) super.clone();
            try {
                c0097h.f299c = (int[]) this.f299c.clone();
                c0097h.f300d = (Object[]) this.f300d.clone();
                return c0097h;
            } catch (CloneNotSupportedException e) {
                return c0097h;
            }
        } catch (CloneNotSupportedException e2) {
            return null;
        }
    }

    public E m487a(int i) {
        return m488a(i, null);
    }

    public E m488a(int i, E e) {
        int a = C0088b.m471a(this.f299c, this.f301e, i);
        return (a < 0 || this.f300d[a] == f297a) ? e : this.f300d[a];
    }

    public int m489b() {
        if (this.f298b) {
            m485d();
        }
        return this.f301e;
    }

    public void m490b(int i) {
        int a = C0088b.m471a(this.f299c, this.f301e, i);
        if (a >= 0 && this.f300d[a] != f297a) {
            this.f300d[a] = f297a;
            this.f298b = true;
        }
    }

    public void m491b(int i, E e) {
        int a = C0088b.m471a(this.f299c, this.f301e, i);
        if (a >= 0) {
            this.f300d[a] = e;
            return;
        }
        a ^= -1;
        if (a >= this.f301e || this.f300d[a] != f297a) {
            if (this.f298b && this.f301e >= this.f299c.length) {
                m485d();
                a = C0088b.m471a(this.f299c, this.f301e, i) ^ -1;
            }
            if (this.f301e >= this.f299c.length) {
                int a2 = C0088b.m470a(this.f301e + 1);
                Object obj = new int[a2];
                Object obj2 = new Object[a2];
                System.arraycopy(this.f299c, 0, obj, 0, this.f299c.length);
                System.arraycopy(this.f300d, 0, obj2, 0, this.f300d.length);
                this.f299c = obj;
                this.f300d = obj2;
            }
            if (this.f301e - a != 0) {
                System.arraycopy(this.f299c, a, this.f299c, a + 1, this.f301e - a);
                System.arraycopy(this.f300d, a, this.f300d, a + 1, this.f301e - a);
            }
            this.f299c[a] = i;
            this.f300d[a] = e;
            this.f301e++;
            return;
        }
        this.f299c[a] = i;
        this.f300d[a] = e;
    }

    public void m492c() {
        int i = this.f301e;
        Object[] objArr = this.f300d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f301e = 0;
        this.f298b = false;
    }

    public void m493c(int i) {
        m490b(i);
    }

    public /* synthetic */ Object clone() {
        return m486a();
    }

    public void m494d(int i) {
        if (this.f300d[i] != f297a) {
            this.f300d[i] = f297a;
            this.f298b = true;
        }
    }

    public int m495e(int i) {
        if (this.f298b) {
            m485d();
        }
        return this.f299c[i];
    }

    public E m496f(int i) {
        if (this.f298b) {
            m485d();
        }
        return this.f300d[i];
    }

    public int m497g(int i) {
        if (this.f298b) {
            m485d();
        }
        return C0088b.m471a(this.f299c, this.f301e, i);
    }

    public String toString() {
        if (m489b() <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f301e * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.f301e; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(m495e(i));
            stringBuilder.append('=');
            C0097h f = m496f(i);
            if (f != this) {
                stringBuilder.append(f);
            } else {
                stringBuilder.append("(this Map)");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
