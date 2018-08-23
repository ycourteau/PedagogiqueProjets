package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;

public class FieldWithSortOrder implements SafeParcelable {
    public static final C1694c CREATOR = new C1694c();
    final String f5305a;
    final boolean f5306b;
    final int f5307c;

    FieldWithSortOrder(int i, String str, boolean z) {
        this.f5307c = i;
        this.f5305a = str;
        this.f5306b = z;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        Locale locale = Locale.US;
        String str = "FieldWithSortOrder[%s %s]";
        Object[] objArr = new Object[2];
        objArr[0] = this.f5305a;
        objArr[1] = this.f5306b ? "ASC" : "DESC";
        return String.format(locale, str, objArr);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1694c.m7950a(this, parcel, i);
    }
}
