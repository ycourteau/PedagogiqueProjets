package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.support.v4.p000a.C0000a;
import android.support.v4.p001b.C0067a;
import android.support.v4.p001b.p002a.C0056a;
import android.support.v4.p007f.C0091e;
import android.support.v7.p010b.C0275a.C0266a;
import android.support.v7.p010b.C0275a.C0269d;
import android.util.SparseArray;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public final class C0376p {
    public static final boolean f979a = (VERSION.SDK_INT < 21);
    private static final Mode f980b = Mode.SRC_IN;
    private static final WeakHashMap<Context, C0376p> f981c = new WeakHashMap();
    private static final C0375a f982d = new C0375a(6);
    private static final int[] f983e = new int[]{C0269d.abc_textfield_search_default_mtrl_alpha, C0269d.abc_textfield_default_mtrl_alpha, C0269d.abc_ab_share_pack_mtrl_alpha};
    private static final int[] f984f = new int[]{C0269d.abc_ic_ab_back_mtrl_am_alpha, C0269d.abc_ic_go_search_api_mtrl_alpha, C0269d.abc_ic_search_api_mtrl_alpha, C0269d.abc_ic_commit_search_api_mtrl_alpha, C0269d.abc_ic_clear_mtrl_alpha, C0269d.abc_ic_menu_share_mtrl_alpha, C0269d.abc_ic_menu_copy_mtrl_am_alpha, C0269d.abc_ic_menu_cut_mtrl_alpha, C0269d.abc_ic_menu_selectall_mtrl_alpha, C0269d.abc_ic_menu_paste_mtrl_am_alpha, C0269d.abc_ic_menu_moreoverflow_mtrl_alpha, C0269d.abc_ic_voice_search_api_mtrl_alpha};
    private static final int[] f985g = new int[]{C0269d.abc_textfield_activated_mtrl_alpha, C0269d.abc_textfield_search_activated_mtrl_alpha, C0269d.abc_cab_background_top_mtrl_alpha, C0269d.abc_text_cursor_mtrl_alpha};
    private static final int[] f986h = new int[]{C0269d.abc_popup_background_mtrl_mult, C0269d.abc_cab_background_internal_bg, C0269d.abc_menu_hardkey_panel_mtrl_mult};
    private static final int[] f987i = new int[]{C0269d.abc_edit_text_material, C0269d.abc_tab_indicator_material, C0269d.abc_textfield_search_material, C0269d.abc_spinner_mtrl_am_alpha, C0269d.abc_spinner_textfield_background_material, C0269d.abc_ratingbar_full_material, C0269d.abc_switch_track_mtrl_alpha, C0269d.abc_switch_thumb_material, C0269d.abc_btn_default_mtrl_shape, C0269d.abc_btn_borderless_material};
    private static final int[] f988j = new int[]{C0269d.abc_btn_check_material, C0269d.abc_btn_radio_material};
    private final WeakReference<Context> f989k;
    private SparseArray<ColorStateList> f990l;
    private ColorStateList f991m;

    private static class C0375a extends C0091e<Integer, PorterDuffColorFilter> {
        public C0375a(int i) {
            super(i);
        }

        private static int m1702b(int i, Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter m1703a(int i, Mode mode) {
            return (PorterDuffColorFilter) m477a((Object) Integer.valueOf(C0375a.m1702b(i, mode)));
        }

        PorterDuffColorFilter m1704a(int i, Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) m478a(Integer.valueOf(C0375a.m1702b(i, mode)), porterDuffColorFilter);
        }
    }

    private C0376p(Context context) {
        this.f989k = new WeakReference(context);
    }

    public static Drawable m1705a(Context context, int i) {
        return C0376p.m1713d(i) ? C0376p.m1706a(context).m1718a(i) : C0000a.m0a(context, i);
    }

    public static C0376p m1706a(Context context) {
        C0376p c0376p = (C0376p) f981c.get(context);
        if (c0376p != null) {
            return c0376p;
        }
        c0376p = new C0376p(context);
        f981c.put(context, c0376p);
        return c0376p;
    }

    private static void m1707a(Drawable drawable, int i, Mode mode) {
        if (mode == null) {
            mode = f980b;
        }
        ColorFilter a = f982d.m1703a(i, mode);
        if (a == null) {
            a = new PorterDuffColorFilter(i, mode);
            f982d.m1704a(i, mode, a);
        }
        drawable.setColorFilter(a);
    }

    public static void m1708a(View view, C0374o c0374o) {
        Drawable background = view.getBackground();
        if (c0374o.f978d) {
            C0376p.m1707a(background, c0374o.f975a.getColorForState(view.getDrawableState(), c0374o.f975a.getDefaultColor()), c0374o.f977c ? c0374o.f976b : null);
        } else {
            background.clearColorFilter();
        }
        if (VERSION.SDK_INT <= 10) {
            view.invalidate();
        }
    }

    private static boolean m1709a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    private ColorStateList m1710b(Context context) {
        if (this.f991m == null) {
            int a = C0371m.m1696a(context, C0266a.colorControlNormal);
            int a2 = C0371m.m1696a(context, C0266a.colorControlActivated);
            r2 = new int[7][];
            int[] iArr = new int[]{C0371m.f963a, C0371m.m1700c(context, C0266a.colorControlNormal), C0371m.f964b, a2, C0371m.f965c, a2, C0371m.f966d};
            iArr[3] = a2;
            r2[4] = C0371m.f967e;
            iArr[4] = a2;
            r2[5] = C0371m.f968f;
            iArr[5] = a2;
            r2[6] = C0371m.f970h;
            iArr[6] = a;
            this.f991m = new ColorStateList(r2, iArr);
        }
        return this.f991m;
    }

    private ColorStateList m1711c(Context context) {
        r0 = new int[3][];
        int[] iArr = new int[]{C0371m.f963a, C0371m.m1700c(context, C0266a.colorControlNormal), C0371m.f967e};
        iArr[1] = C0371m.m1696a(context, C0266a.colorControlActivated);
        r0[2] = C0371m.f970h;
        iArr[2] = C0371m.m1696a(context, C0266a.colorControlNormal);
        return new ColorStateList(r0, iArr);
    }

    private ColorStateList m1712d(Context context) {
        r0 = new int[3][];
        int[] iArr = new int[]{C0371m.f963a, C0371m.m1697a(context, 16842800, 0.1f), C0371m.f967e};
        iArr[1] = C0371m.m1697a(context, C0266a.colorControlActivated, 0.3f);
        r0[2] = C0371m.f970h;
        iArr[2] = C0371m.m1697a(context, 16842800, 0.3f);
        return new ColorStateList(r0, iArr);
    }

    private static boolean m1713d(int i) {
        return C0376p.m1709a(f984f, i) || C0376p.m1709a(f983e, i) || C0376p.m1709a(f985g, i) || C0376p.m1709a(f987i, i) || C0376p.m1709a(f986h, i) || C0376p.m1709a(f988j, i) || i == C0269d.abc_cab_background_top_material;
    }

    private ColorStateList m1714e(Context context) {
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList b = C0371m.m1699b(context, C0266a.colorSwitchThumbNormal);
        if (b == null || !b.isStateful()) {
            iArr[0] = C0371m.f963a;
            iArr2[0] = C0371m.m1700c(context, C0266a.colorSwitchThumbNormal);
            iArr[1] = C0371m.f967e;
            iArr2[1] = C0371m.m1696a(context, C0266a.colorControlActivated);
            iArr[2] = C0371m.f970h;
            iArr2[2] = C0371m.m1696a(context, C0266a.colorSwitchThumbNormal);
        } else {
            iArr[0] = C0371m.f963a;
            iArr2[0] = b.getColorForState(iArr[0], 0);
            iArr[1] = C0371m.f967e;
            iArr2[1] = C0371m.m1696a(context, C0266a.colorControlActivated);
            iArr[2] = C0371m.f970h;
            iArr2[2] = b.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    private ColorStateList m1715f(Context context) {
        r0 = new int[3][];
        int[] iArr = new int[]{C0371m.f963a, C0371m.m1700c(context, C0266a.colorControlNormal), C0371m.f969g};
        iArr[1] = C0371m.m1696a(context, C0266a.colorControlNormal);
        r0[2] = C0371m.f970h;
        iArr[2] = C0371m.m1696a(context, C0266a.colorControlActivated);
        return new ColorStateList(r0, iArr);
    }

    private ColorStateList m1716g(Context context) {
        r0 = new int[4][];
        r1 = new int[4];
        int a = C0371m.m1696a(context, C0266a.colorButtonNormal);
        int a2 = C0371m.m1696a(context, C0266a.colorControlHighlight);
        r0[0] = C0371m.f963a;
        r1[0] = C0371m.m1700c(context, C0266a.colorButtonNormal);
        r0[1] = C0371m.f966d;
        r1[1] = C0067a.m405a(a2, a);
        r0[2] = C0371m.f964b;
        r1[2] = C0067a.m405a(a2, a);
        r0[3] = C0371m.f970h;
        r1[3] = a;
        return new ColorStateList(r0, r1);
    }

    private ColorStateList m1717h(Context context) {
        r0 = new int[3][];
        int[] iArr = new int[]{C0371m.f963a, C0371m.m1700c(context, C0266a.colorControlNormal), C0371m.f969g};
        iArr[1] = C0371m.m1696a(context, C0266a.colorControlNormal);
        r0[2] = C0371m.f970h;
        iArr[2] = C0371m.m1696a(context, C0266a.colorControlActivated);
        return new ColorStateList(r0, iArr);
    }

    public Drawable m1718a(int i) {
        return m1719a(i, false);
    }

    public Drawable m1719a(int i, boolean z) {
        Context context = (Context) this.f989k.get();
        if (context == null) {
            return null;
        }
        Drawable a = C0000a.m0a(context, i);
        if (a != null) {
            if (VERSION.SDK_INT >= 8) {
                a = a.mutate();
            }
            ColorStateList c = m1722c(i);
            if (c != null) {
                a = C0056a.m386c(a);
                C0056a.m382a(a, c);
                Mode b = m1721b(i);
                if (b != null) {
                    C0056a.m383a(a, b);
                }
            } else if (i == C0269d.abc_cab_background_top_material) {
                return new LayerDrawable(new Drawable[]{m1718a(C0269d.abc_cab_background_internal_bg), m1718a(C0269d.abc_cab_background_top_mtrl_alpha)});
            } else if (!m1720a(i, a) && z) {
                a = null;
            }
        }
        return a;
    }

    public final boolean m1720a(int i, Drawable drawable) {
        Context context = (Context) this.f989k.get();
        if (context == null) {
            return false;
        }
        int i2;
        Mode mode;
        Object obj;
        int i3;
        if (C0376p.m1709a(f983e, i)) {
            i2 = C0266a.colorControlNormal;
            mode = null;
            obj = 1;
            i3 = -1;
        } else if (C0376p.m1709a(f985g, i)) {
            i2 = C0266a.colorControlActivated;
            mode = null;
            r6 = 1;
            i3 = -1;
        } else if (C0376p.m1709a(f986h, i)) {
            r6 = 1;
            mode = Mode.MULTIPLY;
            i2 = 16842801;
            i3 = -1;
        } else if (i == C0269d.abc_list_divider_mtrl_alpha) {
            i2 = 16842800;
            i3 = Math.round(40.8f);
            mode = null;
            r6 = 1;
        } else {
            i3 = -1;
            i2 = 0;
            mode = null;
            obj = null;
        }
        if (obj == null) {
            return false;
        }
        C0376p.m1707a(drawable, C0371m.m1696a(context, i2), mode);
        if (i3 != -1) {
            drawable.setAlpha(i3);
        }
        return true;
    }

    final Mode m1721b(int i) {
        return i == C0269d.abc_switch_thumb_material ? Mode.MULTIPLY : null;
    }

    public final ColorStateList m1722c(int i) {
        ColorStateList colorStateList = null;
        Context context = (Context) this.f989k.get();
        if (context == null) {
            return null;
        }
        if (this.f990l != null) {
            colorStateList = (ColorStateList) this.f990l.get(i);
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ColorStateList f = i == C0269d.abc_edit_text_material ? m1715f(context) : i == C0269d.abc_switch_track_mtrl_alpha ? m1712d(context) : i == C0269d.abc_switch_thumb_material ? m1714e(context) : (i == C0269d.abc_btn_default_mtrl_shape || i == C0269d.abc_btn_borderless_material) ? m1716g(context) : (i == C0269d.abc_spinner_mtrl_am_alpha || i == C0269d.abc_spinner_textfield_background_material) ? m1717h(context) : C0376p.m1709a(f984f, i) ? C0371m.m1699b(context, C0266a.colorControlNormal) : C0376p.m1709a(f987i, i) ? m1710b(context) : C0376p.m1709a(f988j, i) ? m1711c(context) : colorStateList;
        if (f == null) {
            return f;
        }
        if (this.f990l == null) {
            this.f990l = new SparseArray();
        }
        this.f990l.append(i, f);
        return f;
    }
}
