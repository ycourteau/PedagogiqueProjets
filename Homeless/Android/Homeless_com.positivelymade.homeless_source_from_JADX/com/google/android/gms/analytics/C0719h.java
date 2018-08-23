package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.analytics.internal.C0717p;
import com.google.android.gms.analytics.internal.C0721a;
import com.google.android.gms.analytics.internal.C0727c;
import com.google.android.gms.analytics.internal.C0731e;
import com.google.android.gms.analytics.internal.C0741l;
import com.google.android.gms.analytics.internal.C0748q;
import com.google.android.gms.analytics.internal.C0750r;
import com.google.android.gms.analytics.internal.C0752t;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.p028c.jp;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

public class C0719h extends C0717p {
    private boolean f2042a;
    private final Map<String, String> f2043b = new HashMap();
    private final Map<String, String> f2044c = new HashMap();
    private final C0731e f2045d;
    private final C0718a f2046e;

    private class C0718a extends C0717p {
        final /* synthetic */ C0719h f2039a;
        private long f2040b = -1;
        private boolean f2041c;

        protected C0718a(C0719h c0719h, C0750r c0750r) {
            this.f2039a = c0719h;
            super(c0750r);
        }

        protected void mo540a() {
        }

        public synchronized boolean m3232b() {
            boolean z;
            z = this.f2041c;
            this.f2041c = false;
            return z;
        }
    }

    C0719h(C0750r c0750r, String str, C0731e c0731e) {
        super(c0750r);
        if (str != null) {
            this.f2043b.put("&tid", str);
        }
        this.f2043b.put("useSecure", "1");
        this.f2043b.put("&a", Integer.toString(new Random().nextInt(Integer.MAX_VALUE) + 1));
        if (c0731e == null) {
            this.f2045d = new C0731e("tracking");
        } else {
            this.f2045d = c0731e;
        }
        this.f2046e = new C0718a(this, c0750r);
    }

