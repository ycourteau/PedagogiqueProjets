package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class TextInsertedDetails implements SafeParcelable {
    public static final Creator<TextInsertedDetails> CREATOR = new C1722g();
    final int f5406a;
    final int f5407b;
    final int f5408c;

    TextInsertedDetails(int i, int i2, int i3) {
        this.f5406a = i;
        this.f5407b = i2;
        this.f5408c = i3;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1722g.m8020a(this, parcel, i);
    }
}
