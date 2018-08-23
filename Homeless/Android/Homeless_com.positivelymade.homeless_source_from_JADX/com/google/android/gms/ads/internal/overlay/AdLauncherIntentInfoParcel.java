package com.google.android.gms.ads.internal.overlay;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.p028c.fn;

@fn
public final class AdLauncherIntentInfoParcel implements SafeParcelable {
    public static final C0591b CREATOR = new C0591b();
    public final int f1586a;
    public final String f1587b;
    public final String f1588c;
    public final String f1589d;
    public final String f1590e;
    public final String f1591f;
    public final String f1592g;
    public final String f1593h;

    public AdLauncherIntentInfoParcel(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f1586a = i;
        this.f1587b = str;
        this.f1588c = str2;
        this.f1589d = str3;
        this.f1590e = str4;
        this.f1591f = str5;
        this.f1592g = str6;
        this.f1593h = str7;
    }

    public AdLauncherIntentInfoParcel(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this(1, str, str2, str3, str4, str5, str6, str7);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0591b.m2661a(this, parcel, i);
    }
}
