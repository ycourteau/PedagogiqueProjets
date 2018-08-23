package com.google.android.gms.p028c;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.p028c.iw.C1002a;
import com.google.android.gms.p028c.iw.C1007b;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Map;

@fn
public class gs {
    public static final C0946a<Void> f3410a = new C10011();
    private static ib f3411b;
    private static final Object f3412c = new Object();

    public interface C0946a<T> {
        T mo726b();

        T mo727b(InputStream inputStream);
    }

    static class C10011 implements C0946a {
        C10011() {
        }

        public Void m4945a() {
            return null;
        }

        public Void m4946a(InputStream inputStream) {
            return null;
        }

        public /* synthetic */ Object mo726b() {
            return m4945a();
        }

        public /* synthetic */ Object mo727b(InputStream inputStream) {
            return m4946a(inputStream);
        }
    }

    private static class C1006b<T> extends hz<InputStream> {
        private final C0946a<T> f3402a;
        private final C1007b<T> f3403b;

        class C10051 implements C1002a {
            final /* synthetic */ C1007b f3400a;
            final /* synthetic */ C0946a f3401b;

            C10051(C1007b c1007b, C0946a c0946a) {
                this.f3400a = c1007b;
                this.f3401b = c0946a;
            }

            public void mo756a(lc lcVar) {
                this.f3400a.mo759a(this.f3401b.mo726b());
            }
        }

        public C1006b(String str, C0946a<T> c0946a, C1007b<T> c1007b) {
            super(0, str, new C10051(c1007b, c0946a));
            this.f3402a = c0946a;
            this.f3403b = c1007b;
        }

        protected iw<InputStream> mo620a(gu guVar) {
            return iw.m5304a(new ByteArrayInputStream(guVar.f3417b), lt.m5812a(guVar));
        }

        protected void m4954a(InputStream inputStream) {
            this.f3403b.mo759a(this.f3402a.mo727b(inputStream));
        }

        protected /* synthetic */ void mo621a(Object obj) {
            m4954a((InputStream) obj);
        }
    }

    private class C1008c<T> extends gz<T> implements C1007b<T> {
        final /* synthetic */ gs f3409a;

        private C1008c(gs gsVar) {
            this.f3409a = gsVar;
        }

        public void mo759a(T t) {
            super.m4958b(t);
        }
    }

    public gs(Context context) {
        f3411b = gs.m4961a(context);
    }

    private static ib m4961a(Context context) {
        ib ibVar;
        synchronized (f3412c) {
            if (f3411b == null) {
                f3411b = C0893d.m4182a(context.getApplicationContext());
            }
            ibVar = f3411b;
        }
        return ibVar;
    }

    public <T> hc<T> m4962a(String str, C0946a<T> c0946a) {
        Object c1008c = new C1008c();
        f3411b.m5203a(new C1006b(str, c0946a, c1008c));
        return c1008c;
    }

    public hc<String> m4963a(final String str, Map<String, String> map) {
        final Object c1008c = new C1008c();
        final Map<String, String> map2 = map;
        f3411b.m5203a(new C0848c(this, str, c1008c, new C1002a(this) {
            final /* synthetic */ gs f3397c;

            public void mo756a(lc lcVar) {
                C0691b.m3103e("Failed to load URL: " + str + "\n" + lcVar.toString());
                c1008c.mo759a(null);
            }
        }) {
            final /* synthetic */ gs f3399b;

            public Map<String, String> mo757a() {
                return map2 == null ? super.mo757a() : map2;
            }
        });
        return c1008c;
    }
}
