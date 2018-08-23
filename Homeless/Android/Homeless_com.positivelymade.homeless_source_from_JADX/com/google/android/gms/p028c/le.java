package com.google.android.gms.p028c;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;

public final class le {
    private final ByteBuffer f3943a;

    public static class C1127a extends IOException {
        C1127a(int i, int i2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space (pos " + i + " limit " + i2 + ").");
        }
    }

    private le(ByteBuffer byteBuffer) {
        this.f3943a = byteBuffer;
    }

    private le(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, i, i2));
    }

    private static int m5678a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < '') {
            i++;
        }
        int i2 = i;
        i = length;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt >= 'ࠀ') {
                i += le.m5679a(charSequence, i2);
                break;
            }
            i2++;
            i = ((127 - charAt) >>> 31) + i;
        }
        if (i >= length) {
            return i;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i) + 4294967296L));
    }

    private static int m5679a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        int i3 = i;
        while (i3 < length) {
            char charAt = charSequence.charAt(i3);
            if (charAt < 'ࠀ') {
                i2 += (127 - charAt) >>> 31;
            } else {
                i2 += 2;
                if ('?' <= charAt && charAt <= '?') {
                    if (Character.codePointAt(charSequence, i3) < 65536) {
                        throw new IllegalArgumentException("Unpaired surrogate at index " + i3);
                    }
                    i3++;
                }
            }
            i3++;
        }
        return i2;
    }

    private static int m5680a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int length = charSequence.length();
        int i3 = 0;
        int i4 = i + i2;
        while (i3 < length && i3 + i < i4) {
            char charAt = charSequence.charAt(i3);
            if (charAt >= '') {
                break;
            }
            bArr[i + i3] = (byte) charAt;
            i3++;
        }
        if (i3 == length) {
            return i + length;
        }
        int i5 = i + i3;
        while (i3 < length) {
            int i6;
            char charAt2 = charSequence.charAt(i3);
            if (charAt2 < '' && i5 < i4) {
                i6 = i5 + 1;
                bArr[i5] = (byte) charAt2;
            } else if (charAt2 < 'ࠀ' && i5 <= i4 - 2) {
                r6 = i5 + 1;
                bArr[i5] = (byte) ((charAt2 >>> 6) | 960);
                i6 = r6 + 1;
                bArr[r6] = (byte) ((charAt2 & 63) | 128);
            } else if ((charAt2 < '?' || '?' < charAt2) && i5 <= i4 - 3) {
                i6 = i5 + 1;
                bArr[i5] = (byte) ((charAt2 >>> 12) | 480);
                i5 = i6 + 1;
                bArr[i6] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i6 = i5 + 1;
                bArr[i5] = (byte) ((charAt2 & 63) | 128);
            } else if (i5 <= i4 - 4) {
                if (i3 + 1 != charSequence.length()) {
                    i3++;
                    charAt = charSequence.charAt(i3);
                    if (Character.isSurrogatePair(charAt2, charAt)) {
                        int toCodePoint = Character.toCodePoint(charAt2, charAt);
                        i6 = i5 + 1;
                        bArr[i5] = (byte) ((toCodePoint >>> 18) | 240);
                        i5 = i6 + 1;
                        bArr[i6] = (byte) (((toCodePoint >>> 12) & 63) | 128);
                        r6 = i5 + 1;
                        bArr[i5] = (byte) (((toCodePoint >>> 6) & 63) | 128);
                        i6 = r6 + 1;
                        bArr[r6] = (byte) ((toCodePoint & 63) | 128);
                    }
                }
                throw new IllegalArgumentException("Unpaired surrogate at index " + (i3 - 1));
            } else {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i5);
            }
            i3++;
            i5 = i6;
        }
        return i5;
    }

    public static le m5681a(byte[] bArr) {
        return le.m5682a(bArr, 0, bArr.length);
    }

    public static le m5682a(byte[] bArr, int i, int i2) {
        return new le(bArr, i, i2);
    }

    private static void m5683a(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        } else if (byteBuffer.hasArray()) {
            try {
                byteBuffer.position(le.m5680a(charSequence, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining()) - byteBuffer.arrayOffset());
            } catch (Throwable e) {
                BufferOverflowException bufferOverflowException = new BufferOverflowException();
                bufferOverflowException.initCause(e);
                throw bufferOverflowException;
            }
        } else {
            le.m5693b(charSequence, byteBuffer);
        }
    }

    public static int m5684b(float f) {
        return 4;
    }

    public static int m5685b(int i) {
        return i >= 0 ? le.m5702f(i) : 10;
    }

    public static int m5686b(int i, float f) {
        return le.m5698d(i) + le.m5684b(f);
    }

    public static int m5687b(int i, int i2) {
        return le.m5698d(i) + le.m5685b(i2);
    }

    public static int m5688b(int i, lk lkVar) {
        return (le.m5698d(i) * 2) + le.m5697c(lkVar);
    }

    public static int m5689b(int i, String str) {
        return le.m5698d(i) + le.m5691b(str);
    }

    public static int m5690b(int i, boolean z) {
        return le.m5698d(i) + le.m5692b(z);
    }

    public static int m5691b(String str) {
        int a = le.m5678a((CharSequence) str);
        return a + le.m5702f(a);
    }

    public static int m5692b(boolean z) {
        return 1;
    }

    private static void m5693b(CharSequence charSequence, ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt < '') {
                byteBuffer.put((byte) charAt);
            } else if (charAt < 'ࠀ') {
                byteBuffer.put((byte) ((charAt >>> 6) | 960));
                byteBuffer.put((byte) ((charAt & 63) | 128));
            } else if (charAt < '?' || '?' < charAt) {
                byteBuffer.put((byte) ((charAt >>> 12) | 480));
                byteBuffer.put((byte) (((charAt >>> 6) & 63) | 128));
                byteBuffer.put((byte) ((charAt & 63) | 128));
            } else {
                if (i + 1 != charSequence.length()) {
                    i++;
                    char charAt2 = charSequence.charAt(i);
                    if (Character.isSurrogatePair(charAt, charAt2)) {
                        int toCodePoint = Character.toCodePoint(charAt, charAt2);
                        byteBuffer.put((byte) ((toCodePoint >>> 18) | 240));
                        byteBuffer.put((byte) (((toCodePoint >>> 12) & 63) | 128));
                        byteBuffer.put((byte) (((toCodePoint >>> 6) & 63) | 128));
                        byteBuffer.put((byte) ((toCodePoint & 63) | 128));
                    }
                }
                throw new IllegalArgumentException("Unpaired surrogate at index " + (i - 1));
            }
            i++;
        }
    }

    public static int m5694c(int i, long j) {
        return le.m5698d(i) + le.m5696c(j);
    }

    public static int m5695c(int i, lk lkVar) {
        return le.m5698d(i) + le.m5701d(lkVar);
    }

    public static int m5696c(long j) {
        return le.m5703f(j);
    }

    public static int m5697c(lk lkVar) {
        return lkVar.m4713h();
    }

    public static int m5698d(int i) {
        return le.m5702f(lo.m5771a(i, 0));
    }

    public static int m5699d(int i, long j) {
        return le.m5698d(i) + le.m5700d(j);
    }

    public static int m5700d(long j) {
        return le.m5703f(le.m5704g(j));
    }

    public static int m5701d(lk lkVar) {
        int h = lkVar.m4713h();
        return h + le.m5702f(h);
    }

    public static int m5702f(int i) {
        return (i & -128) == 0 ? 1 : (i & -16384) == 0 ? 2 : (-2097152 & i) == 0 ? 3 : (-268435456 & i) == 0 ? 4 : 5;
    }

    public static int m5703f(long j) {
        return (-128 & j) == 0 ? 1 : (-16384 & j) == 0 ? 2 : (-2097152 & j) == 0 ? 3 : (-268435456 & j) == 0 ? 4 : (-34359738368L & j) == 0 ? 5 : (-4398046511104L & j) == 0 ? 6 : (-562949953421312L & j) == 0 ? 7 : (-72057594037927936L & j) == 0 ? 8 : (Long.MIN_VALUE & j) == 0 ? 9 : 10;
    }

    public static long m5704g(long j) {
        return (j << 1) ^ (j >> 63);
    }

    public int m5705a() {
        return this.f3943a.remaining();
    }

    public void m5706a(byte b) {
        if (this.f3943a.hasRemaining()) {
            this.f3943a.put(b);
            return;
        }
        throw new C1127a(this.f3943a.position(), this.f3943a.limit());
    }

    public void m5707a(float f) {
        m5729g(Float.floatToIntBits(f));
    }

    public void m5708a(int i) {
        if (i >= 0) {
            m5727e(i);
        } else {
            m5728e((long) i);
        }
    }

    public void m5709a(int i, float f) {
        m5726c(i, 5);
        m5707a(f);
    }

    public void m5710a(int i, int i2) {
        m5726c(i, 0);
        m5708a(i2);
    }

    public void m5711a(int i, long j) {
        m5726c(i, 0);
        m5715a(j);
    }

    public void m5712a(int i, lk lkVar) {
        m5726c(i, 2);
        m5722b(lkVar);
    }

    public void m5713a(int i, String str) {
        m5726c(i, 2);
        m5717a(str);
    }

    public void m5714a(int i, boolean z) {
        m5726c(i, 0);
        m5718a(z);
    }

    public void m5715a(long j) {
        m5728e(j);
    }

    public void m5716a(lk lkVar) {
        lkVar.mo730a(this);
    }

    public void m5717a(String str) {
        try {
            int f = le.m5702f(str.length());
            if (f == le.m5702f(str.length() * 3)) {
                int position = this.f3943a.position();
                this.f3943a.position(position + f);
                le.m5683a((CharSequence) str, this.f3943a);
                int position2 = this.f3943a.position();
                this.f3943a.position(position);
                m5727e((position2 - position) - f);
                this.f3943a.position(position2);
                return;
            }
            m5727e(le.m5678a((CharSequence) str));
            le.m5683a((CharSequence) str, this.f3943a);
        } catch (BufferOverflowException e) {
            throw new C1127a(this.f3943a.position(), this.f3943a.limit());
        }
    }

    public void m5718a(boolean z) {
        m5725c(z ? 1 : 0);
    }

    public void m5719b() {
        if (m5705a() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public void m5720b(int i, long j) {
        m5726c(i, 0);
        m5721b(j);
    }

    public void m5721b(long j) {
        m5728e(le.m5704g(j));
    }

    public void m5722b(lk lkVar) {
        m5727e(lkVar.m4712g());
        lkVar.mo730a(this);
    }

    public void m5723b(byte[] bArr) {
        m5724b(bArr, 0, bArr.length);
    }

    public void m5724b(byte[] bArr, int i, int i2) {
        if (this.f3943a.remaining() >= i2) {
            this.f3943a.put(bArr, i, i2);
            return;
        }
        throw new C1127a(this.f3943a.position(), this.f3943a.limit());
    }

    public void m5725c(int i) {
        m5706a((byte) i);
    }

    public void m5726c(int i, int i2) {
        m5727e(lo.m5771a(i, i2));
    }

    public void m5727e(int i) {
        while ((i & -128) != 0) {
            m5725c((i & 127) | 128);
            i >>>= 7;
        }
        m5725c(i);
    }

    public void m5728e(long j) {
        while ((-128 & j) != 0) {
            m5725c((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m5725c((int) j);
    }

    public void m5729g(int i) {
        m5725c(i & 255);
        m5725c((i >> 8) & 255);
        m5725c((i >> 16) & 255);
        m5725c((i >> 24) & 255);
    }
}
