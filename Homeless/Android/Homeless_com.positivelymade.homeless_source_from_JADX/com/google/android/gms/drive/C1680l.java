package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import java.util.List;

public class C1680l implements Creator<RealtimeDocumentSyncRequest> {
    static void m7878a(RealtimeDocumentSyncRequest realtimeDocumentSyncRequest, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, realtimeDocumentSyncRequest.f5041a);
        C1295b.m6506a(parcel, 2, realtimeDocumentSyncRequest.f5042b, false);
        C1295b.m6506a(parcel, 3, realtimeDocumentSyncRequest.f5043c, false);
        C1295b.m6494a(parcel, a);
    }

    public RealtimeDocumentSyncRequest m7879a(Parcel parcel) {
        List list = null;
        int b = C1294a.m6465b(parcel);
        int i = 0;
        List list2 = null;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    list2 = C1294a.m6491y(parcel, a);
                    break;
                case 3:
                    list = C1294a.m6491y(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new RealtimeDocumentSyncRequest(i, list2, list);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public RealtimeDocumentSyncRequest[] m7880a(int i) {
        return new RealtimeDocumentSyncRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7879a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7880a(i);
    }
}
