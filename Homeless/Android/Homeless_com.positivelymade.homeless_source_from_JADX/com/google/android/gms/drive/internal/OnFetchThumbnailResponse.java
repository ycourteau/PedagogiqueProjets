package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class OnFetchThumbnailResponse implements SafeParcelable {
    public static final Creator<OnFetchThumbnailResponse> CREATOR = new C1677z();
    final int f5205a;
    final ParcelFileDescriptor f5206b;

    OnFetchThumbnailResponse(int i, ParcelFileDescriptor parcelFileDescriptor) {
        this.f5205a = i;
        this.f5206b = parcelFileDescriptor;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1677z.m7869a(this, parcel, i | 1);
    }
}
