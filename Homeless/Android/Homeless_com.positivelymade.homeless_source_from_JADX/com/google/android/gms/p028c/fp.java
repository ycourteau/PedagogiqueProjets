package com.google.android.gms.p028c;

import android.content.Context;
import android.location.Location;
import com.google.android.gms.ads.internal.C0618p;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.request.C0658k;
import com.google.android.gms.ads.internal.request.C0663j.C0665a;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.p028c.cv.C0675b;
import com.google.android.gms.p028c.cv.C0882c;
import com.google.android.gms.p028c.cv.C0886d;
import com.google.android.gms.p028c.he.C0669c;
import com.google.android.gms.p028c.he.C0671a;
import com.google.android.gms.p028c.hh.C0601a;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

@fn
public final class fp extends C0665a {
    private static final Object f3097a = new Object();
    private static fp f3098b;
    private final Context f3099c;
    private final fo f3100d;
    private final as f3101e;
    private final cv f3102f;

    class C09565 implements C0675b<ac> {
        final /* synthetic */ fp f3093a;

        C09565(fp fpVar) {
            this.f3093a = fpVar;
        }

        public void m4628a(ac acVar) {
            acVar.mo581a("/log", cf.f2586h);
        }

        public /* synthetic */ void mo523a(Object obj) {
            m4628a((ac) obj);
        }
    }

    fp(Context context, as asVar, fo foVar) {
        this.f3099c = context;
        this.f3100d = foVar;
        this.f3101e = asVar;
        this.f3102f = new cv(context.getApplicationContext() != null ? context.getApplicationContext() : context, new VersionInfoParcel(7895000, 7895000, true), asVar.m3865a(), new C09565(this), new C0882c());
    }

