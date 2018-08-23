package com.google.android.gms.p028c;

import android.os.Binder;

public abstract class ia<T> {
    private static final Object f3554c = new Object();
    private static C1039a f3555d = null;
    private static int f3556e = 0;
    private static String f3557f = "com.google.android.providers.gsf.permission.READ_GSERVICES";
    protected final String f3558a;
    protected final T f3559b;
    private T f3560g = null;

    private interface C1039a {
        Boolean m5197a(String str, Boolean bool);

        Float m5198a(String str, Float f);

        Integer m5199a(String str, Integer num);

        Long m5200a(String str, Long l);

        String m5201a(String str, String str2);
    }

    protected ia(String str, T t) {
        this.f3558a = str;
        this.f3559b = t;
    }

    public static int m5176a() {
        return f3556e;
    }

    public static ia<Float> m5177a(String str, Float f) {
        return new ia<Float>(str, f) {
            protected /* synthetic */ Object mo814a(String str) {
                return m5194b(str);
            }

            protected Float m5194b(String str) {
                return ia.f3555d.m5198a(this.a, (Float) this.b);
            }
        };
    }

    public static ia<Integer> m5178a(String str, Integer num) {
        return new ia<Integer>(str, num) {
            protected /* synthetic */ Object mo814a(String str) {
                return m5192b(str);
            }

            protected Integer m5192b(String str) {
                return ia.f3555d.m5199a(this.a, (Integer) this.b);
            }
        };
    }

    public static ia<Long> m5179a(String str, Long l) {
        return new ia<Long>(str, l) {
            protected /* synthetic */ Object mo814a(String str) {
                return m5190b(str);
            }

            protected Long m5190b(String str) {
                return ia.f3555d.m5200a(this.a, (Long) this.b);
            }
        };
    }

    public static ia<String> m5180a(String str, String str2) {
        return new ia<String>(str, str2) {
            protected /* synthetic */ Object mo814a(String str) {
                return m5196b(str);
            }

            protected String m5196b(String str) {
                return ia.f3555d.m5201a(this.a, (String) this.b);
            }
        };
    }

    public static ia<Boolean> m5181a(String str, boolean z) {
        return new ia<Boolean>(str, Boolean.valueOf(z)) {
            protected /* synthetic */ Object mo814a(String str) {
                return m5188b(str);
            }

            protected Boolean m5188b(String str) {
                return ia.f3555d.m5197a(this.a, (Boolean) this.b);
            }
        };
    }

    public static boolean m5182b() {
        return f3555d != null;
    }

    protected abstract T mo814a(String str);

    public final T m5185c() {
        return this.f3560g != null ? this.f3560g : mo814a(this.f3558a);
    }

    public final T m5186d() {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            T c = m5185c();
            return c;
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }
}
