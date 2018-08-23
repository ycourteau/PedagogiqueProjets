package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.drive.metadata.C1048a;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class FieldOnlyFilter extends AbstractFilter {
    public static final Creator<FieldOnlyFilter> CREATOR = new C1693b();
    final MetadataBundle f5302a;
    final int f5303b;
    private final C1048a<?> f5304c;

    FieldOnlyFilter(int i, MetadataBundle metadataBundle) {
        this.f5303b = i;
        this.f5302a = metadataBundle;
        this.f5304c = C1696e.m7956a(metadataBundle);
    }

    public <T> T mo1123a(C1690f<T> c1690f) {
        return c1690f.mo1115a(this.f5304c);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1693b.m7947a(this, parcel, i);
    }
}
