package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class DrivePreferences implements SafeParcelable {
    public static final Creator<DrivePreferences> CREATOR = new C1644h();
    final int f5025a;
    final boolean f5026b;

    DrivePreferences(int i, boolean z) {
        this.f5025a = i;
        this.f5026b = z;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1644h.m7563a(this, parcel, i);
    }
}
