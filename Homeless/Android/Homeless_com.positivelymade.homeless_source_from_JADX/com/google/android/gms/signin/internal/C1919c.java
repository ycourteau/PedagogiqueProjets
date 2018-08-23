package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import java.util.List;

public class C1919c implements Creator<CheckServerAuthResult> {
    static void m9629a(CheckServerAuthResult checkServerAuthResult, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, checkServerAuthResult.f5880a);
        C1295b.m6507a(parcel, 2, checkServerAuthResult.f5881b);
        C1295b.m6515b(parcel, 3, checkServerAuthResult.f5882c, false);
        C1295b.m6494a(parcel, a);
    }

    public CheckServerAuthResult m9630a(Parcel parcel) {
        boolean z = false;
        int b = C1294a.m6465b(parcel);
        List list = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    z = C1294a.m6469c(parcel, a);
                    break;
                case 3:
                    list = C1294a.m6468c(parcel, a, Scope.CREATOR);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new CheckServerAuthResult(i, z, list);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public CheckServerAuthResult[] m9631a(int i) {
        return new CheckServerAuthResult[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m9630a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m9631a(i);
    }
}
