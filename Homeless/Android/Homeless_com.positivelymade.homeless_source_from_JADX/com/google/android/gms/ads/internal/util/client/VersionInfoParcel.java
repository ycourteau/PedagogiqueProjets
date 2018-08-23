package com.google.android.gms.ads.internal.util.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.p028c.fn;

@fn
public final class VersionInfoParcel implements SafeParcelable {
    public static final C0692c CREATOR = new C0692c();
    public final int f1975a;
    public String f1976b;
    public int f1977c;
    public int f1978d;
    public boolean f1979e;

    public VersionInfoParcel(int i, int i2, boolean z) {
        this(1, "afma-sdk-a-v" + i + "." + i2 + "." + (z ? "0" : "1"), i, i2, z);
    }

    VersionInfoParcel(int i, String str, int i2, int i3, boolean z) {
        this.f1975a = i;
        this.f1976b = str;
        this.f1977c = i2;
        this.f1978d = i3;
        this.f1979e = z;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0692c.m3104a(this, parcel, i);
    }
}
