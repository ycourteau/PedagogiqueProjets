package com.google.android.gms.analytics.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.common.stats.C1530b;
import java.util.Collections;

public class C0757u extends C0717p {
    private final C0756a f2219a = new C0756a(this);
    private C0728d f2220b;
    private final af f2221c;
    private C0740k f2222d;

    protected class C0756a implements ServiceConnection {
        final /* synthetic */ C0757u f2216a;
        private volatile C0728d f2217b;
        private volatile boolean f2218c;

        protected C0756a(C0757u c0757u) {
            this.f2216a = c0757u;
        }

        public C0728d m3536a() {
            C0728d c0728d = null;
            this.f2216a.m3213m();
            Intent intent = new Intent("com.google.android.gms.analytics.service.START");
            intent.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.analytics.service.AnalyticsService"));
            Context o = this.f2216a.m3215o();
            intent.putExtra("app_package_name", o.getPackageName());
            C1530b a = C1530b.m6956a();
            synchronized (this) {
                this.f2217b = null;
                this.f2218c = true;
                boolean a2 = a.m6965a(o, intent, this.f2216a.f2219a, 129);
                this.f2216a.m3195a("Bind to service requested", Boolean.valueOf(a2));
                if (a2) {
                    try {
                        wait(this.f2216a.m3217q().m3304w());
                    } catch (InterruptedException e) {
                        this.f2216a.m3208e("Wait for service connect was interrupted");
                    }
                    this.f2218c = false;
                    c0728d = this.f2217b;
                    this.f2217b = null;
                    if (c0728d == null) {
                        this.f2216a.m3210f("Successfully bound to service but never got onServiceConnected callback");
                    }
                } else {
                    this.f2218c = false;
                }
            }
            return c0728d;
        }

        public void onServiceConnected(android.content.ComponentName r5, android.os.IBinder r6) {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:com.google.android.gms.analytics.internal.u.a.onServiceConnected(android.content.ComponentName, android.os.IBinder):void. bs: [B:3:0x0008, B:9:0x0015]
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:86)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r4 = this;
            r0 = "AnalyticsServiceConnection.onServiceConnected";
            com.google.android.gms.common.internal.C1305x.m6624b(r0);
            monitor-enter(r4);
            if (r6 != 0) goto L_0x0014;
        L_0x0008:
            r0 = r4.f2216a;	 Catch:{ all -> 0x005a }
            r1 = "Service connected with null binder";	 Catch:{ all -> 0x005a }
            r0.m3210f(r1);	 Catch:{ all -> 0x005a }
            r4.notifyAll();	 Catch:{ all -> 0x0046 }
            monitor-exit(r4);	 Catch:{ all -> 0x0046 }
        L_0x0013:
            return;
        L_0x0014:
            r0 = 0;
            r1 = r6.getInterfaceDescriptor();	 Catch:{ RemoteException -> 0x0051 }
            r2 = "com.google.android.gms.analytics.internal.IAnalyticsService";	 Catch:{ RemoteException -> 0x0051 }
            r2 = r2.equals(r1);	 Catch:{ RemoteException -> 0x0051 }
            if (r2 == 0) goto L_0x0049;	 Catch:{ RemoteException -> 0x0051 }
        L_0x0021:
            r0 = com.google.android.gms.analytics.internal.C0728d.C0730a.m3380a(r6);	 Catch:{ RemoteException -> 0x0051 }
            r1 = r4.f2216a;	 Catch:{ RemoteException -> 0x0051 }
            r2 = "Bound to IAnalyticsService interface";	 Catch:{ RemoteException -> 0x0051 }
            r1.m3198b(r2);	 Catch:{ RemoteException -> 0x0051 }
        L_0x002c:
            if (r0 != 0) goto L_0x005f;
        L_0x002e:
            r0 = com.google.android.gms.common.stats.C1530b.m6956a();	 Catch:{ IllegalArgumentException -> 0x007c }
            r1 = r4.f2216a;	 Catch:{ IllegalArgumentException -> 0x007c }
            r1 = r1.m3215o();	 Catch:{ IllegalArgumentException -> 0x007c }
            r2 = r4.f2216a;	 Catch:{ IllegalArgumentException -> 0x007c }
            r2 = r2.f2219a;	 Catch:{ IllegalArgumentException -> 0x007c }
            r0.m6963a(r1, r2);	 Catch:{ IllegalArgumentException -> 0x007c }
        L_0x0041:
            r4.notifyAll();	 Catch:{ all -> 0x0046 }
            monitor-exit(r4);	 Catch:{ all -> 0x0046 }
            goto L_0x0013;	 Catch:{ all -> 0x0046 }
        L_0x0046:
            r0 = move-exception;	 Catch:{ all -> 0x0046 }
            monitor-exit(r4);	 Catch:{ all -> 0x0046 }
            throw r0;
        L_0x0049:
            r2 = r4.f2216a;	 Catch:{ RemoteException -> 0x0051 }
            r3 = "Got binder with a wrong descriptor";	 Catch:{ RemoteException -> 0x0051 }
            r2.m3209e(r3, r1);	 Catch:{ RemoteException -> 0x0051 }
            goto L_0x002c;
        L_0x0051:
            r1 = move-exception;
            r1 = r4.f2216a;	 Catch:{ all -> 0x005a }
            r2 = "Service connect failed to get IAnalyticsService";	 Catch:{ all -> 0x005a }
            r1.m3210f(r2);	 Catch:{ all -> 0x005a }
            goto L_0x002c;
        L_0x005a:
            r0 = move-exception;
            r4.notifyAll();	 Catch:{ all -> 0x0046 }
            throw r0;	 Catch:{ all -> 0x0046 }
        L_0x005f:
            r1 = r4.f2218c;	 Catch:{ all -> 0x005a }
            if (r1 != 0) goto L_0x0079;	 Catch:{ all -> 0x005a }
        L_0x0063:
            r1 = r4.f2216a;	 Catch:{ all -> 0x005a }
            r2 = "onServiceConnected received after the timeout limit";	 Catch:{ all -> 0x005a }
            r1.m3208e(r2);	 Catch:{ all -> 0x005a }
            r1 = r4.f2216a;	 Catch:{ all -> 0x005a }
            r1 = r1.m3218r();	 Catch:{ all -> 0x005a }
            r2 = new com.google.android.gms.analytics.internal.u$a$1;	 Catch:{ all -> 0x005a }
            r2.<init>(r4, r0);	 Catch:{ all -> 0x005a }
            r1.m5378a(r2);	 Catch:{ all -> 0x005a }
            goto L_0x0041;	 Catch:{ all -> 0x005a }
        L_0x0079:
            r4.f2217b = r0;	 Catch:{ all -> 0x005a }
            goto L_0x0041;
        L_0x007c:
            r0 = move-exception;
            goto L_0x0041;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.internal.u.a.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
        }

