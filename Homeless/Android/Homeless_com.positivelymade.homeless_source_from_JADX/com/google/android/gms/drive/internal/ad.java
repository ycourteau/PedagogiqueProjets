package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class ad implements Creator<OnLoadRealtimeResponse> {
    static void m7585a(OnLoadRealtimeResponse onLoadRealtimeResponse, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, onLoadRealtimeResponse.f5212a);
        C1295b.m6507a(parcel, 2, onLoadRealtimeResponse.f5213b);
        C1295b.m6494a(parcel, a);
    }

    public OnLoadRealtimeResponse m7586a(Parcel parcel) {
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
            return new OnLoadRealtimeResponse(i, z);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public OnLoadRealtimeResponse[] m7587a(int i) {
        return new OnLoadRealtimeResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7586a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7587a(i);
    }
}
