package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class ab implements Creator<OnListParentsResponse> {
    static void m7579a(OnListParentsResponse onListParentsResponse, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, onListParentsResponse.f5210a);
        C1295b.m6501a(parcel, 2, onListParentsResponse.f5211b, i, false);
        C1295b.m6494a(parcel, a);
    }

    public OnListParentsResponse m7580a(Parcel parcel) {
        int b = C1294a.m6465b(parcel);
        int i = 0;
        DataHolder dataHolder = null;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    dataHolder = (DataHolder) C1294a.m6462a(parcel, a, DataHolder.CREATOR);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new OnListParentsResponse(i, dataHolder);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public OnListParentsResponse[] m7581a(int i) {
        return new OnListParentsResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7580a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7581a(i);
    }
}
