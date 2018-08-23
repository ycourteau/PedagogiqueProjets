package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class CreateContentsRequest implements SafeParcelable {
    public static final Creator<CreateContentsRequest> CREATOR = new az();
    final int f5125a;
    final int f5126b;

    CreateContentsRequest(int i, int i2) {
        this.f5125a = i;
        boolean z = i2 == 536870912 || i2 == 805306368;
        C1305x.m6626b(z, "Cannot create a new read-only contents!");
        this.f5126b = i2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        az.m7651a(this, parcel, i);
    }
}
