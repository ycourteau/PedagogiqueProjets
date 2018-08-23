package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.C0178e;
import android.support.v4.view.C0199n;
import android.support.v4.view.C0206p;
import android.support.v4.view.C0214s;
import android.support.v4.view.C0233z;
import android.support.v7.internal.view.C0284b;
import android.support.v7.internal.view.menu.C0296j;
import android.support.v7.internal.view.menu.C0296j.C0313a;
import android.support.v7.internal.view.menu.C0301e;
import android.support.v7.internal.view.menu.C0301e.C0300a;
import android.support.v7.internal.view.menu.C0303f;
import android.support.v7.internal.view.menu.C0316n;
import android.support.v7.internal.widget.C0360g;
import android.support.v7.internal.widget.C0365k;
import android.support.v7.internal.widget.C0376p;
import android.support.v7.internal.widget.C0377q;
import android.support.v7.internal.widget.C0379r;
import android.support.v7.internal.widget.C0380s;
import android.support.v7.p009a.C0265a.C0263a;
import android.support.v7.p010b.C0275a.C0266a;
import android.support.v7.p010b.C0275a.C0274i;
import android.support.v7.p013d.C0277a;
import android.support.v7.widget.ActionMenuView.C0386e;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class Toolbar extends ViewGroup {
    private boolean f1095A;
    private final ArrayList<View> f1096B;
    private final int[] f1097C;
    private C0398c f1098D;
    private final C0386e f1099E;
    private C0379r f1100F;
    private C0396a f1101G;
    private C0313a f1102H;
    private C0300a f1103I;
    private boolean f1104J;
    private final Runnable f1105K;
    private final C0376p f1106L;
    View f1107a;
    private ActionMenuView f1108b;
    private TextView f1109c;
    private TextView f1110d;
    private ImageButton f1111e;
    private ImageView f1112f;
    private Drawable f1113g;
    private CharSequence f1114h;
    private ImageButton f1115i;
    private Context f1116j;
    private int f1117k;
    private int f1118l;
    private int f1119m;
    private int f1120n;
    private int f1121o;
    private int f1122p;
    private int f1123q;
    private int f1124r;
    private int f1125s;
    private final C0365k f1126t;
    private int f1127u;
    private CharSequence f1128v;
    private CharSequence f1129w;
    private int f1130x;
    private int f1131y;
    private boolean f1132z;

    class C03921 implements C0386e {
        final /* synthetic */ Toolbar f1086a;

        C03921(Toolbar toolbar) {
            this.f1086a = toolbar;
        }

        public boolean mo307a(MenuItem menuItem) {
            return this.f1086a.f1098D != null ? this.f1086a.f1098D.m1837a(menuItem) : false;
        }
    }

    class C03932 implements Runnable {
        final /* synthetic */ Toolbar f1087a;

        C03932(Toolbar toolbar) {
            this.f1087a = toolbar;
        }

        public void run() {
            this.f1087a.m1870b();
        }
    }

    class C03943 implements OnClickListener {
        final /* synthetic */ Toolbar f1088a;

        C03943(Toolbar toolbar) {
            this.f1088a = toolbar;
        }

        public void onClick(View view) {
            this.f1088a.m1871c();
        }
    }

    public static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new C03951();
        int f1089a;
        boolean f1090b;

        static class C03951 implements Creator<SavedState> {
            C03951() {
            }

            public SavedState m1827a(Parcel parcel) {
                return new SavedState(parcel);
            }

            public SavedState[] m1828a(int i) {
                return new SavedState[i];
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m1827a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m1828a(i);
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f1089a = parcel.readInt();
            this.f1090b = parcel.readInt() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1089a);
            parcel.writeInt(this.f1090b ? 1 : 0);
        }
    }

    private class C0396a implements C0296j {
        C0301e f1091a;
        C0303f f1092b;
        final /* synthetic */ Toolbar f1093c;

        private C0396a(Toolbar toolbar) {
            this.f1093c = toolbar;
        }

        public void mo223a(Context context, C0301e c0301e) {
            if (!(this.f1091a == null || this.f1092b == null)) {
                this.f1091a.mo249d(this.f1092b);
            }
            this.f1091a = c0301e;
        }

        public void mo224a(C0301e c0301e, boolean z) {
        }

        public boolean mo225a(C0301e c0301e, C0303f c0303f) {
            this.f1093c.m1861i();
            if (this.f1093c.f1115i.getParent() != this.f1093c) {
                this.f1093c.addView(this.f1093c.f1115i);
            }
            this.f1093c.f1107a = c0303f.getActionView();
            this.f1092b = c0303f;
            if (this.f1093c.f1107a.getParent() != this.f1093c) {
                LayoutParams d = this.f1093c.m1872d();
                d.a = 8388611 | (this.f1093c.f1120n & 112);
                d.f1094b = 2;
                this.f1093c.f1107a.setLayoutParams(d);
                this.f1093c.addView(this.f1093c.f1107a);
            }
            this.f1093c.setChildVisibilityForExpandedActionView(true);
            this.f1093c.requestLayout();
            c0303f.m1402e(true);
            if (this.f1093c.f1107a instanceof C0277a) {
                ((C0277a) this.f1093c.f1107a).mo235a();
            }
            return true;
        }

        public boolean mo226a(C0316n c0316n) {
            return false;
        }

        public void mo227b(boolean z) {
            Object obj = null;
            if (this.f1092b != null) {
                if (this.f1091a != null) {
                    int size = this.f1091a.size();
                    for (int i = 0; i < size; i++) {
                        if (this.f1091a.getItem(i) == this.f1092b) {
                            obj = 1;
                            break;
                        }
                    }
                }
                if (obj == null) {
                    mo229b(this.f1091a, this.f1092b);
                }
            }
        }

        public boolean mo228b() {
            return false;
        }

        public boolean mo229b(C0301e c0301e, C0303f c0303f) {
            if (this.f1093c.f1107a instanceof C0277a) {
                ((C0277a) this.f1093c.f1107a).mo236b();
            }
            this.f1093c.removeView(this.f1093c.f1107a);
            this.f1093c.removeView(this.f1093c.f1115i);
            this.f1093c.f1107a = null;
            this.f1093c.setChildVisibilityForExpandedActionView(false);
            this.f1092b = null;
            this.f1093c.requestLayout();
            c0303f.m1402e(false);
            return true;
        }
    }

    public static class C0397b extends C0263a {
        int f1094b;

        public C0397b(int i, int i2) {
            super(i, i2);
            this.f1094b = 0;
            this.a = 8388627;
        }

        public C0397b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1094b = 0;
        }

        public C0397b(C0263a c0263a) {
            super(c0263a);
            this.f1094b = 0;
        }

        public C0397b(C0397b c0397b) {
            super((C0263a) c0397b);
            this.f1094b = 0;
            this.f1094b = c0397b.f1094b;
        }

        public C0397b(LayoutParams layoutParams) {
            super(layoutParams);
            this.f1094b = 0;
        }

        public C0397b(MarginLayoutParams marginLayoutParams) {
            super((LayoutParams) marginLayoutParams);
            this.f1094b = 0;
            m1836a(marginLayoutParams);
        }

        void m1836a(MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    public interface C0398c {
        boolean m1837a(MenuItem menuItem);
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0266a.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1126t = new C0365k();
        this.f1127u = 8388627;
        this.f1096B = new ArrayList();
        this.f1097C = new int[2];
        this.f1099E = new C03921(this);
        this.f1105K = new C03932(this);
        C0377q a = C0377q.m1724a(getContext(), attributeSet, C0274i.Toolbar, i, 0);
        this.f1118l = a.m1739f(C0274i.Toolbar_titleTextAppearance, 0);
        this.f1119m = a.m1739f(C0274i.Toolbar_subtitleTextAppearance, 0);
        this.f1127u = a.m1730b(C0274i.Toolbar_android_gravity, this.f1127u);
        this.f1120n = 48;
        int c = a.m1733c(C0274i.Toolbar_titleMargins, 0);
        this.f1125s = c;
        this.f1124r = c;
        this.f1123q = c;
        this.f1122p = c;
        c = a.m1733c(C0274i.Toolbar_titleMarginStart, -1);
        if (c >= 0) {
            this.f1122p = c;
        }
        c = a.m1733c(C0274i.Toolbar_titleMarginEnd, -1);
        if (c >= 0) {
            this.f1123q = c;
        }
        c = a.m1733c(C0274i.Toolbar_titleMarginTop, -1);
        if (c >= 0) {
            this.f1124r = c;
        }
        c = a.m1733c(C0274i.Toolbar_titleMarginBottom, -1);
        if (c >= 0) {
            this.f1125s = c;
        }
        this.f1121o = a.m1736d(C0274i.Toolbar_maxButtonHeight, -1);
        c = a.m1733c(C0274i.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int c2 = a.m1733c(C0274i.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        this.f1126t.m1681b(a.m1736d(C0274i.Toolbar_contentInsetLeft, 0), a.m1736d(C0274i.Toolbar_contentInsetRight, 0));
        if (!(c == Integer.MIN_VALUE && c2 == Integer.MIN_VALUE)) {
            this.f1126t.m1678a(c, c2);
        }
        this.f1113g = a.m1728a(C0274i.Toolbar_collapseIcon);
        this.f1114h = a.m1731b(C0274i.Toolbar_collapseContentDescription);
        CharSequence b = a.m1731b(C0274i.Toolbar_title);
        if (!TextUtils.isEmpty(b)) {
            setTitle(b);
        }
        b = a.m1731b(C0274i.Toolbar_subtitle);
        if (!TextUtils.isEmpty(b)) {
            setSubtitle(b);
        }
        this.f1116j = getContext();
        setPopupTheme(a.m1739f(C0274i.Toolbar_popupTheme, 0));
        Drawable a2 = a.m1728a(C0274i.Toolbar_navigationIcon);
        if (a2 != null) {
            setNavigationIcon(a2);
        }
        b = a.m1731b(C0274i.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(b)) {
            setNavigationContentDescription(b);
        }
        a.m1732b();
        this.f1106L = a.m1734c();
    }

    private int m1838a(int i) {
        int i2 = i & 112;
        switch (i2) {
            case 16:
            case C0274i.Theme_homeAsUpIndicator /*48*/:
            case C0274i.Theme_listChoiceBackgroundIndicator /*80*/:
                return i2;
            default:
                return this.f1127u & 112;
        }
    }

    private int m1839a(View view, int i) {
        C0397b c0397b = (C0397b) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        switch (m1838a(c0397b.a)) {
            case C0274i.Theme_homeAsUpIndicator /*48*/:
                return getPaddingTop() - i2;
            case C0274i.Theme_listChoiceBackgroundIndicator /*80*/:
                return (((getHeight() - getPaddingBottom()) - measuredHeight) - c0397b.bottomMargin) - i2;
            default:
                int i3;
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                i2 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                if (i2 < c0397b.topMargin) {
                    i3 = c0397b.topMargin;
                } else {
                    measuredHeight = (((height - paddingBottom) - measuredHeight) - i2) - paddingTop;
                    i3 = measuredHeight < c0397b.bottomMargin ? Math.max(0, i2 - (c0397b.bottomMargin - measuredHeight)) : i2;
                }
                return i3 + paddingTop;
        }
    }

    private int m1840a(View view, int i, int i2, int i3, int i4, int[] iArr) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, ((getPaddingLeft() + getPaddingRight()) + max) + i2, marginLayoutParams.width), getChildMeasureSpec(i3, (((getPaddingTop() + getPaddingBottom()) + marginLayoutParams.topMargin) + marginLayoutParams.bottomMargin) + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private int m1841a(View view, int i, int[] iArr, int i2) {
        C0397b c0397b = (C0397b) view.getLayoutParams();
        int i3 = c0397b.leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        i3 = m1839a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, i3, max + measuredWidth, view.getMeasuredHeight() + i3);
        return (c0397b.rightMargin + measuredWidth) + max;
    }

    private int m1842a(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        int i5 = i2;
        int i6 = i;
        while (i3 < size) {
            View view = (View) list.get(i3);
            C0397b c0397b = (C0397b) view.getLayoutParams();
            i6 = c0397b.leftMargin - i6;
            i = c0397b.rightMargin - i5;
            int max = Math.max(0, i6);
            int max2 = Math.max(0, i);
            i6 = Math.max(0, -i6);
            i5 = Math.max(0, -i);
            i3++;
            i4 += (view.getMeasuredWidth() + max) + max2;
        }
        return i4;
    }

    private void m1845a(View view) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = m1872d();
        } else if (checkLayoutParams(layoutParams)) {
            C0397b c0397b = (C0397b) layoutParams;
        } else {
            layoutParams = m1865a(layoutParams);
        }
        layoutParams.f1094b = 1;
        addView(view, layoutParams);
    }

    private void m1846a(View view, int i, int i2, int i3, int i4, int i5) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i, (((getPaddingLeft() + getPaddingRight()) + marginLayoutParams.leftMargin) + marginLayoutParams.rightMargin) + i2, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i3, (((getPaddingTop() + getPaddingBottom()) + marginLayoutParams.topMargin) + marginLayoutParams.bottomMargin) + i4, marginLayoutParams.height);
        int mode = MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void m1847a(List<View> list, int i) {
        int i2 = 1;
        int i3 = 0;
        if (C0233z.m1090d(this) != 1) {
            i2 = 0;
        }
        int childCount = getChildCount();
        int a = C0178e.m910a(i, C0233z.m1090d(this));
        list.clear();
        C0397b c0397b;
        if (i2 != 0) {
            for (i3 = childCount - 1; i3 >= 0; i3--) {
                View childAt = getChildAt(i3);
                c0397b = (C0397b) childAt.getLayoutParams();
                if (c0397b.f1094b == 0 && m1851b(childAt) && m1848b(c0397b.a) == a) {
                    list.add(childAt);
                }
            }
            return;
        }
        while (i3 < childCount) {
            View childAt2 = getChildAt(i3);
            c0397b = (C0397b) childAt2.getLayoutParams();
            if (c0397b.f1094b == 0 && m1851b(childAt2) && m1848b(c0397b.a) == a) {
                list.add(childAt2);
            }
            i3++;
        }
    }

    private int m1848b(int i) {
        int d = C0233z.m1090d(this);
        int a = C0178e.m910a(i, d) & 7;
        switch (a) {
            case 1:
            case 3:
            case 5:
                return a;
            default:
                return d == 1 ? 5 : 3;
        }
    }

    private int m1849b(View view, int i, int[] iArr, int i2) {
        C0397b c0397b = (C0397b) view.getLayoutParams();
        int i3 = c0397b.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        i3 = m1839a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, i3, max, view.getMeasuredHeight() + i3);
        return max - (c0397b.leftMargin + measuredWidth);
    }

    private boolean m1851b(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private int m1852c(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return C0199n.m942b(marginLayoutParams) + C0199n.m941a(marginLayoutParams);
    }

    private int m1855d(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
    }

    private void m1856e() {
        if (this.f1112f == null) {
            this.f1112f = new ImageView(getContext());
        }
    }

    private void m1857e(View view) {
        if (((C0397b) view.getLayoutParams()).f1094b != 2 && view != this.f1108b) {
            view.setVisibility(this.f1107a != null ? 8 : 0);
        }
    }

    private void m1858f() {
        m1859g();
        if (this.f1108b.m1789c() == null) {
            C0301e c0301e = (C0301e) this.f1108b.getMenu();
            if (this.f1101G == null) {
                this.f1101G = new C0396a();
            }
            this.f1108b.setExpandedActionViewsExclusive(true);
            c0301e.m1357a(this.f1101G, this.f1116j);
        }
    }

    private void m1859g() {
        if (this.f1108b == null) {
            this.f1108b = new ActionMenuView(getContext());
            this.f1108b.setPopupTheme(this.f1117k);
            this.f1108b.setOnMenuItemClickListener(this.f1099E);
            this.f1108b.m1783a(this.f1102H, this.f1103I);
            LayoutParams d = m1872d();
            d.a = 8388613 | (this.f1120n & 112);
            this.f1108b.setLayoutParams(d);
            m1845a(this.f1108b);
        }
    }

    private MenuInflater getMenuInflater() {
        return new C0284b(getContext());
    }

    private void m1860h() {
        if (this.f1111e == null) {
            this.f1111e = new ImageButton(getContext(), null, C0266a.toolbarNavigationButtonStyle);
            LayoutParams d = m1872d();
            d.a = 8388611 | (this.f1120n & 112);
            this.f1111e.setLayoutParams(d);
        }
    }

    private void m1861i() {
        if (this.f1115i == null) {
            this.f1115i = new ImageButton(getContext(), null, C0266a.toolbarNavigationButtonStyle);
            this.f1115i.setImageDrawable(this.f1113g);
            this.f1115i.setContentDescription(this.f1114h);
            LayoutParams d = m1872d();
            d.a = 8388611 | (this.f1120n & 112);
            d.f1094b = 2;
            this.f1115i.setLayoutParams(d);
            this.f1115i.setOnClickListener(new C03943(this));
        }
    }

    private void m1862j() {
        removeCallbacks(this.f1105K);
        post(this.f1105K);
    }

    private boolean m1863k() {
        if (!this.f1104J) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m1851b(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private void setChildVisibilityForExpandedActionView(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (!(((C0397b) childAt.getLayoutParams()).f1094b == 2 || childAt == this.f1108b)) {
                childAt.setVisibility(z ? 8 : 0);
            }
        }
    }

    public C0397b m1864a(AttributeSet attributeSet) {
        return new C0397b(getContext(), attributeSet);
    }

    protected C0397b m1865a(LayoutParams layoutParams) {
        return layoutParams instanceof C0397b ? new C0397b((C0397b) layoutParams) : layoutParams instanceof C0263a ? new C0397b((C0263a) layoutParams) : layoutParams instanceof MarginLayoutParams ? new C0397b((MarginLayoutParams) layoutParams) : new C0397b(layoutParams);
    }

    public void m1866a(int i, int i2) {
        this.f1126t.m1678a(i, i2);
    }

    public void m1867a(Context context, int i) {
        this.f1118l = i;
        if (this.f1109c != null) {
            this.f1109c.setTextAppearance(context, i);
        }
    }

    public boolean m1868a() {
        return this.f1108b != null && this.f1108b.m1791e();
    }

    public void m1869b(Context context, int i) {
        this.f1119m = i;
        if (this.f1110d != null) {
            this.f1110d.setTextAppearance(context, i);
        }
    }

    public boolean m1870b() {
        return this.f1108b != null && this.f1108b.m1790d();
    }

    public void m1871c() {
        C0303f c0303f = this.f1101G == null ? null : this.f1101G.f1092b;
        if (c0303f != null) {
            c0303f.collapseActionView();
        }
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0397b);
    }

    protected C0397b m1872d() {
        return new C0397b(-2, -2);
    }

    protected /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return m1872d();
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return m1864a(attributeSet);
    }

    protected /* synthetic */ LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return m1865a(layoutParams);
    }

    public int getContentInsetEnd() {
        return this.f1126t.m1683d();
    }

    public int getContentInsetLeft() {
        return this.f1126t.m1677a();
    }

    public int getContentInsetRight() {
        return this.f1126t.m1680b();
    }

    public int getContentInsetStart() {
        return this.f1126t.m1682c();
    }

    public Drawable getLogo() {
        return this.f1112f != null ? this.f1112f.getDrawable() : null;
    }

    public CharSequence getLogoDescription() {
        return this.f1112f != null ? this.f1112f.getContentDescription() : null;
    }

    public Menu getMenu() {
        m1858f();
        return this.f1108b.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        return this.f1111e != null ? this.f1111e.getContentDescription() : null;
    }

    public Drawable getNavigationIcon() {
        return this.f1111e != null ? this.f1111e.getDrawable() : null;
    }

    public int getPopupTheme() {
        return this.f1117k;
    }

    public CharSequence getSubtitle() {
        return this.f1129w;
    }

    public CharSequence getTitle() {
        return this.f1128v;
    }

    public C0360g getWrapper() {
        if (this.f1100F == null) {
            this.f1100F = new C0379r(this, true);
        }
        return this.f1100F;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1105K);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int a = C0214s.m981a(motionEvent);
        if (a == 9) {
            this.f1095A = false;
        }
        if (!this.f1095A) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (a == 9 && !onHoverEvent) {
                this.f1095A = true;
            }
        }
        if (a == 10 || a == 3) {
            this.f1095A = false;
        }
        return true;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int measuredHeight;
        int measuredWidth;
        Object obj = C0233z.m1090d(this) == 1 ? 1 : null;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i8 = width - paddingRight;
        int[] iArr = this.f1097C;
        iArr[1] = 0;
        iArr[0] = 0;
        int g = C0233z.m1093g(this);
        if (!m1851b(this.f1111e)) {
            i5 = paddingLeft;
        } else if (obj != null) {
            i8 = m1849b(this.f1111e, i8, iArr, g);
            i5 = paddingLeft;
        } else {
            i5 = m1841a(this.f1111e, paddingLeft, iArr, g);
        }
        if (m1851b(this.f1115i)) {
            if (obj != null) {
                i8 = m1849b(this.f1115i, i8, iArr, g);
            } else {
                i5 = m1841a(this.f1115i, i5, iArr, g);
            }
        }
        if (m1851b(this.f1108b)) {
            if (obj != null) {
                i5 = m1841a(this.f1108b, i5, iArr, g);
            } else {
                i8 = m1849b(this.f1108b, i8, iArr, g);
            }
        }
        iArr[0] = Math.max(0, getContentInsetLeft() - i5);
        iArr[1] = Math.max(0, getContentInsetRight() - ((width - paddingRight) - i8));
        i5 = Math.max(i5, getContentInsetLeft());
        i8 = Math.min(i8, (width - paddingRight) - getContentInsetRight());
        if (m1851b(this.f1107a)) {
            if (obj != null) {
                i8 = m1849b(this.f1107a, i8, iArr, g);
            } else {
                i5 = m1841a(this.f1107a, i5, iArr, g);
            }
        }
        if (!m1851b(this.f1112f)) {
            i6 = i8;
            i7 = i5;
        } else if (obj != null) {
            i6 = m1849b(this.f1112f, i8, iArr, g);
            i7 = i5;
        } else {
            i6 = i8;
            i7 = m1841a(this.f1112f, i5, iArr, g);
        }
        boolean b = m1851b(this.f1109c);
        boolean b2 = m1851b(this.f1110d);
        i5 = 0;
        if (b) {
            C0397b c0397b = (C0397b) this.f1109c.getLayoutParams();
            i5 = 0 + (c0397b.bottomMargin + (c0397b.topMargin + this.f1109c.getMeasuredHeight()));
        }
        if (b2) {
            c0397b = (C0397b) this.f1110d.getLayoutParams();
            measuredHeight = (c0397b.bottomMargin + (c0397b.topMargin + this.f1110d.getMeasuredHeight())) + i5;
        } else {
            measuredHeight = i5;
        }
        if (b || b2) {
            int paddingTop2;
            c0397b = (C0397b) (b ? this.f1109c : this.f1110d).getLayoutParams();
            C0397b c0397b2 = (C0397b) (b2 ? this.f1110d : this.f1109c).getLayoutParams();
            Object obj2 = ((!b || this.f1109c.getMeasuredWidth() <= 0) && (!b2 || this.f1110d.getMeasuredWidth() <= 0)) ? null : 1;
            switch (this.f1127u & 112) {
                case C0274i.Theme_homeAsUpIndicator /*48*/:
                    paddingTop2 = (c0397b.topMargin + getPaddingTop()) + this.f1124r;
                    break;
                case C0274i.Theme_listChoiceBackgroundIndicator /*80*/:
                    paddingTop2 = (((height - paddingBottom) - c0397b2.bottomMargin) - this.f1125s) - measuredHeight;
                    break;
                default:
                    paddingTop2 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                    if (paddingTop2 < c0397b.topMargin + this.f1124r) {
                        i8 = c0397b.topMargin + this.f1124r;
                    } else {
                        measuredHeight = (((height - paddingBottom) - measuredHeight) - paddingTop2) - paddingTop;
                        i8 = measuredHeight < c0397b.bottomMargin + this.f1125s ? Math.max(0, paddingTop2 - ((c0397b2.bottomMargin + this.f1125s) - measuredHeight)) : paddingTop2;
                    }
                    paddingTop2 = paddingTop + i8;
                    break;
            }
            if (obj != null) {
                i8 = (obj2 != null ? this.f1122p : 0) - iArr[1];
                i5 = i6 - Math.max(0, i8);
                iArr[1] = Math.max(0, -i8);
                if (b) {
                    c0397b = (C0397b) this.f1109c.getLayoutParams();
                    measuredWidth = i5 - this.f1109c.getMeasuredWidth();
                    i6 = this.f1109c.getMeasuredHeight() + paddingTop2;
                    this.f1109c.layout(measuredWidth, paddingTop2, i5, i6);
                    paddingTop2 = i6 + c0397b.bottomMargin;
                    i6 = measuredWidth - this.f1123q;
                } else {
                    i6 = i5;
                }
                if (b2) {
                    c0397b = (C0397b) this.f1110d.getLayoutParams();
                    measuredWidth = c0397b.topMargin + paddingTop2;
                    measuredHeight = this.f1110d.getMeasuredHeight() + measuredWidth;
                    this.f1110d.layout(i5 - this.f1110d.getMeasuredWidth(), measuredWidth, i5, measuredHeight);
                    i8 = c0397b.bottomMargin + measuredHeight;
                    i8 = i5 - this.f1123q;
                } else {
                    i8 = i5;
                }
                i6 = obj2 != null ? Math.min(i6, i8) : i5;
            } else {
                i8 = (obj2 != null ? this.f1122p : 0) - iArr[0];
                i7 += Math.max(0, i8);
                iArr[0] = Math.max(0, -i8);
                if (b) {
                    c0397b = (C0397b) this.f1109c.getLayoutParams();
                    i5 = this.f1109c.getMeasuredWidth() + i7;
                    measuredWidth = this.f1109c.getMeasuredHeight() + paddingTop2;
                    this.f1109c.layout(i7, paddingTop2, i5, measuredWidth);
                    i8 = c0397b.bottomMargin + measuredWidth;
                    measuredWidth = i5 + this.f1123q;
                    i5 = i8;
                } else {
                    measuredWidth = i7;
                    i5 = paddingTop2;
                }
                if (b2) {
                    c0397b = (C0397b) this.f1110d.getLayoutParams();
                    i5 += c0397b.topMargin;
                    paddingTop2 = this.f1110d.getMeasuredWidth() + i7;
                    measuredHeight = this.f1110d.getMeasuredHeight() + i5;
                    this.f1110d.layout(i7, i5, paddingTop2, measuredHeight);
                    i8 = c0397b.bottomMargin + measuredHeight;
                    i8 = this.f1123q + paddingTop2;
                } else {
                    i8 = i7;
                }
                if (obj2 != null) {
                    i7 = Math.max(measuredWidth, i8);
                }
            }
        }
        m1847a(this.f1096B, 3);
        int size = this.f1096B.size();
        i5 = i7;
        for (measuredWidth = 0; measuredWidth < size; measuredWidth++) {
            i5 = m1841a((View) this.f1096B.get(measuredWidth), i5, iArr, g);
        }
        m1847a(this.f1096B, 5);
        i7 = this.f1096B.size();
        for (measuredWidth = 0; measuredWidth < i7; measuredWidth++) {
            i6 = m1849b((View) this.f1096B.get(measuredWidth), i6, iArr, g);
        }
        m1847a(this.f1096B, 1);
        measuredWidth = m1842a(this.f1096B, iArr);
        i8 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
        measuredWidth += i8;
        if (i8 < i5) {
            i8 = i5;
        } else if (measuredWidth > i6) {
            i8 -= measuredWidth - i6;
        }
        paddingLeft = this.f1096B.size();
        measuredWidth = i8;
        for (i5 = 0; i5 < paddingLeft; i5++) {
            measuredWidth = m1841a((View) this.f1096B.get(i5), measuredWidth, iArr, g);
        }
        this.f1096B.clear();
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int max;
        int i5 = 0;
        int i6 = 0;
        int[] iArr = this.f1097C;
        if (C0380s.m1769a(this)) {
            i3 = 0;
            i4 = 1;
        } else {
            i3 = 1;
            i4 = 0;
        }
        int i7 = 0;
        if (m1851b(this.f1111e)) {
            m1846a(this.f1111e, i, 0, i2, 0, this.f1121o);
            i7 = this.f1111e.getMeasuredWidth() + m1852c(this.f1111e);
            max = Math.max(0, this.f1111e.getMeasuredHeight() + m1855d(this.f1111e));
            i6 = C0380s.m1767a(0, C0233z.m1091e(this.f1111e));
            i5 = max;
        }
        if (m1851b(this.f1115i)) {
            m1846a(this.f1115i, i, 0, i2, 0, this.f1121o);
            i7 = this.f1115i.getMeasuredWidth() + m1852c(this.f1115i);
            i5 = Math.max(i5, this.f1115i.getMeasuredHeight() + m1855d(this.f1115i));
            i6 = C0380s.m1767a(i6, C0233z.m1091e(this.f1115i));
        }
        int contentInsetStart = getContentInsetStart();
        int max2 = 0 + Math.max(contentInsetStart, i7);
        iArr[i4] = Math.max(0, contentInsetStart - i7);
        i7 = 0;
        if (m1851b(this.f1108b)) {
            m1846a(this.f1108b, i, max2, i2, 0, this.f1121o);
            i7 = this.f1108b.getMeasuredWidth() + m1852c(this.f1108b);
            i5 = Math.max(i5, this.f1108b.getMeasuredHeight() + m1855d(this.f1108b));
            i6 = C0380s.m1767a(i6, C0233z.m1091e(this.f1108b));
        }
        contentInsetStart = getContentInsetEnd();
        max2 += Math.max(contentInsetStart, i7);
        iArr[i3] = Math.max(0, contentInsetStart - i7);
        if (m1851b(this.f1107a)) {
            max2 += m1840a(this.f1107a, i, max2, i2, 0, iArr);
            i5 = Math.max(i5, this.f1107a.getMeasuredHeight() + m1855d(this.f1107a));
            i6 = C0380s.m1767a(i6, C0233z.m1091e(this.f1107a));
        }
        if (m1851b(this.f1112f)) {
            max2 += m1840a(this.f1112f, i, max2, i2, 0, iArr);
            i5 = Math.max(i5, this.f1112f.getMeasuredHeight() + m1855d(this.f1112f));
            i6 = C0380s.m1767a(i6, C0233z.m1091e(this.f1112f));
        }
        i4 = getChildCount();
        i3 = 0;
        int i8 = i5;
        i5 = i6;
        while (i3 < i4) {
            View childAt = getChildAt(i3);
            if (((C0397b) childAt.getLayoutParams()).f1094b != 0) {
                i7 = i5;
                contentInsetStart = i8;
            } else if (m1851b(childAt)) {
                max2 += m1840a(childAt, i, max2, i2, 0, iArr);
                max = Math.max(i8, childAt.getMeasuredHeight() + m1855d(childAt));
                i7 = C0380s.m1767a(i5, C0233z.m1091e(childAt));
                contentInsetStart = max;
            } else {
                i7 = i5;
                contentInsetStart = i8;
            }
            i3++;
            i5 = i7;
            i8 = contentInsetStart;
        }
        contentInsetStart = 0;
        i7 = 0;
        i6 = this.f1124r + this.f1125s;
        max = this.f1122p + this.f1123q;
        if (m1851b(this.f1109c)) {
            m1840a(this.f1109c, i, max2 + max, i2, i6, iArr);
            contentInsetStart = m1852c(this.f1109c) + this.f1109c.getMeasuredWidth();
            i7 = this.f1109c.getMeasuredHeight() + m1855d(this.f1109c);
            i5 = C0380s.m1767a(i5, C0233z.m1091e(this.f1109c));
        }
        if (m1851b(this.f1110d)) {
            contentInsetStart = Math.max(contentInsetStart, m1840a(this.f1110d, i, max2 + max, i2, i6 + i7, iArr));
            i7 += this.f1110d.getMeasuredHeight() + m1855d(this.f1110d);
            i5 = C0380s.m1767a(i5, C0233z.m1091e(this.f1110d));
        }
        contentInsetStart += max2;
        i7 = Math.max(i8, i7) + (getPaddingTop() + getPaddingBottom());
        contentInsetStart = C0233z.m1075a(Math.max(contentInsetStart + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), i, -16777216 & i5);
        i7 = C0233z.m1075a(Math.max(i7, getSuggestedMinimumHeight()), i2, i5 << 16);
        if (m1863k()) {
            i7 = 0;
        }
        setMeasuredDimension(contentInsetStart, i7);
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        Menu c = this.f1108b != null ? this.f1108b.m1789c() : null;
        if (!(savedState.f1089a == 0 || this.f1101G == null || c == null)) {
            MenuItem findItem = c.findItem(savedState.f1089a);
            if (findItem != null) {
                C0206p.m963a(findItem);
            }
        }
        if (savedState.f1090b) {
            m1862j();
        }
    }

    public void onRtlPropertiesChanged(int i) {
        boolean z = true;
        if (VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        C0365k c0365k = this.f1126t;
        if (i != 1) {
            z = false;
        }
        c0365k.m1679a(z);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        if (!(this.f1101G == null || this.f1101G.f1092b == null)) {
            savedState.f1089a = this.f1101G.f1092b.getItemId();
        }
        savedState.f1090b = m1868a();
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int a = C0214s.m981a(motionEvent);
        if (a == 0) {
            this.f1132z = false;
        }
        if (!this.f1132z) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (a == 0 && !onTouchEvent) {
                this.f1132z = true;
            }
        }
        if (a == 1 || a == 3) {
            this.f1132z = false;
        }
        return true;
    }

    public void setCollapsible(boolean z) {
        this.f1104J = z;
        requestLayout();
    }

    public void setLogo(int i) {
        setLogo(this.f1106L.m1718a(i));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m1856e();
            if (this.f1112f.getParent() == null) {
                m1845a(this.f1112f);
                m1857e(this.f1112f);
            }
        } else if (!(this.f1112f == null || this.f1112f.getParent() == null)) {
            removeView(this.f1112f);
        }
        if (this.f1112f != null) {
            this.f1112f.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1856e();
        }
        if (this.f1112f != null) {
            this.f1112f.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1860h();
        }
        if (this.f1111e != null) {
            this.f1111e.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(this.f1106L.m1718a(i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m1860h();
            if (this.f1111e.getParent() == null) {
                m1845a(this.f1111e);
                m1857e(this.f1111e);
            }
        } else if (!(this.f1111e == null || this.f1111e.getParent() == null)) {
            removeView(this.f1111e);
        }
        if (this.f1111e != null) {
            this.f1111e.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(OnClickListener onClickListener) {
        m1860h();
        this.f1111e.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(C0398c c0398c) {
        this.f1098D = c0398c;
    }

    public void setPopupTheme(int i) {
        if (this.f1117k != i) {
            this.f1117k = i;
            if (i == 0) {
                this.f1116j = getContext();
            } else {
                this.f1116j = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1110d == null) {
                Context context = getContext();
                this.f1110d = new TextView(context);
                this.f1110d.setSingleLine();
                this.f1110d.setEllipsize(TruncateAt.END);
                if (this.f1119m != 0) {
                    this.f1110d.setTextAppearance(context, this.f1119m);
                }
                if (this.f1131y != 0) {
                    this.f1110d.setTextColor(this.f1131y);
                }
            }
            if (this.f1110d.getParent() == null) {
                m1845a(this.f1110d);
                m1857e(this.f1110d);
            }
        } else if (!(this.f1110d == null || this.f1110d.getParent() == null)) {
            removeView(this.f1110d);
        }
        if (this.f1110d != null) {
            this.f1110d.setText(charSequence);
        }
        this.f1129w = charSequence;
    }

    public void setSubtitleTextColor(int i) {
        this.f1131y = i;
        if (this.f1110d != null) {
            this.f1110d.setTextColor(i);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1109c == null) {
                Context context = getContext();
                this.f1109c = new TextView(context);
                this.f1109c.setSingleLine();
                this.f1109c.setEllipsize(TruncateAt.END);
                if (this.f1118l != 0) {
                    this.f1109c.setTextAppearance(context, this.f1118l);
                }
                if (this.f1130x != 0) {
                    this.f1109c.setTextColor(this.f1130x);
                }
            }
            if (this.f1109c.getParent() == null) {
                m1845a(this.f1109c);
                m1857e(this.f1109c);
            }
        } else if (!(this.f1109c == null || this.f1109c.getParent() == null)) {
            removeView(this.f1109c);
        }
        if (this.f1109c != null) {
            this.f1109c.setText(charSequence);
        }
        this.f1128v = charSequence;
    }

    public void setTitleTextColor(int i) {
        this.f1130x = i;
        if (this.f1109c != null) {
            this.f1109c.setTextColor(i);
        }
    }
}
