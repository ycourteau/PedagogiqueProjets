package com.google.android.gms.p028c;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public abstract class am {
    private static MessageDigest f2425b = null;
    protected Object f2426a = new Object();

    protected MessageDigest m3835a() {
        MessageDigest messageDigest;
        synchronized (this.f2426a) {
            if (f2425b != null) {
                messageDigest = f2425b;
            } else {
                for (int i = 0; i < 2; i++) {
                    try {
                        f2425b = MessageDigest.getInstance("MD5");
                    } catch (NoSuchAlgorithmException e) {
                    }
                }
                messageDigest = f2425b;
            }
        }
        return messageDigest;
    }

    abstract byte[] mo589a(String str);
}
