package android.support.v7.internal.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v4.view.ah;
import android.support.v7.p010b.C0275a.C0266a;
import android.support.v7.p010b.C0275a.C0267b;
import android.support.v7.p010b.C0275a.C0268c;
import android.support.v7.p010b.C0275a.C0271f;
import android.support.v7.p010b.C0275a.C0274i;
import android.view.ViewConfiguration;

public class C0281a {
    private Context f479a;

    private C0281a(Context context) {
        this.f479a = context;
    }

    public static C0281a m1230a(Context context) {
        return new C0281a(context);
    }

    public int m1231a() {
        return this.f479a.getResources().getInteger(C0271f.abc_max_action_buttons);
    }

    public boolean m1232b() {
        return VERSION.SDK_INT >= 19 || !ah.m821b(ViewConfiguration.get(this.f479a));
    }

    public int m1233c() {
        return this.f479a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public boolean m1234d() {
        return this.f479a.getApplicationInfo().targetSdkVersion >= 16 ? this.f479a.getResources().getBoolean(C0267b.abc_action_bar_embed_tabs) : this.f479a.getResources().getBoolean(C0267b.abc_action_bar_embed_tabs_pre_jb);
    }

    public int m1235e() {
        TypedArray obtainStyledAttributes = this.f479a.obtainStyledAttributes(null, C0274i.ActionBar, C0266a.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C0274i.ActionBar_height, 0);
        Resources resources = this.f479a.getResources();
        if (!m1234d()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C0268c.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public int m1236f() {
        return this.f479a.getResources().getDimensionPixelSize(C0268c.abc_action_bar_stacked_tab_max_width);
    }
}
