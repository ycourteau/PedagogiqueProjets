package com.google.p016a;

import com.google.android.gms.ads.C0483d;

@Deprecated
public final class C0451b {
    public static final C0451b f1236a = new C0451b(-1, -2, "mb");
    public static final C0451b f1237b = new C0451b(320, 50, "mb");
    public static final C0451b f1238c = new C0451b(300, 250, "as");
    public static final C0451b f1239d = new C0451b(468, 60, "as");
    public static final C0451b f1240e = new C0451b(728, 90, "as");
    public static final C0451b f1241f = new C0451b(160, 600, "as");
    private final C0483d f1242g;

    private C0451b(int i, int i2, String str) {
        this(new C0483d(i, i2));
    }

    public C0451b(C0483d c0483d) {
        this.f1242g = c0483d;
    }

    public int m2043a() {
        return this.f1242g.m2139b();
    }

    public int m2044b() {
        return this.f1242g.m2137a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0451b)) {
            return false;
        }
        return this.f1242g.equals(((C0451b) obj).f1242g);
    }

    public int hashCode() {
        return this.f1242g.hashCode();
    }

    public String toString() {
        return this.f1242g.toString();
    }
}
