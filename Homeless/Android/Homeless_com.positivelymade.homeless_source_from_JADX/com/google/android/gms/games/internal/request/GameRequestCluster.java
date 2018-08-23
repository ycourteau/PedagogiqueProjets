package com.google.android.gms.games.internal.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.C1251d;
import com.google.android.gms.common.internal.C1304w;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.GameRequestEntity;
import java.util.ArrayList;
import java.util.List;

public final class GameRequestCluster implements SafeParcelable, GameRequest {
    public static final C1868a CREATOR = new C1868a();
    private final int f5654a;
    private final ArrayList<GameRequestEntity> f5655b;

    GameRequestCluster(int i, ArrayList<GameRequestEntity> arrayList) {
        this.f5654a = i;
        this.f5655b = arrayList;
        m9203l();
    }

    private void m9203l() {
        C1251d.m6333a(!this.f5655b.isEmpty());
        GameRequest gameRequest = (GameRequest) this.f5655b.get(0);
        int size = this.f5655b.size();
        for (int i = 1; i < size; i++) {
            GameRequest gameRequest2 = (GameRequest) this.f5655b.get(i);
            C1251d.m6334a(gameRequest.mo1567h() == gameRequest2.mo1567h(), "All the requests must be of the same type");
            C1251d.m6334a(gameRequest.mo1565e().equals(gameRequest2.mo1565e()), "All the requests must be from the same sender");
        }
    }

    public int m9204a() {
        return this.f5654a;
    }

    public int mo1562a(String str) {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public ArrayList<GameRequest> m9206b() {
        return new ArrayList(this.f5655b);
    }

    public String mo1563c() {
        return ((GameRequestEntity) this.f5655b.get(0)).mo1563c();
    }

    public Game mo1564d() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public int describeContents() {
        return 0;
    }

    public Player mo1565e() {
        return ((GameRequestEntity) this.f5655b.get(0)).mo1565e();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GameRequestCluster)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        GameRequestCluster gameRequestCluster = (GameRequestCluster) obj;
        if (gameRequestCluster.f5655b.size() != this.f5655b.size()) {
            return false;
        }
        int size = this.f5655b.size();
        for (int i = 0; i < size; i++) {
            if (!((GameRequest) this.f5655b.get(i)).equals((GameRequest) gameRequestCluster.f5655b.get(i))) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Player> m9210f() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public byte[] mo1566g() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public int mo1567h() {
        return ((GameRequestEntity) this.f5655b.get(0)).mo1567h();
    }

    public int hashCode() {
        return C1304w.m6613a(this.f5655b.toArray());
    }

    public long mo1568i() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public long mo1569j() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public /* synthetic */ List mo1570k() {
        return m9210f();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1868a.m9216a(this, parcel, i);
    }
}
