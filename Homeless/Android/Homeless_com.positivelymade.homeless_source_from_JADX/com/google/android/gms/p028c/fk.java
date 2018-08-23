package com.google.android.gms.p028c;

import android.os.Bundle;
import com.google.android.gms.ads.internal.formats.C0559a;
import com.google.android.gms.ads.internal.formats.C0566d;
import com.google.android.gms.ads.internal.formats.C0569g.C0563a;
import com.google.android.gms.p028c.fi.C0948a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import org.json.JSONObject;

@fn
public class fk implements C0948a<C0566d> {
    private final boolean f3061a;
    private final boolean f3062b;

    public fk(boolean z, boolean z2) {
        this.f3061a = z;
        this.f3062b = z2;
    }

    public /* synthetic */ C0563a mo728a(fi fiVar, JSONObject jSONObject) {
        return m4609b(fiVar, jSONObject);
    }

    public C0566d m4609b(fi fiVar, JSONObject jSONObject) {
        List<hc> a = fiVar.m4600a(jSONObject, "images", true, this.f3061a, this.f3062b);
        Future a2 = fiVar.m4599a(jSONObject, "secondary_image", false, this.f3061a);
        Future b = fiVar.m4604b(jSONObject);
        List arrayList = new ArrayList();
        for (hc hcVar : a) {
            arrayList.add(hcVar.get());
        }
        return new C0566d(jSONObject.getString("headline"), arrayList, jSONObject.getString("body"), (bl) a2.get(), jSONObject.getString("call_to_action"), jSONObject.getString("advertiser"), (C0559a) b.get(), new Bundle());
    }
}
