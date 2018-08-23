package com.google.android.gms.drive.events;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.WriteAwareParcelable;

public class QueryResultEventParcelable extends WriteAwareParcelable implements DriveEvent {
    public static final C1641f CREATOR = new C1641f();
    final int f5086a;
    final DataHolder f5087b;
    final boolean f5088c;
    final int f5089d;

    QueryResultEventParcelable(int i, DataHolder dataHolder, boolean z, int i2) {
        this.f5086a = i;
        this.f5087b = dataHolder;
        this.f5088c = z;
        this.f5089d = i2;
    }

    public void mo1046a(Parcel parcel, int i) {
        C1641f.m7557a(this, parcel, i);
    }

    public int describeContents() {
        return 0;
    }
}
