package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;

public class CloseContentsRequest implements SafeParcelable {
    public static final Creator<CloseContentsRequest> CREATOR = new ax();
    final int f5117a;
    final Contents f5118b;
    final Boolean f5119c;
    final int f5120d;

    CloseContentsRequest(int i, Contents contents, Boolean bool, int i2) {
        this.f5117a = i;
        this.f5118b = contents;
        this.f5119c = bool;
        this.f5120d = i2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ax.m7645a(this, parcel, i);
    }
}
