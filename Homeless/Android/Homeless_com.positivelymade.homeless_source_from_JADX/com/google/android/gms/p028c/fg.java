package com.google.android.gms.p028c;

import android.content.Context;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.p028c.fb.C0938a;
import com.google.android.gms.p028c.fd.C0494a;
import com.google.android.gms.p028c.gd.C0973a;
import com.google.p016a.p018a.p020a.C0439a;

@fn
public class fg extends fb {
    protected df f3016a;
    private di f3017i;
    private cy f3018j;
    private db f3019k;
    private final bf f3020l;

    fg(Context context, C0973a c0973a, hg hgVar, di diVar, C0494a c0494a, bf bfVar) {
        super(context, c0973a, hgVar, c0494a);
        this.f3017i = diVar;
        this.f3019k = c0973a.f3260c;
        this.f3020l = bfVar;
    }

    protected gd mo724a(int i) {
        AdRequestInfoParcel adRequestInfoParcel = this.g.f3258a;
        return new gd(adRequestInfoParcel.f1839c, this.d, this.h.f1867d, i, this.h.f1869f, this.h.f1873j, this.h.f1875l, this.h.f1874k, adRequestInfoParcel.f1845i, this.h.f1871h, this.f3016a != null ? this.f3016a.f2756b : null, this.f3016a != null ? this.f3016a.f2757c : null, this.f3016a != null ? this.f3016a.f2758d : C0439a.class.getName(), this.f3019k, this.f3016a != null ? this.f3016a.f2759e : null, this.h.f1872i, this.g.f3261d, this.h.f1870g, this.g.f3263f, this.h.f1877n, this.h.f1878o, this.g.f3265h, null, adRequestInfoParcel.f1860x);
    }

    public void mo487b() {
        synchronized (this.f) {
            super.mo487b();
            if (this.f3018j != null) {
                this.f3018j.m4181a();
            }
        }
    }

    protected void mo721b(long j) {
        synchronized (this.f) {
            this.f3018j = new cy(this.c, this.g.f3258a, this.f3017i, this.f3019k, this.h.f1883t);
        }
        this.f3016a = this.f3018j.m4180a(j, 60000, this.f3020l);
        switch (this.f3016a.f2755a) {
            case 0:
                return;
            case 1:
                throw new C0938a("No fill from any mediation ad networks.", 3);
            default:
                throw new C0938a("Unexpected mediation result: " + this.f3016a.f2755a, 0);
        }
    }
}
