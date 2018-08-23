package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class TrashResourceRequest implements SafeParcelable {
    public static final Creator<TrashResourceRequest> CREATOR = new ao();
    final int f5246a;
    final DriveId f5247b;

    TrashResourceRequest(int i, DriveId driveId) {
        this.f5246a = i;
        this.f5247b = driveId;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ao.m7618a(this, parcel, i);
    }
}
