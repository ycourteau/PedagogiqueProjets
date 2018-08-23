package com.google.android.gms.common.api;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1173a.C0653c;
import com.google.android.gms.common.api.C1183k.C0783a;
import com.google.android.gms.common.api.C1216p.C0782e;
import java.util.Collections;

public class C1208o implements C1187q {
    private final C1216p f4181a;

    public C1208o(C1216p c1216p) {
        this.f4181a = c1216p;
    }

    public <A extends C0653c, R extends C0774g, T extends C0783a<R, A>> T mo857a(T t) {
        this.f4181a.f4192b.add(t);
        return t;
    }

    public void mo858a() {
        this.f4181a.m6161g();
        this.f4181a.f4196f = Collections.emptySet();
    }

    public void mo859a(int i) {
    }

    public void mo860a(Bundle bundle) {
    }

    public void mo861a(ConnectionResult connectionResult, C1173a<?> c1173a, int i) {
    }

    public <A extends C0653c, T extends C0783a<? extends C0774g, A>> T mo862b(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public void mo863b() {
        for (C0782e c : this.f4181a.f4192b) {
            c.m3700c();
        }
        this.f4181a.f4192b.clear();
        this.f4181a.f4195e.clear();
        this.f4181a.m6160f();
    }

    public void mo864c() {
        this.f4181a.m6162h();
    }

    public String mo865d() {
        return "DISCONNECTED";
    }
}
