package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.realtime.internal.event.ParcelableEvent;
import java.util.List;

public class ParcelableChangeInfo implements SafeParcelable {
    public static final Creator<ParcelableChangeInfo> CREATOR = new C1757p();
    final int f5350a;
    final long f5351b;
    final List<ParcelableEvent> f5352c;

    ParcelableChangeInfo(int i, long j, List<ParcelableEvent> list) {
        this.f5350a = i;
        this.f5351b = j;
        this.f5352c = list;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1757p.m8177a(this, parcel, i);
    }
}
