package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1528e implements Creator<SafeParcelResponse> {
    static void m6929a(SafeParcelResponse safeParcelResponse, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, safeParcelResponse.m6914d());
        C1295b.m6500a(parcel, 2, safeParcelResponse.m6915e(), false);
        C1295b.m6501a(parcel, 3, safeParcelResponse.m6916f(), i, false);
        C1295b.m6494a(parcel, a);
    }

    public SafeParcelResponse m6930a(Parcel parcel) {
        FieldMappingDictionary fieldMappingDictionary = null;
        int b = C1294a.m6465b(parcel);
        int i = 0;
        Parcel parcel2 = null;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    parcel2 = C1294a.m6492z(parcel, a);
                    break;
                case 3:
                    fieldMappingDictionary = (FieldMappingDictionary) C1294a.m6462a(parcel, a, FieldMappingDictionary.CREATOR);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new SafeParcelResponse(i, parcel2, fieldMappingDictionary);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public SafeParcelResponse[] m6931a(int i) {
        return new SafeParcelResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m6930a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m6931a(i);
    }
}
