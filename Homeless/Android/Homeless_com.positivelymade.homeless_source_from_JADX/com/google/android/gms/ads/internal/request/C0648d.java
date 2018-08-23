package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import com.google.android.gms.ads.internal.C0618p;
import com.google.android.gms.ads.internal.request.C0647c.C0643a;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1180c.C0650b;
import com.google.android.gms.common.api.C1180c.C0651c;
import com.google.android.gms.p028c.as;
import com.google.android.gms.p028c.az;
import com.google.android.gms.p028c.fn;
import com.google.android.gms.p028c.fo;
import com.google.android.gms.p028c.fp;
import com.google.android.gms.p028c.gk;

@fn
public abstract class C0648d extends gk implements C0643a {
    private final AdRequestInfoParcel f1914a;
    private final C0643a f1915b;
    private final Object f1916c = new Object();
    private AdResponseParcel f1917d;

    @fn
    public static final class C0649a extends C0648d {
        private final Context f1918a;

        public C0649a(Context context, AdRequestInfoParcel adRequestInfoParcel, C0643a c0643a) {
            super(adRequestInfoParcel, c0643a);
            this.f1918a = context;
        }

        public void mo501c() {
        }

        public C0663j mo502d() {
            return fp.m4632a(this.f1918a, new as((String) az.f2476b.m3878c()), fo.m4623a());
        }
    }

    @fn
    public static class C0652b extends C0648d implements C0650b, C0651c {
        protected C0656e f1919a;
        private Context f1920b;
        private AdRequestInfoParcel f1921c;
        private final C0643a f1922d;
        private final Object f1923e = new Object();
        private boolean f1924f;

        public C0652b(Context context, AdRequestInfoParcel adRequestInfoParcel, C0643a c0643a) {
            Looper a;
            super(adRequestInfoParcel, c0643a);
            this.f1920b = context;
            this.f1921c = adRequestInfoParcel;
            this.f1922d = c0643a;
            if (((Boolean) az.f2449A.m3878c()).booleanValue()) {
                this.f1924f = true;
                a = C0618p.m2807p().m4964a();
            } else {
                a = context.getMainLooper();
            }
            this.f1919a = new C0656e(context, a, this, this, adRequestInfoParcel.f1847k.f1978d);
            m2944e();
        }

        public void mo503a(Bundle bundle) {
            m2829g();
        }

        public void mo504a(ConnectionResult connectionResult) {
            C0691b.m3093a("Cannot connect to remote service, fallback to local instance.");
            m2945f().m2829g();
            Bundle bundle = new Bundle();
            bundle.putString("action", "gms_connection_failed_fallback_to_local");
            C0618p.m2796e().m4871b(this.f1920b, this.f1921c.f1847k.f1976b, "gmob-apps", bundle, true);
        }

        public void a_(int i) {
            C0691b.m3093a("Disconnected from remote ad request service.");
        }

        public void mo501c() {
            synchronized (this.f1923e) {
                if (this.f1919a.mo512e() || this.f1919a.m2988j()) {
                    this.f1919a.mo511d();
                }
                Binder.flushPendingCommands();
                if (this.f1924f) {
                    C0618p.m2807p().m4965b();
                    this.f1924f = false;
                }
            }
        }

        public C0663j mo502d() {
            C0663j c;
            synchronized (this.f1923e) {
                try {
                    c = this.f1919a.mo517c();
                } catch (IllegalStateException e) {
                    c = null;
                    return c;
                } catch (DeadObjectException e2) {
                    c = null;
                    return c;
                }
            }
            return c;
        }

        protected void m2944e() {
            this.f1919a.m2987i();
        }

        gk m2945f() {
            return new C0649a(this.f1920b, this.f1921c, this.f1922d);
        }
    }

    public C0648d(AdRequestInfoParcel adRequestInfoParcel, C0643a c0643a) {
        this.f1914a = adRequestInfoParcel;
        this.f1915b = c0643a;
    }

