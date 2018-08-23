package com.google.android.gms.p028c;

public final class ki {
    private final boolean f3827a;
    private final boolean f3828b;
    private final String f3829c;
    private final String f3830d;

    public static final class C1104a {
        private final String f3823a;
        private boolean f3824b = true;
        private boolean f3825c = false;
        private String f3826d;

        public C1104a(String str) {
            this.f3823a = str;
        }

        public C1104a m5523a(String str) {
            this.f3826d = str;
            return this;
        }

        public C1104a m5524a(boolean z) {
            this.f3824b = z;
            return this;
        }

        public ki m5525a() {
            return new ki();
        }

        public C1104a m5526b(boolean z) {
            this.f3825c = z;
            return this;
        }
    }

    private ki(C1104a c1104a) {
        this.f3830d = c1104a.f3823a;
        this.f3827a = c1104a.f3824b;
        this.f3828b = c1104a.f3825c;
        this.f3829c = c1104a.f3826d;
    }

    public String m5527a() {
        return this.f3830d;
    }

    public boolean m5528b() {
        return this.f3827a;
    }

    public boolean m5529c() {
        return this.f3828b;
    }

    public String m5530d() {
        return this.f3829c;
    }
}
