package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.List;

public class SetResourceParentsRequest implements SafeParcelable {
    public static final Creator<SetResourceParentsRequest> CREATOR = new an();
    final int f5243a;
    final DriveId f5244b;
    final List<DriveId> f5245c;

    SetResourceParentsRequest(int i, DriveId driveId, List<DriveId> list) {
        this.f5243a = i;
        this.f5244b = driveId;
        this.f5245c = list;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        an.m7615a(this, parcel, i);
    }
}
