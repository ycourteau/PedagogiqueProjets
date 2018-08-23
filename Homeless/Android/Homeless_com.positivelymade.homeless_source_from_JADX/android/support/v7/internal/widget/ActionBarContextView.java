package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.C0233z;
import android.support.v4.view.ak;
import android.support.v4.view.an;
import android.support.v7.internal.view.C0286c;
import android.support.v7.p010b.C0275a.C0266a;
import android.support.v7.p010b.C0275a.C0270e;
import android.support.v7.p010b.C0275a.C0272g;
import android.support.v7.p010b.C0275a.C0274i;
import android.support.v7.widget.ActionMenuView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ActionBarContextView extends C0321a implements an {
    private CharSequence f733j;
    private CharSequence f734k;
    private View f735l;
    private View f736m;
    private LinearLayout f737n;
    private TextView f738o;
    private TextView f739p;
    private int f740q;
    private int f741r;
    private Drawable f742s;
    private boolean f743t;
    private int f744u;
    private C0286c f745v;
    private boolean f746w;
    private int f747x;

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0266a.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0377q a = C0377q.m1724a(context, attributeSet, C0274i.ActionMode, i, 0);
        setBackgroundDrawable(a.m1728a(C0274i.ActionMode_background));
        this.f740q = a.m1739f(C0274i.ActionMode_titleTextStyle, 0);
        this.f741r = a.m1739f(C0274i.ActionMode_subtitleTextStyle, 0);
        this.h = a.m1738e(C0274i.ActionMode_height, 0);
        this.f742s = a.m1728a(C0274i.ActionMode_backgroundSplit);
        this.f744u = a.m1739f(C0274i.ActionMode_closeItemLayout, C0272g.abc_action_mode_close_item_material);
        a.m1732b();
    }

    private void m1498b() {
        int i = 8;
        Object obj = 1;
        if (this.f737n == null) {
            LayoutInflater.from(getContext()).inflate(C0272g.abc_action_bar_title_item, this);
            this.f737n = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f738o = (TextView) this.f737n.findViewById(C0270e.action_bar_title);
            this.f739p = (TextView) this.f737n.findViewById(C0270e.action_bar_subtitle);
            if (this.f740q != 0) {
                this.f738o.setTextAppearance(getContext(), this.f740q);
            }
            if (this.f741r != 0) {
                this.f739p.setTextAppearance(getContext(), this.f741r);
            }
        }
        this.f738o.setText(this.f733j);
        this.f739p.setText(this.f734k);
        Object obj2 = !TextUtils.isEmpty(this.f733j) ? 1 : null;
        if (TextUtils.isEmpty(this.f734k)) {
            obj = null;
        }
        this.f739p.setVisibility(obj != null ? 0 : 8);
        LinearLayout linearLayout = this.f737n;
        if (!(obj2 == null && obj == null)) {
            i = 0;
        }
        linearLayout.setVisibility(i);
        if (this.f737n.getParent() == null) {
            addView(this.f737n);
        }
    }

    private void m1499c() {
        C0286c c0286c = this.f745v;
        if (c0286c != null) {
            this.f745v = null;
            c0286c.m1265b();
        }
    }

    private C0286c m1500d() {
        C0233z.m1077a(this.f735l, (float) ((-this.f735l.getWidth()) - ((MarginLayoutParams) this.f735l.getLayoutParams()).leftMargin));
        ak a = C0233z.m1094h(this.f735l).m863a(0.0f);
        a.m864a(200);
        a.m865a((an) this);
        a.m866a(new DecelerateInterpolator());
        C0286c c0286c = new C0286c();
        c0286c.m1263a(a);
        if (this.c != null) {
            int childCount = this.c.getChildCount();
            if (childCount > 0) {
                int i = childCount - 1;
                childCount = 0;
                while (i >= 0) {
                    View childAt = this.c.getChildAt(i);
                    C0233z.m1089c(childAt, 0.0f);
                    ak c = C0233z.m1094h(childAt).m870c(1.0f);
                    c.m864a(300);
                    c0286c.m1263a(c);
                    i--;
                    childCount++;
                }
            }
        }
        return c0286c;
    }

    public void m1501a() {
        m1499c();
        removeAllViews();
        if (this.e != null) {
            this.e.removeView(this.c);
        }
        this.f736m = null;
        this.c = null;
        this.f746w = false;
    }

    public void mo140a(View view) {
    }

    public void mo141b(View view) {
        if (this.f747x == 2) {
            m1501a();
        }
        this.f747x = 0;
    }

    public void mo142c(View view) {
    }

    protected LayoutParams generateDefaultLayoutParams() {
        return new MarginLayoutParams(-1, -2);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f734k;
    }

    public CharSequence getTitle() {
        return this.f733j;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.d != null) {
            this.d.m1911d();
            this.d.m1913f();
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (VERSION.SDK_INT < 14) {
            return;
        }
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f733j);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        boolean a = C0380s.m1769a(this);
        int paddingRight = a ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        if (!(this.f735l == null || this.f735l.getVisibility() == 8)) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f735l.getLayoutParams();
            i5 = a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            i5 = C0321a.m1495a(paddingRight, i5, a);
            paddingRight = C0321a.m1495a(m1497a(this.f735l, i5, paddingTop, paddingTop2, a) + i5, i6, a);
            if (this.f746w) {
                this.f747x = 1;
                this.f745v = m1500d();
                this.f745v.m1264a();
                this.f746w = false;
            }
        }
        i5 = paddingRight;
        if (!(this.f737n == null || this.f736m != null || this.f737n.getVisibility() == 8)) {
            i5 += m1497a(this.f737n, i5, paddingTop, paddingTop2, a);
        }
        if (this.f736m != null) {
            int a2 = m1497a(this.f736m, i5, paddingTop, paddingTop2, a) + i5;
        }
        i5 = a ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        if (this.c != null) {
            a2 = m1497a(this.c, i5, paddingTop, paddingTop2, !a) + i5;
        }
    }

    protected void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        int i4 = 0;
        if (MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used " + "with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used " + "with android:layout_height=\"wrap_content\"");
        } else {
            int a;
            int size = MeasureSpec.getSize(i);
            int size2 = this.h > 0 ? this.h : MeasureSpec.getSize(i2);
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i5 = size2 - paddingTop;
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
            if (this.f735l != null) {
                a = m1496a(this.f735l, paddingLeft, makeMeasureSpec, 0);
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f735l.getLayoutParams();
                paddingLeft = a - (marginLayoutParams.rightMargin + marginLayoutParams.leftMargin);
            }
            if (this.c != null && this.c.getParent() == this) {
                paddingLeft = m1496a(this.c, paddingLeft, makeMeasureSpec, 0);
            }
            if (this.f737n != null && this.f736m == null) {
                if (this.f743t) {
                    this.f737n.measure(MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    a = this.f737n.getMeasuredWidth();
                    makeMeasureSpec = a <= paddingLeft ? 1 : 0;
                    if (makeMeasureSpec != 0) {
                        paddingLeft -= a;
                    }
                    this.f737n.setVisibility(makeMeasureSpec != 0 ? 0 : 8);
                } else {
                    paddingLeft = m1496a(this.f737n, paddingLeft, makeMeasureSpec, 0);
                }
            }
            if (this.f736m != null) {
                LayoutParams layoutParams = this.f736m.getLayoutParams();
                makeMeasureSpec = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (layoutParams.width >= 0) {
                    paddingLeft = Math.min(layoutParams.width, paddingLeft);
                }
                if (layoutParams.height == -2) {
                    i3 = Integer.MIN_VALUE;
                }
                this.f736m.measure(MeasureSpec.makeMeasureSpec(paddingLeft, makeMeasureSpec), MeasureSpec.makeMeasureSpec(layoutParams.height >= 0 ? Math.min(layoutParams.height, i5) : i5, i3));
            }
            if (this.h <= 0) {
                makeMeasureSpec = getChildCount();
                size2 = 0;
                while (i4 < makeMeasureSpec) {
                    paddingLeft = getChildAt(i4).getMeasuredHeight() + paddingTop;
                    if (paddingLeft <= size2) {
                        paddingLeft = size2;
                    }
                    i4++;
                    size2 = paddingLeft;
                }
                setMeasuredDimension(size, size2);
                return;
            }
            setMeasuredDimension(size, size2);
        }
    }

    public void setContentHeight(int i) {
        this.h = i;
    }

    public void setCustomView(View view) {
        if (this.f736m != null) {
            removeView(this.f736m);
        }
        this.f736m = view;
        if (this.f737n != null) {
            removeView(this.f737n);
            this.f737n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSplitToolbar(boolean z) {
        if (this.f != z) {
            if (this.d != null) {
                LayoutParams layoutParams = new LayoutParams(-2, -1);
                ViewGroup viewGroup;
                if (z) {
                    this.d.m1896a(getContext().getResources().getDisplayMetrics().widthPixels, true);
                    this.d.m1895a(Integer.MAX_VALUE);
                    layoutParams.width = -1;
                    layoutParams.height = this.h;
                    this.c = (ActionMenuView) this.d.mo311a((ViewGroup) this);
                    this.c.setBackgroundDrawable(this.f742s);
                    viewGroup = (ViewGroup) this.c.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(this.c);
                    }
                    this.e.addView(this.c, layoutParams);
                } else {
                    this.c = (ActionMenuView) this.d.mo311a((ViewGroup) this);
                    this.c.setBackgroundDrawable(null);
                    viewGroup = (ViewGroup) this.c.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(this.c);
                    }
                    addView(this.c, layoutParams);
                }
            }
            super.setSplitToolbar(z);
        }
    }

    public /* bridge */ /* synthetic */ void setSplitView(ViewGroup viewGroup) {
        super.setSplitView(viewGroup);
    }

    public /* bridge */ /* synthetic */ void setSplitWhenNarrow(boolean z) {
        super.setSplitWhenNarrow(z);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f734k = charSequence;
        m1498b();
    }

    public void setTitle(CharSequence charSequence) {
        this.f733j = charSequence;
        m1498b();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f743t) {
            requestLayout();
        }
        this.f743t = z;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
