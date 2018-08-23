package com.google.android.gms.p028c;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.C0618p;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.C0526n;
import com.google.android.gms.ads.internal.util.client.C0691b;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@fn
public class dx extends ed {
    static final Set<String> f2801a = new HashSet(Arrays.asList(new String[]{"top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center"}));
    private String f2802b = "top-right";
    private boolean f2803c = true;
    private int f2804d = 0;
    private int f2805e = 0;
    private int f2806f = -1;
    private int f2807g = 0;
    private int f2808h = 0;
    private int f2809i = -1;
    private final Object f2810j = new Object();
    private final hg f2811k;
    private final Activity f2812l;
    private AdSizeParcel f2813m;
    private ImageView f2814n;
    private LinearLayout f2815o;
    private ee f2816p;
    private PopupWindow f2817q;
    private RelativeLayout f2818r;
    private ViewGroup f2819s;

    class C09111 implements OnClickListener {
        final /* synthetic */ dx f2800a;

        C09111(dx dxVar) {
            this.f2800a = dxVar;
        }

        public void onClick(View view) {
            this.f2800a.m4439a(true);
        }
    }

    public dx(hg hgVar, ee eeVar) {
        super(hgVar, "resize");
        this.f2811k = hgVar;
        this.f2812l = hgVar.mo776c();
        this.f2816p = eeVar;
    }

    private void m4434b(Map<String, String> map) {
        if (!TextUtils.isEmpty((CharSequence) map.get("width"))) {
            this.f2809i = C0618p.m2796e().m4867b((String) map.get("width"));
        }
        if (!TextUtils.isEmpty((CharSequence) map.get("height"))) {
            this.f2806f = C0618p.m2796e().m4867b((String) map.get("height"));
        }
        if (!TextUtils.isEmpty((CharSequence) map.get("offsetX"))) {
            this.f2807g = C0618p.m2796e().m4867b((String) map.get("offsetX"));
        }
        if (!TextUtils.isEmpty((CharSequence) map.get("offsetY"))) {
            this.f2808h = C0618p.m2796e().m4867b((String) map.get("offsetY"));
        }
        if (!TextUtils.isEmpty((CharSequence) map.get("allowOffscreen"))) {
            this.f2803c = Boolean.parseBoolean((String) map.get("allowOffscreen"));
        }
        String str = (String) map.get("customClosePosition");
        if (!TextUtils.isEmpty(str)) {
            this.f2802b = str;
        }
    }

    private int[] m4435d() {
        if (!m4444c()) {
            return null;
        }
        if (this.f2803c) {
            return new int[]{this.f2804d + this.f2807g, this.f2805e + this.f2808h};
        }
        int[] b = C0618p.m2796e().m4874b(this.f2812l);
        int[] d = C0618p.m2796e().m4882d(this.f2812l);
        int i = b[0];
        int i2 = this.f2804d + this.f2807g;
        int i3 = this.f2805e + this.f2808h;
        if (i2 < 0) {
            i2 = 0;
        } else if (this.f2809i + i2 > i) {
            i2 = i - this.f2809i;
        }
        if (i3 < d[0]) {
            i3 = d[0];
        } else if (this.f2806f + i3 > d[1]) {
            i3 = d[1] - this.f2806f;
        }
        return new int[]{i2, i3};
    }

    void m4436a(int i, int i2) {
        if (this.f2816p != null) {
            this.f2816p.mo379a(i, i2, this.f2809i, this.f2806f);
        }
    }

