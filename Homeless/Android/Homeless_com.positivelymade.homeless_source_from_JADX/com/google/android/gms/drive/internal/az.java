package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class az implements Creator<CreateContentsRequest> {
    static void m7651a(CreateContentsRequest createContentsRequest, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, createContentsRequest.f5125a);
        C1295b.m6496a(parcel, 2, createContentsRequest.f5126b);
        C1295b.m6494a(parcel, a);
    }

    public CreateContentsRequest m7652a(Parcel parcel) {
        int b = C1294a.m6465b(parcel);
        int i = 0;
        int i2 = 536870912;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    i2 = C1294a.m6471e(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new CreateContentsRequest(i, i2);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public CreateContentsRequest[] m7653a(int i) {
        return new CreateContentsRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7652a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7653a(i);
    }
}
