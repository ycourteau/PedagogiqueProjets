package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.C0526n;
import com.google.android.gms.ads.internal.overlay.C0497g;
import com.google.android.gms.ads.internal.purchase.C0498j;
import com.google.android.gms.ads.internal.purchase.C0622c;
import com.google.android.gms.ads.internal.purchase.C0624d;
import com.google.android.gms.ads.internal.purchase.C0627f;
import com.google.android.gms.ads.internal.purchase.C0629g;
import com.google.android.gms.ads.internal.purchase.C0634k;
import com.google.android.gms.ads.internal.purchase.GInAppPurchaseManagerInfoParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel.C0638a;
import com.google.android.gms.ads.internal.request.CapabilityParcel;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.p028c.az;
import com.google.android.gms.p028c.bf;
import com.google.android.gms.p028c.ci;
import com.google.android.gms.p028c.dc;
import com.google.android.gms.p028c.di;
import com.google.android.gms.p028c.el;
import com.google.android.gms.p028c.en;
import com.google.android.gms.p028c.eo;
import com.google.android.gms.p028c.es;
import com.google.android.gms.p028c.fn;
import com.google.android.gms.p028c.gd;
import com.google.android.gms.p028c.ge;
import com.google.android.gms.p028c.go;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@fn
public abstract class C0499b extends C0495a implements C0497g, C0498j, ci, dc {
    protected final di f1318g;
    protected transient boolean f1319h;
    private final Messenger f1320i;

    public C0499b(Context context, AdSizeParcel adSizeParcel, String str, di diVar, VersionInfoParcel versionInfoParcel, C0552d c0552d) {
        this(new C0637q(context, adSizeParcel, str, versionInfoParcel), diVar, null, c0552d);
    }

    C0499b(C0637q c0637q, di diVar, C0589o c0589o, C0552d c0552d) {
        super(c0637q, c0589o, c0552d);
        this.f1318g = diVar;
        this.f1320i = new Messenger(new el(this.c.f1779c));
        this.f1319h = false;
    }

    private C0638a m2241a(AdRequestParcel adRequestParcel, Bundle bundle) {
        PackageInfo packageInfo;
        int i;
        ApplicationInfo applicationInfo = this.c.f1779c.getApplicationInfo();
        try {
            packageInfo = this.c.f1779c.getPackageManager().getPackageInfo(applicationInfo.packageName, 0);
        } catch (NameNotFoundException e) {
            packageInfo = null;
        }
        DisplayMetrics displayMetrics = this.c.f1779c.getResources().getDisplayMetrics();
        Bundle bundle2 = null;
        if (!(this.c.f1782f == null || this.c.f1782f.getParent() == null)) {
            int[] iArr = new int[2];
            this.c.f1782f.getLocationOnScreen(iArr);
            int i2 = iArr[0];
            int i3 = iArr[1];
            int width = this.c.f1782f.getWidth();
            int height = this.c.f1782f.getHeight();
            i = 0;
            if (this.c.f1782f.isShown() && i2 + width > 0 && i3 + height > 0 && i2 <= displayMetrics.widthPixels && i3 <= displayMetrics.heightPixels) {
                i = 1;
            }
            bundle2 = new Bundle(5);
            bundle2.putInt("x", i2);
            bundle2.putInt("y", i3);
            bundle2.putInt("width", width);
            bundle2.putInt("height", height);
            bundle2.putInt("visible", i);
        }
        String c = C0618p.m2799h().m4786c();
        this.c.f1788l = new ge(c, this.c.f1778b);
        this.c.f1788l.m4762a(adRequestParcel);
        String a = C0618p.m2796e().m4839a(this.c.f1779c, this.c.f1782f, this.c.f1785i);
        int c2 = C0581m.m2611a(this.c.f1779c).m2618c();
        boolean a2 = C0581m.m2611a(this.c.f1779c).m2615a();
        long j = 0;
        if (this.c.f1792p != null) {
            try {
                j = this.c.f1792p.mo393b();
            } catch (RemoteException e2) {
                C0691b.m3103e("Cannot get correlation id, default to 0.");
            }
        }
        String uuid = UUID.randomUUID().toString();
        Bundle a3 = C0618p.m2799h().m4770a(this.c.f1779c, this, c);
        List arrayList = new ArrayList();
        for (i = 0; i < this.c.f1798v.size(); i++) {
            arrayList.add(this.c.f1798v.m5242b(i));
        }
        boolean z = this.c.f1793q != null;
        boolean z2 = this.c.f1794r != null && C0618p.m2799h().m4795l();
        return new C0638a(bundle2, adRequestParcel, this.c.f1785i, this.c.f1778b, applicationInfo, packageInfo, c, C0618p.m2799h().m4772a(), this.c.f1781e, a3, this.c.f1801y, arrayList, bundle, C0618p.m2799h().m4790g(), this.f1320i, displayMetrics.widthPixels, displayMetrics.heightPixels, displayMetrics.density, a, a2, c2, j, uuid, az.m3894a(), this.c.f1777a, this.c.f1799w, new CapabilityParcel(z, z2));
    }

