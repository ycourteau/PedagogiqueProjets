package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class TextDeletedDetails implements SafeParcelable {
    public static final Creator<TextDeletedDetails> CREATOR = new C1721f();
    final int f5403a;
    final int f5404b;
    final int f5405c;

    TextDeletedDetails(int i, int i2, int i3) {
        this.f5403a = i;
        this.f5404b = i2;
        this.f5405c = i3;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1721f.m8017a(this, parcel, i);
    }
}
