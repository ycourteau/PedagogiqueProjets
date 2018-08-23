package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.Permission;

public class AddPermissionRequest implements SafeParcelable {
    public static final Creator<AddPermissionRequest> CREATOR = new C1675x();
    final int f5094a;
    final DriveId f5095b;
    final Permission f5096c;
    final boolean f5097d;
    final String f5098e;
    final boolean f5099f;
    final String f5100g;

    AddPermissionRequest(int i, DriveId driveId, Permission permission, boolean z, String str, boolean z2, String str2) {
        this.f5094a = i;
        this.f5095b = driveId;
        this.f5096c = permission;
        this.f5097d = z;
        this.f5098e = str;
        this.f5099f = z2;
        this.f5100g = str2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1675x.m7863a(this, parcel, i);
    }
}
