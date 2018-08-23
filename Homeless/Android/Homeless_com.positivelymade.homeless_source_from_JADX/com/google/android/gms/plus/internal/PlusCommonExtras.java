package com.google.android.gms.plus.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.C1304w;
import com.google.android.gms.common.internal.safeparcel.C1296c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class PlusCommonExtras implements SafeParcelable {
    public static final C1897d CREATOR = new C1897d();
    private final int f5752a;
    private String f5753b;
    private String f5754c;

    public PlusCommonExtras() {
        this.f5752a = 1;
        this.f5753b = "";
        this.f5754c = "";
    }

    PlusCommonExtras(int i, String str, String str2) {
        this.f5752a = i;
        this.f5753b = str;
        this.f5754c = str2;
    }

    public int m9426a() {
        return this.f5752a;
    }

    public void m9427a(Bundle bundle) {
        bundle.putByteArray("android.gms.plus.internal.PlusCommonExtras.extraPlusCommon", C1296c.m6517a(this));
    }

    public String m9428b() {
        return this.f5753b;
    }

    public String m9429c() {
        return this.f5754c;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlusCommonExtras)) {
            return false;
        }
        PlusCommonExtras plusCommonExtras = (PlusCommonExtras) obj;
        return this.f5752a == plusCommonExtras.f5752a && C1304w.m6615a(this.f5753b, plusCommonExtras.f5753b) && C1304w.m6615a(this.f5754c, plusCommonExtras.f5754c);
    }

    public int hashCode() {
        return C1304w.m6613a(Integer.valueOf(this.f5752a), this.f5753b, this.f5754c);
    }

    public String toString() {
        return C1304w.m6614a((Object) this).m6612a("versionCode", Integer.valueOf(this.f5752a)).m6612a("Gpsrc", this.f5753b).m6612a("ClientCallingPackage", this.f5754c).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1897d.m9517a(this, parcel, i);
    }
}
