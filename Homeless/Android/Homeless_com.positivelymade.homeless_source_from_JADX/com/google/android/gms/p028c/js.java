package com.google.android.gms.p028c;

import com.google.android.gms.analytics.p031a.C0697a;
import com.google.android.gms.analytics.p031a.C0698b;
import com.google.android.gms.analytics.p031a.C0699c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class js extends ji<js> {
    private final List<C0697a> f3782a = new ArrayList();
    private final List<C0699c> f3783b = new ArrayList();
    private final Map<String, List<C0697a>> f3784c = new HashMap();
    private C0698b f3785d;

    public C0698b m5438a() {
        return this.f3785d;
    }

    public void m5439a(C0697a c0697a, String str) {
        if (c0697a != null) {
            Object obj;
            if (str == null) {
                obj = "";
            }
            if (!this.f3784c.containsKey(obj)) {
                this.f3784c.put(obj, new ArrayList());
            }
            ((List) this.f3784c.get(obj)).add(c0697a);
        }
    }

    public void m5441a(js jsVar) {
        jsVar.f3782a.addAll(this.f3782a);
        jsVar.f3783b.addAll(this.f3783b);
        for (Entry entry : this.f3784c.entrySet()) {
            String str = (String) entry.getKey();
            for (C0697a a : (List) entry.getValue()) {
                jsVar.m5439a(a, str);
            }
        }
        if (this.f3785d != null) {
            jsVar.f3785d = this.f3785d;
        }
    }

    public List<C0697a> m5442b() {
        return Collections.unmodifiableList(this.f3782a);
    }

    public Map<String, List<C0697a>> m5443c() {
        return this.f3784c;
    }

    public List<C0699c> m5444d() {
        return Collections.unmodifiableList(this.f3783b);
    }

    public String toString() {
        Map hashMap = new HashMap();
        if (!this.f3782a.isEmpty()) {
            hashMap.put("products", this.f3782a);
        }
        if (!this.f3783b.isEmpty()) {
            hashMap.put("promotions", this.f3783b);
        }
        if (!this.f3784c.isEmpty()) {
            hashMap.put("impressions", this.f3784c);
        }
        hashMap.put("productAction", this.f3785d);
        return ji.m5116a((Object) hashMap);
    }
}
