package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C1304w;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;

public final class GameEntity extends GamesDowngradeableSafeParcel implements Game {
    public static final Creator<GameEntity> CREATOR = new C1761a();
    private final int f5437a;
    private final String f5438b;
    private final String f5439c;
    private final String f5440d;
    private final String f5441e;
    private final String f5442f;
    private final String f5443g;
    private final Uri f5444h;
    private final Uri f5445i;
    private final Uri f5446j;
    private final boolean f5447k;
    private final boolean f5448l;
    private final String f5449m;
    private final int f5450n;
    private final int f5451o;
    private final int f5452p;
    private final boolean f5453q;
    private final boolean f5454r;
    private final String f5455s;
    private final String f5456t;
    private final String f5457u;
    private final boolean f5458v;
    private final boolean f5459w;
    private final boolean f5460x;
    private final String f5461y;
    private final boolean f5462z;

    static final class C1761a extends C1760a {
        C1761a() {
        }

        public GameEntity mo1196a(Parcel parcel) {
            if (GamesDowngradeableSafeParcel.m8215b(DowngradeableSafeParcel.e_()) || DowngradeableSafeParcel.m6304a(GameEntity.class.getCanonicalName())) {
                return super.mo1196a(parcel);
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            Uri parse = readString7 == null ? null : Uri.parse(readString7);
            readString7 = parcel.readString();
            Uri parse2 = readString7 == null ? null : Uri.parse(readString7);
            readString7 = parcel.readString();
            return new GameEntity(7, readString, readString2, readString3, readString4, readString5, readString6, parse, parse2, readString7 == null ? null : Uri.parse(readString7), parcel.readInt() > 0, parcel.readInt() > 0, parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), false, false, null, null, null, false, false, false, null, false);
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return mo1196a(parcel);
        }
    }

    GameEntity(int i, String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Uri uri2, Uri uri3, boolean z, boolean z2, String str7, int i2, int i3, int i4, boolean z3, boolean z4, String str8, String str9, String str10, boolean z5, boolean z6, boolean z7, String str11, boolean z8) {
        this.f5437a = i;
        this.f5438b = str;
        this.f5439c = str2;
        this.f5440d = str3;
        this.f5441e = str4;
        this.f5442f = str5;
        this.f5443g = str6;
        this.f5444h = uri;
        this.f5455s = str8;
        this.f5445i = uri2;
        this.f5456t = str9;
        this.f5446j = uri3;
        this.f5457u = str10;
        this.f5447k = z;
        this.f5448l = z2;
        this.f5449m = str7;
        this.f5450n = i2;
        this.f5451o = i3;
        this.f5452p = i4;
        this.f5453q = z3;
        this.f5454r = z4;
        this.f5458v = z5;
        this.f5459w = z6;
        this.f5460x = z7;
        this.f5461y = str11;
        this.f5462z = z8;
    }

    public GameEntity(Game game) {
        this.f5437a = 7;
        this.f5438b = game.mo1198a();
        this.f5440d = game.mo1200c();
        this.f5441e = game.mo1201d();
        this.f5442f = game.mo1202e();
        this.f5443g = game.mo1203f();
        this.f5439c = game.mo1199b();
        this.f5444h = game.mo1204g();
        this.f5455s = game.mo1205h();
        this.f5445i = game.mo1206i();
        this.f5456t = game.mo1207j();
        this.f5446j = game.mo1208k();
        this.f5457u = game.mo1209l();
        this.f5447k = game.mo1210m();
        this.f5448l = game.mo1213p();
        this.f5449m = game.mo1214q();
        this.f5450n = game.mo1215r();
        this.f5451o = game.mo1216s();
        this.f5452p = game.mo1217t();
        this.f5453q = game.mo1218u();
        this.f5454r = game.mo1219v();
        this.f5458v = game.mo1211n();
        this.f5459w = game.mo1212o();
        this.f5460x = game.mo1220w();
        this.f5461y = game.mo1221x();
        this.f5462z = game.mo1222y();
    }

