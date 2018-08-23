package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.p001b.p002a.C0056a;
import android.support.v4.view.C0174d;
import android.support.v4.view.C0174d.C0172a;
import android.support.v7.internal.p015b.C0280a;
import android.support.v7.internal.view.C0281a;
import android.support.v7.internal.view.menu.ActionMenuItemView;
import android.support.v7.internal.view.menu.ActionMenuItemView.C0289b;
import android.support.v7.internal.view.menu.C0294k;
import android.support.v7.internal.view.menu.C0294k.C0291a;
import android.support.v7.internal.view.menu.C0296j.C0313a;
import android.support.v7.internal.view.menu.C0297b;
import android.support.v7.internal.view.menu.C0301e;
import android.support.v7.internal.view.menu.C0303f;
import android.support.v7.internal.view.menu.C0312i;
import android.support.v7.internal.view.menu.C0316n;
import android.support.v7.internal.widget.TintImageView;
import android.support.v7.p010b.C0275a.C0266a;
import android.support.v7.p010b.C0275a.C0271f;
import android.support.v7.p010b.C0275a.C0272g;
import android.support.v7.widget.ActionMenuView.C0292a;
import android.support.v7.widget.C0339e.C0287b;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;

public class C0407a extends C0297b implements C0172a {
    final C0406f f1144g = new C0406f();
    int f1145h;
    private View f1146i;
    private boolean f1147j;
    private boolean f1148k;
    private int f1149l;
    private int f1150m;
    private int f1151n;
    private boolean f1152o;
    private boolean f1153p;
    private boolean f1154q;
    private boolean f1155r;
    private int f1156s;
    private final SparseBooleanArray f1157t = new SparseBooleanArray();
    private View f1158u;
    private C0405e f1159v;
    private C0400a f1160w;
    private C0402c f1161x;
    private C0401b f1162y;

    private class C0400a extends C0312i {
        final /* synthetic */ C0407a f1133c;
        private C0316n f1134d;

        public C0400a(C0407a c0407a, Context context, C0316n c0316n) {
            boolean z = false;
            this.f1133c = c0407a;
            super(context, c0316n, null, false, C0266a.actionOverflowMenuStyle);
            this.f1134d = c0316n;
            if (!((C0303f) c0316n.getItem()).m1407j()) {
                m1440a(c0407a.f1146i == null ? (View) c0407a.f : c0407a.f1146i);
            }
            m1439a(c0407a.f1144g);
            int size = c0316n.size();
            for (int i = 0; i < size; i++) {
                MenuItem item = c0316n.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
            }
            m1441a(z);
        }

        public void onDismiss() {
            super.onDismiss();
            this.f1133c.f1160w = null;
            this.f1133c.f1145h = 0;
        }
    }

    private class C0401b extends C0289b {
        final /* synthetic */ C0407a f1135a;

        private C0401b(C0407a c0407a) {
            this.f1135a = c0407a;
        }

        public C0339e mo309a() {
            return this.f1135a.f1160w != null ? this.f1135a.f1160w.m1447c() : null;
        }
    }

    private class C0402c implements Runnable {
        final /* synthetic */ C0407a f1136a;
        private C0405e f1137b;

        public C0402c(C0407a c0407a, C0405e c0405e) {
            this.f1136a = c0407a;
            this.f1137b = c0405e;
        }

        public void run() {
            this.f1136a.c.m1373e();
            View view = (View) this.f1136a.f;
            if (!(view == null || view.getWindowToken() == null || !this.f1137b.m1448d())) {
                this.f1136a.f1159v = this.f1137b;
            }
            this.f1136a.f1161x = null;
        }
    }

    private class C0404d extends TintImageView implements C0292a {
        final /* synthetic */ C0407a f1140a;
        private final float[] f1141b = new float[2];

