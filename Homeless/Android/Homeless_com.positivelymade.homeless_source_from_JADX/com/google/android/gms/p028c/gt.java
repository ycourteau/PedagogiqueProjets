package com.google.android.gms.p028c;

import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.common.internal.C1305x;

public class gt {
    private HandlerThread f3413a = null;
    private int f3414b = 0;
    private final Object f3415c = new Object();

    public Looper m4964a() {
        Looper looper;
        synchronized (this.f3415c) {
            if (this.f3413a == null) {
                C1305x.m6626b(this.f3414b == 0, "Invalid state: mHandlerThread should already been initialized.");
                C0691b.m3101d("Starting the looper provider thread.");
                this.f3413a = new HandlerThread("LooperProvider");
                this.f3413a.start();
            }
            this.f3414b++;
            looper = this.f3413a.getLooper();
        }
        return looper;
    }

    public void m4965b() {
        synchronized (this.f3415c) {
            C1305x.m6626b(this.f3414b > 0, "Invalid state: release() called more times than expected.");
            int i = this.f3414b - 1;
            this.f3414b = i;
            if (i == 0) {
                C0691b.m3101d("Terminate the looper provider thread.");
                this.f3413a.quit();
                this.f3413a = null;
            }
        }
    }
}
