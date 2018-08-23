package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1717b implements Creator<ObjectChangedDetails> {
    static void m8005a(ObjectChangedDetails objectChangedDetails, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, objectChangedDetails.f5371a);
        C1295b.m6496a(parcel, 2, objectChangedDetails.f5372b);
        C1295b.m6496a(parcel, 3, objectChangedDetails.f5373c);
        C1295b.m6494a(parcel, a);
    }

    public ObjectChangedDetails m8006a(Parcel parcel) {
        int i = 0;
        int b = C1294a.m6465b(parcel);
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i3 = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    i2 = C1294a.m6471e(parcel, a);
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
            return new ObjectChangedDetails(i3, i2, i);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public ObjectChangedDetails[] m8007a(int i) {
        return new ObjectChangedDetails[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m8006a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m8007a(i);
    }
}
