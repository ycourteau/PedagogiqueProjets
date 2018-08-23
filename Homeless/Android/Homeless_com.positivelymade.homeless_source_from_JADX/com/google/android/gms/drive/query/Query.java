package com.google.android.gms.drive.query;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class Query implements SafeParcelable {
    public static final Creator<Query> CREATOR = new C1688a();
    final LogicalFilter f5287a;
    final String f5288b;
    final SortOrder f5289c;
    final List<String> f5290d;
    final boolean f5291e;
    final List<DriveSpace> f5292f;
    final int f5293g;
    private final Set<DriveSpace> f5294h;

    Query(int i, LogicalFilter logicalFilter, String str, SortOrder sortOrder, List<String> list, boolean z, List<DriveSpace> list2) {
        this(i, logicalFilter, str, sortOrder, list, z, list2, list2 == null ? null : new HashSet(list2));
    }

    private Query(int i, LogicalFilter logicalFilter, String str, SortOrder sortOrder, List<String> list, boolean z, List<DriveSpace> list2, Set<DriveSpace> set) {
        this.f5293g = i;
        this.f5287a = logicalFilter;
        this.f5288b = str;
        this.f5289c = sortOrder;
        this.f5290d = list;
        this.f5291e = z;
        this.f5292f = list2;
        this.f5294h = set;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return String.format(Locale.US, "Query[%s,%s,PageToken=%s,Spaces=%s]", new Object[]{this.f5287a, this.f5289c, this.f5288b, this.f5292f});
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1688a.m7897a(this, parcel, i);
    }
}
