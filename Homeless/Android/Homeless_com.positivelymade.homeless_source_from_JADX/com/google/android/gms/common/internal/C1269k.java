package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1269k implements Creator<GetServiceRequest> {
    static void m6380a(GetServiceRequest getServiceRequest, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, getServiceRequest.f4298a);
        C1295b.m6496a(parcel, 2, getServiceRequest.f4299b);
        C1295b.m6496a(parcel, 3, getServiceRequest.f4300c);
        C1295b.m6505a(parcel, 4, getServiceRequest.f4301d, false);
        C1295b.m6499a(parcel, 5, getServiceRequest.f4302e, false);
        C1295b.m6510a(parcel, 6, getServiceRequest.f4303f, i, false);
        C1295b.m6498a(parcel, 7, getServiceRequest.f4304g, false);
        C1295b.m6501a(parcel, 8, getServiceRequest.f4305h, i, false);
        C1295b.m6494a(parcel, a);
    }

    public GetServiceRequest m6381a(Parcel parcel) {
        int i = 0;
        Account account = null;
        int b = C1294a.m6465b(parcel);
        Bundle bundle = null;
        Scope[] scopeArr = null;
        IBinder iBinder = null;
        String str = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i3 = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    i2 = C1294a.m6471e(parcel, a);
                    break;
                case 3:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 4:
                    str = C1294a.m6479m(parcel, a);
                    break;
                case 5:
                    iBinder = C1294a.m6480n(parcel, a);
                    break;
                case 6:
                    scopeArr = (Scope[]) C1294a.m6467b(parcel, a, Scope.CREATOR);
                    break;
                case 7:
                    bundle = C1294a.m6481o(parcel, a);
                    break;
                case 8:
                    account = (Account) C1294a.m6462a(parcel, a, Account.CREATOR);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GetServiceRequest(i3, i2, i, str, iBinder, scopeArr, bundle, account);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public GetServiceRequest[] m6382a(int i) {
        return new GetServiceRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m6381a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m6382a(i);
    }
}
