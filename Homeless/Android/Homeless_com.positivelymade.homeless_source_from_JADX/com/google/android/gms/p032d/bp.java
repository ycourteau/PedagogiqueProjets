package com.google.android.gms.p032d;

import android.content.Context;
import com.google.android.gms.p032d.cz.C1564b;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

class bp implements C1564b {
    private final String f4717a;
    private final Context f4718b;
    private final ScheduledExecutorService f4719c;
    private final C1562a f4720d;
    private ScheduledFuture<?> f4721e;
    private boolean f4722f;
    private dc f4723g;
    private String f4724h;

    interface C1560b {
        ScheduledExecutorService mo1015a();
    }

    class C15611 implements C1560b {
        final /* synthetic */ bp f4715a;

        C15611(bp bpVar) {
            this.f4715a = bpVar;
        }

        public ScheduledExecutorService mo1015a() {
            return Executors.newSingleThreadScheduledExecutor();
        }
    }

    interface C1562a {
    }

    class C15632 implements C1562a {
        final /* synthetic */ bp f4716a;

        C15632(bp bpVar) {
            this.f4716a = bpVar;
        }
    }

    public bp(Context context, String str, dc dcVar) {
        this(context, str, dcVar, null, null);
    }

    bp(Context context, String str, dc dcVar, C1560b c1560b, C1562a c1562a) {
        this.f4723g = dcVar;
        this.f4718b = context;
        this.f4717a = str;
        if (c1560b == null) {
            c1560b = new C15611(this);
        }
        this.f4719c = c1560b.mo1015a();
        if (c1562a == null) {
            this.f4720d = new C15632(this);
        } else {
            this.f4720d = c1562a;
        }
    }

    private synchronized void m7167a() {
        if (this.f4722f) {
            throw new IllegalStateException("called method after closed");
        }
    }

    public synchronized void mo1016a(String str) {
        m7167a();
        this.f4724h = str;
    }

    public synchronized void mo627b() {
        m7167a();
        if (this.f4721e != null) {
            this.f4721e.cancel(false);
        }
        this.f4719c.shutdown();
        this.f4722f = true;
    }
}
