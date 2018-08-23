package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.p028c.fn;

@fn
public final class MobileAdsSettingsParcel implements SafeParcelable {
    public static final C0509c CREATOR = new C0509c();
    public final int f1356a;
    public final boolean f1357b;
    public final String f1358c;

    public MobileAdsSettingsParcel(int i, boolean z, String str) {
        this.f1356a = i;
        this.f1357b = z;
        this.f1358c = str;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0509c.m2357a(this, parcel, i);
    }
}
