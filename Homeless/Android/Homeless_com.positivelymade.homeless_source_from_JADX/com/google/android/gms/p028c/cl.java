package com.google.android.gms.p028c;

import com.google.android.gms.ads.internal.util.client.C0691b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import org.json.JSONObject;

@fn
public class cl implements cg {
    final HashMap<String, gz<JSONObject>> f2613a = new HashMap();

    public Future<JSONObject> m4092a(String str) {
        Future gzVar = new gz();
        this.f2613a.put(str, gzVar);
        return gzVar;
    }

    public void mo524a(hg hgVar, Map<String, String> map) {
        m4094a((String) map.get("request_id"), (String) map.get("fetched_ad"));
    }

    public void m4094a(String str, String str2) {
        C0691b.m3093a("Received ad from the cache.");
        gz gzVar = (gz) this.f2613a.get(str);
        if (gzVar == null) {
            C0691b.m3097b("Could not find the ad request for the corresponding ad response.");
            return;
        }
        try {
            gzVar.m4958b(new JSONObject(str2));
        } catch (Throwable e) {
            C0691b.m3098b("Failed constructing JSON object from value passed from javascript", e);
            gzVar.m4958b(null);
        } finally {
            this.f2613a.remove(str);
        }
    }

    public void m4095b(String str) {
        gz gzVar = (gz) this.f2613a.get(str);
        if (gzVar == null) {
            C0691b.m3097b("Could not find the ad request for the corresponding ad response.");
            return;
        }
        if (!gzVar.isDone()) {
            gzVar.cancel(true);
        }
        this.f2613a.remove(str);
    }
}
