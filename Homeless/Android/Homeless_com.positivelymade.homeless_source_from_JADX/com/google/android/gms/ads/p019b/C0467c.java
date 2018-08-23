package com.google.android.gms.ads.p019b;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.p028c.bn;
import com.google.android.gms.p029b.C0799a;

public abstract class C0467c extends FrameLayout {
    private final FrameLayout f1255a;
    private final bn f1256b;

    public void addView(View view, int i, LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.f1255a);
    }

    public void bringChildToFront(View view) {
        super.bringChildToFront(view);
        if (this.f1255a != view) {
            super.bringChildToFront(this.f1255a);
        }
    }

    public void removeAllViews() {
        super.removeAllViews();
        super.addView(this.f1255a);
    }

    public void removeView(View view) {
        if (this.f1255a != view) {
            super.removeView(view);
        }
    }

    public void setNativeAd(C0463a c0463a) {
        try {
            this.f1256b.m3949a((C0799a) c0463a.mo601a());
        } catch (Throwable e) {
            C0691b.m3098b("Unable to call setNativeAd on delegate", e);
        }
    }
}
