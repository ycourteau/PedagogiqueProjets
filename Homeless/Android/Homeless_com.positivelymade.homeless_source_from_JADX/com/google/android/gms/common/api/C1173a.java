package com.google.android.gms.common.api;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C1180c.C0650b;
import com.google.android.gms.common.api.C1180c.C0651c;
import com.google.android.gms.common.api.C1180c.C1179e;
import com.google.android.gms.common.internal.C1246r;
import com.google.android.gms.common.internal.C1266h;
import com.google.android.gms.common.internal.C1305x;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class C1173a<O extends C1164a> {
    private final C0786b<?, O> f4103a;
    private final C1171f<?, O> f4104b = null;
    private final C1169d<?> f4105c;
    private final C1172g<?> f4106d;
    private final String f4107e;

    public interface C0653c {
        void mo506a(C1179e c1179e);

        void mo507a(C1246r c1246r);

        void mo508a(C1246r c1246r, Set<Scope> set);

        void mo509a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        void mo511d();

        boolean mo512e();

        boolean mo513f();
    }

    public static abstract class C0786b<T extends C0653c, O> {
        public int mo1251a() {
            return Integer.MAX_VALUE;
        }

        public abstract T mo575a(Context context, Looper looper, C1266h c1266h, O o, C0650b c0650b, C0651c c0651c);

        public List<Scope> mo1252a(O o) {
            return Collections.emptyList();
        }
    }

    public interface C1164a {

        public interface C1165a extends C1164a {
        }

        public interface C1166c extends C1164a {
        }

        public static final class C1167b implements C1166c {
            private C1167b() {
            }
        }

        public interface C1168d extends C1165a, C1166c {
        }
    }

    public static final class C1169d<C extends C0653c> {
    }

    public interface C1170e<T extends IInterface> {
        T m5973a(IBinder iBinder);

        String m5974a();

        void m5975a(int i, T t);

        String m5976b();
    }

    public interface C1171f<T extends C1170e, O> {
        int m5977a();

        T m5978a(O o);
    }

    public static final class C1172g<C extends C1170e> {
    }

    public <C extends C0653c> C1173a(String str, C0786b<C, O> c0786b, C1169d<C> c1169d) {
        C1305x.m6618a((Object) c0786b, (Object) "Cannot construct an Api with a null ClientBuilder");
        C1305x.m6618a((Object) c1169d, (Object) "Cannot construct an Api with a null ClientKey");
        this.f4107e = str;
        this.f4103a = c0786b;
        this.f4105c = c1169d;
        this.f4106d = null;
    }

    public C0786b<?, O> m5979a() {
        C1305x.m6622a(this.f4103a != null, (Object) "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.f4103a;
    }

    public C1171f<?, O> m5980b() {
        C1305x.m6622a(this.f4104b != null, (Object) "This API was constructed with a ClientBuilder. Use getClientBuilder");
        return this.f4104b;
    }

    public C1169d<?> m5981c() {
        C1305x.m6622a(this.f4105c != null, (Object) "This API was constructed with a SimpleClientKey. Use getSimpleClientKey");
        return this.f4105c;
    }

    public boolean m5982d() {
        return this.f4106d != null;
    }

    public String m5983e() {
        return this.f4107e;
    }
}
