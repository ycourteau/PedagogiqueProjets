package com.google.android.gms.p028c;

import android.os.SystemClock;
import com.google.android.gms.p028c.aa.C0805a;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class lr implements aa {
    private final Map<String, C1132a> f3994a;
    private long f3995b;
    private final File f3996c;
    private final int f3997d;

    static class C1132a {
        public long f3985a;
        public String f3986b;
        public String f3987c;
        public long f3988d;
        public long f3989e;
        public long f3990f;
        public long f3991g;
        public Map<String, String> f3992h;

        private C1132a() {
        }

        public C1132a(String str, C0805a c0805a) {
            this.f3986b = str;
            this.f3985a = (long) c0805a.f2353a.length;
            this.f3987c = c0805a.f2354b;
            this.f3988d = c0805a.f2355c;
            this.f3989e = c0805a.f2356d;
            this.f3990f = c0805a.f2357e;
            this.f3991g = c0805a.f2358f;
            this.f3992h = c0805a.f2359g;
        }

        public static C1132a m5782a(InputStream inputStream) {
            C1132a c1132a = new C1132a();
            if (lr.m5786a(inputStream) != 538247942) {
                throw new IOException();
            }
            c1132a.f3986b = lr.m5795c(inputStream);
            c1132a.f3987c = lr.m5795c(inputStream);
            if (c1132a.f3987c.equals("")) {
                c1132a.f3987c = null;
            }
            c1132a.f3988d = lr.m5794b(inputStream);
            c1132a.f3989e = lr.m5794b(inputStream);
            c1132a.f3990f = lr.m5794b(inputStream);
            c1132a.f3991g = lr.m5794b(inputStream);
            c1132a.f3992h = lr.m5797d(inputStream);
            return c1132a;
        }

        public C0805a m5783a(byte[] bArr) {
            C0805a c0805a = new C0805a();
            c0805a.f2353a = bArr;
            c0805a.f2354b = this.f3987c;
            c0805a.f2355c = this.f3988d;
            c0805a.f2356d = this.f3989e;
            c0805a.f2357e = this.f3990f;
            c0805a.f2358f = this.f3991g;
            c0805a.f2359g = this.f3992h;
            return c0805a;
        }

        public boolean m5784a(OutputStream outputStream) {
            try {
                lr.m5788a(outputStream, 538247942);
                lr.m5790a(outputStream, this.f3986b);
                lr.m5790a(outputStream, this.f3987c == null ? "" : this.f3987c);
                lr.m5789a(outputStream, this.f3988d);
                lr.m5789a(outputStream, this.f3989e);
                lr.m5789a(outputStream, this.f3990f);
                lr.m5789a(outputStream, this.f3991g);
                lr.m5792a(this.f3992h, outputStream);
                outputStream.flush();
                return true;
            } catch (IOException e) {
                ln.m5767b("%s", e.toString());
                return false;
            }
        }
    }

    private static class C1133b extends FilterInputStream {
        private int f3993a;

        private C1133b(InputStream inputStream) {
            super(inputStream);
            this.f3993a = 0;
        }

        public int read() {
            int read = super.read();
            if (read != -1) {
                this.f3993a++;
            }
            return read;
        }

        public int read(byte[] bArr, int i, int i2) {
            int read = super.read(bArr, i, i2);
            if (read != -1) {
                this.f3993a += read;
            }
            return read;
        }
    }

    public lr(File file) {
        this(file, 5242880);
    }

    public lr(File file, int i) {
        this.f3994a = new LinkedHashMap(16, 0.75f, true);
        this.f3995b = 0;
        this.f3996c = file;
        this.f3997d = i;
    }

    static int m5786a(InputStream inputStream) {
        return (((0 | (lr.m5798e(inputStream) << 0)) | (lr.m5798e(inputStream) << 8)) | (lr.m5798e(inputStream) << 16)) | (lr.m5798e(inputStream) << 24);
    }

    private void m5787a(int i) {
        if (this.f3995b + ((long) i) >= ((long) this.f3997d)) {
            int i2;
            if (ln.f3966b) {
                ln.m5765a("Pruning old cache entries.", new Object[0]);
            }
            long j = this.f3995b;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Iterator it = this.f3994a.entrySet().iterator();
            int i3 = 0;
            while (it.hasNext()) {
                C1132a c1132a = (C1132a) ((Entry) it.next()).getValue();
                if (m5804c(c1132a.f3986b).delete()) {
                    this.f3995b -= c1132a.f3985a;
                } else {
                    ln.m5767b("Could not delete cache entry for key=%s, filename=%s", c1132a.f3986b, m5796d(c1132a.f3986b));
                }
                it.remove();
                i2 = i3 + 1;
                if (((float) (this.f3995b + ((long) i))) < ((float) this.f3997d) * 0.9f) {
                    break;
                }
                i3 = i2;
            }
            i2 = i3;
            if (ln.f3966b) {
                ln.m5765a("pruned %d files, %d bytes, %d ms", Integer.valueOf(i2), Long.valueOf(this.f3995b - j), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
            }
        }
    }

    static void m5788a(OutputStream outputStream, int i) {
        outputStream.write((i >> 0) & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    static void m5789a(OutputStream outputStream, long j) {
        outputStream.write((byte) ((int) (j >>> null)));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 56)));
    }

    static void m5790a(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        lr.m5789a(outputStream, (long) bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    private void m5791a(String str, C1132a c1132a) {
        if (this.f3994a.containsKey(str)) {
            C1132a c1132a2 = (C1132a) this.f3994a.get(str);
            this.f3995b = (c1132a.f3985a - c1132a2.f3985a) + this.f3995b;
        } else {
            this.f3995b += c1132a.f3985a;
        }
        this.f3994a.put(str, c1132a);
    }

    static void m5792a(Map<String, String> map, OutputStream outputStream) {
        if (map != null) {
            lr.m5788a(outputStream, map.size());
            for (Entry entry : map.entrySet()) {
                lr.m5790a(outputStream, (String) entry.getKey());
                lr.m5790a(outputStream, (String) entry.getValue());
            }
            return;
        }
        lr.m5788a(outputStream, 0);
    }

    private static byte[] m5793a(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read == -1) {
                break;
            }
            i2 += read;
        }
        if (i2 == i) {
            return bArr;
        }
        throw new IOException("Expected " + i + " bytes, read " + i2 + " bytes");
    }

    static long m5794b(InputStream inputStream) {
        return (((((((0 | ((((long) lr.m5798e(inputStream)) & 255) << null)) | ((((long) lr.m5798e(inputStream)) & 255) << 8)) | ((((long) lr.m5798e(inputStream)) & 255) << 16)) | ((((long) lr.m5798e(inputStream)) & 255) << 24)) | ((((long) lr.m5798e(inputStream)) & 255) << 32)) | ((((long) lr.m5798e(inputStream)) & 255) << 40)) | ((((long) lr.m5798e(inputStream)) & 255) << 48)) | ((((long) lr.m5798e(inputStream)) & 255) << 56);
    }

    static String m5795c(InputStream inputStream) {
        return new String(lr.m5793a(inputStream, (int) lr.m5794b(inputStream)), "UTF-8");
    }

    private String m5796d(String str) {
        int length = str.length() / 2;
        return String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode());
    }

    static Map<String, String> m5797d(InputStream inputStream) {
        int a = lr.m5786a(inputStream);
        Map<String, String> emptyMap = a == 0 ? Collections.emptyMap() : new HashMap(a);
        for (int i = 0; i < a; i++) {
            emptyMap.put(lr.m5795c(inputStream).intern(), lr.m5795c(inputStream).intern());
        }
        return emptyMap;
    }

    private static int m5798e(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    private void m5799e(String str) {
        C1132a c1132a = (C1132a) this.f3994a.get(str);
        if (c1132a != null) {
            this.f3995b -= c1132a.f3985a;
            this.f3994a.remove(str);
        }
    }

    public synchronized C0805a mo841a(String str) {
        C0805a c0805a;
        C1133b c1133b;
        IOException e;
        Throwable th;
        C1132a c1132a = (C1132a) this.f3994a.get(str);
        if (c1132a == null) {
            c0805a = null;
        } else {
            File c = m5804c(str);
            try {
                c1133b = new C1133b(new FileInputStream(c));
                try {
                    C1132a.m5782a((InputStream) c1133b);
                    c0805a = c1132a.m5783a(lr.m5793a((InputStream) c1133b, (int) (c.length() - ((long) c1133b.f3993a))));
                    if (c1133b != null) {
                        try {
                            c1133b.close();
                        } catch (IOException e2) {
                            c0805a = null;
                        }
                    }
                } catch (IOException e3) {
                    e = e3;
                    try {
                        ln.m5767b("%s: %s", c.getAbsolutePath(), e.toString());
                        m5803b(str);
                        if (c1133b != null) {
                            try {
                                c1133b.close();
                            } catch (IOException e4) {
                                c0805a = null;
                            }
                        }
                        c0805a = null;
                        return c0805a;
                    } catch (Throwable th2) {
                        th = th2;
                        if (c1133b != null) {
                            try {
                                c1133b.close();
                            } catch (IOException e5) {
                                c0805a = null;
                            }
                        }
                        throw th;
                    }
                }
            } catch (IOException e6) {
                e = e6;
                c1133b = null;
                ln.m5767b("%s: %s", c.getAbsolutePath(), e.toString());
                m5803b(str);
                if (c1133b != null) {
                    c1133b.close();
                }
                c0805a = null;
                return c0805a;
            } catch (Throwable th3) {
                th = th3;
                c1133b = null;
                if (c1133b != null) {
                    c1133b.close();
                }
                throw th;
            }
        }
        return c0805a;
    }

    public synchronized void mo842a() {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        if (this.f3996c.exists()) {
            File[] listFiles = this.f3996c.listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    BufferedInputStream bufferedInputStream2 = null;
                    try {
                        bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                        try {
                            C1132a a = C1132a.m5782a((InputStream) bufferedInputStream);
                            a.f3985a = file.length();
                            m5791a(a.f3986b, a);
                            if (bufferedInputStream != null) {
                                try {
                                    bufferedInputStream.close();
                                } catch (IOException e) {
                                }
                            }
                        } catch (IOException e2) {
                            if (file != null) {
                                try {
                                    file.delete();
                                } catch (Throwable th2) {
                                    Throwable th3 = th2;
                                    bufferedInputStream2 = bufferedInputStream;
                                    th = th3;
                                }
                            }
                            if (bufferedInputStream != null) {
                                try {
                                    bufferedInputStream.close();
                                } catch (IOException e3) {
                                }
                            }
                        }
                    } catch (IOException e4) {
                        bufferedInputStream = null;
                        if (file != null) {
                            file.delete();
                        }
                        if (bufferedInputStream != null) {
                            bufferedInputStream.close();
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
            }
        } else if (!this.f3996c.mkdirs()) {
            ln.m5768c("Unable to create cache dir %s", this.f3996c.getAbsolutePath());
        }
        return;
        if (bufferedInputStream2 != null) {
            try {
                bufferedInputStream2.close();
            } catch (IOException e5) {
            }
        }
        throw th;
        throw th;
    }

    public synchronized void mo843a(String str, C0805a c0805a) {
        m5787a(c0805a.f2353a.length);
        File c = m5804c(str);
        try {
            OutputStream fileOutputStream = new FileOutputStream(c);
            C1132a c1132a = new C1132a(str, c0805a);
            if (c1132a.m5784a(fileOutputStream)) {
                fileOutputStream.write(c0805a.f2353a);
                fileOutputStream.close();
                m5791a(str, c1132a);
            } else {
                fileOutputStream.close();
                ln.m5767b("Failed to write header for %s", c.getAbsolutePath());
                throw new IOException();
            }
        } catch (IOException e) {
            if (!c.delete()) {
                ln.m5767b("Could not clean up file %s", c.getAbsolutePath());
            }
        }
    }

    public synchronized void m5803b(String str) {
        boolean delete = m5804c(str).delete();
        m5799e(str);
        if (!delete) {
            ln.m5767b("Could not delete cache entry for key=%s, filename=%s", str, m5796d(str));
        }
    }

    public File m5804c(String str) {
        return new File(this.f3996c, m5796d(str));
    }
}
