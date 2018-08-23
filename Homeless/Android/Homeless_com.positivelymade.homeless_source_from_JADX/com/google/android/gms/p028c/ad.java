package com.google.android.gms.p028c;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.p028c.ac.C0806a;
import java.util.concurrent.Future;

@fn
public class ad {
    private ac m3776a(Context context, VersionInfoParcel versionInfoParcel, final gz<ac> gzVar, C1141o c1141o) {
        final ac aeVar = new ae(context, versionInfoParcel, c1141o);
        aeVar.mo579a(new C0806a(this) {
            final /* synthetic */ ad f2368c;

            public void mo576a() {
                gzVar.m4958b(aeVar);
            }
        });
        return aeVar;
    }

    public Future<ac> m3778a(Context context, VersionInfoParcel versionInfoParcel, String str, C1141o c1141o) {
        final Future gzVar = new gz();
        final Context context2 = context;
        final VersionInfoParcel versionInfoParcel2 = versionInfoParcel;
        final C1141o c1141o2 = c1141o;
        final String str2 = str;
        go.f3361a.post(new Runnable(this) {
            final /* synthetic */ ad f2365f;

            public void run() {
                this.f2365f.m3776a(context2, versionInfoParcel2, gzVar, c1141o2).mo585b(str2);
            }
        });
        return gzVar;
    }
}
