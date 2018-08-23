package com.google.android.gms.p032d;

import android.content.Context;
import java.net.URLEncoder;

class dj implements C1607v {
    private static dj f4954a;
    private static final Object f4955b = new Object();
    private String f4956c;
    private String f4957d;
    private bh f4958e;
    private C1624w f4959f;

    private dj(Context context) {
        this(C1626x.m7502a(context), new bv());
    }

    dj(C1624w c1624w, bh bhVar) {
        this.f4959f = c1624w;
        this.f4958e = bhVar;
    }

    public static C1607v m7463a(Context context) {
        C1607v c1607v;
        synchronized (f4955b) {
            if (f4954a == null) {
                f4954a = new dj(context);
            }
            c1607v = f4954a;
        }
        return c1607v;
    }

    public boolean mo1041a(String str) {
        if (this.f4958e.mo980a()) {
            if (!(this.f4956c == null || this.f4957d == null)) {
                try {
                    str = this.f4956c + "?" + this.f4957d + "=" + URLEncoder.encode(str, "UTF-8");
                    aj.m7041d("Sending wrapped url hit: " + str);
                } catch (Throwable e) {
                    aj.m7039b("Error wrapping URL for testing.", e);
                    return false;
                }
            }
            this.f4959f.mo1044a(str);
            return true;
        }
        aj.m7038b("Too many urls sent too quickly with the TagManagerSender, rate limiting invoked.");
        return false;
    }
}
