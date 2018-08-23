package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class OnDownloadProgressResponse implements SafeParcelable {
    public static final Creator<OnDownloadProgressResponse> CREATOR = new C1672u();
    final int f5191a;
    final long f5192b;
    final long f5193c;

    OnDownloadProgressResponse(int i, long j, long j2) {
        this.f5191a = i;
        this.f5192b = j;
        this.f5193c = j2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1672u.m7854a(this, parcel, i);
    }
}
