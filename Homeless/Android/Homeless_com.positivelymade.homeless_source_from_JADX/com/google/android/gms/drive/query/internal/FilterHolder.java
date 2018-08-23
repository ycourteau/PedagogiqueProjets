package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.query.Filter;

public class FilterHolder implements SafeParcelable {
    public static final Creator<FilterHolder> CREATOR = new C1695d();
    final int f5308a;
    final ComparisonFilter<?> f5309b;
    final FieldOnlyFilter f5310c;
    final LogicalFilter f5311d;
    final NotFilter f5312e;
    final InFilter<?> f5313f;
    final MatchAllFilter f5314g;
    final HasFilter f5315h;
    final FullTextSearchFilter f5316i;
    final OwnedByMeFilter f5317j;
    private final Filter f5318k;

    FilterHolder(int i, ComparisonFilter<?> comparisonFilter, FieldOnlyFilter fieldOnlyFilter, LogicalFilter logicalFilter, NotFilter notFilter, InFilter<?> inFilter, MatchAllFilter matchAllFilter, HasFilter<?> hasFilter, FullTextSearchFilter fullTextSearchFilter, OwnedByMeFilter ownedByMeFilter) {
        this.f5308a = i;
        this.f5309b = comparisonFilter;
        this.f5310c = fieldOnlyFilter;
        this.f5311d = logicalFilter;
        this.f5312e = notFilter;
        this.f5313f = inFilter;
        this.f5314g = matchAllFilter;
        this.f5315h = hasFilter;
        this.f5316i = fullTextSearchFilter;
        this.f5317j = ownedByMeFilter;
        if (this.f5309b != null) {
            this.f5318k = this.f5309b;
        } else if (this.f5310c != null) {
            this.f5318k = this.f5310c;
        } else if (this.f5311d != null) {
            this.f5318k = this.f5311d;
        } else if (this.f5312e != null) {
            this.f5318k = this.f5312e;
        } else if (this.f5313f != null) {
            this.f5318k = this.f5313f;
        } else if (this.f5314g != null) {
            this.f5318k = this.f5314g;
        } else if (this.f5315h != null) {
            this.f5318k = this.f5315h;
        } else if (this.f5316i != null) {
            this.f5318k = this.f5316i;
        } else if (this.f5317j != null) {
            this.f5318k = this.f5317j;
        } else {
            throw new IllegalArgumentException("At least one filter must be set.");
        }
    }

    public Filter m7933a() {
        return this.f5318k;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return String.format("FilterHolder[%s]", new Object[]{this.f5318k});
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1695d.m7953a(this, parcel, i);
    }
}
