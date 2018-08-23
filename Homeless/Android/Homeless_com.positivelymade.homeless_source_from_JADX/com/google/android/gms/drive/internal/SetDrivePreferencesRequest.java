package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DrivePreferences;

public class SetDrivePreferencesRequest implements SafeParcelable {
    public static final Creator<SetDrivePreferencesRequest> CREATOR = new al();
    final int f5239a;
    final DrivePreferences f5240b;

    SetDrivePreferencesRequest(int i, DrivePreferences drivePreferences) {
        this.f5239a = i;
        this.f5240b = drivePreferences;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        al.m7609a(this, parcel, i);
    }
}
