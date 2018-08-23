package com.google.android.gms.p028c;

import android.content.Context;
import com.google.android.gms.ads.internal.C0586n;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.p028c.fd.C0494a;
import com.google.android.gms.p028c.gd.C0973a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@fn
public class fh extends gk {
    private final C0494a f3023a;
    private final AdResponseParcel f3024b;
    private final C0973a f3025c;
    private final fi f3026d;
    private final Object f3027e;
    private Future<gd> f3028f;

    public fh(Context context, C0586n c0586n, ad adVar, C0973a c0973a, C1141o c1141o, C0494a c0494a) {
        this(c0973a, c0494a, new fi(context, c0586n, adVar, new gs(context), c1141o, c0973a));
    }

    fh(C0973a c0973a, C0494a c0494a, fi fiVar) {
        this.f3027e = new Object();
        this.f3025c = c0973a;
        this.f3024b = c0973a.f3259b;
        this.f3023a = c0494a;
        this.f3026d = fiVar;
    }

    private gd m4571a(int i) {
        return new gd(this.f3025c.f3258a.f1839c, null, null, i, null, null, this.f3024b.f1875l, this.f3024b.f1874k, this.f3025c.f3258a.f1845i, false, null, null, null, null, null, this.f3024b.f1872i, this.f3025c.f3261d, this.f3024b.f1870g, this.f3025c.f3263f, this.f3024b.f1877n, this.f3024b.f1878o, this.f3025c.f3265h, null, this.f3025c.f3258a.f1860x);
    }

    public void mo486a() {
        gd gdVar;
        int i;
        try {
            synchronized (this.f3027e) {
                this.f3028f = gn.m4823a(this.f3026d);
            }
            gdVar = (gd) this.f3028f.get(60000, TimeUnit.MILLISECONDS);
            i = -2;
        } catch (TimeoutException e) {
            C0691b.m3103e("Timed out waiting for native ad.");
            this.f3028f.cancel(true);
            i = 2;
            gdVar = null;
        } catch (ExecutionException e2) {
            i = 0;
            gdVar = null;
        } catch (InterruptedException e3) {
            gdVar = null;
            i = -1;
        } catch (CancellationException e4) {
            gdVar = null;
            i = -1;
        }
        if (gdVar == null) {
            gdVar = m4571a(i);
        }
        go.f3361a.post(new Runnable(this) {
            final /* synthetic */ fh f3022b;

            public void run() {
                this.f3022b.f3023a.mo354b(gdVar);
            }
        });
    }

    public void mo487b() {
        synchronized (this.f3027e) {
            if (this.f3028f != null) {
                this.f3028f.cancel(true);
            }
        }
    }
}
