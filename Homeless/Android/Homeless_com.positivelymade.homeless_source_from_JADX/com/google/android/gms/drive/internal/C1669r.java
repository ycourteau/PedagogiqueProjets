package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.drive.ChangeSequenceNumber;
import com.google.android.gms.drive.DriveId;
import java.util.List;

public class C1669r implements Creator<OnChangesResponse> {
    static void m7845a(OnChangesResponse onChangesResponse, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, onChangesResponse.f5181a);
        C1295b.m6501a(parcel, 2, onChangesResponse.f5182b, i, false);
        C1295b.m6515b(parcel, 3, onChangesResponse.f5183c, false);
        C1295b.m6501a(parcel, 4, onChangesResponse.f5184d, i, false);
        C1295b.m6507a(parcel, 5, onChangesResponse.f5185e);
        C1295b.m6494a(parcel, a);
    }

    public OnChangesResponse m7846a(Parcel parcel) {
        boolean z = false;
        ChangeSequenceNumber changeSequenceNumber = null;
        int b = C1294a.m6465b(parcel);
        List list = null;
        DataHolder dataHolder = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    dataHolder = (DataHolder) C1294a.m6462a(parcel, a, DataHolder.CREATOR);
                    break;
                case 3:
                    list = C1294a.m6468c(parcel, a, DriveId.CREATOR);
                    break;
                case 4:
                    changeSequenceNumber = (ChangeSequenceNumber) C1294a.m6462a(parcel, a, ChangeSequenceNumber.CREATOR);
                    break;
                case 5:
                    z = C1294a.m6469c(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new OnChangesResponse(i, dataHolder, list, changeSequenceNumber, z);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public OnChangesResponse[] m7847a(int i) {
        return new OnChangesResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7846a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7847a(i);
    }
}
