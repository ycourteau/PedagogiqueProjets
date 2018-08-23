package com.google.android.gms.p028c;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.p028c.kr.C1121g;
import com.google.android.gms.p032d.aj;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class kt {
    public static final Integer f3913a = Integer.valueOf(0);
    public static final Integer f3914b = Integer.valueOf(1);
    private final Context f3915c;
    private final ExecutorService f3916d;

    public kt(Context context) {
        this(context, Executors.newSingleThreadExecutor());
    }

    kt(Context context, ExecutorService executorService) {
        this.f3915c = context;
        this.f3916d = executorService;
    }

    private byte[] m5630a(InputStream inputStream) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            io.m5275a(inputStream, byteArrayOutputStream);
        } catch (IOException e) {
            aj.m7038b("Failed to read the resource from disk");
            return byteArrayOutputStream.toByteArray();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e2) {
                aj.m7038b("Error closing stream for reading resource from disk");
                return null;
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    private String m5631c(String str) {
        return "resource_" + str;
    }

    public long m5632a(String str) {
        File b = m5635b(str);
        return b.exists() ? b.lastModified() : 0;
    }

    public void m5633a(String str, Integer num, kn knVar, ks ksVar) {
        final String str2 = str;
        final Integer num2 = num;
        final kn knVar2 = knVar;
        final ks ksVar2 = ksVar;
        this.f3916d.execute(new Runnable(this) {
            final /* synthetic */ kt f3909e;

            public void run() {
                this.f3909e.m5636b(str2, num2, knVar2, ksVar2);
            }
        });
    }

    public void m5634a(final String str, final byte[] bArr) {
        this.f3916d.execute(new Runnable(this) {
            final /* synthetic */ kt f3912c;

            public void run() {
                this.f3912c.m5637b(str, bArr);
            }
        });
    }

    File m5635b(String str) {
        return new File(this.f3915c.getDir("google_tagmanager", 0), m5631c(str));
    }

    void m5636b(String str, Integer num, kn knVar, ks ksVar) {
        Object a;
        aj.m7041d("DiskLoader: Starting to load resource from Disk.");
        try {
            a = knVar.mo837a(m5630a(new FileInputStream(m5635b(str))));
            if (a != null) {
                aj.m7041d("Saved resource loaded: " + m5631c(str));
                ksVar.mo834a(Status.f4094a, a, f3914b, m5632a(str));
                return;
            }
        } catch (FileNotFoundException e) {
            aj.m7036a("Saved resource not found: " + m5631c(str));
        } catch (C1121g e2) {
            aj.m7036a("Saved resource is corrupted: " + m5631c(str));
        }
        if (num == null) {
            ksVar.mo834a(Status.f4096c, null, null, 0);
            return;
        }
        try {
            InputStream openRawResource = this.f3915c.getResources().openRawResource(num.intValue());
            if (openRawResource != null) {
                a = knVar.mo837a(m5630a(openRawResource));
                if (a != null) {
                    aj.m7041d("Default resource loaded: " + this.f3915c.getResources().getResourceEntryName(num.intValue()));
                    ksVar.mo834a(Status.f4094a, a, f3913a, 0);
                    return;
                }
            }
        } catch (NotFoundException e3) {
            aj.m7036a("Default resource not found. ID: " + num);
        } catch (C1121g e4) {
            aj.m7036a("Default resource resource is corrupted: " + num);
        }
        ksVar.mo834a(Status.f4096c, null, null, 0);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void m5637b(java.lang.String r4, byte[] r5) {
        /*
        r3 = this;
        r0 = r3.m5635b(r4);
        r1 = new java.io.FileOutputStream;	 Catch:{ FileNotFoundException -> 0x002c }
        r1.<init>(r0);	 Catch:{ FileNotFoundException -> 0x002c }
        r1.write(r5);	 Catch:{ IOException -> 0x003a }
        r1.close();	 Catch:{ IOException -> 0x0033 }
        r0 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0033 }
        r0.<init>();	 Catch:{ IOException -> 0x0033 }
        r1 = "Resource ";
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x0033 }
        r0 = r0.append(r4);	 Catch:{ IOException -> 0x0033 }
        r1 = " saved on Disk.";
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x0033 }
        r0 = r0.toString();	 Catch:{ IOException -> 0x0033 }
        com.google.android.gms.p032d.aj.m7041d(r0);	 Catch:{ IOException -> 0x0033 }
    L_0x002b:
        return;
    L_0x002c:
        r0 = move-exception;
        r0 = "Error opening resource file for writing";
        com.google.android.gms.p032d.aj.m7036a(r0);
        goto L_0x002b;
    L_0x0033:
        r0 = move-exception;
        r0 = "Error closing stream for writing resource to disk";
        com.google.android.gms.p032d.aj.m7036a(r0);
        goto L_0x002b;
    L_0x003a:
        r2 = move-exception;
        r2 = "Error writing resource to disk. Removing resource from disk";
        com.google.android.gms.p032d.aj.m7036a(r2);	 Catch:{ all -> 0x006a }
        r0.delete();	 Catch:{ all -> 0x006a }
        r1.close();	 Catch:{ IOException -> 0x0063 }
        r0 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0063 }
        r0.<init>();	 Catch:{ IOException -> 0x0063 }
        r1 = "Resource ";
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x0063 }
        r0 = r0.append(r4);	 Catch:{ IOException -> 0x0063 }
        r1 = " saved on Disk.";
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x0063 }
        r0 = r0.toString();	 Catch:{ IOException -> 0x0063 }
        com.google.android.gms.p032d.aj.m7041d(r0);	 Catch:{ IOException -> 0x0063 }
        goto L_0x002b;
    L_0x0063:
        r0 = move-exception;
        r0 = "Error closing stream for writing resource to disk";
        com.google.android.gms.p032d.aj.m7036a(r0);
        goto L_0x002b;
    L_0x006a:
        r0 = move-exception;
        r1.close();	 Catch:{ IOException -> 0x008b }
        r1 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x008b }
        r1.<init>();	 Catch:{ IOException -> 0x008b }
        r2 = "Resource ";
        r1 = r1.append(r2);	 Catch:{ IOException -> 0x008b }
        r1 = r1.append(r4);	 Catch:{ IOException -> 0x008b }
        r2 = " saved on Disk.";
        r1 = r1.append(r2);	 Catch:{ IOException -> 0x008b }
        r1 = r1.toString();	 Catch:{ IOException -> 0x008b }
        com.google.android.gms.p032d.aj.m7041d(r1);	 Catch:{ IOException -> 0x008b }
    L_0x008a:
        throw r0;
    L_0x008b:
        r1 = move-exception;
        r1 = "Error closing stream for writing resource to disk";
        com.google.android.gms.p032d.aj.m7036a(r1);
        goto L_0x008a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.c.kt.b(java.lang.String, byte[]):void");
    }
}
