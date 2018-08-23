package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C0510d implements Creator<SearchAdRequestParcel> {
    static void m2360a(SearchAdRequestParcel searchAdRequestParcel, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, searchAdRequestParcel.f1359a);
        C1295b.m6496a(parcel, 2, searchAdRequestParcel.f1360b);
        C1295b.m6496a(parcel, 3, searchAdRequestParcel.f1361c);
        C1295b.m6496a(parcel, 4, searchAdRequestParcel.f1362d);
        C1295b.m6496a(parcel, 5, searchAdRequestParcel.f1363e);
        C1295b.m6496a(parcel, 6, searchAdRequestParcel.f1364f);
        C1295b.m6496a(parcel, 7, searchAdRequestParcel.f1365g);
        C1295b.m6496a(parcel, 8, searchAdRequestParcel.f1366h);
        C1295b.m6496a(parcel, 9, searchAdRequestParcel.f1367i);
        C1295b.m6505a(parcel, 10, searchAdRequestParcel.f1368j, false);
        C1295b.m6496a(parcel, 11, searchAdRequestParcel.f1369k);
        C1295b.m6505a(parcel, 12, searchAdRequestParcel.f1370l, false);
        C1295b.m6496a(parcel, 13, searchAdRequestParcel.f1371m);
        C1295b.m6496a(parcel, 14, searchAdRequestParcel.f1372n);
        C1295b.m6505a(parcel, 15, searchAdRequestParcel.f1373o, false);
        C1295b.m6494a(parcel, a);
    }

    public SearchAdRequestParcel m2361a(Parcel parcel) {
        int b = C1294a.m6465b(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        String str = null;
        int i10 = 0;
        String str2 = null;
        int i11 = 0;
        int i12 = 0;
        String str3 = null;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    i2 = C1294a.m6471e(parcel, a);
                    break;
                case 3:
                    i3 = C1294a.m6471e(parcel, a);
                    break;
                case 4:
                    i4 = C1294a.m6471e(parcel, a);
                    break;
                case 5:
                    i5 = C1294a.m6471e(parcel, a);
                    break;
                case 6:
                    i6 = C1294a.m6471e(parcel, a);
                    break;
                case 7:
                    i7 = C1294a.m6471e(parcel, a);
                    break;
                case 8:
                    i8 = C1294a.m6471e(parcel, a);
                    break;
                case 9:
                    i9 = C1294a.m6471e(parcel, a);
                    break;
                case 10:
                    str = C1294a.m6479m(parcel, a);
                    break;
                case 11:
                    i10 = C1294a.m6471e(parcel, a);
                    break;
                case 12:
                    str2 = C1294a.m6479m(parcel, a);
                    break;
                case 13:
                    i11 = C1294a.m6471e(parcel, a);
                    break;
                case 14:
                    i12 = C1294a.m6471e(parcel, a);
                    break;
                case 15:
                    str3 = C1294a.m6479m(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new SearchAdRequestParcel(i, i2, i3, i4, i5, i6, i7, i8, i9, str, i10, str2, i11, i12, str3);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public SearchAdRequestParcel[] m2362a(int i) {
        return new SearchAdRequestParcel[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m2361a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m2362a(i);
    }
}
