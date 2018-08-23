package com.google.android.gms.p028c;

import com.google.android.gms.ads.internal.util.client.C0690a;
import java.util.ArrayList;
import java.util.List;

class hd {
    private final Object f3453a = new Object();
    private final List<Runnable> f3454b = new ArrayList();
    private final List<Runnable> f3455c = new ArrayList();
    private boolean f3456d = false;

    private void m4984b(Runnable runnable) {
        gn.m4822a(runnable);
    }

    private void m4985c(Runnable runnable) {
        C0690a.f1980a.post(runnable);
    }

    public void m4986a() {
        synchronized (this.f3453a) {
            if (this.f3456d) {
                return;
            }
            for (Runnable b : this.f3454b) {
                m4984b(b);
            }
            for (Runnable b2 : this.f3455c) {
                m4985c(b2);
            }
            this.f3454b.clear();
            this.f3455c.clear();
            this.f3456d = true;
        }
    }

    public void m4987a(Runnable runnable) {
        synchronized (this.f3453a) {
            if (this.f3456d) {
                m4984b(runnable);
            } else {
                this.f3454b.add(runnable);
            }
        }
    }
}
