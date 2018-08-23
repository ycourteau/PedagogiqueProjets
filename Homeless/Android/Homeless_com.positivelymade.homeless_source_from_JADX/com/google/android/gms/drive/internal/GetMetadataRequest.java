package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class GetMetadataRequest implements SafeParcelable {
    public static final Creator<GetMetadataRequest> CREATOR = new C1653h();
    final int f5164a;
    final DriveId f5165b;
    final boolean f5166c;

    GetMetadataRequest(int i, DriveId driveId, boolean z) {
        this.f5164a = i;
        this.f5165b = driveId;
        this.f5166c = z;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1653h.m7695a(this, parcel, i);
    }
}
