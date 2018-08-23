package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.appdatasearch.RegisterSectionInfo.C0785a;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class DocumentSection implements SafeParcelable {
    public static final C0791d CREATOR = new C0791d();
    public static final int f2274a = Integer.parseInt("-1");
    private static final RegisterSectionInfo f2275g = new C0785a("SsbContext").m3719a(true).m3718a("blob").m3720a();
    final int f2276b;
    public final String f2277c;
    final RegisterSectionInfo f2278d;
    public final int f2279e;
    public final byte[] f2280f;

    DocumentSection(int i, String str, RegisterSectionInfo registerSectionInfo, int i2, byte[] bArr) {
        boolean z = i2 == f2274a || C0795h.m3745a(i2) != null;
        C1305x.m6626b(z, "Invalid section type " + i2);
        this.f2276b = i;
        this.f2277c = str;
        this.f2278d = registerSectionInfo;
        this.f2279e = i2;
        this.f2280f = bArr;
        String b = m3665b();
        if (b != null) {
            throw new IllegalArgumentException(b);
        }
    }

    public RegisterSectionInfo m3664a() {
        return this.f2278d;
    }

    public String m3665b() {
        return (this.f2279e == f2274a || C0795h.m3745a(this.f2279e) != null) ? (this.f2277c == null || this.f2280f == null) ? null : "Both content and blobContent set" : "Invalid section type " + this.f2279e;
    }

    public int describeContents() {
        C0791d c0791d = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0791d c0791d = CREATOR;
        C0791d.m3733a(this, parcel, i);
    }
}
