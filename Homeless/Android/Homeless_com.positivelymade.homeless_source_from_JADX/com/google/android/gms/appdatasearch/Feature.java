package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class Feature implements SafeParcelable {
    public static final C0792e CREATOR = new C0792e();
    final int f2281a;
    public final int f2282b;
    final Bundle f2283c;

    Feature(int i, int i2, Bundle bundle) {
        this.f2281a = i;
        this.f2282b = i2;
        this.f2283c = bundle;
    }

    public int describeContents() {
        C0792e c0792e = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0792e c0792e = CREATOR;
        C0792e.m3736a(this, parcel, i);
    }
}
