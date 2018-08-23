package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class GetDriveIdFromUniqueIdentifierRequest implements SafeParcelable {
    public static final Creator<GetDriveIdFromUniqueIdentifierRequest> CREATOR = new C1652g();
    final int f5161a;
    final String f5162b;
    final boolean f5163c;

    GetDriveIdFromUniqueIdentifierRequest(int i, String str, boolean z) {
        this.f5161a = i;
        this.f5162b = str;
        this.f5163c = z;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1652g.m7692a(this, parcel, i);
    }
}
