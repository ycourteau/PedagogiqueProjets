package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.C1239e;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;

public final class SnapshotMetadataRef extends C1239e implements SnapshotMetadata {
    private final Game f5733c;
    private final Player f5734d;

    public SnapshotMetadataRef(DataHolder dataHolder, int i) {
        super(dataHolder, i);
        this.f5733c = new GameRef(dataHolder, i);
        this.f5734d = new PlayerRef(dataHolder, i);
    }

    public Game mo1605a() {
        return this.f5733c;
    }

    public Player mo1606b() {
        return this.f5734d;
    }

    public String mo1607c() {
        return m6264e("external_snapshot_id");
    }

    public Uri mo1608d() {
        return m6266g("cover_icon_image_uri");
    }

    public int describeContents() {
        return 0;
    }

    public String mo1609e() {
        return m6264e("cover_icon_image_url");
    }

    public boolean equals(Object obj) {
        return SnapshotMetadataEntity.m9371a(this, obj);
    }

    public float mo1610f() {
        float f = m6265f("cover_icon_image_height");
        return f == 0.0f ? 0.0f : m6265f("cover_icon_image_width") / f;
    }

    public String mo1611g() {
        return m6264e("unique_name");
    }

    public String mo1612h() {
        return m6264e("title");
    }

    public int hashCode() {
        return SnapshotMetadataEntity.m9370a(this);
    }

    public String mo1613i() {
        return m6264e("description");
    }

    public long mo1614j() {
        return m6261b("last_modified_timestamp");
    }

    public long mo1615k() {
        return m6261b("duration");
    }

    public boolean mo1616l() {
        return m6262c("pending_change_count") > 0;
    }

    public long mo1617m() {
        return m6261b("progress_value");
    }

    public SnapshotMetadata m9400n() {
        return new SnapshotMetadataEntity(this);
    }

    public String toString() {
        return SnapshotMetadataEntity.m9372b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((SnapshotMetadataEntity) m9400n()).writeToParcel(parcel, i);
    }
}
