package com.google.android.gms.ads.p019b;

public final class C0466b {
    private final boolean f1252a;
    private final int f1253b;
    private final boolean f1254c;

    public static final class C0465a {
        private boolean f1249a = false;
        private int f1250b = 0;
        private boolean f1251c = false;

        public C0465a m2064a(int i) {
            this.f1250b = i;
            return this;
        }

        public C0465a m2065a(boolean z) {
            this.f1249a = z;
            return this;
        }

        public C0466b m2066a() {
            return new C0466b();
        }

        public C0465a m2067b(boolean z) {
            this.f1251c = z;
            return this;
        }
    }

    private C0466b(C0465a c0465a) {
        this.f1252a = c0465a.f1249a;
        this.f1253b = c0465a.f1250b;
        this.f1254c = c0465a.f1251c;
    }

    public boolean m2068a() {
        return this.f1252a;
    }

    public int m2069b() {
        return this.f1253b;
    }

    public boolean m2070c() {
        return this.f1254c;
    }
}
