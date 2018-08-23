package com.google.android.gms.drive;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.C1173a;
import com.google.android.gms.common.api.C1173a.C0786b;
import com.google.android.gms.common.api.C1173a.C1164a;
import com.google.android.gms.common.api.C1173a.C1164a.C1167b;
import com.google.android.gms.common.api.C1173a.C1164a.C1168d;
import com.google.android.gms.common.api.C1173a.C1169d;
import com.google.android.gms.common.api.C1180c.C0650b;
import com.google.android.gms.common.api.C1180c.C0651c;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C1266h;
import com.google.android.gms.drive.internal.C1647b;
import com.google.android.gms.drive.internal.bf;
import com.google.android.gms.drive.internal.bg;
import com.google.android.gms.drive.internal.bh;
import com.google.android.gms.drive.internal.bj;

public final class C1631a {
    public static final C1169d<bg> f5046a = new C1169d();
    public static final Scope f5047b = new Scope("https://www.googleapis.com/auth/drive.file");
    public static final Scope f5048c = new Scope("https://www.googleapis.com/auth/drive.appdata");
    public static final Scope f5049d = new Scope("https://www.googleapis.com/auth/drive");
    public static final Scope f5050e = new Scope("https://www.googleapis.com/auth/drive.apps");
    public static final C1173a<C1167b> f5051f = new C1173a("Drive.API", new C16281(), f5046a);
    public static final C1173a<C1630b> f5052g = new C1173a("Drive.INTERNAL_API", new C16292(), f5046a);
    public static final C1632b f5053h = new bf();
    public static final C1642f f5054i = new bh();
    public static final C1645i f5055j = new C1647b();
    public static final C1633c f5056k = new bj();

    public static abstract class C1627a<O extends C1164a> extends C0786b<bg, O> {
        protected abstract Bundle mo1045a(O o);

        public bg m7529a(Context context, Looper looper, C1266h c1266h, O o, C0650b c0650b, C0651c c0651c) {
            return new bg(context, looper, c1266h, c0650b, c0651c, mo1045a(o));
        }
    }

    static class C16281 extends C1627a<C1167b> {
        C16281() {
        }

        protected Bundle m7530a(C1167b c1167b) {
            return new Bundle();
        }

        protected /* synthetic */ Bundle mo1045a(C1164a c1164a) {
            return m7530a((C1167b) c1164a);
        }
    }

    static class C16292 extends C1627a<C1630b> {
        C16292() {
        }

        protected Bundle m7533a(C1630b c1630b) {
            return c1630b == null ? new Bundle() : c1630b.m7534a();
        }
    }

    public static class C1630b implements C1168d {
        private final Bundle f5045a;

        private C1630b() {
            this(new Bundle());
        }

        private C1630b(Bundle bundle) {
            this.f5045a = bundle;
        }

        public Bundle m7534a() {
            return this.f5045a;
        }
    }
}
