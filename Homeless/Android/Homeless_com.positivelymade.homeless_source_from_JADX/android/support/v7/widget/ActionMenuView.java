package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.support.v7.internal.view.menu.ActionMenuItemView;
import android.support.v7.internal.view.menu.C0294k;
import android.support.v7.internal.view.menu.C0296j.C0313a;
import android.support.v7.internal.view.menu.C0301e;
import android.support.v7.internal.view.menu.C0301e.C0293b;
import android.support.v7.internal.view.menu.C0301e.C0300a;
import android.support.v7.internal.view.menu.C0303f;
import android.support.v7.internal.widget.C0380s;
import android.support.v7.widget.C0328d.C0383a;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;

public class ActionMenuView extends C0328d implements C0293b, C0294k {
    private C0301e f1024a;
    private Context f1025b;
    private Context f1026c;
    private int f1027d;
    private boolean f1028e;
    private C0407a f1029f;
    private C0313a f1030g;
    private C0300a f1031h;
    private boolean f1032i;
    private int f1033j;
    private int f1034k;
    private int f1035l;
    private C0386e f1036m;

    public interface C0292a {
        boolean mo207c();

        boolean mo208d();
    }

    private class C0382b implements C0313a {
        final /* synthetic */ ActionMenuView f1014a;

        private C0382b(ActionMenuView actionMenuView) {
            this.f1014a = actionMenuView;
        }

        public void mo295a(C0301e c0301e, boolean z) {
        }

        public boolean mo296a(C0301e c0301e) {
            return false;
        }
    }

    public static class C0384c extends C0383a {
        @ExportedProperty
        public boolean f1017a;
        @ExportedProperty
        public int f1018b;
        @ExportedProperty
        public int f1019c;
        @ExportedProperty
        public boolean f1020d;
        @ExportedProperty
        public boolean f1021e;
        boolean f1022f;

        public C0384c(int i, int i2) {
            super(i, i2);
            this.f1017a = false;
        }

        public C0384c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0384c(C0384c c0384c) {
            super(c0384c);
            this.f1017a = c0384c.f1017a;
        }

