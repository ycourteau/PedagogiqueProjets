package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class ListParentsRequest implements SafeParcelable {
    public static final Creator<ListParentsRequest> CREATOR = new C1665n();
    final int f5172a;
    final DriveId f5173b;

    ListParentsRequest(int i, DriveId driveId) {
        this.f5172a = i;
        this.f5173b = driveId;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1665n.m7833a(this, parcel, i);
    }
}
