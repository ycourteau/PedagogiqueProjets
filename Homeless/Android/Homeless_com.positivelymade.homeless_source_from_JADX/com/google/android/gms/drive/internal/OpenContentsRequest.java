package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class OpenContentsRequest implements SafeParcelable {
    public static final Creator<OpenContentsRequest> CREATOR = new ag();
    final int f5220a;
    final DriveId f5221b;
    final int f5222c;
    final int f5223d;

    OpenContentsRequest(int i, DriveId driveId, int i2, int i3) {
        this.f5220a = i;
        this.f5221b = driveId;
        this.f5222c = i2;
        this.f5223d = i3;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ag.m7594a(this, parcel, i);
    }
}
