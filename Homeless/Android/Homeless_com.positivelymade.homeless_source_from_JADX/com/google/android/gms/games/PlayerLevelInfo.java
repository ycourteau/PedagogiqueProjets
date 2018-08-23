package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C1304w;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class PlayerLevelInfo implements SafeParcelable {
    public static final Creator<PlayerLevelInfo> CREATOR = new C1787h();
    private final int f5482a;
    private final long f5483b;
    private final long f5484c;
    private final PlayerLevel f5485d;
    private final PlayerLevel f5486e;

    PlayerLevelInfo(int i, long j, long j2, PlayerLevel playerLevel, PlayerLevel playerLevel2) {
        C1305x.m6621a(j != -1);
        C1305x.m6617a((Object) playerLevel);
        C1305x.m6617a((Object) playerLevel2);
        this.f5482a = i;
        this.f5483b = j;
        this.f5484c = j2;
        this.f5485d = playerLevel;
        this.f5486e = playerLevel2;
    }

    public PlayerLevelInfo(long j, long j2, PlayerLevel playerLevel, PlayerLevel playerLevel2) {
        this(1, j, j2, playerLevel, playerLevel2);
    }

    public int m8317a() {
        return this.f5482a;
    }

    public long m8318b() {
        return this.f5483b;
    }

    public long m8319c() {
        return this.f5484c;
    }

    public PlayerLevel m8320d() {
        return this.f5485d;
    }

    public int describeContents() {
        return 0;
    }

    public PlayerLevel m8321e() {
        return this.f5486e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlayerLevelInfo)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        PlayerLevelInfo playerLevelInfo = (PlayerLevelInfo) obj;
        return C1304w.m6615a(Long.valueOf(this.f5483b), Long.valueOf(playerLevelInfo.f5483b)) && C1304w.m6615a(Long.valueOf(this.f5484c), Long.valueOf(playerLevelInfo.f5484c)) && C1304w.m6615a(this.f5485d, playerLevelInfo.f5485d) && C1304w.m6615a(this.f5486e, playerLevelInfo.f5486e);
    }

    public int hashCode() {
        return C1304w.m6613a(Long.valueOf(this.f5483b), Long.valueOf(this.f5484c), this.f5485d, this.f5486e);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1787h.m8399a(this, parcel, i);
    }
}