    private static AdResponseParcel m4630a(Context context, cv cvVar, as asVar, fo foVar, AdRequestInfoParcel adRequestInfoParcel) {
        C0691b.m3093a("Starting ad request from service.");
        az.m3895a(context);
        final bf bfVar = new bf(((Boolean) az.f2455G.m3878c()).booleanValue(), "load_ad", adRequestInfoParcel.f1840d.f1348b);
        if (adRequestInfoParcel.f1837a > 10 && adRequestInfoParcel.f1835E != -1) {
            bfVar.m3920a(bfVar.m3917a(adRequestInfoParcel.f1835E), "cts");
        }
        be a = bfVar.m3916a();
        foVar.f3070c.mo631a();
        fu a2 = C0618p.m2802k().m4703a(context);
        if (a2.f3180m == -1) {
            C0691b.m3093a("Device is offline.");
            return new AdResponseParcel(2);
        }
        String uuid = adRequestInfoParcel.f1837a >= 7 ? adRequestInfoParcel.f1862z : UUID.randomUUID().toString();
        final fr frVar = new fr(uuid, adRequestInfoParcel.f1842f.packageName);
        if (adRequestInfoParcel.f1839c.f1332c != null) {
            String string = adRequestInfoParcel.f1839c.f1332c.getString("_ad");
            if (string != null) {
                return fq.m4638a(context, adRequestInfoParcel, string);
            }
        }
        Location a3 = foVar.f3070c.mo630a(250);
        String a4 = foVar.f3071d.mo714a(context, adRequestInfoParcel.f1843g.packageName);
        List a5 = foVar.f3069b.mo590a(adRequestInfoParcel);
        JSONObject a6 = fq.m4643a(context, adRequestInfoParcel, a2, foVar.f3073f.mo729a(context), a3, asVar, a4, foVar.f3072e.mo735a(adRequestInfoParcel.f1844h), a5);
        if (adRequestInfoParcel.f1837a < 7) {
            try {
                a6.put("request_id", uuid);
            } catch (JSONException e) {
            }
        }
        if (a6 == null) {
            return new AdResponseParcel(0);
        }
        final String jSONObject = a6.toString();
        bfVar.m3920a(a, "arc");
        final be a7 = bfVar.m3916a();
        if (((Boolean) az.f2477c.m3878c()).booleanValue()) {
            final cv cvVar2 = cvVar;
            final fr frVar2 = frVar;
            final bf bfVar2 = bfVar;
            go.f3361a.post(new Runnable() {

                class C09512 implements C0671a {
                    final /* synthetic */ C09521 f3076a;

                    C09512(C09521 c09521) {
                        this.f3076a = c09521;
                    }

                    public void mo522a() {
                    }
                }

                public void run() {
                    C0886d b = cvVar2.m4175b();
                    frVar2.m4658a(b);
                    bfVar2.m3920a(a7, "rwc");
                    final be a = bfVar2.m3916a();
                    b.m4147a(new C0669c<af>(this) {
                        final /* synthetic */ C09521 f3075b;

                        public void m4624a(af afVar) {
                            bfVar2.m3920a(a, "jsf");
                            bfVar2.m3921b();
                            afVar.mo581a("/invalidRequest", frVar2.f3108c);
                            afVar.mo581a("/loadAdURL", frVar2.f3109d);
                            try {
                                afVar.mo582a("AFMA_buildAdURL", jSONObject);
                            } catch (Throwable e) {
                                C0691b.m3098b("Error requesting an ad url", e);
                            }
                        }

                        public /* synthetic */ void mo521a(Object obj) {
                            m4624a((af) obj);
                        }
                    }, new C09512(this));
                }
            });
        } else {
            final Context context2 = context;
            final AdRequestInfoParcel adRequestInfoParcel2 = adRequestInfoParcel;
            final be beVar = a7;
            final String str = jSONObject;
            final as asVar2 = asVar;
            go.f3361a.post(new Runnable() {
                public void run() {
                    hg a = C0618p.m2797f().m5056a(context2, new AdSizeParcel(), false, false, null, adRequestInfoParcel2.f1847k);
                    if (C0618p.m2799h().m4794k()) {
                        a.getWebView().clearCache(true);
                    }
                    a.setWillNotDraw(true);
                    frVar.m4659a(a);
                    bfVar.m3920a(beVar, "rwc");
                    C0601a a2 = fp.m4635b(str, bfVar, bfVar.m3916a());
                    hh i = a.mo788i();
                    i.m5044a("/invalidRequest", frVar.f3108c);
                    i.m5044a("/loadAdURL", frVar.f3109d);
                    i.m5044a("/log", cf.f2586h);
                    i.m5042a(a2);
                    C0691b.m3093a("Loading the JS library.");
                    a.loadUrl(asVar2.m3865a());
                }
            });
        }
        AdResponseParcel adResponseParcel;
        try {
            ft ftVar = (ft) frVar.m4660b().get(10, TimeUnit.SECONDS);
            if (ftVar == null) {
                adResponseParcel = new AdResponseParcel(0);
                return adResponseParcel;
            } else if (ftVar.m4686a() != -2) {
                adResponseParcel = new AdResponseParcel(ftVar.m4686a());
                go.f3361a.post(new Runnable() {
                    public void run() {
                        frVar.m4661c();
                        if (frVar.m4657a() != null) {
                            frVar.m4657a().m4152a();
                        }
                    }
                });
                return adResponseParcel;
            } else {
                if (bfVar.m3924e() != null) {
                    bfVar.m3920a(bfVar.m3924e(), "rur");
                }
                jSONObject = null;
                if (ftVar.m4692f()) {
                    jSONObject = foVar.f3068a.mo734a(adRequestInfoParcel.f1843g.packageName);
                }
                adResponseParcel = fp.m4631a(adRequestInfoParcel, context, adRequestInfoParcel.f1847k.f1976b, ftVar.m4690d(), jSONObject, a4, ftVar, bfVar);
                if (adResponseParcel.f1887x == 1) {
                    foVar.f3071d.mo715b(context, adRequestInfoParcel.f1843g.packageName);
                }
                bfVar.m3920a(a, "tts");
                adResponseParcel.f1889z = bfVar.m3922c();
                go.f3361a.post(/* anonymous class already generated */);
                return adResponseParcel;
            }
        } catch (Exception e2) {
            adResponseParcel = new AdResponseParcel(0);
            return adResponseParcel;
        } finally {
            go.f3361a.post(/* anonymous class already generated */);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.ads.internal.request.AdResponseParcel m4631a(com.google.android.gms.ads.internal.request.AdRequestInfoParcel r13, android.content.Context r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, com.google.android.gms.p028c.ft r19, com.google.android.gms.p028c.bf r20) {
        /*
        if (r20 == 0) goto L_0x00df;
    L_0x0002:
        r2 = r20.m3916a();
        r3 = r2;
    L_0x0007:
        r6 = new com.google.android.gms.c.fs;	 Catch:{ IOException -> 0x0152 }
        r6.<init>(r13);	 Catch:{ IOException -> 0x0152 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0152 }
        r2.<init>();	 Catch:{ IOException -> 0x0152 }
        r4 = "AdRequestServiceImpl: Sending request: ";
        r2 = r2.append(r4);	 Catch:{ IOException -> 0x0152 }
        r0 = r16;
        r2 = r2.append(r0);	 Catch:{ IOException -> 0x0152 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x0152 }
        com.google.android.gms.ads.internal.util.client.C0691b.m3093a(r2);	 Catch:{ IOException -> 0x0152 }
        r4 = new java.net.URL;	 Catch:{ IOException -> 0x0152 }
        r0 = r16;
        r4.<init>(r0);	 Catch:{ IOException -> 0x0152 }
        r2 = 0;
        r5 = com.google.android.gms.ads.internal.C0618p.m2800i();	 Catch:{ IOException -> 0x0152 }
        r8 = r5.mo825b();	 Catch:{ IOException -> 0x0152 }
        r5 = r4;
        r4 = r2;
    L_0x0036:
        r2 = r5.openConnection();	 Catch:{ IOException -> 0x0152 }
        r2 = (java.net.HttpURLConnection) r2;	 Catch:{ IOException -> 0x0152 }
        r7 = com.google.android.gms.ads.internal.C0618p.m2796e();	 Catch:{ all -> 0x0175 }
        r10 = 0;
        r7.m4859a(r14, r15, r10, r2);	 Catch:{ all -> 0x0175 }
        r7 = android.text.TextUtils.isEmpty(r17);	 Catch:{ all -> 0x0175 }
        if (r7 != 0) goto L_0x0051;
    L_0x004a:
        r7 = "x-afma-drt-cookie";
        r0 = r17;
        r2.addRequestProperty(r7, r0);	 Catch:{ all -> 0x0175 }
    L_0x0051:
        r7 = android.text.TextUtils.isEmpty(r18);	 Catch:{ all -> 0x0175 }
        if (r7 != 0) goto L_0x0071;
    L_0x0057:
        r7 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0175 }
        r7.<init>();	 Catch:{ all -> 0x0175 }
        r10 = "Bearer ";
        r7 = r7.append(r10);	 Catch:{ all -> 0x0175 }
        r0 = r18;
        r7 = r7.append(r0);	 Catch:{ all -> 0x0175 }
        r7 = r7.toString();	 Catch:{ all -> 0x0175 }
        r10 = "Authorization";
        r2.addRequestProperty(r10, r7);	 Catch:{ all -> 0x0175 }
    L_0x0071:
        if (r19 == 0) goto L_0x009c;
    L_0x0073:
        r7 = r19.m4689c();	 Catch:{ all -> 0x0175 }
        r7 = android.text.TextUtils.isEmpty(r7);	 Catch:{ all -> 0x0175 }
        if (r7 != 0) goto L_0x009c;
    L_0x007d:
        r7 = 1;
        r2.setDoOutput(r7);	 Catch:{ all -> 0x0175 }
        r7 = r19.m4689c();	 Catch:{ all -> 0x0175 }
        r7 = r7.getBytes();	 Catch:{ all -> 0x0175 }
        r10 = r7.length;	 Catch:{ all -> 0x0175 }
        r2.setFixedLengthStreamingMode(r10);	 Catch:{ all -> 0x0175 }
        r10 = new java.io.BufferedOutputStream;	 Catch:{ all -> 0x0175 }
        r11 = r2.getOutputStream();	 Catch:{ all -> 0x0175 }
        r10.<init>(r11);	 Catch:{ all -> 0x0175 }
        r10.write(r7);	 Catch:{ all -> 0x0175 }
        r10.close();	 Catch:{ all -> 0x0175 }
    L_0x009c:
        r7 = r2.getResponseCode();	 Catch:{ all -> 0x0175 }
        r10 = r2.getHeaderFields();	 Catch:{ all -> 0x0175 }
        r11 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r7 < r11) goto L_0x00e3;
    L_0x00a8:
        r11 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        if (r7 >= r11) goto L_0x00e3;
    L_0x00ac:
        r4 = r5.toString();	 Catch:{ all -> 0x0175 }
        r5 = com.google.android.gms.ads.internal.C0618p.m2796e();	 Catch:{ all -> 0x0175 }
        r11 = new java.io.InputStreamReader;	 Catch:{ all -> 0x0175 }
        r12 = r2.getInputStream();	 Catch:{ all -> 0x0175 }
        r11.<init>(r12);	 Catch:{ all -> 0x0175 }
        r5 = r5.m4844a(r11);	 Catch:{ all -> 0x0175 }
        com.google.android.gms.p028c.fp.m4634a(r4, r10, r5, r7);	 Catch:{ all -> 0x0175 }
        r6.m4682a(r4, r10, r5);	 Catch:{ all -> 0x0175 }
        if (r20 == 0) goto L_0x00d6;
    L_0x00c9:
        r4 = 1;
        r4 = new java.lang.String[r4];	 Catch:{ all -> 0x0175 }
        r5 = 0;
        r7 = "ufe";
        r4[r5] = r7;	 Catch:{ all -> 0x0175 }
        r0 = r20;
        r0.m3920a(r3, r4);	 Catch:{ all -> 0x0175 }
    L_0x00d6:
        r3 = r6.m4681a(r8);	 Catch:{ all -> 0x0175 }
        r2.disconnect();	 Catch:{ IOException -> 0x0152 }
        r2 = r3;
    L_0x00de:
        return r2;
    L_0x00df:
        r2 = 0;
        r3 = r2;
        goto L_0x0007;
    L_0x00e3:
        r5 = r5.toString();	 Catch:{ all -> 0x0175 }
        r11 = 0;
        com.google.android.gms.p028c.fp.m4634a(r5, r10, r11, r7);	 Catch:{ all -> 0x0175 }
        r5 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        if (r7 < r5) goto L_0x0129;
    L_0x00ef:
        r5 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        if (r7 >= r5) goto L_0x0129;
    L_0x00f3:
        r5 = "Location";
        r7 = r2.getHeaderField(r5);	 Catch:{ all -> 0x0175 }
        r5 = android.text.TextUtils.isEmpty(r7);	 Catch:{ all -> 0x0175 }
        if (r5 == 0) goto L_0x010f;
    L_0x00ff:
        r3 = "No location header to follow redirect.";
        com.google.android.gms.ads.internal.util.client.C0691b.m3103e(r3);	 Catch:{ all -> 0x0175 }
        r3 = new com.google.android.gms.ads.internal.request.AdResponseParcel;	 Catch:{ all -> 0x0175 }
        r4 = 0;
        r3.<init>(r4);	 Catch:{ all -> 0x0175 }
        r2.disconnect();	 Catch:{ IOException -> 0x0152 }
        r2 = r3;
        goto L_0x00de;
    L_0x010f:
        r5 = new java.net.URL;	 Catch:{ all -> 0x0175 }
        r5.<init>(r7);	 Catch:{ all -> 0x0175 }
        r4 = r4 + 1;
        r7 = 5;
        if (r4 <= r7) goto L_0x014a;
    L_0x0119:
        r3 = "Too many redirects.";
        com.google.android.gms.ads.internal.util.client.C0691b.m3103e(r3);	 Catch:{ all -> 0x0175 }
        r3 = new com.google.android.gms.ads.internal.request.AdResponseParcel;	 Catch:{ all -> 0x0175 }
        r4 = 0;
        r3.<init>(r4);	 Catch:{ all -> 0x0175 }
        r2.disconnect();	 Catch:{ IOException -> 0x0152 }
        r2 = r3;
        goto L_0x00de;
    L_0x0129:
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0175 }
        r3.<init>();	 Catch:{ all -> 0x0175 }
        r4 = "Received error HTTP response code: ";
        r3 = r3.append(r4);	 Catch:{ all -> 0x0175 }
        r3 = r3.append(r7);	 Catch:{ all -> 0x0175 }
        r3 = r3.toString();	 Catch:{ all -> 0x0175 }
        com.google.android.gms.ads.internal.util.client.C0691b.m3103e(r3);	 Catch:{ all -> 0x0175 }
        r3 = new com.google.android.gms.ads.internal.request.AdResponseParcel;	 Catch:{ all -> 0x0175 }
        r4 = 0;
        r3.<init>(r4);	 Catch:{ all -> 0x0175 }
        r2.disconnect();	 Catch:{ IOException -> 0x0152 }
        r2 = r3;
        goto L_0x00de;
    L_0x014a:
        r6.m4683a(r10);	 Catch:{ all -> 0x0175 }
        r2.disconnect();	 Catch:{ IOException -> 0x0152 }
        goto L_0x0036;
    L_0x0152:
        r2 = move-exception;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "Error while connecting to ad server: ";
        r3 = r3.append(r4);
        r2 = r2.getMessage();
        r2 = r3.append(r2);
        r2 = r2.toString();
        com.google.android.gms.ads.internal.util.client.C0691b.m3103e(r2);
        r2 = new com.google.android.gms.ads.internal.request.AdResponseParcel;
        r3 = 2;
        r2.<init>(r3);
        goto L_0x00de;
    L_0x0175:
        r3 = move-exception;
        r2.disconnect();	 Catch:{ IOException -> 0x0152 }
        throw r3;	 Catch:{ IOException -> 0x0152 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.c.fp.a(com.google.android.gms.ads.internal.request.AdRequestInfoParcel, android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.google.android.gms.c.ft, com.google.android.gms.c.bf):com.google.android.gms.ads.internal.request.AdResponseParcel");
    }

    public static fp m4632a(Context context, as asVar, fo foVar) {
        fp fpVar;
        synchronized (f3097a) {
            if (f3098b == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                f3098b = new fp(context, asVar, foVar);
            }
            fpVar = f3098b;
        }
        return fpVar;
    }

    private static void m4634a(String str, Map<String, List<String>> map, String str2, int i) {
        if (C0691b.m3096a(2)) {
            C0691b.m3101d("Http Response: {\n  URL:\n    " + str + "\n  Headers:");
            if (map != null) {
                for (String str3 : map.keySet()) {
                    C0691b.m3101d("    " + str3 + ":");
                    for (String str32 : (List) map.get(str32)) {
                        C0691b.m3101d("      " + str32);
                    }
                }
            }
            C0691b.m3101d("  Body:");
            if (str2 != null) {
                for (int i2 = 0; i2 < Math.min(str2.length(), 100000); i2 += 1000) {
                    C0691b.m3101d(str2.substring(i2, Math.min(str2.length(), i2 + 1000)));
                }
            } else {
                C0691b.m3101d("    null");
            }
            C0691b.m3101d("  Response Code:\n    " + i + "\n}");
        }
    }

    private static C0601a m4635b(final String str, final bf bfVar, final be beVar) {
        return new C0601a() {
            public void mo465a(hg hgVar, boolean z) {
                bfVar.m3920a(beVar, "jsf");
                bfVar.m3921b();
                hgVar.mo767a("AFMA_buildAdURL", str);
            }
        };
    }

    public AdResponseParcel mo519a(AdRequestInfoParcel adRequestInfoParcel) {
        return fp.m4630a(this.f3099c, this.f3102f, this.f3101e, this.f3100d, adRequestInfoParcel);
    }

    public void mo520a(final AdRequestInfoParcel adRequestInfoParcel, final C0658k c0658k) {
        C0618p.m2799h().m4775a(this.f3099c, adRequestInfoParcel.f1847k);
        go.m4834b(new Runnable(this) {
            final /* synthetic */ fp f3096c;

            public void run() {
                AdResponseParcel a;
                try {
                    a = this.f3096c.mo519a(adRequestInfoParcel);
                } catch (Throwable e) {
                    C0618p.m2799h().m4781a(e, true);
                    C0691b.m3102d("Could not fetch ad response due to an Exception.", e);
                    a = null;
                }
                if (a == null) {
                    a = new AdResponseParcel(0);
                }
                try {
                    c0658k.mo518a(a);
                } catch (Throwable e2) {
                    C0691b.m3102d("Fail to forward ad response.", e2);
                }
            }
        });
    }
}
