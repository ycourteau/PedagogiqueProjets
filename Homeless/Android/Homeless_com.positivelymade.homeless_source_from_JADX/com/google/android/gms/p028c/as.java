package com.google.android.gms.p028c;

import android.text.TextUtils;

@fn
public final class as {
    private String f2439a;
    private int f2440b;

    public as() {
        this((String) az.f2476b.m3877b(), -1);
    }

    public as(String str) {
        this(str, -1);
    }

    public as(String str, int i) {
        this.f2440b = -1;
        this.f2439a = TextUtils.isEmpty(str) ? (String) az.f2476b.m3877b() : str;
        this.f2440b = i;
    }

    public String m3865a() {
        return this.f2439a;
    }

    public int m3866b() {
        return this.f2440b;
    }
}
