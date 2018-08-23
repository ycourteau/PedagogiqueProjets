package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public class NotFilter extends AbstractFilter {
    public static final Creator<NotFilter> CREATOR = new C1702l();
    final FilterHolder f5331a;
    final int f5332b;

    NotFilter(int i, FilterHolder filterHolder) {
        this.f5332b = i;
        this.f5331a = filterHolder;
    }

    public <T> T mo1123a(C1690f<T> c1690f) {
        return c1690f.mo1120a(this.f5331a.m7933a().mo1123a(c1690f));
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1702l.m7972a(this, parcel, i);
    }
}
