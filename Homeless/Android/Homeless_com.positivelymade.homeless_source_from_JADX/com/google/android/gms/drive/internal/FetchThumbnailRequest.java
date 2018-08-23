package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class FetchThumbnailRequest implements SafeParcelable {
    public static final Creator<FetchThumbnailRequest> CREATOR = new C1649d();
    final int f5150a;
    final DriveId f5151b;

    FetchThumbnailRequest(int i, DriveId driveId) {
        this.f5150a = i;
        this.f5151b = driveId;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1649d.m7683a(this, parcel, i);
    }
}
