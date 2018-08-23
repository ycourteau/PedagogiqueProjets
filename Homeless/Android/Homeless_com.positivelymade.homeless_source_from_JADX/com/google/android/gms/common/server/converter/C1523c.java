package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.common.server.converter.StringToIntConverter.Entry;

public class C1523c implements Creator<Entry> {
    static void m6856a(Entry entry, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, entry.f4527a);
        C1295b.m6505a(parcel, 2, entry.f4528b, false);
        C1295b.m6496a(parcel, 3, entry.f4529c);
        C1295b.m6494a(parcel, a);
    }

    public Entry m6857a(Parcel parcel) {
        int i = 0;
        int b = C1294a.m6465b(parcel);
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i2 = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    str = C1294a.m6479m(parcel, a);
                    break;
                case 3:
                    i = C1294a.m6471e(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new Entry(i2, str, i);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public Entry[] m6858a(int i) {
        return new Entry[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m6857a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m6858a(i);
    }
}
