package com.google.android.gms.p028c;

import android.os.Bundle;
import com.google.android.gms.ads.internal.formats.C0559a;
import com.google.android.gms.ads.internal.formats.C0564c;
import com.google.android.gms.ads.internal.formats.C0569g.C0563a;
import com.google.android.gms.p028c.fi.C0948a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import org.json.JSONObject;

@fn
public class fj implements C0948a<C0564c> {
    private final boolean f3059a;
    private final boolean f3060b;

    public fj(boolean z, boolean z2) {
        this.f3059a = z;
        this.f3060b = z2;
    }

    public /* synthetic */ C0563a mo728a(fi fiVar, JSONObject jSONObject) {
        return m4607b(fiVar, jSONObject);
    }

    public C0564c m4607b(fi fiVar, JSONObject jSONObject) {
        List<hc> a = fiVar.m4600a(jSONObject, "images", true, this.f3059a, this.f3060b);
        Future a2 = fiVar.m4599a(jSONObject, "app_icon", true, this.f3059a);
        Future b = fiVar.m4604b(jSONObject);
        List arrayList = new ArrayList();
        for (hc hcVar : a) {
            arrayList.add(hcVar.get());
        }
        return new C0564c(jSONObject.getString("headline"), arrayList, jSONObject.getString("body"), (bl) a2.get(), jSONObject.getString("call_to_action"), jSONObject.optDouble("rating", -1.0d), jSONObject.optString("store"), jSONObject.optString("price"), (C0559a) b.get(), new Bundle());
    }
}
