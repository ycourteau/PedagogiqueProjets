package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class CancelPendingActionsRequest implements SafeParcelable {
    public static final Creator<CancelPendingActionsRequest> CREATOR = new au();
    final int f5104a;
    final List<String> f5105b;

    CancelPendingActionsRequest(int i, List<String> list) {
        this.f5104a = i;
        this.f5105b = list;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        au.m7636a(this, parcel, i);
    }
}
