package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C0428a;
import com.google.android.gms.ads.internal.client.ac;

public final class C0486e {
    private final ac f1287a;

    public C0486e(Context context) {
        this.f1287a = new ac(context);
    }

    public void m2145a(C0427a c0427a) {
        this.f1287a.m2347a(c0427a);
        if (c0427a != null && (c0427a instanceof C0428a)) {
            this.f1287a.m2348a((C0428a) c0427a);
        } else if (c0427a == null) {
            this.f1287a.m2348a(null);
        }
    }

    public void m2146a(C0476c c0476c) {
        this.f1287a.m2349a(c0476c.m2109a());
    }

    public void m2147a(String str) {
        this.f1287a.m2350a(str);
    }

    public boolean m2148a() {
        return this.f1287a.m2351a();
    }

    public void m2149b() {
        this.f1287a.m2352b();
    }
}
