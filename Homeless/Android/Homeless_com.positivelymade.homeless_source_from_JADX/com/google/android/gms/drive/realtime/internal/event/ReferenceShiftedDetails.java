package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ReferenceShiftedDetails implements SafeParcelable {
    public static final Creator<ReferenceShiftedDetails> CREATOR = new C1720e();
    final int f5398a;
    final String f5399b;
    final String f5400c;
    final int f5401d;
    final int f5402e;

    ReferenceShiftedDetails(int i, String str, String str2, int i2, int i3) {
        this.f5398a = i;
        this.f5399b = str;
        this.f5400c = str2;
        this.f5401d = i2;
        this.f5402e = i3;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1720e.m8014a(this, parcel, i);
    }
}
