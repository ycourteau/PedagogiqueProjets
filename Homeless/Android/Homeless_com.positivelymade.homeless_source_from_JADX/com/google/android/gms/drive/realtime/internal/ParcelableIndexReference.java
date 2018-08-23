package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ParcelableIndexReference implements SafeParcelable {
    public static final Creator<ParcelableIndexReference> CREATOR = new C1759r();
    final int f5361a;
    final String f5362b;
    final int f5363c;
    final boolean f5364d;
    final int f5365e;

    ParcelableIndexReference(int i, String str, int i2, boolean z, int i3) {
        this.f5361a = i;
        this.f5362b = str;
        this.f5363c = i2;
        this.f5364d = z;
        this.f5365e = i3;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1759r.m8183a(this, parcel, i);
    }
}
