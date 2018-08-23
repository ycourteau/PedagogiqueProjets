package com.google.android.gms.p028c;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class ib {
    private AtomicInteger f3561a;
    private final Map<String, Queue<hz<?>>> f3562b;
    private final Set<hz<?>> f3563c;
    private final PriorityBlockingQueue<hz<?>> f3564d;
    private final PriorityBlockingQueue<hz<?>> f3565e;
    private final aa f3566f;
    private final eb f3567g;
    private final jd f3568h;
    private fc[] f3569i;
    private bb f3570j;
    private List<C1040a> f3571k;

    public interface C1040a<T> {
        void m5202a(hz<T> hzVar);
    }

    public ib(aa aaVar, eb ebVar) {
        this(aaVar, ebVar, 4);
    }

    public ib(aa aaVar, eb ebVar, int i) {
        this(aaVar, ebVar, i, new da(new Handler(Looper.getMainLooper())));
    }

    public ib(aa aaVar, eb ebVar, int i, jd jdVar) {
        this.f3561a = new AtomicInteger();
        this.f3562b = new HashMap();
        this.f3563c = new HashSet();
        this.f3564d = new PriorityBlockingQueue();
        this.f3565e = new PriorityBlockingQueue();
        this.f3571k = new ArrayList();
        this.f3566f = aaVar;
        this.f3567g = ebVar;
        this.f3569i = new fc[i];
        this.f3568h = jdVar;
    }

    public <T> hz<T> m5203a(hz<T> hzVar) {
        hzVar.m4019a(this);
        synchronized (this.f3563c) {
            this.f3563c.add(hzVar);
        }
        hzVar.m4017a(m5207c());
        hzVar.m4027b("add-to-queue");
        if (hzVar.m4042p()) {
            synchronized (this.f3562b) {
                String e = hzVar.m4031e();
                if (this.f3562b.containsKey(e)) {
                    Queue queue = (Queue) this.f3562b.get(e);
                    if (queue == null) {
                        queue = new LinkedList();
                    }
                    queue.add(hzVar);
                    this.f3562b.put(e, queue);
                    if (ln.f3966b) {
                        ln.m5765a("Request for cacheKey=%s is in flight, putting on hold.", e);
                    }
                } else {
                    this.f3562b.put(e, null);
                    this.f3564d.add(hzVar);
                }
            }
        } else {
            this.f3565e.add(hzVar);
        }
        return hzVar;
    }

    public void m5204a() {
        m5205b();
        this.f3570j = new bb(this.f3564d, this.f3565e, this.f3566f, this.f3568h);
        this.f3570j.start();
        for (int i = 0; i < this.f3569i.length; i++) {
            fc fcVar = new fc(this.f3565e, this.f3567g, this.f3566f, this.f3568h);
            this.f3569i[i] = fcVar;
            fcVar.start();
        }
    }

    public void m5205b() {
        if (this.f3570j != null) {
            this.f3570j.m3903a();
        }
        for (int i = 0; i < this.f3569i.length; i++) {
            if (this.f3569i[i] != null) {
                this.f3569i[i].m4559a();
            }
        }
    }

    <T> void m5206b(hz<T> hzVar) {
        synchronized (this.f3563c) {
            this.f3563c.remove(hzVar);
        }
        synchronized (this.f3571k) {
            for (C1040a a : this.f3571k) {
                a.m5202a(hzVar);
            }
        }
        if (hzVar.m4042p()) {
            synchronized (this.f3562b) {
                Queue queue = (Queue) this.f3562b.remove(hzVar.m4031e());
                if (queue != null) {
                    if (ln.f3966b) {
                        ln.m5765a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(queue.size()), r2);
                    }
                    this.f3564d.addAll(queue);
                }
            }
        }
    }

    public int m5207c() {
        return this.f3561a.incrementAndGet();
    }
}
