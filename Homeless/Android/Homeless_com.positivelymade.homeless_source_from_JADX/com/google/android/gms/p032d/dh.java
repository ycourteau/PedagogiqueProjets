package com.google.android.gms.p032d;

import com.google.android.gms.p028c.C0914e;
import com.google.android.gms.p028c.C0934f;
import com.google.android.gms.p028c.C1010h.C1009a;
import java.util.List;
import java.util.Map;

class dh extends ch {
    private static final String f4949a = C0914e.DATA_LAYER_WRITE.toString();
    private static final String f4950b = C0934f.VALUE.toString();
    private static final String f4951c = C0934f.CLEAR_PERSISTENT_DATA_LAYER_PREFIX.toString();
    private final C1585c f4952d;

    public dh(C1585c c1585c) {
        super(f4949a, f4950b);
        this.f4952d = c1585c;
    }

    private void m7453a(C1009a c1009a) {
        if (c1009a != null && c1009a != cj.m7318a()) {
            String a = cj.m7319a(c1009a);
            if (a != cj.m7334e()) {
                this.f4952d.m7268a(a);
            }
        }
    }

    private void m7454b(C1009a c1009a) {
        if (c1009a != null && c1009a != cj.m7318a()) {
            Object e = cj.m7333e(c1009a);
            if (e instanceof List) {
                for (Object e2 : (List) e2) {
                    if (e2 instanceof Map) {
                        this.f4952d.m7272a((Map) e2);
                    }
                }
            }
        }
    }

    public void mo1030b(Map<String, C1009a> map) {
        m7454b((C1009a) map.get(f4950b));
        m7453a((C1009a) map.get(f4951c));
    }
}
