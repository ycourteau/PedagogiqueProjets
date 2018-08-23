package com.google.android.gms.p028c;

import java.util.Map;

public class gu {
    public final int f3416a;
    public final byte[] f3417b;
    public final Map<String, String> f3418c;
    public final boolean f3419d;
    public final long f3420e;

    public gu(int i, byte[] bArr, Map<String, String> map, boolean z, long j) {
        this.f3416a = i;
        this.f3417b = bArr;
        this.f3418c = map;
        this.f3419d = z;
        this.f3420e = j;
    }

    public gu(byte[] bArr, Map<String, String> map) {
        this(200, bArr, map, false, 0);
    }
}
