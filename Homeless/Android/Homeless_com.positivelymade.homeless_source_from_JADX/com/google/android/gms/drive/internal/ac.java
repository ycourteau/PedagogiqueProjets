package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class ac implements Creator<OnMetadataResponse> {
    static void m7582a(OnMetadataResponse onMetadataResponse, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, onMetadataResponse.f5214a);
        C1295b.m6501a(parcel, 2, onMetadataResponse.f5215b, i, false);
        C1295b.m6494a(parcel, a);
    }

    public OnMetadataResponse m7583a(Parcel parcel) {
        int b = C1294a.m6465b(parcel);
        int i = 0;
        MetadataBundle metadataBundle = null;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    metadataBundle = (MetadataBundle) C1294a.m6462a(parcel, a, MetadataBundle.CREATOR);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new OnMetadataResponse(i, metadataBundle);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public OnMetadataResponse[] m7584a(int i) {
        return new OnMetadataResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7583a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7584a(i);
    }
}
