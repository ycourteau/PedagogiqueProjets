package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.common.server.converter.StringToIntConverter.Entry;
import java.util.ArrayList;

public class C1522b implements Creator<StringToIntConverter> {
    static void m6853a(StringToIntConverter stringToIntConverter, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, stringToIntConverter.m6843a());
        C1295b.m6515b(parcel, 2, stringToIntConverter.m6847b(), false);
        C1295b.m6494a(parcel, a);
    }

    public StringToIntConverter m6854a(Parcel parcel) {
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
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new StringToIntConverter(i, arrayList);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public StringToIntConverter[] m6855a(int i) {
        return new StringToIntConverter[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m6854a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m6855a(i);
    }
}
