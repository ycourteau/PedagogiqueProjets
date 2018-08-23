package com.google.android.gms.drive.query.internal;

import android.os.Parcel;

public class FullTextSearchFilter extends AbstractFilter {
    public static final C1697g CREATOR = new C1697g();
    final String f5319a;
    final int f5320b;

    FullTextSearchFilter(int i, String str) {
        this.f5320b = i;
        this.f5319a = str;
    }

    public <F> F mo1123a(C1690f<F> c1690f) {
        return c1690f.mo1121a(this.f5319a);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1697g.m7957a(this, parcel, i);
    }
}
