package android.support.v4.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class C0019e extends C0018f implements OnCancelListener, OnDismissListener {
    int f128a = 0;
    int f129b = 0;
    boolean f130c = true;
    boolean f131d = true;
    int f132e = -1;
    Dialog f133f;
    boolean f134g;
    boolean f135h;
    boolean f136i;

    public int m155a() {
        return this.f129b;
    }

    public void mo9a(Activity activity) {
        super.mo9a(activity);
        if (!this.f136i) {
            this.f135h = false;
        }
    }

    public void mo900a(C0028i c0028i, String str) {
        this.f135h = false;
        this.f136i = true;
        C0016l a = c0028i.mo21a();
        a.mo5a(this, str);
        a.mo2a();
    }

    void m158a(boolean z) {
        if (!this.f135h) {
            this.f135h = true;
            this.f136i = false;
            if (this.f133f != null) {
                this.f133f.dismiss();
                this.f133f = null;
            }
            this.f134g = true;
            if (this.f132e >= 0) {
                m134i().mo23a(this.f132e, 1);
                this.f132e = -1;
                return;
            }
            C0016l a = m134i().mo21a();
            a.mo4a(this);
            if (z) {
                a.mo6b();
            } else {
                a.mo2a();
            }
        }
    }

    public void a_(Bundle bundle) {
        super.a_(bundle);
        this.f131d = this.H == 0;
        if (bundle != null) {
            this.f128a = bundle.getInt("android:style", 0);
            this.f129b = bundle.getInt("android:theme", 0);
            this.f130c = bundle.getBoolean("android:cancelable", true);
            this.f131d = bundle.getBoolean("android:showsDialog", this.f131d);
            this.f132e = bundle.getInt("android:backStackId", -1);
        }
    }

    public LayoutInflater mo11b(Bundle bundle) {
        if (!this.f131d) {
            return super.mo11b(bundle);
        }
        this.f133f = mo901c(bundle);
        switch (this.f128a) {
            case 1:
            case 2:
                break;
            case 3:
                this.f133f.getWindow().addFlags(24);
                break;
        }
        this.f133f.requestWindowFeature(1);
        return this.f133f != null ? (LayoutInflater) this.f133f.getContext().getSystemService("layout_inflater") : (LayoutInflater) this.D.getSystemService("layout_inflater");
    }

    public void mo12b() {
        super.mo12b();
        if (!this.f136i && !this.f135h) {
            this.f135h = true;
        }
    }

    public void m161b(boolean z) {
        this.f131d = z;
    }

    public Dialog mo901c(Bundle bundle) {
        return new Dialog(m130g(), m155a());
    }

    public void mo13c() {
        super.mo13c();
        if (this.f133f != null) {
            this.f134g = false;
            this.f133f.show();
        }
    }

    public void mo14d() {
        super.mo14d();
        if (this.f133f != null) {
            this.f133f.hide();
        }
    }

    public void mo15d(Bundle bundle) {
        super.mo15d(bundle);
        if (this.f131d) {
            View o = m143o();
            if (o != null) {
                if (o.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                this.f133f.setContentView(o);
            }
            this.f133f.setOwnerActivity(m130g());
            this.f133f.setCancelable(this.f130c);
            this.f133f.setOnCancelListener(this);
            this.f133f.setOnDismissListener(this);
            if (bundle != null) {
                Bundle bundle2 = bundle.getBundle("android:savedDialogState");
                if (bundle2 != null) {
                    this.f133f.onRestoreInstanceState(bundle2);
                }
            }
        }
    }

    public void mo16e() {
        super.mo16e();
        if (this.f133f != null) {
            this.f134g = true;
            this.f133f.dismiss();
            this.f133f = null;
        }
    }

    public void mo17e(Bundle bundle) {
        super.mo17e(bundle);
        if (this.f133f != null) {
            Bundle onSaveInstanceState = this.f133f.onSaveInstanceState();
            if (onSaveInstanceState != null) {
                bundle.putBundle("android:savedDialogState", onSaveInstanceState);
            }
        }
        if (this.f128a != 0) {
            bundle.putInt("android:style", this.f128a);
        }
        if (this.f129b != 0) {
            bundle.putInt("android:theme", this.f129b);
        }
        if (!this.f130c) {
            bundle.putBoolean("android:cancelable", this.f130c);
        }
        if (!this.f131d) {
            bundle.putBoolean("android:showsDialog", this.f131d);
        }
        if (this.f132e != -1) {
            bundle.putInt("android:backStackId", this.f132e);
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f134g) {
            m158a(true);
        }
    }
}
