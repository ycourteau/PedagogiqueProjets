package android.support.v4.view.p008a;

import android.os.Build.VERSION;

public class C0149g {
    private static final C0144c f385a;
    private final Object f386b;

    interface C0144c {
        Object mo125a();

        void mo126a(Object obj, int i);

        void mo127a(Object obj, boolean z);

        void mo128b(Object obj, int i);

        void mo129c(Object obj, int i);
    }

    static class C0145e implements C0144c {
        C0145e() {
        }

        public Object mo125a() {
            return null;
        }

        public void mo126a(Object obj, int i) {
        }

        public void mo127a(Object obj, boolean z) {
        }

        public void mo128b(Object obj, int i) {
        }

        public void mo129c(Object obj, int i) {
        }
    }

    static class C0146a extends C0145e {
        C0146a() {
        }

        public Object mo125a() {
            return C0150h.m783a();
        }

        public void mo126a(Object obj, int i) {
            C0150h.m784a(obj, i);
        }

        public void mo127a(Object obj, boolean z) {
            C0150h.m785a(obj, z);
        }

        public void mo128b(Object obj, int i) {
            C0150h.m786b(obj, i);
        }

        public void mo129c(Object obj, int i) {
            C0150h.m787c(obj, i);
        }
    }

    static class C0147b extends C0146a {
        C0147b() {
        }
    }

    static class C0148d extends C0147b {
        C0148d() {
        }
    }

    static {
        if (VERSION.SDK_INT >= 16) {
            f385a = new C0148d();
        } else if (VERSION.SDK_INT >= 15) {
            f385a = new C0147b();
        } else if (VERSION.SDK_INT >= 14) {
            f385a = new C0146a();
        } else {
            f385a = new C0145e();
        }
    }

    public C0149g(Object obj) {
        this.f386b = obj;
    }

    public static C0149g m778a() {
        return new C0149g(f385a.mo125a());
    }

    public void m779a(int i) {
        f385a.mo128b(this.f386b, i);
    }

    public void m780a(boolean z) {
        f385a.mo127a(this.f386b, z);
    }

    public void m781b(int i) {
        f385a.mo126a(this.f386b, i);
    }

    public void m782c(int i) {
        f385a.mo129c(this.f386b, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        C0149g c0149g = (C0149g) obj;
        return this.f386b == null ? c0149g.f386b == null : this.f386b.equals(c0149g.f386b);
    }

    public int hashCode() {
        return this.f386b == null ? 0 : this.f386b.hashCode();
    }
}
