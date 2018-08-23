package com.google.android.gms.p028c;

import java.io.IOException;

class C1146t implements C1143r {
    private le f4036a;
    private byte[] f4037b;
    private final int f4038c;

    public C1146t(int i) {
        this.f4038c = i;
        mo847a();
    }

    public void mo847a() {
        this.f4037b = new byte[this.f4038c];
        this.f4036a = le.m5681a(this.f4037b);
    }

    public void mo848a(int i, long j) {
        this.f4036a.m5711a(i, j);
    }

    public void mo849a(int i, String str) {
        this.f4036a.m5713a(i, str);
    }

    public byte[] mo850b() {
        int a = this.f4036a.m5705a();
        if (a < 0) {
            throw new IOException();
        } else if (a == 0) {
            return this.f4037b;
        } else {
            Object obj = new byte[(this.f4037b.length - a)];
            System.arraycopy(this.f4037b, 0, obj, 0, obj.length);
            return obj;
        }
    }
}
