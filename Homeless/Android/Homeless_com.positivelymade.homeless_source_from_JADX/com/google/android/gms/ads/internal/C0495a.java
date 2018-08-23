package com.google.android.gms.ads.internal;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.C0428a;
import com.google.android.gms.ads.internal.client.C0490u.C0491a;
import com.google.android.gms.ads.internal.client.C0511p;
import com.google.android.gms.ads.internal.client.C0514q;
import com.google.android.gms.ads.internal.client.C0522w;
import com.google.android.gms.ads.internal.client.C0526n;
import com.google.android.gms.ads.internal.client.C0527x;
import com.google.android.gms.ads.internal.overlay.C0492n;
import com.google.android.gms.ads.internal.request.C0640a.C0493a;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.p028c.C1152y;
import com.google.android.gms.p028c.ai;
import com.google.android.gms.p028c.al;
import com.google.android.gms.p028c.az;
import com.google.android.gms.p028c.be;
import com.google.android.gms.p028c.bf;
import com.google.android.gms.p028c.bj;
import com.google.android.gms.p028c.cd;
import com.google.android.gms.p028c.eo;
import com.google.android.gms.p028c.es;
import com.google.android.gms.p028c.fd.C0494a;
import com.google.android.gms.p028c.fn;
import com.google.android.gms.p028c.gd;
import com.google.android.gms.p028c.gd.C0973a;
import com.google.android.gms.p028c.ge;
import com.google.android.gms.p028c.gh;
import com.google.android.gms.p028c.gi;
import com.google.android.gms.p029b.C0799a;
import com.google.android.gms.p029b.C0802b;
import java.util.HashSet;

@fn
public abstract class C0495a extends C0491a implements C0428a, C0492n, C0493a, cd, C0494a, gh {
    boolean f1307a = false;
    protected final C0589o f1308b;
    protected final C0637q f1309c;
    protected transient AdRequestParcel f1310d;
    protected final C1152y f1311e;
    protected final C0552d f1312f;
    private bf f1313g;
    private be f1314h;
    private be f1315i;

    C0495a(C0637q c0637q, C0589o c0589o, C0552d c0552d) {
        this.f1309c = c0637q;
        if (c0589o == null) {
            c0589o = new C0589o(this);
        }
        this.f1308b = c0589o;
        this.f1312f = c0552d;
        C0618p.m2796e().m4872b(this.f1309c.f1779c);
        C0618p.m2799h().m4775a(this.f1309c.f1779c, this.f1309c.f1781e);
        this.f1311e = C0618p.m2799h().m4793j();
    }

    private boolean mo373s() {
        C0691b.m3099c("Ad leaving application.");
        if (this.f1309c.f1790n == null) {
            return false;
        }
        try {
            this.f1309c.f1790n.mo389b();
            return true;
        } catch (Throwable e) {
            C0691b.m3102d("Could not call AdListener.onAdLeftApplication().", e);
            return false;
        }
    }

    long m2193a(String str) {
        int indexOf = str.indexOf("ufe");
        int indexOf2 = str.indexOf(44, indexOf);
        if (indexOf2 == -1) {
            indexOf2 = str.length();
        }
        try {
            return Long.parseLong(str.substring(indexOf + 4, indexOf2));
        } catch (IndexOutOfBoundsException e) {
            C0691b.m3103e("Invalid index for Url fetch time in CSI latency info.");
            return -1;
        } catch (NumberFormatException e2) {
            C0691b.m3103e("Cannot find valid format of Url fetch time in CSI latency info.");
            return -1;
        }
    }

    Bundle m2194a(al alVar) {
        if (alVar == null) {
            return null;
        }
        String b;
        if (alVar.m3834f()) {
            alVar.m3832d();
        }
        ai c = alVar.m3831c();
        if (c != null) {
            b = c.m3805b();
            C0691b.m3093a("In AdManger: loadAd, " + c.toString());
        } else {
            b = null;
        }
        if (b == null) {
            return null;
        }
        Bundle bundle = new Bundle(1);
        bundle.putString("fingerprint", b);
        bundle.putInt("v", 1);
        return bundle;
    }

