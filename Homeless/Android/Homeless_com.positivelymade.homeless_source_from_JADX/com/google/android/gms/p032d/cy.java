package com.google.android.gms.p032d;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.p032d.C1554b.C1553a;

class cy implements C1554b {
    private final Looper f4886a;
    private C1545a f4887b;
    private C1545a f4888c;
    private Status f4889d;
    private C1593b f4890e;
    private C1592a f4891f;
    private boolean f4892g;
    private C1601d f4893h;

    public interface C1592a {
    }

    private class C1593b extends Handler {
        final /* synthetic */ cy f4884a;
        private final C1553a f4885b;

        protected void m7390a(String str) {
            this.f4885b.m7113a(this.f4884a, str);
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    m7390a((String) message.obj);
                    return;
                default:
                    aj.m7036a("Don't know how to handle this message.");
                    return;
            }
        }
    }

    public cy(Status status) {
        this.f4889d = status;
        this.f4886a = null;
    }

    public cy(C1601d c1601d, Looper looper, C1545a c1545a, C1592a c1592a) {
        this.f4893h = c1601d;
        if (looper == null) {
            looper = Looper.getMainLooper();
        }
        this.f4886a = looper;
        this.f4887b = c1545a;
        this.f4891f = c1592a;
        this.f4889d = Status.f4094a;
        c1601d.m7416a(this);
    }

    public Status mo558a() {
        return this.f4889d;
    }

    public synchronized void m7392a(String str) {
        if (!this.f4892g) {
            this.f4887b.m6996e(str);
        }
    }

    public synchronized void mo627b() {
        if (this.f4892g) {
            aj.m7036a("Releasing a released ContainerHolder.");
        } else {
            this.f4892g = true;
            this.f4893h.m7418b(this);
            this.f4887b.m6994c();
            this.f4887b = null;
            this.f4888c = null;
            this.f4891f = null;
            this.f4890e = null;
        }
    }

    public synchronized C1545a mo1032c() {
        C1545a c1545a = null;
        synchronized (this) {
            if (this.f4892g) {
                aj.m7036a("ContainerHolder is released.");
            } else {
                if (this.f4888c != null) {
                    this.f4887b = this.f4888c;
                    this.f4888c = null;
                }
                c1545a = this.f4887b;
            }
        }
        return c1545a;
    }
}
