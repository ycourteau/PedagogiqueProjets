package com.google.android.gms.p028c;

import android.location.Location;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.p017d.C0481j;
import com.google.android.gms.ads.p019b.C0466b;
import com.google.android.gms.ads.p019b.C0466b.C0465a;
import java.util.Date;
import java.util.List;
import java.util.Set;

@fn
public final class ds implements C0481j {
    private final Date f2778a;
    private final int f2779b;
    private final Set<String> f2780c;
    private final boolean f2781d;
    private final Location f2782e;
    private final int f2783f;
    private final NativeAdOptionsParcel f2784g;
    private final List<String> f2785h;

    public ds(Date date, int i, Set<String> set, Location location, boolean z, int i2, NativeAdOptionsParcel nativeAdOptionsParcel, List<String> list) {
        this.f2778a = date;
        this.f2779b = i;
        this.f2780c = set;
        this.f2782e = location;
        this.f2781d = z;
        this.f2783f = i2;
        this.f2784g = nativeAdOptionsParcel;
        this.f2785h = list;
    }

    public Date mo686a() {
        return this.f2778a;
    }

    public int mo687b() {
        return this.f2779b;
    }

    public Set<String> mo688c() {
        return this.f2780c;
    }

    public Location mo689d() {
        return this.f2782e;
    }

    public int mo690e() {
        return this.f2783f;
    }

    public boolean mo691f() {
        return this.f2781d;
    }

    public C0466b mo710g() {
        return this.f2784g == null ? null : new C0465a().m2065a(this.f2784g.f1473b).m2064a(this.f2784g.f1474c).m2067b(this.f2784g.f1475d).m2066a();
    }

    public boolean mo711h() {
        return this.f2785h != null && this.f2785h.contains("2");
    }

    public boolean mo712i() {
        return this.f2785h != null && this.f2785h.contains("1");
    }
}
