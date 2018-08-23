package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1706b implements Creator<EndCompoundOperationRequest> {
    static void m7984a(EndCompoundOperationRequest endCompoundOperationRequest, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, endCompoundOperationRequest.f5349a);
        C1295b.m6494a(parcel, a);
    }

    public EndCompoundOperationRequest m7985a(Parcel parcel) {
        int b = C1294a.m6465b(parcel);
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new EndCompoundOperationRequest(i);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public EndCompoundOperationRequest[] m7986a(int i) {
        return new EndCompoundOperationRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7985a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7986a(i);
    }
}
