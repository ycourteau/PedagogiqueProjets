package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.common.server.response.FieldMappingDictionary.FieldMapPair;

public class C1525b implements Creator<FieldMapPair> {
    static void m6920a(FieldMapPair fieldMapPair, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, fieldMapPair.f4548a);
        C1295b.m6505a(parcel, 2, fieldMapPair.f4549b, false);
        C1295b.m6501a(parcel, 3, fieldMapPair.f4550c, i, false);
        C1295b.m6494a(parcel, a);
    }

    public FieldMapPair m6921a(Parcel parcel) {
        Field field = null;
        int b = C1294a.m6465b(parcel);
        int i = 0;
        String str = null;
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
                    field = (Field) C1294a.m6462a(parcel, a, Field.CREATOR);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new FieldMapPair(i, str, field);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public FieldMapPair[] m6922a(int i) {
        return new FieldMapPair[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m6921a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m6922a(i);
    }
}
