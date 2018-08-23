package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.drive.realtime.internal.ParcelableChangeInfo;
import java.util.List;

public class C1719d implements Creator<ParcelableEventList> {
    static void m8011a(ParcelableEventList parcelableEventList, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, parcelableEventList.f5392a);
        C1295b.m6515b(parcel, 2, parcelableEventList.f5393b, false);
        C1295b.m6501a(parcel, 3, parcelableEventList.f5394c, i, false);
        C1295b.m6507a(parcel, 4, parcelableEventList.f5395d);
        C1295b.m6506a(parcel, 5, parcelableEventList.f5396e, false);
        C1295b.m6501a(parcel, 6, parcelableEventList.f5397f, i, false);
        C1295b.m6494a(parcel, a);
    }

    public ParcelableEventList m8012a(Parcel parcel) {
        boolean z = false;
        ParcelableChangeInfo parcelableChangeInfo = null;
        int b = C1294a.m6465b(parcel);
        List list = null;
        DataHolder dataHolder = null;
        List list2 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    list2 = C1294a.m6468c(parcel, a, ParcelableEvent.CREATOR);
                    break;
                case 3:
                    dataHolder = (DataHolder) C1294a.m6462a(parcel, a, DataHolder.CREATOR);
                    break;
                case 4:
                    z = C1294a.m6469c(parcel, a);
                    break;
                case 5:
                    list = C1294a.m6491y(parcel, a);
                    break;
                case 6:
                    parcelableChangeInfo = (ParcelableChangeInfo) C1294a.m6462a(parcel, a, ParcelableChangeInfo.CREATOR);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ParcelableEventList(i, list2, dataHolder, z, list, parcelableChangeInfo);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public ParcelableEventList[] m8013a(int i) {
        return new ParcelableEventList[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m8012a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m8013a(i);
    }
}
