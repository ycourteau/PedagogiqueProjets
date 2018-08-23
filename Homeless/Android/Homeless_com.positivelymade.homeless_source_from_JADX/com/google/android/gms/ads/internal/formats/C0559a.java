package com.google.android.gms.ads.internal.formats;

import android.graphics.Color;
import android.graphics.drawable.Drawable;

public class C0559a {
    static final int f1476a = f1479d;
    static final int f1477b = f1478c;
    private static final int f1478c = Color.rgb(12, 174, 206);
    private static final int f1479d = Color.rgb(204, 204, 204);
    private final String f1480e;
    private final Drawable f1481f;
    private final int f1482g;
    private final int f1483h;
    private final int f1484i;

    public C0559a(String str, Drawable drawable, Integer num, Integer num2, Integer num3) {
        this.f1480e = str;
        this.f1481f = drawable;
        this.f1482g = num != null ? num.intValue() : f1476a;
        this.f1483h = num2 != null ? num2.intValue() : f1477b;
        this.f1484i = num3 != null ? num3.intValue() : 12;
    }
}
