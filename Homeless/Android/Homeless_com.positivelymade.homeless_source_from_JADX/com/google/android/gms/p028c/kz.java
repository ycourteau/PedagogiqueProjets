package com.google.android.gms.p028c;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.p028c.kq.C1113a;
import com.google.android.gms.p028c.kq.C1113a.C1112a;
import com.google.android.gms.p028c.kr.C1117c;
import com.google.android.gms.p028c.kr.C1121g;
import com.google.android.gms.p032d.aj;

public abstract class kz {
    private kp f3846a;
    private kn f3847b;
    private ik f3848c;

    public enum C1124a {
        NOT_AVAILABLE,
        IO_ERROR,
        SERVER_ERROR
    }

    public class C1125b {
        private final Object f3924a;
        private final C1112a f3925b;
        private final long f3926c;

        public Object m5656a() {
            return this.f3924a;
        }

        public C1112a m5657b() {
            return this.f3925b;
        }

        public long m5658c() {
            return this.f3926c;
        }
    }

    public kz(kp kpVar, kn knVar) {
        this(kpVar, knVar, il.m5268d());
    }

    public kz(kp kpVar, kn knVar, ik ikVar) {
        boolean z = true;
        if (kpVar.m5581a().size() != 1) {
            z = false;
        }
        C1305x.m6625b(z);
        this.f3846a = kpVar;
        this.f3847b = knVar;
        this.f3848c = ikVar;
    }

    protected abstract C1125b mo835a(kk kkVar);

    protected abstract void mo836a(kq kqVar);

    public void m5563a(C1124a c1124a) {
        aj.m7036a("ResourceManager: Failed to download a resource: " + c1124a.name());
        kk kkVar = (kk) this.f3846a.m5581a().get(0);
        C1125b a = mo835a(kkVar);
        C1113a c1113a = (a == null || !(a.m5656a() instanceof C1117c)) ? new C1113a(Status.f4096c, kkVar, C1112a.NETWORK) : new C1113a(Status.f4094a, kkVar, null, (C1117c) a.m5656a(), a.m5657b(), a.m5658c());
        mo836a(new kq(c1113a));
    }

    public void m5564a(byte[] bArr) {
        Object a;
        long j;
        C1112a c1112a;
        Object obj;
        C1113a c1113a;
        aj.m7041d("ResourceManager: Resource downloaded from Network: " + this.f3846a.m5582b());
        kk kkVar = (kk) this.f3846a.m5581a().get(0);
        C1112a c1112a2 = C1112a.NETWORK;
        C1125b a2;
        try {
            a = this.f3847b.mo837a(bArr);
            long a3 = this.f3848c.mo824a();
            if (a == null) {
                aj.m7040c("Parsed resource from network is null");
                a2 = mo835a(kkVar);
                if (a2 != null) {
                    a = a2.m5656a();
                    c1112a2 = a2.m5657b();
                    a3 = a2.m5658c();
                }
            }
            j = a3;
            c1112a = c1112a2;
            obj = a;
        } catch (C1121g e) {
            aj.m7040c("Resource from network is corrupted");
            a2 = mo835a(kkVar);
            if (a2 != null) {
                a = a2.m5656a();
                j = 0;
                c1112a = a2.m5657b();
                obj = a;
            } else {
                j = 0;
                c1112a = c1112a2;
                obj = null;
            }
        }
        if (obj != null) {
            c1113a = new C1113a(Status.f4094a, kkVar, bArr, (C1117c) obj, c1112a, j);
        } else {
            c1113a = new C1113a(Status.f4096c, kkVar, C1112a.NETWORK);
        }
        mo836a(new kq(c1113a));
    }
}
