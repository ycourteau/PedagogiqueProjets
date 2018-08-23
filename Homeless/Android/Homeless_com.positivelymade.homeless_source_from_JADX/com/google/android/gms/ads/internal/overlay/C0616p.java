package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.TextureView;
import com.google.android.gms.ads.internal.C0618p;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.p028c.az;
import com.google.android.gms.p028c.be;
import com.google.android.gms.p028c.bf;
import com.google.android.gms.p028c.gr;
import com.google.android.gms.p028c.gr.C0999a;
import com.google.android.gms.p028c.gr.C1000b;
import java.util.concurrent.TimeUnit;

public class C0616p {
    private final Context f1675a;
    private final String f1676b;
    private final be f1677c;
    private final bf f1678d;
    private final VersionInfoParcel f1679e;
    private final gr f1680f = new C1000b().m4940a("min_1", Double.MIN_VALUE, 1.0d).m4940a("1_5", 1.0d, 5.0d).m4940a("5_10", 5.0d, 10.0d).m4940a("10_20", 10.0d, 20.0d).m4940a("20_30", 20.0d, 30.0d).m4940a("30_max", 30.0d, Double.MAX_VALUE).m4941a();
    private final long[] f1681g;
    private final String[] f1682h;
    private be f1683i;
    private be f1684j;
    private be f1685k;
    private be f1686l;
    private boolean f1687m;
    private C0599i f1688n;
    private boolean f1689o;
    private boolean f1690p;
    private long f1691q = -1;

    public C0616p(Context context, VersionInfoParcel versionInfoParcel, String str, bf bfVar, be beVar) {
        this.f1675a = context;
        this.f1679e = versionInfoParcel;
        this.f1676b = str;
        this.f1678d = bfVar;
        this.f1677c = beVar;
        String str2 = (String) az.f2496v.m3878c();
        if (str2 == null) {
            this.f1682h = new String[0];
            this.f1681g = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        this.f1682h = new String[split.length];
        this.f1681g = new long[split.length];
        for (int i = 0; i < split.length; i++) {
            try {
                this.f1681g[i] = Long.parseLong(split[i]);
            } catch (Throwable e) {
                C0691b.m3102d("Unable to parse frame hash target time number.", e);
                this.f1681g[i] = -1;
            }
        }
    }

    private void m2780c(C0599i c0599i) {
        long longValue = ((Long) az.f2497w.m3878c()).longValue();
        long currentPosition = (long) c0599i.getCurrentPosition();
        int i = 0;
        while (i < this.f1682h.length) {
            if (this.f1682h[i] == null && longValue > Math.abs(currentPosition - this.f1681g[i])) {
                this.f1682h[i] = m2782a((TextureView) c0599i);
                return;
            }
            i++;
        }
    }

    private void m2781e() {
        if (this.f1685k != null && this.f1686l == null) {
            this.f1678d.m3920a(this.f1685k, "vff");
            this.f1678d.m3920a(this.f1677c, "vtt");
            this.f1686l = this.f1678d.m3916a();
        }
        long c = C0618p.m2800i().mo826c();
        if (this.f1687m && this.f1690p && this.f1691q != -1) {
            this.f1680f.m4944a(((double) TimeUnit.SECONDS.toNanos(1)) / ((double) (c - this.f1691q)));
        }
        this.f1690p = this.f1687m;
        this.f1691q = c;
    }

    String m2782a(TextureView textureView) {
        Bitmap bitmap = textureView.getBitmap(8, 8);
        long j = 0;
        long j2 = 63;
        int i = 0;
        while (i < 8) {
            long j3 = j;
            j = j2;
            for (int i2 = 0; i2 < 8; i2++) {
                int pixel = bitmap.getPixel(i2, i);
                j3 |= (Color.green(pixel) + (Color.blue(pixel) + Color.red(pixel)) > 128 ? 1 : 0) << ((int) j);
                j--;
            }
            i++;
            j2 = j;
            j = j3;
        }
        return String.format("%016X", new Object[]{Long.valueOf(j)});
    }

    public void m2783a() {
        if (this.f1683i != null && this.f1684j == null) {
            this.f1678d.m3920a(this.f1683i, "vfr");
            this.f1684j = this.f1678d.m3916a();
        }
    }

    public void m2784a(C0599i c0599i) {
        this.f1678d.m3920a(this.f1677c, "vpc");
        this.f1683i = this.f1678d.m3916a();
        this.f1688n = c0599i;
    }

    public void m2785b() {
        if (((Boolean) az.f2495u.m3878c()).booleanValue() && !this.f1689o) {
            Bundle bundle = new Bundle();
            bundle.putString("type", "native-player-metrics");
            bundle.putString("request", this.f1676b);
            bundle.putString("player", this.f1688n.mo450a());
            for (C0999a c0999a : this.f1680f.m4943a()) {
                bundle.putString("fps_c_" + c0999a.f3382a, Integer.toString(c0999a.f3386e));
                bundle.putString("fps_p_" + c0999a.f3382a, Double.toString(c0999a.f3385d));
            }
            for (int i = 0; i < this.f1681g.length; i++) {
                String str = this.f1682h[i];
                if (str != null) {
                    bundle.putString("fh_" + Long.valueOf(this.f1681g[i]), str);
                }
            }
            C0618p.m2796e().m4856a(this.f1675a, this.f1679e.f1976b, "gmob-apps", bundle, true);
            this.f1689o = true;
        }
    }

    public void m2786b(C0599i c0599i) {
        m2781e();
        m2780c(c0599i);
    }

    public void m2787c() {
        this.f1687m = true;
        if (this.f1684j != null && this.f1685k == null) {
            this.f1678d.m3920a(this.f1684j, "vfp");
            this.f1685k = this.f1678d.m3916a();
        }
    }

    public void m2788d() {
        this.f1687m = false;
    }
}
