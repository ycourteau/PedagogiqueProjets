package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.query.internal.FilterHolder;

public class ah implements Creator<OpenFileIntentSenderRequest> {
    static void m7597a(OpenFileIntentSenderRequest openFileIntentSenderRequest, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, openFileIntentSenderRequest.f5224a);
        C1295b.m6505a(parcel, 2, openFileIntentSenderRequest.f5225b, false);
        C1295b.m6511a(parcel, 3, openFileIntentSenderRequest.f5226c, false);
        C1295b.m6501a(parcel, 4, openFileIntentSenderRequest.f5227d, i, false);
        C1295b.m6501a(parcel, 5, openFileIntentSenderRequest.f5228e, i, false);
        C1295b.m6494a(parcel, a);
    }

    public OpenFileIntentSenderRequest m7598a(Parcel parcel) {
        FilterHolder filterHolder = null;
        int b = C1294a.m6465b(parcel);
        int i = 0;
        DriveId driveId = null;
        String[] strArr = null;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    str = C1294a.m6479m(parcel, a);
                    break;
                case 3:
                    strArr = C1294a.m6490x(parcel, a);
                    break;
                case 4:
                    driveId = (DriveId) C1294a.m6462a(parcel, a, DriveId.CREATOR);
                    break;
                case 5:
                    filterHolder = (FilterHolder) C1294a.m6462a(parcel, a, FilterHolder.CREATOR);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new OpenFileIntentSenderRequest(i, str, strArr, driveId, filterHolder);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public OpenFileIntentSenderRequest[] m7599a(int i) {
        return new OpenFileIntentSenderRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7598a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7599a(i);
    }
}
