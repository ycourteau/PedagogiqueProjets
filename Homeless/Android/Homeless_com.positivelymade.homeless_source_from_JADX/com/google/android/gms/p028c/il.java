package com.google.android.gms.p028c;

import android.os.SystemClock;

public final class il implements ik {
    private static il f3600a;

    public static synchronized ik m5268d() {
        ik ikVar;
        synchronized (il.class) {
            if (f3600a == null) {
                f3600a = new il();
            }
            ikVar = f3600a;
        }
        return ikVar;
    }

    public long mo824a() {
        return System.currentTimeMillis();
    }

    public long mo825b() {
        return SystemClock.elapsedRealtime();
    }

    public long mo826c() {
        return System.nanoTime();
    }
}
