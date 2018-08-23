package com.google.android.gms.games.achievement;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C1251d;
import com.google.android.gms.common.internal.C1304w;
import com.google.android.gms.common.internal.C1304w.C1303a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;

public final class AchievementEntity implements SafeParcelable, Achievement {
    public static final Creator<AchievementEntity> CREATOR = new C1765a();
    private final int f5490a;
    private final String f5491b;
    private final int f5492c;
    private final String f5493d;
    private final String f5494e;
    private final Uri f5495f;
    private final String f5496g;
    private final Uri f5497h;
    private final String f5498i;
    private final int f5499j;
    private final String f5500k;
    private final PlayerEntity f5501l;
    private final int f5502m;
    private final int f5503n;
    private final String f5504o;
    private final long f5505p;
    private final long f5506q;

    AchievementEntity(int i, String str, int i2, String str2, String str3, Uri uri, String str4, Uri uri2, String str5, int i3, String str6, PlayerEntity playerEntity, int i4, int i5, String str7, long j, long j2) {
        this.f5490a = i;
        this.f5491b = str;
        this.f5492c = i2;
        this.f5493d = str2;
        this.f5494e = str3;
        this.f5495f = uri;
        this.f5496g = str4;
        this.f5497h = uri2;
        this.f5498i = str5;
        this.f5499j = i3;
        this.f5500k = str6;
        this.f5501l = playerEntity;
        this.f5502m = i4;
        this.f5503n = i5;
        this.f5504o = str7;
        this.f5505p = j;
        this.f5506q = j2;
    }

    static int m8348a(Achievement achievement) {
        int h;
        int e;
        if (achievement.mo1242b() == 1) {
            h = achievement.mo1248h();
            e = achievement.mo1245e();
        } else {
            e = 0;
            h = 0;
        }
        return C1304w.m6613a(achievement.mo1241a(), achievement.mo1243c(), Integer.valueOf(achievement.mo1242b()), achievement.mo1244d(), Long.valueOf(achievement.mo1250j()), Integer.valueOf(achievement.mo1247g()), Long.valueOf(achievement.mo1249i()), achievement.mo1246f(), Integer.valueOf(h), Integer.valueOf(e));
    }

    static boolean m8349a(Achievement achievement, Object obj) {
        if (!(obj instanceof Achievement)) {
            return false;
        }
        if (achievement == obj) {
            return true;
        }
        boolean a;
        boolean a2;
        Achievement achievement2 = (Achievement) obj;
        if (achievement.mo1242b() == 1) {
            a = C1304w.m6615a(Integer.valueOf(achievement2.mo1248h()), Integer.valueOf(achievement.mo1248h()));
            a2 = C1304w.m6615a(Integer.valueOf(achievement2.mo1245e()), Integer.valueOf(achievement.mo1245e()));
        } else {
            a2 = true;
            a = true;
        }
        return C1304w.m6615a(achievement2.mo1241a(), achievement.mo1241a()) && C1304w.m6615a(achievement2.mo1243c(), achievement.mo1243c()) && C1304w.m6615a(Integer.valueOf(achievement2.mo1242b()), Integer.valueOf(achievement.mo1242b())) && C1304w.m6615a(achievement2.mo1244d(), achievement.mo1244d()) && C1304w.m6615a(Long.valueOf(achievement2.mo1250j()), Long.valueOf(achievement.mo1250j())) && C1304w.m6615a(Integer.valueOf(achievement2.mo1247g()), Integer.valueOf(achievement.mo1247g())) && C1304w.m6615a(Long.valueOf(achievement2.mo1249i()), Long.valueOf(achievement.mo1249i())) && C1304w.m6615a(achievement2.mo1246f(), achievement.mo1246f()) && a && a2;
    }

    static String m8350b(Achievement achievement) {
        C1303a a = C1304w.m6614a((Object) achievement).m6612a("Id", achievement.mo1241a()).m6612a("Type", Integer.valueOf(achievement.mo1242b())).m6612a("Name", achievement.mo1243c()).m6612a("Description", achievement.mo1244d()).m6612a("Player", achievement.mo1246f()).m6612a("State", Integer.valueOf(achievement.mo1247g()));
        if (achievement.mo1242b() == 1) {
            a.m6612a("CurrentSteps", Integer.valueOf(achievement.mo1248h()));
            a.m6612a("TotalSteps", Integer.valueOf(achievement.mo1245e()));
        }
        return a.toString();
    }

    public String mo1241a() {
        return this.f5491b;
    }

    public int mo1242b() {
        return this.f5492c;
    }

    public String mo1243c() {
        return this.f5493d;
    }

    public String mo1244d() {
        return this.f5494e;
    }

    public int describeContents() {
        return 0;
    }

    public int mo1245e() {
        boolean z = true;
        if (mo1242b() != 1) {
            z = false;
        }
        C1251d.m6333a(z);
        return m8366p();
    }

    public boolean equals(Object obj) {
        return m8349a(this, obj);
    }

    public Player mo1246f() {
        return this.f5501l;
    }

    public int mo1247g() {
        return this.f5502m;
    }

    public int mo1248h() {
        boolean z = true;
        if (mo1242b() != 1) {
            z = false;
        }
        C1251d.m6333a(z);
        return m8368r();
    }

    public int hashCode() {
        return m8348a(this);
    }

    public long mo1249i() {
        return this.f5505p;
    }

    public long mo1250j() {
        return this.f5506q;
    }

    public int m8361k() {
        return this.f5490a;
    }

    public Uri m8362l() {
        return this.f5495f;
    }

    public String m8363m() {
        return this.f5496g;
    }

    public Uri m8364n() {
        return this.f5497h;
    }

    public String m8365o() {
        return this.f5498i;
    }

    public int m8366p() {
        return this.f5499j;
    }

    public String m8367q() {
        return this.f5500k;
    }

    public int m8368r() {
        return this.f5503n;
    }

    public String m8369s() {
        return this.f5504o;
    }

    public String toString() {
        return m8350b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1765a.m8370a(this, parcel, i);
    }
}
