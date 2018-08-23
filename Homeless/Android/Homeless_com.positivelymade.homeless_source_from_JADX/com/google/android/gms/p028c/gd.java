package com.google.android.gms.p028c;

import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.C0569g.C0563a;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

@fn
public class gd {
    public final AdRequestParcel f3266a;
    public final hg f3267b;
    public final List<String> f3268c;
    public final int f3269d;
    public final List<String> f3270e;
    public final List<String> f3271f;
    public final int f3272g;
    public final long f3273h;
    public final String f3274i;
    public final JSONObject f3275j;
    public final boolean f3276k;
    public final cz f3277l;
    public final dj f3278m;
    public final String f3279n;
    public final db f3280o;
    public final dd f3281p;
    public final long f3282q;
    public final AdSizeParcel f3283r;
    public final long f3284s;
    public final long f3285t;
    public final long f3286u;
    public final String f3287v;
    public final C0563a f3288w;
    public final String f3289x;

    @fn
    public static final class C0973a {
        public final AdRequestInfoParcel f3258a;
        public final AdResponseParcel f3259b;
        public final db f3260c;
        public final AdSizeParcel f3261d;
        public final int f3262e;
        public final long f3263f;
        public final long f3264g;
        public final JSONObject f3265h;

        public C0973a(AdRequestInfoParcel adRequestInfoParcel, AdResponseParcel adResponseParcel, db dbVar, AdSizeParcel adSizeParcel, int i, long j, long j2, JSONObject jSONObject) {
            this.f3258a = adRequestInfoParcel;
            this.f3259b = adResponseParcel;
            this.f3260c = dbVar;
            this.f3261d = adSizeParcel;
            this.f3262e = i;
            this.f3263f = j;
            this.f3264g = j2;
            this.f3265h = jSONObject;
        }
    }

    public gd(AdRequestParcel adRequestParcel, hg hgVar, List<String> list, int i, List<String> list2, List<String> list3, int i2, long j, String str, boolean z, cz czVar, dj djVar, String str2, db dbVar, dd ddVar, long j2, AdSizeParcel adSizeParcel, long j3, long j4, long j5, String str3, JSONObject jSONObject, C0563a c0563a, String str4) {
        this.f3266a = adRequestParcel;
        this.f3267b = hgVar;
        this.f3268c = list != null ? Collections.unmodifiableList(list) : null;
        this.f3269d = i;
        this.f3270e = list2 != null ? Collections.unmodifiableList(list2) : null;
        this.f3271f = list3 != null ? Collections.unmodifiableList(list3) : null;
        this.f3272g = i2;
        this.f3273h = j;
        this.f3274i = str;
        this.f3276k = z;
        this.f3277l = czVar;
        this.f3278m = djVar;
        this.f3279n = str2;
        this.f3280o = dbVar;
        this.f3281p = ddVar;
        this.f3282q = j2;
        this.f3283r = adSizeParcel;
        this.f3284s = j3;
        this.f3285t = j4;
        this.f3286u = j5;
        this.f3287v = str3;
        this.f3275j = jSONObject;
        this.f3288w = c0563a;
        this.f3289x = str4;
    }

    public gd(C0973a c0973a, hg hgVar, cz czVar, dj djVar, String str, dd ddVar, C0563a c0563a) {
        this(c0973a.f3258a.f1839c, hgVar, c0973a.f3259b.f1867d, c0973a.f3262e, c0973a.f3259b.f1869f, c0973a.f3259b.f1873j, c0973a.f3259b.f1875l, c0973a.f3259b.f1874k, c0973a.f3258a.f1845i, c0973a.f3259b.f1871h, czVar, djVar, str, c0973a.f3260c, ddVar, c0973a.f3259b.f1872i, c0973a.f3261d, c0973a.f3259b.f1870g, c0973a.f3263f, c0973a.f3264g, c0973a.f3259b.f1878o, c0973a.f3265h, c0563a, c0973a.f3258a.f1860x);
    }

    public boolean m4755a() {
        return (this.f3267b == null || this.f3267b.mo788i() == null) ? false : this.f3267b.mo788i().m5050b();
    }
}
