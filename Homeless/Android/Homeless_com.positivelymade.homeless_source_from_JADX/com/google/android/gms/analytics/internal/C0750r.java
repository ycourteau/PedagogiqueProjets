package com.google.android.gms.analytics.internal;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.analytics.C0710e;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.p028c.ik;
import com.google.android.gms.p028c.il;
import com.google.android.gms.p028c.jk;
import java.lang.Thread.UncaughtExceptionHandler;

public class C0750r {
    private static C0750r f2187a;
    private final Context f2188b;
    private final Context f2189c;
    private final ik f2190d;
    private final ad f2191e;
    private final C0733g f2192f;
    private final jk f2193g;
    private final C0747n f2194h;
    private final ah f2195i;
    private final C0742m f2196j;
    private final C0739j f2197k;
    private final C0710e f2198l;
    private final C0770z f2199m;
    private final C0721a f2200n;
    private final C0760w f2201o;
    private final ag f2202p;

    class C07491 implements UncaughtExceptionHandler {
        final /* synthetic */ C0750r f2186a;

        C07491(C0750r c0750r) {
            this.f2186a = c0750r;
        }

        public void uncaughtException(Thread thread, Throwable th) {
            C0733g g = this.f2186a.m3495g();
            if (g != null) {
                g.m3209e("Job execution failed", th);
            }
        }
    }

    protected C0750r(C0751s c0751s) {
        Context a = c0751s.m3508a();
        C1305x.m6618a((Object) a, (Object) "Application context can't be null");
        C1305x.m6626b(a instanceof Application, "getApplicationContext didn't return the application");
        Object b = c0751s.m3511b();
        C1305x.m6617a(b);
        this.f2188b = a;
        this.f2189c = b;
        this.f2190d = c0751s.m3518h(this);
        this.f2191e = c0751s.m3517g(this);
        C0733g f = c0751s.m3516f(this);
        f.m3229E();
        this.f2192f = f;
        if (m3493e().m3282a()) {
            m3494f().m3205d("Google Analytics " + C0748q.f2184a + " is starting up.");
        } else {
            m3494f().m3205d("Google Analytics " + C0748q.f2184a + " is starting up. " + "To enable debug logging on a device run:\n" + "  adb shell setprop log.tag.GAv4 DEBUG\n" + "  adb logcat -s GAv4");
        }
        C0739j q = c0751s.m3527q(this);
        q.m3229E();
        this.f2197k = q;
        C0742m e = c0751s.m3515e(this);
        e.m3229E();
        this.f2196j = e;
        C0747n l = c0751s.m3522l(this);
        C0770z d = c0751s.m3514d(this);
        C0721a c = c0751s.m3513c(this);
        C0760w b2 = c0751s.m3512b(this);
        ag a2 = c0751s.m3509a(this);
        jk a3 = c0751s.m3510a(a);
        a3.m5379a(m3489a());
        this.f2193g = a3;
        C0710e i = c0751s.m3519i(this);
        d.m3229E();
        this.f2199m = d;
        c.m3229E();
        this.f2200n = c;
        b2.m3229E();
        this.f2201o = b2;
        a2.m3229E();
        this.f2202p = a2;
        ah p = c0751s.m3526p(this);
        p.m3229E();
        this.f2195i = p;
        l.m3229E();
        this.f2194h = l;
        if (m3493e().m3282a()) {
            m3494f().m3199b("Device AnalyticsService version", C0748q.f2184a);
        }
        i.m3169a();
        this.f2198l = i;
        l.m3481b();
    }

    public static C0750r m3487a(Context context) {
        C1305x.m6617a((Object) context);
        if (f2187a == null) {
            synchronized (C0750r.class) {
                if (f2187a == null) {
                    ik d = il.m5268d();
                    long b = d.mo825b();
                    C0750r c0750r = new C0750r(new C0751s(context.getApplicationContext()));
                    f2187a = c0750r;
                    C0710e.m3166d();
                    b = d.mo825b() - b;
                    long longValue = ((Long) ak.f2094Q.m3343a()).longValue();
                    if (b > longValue) {
                        c0750r.m3494f().m3204c("Slow initialization (ms)", Long.valueOf(b), Long.valueOf(longValue));
                    }
                }
            }
        }
        return f2187a;
    }

    private void m3488a(C0717p c0717p) {
        C1305x.m6618a((Object) c0717p, (Object) "Analytics service not created/initialized");
        C1305x.m6626b(c0717p.m3227C(), "Analytics service not initialized");
    }

    protected UncaughtExceptionHandler m3489a() {
        return new C07491(this);
    }

    public Context m3490b() {
        return this.f2188b;
    }

    public Context m3491c() {
        return this.f2189c;
    }

    public ik m3492d() {
        return this.f2190d;
    }

    public ad m3493e() {
        return this.f2191e;
    }

    public C0733g m3494f() {
        m3488a(this.f2192f);
        return this.f2192f;
    }

    public C0733g m3495g() {
        return this.f2192f;
    }

    public jk m3496h() {
        C1305x.m6617a(this.f2193g);
        return this.f2193g;
    }

    public C0747n m3497i() {
        m3488a(this.f2194h);
        return this.f2194h;
    }

    public ah m3498j() {
        m3488a(this.f2195i);
        return this.f2195i;
    }

    public C0710e m3499k() {
        C1305x.m6617a(this.f2198l);
        C1305x.m6626b(this.f2198l.m3173c(), "Analytics instance not initialized");
        return this.f2198l;
    }

    public C0742m m3500l() {
        m3488a(this.f2196j);
        return this.f2196j;
    }

    public C0739j m3501m() {
        m3488a(this.f2197k);
        return this.f2197k;
    }

    public C0739j m3502n() {
        return (this.f2197k == null || !this.f2197k.m3227C()) ? null : this.f2197k;
    }

    public C0721a m3503o() {
        m3488a(this.f2200n);
        return this.f2200n;
    }

    public C0770z m3504p() {
        m3488a(this.f2199m);
        return this.f2199m;
    }

    public C0760w m3505q() {
        m3488a(this.f2201o);
        return this.f2201o;
    }

    public ag m3506r() {
        return this.f2202p;
    }

    public void m3507s() {
        jk.m5374d();
    }
}
