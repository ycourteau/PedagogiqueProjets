package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C1304w;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class PlayerLevel implements SafeParcelable {
    public static final Creator<PlayerLevel> CREATOR = new C1786g();
    private final int f5478a;
    private final int f5479b;
    private final long f5480c;
    private final long f5481d;

    PlayerLevel(int i, int i2, long j, long j2) {
        boolean z = true;
        C1305x.m6622a(j >= 0, (Object) "Min XP must be positive!");
        if (j2 <= j) {
            z = false;
        }
        C1305x.m6622a(z, (Object) "Max XP must be more than min XP!");
        this.f5478a = i;
        this.f5479b = i2;
        this.f5480c = j;
        this.f5481d = j2;
    }

    public PlayerLevel(int i, long j, long j2) {
        this(1, i, j, j2);
    }

    public int m8313a() {
        return this.f5478a;
    }

    public int m8314b() {
        return this.f5479b;
    }

    public long m8315c() {
        return this.f5480c;
    }

    public long m8316d() {
        return this.f5481d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlayerLevel)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        PlayerLevel playerLevel = (PlayerLevel) obj;
        return C1304w.m6615a(Integer.valueOf(playerLevel.m8314b()), Integer.valueOf(m8314b())) && C1304w.m6615a(Long.valueOf(playerLevel.m8315c()), Long.valueOf(m8315c())) && C1304w.m6615a(Long.valueOf(playerLevel.m8316d()), Long.valueOf(m8316d()));
    }

    public int hashCode() {
        return C1304w.m6613a(Integer.valueOf(this.f5479b), Long.valueOf(this.f5480c), Long.valueOf(this.f5481d));
    }

    public String toString() {
        return C1304w.m6614a((Object) this).m6612a("LevelNumber", Integer.valueOf(m8314b())).m6612a("MinXp", Long.valueOf(m8315c())).m6612a("MaxXp", Long.valueOf(m8316d())).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1786g.m8396a(this, parcel, i);
    }
}
