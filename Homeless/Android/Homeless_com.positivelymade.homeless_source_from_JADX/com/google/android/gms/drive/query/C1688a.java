package com.google.android.gms.drive.query;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import java.util.List;

public class C1688a implements Creator<Query> {
    static void m7897a(Query query, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1000, query.f5293g);
        C1295b.m6501a(parcel, 1, query.f5287a, i, false);
        C1295b.m6505a(parcel, 3, query.f5288b, false);
        C1295b.m6501a(parcel, 4, query.f5289c, i, false);
        C1295b.m6506a(parcel, 5, query.f5290d, false);
        C1295b.m6507a(parcel, 6, query.f5291e);
        C1295b.m6515b(parcel, 7, query.f5292f, false);
        C1295b.m6494a(parcel, a);
    }

    public Query m7898a(Parcel parcel) {
        boolean z = false;
        List list = null;
        int b = C1294a.m6465b(parcel);
        List list2 = null;
        SortOrder sortOrder = null;
        String str = null;
        LogicalFilter logicalFilter = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    logicalFilter = (LogicalFilter) C1294a.m6462a(parcel, a, LogicalFilter.CREATOR);
                    break;
                case 3:
                    str = C1294a.m6479m(parcel, a);
                    break;
                case 4:
                    sortOrder = (SortOrder) C1294a.m6462a(parcel, a, SortOrder.CREATOR);
                    break;
                case 5:
                    list2 = C1294a.m6491y(parcel, a);
                    break;
                case 6:
                    z = C1294a.m6469c(parcel, a);
                    break;
                case 7:
                    list = C1294a.m6468c(parcel, a, DriveSpace.CREATOR);
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
            return new Query(i, logicalFilter, str, sortOrder, list2, z, list);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public Query[] m7899a(int i) {
        return new Query[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7898a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7899a(i);
    }
}
