package com.google.android.gms.common.api;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1173a.C0653c;
import com.google.android.gms.common.api.C1183k.C0783a;
import com.google.android.gms.common.api.C1216p.C0782e;
import com.google.android.gms.common.api.C1216p.C1185b;

public class C1188m implements C1187q {
    private final C1216p f4135a;

    public C1188m(C1216p c1216p) {
        this.f4135a = c1216p;
    }

    private <A extends C0653c> void m6036a(C0782e<A> c0782e) {
        this.f4135a.m6148a((C0782e) c0782e);
        C0653c a = this.f4135a.mo876a(c0782e.mo571f());
        if (a.mo512e() || !this.f4135a.f4195e.containsKey(c0782e.mo571f())) {
            c0782e.mo568b(a);
        } else {
            c0782e.mo569d(new Status(17));
        }
    }

    public <A extends C0653c, R extends C0774g, T extends C0783a<R, A>> T mo857a(T t) {
        return mo862b(t);
    }

    public void mo858a() {
        while (!this.f4135a.f4192b.isEmpty()) {
            try {
                m6036a((C0782e) this.f4135a.f4192b.remove());
            } catch (Throwable e) {
                Log.w("GoogleApiClientConnected", "Service died while flushing queue", e);
            }
        }
    }

    public void mo859a(int i) {
        if (i == 1) {
            this.f4135a.m6165k();
        }
        for (C0782e c : this.f4135a.f4200j) {
            c.m3701c(new Status(8, "The connection to Google Play services was lost"));
        }
        this.f4135a.m6144a(null);
        this.f4135a.f4191a.m6410a(i);
        this.f4135a.f4191a.m6409a();
        if (i == 2) {
            this.f4135a.mo883b();
        }
    }

    public void mo860a(Bundle bundle) {
    }

    public void mo861a(ConnectionResult connectionResult, C1173a<?> c1173a, int i) {
    }

    public <A extends C0653c, T extends C0783a<? extends C0774g, A>> T mo862b(T t) {
        try {
            m6036a((C0782e) t);
        } catch (DeadObjectException e) {
            this.f4135a.m6147a(new C1185b(this, this) {
                final /* synthetic */ C1188m f4134a;

                public void mo856a() {
                    this.f4134a.mo859a(1);
                }
            });
        }
        return t;
    }

    public void mo863b() {
        this.f4135a.f4195e.clear();
        this.f4135a.m6160f();
        this.f4135a.m6144a(null);
        this.f4135a.f4191a.m6409a();
    }

    public void mo864c() {
    }

    public String mo865d() {
        return "CONNECTED";
    }
}
