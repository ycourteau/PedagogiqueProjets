package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C0797j implements Creator<UsageInfo> {
    static void m3749a(UsageInfo usageInfo, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6501a(parcel, 1, usageInfo.f2334b, i, false);
        C1295b.m6496a(parcel, 1000, usageInfo.f2333a);
        C1295b.m6497a(parcel, 2, usageInfo.f2335c);
        C1295b.m6496a(parcel, 3, usageInfo.f2336d);
        C1295b.m6505a(parcel, 4, usageInfo.f2337e, false);
        C1295b.m6501a(parcel, 5, usageInfo.f2338f, i, false);
        C1295b.m6507a(parcel, 6, usageInfo.f2339g);
        C1295b.m6496a(parcel, 7, usageInfo.f2340h);
        C1295b.m6496a(parcel, 8, usageInfo.f2341i);
        C1295b.m6494a(parcel, a);
    }

    public UsageInfo m3750a(Parcel parcel) {
        DocumentContents documentContents = null;
        int i = 0;
        int b = C1294a.m6465b(parcel);
        long j = 0;
        int i2 = -1;
        boolean z = false;
        String str = null;
        int i3 = 0;
        DocumentId documentId = null;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    documentId = (DocumentId) C1294a.m6462a(parcel, a, DocumentId.CREATOR);
                    break;
                case 2:
                    j = C1294a.m6473g(parcel, a);
                    break;
                case 3:
                    i3 = C1294a.m6471e(parcel, a);
                    break;
                case 4:
                    str = C1294a.m6479m(parcel, a);
                    break;
                case 5:
                    documentContents = (DocumentContents) C1294a.m6462a(parcel, a, DocumentContents.CREATOR);
                    break;
                case 6:
                    z = C1294a.m6469c(parcel, a);
                    break;
                case 7:
                    i2 = C1294a.m6471e(parcel, a);
                    break;
                case 8:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 1000:
                    i4 = C1294a.m6471e(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new UsageInfo(i4, documentId, j, i3, str, documentContents, z, i2, i);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public UsageInfo[] m3751a(int i) {
        return new UsageInfo[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m3750a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m3751a(i);
    }
}
