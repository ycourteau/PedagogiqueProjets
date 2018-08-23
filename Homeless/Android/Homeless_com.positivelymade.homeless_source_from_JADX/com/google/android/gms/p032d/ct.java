package com.google.android.gms.p032d;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import com.google.android.gms.p028c.C0914e;
import com.google.android.gms.p028c.C0934f;
import com.google.android.gms.p028c.C1010h.C1009a;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class ct extends ch {
    static final String f4872a = ("gtm_" + f4873b + "_unrepeatable");
    private static final String f4873b = C0914e.ARBITRARY_PIXEL.toString();
    private static final String f4874c = C0934f.URL.toString();
    private static final String f4875d = C0934f.ADDITIONAL_PARAMS.toString();
    private static final String f4876e = C0934f.UNREPEATABLE.toString();
    private static final Set<String> f4877f = new HashSet();
    private final C1589a f4878g;
    private final Context f4879h;

    public interface C1589a {
        C1607v mo1031a();
    }

    class C15901 implements C1589a {
        final /* synthetic */ Context f4871a;

        C15901(Context context) {
            this.f4871a = context;
        }

        public C1607v mo1031a() {
            return dj.m7463a(this.f4871a);
        }
    }

    public ct(Context context) {
        this(context, new C15901(context));
    }

    ct(Context context, C1589a c1589a) {
        super(f4873b, f4874c);
        this.f4878g = c1589a;
        this.f4879h = context;
    }

    private synchronized boolean m7379c(String str) {
        boolean z = true;
        synchronized (this) {
            if (!m7382b(str)) {
                if (m7380a(str)) {
                    f4877f.add(str);
                } else {
                    z = false;
                }
            }
        }
        return z;
    }

    boolean m7380a(String str) {
        return this.f4879h.getSharedPreferences(f4872a, 0).contains(str);
    }

    public void mo1030b(Map<String, C1009a> map) {
        String a = map.get(f4876e) != null ? cj.m7319a((C1009a) map.get(f4876e)) : null;
        if (a == null || !m7379c(a)) {
            Builder buildUpon = Uri.parse(cj.m7319a((C1009a) map.get(f4874c))).buildUpon();
            C1009a c1009a = (C1009a) map.get(f4875d);
            if (c1009a != null) {
                Object e = cj.m7333e(c1009a);
                if (e instanceof List) {
                    for (Object e2 : (List) e2) {
                        if (e2 instanceof Map) {
                            for (Entry entry : ((Map) e2).entrySet()) {
                                buildUpon.appendQueryParameter(entry.getKey().toString(), entry.getValue().toString());
                            }
                        } else {
                            aj.m7036a("ArbitraryPixel: additional params contains non-map: not sending partial hit: " + buildUpon.build().toString());
                            return;
                        }
                    }
                }
                aj.m7036a("ArbitraryPixel: additional params not a list: not sending partial hit: " + buildUpon.build().toString());
                return;
            }
            String uri = buildUpon.build().toString();
            this.f4878g.mo1031a().mo1041a(uri);
            aj.m7041d("ArbitraryPixel: url = " + uri);
            if (a != null) {
                synchronized (ct.class) {
                    f4877f.add(a);
                    by.m7240a(this.f4879h, f4872a, a, "true");
                }
            }
        }
    }

    boolean m7382b(String str) {
        return f4877f.contains(str);
    }
}
