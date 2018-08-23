package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.C1229b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1173a.C0653c;
import com.google.android.gms.common.api.C1173a.C0786b;
import com.google.android.gms.common.api.C1173a.C1169d;
import com.google.android.gms.common.api.C1180c.C0650b;
import com.google.android.gms.common.api.C1180c.C0651c;
import com.google.android.gms.common.api.C1180c.C1179e;
import com.google.android.gms.common.api.C1183k.C0783a;
import com.google.android.gms.common.api.C1216p.C0782e;
import com.google.android.gms.common.api.C1216p.C1185b;
import com.google.android.gms.common.internal.C1196v.C1197a;
import com.google.android.gms.common.internal.C1246r;
import com.google.android.gms.common.internal.C1266h;
import com.google.android.gms.common.internal.C1266h.C1265a;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.C1914d;
import com.google.android.gms.signin.C1917e;
import com.google.android.gms.signin.internal.AuthAccountResult;
import com.google.android.gms.signin.internal.C1193b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

public class C1207n implements C1187q {
    private final C1216p f4159a;
    private final Lock f4160b;
    private final Context f4161c;
    private final C1229b f4162d;
    private ConnectionResult f4163e;
    private int f4164f;
    private int f4165g = 0;
    private boolean f4166h = false;
    private int f4167i;
    private final Bundle f4168j = new Bundle();
    private final Set<C1169d> f4169k = new HashSet();
    private C1914d f4170l;
    private int f4171m;
    private boolean f4172n;
    private boolean f4173o;
    private C1246r f4174p;
    private boolean f4175q;
    private boolean f4176r;
    private final C1266h f4177s;
    private final Map<C1173a<?>, Integer> f4178t;
    private final C0786b<? extends C1914d, C1917e> f4179u;
    private ArrayList<Future<?>> f4180v = new ArrayList();

    class C11891 implements Runnable {
        final /* synthetic */ C1207n f4136a;

        C11891(C1207n c1207n) {
            this.f4136a = c1207n;
        }

        public void run() {
            this.f4136a.f4162d.m6228b(this.f4136a.f4161c);
        }
    }

    private static class C1194a extends C1193b {
        private final WeakReference<C1207n> f4140a;

        C1194a(C1207n c1207n) {
            this.f4140a = new WeakReference(c1207n);
        }

        public void mo866a(final ConnectionResult connectionResult, AuthAccountResult authAccountResult) {
            final C1207n c1207n = (C1207n) this.f4140a.get();
            if (c1207n != null) {
                c1207n.f4159a.m6147a(new C1185b(this, c1207n) {
                    final /* synthetic */ C1194a f4139c;

                    public void mo856a() {
                        c1207n.m6072a(connectionResult);
                    }
                });
            }
        }
    }

    private static class C1198b extends C1197a {
        private final WeakReference<C1207n> f4144a;

        C1198b(C1207n c1207n) {
            this.f4144a = new WeakReference(c1207n);
        }

        public void mo870a(final ResolveAccountResponse resolveAccountResponse) {
            final C1207n c1207n = (C1207n) this.f4144a.get();
            if (c1207n != null) {
                c1207n.f4159a.m6147a(new C1185b(this, c1207n) {
                    final /* synthetic */ C1198b f4143c;

                    public void mo856a() {
                        c1207n.m6076a(resolveAccountResponse);
                    }
                });
            }
        }
    }

    private abstract class C1199i implements Runnable {
        final /* synthetic */ C1207n f4145b;

        private C1199i(C1207n c1207n) {
            this.f4145b = c1207n;
        }

        protected abstract void mo871a();

        public void run() {
            this.f4145b.f4160b.lock();
            try {
                if (!Thread.interrupted()) {
                    mo871a();
                    this.f4145b.f4160b.unlock();
                }
            } catch (RuntimeException e) {
                this.f4145b.f4159a.m6149a(e);
            } finally {
                this.f4145b.f4160b.unlock();
            }
        }
    }

    private class C1200c extends C1199i {
        final /* synthetic */ C1207n f4146a;

