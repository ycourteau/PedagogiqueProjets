package com.google.android.gms.p028c;

import android.content.Context;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C1253f;
import com.google.android.gms.common.internal.C1305x;

public class kg {
    private static String f3809a = "WakeLock";
    private static boolean f3810b = false;
    private final WakeLock f3811c;
    private WorkSource f3812d;
    private final int f3813e;
    private final String f3814f;
    private final String f3815g;
    private final Context f3816h;
    private boolean f3817i;
    private int f3818j;
    private int f3819k;

    public kg(Context context, int i, String str) {
        this(context, i, str, null, null);
    }

    public kg(Context context, int i, String str, String str2, String str3) {
        this.f3817i = true;
        C1305x.m6620a(str, (Object) "Wake lock name can NOT be empty");
        this.f3813e = i;
        this.f3814f = str;
        this.f3815g = str2;
        this.f3816h = context.getApplicationContext();
        this.f3811c = ((PowerManager) context.getSystemService("power")).newWakeLock(i, str);
        if (ix.m5312a(this.f3816h)) {
            if (iv.m5302a(str3)) {
                if (C1253f.f4324a && ia.m5182b()) {
                    Log.e(f3809a, "callingPackage is not supposed to be empty for wakelock " + this.f3814f + "!");
                    str3 = "com.google.android.gms";
                } else {
                    str3 = context.getPackageName();
                }
            }
            this.f3812d = ix.m5308a(context, str3);
            m5509a(this.f3812d);
        }
    }

