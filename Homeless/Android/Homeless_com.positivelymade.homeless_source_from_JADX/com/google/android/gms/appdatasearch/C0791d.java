package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C0791d implements Creator<DocumentSection> {
    static void m3733a(DocumentSection documentSection, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6505a(parcel, 1, documentSection.f2277c, false);
        C1295b.m6496a(parcel, 1000, documentSection.f2276b);
        C1295b.m6501a(parcel, 3, documentSection.f2278d, i, false);
        C1295b.m6496a(parcel, 4, documentSection.f2279e);
        C1295b.m6508a(parcel, 5, documentSection.f2280f, false);
        C1295b.m6494a(parcel, a);
    }

    public DocumentSection m3734a(Parcel parcel) {
        byte[] bArr = null;
        int b = C1294a.m6465b(parcel);
        int i = 0;
        int i2 = -1;
        RegisterSectionInfo registerSectionInfo = null;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    str = C1294a.m6479m(parcel, a);
                    break;
                case 3:
                    registerSectionInfo = (RegisterSectionInfo) C1294a.m6462a(parcel, a, RegisterSectionInfo.CREATOR);
                    break;
                case 4:
                    i2 = C1294a.m6471e(parcel, a);
                    break;
                case 5:
                    bArr = C1294a.m6482p(parcel, a);
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
            return new DocumentSection(i, str, registerSectionInfo, i2, bArr);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public DocumentSection[] m3735a(int i) {
        return new DocumentSection[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m3734a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m3735a(i);
    }
}
