package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.C0216u;
import android.support.v4.view.C0233z;
import android.support.v4.view.ak;
import android.support.v4.view.an;
import android.support.v4.view.ao;
import android.support.v4.widget.C0261j;
import android.support.v7.p010b.C0275a.C0266a;
import android.support.v7.p010b.C0275a.C0270e;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window.Callback;

public class ActionBarOverlayLayout extends ViewGroup {
    static final int[] f752a = new int[]{C0266a.actionBarSize, 16842841};
    private final an f753A;
    private final an f754B;
    private final Runnable f755C;
    private final Runnable f756D;
    private final C0216u f757E;
    private int f758b;
    private int f759c;
    private ContentFrameLayout f760d;
    private ActionBarContainer f761e;
    private ActionBarContainer f762f;
    private C0360g f763g;
    private Drawable f764h;
    private boolean f765i;
    private boolean f766j;
    private boolean f767k;
    private boolean f768l;
    private boolean f769m;
    private int f770n;
    private int f771o;
    private final Rect f772p;
    private final Rect f773q;
    private final Rect f774r;
    private final Rect f775s;
    private final Rect f776t;
    private final Rect f777u;
    private C0326a f778v;
    private final int f779w;
    private C0261j f780x;
    private ak f781y;
    private ak f782z;

    class C03221 extends ao {
        final /* synthetic */ ActionBarOverlayLayout f748a;

        C03221(ActionBarOverlayLayout actionBarOverlayLayout) {
            this.f748a = actionBarOverlayLayout;
        }

        public void mo141b(View view) {
            this.f748a.f781y = null;
            this.f748a.f769m = false;
        }

        public void mo142c(View view) {
            this.f748a.f781y = null;
            this.f748a.f769m = false;
        }
    }

    class C03232 extends ao {
        final /* synthetic */ ActionBarOverlayLayout f749a;

        C03232(ActionBarOverlayLayout actionBarOverlayLayout) {
            this.f749a = actionBarOverlayLayout;
        }

        public void mo141b(View view) {
            this.f749a.f782z = null;
            this.f749a.f769m = false;
        }

        public void mo142c(View view) {
            this.f749a.f782z = null;
            this.f749a.f769m = false;
        }
    }

    class C03243 implements Runnable {
        final /* synthetic */ ActionBarOverlayLayout f750a;

        C03243(ActionBarOverlayLayout actionBarOverlayLayout) {
            this.f750a = actionBarOverlayLayout;
        }

        public void run() {
            this.f750a.m1525c();
            this.f750a.f781y = C0233z.m1094h(this.f750a.f762f).m868b(0.0f).m865a(this.f750a.f753A);
            if (this.f750a.f761e != null && this.f750a.f761e.getVisibility() != 8) {
                this.f750a.f782z = C0233z.m1094h(this.f750a.f761e).m868b(0.0f).m865a(this.f750a.f754B);
            }
        }
    }

    class C03254 implements Runnable {
        final /* synthetic */ ActionBarOverlayLayout f751a;

        C03254(ActionBarOverlayLayout actionBarOverlayLayout) {
            this.f751a = actionBarOverlayLayout;
        }

        public void run() {
            this.f751a.m1525c();
            this.f751a.f781y = C0233z.m1094h(this.f751a.f762f).m868b((float) (-this.f751a.f762f.getHeight())).m865a(this.f751a.f753A);
            if (this.f751a.f761e != null && this.f751a.f761e.getVisibility() != 8) {
                this.f751a.f782z = C0233z.m1094h(this.f751a.f761e).m868b((float) this.f751a.f761e.getHeight()).m865a(this.f751a.f754B);
            }
        }
    }

    public interface C0326a {
        void m1509a();

        void m1510a(int i);

        void m1511a(boolean z);

        void m1512b();

        void m1513c();

        void m1514d();
    }

    public static class C0327b extends MarginLayoutParams {
        public C0327b(int i, int i2) {
            super(i, i2);
        }

        public C0327b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0327b(LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f759c = 0;
        this.f772p = new Rect();
        this.f773q = new Rect();
        this.f774r = new Rect();
        this.f775s = new Rect();
        this.f776t = new Rect();
        this.f777u = new Rect();
        this.f779w = 600;
        this.f753A = new C03221(this);
        this.f754B = new C03232(this);
        this.f755C = new C03243(this);
        this.f756D = new C03254(this);
        m1517a(context);
        this.f757E = new C0216u(this);
    }

