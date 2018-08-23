package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1758q implements Creator<ParcelableCollaborator> {
    static void m8180a(ParcelableCollaborator parcelableCollaborator, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, parcelableCollaborator.f5353a);
        C1295b.m6507a(parcel, 2, parcelableCollaborator.f5354b);
        C1295b.m6507a(parcel, 3, parcelableCollaborator.f5355c);
        C1295b.m6505a(parcel, 4, parcelableCollaborator.f5356d, false);
        C1295b.m6505a(parcel, 5, parcelableCollaborator.f5357e, false);
        C1295b.m6505a(parcel, 6, parcelableCollaborator.f5358f, false);
        C1295b.m6505a(parcel, 7, parcelableCollaborator.f5359g, false);
        C1295b.m6505a(parcel, 8, parcelableCollaborator.f5360h, false);
        C1295b.m6494a(parcel, a);
    }

    public ParcelableCollaborator m8181a(Parcel parcel) {
        boolean z = false;
        String str = null;
        int b = C1294a.m6465b(parcel);
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        boolean z2 = false;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    z2 = C1294a.m6469c(parcel, a);
                    break;
                case 3:
                    z = C1294a.m6469c(parcel, a);
                    break;
                case 4:
                    str5 = C1294a.m6479m(parcel, a);
                    break;
                case 5:
                    str4 = C1294a.m6479m(parcel, a);
                    break;
                case 6:
                    str3 = C1294a.m6479m(parcel, a);
                    break;
                case 7:
                    str2 = C1294a.m6479m(parcel, a);
                    break;
                case 8:
                    str = C1294a.m6479m(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ParcelableCollaborator(i, z2, z, str5, str4, str3, str2, str);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public ParcelableCollaborator[] m8182a(int i) {
        return new ParcelableCollaborator[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m8181a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m8182a(i);
    }
}
