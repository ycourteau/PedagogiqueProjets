package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C1251d;
import com.google.android.gms.common.internal.C1304w;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.internal.player.MostRecentGameInfo;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;

public final class PlayerEntity extends GamesDowngradeableSafeParcel implements Player {
    public static final Creator<PlayerEntity> CREATOR = new C1763a();
    private final int f5463a;
    private final String f5464b;
    private final String f5465c;
    private final Uri f5466d;
    private final Uri f5467e;
    private final long f5468f;
    private final int f5469g;
    private final long f5470h;
    private final String f5471i;
    private final String f5472j;
    private final String f5473k;
    private final MostRecentGameInfoEntity f5474l;
    private final PlayerLevelInfo f5475m;
    private final boolean f5476n;
    private final boolean f5477o;

    static final class C1763a extends C1762f {
        C1763a() {
        }

        public PlayerEntity mo1225a(Parcel parcel) {
            if (GamesDowngradeableSafeParcel.m8215b(DowngradeableSafeParcel.e_()) || DowngradeableSafeParcel.m6304a(PlayerEntity.class.getCanonicalName())) {
                return super.mo1225a(parcel);
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            return new PlayerEntity(12, readString, readString2, readString3 == null ? null : Uri.parse(readString3), readString4 == null ? null : Uri.parse(readString4), parcel.readLong(), -1, -1, null, null, null, null, null, true, false);
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return mo1225a(parcel);
        }
    }

    PlayerEntity(int i, String str, String str2, Uri uri, Uri uri2, long j, int i2, long j2, String str3, String str4, String str5, MostRecentGameInfoEntity mostRecentGameInfoEntity, PlayerLevelInfo playerLevelInfo, boolean z, boolean z2) {
        this.f5463a = i;
        this.f5464b = str;
        this.f5465c = str2;
        this.f5466d = uri;
        this.f5471i = str3;
        this.f5467e = uri2;
        this.f5472j = str4;
        this.f5468f = j;
        this.f5469g = i2;
        this.f5470h = j2;
        this.f5473k = str5;
        this.f5476n = z;
        this.f5474l = mostRecentGameInfoEntity;
        this.f5475m = playerLevelInfo;
        this.f5477o = z2;
    }

    public PlayerEntity(Player player) {
        this(player, true);
    }

    public PlayerEntity(Player player, boolean z) {
        MostRecentGameInfoEntity mostRecentGameInfoEntity = null;
        this.f5463a = 12;
        this.f5464b = z ? player.mo1227a() : null;
        this.f5465c = player.mo1228b();
        this.f5466d = player.mo1230d();
        this.f5471i = player.mo1231e();
        this.f5467e = player.mo1232f();
        this.f5472j = player.mo1233g();
        this.f5468f = player.mo1234h();
        this.f5469g = player.mo1236j();
        this.f5470h = player.mo1235i();
        this.f5473k = player.mo1238l();
        this.f5476n = player.mo1237k();
        MostRecentGameInfo n = player.mo1240n();
        if (n != null) {
            mostRecentGameInfoEntity = new MostRecentGameInfoEntity(n);
        }
        this.f5474l = mostRecentGameInfoEntity;
        this.f5475m = player.mo1239m();
        this.f5477o = player.mo1229c();
        if (z) {
            C1251d.m6332a(this.f5464b);
        }
        C1251d.m6332a(this.f5465c);
        C1251d.m6333a(this.f5468f > 0);
    }

    static int m8292a(Player player) {
        return C1304w.m6613a(player.mo1227a(), player.mo1228b(), Boolean.valueOf(player.mo1229c()), player.mo1230d(), player.mo1232f(), Long.valueOf(player.mo1234h()), player.mo1238l(), player.mo1239m());
    }

    static boolean m8293a(Player player, Object obj) {
        if (!(obj instanceof Player)) {
            return false;
        }
        if (player == obj) {
            return true;
        }
        Player player2 = (Player) obj;
        return C1304w.m6615a(player2.mo1227a(), player.mo1227a()) && C1304w.m6615a(player2.mo1228b(), player.mo1228b()) && C1304w.m6615a(Boolean.valueOf(player2.mo1229c()), Boolean.valueOf(player.mo1229c())) && C1304w.m6615a(player2.mo1230d(), player.mo1230d()) && C1304w.m6615a(player2.mo1232f(), player.mo1232f()) && C1304w.m6615a(Long.valueOf(player2.mo1234h()), Long.valueOf(player.mo1234h())) && C1304w.m6615a(player2.mo1238l(), player.mo1238l()) && C1304w.m6615a(player2.mo1239m(), player.mo1239m());
    }

    static String m8295b(Player player) {
        return C1304w.m6614a((Object) player).m6612a("PlayerId", player.mo1227a()).m6612a("DisplayName", player.mo1228b()).m6612a("HasDebugAccess", Boolean.valueOf(player.mo1229c())).m6612a("IconImageUri", player.mo1230d()).m6612a("IconImageUrl", player.mo1231e()).m6612a("HiResImageUri", player.mo1232f()).m6612a("HiResImageUrl", player.mo1233g()).m6612a("RetrievedTimestamp", Long.valueOf(player.mo1234h())).m6612a("Title", player.mo1238l()).m6612a("LevelInfo", player.mo1239m()).toString();
    }

    public String mo1227a() {
        return this.f5464b;
    }

    public String mo1228b() {
        return this.f5465c;
    }

    public boolean mo1229c() {
        return this.f5477o;
    }

    public Uri mo1230d() {
        return this.f5466d;
    }

    public int describeContents() {
        return 0;
    }

    public String mo1231e() {
        return this.f5471i;
    }

    public boolean equals(Object obj) {
        return m8293a(this, obj);
    }

    public Uri mo1232f() {
        return this.f5467e;
    }

    public String mo1233g() {
        return this.f5472j;
    }

    public long mo1234h() {
        return this.f5468f;
    }

    public int hashCode() {
        return m8292a((Player) this);
    }

    public long mo1235i() {
        return this.f5470h;
    }

    public int mo1236j() {
        return this.f5469g;
    }

    public boolean mo1237k() {
        return this.f5476n;
    }

    public String mo1238l() {
        return this.f5473k;
    }

    public PlayerLevelInfo mo1239m() {
        return this.f5475m;
    }

    public MostRecentGameInfo mo1240n() {
        return this.f5474l;
    }

    public int m8312o() {
        return this.f5463a;
    }

    public String toString() {
        return m8295b((Player) this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        String str = null;
        if (f_()) {
            parcel.writeString(this.f5464b);
            parcel.writeString(this.f5465c);
            parcel.writeString(this.f5466d == null ? null : this.f5466d.toString());
            if (this.f5467e != null) {
                str = this.f5467e.toString();
            }
            parcel.writeString(str);
            parcel.writeLong(this.f5468f);
            return;
        }
        C1762f.m8288a(this, parcel, i);
    }
}
