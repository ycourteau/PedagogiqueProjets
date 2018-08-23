package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.C0427a;
import com.google.android.gms.ads.C0483d;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.ads.p022a.C0456a;
import com.google.android.gms.ads.p022a.C0458c;
import com.google.android.gms.ads.purchase.C0694b;
import com.google.android.gms.ads.purchase.C0696d;
import com.google.android.gms.p028c.bk;
import com.google.android.gms.p028c.dh;
import com.google.android.gms.p028c.et;
import com.google.android.gms.p028c.ex;
import com.google.android.gms.p029b.C0799a;
import com.google.android.gms.p029b.C0802b;
import java.util.concurrent.atomic.AtomicBoolean;

public class ab {
    private final dh f1404a;
    private final C0520j f1405b;
    private final AtomicBoolean f1406c;
    private C0427a f1407d;
    private C0428a f1408e;
    private C0490u f1409f;
    private C0483d[] f1410g;
    private String f1411h;
    private String f1412i;
    private ViewGroup f1413j;
    private C0456a f1414k;
    private C0694b f1415l;
    private C0696d f1416m;
    private C0458c f1417n;
    private boolean f1418o;

    public ab(ViewGroup viewGroup) {
        this(viewGroup, null, false, C0520j.m2389a());
    }

    public ab(ViewGroup viewGroup, AttributeSet attributeSet, boolean z) {
        this(viewGroup, attributeSet, z, C0520j.m2389a());
    }

    ab(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, C0520j c0520j) {
        this(viewGroup, attributeSet, z, c0520j, null);
    }

