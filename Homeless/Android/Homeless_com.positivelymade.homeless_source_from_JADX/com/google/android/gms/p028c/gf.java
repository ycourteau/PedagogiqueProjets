package com.google.android.gms.p028c;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.gms.ads.internal.C0618p;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.C1241e;
import com.google.android.gms.p028c.gm.C0975b;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.Future;

@fn
public class gf implements C0975b {
    private final Object f3304a = new Object();
    private final String f3305b;
    private final gg f3306c;
    private C1152y f3307d;
    private BigInteger f3308e = BigInteger.ONE;
    private final HashSet<ge> f3309f = new HashSet();
    private final HashMap<String, gi> f3310g = new HashMap();
    private boolean f3311h = false;
    private boolean f3312i = true;
    private int f3313j = 0;
    private boolean f3314k = false;
    private Context f3315l;
    private VersionInfoParcel f3316m;
    private bc f3317n = null;
    private boolean f3318o = true;
    private ak f3319p = null;
    private al f3320q = null;
    private aj f3321r = null;
    private final LinkedList<Thread> f3322s = new LinkedList();
    private final fm f3323t = null;
    private Boolean f3324u = null;
    private String f3325v;
    private boolean f3326w = false;

    public gf(go goVar) {
        this.f3305b = goVar.m4875c();
        this.f3306c = new gg(this.f3305b);
    }

    public Bundle m4770a(Context context, gh ghVar, String str) {
        Bundle bundle;
        synchronized (this.f3304a) {
            bundle = new Bundle();
            bundle.putBundle("app", this.f3306c.m4799a(context, str));
            Bundle bundle2 = new Bundle();
            for (String str2 : this.f3310g.keySet()) {
                bundle2.putBundle(str2, ((gi) this.f3310g.get(str2)).m4803a());
            }
            bundle.putBundle("slots", bundle2);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f3309f.iterator();
            while (it.hasNext()) {
                arrayList.add(((ge) it.next()).m4768d());
            }
            bundle.putParcelableArrayList("ads", arrayList);
            ghVar.mo350a(this.f3309f);
            this.f3309f.clear();
        }
        return bundle;
    }

    public al m4771a(Context context) {
        if (!((Boolean) az.f2458J.m3878c()).booleanValue() || !is.m5288d() || m4785b()) {
            return null;
        }
        synchronized (this.f3304a) {
            if (this.f3319p == null) {
                if (context instanceof Activity) {
                    this.f3319p = new ak((Application) context.getApplicationContext(), (Activity) context);
                } else {
                    return null;
                }
            }
            if (this.f3321r == null) {
                this.f3321r = new aj();
            }
            if (this.f3320q == null) {
                this.f3320q = new al(this.f3319p, this.f3321r, new fm(this.f3315l, this.f3316m, null, null));
            }
            this.f3320q.m3822a();
            al alVar = this.f3320q;
            return alVar;
        }
    }

    public String m4772a() {
        return this.f3305b;
    }

    public String m4773a(int i, String str) {
        Resources resources = this.f3316m.f1979e ? this.f3315l.getResources() : C1241e.m6289d(this.f3315l);
        return resources == null ? str : resources.getString(i);
    }

    public Future m4774a(Context context, boolean z) {
        Future a;
        synchronized (this.f3304a) {
            if (z != this.f3312i) {
                this.f3312i = z;
                a = gm.m4816a(context, z);
            } else {
                a = null;
            }
        }
        return a;
    }

    public void m4775a(Context context, VersionInfoParcel versionInfoParcel) {
        synchronized (this.f3304a) {
            if (!this.f3314k) {
                this.f3315l = context.getApplicationContext();
                this.f3316m = versionInfoParcel;
                gm.m4815a(context, (C0975b) this);
                gm.m4818b(context, this);
                m4780a(Thread.currentThread());
                this.f3325v = C0618p.m2796e().m4841a(context, versionInfoParcel.f1976b);
                this.f3307d = new C1152y(context.getApplicationContext(), this.f3316m, new cv(context.getApplicationContext(), this.f3316m, (String) az.f2476b.m3878c()));
                m4796m();
                C0618p.m2806o().m2882a(this.f3315l);
                this.f3314k = true;
            }
        }
    }

    public void mo736a(Bundle bundle) {
        synchronized (this.f3304a) {
            this.f3312i = bundle.containsKey("use_https") ? bundle.getBoolean("use_https") : this.f3312i;
            this.f3313j = bundle.containsKey("webview_cache_version") ? bundle.getInt("webview_cache_version") : this.f3313j;
        }
    }

    public void m4777a(ge geVar) {
        synchronized (this.f3304a) {
            this.f3309f.add(geVar);
        }
    }

    public void m4778a(Boolean bool) {
        synchronized (this.f3304a) {
            this.f3324u = bool;
        }
    }

    public void m4779a(String str, gi giVar) {
        synchronized (this.f3304a) {
            this.f3310g.put(str, giVar);
        }
    }

    public void m4780a(Thread thread) {
        fm.m4615a(this.f3315l, thread, this.f3316m);
    }

    public void m4781a(Throwable th, boolean z) {
        new fm(this.f3315l, this.f3316m, null, null).m4618a(th, z);
    }

    public void m4782a(HashSet<ge> hashSet) {
        synchronized (this.f3304a) {
            this.f3309f.addAll(hashSet);
        }
    }

    public void m4783a(boolean z) {
        synchronized (this.f3304a) {
            this.f3318o = z;
        }
    }

    public void m4784b(boolean z) {
        synchronized (this.f3304a) {
            this.f3326w = z;
        }
    }

    public boolean m4785b() {
        boolean z;
        synchronized (this.f3304a) {
            z = this.f3318o;
        }
        return z;
    }

    public String m4786c() {
        String bigInteger;
        synchronized (this.f3304a) {
            bigInteger = this.f3308e.toString();
            this.f3308e = this.f3308e.add(BigInteger.ONE);
        }
        return bigInteger;
    }

    public gg m4787d() {
        gg ggVar;
        synchronized (this.f3304a) {
            ggVar = this.f3306c;
        }
        return ggVar;
    }

    public bc m4788e() {
        bc bcVar;
        synchronized (this.f3304a) {
            bcVar = this.f3317n;
        }
        return bcVar;
    }

    public boolean m4789f() {
        boolean z;
        synchronized (this.f3304a) {
            z = this.f3311h;
            this.f3311h = true;
        }
        return z;
    }

    public boolean m4790g() {
        boolean z;
        synchronized (this.f3304a) {
            z = this.f3312i;
        }
        return z;
    }

    public String m4791h() {
        String str;
        synchronized (this.f3304a) {
            str = this.f3325v;
        }
        return str;
    }

    public Boolean m4792i() {
        Boolean bool;
        synchronized (this.f3304a) {
            bool = this.f3324u;
        }
        return bool;
    }

    public C1152y m4793j() {
        return this.f3307d;
    }

    public boolean m4794k() {
        boolean z;
        synchronized (this.f3304a) {
            if (this.f3313j < ((Integer) az.f2472X.m3878c()).intValue()) {
                this.f3313j = ((Integer) az.f2472X.m3878c()).intValue();
                gm.m4814a(this.f3315l, this.f3313j);
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public boolean m4795l() {
        boolean z;
        synchronized (this.f3304a) {
            z = this.f3326w;
        }
        return z;
    }

    void m4796m() {
        try {
            this.f3317n = C0618p.m2801j().m3911a(new ba(this.f3315l, this.f3316m.f1976b));
        } catch (Throwable e) {
            C0691b.m3102d("Cannot initialize CSI reporter.", e);
        }
    }
}
