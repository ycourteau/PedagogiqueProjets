package com.google.android.gms.p028c;

import android.view.View;
import com.google.android.gms.ads.internal.C0504g;
import com.google.android.gms.p028c.bi.C0830a;
import com.google.android.gms.p029b.C0799a;
import com.google.android.gms.p029b.C0802b;

@fn
public final class bg extends C0830a {
    private final C0504g f2533a;
    private final String f2534b;
    private final String f2535c;

    public bg(C0504g c0504g, String str, String str2) {
        this.f2533a = c0504g;
        this.f2534b = str;
        this.f2535c = str2;
    }

    public String mo592a() {
        return this.f2534b;
    }

    public void mo593a(C0799a c0799a) {
        if (c0799a != null) {
            this.f2533a.mo381b((View) C0802b.m3755a(c0799a));
        }
    }

    public String mo594b() {
        return this.f2535c;
    }

    public void mo595c() {
        this.f2533a.mo383y();
    }

    public void mo596d() {
        this.f2533a.mo382r();
    }
}
