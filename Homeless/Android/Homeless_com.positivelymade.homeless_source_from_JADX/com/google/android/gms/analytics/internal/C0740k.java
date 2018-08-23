package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.p028c.ik;

class C0740k {
    private final ik f2163a;
    private long f2164b;

    public C0740k(ik ikVar) {
        C1305x.m6617a((Object) ikVar);
        this.f2163a = ikVar;
    }

    public C0740k(ik ikVar, long j) {
        C1305x.m6617a((Object) ikVar);
        this.f2163a = ikVar;
        this.f2164b = j;
    }

    public void m3444a() {
        this.f2164b = this.f2163a.mo825b();
    }

    public boolean m3445a(long j) {
        return this.f2164b == 0 || this.f2163a.mo825b() - this.f2164b > j;
    }

    public void m3446b() {
        this.f2164b = 0;
    }
}
