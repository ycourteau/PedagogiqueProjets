package com.google.android.gms.ads.internal;

import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.p028c.az;
import com.google.android.gms.p028c.fn;
import com.google.android.gms.p028c.gd.C0973a;
import com.google.android.gms.p028c.hg;

@fn
public class C0555e {
    private C0553a f1466a;
    private boolean f1467b;
    private boolean f1468c;

    public interface C0553a {
        void mo407a(String str);
    }

    @fn
    public static class C0554b implements C0553a {
        private final C0973a f1464a;
        private final hg f1465b;

        public C0554b(C0973a c0973a, hg hgVar) {
            this.f1464a = c0973a;
            this.f1465b = hgVar;
        }

        public void mo407a(String str) {
            C0691b.m3093a("An auto-clicking creative is blocked");
            Builder builder = new Builder();
            builder.scheme("https");
            builder.path("//pagead2.googlesyndication.com/pagead/gen_204");
            builder.appendQueryParameter("id", "gmob-apps-blocked-navigation");
            if (!TextUtils.isEmpty(str)) {
                builder.appendQueryParameter("navigationURL", str);
            }
            if (!(this.f1464a == null || this.f1464a.f3259b == null || TextUtils.isEmpty(this.f1464a.f3259b.f1878o))) {
                builder.appendQueryParameter("debugDialog", this.f1464a.f3259b.f1878o);
            }
            C0618p.m2796e().m4855a(this.f1465b.getContext(), this.f1465b.mo791l().f1976b, builder.toString());
        }
    }

    public C0555e() {
        this.f1468c = ((Boolean) az.f2483i.m3878c()).booleanValue();
    }

    public C0555e(boolean z) {
        this.f1468c = z;
    }

    public void m2473a() {
        this.f1467b = true;
    }

    public void m2474a(C0553a c0553a) {
        this.f1466a = c0553a;
    }

    public void m2475a(String str) {
        C0691b.m3093a("Action was blocked because no click was detected.");
        if (this.f1466a != null) {
            this.f1466a.mo407a(str);
        }
    }

    public boolean m2476b() {
        return !this.f1468c || this.f1467b;
    }
}
