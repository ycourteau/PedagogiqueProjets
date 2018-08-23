package com.google.android.gms.p028c;

import com.google.android.gms.ads.internal.C0618p;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.common.internal.C1251d;
import java.util.Map;

@fn
public class cs implements cg {
    public void mo524a(hg hgVar, Map<String, String> map) {
        cq r = C0618p.m2809r();
        if (!map.containsKey("abort")) {
            String str = (String) map.get("src");
            if (str == null) {
                C0691b.m3103e("Precache video action is missing the src parameter.");
                return;
            }
            int parseInt;
            try {
                parseInt = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException e) {
                parseInt = 0;
            }
            String str2 = map.containsKey("mimetype") ? (String) map.get("mimetype") : "";
            if (r.m4119b(hgVar)) {
                C0691b.m3103e("Precache task already running.");
                return;
            }
            C1251d.m6332a(hgVar.mo781e());
            new cp(hgVar, hgVar.mo781e().f1462a.mo626a(hgVar, parseInt, str2), str).m2829g();
        } else if (!r.m4117a(hgVar)) {
            C0691b.m3103e("Precache abort but no preload task running.");
        }
    }
}
