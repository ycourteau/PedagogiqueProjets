package com.google.android.gms.p028c;

import android.os.Bundle;
import com.google.android.gms.ads.internal.C0618p;

@fn
public class gi {
    private final Object f3334a;
    private int f3335b;
    private int f3336c;
    private final gf f3337d;
    private final String f3338e;

    gi(gf gfVar, String str) {
        this.f3334a = new Object();
        this.f3337d = gfVar;
        this.f3338e = str;
    }

    public gi(String str) {
        this(C0618p.m2799h(), str);
    }

    public Bundle m4803a() {
        Bundle bundle;
        synchronized (this.f3334a) {
            bundle = new Bundle();
            bundle.putInt("pmnli", this.f3335b);
            bundle.putInt("pmnll", this.f3336c);
        }
        return bundle;
    }

    public void m4804a(int i, int i2) {
        synchronized (this.f3334a) {
            this.f3335b = i;
            this.f3336c = i2;
            this.f3337d.m4779a(this.f3338e, this);
        }
    }
}
