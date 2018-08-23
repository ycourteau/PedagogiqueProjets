package com.google.android.gms.p028c;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public abstract class C1137m extends C1126l {
    static boolean f4001d = false;
    private static Method f4002e;
    private static Method f4003f;
    private static Method f4004g;
    private static Method f4005h;
    private static Method f4006i;
    private static Method f4007j;
    private static Method f4008k;
    private static Method f4009l;
    private static Method f4010m;
    private static Method f4011n;
    private static Method f4012o;
    private static Method f4013p;
    private static Method f4014q;
    private static String f4015r;
    private static String f4016s;
    private static String f4017t;
    private static long f4018u = 0;
    private static C1145s f4019v;

    static class C1136a extends Exception {
        public C1136a(Throwable th) {
            super(th);
        }
    }

    protected C1137m(Context context, C1032q c1032q, C1143r c1143r) {
        super(context, c1032q, c1143r);
    }

    static String m5822a() {
        if (f4015r != null) {
            return f4015r;
        }
        throw new C1136a();
    }

    static String m5823a(Context context, C1032q c1032q) {
        if (f4016s != null) {
            return f4016s;
        }
        if (f4005h == null) {
            throw new C1136a();
        }
        try {
            ByteBuffer byteBuffer = (ByteBuffer) f4005h.invoke(null, new Object[]{context});
            if (byteBuffer == null) {
                throw new C1136a();
            }
            f4016s = c1032q.mo812a(byteBuffer.array(), true);
            return f4016s;
        } catch (Throwable e) {
            throw new C1136a(e);
        } catch (Throwable e2) {
            throw new C1136a(e2);
        }
    }

    static ArrayList<Long> m5824a(MotionEvent motionEvent, DisplayMetrics displayMetrics) {
        if (f4006i == null || motionEvent == null) {
            throw new C1136a();
        }
        try {
            return (ArrayList) f4006i.invoke(null, new Object[]{motionEvent, displayMetrics});
        } catch (Throwable e) {
            throw new C1136a(e);
        } catch (Throwable e2) {
            throw new C1136a(e2);
        }
    }

    protected static synchronized void m5825a(String str, Context context, C1032q c1032q) {
        synchronized (C1137m.class) {
            if (!f4001d) {
                try {
                    f4019v = new C1145s(c1032q, null);
                    f4015r = str;
                    C1137m.m5838k(context);
                    f4018u = C1137m.m5826b().longValue();
                    f4001d = true;
                } catch (C1136a e) {
                } catch (UnsupportedOperationException e2) {
                }
            }
        }
    }

    static Long m5826b() {
        if (f4002e == null) {
            throw new C1136a();
        }
        try {
            return (Long) f4002e.invoke(null, new Object[0]);
        } catch (Throwable e) {
            throw new C1136a(e);
        } catch (Throwable e2) {
            throw new C1136a(e2);
        }
    }

    static String m5827b(Context context, C1032q c1032q) {
        if (f4017t != null) {
            return f4017t;
        }
        if (f4008k == null) {
            throw new C1136a();
        }
        try {
            ByteBuffer byteBuffer = (ByteBuffer) f4008k.invoke(null, new Object[]{context});
            if (byteBuffer == null) {
                throw new C1136a();
            }
            f4017t = c1032q.mo812a(byteBuffer.array(), true);
            return f4017t;
        } catch (Throwable e) {
            throw new C1136a(e);
        } catch (Throwable e2) {
            throw new C1136a(e2);
        }
    }

    private static String m5828b(byte[] bArr, String str) {
        try {
            return new String(f4019v.m5865a(bArr, str), "UTF-8");
        } catch (Throwable e) {
            throw new C1136a(e);
        } catch (Throwable e2) {
            throw new C1136a(e2);
        }
    }

    static String m5829c() {
        if (f4004g == null) {
            throw new C1136a();
        }
        try {
            return (String) f4004g.invoke(null, new Object[0]);
        } catch (Throwable e) {
            throw new C1136a(e);
        } catch (Throwable e2) {
            throw new C1136a(e2);
        }
    }

    static Long m5830d() {
        if (f4003f == null) {
            throw new C1136a();
        }
        try {
            return (Long) f4003f.invoke(null, new Object[0]);
        } catch (Throwable e) {
            throw new C1136a(e);
        } catch (Throwable e2) {
            throw new C1136a(e2);
        }
    }

    static String m5831d(Context context) {
        if (f4007j == null) {
            throw new C1136a();
        }
        try {
            String str = (String) f4007j.invoke(null, new Object[]{context});
            if (str != null) {
                return str;
            }
            throw new C1136a();
        } catch (Throwable e) {
            throw new C1136a(e);
        } catch (Throwable e2) {
            throw new C1136a(e2);
        }
    }

    static String m5832e(Context context) {
        if (f4011n == null) {
            throw new C1136a();
        }
        try {
            return (String) f4011n.invoke(null, new Object[]{context});
        } catch (Throwable e) {
            throw new C1136a(e);
        } catch (Throwable e2) {
            throw new C1136a(e2);
        }
    }

    static Long m5833f(Context context) {
        if (f4012o == null) {
            throw new C1136a();
        }
        try {
            return (Long) f4012o.invoke(null, new Object[]{context});
        } catch (Throwable e) {
            throw new C1136a(e);
        } catch (Throwable e2) {
            throw new C1136a(e2);
        }
    }

    static ArrayList<Long> m5834g(Context context) {
        if (f4009l == null) {
            throw new C1136a();
        }
        try {
            ArrayList<Long> arrayList = (ArrayList) f4009l.invoke(null, new Object[]{context});
            if (arrayList != null && arrayList.size() == 2) {
                return arrayList;
            }
            throw new C1136a();
        } catch (Throwable e) {
            throw new C1136a(e);
        } catch (Throwable e2) {
            throw new C1136a(e2);
        }
    }

    static int[] m5835h(Context context) {
        if (f4010m == null) {
            throw new C1136a();
        }
        try {
            return (int[]) f4010m.invoke(null, new Object[]{context});
        } catch (Throwable e) {
            throw new C1136a(e);
        } catch (Throwable e2) {
            throw new C1136a(e2);
        }
    }

    static int m5836i(Context context) {
        if (f4013p == null) {
            throw new C1136a();
        }
        try {
            return ((Integer) f4013p.invoke(null, new Object[]{context})).intValue();
        } catch (Throwable e) {
            throw new C1136a(e);
        } catch (Throwable e2) {
            throw new C1136a(e2);
        }
    }

    static int m5837j(Context context) {
        if (f4014q == null) {
            throw new C1136a();
        }
        try {
            return ((Integer) f4014q.invoke(null, new Object[]{context})).intValue();
        } catch (Throwable e) {
            throw new C1136a(e);
        } catch (Throwable e2) {
            throw new C1136a(e2);
        }
    }

    private static void m5838k(Context context) {
        File file;
        File createTempFile;
        try {
            byte[] a = f4019v.m5864a(C1147u.m5872a());
            byte[] a2 = f4019v.m5865a(a, C1147u.m5873b());
            File cacheDir = context.getCacheDir();
            if (cacheDir == null) {
                cacheDir = context.getDir("dex", 0);
                if (cacheDir == null) {
                    throw new C1136a();
                }
            }
            file = cacheDir;
            createTempFile = File.createTempFile("ads", ".jar", file);
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(a2, 0, a2.length);
            fileOutputStream.close();
            DexClassLoader dexClassLoader = new DexClassLoader(createTempFile.getAbsolutePath(), file.getAbsolutePath(), null, context.getClassLoader());
            Class loadClass = dexClassLoader.loadClass(C1137m.m5828b(a, C1147u.m5882k()));
            Class loadClass2 = dexClassLoader.loadClass(C1137m.m5828b(a, C1147u.m5896y()));
            Class loadClass3 = dexClassLoader.loadClass(C1137m.m5828b(a, C1147u.m5890s()));
            Class loadClass4 = dexClassLoader.loadClass(C1137m.m5828b(a, C1147u.m5886o()));
            Class loadClass5 = dexClassLoader.loadClass(C1137m.m5828b(a, C1147u.m5870A()));
            Class loadClass6 = dexClassLoader.loadClass(C1137m.m5828b(a, C1147u.m5884m()));
            Class loadClass7 = dexClassLoader.loadClass(C1137m.m5828b(a, C1147u.m5894w()));
            Class loadClass8 = dexClassLoader.loadClass(C1137m.m5828b(a, C1147u.m5892u()));
            Class loadClass9 = dexClassLoader.loadClass(C1137m.m5828b(a, C1147u.m5880i()));
            Class loadClass10 = dexClassLoader.loadClass(C1137m.m5828b(a, C1147u.m5878g()));
            Class loadClass11 = dexClassLoader.loadClass(C1137m.m5828b(a, C1147u.m5876e()));
            Class loadClass12 = dexClassLoader.loadClass(C1137m.m5828b(a, C1147u.m5888q()));
            Class loadClass13 = dexClassLoader.loadClass(C1137m.m5828b(a, C1147u.m5874c()));
            f4002e = loadClass.getMethod(C1137m.m5828b(a, C1147u.m5883l()), new Class[0]);
            f4003f = loadClass2.getMethod(C1137m.m5828b(a, C1147u.m5897z()), new Class[0]);
            f4004g = loadClass3.getMethod(C1137m.m5828b(a, C1147u.m5891t()), new Class[0]);
            f4005h = loadClass4.getMethod(C1137m.m5828b(a, C1147u.m5887p()), new Class[]{Context.class});
            f4006i = loadClass5.getMethod(C1137m.m5828b(a, C1147u.m5871B()), new Class[]{MotionEvent.class, DisplayMetrics.class});
            f4007j = loadClass6.getMethod(C1137m.m5828b(a, C1147u.m5885n()), new Class[]{Context.class});
            f4008k = loadClass7.getMethod(C1137m.m5828b(a, C1147u.m5895x()), new Class[]{Context.class});
            f4009l = loadClass8.getMethod(C1137m.m5828b(a, C1147u.m5893v()), new Class[]{Context.class});
            f4010m = loadClass9.getMethod(C1137m.m5828b(a, C1147u.m5881j()), new Class[]{Context.class});
            f4011n = loadClass10.getMethod(C1137m.m5828b(a, C1147u.m5879h()), new Class[]{Context.class});
            f4012o = loadClass11.getMethod(C1137m.m5828b(a, C1147u.m5877f()), new Class[]{Context.class});
            f4013p = loadClass12.getMethod(C1137m.m5828b(a, C1147u.m5889r()), new Class[]{Context.class});
            f4014q = loadClass13.getMethod(C1137m.m5828b(a, C1147u.m5875d()), new Class[]{Context.class});
            String name = createTempFile.getName();
            createTempFile.delete();
            new File(file, name.replace(".jar", ".dex")).delete();
        } catch (Throwable e) {
            throw new C1136a(e);
        } catch (Throwable e2) {
            throw new C1136a(e2);
        } catch (Throwable e22) {
            throw new C1136a(e22);
        } catch (Throwable e222) {
            throw new C1136a(e222);
        } catch (Throwable e2222) {
            throw new C1136a(e2222);
        } catch (Throwable e22222) {
            throw new C1136a(e22222);
        } catch (Throwable th) {
            String name2 = createTempFile.getName();
            createTempFile.delete();
            new File(file, name2.replace(".jar", ".dex")).delete();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void mo845b(android.content.Context r7) {
        /*
        r6 = this;
        r0 = 1;
        r1 = com.google.android.gms.p028c.C1137m.m5829c();	 Catch:{ a -> 0x00d3, IOException -> 0x00b9 }
        r6.m5668a(r0, r1);	 Catch:{ a -> 0x00d3, IOException -> 0x00b9 }
    L_0x0008:
        r0 = 2;
        r1 = com.google.android.gms.p028c.C1137m.m5822a();	 Catch:{ a -> 0x00d0, IOException -> 0x00b9 }
        r6.m5668a(r0, r1);	 Catch:{ a -> 0x00d0, IOException -> 0x00b9 }
    L_0x0010:
        r0 = com.google.android.gms.p028c.C1137m.m5826b();	 Catch:{ a -> 0x00cd, IOException -> 0x00b9 }
        r0 = r0.longValue();	 Catch:{ a -> 0x00cd, IOException -> 0x00b9 }
        r2 = 25;
        r6.m5667a(r2, r0);	 Catch:{ a -> 0x00cd, IOException -> 0x00b9 }
        r2 = f4018u;	 Catch:{ a -> 0x00cd, IOException -> 0x00b9 }
        r4 = 0;
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 == 0) goto L_0x0034;
    L_0x0025:
        r2 = 17;
        r4 = f4018u;	 Catch:{ a -> 0x00cd, IOException -> 0x00b9 }
        r0 = r0 - r4;
        r6.m5667a(r2, r0);	 Catch:{ a -> 0x00cd, IOException -> 0x00b9 }
        r0 = 23;
        r2 = f4018u;	 Catch:{ a -> 0x00cd, IOException -> 0x00b9 }
        r6.m5667a(r0, r2);	 Catch:{ a -> 0x00cd, IOException -> 0x00b9 }
    L_0x0034:
        r1 = com.google.android.gms.p028c.C1137m.m5834g(r7);	 Catch:{ a -> 0x00cb, IOException -> 0x00b9 }
        r2 = 31;
        r0 = 0;
        r0 = r1.get(r0);	 Catch:{ a -> 0x00cb, IOException -> 0x00b9 }
        r0 = (java.lang.Long) r0;	 Catch:{ a -> 0x00cb, IOException -> 0x00b9 }
        r4 = r0.longValue();	 Catch:{ a -> 0x00cb, IOException -> 0x00b9 }
        r6.m5667a(r2, r4);	 Catch:{ a -> 0x00cb, IOException -> 0x00b9 }
        r2 = 32;
        r0 = 1;
        r0 = r1.get(r0);	 Catch:{ a -> 0x00cb, IOException -> 0x00b9 }
        r0 = (java.lang.Long) r0;	 Catch:{ a -> 0x00cb, IOException -> 0x00b9 }
        r0 = r0.longValue();	 Catch:{ a -> 0x00cb, IOException -> 0x00b9 }
        r6.m5667a(r2, r0);	 Catch:{ a -> 0x00cb, IOException -> 0x00b9 }
    L_0x0058:
        r0 = 33;
        r1 = com.google.android.gms.p028c.C1137m.m5830d();	 Catch:{ a -> 0x00c9, IOException -> 0x00b9 }
        r2 = r1.longValue();	 Catch:{ a -> 0x00c9, IOException -> 0x00b9 }
        r6.m5667a(r0, r2);	 Catch:{ a -> 0x00c9, IOException -> 0x00b9 }
    L_0x0065:
        r0 = 27;
        r1 = r6.c;	 Catch:{ a -> 0x00c7, IOException -> 0x00b9 }
        r1 = com.google.android.gms.p028c.C1137m.m5823a(r7, r1);	 Catch:{ a -> 0x00c7, IOException -> 0x00b9 }
        r6.m5668a(r0, r1);	 Catch:{ a -> 0x00c7, IOException -> 0x00b9 }
    L_0x0070:
        r0 = 29;
        r1 = r6.c;	 Catch:{ a -> 0x00c5, IOException -> 0x00b9 }
        r1 = com.google.android.gms.p028c.C1137m.m5827b(r7, r1);	 Catch:{ a -> 0x00c5, IOException -> 0x00b9 }
        r6.m5668a(r0, r1);	 Catch:{ a -> 0x00c5, IOException -> 0x00b9 }
    L_0x007b:
        r0 = com.google.android.gms.p028c.C1137m.m5835h(r7);	 Catch:{ a -> 0x00c3, IOException -> 0x00b9 }
        r1 = 5;
        r2 = 0;
        r2 = r0[r2];	 Catch:{ a -> 0x00c3, IOException -> 0x00b9 }
        r2 = (long) r2;	 Catch:{ a -> 0x00c3, IOException -> 0x00b9 }
        r6.m5667a(r1, r2);	 Catch:{ a -> 0x00c3, IOException -> 0x00b9 }
        r1 = 6;
        r2 = 1;
        r0 = r0[r2];	 Catch:{ a -> 0x00c3, IOException -> 0x00b9 }
        r2 = (long) r0;	 Catch:{ a -> 0x00c3, IOException -> 0x00b9 }
        r6.m5667a(r1, r2);	 Catch:{ a -> 0x00c3, IOException -> 0x00b9 }
    L_0x008f:
        r0 = com.google.android.gms.p028c.C1137m.m5836i(r7);	 Catch:{ a -> 0x00c1, IOException -> 0x00b9 }
        r1 = 12;
        r2 = (long) r0;	 Catch:{ a -> 0x00c1, IOException -> 0x00b9 }
        r6.m5667a(r1, r2);	 Catch:{ a -> 0x00c1, IOException -> 0x00b9 }
    L_0x0099:
        r0 = com.google.android.gms.p028c.C1137m.m5837j(r7);	 Catch:{ a -> 0x00bf, IOException -> 0x00b9 }
        r1 = 3;
        r2 = (long) r0;	 Catch:{ a -> 0x00bf, IOException -> 0x00b9 }
        r6.m5667a(r1, r2);	 Catch:{ a -> 0x00bf, IOException -> 0x00b9 }
    L_0x00a2:
        r0 = 34;
        r1 = com.google.android.gms.p028c.C1137m.m5832e(r7);	 Catch:{ a -> 0x00bd, IOException -> 0x00b9 }
        r6.m5668a(r0, r1);	 Catch:{ a -> 0x00bd, IOException -> 0x00b9 }
    L_0x00ab:
        r0 = 35;
        r1 = com.google.android.gms.p028c.C1137m.m5833f(r7);	 Catch:{ a -> 0x00bb, IOException -> 0x00b9 }
        r2 = r1.longValue();	 Catch:{ a -> 0x00bb, IOException -> 0x00b9 }
        r6.m5667a(r0, r2);	 Catch:{ a -> 0x00bb, IOException -> 0x00b9 }
    L_0x00b8:
        return;
    L_0x00b9:
        r0 = move-exception;
        goto L_0x00b8;
    L_0x00bb:
        r0 = move-exception;
        goto L_0x00b8;
    L_0x00bd:
        r0 = move-exception;
        goto L_0x00ab;
    L_0x00bf:
        r0 = move-exception;
        goto L_0x00a2;
    L_0x00c1:
        r0 = move-exception;
        goto L_0x0099;
    L_0x00c3:
        r0 = move-exception;
        goto L_0x008f;
    L_0x00c5:
        r0 = move-exception;
        goto L_0x007b;
    L_0x00c7:
        r0 = move-exception;
        goto L_0x0070;
    L_0x00c9:
        r0 = move-exception;
        goto L_0x0065;
    L_0x00cb:
        r0 = move-exception;
        goto L_0x0058;
    L_0x00cd:
        r0 = move-exception;
        goto L_0x0034;
    L_0x00d0:
        r0 = move-exception;
        goto L_0x0010;
    L_0x00d3:
        r0 = move-exception;
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.c.m.b(android.content.Context):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void mo846c(android.content.Context r7) {
        /*
        r6 = this;
        r0 = 2;
        r1 = com.google.android.gms.p028c.C1137m.m5822a();	 Catch:{ a -> 0x007f, IOException -> 0x0073 }
        r6.m5668a(r0, r1);	 Catch:{ a -> 0x007f, IOException -> 0x0073 }
    L_0x0008:
        r0 = 1;
        r1 = com.google.android.gms.p028c.C1137m.m5829c();	 Catch:{ a -> 0x007d, IOException -> 0x0073 }
        r6.m5668a(r0, r1);	 Catch:{ a -> 0x007d, IOException -> 0x0073 }
    L_0x0010:
        r0 = 25;
        r1 = com.google.android.gms.p028c.C1137m.m5826b();	 Catch:{ a -> 0x007b, IOException -> 0x0073 }
        r2 = r1.longValue();	 Catch:{ a -> 0x007b, IOException -> 0x0073 }
        r6.m5667a(r0, r2);	 Catch:{ a -> 0x007b, IOException -> 0x0073 }
    L_0x001d:
        r0 = r6.a;	 Catch:{ a -> 0x0079, IOException -> 0x0073 }
        r1 = r6.b;	 Catch:{ a -> 0x0079, IOException -> 0x0073 }
        r1 = com.google.android.gms.p028c.C1137m.m5824a(r0, r1);	 Catch:{ a -> 0x0079, IOException -> 0x0073 }
        r2 = 14;
        r0 = 0;
        r0 = r1.get(r0);	 Catch:{ a -> 0x0079, IOException -> 0x0073 }
        r0 = (java.lang.Long) r0;	 Catch:{ a -> 0x0079, IOException -> 0x0073 }
        r4 = r0.longValue();	 Catch:{ a -> 0x0079, IOException -> 0x0073 }
        r6.m5667a(r2, r4);	 Catch:{ a -> 0x0079, IOException -> 0x0073 }
        r2 = 15;
        r0 = 1;
        r0 = r1.get(r0);	 Catch:{ a -> 0x0079, IOException -> 0x0073 }
        r0 = (java.lang.Long) r0;	 Catch:{ a -> 0x0079, IOException -> 0x0073 }
        r4 = r0.longValue();	 Catch:{ a -> 0x0079, IOException -> 0x0073 }
        r6.m5667a(r2, r4);	 Catch:{ a -> 0x0079, IOException -> 0x0073 }
        r0 = r1.size();	 Catch:{ a -> 0x0079, IOException -> 0x0073 }
        r2 = 3;
        if (r0 < r2) goto L_0x005c;
    L_0x004c:
        r2 = 16;
        r0 = 2;
        r0 = r1.get(r0);	 Catch:{ a -> 0x0079, IOException -> 0x0073 }
        r0 = (java.lang.Long) r0;	 Catch:{ a -> 0x0079, IOException -> 0x0073 }
        r0 = r0.longValue();	 Catch:{ a -> 0x0079, IOException -> 0x0073 }
        r6.m5667a(r2, r0);	 Catch:{ a -> 0x0079, IOException -> 0x0073 }
    L_0x005c:
        r0 = 34;
        r1 = com.google.android.gms.p028c.C1137m.m5832e(r7);	 Catch:{ a -> 0x0077, IOException -> 0x0073 }
        r6.m5668a(r0, r1);	 Catch:{ a -> 0x0077, IOException -> 0x0073 }
    L_0x0065:
        r0 = 35;
        r1 = com.google.android.gms.p028c.C1137m.m5833f(r7);	 Catch:{ a -> 0x0075, IOException -> 0x0073 }
        r2 = r1.longValue();	 Catch:{ a -> 0x0075, IOException -> 0x0073 }
        r6.m5667a(r0, r2);	 Catch:{ a -> 0x0075, IOException -> 0x0073 }
    L_0x0072:
        return;
    L_0x0073:
        r0 = move-exception;
        goto L_0x0072;
    L_0x0075:
        r0 = move-exception;
        goto L_0x0072;
    L_0x0077:
        r0 = move-exception;
        goto L_0x0065;
    L_0x0079:
        r0 = move-exception;
        goto L_0x005c;
    L_0x007b:
        r0 = move-exception;
        goto L_0x001d;
    L_0x007d:
        r0 = move-exception;
        goto L_0x0010;
    L_0x007f:
        r0 = move-exception;
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.c.m.c(android.content.Context):void");
    }
}
