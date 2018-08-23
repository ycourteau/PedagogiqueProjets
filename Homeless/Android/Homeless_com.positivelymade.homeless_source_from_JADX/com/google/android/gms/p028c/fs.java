package com.google.android.gms.p028c;

import com.google.android.gms.ads.internal.C0618p;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.C0691b;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@fn
public final class fs {
    private String f3114a;
    private String f3115b;
    private String f3116c;
    private List<String> f3117d;
    private String f3118e;
    private String f3119f;
    private List<String> f3120g;
    private long f3121h = -1;
    private boolean f3122i = false;
    private final long f3123j = -1;
    private List<String> f3124k;
    private long f3125l = -1;
    private int f3126m = -1;
    private boolean f3127n = false;
    private boolean f3128o = false;
    private boolean f3129p = false;
    private boolean f3130q = true;
    private int f3131r = 0;
    private final AdRequestInfoParcel f3132s;

    public fs(AdRequestInfoParcel adRequestInfoParcel) {
        this.f3132s = adRequestInfoParcel;
    }

    static String m4662a(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        return (list == null || list.isEmpty()) ? null : (String) list.get(0);
    }

    static long m4663b(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        if (!(list == null || list.isEmpty())) {
            String str2 = (String) list.get(0);
            try {
                return (long) (Float.parseFloat(str2) * 1000.0f);
            } catch (NumberFormatException e) {
                C0691b.m3103e("Could not parse float from " + str + " header: " + str2);
            }
        }
        return -1;
    }

    private void m4664b(Map<String, List<String>> map) {
        this.f3114a = fs.m4662a(map, "X-Afma-Ad-Size");
    }

    static List<String> m4665c(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        if (!(list == null || list.isEmpty())) {
            String str2 = (String) list.get(0);
            if (str2 != null) {
                return Arrays.asList(str2.trim().split("\\s+"));
            }
        }
        return null;
    }

    private void m4666c(Map<String, List<String>> map) {
        List c = fs.m4665c(map, "X-Afma-Click-Tracking-Urls");
        if (c != null) {
            this.f3117d = c;
        }
    }

    private void m4667d(Map<String, List<String>> map) {
        List list = (List) map.get("X-Afma-Debug-Dialog");
        if (list != null && !list.isEmpty()) {
            this.f3118e = (String) list.get(0);
        }
    }

    private boolean m4668d(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        return (list == null || list.isEmpty() || !Boolean.valueOf((String) list.get(0)).booleanValue()) ? false : true;
    }

    private void m4669e(Map<String, List<String>> map) {
        List c = fs.m4665c(map, "X-Afma-Tracking-Urls");
        if (c != null) {
            this.f3120g = c;
        }
    }

    private void m4670f(Map<String, List<String>> map) {
        long b = fs.m4663b(map, "X-Afma-Interstitial-Timeout");
        if (b != -1) {
            this.f3121h = b;
        }
    }

    private void m4671g(Map<String, List<String>> map) {
        this.f3119f = fs.m4662a(map, "X-Afma-ActiveView");
    }

    private void m4672h(Map<String, List<String>> map) {
        boolean z = this.f3128o;
        int i = (this.f3132s == null || this.f3132s.f1849m == 0) ? 0 : 1;
        this.f3128o = i | z;
    }

    private void m4673i(Map<String, List<String>> map) {
        this.f3127n |= m4668d(map, "X-Afma-Custom-Rendering-Allowed");
    }

    private void m4674j(Map<String, List<String>> map) {
        this.f3122i |= m4668d(map, "X-Afma-Mediation");
    }

    private void m4675k(Map<String, List<String>> map) {
        List c = fs.m4665c(map, "X-Afma-Manual-Tracking-Urls");
        if (c != null) {
            this.f3124k = c;
        }
    }

    private void m4676l(Map<String, List<String>> map) {
        long b = fs.m4663b(map, "X-Afma-Refresh-Rate");
        if (b != -1) {
            this.f3125l = b;
        }
    }

    private void m4677m(Map<String, List<String>> map) {
        List list = (List) map.get("X-Afma-Orientation");
        if (list != null && !list.isEmpty()) {
            String str = (String) list.get(0);
            if ("portrait".equalsIgnoreCase(str)) {
                this.f3126m = C0618p.m2798g().mo739b();
            } else if ("landscape".equalsIgnoreCase(str)) {
                this.f3126m = C0618p.m2798g().mo737a();
            }
        }
    }

    private void m4678n(Map<String, List<String>> map) {
        List list = (List) map.get("X-Afma-Use-HTTPS");
        if (list != null && !list.isEmpty()) {
            this.f3129p = Boolean.valueOf((String) list.get(0)).booleanValue();
        }
    }

    private void m4679o(Map<String, List<String>> map) {
        List list = (List) map.get("X-Afma-Content-Url-Opted-Out");
        if (list != null && !list.isEmpty()) {
            this.f3130q = Boolean.valueOf((String) list.get(0)).booleanValue();
        }
    }

    private void m4680p(Map<String, List<String>> map) {
        List<String> c = fs.m4665c(map, "X-Afma-OAuth-Token-Status");
        this.f3131r = 0;
        if (c != null) {
            for (String str : c) {
                if ("Clear".equalsIgnoreCase(str)) {
                    this.f3131r = 1;
                    return;
                } else if ("No-Op".equalsIgnoreCase(str)) {
                    this.f3131r = 0;
                    return;
                }
            }
        }
    }

    public AdResponseParcel m4681a(long j) {
        return new AdResponseParcel(this.f3132s, this.f3115b, this.f3116c, this.f3117d, this.f3120g, this.f3121h, this.f3122i, -1, this.f3124k, this.f3125l, this.f3126m, this.f3114a, j, this.f3118e, this.f3119f, this.f3127n, this.f3128o, this.f3129p, this.f3130q, false, this.f3131r);
    }

    public void m4682a(String str, Map<String, List<String>> map, String str2) {
        this.f3115b = str;
        this.f3116c = str2;
        m4683a((Map) map);
    }

    public void m4683a(Map<String, List<String>> map) {
        m4664b(map);
        m4666c(map);
        m4667d(map);
        m4669e(map);
        m4670f(map);
        m4674j(map);
        m4675k(map);
        m4676l(map);
        m4677m(map);
        m4671g(map);
        m4678n(map);
        m4673i(map);
        m4672h(map);
        m4679o(map);
        m4680p(map);
    }
}
