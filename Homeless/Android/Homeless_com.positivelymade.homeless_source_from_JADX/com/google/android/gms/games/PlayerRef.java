package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.C1239e;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.internal.player.C1867b;
import com.google.android.gms.games.internal.player.MostRecentGameInfo;
import com.google.android.gms.games.internal.player.MostRecentGameInfoRef;

public final class PlayerRef extends C1239e implements Player {
    private final C1867b f5487c;
    private final PlayerLevelInfo f5488d;
    private final MostRecentGameInfoRef f5489e;

    public PlayerRef(DataHolder dataHolder, int i) {
        this(dataHolder, i, null);
    }

    public PlayerRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i);
        this.f5487c = new C1867b(str);
        this.f5489e = new MostRecentGameInfoRef(dataHolder, i, this.f5487c);
        if (m8322p()) {
            PlayerLevel playerLevel;
            int c = m6262c(this.f5487c.f5638k);
            int c2 = m6262c(this.f5487c.f5641n);
            PlayerLevel playerLevel2 = new PlayerLevel(c, m6261b(this.f5487c.f5639l), m6261b(this.f5487c.f5640m));
            if (c != c2) {
                playerLevel = new PlayerLevel(c2, m6261b(this.f5487c.f5640m), m6261b(this.f5487c.f5642o));
            } else {
                playerLevel = playerLevel2;
            }
            this.f5488d = new PlayerLevelInfo(m6261b(this.f5487c.f5637j), m6261b(this.f5487c.f5643p), playerLevel2, playerLevel);
            return;
        }
        this.f5488d = null;
    }

    private boolean m8322p() {
        return (m6267h(this.f5487c.f5637j) || m6261b(this.f5487c.f5637j) == -1) ? false : true;
    }

    public String mo1227a() {
        return m6264e(this.f5487c.f5628a);
    }

    public String mo1228b() {
        return m6264e(this.f5487c.f5629b);
    }

    public boolean mo1229c() {
        return m6263d(this.f5487c.f5653z);
    }

    public Uri mo1230d() {
        return m6266g(this.f5487c.f5630c);
    }

    public int describeContents() {
        return 0;
    }

    public String mo1231e() {
        return m6264e(this.f5487c.f5631d);
    }

    public boolean equals(Object obj) {
        return PlayerEntity.m8293a(this, obj);
    }

    public Uri mo1232f() {
        return m6266g(this.f5487c.f5632e);
    }

    public String mo1233g() {
        return m6264e(this.f5487c.f5633f);
    }

    public long mo1234h() {
        return m6261b(this.f5487c.f5634g);
    }

    public int hashCode() {
        return PlayerEntity.m8292a((Player) this);
    }

    public long mo1235i() {
        return (!m6260a(this.f5487c.f5636i) || m6267h(this.f5487c.f5636i)) ? -1 : m6261b(this.f5487c.f5636i);
    }

    public int mo1236j() {
        return m6262c(this.f5487c.f5635h);
    }

    public boolean mo1237k() {
        return m6263d(this.f5487c.f5646s);
    }

    public String mo1238l() {
        return m6264e(this.f5487c.f5644q);
    }

    public PlayerLevelInfo mo1239m() {
        return this.f5488d;
    }

    public MostRecentGameInfo mo1240n() {
        return m6267h(this.f5487c.f5647t) ? null : this.f5489e;
    }

    public Player m8337o() {
        return new PlayerEntity(this);
    }

    public String toString() {
        return PlayerEntity.m8295b((Player) this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((PlayerEntity) m8337o()).writeToParcel(parcel, i);
    }
}
