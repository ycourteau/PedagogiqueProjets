package com.google.android.gms.p028c;

import com.google.android.gms.ads.internal.C0618p;
import com.google.android.gms.ads.internal.util.client.C0691b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@fn
public final class db {
    public final List<cz> f2725a;
    public final long f2726b;
    public final List<String> f2727c;
    public final List<String> f2728d;
    public final List<String> f2729e;
    public final String f2730f;
    public final long f2731g;
    public final String f2732h;
    public final int f2733i;
    public int f2734j;
    public int f2735k;

    public db(String str) {
        JSONObject jSONObject = new JSONObject(str);
        if (C0691b.m3096a(2)) {
            C0691b.m3101d("Mediation Response JSON: " + jSONObject.toString(2));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        List arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            cz czVar = new cz(jSONArray.getJSONObject(i2));
            arrayList.add(czVar);
            if (i < 0 && m4190a(czVar)) {
                i = i2;
            }
        }
        this.f2734j = i;
        this.f2735k = jSONArray.length();
        this.f2725a = Collections.unmodifiableList(arrayList);
        this.f2730f = jSONObject.getString("qdata");
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            this.f2726b = optJSONObject.optLong("ad_network_timeout_millis", -1);
            this.f2727c = C0618p.m2808q().m4221a(optJSONObject, "click_urls");
            this.f2728d = C0618p.m2808q().m4221a(optJSONObject, "imp_urls");
            this.f2729e = C0618p.m2808q().m4221a(optJSONObject, "nofill_urls");
            long optLong = optJSONObject.optLong("refresh", -1);
            this.f2731g = optLong > 0 ? optLong * 1000 : -1;
            JSONArray optJSONArray = optJSONObject.optJSONArray("rewards");
            if (optJSONArray == null || optJSONArray.length() == 0) {
                this.f2732h = null;
                this.f2733i = 0;
                return;
            }
            this.f2732h = optJSONArray.getJSONObject(0).optString("rb_type");
            this.f2733i = optJSONArray.getJSONObject(0).optInt("rb_amount");
            return;
        }
        this.f2726b = -1;
        this.f2727c = null;
        this.f2728d = null;
        this.f2729e = null;
        this.f2731g = -1;
        this.f2732h = null;
        this.f2733i = 0;
    }

    private boolean m4190a(cz czVar) {
        for (String equals : czVar.f2710c) {
            if (equals.equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                return true;
            }
        }
        return false;
    }
}
