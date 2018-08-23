package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.drive.ChangeSequenceNumber;
import com.google.android.gms.drive.DriveSpace;
import java.util.ArrayList;
import java.util.List;

public class C1651f implements Creator<GetChangesRequest> {
    static void m7689a(GetChangesRequest getChangesRequest, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, getChangesRequest.f5156a);
        C1295b.m6501a(parcel, 2, getChangesRequest.f5157b, i, false);
        C1295b.m6496a(parcel, 3, getChangesRequest.f5158c);
        C1295b.m6515b(parcel, 4, getChangesRequest.f5159d, false);
        C1295b.m6494a(parcel, a);
    }

    public GetChangesRequest m7690a(Parcel parcel) {
        List list = null;
        int i = 0;
        int b = C1294a.m6465b(parcel);
        ChangeSequenceNumber changeSequenceNumber = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int i3;
            ChangeSequenceNumber changeSequenceNumber2;
            int e;
            ArrayList c;
            int a = C1294a.m6460a(parcel);
            List list2;
            List list3;
            switch (C1294a.m6459a(a)) {
                case 1:
                    list2 = list;
                    i3 = i;
                    changeSequenceNumber2 = changeSequenceNumber;
                    e = C1294a.m6471e(parcel, a);
                    list3 = list2;
                    break;
                case 2:
                    e = i2;
                    int i4 = i;
                    changeSequenceNumber2 = (ChangeSequenceNumber) C1294a.m6462a(parcel, a, ChangeSequenceNumber.CREATOR);
                    list3 = list;
                    i3 = i4;
                    break;
                case 3:
                    changeSequenceNumber2 = changeSequenceNumber;
                    e = i2;
                    list2 = list;
                    i3 = C1294a.m6471e(parcel, a);
                    list3 = list2;
                    break;
                case 4:
                    c = C1294a.m6468c(parcel, a, DriveSpace.CREATOR);
                    i3 = i;
                    changeSequenceNumber2 = changeSequenceNumber;
                    e = i2;
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    c = list;
                    i3 = i;
                    changeSequenceNumber2 = changeSequenceNumber;
                    e = i2;
                    break;
            }
            i2 = e;
            changeSequenceNumber = changeSequenceNumber2;
            i = i3;
            Object obj = c;
        }
        if (parcel.dataPosition() == b) {
            return new GetChangesRequest(i2, changeSequenceNumber, i, list);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public GetChangesRequest[] m7691a(int i) {
        return new GetChangesRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7690a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7691a(i);
    }
}
