package com.google.android.gms.common.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.C1229b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1173a.C0653c;
import com.google.android.gms.common.api.C1173a.C0786b;
import com.google.android.gms.common.api.C1173a.C1164a;
import com.google.android.gms.common.api.C1173a.C1169d;
import com.google.android.gms.common.api.C1173a.C1170e;
import com.google.android.gms.common.api.C1173a.C1171f;
import com.google.android.gms.common.api.C1180c.C0650b;
import com.google.android.gms.common.api.C1180c.C0651c;
import com.google.android.gms.common.api.C1183k.C0783a;
import com.google.android.gms.common.internal.C1249b;
import com.google.android.gms.common.internal.C1266h;
import com.google.android.gms.common.internal.C1266h.C1265a;
import com.google.android.gms.common.internal.C1281m;
import com.google.android.gms.common.internal.C1281m.C0654a;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.signin.C1914d;
import com.google.android.gms.signin.C1917e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

final class C1216p implements C1180c {
    private final C0654a f4190A = new C12123(this);
    final C1281m f4191a;
    final Queue<C0782e<?>> f4192b = new LinkedList();
    BroadcastReceiver f4193c;
    final Map<C1169d<?>, C0653c> f4194d = new HashMap();
    final Map<C1169d<?>, ConnectionResult> f4195e = new HashMap();
    Set<Scope> f4196f = new HashSet();
    final C1266h f4197g;
    final Map<C1173a<?>, Integer> f4198h;
    final C0786b<? extends C1914d, C1917e> f4199i;
    final Set<C0782e<?>> f4200j = Collections.newSetFromMap(new ConcurrentHashMap(16, 0.75f, 2));
    private final Lock f4201k = new ReentrantLock();
    private final Condition f4202l;
    private final int f4203m;
    private final int f4204n;
    private final Context f4205o;
    private final Looper f4206p;
    private volatile boolean f4207q;
    private long f4208r = 120000;
    private long f4209s = 5000;
    private final C1214a f4210t;
    private final C1229b f4211u;
    private volatile C1187q f4212v;
    private ConnectionResult f4213w = null;
    private final Set<C1218s<?>> f4214x = Collections.newSetFromMap(new WeakHashMap());
    private final C1209d f4215y = new C12101(this);
    private final C0650b f4216z = new C12112(this);

    interface C0782e<A extends C0653c> {
        void mo566a(C1209d c1209d);

        void mo568b(A a);

        void m3700c();

        void m3701c(Status status);

        void mo569d(Status status);

        C1169d<A> mo571f();

        int mo572g();
    }

    static abstract class C1185b {
        private final C1187q f4133a;

        protected C1185b(C1187q c1187q) {
            this.f4133a = c1187q;
        }

        protected abstract void mo856a();

        public final void m6025a(C1216p c1216p) {
            c1216p.f4201k.lock();
            try {
                if (c1216p.f4212v == this.f4133a) {
                    mo856a();
                    c1216p.f4201k.unlock();
                }
            } finally {
                c1216p.f4201k.unlock();
            }
        }
    }

    interface C1209d {
        void mo874a(C0782e<?> c0782e);
    }

    class C12101 implements C1209d {
        final /* synthetic */ C1216p f4182a;

        C12101(C1216p c1216p) {
            this.f4182a = c1216p;
        }

        public void mo874a(C0782e<?> c0782e) {
            this.f4182a.f4200j.remove(c0782e);
        }
    }

    class C12112 implements C0650b {
        final /* synthetic */ C1216p f4183a;

        C12112(C1216p c1216p) {
            this.f4183a = c1216p;
        }

        public void mo503a(Bundle bundle) {
            this.f4183a.f4201k.lock();
            try {
                this.f4183a.f4212v.mo860a(bundle);
            } finally {
                this.f4183a.f4201k.unlock();
            }
        }

        public void a_(int i) {
            this.f4183a.f4201k.lock();
            try {
                this.f4183a.f4212v.mo859a(i);
            } finally {
                this.f4183a.f4201k.unlock();
            }
        }
    }

    class C12123 implements C0654a {
        final /* synthetic */ C1216p f4184a;

        C12123(C1216p c1216p) {
            this.f4184a = c1216p;
        }

        public Bundle a_() {
            return null;
        }

        public boolean mo512e() {
            return this.f4184a.mo888d();
        }
    }

    final class C1214a extends Handler {
        final /* synthetic */ C1216p f4188a;

