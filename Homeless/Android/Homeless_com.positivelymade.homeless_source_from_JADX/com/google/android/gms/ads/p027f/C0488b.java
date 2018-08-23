package com.google.android.gms.ads.p027f;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.C0427a;
import com.google.android.gms.ads.C0483d;
import com.google.android.gms.ads.internal.client.ab;

public final class C0488b extends ViewGroup {
    private final ab f1303a;

    public C0427a getAdListener() {
        return this.f1303a.m2332b();
    }

    public C0483d getAdSize() {
        return this.f1303a.m2334c();
    }

    public String getAdUnitId() {
        return this.f1303a.m2336e();
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
        this.f1303a.m2325a(c0427a);
    }

    public void setAdSize(C0483d c0483d) {
        this.f1303a.m2331a(c0483d);
    }

    public void setAdUnitId(String str) {
        this.f1303a.m2329a(str);
    }
}
