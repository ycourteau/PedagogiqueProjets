package com.google.android.gms.ads.internal.overlay;

import com.google.android.gms.p028c.go;

class C0617q implements Runnable {
    private C0613k f1692a;
    private boolean f1693b = false;

    C0617q(C0613k c0613k) {
        this.f1692a = c0613k;
    }

    public void m2789a() {
        this.f1693b = true;
        go.f3361a.removeCallbacks(this);
    }

    public void m2790b() {
        go.f3361a.postDelayed(this, 250);
    }

    public void run() {
        if (!this.f1693b) {
            this.f1692a.m2777n();
            m2790b();
        }
    }
}
