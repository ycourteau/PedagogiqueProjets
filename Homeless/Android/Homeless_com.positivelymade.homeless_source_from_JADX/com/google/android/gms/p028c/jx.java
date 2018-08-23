package com.google.android.gms.p028c;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public final class jx extends ji<jx> {
    public String f3803a;
    public long f3804b;
    public String f3805c;
    public String f3806d;

    public String m5488a() {
        return this.f3803a;
    }

    public void m5489a(long j) {
        this.f3804b = j;
    }

    public void m5491a(jx jxVar) {
        if (!TextUtils.isEmpty(this.f3803a)) {
            jxVar.m5492a(this.f3803a);
        }
        if (this.f3804b != 0) {
            jxVar.m5489a(this.f3804b);
        }
        if (!TextUtils.isEmpty(this.f3805c)) {
            jxVar.m5494b(this.f3805c);
        }
        if (!TextUtils.isEmpty(this.f3806d)) {
            jxVar.m5496c(this.f3806d);
        }
    }

    public void m5492a(String str) {
        this.f3803a = str;
    }

    public long m5493b() {
        return this.f3804b;
    }

    public void m5494b(String str) {
        this.f3805c = str;
    }

    public String m5495c() {
        return this.f3805c;
    }

    public void m5496c(String str) {
        this.f3806d = str;
    }

    public String m5497d() {
        return this.f3806d;
    }

    public String toString() {
        Map hashMap = new HashMap();
        hashMap.put("variableName", this.f3803a);
        hashMap.put("timeInMillis", Long.valueOf(this.f3804b));
        hashMap.put("category", this.f3805c);
        hashMap.put("label", this.f3806d);
        return ji.m5116a((Object) hashMap);
    }
}
