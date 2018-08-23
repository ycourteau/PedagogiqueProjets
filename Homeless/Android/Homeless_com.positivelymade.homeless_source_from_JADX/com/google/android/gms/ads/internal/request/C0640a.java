package com.google.android.gms.ads.internal.request;

import android.content.Context;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel.C0638a;
import com.google.android.gms.p028c.C1141o;
import com.google.android.gms.p028c.fn;
import com.google.android.gms.p028c.gd.C0973a;
import com.google.android.gms.p028c.gk;

@fn
public class C0640a {

    public interface C0493a {
        void mo348a(C0973a c0973a);
    }

    public gk m2910a(Context context, C0638a c0638a, C1141o c1141o, C0493a c0493a) {
        gk c0679m = c0638a.f1806b.f1332c.getBundle("sdk_less_server_data") != null ? new C0679m(context, c0638a, c0493a) : new C0644b(context, c0638a, c1141o, c0493a);
        c0679m.m2830h();
        return c0679m;
    }
}
