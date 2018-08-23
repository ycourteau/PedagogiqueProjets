package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ValuesRemovedDetails implements SafeParcelable {
    public static final Creator<ValuesRemovedDetails> CREATOR = new C1725j();
    final int f5417a;
    final int f5418b;
    final int f5419c;
    final int f5420d;
    final String f5421e;
    final int f5422f;

    ValuesRemovedDetails(int i, int i2, int i3, int i4, String str, int i5) {
        this.f5417a = i;
        this.f5418b = i2;
        this.f5419c = i3;
        this.f5420d = i4;
        this.f5421e = str;
        this.f5422f = i5;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1725j.m8029a(this, parcel, i);
    }
}
