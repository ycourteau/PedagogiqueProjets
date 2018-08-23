package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class GetPermissionsRequest implements SafeParcelable {
    public static final Creator<GetPermissionsRequest> CREATOR = new C1654i();
    final int f5167a;
    final DriveId f5168b;

    GetPermissionsRequest(int i, DriveId driveId) {
        this.f5167a = i;
        this.f5168b = driveId;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1654i.m7698a(this, parcel, i);
    }
}
