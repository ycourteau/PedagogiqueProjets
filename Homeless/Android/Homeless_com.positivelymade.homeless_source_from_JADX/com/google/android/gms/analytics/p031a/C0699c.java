package com.google.android.gms.analytics.p031a;

import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.p028c.ji;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class C0699c {
    Map<String, String> f1984a = new HashMap();

    public C0699c m3134a(String str) {
        m3135a("id", str);
        return this;
    }

    void m3135a(String str, String str2) {
        C1305x.m6618a((Object) str, (Object) "Name should be non-null");
        this.f1984a.put(str, str2);
    }

    public C0699c m3136b(String str) {
        m3135a("nm", str);
        return this;
    }

    public C0699c m3137c(String str) {
        m3135a("cr", str);
        return this;
    }

    public C0699c m3138d(String str) {
        m3135a("ps", str);
        return this;
    }

    public Map<String, String> m3139e(String str) {
        Map<String, String> hashMap = new HashMap();
        for (Entry entry : this.f1984a.entrySet()) {
            hashMap.put(str + ((String) entry.getKey()), entry.getValue());
        }
        return hashMap;
    }

    public String toString() {
        return ji.m5118a(this.f1984a);
    }
}
