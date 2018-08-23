package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class BeginCompoundOperationRequest implements SafeParcelable {
    public static final Creator<BeginCompoundOperationRequest> CREATOR = new C1705a();
    final int f5345a;
    final boolean f5346b;
    final String f5347c;
    final boolean f5348d;

    BeginCompoundOperationRequest(int i, boolean z, String str, boolean z2) {
        this.f5345a = i;
        this.f5346b = z;
        this.f5347c = str;
        this.f5348d = z2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1705a.m7981a(this, parcel, i);
    }
}
