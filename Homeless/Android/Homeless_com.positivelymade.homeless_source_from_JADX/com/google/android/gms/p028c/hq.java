package com.google.android.gms.p028c;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class hq extends ji<hq> {
    private Map<Integer, Double> f3534a = new HashMap(4);

    public Map<Integer, Double> m5123a() {
        return Collections.unmodifiableMap(this.f3534a);
    }

    public void m5124a(hq hqVar) {
        hqVar.f3534a.putAll(this.f3534a);
    }

    public String toString() {
        Map hashMap = new HashMap();
        for (Entry entry : this.f3534a.entrySet()) {
            hashMap.put("metric" + entry.getKey(), entry.getValue());
        }
        return ji.m5116a((Object) hashMap);
    }
}
