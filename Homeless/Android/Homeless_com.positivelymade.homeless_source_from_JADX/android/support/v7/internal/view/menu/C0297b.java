package android.support.v7.internal.view.menu;

import android.content.Context;
import android.support.v4.view.C0233z;
import android.support.v7.internal.view.menu.C0294k.C0291a;
import android.support.v7.internal.view.menu.C0296j.C0313a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public abstract class C0297b implements C0296j {
    protected Context f577a;
    protected Context f578b;
    protected C0301e f579c;
    protected LayoutInflater f580d;
    protected LayoutInflater f581e;
    protected C0294k f582f;
    private C0313a f583g;
    private int f584h;
    private int f585i;

    public C0297b(Context context, int i, int i2) {
        this.f577a = context;
        this.f580d = LayoutInflater.from(context);
        this.f584h = i;
        this.f585i = i2;
    }

    public C0313a m1317a() {
        return this.f583g;
    }

    public C0294k mo311a(ViewGroup viewGroup) {
        if (this.f582f == null) {
            this.f582f = (C0294k) this.f580d.inflate(this.f584h, viewGroup, false);
            this.f582f.mo210a(this.f579c);
            mo227b(true);
        }
        return this.f582f;
    }

    public View mo312a(C0303f c0303f, View view, ViewGroup viewGroup) {
        C0291a b = view instanceof C0291a ? (C0291a) view : m1329b(viewGroup);
        mo313a(c0303f, b);
        return (View) b;
    }

    public void mo223a(Context context, C0301e c0301e) {
        this.f578b = context;
        this.f581e = LayoutInflater.from(this.f578b);
        this.f579c = c0301e;
    }

    public void mo224a(C0301e c0301e, boolean z) {
        if (this.f583g != null) {
            this.f583g.mo295a(c0301e, z);
        }
    }

    public abstract void mo313a(C0303f c0303f, C0291a c0291a);

    public void m1323a(C0313a c0313a) {
        this.f583g = c0313a;
    }

    protected void m1324a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f582f).addView(view, i);
    }

    public boolean mo315a(int i, C0303f c0303f) {
        return true;
    }

    public boolean mo225a(C0301e c0301e, C0303f c0303f) {
        return false;
    }

    public boolean mo226a(C0316n c0316n) {
        return this.f583g != null ? this.f583g.mo296a(c0316n) : false;
    }

    protected boolean mo316a(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    public C0291a m1329b(ViewGroup viewGroup) {
        return (C0291a) this.f580d.inflate(this.f585i, viewGroup, false);
    }

    public void mo227b(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f582f;
        if (viewGroup != null) {
            int i;
            if (this.f579c != null) {
                this.f579c.m1377i();
                ArrayList h = this.f579c.m1376h();
                int size = h.size();
                int i2 = 0;
                i = 0;
                while (i2 < size) {
                    int i3;
                    C0303f c0303f = (C0303f) h.get(i2);
                    if (mo315a(i, c0303f)) {
                        View childAt = viewGroup.getChildAt(i);
                        C0303f itemData = childAt instanceof C0291a ? ((C0291a) childAt).getItemData() : null;
                        View a = mo312a(c0303f, childAt, viewGroup);
                        if (c0303f != itemData) {
                            a.setPressed(false);
                            C0233z.m1097k(a);
                        }
                        if (a != childAt) {
                            m1324a(a, i);
                        }
                        i3 = i + 1;
                    } else {
                        i3 = i;
                    }
                    i2++;
                    i = i3;
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (!mo316a(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    public boolean mo228b() {
        return false;
    }

    public boolean mo229b(C0301e c0301e, C0303f c0303f) {
        return false;
    }
}
