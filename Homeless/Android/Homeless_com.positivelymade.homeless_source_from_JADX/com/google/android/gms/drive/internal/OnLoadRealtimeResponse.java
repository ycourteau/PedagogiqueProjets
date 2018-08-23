package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class OnLoadRealtimeResponse implements SafeParcelable {
    public static final Creator<OnLoadRealtimeResponse> CREATOR = new ad();
    final int f5212a;
    final boolean f5213b;

    OnLoadRealtimeResponse(int i, boolean z) {
        this.f5212a = i;
        this.f5213b = z;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ad.m7585a(this, parcel, i);
    }
}
