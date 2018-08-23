package com.google.android.gms.common.server;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class FavaDiagnosticsEntity implements SafeParcelable {
    public static final C1519a CREATOR = new C1519a();
    final int f4522a;
    public final String f4523b;
    public final int f4524c;

    public FavaDiagnosticsEntity(int i, String str, int i2) {
        this.f4522a = i;
        this.f4523b = str;
        this.f4524c = i2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1519a.m6832a(this, parcel, i);
    }
}
