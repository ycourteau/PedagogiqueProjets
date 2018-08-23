package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C1304w;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;

public final class SnapshotMetadataEntity implements SafeParcelable, SnapshotMetadata {
    public static final Creator<SnapshotMetadataEntity> CREATOR = new C1884f();
    private final int f5719a;
    private final GameEntity f5720b;
    private final PlayerEntity f5721c;
    private final String f5722d;
    private final Uri f5723e;
    private final String f5724f;
    private final String f5725g;
    private final String f5726h;
    private final long f5727i;
    private final long f5728j;
    private final float f5729k;
    private final String f5730l;
    private final boolean f5731m;
    private final long f5732n;

    SnapshotMetadataEntity(int i, GameEntity gameEntity, PlayerEntity playerEntity, String str, Uri uri, String str2, String str3, String str4, long j, long j2, float f, String str5, boolean z, long j3) {
        this.f5719a = i;
        this.f5720b = gameEntity;
        this.f5721c = playerEntity;
        this.f5722d = str;
        this.f5723e = uri;
        this.f5724f = str2;
        this.f5729k = f;
        this.f5725g = str3;
        this.f5726h = str4;
        this.f5727i = j;
        this.f5728j = j2;
        this.f5730l = str5;
        this.f5731m = z;
        this.f5732n = j3;
    }

    public SnapshotMetadataEntity(SnapshotMetadata snapshotMetadata) {
        this.f5719a = 5;
        this.f5720b = new GameEntity(snapshotMetadata.mo1605a());
        this.f5721c = new PlayerEntity(snapshotMetadata.mo1606b());
        this.f5722d = snapshotMetadata.mo1607c();
        this.f5723e = snapshotMetadata.mo1608d();
        this.f5724f = snapshotMetadata.mo1609e();
        this.f5729k = snapshotMetadata.mo1610f();
        this.f5725g = snapshotMetadata.mo1612h();
        this.f5726h = snapshotMetadata.mo1613i();
        this.f5727i = snapshotMetadata.mo1614j();
        this.f5728j = snapshotMetadata.mo1615k();
        this.f5730l = snapshotMetadata.mo1611g();
        this.f5731m = snapshotMetadata.mo1616l();
        this.f5732n = snapshotMetadata.mo1617m();
    }

    static int m9370a(SnapshotMetadata snapshotMetadata) {
        return C1304w.m6613a(snapshotMetadata.mo1605a(), snapshotMetadata.mo1606b(), snapshotMetadata.mo1607c(), snapshotMetadata.mo1608d(), Float.valueOf(snapshotMetadata.mo1610f()), snapshotMetadata.mo1612h(), snapshotMetadata.mo1613i(), Long.valueOf(snapshotMetadata.mo1614j()), Long.valueOf(snapshotMetadata.mo1615k()), snapshotMetadata.mo1611g(), Boolean.valueOf(snapshotMetadata.mo1616l()), Long.valueOf(snapshotMetadata.mo1617m()));
    }

    static boolean m9371a(SnapshotMetadata snapshotMetadata, Object obj) {
        if (!(obj instanceof SnapshotMetadata)) {
            return false;
        }
        if (snapshotMetadata == obj) {
            return true;
        }
        SnapshotMetadata snapshotMetadata2 = (SnapshotMetadata) obj;
        return C1304w.m6615a(snapshotMetadata2.mo1605a(), snapshotMetadata.mo1605a()) && C1304w.m6615a(snapshotMetadata2.mo1606b(), snapshotMetadata.mo1606b()) && C1304w.m6615a(snapshotMetadata2.mo1607c(), snapshotMetadata.mo1607c()) && C1304w.m6615a(snapshotMetadata2.mo1608d(), snapshotMetadata.mo1608d()) && C1304w.m6615a(Float.valueOf(snapshotMetadata2.mo1610f()), Float.valueOf(snapshotMetadata.mo1610f())) && C1304w.m6615a(snapshotMetadata2.mo1612h(), snapshotMetadata.mo1612h()) && C1304w.m6615a(snapshotMetadata2.mo1613i(), snapshotMetadata.mo1613i()) && C1304w.m6615a(Long.valueOf(snapshotMetadata2.mo1614j()), Long.valueOf(snapshotMetadata.mo1614j())) && C1304w.m6615a(Long.valueOf(snapshotMetadata2.mo1615k()), Long.valueOf(snapshotMetadata.mo1615k())) && C1304w.m6615a(snapshotMetadata2.mo1611g(), snapshotMetadata.mo1611g()) && C1304w.m6615a(Boolean.valueOf(snapshotMetadata2.mo1616l()), Boolean.valueOf(snapshotMetadata.mo1616l())) && C1304w.m6615a(Long.valueOf(snapshotMetadata2.mo1617m()), Long.valueOf(snapshotMetadata.mo1617m()));
    }

    static String m9372b(SnapshotMetadata snapshotMetadata) {
        return C1304w.m6614a((Object) snapshotMetadata).m6612a("Game", snapshotMetadata.mo1605a()).m6612a("Owner", snapshotMetadata.mo1606b()).m6612a("SnapshotId", snapshotMetadata.mo1607c()).m6612a("CoverImageUri", snapshotMetadata.mo1608d()).m6612a("CoverImageUrl", snapshotMetadata.mo1609e()).m6612a("CoverImageAspectRatio", Float.valueOf(snapshotMetadata.mo1610f())).m6612a("Description", snapshotMetadata.mo1613i()).m6612a("LastModifiedTimestamp", Long.valueOf(snapshotMetadata.mo1614j())).m6612a("PlayedTime", Long.valueOf(snapshotMetadata.mo1615k())).m6612a("UniqueName", snapshotMetadata.mo1611g()).m6612a("ChangePending", Boolean.valueOf(snapshotMetadata.mo1616l())).m6612a("ProgressValue", Long.valueOf(snapshotMetadata.mo1617m())).toString();
    }

    public Game mo1605a() {
        return this.f5720b;
    }

    public Player mo1606b() {
        return this.f5721c;
    }

    public String mo1607c() {
        return this.f5722d;
    }

    public Uri mo1608d() {
        return this.f5723e;
    }

    public int describeContents() {
        return 0;
    }

    public String mo1609e() {
        return this.f5724f;
    }

    public boolean equals(Object obj) {
        return m9371a(this, obj);
    }

    public float mo1610f() {
        return this.f5729k;
    }

    public String mo1611g() {
        return this.f5730l;
    }

    public String mo1612h() {
        return this.f5725g;
    }

    public int hashCode() {
        return m9370a(this);
    }

    public String mo1613i() {
        return this.f5726h;
    }

    public long mo1614j() {
        return this.f5727i;
    }

    public long mo1615k() {
        return this.f5728j;
    }

    public boolean mo1616l() {
        return this.f5731m;
    }

    public long mo1617m() {
        return this.f5732n;
    }

    public int m9386n() {
        return this.f5719a;
    }

    public String toString() {
        return m9372b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1884f.m9416a(this, parcel, i);
    }
}
