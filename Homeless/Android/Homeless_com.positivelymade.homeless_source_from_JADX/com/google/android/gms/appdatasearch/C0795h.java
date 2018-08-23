package com.google.android.gms.appdatasearch;

import java.util.HashMap;
import java.util.Map;

public class C0795h {
    private static final String[] f2346a = new String[]{"text1", "text2", "icon", "intent_action", "intent_data", "intent_data_id", "intent_extra_data", "suggest_large_icon", "intent_activity"};
    private static final Map<String, Integer> f2347b = new HashMap(f2346a.length);

    static {
        int i = 0;
        while (i < f2346a.length) {
            f2347b.put(f2346a[i], Integer.valueOf(i));
            i++;
        }
    }

    public static String m3745a(int i) {
        return (i < 0 || i >= f2346a.length) ? null : f2346a[i];
    }
}
