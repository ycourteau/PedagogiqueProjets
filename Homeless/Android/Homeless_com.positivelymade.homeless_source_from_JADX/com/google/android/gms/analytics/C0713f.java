package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.analytics.internal.C0732f;
import com.google.android.gms.analytics.p031a.C0697a;
import com.google.android.gms.analytics.p031a.C0698b;
import com.google.android.gms.analytics.p031a.C0699c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class C0713f {

    protected static class C0711a<T extends C0711a> {
        C0698b f2023a;
        Map<String, List<C0697a>> f2024b = new HashMap();
        List<C0699c> f2025c = new ArrayList();
        List<C0697a> f2026d = new ArrayList();
        private Map<String, String> f2027e = new HashMap();

        protected C0711a() {
        }

        public T m3178a(C0697a c0697a) {
            if (c0697a == null) {
                C0732f.m3384a("product should be non-null");
            } else {
                this.f2026d.add(c0697a);
            }
            return this;
        }

        public T m3179a(C0697a c0697a, String str) {
            if (c0697a == null) {
                C0732f.m3384a("product should be non-null");
            } else {
                Object obj;
                if (str == null) {
                    obj = "";
                }
                if (!this.f2024b.containsKey(obj)) {
                    this.f2024b.put(obj, new ArrayList());
                }
                ((List) this.f2024b.get(obj)).add(c0697a);
            }
            return this;
        }

        public T m3180a(C0698b c0698b) {
            this.f2023a = c0698b;
            return this;
        }

        public T m3181a(C0699c c0699c) {
            if (c0699c == null) {
                C0732f.m3384a("promotion should be non-null");
            } else {
                this.f2025c.add(c0699c);
            }
            return this;
        }

        public final T m3182a(String str, String str2) {
            if (str != null) {
                this.f2027e.put(str, str2);
            } else {
                C0732f.m3384a(" HitBuilder.set() called with a null paramName.");
            }
            return this;
        }

        public final T m3183a(Map<String, String> map) {
            if (map != null) {
                this.f2027e.putAll(new HashMap(map));
            }
            return this;
        }

        public Map<String, String> mo539a() {
            Map<String, String> hashMap = new HashMap(this.f2027e);
            if (this.f2023a != null) {
                hashMap.putAll(this.f2023a.m3126a());
            }
            int i = 1;
            for (C0699c e : this.f2025c) {
                hashMap.putAll(e.m3139e(C0772k.m3655e(i)));
                i++;
            }
            i = 1;
            for (C0697a g : this.f2026d) {
                hashMap.putAll(g.m3122g(C0772k.m3653c(i)));
                i++;
            }
            int i2 = 1;
            for (Entry entry : this.f2024b.entrySet()) {
                List<C0697a> list = (List) entry.getValue();
                String h = C0772k.m3658h(i2);
                int i3 = 1;
                for (C0697a g2 : list) {
                    hashMap.putAll(g2.m3122g(h + C0772k.m3657g(i3)));
                    i3++;
                }
                if (!TextUtils.isEmpty((CharSequence) entry.getKey())) {
                    hashMap.put(h + "nm", entry.getKey());
                }
                i2++;
            }
            return hashMap;
        }
    }

    public static class C0712b extends C0711a<C0712b> {
        public C0712b() {
            m3182a("&t", "screenview");
        }

        public /* bridge */ /* synthetic */ Map mo539a() {
            return super.mo539a();
        }
    }
}
