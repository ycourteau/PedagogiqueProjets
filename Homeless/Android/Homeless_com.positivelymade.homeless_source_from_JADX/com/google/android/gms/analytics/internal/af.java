package com.google.android.gms.analytics.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.internal.C1305x;

abstract class af {
    private static volatile Handler f2067b;
    private final C0750r f2068a;
    private final Runnable f2069c = new C07231(this);
    private volatile long f2070d;
    private boolean f2071e;

    class C07231 implements Runnable {
        final /* synthetic */ af f2066a;

        C07231(af afVar) {
            this.f2066a = afVar;
        }

        public void run() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f2066a.f2068a.m3496h().m5378a((Runnable) this);
                return;
            }
            boolean c = this.f2066a.m3320c();
            this.f2066a.f2070d = 0;
            if (c && !this.f2066a.f2071e) {
                this.f2066a.mo555a();
            }
        }
    }

    af(C0750r c0750r) {
        C1305x.m6617a((Object) c0750r);
        this.f2068a = c0750r;
    }

    private Handler m3315e() {
        if (f2067b != null) {
            return f2067b;
        }
        Handler handler;
        synchronized (af.class) {
            if (f2067b == null) {
                f2067b = new Handler(this.f2068a.m3490b().getMainLooper());
            }
            handler = f2067b;
        }
        return handler;
    }

    public abstract void mo555a();

    public void m3317a(long j) {
        m3321d();
        if (j >= 0) {
            this.f2070d = this.f2068a.m3492d().mo824a();
            if (!m3315e().postDelayed(this.f2069c, j)) {
                this.f2068a.m3494f().m3209e("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    public long m3318b() {
        return this.f2070d == 0 ? 0 : Math.abs(this.f2068a.m3492d().mo824a() - this.f2070d);
    }

    public void m3319b(long j) {
        long j2 = 0;
        if (!m3320c()) {
            return;
        }
        if (j < 0) {
            m3321d();
            return;
        }
        long abs = j - Math.abs(this.f2068a.m3492d().mo824a() - this.f2070d);
        if (abs >= 0) {
            j2 = abs;
        }
        m3315e().removeCallbacks(this.f2069c);
        if (!m3315e().postDelayed(this.f2069c, j2)) {
            this.f2068a.m3494f().m3209e("Failed to adjust delayed post. time", Long.valueOf(j2));
        }
    }

    public boolean m3320c() {
        return this.f2070d != 0;
    }

    public void m3321d() {
        this.f2070d = 0;
        m3315e().removeCallbacks(this.f2069c);
    }
}
