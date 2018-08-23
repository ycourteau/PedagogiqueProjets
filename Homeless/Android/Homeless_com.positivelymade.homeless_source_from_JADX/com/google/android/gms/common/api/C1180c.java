package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.C0026g;
import android.view.View;
import com.google.android.gms.common.C1229b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1173a.C0653c;
import com.google.android.gms.common.api.C1173a.C0786b;
import com.google.android.gms.common.api.C1173a.C1164a;
import com.google.android.gms.common.api.C1173a.C1164a.C1166c;
import com.google.android.gms.common.api.C1173a.C1169d;
import com.google.android.gms.common.api.C1183k.C0783a;
import com.google.android.gms.common.internal.C1266h;
import com.google.android.gms.common.internal.C1266h.C1265a;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.p028c.ic;
import com.google.android.gms.signin.C1912b;
import com.google.android.gms.signin.C1914d;
import com.google.android.gms.signin.C1917e;
import com.google.android.gms.signin.C1917e.C1916a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public interface C1180c {

    public interface C0650b {
        void mo503a(Bundle bundle);

        void a_(int i);
    }

    public interface C0651c {
        void mo504a(ConnectionResult connectionResult);
    }

    public static final class C1176a {
        private Account f4110a;
        private final Set<Scope> f4111b = new HashSet();
        private int f4112c;
        private View f4113d;
        private String f4114e;
        private String f4115f;
        private final Map<C1173a<?>, C1265a> f4116g = new ic();
        private final Context f4117h;
        private final Map<C1173a<?>, C1164a> f4118i = new ic();
        private C0026g f4119j;
        private int f4120k = -1;
        private int f4121l = -1;
        private C0651c f4122m;
        private Looper f4123n;
        private C1229b f4124o = C1229b.m6224a();
        private C0786b<? extends C1914d, C1917e> f4125p = C1912b.f5863c;
        private final ArrayList<C0650b> f4126q = new ArrayList();
        private final ArrayList<C0651c> f4127r = new ArrayList();
        private C1916a f4128s = new C1916a();

        public C1176a(Context context) {
            this.f4117h = context;
            this.f4123n = context.getMainLooper();
            this.f4114e = context.getPackageName();
            this.f4115f = context.getClass().getName();
        }

        private void m5987a(C1223v c1223v, C1180c c1180c) {
            c1223v.m6192a(this.f4120k, c1180c, this.f4122m);
        }

        private C1180c m5988c() {
            final C1180c c1216p = new C1216p(this.f4117h.getApplicationContext(), this.f4123n, m5995a(), this.f4124o, this.f4125p, this.f4118i, this.f4126q, this.f4127r, this.f4120k, -1);
            C1223v a = C1223v.m6181a(this.f4119j);
            if (a == null) {
                new Handler(this.f4117h.getMainLooper()).post(new Runnable(this) {
                    final /* synthetic */ C1176a f4109b;

                    public void run() {
                        if (!this.f4109b.f4119j.isFinishing() && !this.f4109b.f4119j.m187f().mo26d()) {
                            this.f4109b.m5987a(C1223v.m6187b(this.f4109b.f4119j), c1216p);
                        }
                    }
                });
            } else {
                m5987a(a, c1216p);
            }
            return c1216p;
        }

        private C1180c m5989d() {
            C1228w a = C1228w.m6206a(this.f4119j);
            C1180c b = a.m6219b(this.f4121l);
            if (b == null) {
                b = new C1216p(this.f4117h.getApplicationContext(), this.f4123n, m5995a(), this.f4124o, this.f4125p, this.f4118i, this.f4126q, this.f4127r, -1, this.f4121l);
            }
            a.m6214a(this.f4121l, b, this.f4122m);
            return b;
        }

        public C1176a m5990a(View view) {
            this.f4113d = view;
            return this;
        }

        public C1176a m5991a(Scope scope) {
            this.f4111b.add(scope);
            return this;
        }

        public C1176a m5992a(C1173a<? extends C1166c> c1173a) {
            this.f4118i.put(c1173a, null);
            this.f4111b.addAll(c1173a.m5979a().mo1252a(null));
            return this;
        }

        public C1176a m5993a(C0650b c0650b) {
            this.f4126q.add(c0650b);
            return this;
        }

        public C1176a m5994a(C0651c c0651c) {
            this.f4127r.add(c0651c);
            return this;
        }

        public C1266h m5995a() {
            return new C1266h(this.f4110a, this.f4111b, this.f4116g, this.f4112c, this.f4113d, this.f4114e, this.f4115f, this.f4128s.m9617a());
        }

        public C1180c m5996b() {
            C1305x.m6626b(!this.f4118i.isEmpty(), "must call addApi() to add at least one API");
            return this.f4120k >= 0 ? m5988c() : this.f4121l >= 0 ? m5989d() : new C1216p(this.f4117h, this.f4123n, m5995a(), this.f4124o, this.f4125p, this.f4118i, this.f4126q, this.f4127r, -1, -1);
        }
    }

    public interface C1178d {

        public static class C1177a {
            private boolean f4129a;
            private Set<Scope> f4130b;

            public boolean m5997a() {
                return this.f4129a;
            }

            public Set<Scope> m5998b() {
                return this.f4130b;
            }
        }

        C1177a m5999a(String str, Set<Scope> set);

        boolean m6000a(String str, String str2);
    }

    public interface C1179e {
        void mo872a(ConnectionResult connectionResult);

        void mo873b(ConnectionResult connectionResult);
    }

    Looper mo875a();

    <C extends C0653c> C mo876a(C1169d<C> c1169d);

    <A extends C0653c, R extends C0774g, T extends C0783a<R, A>> T mo877a(T t);

    void mo878a(C0650b c0650b);

    void mo879a(C0651c c0651c);

    void mo880a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    boolean mo881a(C1173a<?> c1173a);

    <A extends C0653c, T extends C0783a<? extends C0774g, A>> T mo882b(T t);

    void mo883b();

    void mo884b(C0650b c0650b);

    void mo885b(C0651c c0651c);

    boolean mo886b(C1173a<?> c1173a);

    void mo887c();

    boolean mo888d();

    boolean mo889e();
}
