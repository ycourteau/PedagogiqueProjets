package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v4.view.ak;
import android.support.v4.view.an;
import android.support.v7.p010b.C0275a.C0266a;
import android.support.v7.p010b.C0275a.C0274i;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.C0407a;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;

abstract class C0321a extends ViewGroup {
    private static final Interpolator f723j = new DecelerateInterpolator();
    protected final C0342a f724a;
    protected final Context f725b;
    protected ActionMenuView f726c;
    protected C0407a f727d;
    protected ViewGroup f728e;
    protected boolean f729f;
    protected boolean f730g;
    protected int f731h;
    protected ak f732i;

    protected class C0342a implements an {
        int f891a;
        final /* synthetic */ C0321a f892b;
        private boolean f893c = false;

        protected C0342a(C0321a c0321a) {
            this.f892b = c0321a;
        }

        public void mo140a(View view) {
            this.f892b.setVisibility(0);
            this.f893c = false;
        }

        public void mo141b(View view) {
            if (!this.f893c) {
                this.f892b.f732i = null;
                this.f892b.setVisibility(this.f891a);
                if (this.f892b.f728e != null && this.f892b.f726c != null) {
                    this.f892b.f726c.setVisibility(this.f891a);
                }
            }
        }

        public void mo142c(View view) {
            this.f893c = true;
        }
    }

    C0321a(Context context) {
        this(context, null);
    }

    C0321a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    C0321a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f724a = new C0342a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C0266a.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f725b = context;
        } else {
            this.f725b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    protected static int m1495a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    protected int m1496a(View view, int i, int i2, int i3) {
        view.measure(MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    protected int m1497a(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public int getAnimatedVisibility() {
        return this.f732i != null ? this.f724a.f891a : getVisibility();
    }

    public int getContentHeight() {
        return this.f731h;
    }

    protected void onConfigurationChanged(Configuration configuration) {
        if (VERSION.SDK_INT >= 8) {
            super.onConfigurationChanged(configuration);
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, C0274i.ActionBar, C0266a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C0274i.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        if (this.f727d != null) {
            this.f727d.m1898a(configuration);
        }
    }

    public void setContentHeight(int i) {
        this.f731h = i;
        requestLayout();
    }

    public void setSplitToolbar(boolean z) {
        this.f729f = z;
    }

    public void setSplitView(ViewGroup viewGroup) {
        this.f728e = viewGroup;
    }

    public void setSplitWhenNarrow(boolean z) {
        this.f730g = z;
    }
}