    ab(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, C0520j c0520j, C0490u c0490u) {
        this.f1404a = new dh();
        this.f1413j = viewGroup;
        this.f1405b = c0520j;
        this.f1409f = c0490u;
        this.f1406c = new AtomicBoolean(false);
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                C0525m c0525m = new C0525m(context, attributeSet);
                this.f1410g = c0525m.m2399a(z);
                this.f1411h = c0525m.m2398a();
                if (viewGroup.isInEditMode()) {
                    C0526n.m2400a().m3083a(viewGroup, new AdSizeParcel(context, this.f1410g[0]), "Ads by Google");
                }
            } catch (IllegalArgumentException e) {
                C0526n.m2400a().m3084a(viewGroup, new AdSizeParcel(context, C0483d.f1277a), e.getMessage(), e.getMessage());
            }
        }
    }

    private void m2321n() {
        try {
            C0799a a = this.f1409f.mo339a();
            if (a != null) {
                this.f1413j.addView((View) C0802b.m3755a(a));
            }
        } catch (Throwable e) {
            C0691b.m3102d("Failed to get an ad frame.", e);
        }
    }

    public void m2322a() {
        try {
            if (this.f1409f != null) {
                this.f1409f.mo353b();
            }
        } catch (Throwable e) {
            C0691b.m3102d("Failed to destroy AdView.", e);
        }
    }

    public void m2323a(C0456a c0456a) {
        try {
            this.f1414k = c0456a;
            if (this.f1409f != null) {
                this.f1409f.mo343a(c0456a != null ? new C0524l(c0456a) : null);
            }
        } catch (Throwable e) {
            C0691b.m3102d("Failed to set the AppEventListener.", e);
        }
    }

    public void m2324a(C0458c c0458c) {
        this.f1417n = c0458c;
        try {
            if (this.f1409f != null) {
                this.f1409f.mo345a(c0458c != null ? new bk(c0458c) : null);
            }
        } catch (Throwable e) {
            C0691b.m3102d("Failed to set the onCustomRenderedAdLoadedListener.", e);
        }
    }

    public void m2325a(C0427a c0427a) {
        try {
            this.f1407d = c0427a;
            if (this.f1409f != null) {
                this.f1409f.mo342a(c0427a != null ? new C0516f(c0427a) : null);
            }
        } catch (Throwable e) {
            C0691b.m3102d("Failed to set the AdListener.", e);
        }
    }

    public void m2326a(C0428a c0428a) {
        try {
            this.f1408e = c0428a;
            if (this.f1409f != null) {
                this.f1409f.mo341a(c0428a != null ? new C0513e(c0428a) : null);
            }
        } catch (Throwable e) {
            C0691b.m3102d("Failed to set the AdClickListener.", e);
        }
    }

    public void m2327a(aa aaVar) {
        try {
            if (this.f1409f == null) {
                m2343l();
            }
            if (this.f1409f.mo352a(this.f1405b.m2390a(this.f1413j.getContext(), aaVar))) {
                this.f1404a.m4228a(aaVar.m2316j());
            }
        } catch (Throwable e) {
            C0691b.m3102d("Failed to load ad.", e);
        }
    }

    public void m2328a(C0694b c0694b) {
        if (this.f1416m != null) {
            throw new IllegalStateException("Play store purchase parameter has already been set.");
        }
        try {
            this.f1415l = c0694b;
            if (this.f1409f != null) {
                this.f1409f.mo346a(c0694b != null ? new et(c0694b) : null);
            }
        } catch (Throwable e) {
            C0691b.m3102d("Failed to set the InAppPurchaseListener.", e);
        }
    }

    public void m2329a(String str) {
        if (this.f1411h != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.f1411h = str;
    }

    public void m2330a(boolean z) {
        this.f1418o = z;
        try {
            if (this.f1409f != null) {
                this.f1409f.mo351a(this.f1418o);
            }
        } catch (Throwable e) {
            C0691b.m3102d("Failed to set manual impressions.", e);
        }
    }

    public void m2331a(C0483d... c0483dArr) {
        if (this.f1410g != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        m2333b(c0483dArr);
    }

    public C0427a m2332b() {
        return this.f1407d;
    }

    public void m2333b(C0483d... c0483dArr) {
        this.f1410g = c0483dArr;
        try {
            if (this.f1409f != null) {
                this.f1409f.mo340a(new AdSizeParcel(this.f1413j.getContext(), this.f1410g));
            }
        } catch (Throwable e) {
            C0691b.m3102d("Failed to set the ad size.", e);
        }
        this.f1413j.requestLayout();
    }

    public C0483d m2334c() {
        try {
            if (this.f1409f != null) {
                AdSizeParcel j = this.f1409f.mo360j();
                if (j != null) {
                    return j.m2282a();
                }
            }
        } catch (Throwable e) {
            C0691b.m3102d("Failed to get the current AdSize.", e);
        }
        return this.f1410g != null ? this.f1410g[0] : null;
    }

    public C0483d[] m2335d() {
        return this.f1410g;
    }

    public String m2336e() {
        return this.f1411h;
    }

    public C0456a m2337f() {
        return this.f1414k;
    }

    public C0694b m2338g() {
        return this.f1415l;
    }

    public C0458c m2339h() {
        return this.f1417n;
    }

    public void m2340i() {
        try {
            if (this.f1409f != null) {
                this.f1409f.mo356d();
            }
        } catch (Throwable e) {
            C0691b.m3102d("Failed to call pause.", e);
        }
    }

    public void m2341j() {
        try {
            if (this.f1409f != null) {
                this.f1409f.mo357f();
            }
        } catch (Throwable e) {
            C0691b.m3102d("Failed to call resume.", e);
        }
    }

    public String m2342k() {
        try {
            if (this.f1409f != null) {
                return this.f1409f.mo372k();
            }
        } catch (Throwable e) {
            C0691b.m3102d("Failed to get the mediation adapter class name.", e);
        }
        return null;
    }

    void m2343l() {
        if ((this.f1410g == null || this.f1411h == null) && this.f1409f == null) {
            throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
        }
        this.f1409f = m2344m();
        if (this.f1407d != null) {
            this.f1409f.mo342a(new C0516f(this.f1407d));
        }
        if (this.f1408e != null) {
            this.f1409f.mo341a(new C0513e(this.f1408e));
        }
        if (this.f1414k != null) {
            this.f1409f.mo343a(new C0524l(this.f1414k));
        }
        if (this.f1415l != null) {
            this.f1409f.mo346a(new et(this.f1415l));
        }
        if (this.f1416m != null) {
            this.f1409f.mo347a(new ex(this.f1416m), this.f1412i);
        }
        if (this.f1417n != null) {
            this.f1409f.mo345a(new bk(this.f1417n));
        }
        this.f1409f.mo344a(C0526n.m2403c());
        this.f1409f.mo351a(this.f1418o);
        m2321n();
    }

    protected C0490u m2344m() {
        Context context = this.f1413j.getContext();
        return C0526n.m2402b().m2382a(context, new AdSizeParcel(context, this.f1410g), this.f1411h, this.f1404a);
    }
}
