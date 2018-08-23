package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1926g implements Creator<RecordConsentRequest> {
    static void m9657a(RecordConsentRequest recordConsentRequest, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, recordConsentRequest.f5883a);
        C1295b.m6501a(parcel, 2, recordConsentRequest.m9623a(), i, false);
        C1295b.m6510a(parcel, 3, recordConsentRequest.m9624b(), i, false);
        C1295b.m6505a(parcel, 4, recordConsentRequest.m9625c(), false);
        C1295b.m6494a(parcel, a);
    }

    public RecordConsentRequest m9658a(Parcel parcel) {
        String str = null;
        int b = C1294a.m6465b(parcel);
        int i = 0;
        Scope[] scopeArr = null;
        Account account = null;
        while (parcel.dataPosition() < b) {
            Scope[] scopeArr2;
            Account account2;
            int e;
            String str2;
            int a = C1294a.m6460a(parcel);
            String str3;
            switch (C1294a.m6459a(a)) {
                case 1:
                    str3 = str;
                    scopeArr2 = scopeArr;
                    account2 = account;
                    e = C1294a.m6471e(parcel, a);
                    str2 = str3;
                    break;
                case 2:
                    e = i;
                    Scope[] scopeArr3 = scopeArr;
                    account2 = (Account) C1294a.m6462a(parcel, a, Account.CREATOR);
                    str2 = str;
                    scopeArr2 = scopeArr3;
                    break;
                case 3:
                    account2 = account;
                    e = i;
                    str3 = str;
                    scopeArr2 = (Scope[]) C1294a.m6467b(parcel, a, Scope.CREATOR);
                    str2 = str3;
                    break;
                case 4:
                    str2 = C1294a.m6479m(parcel, a);
                    scopeArr2 = scopeArr;
                    account2 = account;
                    e = i;
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    str2 = str;
                    scopeArr2 = scopeArr;
                    account2 = account;
                    e = i;
                    break;
            }
            i = e;
            account = account2;
            scopeArr = scopeArr2;
            str = str2;
        }
        if (parcel.dataPosition() == b) {
            return new RecordConsentRequest(i, account, scopeArr, str);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public RecordConsentRequest[] m9659a(int i) {
        return new RecordConsentRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m9658a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m9659a(i);
    }
}
