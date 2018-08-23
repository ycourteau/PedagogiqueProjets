package com.google.android.gms.p028c;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.C0618p;
import com.google.android.gms.common.C1241e;

@fn
public class ay {
    private final Object f2446a = new Object();
    private boolean f2447b = false;
    private SharedPreferences f2448c = null;

    public <T> T m3892a(av<T> avVar) {
        synchronized (this.f2446a) {
            if (this.f2447b) {
                return avVar.mo591a(this.f2448c);
            }
            T b = avVar.m3877b();
            return b;
        }
    }

    public void m3893a(Context context) {
        synchronized (this.f2446a) {
            if (this.f2447b) {
                return;
            }
            Context e = C1241e.m6290e(context);
            if (e == null) {
                return;
            }
            this.f2448c = C0618p.m2803l().m3891a(e);
            this.f2447b = true;
        }
    }
}