        public C0384c(LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    private class C0385d implements C0300a {
        final /* synthetic */ ActionMenuView f1023a;

        private C0385d(ActionMenuView actionMenuView) {
            this.f1023a = actionMenuView;
        }

        public void mo297a(C0301e c0301e) {
            if (this.f1023a.f1031h != null) {
                this.f1023a.f1031h.mo297a(c0301e);
            }
        }

        public boolean mo298a(C0301e c0301e, MenuItem menuItem) {
            return this.f1023a.f1036m != null && this.f1023a.f1036m.mo307a(menuItem);
        }
    }

    public interface C0386e {
        boolean mo307a(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1025b = context;
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f1034k = (int) (56.0f * f);
        this.f1035l = (int) (f * 4.0f);
        this.f1026c = context;
        this.f1027d = 0;
    }

    static int m1775a(View view, int i, int i2, int i3, int i4) {
        int i5;
        boolean z = false;
        C0384c c0384c = (C0384c) view.getLayoutParams();
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i3) - i4, MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.m1291b();
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(MeasureSpec.makeMeasureSpec(i * i2, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            i5 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i5++;
            }
            if (z2 && r1 < 2) {
                i5 = 2;
            }
        }
        if (!c0384c.f1017a && z2) {
            z = true;
        }
        c0384c.f1020d = z;
        c0384c.f1018b = i5;
        view.measure(MeasureSpec.makeMeasureSpec(i5 * i, 1073741824), makeMeasureSpec);
        return i5;
    }

    private void m1778c(int i, int i2) {
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = getChildMeasureSpec(i2, paddingTop, -2);
        int i3 = size - paddingLeft;
        int i4 = i3 / this.f1034k;
        size = i3 % this.f1034k;
        if (i4 == 0) {
            setMeasuredDimension(i3, 0);
            return;
        }
        Object obj;
        int i5 = this.f1034k + (size / i4);
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        paddingLeft = 0;
        Object obj2 = null;
        long j = 0;
        int childCount = getChildCount();
        int i9 = 0;
        while (i9 < childCount) {
            int i10;
            long j2;
            int i11;
            int i12;
            int i13;
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() == 8) {
                i10 = paddingLeft;
                j2 = j;
                i11 = i6;
                i12 = i4;
                i4 = i7;
            } else {
                boolean z = childAt instanceof ActionMenuItemView;
                i13 = paddingLeft + 1;
                if (z) {
                    childAt.setPadding(this.f1035l, 0, this.f1035l, 0);
                }
                C0384c c0384c = (C0384c) childAt.getLayoutParams();
                c0384c.f1022f = false;
                c0384c.f1019c = 0;
                c0384c.f1018b = 0;
                c0384c.f1020d = false;
                c0384c.leftMargin = 0;
                c0384c.rightMargin = 0;
                boolean z2 = z && ((ActionMenuItemView) childAt).m1291b();
                c0384c.f1021e = z2;
                int a = m1775a(childAt, i5, c0384c.f1017a ? 1 : i4, childMeasureSpec, paddingTop);
                i7 = Math.max(i7, a);
                paddingLeft = c0384c.f1020d ? i8 + 1 : i8;
                obj = c0384c.f1017a ? 1 : obj2;
                int i14 = i4 - a;
                i8 = Math.max(i6, childAt.getMeasuredHeight());
                if (a == 1) {
                    long j3 = ((long) (1 << i9)) | j;
                    i11 = i8;
                    i12 = i14;
                    i8 = paddingLeft;
                    obj2 = obj;
                    j2 = j3;
                    i4 = i7;
                    i10 = i13;
                } else {
                    i10 = i13;
                    i4 = i7;
                    long j4 = j;
                    i11 = i8;
                    i12 = i14;
                    obj2 = obj;
                    i8 = paddingLeft;
                    j2 = j4;
                }
            }
            i9++;
            i7 = i4;
            i6 = i11;
            i4 = i12;
            j = j2;
            paddingLeft = i10;
        }
        Object obj3 = (obj2 == null || paddingLeft != 2) ? null : 1;
        Object obj4 = null;
        long j5 = j;
        paddingTop = i4;
        while (i8 > 0 && paddingTop > 0) {
            i13 = Integer.MAX_VALUE;
            j = 0;
            i4 = 0;
            int i15 = 0;
            while (i15 < childCount) {
                c0384c = (C0384c) getChildAt(i15).getLayoutParams();
                if (!c0384c.f1020d) {
                    size = i4;
                    i4 = i13;
                } else if (c0384c.f1018b < i13) {
                    i4 = c0384c.f1018b;
                    j = (long) (1 << i15);
                    size = 1;
                } else if (c0384c.f1018b == i13) {
                    j |= (long) (1 << i15);
                    size = i4 + 1;
                    i4 = i13;
                } else {
                    size = i4;
                    i4 = i13;
                }
                i15++;
                i13 = i4;
                i4 = size;
            }
            j5 |= j;
            if (i4 > paddingTop) {
                j = j5;
                break;
            }
            i15 = i13 + 1;
            i13 = 0;
            i4 = paddingTop;
            long j6 = j5;
            while (i13 < childCount) {
                View childAt2 = getChildAt(i13);
                c0384c = (C0384c) childAt2.getLayoutParams();
                if ((((long) (1 << i13)) & j) != 0) {
                    if (obj3 != null && c0384c.f1021e && i4 == 1) {
                        childAt2.setPadding(this.f1035l + i5, 0, this.f1035l, 0);
                    }
                    c0384c.f1018b++;
                    c0384c.f1022f = true;
                    size = i4 - 1;
                } else if (c0384c.f1018b == i15) {
                    j6 |= (long) (1 << i13);
                    size = i4;
                } else {
                    size = i4;
                }
                i13++;
                i4 = size;
            }
            j5 = j6;
            i9 = 1;
            paddingTop = i4;
        }
        j = j5;
        obj = (obj2 == null && paddingLeft == 1) ? 1 : null;
        if (paddingTop <= 0 || j == 0 || (paddingTop >= paddingLeft - 1 && obj == null && i7 <= 1)) {
            obj3 = obj4;
        } else {
            float f;
            View childAt3;
            float bitCount = (float) Long.bitCount(j);
            if (obj == null) {
                if (!((1 & j) == 0 || ((C0384c) getChildAt(0).getLayoutParams()).f1021e)) {
                    bitCount -= 0.5f;
                }
                if (!((((long) (1 << (childCount - 1))) & j) == 0 || ((C0384c) getChildAt(childCount - 1).getLayoutParams()).f1021e)) {
                    f = bitCount - 0.5f;
                    paddingLeft = f <= 0.0f ? (int) (((float) (paddingTop * i5)) / f) : 0;
                    i4 = 0;
                    obj3 = obj4;
                    while (i4 < childCount) {
                        if ((((long) (1 << i4)) & j) != 0) {
                            obj = obj3;
                        } else {
                            childAt3 = getChildAt(i4);
                            c0384c = (C0384c) childAt3.getLayoutParams();
                            if (childAt3 instanceof ActionMenuItemView) {
                                c0384c.f1019c = paddingLeft;
                                c0384c.f1022f = true;
                                if (i4 == 0 && !c0384c.f1021e) {
                                    c0384c.leftMargin = (-paddingLeft) / 2;
                                }
                                obj = 1;
                            } else if (c0384c.f1017a) {
                                if (i4 != 0) {
                                    c0384c.leftMargin = paddingLeft / 2;
                                }
                                if (i4 != childCount - 1) {
                                    c0384c.rightMargin = paddingLeft / 2;
                                }
                                obj = obj3;
                            } else {
                                c0384c.f1019c = paddingLeft;
                                c0384c.f1022f = true;
                                c0384c.rightMargin = (-paddingLeft) / 2;
                                obj = 1;
                            }
                        }
                        i4++;
                        obj3 = obj;
                    }
                }
            }
            f = bitCount;
            if (f <= 0.0f) {
            }
            i4 = 0;
            obj3 = obj4;
            while (i4 < childCount) {
                if ((((long) (1 << i4)) & j) != 0) {
                    childAt3 = getChildAt(i4);
                    c0384c = (C0384c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0384c.f1019c = paddingLeft;
                        c0384c.f1022f = true;
                        c0384c.leftMargin = (-paddingLeft) / 2;
                        obj = 1;
                    } else if (c0384c.f1017a) {
                        if (i4 != 0) {
                            c0384c.leftMargin = paddingLeft / 2;
                        }
                        if (i4 != childCount - 1) {
                            c0384c.rightMargin = paddingLeft / 2;
                        }
                        obj = obj3;
                    } else {
                        c0384c.f1019c = paddingLeft;
                        c0384c.f1022f = true;
                        c0384c.rightMargin = (-paddingLeft) / 2;
                        obj = 1;
                    }
                } else {
                    obj = obj3;
                }
                i4++;
                obj3 = obj;
            }
        }
        if (obj3 != null) {
            for (paddingLeft = 0; paddingLeft < childCount; paddingLeft++) {
                childAt = getChildAt(paddingLeft);
                c0384c = (C0384c) childAt.getLayoutParams();
                if (c0384c.f1022f) {
                    childAt.measure(MeasureSpec.makeMeasureSpec(c0384c.f1019c + (c0384c.f1018b * i5), 1073741824), childMeasureSpec);
                }
            }
        }
        if (mode == 1073741824) {
            i6 = size2;
        }
        setMeasuredDimension(i3, i6);
    }

