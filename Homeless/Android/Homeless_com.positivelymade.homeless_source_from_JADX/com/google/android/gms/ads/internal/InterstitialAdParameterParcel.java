package com.google.android.gms.ads.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.p028c.fn;

@fn
public final class InterstitialAdParameterParcel implements SafeParcelable {
    public static final C0578l CREATOR = new C0578l();
    public final int f1304a;
    public final boolean f1305b;
    public final boolean f1306c;

    InterstitialAdParameterParcel(int i, boolean z, boolean z2) {
        this.f1304a = i;
        this.f1305b = z;
        this.f1306c = z2;
    }

    public InterstitialAdParameterParcel(boolean z, boolean z2) {
        this.f1304a = 1;
        this.f1305b = z;
        this.f1306c = z2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0578l.m2605a(this, parcel, i);
    }
}