    public void mo346a(eo eoVar) {
        C1305x.m6624b("setInAppPurchaseListener must be called on the main UI thread.");
        this.c.f1793q = eoVar;
    }

    public void mo347a(es esVar, String str) {
        C1305x.m6624b("setPlayStorePurchaseParams must be called on the main UI thread.");
        this.c.f1802z = new C0634k(str);
        this.c.f1794r = esVar;
        if (!C0618p.m2799h().m4789f() && esVar != null) {
            new C0622c(this.c.f1779c, this.c.f1794r, this.c.f1802z).m2829g();
        }
    }

    protected void m2244a(gd gdVar, boolean z) {
        if (gdVar == null) {
            C0691b.m3103e("Ad state was null when trying to ping impression URLs.");
            return;
        }
        super.m2219c(gdVar);
        if (!(gdVar.f3280o == null || gdVar.f3280o.f2728d == null)) {
            C0618p.m2808q().m4222a(this.c.f1779c, this.c.f1781e.f1976b, gdVar, this.c.f1778b, z, C0618p.m2796e().m4848a(this.c.f1779c, gdVar.f3280o.f2728d, gdVar.f3289x));
        }
        if (gdVar.f3277l != null && gdVar.f3277l.f2714g != null) {
            C0618p.m2808q().m4222a(this.c.f1779c, this.c.f1781e.f1976b, gdVar, this.c.f1778b, z, C0618p.m2796e().m4848a(this.c.f1779c, gdVar.f3277l.f2714g, gdVar.f3289x));
        }
    }

    public void mo363a(String str, ArrayList<String> arrayList) {
        en c0624d = new C0624d(str, arrayList, this.c.f1779c, this.c.f1781e.f1976b);
        if (this.c.f1793q == null) {
            C0691b.m3103e("InAppPurchaseListener is not set. Try to launch default purchase flow.");
            if (!C0526n.m2400a().m3089b(this.c.f1779c)) {
                C0691b.m3103e("Google Play Service unavailable, cannot launch default purchase flow.");
                return;
            } else if (this.c.f1794r == null) {
                C0691b.m3103e("PlayStorePurchaseListener is not set.");
                return;
            } else if (this.c.f1802z == null) {
                C0691b.m3103e("PlayStorePurchaseVerifier is not initialized.");
                return;
            } else if (this.c.f1771D) {
                C0691b.m3103e("An in-app purchase request is already in progress, abort");
                return;
            } else {
                this.c.f1771D = true;
                try {
                    if (this.c.f1794r.mo720a(str)) {
                        C0618p.m2806o().m2883a(this.c.f1779c, this.c.f1781e.f1979e, new GInAppPurchaseManagerInfoParcel(this.c.f1779c, this.c.f1802z, c0624d, this));
                        return;
                    } else {
                        this.c.f1771D = false;
                        return;
                    }
                } catch (RemoteException e) {
                    C0691b.m3103e("Could not start In-App purchase.");
                    this.c.f1771D = false;
                    return;
                }
            }
        }
        try {
            this.c.f1793q.mo717a(c0624d);
        } catch (RemoteException e2) {
            C0691b.m3103e("Could not start In-App purchase.");
        }
    }

