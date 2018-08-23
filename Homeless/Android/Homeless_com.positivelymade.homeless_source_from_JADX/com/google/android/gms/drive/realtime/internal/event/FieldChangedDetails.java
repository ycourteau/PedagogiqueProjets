package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class FieldChangedDetails implements SafeParcelable {
    public static final Creator<FieldChangedDetails> CREATOR = new C1716a();
    final int f5369a;
    final int f5370b;

    FieldChangedDetails(int i, int i2) {
        this.f5369a = i;
        this.f5370b = i2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1716a.m8002a(this, parcel, i);
    }
}
