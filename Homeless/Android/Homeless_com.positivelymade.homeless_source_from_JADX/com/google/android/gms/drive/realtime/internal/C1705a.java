package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1705a implements Creator<BeginCompoundOperationRequest> {
    static void m7981a(BeginCompoundOperationRequest beginCompoundOperationRequest, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, beginCompoundOperationRequest.f5345a);
        C1295b.m6507a(parcel, 2, beginCompoundOperationRequest.f5346b);
        C1295b.m6505a(parcel, 3, beginCompoundOperationRequest.f5347c, false);
        C1295b.m6507a(parcel, 4, beginCompoundOperationRequest.f5348d);
        C1295b.m6494a(parcel, a);
    }

    public BeginCompoundOperationRequest m7982a(Parcel parcel) {
        boolean z = false;
        int b = C1294a.m6465b(parcel);
        String str = null;
        boolean z2 = true;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    z = C1294a.m6469c(parcel, a);
                    break;
                case 3:
                    str = C1294a.m6479m(parcel, a);
                    break;
                case 4:
                    z2 = C1294a.m6469c(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new BeginCompoundOperationRequest(i, z, str, z2);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public BeginCompoundOperationRequest[] m7983a(int i) {
        return new BeginCompoundOperationRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7982a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7983a(i);
    }
}
