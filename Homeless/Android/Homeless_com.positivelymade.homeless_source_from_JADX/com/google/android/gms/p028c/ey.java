package com.google.android.gms.p028c;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.C0618p;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.p028c.fb.C0938a;
import com.google.android.gms.p028c.fd.C0494a;
import com.google.android.gms.p028c.gd.C0973a;
import com.google.android.gms.p028c.hh.C0601a;

@fn
public abstract class ey extends fb implements C0601a {
    protected boolean f2933a = false;
    private final hh f2934i;
    private boolean f2935j = false;

    protected ey(Context context, C0973a c0973a, hg hgVar, C0494a c0494a) {
        super(context, c0973a, hgVar, c0494a);
        this.f2934i = hgVar.mo788i();
    }

    private boolean m4536c(long j) {
        long elapsedRealtime = 60000 - (SystemClock.elapsedRealtime() - j);
        if (elapsedRealtime <= 1) {
            return false;
        }
        try {
            this.e.wait(elapsedRealtime);
            return true;
        } catch (InterruptedException e) {
            throw new C0938a("Ad request cancelled.", -1);
        }
    }

    protected void m4537a(long j) {
        while (m4536c(j)) {
            if (this.f2935j) {
                throw new C0938a("Received cancellation request from creative.", 0);
            } else if (this.f2933a) {
                return;
            }
        }
        throw new C0938a("Timed out waiting for WebView to finish loading.", 2);
    }

    public void mo465a(hg hgVar, boolean z) {
        boolean z2 = true;
        synchronized (this.e) {
            C0691b.m3093a("WebView finished loading.");
            this.f2933a = true;
            if (z) {
                z2 = false;
            }
            this.f2935j = z2;
            this.e.notify();
        }
    }

    public void mo487b() {
        synchronized (this.f) {
            this.d.stopLoading();
            C0618p.m2798g().mo745a(this.d.getWebView());
        }
    }
}
