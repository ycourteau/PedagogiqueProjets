package com.google.android.gms.ads.internal.formats;

import android.os.Bundle;
import com.google.android.gms.ads.internal.formats.C0569g.C0563a;
import com.google.android.gms.p028c.bl;
import com.google.android.gms.p028c.bp.C0562a;
import com.google.android.gms.p028c.fn;
import com.google.android.gms.p029b.C0799a;
import com.google.android.gms.p029b.C0802b;
import java.util.List;

@fn
public class C0564c extends C0562a implements C0563a {
    private final String f1487a;
    private final List<C0561b> f1488b;
    private final String f1489c;
    private final bl f1490d;
    private final String f1491e;
    private final double f1492f;
    private final String f1493g;
    private final String f1494h;
    private final C0559a f1495i;
    private final Bundle f1496j;
    private final Object f1497k = new Object();
    private C0569g f1498l;

    public C0564c(String str, List list, String str2, bl blVar, String str3, double d, String str4, String str5, C0559a c0559a, Bundle bundle) {
        this.f1487a = str;
        this.f1488b = list;
        this.f1489c = str2;
        this.f1490d = blVar;
        this.f1491e = str3;
        this.f1492f = d;
        this.f1493g = str4;
        this.f1494h = str5;
        this.f1495i = c0559a;
        this.f1496j = bundle;
    }

    public String mo411a() {
        return this.f1487a;
    }

    public void mo412a(C0569g c0569g) {
        synchronized (this.f1497k) {
            this.f1498l = c0569g;
        }
    }

    public List mo413b() {
        return this.f1488b;
    }

    public String mo414c() {
        return this.f1489c;
    }

    public bl mo415d() {
        return this.f1490d;
    }

    public String mo416e() {
        return this.f1491e;
    }

    public double mo417f() {
        return this.f1492f;
    }

    public String mo418g() {
        return this.f1493g;
    }

    public String mo419h() {
        return this.f1494h;
    }

    public C0799a mo420i() {
        return C0802b.m3754a(this.f1498l);
    }

    public String mo421j() {
        return "2";
    }

    public String mo422k() {
        return "";
    }

    public Bundle mo423l() {
        return this.f1496j;
    }
}