    public void mo364a(String str, boolean z, int i, final Intent intent, C0627f c0627f) {
        try {
            if (this.c.f1794r != null) {
                this.c.f1794r.mo719a(new C0629g(this.c.f1779c, str, z, i, intent, c0627f));
            }
        } catch (RemoteException e) {
            C0691b.m3103e("Fail to invoke PlayStorePurchaseListener.");
        }
        go.f3361a.postDelayed(new Runnable(this) {
            final /* synthetic */ C0499b f1317b;

            public void run() {
                int a = C0618p.m2806o().m2879a(intent);
                C0618p.m2806o();
                if (!(a != 0 || this.f1317b.c.f1786j == null || this.f1317b.c.f1786j.f3267b == null || this.f1317b.c.f1786j.f3267b.mo782f() == null)) {
                    this.f1317b.c.f1786j.f3267b.mo782f().m2711a();
                }
                this.f1317b.c.f1771D = false;
            }
        }, 500);
    }

    public boolean mo365a(AdRequestParcel adRequestParcel, bf bfVar) {
        if (!mo373s()) {
            return false;
        }
        Bundle a = m2194a(C0618p.m2799h().m4771a(this.c.f1779c));
        this.b.m2646a();
        this.c.f1770C = 0;
        C0638a a2 = m2241a(adRequestParcel, a);
        bfVar.m3919a("seq_num", a2.f1811g);
        if (a2.f1828x != null) {
            bfVar.m3919a("request_id", a2.f1828x);
        }
        if (a2.f1810f != null) {
            bfVar.m3919a("app_version", String.valueOf(a2.f1810f.versionCode));
        }
        this.c.f1783g = C0618p.m2791a().m2910a(this.c.f1779c, a2, this.c.f1780d, this);
        return true;
    }

    protected boolean mo443a(AdRequestParcel adRequestParcel, gd gdVar, boolean z) {
        if (!z && this.c.m2901e()) {
            if (gdVar.f3273h > 0) {
                this.b.m2648a(adRequestParcel, gdVar.f3273h);
            } else if (gdVar.f3280o != null && gdVar.f3280o.f2731g > 0) {
                this.b.m2648a(adRequestParcel, gdVar.f3280o.f2731g);
            } else if (!gdVar.f3276k && gdVar.f3269d == 2) {
                this.b.m2647a(adRequestParcel);
            }
        }
        return this.b.m2651d();
    }

    boolean mo366a(gd gdVar) {
        AdRequestParcel adRequestParcel;
        boolean z = false;
        if (this.d != null) {
            adRequestParcel = this.d;
            this.d = null;
        } else {
            adRequestParcel = gdVar.f3266a;
            if (adRequestParcel.f1332c != null) {
                z = adRequestParcel.f1332c.getBoolean("_noRefresh", false);
            }
        }
        return mo443a(adRequestParcel, gdVar, z);
    }

    protected boolean mo367a(gd gdVar, gd gdVar2) {
        int i;
        int i2 = 0;
        if (!(gdVar == null || gdVar.f3281p == null)) {
            gdVar.f3281p.m4200a(null);
        }
        if (gdVar2.f3281p != null) {
            gdVar2.f3281p.m4200a((dc) this);
        }
        if (gdVar2.f3280o != null) {
            i = gdVar2.f3280o.f2734j;
            i2 = gdVar2.f3280o.f2735k;
        } else {
            i = 0;
        }
        this.c.f1768A.m4804a(i, i2);
        return true;
    }

