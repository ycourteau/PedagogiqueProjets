package android.support.v4.p001b.p002a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;

class C0063h extends Drawable implements Callback, C0062g {
    static final Mode f245a = Mode.SRC_IN;
    Drawable f246b;
    private ColorStateList f247c;
    private Mode f248d = f245a;
    private int f249e;
    private Mode f250f;
    private boolean f251g;

    C0063h(Drawable drawable) {
        m404a(drawable);
    }

    private boolean m403a(int[] iArr) {
        if (!(this.f247c == null || this.f248d == null)) {
            int colorForState = this.f247c.getColorForState(iArr, this.f247c.getDefaultColor());
            Mode mode = this.f248d;
            if (!(this.f251g && colorForState == this.f249e && mode == this.f250f)) {
                setColorFilter(colorForState, mode);
                this.f249e = colorForState;
                this.f250f = mode;
                this.f251g = true;
                return true;
            }
        }
        return false;
    }

    public void m404a(Drawable drawable) {
        if (this.f246b != null) {
            this.f246b.setCallback(null);
        }
        this.f246b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        this.f246b.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f246b.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f246b.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f246b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f246b.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f246b.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f246b.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f246b.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f246b.getPadding(rect);
    }

    public int[] getState() {
        return this.f246b.getState();
    }

    public Region getTransparentRegion() {
        return this.f246b.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isStateful() {
        return (this.f247c != null && this.f247c.isStateful()) || this.f246b.isStateful();
    }

    public Drawable mutate() {
        Drawable drawable = this.f246b;
        Drawable mutate = drawable.mutate();
        if (mutate != drawable) {
            m404a(mutate);
        }
        return this;
    }

    protected void onBoundsChange(Rect rect) {
        this.f246b.setBounds(rect);
    }

    protected boolean onLevelChange(int i) {
        return this.f246b.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f246b.setAlpha(i);
    }

    public void setChangingConfigurations(int i) {
        this.f246b.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f246b.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f246b.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f246b.setFilterBitmap(z);
    }

    public boolean setState(int[] iArr) {
        return m403a(iArr) || this.f246b.setState(iArr);
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f247c = colorStateList;
        m403a(getState());
    }

    public void setTintMode(Mode mode) {
        this.f248d = mode;
        m403a(getState());
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f246b.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
