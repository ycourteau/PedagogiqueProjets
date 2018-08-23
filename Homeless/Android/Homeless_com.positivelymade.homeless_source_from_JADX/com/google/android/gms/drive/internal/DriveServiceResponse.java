package com.google.android.gms.drive.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class DriveServiceResponse implements SafeParcelable {
    public static final Creator<DriveServiceResponse> CREATOR = new C1648c();
    final int f5148a;
    final IBinder f5149b;

    DriveServiceResponse(int i, IBinder iBinder) {
        this.f5148a = i;
        this.f5149b = iBinder;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1648c.m7680a(this, parcel, i);
    }
}
