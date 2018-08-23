package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import java.util.List;

public class C0519i implements Creator<AdRequestParcel> {
    static void m2386a(AdRequestParcel adRequestParcel, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, adRequestParcel.f1330a);
        C1295b.m6497a(parcel, 2, adRequestParcel.f1331b);
        C1295b.m6498a(parcel, 3, adRequestParcel.f1332c, false);
        C1295b.m6496a(parcel, 4, adRequestParcel.f1333d);
        C1295b.m6506a(parcel, 5, adRequestParcel.f1334e, false);
        C1295b.m6507a(parcel, 6, adRequestParcel.f1335f);
        C1295b.m6496a(parcel, 7, adRequestParcel.f1336g);
        C1295b.m6507a(parcel, 8, adRequestParcel.f1337h);
        C1295b.m6505a(parcel, 9, adRequestParcel.f1338i, false);
        C1295b.m6501a(parcel, 10, adRequestParcel.f1339j, i, false);
        C1295b.m6501a(parcel, 11, adRequestParcel.f1340k, i, false);
        C1295b.m6505a(parcel, 12, adRequestParcel.f1341l, false);
        C1295b.m6498a(parcel, 13, adRequestParcel.f1342m, false);
        C1295b.m6498a(parcel, 14, adRequestParcel.f1343n, false);
        C1295b.m6506a(parcel, 15, adRequestParcel.f1344o, false);
        C1295b.m6505a(parcel, 17, adRequestParcel.f1346q, false);
        C1295b.m6505a(parcel, 16, adRequestParcel.f1345p, false);
        C1295b.m6494a(parcel, a);
    }

    public AdRequestParcel m2387a(Parcel parcel) {
        int b = C1294a.m6465b(parcel);
        int i = 0;
        long j = 0;
        Bundle bundle = null;
        int i2 = 0;
        List list = null;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        String str = null;
        SearchAdRequestParcel searchAdRequestParcel = null;
        Location location = null;
        String str2 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        List list2 = null;
        String str3 = null;
        String str4 = null;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    j = C1294a.m6473g(parcel, a);
                    break;
                case 3:
                    bundle = C1294a.m6481o(parcel, a);
                    break;
                case 4:
                    i2 = C1294a.m6471e(parcel, a);
                    break;
                case 5:
                    list = C1294a.m6491y(parcel, a);
                    break;
                case 6:
                    z = C1294a.m6469c(parcel, a);
                    break;
                case 7:
                    i3 = C1294a.m6471e(parcel, a);
                    break;
                case 8:
                    z2 = C1294a.m6469c(parcel, a);
                    break;
                case 9:
                    str = C1294a.m6479m(parcel, a);
                    break;
                case 10:
                    searchAdRequestParcel = (SearchAdRequestParcel) C1294a.m6462a(parcel, a, SearchAdRequestParcel.CREATOR);
                    break;
                case 11:
                    location = (Location) C1294a.m6462a(parcel, a, Location.CREATOR);
                    break;
                case 12:
                    str2 = C1294a.m6479m(parcel, a);
                    break;
                case 13:
                    bundle2 = C1294a.m6481o(parcel, a);
                    break;
                case 14:
                    bundle3 = C1294a.m6481o(parcel, a);
                    break;
                case 15:
                    list2 = C1294a.m6491y(parcel, a);
                    break;
                case 16:
                    str3 = C1294a.m6479m(parcel, a);
                    break;
                case 17:
                    str4 = C1294a.m6479m(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AdRequestParcel(i, j, bundle, i2, list, z, i3, z2, str, searchAdRequestParcel, location, str2, bundle2, bundle3, list2, str3, str4);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public AdRequestParcel[] m2388a(int i) {
        return new AdRequestParcel[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m2387a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m2388a(i);
    }
}
