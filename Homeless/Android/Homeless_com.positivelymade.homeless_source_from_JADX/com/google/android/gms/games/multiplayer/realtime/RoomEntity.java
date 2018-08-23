package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C1304w;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import java.util.ArrayList;

public final class RoomEntity extends GamesDowngradeableSafeParcel implements Room {
    public static final Creator<RoomEntity> CREATOR = new C1876a();
    private final int f5685a;
    private final String f5686b;
    private final String f5687c;
    private final long f5688d;
    private final int f5689e;
    private final String f5690f;
    private final int f5691g;
    private final Bundle f5692h;
    private final ArrayList<ParticipantEntity> f5693i;
    private final int f5694j;

    static final class C1876a extends C1875b {
        C1876a() {
        }

        public RoomEntity mo1587a(Parcel parcel) {
            if (GamesDowngradeableSafeParcel.m8215b(DowngradeableSafeParcel.e_()) || DowngradeableSafeParcel.m6304a(RoomEntity.class.getCanonicalName())) {
                return super.mo1587a(parcel);
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            long readLong = parcel.readLong();
            int readInt = parcel.readInt();
            String readString3 = parcel.readString();
            int readInt2 = parcel.readInt();
            Bundle readBundle = parcel.readBundle();
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            for (int i = 0; i < readInt3; i++) {
                arrayList.add(ParticipantEntity.CREATOR.createFromParcel(parcel));
            }
            return new RoomEntity(2, readString, readString2, readLong, readInt, readString3, readInt2, readBundle, arrayList, -1);
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return mo1587a(parcel);
        }
    }

    RoomEntity(int i, String str, String str2, long j, int i2, String str3, int i3, Bundle bundle, ArrayList<ParticipantEntity> arrayList, int i4) {
        this.f5685a = i;
        this.f5686b = str;
        this.f5687c = str2;
        this.f5688d = j;
        this.f5689e = i2;
        this.f5690f = str3;
        this.f5691g = i3;
        this.f5692h = bundle;
        this.f5693i = arrayList;
        this.f5694j = i4;
    }

    static int m9294a(Room room) {
        return C1304w.m6613a(room.mo1589a(), room.mo1590b(), Long.valueOf(room.mo1591c()), Integer.valueOf(room.mo1592d()), room.mo1593e(), Integer.valueOf(room.mo1594f()), room.mo1595g(), room.mo1555j(), Integer.valueOf(room.mo1596h()));
    }

    static boolean m9295a(Room room, Object obj) {
        if (!(obj instanceof Room)) {
            return false;
        }
        if (room == obj) {
            return true;
        }
        Room room2 = (Room) obj;
        return C1304w.m6615a(room2.mo1589a(), room.mo1589a()) && C1304w.m6615a(room2.mo1590b(), room.mo1590b()) && C1304w.m6615a(Long.valueOf(room2.mo1591c()), Long.valueOf(room.mo1591c())) && C1304w.m6615a(Integer.valueOf(room2.mo1592d()), Integer.valueOf(room.mo1592d())) && C1304w.m6615a(room2.mo1593e(), room.mo1593e()) && C1304w.m6615a(Integer.valueOf(room2.mo1594f()), Integer.valueOf(room.mo1594f())) && C1304w.m6615a(room2.mo1595g(), room.mo1595g()) && C1304w.m6615a(room2.mo1555j(), room.mo1555j()) && C1304w.m6615a(Integer.valueOf(room2.mo1596h()), Integer.valueOf(room.mo1596h()));
    }

    static String m9297b(Room room) {
        return C1304w.m6614a((Object) room).m6612a("RoomId", room.mo1589a()).m6612a("CreatorId", room.mo1590b()).m6612a("CreationTimestamp", Long.valueOf(room.mo1591c())).m6612a("RoomStatus", Integer.valueOf(room.mo1592d())).m6612a("Description", room.mo1593e()).m6612a("Variant", Integer.valueOf(room.mo1594f())).m6612a("AutoMatchCriteria", room.mo1595g()).m6612a("Participants", room.mo1555j()).m6612a("AutoMatchWaitEstimateSeconds", Integer.valueOf(room.mo1596h())).toString();
    }

    public String mo1589a() {
        return this.f5686b;
    }

    public String mo1590b() {
        return this.f5687c;
    }

    public long mo1591c() {
        return this.f5688d;
    }

    public int mo1592d() {
        return this.f5689e;
    }

    public int describeContents() {
        return 0;
    }

    public String mo1593e() {
        return this.f5690f;
    }

    public boolean equals(Object obj) {
        return m9295a(this, obj);
    }

    public int mo1594f() {
        return this.f5691g;
    }

    public Bundle mo1595g() {
        return this.f5692h;
    }

    public int mo1596h() {
        return this.f5694j;
    }

    public int hashCode() {
        return m9294a((Room) this);
    }

    public int m9308i() {
        return this.f5685a;
    }

    public ArrayList<Participant> mo1555j() {
        return new ArrayList(this.f5693i);
    }

    public String toString() {
        return m9297b((Room) this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (f_()) {
            parcel.writeString(this.f5686b);
            parcel.writeString(this.f5687c);
            parcel.writeLong(this.f5688d);
            parcel.writeInt(this.f5689e);
            parcel.writeString(this.f5690f);
            parcel.writeInt(this.f5691g);
            parcel.writeBundle(this.f5692h);
            int size = this.f5693i.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                ((ParticipantEntity) this.f5693i.get(i2)).writeToParcel(parcel, i);
            }
            return;
        }
        C1875b.m9290a(this, parcel, i);
    }
}
