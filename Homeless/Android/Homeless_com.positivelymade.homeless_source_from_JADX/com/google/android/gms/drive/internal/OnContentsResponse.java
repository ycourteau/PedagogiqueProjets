package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;

public class OnContentsResponse implements SafeParcelable {
    public static final Creator<OnContentsResponse> CREATOR = new C1670s();
    final int f5186a;
    final Contents f5187b;
    final boolean f5188c;

    OnContentsResponse(int i, Contents contents, boolean z) {
        this.f5186a = i;
        this.f5187b = contents;
        this.f5188c = z;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1670s.m7848a(this, parcel, i);
    }
}
