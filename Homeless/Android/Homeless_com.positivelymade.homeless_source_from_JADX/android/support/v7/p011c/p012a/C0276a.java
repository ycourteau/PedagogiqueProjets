package android.support.v7.p011c.p012a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.support.v4.p001b.p002a.C0056a;

public class C0276a extends Drawable implements Callback {
    private Drawable f477a;

    public C0276a(Drawable drawable) {
        m1225a(drawable);
    }

    public void m1225a(Drawable drawable) {
        if (this.f477a != null) {
            this.f477a.setCallback(null);
        }
        this.f477a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f477a.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f477a.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f477a.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f477a.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f477a.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f477a.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f477a.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f477a.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f477a.getPadding(rect);
    }

    public int[] getState() {
        return this.f477a.getState();
    }

    public Region getTransparentRegion() {
        return this.f477a.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return C0056a.m385b(this.f477a);
    }

    public boolean isStateful() {
        return this.f477a.isStateful();
    }

    public void jumpToCurrentState() {
        C0056a.m378a(this.f477a);
    }

    protected void onBoundsChange(Rect rect) {
        this.f477a.setBounds(rect);
    }

    protected boolean onLevelChange(int i) {
        return this.f477a.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f477a.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        C0056a.m384a(this.f477a, z);
    }

    public void setChangingConfigurations(int i) {
        this.f477a.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f477a.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f477a.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f477a.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        C0056a.m379a(this.f477a, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        C0056a.m381a(this.f477a, i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.f477a.setState(iArr);
    }

    public void setTint(int i) {
        C0056a.m380a(this.f477a, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        C0056a.m382a(this.f477a, colorStateList);
    }

    public void setTintMode(Mode mode) {
        C0056a.m383a(this.f477a, mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f477a.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
