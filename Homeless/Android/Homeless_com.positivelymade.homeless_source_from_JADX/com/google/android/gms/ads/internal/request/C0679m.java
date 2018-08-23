package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C0618p;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel.C0638a;
import com.google.android.gms.ads.internal.request.C0640a.C0493a;
import com.google.android.gms.ads.internal.util.client.C0690a;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.ads.p023c.C0475a;
import com.google.android.gms.ads.p023c.C0475a.C0473a;
import com.google.android.gms.common.C1230c;
import com.google.android.gms.common.C1232d;
import com.google.android.gms.p028c.ac;
import com.google.android.gms.p028c.af;
import com.google.android.gms.p028c.as;
import com.google.android.gms.p028c.az;
import com.google.android.gms.p028c.cg;
import com.google.android.gms.p028c.ch;
import com.google.android.gms.p028c.cl;
import com.google.android.gms.p028c.cv;
import com.google.android.gms.p028c.cv.C0675b;
import com.google.android.gms.p028c.cv.C0886d;
import com.google.android.gms.p028c.db;
import com.google.android.gms.p028c.fn;
import com.google.android.gms.p028c.fq;
import com.google.android.gms.p028c.gd.C0973a;
import com.google.android.gms.p028c.gk;
import com.google.android.gms.p028c.he.C0669c;
import com.google.android.gms.p028c.he.C0671a;
import com.google.android.gms.p028c.hg;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

@fn
public class C0679m extends gk {
    static final long f1957a = TimeUnit.SECONDS.toMillis(10);
    private static final Object f1958b = new Object();
    private static boolean f1959c = false;
    private static cv f1960d = null;
    private static ch f1961e = null;
    private static cl f1962f = null;
    private static cg f1963g = null;
    private final C0493a f1964h;
    private final C0638a f1965i;
    private final Object f1966j = new Object();
    private final Context f1967k;
    private C0886d f1968l;

    class C06743 implements Runnable {
        final /* synthetic */ C0679m f1956a;

        C06743(C0679m c0679m) {
            this.f1956a = c0679m;
        }

        public void run() {
            if (this.f1956a.f1968l != null) {
                this.f1956a.f1968l.m4152a();
                this.f1956a.f1968l = null;
            }
        }
    }

    public static class C0676a implements C0675b<ac> {
        public void m3029a(ac acVar) {
            C0679m.m3041b(acVar);
        }

        public /* synthetic */ void mo523a(Object obj) {
            m3029a((ac) obj);
        }
    }

    public static class C0677b implements C0675b<ac> {
        public void m3031a(ac acVar) {
            C0679m.m3039a(acVar);
        }

        public /* synthetic */ void mo523a(Object obj) {
            m3031a((ac) obj);
        }
    }

    public static class C0678c implements cg {
        public void mo524a(hg hgVar, Map<String, String> map) {
            String str = (String) map.get("request_id");
            C0691b.m3103e("Invalid request: " + ((String) map.get("errors")));
            C0679m.f1962f.m4095b(str);
        }
    }

    public C0679m(Context context, C0638a c0638a, C0493a c0493a) {
        this.f1964h = c0493a;
        this.f1967k = context;
        this.f1965i = c0638a;
        synchronized (f1958b) {
            if (!f1959c) {
                f1962f = new cl();
                f1961e = new ch(context.getApplicationContext(), c0638a.f1814j);
                f1963g = new C0678c();
                f1960d = new cv(this.f1967k.getApplicationContext(), this.f1965i.f1814j, (String) az.f2476b.m3878c(), new C0677b(), new C0676a());
                f1959c = true;
            }
        }
    }

