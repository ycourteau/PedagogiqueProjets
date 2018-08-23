package com.google.android.gms.p032d;

import android.util.Base64;
import com.google.android.gms.p028c.C0914e;
import com.google.android.gms.p028c.C0934f;
import com.google.android.gms.p028c.C1010h.C1009a;
import java.util.Map;

class C1614i extends C1546o {
    private static final String f4976a = C0914e.ENCODE.toString();
    private static final String f4977b = C0934f.ARG0.toString();
    private static final String f4978c = C0934f.NO_PADDING.toString();
    private static final String f4979d = C0934f.INPUT_FORMAT.toString();
    private static final String f4980e = C0934f.OUTPUT_FORMAT.toString();

    public C1614i() {
        super(f4976a, f4977b);
    }

    public C1009a mo972a(Map<String, C1009a> map) {
        C1009a c1009a = (C1009a) map.get(f4977b);
        if (c1009a == null || c1009a == cj.m7335f()) {
            return cj.m7335f();
        }
        String a = cj.m7319a(c1009a);
        c1009a = (C1009a) map.get(f4979d);
        String a2 = c1009a == null ? "text" : cj.m7319a(c1009a);
        c1009a = (C1009a) map.get(f4980e);
        String a3 = c1009a == null ? "base16" : cj.m7319a(c1009a);
        c1009a = (C1009a) map.get(f4978c);
        int i = (c1009a == null || !cj.m7330d(c1009a).booleanValue()) ? 2 : 3;
        try {
            byte[] bytes;
            Object a4;
            if ("text".equals(a2)) {
                bytes = a.getBytes();
            } else if ("base16".equals(a2)) {
                bytes = cu.m7384a(a);
            } else if ("base64".equals(a2)) {
                bytes = Base64.decode(a, i);
            } else if ("base64url".equals(a2)) {
                bytes = Base64.decode(a, i | 8);
            } else {
                aj.m7036a("Encode: unknown input format: " + a2);
                return cj.m7335f();
            }
            if ("base16".equals(a3)) {
                a4 = cu.m7383a(bytes);
            } else if ("base64".equals(a3)) {
                a4 = Base64.encodeToString(bytes, i);
            } else if ("base64url".equals(a3)) {
                a4 = Base64.encodeToString(bytes, i | 8);
            } else {
                aj.m7036a("Encode: unknown output format: " + a3);
                return cj.m7335f();
            }
            return cj.m7332e(a4);
        } catch (IllegalArgumentException e) {
            aj.m7036a("Encode: invalid input:");
            return cj.m7335f();
        }
    }

    public boolean mo973a() {
        return true;
    }
}
