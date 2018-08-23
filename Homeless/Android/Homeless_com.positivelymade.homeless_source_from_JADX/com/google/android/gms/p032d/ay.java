package com.google.android.gms.p032d;

import com.google.android.gms.p028c.C1010h.C1009a;
import java.util.Map;

abstract class ay extends be {
    public ay(String str) {
        super(str);
    }

    protected boolean mo978a(C1009a c1009a, C1009a c1009a2, Map<String, C1009a> map) {
        ci b = cj.m7321b(c1009a);
        ci b2 = cj.m7321b(c1009a2);
        return (b == cj.m7329d() || b2 == cj.m7329d()) ? false : mo979a(b, b2, (Map) map);
    }

    protected abstract boolean mo979a(ci ciVar, ci ciVar2, Map<String, C1009a> map);
}