        public void onServiceDisconnected(final ComponentName componentName) {
            C1305x.m6624b("AnalyticsServiceConnection.onServiceDisconnected");
            this.f2216a.m3218r().m5378a(new Runnable(this) {
                final /* synthetic */ C0756a f2215b;

                public void run() {
                    this.f2215b.f2216a.m3538a(componentName);
                }
            });
        }
    }

    protected C0757u(C0750r c0750r) {
        super(c0750r);
        this.f2222d = new C0740k(c0750r.m3492d());
        this.f2221c = new af(this, c0750r) {
            final /* synthetic */ C0757u f2211a;

            public void mo555a() {
                this.f2211a.m3544f();
            }
        };
    }

    private void m3538a(ComponentName componentName) {
        m3213m();
        if (this.f2220b != null) {
            this.f2220b = null;
            m3195a("Disconnected from device AnalyticsService", componentName);
            m3545g();
        }
    }

    private void m3539a(C0728d c0728d) {
        m3213m();
        this.f2220b = c0728d;
        m3543e();
        m3220t().m3485f();
    }

    private void m3543e() {
        this.f2222d.m3444a();
        this.f2221c.m3317a(m3217q().m3303v());
    }

    private void m3544f() {
        m3213m();
        if (m3548b()) {
            m3198b("Inactivity, disconnecting from device AnalyticsService");
            m3550d();
        }
    }

    private void m3545g() {
        m3220t().m3483d();
    }

    protected void mo540a() {
    }

    public boolean m3547a(C0727c c0727c) {
        C1305x.m6617a((Object) c0727c);
        m3213m();
        m3228D();
        C0728d c0728d = this.f2220b;
        if (c0728d == null) {
            return false;
        }
        try {
            c0728d.mo551a(c0727c.m3367b(), c0727c.m3369d(), c0727c.m3371f() ? m3217q().m3296o() : m3217q().m3297p(), Collections.emptyList());
            m3543e();
            return true;
        } catch (RemoteException e) {
            m3198b("Failed to send hits to AnalyticsService");
            return false;
        }
    }

    public boolean m3548b() {
        m3213m();
        m3228D();
        return this.f2220b != null;
    }

    public boolean m3549c() {
        m3213m();
        m3228D();
        if (this.f2220b != null) {
            return true;
        }
        C0728d a = this.f2219a.m3536a();
        if (a == null) {
            return false;
        }
        this.f2220b = a;
        m3543e();
        return true;
    }

    public void m3550d() {
        m3213m();
        m3228D();
        try {
            C1530b.m6956a().m6963a(m3215o(), this.f2219a);
        } catch (IllegalStateException e) {
        } catch (IllegalArgumentException e2) {
        }
        if (this.f2220b != null) {
            this.f2220b = null;
            m3545g();
        }
    }
}
