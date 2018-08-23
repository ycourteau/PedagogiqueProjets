package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class UpdatePermissionRequest implements SafeParcelable {
    public static final Creator<UpdatePermissionRequest> CREATOR = new as();
    final int f5255a;
    final DriveId f5256b;
    final String f5257c;
    final int f5258d;
    final boolean f5259e;
    final String f5260f;

    UpdatePermissionRequest(int i, DriveId driveId, String str, int i2, boolean z, String str2) {
        this.f5255a = i;
        this.f5256b = driveId;
        this.f5257c = str;
        this.f5258d = i2;
        this.f5259e = z;
        this.f5260f = str2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        as.m7630a(this, parcel, i);
    }
}
