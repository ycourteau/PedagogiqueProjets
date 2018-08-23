package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class RemovePermissionRequest implements SafeParcelable {
    public static final Creator<RemovePermissionRequest> CREATOR = new ak();
    final int f5234a;
    final DriveId f5235b;
    final String f5236c;
    final boolean f5237d;
    final String f5238e;

    RemovePermissionRequest(int i, DriveId driveId, String str, boolean z, String str2) {
        this.f5234a = i;
        this.f5235b = driveId;
        this.f5236c = str;
        this.f5237d = z;
        this.f5238e = str2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ak.m7606a(this, parcel, i);
    }
}
