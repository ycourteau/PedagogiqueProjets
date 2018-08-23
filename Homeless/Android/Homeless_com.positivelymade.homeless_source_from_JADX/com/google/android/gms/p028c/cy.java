package com.google.android.gms.p028c;

import android.content.Context;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;

@fn
public final class cy {
    private final AdRequestInfoParcel f2700a;
    private final di f2701b;
    private final Context f2702c;
    private final Object f2703d = new Object();
    private final db f2704e;
    private final boolean f2705f;
    private boolean f2706g = false;
    private de f2707h;

    public cy(Context context, AdRequestInfoParcel adRequestInfoParcel, di diVar, db dbVar, boolean z) {
        this.f2702c = context;
        this.f2700a = adRequestInfoParcel;
        this.f2701b = diVar;
        this.f2704e = dbVar;
        this.f2705f = z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.p028c.df m4180a(long r24, long r26, com.google.android.gms.p028c.bf r28) {
        /*
        r23 = this;
        r4 = "Starting mediation.";
        com.google.android.gms.ads.internal.util.client.C0691b.m3093a(r4);
        r16 = new java.util.ArrayList;
        r16.<init>();
        r17 = r28.m3916a();
        r0 = r23;
        r4 = r0.f2704e;
        r4 = r4.f2725a;
        r18 = r4.iterator();
    L_0x0018:
        r4 = r18.hasNext();
        if (r4 == 0) goto L_0x0119;
    L_0x001e:
        r9 = r18.next();
        r9 = (com.google.android.gms.p028c.cz) r9;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = "Trying mediation network: ";
        r4 = r4.append(r5);
        r5 = r9.f2709b;
        r4 = r4.append(r5);
        r4 = r4.toString();
        com.google.android.gms.ads.internal.util.client.C0691b.m3099c(r4);
        r4 = r9.f2710c;
        r19 = r4.iterator();
    L_0x0042:
        r4 = r19.hasNext();
        if (r4 == 0) goto L_0x0018;
    L_0x0048:
        r6 = r19.next();
        r6 = (java.lang.String) r6;
        r20 = r28.m3916a();
        r0 = r23;
        r0 = r0.f2703d;
        r21 = r0;
        monitor-enter(r21);
        r0 = r23;
        r4 = r0.f2706g;	 Catch:{ all -> 0x00f0 }
        if (r4 == 0) goto L_0x0067;
    L_0x005f:
        r4 = new com.google.android.gms.c.df;	 Catch:{ all -> 0x00f0 }
        r5 = -1;
        r4.<init>(r5);	 Catch:{ all -> 0x00f0 }
        monitor-exit(r21);	 Catch:{ all -> 0x00f0 }
    L_0x0066:
        return r4;
    L_0x0067:
        r4 = new com.google.android.gms.c.de;	 Catch:{ all -> 0x00f0 }
        r0 = r23;
        r5 = r0.f2702c;	 Catch:{ all -> 0x00f0 }
        r0 = r23;
        r7 = r0.f2701b;	 Catch:{ all -> 0x00f0 }
        r0 = r23;
        r8 = r0.f2704e;	 Catch:{ all -> 0x00f0 }
        r0 = r23;
        r10 = r0.f2700a;	 Catch:{ all -> 0x00f0 }
        r10 = r10.f1839c;	 Catch:{ all -> 0x00f0 }
        r0 = r23;
        r11 = r0.f2700a;	 Catch:{ all -> 0x00f0 }
        r11 = r11.f1840d;	 Catch:{ all -> 0x00f0 }
        r0 = r23;
        r12 = r0.f2700a;	 Catch:{ all -> 0x00f0 }
        r12 = r12.f1847k;	 Catch:{ all -> 0x00f0 }
        r0 = r23;
        r13 = r0.f2705f;	 Catch:{ all -> 0x00f0 }
        r0 = r23;
        r14 = r0.f2700a;	 Catch:{ all -> 0x00f0 }
        r14 = r14.f1833C;	 Catch:{ all -> 0x00f0 }
        r0 = r23;
        r15 = r0.f2700a;	 Catch:{ all -> 0x00f0 }
        r15 = r15.f1850n;	 Catch:{ all -> 0x00f0 }
        r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15);	 Catch:{ all -> 0x00f0 }
        r0 = r23;
        r0.f2707h = r4;	 Catch:{ all -> 0x00f0 }
        monitor-exit(r21);	 Catch:{ all -> 0x00f0 }
        r0 = r23;
        r4 = r0.f2707h;
        r0 = r24;
        r2 = r26;
        r4 = r4.m4218a(r0, r2);
        r5 = r4.f2755a;
        if (r5 != 0) goto L_0x00f3;
    L_0x00af:
        r5 = "Adapter succeeded.";
        com.google.android.gms.ads.internal.util.client.C0691b.m3093a(r5);
        r5 = "mediation_network_succeed";
        r0 = r28;
        r0.m3919a(r5, r6);
        r5 = r16.isEmpty();
        if (r5 != 0) goto L_0x00d0;
    L_0x00c1:
        r5 = "mediation_networks_fail";
        r6 = ",";
        r0 = r16;
        r6 = android.text.TextUtils.join(r6, r0);
        r0 = r28;
        r0.m3919a(r5, r6);
    L_0x00d0:
        r5 = 1;
        r5 = new java.lang.String[r5];
        r6 = 0;
        r7 = "mls";
        r5[r6] = r7;
        r0 = r28;
        r1 = r20;
        r0.m3920a(r1, r5);
        r5 = 1;
        r5 = new java.lang.String[r5];
        r6 = 0;
        r7 = "ttm";
        r5[r6] = r7;
        r0 = r28;
        r1 = r17;
        r0.m3920a(r1, r5);
        goto L_0x0066;
    L_0x00f0:
        r4 = move-exception;
        monitor-exit(r21);	 Catch:{ all -> 0x00f0 }
        throw r4;
    L_0x00f3:
        r0 = r16;
        r0.add(r6);
        r5 = 1;
        r5 = new java.lang.String[r5];
        r6 = 0;
        r7 = "mlf";
        r5[r6] = r7;
        r0 = r28;
        r1 = r20;
        r0.m3920a(r1, r5);
        r5 = r4.f2757c;
        if (r5 == 0) goto L_0x0042;
    L_0x010b:
        r5 = com.google.android.gms.p028c.go.f3361a;
        r6 = new com.google.android.gms.c.cy$1;
        r0 = r23;
        r6.<init>(r0, r4);
        r5.post(r6);
        goto L_0x0042;
    L_0x0119:
        r4 = r16.isEmpty();
        if (r4 != 0) goto L_0x012e;
    L_0x011f:
        r4 = "mediation_networks_fail";
        r5 = ",";
        r0 = r16;
        r5 = android.text.TextUtils.join(r5, r0);
        r0 = r28;
        r0.m3919a(r4, r5);
    L_0x012e:
        r4 = new com.google.android.gms.c.df;
        r5 = 1;
        r4.<init>(r5);
        goto L_0x0066;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.c.cy.a(long, long, com.google.android.gms.c.bf):com.google.android.gms.c.df");
    }

    public void m4181a() {
        synchronized (this.f2703d) {
            this.f2706g = true;
            if (this.f2707h != null) {
                this.f2707h.m4219a();
            }
        }
    }
}
