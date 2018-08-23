package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import com.google.android.gms.ads.internal.client.C0526n;
import com.google.android.gms.p028c.fn;

@fn
public class C0615m extends FrameLayout implements OnClickListener {
    private final ImageButton f1673a;
    private final C0607o f1674b;

    public C0615m(Context context, int i, C0607o c0607o) {
        super(context);
        this.f1674b = c0607o;
        setOnClickListener(this);
        this.f1673a = new ImageButton(context);
        this.f1673a.setImageResource(17301527);
        this.f1673a.setBackgroundColor(0);
        this.f1673a.setOnClickListener(this);
        this.f1673a.setPadding(0, 0, 0, 0);
        this.f1673a.setContentDescription("Interstitial close button");
        int a = C0526n.m2400a().m3079a(context, i);
        addView(this.f1673a, new LayoutParams(a, a, 17));
    }

    public void m2779a(boolean z, boolean z2) {
        if (!z2) {
            this.f1673a.setVisibility(0);
        } else if (z) {
            this.f1673a.setVisibility(4);
        } else {
            this.f1673a.setVisibility(8);
        }
    }

    public void onClick(View view) {
        if (this.f1674b != null) {
            this.f1674b.mo468d();
        }
    }
}
