package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class AuthAccountResult implements SafeParcelable {
    public static final Creator<AuthAccountResult> CREATOR = new C1918a();
    final int f5879a;

    public AuthAccountResult() {
        this(1);
    }

    AuthAccountResult(int i) {
        this.f5879a = i;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1918a.m9626a(this, parcel, i);
    }
}
