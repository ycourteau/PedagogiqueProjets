package com.google.android.gms.p028c;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C1305x;
import java.util.HashMap;
import java.util.Map;

public final class ht extends ji<ht> {
    private String f3536a;
    private String f3537b;
    private String f3538c;
    private String f3539d;
    private boolean f3540e;
    private String f3541f;
    private boolean f3542g;
    private double f3543h;

    public String m5131a() {
        return this.f3536a;
    }

    public void m5132a(double d) {
        boolean z = d >= 0.0d && d <= 100.0d;
        C1305x.m6626b(z, "Sample rate must be between 0% and 100%");
        this.f3543h = d;
    }

    public void m5133a(ht htVar) {
        if (!TextUtils.isEmpty(this.f3536a)) {
            htVar.m5135a(this.f3536a);
        }
        if (!TextUtils.isEmpty(this.f3537b)) {
            htVar.m5138b(this.f3537b);
        }
        if (!TextUtils.isEmpty(this.f3538c)) {
            htVar.m5141c(this.f3538c);
        }
        if (!TextUtils.isEmpty(this.f3539d)) {
            htVar.m5143d(this.f3539d);
        }
        if (this.f3540e) {
            htVar.m5136a(true);
        }
        if (!TextUtils.isEmpty(this.f3541f)) {
            htVar.m5144e(this.f3541f);
        }
        if (this.f3542g) {
            htVar.m5139b(this.f3542g);
        }
        if (this.f3543h != 0.0d) {
            htVar.m5132a(this.f3543h);
        }
    }

    public void m5135a(String str) {
        this.f3536a = str;
    }

    public void m5136a(boolean z) {
        this.f3540e = z;
    }

    public String m5137b() {
        return this.f3537b;
    }

    public void m5138b(String str) {
        this.f3537b = str;
    }

    public void m5139b(boolean z) {
        this.f3542g = z;
    }

    public String m5140c() {
        return this.f3538c;
    }

    public void m5141c(String str) {
        this.f3538c = str;
    }

    public String m5142d() {
        return this.f3539d;
    }

    public void m5143d(String str) {
        this.f3539d = str;
    }

    public void m5144e(String str) {
        this.f3541f = str;
    }

    public boolean m5145e() {
        return this.f3540e;
    }

    public String m5146f() {
        return this.f3541f;
    }

    public boolean m5147g() {
        return this.f3542g;
    }

    public double m5148h() {
        return this.f3543h;
    }

    public String toString() {
        Map hashMap = new HashMap();
        hashMap.put("hitType", this.f3536a);
        hashMap.put("clientId", this.f3537b);
        hashMap.put("userId", this.f3538c);
        hashMap.put("androidAdId", this.f3539d);
        hashMap.put("AdTargetingEnabled", Boolean.valueOf(this.f3540e));
        hashMap.put("sessionControl", this.f3541f);
        hashMap.put("nonInteraction", Boolean.valueOf(this.f3542g));
        hashMap.put("sampleRate", Double.valueOf(this.f3543h));
        return ji.m5116a((Object) hashMap);
    }
}
