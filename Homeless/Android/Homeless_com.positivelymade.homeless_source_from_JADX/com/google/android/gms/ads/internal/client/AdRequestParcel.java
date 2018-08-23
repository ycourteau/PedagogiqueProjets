package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.C1304w;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.p028c.fn;
import java.util.List;

@fn
public final class AdRequestParcel implements SafeParcelable {
    public static final C0519i CREATOR = new C0519i();
    public final int f1330a;
    public final long f1331b;
    public final Bundle f1332c;
    public final int f1333d;
    public final List<String> f1334e;
    public final boolean f1335f;
    public final int f1336g;
    public final boolean f1337h;
    public final String f1338i;
    public final SearchAdRequestParcel f1339j;
    public final Location f1340k;
    public final String f1341l;
    public final Bundle f1342m;
    public final Bundle f1343n;
    public final List<String> f1344o;
    public final String f1345p;
    public final String f1346q;

    public AdRequestParcel(int i, long j, Bundle bundle, int i2, List<String> list, boolean z, int i3, boolean z2, String str, SearchAdRequestParcel searchAdRequestParcel, Location location, String str2, Bundle bundle2, Bundle bundle3, List<String> list2, String str3, String str4) {
        this.f1330a = i;
        this.f1331b = j;
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.f1332c = bundle;
        this.f1333d = i2;
        this.f1334e = list;
        this.f1335f = z;
        this.f1336g = i3;
        this.f1337h = z2;
        this.f1338i = str;
        this.f1339j = searchAdRequestParcel;
        this.f1340k = location;
        this.f1341l = str2;
        this.f1342m = bundle2;
        this.f1343n = bundle3;
        this.f1344o = list2;
        this.f1345p = str3;
        this.f1346q = str4;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AdRequestParcel)) {
            return false;
        }
        AdRequestParcel adRequestParcel = (AdRequestParcel) obj;
        return this.f1330a == adRequestParcel.f1330a && this.f1331b == adRequestParcel.f1331b && C1304w.m6615a(this.f1332c, adRequestParcel.f1332c) && this.f1333d == adRequestParcel.f1333d && C1304w.m6615a(this.f1334e, adRequestParcel.f1334e) && this.f1335f == adRequestParcel.f1335f && this.f1336g == adRequestParcel.f1336g && this.f1337h == adRequestParcel.f1337h && C1304w.m6615a(this.f1338i, adRequestParcel.f1338i) && C1304w.m6615a(this.f1339j, adRequestParcel.f1339j) && C1304w.m6615a(this.f1340k, adRequestParcel.f1340k) && C1304w.m6615a(this.f1341l, adRequestParcel.f1341l) && C1304w.m6615a(this.f1342m, adRequestParcel.f1342m) && C1304w.m6615a(this.f1343n, adRequestParcel.f1343n) && C1304w.m6615a(this.f1344o, adRequestParcel.f1344o) && C1304w.m6615a(this.f1345p, adRequestParcel.f1345p) && C1304w.m6615a(this.f1346q, adRequestParcel.f1346q);
    }

    public int hashCode() {
        return C1304w.m6613a(Integer.valueOf(this.f1330a), Long.valueOf(this.f1331b), this.f1332c, Integer.valueOf(this.f1333d), this.f1334e, Boolean.valueOf(this.f1335f), Integer.valueOf(this.f1336g), Boolean.valueOf(this.f1337h), this.f1338i, this.f1339j, this.f1340k, this.f1341l, this.f1342m, this.f1343n, this.f1344o, this.f1345p, this.f1346q);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0519i.m2386a(this, parcel, i);
    }
}