        C1214a(C1216p c1216p, Looper looper) {
            this.f4188a = c1216p;
            super(looper);
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    this.f4188a.m6140o();
                    return;
                case 2:
                    this.f4188a.m6139n();
                    return;
                case 3:
                    ((C1185b) message.obj).m6025a(this.f4188a);
                    return;
                case 4:
                    throw ((RuntimeException) message.obj);
                default:
                    Log.w("GoogleApiClientImpl", "Unknown message id: " + message.what);
                    return;
            }
        }
    }

    private static class C1215c extends BroadcastReceiver {
        private WeakReference<C1216p> f4189a;

        C1215c(C1216p c1216p) {
            this.f4189a = new WeakReference(c1216p);
        }

        public void onReceive(Context context, Intent intent) {
            Uri data = intent.getData();
            String str = null;
            if (data != null) {
                str = data.getSchemeSpecificPart();
            }
            if (str != null && str.equals("com.google.android.gms")) {
                C1216p c1216p = (C1216p) this.f4189a.get();
                if (c1216p != null) {
                    c1216p.m6139n();
                }
            }
        }
    }

    public C1216p(Context context, Looper looper, C1266h c1266h, C1229b c1229b, C0786b<? extends C1914d, C1917e> c0786b, Map<C1173a<?>, C1164a> map, ArrayList<C0650b> arrayList, ArrayList<C0651c> arrayList2, int i, int i2) {
        this.f4205o = context;
        this.f4191a = new C1281m(looper, this.f4190A);
        this.f4206p = looper;
        this.f4210t = new C1214a(this, looper);
        this.f4211u = c1229b;
        this.f4203m = i;
        this.f4204n = i2;
        this.f4198h = new HashMap();
        this.f4202l = this.f4201k.newCondition();
        this.f4212v = new C1208o(this);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f4191a.m6413a((C0650b) it.next());
        }
        it = arrayList2.iterator();
        while (it.hasNext()) {
            this.f4191a.m6414a((C0651c) it.next());
        }
        Map f = c1266h.m6371f();
        for (C1173a c1173a : map.keySet()) {
            int i3;
            Object obj = map.get(c1173a);
            if (f.get(c1173a) != null) {
                i3 = ((C1265a) f.get(c1173a)).f4348b ? 1 : 2;
            } else {
                i3 = 0;
            }
            this.f4198h.put(c1173a, Integer.valueOf(i3));
            this.f4194d.put(c1173a.m5981c(), c1173a.m5982d() ? C1216p.m6134a(c1173a.m5980b(), obj, context, looper, c1266h, this.f4216z, m6133a(c1173a, i3)) : C1216p.m6132a(c1173a.m5979a(), obj, context, looper, c1266h, this.f4216z, m6133a(c1173a, i3)));
        }
        this.f4197g = c1266h;
        this.f4199i = c0786b;
    }

    private static <C extends C0653c, O> C m6132a(C0786b<C, O> c0786b, Object obj, Context context, Looper looper, C1266h c1266h, C0650b c0650b, C0651c c0651c) {
        return c0786b.mo575a(context, looper, c1266h, obj, c0650b, c0651c);
    }

    private final C0651c m6133a(final C1173a<?> c1173a, final int i) {
        return new C0651c(this) {
            final /* synthetic */ C1216p f4187c;

            public void mo504a(ConnectionResult connectionResult) {
                this.f4187c.f4201k.lock();
                try {
                    this.f4187c.f4212v.mo861a(connectionResult, c1173a, i);
                } finally {
                    this.f4187c.f4201k.unlock();
                }
            }
        };
    }

    private static <C extends C1170e, O> C1249b m6134a(C1171f<C, O> c1171f, Object obj, Context context, Looper looper, C1266h c1266h, C0650b c0650b, C0651c c0651c) {
        return new C1249b(context, looper, c1171f.m5977a(), c0650b, c0651c, c1266h, c1171f.m5978a(obj));
    }

    private void m6139n() {
        this.f4201k.lock();
        try {
            if (m6164j()) {
                mo883b();
            }
            this.f4201k.unlock();
        } catch (Throwable th) {
            this.f4201k.unlock();
        }
    }

    private void m6140o() {
        this.f4201k.lock();
        try {
            if (m6166l()) {
                mo883b();
            }
            this.f4201k.unlock();
        } catch (Throwable th) {
            this.f4201k.unlock();
        }
    }

    public Looper mo875a() {
        return this.f4206p;
    }

    public <C extends C0653c> C mo876a(C1169d<C> c1169d) {
        Object obj = (C0653c) this.f4194d.get(c1169d);
        C1305x.m6618a(obj, (Object) "Appropriate Api was not requested.");
        return obj;
    }

    public <A extends C0653c, R extends C0774g, T extends C0783a<R, A>> T mo877a(T t) {
        C1305x.m6626b(t.mo571f() != null, "This task can not be enqueued (it's probably a Batch or malformed)");
        C1305x.m6626b(this.f4194d.containsKey(t.mo571f()), "GoogleApiClient is not configured to use the API required for this call.");
        this.f4201k.lock();
        try {
            T a = this.f4212v.mo857a((C0783a) t);
            return a;
        } finally {
            this.f4201k.unlock();
        }
    }

    void m6144a(ConnectionResult connectionResult) {
        this.f4201k.lock();
        try {
            this.f4213w = connectionResult;
            this.f4212v = new C1208o(this);
            this.f4212v.mo858a();
            this.f4202l.signalAll();
        } finally {
            this.f4201k.unlock();
        }
    }

    public void mo878a(C0650b c0650b) {
        this.f4191a.m6413a(c0650b);
    }

    public void mo879a(C0651c c0651c) {
        this.f4191a.m6414a(c0651c);
    }

    void m6147a(C1185b c1185b) {
        this.f4210t.sendMessage(this.f4210t.obtainMessage(3, c1185b));
    }

    <A extends C0653c> void m6148a(C0782e<A> c0782e) {
        this.f4200j.add(c0782e);
        c0782e.mo566a(this.f4215y);
    }

    void m6149a(RuntimeException runtimeException) {
        this.f4210t.sendMessage(this.f4210t.obtainMessage(4, runtimeException));
    }

    public void mo880a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("mState=").append(this.f4212v.mo865d());
        printWriter.append(" mResuming=").print(this.f4207q);
        printWriter.append(" mWorkQueue.size()=").print(this.f4192b.size());
        printWriter.append(" mUnconsumedRunners.size()=").println(this.f4200j.size());
        String str2 = str + "  ";
        for (C1173a c1173a : this.f4198h.keySet()) {
            printWriter.append(str).append(c1173a.m5983e()).println(":");
            ((C0653c) this.f4194d.get(c1173a.m5981c())).mo509a(str2, fileDescriptor, printWriter, strArr);
        }
    }

    public boolean mo881a(C1173a<?> c1173a) {
        return this.f4194d.containsKey(c1173a.m5981c());
    }

    public <A extends C0653c, T extends C0783a<? extends C0774g, A>> T mo882b(T t) {
        C1305x.m6626b(t.mo571f() != null, "This task can not be executed (it's probably a Batch or malformed)");
        this.f4201k.lock();
        try {
            if (m6164j()) {
                this.f4192b.add(t);
                while (!this.f4192b.isEmpty()) {
                    C0782e c0782e = (C0782e) this.f4192b.remove();
                    m6148a(c0782e);
                    c0782e.mo569d(Status.f4096c);
                }
            } else {
                t = this.f4212v.mo862b(t);
                this.f4201k.unlock();
            }
            return t;
        } finally {
            this.f4201k.unlock();
        }
    }

    public void mo883b() {
        this.f4201k.lock();
        try {
            this.f4212v.mo864c();
        } finally {
            this.f4201k.unlock();
        }
    }

    public void mo884b(C0650b c0650b) {
        this.f4191a.m6416b(c0650b);
    }

    public void mo885b(C0651c c0651c) {
        this.f4191a.m6417b(c0651c);
    }

    public boolean mo886b(C1173a<?> c1173a) {
        C0653c c0653c = (C0653c) this.f4194d.get(c1173a.m5981c());
        return c0653c == null ? false : c0653c.mo512e();
    }

    public void mo887c() {
        this.f4201k.lock();
        try {
            m6166l();
            this.f4212v.mo863b();
        } finally {
            this.f4201k.unlock();
        }
    }

    public boolean mo888d() {
        return this.f4212v instanceof C1188m;
    }

    public boolean mo889e() {
        return this.f4212v instanceof C1207n;
    }

    void m6160f() {
        for (C0782e c0782e : this.f4200j) {
            c0782e.mo566a(null);
            c0782e.m3700c();
        }
        this.f4200j.clear();
        for (C1218s a : this.f4214x) {
            a.m6169a();
        }
        this.f4214x.clear();
    }

    void m6161g() {
        for (C0653c d : this.f4194d.values()) {
            d.mo511d();
        }
    }

    void m6162h() {
        this.f4201k.lock();
        try {
            this.f4212v = new C1207n(this, this.f4197g, this.f4198h, this.f4211u, this.f4199i, this.f4201k, this.f4205o);
            this.f4212v.mo858a();
            this.f4202l.signalAll();
        } finally {
            this.f4201k.unlock();
        }
    }

    void m6163i() {
        this.f4201k.lock();
        try {
            m6166l();
            this.f4212v = new C1188m(this);
            this.f4212v.mo858a();
            this.f4202l.signalAll();
        } finally {
            this.f4201k.unlock();
        }
    }

    boolean m6164j() {
        return this.f4207q;
    }

    void m6165k() {
        if (!m6164j()) {
            this.f4207q = true;
            if (this.f4193c == null) {
                this.f4193c = new C1215c(this);
                IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                intentFilter.addDataScheme("package");
                this.f4205o.getApplicationContext().registerReceiver(this.f4193c, intentFilter);
            }
            this.f4210t.sendMessageDelayed(this.f4210t.obtainMessage(1), this.f4208r);
            this.f4210t.sendMessageDelayed(this.f4210t.obtainMessage(2), this.f4209s);
        }
    }

    boolean m6166l() {
        if (!m6164j()) {
            return false;
        }
        this.f4207q = false;
        this.f4210t.removeMessages(2);
        this.f4210t.removeMessages(1);
        if (this.f4193c != null) {
            this.f4205o.getApplicationContext().unregisterReceiver(this.f4193c);
            this.f4193c = null;
        }
        return true;
    }

    public int m6167m() {
        return System.identityHashCode(this);
    }
}
