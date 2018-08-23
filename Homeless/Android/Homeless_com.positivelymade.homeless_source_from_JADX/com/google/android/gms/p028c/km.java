package com.google.android.gms.p028c;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.p028c.kq.C1113a;
import com.google.android.gms.p028c.kq.C1113a.C1112a;
import com.google.android.gms.p028c.kr.C1117c;
import com.google.android.gms.p028c.kz.C1125b;
import com.google.android.gms.p032d.aj;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class km {
    Map<String, C1110c<C1117c>> f3854a;
    private final Context f3855b;
    private final kt f3856c;
    private final ik f3857d;
    private String f3858e;
    private final Map<String, lb> f3859f;

    public interface C1108a {
        void mo1033a(kq kqVar);
    }

    class C1109b extends kz {
        final /* synthetic */ km f3849a;
        private final C1108a f3850b;

        C1109b(km kmVar, kp kpVar, kn knVar, C1108a c1108a) {
            this.f3849a = kmVar;
            super(kpVar, knVar);
            this.f3850b = c1108a;
        }

        protected C1125b mo835a(kk kkVar) {
            return null;
        }

        protected void mo836a(kq kqVar) {
            C1113a b = kqVar.m5590b();
            this.f3849a.m5575a(b);
            if (b.m5583a() != Status.f4094a || b.m5584b() != C1112a.NETWORK || b.m5585c() == null || b.m5585c().length <= 0) {
                aj.m7041d("Response status: " + (b.m5583a().m5971e() ? "SUCCESS" : "FAILURE"));
                if (b.m5583a().m5971e()) {
                    aj.m7041d("Response source: " + b.m5584b().toString());
                    aj.m7041d("Response size: " + b.m5585c().length);
                }
                this.f3849a.m5573a(b.m5586d(), this.f3850b);
                return;
            }
            this.f3849a.f3856c.m5634a(b.m5586d().m5546d(), b.m5585c());
            aj.m7041d("Resource successfully load from Network.");
            this.f3850b.mo1033a(kqVar);
        }
    }

    static class C1110c<T> {
        private Status f3851a;
        private T f3852b;
        private long f3853c;

        public C1110c(Status status, T t, long j) {
            this.f3851a = status;
            this.f3852b = t;
            this.f3853c = j;
        }

        public long m5567a() {
            return this.f3853c;
        }

        public void m5568a(long j) {
            this.f3853c = j;
        }

        public void m5569a(Status status) {
            this.f3851a = status;
        }

        public void m5570a(T t) {
            this.f3852b = t;
        }
    }

    public km(Context context) {
        this(context, new HashMap(), new kt(context), il.m5268d());
    }

    km(Context context, Map<String, lb> map, kt ktVar, ik ikVar) {
        this.f3858e = null;
        this.f3854a = new HashMap();
        this.f3855b = context;
        this.f3857d = ikVar;
        this.f3856c = ktVar;
        this.f3859f = map;
    }

    private void m5572a(kp kpVar, C1108a c1108a) {
        boolean z = true;
        List a = kpVar.m5581a();
        if (a.size() != 1) {
            z = false;
        }
        C1305x.m6625b(z);
        m5573a((kk) a.get(0), c1108a);
    }

    void m5573a(final kk kkVar, final C1108a c1108a) {
        this.f3856c.m5633a(kkVar.m5546d(), kkVar.m5544b(), ko.f3860a, new ks(this) {
            final /* synthetic */ km f3845c;

            public void mo834a(Status status, Object obj, Integer num, long j) {
                C1113a c1113a;
                if (status.m5971e()) {
                    c1113a = new C1113a(Status.f4094a, kkVar, null, (C1117c) obj, num == kt.f3913a ? C1112a.DEFAULT : C1112a.DISK, j);
                } else {
                    c1113a = new C1113a(new Status(16, "There is no valid resource for the container: " + kkVar.m5543a()), null, C1112a.DISK);
                }
                c1108a.mo1033a(new kq(c1113a));
            }
        });
    }

    void m5574a(kp kpVar, C1108a c1108a, kz kzVar) {
        Object obj = null;
        for (kk kkVar : kpVar.m5581a()) {
            C1110c c1110c = (C1110c) this.f3854a.get(kkVar.m5543a());
            obj = (c1110c != null ? c1110c.m5567a() : this.f3856c.m5632a(kkVar.m5543a())) + 900000 < this.f3857d.mo824a() ? 1 : obj;
        }
        if (obj != null) {
            lb lbVar;
            lb lbVar2 = (lb) this.f3859f.get(kpVar.m5582b());
            if (lbVar2 == null) {
                lbVar2 = this.f3858e == null ? new lb() : new lb(this.f3858e);
                this.f3859f.put(kpVar.m5582b(), lbVar2);
                lbVar = lbVar2;
            } else {
                lbVar = lbVar2;
            }
            lbVar.m5676a(this.f3855b, kpVar, 0, kzVar);
            return;
        }
        m5572a(kpVar, c1108a);
    }

    void m5575a(C1113a c1113a) {
        String a = c1113a.m5586d().m5543a();
        Status a2 = c1113a.m5583a();
        Object e = c1113a.m5587e();
        if (this.f3854a.containsKey(a)) {
            C1110c c1110c = (C1110c) this.f3854a.get(a);
            c1110c.m5568a(this.f3857d.mo824a());
            if (a2 == Status.f4094a) {
                c1110c.m5569a(a2);
                c1110c.m5570a(e);
                return;
            }
            return;
        }
        this.f3854a.put(a, new C1110c(a2, e, this.f3857d.mo824a()));
    }

    public void m5576a(String str) {
        this.f3858e = str;
    }

    public void m5577a(String str, Integer num, String str2, C1108a c1108a) {
        kp a = new kp().m5580a(new kk(str, num, str2, false));
        m5574a(a, c1108a, new C1109b(this, a, ko.f3860a, c1108a));
    }
}
