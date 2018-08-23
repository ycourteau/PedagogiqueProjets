package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1250c implements Creator<ValidateAccountRequest> {
    static void m6329a(ValidateAccountRequest validateAccountRequest, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, validateAccountRequest.f4314a);
        C1295b.m6496a(parcel, 2, validateAccountRequest.m6317a());
        C1295b.m6499a(parcel, 3, validateAccountRequest.f4315b, false);
        C1295b.m6510a(parcel, 4, validateAccountRequest.m6318b(), i, false);
        C1295b.m6498a(parcel, 5, validateAccountRequest.m6320d(), false);
        C1295b.m6505a(parcel, 6, validateAccountRequest.m6319c(), false);
        C1295b.m6494a(parcel, a);
    }

    public ValidateAccountRequest m6330a(Parcel parcel) {
        int i = 0;
        String str = null;
        int b = C1294a.m6465b(parcel);
        Bundle bundle = null;
        Scope[] scopeArr = null;
        IBinder iBinder = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i2 = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 3:
                    iBinder = C1294a.m6480n(parcel, a);
                    break;
                case 4:
                    scopeArr = (Scope[]) C1294a.m6467b(parcel, a, Scope.CREATOR);
                    break;
                case 5:
                    bundle = C1294a.m6481o(parcel, a);
                    break;
                case 6:
                    str = C1294a.m6479m(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ValidateAccountRequest(i2, i, iBinder, scopeArr, bundle, str);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public ValidateAccountRequest[] m6331a(int i) {
        return new ValidateAccountRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m6330a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m6331a(i);
    }
}
