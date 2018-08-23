package com.google.android.gms.p032d;

class bv implements bh {
    private final long f4759a;
    private final int f4760b;
    private double f4761c;
    private long f4762d;
    private final Object f4763e;

    public bv() {
        this(60, 2000);
    }

    public bv(int i, long j) {
        this.f4763e = new Object();
        this.f4760b = i;
        this.f4761c = (double) this.f4760b;
        this.f4759a = j;
    }

    public boolean mo980a() {
        boolean z;
        synchronized (this.f4763e) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f4761c < ((double) this.f4760b)) {
                double d = ((double) (currentTimeMillis - this.f4762d)) / ((double) this.f4759a);
                if (d > 0.0d) {
                    this.f4761c = Math.min((double) this.f4760b, d + this.f4761c);
                }
            }
            this.f4762d = currentTimeMillis;
            if (this.f4761c >= 1.0d) {
                this.f4761c -= 1.0d;
                z = true;
            } else {
                aj.m7038b("No more tokens available.");
                z = false;
            }
        }
        return z;
    }
}
