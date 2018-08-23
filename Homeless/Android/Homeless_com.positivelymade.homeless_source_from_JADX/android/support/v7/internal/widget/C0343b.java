package android.support.v7.internal.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

class C0343b extends Drawable {
    final ActionBarContainer f894a;

    public C0343b(ActionBarContainer actionBarContainer) {
        this.f894a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        if (!this.f894a.f716d) {
            if (this.f894a.f713a != null) {
                this.f894a.f713a.draw(canvas);
            }
            if (this.f894a.f714b != null && this.f894a.f717e) {
                this.f894a.f714b.draw(canvas);
            }
        } else if (this.f894a.f715c != null) {
            this.f894a.f715c.draw(canvas);
        }
    }

    public int getOpacity() {
        return 0;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
