package com.google.android.gms.p028c;

import java.security.MessageDigest;

public class ap extends am {
    private MessageDigest f2435b;

    byte m3849a(int i) {
        return (byte) ((((i & 255) ^ ((65280 & i) >> 8)) ^ ((16711680 & i) >> 16)) ^ ((-16777216 & i) >> 24));
    }

    public byte[] mo589a(String str) {
        byte[] a = m3851a(str.split(" "));
        this.f2435b = m3835a();
        synchronized (this.a) {
            if (this.f2435b == null) {
                a = new byte[0];
            } else {
                this.f2435b.reset();
                this.f2435b.update(a);
                Object digest = this.f2435b.digest();
                int i = 4;
                if (digest.length <= 4) {
                    i = digest.length;
                }
                a = new byte[i];
                System.arraycopy(digest, 0, a, 0, a.length);
            }
        }
        return a;
    }

    byte[] m3851a(String[] strArr) {
        byte[] bArr = new byte[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            bArr[i] = m3849a(ao.m3844a(strArr[i]));
        }
        return bArr;
    }
}
