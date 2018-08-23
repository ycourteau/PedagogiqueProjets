package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class ControlProgressRequest implements SafeParcelable {
    public static final Creator<ControlProgressRequest> CREATOR = new ay();
    final int f5121a;
    final int f5122b;
    final int f5123c;
    final DriveId f5124d;

    ControlProgressRequest(int i, int i2, int i3, DriveId driveId) {
        this.f5121a = i;
        this.f5122b = i2;
        this.f5123c = i3;
        this.f5124d = driveId;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ay.m7648a(this, parcel, i);
    }
}
