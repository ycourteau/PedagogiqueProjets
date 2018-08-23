package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.p003c.p004a.C0069b;
import android.support.v4.view.C0174d;
import android.support.v4.view.C0174d.C0173b;
import android.support.v4.view.C0206p.C0205e;
import android.support.v7.internal.view.menu.C0294k.C0291a;
import android.support.v7.internal.widget.C0376p;
import android.support.v7.p010b.C0275a.C0274i;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug.CapturedViewProperty;
import android.widget.LinearLayout;

public final class C0303f implements C0069b {
    private static String f616w;
    private static String f617x;
    private static String f618y;
    private static String f619z;
    private final int f620a;
    private final int f621b;
    private final int f622c;
    private final int f623d;
    private CharSequence f624e;
    private CharSequence f625f;
    private Intent f626g;
    private char f627h;
    private char f628i;
    private Drawable f629j;
    private int f630k = 0;
    private C0301e f631l;
    private C0316n f632m;
    private Runnable f633n;
    private OnMenuItemClickListener f634o;
    private int f635p = 16;
    private int f636q = 0;
    private View f637r;
    private C0174d f638s;
    private C0205e f639t;
    private boolean f640u = false;
    private ContextMenuInfo f641v;

    class C03021 implements C0173b {
        final /* synthetic */ C0303f f615a;

        C03021(C0303f c0303f) {
            this.f615a = c0303f;
        }

        public void mo230a(boolean z) {
            this.f615a.f631l.m1356a(this.f615a);
        }
    }

    C0303f(C0301e c0301e, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f631l = c0301e;
        this.f620a = i2;
        this.f621b = i;
        this.f622c = i3;
        this.f623d = i4;
        this.f624e = charSequence;
        this.f636q = i5;
    }

    public C0069b m1385a(int i) {
        Context d = this.f631l.m1371d();
        m1388a(LayoutInflater.from(d).inflate(i, new LinearLayout(d), false));
        return this;
    }

    public C0069b mo212a(C0174d c0174d) {
        if (this.f638s != null) {
            this.f638s.mo240a(null);
        }
        this.f637r = null;
        this.f638s = c0174d;
        this.f631l.m1367b(true);
        if (this.f638s != null) {
            this.f638s.mo240a(new C03021(this));
        }
        return this;
    }

    public C0069b mo213a(C0205e c0205e) {
        this.f639t = c0205e;
        return this;
    }

    public C0069b m1388a(View view) {
        this.f637r = view;
        this.f638s = null;
        if (view != null && view.getId() == -1 && this.f620a > 0) {
            view.setId(this.f620a);
        }
        this.f631l.m1366b(this);
        return this;
    }

    public C0174d mo214a() {
        return this.f638s;
    }

    CharSequence m1390a(C0291a c0291a) {
        return (c0291a == null || !c0291a.mo206a()) ? getTitle() : getTitleCondensed();
    }

    void m1391a(C0316n c0316n) {
        this.f632m = c0316n;
        c0316n.setHeaderTitle(getTitle());
    }

    void m1392a(ContextMenuInfo contextMenuInfo) {
        this.f641v = contextMenuInfo;
    }

    public void m1393a(boolean z) {
        this.f635p = (z ? 4 : 0) | (this.f635p & -5);
    }

    public C0069b m1394b(int i) {
        setShowAsAction(i);
        return this;
    }

    void m1395b(boolean z) {
        int i = this.f635p;
        this.f635p = (z ? 2 : 0) | (this.f635p & -3);
        if (i != this.f635p) {
            this.f631l.m1367b(false);
        }
    }

