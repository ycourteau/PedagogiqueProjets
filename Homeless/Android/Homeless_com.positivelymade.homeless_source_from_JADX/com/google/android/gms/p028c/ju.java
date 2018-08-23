package com.google.android.gms.p028c;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public final class ju extends ji<ju> {
    public String f3790a;
    public boolean f3791b;

    public String m5455a() {
        return this.f3790a;
    }

    public void m5457a(ju juVar) {
        if (!TextUtils.isEmpty(this.f3790a)) {
            juVar.m5458a(this.f3790a);
        }
        if (this.f3791b) {
            juVar.m5459a(this.f3791b);
        }
    }

    public void m5458a(String str) {
        this.f3790a = str;
    }

    public void m5459a(boolean z) {
        this.f3791b = z;
    }

    public boolean m5460b() {
        return this.f3791b;
    }

    public String toString() {
        Map hashMap = new HashMap();
        hashMap.put("description", this.f3790a);
        hashMap.put("fatal", Boolean.valueOf(this.f3791b));
        return ji.m5116a((Object) hashMap);
    }
}
