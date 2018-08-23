package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.C0018f;
import android.support.v4.app.C0026g;
import android.support.v4.app.C0028i;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.C1241e;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1180c.C0651c;
import com.google.android.gms.common.internal.C1305x;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class C1223v extends C0018f implements OnCancelListener {
    private boolean f4226a;
    private boolean f4227b;
    private int f4228c = -1;
    private ConnectionResult f4229d;
    private final Handler f4230e = new Handler(Looper.getMainLooper());
    private final SparseArray<C1221a> f4231f = new SparseArray();

    private class C1221a implements C0651c {
        public final int f4219a;
        public final C1180c f4220b;
        public final C0651c f4221c;
        final /* synthetic */ C1223v f4222d;

        public C1221a(C1223v c1223v, int i, C1180c c1180c, C0651c c0651c) {
            this.f4222d = c1223v;
            this.f4219a = i;
            this.f4220b = c1180c;
            this.f4221c = c0651c;
            c1180c.mo879a((C0651c) this);
        }

        public void m6176a() {
            this.f4220b.mo885b((C0651c) this);
            this.f4220b.mo887c();
        }

        public void mo504a(ConnectionResult connectionResult) {
            this.f4222d.f4230e.post(new C1222b(this.f4222d, this.f4219a, connectionResult));
        }

        public void m6178a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.append(str).append("GoogleApiClient #").print(this.f4219a);
            printWriter.println(":");
            this.f4220b.mo880a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    private class C1222b implements Runnable {
        final /* synthetic */ C1223v f4223a;
        private final int f4224b;
        private final ConnectionResult f4225c;

        public C1222b(C1223v c1223v, int i, ConnectionResult connectionResult) {
            this.f4223a = c1223v;
            this.f4224b = i;
            this.f4225c = connectionResult;
        }

        public void run() {
            if (this.f4223a.f4226a && !this.f4223a.f4227b) {
                this.f4223a.f4227b = true;
                this.f4223a.f4228c = this.f4224b;
                this.f4223a.f4229d = this.f4225c;
                if (this.f4225c.m5960a()) {
                    try {
                        this.f4225c.m5959a(this.f4223a.m130g(), ((this.f4223a.m130g().m187f().mo25c().indexOf(this.f4223a) + 1) << 16) + 1);
                    } catch (SendIntentException e) {
                        this.f4223a.m6182a();
                    }
                } else if (C1241e.m6285b(this.f4225c.m5962c())) {
                    C1241e.m6276a(this.f4225c.m5962c(), this.f4223a.m130g(), this.f4223a, 2, this.f4223a);
                } else {
                    this.f4223a.m6183a(this.f4224b, this.f4225c);
                }
            }
        }
    }

    public static C1223v m6181a(C0026g c0026g) {
        C1305x.m6624b("Must be called from main thread of process");
        try {
            C1223v c1223v = (C1223v) c0026g.m187f().mo20a("GmsSupportLifecycleFragment");
            return (c1223v == null || c1223v.m140l()) ? null : c1223v;
        } catch (Throwable e) {
            throw new IllegalStateException("Fragment with tag GmsSupportLifecycleFragment is not a SupportLifecycleFragment", e);
        }
    }

    private void m6182a() {
        this.f4227b = false;
        this.f4228c = -1;
        this.f4229d = null;
        for (int i = 0; i < this.f4231f.size(); i++) {
            ((C1221a) this.f4231f.valueAt(i)).f4220b.mo883b();
        }
    }

    private void m6183a(int i, ConnectionResult connectionResult) {
        Log.w("GmsSupportLifecycleFragment", "Unresolved error while connecting client. Stopping auto-manage.");
        C1221a c1221a = (C1221a) this.f4231f.get(i);
        if (c1221a != null) {
            m6194b(i);
            C0651c c0651c = c1221a.f4221c;
            if (c0651c != null) {
                c0651c.mo504a(connectionResult);
            }
        }
        m6182a();
    }

    public static C1223v m6187b(C0026g c0026g) {
        C1223v a = C1223v.m6181a(c0026g);
        C0028i f = c0026g.m187f();
        if (a != null) {
            return a;
        }
        C0018f c1223v = new C1223v();
        f.mo21a().mo5a(c1223v, "GmsSupportLifecycleFragment").mo6b();
        f.mo24b();
        return c1223v;
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
        r3.m6182a();
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
        r0 = r3.f4228c;
        r1 = r3.f4229d;
        r3.m6183a(r0, r1);
        goto L_0x000b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.v.a(int, int, android.content.Intent):void");
    }

    public void m6192a(int i, C1180c c1180c, C0651c c0651c) {
        C1305x.m6618a((Object) c1180c, (Object) "GoogleApiClient instance cannot be null");
        C1305x.m6622a(this.f4231f.indexOfKey(i) < 0, "Already managing a GoogleApiClient with id " + i);
        this.f4231f.put(i, new C1221a(this, i, c1180c, c0651c));
        if (this.f4226a && !this.f4227b) {
            c1180c.mo883b();
        }
    }

    public void mo891a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo891a(str, fileDescriptor, printWriter, strArr);
        for (int i = 0; i < this.f4231f.size(); i++) {
            ((C1221a) this.f4231f.valueAt(i)).m6178a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public void a_(Bundle bundle) {
        super.a_(bundle);
        if (bundle != null) {
            this.f4227b = bundle.getBoolean("resolving_error", false);
            this.f4228c = bundle.getInt("failed_client_id", -1);
            if (this.f4228c >= 0) {
                this.f4229d = new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution"));
            }
        }
    }

    public void m6194b(int i) {
        C1221a c1221a = (C1221a) this.f4231f.get(i);
        this.f4231f.remove(i);
        if (c1221a != null) {
            c1221a.m6176a();
        }
    }

    public void mo13c() {
        super.mo13c();
        this.f4226a = true;
        if (!this.f4227b) {
            for (int i = 0; i < this.f4231f.size(); i++) {
                ((C1221a) this.f4231f.valueAt(i)).f4220b.mo883b();
            }
        }
    }

    public void mo14d() {
        super.mo14d();
        this.f4226a = false;
        for (int i = 0; i < this.f4231f.size(); i++) {
            ((C1221a) this.f4231f.valueAt(i)).f4220b.mo887c();
        }
    }

    public void mo17e(Bundle bundle) {
        super.mo17e(bundle);
        bundle.putBoolean("resolving_error", this.f4227b);
        if (this.f4228c >= 0) {
            bundle.putInt("failed_client_id", this.f4228c);
            bundle.putInt("failed_status", this.f4229d.m5962c());
            bundle.putParcelable("failed_resolution", this.f4229d.m5963d());
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        m6183a(this.f4228c, new ConnectionResult(13, null));
    }
}
