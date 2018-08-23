package com.google.android.gms.p028c;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.C0489f;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.C0685a;
import com.google.android.gms.ads.internal.reward.mediation.client.C0688b;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.ads.p017d.C0422g;
import com.google.android.gms.ads.p017d.C0423h;
import com.google.android.gms.ads.p017d.C0425i;
import com.google.android.gms.ads.p017d.C0434b;
import com.google.android.gms.ads.p017d.C0435c;
import com.google.android.gms.ads.p017d.C0436e;
import com.google.android.gms.ads.p017d.C0437k;
import com.google.android.gms.ads.p025e.p026a.C0484a;
import com.google.android.gms.p028c.dj.C0902a;
import com.google.android.gms.p029b.C0799a;
import com.google.android.gms.p029b.C0802b;
import com.google.p016a.p018a.p020a.C0439a;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

@fn
public final class C0908do extends C0902a {
    private final C0434b f2772a;
    private dp f2773b;

    public C0908do(C0434b c0434b) {
        this.f2772a = c0434b;
    }

    private Bundle m4331a(String str, int i, String str2) {
        C0691b.m3103e("Server parameters: " + str);
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str3 = (String) keys.next();
                    bundle2.putString(str3, jSONObject.getString(str3));
                }
                bundle = bundle2;
            }
            if (this.f2772a instanceof C0439a) {
                bundle.putString("adJson", str2);
                bundle.putInt("tagForChildDirectedTreatment", i);
            }
            return bundle;
        } catch (Throwable th) {
            C0691b.m3102d("Could not get Server Parameters Bundle.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public C0799a mo644a() {
        if (this.f2772a instanceof C0435c) {
            try {
                return C0802b.m3754a(((C0435c) this.f2772a).mo336d());
            } catch (Throwable th) {
                C0691b.m3102d("Could not get banner view from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            C0691b.m3103e("MediationAdapter is not a MediationBannerAdapter: " + this.f2772a.getClass().getCanonicalName());
            throw new RemoteException();
        }
    }

    public void mo645a(AdRequestParcel adRequestParcel, String str) {
        if (this.f2772a instanceof C0484a) {
            C0691b.m3093a("Requesting rewarded video ad from adapter.");
            try {
                C0484a c0484a = (C0484a) this.f2772a;
                c0484a.m2142a(new dn(adRequestParcel.f1331b == -1 ? null : new Date(adRequestParcel.f1331b), adRequestParcel.f1333d, adRequestParcel.f1334e != null ? new HashSet(adRequestParcel.f1334e) : null, adRequestParcel.f1340k, adRequestParcel.f1335f, adRequestParcel.f1336g), m4331a(str, adRequestParcel.f1336g, null), adRequestParcel.f1342m != null ? adRequestParcel.f1342m.getBundle(c0484a.getClass().getName()) : null);
            } catch (Throwable th) {
                C0691b.m3102d("Could not load rewarded video ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            C0691b.m3103e("MediationAdapter is not a MediationRewardedVideoAdAdapter: " + this.f2772a.getClass().getCanonicalName());
            throw new RemoteException();
        }
    }

    public void mo646a(C0799a c0799a, AdRequestParcel adRequestParcel, String str, C0685a c0685a, String str2) {
        if (this.f2772a instanceof C0484a) {
            C0691b.m3093a("Initialize rewarded video adapter.");
            try {
                C0484a c0484a = (C0484a) this.f2772a;
                c0484a.m2141a((Context) C0802b.m3755a(c0799a), new dn(adRequestParcel.f1331b == -1 ? null : new Date(adRequestParcel.f1331b), adRequestParcel.f1333d, adRequestParcel.f1334e != null ? new HashSet(adRequestParcel.f1334e) : null, adRequestParcel.f1340k, adRequestParcel.f1335f, adRequestParcel.f1336g), str, new C0688b(c0685a), m4331a(str2, adRequestParcel.f1336g, null), adRequestParcel.f1342m != null ? adRequestParcel.f1342m.getBundle(c0484a.getClass().getName()) : null);
            } catch (Throwable th) {
                C0691b.m3102d("Could not initialize rewarded video adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            C0691b.m3103e("MediationAdapter is not a MediationRewardedVideoAdAdapter: " + this.f2772a.getClass().getCanonicalName());
            throw new RemoteException();
        }
    }

    public void mo647a(C0799a c0799a, AdRequestParcel adRequestParcel, String str, dk dkVar) {
        mo648a(c0799a, adRequestParcel, str, null, dkVar);
    }

    public void mo648a(C0799a c0799a, AdRequestParcel adRequestParcel, String str, String str2, dk dkVar) {
        if (this.f2772a instanceof C0436e) {
            C0691b.m3093a("Requesting interstitial ad from adapter.");
            try {
                C0436e c0436e = (C0436e) this.f2772a;
                c0436e.mo332a((Context) C0802b.m3755a(c0799a), new dp(dkVar), m4331a(str, adRequestParcel.f1336g, str2), new dn(adRequestParcel.f1331b == -1 ? null : new Date(adRequestParcel.f1331b), adRequestParcel.f1333d, adRequestParcel.f1334e != null ? new HashSet(adRequestParcel.f1334e) : null, adRequestParcel.f1340k, adRequestParcel.f1335f, adRequestParcel.f1336g), adRequestParcel.f1342m != null ? adRequestParcel.f1342m.getBundle(c0436e.getClass().getName()) : null);
            } catch (Throwable th) {
                C0691b.m3102d("Could not request interstitial ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            C0691b.m3103e("MediationAdapter is not a MediationInterstitialAdapter: " + this.f2772a.getClass().getCanonicalName());
            throw new RemoteException();
        }
    }

    public void mo649a(C0799a c0799a, AdRequestParcel adRequestParcel, String str, String str2, dk dkVar, NativeAdOptionsParcel nativeAdOptionsParcel, List<String> list) {
        if (this.f2772a instanceof C0437k) {
            try {
                C0437k c0437k = (C0437k) this.f2772a;
                ds dsVar = new ds(adRequestParcel.f1331b == -1 ? null : new Date(adRequestParcel.f1331b), adRequestParcel.f1333d, adRequestParcel.f1334e != null ? new HashSet(adRequestParcel.f1334e) : null, adRequestParcel.f1340k, adRequestParcel.f1335f, adRequestParcel.f1336g, nativeAdOptionsParcel, list);
                Bundle bundle = adRequestParcel.f1342m != null ? adRequestParcel.f1342m.getBundle(c0437k.getClass().getName()) : null;
                this.f2773b = new dp(dkVar);
                c0437k.mo333a((Context) C0802b.m3755a(c0799a), this.f2773b, m4331a(str, adRequestParcel.f1336g, str2), dsVar, bundle);
            } catch (Throwable th) {
                C0691b.m3102d("Could not request interstitial ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            C0691b.m3103e("MediationAdapter is not a MediationNativeAdapter: " + this.f2772a.getClass().getCanonicalName());
            throw new RemoteException();
        }
    }

    public void mo650a(C0799a c0799a, AdSizeParcel adSizeParcel, AdRequestParcel adRequestParcel, String str, dk dkVar) {
        mo651a(c0799a, adSizeParcel, adRequestParcel, str, null, dkVar);
    }

    public void mo651a(C0799a c0799a, AdSizeParcel adSizeParcel, AdRequestParcel adRequestParcel, String str, String str2, dk dkVar) {
        if (this.f2772a instanceof C0435c) {
            C0691b.m3093a("Requesting banner ad from adapter.");
            try {
                C0435c c0435c = (C0435c) this.f2772a;
                c0435c.mo331a((Context) C0802b.m3755a(c0799a), new dp(dkVar), m4331a(str, adRequestParcel.f1336g, str2), C0489f.m2164a(adSizeParcel.f1352f, adSizeParcel.f1349c, adSizeParcel.f1348b), new dn(adRequestParcel.f1331b == -1 ? null : new Date(adRequestParcel.f1331b), adRequestParcel.f1333d, adRequestParcel.f1334e != null ? new HashSet(adRequestParcel.f1334e) : null, adRequestParcel.f1340k, adRequestParcel.f1335f, adRequestParcel.f1336g), adRequestParcel.f1342m != null ? adRequestParcel.f1342m.getBundle(c0435c.getClass().getName()) : null);
            } catch (Throwable th) {
                C0691b.m3102d("Could not request banner ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            C0691b.m3103e("MediationAdapter is not a MediationBannerAdapter: " + this.f2772a.getClass().getCanonicalName());
            throw new RemoteException();
        }
    }

    public void mo652b() {
        if (this.f2772a instanceof C0436e) {
            C0691b.m3093a("Showing interstitial from adapter.");
            try {
                ((C0436e) this.f2772a).mo337e();
            } catch (Throwable th) {
                C0691b.m3102d("Could not show interstitial from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            C0691b.m3103e("MediationAdapter is not a MediationInterstitialAdapter: " + this.f2772a.getClass().getCanonicalName());
            throw new RemoteException();
        }
    }

    public void mo653c() {
        try {
            this.f2772a.mo330a();
        } catch (Throwable th) {
            C0691b.m3102d("Could not destroy adapter.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public void mo654d() {
        try {
            this.f2772a.mo334b();
        } catch (Throwable th) {
            C0691b.m3102d("Could not pause adapter.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public void mo655e() {
        try {
            this.f2772a.mo335c();
        } catch (Throwable th) {
            C0691b.m3102d("Could not resume adapter.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public void mo656f() {
        if (this.f2772a instanceof C0484a) {
            C0691b.m3093a("Show rewarded video ad from adapter.");
            try {
                ((C0484a) this.f2772a).m2143d();
            } catch (Throwable th) {
                C0691b.m3102d("Could not show rewarded video ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            C0691b.m3103e("MediationAdapter is not a MediationRewardedVideoAdAdapter: " + this.f2772a.getClass().getCanonicalName());
            throw new RemoteException();
        }
    }

    public boolean mo657g() {
        if (this.f2772a instanceof C0484a) {
            C0691b.m3093a("Check if adapter is initialized.");
            try {
                return ((C0484a) this.f2772a).m2144e();
            } catch (Throwable th) {
                C0691b.m3102d("Could not check if adapter is initialized.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            C0691b.m3103e("MediationAdapter is not a MediationRewardedVideoAdAdapter: " + this.f2772a.getClass().getCanonicalName());
            throw new RemoteException();
        }
    }

    public dl mo658h() {
        C0422g a = this.f2773b.m4348a();
        return a instanceof C0423h ? new dq((C0423h) a) : null;
    }

    public dm mo659i() {
        C0422g a = this.f2773b.m4348a();
        return a instanceof C0425i ? new dr((C0425i) a) : null;
    }
}
