package com.google.android.gms.p028c;

import com.google.android.gms.ads.internal.util.client.C0691b;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@fn
public class cu extends cr {
    private static final Set<String> f2645b = Collections.synchronizedSet(new HashSet());
    private static final DecimalFormat f2646c = new DecimalFormat("#,###");
    private File f2647d;
    private boolean f2648e;

    public cu(hg hgVar) {
        super(hgVar);
        File cacheDir = hgVar.getContext().getCacheDir();
        if (cacheDir == null) {
            C0691b.m3103e("Context.getCacheDir() returned null");
            return;
        }
        this.f2647d = new File(cacheDir, "admobVideoStreams");
        if (!this.f2647d.isDirectory() && !this.f2647d.mkdirs()) {
            C0691b.m3103e("Could not create preload cache directory at " + this.f2647d.getAbsolutePath());
            this.f2647d = null;
        } else if (!this.f2647d.setReadable(true, false) || !this.f2647d.setExecutable(true, false)) {
            C0691b.m3103e("Could not set cache file permissions at " + this.f2647d.getAbsolutePath());
            this.f2647d = null;
        }
    }

    private File m4129a(File file) {
        return new File(this.f2647d, file.getName() + ".done");
    }

    private static void m4130b(File file) {
        if (file.isFile()) {
            file.setLastModified(System.currentTimeMillis());
            return;
        }
        try {
            file.createNewFile();
        } catch (IOException e) {
        }
    }

