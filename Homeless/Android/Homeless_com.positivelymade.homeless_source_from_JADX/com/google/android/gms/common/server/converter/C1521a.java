package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1521a implements Creator<ConverterWrapper> {
    static void m6850a(ConverterWrapper converterWrapper, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, converterWrapper.m6836a());
        C1295b.m6501a(parcel, 2, converterWrapper.m6837b(), i, false);
        C1295b.m6494a(parcel, a);
    }

    public ConverterWrapper m6851a(Parcel parcel) {
        int b = C1294a.m6465b(parcel);
        int i = 0;
        StringToIntConverter stringToIntConverter = null;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    stringToIntConverter = (StringToIntConverter) C1294a.m6462a(parcel, a, StringToIntConverter.CREATOR);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ConverterWrapper(i, stringToIntConverter);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public ConverterWrapper[] m6852a(int i) {
        return new ConverterWrapper[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m6851a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m6852a(i);
    }
}
