package com.google.android.gms.common.internal;

import android.util.Log;

public final class C1288q {
    public static final int f4408a = (23 - " PII_LOG".length());
    private static final String f4409b = null;
    private final String f4410c;
    private final String f4411d;

    public C1288q(String str) {
        this(str, f4409b);
    }

    public C1288q(String str, String str2) {
        C1305x.m6618a((Object) str, (Object) "log tag cannot be null");
        C1305x.m6627b(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, Integer.valueOf(23));
        this.f4410c = str;
        if (str2 == null || str2.length() <= 0) {
            this.f4411d = f4409b;
        } else {
            this.f4411d = str2;
        }
    }

    private String m6448a(String str) {
        return this.f4411d == null ? str : this.f4411d.concat(str);
    }

    public void m6449a(String str, String str2) {
        if (m6451a(5)) {
            Log.w(str, m6448a(str2));
        }
    }

    public void m6450a(String str, String str2, Throwable th) {
        if (m6451a(4)) {
            Log.i(str, m6448a(str2), th);
        }
    }

    public boolean m6451a(int i) {
        return Log.isLoggable(this.f4410c, i);
    }

    public void m6452b(String str, String str2) {
        if (m6451a(6)) {
            Log.e(str, m6448a(str2));
        }
    }

    public void m6453b(String str, String str2, Throwable th) {
        if (m6451a(5)) {
            Log.w(str, m6448a(str2), th);
        }
    }
}
