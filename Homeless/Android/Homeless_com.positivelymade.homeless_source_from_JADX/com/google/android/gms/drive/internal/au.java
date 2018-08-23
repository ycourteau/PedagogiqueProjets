package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import java.util.List;

public class au implements Creator<CancelPendingActionsRequest> {
    static void m7636a(CancelPendingActionsRequest cancelPendingActionsRequest, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, cancelPendingActionsRequest.f5104a);
        C1295b.m6506a(parcel, 2, cancelPendingActionsRequest.f5105b, false);
        C1295b.m6494a(parcel, a);
    }

    public CancelPendingActionsRequest m7637a(Parcel parcel) {
        int b = C1294a.m6465b(parcel);
        int i = 0;
        List list = null;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    list = C1294a.m6491y(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new CancelPendingActionsRequest(i, list);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public CancelPendingActionsRequest[] m7638a(int i) {
        return new CancelPendingActionsRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7637a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7638a(i);
    }
}
