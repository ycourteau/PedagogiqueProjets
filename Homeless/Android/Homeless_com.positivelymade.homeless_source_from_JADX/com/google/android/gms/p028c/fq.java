package com.google.android.gms.p028c;

import android.content.Context;
import android.graphics.Color;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C0618p;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.C0526n;
import com.google.android.gms.ads.internal.client.SearchAdRequestParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.appdatasearch.C0788a;
import com.google.android.gms.appdatasearch.DocumentContents;
import com.google.android.gms.appdatasearch.DocumentSection;
import com.google.android.gms.appdatasearch.GetRecentContextCall.Request.C0773a;
import com.google.android.gms.appdatasearch.GetRecentContextCall.Response;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.common.api.C1180c;
import com.google.android.gms.common.api.C1180c.C1176a;
import com.google.android.gms.common.internal.C1253f;
import com.google.android.gms.p021a.C0454a;
import com.google.android.gms.p028c.fw.C0962a;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@fn
public final class fq {
    private static final SimpleDateFormat f3103a = new SimpleDateFormat("yyyyMMdd", Locale.US);

    public static AdResponseParcel m4638a(Context context, AdRequestInfoParcel adRequestInfoParcel, String str) {
        try {
            String str2;
            AdResponseParcel adResponseParcel;
            int i;
            List list;
            List list2;
            List list3;
            long j;
            String optString;
            String str3;
            boolean optBoolean;
            JSONObject jSONObject = new JSONObject(str);
            String optString2 = jSONObject.optString("ad_base_url", null);
            Object optString3 = jSONObject.optString("ad_url", null);
            String optString4 = jSONObject.optString("ad_size", null);
            boolean z = (adRequestInfoParcel == null || adRequestInfoParcel.f1849m == 0) ? false : true;
            CharSequence optString5 = z ? jSONObject.optString("ad_json", null) : jSONObject.optString("ad_html", null);
            long j2 = -1;
            String optString6 = jSONObject.optString("debug_dialog", null);
            long j3 = jSONObject.has("interstitial_timeout") ? (long) (jSONObject.getDouble("interstitial_timeout") * 1000.0d) : -1;
            String optString7 = jSONObject.optString("orientation", null);
            int i2 = -1;
            if ("portrait".equals(optString7)) {
                i2 = C0618p.m2798g().mo739b();
            } else if ("landscape".equals(optString7)) {
                i2 = C0618p.m2798g().mo737a();
            }
            if (TextUtils.isEmpty(optString5)) {
                if (TextUtils.isEmpty(optString3)) {
                    C0691b.m3103e("Could not parse the mediation config: Missing required " + (z ? "ad_json" : "ad_html") + " or " + "ad_url" + " field.");
                    return new AdResponseParcel(0);
                }
                AdResponseParcel a = fp.m4631a(adRequestInfoParcel, context, adRequestInfoParcel.f1847k.f1976b, optString3, null, null, null, null);
                optString2 = a.f1865b;
                str2 = a.f1866c;
                j2 = a.f1877n;
                adResponseParcel = a;
            } else if (TextUtils.isEmpty(optString2)) {
                C0691b.m3103e("Could not parse the mediation config: Missing required ad_base_url field");
                return new AdResponseParcel(0);
            } else {
                adResponseParcel = null;
                CharSequence charSequence = optString5;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("click_urls");
            List list4 = adResponseParcel == null ? null : adResponseParcel.f1867d;
            if (optJSONArray != null) {
                if (list4 == null) {
                    list4 = new LinkedList();
                }
                for (i = 0; i < optJSONArray.length(); i++) {
                    list4.add(optJSONArray.getString(i));
                }
                list = list4;
            } else {
                list = list4;
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("impression_urls");
            list4 = adResponseParcel == null ? null : adResponseParcel.f1869f;
            if (optJSONArray2 != null) {
                if (list4 == null) {
                    list4 = new LinkedList();
                }
                for (i = 0; i < optJSONArray2.length(); i++) {
                    list4.add(optJSONArray2.getString(i));
                }
                list2 = list4;
            } else {
                list2 = list4;
            }
            JSONArray optJSONArray3 = jSONObject.optJSONArray("manual_impression_urls");
            list4 = adResponseParcel == null ? null : adResponseParcel.f1873j;
            if (optJSONArray3 != null) {
                if (list4 == null) {
                    list4 = new LinkedList();
                }
                for (i = 0; i < optJSONArray3.length(); i++) {
                    list4.add(optJSONArray3.getString(i));
                }
                list3 = list4;
            } else {
                list3 = list4;
            }
            if (adResponseParcel != null) {
                if (adResponseParcel.f1875l != -1) {
                    i2 = adResponseParcel.f1875l;
                }
                if (adResponseParcel.f1870g > 0) {
                    j = adResponseParcel.f1870g;
                    optString = jSONObject.optString("active_view");
                    str3 = null;
                    optBoolean = jSONObject.optBoolean("ad_is_javascript", false);
                    if (optBoolean) {
                        str3 = jSONObject.optString("ad_passback_url", null);
                    }
                    return new AdResponseParcel(adRequestInfoParcel, optString2, str2, list, list2, j, jSONObject.optBoolean("mediation", false), jSONObject.optLong("mediation_config_cache_time_milliseconds", -1), list3, jSONObject.optLong("refresh_interval_milliseconds", -1), i2, optString4, j2, optString6, optBoolean, str3, optString, jSONObject.optBoolean("custom_render_allowed", false), z, adRequestInfoParcel.f1852p, jSONObject.optBoolean("content_url_opted_out", true), jSONObject.optBoolean("prefetch", false), jSONObject.optInt("oauth2_token_status", 0));
                }
            }
            j = j3;
            optString = jSONObject.optString("active_view");
            str3 = null;
            optBoolean = jSONObject.optBoolean("ad_is_javascript", false);
            if (optBoolean) {
                str3 = jSONObject.optString("ad_passback_url", null);
            }
            return new AdResponseParcel(adRequestInfoParcel, optString2, str2, list, list2, j, jSONObject.optBoolean("mediation", false), jSONObject.optLong("mediation_config_cache_time_milliseconds", -1), list3, jSONObject.optLong("refresh_interval_milliseconds", -1), i2, optString4, j2, optString6, optBoolean, str3, optString, jSONObject.optBoolean("custom_render_allowed", false), z, adRequestInfoParcel.f1852p, jSONObject.optBoolean("content_url_opted_out", true), jSONObject.optBoolean("prefetch", false), jSONObject.optInt("oauth2_token_status", 0));
        } catch (JSONException e) {
            C0691b.m3103e("Could not parse the mediation config: " + e.getMessage());
            return new AdResponseParcel(0);
        }
    }

    private static UsageInfo m4639a(Context context, String str) {
        C1180c b;
        C1180c c1180c;
        Throwable th;
        UsageInfo usageInfo;
        try {
            b = new C1176a(context).m5992a(C0788a.f2343b).m5996b();
            try {
                b.mo883b();
                Response response = (Response) C0788a.f2344c.mo811a(b, new C0773a().m3667a(true).m3666a(str).m3668a()).mo564a(1, TimeUnit.SECONDS);
                if (response == null || !response.mo558a().m5971e()) {
                    C0691b.m3099c("Fail to obtain recent context call");
                    if (b == null) {
                        return null;
                    }
                    b.mo887c();
                    return null;
                } else if (response.f2296b == null || response.f2296b.isEmpty()) {
                    C0691b.m3099c("Fail to obtain recent context");
                    if (b == null) {
                        return null;
                    }
                    b.mo887c();
                    return null;
                } else {
                    usageInfo = (UsageInfo) response.f2296b.get(0);
                    if (b != null) {
                        b.mo887c();
                    }
                    return usageInfo;
                }
            } catch (SecurityException e) {
                c1180c = b;
                try {
                    C0691b.m3103e("Fail to get recent context");
                    if (c1180c == null) {
                        c1180c.mo887c();
                        usageInfo = null;
                    } else {
                        usageInfo = null;
                    }
                    return usageInfo;
                } catch (Throwable th2) {
                    b = c1180c;
                    th = th2;
                    if (b != null) {
                        b.mo887c();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                if (b != null) {
                    b.mo887c();
                }
                throw th;
            }
        } catch (SecurityException e2) {
            c1180c = null;
            C0691b.m3103e("Fail to get recent context");
            if (c1180c == null) {
                usageInfo = null;
            } else {
                c1180c.mo887c();
                usageInfo = null;
            }
            return usageInfo;
        } catch (Throwable th4) {
            th = th4;
            b = null;
            if (b != null) {
                b.mo887c();
            }
            throw th;
        }
    }

    private static Integer m4640a(boolean z) {
        return Integer.valueOf(z ? 1 : 0);
    }

    private static String m4641a(int i) {
        return String.format(Locale.US, "#%06x", new Object[]{Integer.valueOf(16777215 & i)});
    }

    private static String m4642a(NativeAdOptionsParcel nativeAdOptionsParcel) {
        switch (nativeAdOptionsParcel != null ? nativeAdOptionsParcel.f1474c : 0) {
            case 1:
                return "portrait";
            case 2:
                return "landscape";
            default:
                return "any";
        }
    }

    public static JSONObject m4643a(Context context, AdRequestInfoParcel adRequestInfoParcel, fu fuVar, C0962a c0962a, Location location, as asVar, String str, String str2, List<String> list) {
        try {
            Map hashMap = new HashMap();
            if (list.size() > 0) {
                hashMap.put("eid", TextUtils.join(",", list));
            }
            if (adRequestInfoParcel.f1838b != null) {
                hashMap.put("ad_pos", adRequestInfoParcel.f1838b);
            }
            fq.m4647a((HashMap) hashMap, adRequestInfoParcel.f1839c);
            hashMap.put("format", adRequestInfoParcel.f1840d.f1348b);
            if (adRequestInfoParcel.f1840d.f1352f == -1) {
                hashMap.put("smart_w", "full");
            }
            if (adRequestInfoParcel.f1840d.f1349c == -2) {
                hashMap.put("smart_h", "auto");
            }
            if (adRequestInfoParcel.f1840d.f1354h != null) {
                StringBuilder stringBuilder = new StringBuilder();
                for (AdSizeParcel adSizeParcel : adRequestInfoParcel.f1840d.f1354h) {
                    if (stringBuilder.length() != 0) {
                        stringBuilder.append("|");
                    }
                    stringBuilder.append(adSizeParcel.f1352f == -1 ? (int) (((float) adSizeParcel.f1353g) / fuVar.f3185r) : adSizeParcel.f1352f);
                    stringBuilder.append("x");
                    stringBuilder.append(adSizeParcel.f1349c == -2 ? (int) (((float) adSizeParcel.f1350d) / fuVar.f3185r) : adSizeParcel.f1349c);
                }
                hashMap.put("sz", stringBuilder);
            }
            if (adRequestInfoParcel.f1849m != 0) {
                hashMap.put("native_version", Integer.valueOf(adRequestInfoParcel.f1849m));
                hashMap.put("native_templates", adRequestInfoParcel.f1850n);
                hashMap.put("native_image_orientation", fq.m4642a(adRequestInfoParcel.f1833C));
                if (!adRequestInfoParcel.f1834D.isEmpty()) {
                    hashMap.put("native_custom_templates", adRequestInfoParcel.f1834D);
                }
            }
            hashMap.put("slotname", adRequestInfoParcel.f1841e);
            hashMap.put("pn", adRequestInfoParcel.f1842f.packageName);
            if (adRequestInfoParcel.f1843g != null) {
                hashMap.put("vc", Integer.valueOf(adRequestInfoParcel.f1843g.versionCode));
            }
            hashMap.put("ms", str2);
            hashMap.put("seq_num", adRequestInfoParcel.f1845i);
            hashMap.put("session_id", adRequestInfoParcel.f1846j);
            hashMap.put("js", adRequestInfoParcel.f1847k.f1976b);
            fq.m4649a((HashMap) hashMap, fuVar, c0962a);
            hashMap.put("fdz", Integer.valueOf(asVar.m3866b()));
            hashMap.put("platform", Build.MANUFACTURER);
            hashMap.put("submodel", Build.MODEL);
            if (adRequestInfoParcel.f1839c.f1330a >= 2 && adRequestInfoParcel.f1839c.f1340k != null) {
                fq.m4646a((HashMap) hashMap, adRequestInfoParcel.f1839c.f1340k);
            }
            if (adRequestInfoParcel.f1837a >= 2) {
                hashMap.put("quality_signals", adRequestInfoParcel.f1848l);
            }
            if (adRequestInfoParcel.f1837a >= 4 && adRequestInfoParcel.f1852p) {
                hashMap.put("forceHttps", Boolean.valueOf(adRequestInfoParcel.f1852p));
            }
            if (adRequestInfoParcel.f1837a >= 4 && adRequestInfoParcel.f1851o != null) {
                Bundle bundle = adRequestInfoParcel.f1851o;
                fq.m4644a(context, adRequestInfoParcel, bundle);
                hashMap.put("content_info", bundle);
            }
            if (adRequestInfoParcel.f1837a >= 5) {
                hashMap.put("u_sd", Float.valueOf(adRequestInfoParcel.f1856t));
                hashMap.put("sh", Integer.valueOf(adRequestInfoParcel.f1855s));
                hashMap.put("sw", Integer.valueOf(adRequestInfoParcel.f1854r));
            } else {
                hashMap.put("u_sd", Float.valueOf(fuVar.f3185r));
                hashMap.put("sh", Integer.valueOf(fuVar.f3187t));
                hashMap.put("sw", Integer.valueOf(fuVar.f3186s));
            }
            if (adRequestInfoParcel.f1837a >= 6) {
                if (!TextUtils.isEmpty(adRequestInfoParcel.f1857u)) {
                    try {
                        hashMap.put("view_hierarchy", new JSONObject(adRequestInfoParcel.f1857u));
                    } catch (Throwable e) {
                        C0691b.m3102d("Problem serializing view hierarchy to JSON", e);
                    }
                }
                if (((Boolean) az.f2470V.m3878c()).booleanValue() && adRequestInfoParcel.f1858v) {
                    hashMap.put("ga_hid", Integer.valueOf(adRequestInfoParcel.f1859w));
                    hashMap.put("ga_cid", adRequestInfoParcel.f1860x);
                }
                hashMap.put("correlation_id", Long.valueOf(adRequestInfoParcel.f1861y));
            }
            if (adRequestInfoParcel.f1837a >= 7) {
                hashMap.put("request_id", adRequestInfoParcel.f1862z);
            }
            if (adRequestInfoParcel.f1837a >= 11 && adRequestInfoParcel.f1836F != null) {
                hashMap.put("capability", adRequestInfoParcel.f1836F.m2906a());
            }
            fq.m4650a((HashMap) hashMap, str);
            if (C0691b.m3096a(2)) {
                C0691b.m3101d("Ad Request JSON: " + C0618p.m2796e().m4851a(hashMap).toString(2));
            }
            return C0618p.m2796e().m4851a(hashMap);
        } catch (JSONException e2) {
            C0691b.m3103e("Problem serializing ad request to JSON: " + e2.getMessage());
            return null;
        }
    }

    static void m4644a(Context context, AdRequestInfoParcel adRequestInfoParcel, Bundle bundle) {
        if (!((Boolean) az.f2464P.m3878c()).booleanValue()) {
            C0691b.m3099c("App index is not enabled");
        } else if (!C1253f.f4324a) {
            C0691b.m3099c("Not on package side, return");
        } else if (C0526n.m2400a().m3088b()) {
            C0691b.m3099c("Cannot invoked on UI thread");
        } else if (adRequestInfoParcel == null || adRequestInfoParcel.f1843g == null) {
            C0691b.m3103e("Invalid ad request info");
        } else {
            String str = adRequestInfoParcel.f1843g.packageName;
            if (TextUtils.isEmpty(str)) {
                C0691b.m3103e("Fail to get package name");
                return;
            }
            try {
                fq.m4645a(fq.m4639a(context, str), str, bundle);
            } catch (RuntimeException e) {
                C0691b.m3099c("Fail to add app index to content info");
            }
        }
    }

    static void m4645a(UsageInfo usageInfo, String str, Bundle bundle) {
        if (usageInfo != null && usageInfo.m3721a() != null) {
            DocumentContents a = usageInfo.m3721a();
            Object a2 = a.m3663a();
            if (!TextUtils.isEmpty(a2)) {
                bundle.putString("web_url", a2);
            }
            try {
                DocumentSection a3 = a.m3662a("intent_data");
                if (a3 != null && !TextUtils.isEmpty(a3.f2277c)) {
                    bundle.putString("app_uri", C0454a.m2045a(str, Uri.parse(a3.f2277c)).toString());
                }
            } catch (IllegalArgumentException e) {
                C0691b.m3103e("Failed to parse the third-party Android App URI");
            }
        }
    }

    private static void m4646a(HashMap<String, Object> hashMap, Location location) {
        HashMap hashMap2 = new HashMap();
        Float valueOf = Float.valueOf(location.getAccuracy() * 1000.0f);
        Long valueOf2 = Long.valueOf(location.getTime() * 1000);
        Long valueOf3 = Long.valueOf((long) (location.getLatitude() * 1.0E7d));
        Long valueOf4 = Long.valueOf((long) (location.getLongitude() * 1.0E7d));
        hashMap2.put("radius", valueOf);
        hashMap2.put("lat", valueOf3);
        hashMap2.put("long", valueOf4);
        hashMap2.put("time", valueOf2);
        hashMap.put("uule", hashMap2);
    }

    private static void m4647a(HashMap<String, Object> hashMap, AdRequestParcel adRequestParcel) {
        String a = gj.m4805a();
        if (a != null) {
            hashMap.put("abf", a);
        }
        if (adRequestParcel.f1331b != -1) {
            hashMap.put("cust_age", f3103a.format(new Date(adRequestParcel.f1331b)));
        }
        if (adRequestParcel.f1332c != null) {
            hashMap.put("extras", adRequestParcel.f1332c);
        }
        if (adRequestParcel.f1333d != -1) {
            hashMap.put("cust_gender", Integer.valueOf(adRequestParcel.f1333d));
        }
        if (adRequestParcel.f1334e != null) {
            hashMap.put("kw", adRequestParcel.f1334e);
        }
        if (adRequestParcel.f1336g != -1) {
            hashMap.put("tag_for_child_directed_treatment", Integer.valueOf(adRequestParcel.f1336g));
        }
        if (adRequestParcel.f1335f) {
            hashMap.put("adtest", "on");
        }
        if (adRequestParcel.f1330a >= 2) {
            if (adRequestParcel.f1337h) {
                hashMap.put("d_imp_hdr", Integer.valueOf(1));
            }
            if (!TextUtils.isEmpty(adRequestParcel.f1338i)) {
                hashMap.put("ppid", adRequestParcel.f1338i);
            }
            if (adRequestParcel.f1339j != null) {
                fq.m4648a((HashMap) hashMap, adRequestParcel.f1339j);
            }
        }
        if (adRequestParcel.f1330a >= 3 && adRequestParcel.f1341l != null) {
            hashMap.put("url", adRequestParcel.f1341l);
        }
        if (adRequestParcel.f1330a >= 5) {
            if (adRequestParcel.f1343n != null) {
                hashMap.put("custom_targeting", adRequestParcel.f1343n);
            }
            if (adRequestParcel.f1344o != null) {
                hashMap.put("category_exclusions", adRequestParcel.f1344o);
            }
            if (adRequestParcel.f1345p != null) {
                hashMap.put("request_agent", adRequestParcel.f1345p);
            }
        }
        if (adRequestParcel.f1330a >= 6 && adRequestParcel.f1346q != null) {
            hashMap.put("request_pkg", adRequestParcel.f1346q);
        }
    }

    private static void m4648a(HashMap<String, Object> hashMap, SearchAdRequestParcel searchAdRequestParcel) {
        Object obj;
        Object obj2 = null;
        if (Color.alpha(searchAdRequestParcel.f1360b) != 0) {
            hashMap.put("acolor", fq.m4641a(searchAdRequestParcel.f1360b));
        }
        if (Color.alpha(searchAdRequestParcel.f1361c) != 0) {
            hashMap.put("bgcolor", fq.m4641a(searchAdRequestParcel.f1361c));
        }
        if (!(Color.alpha(searchAdRequestParcel.f1362d) == 0 || Color.alpha(searchAdRequestParcel.f1363e) == 0)) {
            hashMap.put("gradientto", fq.m4641a(searchAdRequestParcel.f1362d));
            hashMap.put("gradientfrom", fq.m4641a(searchAdRequestParcel.f1363e));
        }
        if (Color.alpha(searchAdRequestParcel.f1364f) != 0) {
            hashMap.put("bcolor", fq.m4641a(searchAdRequestParcel.f1364f));
        }
        hashMap.put("bthick", Integer.toString(searchAdRequestParcel.f1365g));
        switch (searchAdRequestParcel.f1366h) {
            case 0:
                obj = "none";
                break;
            case 1:
                obj = "dashed";
                break;
            case 2:
                obj = "dotted";
                break;
            case 3:
                obj = "solid";
                break;
            default:
                obj = null;
                break;
        }
        if (obj != null) {
            hashMap.put("btype", obj);
        }
        switch (searchAdRequestParcel.f1367i) {
            case 0:
                obj2 = "light";
                break;
            case 1:
                obj2 = "medium";
                break;
            case 2:
                obj2 = "dark";
                break;
        }
        if (obj2 != null) {
            hashMap.put("callbuttoncolor", obj2);
        }
        if (searchAdRequestParcel.f1368j != null) {
            hashMap.put("channel", searchAdRequestParcel.f1368j);
        }
        if (Color.alpha(searchAdRequestParcel.f1369k) != 0) {
            hashMap.put("dcolor", fq.m4641a(searchAdRequestParcel.f1369k));
        }
        if (searchAdRequestParcel.f1370l != null) {
            hashMap.put("font", searchAdRequestParcel.f1370l);
        }
        if (Color.alpha(searchAdRequestParcel.f1371m) != 0) {
            hashMap.put("hcolor", fq.m4641a(searchAdRequestParcel.f1371m));
        }
        hashMap.put("headersize", Integer.toString(searchAdRequestParcel.f1372n));
        if (searchAdRequestParcel.f1373o != null) {
            hashMap.put("q", searchAdRequestParcel.f1373o);
        }
    }

    private static void m4649a(HashMap<String, Object> hashMap, fu fuVar, C0962a c0962a) {
        hashMap.put("am", Integer.valueOf(fuVar.f3168a));
        hashMap.put("cog", fq.m4640a(fuVar.f3169b));
        hashMap.put("coh", fq.m4640a(fuVar.f3170c));
        if (!TextUtils.isEmpty(fuVar.f3171d)) {
            hashMap.put("carrier", fuVar.f3171d);
        }
        hashMap.put("gl", fuVar.f3172e);
        if (fuVar.f3173f) {
            hashMap.put("simulator", Integer.valueOf(1));
        }
        if (fuVar.f3174g) {
            hashMap.put("is_sidewinder", Integer.valueOf(1));
        }
        hashMap.put("ma", fq.m4640a(fuVar.f3175h));
        hashMap.put("sp", fq.m4640a(fuVar.f3176i));
        hashMap.put("hl", fuVar.f3177j);
        if (!TextUtils.isEmpty(fuVar.f3178k)) {
            hashMap.put("mv", fuVar.f3178k);
        }
        hashMap.put("muv", Integer.valueOf(fuVar.f3179l));
        if (fuVar.f3180m != -2) {
            hashMap.put("cnt", Integer.valueOf(fuVar.f3180m));
        }
        hashMap.put("gnt", Integer.valueOf(fuVar.f3181n));
        hashMap.put("pt", Integer.valueOf(fuVar.f3182o));
        hashMap.put("rm", Integer.valueOf(fuVar.f3183p));
        hashMap.put("riv", Integer.valueOf(fuVar.f3184q));
        Bundle bundle = new Bundle();
        bundle.putString("build", fuVar.f3192y);
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("is_charging", fuVar.f3189v);
        bundle2.putDouble("battery_level", fuVar.f3188u);
        bundle.putBundle("battery", bundle2);
        bundle2 = new Bundle();
        bundle2.putInt("active_network_state", fuVar.f3191x);
        bundle2.putBoolean("active_network_metered", fuVar.f3190w);
        if (c0962a != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putInt("predicted_latency_micros", c0962a.f3197a);
            bundle3.putLong("predicted_down_throughput_bps", c0962a.f3198b);
            bundle3.putLong("predicted_up_throughput_bps", c0962a.f3199c);
            bundle2.putBundle("predictions", bundle3);
        }
        bundle.putBundle("network", bundle2);
        hashMap.put("device", bundle);
    }

    private static void m4650a(HashMap<String, Object> hashMap, String str) {
        if (str != null) {
            Map hashMap2 = new HashMap();
            hashMap2.put("token", str);
            hashMap.put("pan", hashMap2);
        }
    }
}
