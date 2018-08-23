package com.google.android.gms.p028c;

import com.google.android.gms.ads.internal.C0618p;
import com.google.android.gms.ads.internal.util.client.C0691b;
import java.util.Map;

@fn
public class dy {
    private final hg f2820a;
    private final boolean f2821b;
    private final String f2822c;

    public dy(hg hgVar, Map<String, String> map) {
        this.f2820a = hgVar;
        this.f2822c = (String) map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange")) {
            this.f2821b = Boolean.parseBoolean((String) map.get("allowOrientationChange"));
        } else {
            this.f2821b = true;
        }
    }

    public void m4445a() {
        if (this.f2820a == null) {
            C0691b.m3103e("AdWebView is null");
            return;
        }
        int b = "portrait".equalsIgnoreCase(this.f2822c) ? C0618p.m2798g().mo739b() : "landscape".equalsIgnoreCase(this.f2822c) ? C0618p.m2798g().mo737a() : this.f2821b ? -1 : C0618p.m2798g().mo754c();
        this.f2820a.setRequestedOrientation(b);
    }
}
