package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.common.server.response.FieldMappingDictionary.Entry;
import java.util.ArrayList;

public class C1526c implements Creator<FieldMappingDictionary> {
    static void m6923a(FieldMappingDictionary fieldMappingDictionary, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, fieldMappingDictionary.m6899b());
        C1295b.m6515b(parcel, 2, fieldMappingDictionary.m6900c(), false);
        C1295b.m6505a(parcel, 3, fieldMappingDictionary.m6901d(), false);
        C1295b.m6494a(parcel, a);
    }

    public FieldMappingDictionary m6924a(Parcel parcel) {
        String str = null;
        int b = C1294a.m6465b(parcel);
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    arrayList = C1294a.m6468c(parcel, a, Entry.CREATOR);
                    break;
                case 3:
                    str = C1294a.m6479m(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new FieldMappingDictionary(i, arrayList, str);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public FieldMappingDictionary[] m6925a(int i) {
        return new FieldMappingDictionary[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m6924a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m6925a(i);
    }
}
