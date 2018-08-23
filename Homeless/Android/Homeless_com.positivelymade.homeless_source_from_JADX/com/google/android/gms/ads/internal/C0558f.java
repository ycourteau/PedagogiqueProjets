package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.C0526n;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.p028c.di;
import com.google.android.gms.p028c.fn;
import com.google.android.gms.p028c.gd;
import com.google.android.gms.p028c.hg;
import com.google.android.gms.p028c.hh.C0556b;
import com.google.android.gms.p029b.C0799a;
import com.google.android.gms.p029b.C0802b;
import java.util.List;

@fn
public class C0558f extends C0505c {
    private boolean f1471i;

    public C0558f(Context context, AdSizeParcel adSizeParcel, String str, di diVar, VersionInfoParcel versionInfoParcel) {
        super(context, adSizeParcel, str, diVar, versionInfoParcel, null);
    }

    private boolean m2479b(gd gdVar, gd gdVar2) {
        View view;
        if (gdVar2.f3276k) {
            try {
                C0799a a = gdVar2.f3278m.mo644a();
                if (a == null) {
                    C0691b.m3103e("View in mediation adapter is null.");
                    return false;
                }
                view = (View) C0802b.m3755a(a);
                View nextView = this.c.f1782f.getNextView();
                if (nextView != null) {
                    if (nextView instanceof hg) {
                        ((hg) nextView).destroy();
                    }
                    this.c.f1782f.removeView(nextView);
                }
                try {
                    m2196a(view);
                } catch (Throwable th) {
                    C0691b.m3102d("Could not add mediation view to view hierarchy.", th);
                    return false;
                }
            } catch (Throwable th2) {
                C0691b.m3102d("Could not get View from mediation adapter.", th2);
                return false;
            }
        } else if (!(gdVar2.f3283r == null || gdVar2.f3267b == null)) {
            gdVar2.f3267b.mo763a(gdVar2.f3283r);
            this.c.f1782f.removeAllViews();
            this.c.f1782f.setMinimumWidth(gdVar2.f3283r.f1353g);
            this.c.f1782f.setMinimumHeight(gdVar2.f3283r.f1350d);
            m2196a(gdVar2.f3267b.getWebView());
        }
        if (this.c.f1782f.getChildCount() > 1) {
            this.c.f1782f.showNext();
        }
        if (gdVar != null) {
            view = this.c.f1782f.getNextView();
            if (view instanceof hg) {
                ((hg) view).mo762a(this.c.f1779c, this.c.f1785i);
            } else if (view != null) {
                this.c.f1782f.removeView(view);
            }
            this.c.m2900d();
        }
        this.c.f1782f.setVisibility(0);
        return true;
    }

    public void mo351a(boolean z) {
        C1305x.m6624b("setManualImpressionsEnabled must be called from the main thread.");
        this.f1471i = z;
    }

    public boolean mo352a(AdRequestParcel adRequestParcel) {
        return super.mo352a(m2483d(adRequestParcel));
    }

    public boolean mo367a(gd gdVar, final gd gdVar2) {
        if (!super.mo367a(gdVar, gdVar2)) {
            return false;
        }
        if (!this.c.m2901e() || m2479b(gdVar, gdVar2)) {
            m2244a(gdVar2, false);
            if (this.c.m2901e()) {
                if (gdVar2.f3267b != null) {
                    if (gdVar2.f3275j != null) {
                        this.e.m5912a(this.c.f1785i, gdVar2);
                    }
                    if (gdVar2.m4755a()) {
                        this.e.m5912a(this.c.f1785i, gdVar2).m5939a(gdVar2.f3267b);
                    } else {
                        gdVar2.f3267b.mo788i().m5043a(new C0556b(this) {
                            final /* synthetic */ C0558f f1470b;

                            public void mo408a() {
                                this.f1470b.e.m5912a(this.f1470b.c.f1785i, gdVar2).m5939a(gdVar2.f3267b);
                            }
                        });
                    }
                }
            } else if (!(this.c.f1769B == null || gdVar2.f3275j == null)) {
                this.e.m5913a(this.c.f1785i, gdVar2, this.c.f1769B);
            }
            return true;
        }
        m2210a(0);
        return false;
    }

    AdRequestParcel m2483d(AdRequestParcel adRequestParcel) {
        if (adRequestParcel.f1337h == this.f1471i) {
            return adRequestParcel;
        }
        int i = adRequestParcel.f1330a;
        long j = adRequestParcel.f1331b;
        Bundle bundle = adRequestParcel.f1332c;
        int i2 = adRequestParcel.f1333d;
        List list = adRequestParcel.f1334e;
        boolean z = adRequestParcel.f1335f;
        int i3 = adRequestParcel.f1336g;
        boolean z2 = adRequestParcel.f1337h || this.f1471i;
        return new AdRequestParcel(i, j, bundle, i2, list, z, i3, z2, adRequestParcel.f1338i, adRequestParcel.f1339j, adRequestParcel.f1340k, adRequestParcel.f1341l, adRequestParcel.f1342m, adRequestParcel.f1343n, adRequestParcel.f1344o, adRequestParcel.f1345p, adRequestParcel.f1346q);
    }

    public void mo371g() {
        throw new IllegalStateException("Interstitial is NOT supported by BannerAdManager.");
    }

    protected boolean mo373s() {
        boolean z = true;
        if (!C0618p.m2796e().m4864a(this.c.f1779c.getPackageManager(), this.c.f1779c.getPackageName(), "android.permission.INTERNET")) {
            C0526n.m2400a().m3084a(this.c.f1782f, this.c.f1785i, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
            z = false;
        }
        if (!C0618p.m2796e().m4863a(this.c.f1779c)) {
            C0526n.m2400a().m3084a(this.c.f1782f, this.c.f1785i, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
            z = false;
        }
        if (!(z || this.c.f1782f == null)) {
            this.c.f1782f.setVisibility(0);
        }
        return z;
    }
}
