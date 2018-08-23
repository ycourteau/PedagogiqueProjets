package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.WriteAwareParcelable;

public class OnListParentsResponse extends WriteAwareParcelable implements SafeParcelable {
    public static final Creator<OnListParentsResponse> CREATOR = new ab();
    final int f5210a;
    final DataHolder f5211b;

    OnListParentsResponse(int i, DataHolder dataHolder) {
        this.f5210a = i;
        this.f5211b = dataHolder;
    }

    protected void mo1046a(Parcel parcel, int i) {
        ab.m7579a(this, parcel, i);
    }

    public int describeContents() {
        return 0;
    }
}
