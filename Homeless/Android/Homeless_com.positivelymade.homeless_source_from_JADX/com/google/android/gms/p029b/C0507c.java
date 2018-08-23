package com.google.android.gms.p029b;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.C1241e;
import com.google.android.gms.common.internal.C1305x;

public abstract class C0507c<T> {
    private final String f1432a;
    private T f1433b;

    public static class C0803a extends Exception {
        public C0803a(String str) {
            super(str);
        }

        public C0803a(String str, Throwable th) {
            super(str, th);
        }
    }

    protected C0507c(String str) {
        this.f1432a = str;
    }

    protected final T m2353a(Context context) {
        if (this.f1433b == null) {
            C1305x.m6617a((Object) context);
            Context e = C1241e.m6290e(context);
            if (e == null) {
                throw new C0803a("Could not get remote context.");
            }
            try {
                this.f1433b = mo385b((IBinder) e.getClassLoader().loadClass(this.f1432a).newInstance());
            } catch (Throwable e2) {
                throw new C0803a("Could not load creator class.", e2);
            } catch (Throwable e22) {
                throw new C0803a("Could not instantiate creator.", e22);
            } catch (Throwable e222) {
                throw new C0803a("Could not access creator.", e222);
            }
        }
        return this.f1433b;
    }

    protected abstract T mo385b(IBinder iBinder);
}
