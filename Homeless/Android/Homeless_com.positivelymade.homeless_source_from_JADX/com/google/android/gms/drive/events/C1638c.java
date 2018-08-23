package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.drive.DriveSpace;
import java.util.List;

public class C1638c implements Creator<ChangesAvailableOptions> {
    static void m7548a(ChangesAvailableOptions changesAvailableOptions, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, changesAvailableOptions.f5063a);
        C1295b.m6496a(parcel, 2, changesAvailableOptions.f5064b);
        C1295b.m6507a(parcel, 3, changesAvailableOptions.f5065c);
        C1295b.m6515b(parcel, 4, changesAvailableOptions.f5066d, false);
        C1295b.m6494a(parcel, a);
    }

    public ChangesAvailableOptions m7549a(Parcel parcel) {
        boolean z = false;
        int b = C1294a.m6465b(parcel);
        List list = null;
        int i = 0;
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
                    z = C1294a.m6469c(parcel, a);
                    break;
                case 4:
                    list = C1294a.m6468c(parcel, a, DriveSpace.CREATOR);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ChangesAvailableOptions(i2, i, z, list);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public ChangesAvailableOptions[] m7550a(int i) {
        return new ChangesAvailableOptions[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7549a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7550a(i);
    }
}
