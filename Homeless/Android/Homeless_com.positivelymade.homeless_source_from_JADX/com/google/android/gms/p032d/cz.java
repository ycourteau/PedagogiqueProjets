package com.google.android.gms.p032d;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C0774g;
import com.google.android.gms.common.api.C0778j;
import com.google.android.gms.common.api.C0870f;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.p028c.C0972g.C0971i;
import com.google.android.gms.p028c.ik;
import com.google.android.gms.p028c.il;
import com.google.android.gms.p028c.km;
import com.google.android.gms.p028c.km.C1108a;
import com.google.android.gms.p028c.kq;
import com.google.android.gms.p028c.kr.C1117c;
import com.google.android.gms.p032d.bf.C1559a;
import com.google.android.gms.p032d.cy.C1592a;

public class cz extends C0778j<C1554b> {
    private final ik f4898b;
    private final C1596a f4899c;
    private final Looper f4900d;
    private final bh f4901e;
    private final int f4902f;
    private final Context f4903g;
    private final C1601d f4904h;
    private final String f4905i;
    private C1565c f4906j;
    private km f4907k;
    private volatile cy f4908l;
    private C0971i f4909m;
    private String f4910n;
    private C1564b f4911o;

    interface C1564b extends C0870f {
        void mo1016a(String str);
    }

    interface C1565c extends C0870f {
    }

    private class C1596a implements C1592a {
        final /* synthetic */ cz f4897a;

        private C1596a(cz czVar) {
            this.f4897a = czVar;
        }
    }

    cz(Context context, C1601d c1601d, Looper looper, String str, int i, C1565c c1565c, C1564b c1564b, km kmVar, ik ikVar, bh bhVar) {
        super(looper == null ? Looper.getMainLooper() : looper);
        this.f4903g = context;
        this.f4904h = c1601d;
        if (looper == null) {
            looper = Looper.getMainLooper();
        }
        this.f4900d = looper;
        this.f4905i = str;
        this.f4902f = i;
        this.f4906j = c1565c;
        this.f4911o = c1564b;
        this.f4907k = kmVar;
        this.f4899c = new C1596a();
        this.f4909m = new C0971i();
        this.f4898b = ikVar;
        this.f4901e = bhVar;
        if (m7402f()) {
            m7406b(bf.m7150a().m7152c());
        }
    }

    public cz(Context context, C1601d c1601d, Looper looper, String str, int i, dc dcVar) {
        this(context, c1601d, looper, str, i, new bq(context, str), new bp(context, str, dcVar), new km(context), il.m5268d(), new ai(30, 900000, 5000, "refreshing", il.m5268d()));
        this.f4907k.m5576a(dcVar.m7422a());
    }

    private boolean m7402f() {
        bf a = bf.m7150a();
        return (a.m7151b() == C1559a.CONTAINER || a.m7151b() == C1559a.CONTAINER_DEBUG) && this.f4905i.equals(a.m7153d());
    }

    protected C1554b m7403a(Status status) {
        if (this.f4908l != null) {
            return this.f4908l;
        }
        if (status == Status.f4097d) {
            aj.m7036a("timer expired: setting result to failure");
        }
        return new cy(status);
    }

    public void m7404a(final String str) {
        this.f4907k.m5577a(this.f4905i, this.f4902f != -1 ? Integer.valueOf(this.f4902f) : null, str, new C1108a(this) {
            final /* synthetic */ cz f4896b;

            class C15941 implements C1592a {
                final /* synthetic */ C15951 f4894a;

                C15941(C15951 c15951) {
                    this.f4894a = c15951;
                }
            }

            public void mo1033a(kq kqVar) {
                if (kqVar.mo558a() != Status.f4094a) {
                    aj.m7036a("Load request failed for the container " + this.f4896b.f4905i);
                    this.f4896b.m3689a(this.f4896b.m7403a(Status.f4096c));
                    return;
                }
                C1117c e = kqVar.m5590b().m5587e();
                if (e == null) {
                    String str = "Response doesn't have the requested container";
                    aj.m7036a(str);
                    this.f4896b.m3689a(this.f4896b.m7403a(new Status(8, str, null)));
                    return;
                }
                this.f4896b.f4908l = new cy(this.f4896b.f4904h, this.f4896b.f4900d, new C1545a(this.f4896b.f4903g, this.f4896b.f4904h.m7415a(), this.f4896b.f4905i, kqVar.m5590b().m5588f(), e), new C15941(this));
                this.f4896b.m3689a(this.f4896b.f4908l);
            }
        });
    }

    protected /* synthetic */ C0774g mo574b(Status status) {
        return m7403a(status);
    }

    synchronized void m7406b(String str) {
        this.f4910n = str;
        if (this.f4911o != null) {
            this.f4911o.mo1016a(str);
        }
    }
}