    public C0799a mo339a() {
        C1305x.m6624b("getAdFrame must be called on the main UI thread.");
        return C0802b.m3754a(this.f1309c.f1782f);
    }

    protected void m2196a(View view) {
        this.f1309c.f1782f.addView(view, C0618p.m2798g().mo755d());
    }

    public void mo340a(AdSizeParcel adSizeParcel) {
        C1305x.m6624b("setAdSize must be called on the main UI thread.");
        this.f1309c.f1785i = adSizeParcel;
        if (!(this.f1309c.f1786j == null || this.f1309c.f1786j.f3267b == null || this.f1309c.f1770C != 0)) {
            this.f1309c.f1786j.f3267b.mo763a(adSizeParcel);
        }
        if (this.f1309c.f1782f != null) {
            if (this.f1309c.f1782f.getChildCount() > 1) {
                this.f1309c.f1782f.removeView(this.f1309c.f1782f.getNextView());
            }
            this.f1309c.f1782f.setMinimumWidth(adSizeParcel.f1353g);
            this.f1309c.f1782f.setMinimumHeight(adSizeParcel.f1350d);
            this.f1309c.f1782f.requestLayout();
        }
    }

    public void mo341a(C0511p c0511p) {
        C1305x.m6624b("setAdListener must be called on the main UI thread.");
        this.f1309c.f1789m = c0511p;
    }

    public void mo342a(C0514q c0514q) {
        C1305x.m6624b("setAdListener must be called on the main UI thread.");
        this.f1309c.f1790n = c0514q;
    }

    public void mo343a(C0522w c0522w) {
        C1305x.m6624b("setAppEventListener must be called on the main UI thread.");
        this.f1309c.f1791o = c0522w;
    }

    public void mo344a(C0527x c0527x) {
        C1305x.m6624b("setCorrelationIdProvider must be called on the main UI thread");
        this.f1309c.f1792p = c0527x;
    }

    public void mo345a(bj bjVar) {
        throw new IllegalStateException("setOnCustomRenderedAdLoadedListener is not supported for current ad type");
    }

    public void mo346a(eo eoVar) {
        throw new IllegalStateException("setInAppPurchaseListener is not supported for current ad type");
    }

    public void mo347a(es esVar, String str) {
        throw new IllegalStateException("setPlayStorePurchaseParams is not supported for current ad type");
    }

    public void mo348a(C0973a c0973a) {
        if (!(c0973a.f3259b.f1877n == -1 || TextUtils.isEmpty(c0973a.f3259b.f1889z))) {
            long a = m2193a(c0973a.f3259b.f1889z);
            if (a != -1) {
                be a2 = this.f1313g.m3917a(a + c0973a.f3259b.f1877n);
                this.f1313g.m3920a(a2, "stc");
            }
        }
        this.f1313g.m3918a(c0973a.f3259b.f1889z);
        this.f1313g.m3920a(this.f1314h, "arf");
        this.f1315i = this.f1313g.m3916a();
        this.f1309c.f1783g = null;
        this.f1309c.f1787k = c0973a;
        mo380a(c0973a, this.f1313g);
    }

    protected abstract void mo380a(C0973a c0973a, bf bfVar);

    public void mo349a(String str, String str2) {
        if (this.f1309c.f1791o != null) {
            try {
                this.f1309c.f1791o.mo392a(str, str2);
            } catch (Throwable e) {
                C0691b.m3102d("Could not call the AppEventListener.", e);
            }
        }
    }

    public void mo350a(HashSet<ge> hashSet) {
        this.f1309c.m2896a((HashSet) hashSet);
    }

    public void mo351a(boolean z) {
        throw new UnsupportedOperationException("Attempt to call setManualImpressionsEnabled for an unsupported ad type.");
    }

    protected boolean m2210a(int i) {
        C0691b.m3103e("Failed to load ad: " + i);
        this.f1307a = false;
        if (this.f1309c.f1790n == null) {
            return false;
        }
        try {
            this.f1309c.f1790n.mo388a(i);
            return true;
        } catch (Throwable e) {
            C0691b.m3102d("Could not call AdListener.onAdFailedToLoad().", e);
            return false;
        }
    }

