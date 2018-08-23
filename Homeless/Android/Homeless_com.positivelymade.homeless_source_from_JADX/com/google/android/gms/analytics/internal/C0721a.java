package com.google.android.gms.analytics.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.p023c.C0475a;
import com.google.android.gms.ads.p023c.C0475a.C0473a;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Locale;

public class C0721a extends C0717p {
    public static boolean f2050a;
    private C0473a f2051b;
    private final C0740k f2052c;
    private String f2053d;
    private boolean f2054e = false;
    private Object f2055f = new Object();

    C0721a(C0750r c0750r) {
        super(c0750r);
        this.f2052c = new C0740k(c0750r.m3492d());
    }

    private static String m3258a(String str) {
        if (C0741l.m3458b("MD5") == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, C0741l.m3458b("MD5").digest(str.getBytes()))});
    }

    private boolean m3259a(C0473a c0473a, C0473a c0473a2) {
        String str = null;
        String a = c0473a2 == null ? null : c0473a2.m2096a();
        if (TextUtils.isEmpty(a)) {
            return true;
        }
        String b = m3224x().m3633b();
        synchronized (this.f2055f) {
            if (!this.f2054e) {
                this.f2053d = m3266e();
                this.f2054e = true;
            } else if (TextUtils.isEmpty(this.f2053d)) {
                if (c0473a != null) {
                    str = c0473a.m2096a();
                }
                if (str == null) {
                    boolean g = m3261g(a + b);
                    return g;
                }
                this.f2053d = C0721a.m3258a(str + b);
            }
            Object a2 = C0721a.m3258a(a + b);
            if (TextUtils.isEmpty(a2)) {
                return false;
            } else if (a2.equals(this.f2053d)) {
                return true;
            } else {
                if (TextUtils.isEmpty(this.f2053d)) {
                    str = b;
                } else {
                    m3198b("Resetting the client id because Advertising Id changed.");
                    str = m3224x().m3634c();
                    m3195a("New client Id", str);
                }
                g = m3261g(a + str);
                return g;
            }
        }
    }

    private synchronized C0473a m3260f() {
        if (this.f2052c.m3445a(1000)) {
            this.f2052c.m3444a();
            C0473a d = m3265d();
            if (m3259a(this.f2051b, d)) {
                this.f2051b = d;
            } else {
                m3210f("Failed to reset client id on adid change. Not using adid");
                this.f2051b = new C0473a("", false);
            }
        }
        return this.f2051b;
    }

    private boolean m3261g(String str) {
        try {
            String a = C0721a.m3258a(str);
            m3198b("Storing hashed adid.");
            FileOutputStream openFileOutput = m3215o().openFileOutput("gaClientIdData", 0);
            openFileOutput.write(a.getBytes());
            openFileOutput.close();
            this.f2053d = a;
            return true;
        } catch (IOException e) {
            m3209e("Error creating hash file", e);
            return false;
        }
    }

    protected void mo540a() {
    }

    public boolean m3263b() {
        m3228D();
        C0473a f = m3260f();
        return (f == null || f.m2097b()) ? false : true;
    }

    public String m3264c() {
        m3228D();
        C0473a f = m3260f();
        CharSequence a = f != null ? f.m2096a() : null;
        return TextUtils.isEmpty(a) ? null : a;
    }

    protected C0473a m3265d() {
        C0473a c0473a = null;
        try {
            c0473a = C0475a.m2103b(m3215o());
        } catch (IllegalStateException e) {
            m3208e("IllegalStateException getting Ad Id Info. If you would like to see Audience reports, please ensure that you have added '<meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />' to your application manifest file. See http://goo.gl/naFqQk for details.");
        } catch (Throwable th) {
            if (!f2050a) {
                f2050a = true;
                m3206d("Error getting advertiser id", th);
            }
        }
        return c0473a;
    }

    protected String m3266e() {
        Object obj;
        String str = null;
        try {
            FileInputStream openFileInput = m3215o().openFileInput("gaClientIdData");
            byte[] bArr = new byte[128];
            int read = openFileInput.read(bArr, 0, 128);
            if (openFileInput.available() > 0) {
                m3208e("Hash file seems corrupted, deleting it.");
                openFileInput.close();
                m3215o().deleteFile("gaClientIdData");
                return null;
            } else if (read <= 0) {
                m3198b("Hash file is empty.");
                openFileInput.close();
                return null;
            } else {
                String str2 = new String(bArr, 0, read);
                try {
                    openFileInput.close();
                    return str2;
                } catch (FileNotFoundException e) {
                    return str2;
                } catch (IOException e2) {
                    IOException iOException = e2;
                    str = str2;
                    IOException iOException2 = iOException;
                    m3206d("Error reading Hash file, deleting it", obj);
                    m3215o().deleteFile("gaClientIdData");
                    return str;
                }
            }
        } catch (FileNotFoundException e3) {
            return null;
        } catch (IOException e4) {
            obj = e4;
            m3206d("Error reading Hash file, deleting it", obj);
            m3215o().deleteFile("gaClientIdData");
            return str;
        }
    }
}
