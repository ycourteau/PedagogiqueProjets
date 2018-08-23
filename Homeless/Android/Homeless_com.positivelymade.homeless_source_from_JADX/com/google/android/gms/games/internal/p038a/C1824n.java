package com.google.android.gms.games.internal.p038a;

import android.content.Intent;
import com.google.android.gms.common.api.C0774g;
import com.google.android.gms.common.api.C0777e;
import com.google.android.gms.common.api.C1180c;
import com.google.android.gms.common.api.C1183k.C0781b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.C1776b;
import com.google.android.gms.games.C1776b.C1771a;
import com.google.android.gms.games.internal.C1852c;
import com.google.android.gms.games.snapshot.C1823g;
import com.google.android.gms.games.snapshot.C1823g.C1817a;
import com.google.android.gms.games.snapshot.C1823g.C1819b;
import com.google.android.gms.games.snapshot.C1823g.C1821c;
import com.google.android.gms.games.snapshot.C1878d;
import com.google.android.gms.games.snapshot.C1878d.C1882a;
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.games.snapshot.SnapshotContents;
import com.google.android.gms.games.snapshot.SnapshotMetadata;

public final class C1824n implements C1823g {

    private static abstract class C1810b extends C1771a<C1819b> {
        public C1819b m8416a(final Status status) {
            return new C1819b(this) {
                final /* synthetic */ C1810b f5571b;

                public Status mo558a() {
                    return status;
                }

                public void mo627b() {
                }
            };
        }

        public /* synthetic */ C0774g mo574b(Status status) {
            return m8416a(status);
        }
    }

    class C18111 extends C1810b {
        final /* synthetic */ boolean f5555b;

        protected void m8419a(C1852c c1852c) {
            c1852c.m8637a((C0781b) this, this.f5555b);
        }
    }

    private static abstract class C1812c extends C1771a<C1821c> {
        private C1812c(C1180c c1180c) {
            super(c1180c);
        }

        public C1821c m8420a(final Status status) {
            return new C1821c(this) {
                final /* synthetic */ C1812c f5573b;

                public Status mo558a() {
                    return status;
                }

                public Snapshot mo1257c() {
                    return null;
                }

                public String mo1258d() {
                    return null;
                }

                public Snapshot mo1259e() {
                    return null;
                }
            };
        }

        public /* synthetic */ C0774g mo574b(Status status) {
            return m8420a(status);
        }
    }

    private static abstract class C1814a extends C1771a<C1817a> {
        private C1814a(C1180c c1180c) {
            super(c1180c);
        }

        public C1817a m8424a(final Status status) {
            return new C1817a(this) {
                final /* synthetic */ C1814a f5569b;

                public Status mo558a() {
                    return status;
                }
            };
        }

        public /* synthetic */ C0774g mo574b(Status status) {
            return m8424a(status);
        }
    }

    public Intent mo1260a(C1180c c1180c, String str, boolean z, boolean z2, int i) {
        return C1776b.m8387a(c1180c).m8622a(str, z, z2, i);
    }

    public C0777e<C1817a> mo1261a(C1180c c1180c, final Snapshot snapshot, final C1878d c1878d) {
        return c1180c.mo882b(new C1814a(this, c1180c) {
            final /* synthetic */ C1824n f5562d;

            protected void m8427a(C1852c c1852c) {
                c1852c.m8632a(this, snapshot, c1878d);
            }
        });
    }

    public C0777e<C1821c> mo1262a(C1180c c1180c, String str, Snapshot snapshot) {
        SnapshotMetadata a = snapshot.mo1602a();
        C1878d a2 = new C1882a().m9410a(a).m9412a();
        return m8447a(c1180c, str, a.mo1607c(), a2, snapshot.mo1603b());
    }

    public C0777e<C1821c> m8447a(C1180c c1180c, String str, String str2, C1878d c1878d, SnapshotContents snapshotContents) {
        final String str3 = str;
        final String str4 = str2;
        final C1878d c1878d2 = c1878d;
        final SnapshotContents snapshotContents2 = snapshotContents;
        return c1180c.mo882b(new C1812c(this, c1180c) {
            final /* synthetic */ C1824n f5567f;

            protected void m8429a(C1852c c1852c) {
                c1852c.m8635a(this, str3, str4, c1878d2, snapshotContents2);
            }
        });
    }

    public C0777e<C1821c> mo1263a(C1180c c1180c, String str, boolean z) {
        return m8449a(c1180c, str, z, -1);
    }

    public C0777e<C1821c> m8449a(C1180c c1180c, String str, boolean z, int i) {
        final String str2 = str;
        final boolean z2 = z;
        final int i2 = i;
        return c1180c.mo882b(new C1812c(this, c1180c) {
            final /* synthetic */ C1824n f5559e;

            protected void m8423a(C1852c c1852c) {
                c1852c.m8636a((C0781b) this, str2, z2, i2);
            }
        });
    }
}
