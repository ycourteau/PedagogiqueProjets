package com.google.android.gms.p028c;

public class ld {
    private final byte[] f3940a = new byte[256];
    private int f3941b;
    private int f3942c;

    public ld(byte[] bArr) {
        int i;
        for (i = 0; i < 256; i++) {
            this.f3940a[i] = (byte) i;
        }
        i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            i = ((i + this.f3940a[i2]) + bArr[i2 % bArr.length]) & 255;
            byte b = this.f3940a[i2];
            this.f3940a[i2] = this.f3940a[i];
            this.f3940a[i] = b;
        }
        this.f3941b = 0;
        this.f3942c = 0;
    }

    public void m5677a(byte[] bArr) {
        int i = this.f3941b;
        int i2 = this.f3942c;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            i = (i + 1) & 255;
            i2 = (i2 + this.f3940a[i]) & 255;
            byte b = this.f3940a[i];
            this.f3940a[i] = this.f3940a[i2];
            this.f3940a[i2] = b;
            bArr[i3] = (byte) (bArr[i3] ^ this.f3940a[(this.f3940a[i] + this.f3940a[i2]) & 255]);
        }
        this.f3941b = i;
        this.f3942c = i2;
    }
}
