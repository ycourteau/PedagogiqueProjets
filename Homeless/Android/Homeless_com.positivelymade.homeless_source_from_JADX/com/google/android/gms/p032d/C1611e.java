package com.google.android.gms.p032d;

import android.content.Context;
import android.os.Process;
import com.google.android.gms.ads.p023c.C0475a;
import com.google.android.gms.ads.p023c.C0475a.C0473a;
import com.google.android.gms.common.C1230c;
import com.google.android.gms.common.C1232d;
import com.google.android.gms.p028c.ik;
import com.google.android.gms.p028c.il;
import java.io.IOException;

public class C1611e {
    private static Object f4962j = new Object();
    private static C1611e f4963k;
    private volatile long f4964a;
    private volatile long f4965b;
    private volatile boolean f4966c;
    private volatile C0473a f4967d;
    private volatile long f4968e;
    private final Context f4969f;
    private final ik f4970g;
    private final Thread f4971h;
    private C1608a f4972i;

    public interface C1608a {
        C0473a mo1042a();
    }

    class C16091 implements C1608a {
        final /* synthetic */ C1611e f4960a;

        C16091(C1611e c1611e) {
            this.f4960a = c1611e;
        }

        public C0473a mo1042a() {
            C0473a c0473a = null;
            try {
                c0473a = C0475a.m2103b(this.f4960a.f4969f);
            } catch (IllegalStateException e) {
                aj.m7038b("IllegalStateException getting Advertising Id Info");
            } catch (C1232d e2) {
                aj.m7038b("GooglePlayServicesRepairableException getting Advertising Id Info");
            } catch (IOException e3) {
                aj.m7038b("IOException getting Ad Id Info");
            } catch (C1230c e4) {
                aj.m7038b("GooglePlayServicesNotAvailableException getting Advertising Id Info");
            } catch (Exception e5) {
                aj.m7038b("Unknown exception. Could not get the Advertising Id Info.");
            }
            return c0473a;
        }
    }

    class C16102 implements Runnable {
        final /* synthetic */ C1611e f4961a;

        C16102(C1611e c1611e) {
            this.f4961a = c1611e;
        }

        public void run() {
            this.f4961a.m7470e();
        }
    }

    private C1611e(Context context) {
        this(context, null, il.m5268d());
    }

    public C1611e(Context context, C1608a c1608a, ik ikVar) {
        this.f4964a = 900000;
        this.f4965b = 30000;
        this.f4966c = false;
        this.f4972i = new C16091(this);
        this.f4970g = ikVar;
        if (context != null) {
            this.f4969f = context.getApplicationContext();
        } else {
            this.f4969f = context;
        }
        if (c1608a != null) {
            this.f4972i = c1608a;
        }
        this.f4971h = new Thread(new C16102(this));
    }

    public static C1611e m7468a(Context context) {
        if (f4963k == null) {
            synchronized (f4962j) {
                if (f4963k == null) {
                    f4963k = new C1611e(context);
                    f4963k.m7475d();
                }
            }
        }
        return f4963k;
    }

    private void m7470e() {
        Process.setThreadPriority(10);
        while (!this.f4966c) {
            try {
                this.f4967d = this.f4972i.mo1042a();
                Thread.sleep(this.f4964a);
            } catch (InterruptedException e) {
                aj.m7040c("sleep interrupted in AdvertiserDataPoller thread; continuing");
            }
        }
    }

    private void m7471f() {
        if (this.f4970g.mo824a() - this.f4968e >= this.f4965b) {
            m7474c();
            this.f4968e = this.f4970g.mo824a();
        }
    }

    public String m7472a() {
        m7471f();
        return this.f4967d == null ? null : this.f4967d.m2096a();
    }

    public boolean m7473b() {
        m7471f();
        return this.f4967d == null ? true : this.f4967d.m2097b();
    }

    public void m7474c() {
        this.f4971h.interrupt();
    }

    public void m7475d() {
        this.f4971h.start();
    }
}
