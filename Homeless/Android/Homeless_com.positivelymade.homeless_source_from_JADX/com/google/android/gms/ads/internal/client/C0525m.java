package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.C0455a.C0453b;
import com.google.android.gms.ads.C0483d;
import com.google.android.gms.p028c.fn;

@fn
public final class C0525m {
    private final C0483d[] f1439a;
    private final String f1440b;

    public C0525m(Context context, AttributeSet attributeSet) {
        Object obj = 1;
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C0453b.AdsAttrs);
        String string = obtainAttributes.getString(C0453b.AdsAttrs_adSize);
        String string2 = obtainAttributes.getString(C0453b.AdsAttrs_adSizes);
        Object obj2 = !TextUtils.isEmpty(string) ? 1 : null;
        if (TextUtils.isEmpty(string2)) {
            obj = null;
        }
        if (obj2 != null && r1 == null) {
            this.f1439a = C0525m.m2397a(string);
        } else if (obj2 == null && r1 != null) {
            this.f1439a = C0525m.m2397a(string2);
        } else if (obj2 == null || r1 == null) {
            throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
        } else {
            throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
        }
        this.f1440b = obtainAttributes.getString(C0453b.AdsAttrs_adUnitId);
        if (TextUtils.isEmpty(this.f1440b)) {
            throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        }
    }

    private static C0483d[] m2397a(String str) {
        String[] split = str.split("\\s*,\\s*");
        C0483d[] c0483dArr = new C0483d[split.length];
        for (int i = 0; i < split.length; i++) {
            String trim = split[i].trim();
            if (trim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] split2 = trim.split("[xX]");
                split2[0] = split2[0].trim();
                split2[1] = split2[1].trim();
                try {
                    c0483dArr[i] = new C0483d("FULL_WIDTH".equals(split2[0]) ? -1 : Integer.parseInt(split2[0]), "AUTO_HEIGHT".equals(split2[1]) ? -2 : Integer.parseInt(split2[1]));
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": " + trim);
                }
            } else if ("BANNER".equals(trim)) {
                c0483dArr[i] = C0483d.f1277a;
            } else if ("LARGE_BANNER".equals(trim)) {
                c0483dArr[i] = C0483d.f1279c;
            } else if ("FULL_BANNER".equals(trim)) {
                c0483dArr[i] = C0483d.f1278b;
            } else if ("LEADERBOARD".equals(trim)) {
                c0483dArr[i] = C0483d.f1280d;
            } else if ("MEDIUM_RECTANGLE".equals(trim)) {
                c0483dArr[i] = C0483d.f1281e;
            } else if ("SMART_BANNER".equals(trim)) {
                c0483dArr[i] = C0483d.f1283g;
            } else if ("WIDE_SKYSCRAPER".equals(trim)) {
                c0483dArr[i] = C0483d.f1282f;
            } else {
                throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": " + trim);
            }
        }
        if (c0483dArr.length != 0) {
            return c0483dArr;
        }
        throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": " + str);
    }

    public String m2398a() {
        return this.f1440b;
    }

    public C0483d[] m2399a(boolean z) {
        if (z || this.f1439a.length == 1) {
            return this.f1439a;
        }
        throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
    }
}
