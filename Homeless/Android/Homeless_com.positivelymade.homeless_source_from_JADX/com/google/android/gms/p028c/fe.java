package com.google.android.gms.p028c;

import android.content.Context;
import com.google.android.gms.ads.internal.C0618p;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.p028c.fd.C0494a;
import com.google.android.gms.p028c.gd.C0973a;

@fn
public class fe extends ey {

    class C09391 implements Runnable {
        final /* synthetic */ fe f3012a;

        C09391(fe feVar) {
            this.f3012a = feVar;
        }

        public void run() {
            synchronized (this.f3012a.e) {
                if (this.f3012a.h.f1868e != -2) {
                    return;
                }
                this.f3012a.d.mo788i().m5042a(this.f3012a);
                this.f3012a.mo723c();
                C0691b.m3101d("Loading HTML in WebView.");
                this.f3012a.d.loadDataWithBaseURL(C0618p.m2796e().m4845a(this.f3012a.h.f1865b), this.f3012a.h.f1866c, "text/html", "UTF-8", null);
            }
        }
    }

    fe(Context context, C0973a c0973a, hg hgVar, C0494a c0494a) {
        super(context, c0973a, hgVar, c0494a);
    }

    protected void mo721b(long j) {
        go.f3361a.post(new C09391(this));
        m4537a(j);
    }

    protected void mo723c() {
    }
}
