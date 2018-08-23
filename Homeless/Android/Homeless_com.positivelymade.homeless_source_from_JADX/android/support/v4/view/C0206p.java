package android.support.v4.view;

import android.os.Build.VERSION;
import android.support.v4.p003c.p004a.C0069b;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

public class C0206p {
    static final C0201d f417a;

    interface C0201d {
        MenuItem mo150a(MenuItem menuItem, View view);

        void mo151a(MenuItem menuItem, int i);

        boolean mo152a(MenuItem menuItem);

        MenuItem mo153b(MenuItem menuItem, int i);
    }

    static class C0202a implements C0201d {
        C0202a() {
        }

        public MenuItem mo150a(MenuItem menuItem, View view) {
            return menuItem;
        }

        public void mo151a(MenuItem menuItem, int i) {
        }

        public boolean mo152a(MenuItem menuItem) {
            return false;
        }

        public MenuItem mo153b(MenuItem menuItem, int i) {
            return menuItem;
        }
    }

    static class C0203b implements C0201d {
        C0203b() {
        }

        public MenuItem mo150a(MenuItem menuItem, View view) {
            return C0207q.m965a(menuItem, view);
        }

        public void mo151a(MenuItem menuItem, int i) {
            C0207q.m966a(menuItem, i);
        }

        public boolean mo152a(MenuItem menuItem) {
            return false;
        }

        public MenuItem mo153b(MenuItem menuItem, int i) {
            return C0207q.m967b(menuItem, i);
        }
    }

    static class C0204c extends C0203b {
        C0204c() {
        }

        public boolean mo152a(MenuItem menuItem) {
            return C0208r.m968a(menuItem);
        }
    }

    public interface C0205e {
        boolean mo237a(MenuItem menuItem);

        boolean mo238b(MenuItem menuItem);
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 14) {
            f417a = new C0204c();
        } else if (i >= 11) {
            f417a = new C0203b();
        } else {
            f417a = new C0202a();
        }
    }

    public static MenuItem m960a(MenuItem menuItem, C0174d c0174d) {
        if (menuItem instanceof C0069b) {
            return ((C0069b) menuItem).mo212a(c0174d);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    public static MenuItem m961a(MenuItem menuItem, View view) {
        return menuItem instanceof C0069b ? ((C0069b) menuItem).setActionView(view) : f417a.mo150a(menuItem, view);
    }

    public static void m962a(MenuItem menuItem, int i) {
        if (menuItem instanceof C0069b) {
            ((C0069b) menuItem).setShowAsAction(i);
        } else {
            f417a.mo151a(menuItem, i);
        }
    }

    public static boolean m963a(MenuItem menuItem) {
        return menuItem instanceof C0069b ? ((C0069b) menuItem).expandActionView() : f417a.mo152a(menuItem);
    }

    public static MenuItem m964b(MenuItem menuItem, int i) {
        return menuItem instanceof C0069b ? ((C0069b) menuItem).setActionView(i) : f417a.mo153b(menuItem, i);
    }
}