    public void mo628a() {
        this.f2648e = true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo629a(java.lang.String r25) {
        /*
        r24 = this;
        r0 = r24;
        r2 = r0.f2647d;
        if (r2 != 0) goto L_0x0010;
    L_0x0006:
        r2 = 0;
        r0 = r24;
        r1 = r25;
        r0.m4122a(r1, r2);
        r2 = 0;
    L_0x000f:
        return r2;
    L_0x0010:
        r3 = r24.m4133c();
        r2 = com.google.android.gms.p028c.az.f2489o;
        r2 = r2.m3878c();
        r2 = (java.lang.Integer) r2;
        r2 = r2.intValue();
        if (r3 <= r2) goto L_0x0037;
    L_0x0022:
        r2 = r24.m4134d();
        if (r2 != 0) goto L_0x0010;
    L_0x0028:
        r2 = "Unable to expire stream cache";
        com.google.android.gms.ads.internal.util.client.C0691b.m3103e(r2);
        r2 = 0;
        r0 = r24;
        r1 = r25;
        r0.m4122a(r1, r2);
        r2 = 0;
        goto L_0x000f;
    L_0x0037:
        r2 = r24.m4126b(r25);
        r9 = new java.io.File;
        r0 = r24;
        r3 = r0.f2647d;
        r9.<init>(r3, r2);
        r0 = r24;
        r10 = r0.m4129a(r9);
        r2 = r9.isFile();
        if (r2 == 0) goto L_0x0080;
    L_0x0050:
        r2 = r10.isFile();
        if (r2 == 0) goto L_0x0080;
    L_0x0056:
        r2 = r9.length();
        r2 = (int) r2;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "Stream cache hit at ";
        r3 = r3.append(r4);
        r0 = r25;
        r3 = r3.append(r0);
        r3 = r3.toString();
        com.google.android.gms.ads.internal.util.client.C0691b.m3093a(r3);
        r3 = r9.getAbsolutePath();
        r0 = r24;
        r1 = r25;
        r0.m4123a(r1, r3, r2);
        r2 = 1;
        goto L_0x000f;
    L_0x0080:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r0 = r24;
        r3 = r0.f2647d;
        r3 = r3.getAbsolutePath();
        r2 = r2.append(r3);
        r0 = r25;
        r2 = r2.append(r0);
        r11 = r2.toString();
        r3 = f2645b;
        monitor-enter(r3);
        r2 = f2645b;	 Catch:{ all -> 0x00cd }
        r2 = r2.contains(r11);	 Catch:{ all -> 0x00cd }
        if (r2 == 0) goto L_0x00d0;
    L_0x00a6:
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00cd }
        r2.<init>();	 Catch:{ all -> 0x00cd }
        r4 = "Stream cache already in progress at ";
        r2 = r2.append(r4);	 Catch:{ all -> 0x00cd }
        r0 = r25;
        r2 = r2.append(r0);	 Catch:{ all -> 0x00cd }
        r2 = r2.toString();	 Catch:{ all -> 0x00cd }
        com.google.android.gms.ads.internal.util.client.C0691b.m3103e(r2);	 Catch:{ all -> 0x00cd }
        r2 = r9.getAbsolutePath();	 Catch:{ all -> 0x00cd }
        r0 = r24;
        r1 = r25;
        r0.m4122a(r1, r2);	 Catch:{ all -> 0x00cd }
        r2 = 0;
        monitor-exit(r3);	 Catch:{ all -> 0x00cd }
        goto L_0x000f;
    L_0x00cd:
        r2 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x00cd }
        throw r2;
    L_0x00d0:
        r2 = f2645b;	 Catch:{ all -> 0x00cd }
        r2.add(r11);	 Catch:{ all -> 0x00cd }
        monitor-exit(r3);	 Catch:{ all -> 0x00cd }
        r4 = 0;
        r2 = new java.net.URL;	 Catch:{ IOException -> 0x0129 }
        r0 = r25;
        r2.<init>(r0);	 Catch:{ IOException -> 0x0129 }
        r3 = r2.openConnection();	 Catch:{ IOException -> 0x0129 }
        r2 = com.google.android.gms.p028c.az.f2494t;	 Catch:{ IOException -> 0x0129 }
        r2 = r2.m3878c();	 Catch:{ IOException -> 0x0129 }
        r2 = (java.lang.Integer) r2;	 Catch:{ IOException -> 0x0129 }
        r2 = r2.intValue();	 Catch:{ IOException -> 0x0129 }
        r3.setConnectTimeout(r2);	 Catch:{ IOException -> 0x0129 }
        r3.setReadTimeout(r2);	 Catch:{ IOException -> 0x0129 }
        r2 = r3 instanceof java.net.HttpURLConnection;	 Catch:{ IOException -> 0x0129 }
        if (r2 == 0) goto L_0x018b;
    L_0x00f8:
        r0 = r3;
        r0 = (java.net.HttpURLConnection) r0;	 Catch:{ IOException -> 0x0129 }
        r2 = r0;
        r2 = r2.getResponseCode();	 Catch:{ IOException -> 0x0129 }
        r5 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        if (r2 < r5) goto L_0x018b;
    L_0x0104:
        r3 = new java.io.IOException;	 Catch:{ IOException -> 0x0129 }
        r5 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0129 }
        r5.<init>();	 Catch:{ IOException -> 0x0129 }
        r6 = "HTTP status code ";
        r5 = r5.append(r6);	 Catch:{ IOException -> 0x0129 }
        r2 = r5.append(r2);	 Catch:{ IOException -> 0x0129 }
        r5 = " at ";
        r2 = r2.append(r5);	 Catch:{ IOException -> 0x0129 }
        r0 = r25;
        r2 = r2.append(r0);	 Catch:{ IOException -> 0x0129 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x0129 }
        r3.<init>(r2);	 Catch:{ IOException -> 0x0129 }
        throw r3;	 Catch:{ IOException -> 0x0129 }
    L_0x0129:
        r2 = move-exception;
        r3 = r4;
    L_0x012b:
        r3.close();	 Catch:{ IOException -> 0x032d, NullPointerException -> 0x0330 }
    L_0x012e:
        r0 = r24;
        r3 = r0.f2648e;
        if (r3 == 0) goto L_0x030d;
    L_0x0134:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "Preload aborted for URL \"";
        r2 = r2.append(r3);
        r0 = r25;
        r2 = r2.append(r0);
        r3 = "\"";
        r2 = r2.append(r3);
        r2 = r2.toString();
        com.google.android.gms.ads.internal.util.client.C0691b.m3099c(r2);
    L_0x0152:
        r2 = r9.exists();
        if (r2 == 0) goto L_0x0178;
    L_0x0158:
        r2 = r9.delete();
        if (r2 != 0) goto L_0x0178;
    L_0x015e:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "Could not delete partial cache file at ";
        r2 = r2.append(r3);
        r3 = r9.getAbsolutePath();
        r2 = r2.append(r3);
        r2 = r2.toString();
        com.google.android.gms.ads.internal.util.client.C0691b.m3103e(r2);
    L_0x0178:
        r2 = r9.getAbsolutePath();
        r0 = r24;
        r1 = r25;
        r0.m4122a(r1, r2);
        r2 = f2645b;
        r2.remove(r11);
        r2 = 0;
        goto L_0x000f;
    L_0x018b:
        r6 = r3.getContentLength();	 Catch:{ IOException -> 0x0129 }
        if (r6 >= 0) goto L_0x01bc;
    L_0x0191:
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0129 }
        r2.<init>();	 Catch:{ IOException -> 0x0129 }
        r3 = "Stream cache aborted, missing content-length header at ";
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x0129 }
        r0 = r25;
        r2 = r2.append(r0);	 Catch:{ IOException -> 0x0129 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x0129 }
        com.google.android.gms.ads.internal.util.client.C0691b.m3103e(r2);	 Catch:{ IOException -> 0x0129 }
        r2 = r9.getAbsolutePath();	 Catch:{ IOException -> 0x0129 }
        r0 = r24;
        r1 = r25;
        r0.m4122a(r1, r2);	 Catch:{ IOException -> 0x0129 }
        r2 = f2645b;	 Catch:{ IOException -> 0x0129 }
        r2.remove(r11);	 Catch:{ IOException -> 0x0129 }
        r2 = 0;
        goto L_0x000f;
    L_0x01bc:
        r2 = f2646c;	 Catch:{ IOException -> 0x0129 }
        r12 = (long) r6;	 Catch:{ IOException -> 0x0129 }
        r5 = r2.format(r12);	 Catch:{ IOException -> 0x0129 }
        r2 = com.google.android.gms.p028c.az.f2490p;	 Catch:{ IOException -> 0x0129 }
        r2 = r2.m3878c();	 Catch:{ IOException -> 0x0129 }
        r2 = (java.lang.Integer) r2;	 Catch:{ IOException -> 0x0129 }
        r12 = r2.intValue();	 Catch:{ IOException -> 0x0129 }
        if (r6 <= r12) goto L_0x0206;
    L_0x01d1:
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0129 }
        r2.<init>();	 Catch:{ IOException -> 0x0129 }
        r3 = "Content length ";
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x0129 }
        r2 = r2.append(r5);	 Catch:{ IOException -> 0x0129 }
        r3 = " exceeds limit at ";
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x0129 }
        r0 = r25;
        r2 = r2.append(r0);	 Catch:{ IOException -> 0x0129 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x0129 }
        com.google.android.gms.ads.internal.util.client.C0691b.m3103e(r2);	 Catch:{ IOException -> 0x0129 }
        r2 = r9.getAbsolutePath();	 Catch:{ IOException -> 0x0129 }
        r0 = r24;
        r1 = r25;
        r0.m4122a(r1, r2);	 Catch:{ IOException -> 0x0129 }
        r2 = f2645b;	 Catch:{ IOException -> 0x0129 }
        r2.remove(r11);	 Catch:{ IOException -> 0x0129 }
        r2 = 0;
        goto L_0x000f;
    L_0x0206:
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0129 }
        r2.<init>();	 Catch:{ IOException -> 0x0129 }
        r7 = "Caching ";
        r2 = r2.append(r7);	 Catch:{ IOException -> 0x0129 }
        r2 = r2.append(r5);	 Catch:{ IOException -> 0x0129 }
        r5 = " bytes from ";
        r2 = r2.append(r5);	 Catch:{ IOException -> 0x0129 }
        r0 = r25;
        r2 = r2.append(r0);	 Catch:{ IOException -> 0x0129 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x0129 }
        com.google.android.gms.ads.internal.util.client.C0691b.m3093a(r2);	 Catch:{ IOException -> 0x0129 }
        r2 = r3.getInputStream();	 Catch:{ IOException -> 0x0129 }
        r13 = java.nio.channels.Channels.newChannel(r2);	 Catch:{ IOException -> 0x0129 }
        r8 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x0129 }
        r8.<init>(r9);	 Catch:{ IOException -> 0x0129 }
        r14 = r8.getChannel();	 Catch:{ IOException -> 0x0278 }
        r2 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        r15 = java.nio.ByteBuffer.allocate(r2);	 Catch:{ IOException -> 0x0278 }
        r16 = com.google.android.gms.ads.internal.C0618p.m2800i();	 Catch:{ IOException -> 0x0278 }
        r5 = 0;
        r18 = r16.mo824a();	 Catch:{ IOException -> 0x0278 }
        r2 = com.google.android.gms.p028c.az.f2493s;	 Catch:{ IOException -> 0x0278 }
        r2 = r2.m3878c();	 Catch:{ IOException -> 0x0278 }
        r2 = (java.lang.Long) r2;	 Catch:{ IOException -> 0x0278 }
        r2 = r2.longValue();	 Catch:{ IOException -> 0x0278 }
        r17 = new com.google.android.gms.c.gw;	 Catch:{ IOException -> 0x0278 }
        r0 = r17;
        r0.<init>(r2);	 Catch:{ IOException -> 0x0278 }
        r2 = com.google.android.gms.p028c.az.f2492r;	 Catch:{ IOException -> 0x0278 }
        r2 = r2.m3878c();	 Catch:{ IOException -> 0x0278 }
        r2 = (java.lang.Long) r2;	 Catch:{ IOException -> 0x0278 }
        r20 = r2.longValue();	 Catch:{ IOException -> 0x0278 }
    L_0x0267:
        r2 = r13.read(r15);	 Catch:{ IOException -> 0x0278 }
        if (r2 < 0) goto L_0x02bf;
    L_0x026d:
        r5 = r5 + r2;
        if (r5 <= r12) goto L_0x027c;
    L_0x0270:
        r2 = new java.io.IOException;	 Catch:{ IOException -> 0x0278 }
        r3 = "stream cache file size limit exceeded";
        r2.<init>(r3);	 Catch:{ IOException -> 0x0278 }
        throw r2;	 Catch:{ IOException -> 0x0278 }
    L_0x0278:
        r2 = move-exception;
        r3 = r8;
        goto L_0x012b;
    L_0x027c:
        r15.flip();	 Catch:{ IOException -> 0x0278 }
    L_0x027f:
        r2 = r14.write(r15);	 Catch:{ IOException -> 0x0278 }
        if (r2 > 0) goto L_0x027f;
    L_0x0285:
        r15.clear();	 Catch:{ IOException -> 0x0278 }
        r2 = r16.mo824a();	 Catch:{ IOException -> 0x0278 }
        r2 = r2 - r18;
        r22 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r22 = r22 * r20;
        r2 = (r2 > r22 ? 1 : (r2 == r22 ? 0 : -1));
        if (r2 <= 0) goto L_0x029e;
    L_0x0296:
        r2 = new java.io.IOException;	 Catch:{ IOException -> 0x0278 }
        r3 = "stream cache time limit exceeded";
        r2.<init>(r3);	 Catch:{ IOException -> 0x0278 }
        throw r2;	 Catch:{ IOException -> 0x0278 }
    L_0x029e:
        r0 = r24;
        r2 = r0.f2648e;	 Catch:{ IOException -> 0x0278 }
        if (r2 == 0) goto L_0x02ac;
    L_0x02a4:
        r2 = new java.io.IOException;	 Catch:{ IOException -> 0x0278 }
        r3 = "abort requested";
        r2.<init>(r3);	 Catch:{ IOException -> 0x0278 }
        throw r2;	 Catch:{ IOException -> 0x0278 }
    L_0x02ac:
        r2 = r17.m4968a();	 Catch:{ IOException -> 0x0278 }
        if (r2 == 0) goto L_0x0267;
    L_0x02b2:
        r4 = r9.getAbsolutePath();	 Catch:{ IOException -> 0x0278 }
        r7 = 0;
        r2 = r24;
        r3 = r25;
        r2.m4124a(r3, r4, r5, r6, r7);	 Catch:{ IOException -> 0x0278 }
        goto L_0x0267;
    L_0x02bf:
        r8.close();	 Catch:{ IOException -> 0x0278 }
        r2 = 3;
        r2 = com.google.android.gms.ads.internal.util.client.C0691b.m3096a(r2);	 Catch:{ IOException -> 0x0278 }
        if (r2 == 0) goto L_0x02f2;
    L_0x02c9:
        r2 = f2646c;	 Catch:{ IOException -> 0x0278 }
        r6 = (long) r5;	 Catch:{ IOException -> 0x0278 }
        r2 = r2.format(r6);	 Catch:{ IOException -> 0x0278 }
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0278 }
        r3.<init>();	 Catch:{ IOException -> 0x0278 }
        r4 = "Preloaded ";
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x0278 }
        r2 = r3.append(r2);	 Catch:{ IOException -> 0x0278 }
        r3 = " bytes from ";
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x0278 }
        r0 = r25;
        r2 = r2.append(r0);	 Catch:{ IOException -> 0x0278 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x0278 }
        com.google.android.gms.ads.internal.util.client.C0691b.m3093a(r2);	 Catch:{ IOException -> 0x0278 }
    L_0x02f2:
        r2 = 1;
        r3 = 0;
        r9.setReadable(r2, r3);	 Catch:{ IOException -> 0x0278 }
        com.google.android.gms.p028c.cu.m4130b(r10);	 Catch:{ IOException -> 0x0278 }
        r2 = r9.getAbsolutePath();	 Catch:{ IOException -> 0x0278 }
        r0 = r24;
        r1 = r25;
        r0.m4123a(r1, r2, r5);	 Catch:{ IOException -> 0x0278 }
        r2 = f2645b;	 Catch:{ IOException -> 0x0278 }
        r2.remove(r11);	 Catch:{ IOException -> 0x0278 }
        r2 = 1;
        goto L_0x000f;
    L_0x030d:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "Preload failed for URL \"";
        r3 = r3.append(r4);
        r0 = r25;
        r3 = r3.append(r0);
        r4 = "\"";
        r3 = r3.append(r4);
        r3 = r3.toString();
        com.google.android.gms.ads.internal.util.client.C0691b.m3102d(r3, r2);
        goto L_0x0152;
    L_0x032d:
        r3 = move-exception;
        goto L_0x012e;
    L_0x0330:
        r3 = move-exception;
        goto L_0x012e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.c.cu.a(java.lang.String):boolean");
    }

    public int m4133c() {
        int i = 0;
        if (this.f2647d != null) {
            for (File name : this.f2647d.listFiles()) {
                if (!name.getName().endsWith(".done")) {
                    i++;
                }
            }
        }
        return i;
    }

    public boolean m4134d() {
        if (this.f2647d == null) {
            return false;
        }
        boolean delete;
        File file = null;
        long j = Long.MAX_VALUE;
        File[] listFiles = this.f2647d.listFiles();
        int length = listFiles.length;
        int i = 0;
        while (i < length) {
            long lastModified;
            File file2;
            File file3 = listFiles[i];
            if (!file3.getName().endsWith(".done")) {
                lastModified = file3.lastModified();
                if (lastModified < j) {
                    file2 = file3;
                    i++;
                    file = file2;
                    j = lastModified;
                }
            }
            lastModified = j;
            file2 = file;
            i++;
            file = file2;
            j = lastModified;
        }
        if (file != null) {
            delete = file.delete();
            File a = m4129a(file);
            if (a.isFile()) {
                delete &= a.delete();
            }
        } else {
            delete = false;
        }
        return delete;
    }
}
