package com.google.android.gms.p032d;

import com.google.android.gms.p028c.C0914e;
import com.google.android.gms.p028c.C0934f;
import com.google.android.gms.p028c.C1010h.C1009a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

class C1622t extends C1546o {
    private static final String f4988a = C0914e.HASH.toString();
    private static final String f4989b = C0934f.ARG0.toString();
    private static final String f4990c = C0934f.ALGORITHM.toString();
    private static final String f4991d = C0934f.INPUT_FORMAT.toString();

    public C1622t() {
        super(f4988a, f4989b);
    }

    private byte[] m7493a(String str, byte[] bArr) {
        MessageDigest instance = MessageDigest.getInstance(str);
        instance.update(bArr);
        return instance.digest();
    }

    public C1009a mo972a(Map<String, C1009a> map) {
        C1009a c1009a = (C1009a) map.get(f4989b);
        if (c1009a == null || c1009a == cj.m7335f()) {
            return cj.m7335f();
        }
        byte[] bytes;
        String a = cj.m7319a(c1009a);
        c1009a = (C1009a) map.get(f4990c);
        String a2 = c1009a == null ? "MD5" : cj.m7319a(c1009a);
        c1009a = (C1009a) map.get(f4991d);
        String a3 = c1009a == null ? "text" : cj.m7319a(c1009a);
        if ("text".equals(a3)) {
            bytes = a.getBytes();
        } else if ("base16".equals(a3)) {
            bytes = cu.m7384a(a);
        } else {
            aj.m7036a("Hash: unknown input format: " + a3);
            return cj.m7335f();
        }
        try {
            return cj.m7332e(cu.m7383a(m7493a(a2, bytes)));
        } catch (NoSuchAlgorithmException e) {
            aj.m7036a("Hash: unknown algorithm: " + a2);
            return cj.m7335f();
        }
    }

    public boolean mo973a() {
        return true;
    }
}
