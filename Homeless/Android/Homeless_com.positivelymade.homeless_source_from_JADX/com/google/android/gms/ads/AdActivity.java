package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.p028c.ef;
import com.google.android.gms.p028c.eg;

public class AdActivity extends Activity {
    private eg f1244a;

    private void m2046a() {
        if (this.f1244a != null) {
            try {
                this.f1244a.mo477m();
            } catch (Throwable e) {
                C0691b.m3102d("Could not forward setContentViewSet to ad overlay:", e);
            }
        }
    }

    public void onBackPressed() {
        boolean z = true;
        try {
            if (this.f1244a != null) {
                z = this.f1244a.mo470f();
            }
        } catch (Throwable e) {
            C0691b.m3102d("Could not forward onBackPressed to ad overlay:", e);
        }
        if (z) {
            super.onBackPressed();
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1244a = ef.m4474a((Activity) this);
        if (this.f1244a == null) {
            C0691b.m3103e("Could not create ad overlay.");
            finish();
            return;
        }
        try {
            this.f1244a.mo466a(bundle);
        } catch (Throwable e) {
            C0691b.m3102d("Could not forward onCreate to ad overlay:", e);
            finish();
        }
    }

    protected void onDestroy() {
        try {
            if (this.f1244a != null) {
                this.f1244a.mo476l();
            }
        } catch (Throwable e) {
            C0691b.m3102d("Could not forward onDestroy to ad overlay:", e);
        }
        super.onDestroy();
    }

    protected void onPause() {
        try {
            if (this.f1244a != null) {
                this.f1244a.mo474j();
            }
        } catch (Throwable e) {
            C0691b.m3102d("Could not forward onPause to ad overlay:", e);
            finish();
        }
        super.onPause();
    }

    protected void onRestart() {
        super.onRestart();
        try {
            if (this.f1244a != null) {
                this.f1244a.mo471g();
            }
        } catch (Throwable e) {
            C0691b.m3102d("Could not forward onRestart to ad overlay:", e);
            finish();
        }
    }

    protected void onResume() {
        super.onResume();
        try {
            if (this.f1244a != null) {
                this.f1244a.mo473i();
            }
        } catch (Throwable e) {
            C0691b.m3102d("Could not forward onResume to ad overlay:", e);
            finish();
        }
    }

    protected void onSaveInstanceState(Bundle bundle) {
        try {
            if (this.f1244a != null) {
                this.f1244a.mo467b(bundle);
            }
        } catch (Throwable e) {
            C0691b.m3102d("Could not forward onSaveInstanceState to ad overlay:", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    protected void onStart() {
        super.onStart();
        try {
            if (this.f1244a != null) {
                this.f1244a.mo472h();
            }
        } catch (Throwable e) {
            C0691b.m3102d("Could not forward onStart to ad overlay:", e);
            finish();
        }
    }

    protected void onStop() {
        try {
            if (this.f1244a != null) {
                this.f1244a.mo475k();
            }
        } catch (Throwable e) {
            C0691b.m3102d("Could not forward onStop to ad overlay:", e);
            finish();
        }
        super.onStop();
    }

    public void setContentView(int i) {
        super.setContentView(i);
        m2046a();
    }

    public void setContentView(View view) {
        super.setContentView(view);
        m2046a();
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        m2046a();
    }
}
