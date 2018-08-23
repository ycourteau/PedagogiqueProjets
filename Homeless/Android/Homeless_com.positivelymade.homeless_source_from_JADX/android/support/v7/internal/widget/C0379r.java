package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.internal.view.menu.C0295a;
import android.support.v7.p010b.C0275a.C0266a;
import android.support.v7.p010b.C0275a.C0269d;
import android.support.v7.p010b.C0275a.C0273h;
import android.support.v7.p010b.C0275a.C0274i;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.Window.Callback;

public class C0379r implements C0360g {
    private Toolbar f997a;
    private int f998b;
    private View f999c;
    private Drawable f1000d;
    private Drawable f1001e;
    private Drawable f1002f;
    private boolean f1003g;
    private CharSequence f1004h;
    private CharSequence f1005i;
    private CharSequence f1006j;
    private Callback f1007k;
    private boolean f1008l;
    private int f1009m;
    private final C0376p f1010n;
    private int f1011o;
    private Drawable f1012p;

    class C03781 implements OnClickListener {
        final C0295a f995a = new C0295a(this.f996b.f997a.getContext(), 0, 16908332, 0, 0, this.f996b.f1004h);
        final /* synthetic */ C0379r f996b;

        C03781(C0379r c0379r) {
            this.f996b = c0379r;
        }

        public void onClick(View view) {
            if (this.f996b.f1007k != null && this.f996b.f1008l) {
                this.f996b.f1007k.onMenuItemSelected(0, this.f995a);
            }
        }
    }

    public C0379r(Toolbar toolbar, boolean z) {
        this(toolbar, z, C0273h.abc_action_bar_up_description, C0269d.abc_ic_ab_back_mtrl_am_alpha);
    }

    public C0379r(Toolbar toolbar, boolean z, int i, int i2) {
        this.f1009m = 0;
        this.f1011o = 0;
        this.f997a = toolbar;
        this.f1004h = toolbar.getTitle();
        this.f1005i = toolbar.getSubtitle();
        this.f1003g = this.f1004h != null;
        this.f1002f = toolbar.getNavigationIcon();
        if (z) {
            C0377q a = C0377q.m1724a(toolbar.getContext(), null, C0274i.ActionBar, C0266a.actionBarStyle, 0);
            CharSequence b = a.m1731b(C0274i.ActionBar_title);
            if (!TextUtils.isEmpty(b)) {
                m1758b(b);
            }
            b = a.m1731b(C0274i.ActionBar_subtitle);
            if (!TextUtils.isEmpty(b)) {
                m1762c(b);
            }
            Drawable a2 = a.m1728a(C0274i.ActionBar_logo);
            if (a2 != null) {
                m1761c(a2);
            }
            a2 = a.m1728a(C0274i.ActionBar_icon);
            if (this.f1002f == null && a2 != null) {
                mo289a(a2);
            }
            a2 = a.m1728a(C0274i.ActionBar_homeAsUpIndicator);
            if (a2 != null) {
                m1764d(a2);
            }
            m1763d(a.m1727a(C0274i.ActionBar_displayOptions, 0));
            int f = a.m1739f(C0274i.ActionBar_customNavigationLayout, 0);
            if (f != 0) {
                m1751a(LayoutInflater.from(this.f997a.getContext()).inflate(f, this.f997a, false));
                m1763d(this.f998b | 16);
            }
            f = a.m1738e(C0274i.ActionBar_height, 0);
            if (f > 0) {
                LayoutParams layoutParams = this.f997a.getLayoutParams();
                layoutParams.height = f;
                this.f997a.setLayoutParams(layoutParams);
            }
            f = a.m1733c(C0274i.ActionBar_contentInsetStart, -1);
            int c = a.m1733c(C0274i.ActionBar_contentInsetEnd, -1);
            if (f >= 0 || c >= 0) {
                this.f997a.m1866a(Math.max(f, 0), Math.max(c, 0));
            }
            f = a.m1739f(C0274i.ActionBar_titleTextStyle, 0);
            if (f != 0) {
                this.f997a.m1867a(this.f997a.getContext(), f);
            }
            f = a.m1739f(C0274i.ActionBar_subtitleTextStyle, 0);
            if (f != 0) {
                this.f997a.m1869b(this.f997a.getContext(), f);
            }
            int f2 = a.m1739f(C0274i.ActionBar_popupTheme, 0);
            if (f2 != 0) {
                this.f997a.setPopupTheme(f2);
            }
            a.m1732b();
            this.f1010n = a.m1734c();
        } else {
            this.f998b = m1743d();
            this.f1010n = C0376p.m1706a(toolbar.getContext());
        }
        m1760c(i);
        this.f1006j = this.f997a.getNavigationContentDescription();
        m1757b(this.f1010n.m1718a(i2));
        this.f997a.setNavigationOnClickListener(new C03781(this));
    }

