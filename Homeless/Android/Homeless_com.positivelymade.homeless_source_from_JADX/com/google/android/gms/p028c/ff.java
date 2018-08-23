package com.google.android.gms.p028c;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.p028c.fd.C0494a;
import com.google.android.gms.p028c.gd.C0973a;

@fn
public class ff extends fe {
    private Object f3013i = new Object();
    private PopupWindow f3014j;
    private boolean f3015k = false;

    ff(Context context, C0973a c0973a, hg hgVar, C0494a c0494a) {
        super(context, c0973a, hgVar, c0494a);
    }

    private void m4563d() {
        synchronized (this.f3013i) {
            this.f3015k = true;
            if ((this.c instanceof Activity) && ((Activity) this.c).isDestroyed()) {
                this.f3014j = null;
            }
            if (this.f3014j != null) {
                if (this.f3014j.isShowing()) {
                    this.f3014j.dismiss();
                }
                this.f3014j = null;
            }
        }
    }

    protected void mo722a(gd gdVar) {
        m4563d();
        super.mo722a(gdVar);
    }

    public void mo487b() {
        m4563d();
        super.mo487b();
    }

    protected void mo723c() {
        Window window = this.c instanceof Activity ? ((Activity) this.c).getWindow() : null;
        if (window != null && window.getDecorView() != null && !((Activity) this.c).isDestroyed()) {
            View frameLayout = new FrameLayout(this.c);
            frameLayout.setLayoutParams(new LayoutParams(-1, -1));
            frameLayout.addView(this.d.getWebView(), -1, -1);
            synchronized (this.f3013i) {
                if (this.f3015k) {
                    return;
                }
                this.f3014j = new PopupWindow(frameLayout, 1, 1, false);
                this.f3014j.setOutsideTouchable(true);
                this.f3014j.setClippingEnabled(false);
                C0691b.m3093a("Displaying the 1x1 popup off the screen.");
                try {
                    this.f3014j.showAtLocation(window.getDecorView(), 0, -1, -1);
                } catch (Exception e) {
                    this.f3014j = null;
                }
            }
        }
    }
}
