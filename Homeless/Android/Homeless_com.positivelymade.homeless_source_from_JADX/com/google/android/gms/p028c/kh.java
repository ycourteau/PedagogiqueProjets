package com.google.android.gms.p028c;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.analytics.C0710e;
import com.google.android.gms.analytics.C0713f.C0712b;
import com.google.android.gms.analytics.C0719h;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.p028c.jo.C0579a;
import com.google.android.gms.p028c.ki.C1104a;
import com.google.android.gms.p032d.C1545a;

class kh {
    private final ki f3821a;
    private final Context f3822b;

    static class C1102a implements C0579a {
        private final C0719h f3820a;

        C1102a(C0719h c0719h) {
            this.f3820a = c0719h;
        }

        public void mo446a(jv jvVar) {
            this.f3820a.m3248a(jvVar.m5468b());
            C0712b c0712b = new C0712b();
            c0712b.m3182a("&a", String.valueOf(jvVar.m5472c()));
            this.f3820a.m3250a(c0712b.mo539a());
        }

        public void mo447a(jv jvVar, Activity activity) {
        }
    }

    public kh(Context context, C1545a c1545a, ki kiVar) {
        this.f3822b = context;
        this.f3821a = kh.m5514a(c1545a, kiVar);
        m5515b();
    }

    static ki m5514a(C1545a c1545a, ki kiVar) {
        if (c1545a == null || c1545a.m6992b()) {
            return kiVar;
        }
        C1104a c1104a = new C1104a(kiVar.m5527a());
        c1104a.m5523a(c1545a.m6991b("trackingId")).m5524a(c1545a.m6990a("trackScreenViews")).m5526b(c1545a.m6990a("collectAdIdentifiers"));
        return c1104a.m5525a();
    }

    private void m5515b() {
        if (this.f3821a.m5528b() && !TextUtils.isEmpty(this.f3821a.m5530d())) {
            C0719h a = m5516a(this.f3821a.m5530d());
            a.m3251a(this.f3821a.m5529c());
            m5518a(new C1102a(a));
        }
    }

    C0719h m5516a(String str) {
        return C0710e.m3165a(this.f3822b).m3168a(str);
    }

    public ki m5517a() {
        return this.f3821a;
    }

    void m5518a(C0579a c0579a) {
        C1305x.m6617a((Object) c0579a);
        jo a = jo.m5384a(this.f3822b);
        a.m5389a(true);
        a.m5387a(c0579a);
    }
}
