package com.google.android.gms.games.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1180c.C0650b;
import com.google.android.gms.common.api.C1180c.C0651c;
import com.google.android.gms.common.api.C1180c.C1179e;
import com.google.android.gms.common.api.C1183k.C0781b;
import com.google.android.gms.common.api.C1184l;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.C0655l;
import com.google.android.gms.common.internal.C1251d;
import com.google.android.gms.common.internal.C1266h;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.C1776b.C1774c;
import com.google.android.gms.games.C1783d;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.achievement.C1767b.C1766a;
import com.google.android.gms.games.internal.C1856g.C1858a;
import com.google.android.gms.games.internal.p042c.C1836b;
import com.google.android.gms.games.p035c.C1778a.C1777a;
import com.google.android.gms.games.p035c.C1780b;
import com.google.android.gms.games.snapshot.C1823g.C1817a;
import com.google.android.gms.games.snapshot.C1823g.C1819b;
import com.google.android.gms.games.snapshot.C1823g.C1821c;
import com.google.android.gms.games.snapshot.C1878d;
import com.google.android.gms.games.snapshot.C1881c;
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.games.snapshot.SnapshotContents;
import com.google.android.gms.games.snapshot.SnapshotContentsEntity;
import com.google.android.gms.games.snapshot.SnapshotEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataEntity;
import com.google.android.gms.signin.internal.C1931i;
import java.util.Set;
import java.util.concurrent.Executors;

public final class C1852c extends C0655l<C1856g> {
    C1836b f5594a = new C18371(this);
    private final String f5595e;
    private PlayerEntity f5596f;
    private GameEntity f5597g;
    private final C1862i f5598h;
    private boolean f5599i = false;
    private final Binder f5600j;
    private final long f5601k;
    private final C1774c f5602l;

    class C18371 extends C1836b {
        final /* synthetic */ C1852c f5575a;

        C18371(C1852c c1852c) {
            this.f5575a = c1852c;
        }
    }

    private static final class C1838a extends C1830a {
        private final C0781b<C1766a> f5576a;

        C1838a(C0781b<C1766a> c0781b) {
            this.f5576a = (C0781b) C1305x.m6618a((Object) c0781b, (Object) "Holder must not be null");
        }

        public void mo1296b(int i, String str) {
            this.f5576a.mo567a(new C1850m(i, str));
        }
    }

    private static abstract class C1839c extends C1184l {
        protected C1839c(DataHolder dataHolder) {
            super(dataHolder, C1783d.m8394a(dataHolder.m6245e()));
        }
    }

    private static final class C1840b extends C1839c implements C1817a {
        private final SnapshotMetadata f5577c;

        C1840b(DataHolder dataHolder) {
            super(dataHolder);
            C1881c c1881c = new C1881c(dataHolder);
            try {
                if (c1881c.mo899a() > 0) {
                    this.f5577c = new SnapshotMetadataEntity(c1881c.m9408b(0));
                } else {
                    this.f5577c = null;
                }
                c1881c.mo627b();
            } catch (Throwable th) {
                c1881c.mo627b();
            }
        }
    }

    private static final class C1841d extends C1839c implements C1819b {
        C1841d(DataHolder dataHolder) {
            super(dataHolder);
        }
    }

    private static final class C1842e extends C1839c implements C1821c {
        private final Snapshot f5578c;
        private final String f5579d;
        private final Snapshot f5580e;
        private final Contents f5581f;
        private final SnapshotContents f5582g;

        C1842e(DataHolder dataHolder, Contents contents) {
            this(dataHolder, null, contents, null, null);
        }

