package android.support.v4.p006e;

import android.os.Build.VERSION;

public class C0081a {
    private static final C0078a f254a;

    interface C0078a {
        String mo53a(String str);

        String mo54b(String str);
    }

    static class C0079b implements C0078a {
        C0079b() {
        }

        public String mo53a(String str) {
            return null;
        }

        public String mo54b(String str) {
            return str;
        }
    }

    static class C0080c implements C0078a {
        C0080c() {
        }

        public String mo53a(String str) {
            return C0082b.m426a(str);
        }

        public String mo54b(String str) {
            return C0082b.m427b(str);
        }
    }

    static {
        if (VERSION.SDK_INT >= 14) {
            f254a = new C0080c();
        } else {
            f254a = new C0079b();
        }
    }

    public static String m424a(String str) {
        return f254a.mo53a(str);
    }

    public static String m425b(String str) {
        return f254a.mo54b(str);
    }
}
