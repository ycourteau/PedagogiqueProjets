package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.C1305x;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class C0752t {
    private final long f2205a;
    private final String f2206b;
    private final String f2207c;
    private final boolean f2208d;
    private long f2209e;
    private final Map<String, String> f2210f;

    public C0752t(long j, String str, String str2, boolean z, long j2, Map<String, String> map) {
        C1305x.m6619a(str);
        C1305x.m6619a(str2);
        this.f2205a = j;
        this.f2206b = str;
        this.f2207c = str2;
        this.f2208d = z;
        this.f2209e = j2;
        if (map != null) {
            this.f2210f = new HashMap(map);
        } else {
            this.f2210f = Collections.emptyMap();
        }
    }

    public long m3528a() {
        return this.f2205a;
    }

    public void m3529a(long j) {
        this.f2209e = j;
    }

    public String m3530b() {
        return this.f2206b;
    }

    public String m3531c() {
        return this.f2207c;
    }

    public boolean m3532d() {
        return this.f2208d;
    }

    public long m3533e() {
        return this.f2209e;
    }

    public Map<String, String> m3534f() {
        return this.f2210f;
    }
}
