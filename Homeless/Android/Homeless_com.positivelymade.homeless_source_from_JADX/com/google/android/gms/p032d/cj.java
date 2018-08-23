package com.google.android.gms.p032d;

import com.google.android.gms.p028c.C1010h.C1009a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class cj {
    private static final Object f4830a = null;
    private static Long f4831b = new Long(0);
    private static Double f4832c = new Double(0.0d);
    private static ci f4833d = ci.m7308a(0);
    private static String f4834e = new String("");
    private static Boolean f4835f = new Boolean(false);
    private static List<Object> f4836g = new ArrayList(0);
    private static Map<Object, Object> f4837h = new HashMap();
    private static C1009a f4838i = cj.m7332e(f4834e);

    private static ci m7317a(String str) {
        try {
            return ci.m7310a(str);
        } catch (NumberFormatException e) {
            aj.m7036a("Failed to convert '" + str + "' to a number.");
            return f4833d;
        }
    }

    public static Object m7318a() {
        return f4830a;
    }

    public static String m7319a(C1009a c1009a) {
        return cj.m7320a(cj.m7333e(c1009a));
    }

    public static String m7320a(Object obj) {
        return obj == null ? f4834e : obj.toString();
    }

    public static ci m7321b(C1009a c1009a) {
        return cj.m7322b(cj.m7333e(c1009a));
    }

    public static ci m7322b(Object obj) {
        return obj instanceof ci ? (ci) obj : cj.m7338h(obj) ? ci.m7308a(cj.m7339i(obj)) : cj.m7336f(obj) ? ci.m7309a(Double.valueOf(cj.m7337g(obj))) : cj.m7317a(cj.m7320a(obj));
    }

    public static Long m7323b() {
        return f4831b;
    }

    private static Long m7324b(String str) {
        ci a = cj.m7317a(str);
        return a == f4833d ? f4831b : Long.valueOf(a.longValue());
    }

    public static Boolean m7325c() {
        return f4835f;
    }

    private static Boolean m7326c(String str) {
        return "true".equalsIgnoreCase(str) ? Boolean.TRUE : "false".equalsIgnoreCase(str) ? Boolean.FALSE : f4835f;
    }

    public static Long m7327c(C1009a c1009a) {
        return cj.m7328c(cj.m7333e(c1009a));
    }

    public static Long m7328c(Object obj) {
        return cj.m7338h(obj) ? Long.valueOf(cj.m7339i(obj)) : cj.m7324b(cj.m7320a(obj));
    }

    public static ci m7329d() {
        return f4833d;
    }

    public static Boolean m7330d(C1009a c1009a) {
        return cj.m7331d(cj.m7333e(c1009a));
    }

    public static Boolean m7331d(Object obj) {
        return obj instanceof Boolean ? (Boolean) obj : cj.m7326c(cj.m7320a(obj));
    }

    public static C1009a m7332e(Object obj) {
        boolean z = false;
        C1009a c1009a = new C1009a();
        if (obj instanceof C1009a) {
            return (C1009a) obj;
        }
        if (obj instanceof String) {
            c1009a.f3436a = 1;
            c1009a.f3437b = (String) obj;
        } else if (obj instanceof List) {
            c1009a.f3436a = 2;
            List<Object> list = (List) obj;
            r5 = new ArrayList(list.size());
            r1 = false;
            for (Object e : list) {
                C1009a e2 = cj.m7332e(e);
                if (e2 == f4838i) {
                    return f4838i;
                }
                r0 = r1 || e2.f3447l;
                r5.add(e2);
                r1 = r0;
            }
            c1009a.f3438c = (C1009a[]) r5.toArray(new C1009a[0]);
            z = r1;
        } else if (obj instanceof Map) {
            c1009a.f3436a = 3;
            Set<Entry> entrySet = ((Map) obj).entrySet();
            r5 = new ArrayList(entrySet.size());
            List arrayList = new ArrayList(entrySet.size());
            r1 = false;
            for (Entry entry : entrySet) {
                C1009a e3 = cj.m7332e(entry.getKey());
                C1009a e4 = cj.m7332e(entry.getValue());
                if (e3 == f4838i || e4 == f4838i) {
                    return f4838i;
                }
                r0 = r1 || e3.f3447l || e4.f3447l;
                r5.add(e3);
                arrayList.add(e4);
                r1 = r0;
            }
            c1009a.f3439d = (C1009a[]) r5.toArray(new C1009a[0]);
            c1009a.f3440e = (C1009a[]) arrayList.toArray(new C1009a[0]);
            z = r1;
        } else if (cj.m7336f(obj)) {
            c1009a.f3436a = 1;
            c1009a.f3437b = obj.toString();
        } else if (cj.m7338h(obj)) {
            c1009a.f3436a = 6;
            c1009a.f3443h = cj.m7339i(obj);
        } else if (obj instanceof Boolean) {
            c1009a.f3436a = 8;
            c1009a.f3444i = ((Boolean) obj).booleanValue();
        } else {
            aj.m7036a("Converting to Value from unknown object type: " + (obj == null ? "null" : obj.getClass().toString()));
            return f4838i;
        }
        c1009a.f3447l = z;
        return c1009a;
    }

    public static Object m7333e(C1009a c1009a) {
        int i = 0;
        if (c1009a == null) {
            return f4830a;
        }
        C1009a[] c1009aArr;
        int length;
        switch (c1009a.f3436a) {
            case 1:
                return c1009a.f3437b;
            case 2:
                ArrayList arrayList = new ArrayList(c1009a.f3438c.length);
                c1009aArr = c1009a.f3438c;
                length = c1009aArr.length;
                while (i < length) {
                    Object e = cj.m7333e(c1009aArr[i]);
                    if (e == f4830a) {
                        return f4830a;
                    }
                    arrayList.add(e);
                    i++;
                }
                return arrayList;
            case 3:
                if (c1009a.f3439d.length != c1009a.f3440e.length) {
                    aj.m7036a("Converting an invalid value to object: " + c1009a.toString());
                    return f4830a;
                }
                Map hashMap = new HashMap(c1009a.f3440e.length);
                while (i < c1009a.f3439d.length) {
                    Object e2 = cj.m7333e(c1009a.f3439d[i]);
                    Object e3 = cj.m7333e(c1009a.f3440e[i]);
                    if (e2 == f4830a || e3 == f4830a) {
                        return f4830a;
                    }
                    hashMap.put(e2, e3);
                    i++;
                }
                return hashMap;
            case 4:
                aj.m7036a("Trying to convert a macro reference to object");
                return f4830a;
            case 5:
                aj.m7036a("Trying to convert a function id to object");
                return f4830a;
            case 6:
                return Long.valueOf(c1009a.f3443h);
            case 7:
                StringBuffer stringBuffer = new StringBuffer();
                c1009aArr = c1009a.f3445j;
                length = c1009aArr.length;
                while (i < length) {
                    String a = cj.m7319a(c1009aArr[i]);
                    if (a == f4834e) {
                        return f4830a;
                    }
                    stringBuffer.append(a);
                    i++;
                }
                return stringBuffer.toString();
            case 8:
                return Boolean.valueOf(c1009a.f3444i);
            default:
                aj.m7036a("Failed to convert a value of type: " + c1009a.f3436a);
                return f4830a;
        }
    }

    public static String m7334e() {
        return f4834e;
    }

    public static C1009a m7335f() {
        return f4838i;
    }

    private static boolean m7336f(Object obj) {
        return (obj instanceof Double) || (obj instanceof Float) || ((obj instanceof ci) && ((ci) obj).m7312a());
    }

    private static double m7337g(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        aj.m7036a("getDouble received non-Number");
        return 0.0d;
    }

    private static boolean m7338h(Object obj) {
        return (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || ((obj instanceof ci) && ((ci) obj).m7313b());
    }

    private static long m7339i(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        aj.m7036a("getInt64 received non-Number");
        return 0;
    }
}
