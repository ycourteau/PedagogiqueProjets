package android.support.v7.internal.widget;

import android.graphics.Outline;

class C0344c extends C0343b {
    public C0344c(ActionBarContainer actionBarContainer) {
        super(actionBarContainer);
    }

    public void getOutline(Outline outline) {
        if (this.a.f716d) {
            if (this.a.f715c != null) {
                this.a.f715c.getOutline(outline);
            }
        } else if (this.a.f713a != null) {
            this.a.f713a.getOutline(outline);
        }
    }
}
