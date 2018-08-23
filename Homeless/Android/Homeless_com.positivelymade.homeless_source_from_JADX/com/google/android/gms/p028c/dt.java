package com.google.android.gms.p028c;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.C0685a;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.p028c.dj.C0902a;
import com.google.android.gms.p029b.C0799a;
import com.google.android.gms.p029b.C0802b;
import com.google.p016a.p018a.C0441c;
import com.google.p016a.p018a.C0442d;
import com.google.p016a.p018a.C0444f;
import com.google.p016a.p018a.C0448h;
import com.google.p016a.p018a.C0449i;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

@fn
public final class dt<NETWORK_EXTRAS extends C0449i, SERVER_PARAMETERS extends C0448h> extends C0902a {
    private final C0441c<NETWORK_EXTRAS, SERVER_PARAMETERS> f2786a;
    private final NETWORK_EXTRAS f2787b;

    public dt(C0441c<NETWORK_EXTRAS, SERVER_PARAMETERS> c0441c, NETWORK_EXTRAS network_extras) {
        this.f2786a = c0441c;
        this.f2787b = network_extras;
    }

    private SERVER_PARAMETERS m4402a(String str, int i, String str2) {
        Map hashMap;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                hashMap = new HashMap(jSONObject.length());
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str3 = (String) keys.next();
                    hashMap.put(str3, jSONObject.getString(str3));
                }
            } catch (Throwable th) {
                C0691b.m3102d("Could not get MediationServerParameters.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            hashMap = new HashMap(0);
        }
        Class c = this.f2786a.m2034c();
        if (c == null) {
            return null;
        }
        C0448h c0448h = (C0448h) c.newInstance();
        c0448h.m2042a(hashMap);
        return c0448h;
    }

    public C0799a mo644a() {
        if (this.f2786a instanceof C0442d) {
            try {
                return C0802b.m3754a(((C0442d) this.f2786a).m2036d());
            } catch (Throwable th) {
                C0691b.m3102d("Could not get banner view from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            C0691b.m3103e("MediationAdapter is not a MediationBannerAdapter: " + this.f2786a.getClass().getCanonicalName());
            throw new RemoteException();
        }
    }

    public void mo645a(AdRequestParcel adRequestParcel, String str) {
    }

    public void mo646a(C0799a c0799a, AdRequestParcel adRequestParcel, String str, C0685a c0685a, String str2) {
    }

    public void mo647a(C0799a c0799a, AdRequestParcel adRequestParcel, String str, dk dkVar) {
        mo648a(c0799a, adRequestParcel, str, null, dkVar);
    }

    public void mo648a(C0799a c0799a, AdRequestParcel adRequestParcel, String str, String str2, dk dkVar) {
        if (this.f2786a instanceof C0444f) {
            C0691b.m3093a("Requesting interstitial ad from adapter.");
            try {
                ((C0444f) this.f2786a).m2037a(new du(dkVar), (Activity) C0802b.m3755a(c0799a), m4402a(str, adRequestParcel.f1336g, str2), dv.m4420a(adRequestParcel), this.f2787b);
            } catch (Throwable th) {
                C0691b.m3102d("Could not request interstitial ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            C0691b.m3103e("MediationAdapter is not a MediationInterstitialAdapter: " + this.f2786a.getClass().getCanonicalName());
            throw new RemoteException();
        }
    }

    public void mo649a(C0799a c0799a, AdRequestParcel adRequestParcel, String str, String str2, dk dkVar, NativeAdOptionsParcel nativeAdOptionsParcel, List<String> list) {
    }

    public void mo650a(C0799a c0799a, AdSizeParcel adSizeParcel, AdRequestParcel adRequestParcel, String str, dk dkVar) {
        mo651a(c0799a, adSizeParcel, adRequestParcel, str, null, dkVar);
    }

    public void mo651a(C0799a c0799a, AdSizeParcel adSizeParcel, AdRequestParcel adRequestParcel, String str, String str2, dk dkVar) {
        if (this.f2786a instanceof C0442d) {
            C0691b.m3093a("Requesting banner ad from adapter.");
            try {
                ((C0442d) this.f2786a).m2035a(new du(dkVar), (Activity) C0802b.m3755a(c0799a), m4402a(str, adRequestParcel.f1336g, str2), dv.m4421a(adSizeParcel), dv.m4420a(adRequestParcel), this.f2787b);
            } catch (Throwable th) {
                C0691b.m3102d("Could not request banner ad from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            C0691b.m3103e("MediationAdapter is not a MediationBannerAdapter: " + this.f2786a.getClass().getCanonicalName());
            throw new RemoteException();
        }
    }

    public void mo652b() {
        if (this.f2786a instanceof C0444f) {
            C0691b.m3093a("Showing interstitial from adapter.");
            try {
                ((C0444f) this.f2786a).m2038d();
            } catch (Throwable th) {
                C0691b.m3102d("Could not show interstitial from adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            C0691b.m3103e("MediationAdapter is not a MediationInterstitialAdapter: " + this.f2786a.getClass().getCanonicalName());
            throw new RemoteException();
        }
    }

    public void mo653c() {
        try {
            this.f2786a.m2032a();
        } catch (Throwable th) {
            C0691b.m3102d("Could not destroy adapter.", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public void mo654d() {
        throw new RemoteException();
    }

    public void mo655e() {
        throw new RemoteException();
    }

    public void mo656f() {
    }

    public boolean mo657g() {
        return true;
    }

    public dl mo658h() {
        return null;
    }

    public dm mo659i() {
        return null;
    }
}
