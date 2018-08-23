package com.google.android.gms.p032d;

import com.google.android.gms.p028c.C0934f;
import com.google.android.gms.p028c.C1010h.C1009a;
import java.util.Map;
import java.util.Set;

public abstract class be extends C1546o {
    private static final String f4653a = C0934f.ARG0.toString();
    private static final String f4654b = C0934f.ARG1.toString();

    public be(String str) {
        super(str, f4653a, f4654b);
    }

    public C1009a mo972a(Map<String, C1009a> map) {
        for (C1009a c1009a : map.values()) {
            if (c1009a == cj.m7335f()) {
                return cj.m7332e(Boolean.valueOf(false));
            }
        }
        C1009a c1009a2 = (C1009a) map.get(f4653a);
        C1009a c1009a3 = (C1009a) map.get(f4654b);
        boolean a = (c1009a2 == null || c1009a3 == null) ? false : mo978a(c1009a2, c1009a3, map);
        return cj.m7332e(Boolean.valueOf(a));
    }

    public boolean mo973a() {
        return true;
    }

    protected abstract boolean mo978a(C1009a c1009a, C1009a c1009a2, Map<String, C1009a> map);

    public /* bridge */ /* synthetic */ String mo976b() {
        return super.mo976b();
    }

    public /* bridge */ /* synthetic */ Set mo977c() {
        return super.mo977c();
    }
}
