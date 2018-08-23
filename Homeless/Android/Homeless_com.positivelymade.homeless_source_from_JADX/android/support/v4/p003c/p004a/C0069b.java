package android.support.v4.p003c.p004a;

import android.support.v4.view.C0174d;
import android.support.v4.view.C0206p.C0205e;
import android.view.MenuItem;
import android.view.View;

public interface C0069b extends MenuItem {
    C0069b mo212a(C0174d c0174d);

    C0069b mo213a(C0205e c0205e);

    C0174d mo214a();

    boolean collapseActionView();

    boolean expandActionView();

    View getActionView();

    boolean isActionViewExpanded();

    MenuItem setActionView(int i);

    MenuItem setActionView(View view);

    void setShowAsAction(int i);

    MenuItem setShowAsActionFlags(int i);
}
