package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.IBinder;
import android.os.Message;
import com.google.android.gms.common.stats.C1530b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

final class C1286o extends C1282n implements Callback {
    private final HashMap<C1283a, C1285b> f4401a = new HashMap();
    private final Context f4402b;
    private final Handler f4403c;
    private final C1530b f4404d;
    private final long f4405e;

    private static final class C1283a {
        private final String f4390a;
        private final ComponentName f4391b = null;

        public C1283a(String str) {
            this.f4390a = C1305x.m6619a(str);
        }

        public Intent m6421a() {
            return this.f4390a != null ? new Intent(this.f4390a).setPackage("com.google.android.gms") : new Intent().setComponent(this.f4391b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1283a)) {
                return false;
            }
            C1283a c1283a = (C1283a) obj;
            return C1304w.m6615a(this.f4390a, c1283a.f4390a) && C1304w.m6615a(this.f4391b, c1283a.f4391b);
        }

        public int hashCode() {
            return C1304w.m6613a(this.f4390a, this.f4391b);
        }

        public String toString() {
            return this.f4390a == null ? this.f4391b.flattenToString() : this.f4390a;
        }
    }

    private final class C1285b {
        final /* synthetic */ C1286o f4393a;
        private final C1284a f4394b = new C1284a(this);
        private final Set<ServiceConnection> f4395c = new HashSet();
        private int f4396d = 2;
        private boolean f4397e;
        private IBinder f4398f;
        private final C1283a f4399g;
        private ComponentName f4400h;

        public class C1284a implements ServiceConnection {
            final /* synthetic */ C1285b f4392a;

            public C1284a(C1285b c1285b) {
                this.f4392a = c1285b;
            }

            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                synchronized (this.f4392a.f4393a.f4401a) {
                    this.f4392a.f4398f = iBinder;
                    this.f4392a.f4400h = componentName;
                    for (ServiceConnection onServiceConnected : this.f4392a.f4395c) {
                        onServiceConnected.onServiceConnected(componentName, iBinder);
                    }
                    this.f4392a.f4396d = 1;
                }
            }

            public void onServiceDisconnected(ComponentName componentName) {
                synchronized (this.f4392a.f4393a.f4401a) {
                    this.f4392a.f4398f = null;
                    this.f4392a.f4400h = componentName;
                    for (ServiceConnection onServiceDisconnected : this.f4392a.f4395c) {
                        onServiceDisconnected.onServiceDisconnected(componentName);
                    }
                    this.f4392a.f4396d = 2;
                }
            }
        }

        public C1285b(C1286o c1286o, C1283a c1283a) {
            this.f4393a = c1286o;
            this.f4399g = c1283a;
        }

        public void m6427a(ServiceConnection serviceConnection, String str) {
            this.f4393a.f4404d.m6964a(this.f4393a.f4402b, serviceConnection, str, this.f4399g.m6421a());
            this.f4395c.add(serviceConnection);
        }

        public void m6428a(String str) {
            this.f4397e = this.f4393a.f4404d.m6966a(this.f4393a.f4402b, str, this.f4399g.m6421a(), this.f4394b, 129);
            if (this.f4397e) {
                this.f4396d = 3;
                return;
            }
            try {
                this.f4393a.f4404d.m6963a(this.f4393a.f4402b, this.f4394b);
            } catch (IllegalArgumentException e) {
            }
        }

        public boolean m6429a() {
            return this.f4397e;
        }

        public boolean m6430a(ServiceConnection serviceConnection) {
            return this.f4395c.contains(serviceConnection);
        }

        public int m6431b() {
            return this.f4396d;
        }

        public void m6432b(ServiceConnection serviceConnection, String str) {
            this.f4393a.f4404d.m6967b(this.f4393a.f4402b, serviceConnection);
            this.f4395c.remove(serviceConnection);
        }

        public void m6433b(String str) {
            this.f4393a.f4404d.m6963a(this.f4393a.f4402b, this.f4394b);
            this.f4397e = false;
            this.f4396d = 2;
        }

        public boolean m6434c() {
            return this.f4395c.isEmpty();
        }

        public IBinder m6435d() {
            return this.f4398f;
        }

        public ComponentName m6436e() {
            return this.f4400h;
        }
    }

    C1286o(Context context) {
        this.f4402b = context.getApplicationContext();
        this.f4403c = new Handler(context.getMainLooper(), this);
        this.f4404d = C1530b.m6956a();
        this.f4405e = 5000;
    }

    private boolean m6438a(C1283a c1283a, ServiceConnection serviceConnection, String str) {
        boolean a;
        C1305x.m6618a((Object) serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.f4401a) {
            C1285b c1285b = (C1285b) this.f4401a.get(c1283a);
            if (c1285b != null) {
                this.f4403c.removeMessages(0, c1285b);
                if (!c1285b.m6430a(serviceConnection)) {
                    c1285b.m6427a(serviceConnection, str);
                    switch (c1285b.m6431b()) {
                        case 1:
                            serviceConnection.onServiceConnected(c1285b.m6436e(), c1285b.m6435d());
                            break;
                        case 2:
                            c1285b.m6428a(str);
                            break;
                        default:
                            break;
                    }
                }
                throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + c1283a);
            }
            c1285b = new C1285b(this, c1283a);
            c1285b.m6427a(serviceConnection, str);
            c1285b.m6428a(str);
            this.f4401a.put(c1283a, c1285b);
            a = c1285b.m6429a();
        }
        return a;
    }

    private void m6440b(C1283a c1283a, ServiceConnection serviceConnection, String str) {
        C1305x.m6618a((Object) serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.f4401a) {
            C1285b c1285b = (C1285b) this.f4401a.get(c1283a);
            if (c1285b == null) {
                throw new IllegalStateException("Nonexistent connection status for service config: " + c1283a);
            } else if (c1285b.m6430a(serviceConnection)) {
                c1285b.m6432b(serviceConnection, str);
                if (c1285b.m6434c()) {
                    this.f4403c.sendMessageDelayed(this.f4403c.obtainMessage(0, c1285b), this.f4405e);
                }
            } else {
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + c1283a);
            }
        }
    }

    public boolean mo914a(String str, ServiceConnection serviceConnection, String str2) {
        return m6438a(new C1283a(str), serviceConnection, str2);
    }

    public void mo915b(String str, ServiceConnection serviceConnection, String str2) {
        m6440b(new C1283a(str), serviceConnection, str2);
    }

    public boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                C1285b c1285b = (C1285b) message.obj;
                synchronized (this.f4401a) {
                    if (c1285b.m6434c()) {
                        if (c1285b.m6429a()) {
                            c1285b.m6433b("GmsClientSupervisor");
                        }
                        this.f4401a.remove(c1285b.f4399g);
                    }
                }
                return true;
            default:
                return false;
        }
    }
}
