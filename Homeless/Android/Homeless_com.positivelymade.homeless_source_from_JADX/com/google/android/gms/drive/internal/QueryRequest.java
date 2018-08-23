package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.query.Query;

public class QueryRequest implements SafeParcelable {
    public static final Creator<QueryRequest> CREATOR = new ai();
    final int f5229a;
    final Query f5230b;

    QueryRequest(int i, Query query) {
        this.f5229a = i;
        this.f5230b = query;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ai.m7600a(this, parcel, i);
    }
}
