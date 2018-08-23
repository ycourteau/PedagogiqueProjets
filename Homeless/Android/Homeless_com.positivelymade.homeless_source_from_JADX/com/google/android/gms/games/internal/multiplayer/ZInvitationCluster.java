package com.google.android.gms.games.internal.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.internal.C1251d;
import com.google.android.gms.common.internal.C1304w;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.InvitationEntity;
import com.google.android.gms.games.multiplayer.Participant;
import java.util.ArrayList;

public final class ZInvitationCluster implements SafeParcelable, Invitation {
    public static final C1865a CREATOR = new C1865a();
    private final int f5618a;
    private final ArrayList<InvitationEntity> f5619b;

    ZInvitationCluster(int i, ArrayList<InvitationEntity> arrayList) {
        this.f5618a = i;
        this.f5619b = arrayList;
        m9154k();
    }

    private void m9154k() {
        C1251d.m6333a(!this.f5619b.isEmpty());
        Invitation invitation = (Invitation) this.f5619b.get(0);
        int size = this.f5619b.size();
        for (int i = 1; i < size; i++) {
            C1251d.m6334a(invitation.mo1550e().equals(((Invitation) this.f5619b.get(i)).mo1550e()), "All the invitations must be from the same inviter");
        }
    }

    public int m9155a() {
        return this.f5618a;
    }

    public ArrayList<Invitation> m9156b() {
        return new ArrayList(this.f5619b);
    }

    public Game mo1548c() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public String mo1549d() {
        return ((InvitationEntity) this.f5619b.get(0)).mo1549d();
    }

    public int describeContents() {
        return 0;
    }

    public Participant mo1550e() {
        return ((InvitationEntity) this.f5619b.get(0)).mo1550e();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ZInvitationCluster)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ZInvitationCluster zInvitationCluster = (ZInvitationCluster) obj;
        if (zInvitationCluster.f5619b.size() != this.f5619b.size()) {
            return false;
        }
        int size = this.f5619b.size();
        for (int i = 0; i < size; i++) {
            if (!((Invitation) this.f5619b.get(i)).equals((Invitation) zInvitationCluster.f5619b.get(i))) {
                return false;
            }
        }
        return true;
    }

    public long mo1551f() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public int mo1552g() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public int mo1553h() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public int hashCode() {
        return C1304w.m6613a(this.f5619b.toArray());
    }

    public int mo1554i() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public ArrayList<Participant> mo1555j() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1865a.m9165a(this, parcel, i);
    }
}
