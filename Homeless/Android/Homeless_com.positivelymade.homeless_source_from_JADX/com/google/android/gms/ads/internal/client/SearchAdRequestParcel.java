package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.ads.p027f.C0487a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.p028c.fn;

@fn
public final class SearchAdRequestParcel implements SafeParcelable {
    public static final C0510d CREATOR = new C0510d();
    public final int f1359a;
    public final int f1360b;
    public final int f1361c;
    public final int f1362d;
    public final int f1363e;
    public final int f1364f;
    public final int f1365g;
    public final int f1366h;
    public final int f1367i;
    public final String f1368j;
    public final int f1369k;
    public final String f1370l;
    public final int f1371m;
    public final int f1372n;
    public final String f1373o;

    SearchAdRequestParcel(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, String str, int i10, String str2, int i11, int i12, String str3) {
        this.f1359a = i;
        this.f1360b = i2;
        this.f1361c = i3;
        this.f1362d = i4;
        this.f1363e = i5;
        this.f1364f = i6;
        this.f1365g = i7;
        this.f1366h = i8;
        this.f1367i = i9;
        this.f1368j = str;
        this.f1369k = i10;
        this.f1370l = str2;
        this.f1371m = i11;
        this.f1372n = i12;
        this.f1373o = str3;
    }

    public SearchAdRequestParcel(C0487a c0487a) {
        this.f1359a = 1;
        this.f1360b = c0487a.m2150a();
        this.f1361c = c0487a.m2151b();
        this.f1362d = c0487a.m2152c();
        this.f1363e = c0487a.m2153d();
        this.f1364f = c0487a.m2154e();
        this.f1365g = c0487a.m2155f();
        this.f1366h = c0487a.m2156g();
        this.f1367i = c0487a.m2157h();
        this.f1368j = c0487a.m2158i();
        this.f1369k = c0487a.m2159j();
        this.f1370l = c0487a.m2160k();
        this.f1371m = c0487a.m2161l();
        this.f1372n = c0487a.m2162m();
        this.f1373o = c0487a.m2163n();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0510d.m2360a(this, parcel, i);
    }
}