    static int m8217a(Game game) {
        return C1304w.m6613a(game.mo1198a(), game.mo1199b(), game.mo1200c(), game.mo1201d(), game.mo1202e(), game.mo1203f(), game.mo1204g(), game.mo1206i(), game.mo1208k(), Boolean.valueOf(game.mo1210m()), Boolean.valueOf(game.mo1213p()), game.mo1214q(), Integer.valueOf(game.mo1215r()), Integer.valueOf(game.mo1216s()), Integer.valueOf(game.mo1217t()), Boolean.valueOf(game.mo1218u()), Boolean.valueOf(game.mo1219v()), Boolean.valueOf(game.mo1211n()), Boolean.valueOf(game.mo1212o()), Boolean.valueOf(game.mo1220w()), game.mo1221x(), Boolean.valueOf(game.mo1222y()));
    }

    static boolean m8218a(Game game, Object obj) {
        if (!(obj instanceof Game)) {
            return false;
        }
        if (game == obj) {
            return true;
        }
        Game game2 = (Game) obj;
        if (C1304w.m6615a(game2.mo1198a(), game.mo1198a()) && C1304w.m6615a(game2.mo1199b(), game.mo1199b()) && C1304w.m6615a(game2.mo1200c(), game.mo1200c()) && C1304w.m6615a(game2.mo1201d(), game.mo1201d()) && C1304w.m6615a(game2.mo1202e(), game.mo1202e()) && C1304w.m6615a(game2.mo1203f(), game.mo1203f()) && C1304w.m6615a(game2.mo1204g(), game.mo1204g()) && C1304w.m6615a(game2.mo1206i(), game.mo1206i()) && C1304w.m6615a(game2.mo1208k(), game.mo1208k()) && C1304w.m6615a(Boolean.valueOf(game2.mo1210m()), Boolean.valueOf(game.mo1210m())) && C1304w.m6615a(Boolean.valueOf(game2.mo1213p()), Boolean.valueOf(game.mo1213p())) && C1304w.m6615a(game2.mo1214q(), game.mo1214q()) && C1304w.m6615a(Integer.valueOf(game2.mo1215r()), Integer.valueOf(game.mo1215r())) && C1304w.m6615a(Integer.valueOf(game2.mo1216s()), Integer.valueOf(game.mo1216s())) && C1304w.m6615a(Integer.valueOf(game2.mo1217t()), Integer.valueOf(game.mo1217t())) && C1304w.m6615a(Boolean.valueOf(game2.mo1218u()), Boolean.valueOf(game.mo1218u()))) {
            Boolean valueOf = Boolean.valueOf(game2.mo1219v());
            boolean z = game.mo1219v() && C1304w.m6615a(Boolean.valueOf(game2.mo1211n()), Boolean.valueOf(game.mo1211n())) && C1304w.m6615a(Boolean.valueOf(game2.mo1212o()), Boolean.valueOf(game.mo1212o()));
            if (C1304w.m6615a(valueOf, Boolean.valueOf(z)) && C1304w.m6615a(Boolean.valueOf(game2.mo1220w()), Boolean.valueOf(game.mo1220w())) && C1304w.m6615a(game2.mo1221x(), game.mo1221x()) && C1304w.m6615a(Boolean.valueOf(game2.mo1222y()), Boolean.valueOf(game.mo1222y()))) {
                return true;
            }
        }
        return false;
    }

