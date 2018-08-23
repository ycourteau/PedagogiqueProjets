package android.support.v7.internal.view.menu;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.p003c.p004a.C0069b;
import android.support.v4.view.C0174d;
import android.support.v4.view.C0206p.C0205e;
import android.support.v7.p013d.C0277a;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

@TargetApi(14)
public class C0308g extends C0299c<C0069b> implements MenuItem {
    private Method f647c;

    class C0304a extends C0174d {
        final ActionProvider f642a;
        final /* synthetic */ C0308g f643b;

        public C0304a(C0308g c0308g, Context context, ActionProvider actionProvider) {
            this.f643b = c0308g;
            super(context);
            this.f642a = actionProvider;
        }

        public View mo231a() {
            return this.f642a.onCreateActionView();
        }

        public void mo232a(SubMenu subMenu) {
            this.f642a.onPrepareSubMenu(this.f643b.m1334a(subMenu));
        }

        public boolean mo233d() {
            return this.f642a.onPerformDefaultAction();
        }

        public boolean mo234e() {
            return this.f642a.hasSubMenu();
        }
    }

    static class C0305b extends FrameLayout implements C0277a {
        final CollapsibleActionView f644a;

        C0305b(View view) {
            super(view.getContext());
            this.f644a = (CollapsibleActionView) view;
            addView(view);
        }

        public void mo235a() {
            this.f644a.onActionViewExpanded();
        }

        public void mo236b() {
            this.f644a.onActionViewCollapsed();
        }

        View m1418c() {
            return (View) this.f644a;
        }
    }

    private class C0306c extends C0298d<OnActionExpandListener> implements C0205e {
        final /* synthetic */ C0308g f645a;

        C0306c(C0308g c0308g, OnActionExpandListener onActionExpandListener) {
            this.f645a = c0308g;
            super(onActionExpandListener);
        }

        public boolean mo237a(MenuItem menuItem) {
            return ((OnActionExpandListener) this.b).onMenuItemActionExpand(this.f645a.m1333a(menuItem));
        }

        public boolean mo238b(MenuItem menuItem) {
            return ((OnActionExpandListener) this.b).onMenuItemActionCollapse(this.f645a.m1333a(menuItem));
        }
    }

    private class C0307d extends C0298d<OnMenuItemClickListener> implements OnMenuItemClickListener {
        final /* synthetic */ C0308g f646a;

        C0307d(C0308g c0308g, OnMenuItemClickListener onMenuItemClickListener) {
            this.f646a = c0308g;
            super(onMenuItemClickListener);
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return ((OnMenuItemClickListener) this.b).onMenuItemClick(this.f646a.m1333a(menuItem));
        }
    }

    C0308g(Context context, C0069b c0069b) {
        super(context, c0069b);
    }

    C0304a mo243a(ActionProvider actionProvider) {
        return new C0304a(this, this.a, actionProvider);
    }

    public void m1422a(boolean z) {
        try {
            if (this.f647c == null) {
                this.f647c = ((C0069b) this.b).getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.f647c.invoke(this.b, new Object[]{Boolean.valueOf(z)});
        } catch (Throwable e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }

    public boolean collapseActionView() {
        return ((C0069b) this.b).collapseActionView();
    }

    public boolean expandActionView() {
        return ((C0069b) this.b).expandActionView();
    }

    public ActionProvider getActionProvider() {
        C0174d a = ((C0069b) this.b).mo214a();
        return a instanceof C0304a ? ((C0304a) a).f642a : null;
    }

    public View getActionView() {
        View actionView = ((C0069b) this.b).getActionView();
        return actionView instanceof C0305b ? ((C0305b) actionView).m1418c() : actionView;
    }

    public char getAlphabeticShortcut() {
        return ((C0069b) this.b).getAlphabeticShortcut();
    }

    public int getGroupId() {
        return ((C0069b) this.b).getGroupId();
    }

    public Drawable getIcon() {
        return ((C0069b) this.b).getIcon();
    }

    public Intent getIntent() {
        return ((C0069b) this.b).getIntent();
    }

    public int getItemId() {
        return ((C0069b) this.b).getItemId();
    }

    public ContextMenuInfo getMenuInfo() {
        return ((C0069b) this.b).getMenuInfo();
    }

    public char getNumericShortcut() {
        return ((C0069b) this.b).getNumericShortcut();
    }

    public int getOrder() {
        return ((C0069b) this.b).getOrder();
    }

    public SubMenu getSubMenu() {
        return m1334a(((C0069b) this.b).getSubMenu());
    }

    public CharSequence getTitle() {
        return ((C0069b) this.b).getTitle();
    }

    public CharSequence getTitleCondensed() {
        return ((C0069b) this.b).getTitleCondensed();
    }

    public boolean hasSubMenu() {
        return ((C0069b) this.b).hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return ((C0069b) this.b).isActionViewExpanded();
    }

    public boolean isCheckable() {
        return ((C0069b) this.b).isCheckable();
    }

    public boolean isChecked() {
        return ((C0069b) this.b).isChecked();
    }

    public boolean isEnabled() {
        return ((C0069b) this.b).isEnabled();
    }

    public boolean isVisible() {
        return ((C0069b) this.b).isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        ((C0069b) this.b).mo212a(actionProvider != null ? mo243a(actionProvider) : null);
        return this;
    }

    public MenuItem setActionView(int i) {
        ((C0069b) this.b).setActionView(i);
        View actionView = ((C0069b) this.b).getActionView();
        if (actionView instanceof CollapsibleActionView) {
            ((C0069b) this.b).setActionView(new C0305b(actionView));
        }
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0305b(view);
        }
        ((C0069b) this.b).setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        ((C0069b) this.b).setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        ((C0069b) this.b).setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        ((C0069b) this.b).setChecked(z);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        ((C0069b) this.b).setEnabled(z);
        return this;
    }

    public MenuItem setIcon(int i) {
        ((C0069b) this.b).setIcon(i);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        ((C0069b) this.b).setIcon(drawable);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        ((C0069b) this.b).setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        ((C0069b) this.b).setNumericShortcut(c);
        return this;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        ((C0069b) this.b).mo213a(onActionExpandListener != null ? new C0306c(this, onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        ((C0069b) this.b).setOnMenuItemClickListener(onMenuItemClickListener != null ? new C0307d(this, onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        ((C0069b) this.b).setShortcut(c, c2);
        return this;
    }

    public void setShowAsAction(int i) {
        ((C0069b) this.b).setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        ((C0069b) this.b).setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        ((C0069b) this.b).setTitle(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        ((C0069b) this.b).setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        ((C0069b) this.b).setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return ((C0069b) this.b).setVisible(z);
    }
}