    public void mo354b(gd gdVar) {
        super.mo354b(gdVar);
        if (gdVar.f3269d == 3 && gdVar.f3280o != null && gdVar.f3280o.f2729e != null) {
            C0691b.m3093a("Pinging no fill URLs.");
            C0618p.m2808q().m4222a(this.c.f1779c, this.c.f1781e.f1976b, gdVar, this.c.f1778b, false, gdVar.f3280o.f2729e);
        }
    }

    protected boolean mo368b(AdRequestParcel adRequestParcel) {
        return super.mo368b(adRequestParcel) && !this.f1319h;
    }

    public void b_() {
        this.e.m5916b(this.c.f1786j);
        this.f1319h = false;
        m2230o();
        this.c.f1788l.m4767c();
    }

    public void c_() {
        this.f1319h = true;
        m2231p();
    }

    public void mo356d() {
        C1305x.m6624b("pause must be called on the main UI thread.");
        if (!(this.c.f1786j == null || this.c.f1786j.f3267b == null || !this.c.m2901e())) {
            C0618p.m2798g().mo745a(this.c.f1786j.f3267b.getWebView());
        }
        if (!(this.c.f1786j == null || this.c.f1786j.f3278m == null)) {
            try {
                this.c.f1786j.f3278m.mo654d();
            } catch (RemoteException e) {
                C0691b.m3103e("Could not pause mediation adapter.");
            }
        }
        this.e.m5918d(this.c.f1786j);
        this.b.m2649b();
    }

    public void mo327e() {
        if (this.c.f1786j == null) {
            C0691b.m3103e("Ad state was null when trying to ping click URLs.");
            return;
        }
        if (!(this.c.f1786j.f3280o == null || this.c.f1786j.f3280o.f2727c == null)) {
            C0618p.m2808q().m4222a(this.c.f1779c, this.c.f1781e.f1976b, this.c.f1786j, this.c.f1778b, false, C0618p.m2796e().m4848a(this.c.f1779c, this.c.f1786j.f3280o.f2727c, this.c.f1786j.f3289x));
        }
        if (!(this.c.f1786j.f3277l == null || this.c.f1786j.f3277l.f2713f == null)) {
            C0618p.m2808q().m4222a(this.c.f1779c, this.c.f1781e.f1976b, this.c.f1786j, this.c.f1778b, false, C0618p.m2796e().m4848a(this.c.f1779c, this.c.f1786j.f3277l.f2713f, this.c.f1786j.f3289x));
        }
        super.mo327e();
    }

    public void mo357f() {
        C1305x.m6624b("resume must be called on the main UI thread.");
        if (!(this.c.f1786j == null || this.c.f1786j.f3267b == null || !this.c.m2901e())) {
            C0618p.m2798g().mo747b(this.c.f1786j.f3267b.getWebView());
        }
        if (!(this.c.f1786j == null || this.c.f1786j.f3278m == null)) {
            try {
                this.c.f1786j.f3278m.mo655e();
            } catch (RemoteException e) {
                C0691b.m3103e("Could not resume mediation adapter.");
            }
        }
        this.b.m2650c();
        this.e.m5919e(this.c.f1786j);
    }

    public void mo371g() {
        throw new IllegalStateException("showInterstitial is not supported for current ad type");
    }

    public String mo372k() {
        return this.c.f1786j == null ? null : this.c.f1786j.f3279n;
    }

    protected boolean mo373s() {
        return C0618p.m2796e().m4864a(this.c.f1779c.getPackageManager(), this.c.f1779c.getPackageName(), "android.permission.INTERNET") && C0618p.m2796e().m4863a(this.c.f1779c);
    }

    public void mo374t() {
        mo327e();
    }

    public void mo375u() {
        b_();
    }

    public void mo376v() {
        mo362m();
    }

    public void mo377w() {
        c_();
    }

    public void mo378x() {
        if (this.c.f1786j != null) {
            C0691b.m3103e("Mediation adapter " + this.c.f1786j.f3279n + " refreshed, but mediation adapters should never refresh.");
        }
        m2244a(this.c.f1786j, true);
        mo445q();
    }
}
