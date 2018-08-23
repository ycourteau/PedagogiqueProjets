package com.google.android.gms.p032d;

import com.google.android.gms.p028c.C0914e;
import com.google.android.gms.p028c.C1010h.C1009a;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class af extends C1546o {
    private static final String f4652a = C0914e.LANGUAGE.toString();

    public af() {
        super(f4652a, new String[0]);
    }

    public C1009a mo972a(Map<String, C1009a> map) {
        Locale locale = Locale.getDefault();
        if (locale == null) {
            return cj.m7335f();
        }
        String language = locale.getLanguage();
        return language == null ? cj.m7335f() : cj.m7332e(language.toLowerCase());
    }

    public boolean mo973a() {
        return false;
    }

    public /* bridge */ /* synthetic */ String mo976b() {
        return super.mo976b();
    }

    public /* bridge */ /* synthetic */ Set mo977c() {
        return super.mo977c();
    }
}
