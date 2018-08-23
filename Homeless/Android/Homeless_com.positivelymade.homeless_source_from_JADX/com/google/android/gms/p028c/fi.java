package com.google.android.gms.p028c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C0586n;
import com.google.android.gms.ads.internal.formats.C0559a;
import com.google.android.gms.ads.internal.formats.C0561b;
import com.google.android.gms.ads.internal.formats.C0568e;
import com.google.android.gms.ads.internal.formats.C0569g;
import com.google.android.gms.ads.internal.formats.C0569g.C0563a;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.p028c.gd.C0973a;
import com.google.android.gms.p028c.gs.C0946a;
import com.google.android.gms.p028c.hb.C0944a;
import com.google.android.gms.p029b.C0802b;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@fn
public class fi implements Callable<gd> {
    private static final long f3048a = TimeUnit.SECONDS.toMillis(60);
    private final Context f3049b;
    private final gs f3050c;
    private final C0586n f3051d;
    private final C1141o f3052e;
    private final ad f3053f;
    private final Object f3054g = new Object();
    private final C0973a f3055h;
    private boolean f3056i;
    private int f3057j;
    private List<String> f3058k;

    public interface C0948a<T extends C0563a> {
        T mo728a(fi fiVar, JSONObject jSONObject);
    }

    class C0949b {
        public cg f3046a;
        final /* synthetic */ fi f3047b;

        C0949b(fi fiVar) {
            this.f3047b = fiVar;
        }
    }

    public fi(Context context, C0586n c0586n, ad adVar, gs gsVar, C1141o c1141o, C0973a c0973a) {
        this.f3049b = context;
        this.f3051d = c0586n;
        this.f3050c = gsVar;
        this.f3053f = adVar;
        this.f3055h = c0973a;
        this.f3052e = c1141o;
        this.f3056i = false;
        this.f3057j = -2;
        this.f3058k = null;
    }

    private C0563a m4586a(ac acVar, C0948a c0948a, JSONObject jSONObject) {
        if (m4605b()) {
            return null;
        }
        String[] b = m4595b(jSONObject.getJSONObject("tracking_urls_and_actions"), "impression_tracking_urls");
        this.f3058k = b == null ? null : Arrays.asList(b);
        C0563a a = c0948a.mo728a(this, jSONObject);
        if (a == null) {
            C0691b.m3097b("Failed to retrieve ad assets.");
            return null;
        }
        a.mo412a(new C0569g(this.f3049b, this.f3051d, acVar, this.f3052e, jSONObject, a, this.f3055h.f3258a.f1847k));
        return a;
    }

    private gd m4588a(C0563a c0563a) {
        int i;
        synchronized (this.f3054g) {
            i = this.f3057j;
            if (c0563a == null && this.f3057j == -2) {
                i = 0;
            }
        }
        return new gd(this.f3055h.f3258a.f1839c, null, this.f3055h.f3259b.f1867d, i, this.f3055h.f3259b.f1869f, this.f3058k, this.f3055h.f3259b.f1875l, this.f3055h.f3259b.f1874k, this.f3055h.f3258a.f1845i, false, null, null, null, null, null, 0, this.f3055h.f3261d, this.f3055h.f3259b.f1870g, this.f3055h.f3263f, this.f3055h.f3264g, this.f3055h.f3259b.f1878o, this.f3055h.f3265h, i != -2 ? null : c0563a, this.f3055h.f3258a.f1860x);
    }

    private hc<C0561b> m4589a(JSONObject jSONObject, final boolean z, boolean z2) {
        final String string = z ? jSONObject.getString("url") : jSONObject.optString("url");
        if (!TextUtils.isEmpty(string)) {
            return z2 ? new ha(new C0561b(null, Uri.parse(string))) : this.f3050c.m4962a(string, new C0946a<C0561b>(this) {
                final /* synthetic */ fi f3045c;

                public C0561b m4581a() {
                    this.f3045c.m4603a(2, z);
                    return null;
                }

                public C0561b m4582a(InputStream inputStream) {
                    byte[] a;
                    try {
                        a = io.m5279a(inputStream);
                    } catch (IOException e) {
                        a = null;
                    }
                    if (a == null) {
                        this.f3045c.m4603a(2, z);
                        return null;
                    }
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(a, 0, a.length);
                    if (decodeByteArray != null) {
                        return new C0561b(new BitmapDrawable(Resources.getSystem(), decodeByteArray), Uri.parse(string));
                    }
                    this.f3045c.m4603a(2, z);
                    return null;
                }

                public /* synthetic */ Object mo726b() {
                    return m4581a();
                }

                public /* synthetic */ Object mo727b(InputStream inputStream) {
                    return m4582a(inputStream);
                }
            });
        } else {
            m4603a(0, z);
            return new ha(null);
        }
    }