        C1842e(DataHolder dataHolder, String str, Contents contents, Contents contents2, Contents contents3) {
            boolean z = true;
            super(dataHolder);
            C1881c c1881c = new C1881c(dataHolder);
            try {
                if (c1881c.mo899a() == 0) {
                    this.f5578c = null;
                    this.f5580e = null;
                } else if (c1881c.mo899a() == 1) {
                    if (dataHolder.m6245e() == 4004) {
                        z = false;
                    }
                    C1251d.m6333a(z);
                    this.f5578c = new SnapshotEntity(new SnapshotMetadataEntity(c1881c.m9408b(0)), new SnapshotContentsEntity(contents));
                    this.f5580e = null;
                } else {
                    this.f5578c = new SnapshotEntity(new SnapshotMetadataEntity(c1881c.m9408b(0)), new SnapshotContentsEntity(contents));
                    this.f5580e = new SnapshotEntity(new SnapshotMetadataEntity(c1881c.m9408b(1)), new SnapshotContentsEntity(contents2));
                }
                c1881c.mo627b();
                this.f5579d = str;
                this.f5581f = contents3;
                this.f5582g = new SnapshotContentsEntity(contents3);
            } catch (Throwable th) {
                c1881c.mo627b();
            }
        }

        public Snapshot mo1257c() {
            return this.f5578c;
        }

        public String mo1258d() {
            return this.f5579d;
        }

        public Snapshot mo1259e() {
            return this.f5580e;
        }
    }

    private static final class C1843f extends C1835b {
        private final C1862i f5583a;

        public C1843f(C1862i c1862i) {
            this.f5583a = c1862i;
        }

        public PopupLocationInfoParcelable mo1338a() {
            return new PopupLocationInfoParcelable(this.f5583a.m9141d());
        }
    }

    private static final class C1844g extends C1830a {
        private final C0781b<Status> f5584a;

        public C1844g(C0781b<Status> c0781b) {
            this.f5584a = (C0781b) C1305x.m6618a((Object) c0781b, (Object) "Holder must not be null");
        }

        public void mo1280a() {
            this.f5584a.mo567a(C1783d.m8394a(0));
        }
    }

    private static final class C1845h extends C1830a {
        private final C0781b<C1817a> f5585a;

        public C1845h(C0781b<C1817a> c0781b) {
            this.f5585a = (C0781b) C1305x.m6618a((Object) c0781b, (Object) "Holder must not be null");
        }

        public void mo1271H(DataHolder dataHolder) {
            this.f5585a.mo567a(new C1840b(dataHolder));
        }
    }

    private static final class C1846i extends C1830a {
        private final C0781b<C1821c> f5586a;

        public C1846i(C0781b<C1821c> c0781b) {
            this.f5586a = (C0781b) C1305x.m6618a((Object) c0781b, (Object) "Holder must not be null");
        }

        public void mo1288a(DataHolder dataHolder, Contents contents) {
            this.f5586a.mo567a(new C1842e(dataHolder, contents));
        }

        public void mo1289a(DataHolder dataHolder, String str, Contents contents, Contents contents2, Contents contents3) {
            this.f5586a.mo567a(new C1842e(dataHolder, str, contents, contents2, contents3));
        }
    }

    private static final class C1847j extends C1830a {
        private final C0781b<C1819b> f5587a;

        public C1847j(C0781b<C1819b> c0781b) {
            this.f5587a = (C0781b) C1305x.m6618a((Object) c0781b, (Object) "Holder must not be null");
        }

        public void mo1270G(DataHolder dataHolder) {
            this.f5587a.mo567a(new C1841d(dataHolder));
        }
    }

    private static final class C1848k extends C1830a {
        private final C0781b<C1777a> f5588a;

        public C1848k(C0781b<C1777a> c0781b) {
            this.f5588a = (C0781b) C1305x.m6618a((Object) c0781b, (Object) "Holder must not be null");
        }

        public void mo1308d(DataHolder dataHolder) {
            this.f5588a.mo567a(new C1849l(dataHolder));
        }
    }

    private static final class C1849l extends C1839c implements C1777a {
        private final C1780b f5589c;

        public C1849l(DataHolder dataHolder) {
            super(dataHolder);
            try {
                this.f5589c = new C1780b(dataHolder);
            } finally {
                dataHolder.m6251i();
            }
        }
    }

    private static final class C1850m implements C1766a {
        private final Status f5590a;
        private final String f5591b;

        C1850m(int i, String str) {
            this.f5590a = C1783d.m8394a(i);
            this.f5591b = str;
        }

        public Status mo558a() {
            return this.f5590a;
        }
    }

