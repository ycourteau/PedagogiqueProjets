package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class OnSyncMoreResponse implements SafeParcelable {
    public static final Creator<OnSyncMoreResponse> CREATOR = new af();
    final int f5218a;
    final boolean f5219b;

    OnSyncMoreResponse(int i, boolean z) {
        this.f5218a = i;
        this.f5219b = z;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        af.m7591a(this, parcel, i);
    }
}
