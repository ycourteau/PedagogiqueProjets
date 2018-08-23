package com.google.android.gms.p028c;

import com.google.android.gms.p028c.iw.C1002a;
import com.google.android.gms.p028c.iw.C1007b;
import java.io.UnsupportedEncodingException;

public class C0848c extends hz<String> {
    private final C1007b<String> f2572a;

    public C0848c(int i, String str, C1007b<String> c1007b, C1002a c1002a) {
        super(i, str, c1002a);
        this.f2572a = c1007b;
    }

    public C0848c(String str, C1007b<String> c1007b, C1002a c1002a) {
        this(0, str, c1007b, c1002a);
    }

    protected iw<String> mo620a(gu guVar) {
        Object str;
        try {
            str = new String(guVar.f3417b, lt.m5813a(guVar.f3418c));
        } catch (UnsupportedEncodingException e) {
            str = new String(guVar.f3417b);
        }
        return iw.m5304a(str, lt.m5812a(guVar));
    }

    protected /* synthetic */ void mo621a(Object obj) {
        mo622a((String) obj);
    }

    protected void mo622a(String str) {
        this.f2572a.mo759a(str);
    }
}
