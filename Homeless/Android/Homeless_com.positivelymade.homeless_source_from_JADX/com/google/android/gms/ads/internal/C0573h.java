package com.google.android.gms.ads.internal;

import android.content.Context;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.client.C0526n;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.p028c.C0572k;
import com.google.android.gms.p028c.C1140n;
import com.google.android.gms.p028c.az;
import com.google.android.gms.p028c.fn;
import com.google.android.gms.p028c.gn;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@fn
class C0573h implements C0572k, Runnable {
    CountDownLatch f1530a = new CountDownLatch(1);
    private final List<Object[]> f1531b = new Vector();
    private final AtomicReference<C0572k> f1532c = new AtomicReference();
    private C0637q f1533d;

    public C0573h(C0637q c0637q) {
        this.f1533d = c0637q;
        if (C0526n.m2400a().m3088b()) {
            gn.m4822a((Runnable) this);
        } else {
            run();
        }
    }

    private Context m2564b(Context context) {
        if (!((Boolean) az.f2487m.m3878c()).booleanValue()) {
            return context;
        }
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    private void m2565b() {
        if (!this.f1531b.isEmpty()) {
            for (Object[] objArr : this.f1531b) {
                if (objArr.length == 1) {
                    ((C0572k) this.f1532c.get()).mo441a((MotionEvent) objArr[0]);
                } else if (objArr.length == 3) {
                    ((C0572k) this.f1532c.get()).mo440a(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            }
            this.f1531b.clear();
        }
    }

    protected C0572k m2566a(String str, Context context, boolean z) {
        return C1140n.m5844a(str, context, z);
    }

    public String mo438a(Context context) {
        if (m2572a()) {
            C0572k c0572k = (C0572k) this.f1532c.get();
            if (c0572k != null) {
                m2565b();
                return c0572k.mo438a(m2564b(context));
            }
        }
        return "";
    }

    public String mo439a(Context context, String str) {
        if (m2572a()) {
            C0572k c0572k = (C0572k) this.f1532c.get();
            if (c0572k != null) {
                m2565b();
                return c0572k.mo439a(m2564b(context), str);
            }
        }
        return "";
    }

    public void mo440a(int i, int i2, int i3) {
        C0572k c0572k = (C0572k) this.f1532c.get();
        if (c0572k != null) {
            m2565b();
            c0572k.mo440a(i, i2, i3);
            return;
        }
        this.f1531b.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    public void mo441a(MotionEvent motionEvent) {
        C0572k c0572k = (C0572k) this.f1532c.get();
        if (c0572k != null) {
            m2565b();
            c0572k.mo441a(motionEvent);
            return;
        }
        this.f1531b.add(new Object[]{motionEvent});
    }

    protected void m2571a(C0572k c0572k) {
        this.f1532c.set(c0572k);
    }

    protected boolean m2572a() {
        try {
            this.f1530a.await();
            return true;
        } catch (Throwable e) {
            C0691b.m3102d("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    public void run() {
        try {
            boolean z = !((Boolean) az.f2499y.m3878c()).booleanValue() || this.f1533d.f1781e.f1979e;
            m2571a(m2566a(this.f1533d.f1781e.f1976b, m2564b(this.f1533d.f1779c), z));
        } finally {
            this.f1530a.countDown();
            this.f1533d = null;
        }
    }
}
