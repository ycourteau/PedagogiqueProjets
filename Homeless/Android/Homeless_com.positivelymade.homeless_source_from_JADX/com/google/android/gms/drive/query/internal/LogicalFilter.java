package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.List;

public class LogicalFilter extends AbstractFilter {
    public static final Creator<LogicalFilter> CREATOR = new C1700j();
    final Operator f5327a;
    final List<FilterHolder> f5328b;
    final int f5329c;

    LogicalFilter(int i, Operator operator, List<FilterHolder> list) {
        this.f5329c = i;
        this.f5327a = operator;
        this.f5328b = list;
    }

    public <T> T mo1123a(C1690f<T> c1690f) {
        List arrayList = new ArrayList();
        for (FilterHolder a : this.f5328b) {
            arrayList.add(a.m7933a().mo1123a(c1690f));
        }
        return c1690f.mo1119a(this.f5327a, arrayList);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1700j.m7966a(this, parcel, i);
    }
}
