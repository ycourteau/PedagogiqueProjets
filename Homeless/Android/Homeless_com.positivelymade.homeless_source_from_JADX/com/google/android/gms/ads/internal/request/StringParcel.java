package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class StringParcel implements SafeParcelable {
    public static final Creator<StringParcel> CREATOR = new C0680n();
    final int f1900a;
    String f1901b;

    StringParcel(int i, String str) {
        this.f1900a = i;
        this.f1901b = str;
    }

    public StringParcel(String str) {
        this.f1900a = 1;
        this.f1901b = str;
    }

    public String m2909a() {
        return this.f1901b;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0680n.m3046a(this, parcel, i);
    }
}
