package com.google.android.gms.p028c;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@fn
class ft {
    private final List<String> f3133a;
    private final List<String> f3134b;
    private final String f3135c;
    private final String f3136d;
    private final String f3137e;
    private final String f3138f;
    private final boolean f3139g;
    private final String f3140h;
    private String f3141i;
    private int f3142j;

    public ft(int i, Map<String, String> map) {
        this.f3141i = (String) map.get("url");
        this.f3136d = (String) map.get("base_uri");
        this.f3137e = (String) map.get("post_parameters");
        this.f3139g = ft.m4684b((String) map.get("drt_include"));
        this.f3135c = (String) map.get("activation_overlay_url");
        this.f3134b = m4685c((String) map.get("check_packages"));
        this.f3140h = (String) map.get("request_id");
        this.f3138f = (String) map.get("type");
        this.f3133a = m4685c((String) map.get("errors"));
        this.f3142j = i;
    }

    private static boolean m4684b(String str) {
        return str != null && (str.equals("1") || str.equals("true"));
    }

    private List<String> m4685c(String str) {
        return str == null ? null : Arrays.asList(str.split(","));
    }

    public int m4686a() {
        return this.f3142j;
    }

    public void m4687a(String str) {
        this.f3141i = str;
    }

    public List<String> m4688b() {
        return this.f3133a;
    }

    public String m4689c() {
        return this.f3137e;
    }

    public String m4690d() {
        return this.f3141i;
    }

    public String m4691e() {
        return this.f3138f;
    }

    public boolean m4692f() {
        return this.f3139g;
    }

    public String m4693g() {
        return this.f3140h;
    }
}
