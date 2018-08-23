package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1252e implements Creator<AuthAccountRequest> {
    static void m6335a(AuthAccountRequest authAccountRequest, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, authAccountRequest.f4290a);
        C1295b.m6499a(parcel, 2, authAccountRequest.f4291b, false);
        C1295b.m6510a(parcel, 3, authAccountRequest.f4292c, i, false);
        C1295b.m6494a(parcel, a);
    }

    public AuthAccountRequest m6336a(Parcel parcel) {
        Scope[] scopeArr = null;
        int b = C1294a.m6465b(parcel);
        int i = 0;
        IBinder iBinder = null;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    iBinder = C1294a.m6480n(parcel, a);
                    break;
                case 3:
                    scopeArr = (Scope[]) C1294a.m6467b(parcel, a, Scope.CREATOR);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AuthAccountRequest(i, iBinder, scopeArr);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public AuthAccountRequest[] m6337a(int i) {
        return new AuthAccountRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m6336a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m6337a(i);
    }
}
