package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1759r implements Creator<ParcelableIndexReference> {
    static void m8183a(ParcelableIndexReference parcelableIndexReference, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, parcelableIndexReference.f5361a);
        C1295b.m6505a(parcel, 2, parcelableIndexReference.f5362b, false);
        C1295b.m6496a(parcel, 3, parcelableIndexReference.f5363c);
        C1295b.m6507a(parcel, 4, parcelableIndexReference.f5364d);
        C1295b.m6496a(parcel, 5, parcelableIndexReference.f5365e);
        C1295b.m6494a(parcel, a);
    }

    public ParcelableIndexReference m8184a(Parcel parcel) {
        boolean z = false;
        int b = C1294a.m6465b(parcel);
        String str = null;
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i3 = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    str = C1294a.m6479m(parcel, a);
                    break;
                case 3:
                    i2 = C1294a.m6471e(parcel, a);
                    break;
                case 4:
                    z = C1294a.m6469c(parcel, a);
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
            return new ParcelableIndexReference(i3, str, i2, z, i);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public ParcelableIndexReference[] m8185a(int i) {
        return new ParcelableIndexReference[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m8184a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m8185a(i);
    }
}
