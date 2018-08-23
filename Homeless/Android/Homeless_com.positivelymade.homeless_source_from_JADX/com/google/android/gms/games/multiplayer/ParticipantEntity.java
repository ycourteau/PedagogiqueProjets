package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C1304w;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;

public final class ParticipantEntity extends GamesDowngradeableSafeParcel implements Participant {
    public static final Creator<ParticipantEntity> CREATOR = new C1872a();
    private final int f5665a;
    private final String f5666b;
    private final String f5667c;
    private final Uri f5668d;
    private final Uri f5669e;
    private final int f5670f;
    private final String f5671g;
    private final boolean f5672h;
    private final PlayerEntity f5673i;
    private final int f5674j;
    private final ParticipantResult f5675k;
    private final String f5676l;
    private final String f5677m;

    static final class C1872a extends C1871d {
        C1872a() {
        }

        public ParticipantEntity mo1573a(Parcel parcel) {
            Object obj = 1;
            if (GamesDowngradeableSafeParcel.m8215b(DowngradeableSafeParcel.e_()) || DowngradeableSafeParcel.m6304a(ParticipantEntity.class.getCanonicalName())) {
                return super.mo1573a(parcel);
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Uri parse = readString3 == null ? null : Uri.parse(readString3);
            String readString4 = parcel.readString();
            Uri parse2 = readString4 == null ? null : Uri.parse(readString4);
            int readInt = parcel.readInt();
            String readString5 = parcel.readString();
            boolean z = parcel.readInt() > 0;
            if (parcel.readInt() <= 0) {
                obj = null;
            }
            return new ParticipantEntity(3, readString, readString2, parse, parse2, readInt, readString5, z, obj != null ? (PlayerEntity) PlayerEntity.CREATOR.createFromParcel(parcel) : null, 7, null, null, null);
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return mo1573a(parcel);
        }
    }

    ParticipantEntity(int i, String str, String str2, Uri uri, Uri uri2, int i2, String str3, boolean z, PlayerEntity playerEntity, int i3, ParticipantResult participantResult, String str4, String str5) {
        this.f5665a = i;
        this.f5666b = str;
        this.f5667c = str2;
        this.f5668d = uri;
        this.f5669e = uri2;
        this.f5670f = i2;
        this.f5671g = str3;
        this.f5672h = z;
        this.f5673i = playerEntity;
        this.f5674j = i3;
        this.f5675k = participantResult;
        this.f5676l = str4;
        this.f5677m = str5;
    }

    static int m9254a(Participant participant) {
        return C1304w.m6613a(participant.mo1585k(), Integer.valueOf(participant.mo1575a()), participant.mo1576b(), Boolean.valueOf(participant.mo1578d()), participant.mo1579e(), participant.mo1580f(), participant.mo1582h(), Integer.valueOf(participant.mo1577c()), participant.mo1586l(), participant.mo1584j());
    }

    static boolean m9255a(Participant participant, Object obj) {
        if (!(obj instanceof Participant)) {
            return false;
        }
        if (participant == obj) {
            return true;
        }
        Participant participant2 = (Participant) obj;
        return C1304w.m6615a(participant2.mo1585k(), participant.mo1585k()) && C1304w.m6615a(Integer.valueOf(participant2.mo1575a()), Integer.valueOf(participant.mo1575a())) && C1304w.m6615a(participant2.mo1576b(), participant.mo1576b()) && C1304w.m6615a(Boolean.valueOf(participant2.mo1578d()), Boolean.valueOf(participant.mo1578d())) && C1304w.m6615a(participant2.mo1579e(), participant.mo1579e()) && C1304w.m6615a(participant2.mo1580f(), participant.mo1580f()) && C1304w.m6615a(participant2.mo1582h(), participant.mo1582h()) && C1304w.m6615a(Integer.valueOf(participant2.mo1577c()), Integer.valueOf(participant.mo1577c())) && C1304w.m6615a(participant2.mo1586l(), participant.mo1586l()) && C1304w.m6615a(participant2.mo1584j(), participant.mo1584j());
    }

    static String m9257b(Participant participant) {
        return C1304w.m6614a((Object) participant).m6612a("ParticipantId", participant.mo1584j()).m6612a("Player", participant.mo1585k()).m6612a("Status", Integer.valueOf(participant.mo1575a())).m6612a("ClientAddress", participant.mo1576b()).m6612a("ConnectedToRoom", Boolean.valueOf(participant.mo1578d())).m6612a("DisplayName", participant.mo1579e()).m6612a("IconImage", participant.mo1580f()).m6612a("IconImageUrl", participant.mo1581g()).m6612a("HiResImage", participant.mo1582h()).m6612a("HiResImageUrl", participant.mo1583i()).m6612a("Capabilities", Integer.valueOf(participant.mo1577c())).m6612a("Result", participant.mo1586l()).toString();
    }

    public int mo1575a() {
        return this.f5670f;
    }

    public String mo1576b() {
        return this.f5671g;
    }

    public int mo1577c() {
        return this.f5674j;
    }

    public boolean mo1578d() {
        return this.f5672h;
    }

    public int describeContents() {
        return 0;
    }

    public String mo1579e() {
        return this.f5673i == null ? this.f5667c : this.f5673i.mo1228b();
    }

    public boolean equals(Object obj) {
        return m9255a(this, obj);
    }

    public Uri mo1580f() {
        return this.f5673i == null ? this.f5668d : this.f5673i.mo1230d();
    }

    public String mo1581g() {
        return this.f5673i == null ? this.f5676l : this.f5673i.mo1231e();
    }

    public Uri mo1582h() {
        return this.f5673i == null ? this.f5669e : this.f5673i.mo1232f();
    }

    public int hashCode() {
        return m9254a((Participant) this);
    }

    public String mo1583i() {
        return this.f5673i == null ? this.f5677m : this.f5673i.mo1233g();
    }

    public String mo1584j() {
        return this.f5666b;
    }

    public Player mo1585k() {
        return this.f5673i;
    }

    public ParticipantResult mo1586l() {
        return this.f5675k;
    }

    public int m9272m() {
        return this.f5665a;
    }

    public String toString() {
        return m9257b((Participant) this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        String str = null;
        int i2 = 0;
        if (f_()) {
            parcel.writeString(this.f5666b);
            parcel.writeString(this.f5667c);
            parcel.writeString(this.f5668d == null ? null : this.f5668d.toString());
            if (this.f5669e != null) {
                str = this.f5669e.toString();
            }
            parcel.writeString(str);
            parcel.writeInt(this.f5670f);
            parcel.writeString(this.f5671g);
            parcel.writeInt(this.f5672h ? 1 : 0);
            if (this.f5673i != null) {
                i2 = 1;
            }
            parcel.writeInt(i2);
            if (this.f5673i != null) {
                this.f5673i.writeToParcel(parcel, i);
                return;
            }
            return;
        }
        C1871d.m9250a(this, parcel, i);
    }
}