    public boolean m1396b() {
        if ((this.f634o != null && this.f634o.onMenuItemClick(this)) || this.f631l.mo246a(this.f631l.mo250l(), (MenuItem) this)) {
            return true;
        }
        if (this.f633n != null) {
            this.f633n.run();
            return true;
        }
        if (this.f626g != null) {
            try {
                this.f631l.m1371d().startActivity(this.f626g);
                return true;
            } catch (Throwable e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        return this.f638s != null && this.f638s.mo233d();
    }

    public int m1397c() {
        return this.f623d;
    }

    boolean m1398c(boolean z) {
        int i = this.f635p;
        this.f635p = (z ? 0 : 8) | (this.f635p & -9);
        return i != this.f635p;
    }

    public boolean collapseActionView() {
        return (this.f636q & 8) == 0 ? false : this.f637r == null ? true : (this.f639t == null || this.f639t.mo238b(this)) ? this.f631l.mo249d(this) : false;
    }

    char m1399d() {
        return this.f631l.mo245a() ? this.f628i : this.f627h;
    }

    public void m1400d(boolean z) {
        if (z) {
            this.f635p |= 32;
        } else {
            this.f635p &= -33;
        }
    }

    String m1401e() {
        char d = m1399d();
        if (d == '\u0000') {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder(f616w);
        switch (d) {
            case '\b':
                stringBuilder.append(f618y);
                break;
            case '\n':
                stringBuilder.append(f617x);
                break;
            case C0274i.Theme_actionModeCutDrawable /*32*/:
                stringBuilder.append(f619z);
                break;
            default:
                stringBuilder.append(d);
                break;
        }
        return stringBuilder.toString();
    }

    public void m1402e(boolean z) {
        this.f640u = z;
        this.f631l.m1367b(false);
    }

    public boolean expandActionView() {
        return !m1411n() ? false : (this.f639t == null || this.f639t.mo237a(this)) ? this.f631l.mo248c(this) : false;
    }

    boolean m1403f() {
        return this.f631l.mo247b() && m1399d() != '\u0000';
    }

    public boolean m1404g() {
        return (this.f635p & 4) != 0;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        if (this.f637r != null) {
            return this.f637r;
        }
        if (this.f638s == null) {
            return null;
        }
        this.f637r = this.f638s.mo239a((MenuItem) this);
        return this.f637r;
    }

    public char getAlphabeticShortcut() {
        return this.f628i;
    }

    public int getGroupId() {
        return this.f621b;
    }

    public Drawable getIcon() {
        if (this.f629j != null) {
            return this.f629j;
        }
        if (this.f630k == 0) {
            return null;
        }
        Drawable a = C0376p.m1705a(this.f631l.m1371d(), this.f630k);
        this.f630k = 0;
        this.f629j = a;
        return a;
    }

    public Intent getIntent() {
        return this.f626g;
    }

    @CapturedViewProperty
    public int getItemId() {
        return this.f620a;
    }

    public ContextMenuInfo getMenuInfo() {
        return this.f641v;
    }

    public char getNumericShortcut() {
        return this.f627h;
    }

    public int getOrder() {
        return this.f622c;
    }

    public SubMenu getSubMenu() {
        return this.f632m;
    }

    @CapturedViewProperty
    public CharSequence getTitle() {
        return this.f624e;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f625f != null ? this.f625f : this.f624e;
        return (VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    public void m1405h() {
        this.f631l.m1366b(this);
    }

    public boolean hasSubMenu() {
        return this.f632m != null;
    }

    public boolean m1406i() {
        return this.f631l.m1381m();
    }

    public boolean isActionViewExpanded() {
        return this.f640u;
    }

    public boolean isCheckable() {
        return (this.f635p & 1) == 1;
    }

    public boolean isChecked() {
        return (this.f635p & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.f635p & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f638s == null || !this.f638s.mo241b()) ? (this.f635p & 8) == 0 : (this.f635p & 8) == 0 && this.f638s.mo242c();
    }

    public boolean m1407j() {
        return (this.f635p & 32) == 32;
    }

    public boolean m1408k() {
        return (this.f636q & 1) == 1;
    }

    public boolean m1409l() {
        return (this.f636q & 2) == 2;
    }

    public boolean m1410m() {
        return (this.f636q & 4) == 4;
    }

    public boolean m1411n() {
        if ((this.f636q & 8) == 0) {
            return false;
        }
        if (this.f637r == null && this.f638s != null) {
            this.f637r = this.f638s.mo239a((MenuItem) this);
        }
        return this.f637r != null;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public /* synthetic */ MenuItem setActionView(int i) {
        return m1385a(i);
    }

    public /* synthetic */ MenuItem setActionView(View view) {
        return m1388a(view);
    }

    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f628i != c) {
            this.f628i = Character.toLowerCase(c);
            this.f631l.m1367b(false);
        }
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        int i = this.f635p;
        this.f635p = (z ? 1 : 0) | (this.f635p & -2);
        if (i != this.f635p) {
            this.f631l.m1367b(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z) {
        if ((this.f635p & 4) != 0) {
            this.f631l.m1358a((MenuItem) this);
        } else {
            m1395b(z);
        }
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.f635p |= 16;
        } else {
            this.f635p &= -17;
        }
        this.f631l.m1367b(false);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f629j = null;
        this.f630k = i;
        this.f631l.m1367b(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f630k = 0;
        this.f629j = drawable;
        this.f631l.m1367b(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f626g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        if (this.f627h != c) {
            this.f627h = c;
            this.f631l.m1367b(false);
        }
        return this;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setOnActionExpandListener()");
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f634o = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f627h = c;
        this.f628i = Character.toLowerCase(c2);
        this.f631l.m1367b(false);
        return this;
    }

    public void setShowAsAction(int i) {
        switch (i & 3) {
            case 0:
            case 1:
            case 2:
                this.f636q = i;
                this.f631l.m1366b(this);
                return;
            default:
                throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
    }

    public /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        return m1394b(i);
    }

    public MenuItem setTitle(int i) {
        return setTitle(this.f631l.m1371d().getString(i));
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f624e = charSequence;
        this.f631l.m1367b(false);
        if (this.f632m != null) {
            this.f632m.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f625f = charSequence;
        if (charSequence == null) {
            CharSequence charSequence2 = this.f624e;
        }
        this.f631l.m1367b(false);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        if (m1398c(z)) {
            this.f631l.m1356a(this);
        }
        return this;
    }

    public String toString() {
        return this.f624e.toString();
    }
}
