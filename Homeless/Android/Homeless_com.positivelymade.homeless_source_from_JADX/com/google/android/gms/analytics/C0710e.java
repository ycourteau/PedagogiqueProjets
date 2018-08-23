package com.google.android.gms.analytics;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.analytics.internal.C0732f;
import com.google.android.gms.analytics.internal.C0742m;
import com.google.android.gms.analytics.internal.C0750r;
import com.google.android.gms.analytics.internal.ak;
import com.google.android.gms.common.internal.C1305x;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class C0710e extends C0709i {
    private static List<Runnable> f2016b = new ArrayList();
    private boolean f2017c;
    private boolean f2018d;
    private Set<Object> f2019e = new HashSet();
    private boolean f2020f;
    private volatile boolean f2021g;
    private boolean f2022h;

    public C0710e(C0750r c0750r) {
        super(c0750r);
    }

    public static C0710e m3165a(Context context) {
        return C0750r.m3487a(context).m3499k();
    }

    public static void m3166d() {
        synchronized (C0710e.class) {
            if (f2016b != null) {
                for (Runnable run : f2016b) {
                    run.run();
                }
                f2016b = null;
            }
        }
    }

    private C0742m m3167n() {
        return m3163i().m3500l();
    }

    public C0719h m3168a(String str) {
        C0719h c0719h;
        synchronized (this) {
            c0719h = new C0719h(m3163i(), str, null);
            c0719h.m3229E();
        }
        return c0719h;
    }

    public void m3169a() {
        m3172b();
        this.f2017c = true;
    }

    @Deprecated
    public void m3170a(C0714g c0714g) {
        C0732f.m3383a(c0714g);
        if (!this.f2022h) {
            Log.i((String) ak.f2097c.m3343a(), "GoogleAnalytics.setLogger() is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag." + ((String) ak.f2097c.m3343a()) + " DEBUG");
            this.f2022h = true;
        }
    }

    public void m3171a(boolean z) {
        this.f2020f = z;
    }

    void m3172b() {
        C0742m n = m3167n();
        if (n.m3467d()) {
            m3176g().mo542a(n.m3468e());
        }
        if (n.m3471h()) {
            m3171a(n.m3472i());
        }
        if (n.m3467d()) {
            C0714g a = C0732f.m3382a();
            if (a != null) {
                a.mo542a(n.m3468e());
            }
        }
    }

    public boolean m3173c() {
        return this.f2017c && !this.f2018d;
    }

    public boolean m3174e() {
        return this.f2020f;
    }

    public boolean m3175f() {
        return this.f2021g;
    }

    @Deprecated
    public C0714g m3176g() {
        return C0732f.m3382a();
    }

    public String m3177h() {
        C1305x.m6628c("getClientId can not be called from the main thread");
        return m3163i().m3504p().m3633b();
    }
}
