package com.google.android.gms.common.stats;

import android.os.SystemClock;
import android.support.v4.p007f.C0086g;
import android.util.Log;

public class C1535e {
    private final long f4612a;
    private final int f4613b;
    private final C0086g<String, Long> f4614c;

    public C1535e() {
        this.f4612a = 60000;
        this.f4613b = 10;
        this.f4614c = new C0086g(10);
    }

    public C1535e(int i, long j) {
        this.f4612a = j;
        this.f4613b = i;
        this.f4614c = new C0086g();
    }

    private void m6968a(long j, long j2) {
        for (int size = this.f4614c.size() - 1; size >= 0; size--) {
            if (j2 - ((Long) this.f4614c.m466c(size)).longValue() > j) {
                this.f4614c.m467d(size);
            }
        }
    }

    public Long m6969a(String str) {
        Long l;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f4612a;
        synchronized (this) {
            while (this.f4614c.size() >= this.f4613b) {
                m6968a(j, elapsedRealtime);
                j /= 2;
                Log.w("ConnectionTracker", "The max capacity " + this.f4613b + " is not enough. Current durationThreshold is: " + j);
            }
            l = (Long) this.f4614c.put(str, Long.valueOf(elapsedRealtime));
        }
        return l;
    }

    public boolean m6970b(String str) {
        boolean z;
        synchronized (this) {
            z = this.f4614c.remove(str) != null;
        }
        return z;
    }
}
