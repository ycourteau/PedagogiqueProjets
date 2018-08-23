package android.support.v4.p000a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;

public class C0000a {
    public static final Drawable m0a(Context context, int i) {
        return VERSION.SDK_INT >= 21 ? C0001b.m1a(context, i) : context.getResources().getDrawable(i);
    }
}
