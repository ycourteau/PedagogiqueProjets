package com.google.android.gms.p028c;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.C0618p;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

@fn
public class ge {
    private final gf f3292a;
    private final LinkedList<C0974a> f3293b;
    private final Object f3294c;
    private final String f3295d;
    private final String f3296e;
    private long f3297f;
    private long f3298g;
    private boolean f3299h;
    private long f3300i;
    private long f3301j;
    private long f3302k;
    private long f3303l;

    @fn
    private static final class C0974a {
        private long f3290a = -1;
        private long f3291b = -1;

        public long m4756a() {
            return this.f3291b;
        }

        public void m4757b() {
            this.f3291b = SystemClock.elapsedRealtime();
        }

        public void m4758c() {
            this.f3290a = SystemClock.elapsedRealtime();
        }

        public Bundle m4759d() {
            Bundle bundle = new Bundle();
            bundle.putLong("topen", this.f3290a);
            bundle.putLong("tclose", this.f3291b);
            return bundle;
        }
    }

    public ge(gf gfVar, String str, String str2) {
        this.f3294c = new Object();
        this.f3297f = -1;
        this.f3298g = -1;
        this.f3299h = false;
        this.f3300i = -1;
        this.f3301j = 0;
        this.f3302k = -1;
        this.f3303l = -1;
        this.f3292a = gfVar;
        this.f3295d = str;
        this.f3296e = str2;
        this.f3293b = new LinkedList();
    }

    public ge(String str, String str2) {
        this(C0618p.m2799h(), str, str2);
    }

    public void m4760a() {
        synchronized (this.f3294c) {
            if (this.f3303l != -1 && this.f3298g == -1) {
                this.f3298g = SystemClock.elapsedRealtime();
                this.f3292a.m4777a(this);
            }
            this.f3292a.m4787d().m4802c();
        }
    }

    public void m4761a(long j) {
        synchronized (this.f3294c) {
            this.f3303l = j;
            if (this.f3303l != -1) {
                this.f3292a.m4777a(this);
            }
        }
    }

    public void m4762a(AdRequestParcel adRequestParcel) {
        synchronized (this.f3294c) {
            this.f3302k = SystemClock.elapsedRealtime();
            this.f3292a.m4787d().m4800a(adRequestParcel, this.f3302k);
        }
    }

    public void m4763a(boolean z) {
        synchronized (this.f3294c) {
            if (this.f3303l != -1) {
                this.f3300i = SystemClock.elapsedRealtime();
                if (!z) {
                    this.f3298g = this.f3300i;
                    this.f3292a.m4777a(this);
                }
            }
        }
    }

    public void m4764b() {
        synchronized (this.f3294c) {
            if (this.f3303l != -1) {
                C0974a c0974a = new C0974a();
                c0974a.m4758c();
                this.f3293b.add(c0974a);
                this.f3301j++;
                this.f3292a.m4787d().m4801b();
                this.f3292a.m4777a(this);
            }
        }
    }

    public void m4765b(long j) {
        synchronized (this.f3294c) {
            if (this.f3303l != -1) {
                this.f3297f = j;
                this.f3292a.m4777a(this);
            }
        }
    }

    public void m4766b(boolean z) {
        synchronized (this.f3294c) {
            if (this.f3303l != -1) {
                this.f3299h = z;
                this.f3292a.m4777a(this);
            }
        }
    }

    public void m4767c() {
        synchronized (this.f3294c) {
            if (!(this.f3303l == -1 || this.f3293b.isEmpty())) {
                C0974a c0974a = (C0974a) this.f3293b.getLast();
                if (c0974a.m4756a() == -1) {
                    c0974a.m4757b();
                    this.f3292a.m4777a(this);
                }
            }
        }
    }

    public Bundle m4768d() {
        Bundle bundle;
        synchronized (this.f3294c) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.f3295d);
            bundle.putString("slotid", this.f3296e);
            bundle.putBoolean("ismediation", this.f3299h);
            bundle.putLong("treq", this.f3302k);
            bundle.putLong("tresponse", this.f3303l);
            bundle.putLong("timp", this.f3298g);
            bundle.putLong("tload", this.f3300i);
            bundle.putLong("pcc", this.f3301j);
            bundle.putLong("tfetch", this.f3297f);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f3293b.iterator();
            while (it.hasNext()) {
                arrayList.add(((C0974a) it.next()).m4759d());
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }
}
