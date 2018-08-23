package com.google.android.gms.p028c;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.internal.formats.C0561b;
import com.google.android.gms.ads.p017d.C0423h;
import com.google.android.gms.ads.p019b.C0463a.C0462a;
import com.google.android.gms.p028c.dl.C0905a;
import com.google.android.gms.p029b.C0799a;
import com.google.android.gms.p029b.C0802b;
import java.util.ArrayList;
import java.util.List;

@fn
public class dq extends C0905a {
    private final C0423h f2776a;

    public dq(C0423h c0423h) {
        this.f2776a = c0423h;
    }

    public String mo660a() {
        return this.f2776a.m1960e();
    }

    public void mo661a(C0799a c0799a) {
        this.f2776a.m1948b((View) C0802b.m3755a(c0799a));
    }

    public List mo662b() {
        List<C0462a> f = this.f2776a.m1962f();
        if (f == null) {
            return null;
        }
        List arrayList = new ArrayList();
        for (C0462a c0462a : f) {
            arrayList.add(new C0561b(c0462a.mo598a(), c0462a.mo599b()));
        }
        return arrayList;
    }

    public void mo663b(C0799a c0799a) {
        this.f2776a.mo321a((View) C0802b.m3755a(c0799a));
    }

    public String mo664c() {
        return this.f2776a.m1963g();
    }

    public bl mo665d() {
        C0462a h = this.f2776a.m1964h();
        return h != null ? new C0561b(h.mo598a(), h.mo599b()) : null;
    }

    public String mo666e() {
        return this.f2776a.m1965i();
    }

    public double mo667f() {
        return this.f2776a.m1966j();
    }

    public String mo668g() {
        return this.f2776a.m1967k();
    }

    public String mo669h() {
        return this.f2776a.m1968l();
    }

    public void mo670i() {
        this.f2776a.m1952d();
    }

    public boolean mo671j() {
        return this.f2776a.m1947a();
    }

    public boolean mo672k() {
        return this.f2776a.m1950b();
    }

    public Bundle mo673l() {
        return this.f2776a.m1951c();
    }
}