        private C1200c(C1207n c1207n) {
            this.f4146a = c1207n;
            super();
        }

        public void mo871a() {
            this.f4146a.f4170l.mo1667a(this.f4146a.f4174p, this.f4146a.f4159a.f4196f, new C1194a(this.f4146a));
        }
    }

    private static class C1201d implements C1179e {
        private final WeakReference<C1207n> f4147a;
        private final C1173a<?> f4148b;
        private final int f4149c;

        public C1201d(C1207n c1207n, C1173a<?> c1173a, int i) {
            this.f4147a = new WeakReference(c1207n);
            this.f4148b = c1173a;
            this.f4149c = i;
        }

        public void mo872a(ConnectionResult connectionResult) {
            boolean z = false;
            C1207n c1207n = (C1207n) this.f4147a.get();
            if (c1207n != null) {
                if (Looper.myLooper() == c1207n.f4159a.mo875a()) {
                    z = true;
                }
                C1305x.m6622a(z, (Object) "onReportServiceBinding must be called on the GoogleApiClient handler thread");
                c1207n.f4160b.lock();
                try {
                    if (c1207n.m6082b(0)) {
                        if (!connectionResult.m5961b()) {
                            c1207n.m6081b(connectionResult, this.f4148b, this.f4149c);
                        }
                        if (c1207n.m6091e()) {
                            c1207n.m6094f();
                        }
                        c1207n.f4160b.unlock();
                    }
                } finally {
                    c1207n.f4160b.unlock();
                }
            }
        }

        public void mo873b(ConnectionResult connectionResult) {
            boolean z = true;
            C1207n c1207n = (C1207n) this.f4147a.get();
            if (c1207n != null) {
                if (Looper.myLooper() != c1207n.f4159a.mo875a()) {
                    z = false;
                }
                C1305x.m6622a(z, (Object) "onReportAccountValidation must be called on the GoogleApiClient handler thread");
                c1207n.f4160b.lock();
                try {
                    if (c1207n.m6082b(1)) {
                        if (!connectionResult.m5961b()) {
                            c1207n.m6081b(connectionResult, this.f4148b, this.f4149c);
                        }
                        if (c1207n.m6091e()) {
                            c1207n.m6098h();
                        }
                        c1207n.f4160b.unlock();
                    }
                } finally {
                    c1207n.f4160b.unlock();
                }
            }
        }
    }

    private class C1203e extends C1199i {
        final /* synthetic */ C1207n f4152a;
        private final Map<C0653c, C1179e> f4153c;

        public C1203e(C1207n c1207n, Map<C0653c, C1179e> map) {
            this.f4152a = c1207n;
            super();
            this.f4153c = map;
        }

        public void mo871a() {
            int a = this.f4152a.f4162d.m6225a(this.f4152a.f4161c);
            if (a != 0) {
                final ConnectionResult connectionResult = new ConnectionResult(a, null);
                this.f4152a.f4159a.m6147a(new C1185b(this, this.f4152a) {
                    final /* synthetic */ C1203e f4151b;

                    public void mo856a() {
                        this.f4151b.f4152a.m6090d(connectionResult);
                    }
                });
                return;
            }
            if (this.f4152a.f4172n) {
                this.f4152a.f4170l.mo1342s();
            }
            for (C0653c c0653c : this.f4153c.keySet()) {
                c0653c.mo506a((C1179e) this.f4153c.get(c0653c));
            }
        }
    }

    private class C1204f extends C1199i {
        final /* synthetic */ C1207n f4154a;
        private final ArrayList<C0653c> f4155c;

        public C1204f(C1207n c1207n, ArrayList<C0653c> arrayList) {
            this.f4154a = c1207n;
            super();
            this.f4155c = arrayList;
        }

        public void mo871a() {
            Set set = this.f4154a.f4159a.f4196f;
            Set h = set.isEmpty() ? this.f4154a.m6107m() : set;
            Iterator it = this.f4155c.iterator();
            while (it.hasNext()) {
                ((C0653c) it.next()).mo508a(this.f4154a.f4174p, h);
            }
        }
    }

