package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class Contents implements SafeParcelable {
    public static final Creator<Contents> CREATOR = new C1635e();
    final int f5011a;
    final ParcelFileDescriptor f5012b;
    final int f5013c;
    final int f5014d;
    final DriveId f5015e;
    final boolean f5016f;
    final String f5017g;

    Contents(int i, ParcelFileDescriptor parcelFileDescriptor, int i2, int i3, DriveId driveId, boolean z, String str) {
        this.f5011a = i;
        this.f5012b = parcelFileDescriptor;
        this.f5013c = i2;
        this.f5014d = i3;
        this.f5015e = driveId;
        this.f5016f = z;
        this.f5017g = str;
    }

    public ParcelFileDescriptor m7512a() {
        return this.f5012b;
    }

    public int m7513b() {
        return this.f5013c;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1635e.m7538a(this, parcel, i);
    }
}
