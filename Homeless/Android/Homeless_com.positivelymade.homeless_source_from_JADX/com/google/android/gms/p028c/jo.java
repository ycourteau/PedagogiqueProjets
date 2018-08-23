package com.google.android.gms.p028c;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C1305x;
import java.util.ArrayList;
import java.util.List;

public class jo {
    private static final C0579a[] f3756a = new C0579a[0];
    private static jo f3757b;
    private final Application f3758c;
    private jv f3759d;
    private final List<C0579a> f3760e = new ArrayList();
    private jy f3761f;

    public interface C0579a {
        void mo446a(jv jvVar);

        void mo447a(jv jvVar, Activity activity);
    }

    private jo(Application application) {
        C1305x.m6617a((Object) application);
        this.f3758c = application;
    }

    public static jo m5384a(Context context) {
        jo joVar;
        C1305x.m6617a((Object) context);
        Object obj = (Application) context.getApplicationContext();
        C1305x.m6617a(obj);
        synchronized (jo.class) {
            if (f3757b == null) {
                f3757b = new jo(obj);
            }
            joVar = f3757b;
        }
        return joVar;
    }

    private C0579a[] m5385d() {
        C0579a[] c0579aArr;
        synchronized (this.f3760e) {
            if (this.f3760e.isEmpty()) {
                c0579aArr = f3756a;
            } else {
                c0579aArr = (C0579a[]) this.f3760e.toArray(new C0579a[this.f3760e.size()]);
            }
        }
        return c0579aArr;
    }

    public jv m5386a() {
        return this.f3759d;
    }

    public void m5387a(C0579a c0579a) {
        C1305x.m6617a((Object) c0579a);
        synchronized (this.f3760e) {
            this.f3760e.remove(c0579a);
            this.f3760e.add(c0579a);
        }
    }

    public void m5388a(jv jvVar, Activity activity) {
        int i = 0;
        C1305x.m6617a((Object) jvVar);
        C0579a[] c0579aArr = null;
        if (jvVar.m5477g()) {
            if (activity instanceof jn) {
                ((jn) activity).m5383a(jvVar);
            }
            if (this.f3759d != null) {
                jvVar.m5469b(this.f3759d.m5472c());
                jvVar.m5470b(this.f3759d.m5468b());
            }
            C0579a[] d = m5385d();
            for (C0579a a : d) {
                a.mo447a(jvVar, activity);
            }
            jvVar.m5478h();
            if (!TextUtils.isEmpty(jvVar.m5468b())) {
                c0579aArr = d;
            } else {
                return;
            }
        }
        if (this.f3759d == null || this.f3759d.m5472c() != jvVar.m5472c()) {
            m5390b();
            this.f3759d = jvVar;
            if (c0579aArr == null) {
                c0579aArr = m5385d();
            }
            while (i < c0579aArr.length) {
                c0579aArr[i].mo446a(jvVar);
                i++;
            }
            return;
        }
        this.f3759d = jvVar;
    }

    public void m5389a(boolean z) {
        if (VERSION.SDK_INT < 14) {
            Log.i("com.google.android.gms.measurement.ScreenViewService", "AutoScreeViewTracking is not supported on API 14 or earlier devices");
        } else if (m5391c() == z) {
        } else {
            if (z) {
                this.f3761f = new jy(this);
                this.f3758c.registerActivityLifecycleCallbacks(this.f3761f);
                return;
            }
            this.f3758c.unregisterActivityLifecycleCallbacks(this.f3761f);
            this.f3761f = null;
        }
    }

    public void m5390b() {
        this.f3759d = null;
    }

    public boolean m5391c() {
        return this.f3761f != null;
    }
}
