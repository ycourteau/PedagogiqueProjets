package com.google.android.gms.p028c;

import android.os.Process;
import com.google.android.gms.p028c.aa.C0805a;
import java.util.concurrent.BlockingQueue;

public class bb extends Thread {
    private static final boolean f2509a = ln.f3966b;
    private final BlockingQueue<hz<?>> f2510b;
    private final BlockingQueue<hz<?>> f2511c;
    private final aa f2512d;
    private final jd f2513e;
    private volatile boolean f2514f = false;

    public bb(BlockingQueue<hz<?>> blockingQueue, BlockingQueue<hz<?>> blockingQueue2, aa aaVar, jd jdVar) {
        this.f2510b = blockingQueue;
        this.f2511c = blockingQueue2;
        this.f2512d = aaVar;
        this.f2513e = jdVar;
    }

    public void m3903a() {
        this.f2514f = true;
        interrupt();
    }

    public void run() {
        if (f2509a) {
            ln.m5765a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f2512d.mo842a();
        while (true) {
            try {
                final hz hzVar = (hz) this.f2510b.take();
                hzVar.m4027b("cache-queue-take");
                if (hzVar.m4033g()) {
                    hzVar.m4029c("cache-discard-canceled");
                } else {
                    C0805a a = this.f2512d.mo841a(hzVar.m4031e());
                    if (a == null) {
                        hzVar.m4027b("cache-miss");
                        this.f2511c.put(hzVar);
                    } else if (a.m3757a()) {
                        hzVar.m4027b("cache-hit-expired");
                        hzVar.m4018a(a);
                        this.f2511c.put(hzVar);
                    } else {
                        hzVar.m4027b("cache-hit");
                        iw a2 = hzVar.mo620a(new gu(a.f2353a, a.f2359g));
                        hzVar.m4027b("cache-hit-parsed");
                        if (a.m3758b()) {
                            hzVar.m4027b("cache-hit-refresh-needed");
                            hzVar.m4018a(a);
                            a2.f3607d = true;
                            this.f2513e.mo633a(hzVar, a2, new Runnable(this) {
                                final /* synthetic */ bb f2508b;

                                public void run() {
                                    try {
                                        this.f2508b.f2511c.put(hzVar);
                                    } catch (InterruptedException e) {
                                    }
                                }
                            });
                        } else {
                            this.f2513e.mo632a(hzVar, a2);
                        }
                    }
                }
            } catch (InterruptedException e) {
                if (this.f2514f) {
                    return;
                }
            }
        }
    }
}
