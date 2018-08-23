package com.google.android.gms.drive.query.internal;

import android.os.Parcel;

public class OwnedByMeFilter extends AbstractFilter {
    public static final C1704n CREATOR = new C1704n();
    final int f5344a;

    public OwnedByMeFilter() {
        this(1);
    }

    OwnedByMeFilter(int i) {
        this.f5344a = i;
    }

    public <F> F mo1123a(C1690f<F> c1690f) {
        return c1690f.mo1122b();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1704n.m7978a(this, parcel, i);
    }
}
