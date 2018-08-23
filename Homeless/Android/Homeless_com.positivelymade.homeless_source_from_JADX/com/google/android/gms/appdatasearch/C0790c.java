package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C0790c implements Creator<DocumentId> {
    static void m3730a(DocumentId documentId, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6505a(parcel, 1, documentId.f2271b, false);
        C1295b.m6496a(parcel, 1000, documentId.f2270a);
        C1295b.m6505a(parcel, 2, documentId.f2272c, false);
        C1295b.m6505a(parcel, 3, documentId.f2273d, false);
        C1295b.m6494a(parcel, a);
    }

    public DocumentId m3731a(Parcel parcel) {
        String str = null;
        int b = C1294a.m6465b(parcel);
        int i = 0;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    str3 = C1294a.m6479m(parcel, a);
                    break;
                case 2:
                    str2 = C1294a.m6479m(parcel, a);
                    break;
                case 3:
                    str = C1294a.m6479m(parcel, a);
                    break;
                case 1000:
                    i = C1294a.m6471e(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new DocumentId(i, str3, str2, str);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public DocumentId[] m3732a(int i) {
        return new DocumentId[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m3731a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m3732a(i);
    }
}
