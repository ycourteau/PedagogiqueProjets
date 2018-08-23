package android.support.v7.internal.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.v7.p010b.C0275a.C0274i;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.PopupWindow;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

public class C0359f extends PopupWindow {
    private final boolean f924a;

    public C0359f(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0377q a = C0377q.m1724a(context, attributeSet, C0274i.PopupWindow, i, 0);
        this.f924a = a.m1729a(C0274i.PopupWindow_overlapAnchor, false);
        setBackgroundDrawable(a.m1728a(C0274i.PopupWindow_android_popupBackground));
        a.m1732b();
        if (VERSION.SDK_INT < 14) {
            C0359f.m1659a(this);
        }
    }

    private static void m1659a(final PopupWindow popupWindow) {
        try {
            final Field declaredField = PopupWindow.class.getDeclaredField("mAnchor");
            declaredField.setAccessible(true);
            Field declaredField2 = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            declaredField2.setAccessible(true);
            final OnScrollChangedListener onScrollChangedListener = (OnScrollChangedListener) declaredField2.get(popupWindow);
            declaredField2.set(popupWindow, new OnScrollChangedListener() {
                public void onScrollChanged() {
                    try {
                        WeakReference weakReference = (WeakReference) declaredField.get(popupWindow);
                        if (weakReference != null && weakReference.get() != null) {
                            onScrollChangedListener.onScrollChanged();
                        }
                    } catch (IllegalAccessException e) {
                    }
                }
            });
        } catch (Throwable e) {
            Log.d("AppCompatPopupWindow", "Exception while installing workaround OnScrollChangedListener", e);
        }
    }

    public void showAsDropDown(View view, int i, int i2) {
        if (VERSION.SDK_INT < 21 && this.f924a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @TargetApi(19)
    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (VERSION.SDK_INT < 21 && this.f924a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    public void update(View view, int i, int i2, int i3, int i4) {
        int height = (VERSION.SDK_INT >= 21 || !this.f924a) ? i2 : i2 - view.getHeight();
        super.update(view, i, height, i3, i4);
    }
}
