package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class CloseContentsAndUpdateMetadataRequest implements SafeParcelable {
    public static final Creator<CloseContentsAndUpdateMetadataRequest> CREATOR = new aw();
    final int f5108a;
    final DriveId f5109b;
    final MetadataBundle f5110c;
    final Contents f5111d;
    final boolean f5112e;
    final String f5113f;
    final int f5114g;
    final int f5115h;
    final boolean f5116i;

    CloseContentsAndUpdateMetadataRequest(int i, DriveId driveId, MetadataBundle metadataBundle, Contents contents, boolean z, String str, int i2, int i3, boolean z2) {
        this.f5108a = i;
        this.f5109b = driveId;
        this.f5110c = metadataBundle;
        this.f5111d = contents;
        this.f5112e = z;
        this.f5113f = str;
        this.f5114g = i2;
        this.f5115h = i3;
        this.f5116i = z2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        aw.m7642a(this, parcel, i);
    }
}
