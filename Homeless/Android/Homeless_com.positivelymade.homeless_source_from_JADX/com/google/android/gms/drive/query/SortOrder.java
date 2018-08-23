package com.google.android.gms.drive.query;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.query.internal.FieldWithSortOrder;
import java.util.List;
import java.util.Locale;

public class SortOrder implements SafeParcelable {
    public static final Creator<SortOrder> CREATOR = new C1689b();
    final List<FieldWithSortOrder> f5295a;
    final boolean f5296b;
    final int f5297c;

    SortOrder(int i, List<FieldWithSortOrder> list, boolean z) {
        this.f5297c = i;
        this.f5295a = list;
        this.f5296b = z;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return String.format(Locale.US, "SortOrder[%s, %s]", new Object[]{TextUtils.join(",", this.f5295a), Boolean.valueOf(this.f5296b)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1689b.m7900a(this, parcel, i);
    }
}
