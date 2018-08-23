package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.common.internal.C1251d;
import com.google.android.gms.p028c.be;
import com.google.android.gms.p028c.bf;
import com.google.android.gms.p028c.fn;
import com.google.android.gms.p028c.hg;
import java.util.HashMap;
import java.util.Map;

@fn
public class C0613k extends FrameLayout implements C0611h {
    private final hg f1662a;
    private final FrameLayout f1663b;
    private final C0617q f1664c = new C0617q(this);
    private C0599i f1665d;
    private boolean f1666e;
    private boolean f1667f;
    private TextView f1668g;
    private long f1669h;
    private long f1670i;
    private String f1671j;
    private String f1672k;

    public C0613k(Context context, hg hgVar, int i, bf bfVar, be beVar) {
        super(context);
        this.f1662a = hgVar;
        this.f1663b = new FrameLayout(context);
        addView(this.f1663b);
        C1251d.m6332a(hgVar.mo781e());
        this.f1665d = hgVar.mo781e().f1463b.mo485a(context, hgVar, i, bfVar, beVar);
        this.f1663b.addView(this.f1665d, new LayoutParams(-1, -1, 17));
        this.f1668g = new TextView(context);
        this.f1668g.setBackgroundColor(-16777216);
        m2753o();
        this.f1664c.m2790b();
        this.f1665d.mo453a((C0611h) this);
    }

    public static void m2751a(hg hgVar) {
        Map hashMap = new HashMap();
        hashMap.put("event", "no_video_view");
        hgVar.mo768a("onVideoEvent", hashMap);
    }

    private void m2752a(String str, String... strArr) {
        Map hashMap = new HashMap();
        hashMap.put("event", str);
        int length = strArr.length;
        int i = 0;
        Object obj = null;
        while (i < length) {
            Object obj2 = strArr[i];
            if (obj != null) {
                hashMap.put(obj, obj2);
                obj2 = null;
            }
            i++;
            obj = obj2;
        }
        this.f1662a.mo768a("onVideoEvent", hashMap);
    }

    private void m2753o() {
        if (!m2755q()) {
            this.f1663b.addView(this.f1668g, new LayoutParams(-1, -1));
            this.f1663b.bringChildToFront(this.f1668g);
        }
    }

    private void m2754p() {
        if (m2755q()) {
            this.f1663b.removeView(this.f1668g);
        }
    }

    private boolean m2755q() {
        return this.f1668g.getParent() != null;
    }

    private void m2756r() {
        if (this.f1662a.mo776c() != null && !this.f1666e) {
            this.f1667f = (this.f1662a.mo776c().getWindow().getAttributes().flags & 128) != 0;
            if (!this.f1667f) {
                this.f1662a.mo776c().getWindow().addFlags(128);
                this.f1666e = true;
            }
        }
    }

    private void m2757s() {
        if (this.f1662a.mo776c() != null && this.f1666e && !this.f1667f) {
            this.f1662a.mo776c().getWindow().clearFlags(128);
            this.f1666e = false;
        }
    }

    public void mo478a() {
    }

    public void m2759a(float f) {
        this.f1665d.mo451a(f);
    }

    public void m2760a(int i) {
        this.f1665d.mo452a(i);
    }

    public void m2761a(int i, int i2, int i3, int i4) {
        if (i3 != 0 && i4 != 0) {
            ViewGroup.LayoutParams layoutParams = new LayoutParams(i3 + 2, i4 + 2);
            layoutParams.setMargins(i - 1, i2 - 1, 0, 0);
            this.f1663b.setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    public void m2762a(MotionEvent motionEvent) {
        this.f1665d.dispatchTouchEvent(motionEvent);
    }

    public void m2763a(String str) {
        this.f1672k = str;
    }

    public void mo479a(String str, String str2) {
        m2752a("error", "what", str, "extra", str2);
    }

    public void mo480b() {
        if (this.f1670i == 0) {
            float duration = ((float) this.f1665d.getDuration()) / 1000.0f;
            int videoWidth = this.f1665d.getVideoWidth();
            int videoHeight = this.f1665d.getVideoHeight();
            m2752a("canplaythrough", "duration", String.valueOf(duration), "videoWidth", String.valueOf(videoWidth), "videoHeight", String.valueOf(videoHeight));
        }
    }

    public void mo481c() {
        m2756r();
    }

    public void mo482d() {
        m2752a("pause", new String[0]);
        m2757s();
    }

    public void mo483e() {
        m2752a("ended", new String[0]);
        m2757s();
    }

    public void mo484f() {
        m2753o();
        this.f1670i = this.f1669h;
    }

    public void m2770g() {
        if (TextUtils.isEmpty(this.f1672k)) {
            m2752a("no_src", new String[0]);
            return;
        }
        this.f1665d.setMimeType(this.f1671j);
        this.f1665d.setVideoPath(this.f1672k);
    }

    public void m2771h() {
        this.f1665d.mo456d();
    }

    public void m2772i() {
        this.f1665d.mo455c();
    }

    public void m2773j() {
        this.f1665d.mo457e();
    }

    public void m2774k() {
        this.f1665d.mo458f();
    }

    public void m2775l() {
        View textView = new TextView(this.f1665d.getContext());
        textView.setText("AdMob - " + this.f1665d.mo450a());
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        this.f1663b.addView(textView, new LayoutParams(-2, -2, 17));
        this.f1663b.bringChildToFront(textView);
    }

    public void m2776m() {
        this.f1664c.m2789a();
        this.f1665d.mo454b();
        m2757s();
    }

    void m2777n() {
        long currentPosition = (long) this.f1665d.getCurrentPosition();
        if (this.f1669h != currentPosition && currentPosition > 0) {
            m2754p();
            float f = ((float) currentPosition) / 1000.0f;
            m2752a("timeupdate", "time", String.valueOf(f));
            this.f1669h = currentPosition;
        }
    }

    public void setMimeType(String str) {
        this.f1671j = str;
    }
}
