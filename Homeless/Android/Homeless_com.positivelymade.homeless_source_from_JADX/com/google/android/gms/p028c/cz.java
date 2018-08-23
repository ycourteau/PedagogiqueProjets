package com.google.android.gms.p028c;

import com.google.android.gms.ads.internal.C0618p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@fn
public final class cz {
    public final String f2708a;
    public final String f2709b;
    public final List<String> f2710c;
    public final String f2711d;
    public final String f2712e;
    public final List<String> f2713f;
    public final List<String> f2714g;
    public final String f2715h;
    public final List<String> f2716i;
    public final List<String> f2717j;

    public cz(JSONObject jSONObject) {
        String str = null;
        this.f2709b = jSONObject.getString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        List arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.f2710c = Collections.unmodifiableList(arrayList);
        this.f2711d = jSONObject.optString("allocation_id", null);
        this.f2713f = C0618p.m2808q().m4221a(jSONObject, "clickurl");
        this.f2714g = C0618p.m2808q().m4221a(jSONObject, "imp_urls");
        this.f2716i = C0618p.m2808q().m4221a(jSONObject, "video_start_urls");
        this.f2717j = C0618p.m2808q().m4221a(jSONObject, "video_complete_urls");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        this.f2708a = optJSONObject != null ? optJSONObject.toString() : null;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        this.f2715h = optJSONObject2 != null ? optJSONObject2.toString() : null;
        if (optJSONObject2 != null) {
            str = optJSONObject2.optString("class_name");
        }
        this.f2712e = str;
    }
}
