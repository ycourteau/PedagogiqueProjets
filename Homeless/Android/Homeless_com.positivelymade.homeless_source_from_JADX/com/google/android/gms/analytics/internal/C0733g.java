package com.google.android.gms.analytics.internal;

import android.util.Log;
import com.google.android.gms.common.internal.C1305x;
import java.util.Map;
import java.util.Map.Entry;

public class C0733g extends C0717p {
    private static String f2143a = "3";
    private static String f2144b = "01VDIWEA?";
    private static C0733g f2145c;

    public C0733g(C0750r c0750r) {
        super(c0750r);
    }

    public static C0733g m3387b() {
        return f2145c;
    }

    protected String mo553a(Object obj) {
        if (obj == null) {
            return null;
        }
        Object l = obj instanceof Integer ? new Long((long) ((Integer) obj).intValue()) : obj;
        if (!(l instanceof Long)) {
            return l instanceof Boolean ? String.valueOf(l) : l instanceof Throwable ? l.getClass().getCanonicalName() : "-";
        } else {
            if (Math.abs(((Long) l).longValue()) < 100) {
                return String.valueOf(l);
            }
            String str = String.valueOf(l).charAt(0) == '-' ? "-" : "";
            String valueOf = String.valueOf(Math.abs(((Long) l).longValue()));
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1))));
            stringBuilder.append("...");
            stringBuilder.append(str);
            stringBuilder.append(Math.round(Math.pow(10.0d, (double) valueOf.length()) - 1.0d));
            return stringBuilder.toString();
        }
    }

    protected void mo540a() {
        synchronized (C0733g.class) {
            f2145c = this;
        }
    }

    public void mo554a(int i, String str, Object obj, Object obj2, Object obj3) {
        String str2 = (String) ak.f2097c.m3343a();
        if (Log.isLoggable(str2, i)) {
            Log.println(i, str2, C0716o.m3192c(str, obj, obj2, obj3));
        }
        if (i >= 5) {
            m3393b(i, str, obj, obj2, obj3);
        }
    }

    public void m3391a(C0727c c0727c, String str) {
        if (str == null) {
            str = "no reason provided";
        }
        m3206d("Discarding hit. " + str, c0727c != null ? c0727c.toString() : "no hit data");
    }

    public void m3392a(Map<String, String> map, String str) {
        Object stringBuilder;
        if (str == null) {
            str = "no reason provided";
        }
        if (map != null) {
            StringBuilder stringBuilder2 = new StringBuilder();
            for (Entry entry : map.entrySet()) {
                if (stringBuilder2.length() > 0) {
                    stringBuilder2.append(',');
                }
                stringBuilder2.append((String) entry.getKey());
                stringBuilder2.append('=');
                stringBuilder2.append((String) entry.getValue());
            }
            stringBuilder = stringBuilder2.toString();
        } else {
            stringBuilder = "no hit data";
        }
        m3206d("Discarding hit. " + str, stringBuilder);
    }

    public synchronized void m3393b(int i, String str, Object obj, Object obj2, Object obj3) {
        int i2 = 0;
        synchronized (this) {
            C1305x.m6617a((Object) str);
            if (i >= 0) {
                i2 = i;
            }
            int length = i2 >= f2144b.length() ? f2144b.length() - 1 : i2;
            char c = m3217q().m3283b() ? m3217q().m3282a() ? 'P' : 'C' : m3217q().m3282a() ? 'p' : 'c';
            String str2 = f2143a + f2144b.charAt(length) + c + C0748q.f2184a + ":" + C0716o.m3192c(str, mo553a(obj), mo553a(obj2), mo553a(obj3));
            if (str2.length() > 1024) {
                str2 = str2.substring(0, 1024);
            }
            C0739j n = m3211k().m3502n();
            if (n != null) {
                n.m3443g().m3433a(str2);
            }
        }
    }
}
