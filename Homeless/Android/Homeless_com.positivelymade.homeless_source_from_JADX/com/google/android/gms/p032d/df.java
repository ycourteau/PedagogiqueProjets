package com.google.android.gms.p032d;

import com.google.android.gms.p028c.C0914e;
import com.google.android.gms.p028c.C0934f;
import com.google.android.gms.p028c.C1010h.C1009a;
import java.util.Map;

class df extends C1546o {
    private static final String f4929a = C0914e.CUSTOM_VAR.toString();
    private static final String f4930b = C0934f.NAME.toString();
    private static final String f4931c = C0934f.DEFAULT_VALUE.toString();
    private final C1585c f4932d;

    public df(C1585c c1585c) {
        super(f4929a, f4930b);
        this.f4932d = c1585c;
    }

    public C1009a mo972a(Map<String, C1009a> map) {
        Object c = this.f4932d.m7275c(cj.m7319a((C1009a) map.get(f4930b)));
        if (c != null) {
            return cj.m7332e(c);
        }
        C1009a c1009a = (C1009a) map.get(f4931c);
        return c1009a != null ? c1009a : cj.m7335f();
    }

    public boolean mo973a() {
        return false;
    }
}
