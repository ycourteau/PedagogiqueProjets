package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.ads.internal.C0576j;
import com.google.android.gms.ads.internal.client.C0535s.C0537a;
import com.google.android.gms.ads.internal.client.C0538t.C0540a;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.p028c.dh;
import com.google.android.gms.p028c.fn;
import com.google.android.gms.p029b.C0507c;
import com.google.android.gms.p029b.C0802b;

@fn
public final class C0517g extends C0507c<C0538t> {
    private static final C0517g f1436a = new C0517g();

    private C0517g() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    public static C0535s m2377a(Context context, String str, dh dhVar) {
        if (C0526n.m2400a().m3089b(context)) {
            C0535s b = f1436a.m2378b(context, str, dhVar);
            if (b != null) {
                return b;
            }
        }
        C0691b.m3093a("Using AdLoader from the client jar.");
        return new C0576j(context, str, dhVar, new VersionInfoParcel(7895000, 7895000, true));
    }

    private C0535s m2378b(Context context, String str, dh dhVar) {
        try {
            return C0537a.m2434a(((C0538t) m2353a(context)).mo403a(C0802b.m3754a((Object) context), str, dhVar, 7895000));
        } catch (Throwable e) {
            C0691b.m3102d("Could not create remote builder for AdLoader.", e);
            return null;
        } catch (Throwable e2) {
            C0691b.m3102d("Could not create remote builder for AdLoader.", e2);
            return null;
        }
    }

    protected C0538t m2379a(IBinder iBinder) {
        return C0540a.m2437a(iBinder);
    }

    protected /* synthetic */ Object mo385b(IBinder iBinder) {
        return m2379a(iBinder);
    }
}
