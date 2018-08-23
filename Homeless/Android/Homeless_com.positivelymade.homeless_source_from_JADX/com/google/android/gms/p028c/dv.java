package com.google.android.gms.p028c;

import com.google.android.gms.ads.C0489f;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.p016a.C0450a.C0421a;
import com.google.p016a.C0451b;
import com.google.p016a.p018a.C0440b;
import java.util.Date;
import java.util.HashSet;

@fn
public final class dv {
    public static C0421a m4419a(int i) {
        switch (i) {
            case 1:
                return C0421a.MALE;
            case 2:
                return C0421a.FEMALE;
            default:
                return C0421a.UNKNOWN;
        }
    }

    public static C0440b m4420a(AdRequestParcel adRequestParcel) {
        return new C0440b(new Date(adRequestParcel.f1331b), dv.m4419a(adRequestParcel.f1333d), adRequestParcel.f1334e != null ? new HashSet(adRequestParcel.f1334e) : null, adRequestParcel.f1335f, adRequestParcel.f1340k);
    }

    public static C0451b m4421a(AdSizeParcel adSizeParcel) {
        int i = 0;
        C0451b[] c0451bArr = new C0451b[]{C0451b.f1236a, C0451b.f1237b, C0451b.f1238c, C0451b.f1239d, C0451b.f1240e, C0451b.f1241f};
        while (i < c0451bArr.length) {
            if (c0451bArr[i].m2043a() == adSizeParcel.f1352f && c0451bArr[i].m2044b() == adSizeParcel.f1349c) {
                return c0451bArr[i];
            }
            i++;
        }
        return new C0451b(C0489f.m2164a(adSizeParcel.f1352f, adSizeParcel.f1349c, adSizeParcel.f1348b));
    }
}
