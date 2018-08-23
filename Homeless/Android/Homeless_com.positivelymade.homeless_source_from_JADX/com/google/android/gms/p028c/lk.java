package com.google.android.gms.p028c;

public abstract class lk {
    protected volatile int f3200s = -1;

    public static final void m4707a(lk lkVar, byte[] bArr, int i, int i2) {
        try {
            le a = le.m5682a(bArr, i, i2);
            lkVar.mo730a(a);
            a.m5719b();
        } catch (Throwable e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    public static final byte[] m4708a(lk lkVar) {
        byte[] bArr = new byte[lkVar.m4713h()];
        lk.m4707a(lkVar, bArr, 0, bArr.length);
        return bArr;
    }

    public void mo730a(le leVar) {
    }

    protected int mo731b() {
        return 0;
    }

    public /* synthetic */ Object clone() {
        return mo733f();
    }

    public lk mo733f() {
        return (lk) super.clone();
    }

    public int m4712g() {
        if (this.f3200s < 0) {
            m4713h();
        }
        return this.f3200s;
    }

    public int m4713h() {
        int b = mo731b();
        this.f3200s = b;
        return b;
    }

    public String toString() {
        return ll.m5754a(this);
    }
}
