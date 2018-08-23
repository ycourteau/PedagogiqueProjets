package com.google.android.gms.p028c;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class hp extends ji<hp> {
    private Map<Integer, String> f3533a = new HashMap(4);

    public Map<Integer, String> m5120a() {
        return Collections.unmodifiableMap(this.f3533a);
    }

    public void m5121a(hp hpVar) {
        hpVar.f3533a.putAll(this.f3533a);
    }

    public String toString() {
        Map hashMap = new HashMap();
        for (Entry entry : this.f3533a.entrySet()) {
            hashMap.put("dimension" + entry.getKey(), entry.getValue());
        }
        return ji.m5116a((Object) hashMap);
    }
}
