package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class CreateFileIntentSenderRequest implements SafeParcelable {
    public static final Creator<CreateFileIntentSenderRequest> CREATOR = new ba();
    final int f5127a;
    final MetadataBundle f5128b;
    final int f5129c;
    final String f5130d;
    final DriveId f5131e;
    final Integer f5132f;

    CreateFileIntentSenderRequest(int i, MetadataBundle metadataBundle, int i2, String str, DriveId driveId, Integer num) {
        this.f5127a = i;
        this.f5128b = metadataBundle;
        this.f5129c = i2;
        this.f5130d = str;
        this.f5131e = driveId;
        this.f5132f = num;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ba.m7654a(this, parcel, i);
    }
}
