package com.google.android.gms.p028c;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.ads.p019b.C0463a.C0462a;
import com.google.android.gms.p029b.C0799a;
import com.google.android.gms.p029b.C0802b;

@fn
public class bm implements C0462a {
    private final bl f2541a;
    private final Drawable f2542b;
    private final Uri f2543c;

    public bm(bl blVar) {
        Drawable drawable;
        Uri uri = null;
        this.f2541a = blVar;
        try {
            C0799a a = this.f2541a.mo409a();
            if (a != null) {
                drawable = (Drawable) C0802b.m3755a(a);
                this.f2542b = drawable;
                uri = this.f2541a.mo410b();
                this.f2543c = uri;
            }
        } catch (Throwable e) {
            C0691b.m3098b("Failed to get drawable.", e);
        }
        Object obj = uri;
        this.f2542b = drawable;
        try {
            uri = this.f2541a.mo410b();
        } catch (Throwable e2) {
            C0691b.m3098b("Failed to get uri.", e2);
        }
        this.f2543c = uri;
    }

    public Drawable mo598a() {
        return this.f2542b;
    }

    public Uri mo599b() {
        return this.f2543c;
    }
}
