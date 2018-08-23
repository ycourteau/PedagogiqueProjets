package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.Locale;

public final class ChangeEvent implements SafeParcelable, ResourceEvent {
    public static final Creator<ChangeEvent> CREATOR = new C1636a();
    final int f5057a;
    final DriveId f5058b;
    final int f5059c;

    ChangeEvent(int i, DriveId driveId, int i2) {
        this.f5057a = i;
        this.f5058b = driveId;
        this.f5059c = i2;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return String.format(Locale.US, "ChangeEvent [id=%s,changeFlags=%x]", new Object[]{this.f5058b, Integer.valueOf(this.f5059c)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1636a.m7542a(this, parcel, i);
    }
}
