package com.google.android.gms.p032d;

import com.google.android.gms.p028c.C0914e;
import com.google.android.gms.p028c.C0934f;
import com.google.android.gms.p028c.C1010h.C1009a;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class dd extends C1546o {
    private static final String f4925a = C0914e.FUNCTION_CALL.toString();
    private static final String f4926b = C0934f.FUNCTION_CALL_NAME.toString();
    private static final String f4927c = C0934f.ADDITIONAL_PARAMS.toString();
    private final C1542a f4928d;

    public interface C1542a {
        Object mo971a(String str, Map<String, Object> map);
    }

    public dd(C1542a c1542a) {
        super(f4925a, f4926b);
        this.f4928d = c1542a;
    }

    public C1009a mo972a(Map<String, C1009a> map) {
        String a = cj.m7319a((C1009a) map.get(f4926b));
        Map hashMap = new HashMap();
        C1009a c1009a = (C1009a) map.get(f4927c);
        if (c1009a != null) {
            Object e = cj.m7333e(c1009a);
            if (e instanceof Map) {
                for (Entry entry : ((Map) e).entrySet()) {
                    hashMap.put(entry.getKey().toString(), entry.getValue());
                }
            } else {
                aj.m7038b("FunctionCallMacro: expected ADDITIONAL_PARAMS to be a map.");
                return cj.m7335f();
            }
        }
        try {
            return cj.m7332e(this.f4928d.mo971a(a, hashMap));
        } catch (Exception e2) {
            aj.m7038b("Custom macro/tag " + a + " threw exception " + e2.getMessage());
            return cj.m7335f();
        }
    }

    public boolean mo973a() {
        return false;
    }
}
