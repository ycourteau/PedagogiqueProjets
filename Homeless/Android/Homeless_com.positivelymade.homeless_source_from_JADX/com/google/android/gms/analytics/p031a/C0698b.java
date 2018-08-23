package com.google.android.gms.analytics.p031a;

import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.p028c.ji;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class C0698b {
    Map<String, String> f1983a = new HashMap();

    public C0698b(String str) {
        m3127a("&pa", str);
    }

    public C0698b m3123a(double d) {
        m3127a("&tr", Double.toString(d));
        return this;
    }

    public C0698b m3124a(int i) {
        m3127a("&cos", Integer.toString(i));
        return this;
    }

    public C0698b m3125a(String str) {
        m3127a("&ti", str);
        return this;
    }

    public Map<String, String> m3126a() {
        return new HashMap(this.f1983a);
    }

    void m3127a(String str, String str2) {
        C1305x.m6618a((Object) str, (Object) "Name should be non-null");
        this.f1983a.put(str, str2);
    }

    public C0698b m3128b(double d) {
        m3127a("&tt", Double.toString(d));
        return this;
    }

    public C0698b m3129b(String str) {
        m3127a("&ta", str);
        return this;
    }

    public C0698b m3130c(double d) {
        m3127a("&ts", Double.toString(d));
        return this;
    }

    public C0698b m3131c(String str) {
        m3127a("&tcc", str);
        return this;
    }

    public C0698b m3132d(String str) {
        m3127a("&col", str);
        return this;
    }

    public C0698b m3133e(String str) {
        m3127a("&pal", str);
        return this;
    }

    public String toString() {
        Map hashMap = new HashMap();
        for (Entry entry : this.f1983a.entrySet()) {
            if (((String) entry.getKey()).startsWith("&")) {
                hashMap.put(((String) entry.getKey()).substring(1), entry.getValue());
            } else {
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return ji.m5118a(hashMap);
    }
}
