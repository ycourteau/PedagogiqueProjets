package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class AuthorizeAccessRequest implements SafeParcelable {
    public static final Creator<AuthorizeAccessRequest> CREATOR = new at();
    final int f5101a;
    final long f5102b;
    final DriveId f5103c;

    AuthorizeAccessRequest(int i, long j, DriveId driveId) {
        this.f5101a = i;
        this.f5102b = j;
        this.f5103c = driveId;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        at.m7633a(this, parcel, i);
    }
}
