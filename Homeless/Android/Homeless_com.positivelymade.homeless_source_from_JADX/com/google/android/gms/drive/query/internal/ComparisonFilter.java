package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.C1048a;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class ComparisonFilter<T> extends AbstractFilter {
    public static final C1692a CREATOR = new C1692a();
    final Operator f5298a;
    final MetadataBundle f5299b;
    final int f5300c;
    final C1048a<T> f5301d;

    ComparisonFilter(int i, Operator operator, MetadataBundle metadataBundle) {
        this.f5300c = i;
        this.f5298a = operator;
        this.f5299b = metadataBundle;
        this.f5301d = C1696e.m7956a(metadataBundle);
    }

    public T m7930a() {
        return this.f5299b.m7881a(this.f5301d);
    }

    public <F> F mo1123a(C1690f<F> c1690f) {
        return c1690f.mo1118a(this.f5298a, this.f5301d, m7930a());
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1692a.m7944a(this, parcel, i);
    }
}
