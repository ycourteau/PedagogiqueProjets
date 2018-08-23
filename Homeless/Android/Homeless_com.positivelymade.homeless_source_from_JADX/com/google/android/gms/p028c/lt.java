package com.google.android.gms.p028c;

import com.google.android.gms.p028c.aa.C0805a;
import java.util.Map;
import org.apache.http.impl.cookie.DateParseException;
import org.apache.http.impl.cookie.DateUtils;

public class lt {
    public static long m5811a(String str) {
        try {
            return DateUtils.parseDate(str).getTime();
        } catch (DateParseException e) {
            return 0;
        }
    }

    public static C0805a m5812a(gu guVar) {
        Object obj;
        long j;
        Object obj2;
        long currentTimeMillis = System.currentTimeMillis();
        Map map = guVar.f3418c;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        String str = (String) map.get("Date");
        if (str != null) {
            j2 = lt.m5811a(str);
        }
        str = (String) map.get("Cache-Control");
        if (str != null) {
            String[] split = str.split(",");
            obj = null;
            j = 0;
            j4 = 0;
            for (String trim : split) {
                String trim2 = trim2.trim();
                if (trim2.equals("no-cache") || trim2.equals("no-store")) {
                    return null;
                }
                if (trim2.startsWith("max-age=")) {
                    try {
                        j4 = Long.parseLong(trim2.substring(8));
                    } catch (Exception e) {
                    }
                } else if (trim2.startsWith("stale-while-revalidate=")) {
                    try {
                        j = Long.parseLong(trim2.substring(23));
                    } catch (Exception e2) {
                    }
                } else if (trim2.equals("must-revalidate") || trim2.equals("proxy-revalidate")) {
                    obj = 1;
                }
            }
            j3 = j4;
            j4 = j;
            obj2 = 1;
        } else {
            obj = null;
            obj2 = null;
        }
        str = (String) map.get("Expires");
        long a = str != null ? lt.m5811a(str) : 0;
        str = (String) map.get("Last-Modified");
        long a2 = str != null ? lt.m5811a(str) : 0;
        str = (String) map.get("ETag");
        if (obj2 != null) {
            j3 = currentTimeMillis + (1000 * j3);
            j = obj != null ? j3 : (1000 * j4) + j3;
        } else if (j2 <= 0 || a < j2) {
            j = 0;
            j3 = 0;
        } else {
            j = (a - j2) + currentTimeMillis;
            j3 = j;
        }
        C0805a c0805a = new C0805a();
        c0805a.f2353a = guVar.f3417b;
        c0805a.f2354b = str;
        c0805a.f2358f = j3;
        c0805a.f2357e = j;
        c0805a.f2355c = j2;
        c0805a.f2356d = a2;
        c0805a.f2359g = map;
        return c0805a;
    }

    public static String m5813a(Map<String, String> map) {
        return lt.m5814a(map, "ISO-8859-1");
    }

    public static String m5814a(Map<String, String> map, String str) {
        String str2 = (String) map.get("Content-Type");
        if (str2 == null) {
            return str;
        }
        String[] split = str2.split(";");
        for (int i = 1; i < split.length; i++) {
            String[] split2 = split[i].trim().split("=");
            if (split2.length == 2 && split2[0].equals("charset")) {
                return split2[1];
            }
        }
        return str;
    }
}
