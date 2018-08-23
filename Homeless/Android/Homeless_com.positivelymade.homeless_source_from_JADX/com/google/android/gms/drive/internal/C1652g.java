package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1652g implements Creator<GetDriveIdFromUniqueIdentifierRequest> {
    static void m7692a(GetDriveIdFromUniqueIdentifierRequest getDriveIdFromUniqueIdentifierRequest, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, getDriveIdFromUniqueIdentifierRequest.f5161a);
        C1295b.m6505a(parcel, 2, getDriveIdFromUniqueIdentifierRequest.f5162b, false);
        C1295b.m6507a(parcel, 3, getDriveIdFromUniqueIdentifierRequest.f5163c);
        C1295b.m6494a(parcel, a);
    }

    public GetDriveIdFromUniqueIdentifierRequest m7693a(Parcel parcel) {
        boolean z = false;
        int b = C1294a.m6465b(parcel);
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    str = C1294a.m6479m(parcel, a);
                    break;
                case 3:
                    z = C1294a.m6469c(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GetDriveIdFromUniqueIdentifierRequest(i, str, z);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public GetDriveIdFromUniqueIdentifierRequest[] m7694a(int i) {
        return new GetDriveIdFromUniqueIdentifierRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7693a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7694a(i);
    }
}
