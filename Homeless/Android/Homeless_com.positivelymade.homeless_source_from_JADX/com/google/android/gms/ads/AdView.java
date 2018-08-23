package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.C0428a;
import com.google.android.gms.ads.internal.client.ab;
import com.google.android.gms.ads.purchase.C0694b;

public final class AdView extends ViewGroup {
    private final ab f1245a;

    public AdView(Context context) {
        super(context);
        this.f1245a = new ab(this);
    }

    public AdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1245a = new ab(this, attributeSet, false);
    }

    public AdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1245a = new ab(this, attributeSet, false);
    }

    public void m2047a() {
        this.f1245a.m2322a();
    }

    public void m2048a(C0476c c0476c) {
        this.f1245a.m2327a(c0476c.m2109a());
    }

    public void m2049b() {
        this.f1245a.m2340i();
    }

    public void m2050c() {
        this.f1245a.m2341j();
    }

    public C0427a getAdListener() {
        return this.f1245a.m2332b();
    }

    public C0483d getAdSize() {
        return this.f1245a.m2334c();
    }

    public String getAdUnitId() {
        return this.f1245a.m2336e();
    }

    public C0694b getInAppPurchaseListener() {
        return this.f1245a.m2338g();
    }

    public String getMediationAdapterClassName() {
        return this.f1245a.m2342k();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = ((i3 - i) - measuredWidth) / 2;
            int i6 = ((i4 - i2) - measuredHeight) / 2;
            childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
        }
    }

    protected void onMeasure(int i, int i2) {
        int b;
        int i3 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            C0483d adSize = getAdSize();
            if (adSize != null) {
                Context context = getContext();
                b = adSize.m2140b(context);
                i3 = adSize.m2138a(context);
            } else {
                b = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            b = childAt.getMeasuredWidth();
            i3 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(b, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i3, getSuggestedMinimumHeight()), i2));
    }

    public void setAdListener(C0427a c0427a) {
        this.f1245a.m2325a(c0427a);
        if (c0427a != null && (c0427a instanceof C0428a)) {
            this.f1245a.m2326a((C0428a) c0427a);
        } else if (c0427a == null) {
            this.f1245a.m2326a(null);
        }
    }

    public void setAdSize(C0483d c0483d) {
        this.f1245a.m2331a(c0483d);
    }

    public void setAdUnitId(String str) {
        this.f1245a.m2329a(str);
    }

    public void setInAppPurchaseListener(C0694b c0694b) {
        this.f1245a.m2328a(c0694b);
    }
}
