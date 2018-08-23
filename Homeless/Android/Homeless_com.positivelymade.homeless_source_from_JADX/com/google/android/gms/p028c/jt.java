package com.google.android.gms.p028c;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public final class jt extends ji<jt> {
    private String f3786a;
    private String f3787b;
    private String f3788c;
    private long f3789d;

    public String m5445a() {
        return this.f3786a;
    }

    public void m5446a(long j) {
        this.f3789d = j;
    }

    public void m5448a(jt jtVar) {
        if (!TextUtils.isEmpty(this.f3786a)) {
            jtVar.m5449a(this.f3786a);
        }
        if (!TextUtils.isEmpty(this.f3787b)) {
            jtVar.m5451b(this.f3787b);
        }
        if (!TextUtils.isEmpty(this.f3788c)) {
            jtVar.m5453c(this.f3788c);
        }
        if (this.f3789d != 0) {
            jtVar.m5446a(this.f3789d);
        }
    }

    public void m5449a(String str) {
        this.f3786a = str;
    }

    public String m5450b() {
        return this.f3787b;
    }

    public void m5451b(String str) {
        this.f3787b = str;
    }

    public String m5452c() {
        return this.f3788c;
    }

    public void m5453c(String str) {
        this.f3788c = str;
    }

    public long m5454d() {
        return this.f3789d;
    }

    public String toString() {
        Map hashMap = new HashMap();
        hashMap.put("category", this.f3786a);
        hashMap.put("action", this.f3787b);
        hashMap.put("label", this.f3788c);
        hashMap.put("value", Long.valueOf(this.f3789d));
        return ji.m5116a((Object) hashMap);
    }
}
