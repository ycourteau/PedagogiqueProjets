package com.google.android.gms.games.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.view.Display;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.google.android.gms.p028c.is;
import java.lang.ref.WeakReference;

public class C1862i {
    protected C1852c f5614a;
    protected C1861a f5615b;

    public static final class C1861a {
        public IBinder f5607a;
        public int f5608b;
        public int f5609c;
        public int f5610d;
        public int f5611e;
        public int f5612f;
        public int f5613g;

        private C1861a(int i, IBinder iBinder) {
            this.f5609c = -1;
            this.f5610d = 0;
            this.f5611e = 0;
            this.f5612f = 0;
            this.f5613g = 0;
            this.f5608b = i;
            this.f5607a = iBinder;
        }

        public Bundle m9134a() {
            Bundle bundle = new Bundle();
            bundle.putInt("popupLocationInfo.gravity", this.f5608b);
            bundle.putInt("popupLocationInfo.displayId", this.f5609c);
            bundle.putInt("popupLocationInfo.left", this.f5610d);
            bundle.putInt("popupLocationInfo.top", this.f5611e);
            bundle.putInt("popupLocationInfo.right", this.f5612f);
            bundle.putInt("popupLocationInfo.bottom", this.f5613g);
            return bundle;
        }
    }

    private static final class C1863b extends C1862i implements OnAttachStateChangeListener, OnGlobalLayoutListener {
        private WeakReference<View> f5616c;
        private boolean f5617d = false;

        protected C1863b(C1852c c1852c, int i) {
            super(c1852c, i);
        }

        private void m9142b(View view) {
            int i = -1;
            if (is.m5290f()) {
                Display display = view.getDisplay();
                if (display != null) {
                    i = display.getDisplayId();
                }
            }
            IBinder windowToken = view.getWindowToken();
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int width = view.getWidth();
            int height = view.getHeight();
            this.b.f5609c = i;
            this.b.f5607a = windowToken;
            this.b.f5610d = iArr[0];
            this.b.f5611e = iArr[1];
            this.b.f5612f = iArr[0] + width;
            this.b.f5613g = iArr[1] + height;
            if (this.f5617d) {
                mo1545a();
                this.f5617d = false;
            }
        }

        public void mo1545a() {
            if (this.b.f5607a != null) {
                super.mo1545a();
            } else {
                this.f5617d = this.f5616c != null;
            }
        }

        protected void mo1546a(int i) {
            this.b = new C1861a(i, null);
        }

        public void mo1547a(View view) {
            View view2;
            Context k;
            this.a.m8646t();
            if (this.f5616c != null) {
                view2 = (View) this.f5616c.get();
                k = this.a.m2989k();
                if (view2 == null && (k instanceof Activity)) {
                    view2 = ((Activity) k).getWindow().getDecorView();
                }
                if (view2 != null) {
                    view2.removeOnAttachStateChangeListener(this);
                    ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                    if (is.m5289e()) {
                        viewTreeObserver.removeOnGlobalLayoutListener(this);
                    } else {
                        viewTreeObserver.removeGlobalOnLayoutListener(this);
                    }
                }
            }
            this.f5616c = null;
            k = this.a.m2989k();
            if (view == null && (k instanceof Activity)) {
                view2 = ((Activity) k).findViewById(16908290);
                if (view2 == null) {
                    view2 = ((Activity) k).getWindow().getDecorView();
                }
                C1853d.m8647a("PopupManager", "You have not specified a View to use as content view for popups. Falling back to the Activity content view. Note that this may not work as expected in multi-screen environments");
                view = view2;
            }
            if (view != null) {
                m9142b(view);
                this.f5616c = new WeakReference(view);
                view.addOnAttachStateChangeListener(this);
                view.getViewTreeObserver().addOnGlobalLayoutListener(this);
                return;
            }
            C1853d.m8649b("PopupManager", "No content view usable to display popups. Popups will not be displayed in response to this client's calls. Use setViewForPopups() to set your content view.");
        }

        public void onGlobalLayout() {
            if (this.f5616c != null) {
                View view = (View) this.f5616c.get();
                if (view != null) {
                    m9142b(view);
                }
            }
        }

        public void onViewAttachedToWindow(View view) {
            m9142b(view);
        }

        public void onViewDetachedFromWindow(View view) {
            this.a.m8646t();
            view.removeOnAttachStateChangeListener(this);
        }
    }

    private C1862i(C1852c c1852c, int i) {
        this.f5614a = c1852c;
        mo1546a(i);
    }

    public static C1862i m9135a(C1852c c1852c, int i) {
        return is.m5286b() ? new C1863b(c1852c, i) : new C1862i(c1852c, i);
    }

    public void mo1545a() {
        this.f5614a.m8627a(this.f5615b.f5607a, this.f5615b.m9134a());
    }

    protected void mo1546a(int i) {
        this.f5615b = new C1861a(i, new Binder());
    }

    public void mo1547a(View view) {
    }

    public Bundle m9139b() {
        return this.f5615b.m9134a();
    }

    public IBinder m9140c() {
        return this.f5615b.f5607a;
    }

    public C1861a m9141d() {
        return this.f5615b;
    }
}
