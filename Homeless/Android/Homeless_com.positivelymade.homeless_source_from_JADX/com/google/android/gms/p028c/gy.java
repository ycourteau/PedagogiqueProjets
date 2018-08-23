package com.google.android.gms.p028c;

import android.app.Activity;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.ads.internal.C0618p;

public final class gy {
    private Activity f3429a;
    private boolean f3430b;
    private boolean f3431c;
    private boolean f3432d;
    private OnGlobalLayoutListener f3433e;
    private OnScrollChangedListener f3434f;

    public gy(Activity activity, OnGlobalLayoutListener onGlobalLayoutListener, OnScrollChangedListener onScrollChangedListener) {
        this.f3429a = activity;
        this.f3433e = onGlobalLayoutListener;
        this.f3434f = onScrollChangedListener;
    }

    private void m4971e() {
        if (this.f3429a != null && !this.f3430b) {
            if (this.f3433e != null) {
                C0618p.m2796e().m4852a(this.f3429a, this.f3433e);
            }
            if (this.f3434f != null) {
                C0618p.m2796e().m4853a(this.f3429a, this.f3434f);
            }
            this.f3430b = true;
        }
    }

    private void m4972f() {
        if (this.f3429a != null && this.f3430b) {
            if (this.f3433e != null) {
                C0618p.m2798g().mo750a(this.f3429a, this.f3433e);
            }
            if (this.f3434f != null) {
                C0618p.m2796e().m4870b(this.f3429a, this.f3434f);
            }
            this.f3430b = false;
        }
    }

    public void m4973a() {
        this.f3432d = true;
        if (this.f3431c) {
            m4971e();
        }
    }

    public void m4974a(Activity activity) {
        this.f3429a = activity;
    }

    public void m4975b() {
        this.f3432d = false;
        m4972f();
    }

    public void m4976c() {
        this.f3431c = true;
        if (this.f3432d) {
            m4971e();
        }
    }

    public void m4977d() {
        this.f3431c = false;
        m4972f();
    }
}
