package com.google.android.gms.ads.internal.request;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class CapabilityParcel implements SafeParcelable {
    public static final Creator<CapabilityParcel> CREATOR = new C0662i();
    public final int f1890a;
    public final boolean f1891b;
    public final boolean f1892c;

    CapabilityParcel(int i, boolean z, boolean z2) {
        this.f1890a = i;
        this.f1891b = z;
        this.f1892c = z2;
    }

    public CapabilityParcel(boolean z, boolean z2) {
        this(1, z, z2);
    }

    public Bundle m2906a() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("iap_supported", this.f1891b);
        bundle.putBoolean("default_iap_supported", this.f1892c);
        return bundle;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0662i.m3011a(this, parcel, i);
    }
}
