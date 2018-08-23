package android.support.v7.internal.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

public class C0373n extends ContextWrapper {
    private Resources f974a;

    static class C0372a extends C0364j {
        private final C0376p f973a;

        public C0372a(Resources resources, C0376p c0376p) {
            super(resources);
            this.f973a = c0376p;
        }

        public Drawable getDrawable(int i) {
            Drawable drawable = super.getDrawable(i);
            if (drawable != null) {
                this.f973a.m1720a(i, drawable);
            }
            return drawable;
        }
    }

    private C0373n(Context context) {
        super(context);
    }

    public static Context m1701a(Context context) {
        return !(context instanceof C0373n) ? new C0373n(context) : context;
    }

    public Resources getResources() {
        if (this.f974a == null) {
            this.f974a = new C0372a(super.getResources(), C0376p.m1706a((Context) this));
        }
        return this.f974a;
    }
}
