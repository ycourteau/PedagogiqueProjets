package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.WriteAwareParcelable;

public class OnListEntriesResponse extends WriteAwareParcelable implements SafeParcelable {
    public static final Creator<OnListEntriesResponse> CREATOR = new aa();
    final int f5207a;
    final DataHolder f5208b;
    final boolean f5209c;

    OnListEntriesResponse(int i, DataHolder dataHolder, boolean z) {
        this.f5207a = i;
        this.f5208b = dataHolder;
        this.f5209c = z;
    }

    protected void mo1046a(Parcel parcel, int i) {
        aa.m7576a(this, parcel, i);
    }

    public int describeContents() {
        return 0;
    }
}