        public C0404d(final C0407a c0407a, Context context) {
            this.f1140a = c0407a;
            super(context, null, C0266a.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            setOnTouchListener(new C0287b(this, this) {
                final /* synthetic */ C0404d f1139b;

                public C0339e mo203a() {
                    return this.f1139b.f1140a.f1159v == null ? null : this.f1139b.f1140a.f1159v.m1447c();
                }

                public boolean mo204b() {
                    this.f1139b.f1140a.m1909c();
                    return true;
                }

                public boolean mo310c() {
                    if (this.f1139b.f1140a.f1161x != null) {
                        return false;
                    }
                    this.f1139b.f1140a.m1911d();
                    return true;
                }
            });
        }

        public boolean mo207c() {
            return false;
        }

        public boolean mo208d() {
            return false;
        }

        public boolean performClick() {
            if (!super.performClick()) {
                playSoundEffect(0);
                this.f1140a.m1909c();
            }
            return true;
        }

        protected boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                width = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                height = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C0056a.m381a(background, width - max, height - max, width + max, height + max);
            }
            return frame;
        }
    }

    private class C0405e extends C0312i {
        final /* synthetic */ C0407a f1142c;

        public C0405e(C0407a c0407a, Context context, C0301e c0301e, View view, boolean z) {
            this.f1142c = c0407a;
            super(context, c0301e, view, z, C0266a.actionOverflowMenuStyle);
            m1436a(8388613);
            m1439a(c0407a.f1144g);
        }

        public void onDismiss() {
            super.onDismiss();
            this.f1142c.c.close();
            this.f1142c.f1159v = null;
        }
    }

    private class C0406f implements C0313a {
        final /* synthetic */ C0407a f1143a;

        private C0406f(C0407a c0407a) {
            this.f1143a = c0407a;
        }

        public void mo295a(C0301e c0301e, boolean z) {
            if (c0301e instanceof C0316n) {
                ((C0316n) c0301e).mo250l().m1360a(false);
            }
            C0313a a = this.f1143a.m1317a();
            if (a != null) {
                a.mo295a(c0301e, z);
            }
        }

        public boolean mo296a(C0301e c0301e) {
            if (c0301e == null) {
                return false;
            }
            this.f1143a.f1145h = ((C0316n) c0301e).getItem().getItemId();
            C0313a a = this.f1143a.m1317a();
            return a != null ? a.mo296a(c0301e) : false;
        }
    }

    public C0407a(Context context) {
        super(context, C0272g.abc_action_menu_layout, C0272g.abc_action_menu_item_layout);
    }

    private View m1885a(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof C0291a) && ((C0291a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public C0294k mo311a(ViewGroup viewGroup) {
        C0294k a = super.mo311a(viewGroup);
        ((ActionMenuView) a).setPresenter(this);
        return a;
    }

    public View mo312a(C0303f c0303f, View view, ViewGroup viewGroup) {
        View actionView = c0303f.getActionView();
        if (actionView == null || c0303f.m1411n()) {
            actionView = super.mo312a(c0303f, view, viewGroup);
        }
        actionView.setVisibility(c0303f.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.m1781a(layoutParams));
        }
        return actionView;
    }

    public void m1895a(int i) {
        this.f1151n = i;
        this.f1152o = true;
    }

    public void m1896a(int i, boolean z) {
        this.f1149l = i;
        this.f1153p = z;
        this.f1154q = true;
    }

    public void mo223a(Context context, C0301e c0301e) {
        super.mo223a(context, c0301e);
        Resources resources = context.getResources();
        C0281a a = C0281a.m1230a(context);
        if (!this.f1148k) {
            this.f1147j = a.m1232b();
        }
        if (!this.f1154q) {
            this.f1149l = a.m1233c();
        }
        if (!this.f1152o) {
            this.f1151n = a.m1231a();
        }
        int i = this.f1149l;
        if (this.f1147j) {
            if (this.f1146i == null) {
                this.f1146i = new C0404d(this, this.a);
                int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
                this.f1146i.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f1146i.getMeasuredWidth();
        } else {
            this.f1146i = null;
        }
        this.f1150m = i;
        this.f1156s = (int) (56.0f * resources.getDisplayMetrics().density);
        this.f1158u = null;
    }

    public void m1898a(Configuration configuration) {
        if (!this.f1152o) {
            this.f1151n = this.b.getResources().getInteger(C0271f.abc_max_action_buttons);
        }
        if (this.c != null) {
            this.c.m1367b(true);
        }
    }

    public void mo224a(C0301e c0301e, boolean z) {
        m1912e();
        super.mo224a(c0301e, z);
    }

    public void mo313a(C0303f c0303f, C0291a c0291a) {
        c0291a.mo205a(c0303f, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) c0291a;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f);
        if (this.f1162y == null) {
            this.f1162y = new C0401b();
        }
        actionMenuItemView.setPopupCallback(this.f1162y);
    }

    public void m1901a(ActionMenuView actionMenuView) {
        this.f = actionMenuView;
        actionMenuView.mo210a(this.c);
    }

    public void mo314a(boolean z) {
        if (z) {
            super.mo226a(null);
        } else {
            this.c.m1360a(false);
        }
    }

    public boolean mo315a(int i, C0303f c0303f) {
        return c0303f.m1407j();
    }

    public boolean mo226a(C0316n c0316n) {
        if (!c0316n.hasVisibleItems()) {
            return false;
        }
        C0316n c0316n2 = c0316n;
        while (c0316n2.m1462o() != this.c) {
            c0316n2 = (C0316n) c0316n2.m1462o();
        }
        View a = m1885a(c0316n2.getItem());
        if (a == null) {
            if (this.f1146i == null) {
                return false;
            }
            a = this.f1146i;
        }
        this.f1145h = c0316n.getItem().getItemId();
        this.f1160w = new C0400a(this, this.b, c0316n);
        this.f1160w.m1440a(a);
        this.f1160w.m1435a();
        super.mo226a(c0316n);
        return true;
    }

    public boolean mo316a(ViewGroup viewGroup, int i) {
        return viewGroup.getChildAt(i) == this.f1146i ? false : super.mo316a(viewGroup, i);
    }

    public void mo227b(boolean z) {
        int i;
        int i2 = 1;
        int i3 = 0;
        ViewGroup viewGroup = (ViewGroup) ((View) this.f).getParent();
        if (viewGroup != null) {
            C0280a.m1229a(viewGroup);
        }
        super.mo227b(z);
        ((View) this.f).requestLayout();
        if (this.c != null) {
            ArrayList j = this.c.m1378j();
            int size = j.size();
            for (i = 0; i < size; i++) {
                C0174d a = ((C0303f) j.get(i)).mo214a();
                if (a != null) {
                    a.m899a((C0172a) this);
                }
            }
        }
        ArrayList k = this.c != null ? this.c.m1379k() : null;
        if (this.f1147j && k != null) {
            i = k.size();
            if (i == 1) {
                i3 = !((C0303f) k.get(0)).isActionViewExpanded() ? 1 : 0;
            } else {
                if (i <= 0) {
                    i2 = 0;
                }
                i3 = i2;
            }
        }
        if (i3 != 0) {
            if (this.f1146i == null) {
                this.f1146i = new C0404d(this, this.a);
            }
            viewGroup = (ViewGroup) this.f1146i.getParent();
            if (viewGroup != this.f) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f1146i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f;
                actionMenuView.addView(this.f1146i, actionMenuView.m1786b());
            }
        } else if (this.f1146i != null && this.f1146i.getParent() == this.f) {
            ((ViewGroup) this.f).removeView(this.f1146i);
        }
        ((ActionMenuView) this.f).setOverflowReserved(this.f1147j);
    }

    public boolean mo228b() {
        int i;
        ArrayList h = this.c.m1376h();
        int size = h.size();
        int i2 = this.f1151n;
        int i3 = this.f1150m;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f;
        int i4 = 0;
        int i5 = 0;
        Object obj = null;
        int i6 = 0;
        while (i6 < size) {
            C0303f c0303f = (C0303f) h.get(i6);
            if (c0303f.m1409l()) {
                i4++;
            } else if (c0303f.m1408k()) {
                i5++;
            } else {
                obj = 1;
            }
            i = (this.f1155r && c0303f.isActionViewExpanded()) ? 0 : i2;
            i6++;
            i2 = i;
        }
        if (this.f1147j && (r4 != null || i4 + i5 > i2)) {
            i2--;
        }
        i6 = i2 - i4;
        SparseBooleanArray sparseBooleanArray = this.f1157t;
        sparseBooleanArray.clear();
        i = 0;
        if (this.f1153p) {
            i = i3 / this.f1156s;
            i5 = ((i3 % this.f1156s) / i) + this.f1156s;
        } else {
            i5 = 0;
        }
        int i7 = 0;
        i2 = 0;
        int i8 = i;
        while (i7 < size) {
            c0303f = (C0303f) h.get(i7);
            int i9;
            if (c0303f.m1409l()) {
                View a = mo312a(c0303f, this.f1158u, viewGroup);
                if (this.f1158u == null) {
                    this.f1158u = a;
                }
                if (this.f1153p) {
                    i8 -= ActionMenuView.m1775a(a, i5, i8, makeMeasureSpec, 0);
                } else {
                    a.measure(makeMeasureSpec, makeMeasureSpec);
                }
                i4 = a.getMeasuredWidth();
                i9 = i3 - i4;
                if (i2 != 0) {
                    i4 = i2;
                }
                i2 = c0303f.getGroupId();
                if (i2 != 0) {
                    sparseBooleanArray.put(i2, true);
                }
                c0303f.m1400d(true);
                i = i9;
                i2 = i6;
            } else if (c0303f.m1408k()) {
                boolean z;
                int groupId = c0303f.getGroupId();
                boolean z2 = sparseBooleanArray.get(groupId);
                boolean z3 = (i6 > 0 || z2) && i3 > 0 && (!this.f1153p || i8 > 0);
                if (z3) {
                    View a2 = mo312a(c0303f, this.f1158u, viewGroup);
                    if (this.f1158u == null) {
                        this.f1158u = a2;
                    }
                    boolean z4;
                    if (this.f1153p) {
                        int a3 = ActionMenuView.m1775a(a2, i5, i8, makeMeasureSpec, 0);
                        i9 = i8 - a3;
                        if (a3 == 0) {
                            i8 = 0;
                        } else {
                            z4 = z3;
                        }
                        i4 = i9;
                    } else {
                        a2.measure(makeMeasureSpec, makeMeasureSpec);
                        boolean z5 = z3;
                        i4 = i8;
                        z4 = z5;
                    }
                    i9 = a2.getMeasuredWidth();
                    i3 -= i9;
                    if (i2 == 0) {
                        i2 = i9;
                    }
                    if (this.f1153p) {
                        z = i8 & (i3 >= 0 ? 1 : 0);
                        i9 = i2;
                        i2 = i4;
                    } else {
                        z = i8 & (i3 + i2 > 0 ? 1 : 0);
                        i9 = i2;
                        i2 = i4;
                    }
                } else {
                    z = z3;
                    i9 = i2;
                    i2 = i8;
                }
                if (z && groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                    i8 = i6;
                } else if (z2) {
                    sparseBooleanArray.put(groupId, false);
                    i4 = i6;
                    for (i6 = 0; i6 < i7; i6++) {
                        C0303f c0303f2 = (C0303f) h.get(i6);
                        if (c0303f2.getGroupId() == groupId) {
                            if (c0303f2.m1407j()) {
                                i4++;
                            }
                            c0303f2.m1400d(false);
                        }
                    }
                    i8 = i4;
                } else {
                    i8 = i6;
                }
                if (z) {
                    i8--;
                }
                c0303f.m1400d(z);
                i4 = i9;
                i = i3;
                int i10 = i2;
                i2 = i8;
                i8 = i10;
            } else {
                c0303f.m1400d(false);
                i4 = i2;
                i = i3;
                i2 = i6;
            }
            i7++;
            i3 = i;
            i6 = i2;
            i2 = i4;
        }
        return true;
    }

    public void m1908c(boolean z) {
        this.f1147j = z;
        this.f1148k = true;
    }

    public boolean m1909c() {
        if (!this.f1147j || m1914g() || this.c == null || this.f == null || this.f1161x != null || this.c.m1379k().isEmpty()) {
            return false;
        }
        this.f1161x = new C0402c(this, new C0405e(this, this.b, this.c, this.f1146i, true));
        ((View) this.f).post(this.f1161x);
        super.mo226a(null);
        return true;
    }

    public void m1910d(boolean z) {
        this.f1155r = z;
    }

    public boolean m1911d() {
        if (this.f1161x == null || this.f == null) {
            C0312i c0312i = this.f1159v;
            if (c0312i == null) {
                return false;
            }
            c0312i.m1449e();
            return true;
        }
        ((View) this.f).removeCallbacks(this.f1161x);
        this.f1161x = null;
        return true;
    }

    public boolean m1912e() {
        return m1911d() | m1913f();
    }

    public boolean m1913f() {
        if (this.f1160w == null) {
            return false;
        }
        this.f1160w.m1449e();
        return true;
    }

    public boolean m1914g() {
        return this.f1159v != null && this.f1159v.m1450f();
    }
}
