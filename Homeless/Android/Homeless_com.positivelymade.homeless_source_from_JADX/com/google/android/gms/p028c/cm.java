package com.google.android.gms.p028c;

import com.google.android.gms.ads.internal.C0555e;
import com.google.android.gms.ads.internal.util.client.C0691b;
import java.util.HashMap;
import java.util.Map;

@fn
public class cm implements cg {
    static final Map<String, Integer> f2614a = new HashMap();
    private final C0555e f2615b;
    private final dx f2616c;

    static {
        f2614a.put("resize", Integer.valueOf(1));
        f2614a.put("playVideo", Integer.valueOf(2));
        f2614a.put("storePicture", Integer.valueOf(3));
        f2614a.put("createCalendarEvent", Integer.valueOf(4));
        f2614a.put("setOrientationProperties", Integer.valueOf(5));
        f2614a.put("closeResizedAd", Integer.valueOf(6));
    }

    public cm(C0555e c0555e, dx dxVar) {
        this.f2615b = c0555e;
        this.f2616c = dxVar;
    }

    public void mo524a(hg hgVar, Map<String, String> map) {
        int intValue = ((Integer) f2614a.get((String) map.get("a"))).intValue();
        if (intValue == 5 || this.f2615b == null || this.f2615b.m2476b()) {
            switch (intValue) {
                case 1:
                    this.f2616c.m4438a((Map) map);
                    return;
                case 3:
                    new dz(hgVar, map).m4449a();
                    return;
                case 4:
                    new dw(hgVar, map).m4432a();
                    return;
                case 5:
                    new dy(hgVar, map).m4445a();
                    return;
                case 6:
                    this.f2616c.m4439a(true);
                    return;
                default:
                    C0691b.m3099c("Unknown MRAID command called.");
                    return;
            }
        }
        this.f2615b.m2475a(null);
    }
}