    private C0360g m1516a(View view) {
        if (view instanceof C0360g) {
            return (C0360g) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void m1517a(Context context) {
        boolean z = true;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f752a);
        this.f758b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f764h = obtainStyledAttributes.getDrawable(1);
        setWillNotDraw(this.f764h == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion >= 19) {
            z = false;
        }
        this.f765i = z;
        this.f780x = C0261j.m1213a(context);
    }

    private boolean m1519a(float f, float f2) {
        this.f780x.m1216a(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f780x.m1215a() > this.f762f.getHeight();
    }

    private boolean m1521a(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = false;
        C0327b c0327b = (C0327b) view.getLayoutParams();
        if (z && c0327b.leftMargin != rect.left) {
            c0327b.leftMargin = rect.left;
            z5 = true;
        }
        if (z2 && c0327b.topMargin != rect.top) {
            c0327b.topMargin = rect.top;
            z5 = true;
        }
        if (z4 && c0327b.rightMargin != rect.right) {
            c0327b.rightMargin = rect.right;
            z5 = true;
        }
        if (!z3 || c0327b.bottomMargin == rect.bottom) {
            return z5;
        }
        c0327b.bottomMargin = rect.bottom;
        return true;
    }

    private void m1525c() {
        removeCallbacks(this.f755C);
        removeCallbacks(this.f756D);
        if (this.f781y != null) {
            this.f781y.m867a();
        }
        if (this.f782z != null) {
            this.f782z.m867a();
        }
    }

    private void m1527d() {
        m1525c();
        postDelayed(this.f755C, 600);
    }

    private void m1529e() {
        m1525c();
        postDelayed(this.f756D, 600);
    }

    private void m1530f() {
        m1525c();
        this.f755C.run();
    }

    private void m1531g() {
        m1525c();
        this.f756D.run();
    }

    protected C0327b m1532a() {
        return new C0327b(-1, -1);
    }

    public C0327b m1533a(AttributeSet attributeSet) {
        return new C0327b(getContext(), attributeSet);
    }

    void m1534b() {
        if (this.f760d == null) {
            this.f760d = (ContentFrameLayout) findViewById(C0270e.action_bar_activity_content);
            this.f762f = (ActionBarContainer) findViewById(C0270e.action_bar_container);
            this.f763g = m1516a(findViewById(C0270e.action_bar));
            this.f761e = (ActionBarContainer) findViewById(C0270e.split_action_bar);
        }
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof C0327b;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f764h != null && !this.f765i) {
            int bottom = this.f762f.getVisibility() == 0 ? (int) ((((float) this.f762f.getBottom()) + C0233z.m1092f(this.f762f)) + 0.5f) : 0;
            this.f764h.setBounds(0, bottom, getWidth(), this.f764h.getIntrinsicHeight() + bottom);
            this.f764h.draw(canvas);
        }
    }

    protected boolean fitSystemWindows(Rect rect) {
        m1534b();
        boolean a = (C0233z.m1095i(this) & 256) != 0 ? m1521a(this.f762f, rect, true, true, false, true) : m1521a(this.f762f, rect, true, true, false, true);
        if (this.f761e != null) {
            a |= m1521a(this.f761e, rect, true, false, true, true);
        }
        this.f775s.set(rect);
        C0380s.m1768a(this, this.f775s, this.f772p);
        if (!this.f773q.equals(this.f772p)) {
            this.f773q.set(this.f772p);
            a = true;
        }
        if (a) {
            requestLayout();
        }
        return true;
    }

    protected /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return m1532a();
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return m1533a(attributeSet);
    }

    protected LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new C0327b(layoutParams);
    }

    public int getActionBarHideOffset() {
        return this.f762f != null ? -((int) C0233z.m1092f(this.f762f)) : 0;
    }

    public int getNestedScrollAxes() {
        return this.f757E.m991a();
    }

    public CharSequence getTitle() {
        m1534b();
        return this.f763g.mo293b();
    }

