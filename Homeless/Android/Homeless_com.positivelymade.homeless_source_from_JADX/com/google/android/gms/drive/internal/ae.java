package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import java.util.List;

public class ae implements Creator<OnResourceIdSetResponse> {
    static void m7588a(OnResourceIdSetResponse onResourceIdSetResponse, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, onResourceIdSetResponse.m7571a());
        C1295b.m6506a(parcel, 2, onResourceIdSetResponse.m7572b(), false);
        C1295b.m6494a(parcel, a);
    }

    public OnResourceIdSetResponse m7589a(Parcel parcel) {
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
            return new OnResourceIdSetResponse(i, list);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public OnResourceIdSetResponse[] m7590a(int i) {
        return new OnResourceIdSetResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7589a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7590a(i);
    }
}
