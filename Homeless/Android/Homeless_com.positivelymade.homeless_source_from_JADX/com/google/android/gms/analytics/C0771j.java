package com.google.android.gms.analytics;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.C0716o;
import com.google.android.gms.analytics.internal.C0727c;
import com.google.android.gms.analytics.internal.C0741l;
import com.google.android.gms.analytics.internal.C0748q;
import com.google.android.gms.analytics.internal.C0750r;
import com.google.android.gms.analytics.internal.C0752t;
import com.google.android.gms.analytics.p031a.C0697a;
import com.google.android.gms.analytics.p031a.C0698b;
import com.google.android.gms.analytics.p031a.C0699c;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.p028c.hp;
import com.google.android.gms.p028c.hq;
import com.google.android.gms.p028c.hs;
import com.google.android.gms.p028c.ht;
import com.google.android.gms.p028c.jg;
import com.google.android.gms.p028c.jm;
import com.google.android.gms.p028c.jp;
import com.google.android.gms.p028c.jq;
import com.google.android.gms.p028c.jr;
import com.google.android.gms.p028c.js;
import com.google.android.gms.p028c.jt;
import com.google.android.gms.p028c.ju;
import com.google.android.gms.p028c.jv;
import com.google.android.gms.p028c.jw;
import com.google.android.gms.p028c.jx;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class C0771j extends C0716o implements jm {
    private static DecimalFormat f2259a;
    private final C0750r f2260b;
    private final String f2261c;
    private final Uri f2262d;
    private final boolean f2263e;
    private final boolean f2264f;

    public C0771j(C0750r c0750r, String str) {
        this(c0750r, str, true, false);
    }

    public C0771j(C0750r c0750r, String str, boolean z, boolean z2) {
        super(c0750r);
        C1305x.m6619a(str);
        this.f2260b = c0750r;
        this.f2261c = str;
        this.f2263e = z;
        this.f2264f = z2;
        this.f2262d = C0771j.m3639a(this.f2261c);
    }

    static Uri m3639a(String str) {
        C1305x.m6619a(str);
        Builder builder = new Builder();
        builder.scheme("uri");
        builder.authority("google-analytics.com");
        builder.path(str);
        return builder.build();
    }

    static String m3640a(double d) {
        if (f2259a == null) {
            f2259a = new DecimalFormat("0.######");
        }
        return f2259a.format(d);
    }

    private static String m3641a(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            return TextUtils.isEmpty(str) ? null : str;
        } else if (!(obj instanceof Double)) {
            return obj instanceof Boolean ? obj != Boolean.FALSE ? "1" : null : String.valueOf(obj);
        } else {
            Double d = (Double) obj;
            return d.doubleValue() != 0.0d ? C0771j.m3640a(d.doubleValue()) : null;
        }
    }

    private static String m3642a(Map<String, String> map) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Entry entry : map.entrySet()) {
            if (stringBuilder.length() != 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append((String) entry.getKey());
            stringBuilder.append("=");
            stringBuilder.append((String) entry.getValue());
        }
        return stringBuilder.toString();
    }

    private static void m3643a(Map<String, String> map, String str, double d) {
        if (d != 0.0d) {
            map.put(str, C0771j.m3640a(d));
        }
    }

    private static void m3644a(Map<String, String> map, String str, int i, int i2) {
        if (i > 0 && i2 > 0) {
            map.put(str, i + "x" + i2);
        }
    }

    private static void m3645a(Map<String, String> map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    private static void m3646a(Map<String, String> map, String str, boolean z) {
        if (z) {
            map.put(str, "1");
        }
    }

    public static Map<String, String> m3647b(jg jgVar) {
        CharSequence a;
        Map hashMap = new HashMap();
        hs hsVar = (hs) jgVar.m5354a(hs.class);
        if (hsVar != null) {
            for (Entry entry : hsVar.m5127a().entrySet()) {
                String a2 = C0771j.m3641a(entry.getValue());
                if (a2 != null) {
                    hashMap.put(entry.getKey(), a2);
                }
            }
        }
        ht htVar = (ht) jgVar.m5354a(ht.class);
        if (htVar != null) {
            C0771j.m3645a(hashMap, "t", htVar.m5131a());
            C0771j.m3645a(hashMap, "cid", htVar.m5137b());
            C0771j.m3645a(hashMap, "uid", htVar.m5140c());
            C0771j.m3645a(hashMap, "sc", htVar.m5146f());
            C0771j.m3643a(hashMap, "sf", htVar.m5148h());
            C0771j.m3646a(hashMap, "ni", htVar.m5147g());
            C0771j.m3645a(hashMap, "adid", htVar.m5142d());
            C0771j.m3646a(hashMap, "ate", htVar.m5145e());
        }
        jv jvVar = (jv) jgVar.m5354a(jv.class);
        if (jvVar != null) {
            C0771j.m3645a(hashMap, "cd", jvVar.m5468b());
            C0771j.m3643a(hashMap, "a", (double) jvVar.m5472c());
            C0771j.m3645a(hashMap, "dr", jvVar.m5476f());
        }
        jt jtVar = (jt) jgVar.m5354a(jt.class);
        if (jtVar != null) {
            C0771j.m3645a(hashMap, "ec", jtVar.m5445a());
            C0771j.m3645a(hashMap, "ea", jtVar.m5450b());
            C0771j.m3645a(hashMap, "el", jtVar.m5452c());
            C0771j.m3643a(hashMap, "ev", (double) jtVar.m5454d());
        }
        jq jqVar = (jq) jgVar.m5354a(jq.class);
        if (jqVar != null) {
            C0771j.m3645a(hashMap, "cn", jqVar.m5402a());
            C0771j.m3645a(hashMap, "cs", jqVar.m5406b());
            C0771j.m3645a(hashMap, "cm", jqVar.m5408c());
            C0771j.m3645a(hashMap, "ck", jqVar.m5410d());
            C0771j.m3645a(hashMap, "cc", jqVar.m5412e());
            C0771j.m3645a(hashMap, "ci", jqVar.m5414f());
            C0771j.m3645a(hashMap, "anid", jqVar.m5416g());
            C0771j.m3645a(hashMap, "gclid", jqVar.m5418h());
            C0771j.m3645a(hashMap, "dclid", jqVar.m5420i());
            C0771j.m3645a(hashMap, "aclid", jqVar.m5422j());
        }
        ju juVar = (ju) jgVar.m5354a(ju.class);
        if (juVar != null) {
            C0771j.m3645a(hashMap, "exd", juVar.m5455a());
            C0771j.m3646a(hashMap, "exf", juVar.m5460b());
        }
        jw jwVar = (jw) jgVar.m5354a(jw.class);
        if (jwVar != null) {
            C0771j.m3645a(hashMap, "sn", jwVar.m5480a());
            C0771j.m3645a(hashMap, "sa", jwVar.m5484b());
            C0771j.m3645a(hashMap, "st", jwVar.m5486c());
        }
        jx jxVar = (jx) jgVar.m5354a(jx.class);
        if (jxVar != null) {
            C0771j.m3645a(hashMap, "utv", jxVar.m5488a());
            C0771j.m3643a(hashMap, "utt", (double) jxVar.m5493b());
            C0771j.m3645a(hashMap, "utc", jxVar.m5495c());
            C0771j.m3645a(hashMap, "utl", jxVar.m5497d());
        }
        hp hpVar = (hp) jgVar.m5354a(hp.class);
        if (hpVar != null) {
            for (Entry entry2 : hpVar.m5120a().entrySet()) {
                a = C0772k.m3650a(((Integer) entry2.getKey()).intValue());
                if (!TextUtils.isEmpty(a)) {
                    hashMap.put(a, entry2.getValue());
                }
            }
        }
        hq hqVar = (hq) jgVar.m5354a(hq.class);
        if (hqVar != null) {
            for (Entry entry22 : hqVar.m5123a().entrySet()) {
                a = C0772k.m3652b(((Integer) entry22.getKey()).intValue());
                if (!TextUtils.isEmpty(a)) {
                    hashMap.put(a, C0771j.m3640a(((Double) entry22.getValue()).doubleValue()));
                }
            }
        }
        js jsVar = (js) jgVar.m5354a(js.class);
        if (jsVar != null) {
            C0698b a3 = jsVar.m5438a();
            if (a3 != null) {
                for (Entry entry3 : a3.m3126a().entrySet()) {
                    if (((String) entry3.getKey()).startsWith("&")) {
                        hashMap.put(((String) entry3.getKey()).substring(1), entry3.getValue());
                    } else {
                        hashMap.put(entry3.getKey(), entry3.getValue());
                    }
                }
            }
            int i = 1;
            for (C0699c e : jsVar.m5444d()) {
                hashMap.putAll(e.m3139e(C0772k.m3656f(i)));
                i++;
            }
            i = 1;
            for (C0697a g : jsVar.m5442b()) {
                hashMap.putAll(g.m3122g(C0772k.m3654d(i)));
                i++;
            }
            i = 1;
            for (Entry entry222 : jsVar.m5443c().entrySet()) {
                List<C0697a> list = (List) entry222.getValue();
                String i2 = C0772k.m3659i(i);
                int i3 = 1;
                for (C0697a g2 : list) {
                    hashMap.putAll(g2.m3122g(i2 + C0772k.m3657g(i3)));
                    i3++;
                }
                if (!TextUtils.isEmpty((CharSequence) entry222.getKey())) {
                    hashMap.put(i2 + "nm", entry222.getKey());
                }
                i++;
            }
        }
        jr jrVar = (jr) jgVar.m5354a(jr.class);
        if (jrVar != null) {
            C0771j.m3645a(hashMap, "ul", jrVar.m5437f());
            C0771j.m3643a(hashMap, "sd", (double) jrVar.m5424a());
            C0771j.m3644a(hashMap, "sr", jrVar.m5429b(), jrVar.m5431c());
            C0771j.m3644a(hashMap, "vp", jrVar.m5433d(), jrVar.m5435e());
        }
        jp jpVar = (jp) jgVar.m5354a(jp.class);
        if (jpVar != null) {
            C0771j.m3645a(hashMap, "an", jpVar.m5392a());
            C0771j.m3645a(hashMap, "aid", jpVar.m5398c());
            C0771j.m3645a(hashMap, "aiid", jpVar.m5400d());
            C0771j.m3645a(hashMap, "av", jpVar.m5396b());
        }
        return hashMap;
    }

    public Uri mo556a() {
        return this.f2262d;
    }

    public void mo557a(jg jgVar) {
        C1305x.m6617a((Object) jgVar);
        C1305x.m6626b(jgVar.m5362f(), "Can't deliver not submitted measurement");
        C1305x.m6628c("deliver should be called on worker thread");
        jg a = jgVar.m5353a();
        ht htVar = (ht) a.m5357b(ht.class);
        if (TextUtils.isEmpty(htVar.m5131a())) {
            m3216p().m3392a(C0771j.m3647b(a), "Ignoring measurement without type");
        } else if (TextUtils.isEmpty(htVar.m5137b())) {
            m3216p().m3392a(C0771j.m3647b(a), "Ignoring measurement without client id");
        } else if (!this.f2260b.m3499k().m3175f()) {
            double h = htVar.m5148h();
            if (C0741l.m3454a(h, htVar.m5137b())) {
                m3199b("Sampling enabled. Hit sampled out. sampling rate", Double.valueOf(h));
                return;
            }
            Map b = C0771j.m3647b(a);
            b.put("v", "1");
            b.put("_v", C0748q.f2185b);
            b.put("tid", this.f2261c);
            if (this.f2260b.m3499k().m3174e()) {
                m3203c("Dry run is enabled. GoogleAnalytics would have sent", C0771j.m3642a(b));
                return;
            }
            Map hashMap = new HashMap();
            C0741l.m3451a(hashMap, "uid", htVar.m5140c());
            jp jpVar = (jp) jgVar.m5354a(jp.class);
            if (jpVar != null) {
                C0741l.m3451a(hashMap, "an", jpVar.m5392a());
                C0741l.m3451a(hashMap, "aid", jpVar.m5398c());
                C0741l.m3451a(hashMap, "av", jpVar.m5396b());
                C0741l.m3451a(hashMap, "aiid", jpVar.m5400d());
            }
            b.put("_s", String.valueOf(m3220t().m3475a(new C0752t(0, htVar.m5137b(), this.f2261c, !TextUtils.isEmpty(htVar.m5142d()), 0, hashMap))));
            m3220t().m3478a(new C0727c(m3216p(), b, jgVar.m5360d(), true));
        }
    }
}
