package com.google.android.gms.ads.internal.util.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C0692c implements Creator<VersionInfoParcel> {
    static void m3104a(VersionInfoParcel versionInfoParcel, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, versionInfoParcel.f1975a);
        C1295b.m6505a(parcel, 2, versionInfoParcel.f1976b, false);
        C1295b.m6496a(parcel, 3, versionInfoParcel.f1977c);
        C1295b.m6496a(parcel, 4, versionInfoParcel.f1978d);
        C1295b.m6507a(parcel, 5, versionInfoParcel.f1979e);
        C1295b.m6494a(parcel, a);
    }

    public VersionInfoParcel m3105a(Parcel parcel) {
        boolean z = false;
        int b = C1294a.m6465b(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i3 = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    str = C1294a.m6479m(parcel, a);
                    break;
                case 3:
                    i2 = C1294a.m6471e(parcel, a);
                    break;
                case 4:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 5:
                    z = C1294a.m6469c(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new VersionInfoParcel(i3, str, i2, i, z);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public VersionInfoParcel[] m3106a(int i) {
        return new VersionInfoParcel[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m3105a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m3106a(i);
    }
}