    private AdResponseParcel m3035a(AdRequestInfoParcel adRequestInfoParcel) {
        final String uuid = UUID.randomUUID().toString();
        final JSONObject a = m3038a(adRequestInfoParcel, uuid);
        if (a == null) {
            return new AdResponseParcel(0);
        }
        long b = C0618p.m2800i().mo825b();
        Future a2 = f1962f.m4092a(uuid);
        C0690a.f1980a.post(new Runnable(this) {
            final /* synthetic */ C0679m f1955c;

            class C06701 implements C0669c<af> {
                final /* synthetic */ C06732 f1951a;

                C06701(C06732 c06732) {
                    this.f1951a = c06732;
                }

                public void m3024a(af afVar) {
                    try {
                        afVar.mo583a("AFMA_getAdapterLessMediationAd", a);
                    } catch (Throwable e) {
                        C0691b.m3098b("Error requesting an ad url", e);
                        C0679m.f1962f.m4095b(uuid);
                    }
                }

                public /* synthetic */ void mo521a(Object obj) {
                    m3024a((af) obj);
                }
            }

            class C06722 implements C0671a {
                final /* synthetic */ C06732 f1952a;

                C06722(C06732 c06732) {
                    this.f1952a = c06732;
                }

                public void mo522a() {
                    C0679m.f1962f.m4095b(uuid);
                }
            }

            public void run() {
                this.f1955c.f1968l = C0679m.f1960d.m4175b();
                this.f1955c.f1968l.m4147a(new C06701(this), new C06722(this));
            }
        });
        try {
            JSONObject jSONObject = (JSONObject) a2.get(f1957a - (C0618p.m2800i().mo825b() - b), TimeUnit.MILLISECONDS);
            if (jSONObject == null) {
                return new AdResponseParcel(-1);
            }
            AdResponseParcel a3 = fq.m4638a(this.f1967k, adRequestInfoParcel, jSONObject.toString());
            return (a3.f1868e == -3 || !TextUtils.isEmpty(a3.f1866c)) ? a3 : new AdResponseParcel(3);
        } catch (CancellationException e) {
            return new AdResponseParcel(-1);
        } catch (InterruptedException e2) {
            return new AdResponseParcel(-1);
        } catch (TimeoutException e3) {
            return new AdResponseParcel(2);
        } catch (ExecutionException e4) {
            return new AdResponseParcel(0);
        }
    }

