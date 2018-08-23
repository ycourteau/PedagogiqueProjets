package com.google.android.gms.plus;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C1173a;
import com.google.android.gms.common.api.C1173a.C0786b;
import com.google.android.gms.common.api.C1173a.C1164a.C1168d;
import com.google.android.gms.common.api.C1173a.C1169d;
import com.google.android.gms.common.api.C1180c;
import com.google.android.gms.common.api.C1180c.C0650b;
import com.google.android.gms.common.api.C1180c.C0651c;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C1266h;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.p028c.iu;
import com.google.android.gms.p028c.ka;
import com.google.android.gms.p028c.kb;
import com.google.android.gms.p028c.kc;
import com.google.android.gms.p028c.kd;
import com.google.android.gms.p028c.ke;
import com.google.android.gms.plus.internal.C1896c;
import com.google.android.gms.plus.internal.PlusCommonExtras;
import com.google.android.gms.plus.internal.PlusSession;
import java.util.HashSet;
import java.util.Set;

public final class C1889d {
    public static final C1169d<C1896c> f5742a = new C1169d();
    static final C0786b<C1896c, C1888a> f5743b = new C18871();
    public static final C1173a<C1888a> f5744c = new C1173a("Plus.API", f5743b, f5742a);
    public static final Scope f5745d = new Scope("https://www.googleapis.com/auth/plus.login");
    public static final Scope f5746e = new Scope("https://www.googleapis.com/auth/plus.me");
    public static final C1100b f5747f = new kd();
    public static final C1101c f5748g = new ke();
    public static final C1097a f5749h = new ka();
    public static final C1099f f5750i = new kc();
    public static final C1098e f5751j = new kb();

    static class C18871 extends C0786b<C1896c, C1888a> {
        C18871() {
        }

        public int mo1251a() {
            return 2;
        }

        public C1896c m9424a(Context context, Looper looper, C1266h c1266h, C1888a c1888a, C0650b c0650b, C0651c c0651c) {
            if (c1888a == null) {
                c1888a = new C1888a();
            }
            return new C1896c(context, looper, c1266h, new PlusSession(c1266h.m6367b().name, iu.m5300a(c1266h.m6370e()), (String[]) c1888a.f5741b.toArray(new String[0]), new String[0], context.getPackageName(), context.getPackageName(), null, new PlusCommonExtras()), c0650b, c0651c);
        }
    }

    public static final class C1888a implements C1168d {
        final String f5740a;
        final Set<String> f5741b;

        private C1888a() {
            this.f5740a = null;
            this.f5741b = new HashSet();
        }
    }

    public static C1896c m9425a(C1180c c1180c, boolean z) {
        C1305x.m6626b(c1180c != null, "GoogleApiClient parameter is required.");
        C1305x.m6622a(c1180c.mo888d(), (Object) "GoogleApiClient must be connected.");
        C1305x.m6622a(c1180c.mo881a(f5744c), (Object) "GoogleApiClient is not configured to use the Plus.API Api. Pass this into GoogleApiClient.Builder#addApi() to use this feature.");
        boolean b = c1180c.mo886b(f5744c);
        if (!z || b) {
            return b ? (C1896c) c1180c.mo876a(f5742a) : null;
        } else {
            throw new IllegalStateException("GoogleApiClient has an optional Plus.API and is not connected to Plus. Use GoogleApiClient.hasConnectedApi(Plus.API) to guard this call.");
        }
    }
}
