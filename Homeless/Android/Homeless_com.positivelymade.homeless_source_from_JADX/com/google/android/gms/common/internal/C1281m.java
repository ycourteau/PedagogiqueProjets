package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.C1180c.C0650b;
import com.google.android.gms.common.api.C1180c.C0651c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

public final class C1281m implements Callback {
    final ArrayList<C0650b> f4379a = new ArrayList();
    private final C0654a f4380b;
    private final ArrayList<C0650b> f4381c = new ArrayList();
    private final ArrayList<C0651c> f4382d = new ArrayList();
    private volatile boolean f4383e = false;
    private final AtomicInteger f4384f = new AtomicInteger(0);
    private boolean f4385g = false;
    private final Handler f4386h;
    private final Object f4387i = new Object();

    public interface C0654a {
        Bundle a_();

        boolean mo512e();
    }

    public C1281m(Looper looper, C0654a c0654a) {
        this.f4380b = c0654a;
        this.f4386h = new Handler(looper, this);
    }

    public void m6409a() {
        this.f4383e = false;
        this.f4384f.incrementAndGet();
    }

    public void m6410a(int i) {
        boolean z = false;
        if (Looper.myLooper() == this.f4386h.getLooper()) {
            z = true;
        }
        C1305x.m6622a(z, (Object) "onUnintentionalDisconnection must only be called on the Handler thread");
        this.f4386h.removeMessages(1);
        synchronized (this.f4387i) {
            this.f4385g = true;
            ArrayList arrayList = new ArrayList(this.f4381c);
            int i2 = this.f4384f.get();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C0650b c0650b = (C0650b) it.next();
                if (!this.f4383e || this.f4384f.get() != i2) {
                    break;
                } else if (this.f4381c.contains(c0650b)) {
                    c0650b.a_(i);
                }
            }
            this.f4379a.clear();
            this.f4385g = false;
        }
    }

    public void m6411a(Bundle bundle) {
        boolean z = true;
        C1305x.m6622a(Looper.myLooper() == this.f4386h.getLooper(), (Object) "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.f4387i) {
            C1305x.m6621a(!this.f4385g);
            this.f4386h.removeMessages(1);
            this.f4385g = true;
            if (this.f4379a.size() != 0) {
                z = false;
            }
            C1305x.m6621a(z);
            ArrayList arrayList = new ArrayList(this.f4381c);
            int i = this.f4384f.get();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C0650b c0650b = (C0650b) it.next();
                if (!this.f4383e || !this.f4380b.mo512e() || this.f4384f.get() != i) {
                    break;
                } else if (!this.f4379a.contains(c0650b)) {
                    c0650b.mo503a(bundle);
                }
            }
            this.f4379a.clear();
            this.f4385g = false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m6412a(com.google.android.gms.common.ConnectionResult r6) {
        /*
        r5 = this;
        r1 = 1;
        r0 = android.os.Looper.myLooper();
        r2 = r5.f4386h;
        r2 = r2.getLooper();
        if (r0 != r2) goto L_0x0046;
    L_0x000d:
        r0 = r1;
    L_0x000e:
        r2 = "onConnectionFailure must only be called on the Handler thread";
        com.google.android.gms.common.internal.C1305x.m6622a(r0, r2);
        r0 = r5.f4386h;
        r0.removeMessages(r1);
        r1 = r5.f4387i;
        monitor-enter(r1);
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x0054 }
        r2 = r5.f4382d;	 Catch:{ all -> 0x0054 }
        r0.<init>(r2);	 Catch:{ all -> 0x0054 }
        r2 = r5.f4384f;	 Catch:{ all -> 0x0054 }
        r2 = r2.get();	 Catch:{ all -> 0x0054 }
        r3 = r0.iterator();	 Catch:{ all -> 0x0054 }
    L_0x002c:
        r0 = r3.hasNext();	 Catch:{ all -> 0x0054 }
        if (r0 == 0) goto L_0x0057;
    L_0x0032:
        r0 = r3.next();	 Catch:{ all -> 0x0054 }
        r0 = (com.google.android.gms.common.api.C1180c.C0651c) r0;	 Catch:{ all -> 0x0054 }
        r4 = r5.f4383e;	 Catch:{ all -> 0x0054 }
        if (r4 == 0) goto L_0x0044;
    L_0x003c:
        r4 = r5.f4384f;	 Catch:{ all -> 0x0054 }
        r4 = r4.get();	 Catch:{ all -> 0x0054 }
        if (r4 == r2) goto L_0x0048;
    L_0x0044:
        monitor-exit(r1);	 Catch:{ all -> 0x0054 }
    L_0x0045:
        return;
    L_0x0046:
        r0 = 0;
        goto L_0x000e;
    L_0x0048:
        r4 = r5.f4382d;	 Catch:{ all -> 0x0054 }
        r4 = r4.contains(r0);	 Catch:{ all -> 0x0054 }
        if (r4 == 0) goto L_0x002c;
    L_0x0050:
        r0.mo504a(r6);	 Catch:{ all -> 0x0054 }
        goto L_0x002c;
    L_0x0054:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0054 }
        throw r0;
    L_0x0057:
        monitor-exit(r1);	 Catch:{ all -> 0x0054 }
        goto L_0x0045;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.m.a(com.google.android.gms.common.ConnectionResult):void");
    }

    public void m6413a(C0650b c0650b) {
        C1305x.m6617a((Object) c0650b);
        synchronized (this.f4387i) {
            if (this.f4381c.contains(c0650b)) {
                Log.w("GmsClientEvents", "registerConnectionCallbacks(): listener " + c0650b + " is already registered");
            } else {
                this.f4381c.add(c0650b);
            }
        }
        if (this.f4380b.mo512e()) {
            this.f4386h.sendMessage(this.f4386h.obtainMessage(1, c0650b));
        }
    }

    public void m6414a(C0651c c0651c) {
        C1305x.m6617a((Object) c0651c);
        synchronized (this.f4387i) {
            if (this.f4382d.contains(c0651c)) {
                Log.w("GmsClientEvents", "registerConnectionFailedListener(): listener " + c0651c + " is already registered");
            } else {
                this.f4382d.add(c0651c);
            }
        }
    }

    public void m6415b() {
        this.f4383e = true;
    }

    public void m6416b(C0650b c0650b) {
        C1305x.m6617a((Object) c0650b);
        synchronized (this.f4387i) {
            if (!this.f4381c.remove(c0650b)) {
                Log.w("GmsClientEvents", "unregisterConnectionCallbacks(): listener " + c0650b + " not found");
            } else if (this.f4385g) {
                this.f4379a.add(c0650b);
            }
        }
    }

    public void m6417b(C0651c c0651c) {
        C1305x.m6617a((Object) c0651c);
        synchronized (this.f4387i) {
            if (!this.f4382d.remove(c0651c)) {
                Log.w("GmsClientEvents", "unregisterConnectionFailedListener(): listener " + c0651c + " not found");
            }
        }
    }

    public boolean handleMessage(Message message) {
        if (message.what == 1) {
            C0650b c0650b = (C0650b) message.obj;
            synchronized (this.f4387i) {
                if (this.f4383e && this.f4380b.mo512e() && this.f4381c.contains(c0650b)) {
                    c0650b.mo503a(this.f4380b.a_());
                }
            }
            return true;
        }
        Log.wtf("GmsClientEvents", "Don't know how to handle this message.");
        return false;
    }
}
