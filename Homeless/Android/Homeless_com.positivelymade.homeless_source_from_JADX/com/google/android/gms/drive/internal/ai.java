package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.drive.query.Query;

public class ai implements Creator<QueryRequest> {
    static void m7600a(QueryRequest queryRequest, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, queryRequest.f5229a);
        C1295b.m6501a(parcel, 2, queryRequest.f5230b, i, false);
        C1295b.m6494a(parcel, a);
    }

    public QueryRequest m7601a(Parcel parcel) {
        int b = C1294a.m6465b(parcel);
        int i = 0;
        Query query = null;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    query = (Query) C1294a.m6462a(parcel, a, Query.CREATOR);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new QueryRequest(i, query);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public QueryRequest[] m7602a(int i) {
        return new QueryRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7601a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7602a(i);
    }
}
