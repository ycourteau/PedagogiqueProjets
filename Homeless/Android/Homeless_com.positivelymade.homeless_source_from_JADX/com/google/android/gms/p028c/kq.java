package com.google.android.gms.p028c;

import com.google.android.gms.common.api.C0774g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.p028c.kr.C1117c;

public class kq implements C0774g {
    private final C1113a f3872a;

    public static class C1113a {
        private final Status f3866a;
        private final C1112a f3867b;
        private final byte[] f3868c;
        private final long f3869d;
        private final kk f3870e;
        private final C1117c f3871f;

        public enum C1112a {
            NETWORK,
            DISK,
            DEFAULT
        }

        public C1113a(Status status, kk kkVar, C1112a c1112a) {
            this(status, kkVar, null, null, c1112a, 0);
        }

        public C1113a(Status status, kk kkVar, byte[] bArr, C1117c c1117c, C1112a c1112a, long j) {
            this.f3866a = status;
            this.f3870e = kkVar;
            this.f3868c = bArr;
            this.f3871f = c1117c;
            this.f3867b = c1112a;
            this.f3869d = j;
        }

        public Status m5583a() {
            return this.f3866a;
        }

        public C1112a m5584b() {
            return this.f3867b;
        }

        public byte[] m5585c() {
            return this.f3868c;
        }

        public kk m5586d() {
            return this.f3870e;
        }

        public C1117c m5587e() {
            return this.f3871f;
        }

        public long m5588f() {
            return this.f3869d;
        }
    }

    public kq(C1113a c1113a) {
        this.f3872a = c1113a;
    }

    public Status mo558a() {
        return this.f3872a.m5583a();
    }

    public C1113a m5590b() {
        return this.f3872a;
    }
}
