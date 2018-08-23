package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C0509c implements Creator<MobileAdsSettingsParcel> {
    static void m2357a(MobileAdsSettingsParcel mobileAdsSettingsParcel, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, mobileAdsSettingsParcel.f1356a);
        C1295b.m6507a(parcel, 2, mobileAdsSettingsParcel.f1357b);
        C1295b.m6505a(parcel, 3, mobileAdsSettingsParcel.f1358c, false);
        C1295b.m6494a(parcel, a);
    }

    public MobileAdsSettingsParcel m2358a(Parcel parcel) {
        boolean z = false;
        int b = C1294a.m6465b(parcel);
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    z = C1294a.m6469c(parcel, a);
                    break;
                case 3:
                    str = C1294a.m6479m(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new MobileAdsSettingsParcel(i, z, str);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public MobileAdsSettingsParcel[] m2359a(int i) {
        return new MobileAdsSettingsParcel[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m2358a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m2359a(i);
    }
}
