package com.google.android.gms.p032d;

import com.google.android.gms.p028c.C1010h.C1009a;
import java.net.URLEncoder;

class cn {
    private static az<C1009a> m7362a(az<C1009a> azVar) {
        try {
            return new az(cj.m7332e(cn.m7365a(cj.m7319a((C1009a) azVar.m7111a()))), azVar.m7112b());
        } catch (Throwable e) {
            aj.m7037a("Escape URI: unsupported encoding", e);
            return azVar;
        }
    }

    private static az<C1009a> m7363a(az<C1009a> azVar, int i) {
        if (cn.m7366a((C1009a) azVar.m7111a())) {
            switch (i) {
                case 12:
                    return cn.m7362a((az) azVar);
                default:
                    aj.m7036a("Unsupported Value Escaping: " + i);
                    return azVar;
            }
        }
        aj.m7036a("Escaping can only be applied to strings.");
        return azVar;
    }

    static az<C1009a> m7364a(az<C1009a> azVar, int... iArr) {
        az a;
        for (int a2 : iArr) {
            a = cn.m7363a(a, a2);
        }
        return a;
    }

    static String m7365a(String str) {
        return URLEncoder.encode(str, "UTF-8").replaceAll("\\+", "%20");
    }

    private static boolean m7366a(C1009a c1009a) {
        return cj.m7333e(c1009a) instanceof String;
    }
}