    public C1852c(Context context, Looper looper, C1266h c1266h, C1774c c1774c, C0650b c0650b, C0651c c0651c) {
        super(context, looper, 1, c1266h, c0650b, c0651c);
        this.f5595e = c1266h.m6372g();
        this.f5600j = new Binder();
        this.f5598h = C1862i.m9135a(this, c1266h.m6368c());
        m8628a(c1266h.m6374i());
        this.f5601k = (long) hashCode();
        this.f5602l = c1774c;
    }

    private void m8619a(RemoteException remoteException) {
        C1853d.m8650b("GamesClientImpl", "service died", remoteException);
    }

    private void m8620u() {
        this.f5596f = null;
        this.f5597g = null;
    }

    public Intent m8621a(String str, int i) {
        try {
            return ((C1856g) m2994p()).mo1490f(str, i);
        } catch (RemoteException e) {
            m8619a(e);
            return null;
        }
    }

    public Intent m8622a(String str, boolean z, boolean z2, int i) {
        try {
            return ((C1856g) m2994p()).mo1353a(str, z, z2, i);
        } catch (RemoteException e) {
            m8619a(e);
            return null;
        }
    }

    protected C1856g m8623a(IBinder iBinder) {
        return C1858a.m9130a(iBinder);
    }

    protected String mo514a() {
        return "com.google.android.gms.games.service.START";
    }

    protected Set<Scope> mo1339a(Set<Scope> set) {
        Scope scope = new Scope("https://www.googleapis.com/auth/games");
        Scope scope2 = new Scope("https://www.googleapis.com/auth/games.firstparty");
        int i = 0;
        boolean z = false;
        for (Scope scope3 : set) {
            int i2;
            boolean z2;
            if (scope3.equals(scope)) {
                i2 = i;
                z2 = true;
            } else if (scope3.equals(scope2)) {
                i2 = 1;
                z2 = z;
            } else {
                i2 = i;
                z2 = z;
            }
            z = z2;
            i = i2;
        }
        if (i != 0) {
            C1305x.m6623a(!z, "Cannot have both %s and %s!", "https://www.googleapis.com/auth/games", "https://www.googleapis.com/auth/games.firstparty");
        } else {
            C1305x.m6623a(z, "Games APIs requires %s to function.", "https://www.googleapis.com/auth/games");
        }
        return set;
    }

    protected void mo1047a(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (i == 0 && bundle != null) {
            bundle.setClassLoader(C1852c.class.getClassLoader());
            this.f5599i = bundle.getBoolean("show_welcome_popup");
            this.f5596f = (PlayerEntity) bundle.getParcelable("com.google.android.gms.games.current_player");
            this.f5597g = (GameEntity) bundle.getParcelable("com.google.android.gms.games.current_game");
        }
        super.mo1047a(i, iBinder, bundle, i2);
    }

    public void m8627a(IBinder iBinder, Bundle bundle) {
        if (mo512e()) {
            try {
                ((C1856g) m2994p()).mo1363a(iBinder, bundle);
            } catch (RemoteException e) {
                m8619a(e);
            }
        }
    }

    public void m8628a(View view) {
        this.f5598h.mo1547a(view);
    }

    public void mo1340a(ConnectionResult connectionResult) {
        super.mo1340a(connectionResult);
        this.f5599i = false;
    }

    public void mo506a(C1179e c1179e) {
        m8620u();
        super.mo506a(c1179e);
    }

    public void m8631a(C0781b<Status> c0781b) {
        this.f5594a.m8604a();
        ((C1856g) m2994p()).mo1365a(new C1844g(c0781b));
    }

    public void m8632a(C0781b<C1817a> c0781b, Snapshot snapshot, C1878d c1878d) {
        SnapshotContents b = snapshot.mo1603b();
        C1305x.m6622a(!b.mo1600c(), (Object) "Snapshot already closed");
        BitmapTeleporter a = c1878d.mo1604a();
        if (a != null) {
            a.m6231a(m2989k().getCacheDir());
        }
        Contents a2 = b.mo1597a();
        b.mo1599b();
        ((C1856g) m2994p()).mo1389a(new C1845h(c0781b), snapshot.mo1602a().mo1607c(), (SnapshotMetadataChangeEntity) c1878d, a2);
    }

