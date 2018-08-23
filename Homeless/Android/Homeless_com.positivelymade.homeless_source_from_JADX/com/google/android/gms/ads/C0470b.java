package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C0516f;
import com.google.android.gms.ads.internal.client.C0517g;
import com.google.android.gms.ads.internal.client.C0520j;
import com.google.android.gms.ads.internal.client.C0532r;
import com.google.android.gms.ads.internal.client.C0535s;
import com.google.android.gms.ads.internal.client.aa;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.ads.p019b.C0466b;
import com.google.android.gms.ads.p019b.C0468d.C0431a;
import com.google.android.gms.ads.p019b.C0469e.C0432a;
import com.google.android.gms.p028c.bz;
import com.google.android.gms.p028c.ca;
import com.google.android.gms.p028c.dh;

public class C0470b {
    private final C0520j f1257a;
    private final Context f1258b;
    private final C0532r f1259c;

    public static class C0461a {
        private final Context f1247a;
        private final C0535s f1248b;

        C0461a(Context context, C0535s c0535s) {
            this.f1247a = context;
            this.f1248b = c0535s;
        }

        public C0461a(Context context, String str) {
            this(context, C0517g.m2377a(context, str, new dh()));
        }

        public C0461a m2053a(C0427a c0427a) {
            try {
                this.f1248b.mo398a(new C0516f(c0427a));
            } catch (Throwable e) {
                C0691b.m3102d("Failed to set AdListener.", e);
            }
            return this;
        }

        public C0461a m2054a(C0466b c0466b) {
            try {
                this.f1248b.mo399a(new NativeAdOptionsParcel(c0466b));
            } catch (Throwable e) {
                C0691b.m3102d("Failed to specify native ad options", e);
            }
            return this;
        }

        public C0461a m2055a(C0431a c0431a) {
            try {
                this.f1248b.mo400a(new bz(c0431a));
            } catch (Throwable e) {
                C0691b.m3102d("Failed to add app install ad listener", e);
            }
            return this;
        }

        public C0461a m2056a(C0432a c0432a) {
            try {
                this.f1248b.mo401a(new ca(c0432a));
            } catch (Throwable e) {
                C0691b.m3102d("Failed to add content ad listener", e);
            }
            return this;
        }

        public C0470b m2057a() {
            try {
                return new C0470b(this.f1247a, this.f1248b.mo397a());
            } catch (Throwable e) {
                C0691b.m3098b("Failed to build AdLoader.", e);
                return null;
            }
        }
    }

    C0470b(Context context, C0532r c0532r) {
        this(context, c0532r, C0520j.m2389a());
    }

    C0470b(Context context, C0532r c0532r, C0520j c0520j) {
        this.f1258b = context;
        this.f1259c = c0532r;
        this.f1257a = c0520j;
    }

    private void m2085a(aa aaVar) {
        try {
            this.f1259c.mo395a(this.f1257a.m2390a(this.f1258b, aaVar));
        } catch (Throwable e) {
            C0691b.m3098b("Failed to load ad.", e);
        }
    }

    public void m2086a(C0476c c0476c) {
        m2085a(c0476c.m2109a());
    }
}
