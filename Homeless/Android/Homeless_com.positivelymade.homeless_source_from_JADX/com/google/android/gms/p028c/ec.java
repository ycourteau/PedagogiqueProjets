package com.google.android.gms.p028c;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.C0618p;
import com.google.android.gms.ads.internal.client.C0526n;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.p028c.ea.C0916a;
import java.util.Map;

@fn
public class ec extends ed implements cg {
    DisplayMetrics f2891a;
    int f2892b = -1;
    int f2893c = -1;
    int f2894d = -1;
    int f2895e = -1;
    int f2896f = -1;
    int f2897g = -1;
    private final hg f2898h;
    private final Context f2899i;
    private final WindowManager f2900j;
    private final ar f2901k;
    private float f2902l;
    private int f2903m;

    public ec(hg hgVar, Context context, ar arVar) {
        super(hgVar);
        this.f2898h = hgVar;
        this.f2899i = context;
        this.f2901k = arVar;
        this.f2900j = (WindowManager) context.getSystemService("window");
    }

    private void m4463g() {
        this.f2891a = new DisplayMetrics();
        Display defaultDisplay = this.f2900j.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f2891a);
        this.f2902l = this.f2891a.density;
        this.f2903m = defaultDisplay.getRotation();
    }

    private void m4464h() {
        int[] iArr = new int[2];
        this.f2898h.getLocationOnScreen(iArr);
        m4467a(C0526n.m2400a().m3086b(this.f2899i, iArr[0]), C0526n.m2400a().m3086b(this.f2899i, iArr[1]));
    }

    private ea m4465i() {
        return new C0916a().m4457b(this.f2901k.m3859a()).m4455a(this.f2901k.m3861b()).m4458c(this.f2901k.m3864f()).m4459d(this.f2901k.m3862c()).m4460e(this.f2901k.m3863d()).m4456a();
    }

    void m4466a() {
        this.f2892b = C0526n.m2400a().m3087b(this.f2891a, this.f2891a.widthPixels);
        this.f2893c = C0526n.m2400a().m3087b(this.f2891a, this.f2891a.heightPixels);
        Activity c = this.f2898h.mo776c();
        if (c == null || c.getWindow() == null) {
            this.f2894d = this.f2892b;
            this.f2895e = this.f2893c;
            return;
        }
        int[] a = C0618p.m2796e().m4866a(c);
        this.f2894d = C0526n.m2400a().m3087b(this.f2891a, a[0]);
        this.f2895e = C0526n.m2400a().m3087b(this.f2891a, a[1]);
    }

    public void m4467a(int i, int i2) {
        m4424b(i, i2 - (this.f2899i instanceof Activity ? C0618p.m2796e().m4882d((Activity) this.f2899i)[0] : 0), this.f2896f, this.f2897g);
        this.f2898h.mo788i().m5036a(i, i2);
    }

    public void mo524a(hg hgVar, Map<String, String> map) {
        m4470c();
    }

    void m4469b() {
        if (this.f2898h.mo787h().f1351e) {
            this.f2896f = this.f2892b;
            this.f2897g = this.f2893c;
            return;
        }
        this.f2898h.measure(0, 0);
        this.f2896f = C0526n.m2400a().m3086b(this.f2899i, this.f2898h.getMeasuredWidth());
        this.f2897g = C0526n.m2400a().m3086b(this.f2899i, this.f2898h.getMeasuredHeight());
    }

    public void m4470c() {
        m4463g();
        m4466a();
        m4469b();
        m4472e();
        m4473f();
        m4464h();
        m4471d();
    }

    void m4471d() {
        if (C0691b.m3096a(2)) {
            C0691b.m3099c("Dispatching Ready Event.");
        }
        m4426c(this.f2898h.mo791l().f1976b);
    }

    void m4472e() {
        m4423a(this.f2892b, this.f2893c, this.f2894d, this.f2895e, this.f2902l, this.f2903m);
    }

    void m4473f() {
        this.f2898h.mo769a("onDeviceFeaturesReceived", m4465i().m4461a());
    }
}
