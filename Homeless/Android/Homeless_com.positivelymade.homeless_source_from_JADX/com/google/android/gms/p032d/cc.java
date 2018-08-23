package com.google.android.gms.p032d;

import com.google.android.gms.p028c.C1010h.C1009a;
import java.util.Map;

abstract class cc extends be {
    public cc(String str) {
        super(str);
    }

    protected boolean mo978a(C1009a c1009a, C1009a c1009a2, Map<String, C1009a> map) {
        String a = cj.m7319a(c1009a);
        String a2 = cj.m7319a(c1009a2);
        return (a == cj.m7334e() || a2 == cj.m7334e()) ? false : mo1014a(a, a2, (Map) map);
    }

    protected abstract boolean mo1014a(String str, String str2, Map<String, C1009a> map);
}
