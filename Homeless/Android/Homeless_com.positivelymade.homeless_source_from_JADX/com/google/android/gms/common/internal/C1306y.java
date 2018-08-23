package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1306y implements Creator<ResolveAccountRequest> {
    static void m6629a(ResolveAccountRequest resolveAccountRequest, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, resolveAccountRequest.f4306a);
        C1295b.m6501a(parcel, 2, resolveAccountRequest.m6311a(), i, false);
        C1295b.m6496a(parcel, 3, resolveAccountRequest.m6312b());
        C1295b.m6494a(parcel, a);
    }

    public ResolveAccountRequest m6630a(Parcel parcel) {
        int i = 0;
        int b = C1294a.m6465b(parcel);
        Account account = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            Account account2;
            int e;
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    int i3 = i;
                    account2 = account;
                    e = C1294a.m6471e(parcel, a);
                    a = i3;
                    break;
                case 2:
                    e = i2;
                    Account account3 = (Account) C1294a.m6462a(parcel, a, Account.CREATOR);
                    a = i;
                    account2 = account3;
                    break;
                case 3:
                    a = C1294a.m6471e(parcel, a);
                    account2 = account;
                    e = i2;
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    a = i;
                    account2 = account;
                    e = i2;
                    break;
            }
            i2 = e;
            account = account2;
            i = a;
        }
        if (parcel.dataPosition() == b) {
            return new ResolveAccountRequest(i2, account, i);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public ResolveAccountRequest[] m6631a(int i) {
        return new ResolveAccountRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m6630a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m6631a(i);
    }
}
