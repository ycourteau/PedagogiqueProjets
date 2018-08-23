package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.internal.C0618p;
import com.google.android.gms.ads.p027f.C0487a;
import com.google.android.gms.p028c.fn;
import com.google.p016a.p018a.p020a.C0439a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@fn
public class C0520j {
    public static final C0520j f1437a = new C0520j();

    protected C0520j() {
    }

    public static C0520j m2389a() {
        return f1437a;
    }

    public AdRequestParcel m2390a(Context context, aa aaVar) {
        Date a = aaVar.m2306a();
        long time = a != null ? a.getTime() : -1;
        String b = aaVar.m2308b();
        int c = aaVar.m2309c();
        Collection d = aaVar.m2310d();
        List unmodifiableList = !d.isEmpty() ? Collections.unmodifiableList(new ArrayList(d)) : null;
        boolean a2 = aaVar.m2307a(context);
        int l = aaVar.m2318l();
        Location e = aaVar.m2311e();
        Bundle a3 = aaVar.m2305a(C0439a.class);
        boolean f = aaVar.m2312f();
        String g = aaVar.m2313g();
        C0487a i = aaVar.m2315i();
        SearchAdRequestParcel searchAdRequestParcel = i != null ? new SearchAdRequestParcel(i) : null;
        String str = null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            str = C0618p.m2796e().m4847a(Thread.currentThread().getStackTrace(), applicationContext.getPackageName());
        }
        return new AdRequestParcel(6, time, a3, c, unmodifiableList, a2, l, f, g, searchAdRequestParcel, e, b, aaVar.m2317k(), aaVar.m2319m(), Collections.unmodifiableList(new ArrayList(aaVar.m2320n())), aaVar.m2314h(), str);
    }
}
