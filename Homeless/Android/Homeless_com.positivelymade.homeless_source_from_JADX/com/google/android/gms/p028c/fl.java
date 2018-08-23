package com.google.android.gms.p028c;

import com.google.android.gms.ads.internal.formats.C0559a;
import com.google.android.gms.ads.internal.formats.C0561b;
import com.google.android.gms.ads.internal.formats.C0568e;
import com.google.android.gms.ads.internal.formats.C0569g.C0563a;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.p028c.fi.C0948a;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONObject;

@fn
public class fl implements C0948a<C0568e> {
    private final boolean f3063a;

    public fl(boolean z) {
        this.f3063a = z;
    }

    private <K, V> C1042if<K, V> m4610a(C1042if<K, Future<V>> c1042if) {
        C1042if<K, V> c1042if2 = new C1042if();
        for (int i = 0; i < c1042if.size(); i++) {
            c1042if2.put(c1042if.m5242b(i), ((Future) c1042if.m5243c(i)).get());
        }
        return c1042if2;
    }

    private void m4611a(fi fiVar, JSONObject jSONObject, C1042if<String, Future<C0561b>> c1042if) {
        c1042if.put(jSONObject.getString("name"), fiVar.m4601a(jSONObject, "image_value", this.f3063a));
    }

    private void m4612a(JSONObject jSONObject, C1042if<String, String> c1042if) {
        c1042if.put(jSONObject.getString("name"), jSONObject.getString("string_value"));
    }

    public /* synthetic */ C0563a mo728a(fi fiVar, JSONObject jSONObject) {
        return m4614b(fiVar, jSONObject);
    }

    public C0568e m4614b(fi fiVar, JSONObject jSONObject) {
        C1042if c1042if = new C1042if();
        C1042if c1042if2 = new C1042if();
        Future b = fiVar.m4604b(jSONObject);
        JSONArray jSONArray = jSONObject.getJSONArray("custom_assets");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String string = jSONObject2.getString("type");
            if ("string".equals(string)) {
                m4612a(jSONObject2, c1042if2);
            } else if ("image".equals(string)) {
                m4611a(fiVar, jSONObject2, c1042if);
            } else {
                C0691b.m3103e("Unknown custom asset type: " + string);
            }
        }
        return new C0568e(jSONObject.getString("custom_template_id"), m4610a(c1042if), c1042if2, (C0559a) b.get());
    }
}
