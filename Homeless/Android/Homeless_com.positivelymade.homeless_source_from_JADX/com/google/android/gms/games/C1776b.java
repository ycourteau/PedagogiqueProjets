package com.google.android.gms.games;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.C0774g;
import com.google.android.gms.common.api.C0777e;
import com.google.android.gms.common.api.C1173a;
import com.google.android.gms.common.api.C1173a.C0786b;
import com.google.android.gms.common.api.C1173a.C1164a.C1168d;
import com.google.android.gms.common.api.C1173a.C1169d;
import com.google.android.gms.common.api.C1180c;
import com.google.android.gms.common.api.C1180c.C0650b;
import com.google.android.gms.common.api.C1180c.C0651c;
import com.google.android.gms.common.api.C1183k.C0781b;
import com.google.android.gms.common.api.C1183k.C0783a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1266h;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.games.achievement.C1767b;
import com.google.android.gms.games.internal.C1852c;
import com.google.android.gms.games.internal.p038a.C1792a;
import com.google.android.gms.games.internal.p038a.C1794b;
import com.google.android.gms.games.internal.p038a.C1795c;
import com.google.android.gms.games.internal.p038a.C1796d;
import com.google.android.gms.games.internal.p038a.C1797e;
import com.google.android.gms.games.internal.p038a.C1799f;
import com.google.android.gms.games.internal.p038a.C1800g;
import com.google.android.gms.games.internal.p038a.C1802h;
import com.google.android.gms.games.internal.p038a.C1803i;
import com.google.android.gms.games.internal.p038a.C1804j;
import com.google.android.gms.games.internal.p038a.C1805k;
import com.google.android.gms.games.internal.p038a.C1807l;
import com.google.android.gms.games.internal.p038a.C1809m;
import com.google.android.gms.games.internal.p038a.C1824n;
import com.google.android.gms.games.internal.p038a.C1825o;
import com.google.android.gms.games.internal.p038a.C1827p;
import com.google.android.gms.games.internal.p039d.C1793a;
import com.google.android.gms.games.multiplayer.C1798b;
import com.google.android.gms.games.multiplayer.C1801c;
import com.google.android.gms.games.multiplayer.p040a.C1826a;
import com.google.android.gms.games.multiplayer.realtime.C1806a;
import com.google.android.gms.games.p033a.C1764a;
import com.google.android.gms.games.p034b.C1775a;
import com.google.android.gms.games.p035c.C1778a;
import com.google.android.gms.games.p036d.C1782a;
import com.google.android.gms.games.p037e.C1784a;
import com.google.android.gms.games.request.C1808b;
import com.google.android.gms.games.snapshot.C1823g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class C1776b {
    static final C1169d<C1852c> f5514a = new C1169d();
    public static final Scope f5515b = new Scope("https://www.googleapis.com/auth/games");
    public static final C1173a<C1774c> f5516c = new C1173a("Games.API", f5535v, f5514a);
    public static final Scope f5517d = new Scope("https://www.googleapis.com/auth/games.firstparty");
    public static final C1173a<C1774c> f5518e = new C1173a("Games.API_1P", f5536w, f5514a);
    public static final C1781c f5519f = new C1797e();
    public static final C1767b f5520g = new C1792a();
    public static final C1764a f5521h = new C1795c();
    public static final C1775a f5522i = new C1796d();
    public static final C1778a f5523j = new C1800g();
    public static final C1798b f5524k = new C1799f();
    public static final C1826a f5525l = new C1827p();
    public static final C1806a f5526m = new C1807l();
    public static final C1801c f5527n = new C1802h();
    public static final C1788i f5528o = new C1804j();
    public static final C1785e f5529p = new C1803i();
    public static final C1782a f5530q = new C1805k();
    public static final C1808b f5531r = new C1809m();
    public static final C1823g f5532s = new C1824n();
    public static final C1784a f5533t = new C1825o();
    public static final C1793a f5534u = new C1794b();
    private static final C0786b<C1852c, C1774c> f5535v = new C17691();
    private static final C0786b<C1852c, C1774c> f5536w = new C17702();

    private static abstract class C1768b extends C0786b<C1852c, C1774c> {
        private C1768b() {
        }

        public int mo1251a() {
            return 1;
        }

        public C1852c m8377a(Context context, Looper looper, C1266h c1266h, C1774c c1774c, C0650b c0650b, C0651c c0651c) {
            return new C1852c(context, looper, c1266h, c1774c == null ? new C1774c() : c1774c, c0650b, c0651c);
        }
    }

    static class C17691 extends C1768b {
        C17691() {
            super();
        }

        public List<Scope> m8378a(C1774c c1774c) {
            return Collections.singletonList(C1776b.f5515b);
        }

        public /* synthetic */ List mo1252a(Object obj) {
            return m8378a((C1774c) obj);
        }
    }

    static class C17702 extends C1768b {
        C17702() {
            super();
        }

        public List<Scope> m8380a(C1774c c1774c) {
            return Collections.singletonList(C1776b.f5517d);
        }

        public /* synthetic */ List mo1252a(Object obj) {
            return m8380a((C1774c) obj);
        }
    }

    public static abstract class C1771a<R extends C0774g> extends C0783a<R, C1852c> {
        public C1771a(C1180c c1180c) {
            super(C1776b.f5514a, c1180c);
        }
    }

    private static abstract class C1772d extends C1771a<Status> {
        private C1772d(C1180c c1180c) {
            super(c1180c);
        }

        public Status m8382a(Status status) {
            return status;
        }

        public /* synthetic */ C0774g mo574b(Status status) {
            return m8382a(status);
        }
    }

    public static final class C1774c implements C1168d {
        public final boolean f5507a;
        public final boolean f5508b;
        public final int f5509c;
        public final boolean f5510d;
        public final int f5511e;
        public final String f5512f;
        public final ArrayList<String> f5513g;

        private C1774c() {
            this.f5507a = false;
            this.f5508b = true;
            this.f5509c = 17;
            this.f5510d = false;
            this.f5511e = 4368;
            this.f5512f = null;
            this.f5513g = new ArrayList();
        }

        public Bundle m8386a() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("com.google.android.gms.games.key.isHeadless", this.f5507a);
            bundle.putBoolean("com.google.android.gms.games.key.showConnectingPopup", this.f5508b);
            bundle.putInt("com.google.android.gms.games.key.connectingPopupGravity", this.f5509c);
            bundle.putBoolean("com.google.android.gms.games.key.retryingSignIn", this.f5510d);
            bundle.putInt("com.google.android.gms.games.key.sdkVariant", this.f5511e);
            bundle.putString("com.google.android.gms.games.key.forceResolveAccountKey", this.f5512f);
            bundle.putStringArrayList("com.google.android.gms.games.key.proxyApis", this.f5513g);
            return bundle;
        }
    }

    public static C1852c m8387a(C1180c c1180c) {
        return C1776b.m8388a(c1180c, true);
    }

    public static C1852c m8388a(C1180c c1180c, boolean z) {
        C1305x.m6626b(c1180c != null, "GoogleApiClient parameter is required.");
        C1305x.m6622a(c1180c.mo888d(), (Object) "GoogleApiClient must be connected.");
        return C1776b.m8390b(c1180c, z);
    }

    public static C0777e<Status> m8389b(C1180c c1180c) {
        return c1180c.mo882b(new C1772d(c1180c) {
            protected void m8385a(C1852c c1852c) {
                c1852c.m8631a((C0781b) this);
            }
        });
    }

    public static C1852c m8390b(C1180c c1180c, boolean z) {
        C1305x.m6622a(c1180c.mo881a(f5516c), (Object) "GoogleApiClient is not configured to use the Games Api. Pass Games.API into GoogleApiClient.Builder#addApi() to use this feature.");
        boolean b = c1180c.mo886b(f5516c);
        if (!z || b) {
            return b ? (C1852c) c1180c.mo876a(f5514a) : null;
        } else {
            throw new IllegalStateException("GoogleApiClient has an optional Games.API and is not connected to Games. Use GoogleApiClient.hasConnectedApi(Games.API) to guard this call.");
        }
    }
}
