package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C1304w;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class SnapshotEntity implements SafeParcelable, Snapshot {
    public static final Creator<SnapshotEntity> CREATOR = new C1880b();
    private final int f5709a;
    private final SnapshotMetadataEntity f5710b;
    private final SnapshotContentsEntity f5711c;

    SnapshotEntity(int i, SnapshotMetadata snapshotMetadata, SnapshotContentsEntity snapshotContentsEntity) {
        this.f5709a = i;
        this.f5710b = new SnapshotMetadataEntity(snapshotMetadata);
        this.f5711c = snapshotContentsEntity;
    }

    public SnapshotEntity(SnapshotMetadata snapshotMetadata, SnapshotContentsEntity snapshotContentsEntity) {
        this(2, snapshotMetadata, snapshotContentsEntity);
    }

    static int m9343a(Snapshot snapshot) {
        return C1304w.m6613a(snapshot.mo1602a(), snapshot.mo1603b());
    }

    static boolean m9344a(Snapshot snapshot, Object obj) {
        if (!(obj instanceof Snapshot)) {
            return false;
        }
        if (snapshot == obj) {
            return true;
        }
        Snapshot snapshot2 = (Snapshot) obj;
        return C1304w.m6615a(snapshot2.mo1602a(), snapshot.mo1602a()) && C1304w.m6615a(snapshot2.mo1603b(), snapshot.mo1603b());
    }

    static String m9345b(Snapshot snapshot) {
        return C1304w.m6614a((Object) snapshot).m6612a("Metadata", snapshot.mo1602a()).m6612a("HasContents", Boolean.valueOf(snapshot.mo1603b() != null)).toString();
    }

    private boolean m9346d() {
        return this.f5711c.mo1600c();
    }

    public SnapshotMetadata mo1602a() {
        return this.f5710b;
    }

    public SnapshotContents mo1603b() {
        return m9346d() ? null : this.f5711c;
    }

    public int m9349c() {
        return this.f5709a;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return m9344a(this, obj);
    }

    public int hashCode() {
        return m9343a(this);
    }

    public String toString() {
        return m9345b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1880b.m9404a(this, parcel, i);
    }
}
