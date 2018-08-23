package com.google.android.gms.p028c;

import android.os.IBinder;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.ads.p019b.C0463a.C0462a;
import com.google.android.gms.ads.p019b.C0469e;
import com.google.android.gms.p028c.bl.C0560a;
import com.google.android.gms.p029b.C0799a;
import java.util.ArrayList;
import java.util.List;

@fn
public class bs extends C0469e {
    private final br f2550a;
    private final List<C0462a> f2551b = new ArrayList();
    private final bm f2552c;

    public bs(br brVar) {
        bm bmVar;
        this.f2550a = brVar;
        try {
            for (Object a : this.f2550a.mo425b()) {
                bl a2 = m3982a(a);
                if (a2 != null) {
                    this.f2551b.add(new bm(a2));
                }
            }
        } catch (Throwable e) {
            C0691b.m3098b("Failed to get image.", e);
        }
        try {
            bl d = this.f2550a.mo427d();
            if (d != null) {
                bmVar = new bm(d);
                this.f2552c = bmVar;
            }
        } catch (Throwable e2) {
            C0691b.m3098b("Failed to get icon.", e2);
        }
        bmVar = null;
        this.f2552c = bmVar;
    }

    bl m3982a(Object obj) {
        return obj instanceof IBinder ? C0560a.m2488a((IBinder) obj) : null;
    }

    protected /* synthetic */ Object mo601a() {
        return m3990h();
    }

    public CharSequence mo610b() {
        try {
            return this.f2550a.mo424a();
        } catch (Throwable e) {
            C0691b.m3098b("Failed to get headline.", e);
            return null;
        }
    }

    public List<C0462a> mo611c() {
        return this.f2551b;
    }

    public CharSequence mo612d() {
        try {
            return this.f2550a.mo426c();
        } catch (Throwable e) {
            C0691b.m3098b("Failed to get body.", e);
            return null;
        }
    }

    public C0462a mo613e() {
        return this.f2552c;
    }

    public CharSequence mo614f() {
        try {
            return this.f2550a.mo428e();
        } catch (Throwable e) {
            C0691b.m3098b("Failed to get call to action.", e);
            return null;
        }
    }

    public CharSequence mo615g() {
        try {
            return this.f2550a.mo429f();
        } catch (Throwable e) {
            C0691b.m3098b("Failed to get attribution.", e);
            return null;
        }
    }

    protected C0799a m3990h() {
        try {
            return this.f2550a.mo430g();
        } catch (Throwable e) {
            C0691b.m3098b("Failed to retrieve native ad engine.", e);
            return null;
        }
    }
}
