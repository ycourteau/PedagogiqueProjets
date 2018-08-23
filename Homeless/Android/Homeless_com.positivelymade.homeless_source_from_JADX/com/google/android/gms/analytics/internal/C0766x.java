package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.analytics.C0700a;
import com.google.android.gms.analytics.C0703b;
import com.google.android.gms.analytics.C0704c;
import com.google.android.gms.analytics.C0708d;
import com.google.android.gms.analytics.C0709i;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.p028c.hs;
import com.google.android.gms.p028c.ht;
import com.google.android.gms.p028c.jg;
import com.google.android.gms.p028c.ji;
import com.google.android.gms.p028c.jk;
import com.google.android.gms.p028c.jp;
import com.google.android.gms.p028c.jq;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class C0766x extends C0717p {
    private boolean f2237a;
    private final C0759v f2238b;
    private final C0736i f2239c;
    private final C0734h f2240d;
    private final C0757u f2241e;
    private long f2242f = Long.MIN_VALUE;
    private final af f2243g;
    private final af f2244h;
    private final C0740k f2245i;
    private long f2246j;
    private boolean f2247k;

    class C07633 implements Runnable {
        final /* synthetic */ C0766x f2232a;

        C07633(C0766x c0766x) {
            this.f2232a = c0766x;
        }

        public void run() {
            this.f2232a.m3617c();
        }
    }

    class C07644 implements ai {
        final /* synthetic */ C0766x f2233a;

        C07644(C0766x c0766x) {
            this.f2233a = c0766x;
        }

        public void mo536a(Throwable th) {
            this.f2233a.m3604F();
        }
    }

    protected C0766x(C0750r c0750r, C0751s c0751s) {
        super(c0750r);
        C1305x.m6617a((Object) c0751s);
        this.f2240d = c0751s.m3521k(c0750r);
        this.f2238b = c0751s.m3523m(c0750r);
        this.f2239c = c0751s.m3524n(c0750r);
        this.f2241e = c0751s.m3525o(c0750r);
        this.f2245i = new C0740k(m3214n());
        this.f2243g = new af(this, c0750r) {
            final /* synthetic */ C0766x f2230a;

            public void mo555a() {
                this.f2230a.m3592J();
            }
        };
        this.f2244h = new af(this, c0750r) {
            final /* synthetic */ C0766x f2231a;

            public void mo555a() {
                this.f2231a.m3593K();
            }
        };
    }

    private void m3591I() {
        Context b = m3211k().m3490b();
        if (!C0700a.m3140a(b)) {
            m3208e("AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions.");
        } else if (!C0703b.m3145a(b)) {
            m3210f("AnalyticsService is not registered or is disabled. Analytics service at risk of not starting. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!C0704c.m3146a(b)) {
            m3208e("CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
        } else if (!C0708d.m3150a(b)) {
            m3208e("CampaignTrackingService is not registered or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
        }
    }

    private void m3592J() {
        m3609a(new C07644(this));
    }

    private void m3593K() {
        try {
            this.f2238b.m3581g();
            m3604F();
        } catch (SQLiteException e) {
            m3206d("Failed to delete stale hits", e);
        }
        this.f2244h.m3317a(m3217q().m3277C());
    }

    private boolean m3594L() {
        return this.f2247k ? false : (!m3217q().m3282a() || m3217q().m3283b()) && m3605G() > 0;
    }

    private void m3595M() {
        ah u = m3221u();
        if (u.m3327b() && !u.m3328c()) {
            long j = m3624j();
            if (j != 0 && Math.abs(m3214n().mo824a() - j) <= m3217q().m3292k()) {
                m3195a("Dispatch alarm scheduled (ms)", Long.valueOf(m3217q().m3291j()));
                u.m3329d();
            }
        }
    }

    private void m3596N() {
        m3595M();
        long G = m3605G();
        long d = m3223w().m3440d();
        if (d != 0) {
            d = G - Math.abs(m3214n().mo824a() - d);
            if (d <= 0) {
                d = Math.min(m3217q().m3289h(), G);
            }
        } else {
            d = Math.min(m3217q().m3289h(), G);
        }
        m3195a("Dispatch scheduled (ms)", Long.valueOf(d));
        if (this.f2243g.m3320c()) {
            this.f2243g.m3319b(Math.max(1, d + this.f2243g.m3318b()));
            return;
        }
        this.f2243g.m3317a(d);
    }

    private void m3597O() {
        m3598P();
        m3599Q();
    }

    private void m3598P() {
        if (this.f2243g.m3320c()) {
            m3198b("All hits dispatched or no network/service. Going to power save mode");
        }
        this.f2243g.m3321d();
    }

    private void m3599Q() {
        ah u = m3221u();
        if (u.m3328c()) {
            u.m3330e();
        }
    }

    private void m3600a(C0752t c0752t, jq jqVar) {
        C1305x.m6617a((Object) c0752t);
        C1305x.m6617a((Object) jqVar);
        C0709i c0709i = new C0709i(m3211k());
        c0709i.m3160b(c0752t.m3531c());
        c0709i.m3161b(c0752t.m3532d());
        jg j = c0709i.mo538j();
        ht htVar = (ht) j.m5357b(ht.class);
        htVar.m5135a("data");
        htVar.m5139b(true);
        j.m5356a((ji) jqVar);
        hs hsVar = (hs) j.m5357b(hs.class);
        jp jpVar = (jp) j.m5357b(jp.class);
        for (Entry entry : c0752t.m3534f().entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if ("an".equals(str)) {
                jpVar.m5395a(str2);
            } else if ("av".equals(str)) {
                jpVar.m5397b(str2);
            } else if ("aid".equals(str)) {
                jpVar.m5399c(str2);
            } else if ("aiid".equals(str)) {
                jpVar.m5401d(str2);
            } else if ("uid".equals(str)) {
                htVar.m5141c(str2);
            } else {
                hsVar.m5130a(str, str2);
            }
        }
        m3200b("Sending installation campaign to", c0752t.m3531c(), jqVar);
        j.m5355a(m3223w().m3438b());
        j.m5361e();
    }

    private boolean m3603g(String str) {
        return m3215o().checkCallingOrSelfPermission(str) == 0;
    }

    public void m3604F() {
        m3211k().m3507s();
        m3228D();
        if (!m3594L()) {
            this.f2240d.m3399b();
            m3597O();
        } else if (this.f2238b.m3580f()) {
            this.f2240d.m3399b();
            m3597O();
        } else {
            boolean z;
            if (((Boolean) ak.f2087J.m3343a()).booleanValue()) {
                z = true;
            } else {
                this.f2240d.m3398a();
                z = this.f2240d.m3402e();
            }
            if (z) {
                m3596N();
                return;
            }
            m3597O();
            m3595M();
        }
    }

    public long m3605G() {
        if (this.f2242f != Long.MIN_VALUE) {
            return this.f2242f;
        }
        return m3222v().m3469f() ? ((long) m3222v().m3470g()) * 1000 : m3217q().m3290i();
    }

    public void m3606H() {
        m3228D();
        m3213m();
        this.f2247k = true;
        this.f2241e.m3550d();
        m3604F();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long m3607a(com.google.android.gms.analytics.internal.C0752t r6, boolean r7) {
        /*
        r5 = this;
        com.google.android.gms.common.internal.C1305x.m6617a(r6);
        r5.m3228D();
        r5.m3213m();
        r0 = r5.f2238b;	 Catch:{ SQLiteException -> 0x0049 }
        r0.m3574b();	 Catch:{ SQLiteException -> 0x0049 }
        r0 = r5.f2238b;	 Catch:{ SQLiteException -> 0x0049 }
        r2 = r6.m3528a();	 Catch:{ SQLiteException -> 0x0049 }
        r1 = r6.m3530b();	 Catch:{ SQLiteException -> 0x0049 }
        r0.m3569a(r2, r1);	 Catch:{ SQLiteException -> 0x0049 }
        r0 = r5.f2238b;	 Catch:{ SQLiteException -> 0x0049 }
        r2 = r6.m3528a();	 Catch:{ SQLiteException -> 0x0049 }
        r1 = r6.m3530b();	 Catch:{ SQLiteException -> 0x0049 }
        r4 = r6.m3531c();	 Catch:{ SQLiteException -> 0x0049 }
        r0 = r0.m3565a(r2, r1, r4);	 Catch:{ SQLiteException -> 0x0049 }
        if (r7 != 0) goto L_0x0042;
    L_0x002f:
        r6.m3529a(r0);	 Catch:{ SQLiteException -> 0x0049 }
    L_0x0032:
        r2 = r5.f2238b;	 Catch:{ SQLiteException -> 0x0049 }
        r2.m3571a(r6);	 Catch:{ SQLiteException -> 0x0049 }
        r2 = r5.f2238b;	 Catch:{ SQLiteException -> 0x0049 }
        r2.m3575c();	 Catch:{ SQLiteException -> 0x0049 }
        r2 = r5.f2238b;	 Catch:{ SQLiteException -> 0x005e }
        r2.m3578d();	 Catch:{ SQLiteException -> 0x005e }
    L_0x0041:
        return r0;
    L_0x0042:
        r2 = 1;
        r2 = r2 + r0;
        r6.m3529a(r2);	 Catch:{ SQLiteException -> 0x0049 }
        goto L_0x0032;
    L_0x0049:
        r0 = move-exception;
        r1 = "Failed to update Analytics property";
        r5.m3209e(r1, r0);	 Catch:{ all -> 0x0065 }
        r0 = -1;
        r2 = r5.f2238b;	 Catch:{ SQLiteException -> 0x0057 }
        r2.m3578d();	 Catch:{ SQLiteException -> 0x0057 }
        goto L_0x0041;
    L_0x0057:
        r2 = move-exception;
        r3 = "Failed to end transaction";
        r5.m3209e(r3, r2);
        goto L_0x0041;
    L_0x005e:
        r2 = move-exception;
        r3 = "Failed to end transaction";
        r5.m3209e(r3, r2);
        goto L_0x0041;
    L_0x0065:
        r0 = move-exception;
        r1 = r5.f2238b;	 Catch:{ SQLiteException -> 0x006c }
        r1.m3578d();	 Catch:{ SQLiteException -> 0x006c }
    L_0x006b:
        throw r0;
    L_0x006c:
        r1 = move-exception;
        r2 = "Failed to end transaction";
        r5.m3209e(r2, r1);
        goto L_0x006b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.internal.x.a(com.google.android.gms.analytics.internal.t, boolean):long");
    }

    protected void mo540a() {
        this.f2238b.m3229E();
        this.f2239c.m3229E();
        this.f2241e.m3229E();
    }

    public void m3609a(ai aiVar) {
        m3610a(aiVar, this.f2246j);
    }

    public void m3610a(final ai aiVar, final long j) {
        jk.m5374d();
        m3228D();
        long j2 = -1;
        long d = m3223w().m3440d();
        if (d != 0) {
            j2 = Math.abs(m3214n().mo824a() - d);
        }
        m3199b("Dispatching local hits. Elapsed time since last dispatch (ms)", Long.valueOf(j2));
        if (!m3217q().m3282a()) {
            m3621g();
        }
        try {
            if (m3623i()) {
                m3218r().m5378a(new Runnable(this) {
                    final /* synthetic */ C0766x f2236c;

                    public void run() {
                        this.f2236c.m3610a(aiVar, j);
                    }
                });
                return;
            }
            m3223w().m3441e();
            m3604F();
            if (aiVar != null) {
                aiVar.mo536a(null);
            }
            if (this.f2246j != j) {
                this.f2240d.m3400c();
            }
        } catch (Throwable th) {
            m3209e("Local dispatch failed", th);
            m3223w().m3441e();
            m3604F();
            if (aiVar != null) {
                aiVar.mo536a(th);
            }
        }
    }

    public void m3611a(C0727c c0727c) {
        C1305x.m6617a((Object) c0727c);
        jk.m5374d();
        m3228D();
        if (this.f2247k) {
            m3202c("Hit delivery not possible. Missing network permissions. See http://goo.gl/8Rd3yj for instructions");
        } else {
            m3195a("Delivering hit", c0727c);
        }
        C0727c b = m3615b(c0727c);
        m3621g();
        if (this.f2241e.m3547a(b)) {
            m3202c("Hit sent to the device AnalyticsService for delivery");
        } else if (m3217q().m3282a()) {
            m3216p().m3391a(b, "Service unavailable on package side");
        } else {
            try {
                this.f2238b.m3570a(b);
                m3604F();
            } catch (SQLiteException e) {
                m3209e("Delivery failed to save hit to a database", e);
                m3216p().m3391a(b, "deliver: failed to insert hit to database");
            }
        }
    }

    protected void m3612a(C0752t c0752t) {
        m3213m();
        m3199b("Sending first hit to property", c0752t.m3531c());
        if (!m3223w().m3439c().m3445a(m3217q().m3280F())) {
            String f = m3223w().m3442f();
            if (!TextUtils.isEmpty(f)) {
                jq a = C0741l.m3449a(m3216p(), f);
                m3199b("Found relevant installation campaign", a);
                m3600a(c0752t, a);
            }
        }
    }

    public void m3613a(String str) {
        C1305x.m6619a(str);
        m3213m();
        m3212l();
        jq a = C0741l.m3449a(m3216p(), str);
        if (a == null) {
            m3206d("Parsing failed. Ignoring invalid campaign data", str);
            return;
        }
        CharSequence f = m3223w().m3442f();
        if (str.equals(f)) {
            m3208e("Ignoring duplicate install campaign");
        } else if (TextUtils.isEmpty(f)) {
            m3223w().m3437a(str);
            if (m3223w().m3439c().m3445a(m3217q().m3280F())) {
                m3206d("Campaign received too late, ignoring", a);
                return;
            }
            m3199b("Received installation campaign", a);
            for (C0752t a2 : this.f2238b.m3577d(0)) {
                m3600a(a2, a);
            }
        } else {
            m3207d("Ignoring multiple install campaigns. original, new", f, str);
        }
    }

    public void m3614a(boolean z) {
        m3604F();
    }

    C0727c m3615b(C0727c c0727c) {
        if (!TextUtils.isEmpty(c0727c.m3373h())) {
            return c0727c;
        }
        Pair a = m3223w().m3443g().m3432a();
        if (a == null) {
            return c0727c;
        }
        Long l = (Long) a.second;
        String str = l + ":" + ((String) a.first);
        Map hashMap = new HashMap(c0727c.m3367b());
        hashMap.put("_m", str);
        return C0727c.m3360a(this, c0727c, hashMap);
    }

    void m3616b() {
        m3228D();
        C1305x.m6622a(!this.f2237a, (Object) "Analytics backend already started");
        this.f2237a = true;
        if (!m3217q().m3282a()) {
            m3591I();
        }
        m3218r().m5378a(new C07633(this));
    }

    protected void m3617c() {
        m3228D();
        m3223w().m3438b();
        if (!m3603g("android.permission.ACCESS_NETWORK_STATE")) {
            m3210f("Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            m3606H();
        }
        if (!m3603g("android.permission.INTERNET")) {
            m3210f("Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            m3606H();
        }
        if (C0703b.m3145a(m3215o())) {
            m3198b("AnalyticsService registered in the app manifest and enabled");
        } else if (m3217q().m3282a()) {
            m3210f("Device AnalyticsService not registered! Hits will not be delivered reliably.");
        } else {
            m3208e("AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!(this.f2247k || m3217q().m3282a() || this.f2238b.m3580f())) {
            m3621g();
        }
        m3604F();
    }

    void m3618d() {
        m3213m();
        this.f2246j = m3214n().mo824a();
    }

    protected void m3619e() {
        m3213m();
        if (!m3217q().m3282a()) {
            m3622h();
        }
    }

    public void m3620f() {
        jk.m5374d();
        m3228D();
        m3198b("Service disconnected");
    }

    protected void m3621g() {
        if (!this.f2247k && m3217q().m3284c() && !this.f2241e.m3548b()) {
            if (this.f2245i.m3445a(m3217q().m3305x())) {
                this.f2245i.m3444a();
                m3198b("Connecting to service");
                if (this.f2241e.m3549c()) {
                    m3198b("Connected to service");
                    this.f2245i.m3446b();
                    m3619e();
                }
            }
        }
    }

    public void m3622h() {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:37)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:61)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r6 = this;
        com.google.android.gms.p028c.jk.m5374d();
        r6.m3228D();
        r6.m3212l();
        r0 = r6.m3217q();
        r0 = r0.m3284c();
        if (r0 != 0) goto L_0x0018;
    L_0x0013:
        r0 = "Service client disabled. Can't dispatch local hits to device AnalyticsService";
        r6.m3208e(r0);
    L_0x0018:
        r0 = r6.f2241e;
        r0 = r0.m3548b();
        if (r0 != 0) goto L_0x0026;
    L_0x0020:
        r0 = "Service not connected";
        r6.m3198b(r0);
    L_0x0025:
        return;
    L_0x0026:
        r0 = r6.f2238b;
        r0 = r0.m3580f();
        if (r0 != 0) goto L_0x0025;
    L_0x002e:
        r0 = "Dispatching local hits to device AnalyticsService";
        r6.m3198b(r0);
    L_0x0033:
        r0 = r6.f2238b;	 Catch:{ SQLiteException -> 0x004c }
        r1 = r6.m3217q();	 Catch:{ SQLiteException -> 0x004c }
        r1 = r1.m3293l();	 Catch:{ SQLiteException -> 0x004c }
        r2 = (long) r1;	 Catch:{ SQLiteException -> 0x004c }
        r1 = r0.m3573b(r2);	 Catch:{ SQLiteException -> 0x004c }
        r0 = r1.isEmpty();	 Catch:{ SQLiteException -> 0x004c }
        if (r0 == 0) goto L_0x0062;	 Catch:{ SQLiteException -> 0x004c }
    L_0x0048:
        r6.m3604F();	 Catch:{ SQLiteException -> 0x004c }
        goto L_0x0025;
    L_0x004c:
        r0 = move-exception;
        r1 = "Failed to read hits from store";
        r6.m3209e(r1, r0);
        r6.m3597O();
        goto L_0x0025;
    L_0x0056:
        r1.remove(r0);
        r2 = r6.f2238b;	 Catch:{ SQLiteException -> 0x007b }
        r4 = r0.m3368c();	 Catch:{ SQLiteException -> 0x007b }
        r2.m3576c(r4);	 Catch:{ SQLiteException -> 0x007b }
    L_0x0062:
        r0 = r1.isEmpty();
        if (r0 != 0) goto L_0x0033;
    L_0x0068:
        r0 = 0;
        r0 = r1.get(r0);
        r0 = (com.google.android.gms.analytics.internal.C0727c) r0;
        r2 = r6.f2241e;
        r2 = r2.m3547a(r0);
        if (r2 != 0) goto L_0x0056;
    L_0x0077:
        r6.m3604F();
        goto L_0x0025;
    L_0x007b:
        r0 = move-exception;
        r1 = "Failed to remove hit that was send for delivery";
        r6.m3209e(r1, r0);
        r6.m3597O();
        goto L_0x0025;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.internal.x.h():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected boolean m3623i() {
        /*
        r12 = this;
        r1 = 1;
        r2 = 0;
        com.google.android.gms.p028c.jk.m5374d();
        r12.m3228D();
        r0 = "Dispatching a batch of local hits";
        r12.m3198b(r0);
        r0 = r12.f2241e;
        r0 = r0.m3548b();
        if (r0 != 0) goto L_0x0032;
    L_0x0015:
        r0 = r12.m3217q();
        r0 = r0.m3282a();
        if (r0 != 0) goto L_0x0032;
    L_0x001f:
        r0 = r1;
    L_0x0020:
        r3 = r12.f2239c;
        r3 = r3.m3426b();
        if (r3 != 0) goto L_0x0034;
    L_0x0028:
        if (r0 == 0) goto L_0x0036;
    L_0x002a:
        if (r1 == 0) goto L_0x0036;
    L_0x002c:
        r0 = "No network or service available. Will retry later";
        r12.m3198b(r0);
    L_0x0031:
        return r2;
    L_0x0032:
        r0 = r2;
        goto L_0x0020;
    L_0x0034:
        r1 = r2;
        goto L_0x0028;
    L_0x0036:
        r0 = r12.m3217q();
        r0 = r0.m3293l();
        r1 = r12.m3217q();
        r1 = r1.m3294m();
        r0 = java.lang.Math.max(r0, r1);
        r6 = (long) r0;
        r3 = new java.util.ArrayList;
        r3.<init>();
        r4 = 0;
    L_0x0052:
        r0 = r12.f2238b;	 Catch:{ all -> 0x01ee }
        r0.m3574b();	 Catch:{ all -> 0x01ee }
        r3.clear();	 Catch:{ all -> 0x01ee }
        r0 = r12.f2238b;	 Catch:{ SQLiteException -> 0x00d3 }
        r8 = r0.m3573b(r6);	 Catch:{ SQLiteException -> 0x00d3 }
        r0 = r8.isEmpty();	 Catch:{ SQLiteException -> 0x00d3 }
        if (r0 == 0) goto L_0x0083;
    L_0x0066:
        r0 = "Store is empty, nothing to dispatch";
        r12.m3198b(r0);	 Catch:{ SQLiteException -> 0x00d3 }
        r12.m3597O();	 Catch:{ SQLiteException -> 0x00d3 }
        r0 = r12.f2238b;	 Catch:{ SQLiteException -> 0x0079 }
        r0.m3575c();	 Catch:{ SQLiteException -> 0x0079 }
        r0 = r12.f2238b;	 Catch:{ SQLiteException -> 0x0079 }
        r0.m3578d();	 Catch:{ SQLiteException -> 0x0079 }
        goto L_0x0031;
    L_0x0079:
        r0 = move-exception;
        r1 = "Failed to commit local dispatch transaction";
        r12.m3209e(r1, r0);
        r12.m3597O();
        goto L_0x0031;
    L_0x0083:
        r0 = "Hits loaded from store. count";
        r1 = r8.size();	 Catch:{ SQLiteException -> 0x00d3 }
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ SQLiteException -> 0x00d3 }
        r12.m3195a(r0, r1);	 Catch:{ SQLiteException -> 0x00d3 }
        r1 = r8.iterator();	 Catch:{ all -> 0x01ee }
    L_0x0094:
        r0 = r1.hasNext();	 Catch:{ all -> 0x01ee }
        if (r0 == 0) goto L_0x00f3;
    L_0x009a:
        r0 = r1.next();	 Catch:{ all -> 0x01ee }
        r0 = (com.google.android.gms.analytics.internal.C0727c) r0;	 Catch:{ all -> 0x01ee }
        r10 = r0.m3368c();	 Catch:{ all -> 0x01ee }
        r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1));
        if (r0 != 0) goto L_0x0094;
    L_0x00a8:
        r0 = "Database contains successfully uploaded hit";
        r1 = java.lang.Long.valueOf(r4);	 Catch:{ all -> 0x01ee }
        r3 = r8.size();	 Catch:{ all -> 0x01ee }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ all -> 0x01ee }
        r12.m3207d(r0, r1, r3);	 Catch:{ all -> 0x01ee }
        r12.m3597O();	 Catch:{ all -> 0x01ee }
        r0 = r12.f2238b;	 Catch:{ SQLiteException -> 0x00c8 }
        r0.m3575c();	 Catch:{ SQLiteException -> 0x00c8 }
        r0 = r12.f2238b;	 Catch:{ SQLiteException -> 0x00c8 }
        r0.m3578d();	 Catch:{ SQLiteException -> 0x00c8 }
        goto L_0x0031;
    L_0x00c8:
        r0 = move-exception;
        r1 = "Failed to commit local dispatch transaction";
        r12.m3209e(r1, r0);
        r12.m3597O();
        goto L_0x0031;
    L_0x00d3:
        r0 = move-exception;
        r1 = "Failed to read hits from persisted store";
        r12.m3206d(r1, r0);	 Catch:{ all -> 0x01ee }
        r12.m3597O();	 Catch:{ all -> 0x01ee }
        r0 = r12.f2238b;	 Catch:{ SQLiteException -> 0x00e8 }
        r0.m3575c();	 Catch:{ SQLiteException -> 0x00e8 }
        r0 = r12.f2238b;	 Catch:{ SQLiteException -> 0x00e8 }
        r0.m3578d();	 Catch:{ SQLiteException -> 0x00e8 }
        goto L_0x0031;
    L_0x00e8:
        r0 = move-exception;
        r1 = "Failed to commit local dispatch transaction";
        r12.m3209e(r1, r0);
        r12.m3597O();
        goto L_0x0031;
    L_0x00f3:
        r0 = r12.f2241e;	 Catch:{ all -> 0x01ee }
        r0 = r0.m3548b();	 Catch:{ all -> 0x01ee }
        if (r0 == 0) goto L_0x0205;
    L_0x00fb:
        r0 = r12.m3217q();	 Catch:{ all -> 0x01ee }
        r0 = r0.m3282a();	 Catch:{ all -> 0x01ee }
        if (r0 != 0) goto L_0x0205;
    L_0x0105:
        r0 = "Service connected, sending hits to the service";
        r12.m3198b(r0);	 Catch:{ all -> 0x01ee }
    L_0x010a:
        r0 = r8.isEmpty();	 Catch:{ all -> 0x01ee }
        if (r0 != 0) goto L_0x0205;
    L_0x0110:
        r0 = 0;
        r0 = r8.get(r0);	 Catch:{ all -> 0x01ee }
        r0 = (com.google.android.gms.analytics.internal.C0727c) r0;	 Catch:{ all -> 0x01ee }
        r1 = r12.f2241e;	 Catch:{ all -> 0x01ee }
        r1 = r1.m3547a(r0);	 Catch:{ all -> 0x01ee }
        if (r1 != 0) goto L_0x0148;
    L_0x011f:
        r0 = r4;
    L_0x0120:
        r4 = r12.f2239c;	 Catch:{ all -> 0x01ee }
        r4 = r4.m3426b();	 Catch:{ all -> 0x01ee }
        if (r4 == 0) goto L_0x0199;
    L_0x0128:
        r4 = r12.f2239c;	 Catch:{ all -> 0x01ee }
        r9 = r4.m3422a(r8);	 Catch:{ all -> 0x01ee }
        r10 = r9.iterator();	 Catch:{ all -> 0x01ee }
        r4 = r0;
    L_0x0133:
        r0 = r10.hasNext();	 Catch:{ all -> 0x01ee }
        if (r0 == 0) goto L_0x018d;
    L_0x0139:
        r0 = r10.next();	 Catch:{ all -> 0x01ee }
        r0 = (java.lang.Long) r0;	 Catch:{ all -> 0x01ee }
        r0 = r0.longValue();	 Catch:{ all -> 0x01ee }
        r4 = java.lang.Math.max(r4, r0);	 Catch:{ all -> 0x01ee }
        goto L_0x0133;
    L_0x0148:
        r10 = r0.m3368c();	 Catch:{ all -> 0x01ee }
        r4 = java.lang.Math.max(r4, r10);	 Catch:{ all -> 0x01ee }
        r8.remove(r0);	 Catch:{ all -> 0x01ee }
        r1 = "Hit sent do device AnalyticsService for delivery";
        r12.m3199b(r1, r0);	 Catch:{ all -> 0x01ee }
        r1 = r12.f2238b;	 Catch:{ SQLiteException -> 0x016d }
        r10 = r0.m3368c();	 Catch:{ SQLiteException -> 0x016d }
        r1.m3576c(r10);	 Catch:{ SQLiteException -> 0x016d }
        r0 = r0.m3368c();	 Catch:{ SQLiteException -> 0x016d }
        r0 = java.lang.Long.valueOf(r0);	 Catch:{ SQLiteException -> 0x016d }
        r3.add(r0);	 Catch:{ SQLiteException -> 0x016d }
        goto L_0x010a;
    L_0x016d:
        r0 = move-exception;
        r1 = "Failed to remove hit that was send for delivery";
        r12.m3209e(r1, r0);	 Catch:{ all -> 0x01ee }
        r12.m3597O();	 Catch:{ all -> 0x01ee }
        r0 = r12.f2238b;	 Catch:{ SQLiteException -> 0x0182 }
        r0.m3575c();	 Catch:{ SQLiteException -> 0x0182 }
        r0 = r12.f2238b;	 Catch:{ SQLiteException -> 0x0182 }
        r0.m3578d();	 Catch:{ SQLiteException -> 0x0182 }
        goto L_0x0031;
    L_0x0182:
        r0 = move-exception;
        r1 = "Failed to commit local dispatch transaction";
        r12.m3209e(r1, r0);
        r12.m3597O();
        goto L_0x0031;
    L_0x018d:
        r8.removeAll(r9);	 Catch:{ all -> 0x01ee }
        r0 = r12.f2238b;	 Catch:{ SQLiteException -> 0x01b6 }
        r0.m3572a(r9);	 Catch:{ SQLiteException -> 0x01b6 }
        r3.addAll(r9);	 Catch:{ SQLiteException -> 0x01b6 }
        r0 = r4;
    L_0x0199:
        r4 = r3.isEmpty();	 Catch:{ all -> 0x01ee }
        if (r4 == 0) goto L_0x01d6;
    L_0x019f:
        r0 = r12.f2238b;	 Catch:{ SQLiteException -> 0x01ab }
        r0.m3575c();	 Catch:{ SQLiteException -> 0x01ab }
        r0 = r12.f2238b;	 Catch:{ SQLiteException -> 0x01ab }
        r0.m3578d();	 Catch:{ SQLiteException -> 0x01ab }
        goto L_0x0031;
    L_0x01ab:
        r0 = move-exception;
        r1 = "Failed to commit local dispatch transaction";
        r12.m3209e(r1, r0);
        r12.m3597O();
        goto L_0x0031;
    L_0x01b6:
        r0 = move-exception;
        r1 = "Failed to remove successfully uploaded hits";
        r12.m3209e(r1, r0);	 Catch:{ all -> 0x01ee }
        r12.m3597O();	 Catch:{ all -> 0x01ee }
        r0 = r12.f2238b;	 Catch:{ SQLiteException -> 0x01cb }
        r0.m3575c();	 Catch:{ SQLiteException -> 0x01cb }
        r0 = r12.f2238b;	 Catch:{ SQLiteException -> 0x01cb }
        r0.m3578d();	 Catch:{ SQLiteException -> 0x01cb }
        goto L_0x0031;
    L_0x01cb:
        r0 = move-exception;
        r1 = "Failed to commit local dispatch transaction";
        r12.m3209e(r1, r0);
        r12.m3597O();
        goto L_0x0031;
    L_0x01d6:
        r4 = r12.f2238b;	 Catch:{ SQLiteException -> 0x01e3 }
        r4.m3575c();	 Catch:{ SQLiteException -> 0x01e3 }
        r4 = r12.f2238b;	 Catch:{ SQLiteException -> 0x01e3 }
        r4.m3578d();	 Catch:{ SQLiteException -> 0x01e3 }
        r4 = r0;
        goto L_0x0052;
    L_0x01e3:
        r0 = move-exception;
        r1 = "Failed to commit local dispatch transaction";
        r12.m3209e(r1, r0);
        r12.m3597O();
        goto L_0x0031;
    L_0x01ee:
        r0 = move-exception;
        r1 = r12.f2238b;	 Catch:{ SQLiteException -> 0x01fa }
        r1.m3575c();	 Catch:{ SQLiteException -> 0x01fa }
        r1 = r12.f2238b;	 Catch:{ SQLiteException -> 0x01fa }
        r1.m3578d();	 Catch:{ SQLiteException -> 0x01fa }
        throw r0;
    L_0x01fa:
        r0 = move-exception;
        r1 = "Failed to commit local dispatch transaction";
        r12.m3209e(r1, r0);
        r12.m3597O();
        goto L_0x0031;
    L_0x0205:
        r0 = r4;
        goto L_0x0120;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.internal.x.i():boolean");
    }

    public long m3624j() {
        jk.m5374d();
        m3228D();
        try {
            return this.f2238b.m3583h();
        } catch (SQLiteException e) {
            m3209e("Failed to get min/max hit times from local store", e);
            return 0;
        }
    }
}
