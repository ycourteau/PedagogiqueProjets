package com.google.android.gms.ads.internal.request;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C0526n;
import com.google.android.gms.ads.internal.request.C0648d.C0649a;
import com.google.android.gms.ads.internal.request.C0648d.C0652b;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.common.C1241e;
import com.google.android.gms.p028c.az;
import com.google.android.gms.p028c.fn;
import com.google.android.gms.p028c.gk;

@fn
public final class C0647c {

    public interface C0643a {
        void mo499a(AdResponseParcel adResponseParcel);
    }

    interface C0645b {
        boolean mo500a(AdRequestInfoParcel adRequestInfoParcel);
    }

    public static gk m2924a(final Context context, AdRequestInfoParcel adRequestInfoParcel, C0643a c0643a) {
        return C0647c.m2925a(context, adRequestInfoParcel, c0643a, new C0645b() {
            public boolean mo500a(AdRequestInfoParcel adRequestInfoParcel) {
                return adRequestInfoParcel.f1847k.f1979e || (C1241e.m6292g(context) && !((Boolean) az.f2450B.m3878c()).booleanValue());
            }
        });
    }

    static gk m2925a(Context context, AdRequestInfoParcel adRequestInfoParcel, C0643a c0643a, C0645b c0645b) {
        return c0645b.mo500a(adRequestInfoParcel) ? C0647c.m2926b(context, adRequestInfoParcel, c0643a) : C0647c.m2927c(context, adRequestInfoParcel, c0643a);
    }

    private static gk m2926b(Context context, AdRequestInfoParcel adRequestInfoParcel, C0643a c0643a) {
        C0691b.m3093a("Fetching ad response from local ad request service.");
        gk c0649a = new C0649a(context, adRequestInfoParcel, c0643a);
        c0649a.m2829g();
        return c0649a;
    }

    private static gk m2927c(Context context, AdRequestInfoParcel adRequestInfoParcel, C0643a c0643a) {
        C0691b.m3093a("Fetching ad response from remote ad request service.");
        if (C0526n.m2400a().m3089b(context)) {
            return new C0652b(context, adRequestInfoParcel, c0643a);
        }
        C0691b.m3103e("Failed to connect to remote ad request service.");
        return null;
    }
}
