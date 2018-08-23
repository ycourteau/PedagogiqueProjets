package com.google.android.gms.common.stats;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Debug;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.C1253f;
import com.google.android.gms.common.stats.C1533c.C1531a;
import com.google.android.gms.p028c.ij;
import com.google.android.gms.p028c.it;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class C1530b {
    private static final Object f4587a = new Object();
    private static C1530b f4588b;
    private static final ComponentName f4589g = new ComponentName("com.google.android.gms", "com.google.android.gms.common.stats.GmsCoreStatsService");
    private static Integer f4590i;
    private final List<String> f4591c;
    private final List<String> f4592d;
    private final List<String> f4593e;
    private final List<String> f4594f;
    private C1535e f4595h;

    private C1530b() {
        if (C1530b.m6961b() == C1534d.f4605a) {
            this.f4591c = Collections.EMPTY_LIST;
            this.f4592d = Collections.EMPTY_LIST;
            this.f4593e = Collections.EMPTY_LIST;
            this.f4594f = Collections.EMPTY_LIST;
            return;
        }
        String str = (String) C1531a.f4597b.m5185c();
        this.f4591c = str == null ? Collections.EMPTY_LIST : Arrays.asList(str.split(","));
        str = (String) C1531a.f4598c.m5185c();
        this.f4592d = str == null ? Collections.EMPTY_LIST : Arrays.asList(str.split(","));
        str = (String) C1531a.f4599d.m5185c();
        this.f4593e = str == null ? Collections.EMPTY_LIST : Arrays.asList(str.split(","));
        str = (String) C1531a.f4600e.m5185c();
        this.f4594f = str == null ? Collections.EMPTY_LIST : Arrays.asList(str.split(","));
        this.f4595h = new C1535e(1024, ((Long) C1531a.f4601f.m5185c()).longValue());
    }

    public static C1530b m6956a() {
        synchronized (f4587a) {
            if (f4588b == null) {
                f4588b = new C1530b();
            }
        }
        return f4588b;
    }

    private String m6957a(ServiceConnection serviceConnection) {
        return String.valueOf((Process.myPid() << 32) | System.identityHashCode(serviceConnection));
    }

    private void m6958a(Context context, ServiceConnection serviceConnection, String str, Intent intent, int i) {
        if (C1253f.f4324a) {
            String a = m6957a(serviceConnection);
            if (m6960a(context, str, intent, a, i)) {
                Parcelable connectionEvent;
                long currentTimeMillis = System.currentTimeMillis();
                String str2 = null;
                if ((C1530b.m6961b() & C1534d.f4609e) != 0) {
                    str2 = it.m5296a(3, 5);
                }
                long j = 0;
                if ((C1530b.m6961b() & C1534d.f4611g) != 0) {
                    j = Debug.getNativeHeapAllocatedSize();
                }
                if (i == 1 || i == 4) {
                    connectionEvent = new ConnectionEvent(currentTimeMillis, i, null, null, null, null, str2, a, SystemClock.elapsedRealtime(), j);
                } else {
                    ServiceInfo b = C1530b.m6962b(context, intent);
                    connectionEvent = new ConnectionEvent(currentTimeMillis, i, it.m5297a(context), str, b.processName, b.name, str2, a, SystemClock.elapsedRealtime(), j);
                }
                context.startService(new Intent().setComponent(f4589g).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", connectionEvent));
            }
        }
    }

    private boolean m6959a(Context context, Intent intent) {
        ComponentName component = intent.getComponent();
        return (component == null || (C1253f.f4324a && "com.google.android.gms".equals(component.getPackageName()))) ? false : ij.m5264a(context, component.getPackageName());
    }

    private boolean m6960a(Context context, String str, Intent intent, String str2, int i) {
        int b = C1530b.m6961b();
        if (b == C1534d.f4605a || this.f4595h == null) {
            return false;
        }
        if (i == 4 || i == 1) {
            return this.f4595h.m6970b(str2);
        } else {
            ServiceInfo b2 = C1530b.m6962b(context, intent);
            if (b2 == null) {
                Log.w("ConnectionTracker", String.format("Client %s made an invalid request %s", new Object[]{str, intent.toUri(0)}));
                return false;
            }
            String a = it.m5297a(context);
            String str3 = b2.processName;
            String str4 = b2.name;
            if (this.f4591c.contains(a) || this.f4592d.contains(str) || this.f4593e.contains(str3) || this.f4594f.contains(str4)) {
                return false;
            }
            if (str3.equals(a) && (b & C1534d.f4610f) != 0) {
                return false;
            }
            this.f4595h.m6969a(str2);
            return true;
        }
    }

    private static int m6961b() {
        if (f4590i == null) {
            try {
                f4590i = Integer.valueOf(ij.m5263a() ? ((Integer) C1531a.f4596a.m5185c()).intValue() : C1534d.f4605a);
            } catch (SecurityException e) {
                f4590i = Integer.valueOf(C1534d.f4605a);
            }
        }
        return f4590i.intValue();
    }

    private static ServiceInfo m6962b(Context context, Intent intent) {
        List queryIntentServices = context.getPackageManager().queryIntentServices(intent, 128);
        if (queryIntentServices == null || queryIntentServices.size() == 0) {
            Log.w("ConnectionTracker", String.format("There are no handler of this intent: %s\n Stack trace: %s", new Object[]{intent.toUri(0), it.m5296a(3, 20)}));
            return null;
        }
        if (queryIntentServices.size() > 1) {
            Log.w("ConnectionTracker", String.format("Multiple handlers found for this intent: %s\n Stack trace: %s", new Object[]{intent.toUri(0), it.m5296a(3, 20)}));
            Iterator it = queryIntentServices.iterator();
            if (it.hasNext()) {
                Log.w("ConnectionTracker", ((ResolveInfo) it.next()).serviceInfo.name);
                return null;
            }
        }
        return ((ResolveInfo) queryIntentServices.get(0)).serviceInfo;
    }

    public void m6963a(Context context, ServiceConnection serviceConnection) {
        context.unbindService(serviceConnection);
        m6958a(context, serviceConnection, null, null, 1);
    }

    public void m6964a(Context context, ServiceConnection serviceConnection, String str, Intent intent) {
        m6958a(context, serviceConnection, str, intent, 3);
    }

    public boolean m6965a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return m6966a(context, context.getClass().getName(), intent, serviceConnection, i);
    }

    public boolean m6966a(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        if (m6959a(context, intent)) {
            Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
            return false;
        }
        boolean bindService = context.bindService(intent, serviceConnection, i);
        if (bindService) {
            m6958a(context, serviceConnection, str, intent, 2);
        }
        return bindService;
    }

    public void m6967b(Context context, ServiceConnection serviceConnection) {
        m6958a(context, serviceConnection, null, null, 4);
    }
}
