package com.google.android.gms.p028c;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public final class jp extends ji<jp> {
    private String f3762a;
    private String f3763b;
    private String f3764c;
    private String f3765d;

    public String m5392a() {
        return this.f3762a;
    }

    public void m5394a(jp jpVar) {
        if (!TextUtils.isEmpty(this.f3762a)) {
            jpVar.m5395a(this.f3762a);
        }
        if (!TextUtils.isEmpty(this.f3763b)) {
            jpVar.m5397b(this.f3763b);
        }
        if (!TextUtils.isEmpty(this.f3764c)) {
            jpVar.m5399c(this.f3764c);
        }
        if (!TextUtils.isEmpty(this.f3765d)) {
            jpVar.m5401d(this.f3765d);
        }
    }

    public void m5395a(String str) {
        this.f3762a = str;
    }

    public String m5396b() {
        return this.f3763b;
    }

    public void m5397b(String str) {
        this.f3763b = str;
    }

    public String m5398c() {
        return this.f3764c;
    }

    public void m5399c(String str) {
        this.f3764c = str;
    }

    public String m5400d() {
        return this.f3765d;
    }

    public void m5401d(String str) {
        this.f3765d = str;
    }

    public String toString() {
        Map hashMap = new HashMap();
        hashMap.put("appName", this.f3762a);
        hashMap.put("appVersion", this.f3763b);
        hashMap.put("appId", this.f3764c);
        hashMap.put("appInstallerId", this.f3765d);
        return ji.m5116a((Object) hashMap);
    }
}
