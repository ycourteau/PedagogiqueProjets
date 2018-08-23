package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ValuesAddedDetails implements SafeParcelable {
    public static final Creator<ValuesAddedDetails> CREATOR = new C1724i();
    final int f5411a;
    final int f5412b;
    final int f5413c;
    final int f5414d;
    final String f5415e;
    final int f5416f;

    ValuesAddedDetails(int i, int i2, int i3, int i4, String str, int i5) {
        this.f5411a = i;
        this.f5412b = i2;
        this.f5413c = i3;
        this.f5414d = i4;
        this.f5415e = str;
        this.f5416f = i5;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1724i.m8026a(this, parcel, i);
    }
}