    private JSONObject m3038a(AdRequestInfoParcel adRequestInfoParcel, String str) {
        C0473a b;
        Throwable e;
        Object obj;
        Map hashMap;
        JSONObject jSONObject = null;
        Bundle bundle = adRequestInfoParcel.f1839c.f1332c.getBundle("sdk_less_server_data");
        String string = adRequestInfoParcel.f1839c.f1332c.getString("sdk_less_network_id");
        if (bundle != null) {
            JSONObject a = fq.m4643a(this.f1967k, adRequestInfoParcel, C0618p.m2802k().m4703a(this.f1967k), jSONObject, jSONObject, new as((String) az.f2476b.m3878c()), jSONObject, jSONObject, new ArrayList());
            if (a != null) {
                try {
                    b = C0475a.m2103b(this.f1967k);
                } catch (IOException e2) {
                    e = e2;
                    C0691b.m3102d("Cannot get advertising id info", e);
                    obj = jSONObject;
                    hashMap = new HashMap();
                    hashMap.put("request_id", str);
                    hashMap.put("network_id", string);
                    hashMap.put("request_param", a);
                    hashMap.put("data", bundle);
                    if (b != null) {
                        hashMap.put("adid", b.m2096a());
                        hashMap.put("lat", Integer.valueOf(b.m2097b() ? 0 : 1));
                    }
                    jSONObject = C0618p.m2796e().m4851a(hashMap);
                    return jSONObject;
                } catch (IllegalStateException e3) {
                    e = e3;
                    C0691b.m3102d("Cannot get advertising id info", e);
                    obj = jSONObject;
                    hashMap = new HashMap();
                    hashMap.put("request_id", str);
                    hashMap.put("network_id", string);
                    hashMap.put("request_param", a);
                    hashMap.put("data", bundle);
                    if (b != null) {
                        hashMap.put("adid", b.m2096a());
                        if (b.m2097b()) {
                        }
                        hashMap.put("lat", Integer.valueOf(b.m2097b() ? 0 : 1));
                    }
                    jSONObject = C0618p.m2796e().m4851a(hashMap);
                    return jSONObject;
                } catch (C1230c e4) {
                    e = e4;
                    C0691b.m3102d("Cannot get advertising id info", e);
                    obj = jSONObject;
                    hashMap = new HashMap();
                    hashMap.put("request_id", str);
                    hashMap.put("network_id", string);
                    hashMap.put("request_param", a);
                    hashMap.put("data", bundle);
                    if (b != null) {
                        hashMap.put("adid", b.m2096a());
                        if (b.m2097b()) {
                        }
                        hashMap.put("lat", Integer.valueOf(b.m2097b() ? 0 : 1));
                    }
                    jSONObject = C0618p.m2796e().m4851a(hashMap);
                    return jSONObject;
                } catch (C1232d e5) {
                    e = e5;
                    C0691b.m3102d("Cannot get advertising id info", e);
                    obj = jSONObject;
                    hashMap = new HashMap();
                    hashMap.put("request_id", str);
                    hashMap.put("network_id", string);
                    hashMap.put("request_param", a);
                    hashMap.put("data", bundle);
                    if (b != null) {
                        hashMap.put("adid", b.m2096a());
                        if (b.m2097b()) {
                        }
                        hashMap.put("lat", Integer.valueOf(b.m2097b() ? 0 : 1));
                    }
                    jSONObject = C0618p.m2796e().m4851a(hashMap);
                    return jSONObject;
                }
                hashMap = new HashMap();
                hashMap.put("request_id", str);
                hashMap.put("network_id", string);
                hashMap.put("request_param", a);
                hashMap.put("data", bundle);
                if (b != null) {
                    hashMap.put("adid", b.m2096a());
                    if (b.m2097b()) {
                    }
                    hashMap.put("lat", Integer.valueOf(b.m2097b() ? 0 : 1));
                }
                try {
                    jSONObject = C0618p.m2796e().m4851a(hashMap);
                } catch (JSONException e6) {
                }
            }
        }
        return jSONObject;
    }

    protected static void m3039a(ac acVar) {
        acVar.mo581a("/loadAd", f1962f);
        acVar.mo581a("/fetchHttpRequest", f1961e);
        acVar.mo581a("/invalidRequest", f1963g);
    }

    protected static void m3041b(ac acVar) {
        acVar.mo586b("/loadAd", f1962f);
        acVar.mo586b("/fetchHttpRequest", f1961e);
        acVar.mo586b("/invalidRequest", f1963g);
    }

    public void mo486a() {
        C0691b.m3093a("SdkLessAdLoaderBackgroundTask started.");
        AdRequestInfoParcel adRequestInfoParcel = new AdRequestInfoParcel(this.f1965i, null, null, -1);
        AdResponseParcel a = m3035a(adRequestInfoParcel);
        AdRequestInfoParcel adRequestInfoParcel2 = adRequestInfoParcel;
        db dbVar = null;
        AdSizeParcel adSizeParcel = null;
        final C0973a c0973a = new C0973a(adRequestInfoParcel2, a, dbVar, adSizeParcel, a.f1868e, C0618p.m2800i().mo825b(), a.f1877n, null);
        C0690a.f1980a.post(new Runnable(this) {
            final /* synthetic */ C0679m f1950b;

            public void run() {
                this.f1950b.f1964h.mo348a(c0973a);
                if (this.f1950b.f1968l != null) {
                    this.f1950b.f1968l.m4152a();
                    this.f1950b.f1968l = null;
                }
            }
        });
    }

    public void mo487b() {
        synchronized (this.f1966j) {
            C0690a.f1980a.post(new C06743(this));
        }
    }
}
