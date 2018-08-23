package com.google.android.gms.p032d;

import android.text.TextUtils;

class C1623u {
    private final long f4992a;
    private final long f4993b;
    private final long f4994c;
    private String f4995d;

    C1623u(long j, long j2, long j3) {
        this.f4992a = j;
        this.f4993b = j2;
        this.f4994c = j3;
    }

    long m7496a() {
        return this.f4992a;
    }

    void m7497a(String str) {
        if (str != null && !TextUtils.isEmpty(str.trim())) {
            this.f4995d = str;
        }
    }

    long m7498b() {
        return this.f4994c;
    }

    String m7499c() {
        return this.f4995d;
    }
}
