package com.google.android.gms.p028c;

import com.google.android.gms.ads.internal.C0618p;

@fn
public class cp extends gk {
    final hg f2627a;
    final cr f2628b;
    private final String f2629c;

    class C08661 implements Runnable {
        final /* synthetic */ cp f2626a;

        C08661(cp cpVar) {
            this.f2626a = cpVar;
        }

        public void run() {
            C0618p.m2809r().m4118b(this.f2626a);
        }
    }

    cp(hg hgVar, cr crVar, String str) {
        this.f2627a = hgVar;
        this.f2628b = crVar;
        this.f2629c = str;
        C0618p.m2809r().m4116a(this);
    }

    public void mo486a() {
        try {
            this.f2628b.mo629a(this.f2629c);
        } finally {
            go.f3361a.post(new C08661(this));
        }
    }

    public void mo487b() {
        this.f2628b.mo628a();
    }
}
