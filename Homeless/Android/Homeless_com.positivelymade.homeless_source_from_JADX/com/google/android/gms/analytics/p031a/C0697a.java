package com.google.android.gms.analytics.p031a;

import com.google.android.gms.analytics.C0772k;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.p028c.ji;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class C0697a {
    Map<String, String> f1982a = new HashMap();

    public C0697a m3110a(double d) {
        m3115a("pr", Double.toString(d));
        return this;
    }

    public C0697a m3111a(int i) {
        m3115a("ps", Integer.toString(i));
        return this;
    }

    public C0697a m3112a(int i, int i2) {
        m3115a(C0772k.m3661k(i), Integer.toString(i2));
        return this;
    }

    public C0697a m3113a(int i, String str) {
        m3115a(C0772k.m3660j(i), str);
        return this;
    }

    public C0697a m3114a(String str) {
        m3115a("id", str);
        return this;
    }

    void m3115a(String str, String str2) {
        C1305x.m6618a((Object) str, (Object) "Name should be non-null");
        this.f1982a.put(str, str2);
    }

    public C0697a m3116b(int i) {
        m3115a("qt", Integer.toString(i));
        return this;
    }

    public C0697a m3117b(String str) {
        m3115a("nm", str);
        return this;
    }

    public C0697a m3118c(String str) {
        m3115a("br", str);
        return this;
    }

    public C0697a m3119d(String str) {
        m3115a("ca", str);
        return this;
    }

    public C0697a m3120e(String str) {
        m3115a("va", str);
        return this;
    }

    public C0697a m3121f(String str) {
        m3115a("cc", str);
        return this;
    }

    public Map<String, String> m3122g(String str) {
        Map<String, String> hashMap = new HashMap();
        for (Entry entry : this.f1982a.entrySet()) {
            hashMap.put(str + ((String) entry.getKey()), entry.getValue());
        }
        return hashMap;
    }

    public String toString() {
        return ji.m5118a(this.f1982a);
    }
}
