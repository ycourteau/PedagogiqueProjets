package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.common.server.converter.ConverterWrapper;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;

public class C1524a implements Creator<Field> {
    static void m6917a(Field field, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, field.m6866a());
        C1295b.m6496a(parcel, 2, field.m6869b());
        C1295b.m6507a(parcel, 3, field.m6870c());
        C1295b.m6496a(parcel, 4, field.m6871d());
        C1295b.m6507a(parcel, 5, field.m6872e());
        C1295b.m6505a(parcel, 6, field.m6873f(), false);
        C1295b.m6496a(parcel, 7, field.m6874g());
        C1295b.m6505a(parcel, 8, field.m6876i(), false);
        C1295b.m6501a(parcel, 9, field.m6878k(), i, false);
        C1295b.m6494a(parcel, a);
    }

    public Field m6918a(Parcel parcel) {
        ConverterWrapper converterWrapper = null;
        int i = 0;
        int b = C1294a.m6465b(parcel);
        String str = null;
        String str2 = null;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i4 = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    i3 = C1294a.m6471e(parcel, a);
                    break;
                case 3:
                    z2 = C1294a.m6469c(parcel, a);
                    break;
                case 4:
                    i2 = C1294a.m6471e(parcel, a);
                    break;
                case 5:
                    z = C1294a.m6469c(parcel, a);
                    break;
                case 6:
                    str2 = C1294a.m6479m(parcel, a);
                    break;
                case 7:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 8:
                    str = C1294a.m6479m(parcel, a);
                    break;
                case 9:
                    converterWrapper = (ConverterWrapper) C1294a.m6462a(parcel, a, ConverterWrapper.CREATOR);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new Field(i4, i3, z2, i2, z, str2, i, str, converterWrapper);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public Field[] m6919a(int i) {
        return new Field[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m6918a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m6919a(i);
    }
}
