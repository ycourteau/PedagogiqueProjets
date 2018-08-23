package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1677z implements Creator<OnFetchThumbnailResponse> {
    static void m7869a(OnFetchThumbnailResponse onFetchThumbnailResponse, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, onFetchThumbnailResponse.f5205a);
        C1295b.m6501a(parcel, 2, onFetchThumbnailResponse.f5206b, i, false);
        C1295b.m6494a(parcel, a);
    }

    public OnFetchThumbnailResponse m7870a(Parcel parcel) {
        int b = C1294a.m6465b(parcel);
        int i = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    parcelFileDescriptor = (ParcelFileDescriptor) C1294a.m6462a(parcel, a, ParcelFileDescriptor.CREATOR);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new OnFetchThumbnailResponse(i, parcelFileDescriptor);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public OnFetchThumbnailResponse[] m7871a(int i) {
        return new OnFetchThumbnailResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7870a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7871a(i);
    }
}
