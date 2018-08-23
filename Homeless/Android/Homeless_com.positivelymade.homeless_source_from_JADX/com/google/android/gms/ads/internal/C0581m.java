package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.internal.client.C0547y.C0548a;
import com.google.android.gms.ads.internal.client.MobileAdsSettingsParcel;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.ads.purchase.InAppPurchaseActivity;
import com.google.android.gms.analytics.C0710e;
import com.google.android.gms.p028c.fn;
import com.google.android.gms.p028c.jo;
import com.google.android.gms.p028c.jo.C0579a;
import com.google.android.gms.p028c.jv;
import com.google.android.gms.p028c.ki;
import com.google.android.gms.p028c.ki.C1104a;
import com.google.android.gms.p028c.kj;
import com.google.android.gms.p028c.kj.C0580a;
import java.util.regex.Pattern;

@fn
public class C0581m extends C0548a implements C0579a, C0580a {
    private static final Object f1560e = new Object();
    private static C0581m f1561f;
    ki f1562a;
    String f1563b;
    String f1564c;
    private final Context f1565d;
    private boolean f1566g = false;
    private boolean f1567h;

    C0581m(Context context) {
        this.f1565d = context;
    }

    public static C0581m m2611a(Context context) {
        C0581m c0581m;
        synchronized (f1560e) {
            if (f1561f == null) {
                f1561f = new C0581m(context.getApplicationContext());
            }
            c0581m = f1561f;
        }
        return c0581m;
    }

    public void mo446a(jv jvVar) {
    }

    public void mo447a(jv jvVar, Activity activity) {
        if (jvVar != null && activity != null) {
            if (activity instanceof AdActivity) {
                int e = C0618p.m2796e().m4883e(activity);
                if (e == 1) {
                    jvVar.m5471b(true);
                    jvVar.m5466a("Interstitial Ad");
                } else if (e == 2 || e == 3) {
                    jvVar.m5466a("Expanded Ad");
                } else {
                    jvVar.m5466a(null);
                }
            } else if (activity instanceof InAppPurchaseActivity) {
                jvVar.m5466a(null);
            }
        }
    }

    public void mo448a(String str, MobileAdsSettingsParcel mobileAdsSettingsParcel) {
        synchronized (f1560e) {
            if (this.f1566g) {
                C0691b.m3103e("Mobile ads is initialized already.");
            } else if (this.f1565d == null) {
                C0691b.m3103e("Fail to initialize mobile ads because context is null.");
            } else if (TextUtils.isEmpty(str)) {
                C0691b.m3103e("Fail to initialize mobile ads because ApplicationCode is empty.");
            } else {
                this.f1566g = true;
                m2617b(str, mobileAdsSettingsParcel);
            }
        }
    }

    public boolean m2615a() {
        boolean z;
        synchronized (f1560e) {
            z = this.f1567h;
        }
        return z;
    }

    public void mo449b() {
        this.f1562a = kj.m5536a(this.f1565d).m5539a();
    }

    void m2617b(String str, MobileAdsSettingsParcel mobileAdsSettingsParcel) {
        if (mobileAdsSettingsParcel != null && mobileAdsSettingsParcel.f1357b) {
            if (!C0618p.m2796e().m4864a(this.f1565d.getPackageManager(), this.f1565d.getPackageName(), "android.permission.INTERNET")) {
                C0691b.m3097b("Missing permission android.permission.INTERNET");
            } else if (!C0618p.m2796e().m4864a(this.f1565d.getPackageManager(), this.f1565d.getPackageName(), "android.permission.ACCESS_NETWORK_STATE")) {
                C0691b.m3097b("Missing permission android.permission.ACCESS_NETWORK_STATE");
            } else if (Pattern.matches("ca-app-[a-z0-9_-]+~[a-z0-9_-]+", str)) {
                this.f1567h = true;
                this.f1563b = str;
                this.f1564c = mobileAdsSettingsParcel.f1358c;
                kj a = kj.m5536a(this.f1565d);
                C1104a c1104a = new C1104a(this.f1563b);
                if (!TextUtils.isEmpty(this.f1564c)) {
                    c1104a.m5523a(this.f1564c);
                }
                a.m5540a(c1104a.m5525a());
                a.m5541a((C0580a) this);
                jo.m5384a(this.f1565d).m5387a((C0579a) this);
                a.m5542b();
            } else {
                throw new IllegalArgumentException("Please provide a valid application code");
            }
        }
    }

    public int m2618c() {
        int i = -1;
        synchronized (f1560e) {
            if (this.f1567h) {
                jv a = jo.m5384a(this.f1565d).m5386a();
                if (a != null) {
                    i = a.m5472c();
                }
            }
        }
        return i;
    }

    public String m2619d() {
        String h;
        synchronized (f1560e) {
            if (this.f1567h) {
                h = C0710e.m3165a(this.f1565d).m3177h();
            } else {
                h = null;
            }
        }
        return h;
    }
}