    public void m8633a(C0781b<C1766a> c0781b, String str) {
        C1828e c1828e;
        if (c0781b == null) {
            c1828e = null;
        } else {
            Object c1838a = new C1838a(c0781b);
        }
        ((C1856g) m2994p()).mo1435b(c1828e, str, this.f5598h.m9140c(), this.f5598h.m9139b());
    }

    public void m8634a(C0781b<C1777a> c0781b, String str, long j, String str2) {
        ((C1856g) m2994p()).mo1387a(c0781b == null ? null : new C1848k(c0781b), str, j, str2);
    }

    public void m8635a(C0781b<C1821c> c0781b, String str, String str2, C1878d c1878d, SnapshotContents snapshotContents) {
        C1305x.m6622a(!snapshotContents.mo1600c(), (Object) "SnapshotContents already closed");
        BitmapTeleporter a = c1878d.mo1604a();
        if (a != null) {
            a.m6231a(m2989k().getCacheDir());
        }
        Contents a2 = snapshotContents.mo1597a();
        snapshotContents.mo1599b();
        ((C1856g) m2994p()).mo1395a(new C1846i(c0781b), str, str2, (SnapshotMetadataChangeEntity) c1878d, a2);
    }

    public void m8636a(C0781b<C1821c> c0781b, String str, boolean z, int i) {
        ((C1856g) m2994p()).mo1401a(new C1846i(c0781b), str, z, i);
    }

    public void m8637a(C0781b<C1819b> c0781b, boolean z) {
        ((C1856g) m2994p()).mo1477d(new C1847j(c0781b), z);
    }

    public Bundle a_() {
        try {
            Bundle b = ((C1856g) m2994p()).mo1421b();
            if (b == null) {
                return b;
            }
            b.setClassLoader(C1852c.class.getClassLoader());
            return b;
        } catch (RemoteException e) {
            m8619a(e);
            return null;
        }
    }

    protected /* synthetic */ IInterface mo515b(IBinder iBinder) {
        return m8623a(iBinder);
    }

    protected String mo516b() {
        return "com.google.android.gms.games.internal.IGamesService";
    }

    public void mo517c() {
        try {
            ((C1856g) m2994p()).mo1413a(new C1843f(this.f5598h), this.f5601k);
        } catch (RemoteException e) {
            m8619a(e);
        }
    }

    public void mo511d() {
        this.f5599i = false;
        if (mo512e()) {
            try {
                C1856g c1856g = (C1856g) m2994p();
                c1856g.mo1447c();
                this.f5594a.m8604a();
                c1856g.mo1361a(this.f5601k);
            } catch (RemoteException e) {
                C1853d.m8647a("GamesClientImpl", "Failed to notify client disconnect.");
            }
        }
        super.mo511d();
    }

    public boolean mo513f() {
        return true;
    }

    public void mo1341h() {
        super.mo1341h();
        if (this.f5599i) {
            this.f5598h.mo1545a();
            this.f5599i = false;
        }
        if (!this.f5602l.f5507a) {
            mo517c();
        }
    }

    protected Bundle mo1048n() {
        String locale = m2989k().getResources().getConfiguration().locale.toString();
        Bundle a = this.f5602l.m8386a();
        a.putString("com.google.android.gms.games.key.gamePackageName", this.f5595e);
        a.putString("com.google.android.gms.games.key.desiredLocale", locale);
        a.putParcelable("com.google.android.gms.games.key.popupWindowToken", new BinderWrapper(this.f5598h.m9140c()));
        a.putInt("com.google.android.gms.games.key.API_VERSION", 0);
        C1266h m = m2991m();
        if (m.m6375j() != null) {
            a.putBundle("com.google.android.gms.games.key.signInOptions", C1931i.m9664a(m.m6375j(), m.m6376k(), Executors.newSingleThreadExecutor()));
        }
        return a;
    }

    public Intent mo1342s() {
        try {
            return ((C1856g) m2994p()).mo1520l();
        } catch (RemoteException e) {
            m8619a(e);
            return null;
        }
    }

    public void m8646t() {
        if (mo512e()) {
            try {
                ((C1856g) m2994p()).mo1447c();
            } catch (RemoteException e) {
                m8619a(e);
            }
        }
    }
}
