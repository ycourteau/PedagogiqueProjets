package com.google.android.gms.p028c;

import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.C0618p;

@fn
public abstract class av<T> {
    private final String f2441a;
    private final T f2442b;

    private av(String str, T t) {
        this.f2441a = str;
        this.f2442b = t;
        C0618p.m2804m().m3888a(this);
    }

    public static av<String> m3869a(String str) {
        av<String> a = av.m3873a(str, (String) null);
        C0618p.m2804m().m3889b(a);
        return a;
    }

    public static av<Integer> m3870a(String str, int i) {
        return new av<Integer>(str, Integer.valueOf(i)) {
            public /* synthetic */ Object mo591a(SharedPreferences sharedPreferences) {
                return m3882b(sharedPreferences);
            }

            public Integer m3882b(SharedPreferences sharedPreferences) {
                return Integer.valueOf(sharedPreferences.getInt(m3876a(), ((Integer) m3877b()).intValue()));
            }
        };
    }

    public static av<Long> m3871a(String str, long j) {
        return new av<Long>(str, Long.valueOf(j)) {
            public /* synthetic */ Object mo591a(SharedPreferences sharedPreferences) {
                return m3884b(sharedPreferences);
            }

            public Long m3884b(SharedPreferences sharedPreferences) {
                return Long.valueOf(sharedPreferences.getLong(m3876a(), ((Long) m3877b()).longValue()));
            }
        };
    }

    public static av<Boolean> m3872a(String str, Boolean bool) {
        return new av<Boolean>(str, bool) {
            public /* synthetic */ Object mo591a(SharedPreferences sharedPreferences) {
                return m3880b(sharedPreferences);
            }

            public Boolean m3880b(SharedPreferences sharedPreferences) {
                return Boolean.valueOf(sharedPreferences.getBoolean(m3876a(), ((Boolean) m3877b()).booleanValue()));
            }
        };
    }

    public static av<String> m3873a(String str, String str2) {
        return new av<String>(str, str2) {
            public /* synthetic */ Object mo591a(SharedPreferences sharedPreferences) {
                return m3886b(sharedPreferences);
            }

            public String m3886b(SharedPreferences sharedPreferences) {
                return sharedPreferences.getString(m3876a(), (String) m3877b());
            }
        };
    }

    public static av<String> m3874b(String str) {
        av<String> a = av.m3873a(str, (String) null);
        C0618p.m2804m().m3890c(a);
        return a;
    }

    protected abstract T mo591a(SharedPreferences sharedPreferences);

    public String m3876a() {
        return this.f2441a;
    }

    public T m3877b() {
        return this.f2442b;
    }

    public T m3878c() {
        return C0618p.m2805n().m3892a(this);
    }
}
