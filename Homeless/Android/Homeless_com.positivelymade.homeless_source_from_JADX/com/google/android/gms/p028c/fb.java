package com.google.android.gms.p028c;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.p028c.fd.C0494a;
import com.google.android.gms.p028c.gd.C0973a;

@fn
public abstract class fb extends gk {
    protected final C0494a f2926b;
    protected final Context f2927c;
    protected final hg f2928d;
    protected final Object f2929e = new Object();
    protected final Object f2930f = new Object();
    protected final C0973a f2931g;
    protected AdResponseParcel f2932h;

    class C09361 implements Runnable {
        final /* synthetic */ fb f3003a;

        C09361(fb fbVar) {
            this.f3003a = fbVar;
        }

        public void run() {
            this.f3003a.mo487b();
        }
    }

    protected static final class C0938a extends Exception {
        private final int f3006a;

        public C0938a(String str, int i) {
            super(str);
            this.f3006a = i;
        }

        public int m4556a() {
            return this.f3006a;
        }
    }

    protected fb(Context context, C0973a c0973a, hg hgVar, C0494a c0494a) {
        this.f2927c = context;
        this.f2931g = c0973a;
        this.f2932h = c0973a.f3259b;
        this.f2928d = hgVar;
        this.f2926b = c0494a;
    }

    protected gd mo724a(int i) {
        AdRequestInfoParcel adRequestInfoParcel = this.f2931g.f3258a;
        return new gd(adRequestInfoParcel.f1839c, this.f2928d, this.f2932h.f1867d, i, this.f2932h.f1869f, this.f2932h.f1873j, this.f2932h.f1875l, this.f2932h.f1874k, adRequestInfoParcel.f1845i, this.f2932h.f1871h, null, null, null, null, null, this.f2932h.f1872i, this.f2931g.f3261d, this.f2932h.f1870g, this.f2931g.f3263f, this.f2932h.f1877n, this.f2932h.f1878o, this.f2931g.f3265h, null, adRequestInfoParcel.f1860x);
    }

    public void mo486a() {
        int a;
        synchronized (this.f2929e) {
            C0691b.m3093a("AdRendererBackgroundTask started.");
            int i = this.f2931g.f3262e;
            try {
                mo721b(SystemClock.elapsedRealtime());
            } catch (C0938a e) {
                a = e.m4556a();
                if (a == 3 || a == -1) {
                    C0691b.m3099c(e.getMessage());
                } else {
                    C0691b.m3103e(e.getMessage());
                }
                if (this.f2932h == null) {
                    this.f2932h = new AdResponseParcel(a);
                } else {
                    this.f2932h = new AdResponseParcel(a, this.f2932h.f1874k);
                }
                go.f3361a.post(new C09361(this));
                i = a;
            }
            final gd a2 = mo724a(i);
            go.f3361a.post(new Runnable(this) {
                final /* synthetic */ fb f3005b;

                public void run() {
                    synchronized (this.f3005b.f2929e) {
                        this.f3005b.mo722a(a2);
                    }
                }
            });
        }
    }

    protected void mo722a(gd gdVar) {
        this.f2926b.mo354b(gdVar);
    }

    public void mo487b() {
    }

    protected abstract void mo721b(long j);
}
