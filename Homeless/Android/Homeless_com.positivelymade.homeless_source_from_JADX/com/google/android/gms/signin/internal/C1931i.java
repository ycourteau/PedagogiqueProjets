package com.google.android.gms.signin.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1180c.C0650b;
import com.google.android.gms.common.api.C1180c.C0651c;
import com.google.android.gms.common.api.C1180c.C1178d;
import com.google.android.gms.common.api.C1180c.C1178d.C1177a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.C0655l;
import com.google.android.gms.common.internal.C0655l.C1277f;
import com.google.android.gms.common.internal.C1196v;
import com.google.android.gms.common.internal.C1246r;
import com.google.android.gms.common.internal.C1266h;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.C1914d;
import com.google.android.gms.signin.C1917e;
import com.google.android.gms.signin.internal.C1920d.C1921a;
import com.google.android.gms.signin.internal.C1923f.C1925a;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;

public class C1931i extends C0655l<C1923f> implements C1914d {
    private final boolean f5899a;
    private final C1266h f5900e;
    private final C1917e f5901f;
    private Integer f5902g;
    private final ExecutorService f5903h;

    private static class C1930a extends C1921a {
        private final C1917e f5897a;
        private final ExecutorService f5898b;

        public C1930a(C1917e c1917e, ExecutorService executorService) {
            this.f5897a = c1917e;
            this.f5898b = executorService;
        }

        private C1178d m9660a() {
            return this.f5897a.m9621d();
        }

        public void mo1665a(final String str, final String str2, final C1923f c1923f) {
            this.f5898b.submit(new Runnable(this) {
                final /* synthetic */ C1930a f5896d;

                public void run() {
                    try {
                        c1923f.mo1664a(this.f5896d.m9660a().m6000a(str, str2));
                    } catch (Throwable e) {
                        Log.e("SignInClientImpl", "RemoteException thrown when processing uploadServerAuthCode callback", e);
                    }
                }
            });
        }

        public void mo1666a(final String str, final List<Scope> list, final C1923f c1923f) {
            this.f5898b.submit(new Runnable(this) {
                final /* synthetic */ C1930a f5892d;

                public void run() {
                    try {
                        C1177a a = this.f5892d.m9660a().m5999a(str, Collections.unmodifiableSet(new HashSet(list)));
                        c1923f.mo1661a(new CheckServerAuthResult(a.m5997a(), a.m5998b()));
                    } catch (Throwable e) {
                        Log.e("SignInClientImpl", "RemoteException thrown when processing checkServerAuthorization callback", e);
                    }
                }
            });
        }
    }

    public C1931i(Context context, Looper looper, boolean z, C1266h c1266h, C1917e c1917e, C0650b c0650b, C0651c c0651c, ExecutorService executorService) {
        super(context, looper, 44, c1266h, c0650b, c0651c);
        this.f5899a = z;
        this.f5900e = c1266h;
        this.f5901f = c1266h.m6375j();
        this.f5902g = c1266h.m6376k();
        this.f5903h = executorService;
    }

    public static Bundle m9664a(C1917e c1917e, Integer num, ExecutorService executorService) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", c1917e.m9618a());
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", c1917e.m9619b());
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", c1917e.m9620c());
        if (c1917e.m9621d() != null) {
            bundle.putParcelable("com.google.android.gms.signin.internal.signInCallbacks", new BinderWrapper(new C1930a(c1917e, executorService).asBinder()));
        }
        if (num != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        return bundle;
    }

    protected C1923f m9665a(IBinder iBinder) {
        return C1925a.m9656a(iBinder);
    }

    protected String mo514a() {
        return "com.google.android.gms.signin.service.START";
    }

    public void mo1667a(C1246r c1246r, Set<Scope> set, C1191e c1191e) {
        C1305x.m6618a((Object) c1191e, (Object) "Expecting a valid ISignInCallbacks");
        try {
            ((C1923f) m2994p()).mo1658a(new AuthAccountRequest(c1246r, set), c1191e);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when authAccount is called");
            try {
                c1191e.mo866a(new ConnectionResult(8, null), new AuthAccountResult());
            } catch (RemoteException e2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onAuthAccount should be executed from the same process, unexpected RemoteException.");
            }
        }
    }

    public void mo1668a(C1246r c1246r, boolean z) {
        try {
            ((C1923f) m2994p()).mo1660a(c1246r, this.f5902g.intValue(), z);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    public void mo1669a(C1196v c1196v) {
        C1305x.m6618a((Object) c1196v, (Object) "Expecting a valid IResolveAccountCallbacks");
        try {
            ((C1923f) m2994p()).mo1659a(new ResolveAccountRequest(this.f5900e.m6367b(), this.f5902g.intValue()), c1196v);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when resolveAccount is called");
            try {
                c1196v.mo870a(new ResolveAccountResponse(8));
            } catch (RemoteException e2) {
                Log.wtf("SignInClientImpl", "IResolveAccountCallbacks#onAccountResolutionComplete should be executed from the same process, unexpected RemoteException.");
            }
        }
    }

    protected /* synthetic */ IInterface mo515b(IBinder iBinder) {
        return m9665a(iBinder);
    }

    protected String mo516b() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    public void mo517c() {
        try {
            ((C1923f) m2994p()).mo1656a(this.f5902g.intValue());
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    public boolean mo513f() {
        return this.f5899a;
    }

    protected Bundle mo1048n() {
        Bundle a = C1931i.m9664a(this.f5901f, this.f5900e.m6376k(), this.f5903h);
        if (!m2989k().getPackageName().equals(this.f5900e.m6372g())) {
            a.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f5900e.m6372g());
        }
        return a;
    }

    public void mo1342s() {
        mo506a(new C1277f(this));
    }
}
