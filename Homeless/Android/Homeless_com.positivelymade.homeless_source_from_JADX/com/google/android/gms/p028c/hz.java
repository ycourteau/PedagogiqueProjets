package com.google.android.gms.p028c;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.p028c.aa.C0805a;
import com.google.android.gms.p028c.iw.C1002a;
import com.google.android.gms.p028c.ln.C1129a;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;

public abstract class hz<T> implements Comparable<hz<T>> {
    private final C1129a f2559a;
    private final int f2560b;
    private final String f2561c;
    private final int f2562d;
    private final C1002a f2563e;
    private Integer f2564f;
    private ib f2565g;
    private boolean f2566h;
    private boolean f2567i;
    private boolean f2568j;
    private long f2569k;
    private je f2570l;
    private C0805a f2571m;

    public enum C1031a {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    public hz(int i, String str, C1002a c1002a) {
        this.f2559a = C1129a.f3962a ? new C1129a() : null;
        this.f2566h = true;
        this.f2567i = false;
        this.f2568j = false;
        this.f2569k = 0;
        this.f2571m = null;
        this.f2560b = i;
        this.f2561c = str;
        this.f2563e = c1002a;
        m4020a(new cb());
        this.f2562d = hz.mo622a(str);
    }

    private static int mo622a(String str) {
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String host = parse.getHost();
                if (host != null) {
                    return host.hashCode();
                }
            }
        }
        return 0;
    }

    private byte[] m4014a(Map<String, String> map, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            for (Entry entry : map.entrySet()) {
                stringBuilder.append(URLEncoder.encode((String) entry.getKey(), str));
                stringBuilder.append('=');
                stringBuilder.append(URLEncoder.encode((String) entry.getValue(), str));
                stringBuilder.append('&');
            }
            return stringBuilder.toString().getBytes(str);
        } catch (Throwable e) {
            throw new RuntimeException("Encoding not supported: " + str, e);
        }
    }

    public int m4016a(hz<T> hzVar) {
        C1031a q = m4043q();
        C1031a q2 = hzVar.m4043q();
        return q == q2 ? this.f2564f.intValue() - hzVar.f2564f.intValue() : q2.ordinal() - q.ordinal();
    }

    public final hz<?> m4017a(int i) {
        this.f2564f = Integer.valueOf(i);
        return this;
    }

    public hz<?> m4018a(C0805a c0805a) {
        this.f2571m = c0805a;
        return this;
    }

    public hz<?> m4019a(ib ibVar) {
        this.f2565g = ibVar;
        return this;
    }

    public hz<?> m4020a(je jeVar) {
        this.f2570l = jeVar;
        return this;
    }

    protected abstract iw<T> mo620a(gu guVar);

    protected lc m4022a(lc lcVar) {
        return lcVar;
    }

    public Map<String, String> mo757a() {
        return Collections.emptyMap();
    }

    protected abstract void mo621a(T t);

    public int m4025b() {
        return this.f2560b;
    }

    public void m4026b(lc lcVar) {
        if (this.f2563e != null) {
            this.f2563e.mo756a(lcVar);
        }
    }

    public void m4027b(String str) {
        if (C1129a.f3962a) {
            this.f2559a.m5764a(str, Thread.currentThread().getId());
        } else if (this.f2569k == 0) {
            this.f2569k = SystemClock.elapsedRealtime();
        }
    }

    public int m4028c() {
        return this.f2562d;
    }

    void m4029c(final String str) {
        if (this.f2565g != null) {
            this.f2565g.m5206b(this);
        }
        if (C1129a.f3962a) {
            final long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new Runnable(this) {
                    final /* synthetic */ hz f3548c;

                    public void run() {
                        this.f3548c.f2559a.m5764a(str, id);
                        this.f3548c.f2559a.m5763a(toString());
                    }
                });
                return;
            }
            this.f2559a.m5764a(str, id);
            this.f2559a.m5763a(toString());
            return;
        }
        if (SystemClock.elapsedRealtime() - this.f2569k >= 3000) {
            ln.m5767b("%d ms: %s", Long.valueOf(SystemClock.elapsedRealtime() - this.f2569k), toString());
        }
    }

    public /* synthetic */ int compareTo(Object obj) {
        return m4016a((hz) obj);
    }

    public String m4030d() {
        return this.f2561c;
    }

    public String m4031e() {
        return m4030d();
    }

    public C0805a m4032f() {
        return this.f2571m;
    }

    public boolean m4033g() {
        return this.f2567i;
    }

    @Deprecated
    protected Map<String, String> m4034h() {
        return m4038l();
    }

    @Deprecated
    protected String m4035i() {
        return m4039m();
    }

    @Deprecated
    public String m4036j() {
        return m4040n();
    }

    @Deprecated
    public byte[] m4037k() {
        Map h = m4034h();
        return (h == null || h.size() <= 0) ? null : m4014a(h, m4035i());
    }

    protected Map<String, String> m4038l() {
        return null;
    }

    protected String m4039m() {
        return "UTF-8";
    }

    public String m4040n() {
        return "application/x-www-form-urlencoded; charset=" + m4039m();
    }

    public byte[] m4041o() {
        Map l = m4038l();
        return (l == null || l.size() <= 0) ? null : m4014a(l, m4039m());
    }

    public final boolean m4042p() {
        return this.f2566h;
    }

    public C1031a m4043q() {
        return C1031a.NORMAL;
    }

    public final int m4044r() {
        return this.f2570l.mo623a();
    }

    public je m4045s() {
        return this.f2570l;
    }

    public void m4046t() {
        this.f2568j = true;
    }

    public String toString() {
        return (this.f2567i ? "[X] " : "[ ] ") + m4030d() + " " + ("0x" + Integer.toHexString(m4028c())) + " " + m4043q() + " " + this.f2564f;
    }

    public boolean m4047u() {
        return this.f2568j;
    }
}
