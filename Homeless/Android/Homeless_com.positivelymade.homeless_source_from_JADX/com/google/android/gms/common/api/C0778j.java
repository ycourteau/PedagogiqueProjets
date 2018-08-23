package com.google.android.gms.common.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.C0777e.C1181a;
import com.google.android.gms.common.internal.C1290s;
import com.google.android.gms.common.internal.C1305x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public abstract class C0778j<R extends C0774g> implements C0777e<R> {
    protected final C1182a<R> f2301a;
    private final Object f2302b = new Object();
    private final CountDownLatch f2303c = new CountDownLatch(1);
    private final ArrayList<C1181a> f2304d = new ArrayList();
    private C1105h<R> f2305e;
    private volatile R f2306f;
    private volatile boolean f2307g;
    private boolean f2308h;
    private boolean f2309i;
    private C1290s f2310j;

    public static class C1182a<R extends C0774g> extends Handler {
        public C1182a() {
            this(Looper.getMainLooper());
        }

        public C1182a(Looper looper) {
            super(looper);
        }

        public void m6019a() {
            removeMessages(2);
        }

        public void m6020a(C1105h<R> c1105h, R r) {
            sendMessage(obtainMessage(1, new Pair(c1105h, r)));
        }

        protected void m6021b(C1105h<R> c1105h, R r) {
            try {
                c1105h.mo833a(r);
            } catch (RuntimeException e) {
                C0778j.m3684b((C0774g) r);
                throw e;
            }
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    Pair pair = (Pair) message.obj;
                    m6021b((C1105h) pair.first, (C0774g) pair.second);
                    return;
                case 2:
                    ((C0778j) message.obj).m3694c(Status.f4097d);
                    return;
                default:
                    Log.wtf("AbstractPendingResult", "Don't know how to handle this message.");
                    return;
            }
        }
    }

    protected C0778j(Looper looper) {
        this.f2301a = new C1182a(looper);
    }

    static void m3684b(C0774g c0774g) {
        if (c0774g instanceof C0870f) {
            try {
                ((C0870f) c0774g).mo627b();
            } catch (Throwable e) {
                Log.w("AbstractPendingResult", "Unable to release " + c0774g, e);
            }
        }
    }

    private void m3685c(R r) {
        this.f2306f = r;
        this.f2310j = null;
        this.f2303c.countDown();
        Status a = this.f2306f.mo558a();
        if (this.f2305e != null) {
            this.f2301a.m6019a();
            if (!this.f2308h) {
                this.f2301a.m6020a(this.f2305e, m3686h());
            }
        }
        Iterator it = this.f2304d.iterator();
        while (it.hasNext()) {
            ((C1181a) it.next()).m6018a(a);
        }
        this.f2304d.clear();
    }

    private R m3686h() {
        R r;
        boolean z = true;
        synchronized (this.f2302b) {
            if (this.f2307g) {
                z = false;
            }
            C1305x.m6622a(z, (Object) "Result has already been consumed.");
            C1305x.m6622a(m3692b(), (Object) "Result is not ready.");
            r = this.f2306f;
            this.f2306f = null;
            this.f2305e = null;
            this.f2307g = true;
        }
        mo570e();
        return r;
    }

    public final R mo563a() {
        boolean z = true;
        C1305x.m6622a(Looper.myLooper() != Looper.getMainLooper(), (Object) "await must not be called on the UI thread");
        if (this.f2307g) {
            z = false;
        }
        C1305x.m6622a(z, (Object) "Result has already been consumed");
        try {
            this.f2303c.await();
        } catch (InterruptedException e) {
            m3694c(Status.f4095b);
        }
        C1305x.m6622a(m3692b(), (Object) "Result is not ready.");
        return m3686h();
    }

    public final R mo564a(long j, TimeUnit timeUnit) {
        boolean z = true;
        boolean z2 = j <= 0 || Looper.myLooper() != Looper.getMainLooper();
        C1305x.m6622a(z2, (Object) "await must not be called on the UI thread when time is greater than zero.");
        if (this.f2307g) {
            z = false;
        }
        C1305x.m6622a(z, (Object) "Result has already been consumed.");
        try {
            if (!this.f2303c.await(j, timeUnit)) {
                m3694c(Status.f4097d);
            }
        } catch (InterruptedException e) {
            m3694c(Status.f4095b);
        }
        C1305x.m6622a(m3692b(), (Object) "Result is not ready.");
        return m3686h();
    }

    public final void m3689a(R r) {
        boolean z = true;
        synchronized (this.f2302b) {
            if (this.f2309i || this.f2308h) {
                C0778j.m3684b((C0774g) r);
                return;
            }
            C1305x.m6622a(!m3692b(), (Object) "Results have already been set");
            if (this.f2307g) {
                z = false;
            }
            C1305x.m6622a(z, (Object) "Result has already been consumed");
            m3685c((C0774g) r);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo565a(com.google.android.gms.common.api.C1105h<R> r4) {
        /*
        r3 = this;
        r0 = r3.f2307g;
        if (r0 != 0) goto L_0x0015;
    L_0x0004:
        r0 = 1;
    L_0x0005:
        r1 = "Result has already been consumed.";
        com.google.android.gms.common.internal.C1305x.m6622a(r0, r1);
        r1 = r3.f2302b;
        monitor-enter(r1);
        r0 = r3.m3695d();	 Catch:{ all -> 0x0028 }
        if (r0 == 0) goto L_0x0017;
    L_0x0013:
        monitor-exit(r1);	 Catch:{ all -> 0x0028 }
    L_0x0014:
        return;
    L_0x0015:
        r0 = 0;
        goto L_0x0005;
    L_0x0017:
        r0 = r3.m3692b();	 Catch:{ all -> 0x0028 }
        if (r0 == 0) goto L_0x002b;
    L_0x001d:
        r0 = r3.f2301a;	 Catch:{ all -> 0x0028 }
        r2 = r3.m3686h();	 Catch:{ all -> 0x0028 }
        r0.m6020a(r4, r2);	 Catch:{ all -> 0x0028 }
    L_0x0026:
        monitor-exit(r1);	 Catch:{ all -> 0x0028 }
        goto L_0x0014;
    L_0x0028:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0028 }
        throw r0;
    L_0x002b:
        r3.f2305e = r4;	 Catch:{ all -> 0x0028 }
        goto L_0x0026;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.j.a(com.google.android.gms.common.api.h):void");
    }

    protected abstract R mo574b(Status status);

    public final boolean m3692b() {
        return this.f2303c.getCount() == 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m3693c() {
        /*
        r2 = this;
        r1 = r2.f2302b;
        monitor-enter(r1);
        r0 = r2.f2308h;	 Catch:{ all -> 0x002c }
        if (r0 != 0) goto L_0x000b;
    L_0x0007:
        r0 = r2.f2307g;	 Catch:{ all -> 0x002c }
        if (r0 == 0) goto L_0x000d;
    L_0x000b:
        monitor-exit(r1);	 Catch:{ all -> 0x002c }
    L_0x000c:
        return;
    L_0x000d:
        r0 = r2.f2310j;	 Catch:{ all -> 0x002c }
        if (r0 == 0) goto L_0x0016;
    L_0x0011:
        r0 = r2.f2310j;	 Catch:{ RemoteException -> 0x002f }
        r0.mo916a();	 Catch:{ RemoteException -> 0x002f }
    L_0x0016:
        r0 = r2.f2306f;	 Catch:{ all -> 0x002c }
        com.google.android.gms.common.api.C0778j.m3684b(r0);	 Catch:{ all -> 0x002c }
        r0 = 0;
        r2.f2305e = r0;	 Catch:{ all -> 0x002c }
        r0 = 1;
        r2.f2308h = r0;	 Catch:{ all -> 0x002c }
        r0 = com.google.android.gms.common.api.Status.f4098e;	 Catch:{ all -> 0x002c }
        r0 = r2.mo574b(r0);	 Catch:{ all -> 0x002c }
        r2.m3685c(r0);	 Catch:{ all -> 0x002c }
        monitor-exit(r1);	 Catch:{ all -> 0x002c }
        goto L_0x000c;
    L_0x002c:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x002c }
        throw r0;
    L_0x002f:
        r0 = move-exception;
        goto L_0x0016;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.j.c():void");
    }

    public final void m3694c(Status status) {
        synchronized (this.f2302b) {
            if (!m3692b()) {
                m3689a(mo574b(status));
                this.f2309i = true;
            }
        }
    }

    public boolean m3695d() {
        boolean z;
        synchronized (this.f2302b) {
            z = this.f2308h;
        }
        return z;
    }

    protected void mo570e() {
    }
}
