package com.google.android.gms.p032d;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

public class ab {
    static Map<String, String> f4635a = new HashMap();
    private static String f4636b;

    public static String m7005a(Context context, String str) {
        if (f4636b == null) {
            synchronized (ab.class) {
                if (f4636b == null) {
                    SharedPreferences sharedPreferences = context.getSharedPreferences("gtm_install_referrer", 0);
                    if (sharedPreferences != null) {
                        f4636b = sharedPreferences.getString("referrer", "");
                    } else {
                        f4636b = "";
                    }
                }
            }
        }
        return ab.m7007a(f4636b, str);
    }

    public static String m7006a(Context context, String str, String str2) {
        String str3 = (String) f4635a.get(str);
        if (str3 == null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("gtm_click_referrers", 0);
            str3 = sharedPreferences != null ? sharedPreferences.getString(str, "") : "";
            f4635a.put(str, str3);
        }
        return ab.m7007a(str3, str2);
    }

    public static String m7007a(String str, String str2) {
        return str2 == null ? str.length() > 0 ? str : null : Uri.parse("http://hostname/?" + str).getQueryParameter(str2);
    }

    public static void m7008b(Context context, String str) {
        String a = ab.m7007a(str, "conv");
        if (a != null && a.length() > 0) {
            f4635a.put(a, str);
            by.m7240a(context, "gtm_click_referrers", a, str);
        }
    }
}
