package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.appdatasearch.GetRecentContextCall.Response;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import java.util.List;

public class C0794g implements Creator<Response> {
    static void m3742a(Response response, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1000, response.f2298d);
        C1295b.m6501a(parcel, 1, response.f2295a, i, false);
        C1295b.m6515b(parcel, 2, response.f2296b, false);
        C1295b.m6511a(parcel, 3, response.f2297c, false);
        C1295b.m6494a(parcel, a);
    }

    public Response m3743a(Parcel parcel) {
        String[] strArr = null;
        int b = C1294a.m6465b(parcel);
        int i = 0;
        List list = null;
        Status status = null;
        while (parcel.dataPosition() < b) {
            int i2;
            Status status2;
            String[] strArr2;
            List list2;
            int a = C1294a.m6460a(parcel);
            String[] strArr3;
            switch (C1294a.m6459a(a)) {
                case 1:
                    i2 = i;
                    List list3 = list;
                    status2 = (Status) C1294a.m6462a(parcel, a, Status.CREATOR);
                    strArr2 = strArr;
                    list2 = list3;
                    break;
                case 2:
                    status2 = status;
                    i2 = i;
                    strArr3 = strArr;
                    Object c = C1294a.m6468c(parcel, a, UsageInfo.CREATOR);
                    strArr2 = strArr3;
                    break;
                case 3:
                    strArr2 = C1294a.m6490x(parcel, a);
                    list2 = list;
                    status2 = status;
                    i2 = i;
                    break;
                case 1000:
                    strArr3 = strArr;
                    list2 = list;
                    status2 = status;
                    i2 = C1294a.m6471e(parcel, a);
                    strArr2 = strArr3;
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    strArr2 = strArr;
                    list2 = list;
                    status2 = status;
                    i2 = i;
                    break;
            }
            i = i2;
            status = status2;
            list = list2;
            strArr = strArr2;
        }
        if (parcel.dataPosition() == b) {
            return new Response(i, status, list, strArr);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public Response[] m3744a(int i) {
        return new Response[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m3743a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m3744a(i);
    }
}
