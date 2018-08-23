package com.google.android.gms.p028c;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.p028c.fb.C0938a;
import com.google.android.gms.p028c.fd.C0494a;
import com.google.android.gms.p028c.gd.C0973a;

@fn
public class fa extends ey {
    fa(Context context, C0973a c0973a, hg hgVar, C0494a c0494a) {
        super(context, c0973a, hgVar, c0494a);
    }

    protected void mo721b(long j) {
        int i;
        int i2;
        AdSizeParcel h = this.d.mo787h();
        if (h.f1351e) {
            i = this.c.getResources().getDisplayMetrics().widthPixels;
            i2 = this.c.getResources().getDisplayMetrics().heightPixels;
        } else {
            i = h.f1353g;
            i2 = h.f1350d;
        }
        final ez ezVar = new ez(this, this.d, i, i2);
        go.f3361a.post(new Runnable(this) {
            final /* synthetic */ fa f3002b;

            public void run() {
                synchronized (this.f3002b.e) {
                    if (this.f3002b.h.f1868e != -2) {
                        return;
                    }
                    this.f3002b.d.mo788i().m5042a(this.f3002b);
                    ezVar.m4550a(this.f3002b.h);
                }
            }
        });
        m4537a(j);
        if (ezVar.m4553c()) {
            C0691b.m3093a("Ad-Network indicated no fill with passback URL.");
            throw new C0938a("AdNetwork sent passback url", 3);
        } else if (!ezVar.m4554d()) {
            throw new C0938a("AdNetwork timed out", 2);
        }
    }
}
