package com.google.android.gms.p028c;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.internal.formats.C0561b;
import com.google.android.gms.ads.p017d.C0425i;
import com.google.android.gms.ads.p019b.C0463a.C0462a;
import com.google.android.gms.p028c.dm.C0907a;
import com.google.android.gms.p029b.C0799a;
import com.google.android.gms.p029b.C0802b;
import java.util.ArrayList;
import java.util.List;

@fn
public class dr extends C0907a {
    private final C0425i f2777a;

    public dr(C0425i c0425i) {
        this.f2777a = c0425i;
    }

    public String mo674a() {
        return this.f2777a.m1976e();
    }

    public void mo675a(C0799a c0799a) {
        this.f2777a.m1948b((View) C0802b.m3755a(c0799a));
    }

    public List mo676b() {
        List<C0462a> f = this.f2777a.m1977f();
        if (f == null) {
            return null;
        }
        List arrayList = new ArrayList();
        for (C0462a c0462a : f) {
            arrayList.add(new C0561b(c0462a.mo598a(), c0462a.mo599b()));
        }
        return arrayList;
    }

    public void mo677b(C0799a c0799a) {
        this.f2777a.mo321a((View) C0802b.m3755a(c0799a));
    }

    public String mo678c() {
        return this.f2777a.m1978g();
    }

    public bl mo679d() {
        C0462a h = this.f2777a.m1979h();
        return h != null ? new C0561b(h.mo598a(), h.mo599b()) : null;
    }

    public String mo680e() {
        return this.f2777a.m1980i();
    }

    public String mo681f() {
        return this.f2777a.m1981j();
    }

    public void mo682g() {
        this.f2777a.m1952d();
    }

    public boolean mo683h() {
        return this.f2777a.m1947a();
    }

    public boolean mo684i() {
        return this.f2777a.m1950b();
    }

    public Bundle mo685j() {
        return this.f2777a.m1951c();
    }
}
