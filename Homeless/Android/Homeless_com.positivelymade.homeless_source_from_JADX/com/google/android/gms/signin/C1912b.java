package com.google.android.gms.signin;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C1173a;
import com.google.android.gms.common.api.C1173a.C0653c;
import com.google.android.gms.common.api.C1173a.C0786b;
import com.google.android.gms.common.api.C1173a.C1164a.C1167b;
import com.google.android.gms.common.api.C1173a.C1169d;
import com.google.android.gms.common.api.C1180c.C0650b;
import com.google.android.gms.common.api.C1180c.C0651c;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C1266h;
import com.google.android.gms.signin.internal.C1927h;
import com.google.android.gms.signin.internal.C1931i;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executors;

public final class C1912b {
    public static final C1169d<C1931i> f5861a = new C1169d();
    public static final C1169d<C1931i> f5862b = new C1169d();
    public static final C0786b<C1931i, C1917e> f5863c = new C19101();
    static final C0786b<C1931i, C1167b> f5864d = new C19112();
    public static final Scope f5865e = new Scope("profile");
    public static final Scope f5866f = new Scope("email");
    public static final C1173a<C1917e> f5867g = new C1173a("SignIn.API", f5863c, f5861a);
    public static final C1173a<C1167b> f5868h = new C1173a("SignIn.INTERNAL_API", f5864d, f5862b);
    public static final C1913c f5869i = new C1927h();

    static class C19101 extends C0786b<C1931i, C1917e> {
        C19101() {
        }

        public C1931i m9607a(Context context, Looper looper, C1266h c1266h, C1917e c1917e, C0650b c0650b, C0651c c0651c) {
            return new C1931i(context, looper, true, c1266h, c1917e, c0650b, c0651c, Executors.newSingleThreadExecutor());
        }

        public List<Scope> m9608a(C1917e c1917e) {
            return Arrays.asList(new Scope[]{C1912b.f5865e, C1912b.f5866f});
        }

        public /* synthetic */ List mo1252a(Object obj) {
            return m9608a((C1917e) obj);
        }
    }

    static class C19112 extends C0786b<C1931i, C1167b> {
        C19112() {
        }

        public /* synthetic */ C0653c mo575a(Context context, Looper looper, C1266h c1266h, Object obj, C0650b c0650b, C0651c c0651c) {
            return m9611a(context, looper, c1266h, (C1167b) obj, c0650b, c0651c);
        }

        public C1931i m9611a(Context context, Looper looper, C1266h c1266h, C1167b c1167b, C0650b c0650b, C0651c c0651c) {
            return new C1931i(context, looper, false, c1266h, C1917e.f5874a, c0650b, c0651c, Executors.newSingleThreadExecutor());
        }
    }
}
