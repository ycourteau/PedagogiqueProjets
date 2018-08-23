package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.ChangesAvailableOptions;

public class AddEventListenerRequest implements SafeParcelable {
    public static final Creator<AddEventListenerRequest> CREATOR = new C1646a();
    final int f5090a;
    final DriveId f5091b;
    final int f5092c;
    final ChangesAvailableOptions f5093d;

    AddEventListenerRequest(int i, DriveId driveId, int i2, ChangesAvailableOptions changesAvailableOptions) {
        this.f5090a = i;
        this.f5091b = driveId;
        this.f5092c = i2;
        this.f5093d = changesAvailableOptions;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1646a.m7573a(this, parcel, i);
    }
}
