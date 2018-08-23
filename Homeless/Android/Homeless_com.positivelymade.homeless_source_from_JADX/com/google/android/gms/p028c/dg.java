package com.google.android.gms.p028c;

import android.content.Context;
import com.google.android.gms.ads.internal.C0618p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@fn
public class dg {
    public List<String> m4221a(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        List arrayList = new ArrayList(optJSONArray.length());
        for (int i = 0; i < optJSONArray.length(); i++) {
            arrayList.add(optJSONArray.getString(i));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void m4222a(Context context, String str, gd gdVar, String str2, boolean z, List<String> list) {
        if (list != null && !list.isEmpty()) {
            String str3 = z ? "1" : "0";
            for (String replaceAll : list) {
                String replaceAll2 = replaceAll2.replaceAll("@gw_adlocid@", str2).replaceAll("@gw_adnetrefresh@", str3).replaceAll("@gw_qdata@", gdVar.f3280o.f2730f).replaceAll("@gw_sdkver@", str).replaceAll("@gw_sessid@", C0618p.m2799h().m4772a()).replaceAll("@gw_seqnum@", gdVar.f3274i);
                if (gdVar.f3277l != null) {
                    replaceAll2 = replaceAll2.replaceAll("@gw_adnetid@", gdVar.f3277l.f2709b).replaceAll("@gw_allocid@", gdVar.f3277l.f2711d);
                }
                new gv(context, str, replaceAll2).m2829g();
            }
        }
    }
}
