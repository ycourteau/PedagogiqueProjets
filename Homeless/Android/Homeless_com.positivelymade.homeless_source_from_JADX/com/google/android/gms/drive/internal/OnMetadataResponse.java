package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class OnMetadataResponse implements SafeParcelable {
    public static final Creator<OnMetadataResponse> CREATOR = new ac();
    final int f5214a;
    final MetadataBundle f5215b;

    OnMetadataResponse(int i, MetadataBundle metadataBundle) {
        this.f5214a = i;
        this.f5215b = metadataBundle;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ac.m7582a(this, parcel, i);
    }
}
