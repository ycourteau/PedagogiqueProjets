package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.internal.client.C0527x.C0528a;
import java.util.Random;

public class C0529o extends C0528a {
    private final Random f1449a = new Random();
    private long f1450b;
    private Object f1451c = new Object();

    public C0529o() {
        m2407a();
    }

    public void m2407a() {
        synchronized (this.f1451c) {
            int i = 3;
            long j = 0;
            while (true) {
                i--;
                if (i <= 0) {
                    break;
                }
                j = ((long) this.f1449a.nextInt()) + 2147483648L;
                if (j != this.f1450b && j != 0) {
                    break;
                }
            }
            this.f1450b = j;
        }
    }

    public long mo393b() {
        return this.f1450b;
    }
}
