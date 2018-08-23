package com.google.android.gms.p032d;

import com.google.android.gms.p028c.C0914e;
import com.google.android.gms.p028c.C0934f;
import com.google.android.gms.p028c.C1010h.C1009a;
import java.util.Map;

class bg extends C1546o {
    private static final String f4703a = C0914e.RANDOM.toString();
    private static final String f4704b = C0934f.MIN.toString();
    private static final String f4705c = C0934f.MAX.toString();

    public bg() {
        super(f4703a, new String[0]);
    }

    public C1009a mo972a(Map<String, C1009a> map) {
        double doubleValue;
        double d;
        C1009a c1009a = (C1009a) map.get(f4704b);
        C1009a c1009a2 = (C1009a) map.get(f4705c);
        if (!(c1009a == null || c1009a == cj.m7335f() || c1009a2 == null || c1009a2 == cj.m7335f())) {
            ci b = cj.m7321b(c1009a);
            ci b2 = cj.m7321b(c1009a2);
            if (!(b == cj.m7329d() || b2 == cj.m7329d())) {
                double doubleValue2 = b.doubleValue();
                doubleValue = b2.doubleValue();
                if (doubleValue2 <= doubleValue) {
                    d = doubleValue2;
                    return cj.m7332e(Long.valueOf(Math.round(((doubleValue - d) * Math.random()) + d)));
                }
            }
        }
        doubleValue = 2.147483647E9d;
        d = 0.0d;
        return cj.m7332e(Long.valueOf(Math.round(((doubleValue - d) * Math.random()) + d)));
    }

    public boolean mo973a() {
        return false;
    }
}
