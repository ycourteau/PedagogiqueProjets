package com.google.android.gms.analytics.internal;

public abstract class C0717p extends C0716o {
    private boolean f2037a;
    private boolean f2038b;

    protected C0717p(C0750r c0750r) {
        super(c0750r);
    }

    public boolean m3227C() {
        return this.f2037a && !this.f2038b;
    }

    protected void m3228D() {
        if (!m3227C()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public void m3229E() {
        mo540a();
        this.f2037a = true;
    }

    protected abstract void mo540a();
}
