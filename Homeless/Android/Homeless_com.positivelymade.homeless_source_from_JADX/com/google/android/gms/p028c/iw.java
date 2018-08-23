package com.google.android.gms.p028c;

import com.google.android.gms.p028c.aa.C0805a;

public class iw<T> {
    public final T f3604a;
    public final C0805a f3605b;
    public final lc f3606c;
    public boolean f3607d;

    public interface C1002a {
        void mo756a(lc lcVar);
    }

    public interface C1007b<T> {
        void mo759a(T t);
    }

    private iw(lc lcVar) {
        this.f3607d = false;
        this.f3604a = null;
        this.f3605b = null;
        this.f3606c = lcVar;
    }

    private iw(T t, C0805a c0805a) {
        this.f3607d = false;
        this.f3604a = t;
        this.f3605b = c0805a;
        this.f3606c = null;
    }

    public static <T> iw<T> m5303a(lc lcVar) {
        return new iw(lcVar);
    }

    public static <T> iw<T> m5304a(T t, C0805a c0805a) {
        return new iw(t, c0805a);
    }

    public boolean m5305a() {
        return this.f3606c == null;
    }
}
