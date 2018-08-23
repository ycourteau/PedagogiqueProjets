package com.google.android.gms.p028c;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public final class jw extends ji<jw> {
    public String f3800a;
    public String f3801b;
    public String f3802c;

    public String m5480a() {
        return this.f3800a;
    }

    public void m5482a(jw jwVar) {
        if (!TextUtils.isEmpty(this.f3800a)) {
            jwVar.m5483a(this.f3800a);
        }
        if (!TextUtils.isEmpty(this.f3801b)) {
            jwVar.m5485b(this.f3801b);
        }
        if (!TextUtils.isEmpty(this.f3802c)) {
            jwVar.m5487c(this.f3802c);
        }
    }

    public void m5483a(String str) {
        this.f3800a = str;
    }

    public String m5484b() {
        return this.f3801b;
    }

    public void m5485b(String str) {
        this.f3801b = str;
    }

    public String m5486c() {
        return this.f3802c;
    }

    public void m5487c(String str) {
        this.f3802c = str;
    }

    public String toString() {
        Map hashMap = new HashMap();
        hashMap.put("network", this.f3800a);
        hashMap.put("action", this.f3801b);
        hashMap.put("target", this.f3802c);
        return ji.m5116a((Object) hashMap);
    }
}
