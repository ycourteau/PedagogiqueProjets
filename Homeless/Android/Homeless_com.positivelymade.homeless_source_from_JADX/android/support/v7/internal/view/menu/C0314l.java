package android.support.v7.internal.view.menu;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.p003c.p004a.C0069b;
import android.support.v4.p003c.p004a.C0070c;
import android.view.MenuItem;
import android.view.SubMenu;

public final class C0314l {
    public static MenuItem m1453a(Context context, C0069b c0069b) {
        if (VERSION.SDK_INT >= 16) {
            return new C0310h(context, c0069b);
        }
        if (VERSION.SDK_INT >= 14) {
            return new C0308g(context, c0069b);
        }
        throw new UnsupportedOperationException();
    }

    public static SubMenu m1454a(Context context, C0070c c0070c) {
        if (VERSION.SDK_INT >= 14) {
            return new C0317o(context, c0070c);
        }
        throw new UnsupportedOperationException();
    }
}
