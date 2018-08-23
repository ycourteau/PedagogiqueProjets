package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.drive.Permission;
import java.util.List;

public class C1655j implements Creator<GetPermissionsResponse> {
    static void m7701a(GetPermissionsResponse getPermissionsResponse, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, getPermissionsResponse.f5169a);
        C1295b.m6515b(parcel, 2, getPermissionsResponse.f5170b, false);
        C1295b.m6496a(parcel, 3, getPermissionsResponse.f5171c);
        C1295b.m6494a(parcel, a);
    }

    public GetPermissionsResponse m7702a(Parcel parcel) {
        int i = 0;
        int b = C1294a.m6465b(parcel);
        List list = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i2 = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    list = C1294a.m6468c(parcel, a, Permission.CREATOR);
                    break;
                case 3:
                    i = C1294a.m6471e(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GetPermissionsResponse(i2, list, i);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public GetPermissionsResponse[] m7703a(int i) {
        return new GetPermissionsResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7702a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7703a(i);
    }
}
