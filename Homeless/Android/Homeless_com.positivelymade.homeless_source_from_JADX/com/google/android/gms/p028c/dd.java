package com.google.android.gms.p028c;

import com.google.android.gms.p028c.df.C0898a;
import com.google.android.gms.p028c.dk.C0896a;

@fn
public final class dd extends C0896a {
    private final Object f2736a = new Object();
    private C0898a f2737b;
    private dc f2738c;

    public void mo635a() {
        synchronized (this.f2736a) {
            if (this.f2738c != null) {
                this.f2738c.mo374t();
            }
        }
    }

    public void mo636a(int i) {
        synchronized (this.f2736a) {
            if (this.f2737b != null) {
                this.f2737b.mo641a(i == 3 ? 1 : 2);
                this.f2737b = null;
            }
        }
    }

    public void m4200a(dc dcVar) {
        synchronized (this.f2736a) {
            this.f2738c = dcVar;
        }
    }

    public void m4201a(C0898a c0898a) {
        synchronized (this.f2736a) {
            this.f2737b = c0898a;
        }
    }

    public void mo637b() {
        synchronized (this.f2736a) {
            if (this.f2738c != null) {
                this.f2738c.mo375u();
            }
        }
    }

    public void mo638c() {
        synchronized (this.f2736a) {
            if (this.f2738c != null) {
                this.f2738c.mo376v();
            }
        }
    }

    public void mo639d() {
        synchronized (this.f2736a) {
            if (this.f2738c != null) {
                this.f2738c.mo377w();
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo640e() {
        /*
        r3 = this;
        r1 = r3.f2736a;
        monitor-enter(r1);
        r0 = r3.f2737b;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x0012;
    L_0x0007:
        r0 = r3.f2737b;	 Catch:{ all -> 0x001d }
        r2 = 0;
        r0.mo641a(r2);	 Catch:{ all -> 0x001d }
        r0 = 0;
        r3.f2737b = r0;	 Catch:{ all -> 0x001d }
        monitor-exit(r1);	 Catch:{ all -> 0x001d }
    L_0x0011:
        return;
    L_0x0012:
        r0 = r3.f2738c;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x001b;
    L_0x0016:
        r0 = r3.f2738c;	 Catch:{ all -> 0x001d }
        r0.mo378x();	 Catch:{ all -> 0x001d }
    L_0x001b:
        monitor-exit(r1);	 Catch:{ all -> 0x001d }
        goto L_0x0011;
    L_0x001d:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001d }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.c.dd.e():void");
    }
}
