package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C0581m;
import com.google.android.gms.ads.internal.C0618p;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel.C0638a;
import com.google.android.gms.ads.internal.request.C0640a.C0493a;
import com.google.android.gms.ads.internal.request.C0647c.C0643a;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.p028c.C1141o;
import com.google.android.gms.p028c.al;
import com.google.android.gms.p028c.db;
import com.google.android.gms.p028c.fn;
import com.google.android.gms.p028c.gd.C0973a;
import com.google.android.gms.p028c.gk;
import com.google.android.gms.p028c.go;
import org.json.JSONException;
import org.json.JSONObject;

@fn
public class C0644b extends gk implements C0643a {
    gk f1904a;
    Object f1905b = new Object();
    AdResponseParcel f1906c;
    db f1907d;
    private final C0493a f1908e;
    private final C0638a f1909f;
    private final Object f1910g = new Object();
    private final Context f1911h;
    private final C1141o f1912i;

    class C06411 implements Runnable {
        final /* synthetic */ C0644b f1902a;

        C06411(C0644b c0644b) {
            this.f1902a = c0644b;
        }

        public void run() {
            this.f1902a.mo487b();
        }
    }

    @fn
    static final class C0642a extends Exception {
        private final int f1903a;

        public C0642a(String str, int i) {
            super(str);
            this.f1903a = i;
        }

        public int m2911a() {
            return this.f1903a;
        }
    }

    public C0644b(Context context, C0638a c0638a, C1141o c1141o, C0493a c0493a) {
        this.f1908e = c0493a;
        this.f1911h = context;
        this.f1909f = c0638a;
        this.f1912i = c1141o;
    }

    gk m2913a(AdRequestInfoParcel adRequestInfoParcel) {
        return C0647c.m2924a(this.f1911h, adRequestInfoParcel, this);
    }

    public void mo486a() {
        C0642a e;
        synchronized (this.f1905b) {
            long j;
            AdSizeParcel adSizeParcel;
            JSONObject jSONObject;
            C0691b.m3093a("AdLoaderBackgroundTask started.");
            String a = this.f1912i.m5854a().mo438a(this.f1911h);
            String d = C0581m.m2611a(this.f1911h).m2619d();
            long b = C0618p.m2800i().mo825b();
            AdRequestInfoParcel adRequestInfoParcel = new AdRequestInfoParcel(this.f1909f, a, d, b);
            int i = -2;
            long j2 = -1;
            AdSizeParcel b2;
            try {
                gk a2 = m2913a(adRequestInfoParcel);
                synchronized (this.f1910g) {
                    this.f1904a = a2;
                    if (this.f1904a == null) {
                        throw new C0642a("Could not start the ad request service.", 0);
                    }
                }
                m2915a(b);
                j2 = C0618p.m2800i().mo825b();
                m2921c();
                b2 = adRequestInfoParcel.f1840d.f1354h != null ? m2918b(adRequestInfoParcel) : null;
                try {
                    m2917a(this.f1906c.f1885v);
                    j = j2;
                    adSizeParcel = b2;
                } catch (C0642a e2) {
                    e = e2;
                    i = e.m2911a();
                    if (i == 3 || i == -1) {
                        C0691b.m3099c(e.getMessage());
                    } else {
                        C0691b.m3103e(e.getMessage());
                    }
                    if (this.f1906c == null) {
                        this.f1906c = new AdResponseParcel(i);
                    } else {
                        this.f1906c = new AdResponseParcel(i, this.f1906c.f1874k);
                    }
                    go.f3361a.post(new C06411(this));
                    j = j2;
                    adSizeParcel = b2;
                    if (!TextUtils.isEmpty(this.f1906c.f1881r)) {
                        try {
                            jSONObject = new JSONObject(this.f1906c.f1881r);
                        } catch (Throwable e3) {
                            C0691b.m3098b("Error parsing the JSON for Active View.", e3);
                        }
                        this.f1908e.mo348a(new C0973a(adRequestInfoParcel, this.f1906c, this.f1907d, adSizeParcel, i, j, this.f1906c.f1877n, jSONObject));
                    }
                    jSONObject = null;
                    this.f1908e.mo348a(new C0973a(adRequestInfoParcel, this.f1906c, this.f1907d, adSizeParcel, i, j, this.f1906c.f1877n, jSONObject));
                }
            } catch (C0642a e4) {
                e = e4;
                b2 = null;
            }
            if (TextUtils.isEmpty(this.f1906c.f1881r)) {
                jSONObject = new JSONObject(this.f1906c.f1881r);
                this.f1908e.mo348a(new C0973a(adRequestInfoParcel, this.f1906c, this.f1907d, adSizeParcel, i, j, this.f1906c.f1877n, jSONObject));
            }
            jSONObject = null;
            this.f1908e.mo348a(new C0973a(adRequestInfoParcel, this.f1906c, this.f1907d, adSizeParcel, i, j, this.f1906c.f1877n, jSONObject));
        }
    }

