package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.C0552d;
import com.google.android.gms.ads.internal.C0558f;
import com.google.android.gms.ads.internal.C0577k;
import com.google.android.gms.ads.internal.client.C0490u.C0491a;
import com.google.android.gms.ads.internal.client.C0542v.C0544a;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.p028c.dh;
import com.google.android.gms.p028c.fn;
import com.google.android.gms.p029b.C0507c;
import com.google.android.gms.p029b.C0507c.C0803a;
import com.google.android.gms.p029b.C0802b;

@fn
public class C0518h extends C0507c<C0542v> {
    public C0518h() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    private C0490u m2381a(Context context, AdSizeParcel adSizeParcel, String str, dh dhVar, int i) {
        Throwable e;
        try {
            return C0491a.m2186a(((C0542v) m2353a(context)).mo405a(C0802b.m3754a((Object) context), adSizeParcel, str, dhVar, 7895000, i));
        } catch (RemoteException e2) {
            e = e2;
            C0691b.m3094a("Could not create remote AdManager.", e);
            return null;
        } catch (C0803a e3) {
            e = e3;
            C0691b.m3094a("Could not create remote AdManager.", e);
            return null;
        }
    }

    public C0490u m2382a(Context context, AdSizeParcel adSizeParcel, String str, dh dhVar) {
        if (C0526n.m2400a().m3089b(context)) {
            C0490u a = m2381a(context, adSizeParcel, str, dhVar, 1);
            if (a != null) {
                return a;
            }
        }
        C0691b.m3093a("Using BannerAdManager from the client jar.");
        return new C0558f(context, adSizeParcel, str, dhVar, new VersionInfoParcel(7895000, 7895000, true));
    }

    protected C0542v m2383a(IBinder iBinder) {
        return C0544a.m2463a(iBinder);
    }

    public C0490u m2384b(Context context, AdSizeParcel adSizeParcel, String str, dh dhVar) {
        if (C0526n.m2400a().m3089b(context)) {
            C0490u a = m2381a(context, adSizeParcel, str, dhVar, 2);
            if (a != null) {
                return a;
            }
        }
        C0691b.m3103e("Using InterstitialAdManager from the client jar.");
        return new C0577k(context, adSizeParcel, str, dhVar, new VersionInfoParcel(7895000, 7895000, true), C0552d.m2470a());
    }

    protected /* synthetic */ Object mo385b(IBinder iBinder) {
        return m2383a(iBinder);
    }
}
