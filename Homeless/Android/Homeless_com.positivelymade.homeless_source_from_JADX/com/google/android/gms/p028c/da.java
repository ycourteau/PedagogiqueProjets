package com.google.android.gms.p028c;

import android.os.Handler;
import java.util.concurrent.Executor;

public class da implements jd {
    private final Executor f2724a;

    private class C0895a implements Runnable {
        final /* synthetic */ da f2720a;
        private final hz f2721b;
        private final iw f2722c;
        private final Runnable f2723d;

        public C0895a(da daVar, hz hzVar, iw iwVar, Runnable runnable) {
            this.f2720a = daVar;
            this.f2721b = hzVar;
            this.f2722c = iwVar;
            this.f2723d = runnable;
        }

        public void run() {
            if (this.f2721b.m4033g()) {
                this.f2721b.m4029c("canceled-at-delivery");
                return;
            }
            if (this.f2722c.m5305a()) {
                this.f2721b.mo621a(this.f2722c.f3604a);
            } else {
                this.f2721b.m4026b(this.f2722c.f3606c);
            }
            if (this.f2722c.f3607d) {
                this.f2721b.m4027b("intermediate-response");
            } else {
                this.f2721b.m4029c("done");
            }
            if (this.f2723d != null) {
                this.f2723d.run();
            }
        }
    }

    public da(final Handler handler) {
        this.f2724a = new Executor(this) {
            final /* synthetic */ da f2719b;

            public void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    public void mo632a(hz<?> hzVar, iw<?> iwVar) {
        mo633a(hzVar, iwVar, null);
    }

    public void mo633a(hz<?> hzVar, iw<?> iwVar, Runnable runnable) {
        hzVar.m4046t();
        hzVar.m4027b("post-response");
        this.f2724a.execute(new C0895a(this, hzVar, iwVar, runnable));
    }

    public void mo634a(hz<?> hzVar, lc lcVar) {
        hzVar.m4027b("post-error");
        this.f2724a.execute(new C0895a(this, hzVar, iw.m5303a(lcVar), null));
    }
}