    protected void m2915a(long j) {
        while (m2920b(j)) {
            if (this.f1906c != null) {
                synchronized (this.f1910g) {
                    this.f1904a = null;
                }
                if (this.f1906c.f1868e != -2 && this.f1906c.f1868e != -3) {
                    throw new C0642a("There was a problem getting an ad response. ErrorCode: " + this.f1906c.f1868e, this.f1906c.f1868e);
                }
                return;
            }
        }
        throw new C0642a("Timed out waiting for ad response.", 2);
    }

    public void mo499a(AdResponseParcel adResponseParcel) {
        synchronized (this.f1905b) {
            C0691b.m3093a("Received ad response.");
            this.f1906c = adResponseParcel;
            this.f1905b.notify();
        }
    }

    protected void m2917a(boolean z) {
        C0618p.m2799h().m4783a(z);
        al a = C0618p.m2799h().m4771a(this.f1911h);
        if (a != null && !a.isAlive()) {
            C0691b.m3093a("start fetching content...");
            a.m3822a();
        }
    }

    protected AdSizeParcel m2918b(AdRequestInfoParcel adRequestInfoParcel) {
        if (this.f1906c.f1876m == null) {
            throw new C0642a("The ad response must specify one of the supported ad sizes.", 0);
        }
        String[] split = this.f1906c.f1876m.split("x");
        if (split.length != 2) {
            throw new C0642a("Invalid ad size format from the ad response: " + this.f1906c.f1876m, 0);
        }
        try {
            int parseInt = Integer.parseInt(split[0]);
            int parseInt2 = Integer.parseInt(split[1]);
            for (AdSizeParcel adSizeParcel : adRequestInfoParcel.f1840d.f1354h) {
                float f = this.f1911h.getResources().getDisplayMetrics().density;
                int i = adSizeParcel.f1352f == -1 ? (int) (((float) adSizeParcel.f1353g) / f) : adSizeParcel.f1352f;
                int i2 = adSizeParcel.f1349c == -2 ? (int) (((float) adSizeParcel.f1350d) / f) : adSizeParcel.f1349c;
                if (parseInt == i && parseInt2 == i2) {
                    return new AdSizeParcel(adSizeParcel, adRequestInfoParcel.f1840d.f1354h);
                }
            }
            throw new C0642a("The ad size from the ad response was not one of the requested sizes: " + this.f1906c.f1876m, 0);
        } catch (NumberFormatException e) {
            throw new C0642a("Invalid ad size number from the ad response: " + this.f1906c.f1876m, 0);
        }
    }

    public void mo487b() {
        synchronized (this.f1910g) {
            if (this.f1904a != null) {
                this.f1904a.m2831i();
            }
        }
    }

    protected boolean m2920b(long j) {
        long b = 60000 - (C0618p.m2800i().mo825b() - j);
        if (b <= 0) {
            return false;
        }
        try {
            this.f1905b.wait(b);
            return true;
        } catch (InterruptedException e) {
            throw new C0642a("Ad request cancelled.", -1);
        }
    }

    protected void m2921c() {
        if (this.f1906c.f1868e != -3) {
            if (TextUtils.isEmpty(this.f1906c.f1866c)) {
                throw new C0642a("No fill from ad server.", 3);
            }
            C0618p.m2799h().m4774a(this.f1911h, this.f1906c.f1884u);
            if (this.f1906c.f1871h) {
                try {
                    this.f1907d = new db(this.f1906c.f1866c);
                } catch (JSONException e) {
                    throw new C0642a("Could not parse mediation config: " + this.f1906c.f1866c, 0);
                }
            }
        }
    }
}
