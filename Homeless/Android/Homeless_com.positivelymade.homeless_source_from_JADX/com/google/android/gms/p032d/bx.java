package com.google.android.gms.p032d;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;

class bx extends bw {
    private static final Object f4767a = new Object();
    private static bx f4768n;
    private Context f4769b;
    private C1558y f4770c;
    private volatile C1624w f4771d;
    private int f4772e = 1800000;
    private boolean f4773f = true;
    private boolean f4774g = false;
    private boolean f4775h = true;
    private boolean f4776i = true;
    private C1574z f4777j = new C15751(this);
    private Handler f4778k;
    private ao f4779l;
    private boolean f4780m = false;

    class C15751 implements C1574z {
        final /* synthetic */ bx f4764a;

        C15751(bx bxVar) {
            this.f4764a = bxVar;
        }

        public void mo1019a(boolean z) {
            this.f4764a.m7237a(z, this.f4764a.f4775h);
        }
    }

    class C15762 implements Callback {
        final /* synthetic */ bx f4765a;

        C15762(bx bxVar) {
            this.f4765a = bxVar;
        }

        public boolean handleMessage(Message message) {
            if (1 == message.what && bx.f4767a.equals(message.obj)) {
                this.f4765a.mo1020a();
                if (this.f4765a.f4772e > 0 && !this.f4765a.f4780m) {
                    this.f4765a.f4778k.sendMessageDelayed(this.f4765a.f4778k.obtainMessage(1, bx.f4767a), (long) this.f4765a.f4772e);
                }
            }
            return true;
        }
    }

    class C15773 implements Runnable {
        final /* synthetic */ bx f4766a;

        C15773(bx bxVar) {
            this.f4766a = bxVar;
        }

        public void run() {
            this.f4766a.f4770c.mo1012a();
        }
    }

    private bx() {
    }

    public static bx m7227c() {
        if (f4768n == null) {
            f4768n = new bx();
        }
        return f4768n;
    }

    private void m7232f() {
        this.f4779l = new ao(this);
        this.f4779l.m7056a(this.f4769b);
    }

    private void m7233g() {
        this.f4778k = new Handler(this.f4769b.getMainLooper(), new C15762(this));
        if (this.f4772e > 0) {
            this.f4778k.sendMessageDelayed(this.f4778k.obtainMessage(1, f4767a), (long) this.f4772e);
        }
    }

    public synchronized void mo1020a() {
        if (this.f4774g) {
            this.f4771d.mo1043a(new C15773(this));
        } else {
            aj.m7041d("Dispatch call queued. Dispatch will run once initialization is complete.");
            this.f4773f = true;
        }
    }

    synchronized void m7235a(Context context, C1624w c1624w) {
        if (this.f4769b == null) {
            this.f4769b = context.getApplicationContext();
            if (this.f4771d == null) {
                this.f4771d = c1624w;
            }
        }
    }

    synchronized void mo1021a(boolean z) {
        m7237a(this.f4780m, z);
    }

    synchronized void m7237a(boolean z, boolean z2) {
        if (!(this.f4780m == z && this.f4775h == z2)) {
            if (z || !z2) {
                if (this.f4772e > 0) {
                    this.f4778k.removeMessages(1, f4767a);
                }
            }
            if (!z && z2 && this.f4772e > 0) {
                this.f4778k.sendMessageDelayed(this.f4778k.obtainMessage(1, f4767a), (long) this.f4772e);
            }
            StringBuilder append = new StringBuilder().append("PowerSaveMode ");
            String str = (z || !z2) ? "initiated." : "terminated.";
            aj.m7041d(append.append(str).toString());
            this.f4780m = z;
            this.f4775h = z2;
        }
    }

    synchronized void mo1022b() {
        if (!this.f4780m && this.f4775h && this.f4772e > 0) {
            this.f4778k.removeMessages(1, f4767a);
            this.f4778k.sendMessage(this.f4778k.obtainMessage(1, f4767a));
        }
    }

    synchronized C1558y m7239d() {
        if (this.f4770c == null) {
            if (this.f4769b == null) {
                throw new IllegalStateException("Cant get a store unless we have a context");
            }
            this.f4770c = new bb(this.f4777j, this.f4769b);
        }
        if (this.f4778k == null) {
            m7233g();
        }
        this.f4774g = true;
        if (this.f4773f) {
            mo1020a();
            this.f4773f = false;
        }
        if (this.f4779l == null && this.f4776i) {
            m7232f();
        }
        return this.f4770c;
    }
}
