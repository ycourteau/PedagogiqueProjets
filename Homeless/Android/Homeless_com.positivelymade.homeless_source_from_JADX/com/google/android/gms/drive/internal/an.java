package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.drive.DriveId;
import java.util.ArrayList;
import java.util.List;

public class an implements Creator<SetResourceParentsRequest> {
    static void m7615a(SetResourceParentsRequest setResourceParentsRequest, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, setResourceParentsRequest.f5243a);
        C1295b.m6501a(parcel, 2, setResourceParentsRequest.f5244b, i, false);
        C1295b.m6515b(parcel, 3, setResourceParentsRequest.f5245c, false);
        C1295b.m6494a(parcel, a);
    }

    public SetResourceParentsRequest m7616a(Parcel parcel) {
        List list = null;
        int b = C1294a.m6465b(parcel);
        int i = 0;
        DriveId driveId = null;
        while (parcel.dataPosition() < b) {
            DriveId driveId2;
            int e;
            ArrayList c;
            int a = C1294a.m6460a(parcel);
            List list2;
            switch (C1294a.m6459a(a)) {
                case 1:
                    List list3 = list;
                    driveId2 = driveId;
                    e = C1294a.m6471e(parcel, a);
                    list2 = list3;
                    break;
                case 2:
                    e = i;
                    DriveId driveId3 = (DriveId) C1294a.m6462a(parcel, a, DriveId.CREATOR);
                    list2 = list;
                    driveId2 = driveId3;
                    break;
                case 3:
                    c = C1294a.m6468c(parcel, a, DriveId.CREATOR);
                    driveId2 = driveId;
                    e = i;
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    c = list;
                    driveId2 = driveId;
                    e = i;
                    break;
            }
            i = e;
            driveId = driveId2;
            Object obj = c;
        }
        if (parcel.dataPosition() == b) {
            return new SetResourceParentsRequest(i, driveId, list);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public SetResourceParentsRequest[] m7617a(int i) {
        return new SetResourceParentsRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7616a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7617a(i);
    }
}
