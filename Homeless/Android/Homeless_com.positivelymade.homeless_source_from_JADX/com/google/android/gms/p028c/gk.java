package com.google.android.gms.p028c;

import java.util.concurrent.Future;

@fn
public abstract class gk {
    private final Runnable f1725a = new C09761(this);
    private volatile Thread f1726b;

    class C09761 implements Runnable {
        final /* synthetic */ gk f3341a;

        C09761(gk gkVar) {
            this.f3341a = gkVar;
        }

        public final void run() {
            this.f3341a.f1726b = Thread.currentThread();
            this.f3341a.mo486a();
        }
    }

    public abstract void mo486a();

    public abstract void mo487b();

    public final Future m2829g() {
        return gn.m4822a(this.f1725a);
    }

    public final void m2830h() {
        gn.m4821a(1, this.f1725a);
    }

    public final void m2831i() {
        mo487b();
        if (this.f1726b != null) {
            this.f1726b.interrupt();
        }
    }
}
