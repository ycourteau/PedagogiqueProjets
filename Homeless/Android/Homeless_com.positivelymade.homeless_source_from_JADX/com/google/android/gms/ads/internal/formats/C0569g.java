package com.google.android.gms.ads.internal.formats;

import android.content.Context;
import com.google.android.gms.ads.internal.C0586n;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.p028c.C1141o;
import com.google.android.gms.p028c.ac;
import com.google.android.gms.p028c.fn;
import org.json.JSONObject;

@fn
public class C0569g {
    private final Object f1515a = new Object();
    private final C0586n f1516b;
    private final Context f1517c;
    private final JSONObject f1518d;
    private final ac f1519e;
    private final C0563a f1520f;
    private final C1141o f1521g;
    private final VersionInfoParcel f1522h;
    private boolean f1523i;

    public interface C0563a {
        void mo412a(C0569g c0569g);

        String mo421j();

        String mo422k();
    }

    public C0569g(Context context, C0586n c0586n, ac acVar, C1141o c1141o, JSONObject jSONObject, C0563a c0563a, VersionInfoParcel versionInfoParcel) {
        this.f1517c = context;
        this.f1516b = c0586n;
        this.f1519e = acVar;
        this.f1521g = c1141o;
        this.f1518d = jSONObject;
        this.f1520f = c0563a;
        this.f1522h = versionInfoParcel;
    }

    public void mo437a() {
        C1305x.m6624b("recordImpression must be called on the main UI thread.");
        m2555a(true);
        this.f1516b.mo359i();
    }

    public void m2554a(String str) {
        C1305x.m6624b("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset", str);
            jSONObject.put("template", this.f1520f.mo421j());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("ad", this.f1518d);
            jSONObject2.put("click", jSONObject);
            jSONObject2.put("has_custom_click_handler", this.f1516b.m2635b(this.f1520f.mo422k()) != null);
            this.f1519e.mo583a("google.afma.nativeAds.handleClickGmsg", jSONObject2);
        } catch (Throwable e) {
            C0691b.m3098b("Unable to create click JSON.", e);
        }
    }

    protected void m2555a(boolean z) {
        this.f1523i = z;
    }
}
