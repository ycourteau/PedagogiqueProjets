package com.google.android.gms.appdatasearch;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C1173a;
import com.google.android.gms.common.api.C1173a.C0786b;
import com.google.android.gms.common.api.C1173a.C1164a.C1167b;
import com.google.android.gms.common.api.C1173a.C1169d;
import com.google.android.gms.common.api.C1180c.C0650b;
import com.google.android.gms.common.api.C1180c.C0651c;
import com.google.android.gms.common.internal.C1266h;
import com.google.android.gms.p028c.hx;
import com.google.android.gms.p028c.hy;

public final class C0788a {
    public static final C1169d<hx> f2342a = new C1169d();
    public static final C1173a<C1167b> f2343b = new C1173a("AppDataSearch.LIGHTWEIGHT_API", f2345d, f2342a);
    public static final C0798k f2344c = new hy();
    private static final C0786b<hx, C1167b> f2345d = new C07871();

    static class C07871 extends C0786b<hx, C1167b> {
        C07871() {
        }

        public hx m3725a(Context context, Looper looper, C1266h c1266h, C1167b c1167b, C0650b c0650b, C0651c c0651c) {
            return new hx(context, looper, c1266h, c0650b, c0651c);
        }
    }
}
