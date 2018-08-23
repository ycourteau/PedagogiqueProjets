package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.p001b.p002a.C0056a;
import android.support.v7.p011c.p012a.C0276a;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

public class C0363i extends ListView {
    private static final int[] f926f = new int[]{0};
    final Rect f927a = new Rect();
    int f928b = 0;
    int f929c = 0;
    int f930d = 0;
    int f931e = 0;
    private Field f932g;
    private C0362a f933h;

    private static class C0362a extends C0276a {
        private boolean f925a = true;

        public C0362a(Drawable drawable) {
            super(drawable);
        }

        void m1668a(boolean z) {
            this.f925a = z;
        }

        public void draw(Canvas canvas) {
            if (this.f925a) {
                super.draw(canvas);
            }
        }

        public void setHotspot(float f, float f2) {
            if (this.f925a) {
                super.setHotspot(f, f2);
            }
        }

        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f925a) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        public boolean setState(int[] iArr) {
            return this.f925a ? super.setState(iArr) : false;
        }

        public boolean setVisible(boolean z, boolean z2) {
            return this.f925a ? super.setVisible(z, z2) : false;
        }
    }

    public C0363i(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        try {
            this.f932g = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f932g.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public int m1669a(int i, int i2, int i3, int i4, int i5) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        listPaddingBottom += listPaddingTop;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int i6 = 0;
        View view = null;
        int i7 = 0;
        int count = adapter.getCount();
        int i8 = 0;
        while (i8 < count) {
            View view2;
            listPaddingTop = adapter.getItemViewType(i8);
            if (listPaddingTop != i7) {
                int i9 = listPaddingTop;
                view2 = null;
                i7 = i9;
            } else {
                view2 = view;
            }
            view = adapter.getView(i8, view2, this);
            LayoutParams layoutParams = view.getLayoutParams();
            listPaddingTop = (layoutParams == null || layoutParams.height <= 0) ? MeasureSpec.makeMeasureSpec(0, 0) : MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
            view.measure(i, listPaddingTop);
            listPaddingTop = (i8 > 0 ? listPaddingBottom + dividerHeight : listPaddingBottom) + view.getMeasuredHeight();
            if (listPaddingTop >= i4) {
                return (i5 < 0 || i8 <= i5 || i6 <= 0 || listPaddingTop == i4) ? i4 : i6;
            } else {
                if (i5 >= 0 && i8 >= i5) {
                    i6 = listPaddingTop;
                }
                i8++;
                listPaddingBottom = listPaddingTop;
            }
        }
        return listPaddingBottom;
    }

    protected void m1670a() {
        Drawable selector = getSelector();
        if (selector != null && m1675b()) {
            selector.setState(getDrawableState());
        }
    }

    protected void m1671a(int i, View view) {
        boolean z = true;
        Drawable selector = getSelector();
        boolean z2 = (selector == null || i == -1) ? false : true;
        if (z2) {
            selector.setVisible(false, false);
        }
        m1674b(i, view);
        if (z2) {
            Rect rect = this.f927a;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z = false;
            }
            selector.setVisible(z, false);
            C0056a.m379a(selector, exactCenterX, exactCenterY);
        }
    }

    protected void m1672a(int i, View view, float f, float f2) {
        m1671a(i, view);
        Drawable selector = getSelector();
        if (selector != null && i != -1) {
            C0056a.m379a(selector, f, f2);
        }
    }

    protected void m1673a(Canvas canvas) {
        if (!this.f927a.isEmpty()) {
            Drawable selector = getSelector();
            if (selector != null) {
                selector.setBounds(this.f927a);
                selector.draw(canvas);
            }
        }
    }

    protected void m1674b(int i, View view) {
        Rect rect = this.f927a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f928b;
        rect.top -= this.f929c;
        rect.right += this.f930d;
        rect.bottom += this.f931e;
        try {
            boolean z = this.f932g.getBoolean(this);
            if (view.isEnabled() != z) {
                this.f932g.set(this, Boolean.valueOf(!z));
                if (i != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    protected boolean m1675b() {
        return mo317c() && isPressed();
    }

    protected boolean mo317c() {
        return false;
    }

    protected void dispatchDraw(Canvas canvas) {
        m1673a(canvas);
        super.dispatchDraw(canvas);
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        setSelectorEnabled(true);
        m1670a();
    }

    public void setSelector(Drawable drawable) {
        this.f933h = drawable != null ? new C0362a(drawable) : null;
        super.setSelector(this.f933h);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f928b = rect.left;
        this.f929c = rect.top;
        this.f930d = rect.right;
        this.f931e = rect.bottom;
    }

    protected void setSelectorEnabled(boolean z) {
        if (this.f933h != null) {
            this.f933h.m1668a(z);
        }
    }
}
