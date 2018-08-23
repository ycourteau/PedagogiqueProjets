package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C0796i implements Creator<RegisterSectionInfo> {
    static void m3746a(RegisterSectionInfo registerSectionInfo, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6505a(parcel, 1, registerSectionInfo.f2324b, false);
        C1295b.m6496a(parcel, 1000, registerSectionInfo.f2323a);
        C1295b.m6505a(parcel, 2, registerSectionInfo.f2325c, false);
        C1295b.m6507a(parcel, 3, registerSectionInfo.f2326d);
        C1295b.m6496a(parcel, 4, registerSectionInfo.f2327e);
        C1295b.m6507a(parcel, 5, registerSectionInfo.f2328f);
        C1295b.m6505a(parcel, 6, registerSectionInfo.f2329g, false);
        C1295b.m6510a(parcel, 7, registerSectionInfo.f2330h, i, false);
        C1295b.m6509a(parcel, 8, registerSectionInfo.f2331i, false);
        C1295b.m6505a(parcel, 11, registerSectionInfo.f2332j, false);
        C1295b.m6494a(parcel, a);
    }

    public RegisterSectionInfo m3747a(Parcel parcel) {
        boolean z = false;
        String str = null;
        int b = C1294a.m6465b(parcel);
        int i = 1;
        int[] iArr = null;
        Feature[] featureArr = null;
        String str2 = null;
        boolean z2 = false;
        String str3 = null;
        String str4 = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    str4 = C1294a.m6479m(parcel, a);
                    break;
                case 2:
                    str3 = C1294a.m6479m(parcel, a);
                    break;
                case 3:
                    z2 = C1294a.m6469c(parcel, a);
                    break;
                case 4:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 5:
                    z = C1294a.m6469c(parcel, a);
                    break;
                case 6:
                    str2 = C1294a.m6479m(parcel, a);
                    break;
                case 7:
                    featureArr = (Feature[]) C1294a.m6467b(parcel, a, Feature.CREATOR);
                    break;
                case 8:
                    iArr = C1294a.m6484r(parcel, a);
                    break;
                case 11:
                    str = C1294a.m6479m(parcel, a);
                    break;
                case 1000:
                    i2 = C1294a.m6471e(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new RegisterSectionInfo(i2, str4, str3, z2, i, z, str2, featureArr, iArr, str);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public RegisterSectionInfo[] m3748a(int i) {
        return new RegisterSectionInfo[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m3747a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m3748a(i);
    }
}
