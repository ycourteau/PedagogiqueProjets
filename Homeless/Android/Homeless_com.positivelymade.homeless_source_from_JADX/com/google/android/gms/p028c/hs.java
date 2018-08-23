package com.google.android.gms.p028c;

import com.google.android.gms.common.internal.C1305x;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class hs extends ji<hs> {
    private final Map<String, Object> f3535a = new HashMap();

    private String m5126a(String str) {
        C1305x.m6619a(str);
        if (str != null && str.startsWith("&")) {
            str = str.substring(1);
        }
        C1305x.m6620a(str, (Object) "Name can not be empty or \"&\"");
        return str;
    }

    public Map<String, Object> m5127a() {
        return Collections.unmodifiableMap(this.f3535a);
    }

    public void m5128a(hs hsVar) {
        C1305x.m6617a((Object) hsVar);
        hsVar.f3535a.putAll(this.f3535a);
    }

    public void m5130a(String str, String str2) {
        this.f3535a.put(m5126a(str), str2);
    }

    public String toString() {
        return ji.m5116a((Object) this.f3535a);
    }
}
