package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.C1304w;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class MostRecentGameInfoEntity implements SafeParcelable, MostRecentGameInfo {
    public static final C1866a CREATOR = new C1866a();
    private final int f5620a;
    private final String f5621b;
    private final String f5622c;
    private final long f5623d;
    private final Uri f5624e;
    private final Uri f5625f;
    private final Uri f5626g;

    MostRecentGameInfoEntity(int i, String str, String str2, long j, Uri uri, Uri uri2, Uri uri3) {
        this.f5620a = i;
        this.f5621b = str;
        this.f5622c = str2;
        this.f5623d = j;
        this.f5624e = uri;
        this.f5625f = uri2;
        this.f5626g = uri3;
    }

    public MostRecentGameInfoEntity(MostRecentGameInfo mostRecentGameInfo) {
        this.f5620a = 2;
        this.f5621b = mostRecentGameInfo.mo1556a();
        this.f5622c = mostRecentGameInfo.mo1557b();
        this.f5623d = mostRecentGameInfo.mo1558c();
        this.f5624e = mostRecentGameInfo.mo1559d();
        this.f5625f = mostRecentGameInfo.mo1560e();
        this.f5626g = mostRecentGameInfo.mo1561f();
    }

    static int m9174a(MostRecentGameInfo mostRecentGameInfo) {
        return C1304w.m6613a(mostRecentGameInfo.mo1556a(), mostRecentGameInfo.mo1557b(), Long.valueOf(mostRecentGameInfo.mo1558c()), mostRecentGameInfo.mo1559d(), mostRecentGameInfo.mo1560e(), mostRecentGameInfo.mo1561f());
    }

    static boolean m9175a(MostRecentGameInfo mostRecentGameInfo, Object obj) {
        if (!(obj instanceof MostRecentGameInfo)) {
            return false;
        }
        if (mostRecentGameInfo == obj) {
            return true;
        }
        MostRecentGameInfo mostRecentGameInfo2 = (MostRecentGameInfo) obj;
        return C1304w.m6615a(mostRecentGameInfo2.mo1556a(), mostRecentGameInfo.mo1556a()) && C1304w.m6615a(mostRecentGameInfo2.mo1557b(), mostRecentGameInfo.mo1557b()) && C1304w.m6615a(Long.valueOf(mostRecentGameInfo2.mo1558c()), Long.valueOf(mostRecentGameInfo.mo1558c())) && C1304w.m6615a(mostRecentGameInfo2.mo1559d(), mostRecentGameInfo.mo1559d()) && C1304w.m6615a(mostRecentGameInfo2.mo1560e(), mostRecentGameInfo.mo1560e()) && C1304w.m6615a(mostRecentGameInfo2.mo1561f(), mostRecentGameInfo.mo1561f());
    }

    static String m9176b(MostRecentGameInfo mostRecentGameInfo) {
        return C1304w.m6614a((Object) mostRecentGameInfo).m6612a("GameId", mostRecentGameInfo.mo1556a()).m6612a("GameName", mostRecentGameInfo.mo1557b()).m6612a("ActivityTimestampMillis", Long.valueOf(mostRecentGameInfo.mo1558c())).m6612a("GameIconUri", mostRecentGameInfo.mo1559d()).m6612a("GameHiResUri", mostRecentGameInfo.mo1560e()).m6612a("GameFeaturedUri", mostRecentGameInfo.mo1561f()).toString();
    }

    public String mo1556a() {
        return this.f5621b;
    }

    public String mo1557b() {
        return this.f5622c;
    }

    public long mo1558c() {
        return this.f5623d;
    }

    public Uri mo1559d() {
        return this.f5624e;
    }

    public int describeContents() {
        return 0;
    }

    public Uri mo1560e() {
        return this.f5625f;
    }

    public boolean equals(Object obj) {
        return m9175a(this, obj);
    }

    public Uri mo1561f() {
        return this.f5626g;
    }

    public int m9183g() {
        return this.f5620a;
    }

    public int hashCode() {
        return m9174a(this);
    }

    public String toString() {
        return m9176b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1866a.m9191a(this, parcel, i);
    }
}
