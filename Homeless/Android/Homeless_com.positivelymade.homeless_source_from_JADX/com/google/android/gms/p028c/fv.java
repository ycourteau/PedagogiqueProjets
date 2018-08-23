package com.google.android.gms.p028c;

import android.content.Context;
import com.google.android.gms.ads.internal.C0618p;
import com.google.android.gms.p028c.fu.C0960a;
import java.util.WeakHashMap;

@fn
public final class fv {
    private WeakHashMap<Context, C0961a> f3196a = new WeakHashMap();

    private class C0961a {
        public final long f3193a = C0618p.m2800i().mo824a();
        public final fu f3194b;
        final /* synthetic */ fv f3195c;

        public C0961a(fv fvVar, fu fuVar) {
            this.f3195c = fvVar;
            this.f3194b = fuVar;
        }

        public boolean m4702a() {
            return ((Long) az.ad.m3878c()).longValue() + this.f3193a < C0618p.m2800i().mo824a();
        }
    }

    public fu m4703a(Context context) {
        C0961a c0961a = (C0961a) this.f3196a.get(context);
        fu a = (c0961a == null || c0961a.m4702a() || !((Boolean) az.ac.m3878c()).booleanValue()) ? new C0960a(context).m4701a() : new C0960a(context, c0961a.f3194b).m4701a();
        this.f3196a.put(context, new C0961a(this, a));
        return a;
    }
}
