package com.google.android.gms.p028c;

import com.google.android.gms.common.internal.C1305x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class jg {
    private final jj f3733a;
    private final ik f3734b;
    private boolean f3735c;
    private long f3736d;
    private long f3737e;
    private long f3738f;
    private long f3739g;
    private long f3740h;
    private boolean f3741i;
    private final Map<Class<? extends ji>, ji> f3742j;
    private final List<jm> f3743k;

    jg(jg jgVar) {
        this.f3733a = jgVar.f3733a;
        this.f3734b = jgVar.f3734b;
        this.f3736d = jgVar.f3736d;
        this.f3737e = jgVar.f3737e;
        this.f3738f = jgVar.f3738f;
        this.f3739g = jgVar.f3739g;
        this.f3740h = jgVar.f3740h;
        this.f3743k = new ArrayList(jgVar.f3743k);
        this.f3742j = new HashMap(jgVar.f3742j.size());
        for (Entry entry : jgVar.f3742j.entrySet()) {
            ji c = jg.m5352c((Class) entry.getKey());
            ((ji) entry.getValue()).mo804a(c);
            this.f3742j.put(entry.getKey(), c);
        }
    }

    jg(jj jjVar, ik ikVar) {
        C1305x.m6617a((Object) jjVar);
        C1305x.m6617a((Object) ikVar);
        this.f3733a = jjVar;
        this.f3734b = ikVar;
        this.f3739g = 1800000;
        this.f3740h = 3024000000L;
        this.f3742j = new HashMap();
        this.f3743k = new ArrayList();
    }

    private static <T extends ji> T m5352c(Class<T> cls) {
        try {
            return (ji) cls.newInstance();
        } catch (Throwable e) {
            throw new IllegalArgumentException("dataType doesn't have default constructor", e);
        } catch (Throwable e2) {
            throw new IllegalArgumentException("dataType default constructor is not accessible", e2);
        }
    }

    public jg m5353a() {
        return new jg(this);
    }

    public <T extends ji> T m5354a(Class<T> cls) {
        return (ji) this.f3742j.get(cls);
    }

    public void m5355a(long j) {
        this.f3737e = j;
    }

    public void m5356a(ji jiVar) {
        C1305x.m6617a((Object) jiVar);
        Class cls = jiVar.getClass();
        if (cls.getSuperclass() != ji.class) {
            throw new IllegalArgumentException();
        }
        jiVar.mo804a(m5357b(cls));
    }

    public <T extends ji> T m5357b(Class<T> cls) {
        ji jiVar = (ji) this.f3742j.get(cls);
        if (jiVar != null) {
            return jiVar;
        }
        T c = jg.m5352c(cls);
        this.f3742j.put(cls, c);
        return c;
    }

    public Collection<ji> m5358b() {
        return this.f3742j.values();
    }

    public List<jm> m5359c() {
        return this.f3743k;
    }

    public long m5360d() {
        return this.f3736d;
    }

    public void m5361e() {
        m5365i().m5377a(this);
    }

    public boolean m5362f() {
        return this.f3735c;
    }

    void m5363g() {
        this.f3738f = this.f3734b.mo825b();
        if (this.f3737e != 0) {
            this.f3736d = this.f3737e;
        } else {
            this.f3736d = this.f3734b.mo824a();
        }
        this.f3735c = true;
    }

    jj m5364h() {
        return this.f3733a;
    }

    jk m5365i() {
        return this.f3733a.m3158m();
    }

    boolean m5366j() {
        return this.f3741i;
    }

    void m5367k() {
        this.f3741i = true;
    }
}
