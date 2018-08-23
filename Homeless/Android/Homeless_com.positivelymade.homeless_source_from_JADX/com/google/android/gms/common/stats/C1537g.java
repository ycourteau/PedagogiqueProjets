package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import java.util.List;

public class C1537g implements Creator<WakeLockEvent> {
    static void m6972a(WakeLockEvent wakeLockEvent, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, wakeLockEvent.f4574a);
        C1295b.m6497a(parcel, 2, wakeLockEvent.m6942a());
        C1295b.m6505a(parcel, 4, wakeLockEvent.m6944c(), false);
        C1295b.m6496a(parcel, 5, wakeLockEvent.m6946e());
        C1295b.m6506a(parcel, 6, wakeLockEvent.m6947f(), false);
        C1295b.m6497a(parcel, 8, wakeLockEvent.m6949h());
        C1295b.m6505a(parcel, 10, wakeLockEvent.m6945d(), false);
        C1295b.m6496a(parcel, 11, wakeLockEvent.m6943b());
        C1295b.m6505a(parcel, 12, wakeLockEvent.m6948g(), false);
        C1295b.m6505a(parcel, 13, wakeLockEvent.m6951j(), false);
        C1295b.m6496a(parcel, 14, wakeLockEvent.m6950i());
        C1295b.m6495a(parcel, 15, wakeLockEvent.m6952k());
        C1295b.m6494a(parcel, a);
    }

    public WakeLockEvent m6973a(Parcel parcel) {
        int b = C1294a.m6465b(parcel);
        int i = 0;
        long j = 0;
        int i2 = 0;
        String str = null;
        int i3 = 0;
        List list = null;
        String str2 = null;
        long j2 = 0;
        int i4 = 0;
        String str3 = null;
        String str4 = null;
        float f = 0.0f;
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
                    i3 = C1294a.m6471e(parcel, a);
                    break;
                case 6:
                    list = C1294a.m6491y(parcel, a);
                    break;
                case 8:
                    j2 = C1294a.m6473g(parcel, a);
                    break;
                case 10:
                    str3 = C1294a.m6479m(parcel, a);
                    break;
                case 11:
                    i2 = C1294a.m6471e(parcel, a);
                    break;
                case 12:
                    str2 = C1294a.m6479m(parcel, a);
                    break;
                case 13:
                    str4 = C1294a.m6479m(parcel, a);
                    break;
                case 14:
                    i4 = C1294a.m6471e(parcel, a);
                    break;
                case 15:
                    f = C1294a.m6476j(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new WakeLockEvent(i, j, i2, str, i3, list, str2, j2, i4, str3, str4, f);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public WakeLockEvent[] m6974a(int i) {
        return new WakeLockEvent[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m6973a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m6974a(i);
    }
}
