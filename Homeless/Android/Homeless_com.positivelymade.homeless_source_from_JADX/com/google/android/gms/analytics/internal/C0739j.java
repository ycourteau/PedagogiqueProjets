package com.google.android.gms.analytics.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.C1305x;
import java.util.UUID;

public class C0739j extends C0717p {
    private SharedPreferences f2159a;
    private long f2160b;
    private long f2161c = -1;
    private final C0738a f2162d = new C0738a("monitoring", m3217q().m3281G());

    public final class C0738a {
        final /* synthetic */ C0739j f2156a;
        private final String f2157b;
        private final long f2158c;

        private C0738a(C0739j c0739j, String str, long j) {
            this.f2156a = c0739j;
            C1305x.m6619a(str);
            C1305x.m6625b(j > 0);
            this.f2157b = str;
            this.f2158c = j;
        }

        private void m3427c() {
            long a = this.f2156a.m3214n().mo824a();
            Editor edit = this.f2156a.f2159a.edit();
            edit.remove(m3431g());
            edit.remove(m3434b());
            edit.putLong(m3430f(), a);
            edit.commit();
        }

        private long m3428d() {
            long e = m3429e();
            return e == 0 ? 0 : Math.abs(e - this.f2156a.m3214n().mo824a());
        }

        private long m3429e() {
            return this.f2156a.f2159a.getLong(m3430f(), 0);
        }

        private String m3430f() {
            return this.f2157b + ":start";
        }

        private String m3431g() {
            return this.f2157b + ":count";
        }

        public Pair<String, Long> m3432a() {
            long d = m3428d();
            if (d < this.f2158c) {
                return null;
            }
            if (d > this.f2158c * 2) {
                m3427c();
                return null;
            }
            String string = this.f2156a.f2159a.getString(m3434b(), null);
            d = this.f2156a.f2159a.getLong(m3431g(), 0);
            m3427c();
            return (string == null || d <= 0) ? null : new Pair(string, Long.valueOf(d));
        }

        public void m3433a(String str) {
            if (m3429e() == 0) {
                m3427c();
            }
            if (str == null) {
                str = "";
            }
            synchronized (this) {
                long j = this.f2156a.f2159a.getLong(m3431g(), 0);
                if (j <= 0) {
                    Editor edit = this.f2156a.f2159a.edit();
                    edit.putString(m3434b(), str);
                    edit.putLong(m3431g(), 1);
                    edit.apply();
                    return;
                }
                Object obj = (UUID.randomUUID().getLeastSignificantBits() & Long.MAX_VALUE) < Long.MAX_VALUE / (j + 1) ? 1 : null;
                Editor edit2 = this.f2156a.f2159a.edit();
                if (obj != null) {
                    edit2.putString(m3434b(), str);
                }
                edit2.putLong(m3431g(), j + 1);
                edit2.apply();
            }
        }

        protected String m3434b() {
            return this.f2157b + ":value";
        }
    }

    protected C0739j(C0750r c0750r) {
        super(c0750r);
    }

    protected void mo540a() {
        this.f2159a = m3215o().getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
    }

    public void m3437a(String str) {
        m3213m();
        m3228D();
        Editor edit = this.f2159a.edit();
        if (TextUtils.isEmpty(str)) {
            edit.remove("installation_campaign");
        } else {
            edit.putString("installation_campaign", str);
        }
        if (!edit.commit()) {
            m3208e("Failed to commit campaign data");
        }
    }

    public long m3438b() {
        m3213m();
        m3228D();
        if (this.f2160b == 0) {
            long j = this.f2159a.getLong("first_run", 0);
            if (j != 0) {
                this.f2160b = j;
            } else {
                j = m3214n().mo824a();
                Editor edit = this.f2159a.edit();
                edit.putLong("first_run", j);
                if (!edit.commit()) {
                    m3208e("Failed to commit first run time");
                }
                this.f2160b = j;
            }
        }
        return this.f2160b;
    }

    public C0740k m3439c() {
        return new C0740k(m3214n(), m3438b());
    }

    public long m3440d() {
        m3213m();
        m3228D();
        if (this.f2161c == -1) {
            this.f2161c = this.f2159a.getLong("last_dispatch", 0);
        }
        return this.f2161c;
    }

    public void m3441e() {
        m3213m();
        m3228D();
        long a = m3214n().mo824a();
        Editor edit = this.f2159a.edit();
        edit.putLong("last_dispatch", a);
        edit.apply();
        this.f2161c = a;
    }

    public String m3442f() {
        m3213m();
        m3228D();
        CharSequence string = this.f2159a.getString("installation_campaign", null);
        return TextUtils.isEmpty(string) ? null : string;
    }

    public C0738a m3443g() {
        return this.f2162d;
    }
}
