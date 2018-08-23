package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.C0514q;
import com.google.android.gms.ads.internal.client.C0532r;
import com.google.android.gms.ads.internal.client.C0535s.C0537a;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.p028c.C1042if;
import com.google.android.gms.p028c.bu;
import com.google.android.gms.p028c.bv;
import com.google.android.gms.p028c.bw;
import com.google.android.gms.p028c.bx;
import com.google.android.gms.p028c.di;
import com.google.android.gms.p028c.fn;

@fn
public class C0576j extends C0537a {
    private C0514q f1549a;
    private bu f1550b;
    private bv f1551c;
    private C1042if<String, bw> f1552d = new C1042if();
    private C1042if<String, bx> f1553e = new C1042if();
    private NativeAdOptionsParcel f1554f;
    private final Context f1555g;
    private final di f1556h;
    private final String f1557i;
    private final VersionInfoParcel f1558j;

    public C0576j(Context context, String str, di diVar, VersionInfoParcel versionInfoParcel) {
        this.f1555g = context;
        this.f1557i = str;
        this.f1556h = diVar;
        this.f1558j = versionInfoParcel;
    }

    public C0532r mo397a() {
        return new C0575i(this.f1555g, this.f1557i, this.f1556h, this.f1558j, this.f1549a, this.f1550b, this.f1551c, this.f1553e, this.f1552d, this.f1554f);
    }

    public void mo398a(C0514q c0514q) {
        this.f1549a = c0514q;
    }

    public void mo399a(NativeAdOptionsParcel nativeAdOptionsParcel) {
        this.f1554f = nativeAdOptionsParcel;
    }

    public void mo400a(bu buVar) {
        this.f1550b = buVar;
    }

    public void mo401a(bv bvVar) {
        this.f1551c = bvVar;
    }

    public void mo402a(String str, bx bxVar, bw bwVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Custom template ID for native custom template ad is empty. Please provide a valid template id.");
        }
        this.f1553e.put(str, bxVar);
        this.f1552d.put(str, bwVar);
    }
}
