package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class CreateFolderRequest implements SafeParcelable {
    public static final Creator<CreateFolderRequest> CREATOR = new bc();
    final int f5142a;
    final DriveId f5143b;
    final MetadataBundle f5144c;

    CreateFolderRequest(int i, DriveId driveId, MetadataBundle metadataBundle) {
        this.f5142a = i;
        this.f5143b = (DriveId) C1305x.m6617a((Object) driveId);
        this.f5144c = (MetadataBundle) C1305x.m6617a((Object) metadataBundle);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        bc.m7660a(this, parcel, i);
    }
}
