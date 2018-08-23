package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.ads.C0427a;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.ads.p022a.C0456a;
import com.google.android.gms.ads.p022a.C0458c;
import com.google.android.gms.ads.p022a.C0460e;
import com.google.android.gms.ads.purchase.C0694b;
import com.google.android.gms.ads.purchase.C0696d;
import com.google.android.gms.p028c.bk;
import com.google.android.gms.p028c.dh;
import com.google.android.gms.p028c.et;
import com.google.android.gms.p028c.ex;

public class ac {
    private final dh f1419a;
    private final Context f1420b;
    private final C0520j f1421c;
    private C0427a f1422d;
    private C0428a f1423e;
    private C0490u f1424f;
    private String f1425g;
    private String f1426h;
    private C0456a f1427i;
    private C0696d f1428j;
    private C0694b f1429k;
    private C0460e f1430l;
    private C0458c f1431m;

    public ac(Context context) {
        this(context, C0520j.m2389a(), null);
    }

    public ac(Context context, C0520j c0520j, C0460e c0460e) {
        this.f1419a = new dh();
        this.f1420b = context;
        this.f1421c = c0520j;
        this.f1430l = c0460e;
    }

    private void m2345b(String str) {
        if (this.f1425g == null) {
            m2346c(str);
        }
        this.f1424f = C0526n.m2402b().m2384b(this.f1420b, new AdSizeParcel(), this.f1425g, this.f1419a);
        if (this.f1422d != null) {
            this.f1424f.mo342a(new C0516f(this.f1422d));
        }
        if (this.f1423e != null) {
            this.f1424f.mo341a(new C0513e(this.f1423e));
        }
        if (this.f1427i != null) {
            this.f1424f.mo343a(new C0524l(this.f1427i));
        }
        if (this.f1429k != null) {
            this.f1424f.mo346a(new et(this.f1429k));
        }
        if (this.f1428j != null) {
            this.f1424f.mo347a(new ex(this.f1428j), this.f1426h);
        }
        if (this.f1431m != null) {
            this.f1424f.mo345a(new bk(this.f1431m));
        }
    }

    private void m2346c(String str) {
        if (this.f1424f == null) {
            throw new IllegalStateException("The ad unit ID must be set on InterstitialAd before " + str + " is called.");
        }
    }

    public void m2347a(C0427a c0427a) {
        try {
            this.f1422d = c0427a;
            if (this.f1424f != null) {
                this.f1424f.mo342a(c0427a != null ? new C0516f(c0427a) : null);
            }
        } catch (Throwable e) {
            C0691b.m3102d("Failed to set the AdListener.", e);
        }
    }

    public void m2348a(C0428a c0428a) {
        try {
            this.f1423e = c0428a;
            if (this.f1424f != null) {
                this.f1424f.mo341a(c0428a != null ? new C0513e(c0428a) : null);
            }
        } catch (Throwable e) {
            C0691b.m3102d("Failed to set the AdClickListener.", e);
        }
    }

    public void m2349a(aa aaVar) {
        try {
            if (this.f1424f == null) {
                m2345b("loadAd");
            }
            if (this.f1424f.mo352a(this.f1421c.m2390a(this.f1420b, aaVar))) {
                this.f1419a.m4228a(aaVar.m2316j());
            }
        } catch (Throwable e) {
            C0691b.m3102d("Failed to load ad.", e);
        }
    }

    public void m2350a(String str) {
        if (this.f1425g != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
        }
        this.f1425g = str;
    }

    public boolean m2351a() {
        boolean z = false;
        try {
            if (this.f1424f != null) {
                z = this.f1424f.mo355c();
            }
        } catch (Throwable e) {
            C0691b.m3102d("Failed to check if ad is ready.", e);
        }
        return z;
    }

    public void m2352b() {
        try {
            m2346c("show");
            this.f1424f.mo371g();
        } catch (Throwable e) {
            C0691b.m3102d("Failed to show interstitial.", e);
        }
    }
}
