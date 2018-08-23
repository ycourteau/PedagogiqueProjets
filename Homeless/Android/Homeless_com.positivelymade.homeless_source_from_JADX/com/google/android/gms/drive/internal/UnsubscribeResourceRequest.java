package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class UnsubscribeResourceRequest implements SafeParcelable {
    public static final Creator<UnsubscribeResourceRequest> CREATOR = new ap();
    final int f5248a;
    final DriveId f5249b;

    UnsubscribeResourceRequest(int i, DriveId driveId) {
        this.f5248a = i;
        this.f5249b = driveId;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ap.m7621a(this, parcel, i);
    }
}
