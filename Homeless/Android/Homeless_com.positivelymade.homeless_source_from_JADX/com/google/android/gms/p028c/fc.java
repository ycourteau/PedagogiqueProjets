package com.google.android.gms.p028c;

import android.net.TrafficStats;
import android.os.Build.VERSION;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

public class fc extends Thread {
    private final BlockingQueue<hz<?>> f3007a;
    private final eb f3008b;
    private final aa f3009c;
    private final jd f3010d;
    private volatile boolean f3011e = false;

    public fc(BlockingQueue<hz<?>> blockingQueue, eb ebVar, aa aaVar, jd jdVar) {
        this.f3007a = blockingQueue;
        this.f3008b = ebVar;
        this.f3009c = aaVar;
        this.f3010d = jdVar;
    }

    private void m4557a(hz<?> hzVar) {
        if (VERSION.SDK_INT >= 14) {
            TrafficStats.setThreadStatsTag(hzVar.m4028c());
        }
    }

    private void m4558a(hz<?> hzVar, lc lcVar) {
        this.f3010d.mo634a((hz) hzVar, hzVar.m4022a(lcVar));
    }

    public void m4559a() {
        this.f3011e = true;
        interrupt();
    }

    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                hz hzVar = (hz) this.f3007a.take();
                try {
                    hzVar.m4027b("network-queue-take");
                    if (hzVar.m4033g()) {
                        hzVar.m4029c("network-discard-cancelled");
                    } else {
                        m4557a(hzVar);
                        gu a = this.f3008b.mo840a(hzVar);
                        hzVar.m4027b("network-http-complete");
                        if (a.f3419d && hzVar.m4047u()) {
                            hzVar.m4029c("not-modified");
                        } else {
                            iw a2 = hzVar.mo620a(a);
                            hzVar.m4027b("network-parse-complete");
                            if (hzVar.m4042p() && a2.f3605b != null) {
                                this.f3009c.mo843a(hzVar.m4031e(), a2.f3605b);
                                hzVar.m4027b("network-cache-written");
                            }
                            hzVar.m4046t();
                            this.f3010d.mo632a(hzVar, a2);
                        }
                    }
                } catch (lc e) {
                    e.m3756a(SystemClock.elapsedRealtime() - elapsedRealtime);
                    m4558a(hzVar, e);
                } catch (Throwable e2) {
                    ln.m5766a(e2, "Unhandled exception %s", e2.toString());
                    lc lcVar = new lc(e2);
                    lcVar.m3756a(SystemClock.elapsedRealtime() - elapsedRealtime);
                    this.f3010d.mo634a(hzVar, lcVar);
                }
            } catch (InterruptedException e3) {
                if (this.f3011e) {
                    return;
                }
            }
        }
    }
}
