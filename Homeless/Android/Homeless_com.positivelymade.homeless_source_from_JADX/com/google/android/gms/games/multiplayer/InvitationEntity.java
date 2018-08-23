package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C1304w;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import java.util.ArrayList;

public final class InvitationEntity extends GamesDowngradeableSafeParcel implements Invitation {
    public static final Creator<InvitationEntity> CREATOR = new C1870a();
    private final int f5656a;
    private final GameEntity f5657b;
    private final String f5658c;
    private final long f5659d;
    private final int f5660e;
    private final ParticipantEntity f5661f;
    private final ArrayList<ParticipantEntity> f5662g;
    private final int f5663h;
    private final int f5664i;

    static final class C1870a extends C1869a {
        C1870a() {
        }

        public InvitationEntity mo1571a(Parcel parcel) {
            if (GamesDowngradeableSafeParcel.m8215b(DowngradeableSafeParcel.e_()) || DowngradeableSafeParcel.m6304a(InvitationEntity.class.getCanonicalName())) {
                return super.mo1571a(parcel);
            }
            GameEntity gameEntity = (GameEntity) GameEntity.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            long readLong = parcel.readLong();
            int readInt = parcel.readInt();
            ParticipantEntity participantEntity = (ParticipantEntity) ParticipantEntity.CREATOR.createFromParcel(parcel);
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            for (int i = 0; i < readInt2; i++) {
                arrayList.add(ParticipantEntity.CREATOR.createFromParcel(parcel));
            }
            return new InvitationEntity(2, gameEntity, readString, readLong, readInt, participantEntity, arrayList, -1, 0);
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return mo1571a(parcel);
        }
    }

    InvitationEntity(int i, GameEntity gameEntity, String str, long j, int i2, ParticipantEntity participantEntity, ArrayList<ParticipantEntity> arrayList, int i3, int i4) {
        this.f5656a = i;
        this.f5657b = gameEntity;
        this.f5658c = str;
        this.f5659d = j;
        this.f5660e = i2;
        this.f5661f = participantEntity;
        this.f5662g = arrayList;
        this.f5663h = i3;
        this.f5664i = i4;
    }

    static int m9223a(Invitation invitation) {
        return C1304w.m6613a(invitation.mo1548c(), invitation.mo1549d(), Long.valueOf(invitation.mo1551f()), Integer.valueOf(invitation.mo1552g()), invitation.mo1550e(), invitation.mo1555j(), Integer.valueOf(invitation.mo1553h()), Integer.valueOf(invitation.mo1554i()));
    }

    static boolean m9224a(Invitation invitation, Object obj) {
        if (!(obj instanceof Invitation)) {
            return false;
        }
        if (invitation == obj) {
            return true;
        }
        Invitation invitation2 = (Invitation) obj;
        return C1304w.m6615a(invitation2.mo1548c(), invitation.mo1548c()) && C1304w.m6615a(invitation2.mo1549d(), invitation.mo1549d()) && C1304w.m6615a(Long.valueOf(invitation2.mo1551f()), Long.valueOf(invitation.mo1551f())) && C1304w.m6615a(Integer.valueOf(invitation2.mo1552g()), Integer.valueOf(invitation.mo1552g())) && C1304w.m6615a(invitation2.mo1550e(), invitation.mo1550e()) && C1304w.m6615a(invitation2.mo1555j(), invitation.mo1555j()) && C1304w.m6615a(Integer.valueOf(invitation2.mo1553h()), Integer.valueOf(invitation.mo1553h())) && C1304w.m6615a(Integer.valueOf(invitation2.mo1554i()), Integer.valueOf(invitation.mo1554i()));
    }

    static String m9226b(Invitation invitation) {
        return C1304w.m6614a((Object) invitation).m6612a("Game", invitation.mo1548c()).m6612a("InvitationId", invitation.mo1549d()).m6612a("CreationTimestamp", Long.valueOf(invitation.mo1551f())).m6612a("InvitationType", Integer.valueOf(invitation.mo1552g())).m6612a("Inviter", invitation.mo1550e()).m6612a("Participants", invitation.mo1555j()).m6612a("Variant", Integer.valueOf(invitation.mo1553h())).m6612a("AvailableAutoMatchSlots", Integer.valueOf(invitation.mo1554i())).toString();
    }

    public Game mo1548c() {
        return this.f5657b;
    }

    public String mo1549d() {
        return this.f5658c;
    }

    public int describeContents() {
        return 0;
    }

    public Participant mo1550e() {
        return this.f5661f;
    }

    public boolean equals(Object obj) {
        return m9224a(this, obj);
    }

    public long mo1551f() {
        return this.f5659d;
    }

    public int mo1552g() {
        return this.f5660e;
    }

    public int mo1553h() {
        return this.f5663h;
    }

    public int hashCode() {
        return m9223a((Invitation) this);
    }

    public int mo1554i() {
        return this.f5664i;
    }

    public ArrayList<Participant> mo1555j() {
        return new ArrayList(this.f5662g);
    }

    public int m9237k() {
        return this.f5656a;
    }

    public String toString() {
        return m9226b((Invitation) this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (f_()) {
            this.f5657b.writeToParcel(parcel, i);
            parcel.writeString(this.f5658c);
            parcel.writeLong(this.f5659d);
            parcel.writeInt(this.f5660e);
            this.f5661f.writeToParcel(parcel, i);
            int size = this.f5662g.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                ((ParticipantEntity) this.f5662g.get(i2)).writeToParcel(parcel, i);
            }
            return;
        }
        C1869a.m9219a(this, parcel, i);
    }
}
