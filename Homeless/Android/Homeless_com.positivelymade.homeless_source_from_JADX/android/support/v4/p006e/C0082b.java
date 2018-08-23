package android.support.v4.p006e;

import android.util.Log;
import java.lang.reflect.Method;

class C0082b {
    private static Method f255a;
    private static Method f256b;

    static {
        try {
            Class cls = Class.forName("libcore.icu.ICU");
            if (cls != null) {
                f255a = cls.getMethod("getScript", new Class[]{String.class});
                f256b = cls.getMethod("addLikelySubtags", new Class[]{String.class});
            }
        } catch (Throwable e) {
            Log.w("ICUCompatIcs", e);
        }
    }

    public static String m426a(String str) {
        try {
            if (f255a != null) {
                return (String) f255a.invoke(null, new Object[]{str});
            }
        } catch (Throwable e) {
            Log.w("ICUCompatIcs", e);
        } catch (Throwable e2) {
            Log.w("ICUCompatIcs", e2);
        }
        return null;
    }

    public static String m427b(String str) {
        try {
            if (f256b != null) {
                return (String) f256b.invoke(null, new Object[]{str});
            }
        } catch (Throwable e) {
            Log.w("ICUCompatIcs", e);
        } catch (Throwable e2) {
            Log.w("ICUCompatIcs", e2);
        }
        return str;
    }
}
