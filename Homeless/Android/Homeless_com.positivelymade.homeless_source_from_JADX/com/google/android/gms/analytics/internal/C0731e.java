package com.google.android.gms.analytics.internal;

public class C0731e {
    private final long f2136a;
    private final int f2137b;
    private double f2138c;
    private long f2139d;
    private final Object f2140e;
    private final String f2141f;

    public C0731e(int i, long j, String str) {
        this.f2140e = new Object();
        this.f2137b = i;
        this.f2138c = (double) this.f2137b;
        this.f2136a = j;
        this.f2141f = str;
    }

    public C0731e(String str) {
        this(60, 2000, str);
    }

    public boolean m3381a() {
        boolean z;
        synchronized (this.f2140e) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f2138c < ((double) this.f2137b)) {
                double d = ((double) (currentTimeMillis - this.f2139d)) / ((double) this.f2136a);
                if (d > 0.0d) {
                    this.f2138c = Math.min((double) this.f2137b, d + this.f2138c);
                }
            }
            this.f2139d = currentTimeMillis;
            if (this.f2138c >= 1.0d) {
                this.f2138c -= 1.0d;
                z = true;
            } else {
                C0732f.m3384a("Excessive " + this.f2141f + " detected; call ignored.");
                z = false;
            }
        }
        return z;
    }
}
