package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.p000a.C0000a;
import android.support.v4.p003c.p004a.C0069b;
import android.support.v4.view.C0174d;
import android.support.v4.view.C0206p.C0205e;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;

public class C0295a implements C0069b {
    private final int f563a;
    private final int f564b;
    private final int f565c;
    private final int f566d;
    private CharSequence f567e;
    private CharSequence f568f;
    private Intent f569g;
    private char f570h;
    private char f571i;
    private Drawable f572j;
    private int f573k = 0;
    private Context f574l;
    private OnMenuItemClickListener f575m;
    private int f576n = 16;

    public C0295a(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f574l = context;
        this.f563a = i2;
        this.f564b = i;
        this.f565c = i3;
        this.f566d = i4;
        this.f567e = charSequence;
    }

    public C0069b m1304a(int i) {
        throw new UnsupportedOperationException();
    }

    public C0069b mo212a(C0174d c0174d) {
        throw new UnsupportedOperationException();
    }

    public C0069b mo213a(C0205e c0205e) {
        return this;
    }

    public C0069b m1307a(View view) {
        throw new UnsupportedOperationException();
    }

    public C0174d mo214a() {
        return null;
    }

    public C0069b m1309b(int i) {
        setShowAsAction(i);
        return this;
    }

    public boolean collapseActionView() {
        return false;
    }

    public boolean expandActionView() {
        return false;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public char getAlphabeticShortcut() {
        return this.f571i;
    }

    public int getGroupId() {
        return this.f564b;
    }

    public Drawable getIcon() {
        return this.f572j;
    }

    public Intent getIntent() {
        return this.f569g;
    }

    public int getItemId() {
        return this.f563a;
    }

    public ContextMenuInfo getMenuInfo() {
        return null;
    }

    public char getNumericShortcut() {
        return this.f570h;
    }

    public int getOrder() {
        return this.f566d;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f567e;
    }

    public CharSequence getTitleCondensed() {
        return this.f568f != null ? this.f568f : this.f567e;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.f576n & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f576n & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f576n & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f576n & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ MenuItem setActionView(int i) {
        return m1304a(i);
    }

    public /* synthetic */ MenuItem setActionView(View view) {
        return m1307a(view);
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f571i = c;
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f576n = (z ? 1 : 0) | (this.f576n & -2);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f576n = (z ? 2 : 0) | (this.f576n & -3);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f576n = (z ? 16 : 0) | (this.f576n & -17);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f573k = i;
        this.f572j = C0000a.m0a(this.f574l, i);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f572j = drawable;
        this.f573k = 0;
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f569g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f570h = c;
        return this;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f575m = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f570h = c;
        this.f571i = c2;
        return this;
    }

    public void setShowAsAction(int i) {
    }

    public /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        return m1309b(i);
    }

    public MenuItem setTitle(int i) {
        this.f567e = this.f574l.getResources().getString(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f567e = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f568f = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        this.f576n = (z ? 0 : 8) | (this.f576n & 8);
        return this;
    }
}
