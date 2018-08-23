package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.Window;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.p028c.az;
import com.google.android.gms.p028c.bf;
import com.google.android.gms.p028c.ck;
import com.google.android.gms.p028c.di;
import com.google.android.gms.p028c.fn;
import com.google.android.gms.p028c.gd;
import com.google.android.gms.p028c.gd.C0973a;
import com.google.android.gms.p028c.hg;

@fn
public class C0577k extends C0505c implements ck {
    protected transient boolean f1559i = false;

    public C0577k(Context context, AdSizeParcel adSizeParcel, String str, di diVar, VersionInfoParcel versionInfoParcel, C0552d c0552d) {
        super(context, adSizeParcel, str, diVar, versionInfoParcel, c0552d);
    }

    private void m2595B() {
        if (this.c.m2901e()) {
            this.c.m2898b();
            this.c.f1786j = null;
            this.c.f1772E = false;
            this.f1559i = false;
        }
    }

    private void m2596a(Bundle bundle) {
        C0618p.m2796e().m4871b(this.c.f1779c, this.c.f1781e.f1976b, "gmob-apps", bundle, false);
    }

    protected boolean m2597A() {
        if (!(this.c.f1779c instanceof Activity)) {
            return false;
        }
        Window window = ((Activity) this.c.f1779c).getWindow();
        if (window == null || window.getDecorView() == null) {
            return false;
        }
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        window.getDecorView().getGlobalVisibleRect(rect, null);
        window.getDecorView().getWindowVisibleDisplayFrame(rect2);
        boolean z = (rect.bottom == 0 || rect2.bottom == 0 || rect.top != rect2.top) ? false : true;
        return z;
    }

    protected hg mo442a(C0973a c0973a, C0555e c0555e) {
        hg a = C0618p.m2797f().m5057a(this.c.f1779c, this.c.f1785i, false, false, this.c.f1780d, this.c.f1781e, this.f);
        a.mo788i().m5039a(this, null, this, this, ((Boolean) az.f2467S.m3878c()).booleanValue(), this, this, c0555e, null);
        a.mo773b(c0973a.f3258a.f1862z);
        return a;
    }

    public boolean mo365a(AdRequestParcel adRequestParcel, bf bfVar) {
        if (this.c.f1786j == null) {
            return super.mo365a(adRequestParcel, bfVar);
        }
        C0691b.m3103e("An interstitial is already loading. Aborting.");
        return false;
    }

    protected boolean mo443a(AdRequestParcel adRequestParcel, gd gdVar, boolean z) {
        if (this.c.m2901e() && gdVar.f3267b != null) {
            C0618p.m2798g().mo745a(gdVar.f3267b.getWebView());
        }
        return this.b.m2651d();
    }

    public boolean mo367a(gd gdVar, gd gdVar2) {
        if (!super.mo367a(gdVar, gdVar2)) {
            return false;
        }
        if (!(this.c.m2901e() || this.c.f1769B == null || gdVar2.f3275j == null)) {
            this.e.m5913a(this.c.f1785i, gdVar2, this.c.f1769B);
        }
        return true;
    }

    public void mo444b(boolean z) {
        this.c.f1772E = z;
    }

    public void b_() {
        m2595B();
        super.b_();
    }

    public void c_() {
        mo382r();
        super.c_();
    }

    public void mo371g() {
        C1305x.m6624b("showInterstitial must be called on the main UI thread.");
        if (this.c.f1786j == null) {
            C0691b.m3103e("The interstitial has not loaded.");
            return;
        }
        if (((Boolean) az.ae.m3878c()).booleanValue()) {
            Bundle bundle;
            String packageName = this.c.f1779c.getApplicationContext() != null ? this.c.f1779c.getApplicationContext().getPackageName() : this.c.f1779c.getPackageName();
            if (!this.f1559i) {
                C0691b.m3103e("It is not recommended to show an interstitial before onAdLoaded completes.");
                bundle = new Bundle();
                bundle.putString("appid", packageName);
                bundle.putString("action", "show_interstitial_before_load_finish");
                m2596a(bundle);
            }
            if (!C0618p.m2796e().m4887g(this.c.f1779c)) {
                C0691b.m3103e("It is not recommended to show an interstitial when app is not in foreground.");
                bundle = new Bundle();
                bundle.putString("appid", packageName);
                bundle.putString("action", "show_interstitial_app_not_in_foreground");
                m2596a(bundle);
            }
        }
        if (!this.c.m2902f()) {
            if (this.c.f1786j.f3276k) {
                try {
                    this.c.f1786j.f3278m.mo652b();
                } catch (Throwable e) {
                    C0691b.m3102d("Could not show interstitial.", e);
                    m2595B();
                }
            } else if (this.c.f1786j.f3267b == null) {
                C0691b.m3103e("The interstitial failed to load.");
            } else if (this.c.f1786j.f3267b.mo795m()) {
                C0691b.m3103e("The interstitial is already showing.");
            } else {
                this.c.f1786j.f3267b.mo770a(true);
                if (this.c.f1786j.f3275j != null) {
                    this.e.m5912a(this.c.f1785i, this.c.f1786j);
                }
                InterstitialAdParameterParcel interstitialAdParameterParcel = new InterstitialAdParameterParcel(this.c.f1772E, m2597A());
                int requestedOrientation = this.c.f1786j.f3267b.getRequestedOrientation();
                if (requestedOrientation == -1) {
                    requestedOrientation = this.c.f1786j.f3272g;
                }
                C0618p.m2794c().m2738a(this.c.f1779c, new AdOverlayInfoParcel(this, this, this, this.c.f1786j.f3267b, requestedOrientation, this.c.f1781e, this.c.f1786j.f3287v, interstitialAdParameterParcel));
            }
        }
    }

    protected boolean mo445q() {
        if (!super.mo445q()) {
            return false;
        }
        this.f1559i = true;
        return true;
    }
}