    public void m4437a(int i, int i2, boolean z) {
        synchronized (this.f2810j) {
            this.f2804d = i;
            this.f2805e = i2;
            if (this.f2817q != null && z) {
                int[] d = m4435d();
                if (d != null) {
                    this.f2817q.update(C0526n.m2400a().m3079a(this.f2812l, d[0]), C0526n.m2400a().m3079a(this.f2812l, d[1]), this.f2817q.getWidth(), this.f2817q.getHeight());
                    m4441b(d[0], d[1]);
                } else {
                    m4439a(true);
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m4438a(java.util.Map<java.lang.String, java.lang.String> r13) {
        /*
        r12 = this;
        r4 = -1;
        r5 = 1;
        r3 = 0;
        r6 = r12.f2810j;
        monitor-enter(r6);
        r1 = r12.f2812l;	 Catch:{ all -> 0x0020 }
        if (r1 != 0) goto L_0x0011;
    L_0x000a:
        r1 = "Not an activity context. Cannot resize.";
        r12.m4425b(r1);	 Catch:{ all -> 0x0020 }
        monitor-exit(r6);	 Catch:{ all -> 0x0020 }
    L_0x0010:
        return;
    L_0x0011:
        r1 = r12.f2811k;	 Catch:{ all -> 0x0020 }
        r1 = r1.mo787h();	 Catch:{ all -> 0x0020 }
        if (r1 != 0) goto L_0x0023;
    L_0x0019:
        r1 = "Webview is not yet available, size is not set.";
        r12.m4425b(r1);	 Catch:{ all -> 0x0020 }
        monitor-exit(r6);	 Catch:{ all -> 0x0020 }
        goto L_0x0010;
    L_0x0020:
        r1 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0020 }
        throw r1;
    L_0x0023:
        r1 = r12.f2811k;	 Catch:{ all -> 0x0020 }
        r1 = r1.mo787h();	 Catch:{ all -> 0x0020 }
        r1 = r1.f1351e;	 Catch:{ all -> 0x0020 }
        if (r1 == 0) goto L_0x0034;
    L_0x002d:
        r1 = "Is interstitial. Cannot resize an interstitial.";
        r12.m4425b(r1);	 Catch:{ all -> 0x0020 }
        monitor-exit(r6);	 Catch:{ all -> 0x0020 }
        goto L_0x0010;
    L_0x0034:
        r1 = r12.f2811k;	 Catch:{ all -> 0x0020 }
        r1 = r1.mo795m();	 Catch:{ all -> 0x0020 }
        if (r1 == 0) goto L_0x0043;
    L_0x003c:
        r1 = "Cannot resize an expanded banner.";
        r12.m4425b(r1);	 Catch:{ all -> 0x0020 }
        monitor-exit(r6);	 Catch:{ all -> 0x0020 }
        goto L_0x0010;
    L_0x0043:
        r12.m4434b(r13);	 Catch:{ all -> 0x0020 }
        r1 = r12.m4440a();	 Catch:{ all -> 0x0020 }
        if (r1 != 0) goto L_0x0053;
    L_0x004c:
        r1 = "Invalid width and height options. Cannot resize.";
        r12.m4425b(r1);	 Catch:{ all -> 0x0020 }
        monitor-exit(r6);	 Catch:{ all -> 0x0020 }
        goto L_0x0010;
    L_0x0053:
        r1 = r12.f2812l;	 Catch:{ all -> 0x0020 }
        r7 = r1.getWindow();	 Catch:{ all -> 0x0020 }
        if (r7 == 0) goto L_0x0061;
    L_0x005b:
        r1 = r7.getDecorView();	 Catch:{ all -> 0x0020 }
        if (r1 != 0) goto L_0x0068;
    L_0x0061:
        r1 = "Activity context is not ready, cannot get window or decor view.";
        r12.m4425b(r1);	 Catch:{ all -> 0x0020 }
        monitor-exit(r6);	 Catch:{ all -> 0x0020 }
        goto L_0x0010;
    L_0x0068:
        r8 = r12.m4435d();	 Catch:{ all -> 0x0020 }
        if (r8 != 0) goto L_0x0075;
    L_0x006e:
        r1 = "Resize location out of screen or close button is not visible.";
        r12.m4425b(r1);	 Catch:{ all -> 0x0020 }
        monitor-exit(r6);	 Catch:{ all -> 0x0020 }
        goto L_0x0010;
    L_0x0075:
        r1 = com.google.android.gms.ads.internal.client.C0526n.m2400a();	 Catch:{ all -> 0x0020 }
        r2 = r12.f2812l;	 Catch:{ all -> 0x0020 }
        r9 = r12.f2809i;	 Catch:{ all -> 0x0020 }
        r9 = r1.m3079a(r2, r9);	 Catch:{ all -> 0x0020 }
        r1 = com.google.android.gms.ads.internal.client.C0526n.m2400a();	 Catch:{ all -> 0x0020 }
        r2 = r12.f2812l;	 Catch:{ all -> 0x0020 }
        r10 = r12.f2806f;	 Catch:{ all -> 0x0020 }
        r10 = r1.m3079a(r2, r10);	 Catch:{ all -> 0x0020 }
        r1 = r12.f2811k;	 Catch:{ all -> 0x0020 }
        r1 = r1.getWebView();	 Catch:{ all -> 0x0020 }
        r2 = r1.getParent();	 Catch:{ all -> 0x0020 }
        if (r2 == 0) goto L_0x01d5;
    L_0x0099:
        r1 = r2 instanceof android.view.ViewGroup;	 Catch:{ all -> 0x0020 }
        if (r1 == 0) goto L_0x01d5;
    L_0x009d:
        r0 = r2;
        r0 = (android.view.ViewGroup) r0;	 Catch:{ all -> 0x0020 }
        r1 = r0;
        r11 = r12.f2811k;	 Catch:{ all -> 0x0020 }
        r11 = r11.getWebView();	 Catch:{ all -> 0x0020 }
        r1.removeView(r11);	 Catch:{ all -> 0x0020 }
        r1 = r12.f2817q;	 Catch:{ all -> 0x0020 }
        if (r1 != 0) goto L_0x01ce;
    L_0x00ae:
        r2 = (android.view.ViewGroup) r2;	 Catch:{ all -> 0x0020 }
        r12.f2819s = r2;	 Catch:{ all -> 0x0020 }
        r1 = com.google.android.gms.ads.internal.C0618p.m2796e();	 Catch:{ all -> 0x0020 }
        r2 = r12.f2811k;	 Catch:{ all -> 0x0020 }
        r2 = r2.getWebView();	 Catch:{ all -> 0x0020 }
        r1 = r1.m4836a(r2);	 Catch:{ all -> 0x0020 }
        r2 = new android.widget.ImageView;	 Catch:{ all -> 0x0020 }
        r11 = r12.f2812l;	 Catch:{ all -> 0x0020 }
        r2.<init>(r11);	 Catch:{ all -> 0x0020 }
        r12.f2814n = r2;	 Catch:{ all -> 0x0020 }
        r2 = r12.f2814n;	 Catch:{ all -> 0x0020 }
        r2.setImageBitmap(r1);	 Catch:{ all -> 0x0020 }
        r1 = r12.f2811k;	 Catch:{ all -> 0x0020 }
        r1 = r1.mo787h();	 Catch:{ all -> 0x0020 }
        r12.f2813m = r1;	 Catch:{ all -> 0x0020 }
        r1 = r12.f2819s;	 Catch:{ all -> 0x0020 }
        r2 = r12.f2814n;	 Catch:{ all -> 0x0020 }
        r1.addView(r2);	 Catch:{ all -> 0x0020 }
    L_0x00dd:
        r1 = new android.widget.RelativeLayout;	 Catch:{ all -> 0x0020 }
        r2 = r12.f2812l;	 Catch:{ all -> 0x0020 }
        r1.<init>(r2);	 Catch:{ all -> 0x0020 }
        r12.f2818r = r1;	 Catch:{ all -> 0x0020 }
        r1 = r12.f2818r;	 Catch:{ all -> 0x0020 }
        r2 = 0;
        r1.setBackgroundColor(r2);	 Catch:{ all -> 0x0020 }
        r1 = r12.f2818r;	 Catch:{ all -> 0x0020 }
        r2 = new android.view.ViewGroup$LayoutParams;	 Catch:{ all -> 0x0020 }
        r2.<init>(r9, r10);	 Catch:{ all -> 0x0020 }
        r1.setLayoutParams(r2);	 Catch:{ all -> 0x0020 }
        r1 = com.google.android.gms.ads.internal.C0618p.m2796e();	 Catch:{ all -> 0x0020 }
        r2 = r12.f2818r;	 Catch:{ all -> 0x0020 }
        r11 = 0;
        r1 = r1.m4838a(r2, r9, r10, r11);	 Catch:{ all -> 0x0020 }
        r12.f2817q = r1;	 Catch:{ all -> 0x0020 }
        r1 = r12.f2817q;	 Catch:{ all -> 0x0020 }
        r2 = 1;
        r1.setOutsideTouchable(r2);	 Catch:{ all -> 0x0020 }
        r1 = r12.f2817q;	 Catch:{ all -> 0x0020 }
        r2 = 1;
        r1.setTouchable(r2);	 Catch:{ all -> 0x0020 }
        r2 = r12.f2817q;	 Catch:{ all -> 0x0020 }
        r1 = r12.f2803c;	 Catch:{ all -> 0x0020 }
        if (r1 != 0) goto L_0x01dd;
    L_0x0115:
        r1 = r5;
    L_0x0116:
        r2.setClippingEnabled(r1);	 Catch:{ all -> 0x0020 }
        r1 = r12.f2818r;	 Catch:{ all -> 0x0020 }
        r2 = r12.f2811k;	 Catch:{ all -> 0x0020 }
        r2 = r2.getWebView();	 Catch:{ all -> 0x0020 }
        r9 = -1;
        r10 = -1;
        r1.addView(r2, r9, r10);	 Catch:{ all -> 0x0020 }
        r1 = new android.widget.LinearLayout;	 Catch:{ all -> 0x0020 }
        r2 = r12.f2812l;	 Catch:{ all -> 0x0020 }
        r1.<init>(r2);	 Catch:{ all -> 0x0020 }
        r12.f2815o = r1;	 Catch:{ all -> 0x0020 }
        r2 = new android.widget.RelativeLayout$LayoutParams;	 Catch:{ all -> 0x0020 }
        r1 = com.google.android.gms.ads.internal.client.C0526n.m2400a();	 Catch:{ all -> 0x0020 }
        r9 = r12.f2812l;	 Catch:{ all -> 0x0020 }
        r10 = 50;
        r1 = r1.m3079a(r9, r10);	 Catch:{ all -> 0x0020 }
        r9 = com.google.android.gms.ads.internal.client.C0526n.m2400a();	 Catch:{ all -> 0x0020 }
        r10 = r12.f2812l;	 Catch:{ all -> 0x0020 }
        r11 = 50;
        r9 = r9.m3079a(r10, r11);	 Catch:{ all -> 0x0020 }
        r2.<init>(r1, r9);	 Catch:{ all -> 0x0020 }
        r1 = r12.f2802b;	 Catch:{ all -> 0x0020 }
        r9 = r1.hashCode();	 Catch:{ all -> 0x0020 }
        switch(r9) {
            case -1364013995: goto L_0x01f6;
            case -1012429441: goto L_0x01e0;
            case -655373719: goto L_0x0201;
            case 1163912186: goto L_0x0217;
            case 1288627767: goto L_0x020c;
            case 1755462605: goto L_0x01eb;
            default: goto L_0x0155;
        };	 Catch:{ all -> 0x0020 }
    L_0x0155:
        r1 = r4;
    L_0x0156:
        switch(r1) {
            case 0: goto L_0x0222;
            case 1: goto L_0x022e;
            case 2: goto L_0x023a;
            case 3: goto L_0x0241;
            case 4: goto L_0x024d;
            case 5: goto L_0x0259;
            default: goto L_0x0159;
        };	 Catch:{ all -> 0x0020 }
    L_0x0159:
        r1 = 10;
        r2.addRule(r1);	 Catch:{ all -> 0x0020 }
        r1 = 11;
        r2.addRule(r1);	 Catch:{ all -> 0x0020 }
    L_0x0163:
        r1 = r12.f2815o;	 Catch:{ all -> 0x0020 }
        r3 = new com.google.android.gms.c.dx$1;	 Catch:{ all -> 0x0020 }
        r3.<init>(r12);	 Catch:{ all -> 0x0020 }
        r1.setOnClickListener(r3);	 Catch:{ all -> 0x0020 }
        r1 = r12.f2815o;	 Catch:{ all -> 0x0020 }
        r3 = "Close button";
        r1.setContentDescription(r3);	 Catch:{ all -> 0x0020 }
        r1 = r12.f2818r;	 Catch:{ all -> 0x0020 }
        r3 = r12.f2815o;	 Catch:{ all -> 0x0020 }
        r1.addView(r3, r2);	 Catch:{ all -> 0x0020 }
        r1 = r12.f2817q;	 Catch:{ RuntimeException -> 0x0265 }
        r2 = r7.getDecorView();	 Catch:{ RuntimeException -> 0x0265 }
        r3 = 0;
        r4 = com.google.android.gms.ads.internal.client.C0526n.m2400a();	 Catch:{ RuntimeException -> 0x0265 }
        r5 = r12.f2812l;	 Catch:{ RuntimeException -> 0x0265 }
        r7 = 0;
        r7 = r8[r7];	 Catch:{ RuntimeException -> 0x0265 }
        r4 = r4.m3079a(r5, r7);	 Catch:{ RuntimeException -> 0x0265 }
        r5 = com.google.android.gms.ads.internal.client.C0526n.m2400a();	 Catch:{ RuntimeException -> 0x0265 }
        r7 = r12.f2812l;	 Catch:{ RuntimeException -> 0x0265 }
        r9 = 1;
        r9 = r8[r9];	 Catch:{ RuntimeException -> 0x0265 }
        r5 = r5.m3079a(r7, r9);	 Catch:{ RuntimeException -> 0x0265 }
        r1.showAtLocation(r2, r3, r4, r5);	 Catch:{ RuntimeException -> 0x0265 }
        r1 = 0;
        r1 = r8[r1];	 Catch:{ all -> 0x0020 }
        r2 = 1;
        r2 = r8[r2];	 Catch:{ all -> 0x0020 }
        r12.m4436a(r1, r2);	 Catch:{ all -> 0x0020 }
        r1 = r12.f2811k;	 Catch:{ all -> 0x0020 }
        r2 = new com.google.android.gms.ads.internal.client.AdSizeParcel;	 Catch:{ all -> 0x0020 }
        r3 = r12.f2812l;	 Catch:{ all -> 0x0020 }
        r4 = new com.google.android.gms.ads.d;	 Catch:{ all -> 0x0020 }
        r5 = r12.f2809i;	 Catch:{ all -> 0x0020 }
        r7 = r12.f2806f;	 Catch:{ all -> 0x0020 }
        r4.<init>(r5, r7);	 Catch:{ all -> 0x0020 }
        r2.<init>(r3, r4);	 Catch:{ all -> 0x0020 }
        r1.mo763a(r2);	 Catch:{ all -> 0x0020 }
        r1 = 0;
        r1 = r8[r1];	 Catch:{ all -> 0x0020 }
        r2 = 1;
        r2 = r8[r2];	 Catch:{ all -> 0x0020 }
        r12.m4441b(r1, r2);	 Catch:{ all -> 0x0020 }
        r1 = "resized";
        r12.m4427d(r1);	 Catch:{ all -> 0x0020 }
        monitor-exit(r6);	 Catch:{ all -> 0x0020 }
        goto L_0x0010;
    L_0x01ce:
        r1 = r12.f2817q;	 Catch:{ all -> 0x0020 }
        r1.dismiss();	 Catch:{ all -> 0x0020 }
        goto L_0x00dd;
    L_0x01d5:
        r1 = "Webview is detached, probably in the middle of a resize or expand.";
        r12.m4425b(r1);	 Catch:{ all -> 0x0020 }
        monitor-exit(r6);	 Catch:{ all -> 0x0020 }
        goto L_0x0010;
    L_0x01dd:
        r1 = r3;
        goto L_0x0116;
    L_0x01e0:
        r5 = "top-left";
        r1 = r1.equals(r5);	 Catch:{ all -> 0x0020 }
        if (r1 == 0) goto L_0x0155;
    L_0x01e8:
        r1 = r3;
        goto L_0x0156;
    L_0x01eb:
        r3 = "top-center";
        r1 = r1.equals(r3);	 Catch:{ all -> 0x0020 }
        if (r1 == 0) goto L_0x0155;
    L_0x01f3:
        r1 = r5;
        goto L_0x0156;
    L_0x01f6:
        r3 = "center";
        r1 = r1.equals(r3);	 Catch:{ all -> 0x0020 }
        if (r1 == 0) goto L_0x0155;
    L_0x01fe:
        r1 = 2;
        goto L_0x0156;
    L_0x0201:
        r3 = "bottom-left";
        r1 = r1.equals(r3);	 Catch:{ all -> 0x0020 }
        if (r1 == 0) goto L_0x0155;
    L_0x0209:
        r1 = 3;
        goto L_0x0156;
    L_0x020c:
        r3 = "bottom-center";
        r1 = r1.equals(r3);	 Catch:{ all -> 0x0020 }
        if (r1 == 0) goto L_0x0155;
    L_0x0214:
        r1 = 4;
        goto L_0x0156;
    L_0x0217:
        r3 = "bottom-right";
        r1 = r1.equals(r3);	 Catch:{ all -> 0x0020 }
        if (r1 == 0) goto L_0x0155;
    L_0x021f:
        r1 = 5;
        goto L_0x0156;
    L_0x0222:
        r1 = 10;
        r2.addRule(r1);	 Catch:{ all -> 0x0020 }
        r1 = 9;
        r2.addRule(r1);	 Catch:{ all -> 0x0020 }
        goto L_0x0163;
    L_0x022e:
        r1 = 10;
        r2.addRule(r1);	 Catch:{ all -> 0x0020 }
        r1 = 14;
        r2.addRule(r1);	 Catch:{ all -> 0x0020 }
        goto L_0x0163;
    L_0x023a:
        r1 = 13;
        r2.addRule(r1);	 Catch:{ all -> 0x0020 }
        goto L_0x0163;
    L_0x0241:
        r1 = 12;
        r2.addRule(r1);	 Catch:{ all -> 0x0020 }
        r1 = 9;
        r2.addRule(r1);	 Catch:{ all -> 0x0020 }
        goto L_0x0163;
    L_0x024d:
        r1 = 12;
        r2.addRule(r1);	 Catch:{ all -> 0x0020 }
        r1 = 14;
        r2.addRule(r1);	 Catch:{ all -> 0x0020 }
        goto L_0x0163;
    L_0x0259:
        r1 = 12;
        r2.addRule(r1);	 Catch:{ all -> 0x0020 }
        r1 = 11;
        r2.addRule(r1);	 Catch:{ all -> 0x0020 }
        goto L_0x0163;
    L_0x0265:
        r1 = move-exception;
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0020 }
        r2.<init>();	 Catch:{ all -> 0x0020 }
        r3 = "Cannot show popup window: ";
        r2 = r2.append(r3);	 Catch:{ all -> 0x0020 }
        r1 = r1.getMessage();	 Catch:{ all -> 0x0020 }
        r1 = r2.append(r1);	 Catch:{ all -> 0x0020 }
        r1 = r1.toString();	 Catch:{ all -> 0x0020 }
        r12.m4425b(r1);	 Catch:{ all -> 0x0020 }
        r1 = r12.f2818r;	 Catch:{ all -> 0x0020 }
        r2 = r12.f2811k;	 Catch:{ all -> 0x0020 }
        r2 = r2.getWebView();	 Catch:{ all -> 0x0020 }
        r1.removeView(r2);	 Catch:{ all -> 0x0020 }
        r1 = r12.f2819s;	 Catch:{ all -> 0x0020 }
        if (r1 == 0) goto L_0x02a8;
    L_0x028f:
        r1 = r12.f2819s;	 Catch:{ all -> 0x0020 }
        r2 = r12.f2814n;	 Catch:{ all -> 0x0020 }
        r1.removeView(r2);	 Catch:{ all -> 0x0020 }
        r1 = r12.f2819s;	 Catch:{ all -> 0x0020 }
        r2 = r12.f2811k;	 Catch:{ all -> 0x0020 }
        r2 = r2.getWebView();	 Catch:{ all -> 0x0020 }
        r1.addView(r2);	 Catch:{ all -> 0x0020 }
        r1 = r12.f2811k;	 Catch:{ all -> 0x0020 }
        r2 = r12.f2813m;	 Catch:{ all -> 0x0020 }
        r1.mo763a(r2);	 Catch:{ all -> 0x0020 }
    L_0x02a8:
        monitor-exit(r6);	 Catch:{ all -> 0x0020 }
        goto L_0x0010;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.c.dx.a(java.util.Map):void");
    }

    public void m4439a(boolean z) {
        synchronized (this.f2810j) {
            if (this.f2817q != null) {
                this.f2817q.dismiss();
                this.f2818r.removeView(this.f2811k.getWebView());
                if (this.f2819s != null) {
                    this.f2819s.removeView(this.f2814n);
                    this.f2819s.addView(this.f2811k.getWebView());
                    this.f2811k.mo763a(this.f2813m);
                }
                if (z) {
                    m4427d("default");
                    if (this.f2816p != null) {
                        this.f2816p.mo384z();
                    }
                }
                this.f2817q = null;
                this.f2818r = null;
                this.f2819s = null;
                this.f2815o = null;
            }
        }
    }

    boolean m4440a() {
        return this.f2809i > -1 && this.f2806f > -1;
    }

    void m4441b(int i, int i2) {
        m4422a(i, i2 - C0618p.m2796e().m4882d(this.f2812l)[0], this.f2809i, this.f2806f);
    }

    public boolean m4442b() {
        boolean z;
        synchronized (this.f2810j) {
            z = this.f2817q != null;
        }
        return z;
    }

    public void m4443c(int i, int i2) {
        this.f2804d = i;
        this.f2805e = i2;
    }

    boolean m4444c() {
        int[] b = C0618p.m2796e().m4874b(this.f2812l);
        int[] d = C0618p.m2796e().m4882d(this.f2812l);
        int i = b[0];
        int i2 = b[1];
        if (this.f2809i < 50 || this.f2809i > i) {
            C0691b.m3103e("Width is too small or too large.");
            return false;
        } else if (this.f2806f < 50 || this.f2806f > i2) {
            C0691b.m3103e("Height is too small or too large.");
            return false;
        } else if (this.f2806f == i2 && this.f2809i == i) {
            C0691b.m3103e("Cannot resize to a full-screen ad.");
            return false;
        } else {
            if (this.f2803c) {
                int i3;
                String str = this.f2802b;
                boolean z = true;
                switch (str.hashCode()) {
                    case -1364013995:
                        if (str.equals("center")) {
                            z = true;
                            break;
                        }
                        break;
                    case -1012429441:
                        if (str.equals("top-left")) {
                            z = false;
                            break;
                        }
                        break;
                    case -655373719:
                        if (str.equals("bottom-left")) {
                            z = true;
                            break;
                        }
                        break;
                    case 1163912186:
                        if (str.equals("bottom-right")) {
                            z = true;
                            break;
                        }
                        break;
                    case 1288627767:
                        if (str.equals("bottom-center")) {
                            z = true;
                            break;
                        }
                        break;
                    case 1755462605:
                        if (str.equals("top-center")) {
                            z = true;
                            break;
                        }
                        break;
                }
                switch (z) {
                    case false:
                        i3 = this.f2807g + this.f2804d;
                        i2 = this.f2805e + this.f2808h;
                        break;
                    case true:
                        i3 = ((this.f2804d + this.f2807g) + (this.f2809i / 2)) - 25;
                        i2 = this.f2805e + this.f2808h;
                        break;
                    case true:
                        i3 = ((this.f2804d + this.f2807g) + (this.f2809i / 2)) - 25;
                        i2 = ((this.f2805e + this.f2808h) + (this.f2806f / 2)) - 25;
                        break;
                    case true:
                        i3 = this.f2807g + this.f2804d;
                        i2 = ((this.f2805e + this.f2808h) + this.f2806f) - 50;
                        break;
                    case true:
                        i3 = ((this.f2804d + this.f2807g) + (this.f2809i / 2)) - 25;
                        i2 = ((this.f2805e + this.f2808h) + this.f2806f) - 50;
                        break;
                    case true:
                        i3 = ((this.f2804d + this.f2807g) + this.f2809i) - 50;
                        i2 = ((this.f2805e + this.f2808h) + this.f2806f) - 50;
                        break;
                    default:
                        i3 = ((this.f2804d + this.f2807g) + this.f2809i) - 50;
                        i2 = this.f2805e + this.f2808h;
                        break;
                }
                if (i3 < 0 || i3 + 50 > i || r2 < d[0] || r2 + 50 > d[1]) {
                    return false;
                }
            }
            return true;
        }
    }
}
