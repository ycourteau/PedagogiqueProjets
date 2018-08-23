package com.google.android.gms.p028c;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.C1305x;
import java.util.HashMap;
import java.util.Map;

public final class jy implements ActivityLifecycleCallbacks {
    private final jo f3807a;
    private final Map<Activity, jv> f3808b = new HashMap();

    public jy(jo joVar) {
        C1305x.m6617a((Object) joVar);
        this.f3807a = joVar;
    }

    jv m5498a(Activity activity, int i) {
        C1305x.m6617a((Object) activity);
        jv jvVar = (jv) this.f3808b.get(activity);
        if (jvVar == null) {
            jvVar = i == 0 ? new jv(true) : new jv(true, i);
            jvVar.m5466a(activity.getClass().getCanonicalName());
            this.f3808b.put(activity, jvVar);
        }
        return jvVar;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (bundle != null) {
            Bundle bundle2 = bundle.getBundle("com.google.android.gms.measurement.screen_view");
            if (bundle2 != null) {
                int i = bundle2.getInt("id");
                if (i <= 0) {
                    Log.w("com.google.android.gms.measurement.internal.ActivityLifecycleTracker", "Invalid screenId in saved activity state");
                    return;
                }
                jv a = m5498a(activity, i);
                a.m5466a(bundle2.getString("name"));
                a.m5469b(bundle2.getInt("referrer_id"));
                a.m5470b(bundle2.getString("referrer_name"));
                a.m5471b(bundle2.getBoolean("interstitial"));
                a.m5478h();
            }
        }
    }

    public void onActivityDestroyed(Activity activity) {
        this.f3808b.remove(activity);
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        if (bundle != null) {
            jv jvVar = (jv) this.f3808b.get(activity);
            if (jvVar != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putInt("id", jvVar.m5472c());
                bundle2.putString("name", jvVar.m5468b());
                bundle2.putInt("referrer_id", jvVar.m5474d());
                bundle2.putString("referrer_name", jvVar.m5475e());
                bundle2.putBoolean("interstitial", jvVar.m5479i());
                bundle.putBundle("com.google.android.gms.measurement.screen_view", bundle2);
            }
        }
    }

    public void onActivityStarted(Activity activity) {
        this.f3807a.m5388a(m5498a(activity, 0), activity);
    }

    public void onActivityStopped(Activity activity) {
    }
}
