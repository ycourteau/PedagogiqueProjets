package com.google.android.gms.p028c;

import android.os.IBinder;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.ads.p019b.C0463a.C0462a;
import com.google.android.gms.ads.p019b.C0468d;
import com.google.android.gms.p028c.bl.C0560a;
import com.google.android.gms.p029b.C0799a;
import java.util.ArrayList;
import java.util.List;

@fn
public class bq extends C0468d {
    private final bp f2546a;
    private final List<C0462a> f2547b = new ArrayList();
    private final bm f2548c;

    public bq(bp bpVar) {
        bm bmVar;
        this.f2546a = bpVar;
        try {
            for (Object a : this.f2546a.mo413b()) {
                bl a2 = m3963a(a);
                if (a2 != null) {
                    this.f2547b.add(new bm(a2));
                }
            }
        } catch (Throwable e) {
            C0691b.m3098b("Failed to get image.", e);
        }
        try {
            bl d = this.f2546a.mo415d();
            if (d != null) {
                bmVar = new bm(d);
                this.f2548c = bmVar;
            }
        } catch (Throwable e2) {
            C0691b.m3098b("Failed to get icon.", e2);
        }
        bmVar = null;
        this.f2548c = bmVar;
    }

    bl m3963a(Object obj) {
        return obj instanceof IBinder ? C0560a.m2488a((IBinder) obj) : null;
    }

    protected /* synthetic */ Object mo601a() {
        return m3973j();
    }

    public CharSequence mo602b() {
        try {
            return this.f2546a.mo411a();
        } catch (Throwable e) {
            C0691b.m3098b("Failed to get headline.", e);
            return null;
        }
    }

    public List<C0462a> mo603c() {
        return this.f2547b;
    }

    public CharSequence mo604d() {
        try {
            return this.f2546a.mo414c();
        } catch (Throwable e) {
            C0691b.m3098b("Failed to get body.", e);
            return null;
        }
    }

    public C0462a mo605e() {
        return this.f2548c;
    }

    public CharSequence mo606f() {
        try {
            return this.f2546a.mo416e();
        } catch (Throwable e) {
            C0691b.m3098b("Failed to get call to action.", e);
            return null;
        }
    }

    public Double mo607g() {
        Double d = null;
        try {
            double f = this.f2546a.mo417f();
            if (f != -1.0d) {
                d = Double.valueOf(f);
            }
        } catch (Throwable e) {
            C0691b.m3098b("Failed to get star rating.", e);
        }
        return d;
    }

    public CharSequence mo608h() {
        try {
            return this.f2546a.mo418g();
        } catch (Throwable e) {
            C0691b.m3098b("Failed to get store", e);
            return null;
        }
    }

    public CharSequence mo609i() {
        try {
            return this.f2546a.mo419h();
        } catch (Throwable e) {
            C0691b.m3098b("Failed to get price.", e);
            return null;
        }
    }

    protected C0799a m3973j() {
        try {
            return this.f2546a.mo420i();
        } catch (Throwable e) {
            C0691b.m3098b("Failed to retrieve native ad engine.", e);
            return null;
        }
    }
}