    public boolean mo352a(AdRequestParcel adRequestParcel) {
        C1305x.m6624b("loadAd must be called on the main UI thread.");
        if (this.f1309c.f1783g == null && this.f1309c.f1784h == null) {
            C0691b.m3099c("Starting ad request.");
            this.f1307a = true;
            m2229n();
            this.f1314h = this.f1313g.m3916a();
            if (!adRequestParcel.f1335f) {
                C0691b.m3099c("Use AdRequest.Builder.addTestDevice(\"" + C0526n.m2400a().m3081a(this.f1309c.f1779c) + "\") to get test ads on this device.");
            }
            return mo365a(adRequestParcel, this.f1313g);
        }
        if (this.f1310d != null) {
            C0691b.m3103e("Aborting last ad request since another ad request is already in progress. The current request object will still be cached for future refreshes.");
        }
        this.f1310d = adRequestParcel;
        return false;
    }

    protected abstract boolean mo365a(AdRequestParcel adRequestParcel, bf bfVar);

    boolean mo366a(gd gdVar) {
        return false;
    }

    protected abstract boolean mo367a(gd gdVar, gd gdVar2);

    public void mo353b() {
        C1305x.m6624b("destroy must be called on the main UI thread.");
        this.f1308b.m2646a();
        this.f1311e.m5917c(this.f1309c.f1786j);
        this.f1309c.m2905i();
    }

    public void mo354b(gd gdVar) {
        this.f1313g.m3920a(this.f1315i, "awr");
        this.f1309c.f1784h = null;
        if (!(gdVar.f3269d == -2 || gdVar.f3269d == 3)) {
            C0618p.m2799h().m4782a(this.f1309c.m2895a());
        }
        if (gdVar.f3269d == -1) {
            this.f1307a = false;
            return;
        }
        if (mo366a(gdVar)) {
            C0691b.m3093a("Ad refresh scheduled.");
        }
        if (gdVar.f3269d != -2) {
            m2210a(gdVar.f3269d);
            return;
        }
        if (this.f1309c.f1768A == null) {
            this.f1309c.f1768A = new gi(this.f1309c.f1778b);
        }
        this.f1311e.m5916b(this.f1309c.f1786j);
        if (mo367a(this.f1309c.f1786j, gdVar)) {
            this.f1309c.f1786j = gdVar;
            this.f1309c.m2904h();
            this.f1313g.m3919a("is_mraid", this.f1309c.f1786j.m4755a() ? "1" : "0");
            this.f1313g.m3919a("is_mediation", this.f1309c.f1786j.f3276k ? "1" : "0");
            if (!(this.f1309c.f1786j.f3267b == null || this.f1309c.f1786j.f3267b.mo788i() == null)) {
                this.f1313g.m3919a("is_video", this.f1309c.f1786j.f3267b.mo788i().m5051c() ? "1" : "0");
            }
            this.f1313g.m3920a(this.f1314h, "ttc");
            if (C0618p.m2799h().m4788e() != null) {
                C0618p.m2799h().m4788e().m3910a(this.f1313g);
            }
            if (this.f1309c.m2901e()) {
                mo445q();
            }
        }
    }

    protected boolean mo368b(AdRequestParcel adRequestParcel) {
        ViewParent parent = this.f1309c.f1782f.getParent();
        return (parent instanceof View) && ((View) parent).isShown() && C0618p.m2796e().m4862a();
    }

    public void m2218c(AdRequestParcel adRequestParcel) {
        if (mo368b(adRequestParcel)) {
            mo352a(adRequestParcel);
            return;
        }
        C0691b.m3099c("Ad is not visible. Not refreshing ad.");
        this.f1308b.m2647a(adRequestParcel);
    }

    protected void m2219c(gd gdVar) {
        if (gdVar == null) {
            C0691b.m3103e("Ad state was null when trying to ping impression URLs.");
            return;
        }
        C0691b.m3093a("Pinging Impression URLs.");
        this.f1309c.f1788l.m4760a();
        if (gdVar.f3270e != null) {
            C0618p.m2796e().m4857a(this.f1309c.f1779c, this.f1309c.f1781e.f1976b, C0618p.m2796e().m4848a(this.f1309c.f1779c, gdVar.f3270e, gdVar.f3289x));
        }
    }

