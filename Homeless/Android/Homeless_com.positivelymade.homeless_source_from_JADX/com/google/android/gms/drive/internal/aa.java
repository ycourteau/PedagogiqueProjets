package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class aa implements Creator<OnListEntriesResponse> {
    static void m7576a(OnListEntriesResponse onListEntriesResponse, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, onListEntriesResponse.f5207a);
        C1295b.m6501a(parcel, 2, onListEntriesResponse.f5208b, i, false);
        C1295b.m6507a(parcel, 3, onListEntriesResponse.f5209c);
        C1295b.m6494a(parcel, a);
    }

    public OnListEntriesResponse m7577a(Parcel parcel) {
        boolean z = false;
        int b = C1294a.m6465b(parcel);
        DataHolder dataHolder = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            DataHolder dataHolder2;
            int e;
            boolean z2;
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    boolean z3 = z;
                    dataHolder2 = dataHolder;
                    e = C1294a.m6471e(parcel, a);
                    z2 = z3;
                    break;
                case 2:
                    e = i;
                    DataHolder dataHolder3 = (DataHolder) C1294a.m6462a(parcel, a, DataHolder.CREATOR);
                    z2 = z;
                    dataHolder2 = dataHolder3;
                    break;
                case 3:
                    z2 = C1294a.m6469c(parcel, a);
                    dataHolder2 = dataHolder;
                    e = i;
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    z2 = z;
                    dataHolder2 = dataHolder;
                    e = i;
                    break;
            }
            i = e;
            dataHolder = dataHolder2;
            z = z2;
        }
        if (parcel.dataPosition() == b) {
            return new OnListEntriesResponse(i, dataHolder, z);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public OnListEntriesResponse[] m7578a(int i) {
        return new OnListEntriesResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7577a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7578a(i);
    }
}
