package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class CreateFileRequest implements SafeParcelable {
    public static final Creator<CreateFileRequest> CREATOR = new bb();
    final int f5133a;
    final DriveId f5134b;
    final MetadataBundle f5135c;
    final Contents f5136d;
    final Integer f5137e;
    final boolean f5138f;
    final String f5139g;
    final int f5140h;
    final int f5141i;

    CreateFileRequest(int i, DriveId driveId, MetadataBundle metadataBundle, Contents contents, Integer num, boolean z, String str, int i2, int i3) {
        if (!(contents == null || i3 == 0)) {
            C1305x.m6626b(contents.m7513b() == i3, "inconsistent contents reference");
        }
        if ((num == null || num.intValue() == 0) && contents == null && i3 == 0) {
            throw new IllegalArgumentException("Need a valid contents");
        }
        this.f5133a = i;
        this.f5134b = (DriveId) C1305x.m6617a((Object) driveId);
        this.f5135c = (MetadataBundle) C1305x.m6617a((Object) metadataBundle);
        this.f5136d = contents;
        this.f5137e = num;
        this.f5139g = str;
        this.f5140h = i2;
        this.f5138f = z;
        this.f5141i = i3;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        bb.m7657a(this, parcel, i);
    }
}
