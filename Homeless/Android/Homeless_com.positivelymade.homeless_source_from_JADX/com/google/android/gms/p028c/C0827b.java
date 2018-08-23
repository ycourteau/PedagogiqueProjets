package com.google.android.gms.p028c;

import java.io.ByteArrayOutputStream;

public class C0827b extends ByteArrayOutputStream {
    private final lq f2501a;

    public C0827b(lq lqVar, int i) {
        this.f2501a = lqVar;
        this.buf = this.f2501a.m5781a(Math.max(i, 256));
    }

    private void m3896a(int i) {
        if (this.count + i > this.buf.length) {
            Object a = this.f2501a.m5781a((this.count + i) * 2);
            System.arraycopy(this.buf, 0, a, 0, this.count);
            this.f2501a.m5780a(this.buf);
            this.buf = a;
        }
    }

    public void close() {
        this.f2501a.m5780a(this.buf);
        this.buf = null;
        super.close();
    }

    public void finalize() {
        this.f2501a.m5780a(this.buf);
    }

    public synchronized void write(int i) {
        m3896a(1);
        super.write(i);
    }

    public synchronized void write(byte[] bArr, int i, int i2) {
        m3896a(i2);
        super.write(bArr, i, i2);
    }
}
