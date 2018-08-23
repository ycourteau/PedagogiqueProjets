package android.support.v4.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public abstract class C0174d {
    private final Context f407a;
    private C0172a f408b;
    private C0173b f409c;

    public interface C0172a {
        void mo314a(boolean z);
    }

    public interface C0173b {
        void mo230a(boolean z);
    }

    public C0174d(Context context) {
        this.f407a = context;
    }

    public abstract View mo231a();

    public View mo239a(MenuItem menuItem) {
        return mo231a();
    }

    public void m899a(C0172a c0172a) {
        this.f408b = c0172a;
    }

    public void mo240a(C0173b c0173b) {
        if (!(this.f409c == null || c0173b == null)) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f409c = c0173b;
    }

    public void mo232a(SubMenu subMenu) {
    }

    public void m902a(boolean z) {
        if (this.f408b != null) {
            this.f408b.mo314a(z);
        }
    }

    public boolean mo241b() {
        return false;
    }

    public boolean mo242c() {
        return true;
    }

    public boolean mo233d() {
        return false;
    }

    public boolean mo234e() {
        return false;
    }
}