    public boolean mo355c() {
        C1305x.m6624b("isLoaded must be called on the main UI thread.");
        return this.f1309c.f1783g == null && this.f1309c.f1784h == null && this.f1309c.f1786j != null;
    }

    public void mo356d() {
        C1305x.m6624b("pause must be called on the main UI thread.");
    }

    public void mo327e() {
        if (this.f1309c.f1786j == null) {
            C0691b.m3103e("Ad state was null when trying to ping click URLs.");
            return;
        }
        C0691b.m3093a("Pinging click URLs.");
        this.f1309c.f1788l.m4764b();
        if (this.f1309c.f1786j.f3268c != null) {
            C0618p.m2796e().m4857a(this.f1309c.f1779c, this.f1309c.f1781e.f1976b, C0618p.m2796e().m4848a(this.f1309c.f1779c, this.f1309c.f1786j.f3268c, this.f1309c.f1786j.f3289x));
        }
        if (this.f1309c.f1789m != null) {
            try {
                this.f1309c.f1789m.mo386a();
            } catch (Throwable e) {
                C0691b.m3102d("Could not notify onAdClicked event.", e);
            }
        }
    }

    public void mo357f() {
        C1305x.m6624b("resume must be called on the main UI thread.");
    }

    public void mo358h() {
        C1305x.m6624b("stopLoading must be called on the main UI thread.");
        this.f1307a = false;
        this.f1309c.m2897a(true);
    }

    public void mo359i() {
        C1305x.m6624b("recordManualImpression must be called on the main UI thread.");
        if (this.f1309c.f1786j == null) {
            C0691b.m3103e("Ad state was null when trying to ping manual tracking URLs.");
            return;
        }
        C0691b.m3093a("Pinging manual tracking URLs.");
        if (this.f1309c.f1786j.f3271f != null) {
            C0618p.m2796e().m4857a(this.f1309c.f1779c, this.f1309c.f1781e.f1976b, C0618p.m2796e().m4848a(this.f1309c.f1779c, this.f1309c.f1786j.f3271f, this.f1309c.f1786j.f3289x));
        }
    }

    public AdSizeParcel mo360j() {
        C1305x.m6624b("getAdSize must be called on the main UI thread.");
        return this.f1309c.f1785i;
    }

    public boolean mo361l() {
        return this.f1307a;
    }

    public void mo362m() {
        mo373s();
    }

    void m2229n() {
        this.f1313g = new bf(((Boolean) az.f2455G.m3878c()).booleanValue(), "load_ad", this.f1309c.f1785i.f1348b);
        this.f1314h = new be(-1, null, null);
        this.f1315i = new be(-1, null, null);
    }

    protected boolean m2230o() {
        C0691b.m3101d("Ad closing.");
        if (this.f1309c.f1790n == null) {
            return false;
        }
        try {
            this.f1309c.f1790n.mo387a();
            return true;
        } catch (Throwable e) {
            C0691b.m3102d("Could not call AdListener.onAdClosed().", e);
            return false;
        }
    }

    protected boolean m2231p() {
        C0691b.m3099c("Ad opening.");
        if (this.f1309c.f1790n == null) {
            return false;
        }
        try {
            this.f1309c.f1790n.mo391d();
            return true;
        } catch (Throwable e) {
            C0691b.m3102d("Could not call AdListener.onAdOpened().", e);
            return false;
        }
    }

    protected boolean mo445q() {
        C0691b.m3099c("Ad finished loading.");
        this.f1307a = false;
        if (this.f1309c.f1790n == null) {
            return false;
        }
        try {
            this.f1309c.f1790n.mo390c();
            return true;
        } catch (Throwable e) {
            C0691b.m3102d("Could not call AdListener.onAdLoaded().", e);
            return false;
        }
    }

    protected void mo382r() {
        m2219c(this.f1309c.f1786j);
    }
}
