package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.ChangesAvailableOptions;

public class C1646a implements Creator<AddEventListenerRequest> {
    static void m7573a(AddEventListenerRequest addEventListenerRequest, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, addEventListenerRequest.f5090a);
        C1295b.m6501a(parcel, 2, addEventListenerRequest.f5091b, i, false);
        C1295b.m6496a(parcel, 3, addEventListenerRequest.f5092c);
        C1295b.m6501a(parcel, 4, addEventListenerRequest.f5093d, i, false);
        C1295b.m6494a(parcel, a);
    }

    public AddEventListenerRequest m7574a(Parcel parcel) {
        ChangesAvailableOptions changesAvailableOptions = null;
        int i = 0;
        int b = C1294a.m6465b(parcel);
        DriveId driveId = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int i3;
            DriveId driveId2;
            int e;
            ChangesAvailableOptions changesAvailableOptions2;
            int a = C1294a.m6460a(parcel);
            ChangesAvailableOptions changesAvailableOptions3;
            switch (C1294a.m6459a(a)) {
                case 1:
                    changesAvailableOptions3 = changesAvailableOptions;
                    i3 = i;
                    driveId2 = driveId;
                    e = C1294a.m6471e(parcel, a);
                    changesAvailableOptions2 = changesAvailableOptions3;
                    break;
                case 2:
                    e = i2;
                    int i4 = i;
                    driveId2 = (DriveId) C1294a.m6462a(parcel, a, DriveId.CREATOR);
                    changesAvailableOptions2 = changesAvailableOptions;
                    i3 = i4;
                    break;
                case 3:
                    driveId2 = driveId;
                    e = i2;
                    changesAvailableOptions3 = changesAvailableOptions;
                    i3 = C1294a.m6471e(parcel, a);
                    changesAvailableOptions2 = changesAvailableOptions3;
                    break;
                case 4:
                    changesAvailableOptions2 = (ChangesAvailableOptions) C1294a.m6462a(parcel, a, ChangesAvailableOptions.CREATOR);
                    i3 = i;
                    driveId2 = driveId;
                    e = i2;
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    changesAvailableOptions2 = changesAvailableOptions;
                    i3 = i;
                    driveId2 = driveId;
                    e = i2;
                    break;
            }
            i2 = e;
            driveId = driveId2;
            i = i3;
            changesAvailableOptions = changesAvailableOptions2;
        }
        if (parcel.dataPosition() == b) {
            return new AddEventListenerRequest(i2, driveId, i, changesAvailableOptions);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public AddEventListenerRequest[] m7575a(int i) {
        return new AddEventListenerRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7574a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7575a(i);
    }
}
