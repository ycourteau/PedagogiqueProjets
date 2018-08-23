package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ValueChangedDetails implements SafeParcelable {
    public static final Creator<ValueChangedDetails> CREATOR = new C1723h();
    final int f5409a;
    final int f5410b;

    ValueChangedDetails(int i, int i2) {
        this.f5409a = i;
        this.f5410b = i2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1723h.m8023a(this, parcel, i);
    }
}