    public void mo486a() {
        try {
            C0663j d = mo502d();
            if (d == null) {
                this.f1915b.mo499a(new AdResponseParcel(0));
            } else if (m2931a(d, this.f1914a)) {
                m2929a(C0618p.m2800i().mo825b());
            }
            mo501c();
        } catch (Throwable th) {
            mo501c();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void m2929a(long r6) {
        /*
        r5 = this;
        r1 = r5.f1916c;
        monitor-enter(r1);
    L_0x0003:
        r0 = r5.f1917d;	 Catch:{ all -> 0x0023 }
        if (r0 == 0) goto L_0x0010;
    L_0x0007:
        r0 = r5.f1915b;	 Catch:{ all -> 0x0023 }
        r2 = r5.f1917d;	 Catch:{ all -> 0x0023 }
        r0.mo499a(r2);	 Catch:{ all -> 0x0023 }
        monitor-exit(r1);	 Catch:{ all -> 0x0023 }
    L_0x000f:
        return;
    L_0x0010:
        r0 = r5.m2933b(r6);	 Catch:{ all -> 0x0023 }
        if (r0 != 0) goto L_0x0003;
    L_0x0016:
        r0 = r5.f1917d;	 Catch:{ all -> 0x0023 }
        if (r0 == 0) goto L_0x0026;
    L_0x001a:
        r0 = r5.f1915b;	 Catch:{ all -> 0x0023 }
        r2 = r5.f1917d;	 Catch:{ all -> 0x0023 }
        r0.mo499a(r2);	 Catch:{ all -> 0x0023 }
    L_0x0021:
        monitor-exit(r1);	 Catch:{ all -> 0x0023 }
        goto L_0x000f;
    L_0x0023:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0023 }
        throw r0;
    L_0x0026:
        r0 = r5.f1915b;	 Catch:{ all -> 0x0023 }
        r2 = new com.google.android.gms.ads.internal.request.AdResponseParcel;	 Catch:{ all -> 0x0023 }
        r3 = 0;
        r2.<init>(r3);	 Catch:{ all -> 0x0023 }
        r0.mo499a(r2);	 Catch:{ all -> 0x0023 }
        goto L_0x0021;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.request.d.a(long):void");
    }

    public void mo499a(AdResponseParcel adResponseParcel) {
        synchronized (this.f1916c) {
            this.f1917d = adResponseParcel;
            this.f1916c.notify();
        }
    }

    boolean m2931a(C0663j c0663j, AdRequestInfoParcel adRequestInfoParcel) {
        try {
            c0663j.mo520a(adRequestInfoParcel, new C0660g(this));
            return true;
        } catch (Throwable e) {
            C0691b.m3102d("Could not fetch ad response from ad request service.", e);
            C0618p.m2799h().m4781a(e, true);
        } catch (Throwable e2) {
            C0691b.m3102d("Could not fetch ad response from ad request service due to an Exception.", e2);
            C0618p.m2799h().m4781a(e2, true);
        } catch (Throwable e22) {
            C0691b.m3102d("Could not fetch ad response from ad request service due to an Exception.", e22);
            C0618p.m2799h().m4781a(e22, true);
        } catch (Throwable e222) {
            C0691b.m3102d("Could not fetch ad response from ad request service due to an Exception.", e222);
            C0618p.m2799h().m4781a(e222, true);
        }
        this.f1915b.mo499a(new AdResponseParcel(0));
        return false;
    }

    public final void mo487b() {
        mo501c();
    }

    protected boolean m2933b(long j) {
        long b = 60000 - (C0618p.m2800i().mo825b() - j);
        if (b <= 0) {
            return false;
        }
        try {
            this.f1916c.wait(b);
            return true;
        } catch (InterruptedException e) {
            return false;
        }
    }

    public abstract void mo501c();

    public abstract C0663j mo502d();
}
