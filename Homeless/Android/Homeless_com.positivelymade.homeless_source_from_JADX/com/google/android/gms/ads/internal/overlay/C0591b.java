package com.google.android.gms.ads.internal.overlay;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C0591b implements Creator<AdLauncherIntentInfoParcel> {
    static void m2661a(AdLauncherIntentInfoParcel adLauncherIntentInfoParcel, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, adLauncherIntentInfoParcel.f1586a);
        C1295b.m6505a(parcel, 2, adLauncherIntentInfoParcel.f1587b, false);
        C1295b.m6505a(parcel, 3, adLauncherIntentInfoParcel.f1588c, false);
        C1295b.m6505a(parcel, 4, adLauncherIntentInfoParcel.f1589d, false);
        C1295b.m6505a(parcel, 5, adLauncherIntentInfoParcel.f1590e, false);
        C1295b.m6505a(parcel, 6, adLauncherIntentInfoParcel.f1591f, false);
        C1295b.m6505a(parcel, 7, adLauncherIntentInfoParcel.f1592g, false);
        C1295b.m6505a(parcel, 8, adLauncherIntentInfoParcel.f1593h, false);
        C1295b.m6494a(parcel, a);
    }

    public AdLauncherIntentInfoParcel m2662a(Parcel parcel) {
        String str = null;
        int b = C1294a.m6465b(parcel);
        int i = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    str7 = C1294a.m6479m(parcel, a);
                    break;
                case 3:
                    str6 = C1294a.m6479m(parcel, a);
                    break;
                case 4:
                    str5 = C1294a.m6479m(parcel, a);
                    break;
                case 5:
                    str4 = C1294a.m6479m(parcel, a);
                    break;
                case 6:
                    str3 = C1294a.m6479m(parcel, a);
                    break;
                case 7:
                    str2 = C1294a.m6479m(parcel, a);
                    break;
                case 8:
                    str = C1294a.m6479m(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AdLauncherIntentInfoParcel(i, str7, str6, str5, str4, str3, str2, str);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public AdLauncherIntentInfoParcel[] m2663a(int i) {
        return new AdLauncherIntentInfoParcel[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m2662a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m2663a(i);
    }
}
