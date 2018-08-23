package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.realtime.internal.ParcelableChangeInfo;
import java.util.List;

public class ParcelableEventList implements SafeParcelable {
    public static final Creator<ParcelableEventList> CREATOR = new C1719d();
    final int f5392a;
    final List<ParcelableEvent> f5393b;
    final DataHolder f5394c;
    final boolean f5395d;
    final List<String> f5396e;
    final ParcelableChangeInfo f5397f;

    ParcelableEventList(int i, List<ParcelableEvent> list, DataHolder dataHolder, boolean z, List<String> list2, ParcelableChangeInfo parcelableChangeInfo) {
        this.f5392a = i;
        this.f5393b = list;
        this.f5394c = dataHolder;
        this.f5395d = z;
        this.f5396e = list2;
        this.f5397f = parcelableChangeInfo;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1719d.m8011a(this, parcel, i);
    }
}
