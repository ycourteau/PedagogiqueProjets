package com.google.android.gms.p028c;

import android.content.Context;
import com.google.android.gms.ads.internal.C0495a;
import com.google.android.gms.ads.internal.C0586n;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.p028c.gd.C0973a;

@fn
public class fd {

    public interface C0494a {
        void mo354b(gd gdVar);
    }

    public gk m4560a(Context context, C0495a c0495a, C0973a c0973a, C1141o c1141o, hg hgVar, di diVar, C0494a c0494a, bf bfVar) {
        gk fgVar;
        AdResponseParcel adResponseParcel = c0973a.f3259b;
        if (adResponseParcel.f1871h) {
            fgVar = new fg(context, c0973a, hgVar, diVar, c0494a, bfVar);
        } else if (!adResponseParcel.f1883t) {
            fgVar = adResponseParcel.f1879p ? new fa(context, c0973a, hgVar, c0494a) : (((Boolean) az.f2466R.m3878c()).booleanValue() && is.m5292h() && !is.m5294j() && hgVar.mo787h().f1351e) ? new ff(context, c0973a, hgVar, c0494a) : new fe(context, c0973a, hgVar, c0494a);
        } else if (c0495a instanceof C0586n) {
            fgVar = new fh(context, (C0586n) c0495a, new ad(), c0973a, c1141o, c0494a);
        } else {
            throw new IllegalArgumentException("Invalid NativeAdManager type. Found: " + (c0495a != null ? c0495a.getClass().getName() : "null") + "; Required: NativeAdManager.");
        }
        C0691b.m3093a("AdRenderer: " + fgVar.getClass().getName());
        fgVar.m2830h();
        return fgVar;
    }
}
