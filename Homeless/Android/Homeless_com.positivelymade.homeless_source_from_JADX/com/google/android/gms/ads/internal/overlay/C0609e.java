package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.C0618p;
import com.google.android.gms.p028c.is;

public class C0609e {
    public void m2738a(Context context, AdOverlayInfoParcel adOverlayInfoParcel) {
        m2739a(context, adOverlayInfoParcel, true);
    }

    public void m2739a(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z) {
        if (adOverlayInfoParcel.f1605l == 4 && adOverlayInfoParcel.f1597d == null) {
            if (adOverlayInfoParcel.f1596c != null) {
                adOverlayInfoParcel.f1596c.mo327e();
            }
            C0618p.m2793b().m2660a(context, adOverlayInfoParcel.f1595b, adOverlayInfoParcel.f1603j);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.f1607n.f1979e);
        intent.putExtra("shouldCallOnOverlayOpened", z);
        AdOverlayInfoParcel.m2653a(intent, adOverlayInfoParcel);
        if (!is.m5294j()) {
            intent.addFlags(524288);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }
}
