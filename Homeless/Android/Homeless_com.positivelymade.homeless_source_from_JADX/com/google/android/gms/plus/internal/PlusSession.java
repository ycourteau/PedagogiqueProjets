package com.google.android.gms.plus.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.C1304w;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

public class PlusSession implements SafeParcelable {
    public static final C1898e CREATOR = new C1898e();
    private final int f5755a;
    private final String f5756b;
    private final String[] f5757c;
    private final String[] f5758d;
    private final String[] f5759e;
    private final String f5760f;
    private final String f5761g;
    private final String f5762h;
    private final String f5763i;
    private final PlusCommonExtras f5764j;

    PlusSession(int i, String str, String[] strArr, String[] strArr2, String[] strArr3, String str2, String str3, String str4, String str5, PlusCommonExtras plusCommonExtras) {
        this.f5755a = i;
        this.f5756b = str;
        this.f5757c = strArr;
        this.f5758d = strArr2;
        this.f5759e = strArr3;
        this.f5760f = str2;
        this.f5761g = str3;
        this.f5762h = str4;
        this.f5763i = str5;
        this.f5764j = plusCommonExtras;
    }

    public PlusSession(String str, String[] strArr, String[] strArr2, String[] strArr3, String str2, String str3, String str4, PlusCommonExtras plusCommonExtras) {
        this.f5755a = 1;
        this.f5756b = str;
        this.f5757c = strArr;
        this.f5758d = strArr2;
        this.f5759e = strArr3;
        this.f5760f = str2;
        this.f5761g = str3;
        this.f5762h = str4;
        this.f5763i = null;
        this.f5764j = plusCommonExtras;
    }

    public int m9430a() {
        return this.f5755a;
    }

    public String m9431b() {
        return this.f5756b;
    }

    public String[] m9432c() {
        return this.f5757c;
    }

    public String[] m9433d() {
        return this.f5758d;
    }

    public int describeContents() {
        return 0;
    }

    public String[] m9434e() {
        return this.f5759e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlusSession)) {
            return false;
        }
        PlusSession plusSession = (PlusSession) obj;
        return this.f5755a == plusSession.f5755a && C1304w.m6615a(this.f5756b, plusSession.f5756b) && Arrays.equals(this.f5757c, plusSession.f5757c) && Arrays.equals(this.f5758d, plusSession.f5758d) && Arrays.equals(this.f5759e, plusSession.f5759e) && C1304w.m6615a(this.f5760f, plusSession.f5760f) && C1304w.m6615a(this.f5761g, plusSession.f5761g) && C1304w.m6615a(this.f5762h, plusSession.f5762h) && C1304w.m6615a(this.f5763i, plusSession.f5763i) && C1304w.m6615a(this.f5764j, plusSession.f5764j);
    }

    public String m9435f() {
        return this.f5760f;
    }

    public String m9436g() {
        return this.f5761g;
    }

    public String m9437h() {
        return this.f5762h;
    }

    public int hashCode() {
        return C1304w.m6613a(Integer.valueOf(this.f5755a), this.f5756b, this.f5757c, this.f5758d, this.f5759e, this.f5760f, this.f5761g, this.f5762h, this.f5763i, this.f5764j);
    }

    public String m9438i() {
        return this.f5763i;
    }

    public PlusCommonExtras m9439j() {
        return this.f5764j;
    }

    public Bundle m9440k() {
        Bundle bundle = new Bundle();
        bundle.setClassLoader(PlusCommonExtras.class.getClassLoader());
        this.f5764j.m9427a(bundle);
        return bundle;
    }

    public String toString() {
        return C1304w.m6614a((Object) this).m6612a("versionCode", Integer.valueOf(this.f5755a)).m6612a("accountName", this.f5756b).m6612a("requestedScopes", this.f5757c).m6612a("visibleActivities", this.f5758d).m6612a("requiredFeatures", this.f5759e).m6612a("packageNameForAuth", this.f5760f).m6612a("callingPackageName", this.f5761g).m6612a("applicationName", this.f5762h).m6612a("extra", this.f5764j.toString()).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1898e.m9520a(this, parcel, i);
    }
}