    protected void onConfigurationChanged(Configuration configuration) {
        if (VERSION.SDK_INT >= 8) {
            super.onConfigurationChanged(configuration);
        }
        m1517a(getContext());
        C0233z.m1096j(this);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1525c();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i3 - i) - getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0327b c0327b = (C0327b) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = c0327b.leftMargin + paddingLeft;
                paddingRight = childAt == this.f761e ? (paddingBottom - measuredHeight) - c0327b.bottomMargin : c0327b.topMargin + paddingTop;
                childAt.layout(i6, paddingRight, measuredWidth + i6, measuredHeight + paddingRight);
            }
        }
    }

    protected void onMeasure(int i, int i2) {
        int max;
        int max2;
        int i3;
        int i4;
        m1534b();
        measureChildWithMargins(this.f762f, i, 0, i2, 0);
        C0327b c0327b = (C0327b) this.f762f.getLayoutParams();
        int max3 = Math.max(0, (this.f762f.getMeasuredWidth() + c0327b.leftMargin) + c0327b.rightMargin);
        int max4 = Math.max(0, c0327b.bottomMargin + (this.f762f.getMeasuredHeight() + c0327b.topMargin));
        int a = C0380s.m1767a(0, C0233z.m1091e(this.f762f));
        if (this.f761e != null) {
            measureChildWithMargins(this.f761e, i, 0, i2, 0);
            c0327b = (C0327b) this.f761e.getLayoutParams();
            max = Math.max(max3, (this.f761e.getMeasuredWidth() + c0327b.leftMargin) + c0327b.rightMargin);
            max2 = Math.max(max4, c0327b.bottomMargin + (this.f761e.getMeasuredHeight() + c0327b.topMargin));
            max3 = C0380s.m1767a(a, C0233z.m1091e(this.f761e));
            max4 = max;
            i3 = max2;
        } else {
            i3 = max4;
            max4 = max3;
            max3 = a;
        }
        Object obj = (C0233z.m1095i(this) & 256) != 0 ? 1 : null;
        if (obj != null) {
            i4 = this.f758b;
            if (this.f767k && this.f762f.getTabContainer() != null) {
                i4 += this.f758b;
            }
        } else {
            i4 = this.f762f.getVisibility() != 8 ? this.f762f.getMeasuredHeight() : 0;
        }
        max = (!this.f763g.mo292a() || this.f761e == null) ? 0 : obj != null ? this.f758b : this.f761e.getMeasuredHeight();
        this.f774r.set(this.f772p);
        this.f776t.set(this.f775s);
        Rect rect;
        Rect rect2;
        if (this.f766j || obj != null) {
            rect = this.f776t;
            rect.top = i4 + rect.top;
            rect2 = this.f776t;
            rect2.bottom = max + rect2.bottom;
        } else {
            rect = this.f774r;
            rect.top = i4 + rect.top;
            rect2 = this.f774r;
            rect2.bottom = max + rect2.bottom;
        }
        m1521a(this.f760d, this.f774r, true, true, true, true);
        if (!this.f777u.equals(this.f776t)) {
            this.f777u.set(this.f776t);
            this.f760d.m1579a(this.f776t);
        }
        measureChildWithMargins(this.f760d, i, 0, i2, 0);
        c0327b = (C0327b) this.f760d.getLayoutParams();
        max = Math.max(max4, (this.f760d.getMeasuredWidth() + c0327b.leftMargin) + c0327b.rightMargin);
        i4 = Math.max(i3, c0327b.bottomMargin + (this.f760d.getMeasuredHeight() + c0327b.topMargin));
        max2 = C0380s.m1767a(max3, C0233z.m1091e(this.f760d));
        setMeasuredDimension(C0233z.m1075a(Math.max(max + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), i, max2), C0233z.m1075a(Math.max(i4 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight()), i2, max2 << 16));
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f768l || !z) {
            return false;
        }
        if (m1519a(f, f2)) {
            m1531g();
        } else {
            m1530f();
        }
        this.f769m = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        this.f770n += i2;
        setActionBarHideOffset(this.f770n);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f757E.m992a(view, view2, i);
        this.f770n = getActionBarHideOffset();
        m1525c();
        if (this.f778v != null) {
            this.f778v.m1513c();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return ((i & 2) == 0 || this.f762f.getVisibility() != 0) ? false : this.f768l;
    }

    public void onStopNestedScroll(View view) {
        if (this.f768l && !this.f769m) {
            if (this.f770n <= this.f762f.getHeight()) {
                m1527d();
            } else {
                m1529e();
            }
        }
        if (this.f778v != null) {
            this.f778v.m1514d();
        }
    }

    public void onWindowSystemUiVisibilityChanged(int i) {
        boolean z = true;
        if (VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        m1534b();
        int i2 = this.f771o ^ i;
        this.f771o = i;
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 256) != 0;
        if (this.f778v != null) {
            C0326a c0326a = this.f778v;
            if (z3) {
                z = false;
            }
            c0326a.m1511a(z);
            if (z2 || !z3) {
                this.f778v.m1509a();
            } else {
                this.f778v.m1512b();
            }
        }
        if ((i2 & 256) != 0 && this.f778v != null) {
            C0233z.m1096j(this);
        }
    }

    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f759c = i;
        if (this.f778v != null) {
            this.f778v.m1510a(i);
        }
    }

    public void setActionBarHideOffset(int i) {
        m1525c();
        int height = this.f762f.getHeight();
        int max = Math.max(0, Math.min(i, height));
        C0233z.m1085b(this.f762f, (float) (-max));
        if (this.f761e != null && this.f761e.getVisibility() != 8) {
            C0233z.m1085b(this.f761e, (float) ((int) ((((float) max) / ((float) height)) * ((float) this.f761e.getHeight()))));
        }
    }

    public void setActionBarVisibilityCallback(C0326a c0326a) {
        this.f778v = c0326a;
        if (getWindowToken() != null) {
            this.f778v.m1510a(this.f759c);
            if (this.f771o != 0) {
                onWindowSystemUiVisibilityChanged(this.f771o);
                C0233z.m1096j(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f767k = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f768l) {
            this.f768l = z;
            if (!z) {
                m1525c();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        m1534b();
        this.f763g.mo288a(i);
    }

    public void setIcon(Drawable drawable) {
        m1534b();
        this.f763g.mo289a(drawable);
    }

    public void setLogo(int i) {
        m1534b();
        this.f763g.mo294b(i);
    }

    public void setOverlayMode(boolean z) {
        this.f766j = z;
        boolean z2 = z && getContext().getApplicationInfo().targetSdkVersion < 19;
        this.f765i = z2;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Callback callback) {
        m1534b();
        this.f763g.mo290a(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        m1534b();
        this.f763g.mo291a(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
