package com.google.android.gms.games.snapshot;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.gms.common.data.BitmapTeleporter;

public abstract class C1878d {
    public static final C1878d f5712a = new SnapshotMetadataChangeEntity();

    public static final class C1882a {
        private String f5735a;
        private Long f5736b;
        private Long f5737c;
        private BitmapTeleporter f5738d;
        private Uri f5739e;

        public C1882a m9409a(Bitmap bitmap) {
            this.f5738d = new BitmapTeleporter(bitmap);
            this.f5739e = null;
            return this;
        }

        public C1882a m9410a(SnapshotMetadata snapshotMetadata) {
            this.f5735a = snapshotMetadata.mo1613i();
            this.f5736b = Long.valueOf(snapshotMetadata.mo1615k());
            this.f5737c = Long.valueOf(snapshotMetadata.mo1617m());
            if (this.f5736b.longValue() == -1) {
                this.f5736b = null;
            }
            this.f5739e = snapshotMetadata.mo1608d();
            if (this.f5739e != null) {
                this.f5738d = null;
            }
            return this;
        }

        public C1882a m9411a(String str) {
            this.f5735a = str;
            return this;
        }

        public C1878d m9412a() {
            return new SnapshotMetadataChangeEntity(this.f5735a, this.f5736b, this.f5738d, this.f5739e, this.f5737c);
        }
    }

    protected C1878d() {
    }

    public abstract BitmapTeleporter mo1604a();
}
