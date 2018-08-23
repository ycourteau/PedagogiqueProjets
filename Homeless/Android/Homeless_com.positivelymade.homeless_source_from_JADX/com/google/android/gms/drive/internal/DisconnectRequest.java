package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class DisconnectRequest implements SafeParcelable {
    public static final Creator<DisconnectRequest> CREATOR = new be();
    final int f5147a;

    public DisconnectRequest() {
        this(1);
    }

    DisconnectRequest(int i) {
        this.f5147a = i;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        be.m7666a(this, parcel, i);
    }
}
