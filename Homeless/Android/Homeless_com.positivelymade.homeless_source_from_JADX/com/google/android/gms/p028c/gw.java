package com.google.android.gms.p028c;

import com.google.android.gms.ads.internal.C0618p;

public class gw {
    private long f3425a;
    private long f3426b = Long.MIN_VALUE;
    private Object f3427c = new Object();

    public gw(long j) {
        this.f3425a = j;
    }

    public boolean m4968a() {
        boolean z;
        synchronized (this.f3427c) {
            long b = C0618p.m2800i().mo825b();
            if (this.f3426b + this.f3425a > b) {
                z = false;
            } else {
                this.f3426b = b;
                z = true;
            }
        }
        return z;
    }
}
