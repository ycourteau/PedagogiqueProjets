package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.C0018f;
import android.support.v4.app.C0026g;
import android.support.v4.app.C0028i;
import android.support.v4.app.C0044n;
import android.support.v4.app.C0044n.C0043a;
import android.support.v4.p000a.C0003c;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.C1241e;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1180c.C0650b;
import com.google.android.gms.common.api.C1180c.C0651c;
import com.google.android.gms.common.internal.C1305x;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class C1228w extends C0018f implements OnCancelListener, C0043a<ConnectionResult> {
    private boolean f4240a;
    private int f4241b = -1;
    private ConnectionResult f4242c;
    private final Handler f4243d = new Handler(Looper.getMainLooper());
    private final SparseArray<C1226b> f4244e = new SparseArray();

    static class C1225a extends C0003c<ConnectionResult> implements C0650b, C0651c {
        public final C1180c f4232i;
        private boolean f4233j;
        private ConnectionResult f4234k;

        public C1225a(Context context, C1180c c1180c) {
            super(context);
            this.f4232i = c1180c;
        }

        private void m6198b(ConnectionResult connectionResult) {
            this.f4234k = connectionResult;
            if (m9b() && !m10c()) {
                m6a((Object) connectionResult);
            }
        }

        public void mo503a(Bundle bundle) {
            this.f4233j = false;
            m6198b(ConnectionResult.f4086a);
        }

        public void mo504a(ConnectionResult connectionResult) {
            this.f4233j = true;
            m6198b(connectionResult);
        }

        public void mo892a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            super.mo892a(str, fileDescriptor, printWriter, strArr);
            this.f4232i.mo880a(str, fileDescriptor, printWriter, strArr);
        }

        public void a_(int i) {
        }

        protected void mo893e() {
            super.mo893e();
            this.f4232i.mo878a((C0650b) this);
            this.f4232i.mo879a((C0651c) this);
            if (this.f4234k != null) {
                m6a((Object) this.f4234k);
            }
            if (!this.f4232i.mo888d() && !this.f4232i.mo889e() && !this.f4233j) {
                this.f4232i.mo883b();
            }
        }

        protected void mo894g() {
            this.f4232i.mo887c();
        }

        protected void mo895k() {
            this.f4234k = null;
            this.f4233j = false;
            this.f4232i.mo884b((C0650b) this);
            this.f4232i.mo885b((C0651c) this);
            this.f4232i.mo887c();
        }

        public boolean m6205l() {
            return this.f4233j;
        }
    }

    private static class C1226b {
        public final C1180c f4235a;
        public final C0651c f4236b;

        private C1226b(C1180c c1180c, C0651c c0651c) {
            this.f4235a = c1180c;
            this.f4236b = c0651c;
        }
    }

    private class C1227c implements Runnable {
        final /* synthetic */ C1228w f4237a;
        private final int f4238b;
        private final ConnectionResult f4239c;

        public C1227c(C1228w c1228w, int i, ConnectionResult connectionResult) {
            this.f4237a = c1228w;
            this.f4238b = i;
            this.f4239c = connectionResult;
        }

        public void run() {
            if (this.f4239c.m5960a()) {
                try {
                    this.f4239c.m5959a(this.f4237a.m130g(), ((this.f4237a.m130g().m187f().mo25c().indexOf(this.f4237a) + 1) << 16) + 1);
                } catch (SendIntentException e) {
                    this.f4237a.m6207a();
                }
            } else if (C1241e.m6285b(this.f4239c.m5962c())) {
                C1241e.m6276a(this.f4239c.m5962c(), this.f4237a.m130g(), this.f4237a, 2, this.f4237a);
            } else {
                this.f4237a.m6211b(this.f4238b, this.f4239c);
            }
        }
    }

    public static C1228w m6206a(C0026g c0026g) {
        C1305x.m6624b("Must be called from main thread of process");
        C0028i f = c0026g.m187f();
        try {
            C1228w c1228w = (C1228w) f.mo20a("GmsSupportLoaderLifecycleFragment");
            if (c1228w != null && !c1228w.m140l()) {
                return c1228w;
            }
            C0018f c1228w2 = new C1228w();
            f.mo21a().mo5a(c1228w2, "GmsSupportLoaderLifecycleFragment").mo2a();
            f.mo24b();
            return c1228w2;
        } catch (Throwable e) {
            throw new IllegalStateException("Fragment with tag GmsSupportLoaderLifecycleFragment is not a SupportLoaderLifecycleFragment", e);
        }
    }

    private void m6207a() {
        int i = 0;
        this.f4240a = false;
        this.f4241b = -1;
        this.f4242c = null;
        C0044n n = m142n();
        while (i < this.f4244e.size()) {
            int keyAt = this.f4244e.keyAt(i);
            C1225a d = m6222d(keyAt);
            if (d != null && d.m6205l()) {
                n.mo37a(keyAt);
                n.mo36a(keyAt, null, this);
            }
            i++;
        }
    }

    private void m6208a(int i, ConnectionResult connectionResult) {
        if (!this.f4240a) {
            this.f4240a = true;
            this.f4241b = i;
            this.f4242c = connectionResult;
            this.f4243d.post(new C1227c(this, i, connectionResult));
        }
    }

    private void m6211b(int i, ConnectionResult connectionResult) {
        Log.w("GmsSupportLoaderLifecycleFragment", "Unresolved error while connecting client. Stopping auto-manage.");
        C1226b c1226b = (C1226b) this.f4244e.get(i);
        if (c1226b != null) {
            m6221c(i);
            C0651c c0651c = c1226b.f4236b;
            if (c0651c != null) {
                c0651c.mo504a(connectionResult);
            }
        }
        m6207a();
    }

    public C0003c<ConnectionResult> mo896a(int i, Bundle bundle) {
        return new C1225a(m130g(), ((C1226b) this.f4244e.get(i)).f4235a);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo890a(int r4, int r5, android.content.Intent r6) {
        /*
        r3 = this;
        r0 = 1;
        r1 = 0;
        switch(r4) {
            case 1: goto L_0x0017;
            case 2: goto L_0x000c;
            default: goto L_0x0005;
        };
    L_0x0005:
        r0 = r1;
    L_0x0006:
        if (r0 == 0) goto L_0x001b;
    L_0x0008:
        r3.m6207a();
    L_0x000b:
        return;
    L_0x000c:
        r2 = r3.m130g();
        r2 = com.google.android.gms.common.C1241e.m6271a(r2);
        if (r2 != 0) goto L_0x0005;
    L_0x0016:
        goto L_0x0006;
    L_0x0017:
        r2 = -1;
        if (r5 != r2) goto L_0x0005;
    L_0x001a:
        goto L_0x0006;
    L_0x001b:
        r0 = r3.f4241b;
        r1 = r3.f4242c;
        r3.m6211b(r0, r1);
        goto L_0x000b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.w.a(int, int, android.content.Intent):void");
    }

    public void m6214a(int i, C1180c c1180c, C0651c c0651c) {
        C1305x.m6618a((Object) c1180c, (Object) "GoogleApiClient instance cannot be null");
        C1305x.m6622a(this.f4244e.indexOfKey(i) < 0, "Already managing a GoogleApiClient with id " + i);
        this.f4244e.put(i, new C1226b(c1180c, c0651c));
        if (m130g() != null) {
            C0044n.m312a(false);
            m142n().mo36a(i, null, this);
        }
    }

    public void mo9a(Activity activity) {
        super.mo9a(activity);
        int i = 0;
        while (i < this.f4244e.size()) {
            int keyAt = this.f4244e.keyAt(i);
            C1225a d = m6222d(keyAt);
            if (d == null || ((C1226b) this.f4244e.valueAt(i)).f4235a == d.f4232i) {
                m142n().mo36a(keyAt, null, this);
            } else {
                m142n().mo40b(keyAt, null, this);
            }
            i++;
        }
    }

    public void mo897a(C0003c<ConnectionResult> c0003c) {
    }

    public void m6217a(C0003c<ConnectionResult> c0003c, ConnectionResult connectionResult) {
        if (!connectionResult.m5961b()) {
            m6208a(c0003c.m3a(), connectionResult);
        }
    }

    public /* synthetic */ void mo898a(C0003c c0003c, Object obj) {
        m6217a(c0003c, (ConnectionResult) obj);
    }

    public void a_(Bundle bundle) {
        super.a_(bundle);
        if (bundle != null) {
            this.f4240a = bundle.getBoolean("resolving_error", false);
            this.f4241b = bundle.getInt("failed_client_id", -1);
            if (this.f4241b >= 0) {
                this.f4242c = new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution"));
            }
        }
    }

    public C1180c m6219b(int i) {
        if (m130g() != null) {
            C1225a d = m6222d(i);
            if (d != null) {
                return d.f4232i;
            }
        }
        return null;
    }

    public void mo13c() {
        super.mo13c();
        if (!this.f4240a) {
            for (int i = 0; i < this.f4244e.size(); i++) {
                m142n().mo36a(this.f4244e.keyAt(i), null, this);
            }
        }
    }

    public void m6221c(int i) {
        this.f4244e.remove(i);
        m142n().mo37a(i);
    }

    C1225a m6222d(int i) {
        try {
            return (C1225a) m142n().mo39b(i);
        } catch (Throwable e) {
            throw new IllegalStateException("Unknown loader in SupportLoaderLifecycleFragment", e);
        }
    }

    public void mo17e(Bundle bundle) {
        super.mo17e(bundle);
        bundle.putBoolean("resolving_error", this.f4240a);
        if (this.f4241b >= 0) {
            bundle.putInt("failed_client_id", this.f4241b);
            bundle.putInt("failed_status", this.f4242c.m5962c());
            bundle.putParcelable("failed_resolution", this.f4242c.m5963d());
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        m6211b(this.f4241b, new ConnectionResult(13, null));
    }
}
