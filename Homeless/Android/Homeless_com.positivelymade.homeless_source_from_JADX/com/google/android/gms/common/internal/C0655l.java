package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.C1229b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1173a.C0653c;
import com.google.android.gms.common.api.C1180c.C0650b;
import com.google.android.gms.common.api.C1180c.C0651c;
import com.google.android.gms.common.api.C1180c.C1179e;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C1273t.C1274a;
import com.google.android.gms.common.internal.C1281m.C0654a;
import com.google.android.gms.common.internal.C1298u.C1300a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class C0655l<T extends IInterface> implements C0653c, C0654a {
    public static final String[] f1925d = new String[]{"service_esmobile", "service_googleme"};
    private final Context f1926a;
    final Handler f1927b;
    protected AtomicInteger f1928c;
    private final C1266h f1929e;
    private final Looper f1930f;
    private final C1282n f1931g;
    private final C1229b f1932h;
    private final Object f1933i;
    private C1298u f1934j;
    private C1179e f1935k;
    private T f1936l;
    private final ArrayList<C1270c<?>> f1937m;
    private C1276e f1938n;
    private int f1939o;
    private final Set<Scope> f1940p;
    private final Account f1941q;
    private final C0650b f1942r;
    private final C0651c f1943s;
    private final int f1944t;

    protected abstract class C1270c<TListener> {
        private TListener f4363a;
        private boolean f4364b = false;
        final /* synthetic */ C0655l f4365d;

        public C1270c(C0655l c0655l, TListener tListener) {
            this.f4365d = c0655l;
            this.f4363a = tListener;
        }

        protected abstract void mo908a(TListener tListener);

        protected abstract void mo909b();

        public void m6385c() {
            synchronized (this) {
                Object obj = this.f4363a;
                if (this.f4364b) {
                    Log.w("GmsClient", "Callback proxy " + this + " being reused. This is not safe.");
                }
            }
            if (obj != null) {
                try {
                    mo908a(obj);
                } catch (RuntimeException e) {
                    mo909b();
                    throw e;
                }
            }
            mo909b();
            synchronized (this) {
                this.f4364b = true;
            }
            m6386d();
        }

        public void m6386d() {
            m6387e();
            synchronized (this.f4365d.f1937m) {
                this.f4365d.f1937m.remove(this);
            }
        }

        public void m6387e() {
            synchronized (this) {
                this.f4363a = null;
            }
        }
    }

    private abstract class C1271a extends C1270c<Boolean> {
        public final int f4366a;
        public final Bundle f4367b;
        final /* synthetic */ C0655l f4368c;

        protected C1271a(C0655l c0655l, int i, Bundle bundle) {
            this.f4368c = c0655l;
            super(c0655l, Boolean.valueOf(true));
            this.f4366a = i;
            this.f4367b = bundle;
        }

        protected abstract void mo912a(ConnectionResult connectionResult);

        protected void m6389a(Boolean bool) {
            PendingIntent pendingIntent = null;
            if (bool == null) {
                this.f4368c.m2961b(1, null);
                return;
            }
            switch (this.f4366a) {
                case 0:
                    if (!mo913a()) {
                        this.f4368c.m2961b(1, null);
                        mo912a(new ConnectionResult(8, null));
                        return;
                    }
                    return;
                case 10:
                    this.f4368c.m2961b(1, null);
                    throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
                default:
                    this.f4368c.m2961b(1, null);
                    if (this.f4367b != null) {
                        pendingIntent = (PendingIntent) this.f4367b.getParcelable("pendingIntent");
                    }
                    mo912a(new ConnectionResult(this.f4366a, pendingIntent));
                    return;
            }
        }

        protected /* synthetic */ void mo908a(Object obj) {
            m6389a((Boolean) obj);
        }

        protected abstract boolean mo913a();

        protected void mo909b() {
        }
    }

    final class C1272b extends Handler {
        final /* synthetic */ C0655l f4369a;

        public C1272b(C0655l c0655l, Looper looper) {
            this.f4369a = c0655l;
            super(looper);
        }

        private void m6393a(Message message) {
            C1270c c1270c = (C1270c) message.obj;
            c1270c.mo909b();
            c1270c.m6386d();
        }

        private boolean m6394b(Message message) {
            return message.what == 2 || message.what == 1 || message.what == 5 || message.what == 6;
        }

        public void handleMessage(Message message) {
            if (this.f4369a.f1928c.get() != message.arg1) {
                if (m6394b(message)) {
                    m6393a(message);
                }
            } else if ((message.what == 1 || message.what == 5 || message.what == 6) && !this.f4369a.m2988j()) {
                m6393a(message);
            } else if (message.what == 3) {
                ConnectionResult connectionResult = new ConnectionResult(message.arg2, null);
                this.f4369a.f1935k.mo872a(connectionResult);
                this.f4369a.mo1340a(connectionResult);
            } else if (message.what == 4) {
                this.f4369a.m2961b(4, null);
                if (this.f4369a.f1942r != null) {
                    this.f4369a.f1942r.a_(message.arg2);
                }
                this.f4369a.m2969a(message.arg2);
                this.f4369a.m2957a(4, 1, null);
            } else if (message.what == 2 && !this.f4369a.mo512e()) {
                m6393a(message);
            } else if (m6394b(message)) {
                ((C1270c) message.obj).m6385c();
            } else {
                Log.wtf("GmsClient", "Don't know how to handle this message.");
            }
        }
    }

    public static final class C1275d extends C1274a {
        private C0655l f4370a;
        private final int f4371b;

        public C1275d(C0655l c0655l, int i) {
            this.f4370a = c0655l;
            this.f4371b = i;
        }

        private void m6398a() {
            this.f4370a = null;
        }

        public void mo910a(int i, Bundle bundle) {
            C1305x.m6618a(this.f4370a, (Object) "onAccountValidationComplete can be called only once per call to validateAccount");
            this.f4370a.m2970a(i, bundle, this.f4371b);
            m6398a();
        }

        public void mo911a(int i, IBinder iBinder, Bundle bundle) {
            C1305x.m6618a(this.f4370a, (Object) "onPostInitComplete can be called only once per call to getRemoteService");
            this.f4370a.mo1047a(i, iBinder, bundle, this.f4371b);
            m6398a();
        }
    }

    public final class C1276e implements ServiceConnection {
        final /* synthetic */ C0655l f4372a;
        private final int f4373b;

        public C1276e(C0655l c0655l, int i) {
            this.f4372a = c0655l;
            this.f4373b = i;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C1305x.m6618a((Object) iBinder, (Object) "Expecting a valid IBinder");
            this.f4372a.f1934j = C1300a.m6610a(iBinder);
            this.f4372a.m2981c(this.f4373b);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            this.f4372a.f1927b.sendMessage(this.f4372a.f1927b.obtainMessage(4, this.f4373b, 1));
        }
    }

    protected class C1277f implements C1179e {
        final /* synthetic */ C0655l f4374a;

        public C1277f(C0655l c0655l) {
            this.f4374a = c0655l;
        }

        public void mo872a(ConnectionResult connectionResult) {
            if (connectionResult.m5961b()) {
                this.f4374a.mo508a(null, this.f4374a.f1940p);
            } else if (this.f4374a.f1943s != null) {
                this.f4374a.f1943s.mo504a(connectionResult);
            }
        }

        public void mo873b(ConnectionResult connectionResult) {
            throw new IllegalStateException("Legacy GmsClient received onReportAccountValidation callback.");
        }
    }

    protected final class C1278g extends C1271a {
        public final IBinder f4375e;
        final /* synthetic */ C0655l f4376f;

        public C1278g(C0655l c0655l, int i, IBinder iBinder, Bundle bundle) {
            this.f4376f = c0655l;
            super(c0655l, i, bundle);
            this.f4375e = iBinder;
        }

        protected void mo912a(ConnectionResult connectionResult) {
            if (this.f4376f.f1943s != null) {
                this.f4376f.f1943s.mo504a(connectionResult);
            }
            this.f4376f.mo1340a(connectionResult);
        }

        protected boolean mo913a() {
            try {
                String interfaceDescriptor = this.f4375e.getInterfaceDescriptor();
                if (this.f4376f.mo516b().equals(interfaceDescriptor)) {
                    IInterface b = this.f4376f.mo515b(this.f4375e);
                    if (b == null || !this.f4376f.m2957a(2, 3, b)) {
                        return false;
                    }
                    Bundle a_ = this.f4376f.a_();
                    if (this.f4376f.f1942r != null) {
                        this.f4376f.f1942r.mo503a(a_);
                    }
                    return true;
                }
                Log.e("GmsClient", "service descriptor mismatch: " + this.f4376f.mo516b() + " vs. " + interfaceDescriptor);
                return false;
            } catch (RemoteException e) {
                Log.w("GmsClient", "service probably died");
                return false;
            }
        }
    }

    protected final class C1279h extends C1271a {
        final /* synthetic */ C0655l f4377e;

        public C1279h(C0655l c0655l) {
            this.f4377e = c0655l;
            super(c0655l, 0, null);
        }

        protected void mo912a(ConnectionResult connectionResult) {
            this.f4377e.f1935k.mo872a(connectionResult);
            this.f4377e.mo1340a(connectionResult);
        }

        protected boolean mo913a() {
            this.f4377e.f1935k.mo872a(ConnectionResult.f4086a);
            return true;
        }
    }

    protected final class C1280i extends C1271a {
        final /* synthetic */ C0655l f4378e;

        public C1280i(C0655l c0655l, int i, Bundle bundle) {
            this.f4378e = c0655l;
            super(c0655l, i, bundle);
        }

        protected void mo912a(ConnectionResult connectionResult) {
            this.f4378e.f1935k.mo873b(connectionResult);
            this.f4378e.mo1340a(connectionResult);
        }

        protected boolean mo913a() {
            this.f4378e.f1935k.mo873b(ConnectionResult.f4086a);
            return true;
        }
    }

    protected C0655l(Context context, Looper looper, int i, C1266h c1266h, C0650b c0650b, C0651c c0651c) {
        this(context, looper, C1282n.m6418a(context), C1229b.m6224a(), i, c1266h, (C0650b) C1305x.m6617a((Object) c0650b), (C0651c) C1305x.m6617a((Object) c0651c));
    }

    protected C0655l(Context context, Looper looper, C1282n c1282n, C1229b c1229b, int i, C1266h c1266h, C0650b c0650b, C0651c c0651c) {
        this.f1933i = new Object();
        this.f1937m = new ArrayList();
        this.f1939o = 1;
        this.f1928c = new AtomicInteger(0);
        this.f1926a = (Context) C1305x.m6618a((Object) context, (Object) "Context must not be null");
        this.f1930f = (Looper) C1305x.m6618a((Object) looper, (Object) "Looper must not be null");
        this.f1931g = (C1282n) C1305x.m6618a((Object) c1282n, (Object) "Supervisor must not be null");
        this.f1932h = (C1229b) C1305x.m6618a((Object) c1229b, (Object) "API availability must not be null");
        this.f1927b = new C1272b(this, looper);
        this.f1944t = i;
        this.f1929e = (C1266h) C1305x.m6617a((Object) c1266h);
        this.f1941q = c1266h.m6364a();
        this.f1940p = m2960b(c1266h.m6370e());
        this.f1942r = c0650b;
        this.f1943s = c0651c;
    }

    private boolean m2957a(int i, int i2, T t) {
        boolean z;
        synchronized (this.f1933i) {
            if (this.f1939o != i) {
                z = false;
            } else {
                m2961b(i2, t);
                z = true;
            }
        }
        return z;
    }

    private Set<Scope> m2960b(Set<Scope> set) {
        Set<Scope> a = mo1339a((Set) set);
        if (a == null) {
            return a;
        }
        for (Scope contains : a) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return a;
    }

    private void m2961b(int i, T t) {
        boolean z = true;
        if ((i == 3) != (t != null)) {
            z = false;
        }
        C1305x.m6625b(z);
        synchronized (this.f1933i) {
            this.f1939o = i;
            this.f1936l = t;
            mo904a(i, (IInterface) t);
            switch (i) {
                case 1:
                    mo1342s();
                    break;
                case 2:
                    mo517c();
                    break;
                case 3:
                    mo1341h();
                    break;
            }
        }
    }

    private void mo517c() {
        if (this.f1938n != null) {
            Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + mo514a());
            this.f1931g.mo915b(mo514a(), this.f1938n, m2985g());
            this.f1928c.incrementAndGet();
        }
        this.f1938n = new C1276e(this, this.f1928c.get());
        if (!this.f1931g.mo914a(mo514a(), this.f1938n, m2985g())) {
            Log.e("GmsClient", "unable to connect to service: " + mo514a());
            this.f1927b.sendMessage(this.f1927b.obtainMessage(3, this.f1928c.get(), 9));
        }
    }

    private void mo1342s() {
        if (this.f1938n != null) {
            this.f1931g.mo915b(mo514a(), this.f1938n, m2985g());
            this.f1938n = null;
        }
    }

    protected abstract String mo514a();

    protected Set<Scope> mo1339a(Set<Scope> set) {
        return set;
    }

    protected void m2969a(int i) {
    }

    protected void m2970a(int i, Bundle bundle, int i2) {
        this.f1927b.sendMessage(this.f1927b.obtainMessage(5, i2, -1, new C1280i(this, i, bundle)));
    }

    protected void mo1047a(int i, IBinder iBinder, Bundle bundle, int i2) {
        this.f1927b.sendMessage(this.f1927b.obtainMessage(1, i2, -1, new C1278g(this, i, iBinder, bundle)));
    }

    protected void mo904a(int i, T t) {
    }

    protected void mo1340a(ConnectionResult connectionResult) {
    }

    public void mo506a(C1179e c1179e) {
        this.f1935k = (C1179e) C1305x.m6618a((Object) c1179e, (Object) "Connection progress callbacks cannot be null.");
        m2961b(2, null);
    }

    public void mo507a(C1246r c1246r) {
        try {
            this.f1934j.mo930a(new C1275d(this, this.f1928c.get()), new ValidateAccountRequest(c1246r, (Scope[]) this.f1940p.toArray(new Scope[this.f1940p.size()]), this.f1926a.getPackageName(), mo1650q()));
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "service died");
            m2980b(1);
        } catch (Throwable e2) {
            Log.w("GmsClient", "Remote exception occurred", e2);
        }
    }

    public void mo508a(C1246r c1246r, Set<Scope> set) {
        try {
            GetServiceRequest a = new GetServiceRequest(this.f1944t).m6309a(this.f1926a.getPackageName()).m6307a(mo1048n());
            if (set != null) {
                a.m6310a((Collection) set);
            }
            if (mo513f()) {
                a.m6306a(m2990l()).m6308a(c1246r);
            } else if (mo1049r()) {
                a.m6306a(this.f1941q);
            }
            this.f1934j.mo929a(new C1275d(this, this.f1928c.get()), a);
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "service died");
            m2980b(1);
        } catch (Throwable e2) {
            Log.w("GmsClient", "Remote exception occurred", e2);
        }
    }

    public void mo509a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        synchronized (this.f1933i) {
            int i = this.f1939o;
            IInterface iInterface = this.f1936l;
        }
        printWriter.append(str).append("mConnectState=");
        switch (i) {
            case 1:
                printWriter.print("DISCONNECTED");
                break;
            case 2:
                printWriter.print("CONNECTING");
                break;
            case 3:
                printWriter.print("CONNECTED");
                break;
            case 4:
                printWriter.print("DISCONNECTING");
                break;
            default:
                printWriter.print("UNKNOWN");
                break;
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.println("null");
        } else {
            printWriter.append(mo516b()).append("@").println(Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
    }

    public Bundle a_() {
        return null;
    }

    protected abstract T mo515b(IBinder iBinder);

    protected abstract String mo516b();

    public void m2980b(int i) {
        this.f1927b.sendMessage(this.f1927b.obtainMessage(4, this.f1928c.get(), i));
    }

    protected void m2981c(int i) {
        this.f1927b.sendMessage(this.f1927b.obtainMessage(6, i, -1, new C1279h(this)));
    }

    public void mo511d() {
        this.f1928c.incrementAndGet();
        synchronized (this.f1937m) {
            int size = this.f1937m.size();
            for (int i = 0; i < size; i++) {
                ((C1270c) this.f1937m.get(i)).m6387e();
            }
            this.f1937m.clear();
        }
        m2961b(1, null);
    }

    public boolean mo512e() {
        boolean z;
        synchronized (this.f1933i) {
            z = this.f1939o == 3;
        }
        return z;
    }

    public boolean mo513f() {
        return false;
    }

    protected final String m2985g() {
        return this.f1929e.m6373h();
    }

    protected void mo1341h() {
    }

    public void m2987i() {
        int a = this.f1932h.m6225a(this.f1926a);
        if (a != 0) {
            m2961b(1, null);
            this.f1935k = new C1277f(this);
            this.f1927b.sendMessage(this.f1927b.obtainMessage(3, this.f1928c.get(), a));
            return;
        }
        mo506a(new C1277f(this));
    }

    public boolean m2988j() {
        boolean z;
        synchronized (this.f1933i) {
            z = this.f1939o == 2;
        }
        return z;
    }

    public final Context m2989k() {
        return this.f1926a;
    }

    public final Account m2990l() {
        return this.f1941q != null ? this.f1941q : new Account("<<default account>>", "com.google");
    }

    protected final C1266h m2991m() {
        return this.f1929e;
    }

    protected Bundle mo1048n() {
        return new Bundle();
    }

    protected final void m2993o() {
        if (!mo512e()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public final T m2994p() {
        T t;
        synchronized (this.f1933i) {
            if (this.f1939o == 4) {
                throw new DeadObjectException();
            }
            m2993o();
            C1305x.m6622a(this.f1936l != null, (Object) "Client is connected but service is null");
            t = this.f1936l;
        }
        return t;
    }

    protected Bundle mo1650q() {
        return null;
    }

    public boolean mo1049r() {
        return false;
    }
}
