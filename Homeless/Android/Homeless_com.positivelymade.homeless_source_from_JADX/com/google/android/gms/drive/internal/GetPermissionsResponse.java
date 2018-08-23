package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Permission;
import java.util.List;

public class GetPermissionsResponse implements SafeParcelable {
    public static final Creator<GetPermissionsResponse> CREATOR = new C1655j();
    final int f5169a;
    final List<Permission> f5170b;
    final int f5171c;

    GetPermissionsResponse(int i, List<Permission> list, int i2) {
        this.f5169a = i;
        this.f5170b = list;
        this.f5171c = i2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1655j.m7701a(this, parcel, i);
    }
}
