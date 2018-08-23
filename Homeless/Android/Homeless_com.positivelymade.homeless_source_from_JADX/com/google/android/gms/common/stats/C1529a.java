package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1529a implements Creator<ConnectionEvent> {
    static void m6953a(ConnectionEvent connectionEvent, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, connectionEvent.f4562a);
        C1295b.m6497a(parcel, 2, connectionEvent.m6932a());
        C1295b.m6505a(parcel, 4, connectionEvent.m6934c(), false);
        C1295b.m6505a(parcel, 5, connectionEvent.m6935d(), false);
        C1295b.m6505a(parcel, 6, connectionEvent.m6936e(), false);
        C1295b.m6505a(parcel, 7, connectionEvent.m6937f(), false);
        C1295b.m6505a(parcel, 8, connectionEvent.m6938g(), false);
        C1295b.m6497a(parcel, 10, connectionEvent.m6941j());
        C1295b.m6497a(parcel, 11, connectionEvent.m6940i());
        C1295b.m6496a(parcel, 12, connectionEvent.m6933b());
        C1295b.m6505a(parcel, 13, connectionEvent.m6939h(), false);
        C1295b.m6494a(parcel, a);
    }

    public ConnectionEvent m6954a(Parcel parcel) {
        int b = C1294a.m6465b(parcel);
        int i = 0;
        long j = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        long j2 = 0;
        long j3 = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    j = C1294a.m6473g(parcel, a);
                    break;
                case 4:
                    str = C1294a.m6479m(parcel, a);
                    break;
                case 5:
                    str2 = C1294a.m6479m(parcel, a);
                    break;
                case 6:
                    str3 = C1294a.m6479m(parcel, a);
                    break;
                case 7:
                    str4 = C1294a.m6479m(parcel, a);
                    break;
                case 8:
                    str5 = C1294a.m6479m(parcel, a);
                    break;
                case 10:
                    j2 = C1294a.m6473g(parcel, a);
                    break;
                case 11:
                    j3 = C1294a.m6473g(parcel, a);
                    break;
                case 12:
                    i2 = C1294a.m6471e(parcel, a);
                    break;
                case 13:
                    str6 = C1294a.m6479m(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ConnectionEvent(i, j, i2, str, str2, str3, str4, str5, str6, j2, j3);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public ConnectionEvent[] m6955a(int i) {
        return new ConnectionEvent[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m6954a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m6955a(i);
    }
}
