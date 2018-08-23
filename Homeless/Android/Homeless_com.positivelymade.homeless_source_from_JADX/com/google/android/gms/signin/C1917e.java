package com.google.android.gms.signin;

import com.google.android.gms.common.api.C1173a.C1164a.C1168d;
import com.google.android.gms.common.api.C1180c.C1178d;

public final class C1917e implements C1168d {
    public static final C1917e f5874a = new C1916a().m9617a();
    private final boolean f5875b;
    private final boolean f5876c;
    private final String f5877d;
    private final C1178d f5878e;

    public static final class C1916a {
        private boolean f5870a;
        private boolean f5871b;
        private String f5872c;
        private C1178d f5873d;

        public C1917e m9617a() {
            return new C1917e(this.f5870a, this.f5871b, this.f5872c, this.f5873d);
        }
    }

    private C1917e(boolean z, boolean z2, String str, C1178d c1178d) {
        this.f5875b = z;
        this.f5876c = z2;
        this.f5877d = str;
        this.f5878e = c1178d;
    }

    public boolean m9618a() {
        return this.f5875b;
    }

    public boolean m9619b() {
        return this.f5876c;
    }

    public String m9620c() {
        return this.f5877d;
    }

    public C1178d m9621d() {
        return this.f5878e;
    }
}
