package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.C0514q;
import com.google.android.gms.ads.internal.client.C0532r.C0534a;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.p028c.C1042if;
import com.google.android.gms.p028c.bu;
import com.google.android.gms.p028c.bv;
import com.google.android.gms.p028c.bw;
import com.google.android.gms.p028c.bx;
import com.google.android.gms.p028c.di;
import com.google.android.gms.p028c.fn;
import com.google.android.gms.p028c.go;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

@fn
public class C0575i extends C0534a {
    private final Context f1536a;
    private final C0514q f1537b;
    private final di f1538c;
    private final bu f1539d;
    private final bv f1540e;
    private final C1042if<String, bx> f1541f;
    private final C1042if<String, bw> f1542g;
    private final NativeAdOptionsParcel f1543h;
    private final List<String> f1544i;
    private final String f1545j;
    private final VersionInfoParcel f1546k;
    private WeakReference<C0586n> f1547l;
    private Object f1548m = new Object();

    C0575i(Context context, String str, di diVar, VersionInfoParcel versionInfoParcel, C0514q c0514q, bu buVar, bv bvVar, C1042if<String, bx> c1042if, C1042if<String, bw> c1042if2, NativeAdOptionsParcel nativeAdOptionsParcel) {
        this.f1536a = context;
        this.f1545j = str;
        this.f1538c = diVar;
        this.f1546k = versionInfoParcel;
        this.f1537b = c0514q;
        this.f1540e = bvVar;
        this.f1539d = buVar;
        this.f1541f = c1042if;
        this.f1542g = c1042if2;
        this.f1543h = nativeAdOptionsParcel;
        this.f1544i = m2578d();
    }

    private List<String> m2578d() {
        List<String> arrayList = new ArrayList();
        if (this.f1540e != null) {
            arrayList.add("1");
        }
        if (this.f1539d != null) {
            arrayList.add("2");
        }
        if (this.f1541f.size() > 0) {
            arrayList.add("3");
        }
        return arrayList;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo394a() {
        /*
        r3 = this;
        r1 = 0;
        r2 = r3.f1548m;
        monitor-enter(r2);
        r0 = r3.f1547l;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x001a;
    L_0x0008:
        r0 = r3.f1547l;	 Catch:{ all -> 0x001d }
        r0 = r0.get();	 Catch:{ all -> 0x001d }
        r0 = (com.google.android.gms.ads.internal.C0586n) r0;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x0018;
    L_0x0012:
        r0 = r0.mo372k();	 Catch:{ all -> 0x001d }
    L_0x0016:
        monitor-exit(r2);	 Catch:{ all -> 0x001d }
    L_0x0017:
        return r0;
    L_0x0018:
        r0 = r1;
        goto L_0x0016;
    L_0x001a:
        monitor-exit(r2);	 Catch:{ all -> 0x001d }
        r0 = r1;
        goto L_0x0017;
    L_0x001d:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x001d }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.i.a():java.lang.String");
    }

    public void mo395a(final AdRequestParcel adRequestParcel) {
        m2585a(new Runnable(this) {
            final /* synthetic */ C0575i f1535b;

            public void run() {
                synchronized (this.f1535b.f1548m) {
                    C0586n c = this.f1535b.m2587c();
                    this.f1535b.f1547l = new WeakReference(c);
                    c.m2627a(this.f1535b.f1539d);
                    c.m2628a(this.f1535b.f1540e);
                    c.m2631a(this.f1535b.f1541f);
                    c.mo342a(this.f1535b.f1537b);
                    c.m2636b(this.f1535b.f1542g);
                    c.m2632a(this.f1535b.m2578d());
                    c.m2625a(this.f1535b.f1543h);
                    c.mo352a(adRequestParcel);
                }
            }
        });
    }

    protected void m2585a(Runnable runnable) {
        go.f3361a.post(runnable);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo396b() {
        /*
        r3 = this;
        r1 = 0;
        r2 = r3.f1548m;
        monitor-enter(r2);
        r0 = r3.f1547l;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x001a;
    L_0x0008:
        r0 = r3.f1547l;	 Catch:{ all -> 0x001d }
        r0 = r0.get();	 Catch:{ all -> 0x001d }
        r0 = (com.google.android.gms.ads.internal.C0586n) r0;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x0018;
    L_0x0012:
        r0 = r0.mo361l();	 Catch:{ all -> 0x001d }
    L_0x0016:
        monitor-exit(r2);	 Catch:{ all -> 0x001d }
    L_0x0017:
        return r0;
    L_0x0018:
        r0 = r1;
        goto L_0x0016;
    L_0x001a:
        monitor-exit(r2);	 Catch:{ all -> 0x001d }
        r0 = r1;
        goto L_0x0017;
    L_0x001d:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x001d }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.i.b():boolean");
    }

    protected C0586n m2587c() {
        return new C0586n(this.f1536a, AdSizeParcel.m2279a(this.f1536a), this.f1545j, this.f1538c, this.f1546k);
    }
}
