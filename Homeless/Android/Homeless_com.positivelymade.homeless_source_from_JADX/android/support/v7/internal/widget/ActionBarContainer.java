package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.internal.C0279a;
import android.support.v7.p010b.C0275a.C0270e;
import android.support.v7.p010b.C0275a.C0274i;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

public class ActionBarContainer extends FrameLayout {
    Drawable f713a;
    Drawable f714b;
    Drawable f715c;
    boolean f716d;
    boolean f717e;
    private boolean f718f;
    private View f719g;
    private View f720h;
    private View f721i;
    private int f722j;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackgroundDrawable(C0279a.m1228a() ? new C0344c(this) : new C0343b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0274i.ActionBar);
        this.f713a = obtainStyledAttributes.getDrawable(C0274i.ActionBar_background);
        this.f714b = obtainStyledAttributes.getDrawable(C0274i.ActionBar_backgroundStacked);
        this.f722j = obtainStyledAttributes.getDimensionPixelSize(C0274i.ActionBar_height, -1);
        if (getId() == C0270e.split_action_bar) {
            this.f716d = true;
            this.f715c = obtainStyledAttributes.getDrawable(C0274i.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        boolean z = this.f716d ? this.f715c == null : this.f713a == null && this.f714b == null;
        setWillNotDraw(z);
    }

    private boolean m1493a(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    private int m1494b(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        return layoutParams.bottomMargin + (view.getMeasuredHeight() + layoutParams.topMargin);
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f713a != null && this.f713a.isStateful()) {
            this.f713a.setState(getDrawableState());
        }
        if (this.f714b != null && this.f714b.isStateful()) {
            this.f714b.setState(getDrawableState());
        }
        if (this.f715c != null && this.f715c.isStateful()) {
            this.f715c.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f719g;
    }

    public void jumpDrawablesToCurrentState() {
        if (VERSION.SDK_INT >= 11) {
            super.jumpDrawablesToCurrentState();
            if (this.f713a != null) {
                this.f713a.jumpToCurrentState();
            }
            if (this.f714b != null) {
                this.f714b.jumpToCurrentState();
            }
            if (this.f715c != null) {
                this.f715c.jumpToCurrentState();
            }
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f720h = findViewById(C0270e.action_bar);
        this.f721i = findViewById(C0270e.action_context_bar);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f718f || super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = 1;
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f719g;
        boolean z2 = (view == null || view.getVisibility() == 8) ? false : true;
        if (!(view == null || view.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            view.layout(i, (measuredHeight - view.getMeasuredHeight()) - layoutParams.bottomMargin, i3, measuredHeight - layoutParams.bottomMargin);
        }
        if (!this.f716d) {
            int i6;
            if (this.f713a != null) {
                if (this.f720h.getVisibility() == 0) {
                    this.f713a.setBounds(this.f720h.getLeft(), this.f720h.getTop(), this.f720h.getRight(), this.f720h.getBottom());
                } else if (this.f721i == null || this.f721i.getVisibility() != 0) {
                    this.f713a.setBounds(0, 0, 0, 0);
                } else {
                    this.f713a.setBounds(this.f721i.getLeft(), this.f721i.getTop(), this.f721i.getRight(), this.f721i.getBottom());
                }
                i6 = 1;
            } else {
                i6 = 0;
            }
            this.f717e = z2;
            if (!z2 || this.f714b == null) {
                i5 = i6;
            } else {
                this.f714b.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        } else if (this.f715c != null) {
            this.f715c.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        } else {
            i5 = 0;
        }
        if (i5 != 0) {
            invalidate();
        }
    }

    public void onMeasure(int i, int i2) {
        if (this.f720h == null && MeasureSpec.getMode(i2) == Integer.MIN_VALUE && this.f722j >= 0) {
            i2 = MeasureSpec.makeMeasureSpec(Math.min(this.f722j, MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f720h != null) {
            int mode = MeasureSpec.getMode(i2);
            if (this.f719g != null && this.f719g.getVisibility() != 8 && mode != 1073741824) {
                int b = !m1493a(this.f720h) ? m1494b(this.f720h) : !m1493a(this.f721i) ? m1494b(this.f721i) : 0;
                setMeasuredDimension(getMeasuredWidth(), Math.min(b + m1494b(this.f719g), mode == Integer.MIN_VALUE ? MeasureSpec.getSize(i2) : Integer.MAX_VALUE));
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        boolean z = true;
        if (this.f713a != null) {
            this.f713a.setCallback(null);
            unscheduleDrawable(this.f713a);
        }
        this.f713a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f720h != null) {
                this.f713a.setBounds(this.f720h.getLeft(), this.f720h.getTop(), this.f720h.getRight(), this.f720h.getBottom());
            }
        }
        if (this.f716d) {
            if (this.f715c != null) {
                z = false;
            }
        } else if (!(this.f713a == null && this.f714b == null)) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setSplitBackground(Drawable drawable) {
        boolean z = true;
        if (this.f715c != null) {
            this.f715c.setCallback(null);
            unscheduleDrawable(this.f715c);
        }
        this.f715c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f716d && this.f715c != null) {
                this.f715c.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (this.f716d) {
            if (this.f715c != null) {
                z = false;
            }
        } else if (!(this.f713a == null && this.f714b == null)) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setStackedBackground(Drawable drawable) {
        boolean z = true;
        if (this.f714b != null) {
            this.f714b.setCallback(null);
            unscheduleDrawable(this.f714b);
        }
        this.f714b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f717e && this.f714b != null) {
                this.f714b.setBounds(this.f719g.getLeft(), this.f719g.getTop(), this.f719g.getRight(), this.f719g.getBottom());
            }
        }
        if (this.f716d) {
            if (this.f715c != null) {
                z = false;
            }
        } else if (!(this.f713a == null && this.f714b == null)) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setTabContainer(C0370l c0370l) {
        if (this.f719g != null) {
            removeView(this.f719g);
        }
        this.f719g = c0370l;
        if (c0370l != null) {
            addView(c0370l);
            ViewGroup.LayoutParams layoutParams = c0370l.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            c0370l.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f718f = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        if (this.f713a != null) {
            this.f713a.setVisible(z, false);
        }
        if (this.f714b != null) {
            this.f714b.setVisible(z, false);
        }
        if (this.f715c != null) {
            this.f715c.setVisible(z, false);
        }
    }

    public ActionMode startActionModeForChild(View view, Callback callback) {
        return null;
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f713a && !this.f716d) || ((drawable == this.f714b && this.f717e) || ((drawable == this.f715c && this.f716d) || super.verifyDrawable(drawable)));
    }
}