    private int m1743d() {
        return this.f997a.getNavigationIcon() != null ? 15 : 11;
    }

    private void m1745e() {
        Drawable drawable = null;
        if ((this.f998b & 2) != 0) {
            drawable = (this.f998b & 1) != 0 ? this.f1001e != null ? this.f1001e : this.f1000d : this.f1000d;
        }
        this.f997a.setLogo(drawable);
    }

    private void m1746e(CharSequence charSequence) {
        this.f1004h = charSequence;
        if ((this.f998b & 8) != 0) {
            this.f997a.setTitle(charSequence);
        }
    }

    private void m1747f() {
        if ((this.f998b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f1006j)) {
            this.f997a.setNavigationContentDescription(this.f1011o);
        } else {
            this.f997a.setNavigationContentDescription(this.f1006j);
        }
    }

    private void m1748g() {
        if ((this.f998b & 4) != 0) {
            this.f997a.setNavigationIcon(this.f1002f != null ? this.f1002f : this.f1012p);
        }
    }

    public void mo288a(int i) {
        mo289a(i != 0 ? this.f1010n.m1718a(i) : null);
    }

    public void mo289a(Drawable drawable) {
        this.f1000d = drawable;
        m1745e();
    }

    public void m1751a(View view) {
        if (!(this.f999c == null || (this.f998b & 16) == 0)) {
            this.f997a.removeView(this.f999c);
        }
        this.f999c = view;
        if (view != null && (this.f998b & 16) != 0) {
            this.f997a.addView(this.f999c);
        }
    }

    public void mo290a(Callback callback) {
        this.f1007k = callback;
    }

    public void mo291a(CharSequence charSequence) {
        if (!this.f1003g) {
            m1746e(charSequence);
        }
    }

    public boolean mo292a() {
        return false;
    }

    public CharSequence mo293b() {
        return this.f997a.getTitle();
    }

    public void mo294b(int i) {
        m1761c(i != 0 ? this.f1010n.m1718a(i) : null);
    }

    public void m1757b(Drawable drawable) {
        if (this.f1012p != drawable) {
            this.f1012p = drawable;
            m1748g();
        }
    }

    public void m1758b(CharSequence charSequence) {
        this.f1003g = true;
        m1746e(charSequence);
    }

    public Context m1759c() {
        return this.f997a.getContext();
    }

    public void m1760c(int i) {
        if (i != this.f1011o) {
            this.f1011o = i;
            if (TextUtils.isEmpty(this.f997a.getNavigationContentDescription())) {
                m1766e(this.f1011o);
            }
        }
    }

    public void m1761c(Drawable drawable) {
        this.f1001e = drawable;
        m1745e();
    }

    public void m1762c(CharSequence charSequence) {
        this.f1005i = charSequence;
        if ((this.f998b & 8) != 0) {
            this.f997a.setSubtitle(charSequence);
        }
    }

    public void m1763d(int i) {
        int i2 = this.f998b ^ i;
        this.f998b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m1748g();
                    m1747f();
                } else {
                    this.f997a.setNavigationIcon(null);
                }
            }
            if ((i2 & 3) != 0) {
                m1745e();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f997a.setTitle(this.f1004h);
                    this.f997a.setSubtitle(this.f1005i);
                } else {
                    this.f997a.setTitle(null);
                    this.f997a.setSubtitle(null);
                }
            }
            if ((i2 & 16) != 0 && this.f999c != null) {
                if ((i & 16) != 0) {
                    this.f997a.addView(this.f999c);
                } else {
                    this.f997a.removeView(this.f999c);
                }
            }
        }
    }

    public void m1764d(Drawable drawable) {
        this.f1002f = drawable;
        m1748g();
    }

    public void m1765d(CharSequence charSequence) {
        this.f1006j = charSequence;
        m1747f();
    }

    public void m1766e(int i) {
        m1765d(i == 0 ? null : m1759c().getString(i));
    }
}
