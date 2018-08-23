package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.drive.DriveId;
import java.util.List;

public class C1666o implements Creator<LoadRealtimeRequest> {
    static void m7836a(LoadRealtimeRequest loadRealtimeRequest, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, loadRealtimeRequest.f5174a);
        C1295b.m6501a(parcel, 2, loadRealtimeRequest.f5175b, i, false);
        C1295b.m6507a(parcel, 3, loadRealtimeRequest.f5176c);
        C1295b.m6506a(parcel, 4, loadRealtimeRequest.f5177d, false);
        C1295b.m6507a(parcel, 5, loadRealtimeRequest.f5178e);
        C1295b.m6501a(parcel, 6, loadRealtimeRequest.f5179f, i, false);
        C1295b.m6505a(parcel, 7, loadRealtimeRequest.f5180g, false);
        C1295b.m6494a(parcel, a);
    }

    public LoadRealtimeRequest m7837a(Parcel parcel) {
        boolean z = false;
        String str = null;
        int b = C1294a.m6465b(parcel);
        DataHolder dataHolder = null;
        List list = null;
        boolean z2 = false;
        DriveId driveId = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    driveId = (DriveId) C1294a.m6462a(parcel, a, DriveId.CREATOR);
                    break;
                case 3:
                    z2 = C1294a.m6469c(parcel, a);
                    break;
                case 4:
                    list = C1294a.m6491y(parcel, a);
                    break;
                case 5:
                    z = C1294a.m6469c(parcel, a);
                    break;
                case 6:
                    dataHolder = (DataHolder) C1294a.m6462a(parcel, a, DataHolder.CREATOR);
                    break;
                case 7:
                    str = C1294a.m6479m(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new LoadRealtimeRequest(i, driveId, z2, list, z, dataHolder, str);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public LoadRealtimeRequest[] m7838a(int i) {
        return new LoadRealtimeRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7837a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7838a(i);
    }
}
