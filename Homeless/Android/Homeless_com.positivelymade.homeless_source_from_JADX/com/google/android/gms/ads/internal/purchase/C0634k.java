package com.google.android.gms.ads.internal.purchase;

import android.content.Intent;
import com.google.android.gms.ads.internal.C0618p;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.p028c.fn;

@fn
public class C0634k {
    private final String f1765a;

    public C0634k(String str) {
        this.f1765a = str;
    }

    public String m2887a() {
        return C0618p.m2796e().m4875c();
    }

    public boolean m2888a(String str, int i, Intent intent) {
        if (str == null || intent == null) {
            return false;
        }
        String b = C0618p.m2806o().m2884b(intent);
        String c = C0618p.m2806o().m2886c(intent);
        if (b == null || c == null) {
            return false;
        }
        if (!str.equals(C0618p.m2806o().m2881a(b))) {
            C0691b.m3103e("Developer payload not match.");
            return false;
        } else if (this.f1765a == null || C0635l.m2890a(this.f1765a, b, c)) {
            return true;
        } else {
            C0691b.m3103e("Fail to verify signature.");
            return false;
        }
    }
}
