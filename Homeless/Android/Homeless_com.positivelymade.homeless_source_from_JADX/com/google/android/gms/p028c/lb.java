package com.google.android.gms.p028c;

import android.content.Context;
import com.google.android.gms.p032d.aj;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class lb {
    private final ScheduledExecutorService f3936a;
    private ScheduledFuture<?> f3937b;
    private String f3938c;
    private boolean f3939d;

    public lb() {
        this(Executors.newSingleThreadScheduledExecutor());
    }

    public lb(String str) {
        this(Executors.newSingleThreadScheduledExecutor());
        this.f3938c = str;
    }

    lb(ScheduledExecutorService scheduledExecutorService) {
        this.f3937b = null;
        this.f3938c = null;
        this.f3936a = scheduledExecutorService;
        this.f3939d = false;
    }

    public void m5676a(Context context, kp kpVar, long j, kz kzVar) {
        synchronized (this) {
            aj.m7041d("ResourceLoaderScheduler: Loading new resource.");
            if (this.f3937b != null) {
                return;
            }
            this.f3937b = this.f3936a.schedule(this.f3938c != null ? new la(context, kpVar, kzVar, this.f3938c) : new la(context, kpVar, kzVar), j, TimeUnit.MILLISECONDS);
        }
    }
}
