package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class OnDriveIdResponse implements SafeParcelable {
    public static final Creator<OnDriveIdResponse> CREATOR = new C1673v();
    final int f5194a;
    DriveId f5195b;

    OnDriveIdResponse(int i, DriveId driveId) {
        this.f5194a = i;
        this.f5195b = driveId;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1673v.m7857a(this, parcel, i);
    }
}
