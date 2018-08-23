package com.google.android.gms.p028c;

import java.util.Arrays;

final class lm {
    final int f3957a;
    final byte[] f3958b;

    int m5760a() {
        return (0 + le.m5702f(this.f3957a)) + this.f3958b.length;
    }

    void m5761a(le leVar) {
        leVar.m5727e(this.f3957a);
        leVar.m5723b(this.f3958b);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lm)) {
            return false;
        }
        lm lmVar = (lm) obj;
        return this.f3957a == lmVar.f3957a && Arrays.equals(this.f3958b, lmVar.f3958b);
    }

    public int hashCode() {
        return ((this.f3957a + 527) * 31) + Arrays.hashCode(this.f3958b);
    }
}
