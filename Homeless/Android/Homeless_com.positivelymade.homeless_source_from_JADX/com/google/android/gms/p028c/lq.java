package com.google.android.gms.p028c;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class lq {
    protected static final Comparator<byte[]> f3980a = new C11301();
    private List<byte[]> f3981b = new LinkedList();
    private List<byte[]> f3982c = new ArrayList(64);
    private int f3983d = 0;
    private final int f3984e;

    static class C11301 implements Comparator<byte[]> {
        C11301() {
        }

        public int m5778a(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m5778a((byte[]) obj, (byte[]) obj2);
        }
    }

    public lq(int i) {
        this.f3984e = i;
    }

    private synchronized void m5779a() {
        while (this.f3983d > this.f3984e) {
            byte[] bArr = (byte[]) this.f3981b.remove(0);
            this.f3982c.remove(bArr);
            this.f3983d -= bArr.length;
        }
    }

    public synchronized void m5780a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f3984e) {
                this.f3981b.add(bArr);
                int binarySearch = Collections.binarySearch(this.f3982c, bArr, f3980a);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.f3982c.add(binarySearch, bArr);
                this.f3983d += bArr.length;
                m5779a();
            }
        }
    }

    public synchronized byte[] m5781a(int i) {
        byte[] bArr;
        for (int i2 = 0; i2 < this.f3982c.size(); i2++) {
            bArr = (byte[]) this.f3982c.get(i2);
            if (bArr.length >= i) {
                this.f3983d -= bArr.length;
                this.f3982c.remove(i2);
                this.f3981b.remove(bArr);
                break;
            }
        }
        bArr = new byte[i];
        return bArr;
    }
}
