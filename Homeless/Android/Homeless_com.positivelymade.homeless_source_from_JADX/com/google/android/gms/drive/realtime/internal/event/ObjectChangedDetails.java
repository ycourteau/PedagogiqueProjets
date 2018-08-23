package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ObjectChangedDetails implements SafeParcelable {
    public static final Creator<ObjectChangedDetails> CREATOR = new C1717b();
    final int f5371a;
    final int f5372b;
    final int f5373c;

    ObjectChangedDetails(int i, int i2, int i3) {
        this.f5371a = i;
        this.f5372b = i2;
        this.f5373c = i3;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1717b.m8005a(this, parcel, i);
    }
}
