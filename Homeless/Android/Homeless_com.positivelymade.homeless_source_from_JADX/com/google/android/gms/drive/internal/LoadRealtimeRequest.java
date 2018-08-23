package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.List;

public class LoadRealtimeRequest implements SafeParcelable {
    public static final Creator<LoadRealtimeRequest> CREATOR = new C1666o();
    final int f5174a;
    final DriveId f5175b;
    final boolean f5176c;
    final List<String> f5177d;
    final boolean f5178e;
    final DataHolder f5179f;
    final String f5180g;

    LoadRealtimeRequest(int i, DriveId driveId, boolean z, List<String> list, boolean z2, DataHolder dataHolder, String str) {
        this.f5174a = i;
        this.f5175b = driveId;
        this.f5176c = z;
        this.f5177d = list;
        this.f5178e = z2;
        this.f5179f = dataHolder;
        this.f5180g = str;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1666o.m7836a(this, parcel, i);
    }
}
