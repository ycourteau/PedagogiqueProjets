package com.google.android.gms.ads.internal.formats;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.p028c.bl.C0560a;
import com.google.android.gms.p028c.fn;
import com.google.android.gms.p029b.C0799a;
import com.google.android.gms.p029b.C0802b;

@fn
public class C0561b extends C0560a {
    private final Drawable f1485a;
    private final Uri f1486b;

    public C0561b(Drawable drawable, Uri uri) {
        this.f1485a = drawable;
        this.f1486b = uri;
    }

    public C0799a mo409a() {
        return C0802b.m3754a(this.f1485a);
    }

    public Uri mo410b() {
        return this.f1486b;
    }
}
