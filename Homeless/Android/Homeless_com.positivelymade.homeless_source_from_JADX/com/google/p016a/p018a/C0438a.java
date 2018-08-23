package com.google.p016a.p018a;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.C0427a;
import com.google.android.gms.ads.C0470b;
import com.google.android.gms.ads.C0470b.C0461a;
import com.google.android.gms.ads.C0476c;
import com.google.android.gms.ads.C0476c.C0472a;
import com.google.android.gms.ads.C0483d;
import com.google.android.gms.ads.C0486e;
import com.google.android.gms.ads.internal.client.C0428a;
import com.google.android.gms.ads.internal.client.C0526n;
import com.google.android.gms.ads.p017d.C0423h;
import com.google.android.gms.ads.p017d.C0425i;
import com.google.android.gms.ads.p017d.C0435c;
import com.google.android.gms.ads.p017d.C0436e;
import com.google.android.gms.ads.p017d.C0437k;
import com.google.android.gms.ads.p017d.C0478a;
import com.google.android.gms.ads.p017d.C0479d;
import com.google.android.gms.ads.p017d.C0480f;
import com.google.android.gms.ads.p017d.C0481j;
import com.google.android.gms.ads.p017d.C0482l;
import com.google.android.gms.ads.p019b.C0466b;
import com.google.android.gms.ads.p019b.C0467c;
import com.google.android.gms.ads.p019b.C0468d;
import com.google.android.gms.ads.p019b.C0468d.C0431a;
import com.google.android.gms.ads.p019b.C0469e;
import com.google.android.gms.ads.p019b.C0469e.C0432a;
import com.google.android.gms.p028c.fn;
import com.google.p016a.p018a.p020a.C0439a;
import java.util.Date;
import java.util.Set;

@fn
public abstract class C0438a implements C0435c, C0436e, C0437k {
    protected AdView f1227a;
    protected C0486e f1228b;
    private C0470b f1229c;

    static class C0424a extends C0423h {
        private final C0468d f1213d;

        public C0424a(C0468d c0468d) {
            this.f1213d = c0468d;
            m1955a(c0468d.mo602b().toString());
            m1956a(c0468d.mo603c());
            m1957b(c0468d.mo604d().toString());
            m1954a(c0468d.mo605e());
            m1958c(c0468d.mo606f().toString());
            m1953a(c0468d.mo607g().doubleValue());
            m1959d(c0468d.mo608h().toString());
            m1961e(c0468d.mo609i().toString());
            m1946a(true);
            m1949b(true);
        }

        public void mo321a(View view) {
            if (view instanceof C0467c) {
                ((C0467c) view).setNativeAd(this.f1213d);
            }
        }
    }

    static class C0426b extends C0425i {
        private final C0469e f1220d;

        public C0426b(C0469e c0469e) {
            this.f1220d = c0469e;
            m1971a(c0469e.mo610b().toString());
            m1972a(c0469e.mo611c());
            m1973b(c0469e.mo612d().toString());
            m1970a(c0469e.mo613e());
            m1974c(c0469e.mo614f().toString());
            m1975d(c0469e.mo615g().toString());
            m1946a(true);
            m1949b(true);
        }

        public void mo321a(View view) {
            if (view instanceof C0467c) {
                ((C0467c) view).setNativeAd(this.f1220d);
            }
        }
    }

    static final class C0429c extends C0427a implements C0428a {
        final C0438a f1221a;
        final C0479d f1222b;

        public C0429c(C0438a c0438a, C0479d c0479d) {
            this.f1221a = c0438a;
            this.f1222b = c0479d;
        }

        public void mo322a() {
            this.f1222b.mo692a(this.f1221a);
        }

        public void mo323a(int i) {
            this.f1222b.mo693a(this.f1221a, i);
        }

        public void mo324b() {
            this.f1222b.mo699b(this.f1221a);
        }

        public void mo325c() {
            this.f1222b.mo702c(this.f1221a);
        }

        public void mo326d() {
            this.f1222b.mo705d(this.f1221a);
        }

        public void mo327e() {
            this.f1222b.mo708e(this.f1221a);
        }
    }

    static final class C0430d extends C0427a implements C0428a {
        final C0438a f1223a;
        final C0480f f1224b;

        public C0430d(C0438a c0438a, C0480f c0480f) {
            this.f1223a = c0438a;
            this.f1224b = c0480f;
        }

        public void mo322a() {
            this.f1224b.mo694a(this.f1223a);
        }

        public void mo323a(int i) {
            this.f1224b.mo695a(this.f1223a, i);
        }

        public void mo324b() {
            this.f1224b.mo700b(this.f1223a);
        }

        public void mo325c() {
            this.f1224b.mo703c(this.f1223a);
        }

