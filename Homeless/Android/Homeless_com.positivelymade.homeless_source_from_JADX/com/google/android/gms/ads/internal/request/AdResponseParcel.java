package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.p028c.fn;
import java.util.Collections;
import java.util.List;

@fn
public final class AdResponseParcel implements SafeParcelable {
    public static final C0661h CREATOR = new C0661h();
    private AdRequestInfoParcel f1863A;
    public final int f1864a;
    public final String f1865b;
    public String f1866c;
    public final List<String> f1867d;
    public final int f1868e;
    public final List<String> f1869f;
    public final long f1870g;
    public final boolean f1871h;
    public final long f1872i;
    public final List<String> f1873j;
    public final long f1874k;
    public final int f1875l;
    public final String f1876m;
    public final long f1877n;
    public final String f1878o;
    public final boolean f1879p;
    public final String f1880q;
    public final String f1881r;
    public final boolean f1882s;
    public final boolean f1883t;
    public final boolean f1884u;
    public final boolean f1885v;
    public final boolean f1886w;
    public final int f1887x;
    public LargeParcelTeleporter f1888y;
    public String f1889z;

    public AdResponseParcel(int i) {
        this(13, null, null, null, i, null, -1, false, -1, null, -1, -1, null, -1, null, false, null, null, false, false, false, true, false, 0, null, null);
    }

    public AdResponseParcel(int i, long j) {
        this(13, null, null, null, i, null, -1, false, -1, null, j, -1, null, -1, null, false, null, null, false, false, false, true, false, 0, null, null);
    }

    AdResponseParcel(int i, String str, String str2, List<String> list, int i2, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i3, String str3, long j4, String str4, boolean z2, String str5, String str6, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i4, LargeParcelTeleporter largeParcelTeleporter, String str7) {
        this.f1864a = i;
        this.f1865b = str;
        this.f1866c = str2;
        this.f1867d = list != null ? Collections.unmodifiableList(list) : null;
        this.f1868e = i2;
        this.f1869f = list2 != null ? Collections.unmodifiableList(list2) : null;
        this.f1870g = j;
        this.f1871h = z;
        this.f1872i = j2;
        this.f1873j = list3 != null ? Collections.unmodifiableList(list3) : null;
        this.f1874k = j3;
        this.f1875l = i3;
        this.f1876m = str3;
        this.f1877n = j4;
        this.f1878o = str4;
        this.f1879p = z2;
        this.f1880q = str5;
        this.f1881r = str6;
        this.f1882s = z3;
        this.f1883t = z4;
        this.f1884u = z5;
        this.f1885v = z6;
        this.f1886w = z7;
        this.f1887x = i4;
        this.f1888y = largeParcelTeleporter;
        this.f1889z = str7;
        if (this.f1866c == null && this.f1888y != null) {
            StringParcel stringParcel = (StringParcel) this.f1888y.m2908a(StringParcel.CREATOR);
            if (stringParcel != null && !TextUtils.isEmpty(stringParcel.m2909a())) {
                this.f1866c = stringParcel.m2909a();
            }
        }
    }

    public AdResponseParcel(AdRequestInfoParcel adRequestInfoParcel, String str, String str2, List<String> list, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i, String str3, long j4, String str4, String str5, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i2) {
        this(13, str, str2, list, -2, list2, j, z, j2, list3, j3, i, str3, j4, str4, false, null, str5, z2, z3, z4, z5, z6, i2, null, null);
        this.f1863A = adRequestInfoParcel;
    }

    public AdResponseParcel(AdRequestInfoParcel adRequestInfoParcel, String str, String str2, List<String> list, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i, String str3, long j4, String str4, boolean z2, String str5, String str6, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i2) {
        this(13, str, str2, list, -2, list2, j, z, j2, list3, j3, i, str3, j4, str4, z2, str5, str6, z3, z4, z5, z6, z7, i2, null, null);
        this.f1863A = adRequestInfoParcel;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (!(this.f1863A == null || this.f1863A.f1837a < 9 || TextUtils.isEmpty(this.f1866c))) {
            this.f1888y = new LargeParcelTeleporter(new StringParcel(this.f1866c));
            this.f1866c = null;
        }
        C0661h.m3008a(this, parcel, i);
    }
}
