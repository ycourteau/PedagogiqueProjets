package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class RemoveEventListenerRequest implements SafeParcelable {
    public static final Creator<RemoveEventListenerRequest> CREATOR = new aj();
    final int f5231a;
    final DriveId f5232b;
    final int f5233c;

    RemoveEventListenerRequest(int i, DriveId driveId, int i2) {
        this.f5231a = i;
        this.f5232b = driveId;
        this.f5233c = i2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        aj.m7603a(this, parcel, i);
    }
}
