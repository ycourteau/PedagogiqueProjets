package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1672u implements Creator<OnDownloadProgressResponse> {
    static void m7854a(OnDownloadProgressResponse onDownloadProgressResponse, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, onDownloadProgressResponse.f5191a);
        C1295b.m6497a(parcel, 2, onDownloadProgressResponse.f5192b);
        C1295b.m6497a(parcel, 3, onDownloadProgressResponse.f5193c);
        C1295b.m6494a(parcel, a);
    }

    public OnDownloadProgressResponse m7855a(Parcel parcel) {
        long j = 0;
        int b = C1294a.m6465b(parcel);
        int i = 0;
        long j2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    j2 = C1294a.m6473g(parcel, a);
                    break;
                case 3:
                    j = C1294a.m6473g(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new OnDownloadProgressResponse(i, j2, j);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public OnDownloadProgressResponse[] m7856a(int i) {
        return new OnDownloadProgressResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7855a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7856a(i);
    }
}
