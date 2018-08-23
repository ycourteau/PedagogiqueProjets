package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Parcel;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.C0483d;
import com.google.android.gms.ads.C0489f;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.p028c.fn;

@fn
public final class AdSizeParcel implements SafeParcelable {
    public static final C0521k CREATOR = new C0521k();
    public final int f1347a;
    public final String f1348b;
    public final int f1349c;
    public final int f1350d;
    public final boolean f1351e;
    public final int f1352f;
    public final int f1353g;
    public final AdSizeParcel[] f1354h;
    public final boolean f1355i;

    public AdSizeParcel() {
        this(3, "interstitial_mb", 0, 0, true, 0, 0, null, false);
    }

    AdSizeParcel(int i, String str, int i2, int i3, boolean z, int i4, int i5, AdSizeParcel[] adSizeParcelArr, boolean z2) {
        this.f1347a = i;
        this.f1348b = str;
        this.f1349c = i2;
        this.f1350d = i3;
        this.f1351e = z;
        this.f1352f = i4;
        this.f1353g = i5;
        this.f1354h = adSizeParcelArr;
        this.f1355i = z2;
    }

    public AdSizeParcel(Context context, C0483d c0483d) {
        this(context, new C0483d[]{c0483d});
    }

    public AdSizeParcel(Context context, C0483d[] c0483dArr) {
        int i;
        int i2;
        C0483d c0483d = c0483dArr[0];
        this.f1347a = 3;
        this.f1351e = false;
        this.f1352f = c0483d.m2139b();
        this.f1349c = c0483d.m2137a();
        boolean z = this.f1352f == -1;
        boolean z2 = this.f1349c == -2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (z) {
            if (C0526n.m2400a().m3090c(context) && C0526n.m2400a().m3091d(context)) {
                this.f1353g = m2278a(displayMetrics) - C0526n.m2400a().m3092e(context);
            } else {
                this.f1353g = m2278a(displayMetrics);
            }
            double d = (double) (((float) this.f1353g) / displayMetrics.density);
            i = (int) d;
            if (d - ((double) ((int) d)) >= 0.01d) {
                i++;
            }
            i2 = i;
        } else {
            i = this.f1352f;
            this.f1353g = C0526n.m2400a().m3080a(displayMetrics, this.f1352f);
            i2 = i;
        }
        i = z2 ? m2281c(displayMetrics) : this.f1349c;
        this.f1350d = C0526n.m2400a().m3080a(displayMetrics, i);
        if (z || z2) {
            this.f1348b = i2 + "x" + i + "_as";
        } else {
            this.f1348b = c0483d.toString();
        }
        if (c0483dArr.length > 1) {
            this.f1354h = new AdSizeParcel[c0483dArr.length];
            for (int i3 = 0; i3 < c0483dArr.length; i3++) {
                this.f1354h[i3] = new AdSizeParcel(context, c0483dArr[i3]);
            }
        } else {
            this.f1354h = null;
        }
        this.f1355i = false;
    }

    public AdSizeParcel(AdSizeParcel adSizeParcel, AdSizeParcel[] adSizeParcelArr) {
        this(3, adSizeParcel.f1348b, adSizeParcel.f1349c, adSizeParcel.f1350d, adSizeParcel.f1351e, adSizeParcel.f1352f, adSizeParcel.f1353g, adSizeParcelArr, adSizeParcel.f1355i);
    }

    public static int m2278a(DisplayMetrics displayMetrics) {
        return displayMetrics.widthPixels;
    }

    public static AdSizeParcel m2279a(Context context) {
        return new AdSizeParcel(3, "320x50_mb", 0, 0, false, 0, 0, null, true);
    }

    public static int m2280b(DisplayMetrics displayMetrics) {
        return (int) (((float) m2281c(displayMetrics)) * displayMetrics.density);
    }

    private static int m2281c(DisplayMetrics displayMetrics) {
        int i = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
        return i <= 400 ? 32 : i <= 720 ? 50 : 90;
    }

    public C0483d m2282a() {
        return C0489f.m2164a(this.f1352f, this.f1349c, this.f1348b);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0521k.m2391a(this, parcel, i);
    }
}
