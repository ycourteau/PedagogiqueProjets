package com.google.android.gms.p028c;

import com.google.android.gms.ads.internal.client.C0526n;
import com.google.android.gms.ads.internal.util.client.C0690a;
import com.google.android.gms.common.api.C0870f;
import java.util.HashMap;
import java.util.Map;

@fn
public abstract class cr implements C0870f {
    protected hg f2644a;

    public cr(hg hgVar) {
        this.f2644a = hgVar;
    }

    public abstract void mo628a();

    protected void m4122a(final String str, final String str2) {
        C0690a.f1980a.post(new Runnable(this) {
            final /* synthetic */ cr f2643c;

            public void run() {
                Map hashMap = new HashMap();
                hashMap.put("event", "precacheCanceled");
                hashMap.put("src", str);
                if (str2 != null) {
                    hashMap.put("cachedSrc", str2);
                }
                this.f2643c.f2644a.mo768a("onPrecacheEvent", hashMap);
            }
        });
    }

    protected void m4123a(final String str, final String str2, final int i) {
        C0690a.f1980a.post(new Runnable(this) {
            final /* synthetic */ cr f2640d;

            public void run() {
                Map hashMap = new HashMap();
                hashMap.put("event", "precacheComplete");
                hashMap.put("src", str);
                hashMap.put("cachedSrc", str2);
                hashMap.put("totalBytes", Integer.toString(i));
                this.f2640d.f2644a.mo768a("onPrecacheEvent", hashMap);
            }
        });
    }

    protected void m4124a(String str, String str2, int i, int i2, boolean z) {
        final String str3 = str;
        final String str4 = str2;
        final int i3 = i;
        final int i4 = i2;
        final boolean z2 = z;
        C0690a.f1980a.post(new Runnable(this) {
            final /* synthetic */ cr f2636f;

            public void run() {
                Map hashMap = new HashMap();
                hashMap.put("event", "precacheProgress");
                hashMap.put("src", str3);
                hashMap.put("cachedSrc", str4);
                hashMap.put("bytesLoaded", Integer.toString(i3));
                hashMap.put("totalBytes", Integer.toString(i4));
                hashMap.put("cacheReady", z2 ? "1" : "0");
                this.f2636f.f2644a.mo768a("onPrecacheEvent", hashMap);
            }
        });
    }

    public abstract boolean mo629a(String str);

    protected String m4126b(String str) {
        return C0526n.m2400a().m3082a(str);
    }

    public void mo627b() {
    }
}
