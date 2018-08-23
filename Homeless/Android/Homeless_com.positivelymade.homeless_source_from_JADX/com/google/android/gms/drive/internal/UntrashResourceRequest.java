package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class UntrashResourceRequest implements SafeParcelable {
    public static final Creator<UntrashResourceRequest> CREATOR = new aq();
    final int f5250a;
    final DriveId f5251b;

    UntrashResourceRequest(int i, DriveId driveId) {
        this.f5250a = i;
        this.f5251b = driveId;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        aq.m7624a(this, parcel, i);
    }
}
