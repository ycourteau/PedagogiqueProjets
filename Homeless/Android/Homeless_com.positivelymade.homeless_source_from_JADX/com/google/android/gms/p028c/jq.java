package com.google.android.gms.p028c;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public final class jq extends ji<jq> {
    private String f3766a;
    private String f3767b;
    private String f3768c;
    private String f3769d;
    private String f3770e;
    private String f3771f;
    private String f3772g;
    private String f3773h;
    private String f3774i;
    private String f3775j;

    public String m5402a() {
        return this.f3766a;
    }

    public void m5404a(jq jqVar) {
        if (!TextUtils.isEmpty(this.f3766a)) {
            jqVar.m5405a(this.f3766a);
        }
        if (!TextUtils.isEmpty(this.f3767b)) {
            jqVar.m5407b(this.f3767b);
        }
        if (!TextUtils.isEmpty(this.f3768c)) {
            jqVar.m5409c(this.f3768c);
        }
        if (!TextUtils.isEmpty(this.f3769d)) {
            jqVar.m5411d(this.f3769d);
        }
        if (!TextUtils.isEmpty(this.f3770e)) {
            jqVar.m5413e(this.f3770e);
        }
        if (!TextUtils.isEmpty(this.f3771f)) {
            jqVar.m5415f(this.f3771f);
        }
        if (!TextUtils.isEmpty(this.f3772g)) {
            jqVar.m5417g(this.f3772g);
        }
        if (!TextUtils.isEmpty(this.f3773h)) {
            jqVar.m5419h(this.f3773h);
        }
        if (!TextUtils.isEmpty(this.f3774i)) {
            jqVar.m5421i(this.f3774i);
        }
        if (!TextUtils.isEmpty(this.f3775j)) {
            jqVar.m5423j(this.f3775j);
        }
    }

    public void m5405a(String str) {
        this.f3766a = str;
    }

    public String m5406b() {
        return this.f3767b;
    }

    public void m5407b(String str) {
        this.f3767b = str;
    }

    public String m5408c() {
        return this.f3768c;
    }

    public void m5409c(String str) {
        this.f3768c = str;
    }

    public String m5410d() {
        return this.f3769d;
    }

    public void m5411d(String str) {
        this.f3769d = str;
    }

    public String m5412e() {
        return this.f3770e;
    }

    public void m5413e(String str) {
        this.f3770e = str;
    }

    public String m5414f() {
        return this.f3771f;
    }

    public void m5415f(String str) {
        this.f3771f = str;
    }

    public String m5416g() {
        return this.f3772g;
    }

    public void m5417g(String str) {
        this.f3772g = str;
    }

    public String m5418h() {
        return this.f3773h;
    }

    public void m5419h(String str) {
        this.f3773h = str;
    }

    public String m5420i() {
        return this.f3774i;
    }

    public void m5421i(String str) {
        this.f3774i = str;
    }

    public String m5422j() {
        return this.f3775j;
    }

    public void m5423j(String str) {
        this.f3775j = str;
    }

    public String toString() {
        Map hashMap = new HashMap();
        hashMap.put("name", this.f3766a);
        hashMap.put("source", this.f3767b);
        hashMap.put("medium", this.f3768c);
        hashMap.put("keyword", this.f3769d);
        hashMap.put("content", this.f3770e);
        hashMap.put("id", this.f3771f);
        hashMap.put("adNetworkId", this.f3772g);
        hashMap.put("gclid", this.f3773h);
        hashMap.put("dclid", this.f3774i);
        hashMap.put("aclid", this.f3775j);
        return ji.m5116a((Object) hashMap);
    }
}