    private Integer m4590a(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException e) {
            return null;
        }
    }

    private JSONObject m4591a(final ac acVar) {
        if (m4605b()) {
            return null;
        }
        final gz gzVar = new gz();
        final C0949b c0949b = new C0949b(this);
        cg c09411 = new cg(this) {
            final /* synthetic */ fi f3032d;

            public void mo524a(hg hgVar, Map<String, String> map) {
                acVar.mo586b("/nativeAdPreProcess", c0949b.f3046a);
                try {
                    String str = (String) map.get("success");
                    if (!TextUtils.isEmpty(str)) {
                        gzVar.m4958b(new JSONObject(str).getJSONArray("ads").getJSONObject(0));
                        return;
                    }
                } catch (Throwable e) {
                    C0691b.m3098b("Malformed native JSON response.", e);
                }
                this.f3032d.m4602a(0);
                C1305x.m6622a(this.f3032d.m4605b(), (Object) "Unable to set the ad state error!");
                gzVar.m4958b(null);
            }
        };
        c0949b.f3046a = c09411;
        acVar.mo581a("/nativeAdPreProcess", c09411);
        acVar.mo583a("google.afma.nativeAds.preProcessJsonGmsg", new JSONObject(this.f3055h.f3259b.f1866c));
        return (JSONObject) gzVar.get(f3048a, TimeUnit.MILLISECONDS);
    }

    private void m4592a(C0563a c0563a, ac acVar) {
        if (c0563a instanceof C0568e) {
            final C0568e c0568e = (C0568e) c0563a;
            C0949b c0949b = new C0949b(this);
            cg c09433 = new cg(this) {
                final /* synthetic */ fi f3037b;

                public void mo524a(hg hgVar, Map<String, String> map) {
                    this.f3037b.m4593a(c0568e, (String) map.get("asset"));
                }
            };
            c0949b.f3046a = c09433;
            acVar.mo581a("/nativeAdCustomClick", c09433);
        }
    }

    private void m4593a(bt btVar, String str) {
        try {
            bw b = this.f3051d.m2635b(btVar.mo422k());
            if (b != null) {
                b.mo618a(btVar, str);
            }
        } catch (Throwable e) {
            C0691b.m3102d("Failed to call onCustomClick for asset " + str + ".", e);
        }
    }

    private String[] m4595b(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        String[] strArr = new String[optJSONArray.length()];
        for (int i = 0; i < optJSONArray.length(); i++) {
            strArr[i] = optJSONArray.getString(i);
        }
        return strArr;
    }

    private ac m4596c() {
        if (m4605b()) {
            return null;
        }
        ac acVar = (ac) this.f3053f.m3778a(this.f3049b, this.f3055h.f3258a.f1847k, (this.f3055h.f3259b.f1865b.indexOf("https") == 0 ? "https:" : "http:") + ((String) az.f2474Z.m3878c()), this.f3052e).get(f3048a, TimeUnit.MILLISECONDS);
        acVar.mo578a(this.f3051d, this.f3051d, this.f3051d, this.f3051d, false, null, null, null, null);
        return acVar;
    }

    protected C0948a m4597a(JSONObject jSONObject) {
        if (m4605b()) {
            return null;
        }
        String string = jSONObject.getString("template_id");
        boolean z = this.f3055h.f3258a.f1833C != null ? this.f3055h.f3258a.f1833C.f1473b : false;
        boolean z2 = this.f3055h.f3258a.f1833C != null ? this.f3055h.f3258a.f1833C.f1475d : false;
        if ("2".equals(string)) {
            return new fj(z, z2);
        }
        if ("1".equals(string)) {
            return new fk(z, z2);
        }
        if ("3".equals(string)) {
            final String string2 = jSONObject.getString("custom_template_id");
            final gz gzVar = new gz();
            go.f3361a.post(new Runnable(this) {
                final /* synthetic */ fi f3035c;

                public void run() {
                    gzVar.m4958b(this.f3035c.f3051d.m2641y().get(string2));
                }
            });
            if (gzVar.get(f3048a, TimeUnit.MILLISECONDS) != null) {
                return new fl(z);
            }
            C0691b.m3097b("No handler for custom template: " + jSONObject.getString("custom_template_id"));
        } else {
            m4602a(0);
        }
        return null;
    }

    public gd m4598a() {
        try {
            ac c = m4596c();
            JSONObject a = m4591a(c);
            C0563a a2 = m4586a(c, m4597a(a), a);
            m4592a(a2, c);
            return m4588a(a2);
        } catch (CancellationException e) {
            if (!this.f3056i) {
                m4602a(0);
            }
            return m4588a(null);
        } catch (ExecutionException e2) {
            if (this.f3056i) {
                m4602a(0);
            }
            return m4588a(null);
        } catch (InterruptedException e3) {
            if (this.f3056i) {
                m4602a(0);
            }
            return m4588a(null);
        } catch (Throwable e4) {
            C0691b.m3102d("Malformed native JSON response.", e4);
            if (this.f3056i) {
                m4602a(0);
            }
            return m4588a(null);
        } catch (Throwable e42) {
            C0691b.m3102d("Timeout when loading native ad.", e42);
            if (this.f3056i) {
                m4602a(0);
            }
            return m4588a(null);
        }
    }

    public hc<C0561b> m4599a(JSONObject jSONObject, String str, boolean z, boolean z2) {
        JSONObject jSONObject2 = z ? jSONObject.getJSONObject(str) : jSONObject.optJSONObject(str);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        return m4589a(jSONObject2, z, z2);
    }

    public List<hc<C0561b>> m4600a(JSONObject jSONObject, String str, boolean z, boolean z2, boolean z3) {
        JSONArray jSONArray = z ? jSONObject.getJSONArray(str) : jSONObject.optJSONArray(str);
        List<hc<C0561b>> arrayList = new ArrayList();
        if (jSONArray == null || jSONArray.length() == 0) {
            m4603a(0, z);
            return arrayList;
        }
        int length = z3 ? jSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            arrayList.add(m4589a(jSONObject2, z, z2));
        }
        return arrayList;
    }

    public Future<C0561b> m4601a(JSONObject jSONObject, String str, boolean z) {
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        boolean optBoolean = jSONObject2.optBoolean("require", true);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        return m4589a(jSONObject2, optBoolean, z);
    }

    public void m4602a(int i) {
        synchronized (this.f3054g) {
            this.f3056i = true;
            this.f3057j = i;
        }
    }

    public void m4603a(int i, boolean z) {
        if (z) {
            m4602a(i);
        }
    }

    public hc<C0559a> m4604b(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return new ha(null);
        }
        final String optString = optJSONObject.optString("text");
        final int optInt = optJSONObject.optInt("text_size", -1);
        final Integer a = m4590a(optJSONObject, "text_color");
        final Integer a2 = m4590a(optJSONObject, "bg_color");
        return hb.m4983a(m4599a(optJSONObject, "image", false, false), new C0944a<C0561b, C0559a>(this) {
            final /* synthetic */ fi f3042e;

            public C0559a m4577a(C0561b c0561b) {
                C0559a c0559a;
                if (c0561b != null) {
                    try {
                        if (!TextUtils.isEmpty(optString)) {
                            c0559a = new C0559a(optString, (Drawable) C0802b.m3755a(c0561b.mo409a()), a2, a, optInt > 0 ? Integer.valueOf(optInt) : null);
                            return c0559a;
                        }
                    } catch (Throwable e) {
                        C0691b.m3098b("Could not get attribution icon", e);
                        return null;
                    }
                }
                c0559a = null;
                return c0559a;
            }

            public /* synthetic */ Object mo725a(Object obj) {
                return m4577a((C0561b) obj);
            }
        });
    }

    public boolean m4605b() {
        boolean z;
        synchronized (this.f3054g) {
            z = this.f3056i;
        }
        return z;
    }

    public /* synthetic */ Object call() {
        return m4598a();
    }
}
