package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.query.internal.FilterHolder;

public class OpenFileIntentSenderRequest implements SafeParcelable {
    public static final Creator<OpenFileIntentSenderRequest> CREATOR = new ah();
    final int f5224a;
    final String f5225b;
    final String[] f5226c;
    final DriveId f5227d;
    final FilterHolder f5228e;

    OpenFileIntentSenderRequest(int i, String str, String[] strArr, DriveId driveId, FilterHolder filterHolder) {
        this.f5224a = i;
        this.f5225b = str;
        this.f5226c = strArr;
        this.f5227d = driveId;
        this.f5228e = filterHolder;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ah.m7597a(this, parcel, i);
    }
}
