package com.google.android.gms.analytics.internal;

import com.google.android.gms.p028c.jp;

public class C0760w extends C0717p {
    private final jp f2229a = new jp();

    C0760w(C0750r c0750r) {
        super(c0750r);
    }

    protected void mo540a() {
        m3218r().m5375a().m5394a(this.f2229a);
        m3586b();
    }

    public void m3586b() {
        C0742m v = m3222v();
        String c = v.m3466c();
        if (c != null) {
            this.f2229a.m5395a(c);
        }
        String b = v.m3465b();
        if (b != null) {
            this.f2229a.m5397b(b);
        }
    }

    public jp m3587c() {
        m3228D();
        return this.f2229a;
    }
}
