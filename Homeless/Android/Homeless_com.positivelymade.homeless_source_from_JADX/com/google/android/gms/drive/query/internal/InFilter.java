package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.C1062g;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Collection;

public class InFilter<T> extends AbstractFilter {
    public static final C1699i CREATOR = new C1699i();
    final MetadataBundle f5324a;
    final int f5325b;
    private final C1062g<T> f5326c;

    InFilter(int i, MetadataBundle metadataBundle) {
        this.f5325b = i;
        this.f5324a = metadataBundle;
        this.f5326c = (C1062g) C1696e.m7956a(metadataBundle);
    }

    public T m7937a() {
        return ((Collection) this.f5324a.m7881a(this.f5326c)).iterator().next();
    }

    public <F> F mo1123a(C1690f<F> c1690f) {
        return c1690f.mo1117a(this.f5326c, m7937a());
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1699i.m7963a(this, parcel, i);
    }
}