    static String m8220b(Game game) {
        return C1304w.m6614a((Object) game).m6612a("ApplicationId", game.mo1198a()).m6612a("DisplayName", game.mo1199b()).m6612a("PrimaryCategory", game.mo1200c()).m6612a("SecondaryCategory", game.mo1201d()).m6612a("Description", game.mo1202e()).m6612a("DeveloperName", game.mo1203f()).m6612a("IconImageUri", game.mo1204g()).m6612a("IconImageUrl", game.mo1205h()).m6612a("HiResImageUri", game.mo1206i()).m6612a("HiResImageUrl", game.mo1207j()).m6612a("FeaturedImageUri", game.mo1208k()).m6612a("FeaturedImageUrl", game.mo1209l()).m6612a("PlayEnabledGame", Boolean.valueOf(game.mo1210m())).m6612a("InstanceInstalled", Boolean.valueOf(game.mo1213p())).m6612a("InstancePackageName", game.mo1214q()).m6612a("AchievementTotalCount", Integer.valueOf(game.mo1216s())).m6612a("LeaderboardCount", Integer.valueOf(game.mo1217t())).m6612a("RealTimeMultiplayerEnabled", Boolean.valueOf(game.mo1218u())).m6612a("TurnBasedMultiplayerEnabled", Boolean.valueOf(game.mo1219v())).m6612a("AreSnapshotsEnabled", Boolean.valueOf(game.mo1220w())).m6612a("ThemeColor", game.mo1221x()).m6612a("HasGamepadSupport", Boolean.valueOf(game.mo1222y())).toString();
    }

    public String mo1198a() {
        return this.f5438b;
    }

    public String mo1199b() {
        return this.f5439c;
    }

    public String mo1200c() {
        return this.f5440d;
    }

    public String mo1201d() {
        return this.f5441e;
    }

    public int describeContents() {
        return 0;
    }

    public String mo1202e() {
        return this.f5442f;
    }

    public boolean equals(Object obj) {
        return m8218a(this, obj);
    }

    public String mo1203f() {
        return this.f5443g;
    }

    public Uri mo1204g() {
        return this.f5444h;
    }

    public String mo1205h() {
        return this.f5455s;
    }

    public int hashCode() {
        return m8217a((Game) this);
    }

    public Uri mo1206i() {
        return this.f5445i;
    }

    public String mo1207j() {
        return this.f5456t;
    }

    public Uri mo1208k() {
        return this.f5446j;
    }

    public String mo1209l() {
        return this.f5457u;
    }

    public boolean mo1210m() {
        return this.f5447k;
    }

    public boolean mo1211n() {
        return this.f5458v;
    }

    public boolean mo1212o() {
        return this.f5459w;
    }

    public boolean mo1213p() {
        return this.f5448l;
    }

    public String mo1214q() {
        return this.f5449m;
    }

    public int mo1215r() {
        return this.f5450n;
    }

    public int mo1216s() {
        return this.f5451o;
    }

    public int mo1217t() {
        return this.f5452p;
    }

    public String toString() {
        return m8220b((Game) this);
    }

    public boolean mo1218u() {
        return this.f5453q;
    }

    public boolean mo1219v() {
        return this.f5454r;
    }

    public boolean mo1220w() {
        return this.f5460x;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = 1;
        String str = null;
        if (f_()) {
            parcel.writeString(this.f5438b);
            parcel.writeString(this.f5439c);
            parcel.writeString(this.f5440d);
            parcel.writeString(this.f5441e);
            parcel.writeString(this.f5442f);
            parcel.writeString(this.f5443g);
            parcel.writeString(this.f5444h == null ? null : this.f5444h.toString());
            parcel.writeString(this.f5445i == null ? null : this.f5445i.toString());
            if (this.f5446j != null) {
                str = this.f5446j.toString();
            }
            parcel.writeString(str);
            parcel.writeInt(this.f5447k ? 1 : 0);
            if (!this.f5448l) {
                i2 = 0;
            }
            parcel.writeInt(i2);
            parcel.writeString(this.f5449m);
            parcel.writeInt(this.f5450n);
            parcel.writeInt(this.f5451o);
            parcel.writeInt(this.f5452p);
            return;
        }
        C1760a.m8211a(this, parcel, i);
    }

    public String mo1221x() {
        return this.f5461y;
    }

    public boolean mo1222y() {
        return this.f5462z;
    }

    public int m8247z() {
        return this.f5437a;
    }
}