    private class C1205g implements C0650b, C0651c {
        final /* synthetic */ C1207n f4156a;

        private C1205g(C1207n c1207n) {
            this.f4156a = c1207n;
        }

        public void mo503a(Bundle bundle) {
            this.f4156a.f4170l.mo1669a(new C1198b(this.f4156a));
        }

        public void mo504a(ConnectionResult connectionResult) {
            this.f4156a.f4160b.lock();
            try {
                if (this.f4156a.m6088c(connectionResult)) {
                    this.f4156a.m6103k();
                    this.f4156a.m6099i();
                } else {
                    this.f4156a.m6090d(connectionResult);
                }
                this.f4156a.f4160b.unlock();
            } catch (Throwable th) {
                this.f4156a.f4160b.unlock();
            }
        }

        public void a_(int i) {
        }
    }

    private class C1206h extends C1199i {
        final /* synthetic */ C1207n f4157a;
        private final ArrayList<C0653c> f4158c;

        public C1206h(C1207n c1207n, ArrayList<C0653c> arrayList) {
            this.f4157a = c1207n;
            super();
            this.f4158c = arrayList;
        }

        public void mo871a() {
            Iterator it = this.f4158c.iterator();
            while (it.hasNext()) {
                ((C0653c) it.next()).mo507a(this.f4157a.f4174p);
            }
        }
    }

    public C1207n(C1216p c1216p, C1266h c1266h, Map<C1173a<?>, Integer> map, C1229b c1229b, C0786b<? extends C1914d, C1917e> c0786b, Lock lock, Context context) {
        this.f4159a = c1216p;
        this.f4177s = c1266h;
        this.f4178t = map;
        this.f4162d = c1229b;
        this.f4179u = c0786b;
        this.f4160b = lock;
        this.f4161c = context;
    }

    private void m6072a(ConnectionResult connectionResult) {
        if (!m6082b(2)) {
            return;
        }
        if (connectionResult.m5961b()) {
            m6099i();
        } else if (m6088c(connectionResult)) {
            m6103k();
            m6099i();
        } else {
            m6090d(connectionResult);
        }
    }

    private void m6076a(ResolveAccountResponse resolveAccountResponse) {
        if (m6082b(0)) {
            ConnectionResult b = resolveAccountResponse.m6314b();
            if (b.m5961b()) {
                this.f4174p = resolveAccountResponse.m6313a();
                this.f4173o = true;
                this.f4175q = resolveAccountResponse.m6315c();
                this.f4176r = resolveAccountResponse.m6316d();
                m6094f();
            } else if (m6088c(b)) {
                m6103k();
                m6094f();
            } else {
                m6090d(b);
            }
        }
    }

    private void m6077a(boolean z) {
        if (this.f4170l != null) {
            if (this.f4170l.mo512e() && z) {
                this.f4170l.mo517c();
            }
            this.f4170l.mo511d();
            this.f4174p = null;
        }
    }

    private boolean m6078a(int i, int i2, ConnectionResult connectionResult) {
        return (i2 != 1 || m6083b(connectionResult)) ? this.f4163e == null || i < this.f4164f : false;
    }

    private void m6081b(ConnectionResult connectionResult, C1173a<?> c1173a, int i) {
        if (i != 2) {
            int a = c1173a.m5979a().mo1251a();
            if (m6078a(a, i, connectionResult)) {
                this.f4163e = connectionResult;
                this.f4164f = a;
            }
        }
        this.f4159a.f4195e.put(c1173a.m5981c(), connectionResult);
    }

    private boolean m6082b(int i) {
        if (this.f4165g == i) {
            return true;
        }
        Log.wtf("GoogleApiClientConnecting", "GoogleApiClient connecting is in step " + m6085c(this.f4165g) + " but received callback for step " + m6085c(i));
        m6090d(new ConnectionResult(8, null));
        return false;
    }

    private boolean m6083b(ConnectionResult connectionResult) {
        return connectionResult.m5960a() || this.f4162d.m6226a(connectionResult.m5962c()) != null;
    }

