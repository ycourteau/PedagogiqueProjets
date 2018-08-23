package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.C1048a;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class HasFilter<T> extends AbstractFilter {
    public static final C1698h CREATOR = new C1698h();
    final MetadataBundle f5321a;
    final int f5322b;
    final C1048a<T> f5323c;

    HasFilter(int i, MetadataBundle metadataBundle) {
        this.f5322b = i;
        this.f5321a = metadataBundle;
        this.f5323c = C1696e.m7956a(metadataBundle);
    }

    public T m7935a() {
        return this.f5321a.m7881a(this.f5323c);
    }

    public <F> F mo1123a(C1690f<F> c1690f) {
        return c1690f.mo1116a(this.f5323c, m7935a());
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1698h.m7960a(this, parcel, i);
    }
}
