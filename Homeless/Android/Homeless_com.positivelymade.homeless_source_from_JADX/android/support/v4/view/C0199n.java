package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.ViewGroup.MarginLayoutParams;

public class C0199n {
    static final C0196a f416a;

    interface C0196a {
        int mo148a(MarginLayoutParams marginLayoutParams);

        int mo149b(MarginLayoutParams marginLayoutParams);
    }

    static class C0197b implements C0196a {
        C0197b() {
        }

        public int mo148a(MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.leftMargin;
        }

        public int mo149b(MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.rightMargin;
        }
    }

    static class C0198c implements C0196a {
        C0198c() {
        }

        public int mo148a(MarginLayoutParams marginLayoutParams) {
            return C0200o.m943a(marginLayoutParams);
        }

        public int mo149b(MarginLayoutParams marginLayoutParams) {
            return C0200o.m944b(marginLayoutParams);
        }
    }

    static {
        if (VERSION.SDK_INT >= 17) {
            f416a = new C0198c();
        } else {
            f416a = new C0197b();
        }
    }

    public static int m941a(MarginLayoutParams marginLayoutParams) {
        return f416a.mo148a(marginLayoutParams);
    }

    public static int m942b(MarginLayoutParams marginLayoutParams) {
        return f416a.mo149b(marginLayoutParams);
    }
}
