package com.google.android.gms.ads.p023c;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.google.android.gms.common.C1229b;
import com.google.android.gms.common.C1230c;
import com.google.android.gms.common.C1241e;
import com.google.android.gms.common.C1243h;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.common.stats.C1530b;
import com.google.android.gms.p028c.C1148v;
import com.google.android.gms.p028c.C1148v.C1150a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class C0475a {
    private static boolean f1267h = false;
    C1243h f1268a;
    C1148v f1269b;
    boolean f1270c;
    Object f1271d;
    C0474b f1272e;
    final long f1273f;
    private final Context f1274g;

    public static final class C0473a {
        private final String f1261a;
        private final boolean f1262b;

        public C0473a(String str, boolean z) {
            this.f1261a = str;
            this.f1262b = z;
        }

        public String m2096a() {
            return this.f1261a;
        }

        public boolean m2097b() {
            return this.f1262b;
        }

        public String toString() {
            return "{" + this.f1261a + "}" + this.f1262b;
        }
    }

    static class C0474b extends Thread {
        CountDownLatch f1263a = new CountDownLatch(1);
        boolean f1264b = false;
        private WeakReference<C0475a> f1265c;
        private long f1266d;

        public C0474b(C0475a c0475a, long j) {
            this.f1265c = new WeakReference(c0475a);
            this.f1266d = j;
            start();
        }

        private void m2098c() {
            C0475a c0475a = (C0475a) this.f1265c.get();
            if (c0475a != null) {
                c0475a.m2108c();
                this.f1264b = true;
            }
        }

        public void m2099a() {
            this.f1263a.countDown();
        }

        public boolean m2100b() {
            return this.f1264b;
        }

        public void run() {
            try {
                if (!this.f1263a.await(this.f1266d, TimeUnit.MILLISECONDS)) {
                    m2098c();
                }
            } catch (InterruptedException e) {
                m2098c();
            }
        }
    }

    public C0475a(Context context) {
        this(context, 30000);
    }

    public C0475a(Context context, long j) {
        this.f1271d = new Object();
        C1305x.m6617a((Object) context);
        this.f1274g = context;
        this.f1270c = false;
        this.f1273f = j;
    }

    static C1148v m2101a(Context context, C1243h c1243h) {
        try {
            return C1150a.m5906a(c1243h.m6297a());
        } catch (InterruptedException e) {
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            IOException iOException = new IOException(th);
        }
    }

    static C1243h m2102a(Context context) {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            if (f1267h) {
                Log.d("Ads", "Skipping gmscore version check");
                switch (C1229b.m6224a().m6225a(context)) {
                    case 0:
                    case 2:
                        break;
                    default:
                        throw new IOException("Google Play services not available");
                }
            }
            try {
                C1241e.m6284b(context);
            } catch (Throwable e) {
                throw new IOException(e);
            }
            ServiceConnection c1243h = new C1243h();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                if (C1530b.m6956a().m6965a(context, intent, c1243h, 1)) {
                    return c1243h;
                }
                throw new IOException("Connection failure");
            } catch (Throwable e2) {
                IOException iOException = new IOException(e2);
            }
        } catch (NameNotFoundException e3) {
            throw new C1230c(9);
        }
    }

    public static C0473a m2103b(Context context) {
        C0475a c0475a = new C0475a(context, -1);
        try {
            c0475a.m2106a(false);
            C0473a b = c0475a.m2107b();
            return b;
        } finally {
            c0475a.m2108c();
        }
    }

    private void m2104d() {
        synchronized (this.f1271d) {
            if (this.f1272e != null) {
                this.f1272e.m2099a();
                try {
                    this.f1272e.join();
                } catch (InterruptedException e) {
                }
            }
            if (this.f1273f > 0) {
                this.f1272e = new C0474b(this, this.f1273f);
            }
        }
    }

    public void m2105a() {
        m2106a(true);
    }

    protected void m2106a(boolean z) {
        C1305x.m6628c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f1270c) {
                m2108c();
            }
            this.f1268a = C0475a.m2102a(this.f1274g);
            this.f1269b = C0475a.m2101a(this.f1274g, this.f1268a);
            this.f1270c = true;
            if (z) {
                m2104d();
            }
        }
    }

    public C0473a m2107b() {
        C0473a c0473a;
        C1305x.m6628c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f1270c) {
                synchronized (this.f1271d) {
                    if (this.f1272e == null || !this.f1272e.m2100b()) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    m2106a(false);
                    if (!this.f1270c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Throwable e) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                    throw new IOException("Remote exception");
                } catch (Throwable e2) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
            C1305x.m6617a(this.f1268a);
            C1305x.m6617a(this.f1269b);
            c0473a = new C0473a(this.f1269b.mo851a(), this.f1269b.mo854a(true));
        }
        m2104d();
        return c0473a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m2108c() {
        /*
        r3 = this;
        r0 = "Calling this from your main thread can lead to deadlock";
        com.google.android.gms.common.internal.C1305x.m6628c(r0);
        monitor-enter(r3);
        r0 = r3.f1274g;	 Catch:{ all -> 0x002a }
        if (r0 == 0) goto L_0x000e;
    L_0x000a:
        r0 = r3.f1268a;	 Catch:{ all -> 0x002a }
        if (r0 != 0) goto L_0x0010;
    L_0x000e:
        monitor-exit(r3);	 Catch:{ all -> 0x002a }
    L_0x000f:
        return;
    L_0x0010:
        r0 = r3.f1270c;	 Catch:{ IllegalArgumentException -> 0x002d }
        if (r0 == 0) goto L_0x001f;
    L_0x0014:
        r0 = com.google.android.gms.common.stats.C1530b.m6956a();	 Catch:{ IllegalArgumentException -> 0x002d }
        r1 = r3.f1274g;	 Catch:{ IllegalArgumentException -> 0x002d }
        r2 = r3.f1268a;	 Catch:{ IllegalArgumentException -> 0x002d }
        r0.m6963a(r1, r2);	 Catch:{ IllegalArgumentException -> 0x002d }
    L_0x001f:
        r0 = 0;
        r3.f1270c = r0;	 Catch:{ all -> 0x002a }
        r0 = 0;
        r3.f1269b = r0;	 Catch:{ all -> 0x002a }
        r0 = 0;
        r3.f1268a = r0;	 Catch:{ all -> 0x002a }
        monitor-exit(r3);	 Catch:{ all -> 0x002a }
        goto L_0x000f;
    L_0x002a:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x002a }
        throw r0;
    L_0x002d:
        r0 = move-exception;
        r1 = "AdvertisingIdClient";
        r2 = "AdvertisingIdClient unbindService failed.";
        android.util.Log.i(r1, r2, r0);	 Catch:{ all -> 0x002a }
        goto L_0x001f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.c.a.c():void");
    }

    protected void finalize() {
        m2108c();
        super.finalize();
    }
}
