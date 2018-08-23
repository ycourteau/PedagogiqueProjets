package com.google.android.gms.p028c;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C0618p;
import com.google.android.gms.ads.internal.overlay.C0608d;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.p028c.hg;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@fn
public final class cf {
    public static final cg f2579a = new C08491();
    public static final cg f2580b = new C08524();
    public static final cg f2581c = new C08535();
    public static final cg f2582d = new C08546();
    public static final cg f2583e = new C08557();
    public static final cg f2584f = new C08568();
    public static final cg f2585g = new C08579();
    public static final cg f2586h = new cg() {
        public void mo524a(hg hgVar, Map<String, String> map) {
            C0691b.m3099c("Received log message: " + ((String) map.get("string")));
        }
    };
    public static final cg f2587i = new C08502();
    public static final cg f2588j = new C08513();
    public static final cg f2589k = new co();
    public static final cg f2590l = new cs();

    static class C08491 implements cg {
        C08491() {
        }

        public void mo524a(hg hgVar, Map<String, String> map) {
        }
    }

    static class C08502 implements cg {
        C08502() {
        }

        public void mo524a(hg hgVar, Map<String, String> map) {
            String str = (String) map.get("ty");
            String str2 = (String) map.get("td");
            try {
                int parseInt = Integer.parseInt((String) map.get("tx"));
                int parseInt2 = Integer.parseInt(str);
                int parseInt3 = Integer.parseInt(str2);
                C1141o k = hgVar.mo790k();
                if (k != null) {
                    k.m5854a().mo440a(parseInt, parseInt2, parseInt3);
                }
            } catch (NumberFormatException e) {
                C0691b.m3103e("Could not parse touch parameters from gmsg.");
            }
        }
    }

    static class C08513 implements cg {
        C08513() {
        }

        public void mo524a(hg hgVar, Map<String, String> map) {
            if (((Boolean) az.ai.m3878c()).booleanValue()) {
                hgVar.mo778c(!Boolean.parseBoolean((String) map.get("disabled")));
            }
        }
    }

    static class C08524 implements cg {
        C08524() {
        }

        public void mo524a(hg hgVar, Map<String, String> map) {
            String str = (String) map.get("urls");
            if (TextUtils.isEmpty(str)) {
                C0691b.m3103e("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String[] split = str.split(",");
            Map hashMap = new HashMap();
            PackageManager packageManager = hgVar.getContext().getPackageManager();
            for (String str2 : split) {
                String[] split2 = str2.split(";", 2);
                hashMap.put(str2, Boolean.valueOf(packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) != null));
            }
            hgVar.mo768a("openableURLs", hashMap);
        }
    }

    static class C08535 implements cg {
        C08535() {
        }

        public void mo524a(hg hgVar, Map<String, String> map) {
            PackageManager packageManager = hgVar.getContext().getPackageManager();
            try {
                try {
                    JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                    JSONObject jSONObject = new JSONObject();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            String optString = jSONObject2.optString("id");
                            Object optString2 = jSONObject2.optString("u");
                            Object optString3 = jSONObject2.optString("i");
                            Object optString4 = jSONObject2.optString("m");
                            Object optString5 = jSONObject2.optString("p");
                            Object optString6 = jSONObject2.optString("c");
                            jSONObject2.optString("f");
                            jSONObject2.optString("e");
                            Intent intent = new Intent();
                            if (!TextUtils.isEmpty(optString2)) {
                                intent.setData(Uri.parse(optString2));
                            }
                            if (!TextUtils.isEmpty(optString3)) {
                                intent.setAction(optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                intent.setType(optString4);
                            }
                            if (!TextUtils.isEmpty(optString5)) {
                                intent.setPackage(optString5);
                            }
                            if (!TextUtils.isEmpty(optString6)) {
                                String[] split = optString6.split("/", 2);
                                if (split.length == 2) {
                                    intent.setComponent(new ComponentName(split[0], split[1]));
                                }
                            }
                            try {
                                jSONObject.put(optString, packageManager.resolveActivity(intent, 65536) != null);
                            } catch (Throwable e) {
                                C0691b.m3098b("Error constructing openable urls response.", e);
                            }
                        } catch (Throwable e2) {
                            C0691b.m3098b("Error parsing the intent data.", e2);
                        }
                    }
                    hgVar.mo769a("openableIntents", jSONObject);
                } catch (JSONException e3) {
                    hgVar.mo769a("openableIntents", new JSONObject());
                }
            } catch (JSONException e4) {
                hgVar.mo769a("openableIntents", new JSONObject());
            }
        }
    }

    static class C08546 implements cg {
        C08546() {
        }

        public void mo524a(hg hgVar, Map<String, String> map) {
            String str = (String) map.get("u");
            if (str == null) {
                C0691b.m3103e("URL missing from click GMSG.");
                return;
            }
            String b = C0618p.m2796e().m4869b(hgVar.getContext(), str, hgVar.mo800r());
            Uri parse = Uri.parse(b);
            try {
                C1141o k = hgVar.mo790k();
                if (k != null && k.m5857b(parse)) {
                    parse = k.m5853a(parse, hgVar.getContext());
                }
            } catch (C1142p e) {
                C0691b.m3103e("Unable to append parameter to URL: " + b);
            }
            new gv(hgVar.getContext(), hgVar.mo791l().f1976b, parse.toString()).m2829g();
        }
    }

    static class C08557 implements cg {
        C08557() {
        }

        public void mo524a(hg hgVar, Map<String, String> map) {
            C0608d f = hgVar.mo782f();
            if (f != null) {
                f.m2711a();
                return;
            }
            f = hgVar.mo783g();
            if (f != null) {
                f.m2711a();
            } else {
                C0691b.m3103e("A GMSG tried to close something that wasn't an overlay.");
            }
        }
    }

    static class C08568 implements cg {
        C08568() {
        }

        public void mo524a(hg hgVar, Map<String, String> map) {
            hgVar.mo775b("1".equals(map.get("custom_close")));
        }
    }

    static class C08579 implements cg {
        C08579() {
        }

        public void mo524a(hg hgVar, Map<String, String> map) {
            String str = (String) map.get("u");
            if (str == null) {
                C0691b.m3103e("URL missing from httpTrack GMSG.");
            } else {
                new gv(hgVar.getContext(), hgVar.mo791l().f1976b, str).m2829g();
            }
        }
    }
}