    protected C0384c m1779a() {
        C0384c c0384c = new C0384c(-2, -2);
        c0384c.h = 16;
        return c0384c;
    }

    public C0384c m1780a(AttributeSet attributeSet) {
        return new C0384c(getContext(), attributeSet);
    }

    protected C0384c m1781a(LayoutParams layoutParams) {
        if (layoutParams == null) {
            return m1779a();
        }
        C0384c c0384c = layoutParams instanceof C0384c ? new C0384c((C0384c) layoutParams) : new C0384c(layoutParams);
        if (c0384c.h > 0) {
            return c0384c;
        }
        c0384c.h = 16;
        return c0384c;
    }

    public void mo210a(C0301e c0301e) {
        this.f1024a = c0301e;
    }

    public void m1783a(C0313a c0313a, C0300a c0300a) {
        this.f1030g = c0313a;
        this.f1031h = c0300a;
    }

    protected boolean m1784a(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof C0292a)) {
            z = 0 | ((C0292a) childAt).mo208d();
        }
        return (i <= 0 || !(childAt2 instanceof C0292a)) ? z : ((C0292a) childAt2).mo207c() | z;
    }

    public boolean mo211a(C0303f c0303f) {
        return this.f1024a.m1363a((MenuItem) c0303f, 0);
    }

    public C0384c m1786b() {
        C0384c a = m1779a();
        a.f1017a = true;
        return a;
    }

    public /* synthetic */ C0383a mo299b(AttributeSet attributeSet) {
        return m1780a(attributeSet);
    }

    protected /* synthetic */ C0383a mo300b(LayoutParams layoutParams) {
        return m1781a(layoutParams);
    }

    public C0301e m1789c() {
        return this.f1024a;
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof C0384c);
    }

    public boolean m1790d() {
        return this.f1029f != null && this.f1029f.m1909c();
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public boolean m1791e() {
        return this.f1029f != null && this.f1029f.m1914g();
    }

    public void m1792f() {
        if (this.f1029f != null) {
            this.f1029f.m1912e();
        }
    }

    protected /* synthetic */ C0383a mo302g() {
        return m1779a();
    }

    protected /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return m1779a();
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return m1780a(attributeSet);
    }

    protected /* synthetic */ LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return m1781a(layoutParams);
    }

    public Menu getMenu() {
        if (this.f1024a == null) {
            Context context = getContext();
            this.f1024a = new C0301e(context);
            this.f1024a.mo244a(new C0385d());
            this.f1029f = new C0407a(context);
            this.f1029f.m1908c(true);
            this.f1029f.m1323a(this.f1030g != null ? this.f1030g : new C0382b());
            this.f1024a.m1357a(this.f1029f, this.f1026c);
            this.f1029f.m1901a(this);
        }
        return this.f1024a;
    }

    public int getPopupTheme() {
        return this.f1027d;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (VERSION.SDK_INT >= 8) {
            super.onConfigurationChanged(configuration);
        }
        if (this.f1029f != null) {
            this.f1029f.mo227b(false);
            if (this.f1029f.m1914g()) {
                this.f1029f.m1911d();
                this.f1029f.m1909c();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1792f();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f1032i) {
            int i5;
            int i6;
            C0384c c0384c;
            int paddingLeft;
            int childCount = getChildCount();
            int i7 = (i4 - i2) / 2;
            int dividerWidth = getDividerWidth();
            int i8 = 0;
            int i9 = 0;
            int paddingRight = ((i3 - i) - getPaddingRight()) - getPaddingLeft();
            Object obj = null;
            boolean a = C0380s.m1769a(this);
            int i10 = 0;
            while (i10 < childCount) {
                Object obj2;
                View childAt = getChildAt(i10);
                if (childAt.getVisibility() == 8) {
                    obj2 = obj;
                    i5 = i9;
                    i6 = paddingRight;
                    paddingRight = i8;
                } else {
                    c0384c = (C0384c) childAt.getLayoutParams();
                    if (c0384c.f1017a) {
                        i6 = childAt.getMeasuredWidth();
                        if (m1784a(i10)) {
                            i6 += dividerWidth;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        if (a) {
                            paddingLeft = c0384c.leftMargin + getPaddingLeft();
                            i5 = paddingLeft + i6;
                        } else {
                            i5 = (getWidth() - getPaddingRight()) - c0384c.rightMargin;
                            paddingLeft = i5 - i6;
                        }
                        int i11 = i7 - (measuredHeight / 2);
                        childAt.layout(paddingLeft, i11, i5, measuredHeight + i11);
                        i6 = paddingRight - i6;
                        obj2 = 1;
                        i5 = i9;
                        paddingRight = i8;
                    } else {
                        i5 = (childAt.getMeasuredWidth() + c0384c.leftMargin) + c0384c.rightMargin;
                        paddingLeft = i8 + i5;
                        i5 = paddingRight - i5;
                        if (m1784a(i10)) {
                            paddingLeft += dividerWidth;
                        }
                        Object obj3 = obj;
                        i6 = i5;
                        i5 = i9 + 1;
                        paddingRight = paddingLeft;
                        obj2 = obj3;
                    }
                }
                i10++;
                i8 = paddingRight;
                paddingRight = i6;
                i9 = i5;
                obj = obj2;
            }
            if (childCount == 1 && obj == null) {
                View childAt2 = getChildAt(0);
                i6 = childAt2.getMeasuredWidth();
                i5 = childAt2.getMeasuredHeight();
                paddingRight = ((i3 - i) / 2) - (i6 / 2);
                i9 = i7 - (i5 / 2);
                childAt2.layout(paddingRight, i9, i6 + paddingRight, i5 + i9);
                return;
            }
            paddingLeft = i9 - (obj != null ? 0 : 1);
            paddingRight = Math.max(0, paddingLeft > 0 ? paddingRight / paddingLeft : 0);
            View childAt3;
            if (a) {
                i6 = getWidth() - getPaddingRight();
                i5 = 0;
                while (i5 < childCount) {
                    childAt3 = getChildAt(i5);
                    c0384c = (C0384c) childAt3.getLayoutParams();
                    if (childAt3.getVisibility() == 8) {
                        paddingLeft = i6;
                    } else if (c0384c.f1017a) {
                        paddingLeft = i6;
                    } else {
                        i6 -= c0384c.rightMargin;
                        i8 = childAt3.getMeasuredWidth();
                        i10 = childAt3.getMeasuredHeight();
                        dividerWidth = i7 - (i10 / 2);
                        childAt3.layout(i6 - i8, dividerWidth, i6, i10 + dividerWidth);
                        paddingLeft = i6 - ((c0384c.leftMargin + i8) + paddingRight);
                    }
                    i5++;
                    i6 = paddingLeft;
                }
                return;
            }
            i6 = getPaddingLeft();
            i5 = 0;
            while (i5 < childCount) {
                childAt3 = getChildAt(i5);
                c0384c = (C0384c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() == 8) {
                    paddingLeft = i6;
                } else if (c0384c.f1017a) {
                    paddingLeft = i6;
                } else {
                    i6 += c0384c.leftMargin;
                    i8 = childAt3.getMeasuredWidth();
                    i10 = childAt3.getMeasuredHeight();
                    dividerWidth = i7 - (i10 / 2);
                    childAt3.layout(i6, dividerWidth, i6 + i8, i10 + dividerWidth);
                    paddingLeft = ((c0384c.rightMargin + i8) + paddingRight) + i6;
                }
                i5++;
                i6 = paddingLeft;
            }
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    protected void onMeasure(int i, int i2) {
        boolean z = this.f1032i;
        this.f1032i = MeasureSpec.getMode(i) == 1073741824;
        if (z != this.f1032i) {
            this.f1033j = 0;
        }
        int size = MeasureSpec.getSize(i);
        if (!(!this.f1032i || this.f1024a == null || size == this.f1033j)) {
            this.f1033j = size;
            this.f1024a.m1367b(true);
        }
        int childCount = getChildCount();
        if (!this.f1032i || childCount <= 0) {
            for (int i3 = 0; i3 < childCount; i3++) {
                C0384c c0384c = (C0384c) getChildAt(i3).getLayoutParams();
                c0384c.rightMargin = 0;
                c0384c.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        m1778c(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f1029f.m1910d(z);
    }

    public void setOnMenuItemClickListener(C0386e c0386e) {
        this.f1036m = c0386e;
    }

    public void setOverflowReserved(boolean z) {
        this.f1028e = z;
    }

    public void setPopupTheme(int i) {
        if (this.f1027d != i) {
            this.f1027d = i;
            if (i == 0) {
                this.f1026c = this.f1025b;
            } else {
                this.f1026c = new ContextThemeWrapper(this.f1025b, i);
            }
        }
    }

    public void setPresenter(C0407a c0407a) {
        this.f1029f = c0407a;
        this.f1029f.m1901a(this);
    }
}