    private static void m3234a(Map<String, String> map, Map<String, String> map2) {
        C1305x.m6617a((Object) map2);
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                String b = C0719h.m3237b(entry);
                if (b != null) {
                    map2.put(b, entry.getValue());
                }
            }
        }
    }

    private static boolean m3235a(Entry<String, String> entry) {
        String str = (String) entry.getKey();
        String str2 = (String) entry.getValue();
        return str.startsWith("&") && str.length() >= 2;
    }

    private static String m3237b(Entry<String, String> entry) {
        return !C0719h.m3235a((Entry) entry) ? null : ((String) entry.getKey()).substring(1);
    }

    private static void m3238b(Map<String, String> map, Map<String, String> map2) {
        C1305x.m6617a((Object) map2);
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                String b = C0719h.m3237b(entry);
                if (!(b == null || map2.containsKey(b))) {
                    map2.put(b, entry.getValue());
                }
            }
        }
    }

    protected void mo540a() {
        this.f2046e.m3229E();
        String c = m3222v().m3466c();
        if (c != null) {
            m3249a("&an", c);
        }
        c = m3222v().m3465b();
        if (c != null) {
            m3249a("&av", c);
        }
    }

    public void m3248a(String str) {
        m3249a("&cd", str);
    }

    public void m3249a(String str, String str2) {
        C1305x.m6618a((Object) str, (Object) "Key should be non-null");
        if (!TextUtils.isEmpty(str)) {
            this.f2043b.put(str, str2);
        }
    }

    public void m3250a(Map<String, String> map) {
        final long a = m3214n().mo824a();
        if (m3219s().m3175f()) {
            m3202c("AppOptOut is set to true. Not sending Google Analytics hit");
            return;
        }
        final boolean e = m3219s().m3174e();
        final Map hashMap = new HashMap();
        C0719h.m3234a(this.f2043b, hashMap);
        C0719h.m3234a((Map) map, hashMap);
        final boolean a2 = C0741l.m3457a((String) this.f2043b.get("useSecure"), true);
        C0719h.m3238b(this.f2044c, hashMap);
        this.f2044c.clear();
        final String str = (String) hashMap.get("t");
        if (TextUtils.isEmpty(str)) {
            m3216p().m3392a(hashMap, "Missing hit type parameter");
            return;
        }
        final String str2 = (String) hashMap.get("tid");
        if (TextUtils.isEmpty(str2)) {
            m3216p().m3392a(hashMap, "Missing tracking id parameter");
            return;
        }
        final boolean b = m3252b();
        synchronized (this) {
            if ("screenview".equalsIgnoreCase(str) || "pageview".equalsIgnoreCase(str) || "appview".equalsIgnoreCase(str) || TextUtils.isEmpty(str)) {
                int parseInt = Integer.parseInt((String) this.f2043b.get("&a")) + 1;
                if (parseInt >= Integer.MAX_VALUE) {
                    parseInt = 1;
                }
                this.f2043b.put("&a", Integer.toString(parseInt));
            }
        }
        m3218r().m5378a(new Runnable(this) {
            final /* synthetic */ C0719h f2035h;

            public void run() {
                boolean z = true;
                if (this.f2035h.f2046e.m3232b()) {
                    hashMap.put("sc", "start");
                }
                C0741l.m3459b(hashMap, "cid", this.f2035h.m3219s().m3177h());
                String str = (String) hashMap.get("sf");
                if (str != null) {
                    double a = C0741l.m3447a(str, 100.0d);
                    if (C0741l.m3454a(a, (String) hashMap.get("cid"))) {
                        this.f2035h.m3199b("Sampling enabled. Hit sampled out. sample rate", Double.valueOf(a));
                        return;
                    }
                }
                C0721a b = this.f2035h.m3225y();
                if (b) {
                    C0741l.m3453a(hashMap, "ate", b.m3263b());
                    C0741l.m3451a(hashMap, "adid", b.m3264c());
                } else {
                    hashMap.remove("ate");
                    hashMap.remove("adid");
                }
                jp c = this.f2035h.m3226z().m3587c();
                C0741l.m3451a(hashMap, "an", c.m5392a());
                C0741l.m3451a(hashMap, "av", c.m5396b());
                C0741l.m3451a(hashMap, "aid", c.m5398c());
                C0741l.m3451a(hashMap, "aiid", c.m5400d());
                hashMap.put("v", "1");
                hashMap.put("_v", C0748q.f2185b);
                C0741l.m3451a(hashMap, "ul", this.f2035h.m3193A().m3323b().m5437f());
                C0741l.m3451a(hashMap, "sr", this.f2035h.m3193A().m3324c());
                boolean z2 = str.equals("transaction") || str.equals("item");
                if (z2 || this.f2035h.f2045d.m3381a()) {
                    long a2 = C0741l.m3448a((String) hashMap.get("ht"));
                    if (a2 == 0) {
                        a2 = a;
                    }
                    if (e) {
                        this.f2035h.m3216p().m3203c("Dry run enabled. Would have sent hit", new C0727c(this.f2035h, hashMap, a2, a2));
                        return;
                    }
                    String str2 = (String) hashMap.get("cid");
                    Map hashMap = new HashMap();
                    C0741l.m3452a(hashMap, "uid", hashMap);
                    C0741l.m3452a(hashMap, "an", hashMap);
                    C0741l.m3452a(hashMap, "aid", hashMap);
                    C0741l.m3452a(hashMap, "av", hashMap);
                    C0741l.m3452a(hashMap, "aiid", hashMap);
                    String str3 = str2;
                    if (TextUtils.isEmpty((CharSequence) hashMap.get("adid"))) {
                        z = false;
                    }
                    hashMap.put("_s", String.valueOf(this.f2035h.m3220t().m3475a(new C0752t(0, str2, str3, z, 0, hashMap))));
                    this.f2035h.m3220t().m3478a(new C0727c(this.f2035h, hashMap, a2, a2));
                    return;
                }
                this.f2035h.m3216p().m3392a(hashMap, "Too many hits sent too quickly, rate limiting invoked");
            }
        });
    }

    public void m3251a(boolean z) {
        this.f2042a = z;
    }

    boolean m3252b() {
        return this.f2042a;
    }
}
