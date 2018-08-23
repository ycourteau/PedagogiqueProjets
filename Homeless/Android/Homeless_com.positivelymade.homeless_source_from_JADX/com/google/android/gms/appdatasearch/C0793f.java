package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.appdatasearch.GetRecentContextCall.Request;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C0793f implements Creator<Request> {
    static void m3739a(Request request, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6501a(parcel, 1, request.f2290b, i, false);
        C1295b.m6496a(parcel, 1000, request.f2289a);
        C1295b.m6507a(parcel, 2, request.f2291c);
        C1295b.m6507a(parcel, 3, request.f2292d);
        C1295b.m6507a(parcel, 4, request.f2293e);
        C1295b.m6505a(parcel, 5, request.f2294f, false);
        C1295b.m6494a(parcel, a);
    }

    public Request m3740a(Parcel parcel) {
        String str = null;
        boolean z = false;
        int b = C1294a.m6465b(parcel);
        boolean z2 = false;
        boolean z3 = false;
        Account account = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    account = (Account) C1294a.m6462a(parcel, a, Account.CREATOR);
                    break;
                case 2:
                    z3 = C1294a.m6469c(parcel, a);
                    break;
                case 3:
                    z2 = C1294a.m6469c(parcel, a);
                    break;
                case 4:
                    z = C1294a.m6469c(parcel, a);
                    break;
                case 5:
                    str = C1294a.m6479m(parcel, a);
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
            return new Request(i, account, z3, z2, z, str);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public Request[] m3741a(int i) {
        return new Request[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m3740a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m3741a(i);
    }
}
