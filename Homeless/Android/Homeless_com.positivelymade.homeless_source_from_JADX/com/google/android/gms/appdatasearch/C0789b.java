package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C0789b implements Creator<DocumentContents> {
    static void m3727a(DocumentContents documentContents, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6510a(parcel, 1, documentContents.f2266b, i, false);
        C1295b.m6496a(parcel, 1000, documentContents.f2265a);
        C1295b.m6505a(parcel, 2, documentContents.f2267c, false);
        C1295b.m6507a(parcel, 3, documentContents.f2268d);
        C1295b.m6501a(parcel, 4, documentContents.f2269e, i, false);
        C1295b.m6494a(parcel, a);
    }

    public DocumentContents m3728a(Parcel parcel) {
        boolean z = false;
        Account account = null;
        int b = C1294a.m6465b(parcel);
        String str = null;
        DocumentSection[] documentSectionArr = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    documentSectionArr = (DocumentSection[]) C1294a.m6467b(parcel, a, DocumentSection.CREATOR);
                    break;
                case 2:
                    str = C1294a.m6479m(parcel, a);
                    break;
                case 3:
                    z = C1294a.m6469c(parcel, a);
                    break;
                case 4:
                    account = (Account) C1294a.m6462a(parcel, a, Account.CREATOR);
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
            return new DocumentContents(i, documentSectionArr, str, z, account);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public DocumentContents[] m3729a(int i) {
        return new DocumentContents[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m3728a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m3729a(i);
    }
}
