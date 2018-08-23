package com.google.android.gms.ads.internal.formats;

import android.os.Bundle;
import com.google.android.gms.ads.internal.formats.C0569g.C0563a;
import com.google.android.gms.p028c.bl;
import com.google.android.gms.p028c.br.C0565a;
import com.google.android.gms.p028c.fn;
import com.google.android.gms.p029b.C0799a;
import com.google.android.gms.p029b.C0802b;
import java.util.List;

@fn
public class C0566d extends C0565a implements C0563a {
    private final String f1499a;
    private final List<C0561b> f1500b;
    private final String f1501c;
    private final bl f1502d;
    private final String f1503e;
    private final String f1504f;
    private final C0559a f1505g;
    private final Bundle f1506h;
    private final Object f1507i = new Object();
    private C0569g f1508j;

    public C0566d(String str, List list, String str2, bl blVar, String str3, String str4, C0559a c0559a, Bundle bundle) {
        this.f1499a = str;
        this.f1500b = list;
        this.f1501c = str2;
        this.f1502d = blVar;
        this.f1503e = str3;
        this.f1504f = str4;
        this.f1505g = c0559a;
        this.f1506h = bundle;
    }

    public String mo424a() {
        return this.f1499a;
    }

    public void mo412a(C0569g c0569g) {
        synchronized (this.f1507i) {
            this.f1508j = c0569g;
        }
    }

    public List mo425b() {
        return this.f1500b;
    }

    public String mo426c() {
        return this.f1501c;
    }

    public bl mo427d() {
        return this.f1502d;
    }

    public String mo428e() {
        return this.f1503e;
    }

    public String mo429f() {
        return this.f1504f;
    }

    public C0799a mo430g() {
        return C0802b.m3754a(this.f1508j);
    }

    public Bundle mo431h() {
        return this.f1506h;
    }

    public String mo421j() {
        return "1";
    }

    public String mo422k() {
        return "";
    }
}
