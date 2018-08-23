package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.drive.Contents;

public class C1670s implements Creator<OnContentsResponse> {
    static void m7848a(OnContentsResponse onContentsResponse, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, onContentsResponse.f5186a);
        C1295b.m6501a(parcel, 2, onContentsResponse.f5187b, i, false);
        C1295b.m6507a(parcel, 3, onContentsResponse.f5188c);
        C1295b.m6494a(parcel, a);
    }

    public OnContentsResponse m7849a(Parcel parcel) {
        boolean z = false;
        int b = C1294a.m6465b(parcel);
        Contents contents = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            Contents contents2;
            int e;
            boolean z2;
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    boolean z3 = z;
                    contents2 = contents;
                    e = C1294a.m6471e(parcel, a);
                    z2 = z3;
                    break;
                case 2:
                    e = i;
                    Contents contents3 = (Contents) C1294a.m6462a(parcel, a, Contents.CREATOR);
                    z2 = z;
                    contents2 = contents3;
                    break;
                case 3:
                    z2 = C1294a.m6469c(parcel, a);
                    contents2 = contents;
                    e = i;
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    z2 = z;
                    contents2 = contents;
                    e = i;
                    break;
            }
            i = e;
            contents = contents2;
            z = z2;
        }
        if (parcel.dataPosition() == b) {
            return new OnContentsResponse(i, contents, z);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public OnContentsResponse[] m7850a(int i) {
        return new OnContentsResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7849a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7850a(i);
    }
}
