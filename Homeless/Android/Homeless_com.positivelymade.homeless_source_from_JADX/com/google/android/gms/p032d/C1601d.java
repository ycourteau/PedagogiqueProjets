package com.google.android.gms.p032d;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Looper;
import com.google.android.gms.common.api.C0777e;
import com.google.android.gms.p032d.C1585c.C1584b;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class C1601d {
    private static C1601d f4914g;
    private final C1598a f4915a;
    private final Context f4916b;
    private final C1585c f4917c;
    private final bw f4918d;
    private final ConcurrentMap<cy, Boolean> f4919e;
    private final dc f4920f;

    class C15971 implements C1584b {
        final /* synthetic */ C1601d f4912a;

        C15971(C1601d c1601d) {
            this.f4912a = c1601d;
        }

        public void mo1029a(Map<String, Object> map) {
            Object obj = map.get("event");
            if (obj != null) {
                this.f4912a.m7412a(obj.toString());
            }
        }
    }

    public interface C1598a {
        cz mo1034a(Context context, C1601d c1601d, Looper looper, String str, int i, dc dcVar);
    }

    static class C15992 implements C1598a {
        C15992() {
        }

        public cz mo1034a(Context context, C1601d c1601d, Looper looper, String str, int i, dc dcVar) {
            return new cz(context, c1601d, looper, str, i, dcVar);
        }
    }

    class C16003 implements ComponentCallbacks2 {
        final /* synthetic */ C1601d f4913a;

        C16003(C1601d c1601d) {
            this.f4913a = c1601d;
        }

        public void onConfigurationChanged(Configuration configuration) {
        }

        public void onLowMemory() {
        }

        public void onTrimMemory(int i) {
            if (i == 20) {
                this.f4913a.m7417b();
            }
        }
    }

    C1601d(Context context, C1598a c1598a, C1585c c1585c, bw bwVar) {
        if (context == null) {
            throw new NullPointerException("context cannot be null");
        }
        this.f4916b = context.getApplicationContext();
        this.f4918d = bwVar;
        this.f4915a = c1598a;
        this.f4919e = new ConcurrentHashMap();
        this.f4917c = c1585c;
        this.f4917c.m7267a(new C15971(this));
        this.f4917c.m7267a(new cd(this.f4916b));
        this.f4920f = new dc();
        m7413c();
    }

    public static C1601d m7410a(Context context) {
        C1601d c1601d;
        synchronized (C1601d.class) {
            if (f4914g == null) {
                if (context == null) {
                    aj.m7036a("TagManager.getInstance requires non-null context.");
                    throw new NullPointerException();
                }
                f4914g = new C1601d(context, new C15992(), new C1585c(new dg(context)), bx.m7227c());
            }
            c1601d = f4914g;
        }
        return c1601d;
    }

    private void m7412a(String str) {
        for (cy a : this.f4919e.keySet()) {
            a.m7392a(str);
        }
    }

    private void m7413c() {
        if (VERSION.SDK_INT >= 14) {
            this.f4916b.registerComponentCallbacks(new C16003(this));
        }
    }

    public C0777e<C1554b> m7414a(String str, int i, String str2) {
        C0777e a = this.f4915a.mo1034a(this.f4916b, this, null, str, i, this.f4920f);
        a.m7404a(str2);
        return a;
    }

    public C1585c m7415a() {
        return this.f4917c;
    }

    void m7416a(cy cyVar) {
        this.f4919e.put(cyVar, Boolean.valueOf(true));
    }

    public void m7417b() {
        this.f4918d.mo1020a();
    }

    boolean m7418b(cy cyVar) {
        return this.f4919e.remove(cyVar) != null;
    }
}