        public void mo326d() {
            this.f1224b.mo706d(this.f1223a);
        }

        public void mo327e() {
            this.f1224b.mo709e(this.f1223a);
        }
    }

    static final class C0433e extends C0427a implements C0431a, C0432a, C0428a {
        final C0438a f1225a;
        final C0482l f1226b;

        public C0433e(C0438a c0438a, C0482l c0482l) {
            this.f1225a = c0438a;
            this.f1226b = c0482l;
        }

        public void mo322a() {
        }

        public void mo323a(int i) {
            this.f1226b.mo697a(this.f1225a, i);
        }

        public void mo328a(C0468d c0468d) {
            this.f1226b.mo698a(this.f1225a, new C0424a(c0468d));
        }

        public void mo329a(C0469e c0469e) {
            this.f1226b.mo698a(this.f1225a, new C0426b(c0469e));
        }

        public void mo324b() {
            this.f1226b.mo696a(this.f1225a);
        }

        public void mo325c() {
            this.f1226b.mo701b(this.f1225a);
        }

        public void mo326d() {
            this.f1226b.mo704c(this.f1225a);
        }

        public void mo327e() {
            this.f1226b.mo707d(this.f1225a);
        }
    }

    protected abstract Bundle mo338a(Bundle bundle, Bundle bundle2);

    C0461a m2020a(Context context, String str) {
        return new C0461a(context, str);
    }

    C0476c m2021a(Context context, C0478a c0478a, Bundle bundle, Bundle bundle2) {
        C0472a c0472a = new C0472a();
        Date a = c0478a.mo686a();
        if (a != null) {
            c0472a.m2092a(a);
        }
        int b = c0478a.mo687b();
        if (b != 0) {
            c0472a.m2088a(b);
        }
        Set<String> c = c0478a.mo688c();
        if (c != null) {
            for (String a2 : c) {
                c0472a.m2091a(a2);
            }
        }
        Location d = c0478a.mo689d();
        if (d != null) {
            c0472a.m2089a(d);
        }
        if (c0478a.mo691f()) {
            c0472a.m2095b(C0526n.m2400a().m3081a(context));
        }
        if (c0478a.mo690e() != -1) {
            c0472a.m2093a(c0478a.mo690e() == 1);
        }
        c0472a.m2090a(C0439a.class, mo338a(bundle, bundle2));
        return c0472a.m2094a();
    }

    public String m2022a(Bundle bundle) {
        return bundle.getString("pubid");
    }

    public void mo330a() {
        if (this.f1227a != null) {
            this.f1227a.m2047a();
            this.f1227a = null;
        }
        if (this.f1228b != null) {
            this.f1228b = null;
        }
        if (this.f1229c != null) {
            this.f1229c = null;
        }
    }

    public void mo331a(Context context, C0479d c0479d, Bundle bundle, C0483d c0483d, C0478a c0478a, Bundle bundle2) {
        this.f1227a = new AdView(context);
        this.f1227a.setAdSize(new C0483d(c0483d.m2139b(), c0483d.m2137a()));
        this.f1227a.setAdUnitId(m2022a(bundle));
        this.f1227a.setAdListener(new C0429c(this, c0479d));
        this.f1227a.m2048a(m2021a(context, c0478a, bundle2, bundle));
    }

    public void mo332a(Context context, C0480f c0480f, Bundle bundle, C0478a c0478a, Bundle bundle2) {
        this.f1228b = new C0486e(context);
        this.f1228b.m2147a(m2022a(bundle));
        this.f1228b.m2145a(new C0430d(this, c0480f));
        this.f1228b.m2146a(m2021a(context, c0478a, bundle2, bundle));
    }

    public void mo333a(Context context, C0482l c0482l, Bundle bundle, C0481j c0481j, Bundle bundle2) {
        C0432a c0433e = new C0433e(this, c0482l);
        C0461a a = m2020a(context, bundle.getString("pubid")).m2053a((C0427a) c0433e);
        C0466b g = c0481j.mo710g();
        if (g != null) {
            a.m2054a(g);
        }
        if (c0481j.mo711h()) {
            a.m2055a((C0431a) c0433e);
        }
        if (c0481j.mo712i()) {
            a.m2056a(c0433e);
        }
        this.f1229c = a.m2057a();
        this.f1229c.m2086a(m2021a(context, c0481j, bundle2, bundle));
    }

    public void mo334b() {
        if (this.f1227a != null) {
            this.f1227a.m2049b();
        }
    }

    public void mo335c() {
        if (this.f1227a != null) {
            this.f1227a.m2050c();
        }
    }

    public View mo336d() {
        return this.f1227a;
    }

    public void mo337e() {
        this.f1228b.m2149b();
    }
}
