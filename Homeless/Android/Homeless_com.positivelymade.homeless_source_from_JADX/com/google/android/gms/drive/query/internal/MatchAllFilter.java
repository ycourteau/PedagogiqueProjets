package com.google.android.gms.drive.query.internal;

import android.os.Parcel;

public class MatchAllFilter extends AbstractFilter {
    public static final C1701k CREATOR = new C1701k();
    final int f5330a;

    public MatchAllFilter() {
        this(1);
    }

    MatchAllFilter(int i) {
        this.f5330a = i;
    }

    public <F> F mo1123a(C1690f<F> c1690f) {
        return c1690f.mo1114a();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1701k.m7969a(this, parcel, i);
    }
}
