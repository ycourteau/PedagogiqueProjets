package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ValuesSetDetails implements SafeParcelable {
    public static final Creator<ValuesSetDetails> CREATOR = new C1726k();
    final int f5423a;
    final int f5424b;
    final int f5425c;
    final int f5426d;

    ValuesSetDetails(int i, int i2, int i3, int i4) {
        this.f5423a = i;
        this.f5424b = i2;
        this.f5425c = i3;
        this.f5426d = i4;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1726k.m8032a(this, parcel, i);
    }
}
