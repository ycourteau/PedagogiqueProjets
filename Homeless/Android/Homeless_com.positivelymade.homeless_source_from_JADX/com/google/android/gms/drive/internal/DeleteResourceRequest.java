package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class DeleteResourceRequest implements SafeParcelable {
    public static final Creator<DeleteResourceRequest> CREATOR = new bd();
    final int f5145a;
    final DriveId f5146b;

    DeleteResourceRequest(int i, DriveId driveId) {
        this.f5145a = i;
        this.f5146b = driveId;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        bd.m7663a(this, parcel, i);
    }
}
