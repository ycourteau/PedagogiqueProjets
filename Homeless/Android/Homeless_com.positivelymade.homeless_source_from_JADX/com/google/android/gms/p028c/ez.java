package com.google.android.gms.p028c;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View.MeasureSpec;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.C0618p;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.p028c.hh.C0601a;

@fn
public class ez implements Runnable {
    protected final hg f2939a;
    protected boolean f2940b;
    protected boolean f2941c;
    private final Handler f2942d;
    private final long f2943e;
    private long f2944f;
    private C0601a f2945g;
    private final int f2946h;
    private final int f2947i;

    protected final class C0933a extends AsyncTask<Void, Void, Boolean> {
        final /* synthetic */ ez f2936a;
        private final WebView f2937b;
        private Bitmap f2938c;

        public C0933a(ez ezVar, WebView webView) {
            this.f2936a = ezVar;
            this.f2937b = webView;
        }

        protected synchronized Boolean m4540a(Void... voidArr) {
            Boolean valueOf;
            int width = this.f2938c.getWidth();
            int height = this.f2938c.getHeight();
            if (width == 0 || height == 0) {
                valueOf = Boolean.valueOf(false);
            } else {
                int i = 0;
                for (int i2 = 0; i2 < width; i2 += 10) {
                    for (int i3 = 0; i3 < height; i3 += 10) {
                        if (this.f2938c.getPixel(i2, i3) != 0) {
                            i++;
                        }
                    }
                }
                valueOf = Boolean.valueOf(((double) i) / (((double) (width * height)) / 100.0d) > 0.1d);
            }
            return valueOf;
        }

        protected void m4541a(Boolean bool) {
            ez.m4544c(this.f2936a);
            if (bool.booleanValue() || this.f2936a.m4553c() || this.f2936a.f2944f <= 0) {
                this.f2936a.f2941c = bool.booleanValue();
                this.f2936a.f2945g.mo465a(this.f2936a.f2939a, true);
            } else if (this.f2936a.f2944f > 0) {
                if (C0691b.m3096a(2)) {
                    C0691b.m3093a("Ad not detected, scheduling another run.");
                }
                this.f2936a.f2942d.postDelayed(this.f2936a, this.f2936a.f2943e);
            }
        }

        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return m4540a((Void[]) objArr);
        }

        protected /* synthetic */ void onPostExecute(Object obj) {
            m4541a((Boolean) obj);
        }

        protected synchronized void onPreExecute() {
            this.f2938c = Bitmap.createBitmap(this.f2936a.f2947i, this.f2936a.f2946h, Config.ARGB_8888);
            this.f2937b.setVisibility(0);
            this.f2937b.measure(MeasureSpec.makeMeasureSpec(this.f2936a.f2947i, 0), MeasureSpec.makeMeasureSpec(this.f2936a.f2946h, 0));
            this.f2937b.layout(0, 0, this.f2936a.f2947i, this.f2936a.f2946h);
            this.f2937b.draw(new Canvas(this.f2938c));
            this.f2937b.invalidate();
        }
    }

    public ez(C0601a c0601a, hg hgVar, int i, int i2) {
        this(c0601a, hgVar, i, i2, 200, 50);
    }

    public ez(C0601a c0601a, hg hgVar, int i, int i2, long j, long j2) {
        this.f2943e = j;
        this.f2944f = j2;
        this.f2942d = new Handler(Looper.getMainLooper());
        this.f2939a = hgVar;
        this.f2945g = c0601a;
        this.f2940b = false;
        this.f2941c = false;
        this.f2946h = i2;
        this.f2947i = i;
    }

    static /* synthetic */ long m4544c(ez ezVar) {
        long j = ezVar.f2944f - 1;
        ezVar.f2944f = j;
        return j;
    }

    public void m4549a() {
        this.f2942d.postDelayed(this, this.f2943e);
    }

    public void m4550a(AdResponseParcel adResponseParcel) {
        m4551a(adResponseParcel, new ho(this, this.f2939a, adResponseParcel.f1880q));
    }

    public void m4551a(AdResponseParcel adResponseParcel, ho hoVar) {
        this.f2939a.setWebViewClient(hoVar);
        this.f2939a.loadDataWithBaseURL(TextUtils.isEmpty(adResponseParcel.f1865b) ? null : C0618p.m2796e().m4845a(adResponseParcel.f1865b), adResponseParcel.f1866c, "text/html", "UTF-8", null);
    }

    public synchronized void m4552b() {
        this.f2940b = true;
    }

    public synchronized boolean m4553c() {
        return this.f2940b;
    }

    public boolean m4554d() {
        return this.f2941c;
    }

    public void run() {
        if (this.f2939a == null || m4553c()) {
            this.f2945g.mo465a(this.f2939a, true);
        } else {
            new C0933a(this, this.f2939a.getWebView()).execute(new Void[0]);
        }
    }
}
