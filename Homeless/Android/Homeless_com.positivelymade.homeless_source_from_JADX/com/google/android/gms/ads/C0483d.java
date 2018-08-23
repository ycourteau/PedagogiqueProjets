package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.C0526n;

public final class C0483d {
    public static final C0483d f1277a = new C0483d(320, 50, "320x50_mb");
    public static final C0483d f1278b = new C0483d(468, 60, "468x60_as");
    public static final C0483d f1279c = new C0483d(320, 100, "320x100_as");
    public static final C0483d f1280d = new C0483d(728, 90, "728x90_as");
    public static final C0483d f1281e = new C0483d(300, 250, "300x250_as");
    public static final C0483d f1282f = new C0483d(160, 600, "160x600_as");
    public static final C0483d f1283g = new C0483d(-1, -2, "smart_banner");
    private final int f1284h;
    private final int f1285i;
    private final String f1286j;

    public C0483d(int i, int i2) {
        this(i, i2, (i == -1 ? "FULL" : String.valueOf(i)) + "x" + (i2 == -2 ? "AUTO" : String.valueOf(i2)) + "_as");
    }

    C0483d(int i, int i2, String str) {
        if (i < 0 && i != -1) {
            throw new IllegalArgumentException("Invalid width for AdSize: " + i);
        } else if (i2 >= 0 || i2 == -2) {
            this.f1284h = i;
            this.f1285i = i2;
            this.f1286j = str;
        } else {
            throw new IllegalArgumentException("Invalid height for AdSize: " + i2);
        }
    }

    public int m2137a() {
        return this.f1285i;
    }

    public int m2138a(Context context) {
        return this.f1285i == -2 ? AdSizeParcel.m2280b(context.getResources().getDisplayMetrics()) : C0526n.m2400a().m3079a(context, this.f1285i);
    }

    public int m2139b() {
        return this.f1284h;
    }

    public int m2140b(Context context) {
        return this.f1284h == -1 ? AdSizeParcel.m2278a(context.getResources().getDisplayMetrics()) : C0526n.m2400a().m3079a(context, this.f1284h);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0483d)) {
            return false;
        }
        C0483d c0483d = (C0483d) obj;
        return this.f1284h == c0483d.f1284h && this.f1285i == c0483d.f1285i && this.f1286j.equals(c0483d.f1286j);
    }

    public int hashCode() {
        return this.f1286j.hashCode();
    }

    public String toString() {
        return this.f1286j;
    }
}