    private String m5503a(String str, boolean z) {
        return this.f3817i ? z ? str : this.f3815g : this.f3815g;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5504a(java.lang.String r9) {
        /*
        r8 = this;
        r0 = r8.m5506c(r9);
        r5 = r8.m5503a(r9, r0);
        r1 = f3810b;
        if (r1 == 0) goto L_0x0068;
    L_0x000c:
        r1 = f3809a;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "Acquire:\n mWakeLockName: ";
        r2 = r2.append(r3);
        r3 = r8.f3814f;
        r2 = r2.append(r3);
        r3 = "\n mSecondaryName: ";
        r2 = r2.append(r3);
        r3 = r8.f3815g;
        r2 = r2.append(r3);
        r3 = "\nmReferenceCounted: ";
        r2 = r2.append(r3);
        r3 = r8.f3817i;
        r2 = r2.append(r3);
        r3 = "\nreason: ";
        r2 = r2.append(r3);
        r2 = r2.append(r9);
        r3 = "\nmOpenEventCount";
        r2 = r2.append(r3);
        r3 = r8.f3819k;
        r2 = r2.append(r3);
        r3 = "\nuseWithReason: ";
        r2 = r2.append(r3);
        r2 = r2.append(r0);
        r3 = "\ntrackingName: ";
        r2 = r2.append(r3);
        r2 = r2.append(r5);
        r2 = r2.toString();
        android.util.Log.d(r1, r2);
    L_0x0068:
        monitor-enter(r8);
        r1 = r8.f3817i;	 Catch:{ all -> 0x00a1 }
        if (r1 == 0) goto L_0x0077;
    L_0x006d:
        r1 = r8.f3818j;	 Catch:{ all -> 0x00a1 }
        r2 = r1 + 1;
        r8.f3818j = r2;	 Catch:{ all -> 0x00a1 }
        if (r1 == 0) goto L_0x007f;
    L_0x0075:
        if (r0 != 0) goto L_0x007f;
    L_0x0077:
        r0 = r8.f3817i;	 Catch:{ all -> 0x00a1 }
        if (r0 != 0) goto L_0x009f;
    L_0x007b:
        r0 = r8.f3819k;	 Catch:{ all -> 0x00a1 }
        if (r0 != 0) goto L_0x009f;
    L_0x007f:
        r0 = com.google.android.gms.common.stats.C1538h.m6976a();	 Catch:{ all -> 0x00a1 }
        r1 = r8.f3816h;	 Catch:{ all -> 0x00a1 }
        r2 = r8.f3811c;	 Catch:{ all -> 0x00a1 }
        r2 = com.google.android.gms.common.stats.C1536f.m6971a(r2, r5);	 Catch:{ all -> 0x00a1 }
        r3 = 7;
        r4 = r8.f3814f;	 Catch:{ all -> 0x00a1 }
        r6 = r8.f3813e;	 Catch:{ all -> 0x00a1 }
        r7 = r8.f3812d;	 Catch:{ all -> 0x00a1 }
        r7 = com.google.android.gms.p028c.ix.m5314b(r7);	 Catch:{ all -> 0x00a1 }
        r0.m6980a(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ all -> 0x00a1 }
        r0 = r8.f3819k;	 Catch:{ all -> 0x00a1 }
        r0 = r0 + 1;
        r8.f3819k = r0;	 Catch:{ all -> 0x00a1 }
    L_0x009f:
        monitor-exit(r8);	 Catch:{ all -> 0x00a1 }
        return;
    L_0x00a1:
        r0 = move-exception;
        monitor-exit(r8);	 Catch:{ all -> 0x00a1 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.c.kg.a(java.lang.String):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5505b(java.lang.String r9) {
        /*
        r8 = this;
        r0 = r8.m5506c(r9);
        r5 = r8.m5503a(r9, r0);
        r1 = f3810b;
        if (r1 == 0) goto L_0x0068;
    L_0x000c:
        r1 = f3809a;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "Release:\n mWakeLockName: ";
        r2 = r2.append(r3);
        r3 = r8.f3814f;
        r2 = r2.append(r3);
        r3 = "\n mSecondaryName: ";
        r2 = r2.append(r3);
        r3 = r8.f3815g;
        r2 = r2.append(r3);
        r3 = "\nmReferenceCounted: ";
        r2 = r2.append(r3);
        r3 = r8.f3817i;
        r2 = r2.append(r3);
        r3 = "\nreason: ";
        r2 = r2.append(r3);
        r2 = r2.append(r9);
        r3 = "\n mOpenEventCount";
        r2 = r2.append(r3);
        r3 = r8.f3819k;
        r2 = r2.append(r3);
        r3 = "\nuseWithReason: ";
        r2 = r2.append(r3);
        r2 = r2.append(r0);
        r3 = "\ntrackingName: ";
        r2 = r2.append(r3);
        r2 = r2.append(r5);
        r2 = r2.toString();
        android.util.Log.d(r1, r2);
    L_0x0068:
        monitor-enter(r8);
        r1 = r8.f3817i;	 Catch:{ all -> 0x00a3 }
        if (r1 == 0) goto L_0x0077;
    L_0x006d:
        r1 = r8.f3818j;	 Catch:{ all -> 0x00a3 }
        r1 = r1 + -1;
        r8.f3818j = r1;	 Catch:{ all -> 0x00a3 }
        if (r1 == 0) goto L_0x0080;
    L_0x0075:
        if (r0 != 0) goto L_0x0080;
    L_0x0077:
        r0 = r8.f3817i;	 Catch:{ all -> 0x00a3 }
        if (r0 != 0) goto L_0x00a1;
    L_0x007b:
        r0 = r8.f3819k;	 Catch:{ all -> 0x00a3 }
        r1 = 1;
        if (r0 != r1) goto L_0x00a1;
    L_0x0080:
        r0 = com.google.android.gms.common.stats.C1538h.m6976a();	 Catch:{ all -> 0x00a3 }
        r1 = r8.f3816h;	 Catch:{ all -> 0x00a3 }
        r2 = r8.f3811c;	 Catch:{ all -> 0x00a3 }
        r2 = com.google.android.gms.common.stats.C1536f.m6971a(r2, r5);	 Catch:{ all -> 0x00a3 }
        r3 = 8;
        r4 = r8.f3814f;	 Catch:{ all -> 0x00a3 }
        r6 = r8.f3813e;	 Catch:{ all -> 0x00a3 }
        r7 = r8.f3812d;	 Catch:{ all -> 0x00a3 }
        r7 = com.google.android.gms.p028c.ix.m5314b(r7);	 Catch:{ all -> 0x00a3 }
        r0.m6980a(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ all -> 0x00a3 }
        r0 = r8.f3819k;	 Catch:{ all -> 0x00a3 }
        r0 = r0 + -1;
        r8.f3819k = r0;	 Catch:{ all -> 0x00a3 }
    L_0x00a1:
        monitor-exit(r8);	 Catch:{ all -> 0x00a3 }
        return;
    L_0x00a3:
        r0 = move-exception;
        monitor-exit(r8);	 Catch:{ all -> 0x00a3 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.c.kg.b(java.lang.String):void");
    }

    private boolean m5506c(String str) {
        return (TextUtils.isEmpty(str) || str.equals(this.f3815g)) ? false : true;
    }

    public void m5507a() {
        m5505b(null);
        this.f3811c.release();
    }

    public void m5508a(long j) {
        if (!is.m5288d() && this.f3817i) {
            Log.wtf(f3809a, "Do not acquire with timeout on reference counted WakeLocks before ICS. wakelock: " + this.f3814f);
        }
        m5504a(null);
        this.f3811c.acquire(j);
    }

    public void m5509a(WorkSource workSource) {
        if (ix.m5312a(this.f3816h) && workSource != null) {
            if (this.f3812d != null) {
                this.f3812d.add(workSource);
            } else {
                this.f3812d = workSource;
            }
            this.f3811c.setWorkSource(this.f3812d);
        }
    }

    public void m5510a(boolean z) {
        this.f3811c.setReferenceCounted(z);
        this.f3817i = z;
    }

    public boolean m5511b() {
        return this.f3811c.isHeld();
    }
}