    private String m6085c(int i) {
        switch (i) {
            case 0:
                return "STEP_GETTING_SERVICE_BINDINGS";
            case 1:
                return "STEP_VALIDATING_ACCOUNT";
            case 2:
                return "STEP_AUTHENTICATING";
            case 3:
                return "STEP_GETTING_REMOTE_SERVICE";
            default:
                return "UNKNOWN";
        }
    }

    private boolean m6088c(ConnectionResult connectionResult) {
        return this.f4171m != 2 ? this.f4171m == 1 && !connectionResult.m5960a() : true;
    }

    private void m6090d(ConnectionResult connectionResult) {
        boolean z = false;
        this.f4166h = false;
        m6105l();
        if (!connectionResult.m5960a()) {
            z = true;
        }
        m6077a(z);
        this.f4159a.f4195e.clear();
        this.f4159a.m6144a(connectionResult);
        if (!(this.f4159a.m6164j() && this.f4162d.m6227a(this.f4161c, connectionResult.m5962c()))) {
            this.f4159a.m6166l();
            this.f4159a.f4191a.m6412a(connectionResult);
        }
        this.f4159a.f4191a.m6409a();
    }

    private boolean m6091e() {
        this.f4167i--;
        if (this.f4167i > 0) {
            return false;
        }
        if (this.f4167i < 0) {
            Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.");
            m6090d(new ConnectionResult(8, null));
            return false;
        } else if (this.f4163e == null) {
            return true;
        } else {
            m6090d(this.f4163e);
            return false;
        }
    }

    private void m6094f() {
        if (this.f4167i == 0) {
            if (!this.f4172n) {
                m6099i();
            } else if (this.f4173o) {
                m6096g();
            }
        }
    }

    private void m6096g() {
        ArrayList arrayList = new ArrayList();
        this.f4165g = 1;
        this.f4167i = this.f4159a.f4194d.size();
        for (C1169d c1169d : this.f4159a.f4194d.keySet()) {
            if (!this.f4159a.f4195e.containsKey(c1169d)) {
                arrayList.add(this.f4159a.f4194d.get(c1169d));
            } else if (m6091e()) {
                m6098h();
            }
        }
        if (!arrayList.isEmpty()) {
            this.f4180v.add(C1217r.m6168a().submit(new C1206h(this, arrayList)));
        }
    }

    private void m6098h() {
        this.f4165g = 2;
        this.f4159a.f4196f = m6107m();
        this.f4180v.add(C1217r.m6168a().submit(new C1200c()));
    }

    private void m6099i() {
        ArrayList arrayList = new ArrayList();
        this.f4165g = 3;
        this.f4167i = this.f4159a.f4194d.size();
        for (C1169d c1169d : this.f4159a.f4194d.keySet()) {
            if (!this.f4159a.f4195e.containsKey(c1169d)) {
                arrayList.add(this.f4159a.f4194d.get(c1169d));
            } else if (m6091e()) {
                m6101j();
            }
        }
        if (!arrayList.isEmpty()) {
            this.f4180v.add(C1217r.m6168a().submit(new C1204f(this, arrayList)));
        }
    }

    private void m6101j() {
        this.f4159a.m6163i();
        C1217r.m6168a().execute(new C11891(this));
        if (this.f4170l != null) {
            if (this.f4175q) {
                this.f4170l.mo1668a(this.f4174p, this.f4176r);
            }
            m6077a(false);
        }
        for (C1169d c1169d : this.f4159a.f4195e.keySet()) {
            ((C0653c) this.f4159a.f4194d.get(c1169d)).mo511d();
        }
        if (this.f4166h) {
            this.f4166h = false;
            mo863b();
            return;
        }
        this.f4159a.f4191a.m6411a(this.f4168j.isEmpty() ? null : this.f4168j);
    }

    private void m6103k() {
        this.f4172n = false;
        this.f4159a.f4196f = Collections.emptySet();
        for (C1169d c1169d : this.f4169k) {
            if (!this.f4159a.f4195e.containsKey(c1169d)) {
                this.f4159a.f4195e.put(c1169d, new ConnectionResult(17, null));
            }
        }
    }

