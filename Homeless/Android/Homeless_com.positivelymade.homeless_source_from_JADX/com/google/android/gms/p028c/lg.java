package com.google.android.gms.p028c;

import java.lang.reflect.Array;

public class lg<M extends lf<M>, T> {
    protected final int f3944a;
    protected final Class<T> f3945b;
    public final int f3946c;
    protected final boolean f3947d;

    int m5730a(Object obj) {
        return this.f3947d ? m5732b(obj) : m5734c(obj);
    }

    void m5731a(Object obj, le leVar) {
        if (this.f3947d) {
            m5735c(obj, leVar);
        } else {
            m5733b(obj, leVar);
        }
    }

    protected int m5732b(Object obj) {
        int i = 0;
        int length = Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            if (Array.get(obj, i2) != null) {
                i += m5734c(Array.get(obj, i2));
            }
        }
        return i;
    }

    protected void m5733b(Object obj, le leVar) {
        try {
            leVar.m5727e(this.f3946c);
            switch (this.f3944a) {
                case 10:
                    lk lkVar = (lk) obj;
                    int a = lo.m5770a(this.f3946c);
                    leVar.m5716a(lkVar);
                    leVar.m5726c(a, 4);
                    return;
                case 11:
                    leVar.m5722b((lk) obj);
                    return;
                default:
                    throw new IllegalArgumentException("Unknown type " + this.f3944a);
            }
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
        throw new IllegalStateException(e);
    }

    protected int m5734c(Object obj) {
        int a = lo.m5770a(this.f3946c);
        switch (this.f3944a) {
            case 10:
                return le.m5688b(a, (lk) obj);
            case 11:
                return le.m5695c(a, (lk) obj);
            default:
                throw new IllegalArgumentException("Unknown type " + this.f3944a);
        }
    }

    protected void m5735c(Object obj, le leVar) {
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            Object obj2 = Array.get(obj, i);
            if (obj2 != null) {
                m5733b(obj2, leVar);
            }
        }
    }
}
