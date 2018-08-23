package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import java.util.List;

public class av implements Creator<CheckResourceIdsExistRequest> {
    static void m7639a(CheckResourceIdsExistRequest checkResourceIdsExistRequest, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, checkResourceIdsExistRequest.m7566a());
        C1295b.m6506a(parcel, 2, checkResourceIdsExistRequest.m7567b(), false);
        C1295b.m6494a(parcel, a);
    }

    public CheckResourceIdsExistRequest m7640a(Parcel parcel) {
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
            return new CheckResourceIdsExistRequest(i, list);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public CheckResourceIdsExistRequest[] m7641a(int i) {
        return new CheckResourceIdsExistRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7640a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7641a(i);
    }
}