    private void m6105l() {
        Iterator it = this.f4180v.iterator();
        while (it.hasNext()) {
            ((Future) it.next()).cancel(true);
        }
        this.f4180v.clear();
    }

    private Set<Scope> m6107m() {
        Set<Scope> hashSet = new HashSet(this.f4177s.m6369d());
        Map f = this.f4177s.m6371f();
        for (C1173a c1173a : f.keySet()) {
            if (!this.f4159a.f4195e.containsKey(c1173a.m5981c())) {
                hashSet.addAll(((C1265a) f.get(c1173a)).f4347a);
            }
        }
        return hashSet;
    }

    public <A extends C0653c, R extends C0774g, T extends C0783a<R, A>> T mo857a(T t) {
        this.f4159a.f4192b.add(t);
        return t;
    }

    public void mo858a() {
        this.f4159a.f4191a.m6415b();
        this.f4159a.f4195e.clear();
        this.f4166h = false;
        this.f4172n = false;
        this.f4163e = null;
        this.f4165g = 0;
        this.f4171m = 2;
        this.f4173o = false;
        this.f4175q = false;
        Map hashMap = new HashMap();
        int i = 0;
        for (C1173a c1173a : this.f4178t.keySet()) {
            C0653c c0653c = (C0653c) this.f4159a.f4194d.get(c1173a.m5981c());
            int intValue = ((Integer) this.f4178t.get(c1173a)).intValue();
            int i2 = (c1173a.m5979a().mo1251a() == 1 ? 1 : 0) | i;
            if (c0653c.mo513f()) {
                this.f4172n = true;
                if (intValue < this.f4171m) {
                    this.f4171m = intValue;
                }
                if (intValue != 0) {
                    this.f4169k.add(c1173a.m5981c());
                }
            }
            hashMap.put(c0653c, new C1201d(this, c1173a, intValue));
            i = i2;
        }
        if (i != 0) {
            this.f4172n = false;
        }
        if (this.f4172n) {
            this.f4177s.m6366a(Integer.valueOf(this.f4159a.m6167m()));
            C0650b c1205g = new C1205g();
            this.f4170l = (C1914d) this.f4179u.mo575a(this.f4161c, this.f4159a.mo875a(), this.f4177s, this.f4177s.m6375j(), c1205g, c1205g);
        }
        this.f4167i = this.f4159a.f4194d.size();
        this.f4180v.add(C1217r.m6168a().submit(new C1203e(this, hashMap)));
    }

    public void mo859a(int i) {
        m6090d(new ConnectionResult(8, null));
    }

    public void mo860a(Bundle bundle) {
        if (m6082b(3)) {
            if (bundle != null) {
                this.f4168j.putAll(bundle);
            }
            if (m6091e()) {
                m6101j();
            }
        }
    }

    public void mo861a(ConnectionResult connectionResult, C1173a<?> c1173a, int i) {
        if (m6082b(3)) {
            m6081b(connectionResult, c1173a, i);
            if (m6091e()) {
                m6101j();
            }
        }
    }

    public <A extends C0653c, T extends C0783a<? extends C0774g, A>> T mo862b(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public void mo863b() {
        Iterator it = this.f4159a.f4192b.iterator();
        while (it.hasNext()) {
            C0782e c0782e = (C0782e) it.next();
            if (c0782e.mo572g() != 1) {
                c0782e.m3700c();
                it.remove();
            }
        }
        this.f4159a.m6160f();
        if (this.f4163e != null || this.f4159a.f4192b.isEmpty()) {
            m6105l();
            m6077a(true);
            this.f4159a.f4195e.clear();
            this.f4159a.m6144a(null);
            this.f4159a.f4191a.m6409a();
            return;
        }
        this.f4166h = true;
    }

    public void mo864c() {
        this.f4166h = false;
    }

    public String mo865d() {
        return "CONNECTING";
    }
}
