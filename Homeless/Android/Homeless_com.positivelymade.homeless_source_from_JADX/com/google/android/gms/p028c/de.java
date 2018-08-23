package com.google.android.gms.p028c;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.p028c.df.C0898a;
import com.google.android.gms.p029b.C0802b;
import java.util.List;

@fn
public final class de implements C0898a {
    private final String f2741a;
    private final di f2742b;
    private final long f2743c;
    private final cz f2744d;
    private final AdRequestParcel f2745e;
    private final AdSizeParcel f2746f;
    private final Context f2747g;
    private final Object f2748h = new Object();
    private final VersionInfoParcel f2749i;
    private final boolean f2750j;
    private final NativeAdOptionsParcel f2751k;
    private final List<String> f2752l;
    private dj f2753m;
    private int f2754n = -2;

    public de(Context context, String str, di diVar, db dbVar, cz czVar, AdRequestParcel adRequestParcel, AdSizeParcel adSizeParcel, VersionInfoParcel versionInfoParcel, boolean z, NativeAdOptionsParcel nativeAdOptionsParcel, List<String> list) {
        this.f2747g = context;
        this.f2742b = diVar;
        this.f2744d = czVar;
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            this.f2741a = m4213b();
        } else {
            this.f2741a = str;
        }
        this.f2743c = dbVar.f2726b != -1 ? dbVar.f2726b : 10000;
        this.f2745e = adRequestParcel;
        this.f2746f = adSizeParcel;
        this.f2749i = versionInfoParcel;
        this.f2750j = z;
        this.f2751k = nativeAdOptionsParcel;
        this.f2752l = list;
    }

    private void m4209a(long j, long j2, long j3, long j4) {
        while (this.f2754n == -2) {
            m4214b(j, j2, j3, j4);
        }
    }

    private void m4210a(dd ddVar) {
        if ("com.google.ads.mediation.AdUrlAdapter".equals(this.f2741a)) {
            Bundle bundle = this.f2745e.f1342m.getBundle(this.f2741a);
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString("sdk_less_network_id", this.f2744d.f2709b);
            this.f2745e.f1342m.putBundle(this.f2741a, bundle);
        }
        try {
            if (this.f2749i.f1978d < 4100000) {
                if (this.f2746f.f1351e) {
                    this.f2753m.mo647a(C0802b.m3754a(this.f2747g), this.f2745e, this.f2744d.f2715h, ddVar);
                } else {
                    this.f2753m.mo650a(C0802b.m3754a(this.f2747g), this.f2746f, this.f2745e, this.f2744d.f2715h, (dk) ddVar);
                }
            } else if (this.f2750j) {
                this.f2753m.mo649a(C0802b.m3754a(this.f2747g), this.f2745e, this.f2744d.f2715h, this.f2744d.f2708a, ddVar, this.f2751k, this.f2752l);
            } else if (this.f2746f.f1351e) {
                this.f2753m.mo648a(C0802b.m3754a(this.f2747g), this.f2745e, this.f2744d.f2715h, this.f2744d.f2708a, (dk) ddVar);
            } else {
                this.f2753m.mo651a(C0802b.m3754a(this.f2747g), this.f2746f, this.f2745e, this.f2744d.f2715h, this.f2744d.f2708a, ddVar);
            }
        } catch (Throwable e) {
            C0691b.m3102d("Could not request ad from mediation adapter.", e);
            mo641a(5);
        }
    }

    private String m4213b() {
        try {
            if (!TextUtils.isEmpty(this.f2744d.f2712e)) {
                return this.f2742b.mo643b(this.f2744d.f2712e) ? "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter" : "com.google.ads.mediation.customevent.CustomEventAdapter";
            }
        } catch (RemoteException e) {
            C0691b.m3103e("Fail to determine the custom event's version, assuming the old one.");
        }
        return "com.google.ads.mediation.customevent.CustomEventAdapter";
    }

    private void m4214b(long j, long j2, long j3, long j4) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j5 = j2 - (elapsedRealtime - j);
        elapsedRealtime = j4 - (elapsedRealtime - j3);
        if (j5 <= 0 || elapsedRealtime <= 0) {
            C0691b.m3099c("Timed out waiting for adapter.");
            this.f2754n = 3;
            return;
        }
        try {
            this.f2748h.wait(Math.min(j5, elapsedRealtime));
        } catch (InterruptedException e) {
            this.f2754n = -1;
        }
    }

    private dj m4215c() {
        C0691b.m3099c("Instantiating mediation adapter: " + this.f2741a);
        try {
            return this.f2742b.mo642a(this.f2741a);
        } catch (Throwable e) {
            C0691b.m3094a("Could not instantiate mediation adapter: " + this.f2741a, e);
            return null;
        }
    }

    public df m4218a(long j, long j2) {
        df dfVar;
        synchronized (this.f2748h) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            final dd ddVar = new dd();
            go.f3361a.post(new Runnable(this) {
                final /* synthetic */ de f2740b;

                public void run() {
                    synchronized (this.f2740b.f2748h) {
                        if (this.f2740b.f2754n != -2) {
                            return;
                        }
                        this.f2740b.f2753m = this.f2740b.m4215c();
                        if (this.f2740b.f2753m == null) {
                            this.f2740b.mo641a(4);
                            return;
                        }
                        ddVar.m4201a(this.f2740b);
                        this.f2740b.m4210a(ddVar);
                    }
                }
            });
            m4209a(elapsedRealtime, this.f2743c, j, j2);
            dfVar = new df(this.f2744d, this.f2753m, this.f2741a, ddVar, this.f2754n);
        }
        return dfVar;
    }

    public void m4219a() {
        synchronized (this.f2748h) {
            try {
                if (this.f2753m != null) {
                    this.f2753m.mo653c();
                }
            } catch (Throwable e) {
                C0691b.m3102d("Could not destroy mediation adapter.", e);
            }
            this.f2754n = -1;
            this.f2748h.notify();
        }
    }

    public void mo641a(int i) {
        synchronized (this.f2748h) {
            this.f2754n = i;
            this.f2748h.notify();
        }
    }
}
