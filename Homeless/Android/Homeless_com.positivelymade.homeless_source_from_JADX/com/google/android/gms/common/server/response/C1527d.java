package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.common.server.response.FieldMappingDictionary.Entry;
import com.google.android.gms.common.server.response.FieldMappingDictionary.FieldMapPair;
import java.util.ArrayList;

public class C1527d implements Creator<Entry> {
    static void m6926a(Entry entry, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, entry.f4545a);
        C1295b.m6505a(parcel, 2, entry.f4546b, false);
        C1295b.m6515b(parcel, 3, entry.f4547c, false);
        C1295b.m6494a(parcel, a);
    }

    public Entry m6927a(Parcel parcel) {
        ArrayList arrayList = null;
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
                    arrayList = C1294a.m6468c(parcel, a, FieldMapPair.CREATOR);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new Entry(i, str, arrayList);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public Entry[] m6928a(int i) {
        return new Entry[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m6927a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m6928a(i);
    }
}
