package android.support.v4.view.p008a;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v7.p010b.C0275a.C0274i;

public class C0128a {
    private static final C0120d f375a;
    private final Object f376b;

    interface C0120d {
        int mo96a(Object obj);

        void mo97a(Object obj, int i);

        void mo98a(Object obj, Rect rect);

        void mo99a(Object obj, CharSequence charSequence);

        void mo100a(Object obj, boolean z);

        CharSequence mo101b(Object obj);

        void mo102b(Object obj, Rect rect);

        CharSequence mo103c(Object obj);

        CharSequence mo104d(Object obj);

        CharSequence mo105e(Object obj);

        boolean mo106f(Object obj);

        boolean mo107g(Object obj);

        boolean mo108h(Object obj);

        boolean mo109i(Object obj);

        boolean mo110j(Object obj);

        boolean mo111k(Object obj);

        boolean mo112l(Object obj);

        boolean mo113m(Object obj);

        boolean mo114n(Object obj);

        boolean mo115o(Object obj);

        String mo116p(Object obj);
    }

    static class C0121h implements C0120d {
        C0121h() {
        }

        public int mo96a(Object obj) {
            return 0;
        }

        public void mo97a(Object obj, int i) {
        }

        public void mo98a(Object obj, Rect rect) {
        }

        public void mo99a(Object obj, CharSequence charSequence) {
        }

        public void mo100a(Object obj, boolean z) {
        }

        public CharSequence mo101b(Object obj) {
            return null;
        }

        public void mo102b(Object obj, Rect rect) {
        }

        public CharSequence mo103c(Object obj) {
            return null;
        }

        public CharSequence mo104d(Object obj) {
            return null;
        }

        public CharSequence mo105e(Object obj) {
            return null;
        }

        public boolean mo106f(Object obj) {
            return false;
        }

        public boolean mo107g(Object obj) {
            return false;
        }

        public boolean mo108h(Object obj) {
            return false;
        }

        public boolean mo109i(Object obj) {
            return false;
        }

        public boolean mo110j(Object obj) {
            return false;
        }

        public boolean mo111k(Object obj) {
            return false;
        }

        public boolean mo112l(Object obj) {
            return false;
        }

        public boolean mo113m(Object obj) {
            return false;
        }

        public boolean mo114n(Object obj) {
            return false;
        }

        public boolean mo115o(Object obj) {
            return false;
        }

        public String mo116p(Object obj) {
            return null;
        }
    }

    static class C0122c extends C0121h {
        C0122c() {
        }

        public int mo96a(Object obj) {
            return C0129b.m717a(obj);
        }

        public void mo97a(Object obj, int i) {
            C0129b.m718a(obj, i);
        }

        public void mo98a(Object obj, Rect rect) {
            C0129b.m719a(obj, rect);
        }

        public void mo99a(Object obj, CharSequence charSequence) {
            C0129b.m720a(obj, charSequence);
        }

        public void mo100a(Object obj, boolean z) {
            C0129b.m721a(obj, z);
        }

        public CharSequence mo101b(Object obj) {
            return C0129b.m722b(obj);
        }

        public void mo102b(Object obj, Rect rect) {
            C0129b.m723b(obj, rect);
        }

        public CharSequence mo103c(Object obj) {
            return C0129b.m724c(obj);
        }

        public CharSequence mo104d(Object obj) {
            return C0129b.m725d(obj);
        }

        public CharSequence mo105e(Object obj) {
            return C0129b.m726e(obj);
        }

        public boolean mo106f(Object obj) {
            return C0129b.m727f(obj);
        }

        public boolean mo107g(Object obj) {
            return C0129b.m728g(obj);
        }

        public boolean mo108h(Object obj) {
            return C0129b.m729h(obj);
        }

        public boolean mo109i(Object obj) {
            return C0129b.m730i(obj);
        }

        public boolean mo110j(Object obj) {
            return C0129b.m731j(obj);
        }

        public boolean mo111k(Object obj) {
            return C0129b.m732k(obj);
        }

        public boolean mo112l(Object obj) {
            return C0129b.m733l(obj);
        }

        public boolean mo113m(Object obj) {
            return C0129b.m734m(obj);
        }

        public boolean mo114n(Object obj) {
            return C0129b.m735n(obj);
        }

        public boolean mo115o(Object obj) {
            return C0129b.m736o(obj);
        }
    }

    static class C0123e extends C0122c {
        C0123e() {
        }
    }

    static class C0124f extends C0123e {
        C0124f() {
        }

        public String mo116p(Object obj) {
            return C0130c.m737a(obj);
        }
    }

    static class C0125g extends C0124f {
        C0125g() {
        }
    }

