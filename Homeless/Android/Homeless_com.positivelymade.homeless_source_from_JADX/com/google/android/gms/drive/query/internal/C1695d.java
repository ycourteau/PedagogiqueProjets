package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1695d implements Creator<FilterHolder> {
    static void m7953a(FilterHolder filterHolder, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6501a(parcel, 1, filterHolder.f5309b, i, false);
        C1295b.m6496a(parcel, 1000, filterHolder.f5308a);
        C1295b.m6501a(parcel, 2, filterHolder.f5310c, i, false);
        C1295b.m6501a(parcel, 3, filterHolder.f5311d, i, false);
        C1295b.m6501a(parcel, 4, filterHolder.f5312e, i, false);
        C1295b.m6501a(parcel, 5, filterHolder.f5313f, i, false);
        C1295b.m6501a(parcel, 6, filterHolder.f5314g, i, false);
        C1295b.m6501a(parcel, 7, filterHolder.f5315h, i, false);
        C1295b.m6501a(parcel, 8, filterHolder.f5316i, i, false);
        C1295b.m6501a(parcel, 9, filterHolder.f5317j, i, false);
        C1295b.m6494a(parcel, a);
    }

    public FilterHolder m7954a(Parcel parcel) {
        OwnedByMeFilter ownedByMeFilter = null;
        int b = C1294a.m6465b(parcel);
        int i = 0;
        FullTextSearchFilter fullTextSearchFilter = null;
        HasFilter hasFilter = null;
        MatchAllFilter matchAllFilter = null;
        InFilter inFilter = null;
        NotFilter notFilter = null;
        LogicalFilter logicalFilter = null;
        FieldOnlyFilter fieldOnlyFilter = null;
        ComparisonFilter comparisonFilter = null;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    comparisonFilter = (ComparisonFilter) C1294a.m6462a(parcel, a, ComparisonFilter.CREATOR);
                    break;
                case 2:
                    fieldOnlyFilter = (FieldOnlyFilter) C1294a.m6462a(parcel, a, FieldOnlyFilter.CREATOR);
                    break;
                case 3:
                    logicalFilter = (LogicalFilter) C1294a.m6462a(parcel, a, LogicalFilter.CREATOR);
                    break;
                case 4:
                    notFilter = (NotFilter) C1294a.m6462a(parcel, a, NotFilter.CREATOR);
                    break;
                case 5:
                    inFilter = (InFilter) C1294a.m6462a(parcel, a, InFilter.CREATOR);
                    break;
                case 6:
                    matchAllFilter = (MatchAllFilter) C1294a.m6462a(parcel, a, MatchAllFilter.CREATOR);
                    break;
                case 7:
                    hasFilter = (HasFilter) C1294a.m6462a(parcel, a, HasFilter.CREATOR);
                    break;
                case 8:
                    fullTextSearchFilter = (FullTextSearchFilter) C1294a.m6462a(parcel, a, FullTextSearchFilter.CREATOR);
                    break;
                case 9:
                    ownedByMeFilter = (OwnedByMeFilter) C1294a.m6462a(parcel, a, OwnedByMeFilter.CREATOR);
                    break;
                case 1000:
                    i = C1294a.m6471e(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new FilterHolder(i, comparisonFilter, fieldOnlyFilter, logicalFilter, notFilter, inFilter, matchAllFilter, hasFilter, fullTextSearchFilter, ownedByMeFilter);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public FilterHolder[] m7955a(int i) {
        return new FilterHolder[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7954a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7955a(i);
    }
}
