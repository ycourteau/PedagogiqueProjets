package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1720e implements Creator<ReferenceShiftedDetails> {
    static void m8014a(ReferenceShiftedDetails referenceShiftedDetails, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, referenceShiftedDetails.f5398a);
        C1295b.m6505a(parcel, 2, referenceShiftedDetails.f5399b, false);
        C1295b.m6505a(parcel, 3, referenceShiftedDetails.f5400c, false);
        C1295b.m6496a(parcel, 4, referenceShiftedDetails.f5401d);
        C1295b.m6496a(parcel, 5, referenceShiftedDetails.f5402e);
        C1295b.m6494a(parcel, a);
    }

    public ReferenceShiftedDetails m8015a(Parcel parcel) {
        String str = null;
        int i = 0;
        int b = C1294a.m6465b(parcel);
        int i2 = 0;
        String str2 = null;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i3 = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    str2 = C1294a.m6479m(parcel, a);
                    break;
                case 3:
                    str = C1294a.m6479m(parcel, a);
                    break;
                case 4:
                    i2 = C1294a.m6471e(parcel, a);
                    break;
                case 5:
                    i = C1294a.m6471e(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ReferenceShiftedDetails(i3, str2, str, i2, i);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public ReferenceShiftedDetails[] m8016a(int i) {
        return new ReferenceShiftedDetails[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m8015a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m8016a(i);
    }
}
