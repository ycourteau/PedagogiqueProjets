package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C0578l implements Creator<InterstitialAdParameterParcel> {
    static void m2605a(InterstitialAdParameterParcel interstitialAdParameterParcel, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, interstitialAdParameterParcel.f1304a);
        C1295b.m6507a(parcel, 2, interstitialAdParameterParcel.f1305b);
        C1295b.m6507a(parcel, 3, interstitialAdParameterParcel.f1306c);
        C1295b.m6494a(parcel, a);
    }

    public InterstitialAdParameterParcel m2606a(Parcel parcel) {
        boolean z = false;
        int b = C1294a.m6465b(parcel);
        boolean z2 = false;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    z2 = C1294a.m6469c(parcel, a);
                    break;
                case 3:
                    z = C1294a.m6469c(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new InterstitialAdParameterParcel(i, z2, z);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public InterstitialAdParameterParcel[] m2607a(int i) {
        return new InterstitialAdParameterParcel[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m2606a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m2607a(i);
    }
}
