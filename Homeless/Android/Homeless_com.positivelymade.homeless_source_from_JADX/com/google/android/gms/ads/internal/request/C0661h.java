package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v7.p010b.C0275a.C0274i;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import java.util.List;

public class C0661h implements Creator<AdResponseParcel> {
    static void m3008a(AdResponseParcel adResponseParcel, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, adResponseParcel.f1864a);
        C1295b.m6505a(parcel, 2, adResponseParcel.f1865b, false);
        C1295b.m6505a(parcel, 3, adResponseParcel.f1866c, false);
        C1295b.m6506a(parcel, 4, adResponseParcel.f1867d, false);
        C1295b.m6496a(parcel, 5, adResponseParcel.f1868e);
        C1295b.m6506a(parcel, 6, adResponseParcel.f1869f, false);
        C1295b.m6497a(parcel, 7, adResponseParcel.f1870g);
        C1295b.m6507a(parcel, 8, adResponseParcel.f1871h);
        C1295b.m6497a(parcel, 9, adResponseParcel.f1872i);
        C1295b.m6506a(parcel, 10, adResponseParcel.f1873j, false);
        C1295b.m6497a(parcel, 11, adResponseParcel.f1874k);
        C1295b.m6496a(parcel, 12, adResponseParcel.f1875l);
        C1295b.m6505a(parcel, 13, adResponseParcel.f1876m, false);
        C1295b.m6497a(parcel, 14, adResponseParcel.f1877n);
        C1295b.m6505a(parcel, 15, adResponseParcel.f1878o, false);
        C1295b.m6505a(parcel, 19, adResponseParcel.f1880q, false);
        C1295b.m6507a(parcel, 18, adResponseParcel.f1879p);
        C1295b.m6505a(parcel, 21, adResponseParcel.f1881r, false);
        C1295b.m6507a(parcel, 23, adResponseParcel.f1883t);
        C1295b.m6507a(parcel, 22, adResponseParcel.f1882s);
        C1295b.m6507a(parcel, 25, adResponseParcel.f1885v);
        C1295b.m6507a(parcel, 24, adResponseParcel.f1884u);
        C1295b.m6496a(parcel, 27, adResponseParcel.f1887x);
        C1295b.m6507a(parcel, 26, adResponseParcel.f1886w);
        C1295b.m6505a(parcel, 29, adResponseParcel.f1889z, false);
        C1295b.m6501a(parcel, 28, adResponseParcel.f1888y, i, false);
        C1295b.m6494a(parcel, a);
    }

    public AdResponseParcel m3009a(Parcel parcel) {
        int b = C1294a.m6465b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        List list = null;
        int i2 = 0;
        List list2 = null;
        long j = 0;
        boolean z = false;
        long j2 = 0;
        List list3 = null;
        long j3 = 0;
        int i3 = 0;
        String str3 = null;
        long j4 = 0;
        String str4 = null;
        boolean z2 = false;
        String str5 = null;
        String str6 = null;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        int i4 = 0;
        LargeParcelTeleporter largeParcelTeleporter = null;
        String str7 = null;
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
                    str2 = C1294a.m6479m(parcel, a);
                    break;
                case 4:
                    list = C1294a.m6491y(parcel, a);
                    break;
                case 5:
                    i2 = C1294a.m6471e(parcel, a);
                    break;
                case 6:
                    list2 = C1294a.m6491y(parcel, a);
                    break;
                case 7:
                    j = C1294a.m6473g(parcel, a);
                    break;
                case 8:
                    z = C1294a.m6469c(parcel, a);
                    break;
                case 9:
                    j2 = C1294a.m6473g(parcel, a);
                    break;
                case 10:
                    list3 = C1294a.m6491y(parcel, a);
                    break;
                case 11:
                    j3 = C1294a.m6473g(parcel, a);
                    break;
                case 12:
                    i3 = C1294a.m6471e(parcel, a);
                    break;
                case 13:
                    str3 = C1294a.m6479m(parcel, a);
                    break;
                case 14:
                    j4 = C1294a.m6473g(parcel, a);
                    break;
                case 15:
                    str4 = C1294a.m6479m(parcel, a);
                    break;
                case 18:
                    z2 = C1294a.m6469c(parcel, a);
                    break;
                case 19:
                    str5 = C1294a.m6479m(parcel, a);
                    break;
                case 21:
                    str6 = C1294a.m6479m(parcel, a);
                    break;
                case 22:
                    z3 = C1294a.m6469c(parcel, a);
                    break;
                case 23:
                    z4 = C1294a.m6469c(parcel, a);
                    break;
                case 24:
                    z5 = C1294a.m6469c(parcel, a);
                    break;
                case 25:
                    z6 = C1294a.m6469c(parcel, a);
                    break;
                case 26:
                    z7 = C1294a.m6469c(parcel, a);
                    break;
                case C0274i.Theme_actionModeStyle /*27*/:
                    i4 = C1294a.m6471e(parcel, a);
                    break;
                case C0274i.Theme_actionModeCloseButtonStyle /*28*/:
                    largeParcelTeleporter = (LargeParcelTeleporter) C1294a.m6462a(parcel, a, LargeParcelTeleporter.CREATOR);
                    break;
                case C0274i.Theme_actionModeBackground /*29*/:
                    str7 = C1294a.m6479m(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AdResponseParcel(i, str, str2, list, i2, list2, j, z, j2, list3, j3, i3, str3, j4, str4, z2, str5, str6, z3, z4, z5, z6, z7, i4, largeParcelTeleporter, str7);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public AdResponseParcel[] m3010a(int i) {
        return new AdResponseParcel[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m3009a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m3010a(i);
    }
}
