package com.google.android.gms.common.api;

import android.os.RemoteException;
import com.google.android.gms.common.api.C1173a.C0653c;
import com.google.android.gms.common.api.C1173a.C1169d;
import com.google.android.gms.common.api.C1216p.C0782e;
import com.google.android.gms.common.api.C1216p.C1209d;
import com.google.android.gms.common.internal.C1305x;
import java.util.concurrent.atomic.AtomicReference;

public class C1183k {

    public interface C0781b<R> {
        void mo567a(R r);
    }

    public static abstract class C0783a<R extends C0774g, A extends C0653c> extends C0780i<R> implements C0781b<R>, C0782e<A> {
        private final C1169d<A> f2311b;
        private AtomicReference<C1209d> f2312c = new AtomicReference();

        protected C0783a(C1169d<A> c1169d, C1180c c1180c) {
            super(((C1180c) C1305x.m6618a((Object) c1180c, (Object) "GoogleApiClient must not be null")).mo875a());
            this.f2311b = (C1169d) C1305x.m6617a((Object) c1169d);
        }

        private void m3705a(RemoteException remoteException) {
            mo569d(new Status(8, remoteException.getLocalizedMessage(), null));
        }

        protected abstract void mo573a(A a);

        public void mo566a(C1209d c1209d) {
            this.f2312c.set(c1209d);
        }

        public /* synthetic */ void mo567a(Object obj) {
            super.m3689a((C0774g) obj);
        }

        public final void mo568b(A a) {
            try {
                mo573a((C0653c) a);
            } catch (RemoteException e) {
                m3705a(e);
                throw e;
            } catch (RemoteException e2) {
                m3705a(e2);
            }
        }

        public final void mo569d(Status status) {
            C1305x.m6626b(!status.m5971e(), "Failed result must not be success");
            m3689a(mo574b(status));
        }

        protected void mo570e() {
            C1209d c1209d = (C1209d) this.f2312c.getAndSet(null);
            if (c1209d != null) {
                c1209d.mo874a(this);
            }
        }

        public final C1169d<A> mo571f() {
            return this.f2311b;
        }

        public int mo572g() {
            return 0;
        }
    }
}
