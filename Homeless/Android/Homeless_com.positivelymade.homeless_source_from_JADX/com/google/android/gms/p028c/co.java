package com.google.android.gms.p028c;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.client.C0526n;
import com.google.android.gms.ads.internal.overlay.C0608d;
import com.google.android.gms.ads.internal.overlay.C0613k;
import com.google.android.gms.ads.internal.util.client.C0691b;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;

@fn
public final class co implements cg {
    private final Map<hg, Integer> f2625a = new WeakHashMap();

    private static int m4111a(Context context, Map<String, String> map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                i = C0526n.m2400a().m3079a(context, Integer.parseInt(str2));
            } catch (NumberFormatException e) {
                C0691b.m3103e("Could not parse " + str + " in a video GMSG: " + str2);
            }
        }
        return i;
    }

    public void mo524a(hg hgVar, Map<String, String> map) {
        String str = (String) map.get("action");
        if (str == null) {
            C0691b.m3103e("Action missing from video GMSG.");
            return;
        }
        if (C0691b.m3096a(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            C0691b.m3093a("Video GMSG: " + str + " " + jSONObject.toString());
        }
        String str2;
        if ("background".equals(str)) {
            str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                C0691b.m3103e("Color parameter missing from color video GMSG.");
                return;
            }
            try {
                int parseColor = Color.parseColor(str2);
                C0608d f = hgVar.mo782f();
                if (f != null) {
                    C0613k b = f.m2719b();
                    if (b != null) {
                        b.setBackgroundColor(parseColor);
                        return;
                    }
                }
                this.f2625a.put(hgVar, Integer.valueOf(parseColor));
                return;
            } catch (IllegalArgumentException e) {
                C0691b.m3103e("Invalid color parameter in video GMSG.");
                return;
            }
        }
        C0608d f2 = hgVar.mo782f();
        if (f2 == null) {
            C0691b.m3103e("Could not get ad overlay for a video GMSG.");
            return;
        }
        boolean equals = "new".equals(str);
        boolean equals2 = "position".equals(str);
        int a;
        int a2;
        if (equals || equals2) {
            int parseInt;
            Context context = hgVar.getContext();
            int a3 = co.m4111a(context, map, "x", 0);
            a = co.m4111a(context, map, "y", 0);
            a2 = co.m4111a(context, map, "w", -1);
            int a4 = co.m4111a(context, map, "h", -1);
            try {
                parseInt = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException e2) {
                parseInt = 0;
            }
            if (equals && f2.m2719b() == null) {
                f2.m2714a(a3, a, a2, a4, parseInt);
                if (this.f2625a.containsKey(hgVar)) {
                    f2.m2719b().setBackgroundColor(((Integer) this.f2625a.get(hgVar)).intValue());
                    return;
                }
                return;
            }
            f2.m2713a(a3, a, a2, a4);
            return;
        }
        C0613k b2 = f2.m2719b();
        if (b2 == null) {
            C0613k.m2751a(hgVar);
        } else if ("click".equals(str)) {
            Context context2 = hgVar.getContext();
            a = co.m4111a(context2, map, "x", 0);
            a2 = co.m4111a(context2, map, "y", 0);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, (float) a, (float) a2, 0);
            b2.m2762a(obtain);
            obtain.recycle();
        } else if ("currentTime".equals(str)) {
            str2 = (String) map.get("time");
            if (str2 == null) {
                C0691b.m3103e("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                b2.m2760a((int) (Float.parseFloat(str2) * 1000.0f));
            } catch (NumberFormatException e3) {
                C0691b.m3103e("Could not parse time parameter from currentTime video GMSG: " + str2);
            }
        } else if ("hide".equals(str)) {
            b2.setVisibility(4);
        } else if ("load".equals(str)) {
            b2.m2770g();
        } else if ("mimetype".equals(str)) {
            b2.setMimeType((String) map.get("mimetype"));
        } else if ("muted".equals(str)) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                b2.m2773j();
            } else {
                b2.m2774k();
            }
        } else if ("pause".equals(str)) {
            b2.m2771h();
        } else if ("play".equals(str)) {
            b2.m2772i();
        } else if ("show".equals(str)) {
            b2.setVisibility(0);
        } else if ("src".equals(str)) {
            b2.m2763a((String) map.get("src"));
        } else if ("volume".equals(str)) {
            str2 = (String) map.get("volume");
            if (str2 == null) {
                C0691b.m3103e("Level parameter missing from volume video GMSG.");
                return;
            }
            try {
                b2.m2759a(Float.parseFloat(str2));
            } catch (NumberFormatException e4) {
                C0691b.m3103e("Could not parse volume parameter from volume video GMSG: " + str2);
            }
        } else if ("watermark".equals(str)) {
            b2.m2775l();
        } else {
            C0691b.m3103e("Unknown video action: " + str);
        }
    }
}