    static class C0126a extends C0125g {
        C0126a() {
        }
    }

    static class C0127b extends C0126a {
        C0127b() {
        }
    }

    static {
        if (VERSION.SDK_INT >= 22) {
            f375a = new C0127b();
        } else if (VERSION.SDK_INT >= 21) {
            f375a = new C0126a();
        } else if (VERSION.SDK_INT >= 19) {
            f375a = new C0125g();
        } else if (VERSION.SDK_INT >= 18) {
            f375a = new C0124f();
        } else if (VERSION.SDK_INT >= 16) {
            f375a = new C0123e();
        } else if (VERSION.SDK_INT >= 14) {
            f375a = new C0122c();
        } else {
            f375a = new C0121h();
        }
    }

    public C0128a(Object obj) {
        this.f376b = obj;
    }

    private static String m694b(int i) {
        switch (i) {
            case 1:
                return "ACTION_FOCUS";
            case 2:
                return "ACTION_CLEAR_FOCUS";
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case C0274i.Theme_actionModeCutDrawable /*32*/:
                return "ACTION_LONG_CLICK";
            case C0274i.Theme_textAppearanceSearchResultTitle /*64*/:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            default:
                return "ACTION_UNKNOWN";
        }
    }

    public Object m695a() {
        return this.f376b;
    }

    public void m696a(int i) {
        f375a.mo97a(this.f376b, i);
    }

    public void m697a(Rect rect) {
        f375a.mo98a(this.f376b, rect);
    }

    public void m698a(CharSequence charSequence) {
        f375a.mo99a(this.f376b, charSequence);
    }

    public void m699a(boolean z) {
        f375a.mo100a(this.f376b, z);
    }

    public int m700b() {
        return f375a.mo96a(this.f376b);
    }

    public void m701b(Rect rect) {
        f375a.mo102b(this.f376b, rect);
    }

    public boolean m702c() {
        return f375a.mo106f(this.f376b);
    }

    public boolean m703d() {
        return f375a.mo107g(this.f376b);
    }

    public boolean m704e() {
        return f375a.mo110j(this.f376b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        C0128a c0128a = (C0128a) obj;
        return this.f376b == null ? c0128a.f376b == null : this.f376b.equals(c0128a.f376b);
    }

    public boolean m705f() {
        return f375a.mo111k(this.f376b);
    }

    public boolean m706g() {
        return f375a.mo115o(this.f376b);
    }

    public boolean m707h() {
        return f375a.mo108h(this.f376b);
    }

    public int hashCode() {
        return this.f376b == null ? 0 : this.f376b.hashCode();
    }

    public boolean m708i() {
        return f375a.mo112l(this.f376b);
    }

    public boolean m709j() {
        return f375a.mo109i(this.f376b);
    }

    public boolean m710k() {
        return f375a.mo113m(this.f376b);
    }

    public boolean m711l() {
        return f375a.mo114n(this.f376b);
    }

    public CharSequence m712m() {
        return f375a.mo104d(this.f376b);
    }

    public CharSequence m713n() {
        return f375a.mo101b(this.f376b);
    }

    public CharSequence m714o() {
        return f375a.mo105e(this.f376b);
    }

    public CharSequence m715p() {
        return f375a.mo103c(this.f376b);
    }

    public String m716q() {
        return f375a.mo116p(this.f376b);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        Rect rect = new Rect();
        m697a(rect);
        stringBuilder.append("; boundsInParent: " + rect);
        m701b(rect);
        stringBuilder.append("; boundsInScreen: " + rect);
        stringBuilder.append("; packageName: ").append(m712m());
        stringBuilder.append("; className: ").append(m713n());
        stringBuilder.append("; text: ").append(m714o());
        stringBuilder.append("; contentDescription: ").append(m715p());
        stringBuilder.append("; viewId: ").append(m716q());
        stringBuilder.append("; checkable: ").append(m702c());
        stringBuilder.append("; checked: ").append(m703d());
        stringBuilder.append("; focusable: ").append(m704e());
        stringBuilder.append("; focused: ").append(m705f());
        stringBuilder.append("; selected: ").append(m706g());
        stringBuilder.append("; clickable: ").append(m707h());
        stringBuilder.append("; longClickable: ").append(m708i());
        stringBuilder.append("; enabled: ").append(m709j());
        stringBuilder.append("; password: ").append(m710k());
        stringBuilder.append("; scrollable: " + m711l());
        stringBuilder.append("; [");
        int b = m700b();
        while (b != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(b);
            b &= numberOfTrailingZeros ^ -1;
            stringBuilder.append(C0128a.m694b(numberOfTrailingZeros));
            if (b != 0) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
