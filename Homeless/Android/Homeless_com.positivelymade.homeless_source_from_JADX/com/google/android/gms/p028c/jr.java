package com.google.android.gms.p028c;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public final class jr extends ji<jr> {
    public int f3776a;
    public int f3777b;
    public int f3778c;
    public int f3779d;
    public int f3780e;
    private String f3781f;

    public int m5424a() {
        return this.f3776a;
    }

    public void m5425a(int i) {
        this.f3776a = i;
    }

    public void m5427a(jr jrVar) {
        if (this.f3776a != 0) {
            jrVar.m5425a(this.f3776a);
        }
        if (this.f3777b != 0) {
            jrVar.m5430b(this.f3777b);
        }
        if (this.f3778c != 0) {
            jrVar.m5432c(this.f3778c);
        }
        if (this.f3779d != 0) {
            jrVar.m5434d(this.f3779d);
        }
        if (this.f3780e != 0) {
            jrVar.m5436e(this.f3780e);
        }
        if (!TextUtils.isEmpty(this.f3781f)) {
            jrVar.m5428a(this.f3781f);
        }
    }

    public void m5428a(String str) {
        this.f3781f = str;
    }

    public int m5429b() {
        return this.f3777b;
    }

    public void m5430b(int i) {
        this.f3777b = i;
    }

    public int m5431c() {
        return this.f3778c;
    }

    public void m5432c(int i) {
        this.f3778c = i;
    }

    public int m5433d() {
        return this.f3779d;
    }

    public void m5434d(int i) {
        this.f3779d = i;
    }

    public int m5435e() {
        return this.f3780e;
    }

    public void m5436e(int i) {
        this.f3780e = i;
    }

    public String m5437f() {
        return this.f3781f;
    }

    public String toString() {
        Map hashMap = new HashMap();
        hashMap.put("language", this.f3781f);
        hashMap.put("screenColors", Integer.valueOf(this.f3776a));
        hashMap.put("screenWidth", Integer.valueOf(this.f3777b));
        hashMap.put("screenHeight", Integer.valueOf(this.f3778c));
        hashMap.put("viewportWidth", Integer.valueOf(this.f3779d));
        hashMap.put("viewportHeight", Integer.valueOf(this.f3780e));
        return ji.m5116a((Object) hashMap);
    }
}
