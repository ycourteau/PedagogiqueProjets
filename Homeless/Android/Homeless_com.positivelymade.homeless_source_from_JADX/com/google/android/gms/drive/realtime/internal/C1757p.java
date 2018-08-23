package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.drive.realtime.internal.event.ParcelableEvent;
import java.util.List;

public class C1757p implements Creator<ParcelableChangeInfo> {
    static void m8177a(ParcelableChangeInfo parcelableChangeInfo, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, parcelableChangeInfo.f5350a);
        C1295b.m6497a(parcel, 2, parcelableChangeInfo.f5351b);
        C1295b.m6515b(parcel, 3, parcelableChangeInfo.f5352c, false);
        C1295b.m6494a(parcel, a);
    }

    public ParcelableChangeInfo m8178a(Parcel parcel) {
        int b = C1294a.m6465b(parcel);
        int i = 0;
        long j = 0;
        List list = null;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    j = C1294a.m6473g(parcel, a);
                    break;
                case 3:
                    list = C1294a.m6468c(parcel, a, ParcelableEvent.CREATOR);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ParcelableChangeInfo(i, j, list);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public ParcelableChangeInfo[] m8179a(int i) {
        return new ParcelableChangeInfo[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m8178a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m8179a(i);
    }
}
