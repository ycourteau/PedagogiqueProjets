package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class af implements Creator<OnSyncMoreResponse> {
    static void m7591a(OnSyncMoreResponse onSyncMoreResponse, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, onSyncMoreResponse.f5218a);
        C1295b.m6507a(parcel, 2, onSyncMoreResponse.f5219b);
        C1295b.m6494a(parcel, a);
    }

    public OnSyncMoreResponse m7592a(Parcel parcel) {
        boolean z = false;
        int b = C1294a.m6465b(parcel);
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
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new OnSyncMoreResponse(i, z);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public OnSyncMoreResponse[] m7593a(int i) {
        return new OnSyncMoreResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7592a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7593a(i);
    }
}
