package com.google.android.gms.p028c;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.ads.p017d.C0434b;
import com.google.android.gms.ads.p017d.p024a.C0477a;
import com.google.android.gms.p028c.di.C0899a;
import com.google.p016a.p018a.C0441c;
import com.google.p016a.p018a.C0448h;
import com.google.p016a.p018a.C0449i;
import java.util.Map;

@fn
public final class dh extends C0899a {
    private Map<Class<? extends Object>, Object> f2760a;

    private <NETWORK_EXTRAS extends C0449i, SERVER_PARAMETERS extends C0448h> dj m4226c(String str) {
        try {
            Class cls = Class.forName(str, false, dh.class.getClassLoader());
            if (C0441c.class.isAssignableFrom(cls)) {
                C0441c c0441c = (C0441c) cls.newInstance();
                return new dt(c0441c, (C0449i) this.f2760a.get(c0441c.m2033b()));
            } else if (C0434b.class.isAssignableFrom(cls)) {
                return new C0908do((C0434b) cls.newInstance());
            } else {
                C0691b.m3103e("Could not instantiate mediation adapter: " + str + " (not a valid adapter).");
                throw new RemoteException();
            }
        } catch (Throwable th) {
            C0691b.m3103e("Could not instantiate mediation adapter: " + str + ". " + th.getMessage());
            RemoteException remoteException = new RemoteException();
        }
    }

    public dj mo642a(String str) {
        return m4226c(str);
    }

    public void m4228a(Map<Class<? extends Object>, Object> map) {
        this.f2760a = map;
    }

    public boolean mo643b(String str) {
        boolean z = false;
        try {
            z = C0477a.class.isAssignableFrom(Class.forName(str, false, dh.class.getClassLoader()));
        } catch (Throwable th) {
            C0691b.m3103e("Could not load custom event implementation class: " + str + ", assuming old implementation.");
        }
        return z;
    }
}
