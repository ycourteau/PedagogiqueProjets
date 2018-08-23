package com.google.android.gms.p028c;

import android.location.Location;
import com.google.android.gms.ads.p017d.C0478a;
import java.util.Date;
import java.util.Set;

@fn
public final class dn implements C0478a {
    private final Date f2766a;
    private final int f2767b;
    private final Set<String> f2768c;
    private final boolean f2769d;
    private final Location f2770e;
    private final int f2771f;

    public dn(Date date, int i, Set<String> set, Location location, boolean z, int i2) {
        this.f2766a = date;
        this.f2767b = i;
        this.f2768c = set;
        this.f2770e = location;
        this.f2769d = z;
        this.f2771f = i2;
    }

    public Date mo686a() {
        return this.f2766a;
    }

    public int mo687b() {
        return this.f2767b;
    }

    public Set<String> mo688c() {
        return this.f2768c;
    }

    public Location mo689d() {
        return this.f2770e;
    }

    public int mo690e() {
        return this.f2771f;
    }

    public boolean mo691f() {
        return this.f2769d;
    }
}
