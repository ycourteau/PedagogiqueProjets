package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1307z implements Creator<ResolveAccountResponse> {
    static void m6632a(ResolveAccountResponse resolveAccountResponse, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, resolveAccountResponse.f4309a);
        C1295b.m6499a(parcel, 2, resolveAccountResponse.f4310b, false);
        C1295b.m6501a(parcel, 3, resolveAccountResponse.m6314b(), i, false);
        C1295b.m6507a(parcel, 4, resolveAccountResponse.m6315c());
        C1295b.m6507a(parcel, 5, resolveAccountResponse.m6316d());
        C1295b.m6494a(parcel, a);
    }

    public ResolveAccountResponse m6633a(Parcel parcel) {
        ConnectionResult connectionResult = null;
        boolean z = false;
        int b = C1294a.m6465b(parcel);
        boolean z2 = false;
        IBinder iBinder = null;
        int i = 0;
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
                    connectionResult = (ConnectionResult) C1294a.m6462a(parcel, a, ConnectionResult.CREATOR);
                    break;
                case 4:
                    z2 = C1294a.m6469c(parcel, a);
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
            return new ResolveAccountResponse(i, iBinder, connectionResult, z2, z);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public ResolveAccountResponse[] m6634a(int i) {
        return new ResolveAccountResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m6633a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m6634a(i);
    }
}
