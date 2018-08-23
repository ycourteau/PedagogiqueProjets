package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DrivePreferences;

public class OnDrivePreferencesResponse implements SafeParcelable {
    public static final Creator<OnDrivePreferencesResponse> CREATOR = new C1674w();
    final int f5196a;
    DrivePreferences f5197b;

    OnDrivePreferencesResponse(int i, DrivePreferences drivePreferences) {
        this.f5196a = i;
        this.f5197b = drivePreferences;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1674w.m7860a(this, parcel, i);
    }
}
