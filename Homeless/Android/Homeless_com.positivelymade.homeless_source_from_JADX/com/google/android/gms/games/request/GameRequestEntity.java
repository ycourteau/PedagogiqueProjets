package com.google.android.gms.games.request;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C1304w;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class GameRequestEntity implements SafeParcelable, GameRequest {
    public static final Creator<GameRequestEntity> CREATOR = new C1877a();
    private final int f5695a;
    private final GameEntity f5696b;
    private final PlayerEntity f5697c;
    private final byte[] f5698d;
    private final String f5699e;
    private final ArrayList<PlayerEntity> f5700f;
    private final int f5701g;
    private final long f5702h;
    private final long f5703i;
    private final Bundle f5704j;
    private final int f5705k;

    GameRequestEntity(int i, GameEntity gameEntity, PlayerEntity playerEntity, byte[] bArr, String str, ArrayList<PlayerEntity> arrayList, int i2, long j, long j2, Bundle bundle, int i3) {
        this.f5695a = i;
        this.f5696b = gameEntity;
        this.f5697c = playerEntity;
        this.f5698d = bArr;
        this.f5699e = str;
        this.f5700f = arrayList;
        this.f5701g = i2;
        this.f5702h = j;
        this.f5703i = j2;
        this.f5704j = bundle;
        this.f5705k = i3;
    }

    static int m9310a(GameRequest gameRequest) {
        return C1304w.m6613a(gameRequest.mo1564d(), gameRequest.mo1570k(), gameRequest.mo1563c(), gameRequest.mo1565e(), m9313c(gameRequest), Integer.valueOf(gameRequest.mo1567h()), Long.valueOf(gameRequest.mo1568i()), Long.valueOf(gameRequest.mo1569j()));
    }

    static boolean m9311a(GameRequest gameRequest, Object obj) {
        if (!(obj instanceof GameRequest)) {
            return false;
        }
        if (gameRequest == obj) {
            return true;
        }
        GameRequest gameRequest2 = (GameRequest) obj;
        return C1304w.m6615a(gameRequest2.mo1564d(), gameRequest.mo1564d()) && C1304w.m6615a(gameRequest2.mo1570k(), gameRequest.mo1570k()) && C1304w.m6615a(gameRequest2.mo1563c(), gameRequest.mo1563c()) && C1304w.m6615a(gameRequest2.mo1565e(), gameRequest.mo1565e()) && Arrays.equals(m9313c(gameRequest2), m9313c(gameRequest)) && C1304w.m6615a(Integer.valueOf(gameRequest2.mo1567h()), Integer.valueOf(gameRequest.mo1567h())) && C1304w.m6615a(Long.valueOf(gameRequest2.mo1568i()), Long.valueOf(gameRequest.mo1568i())) && C1304w.m6615a(Long.valueOf(gameRequest2.mo1569j()), Long.valueOf(gameRequest.mo1569j()));
    }

    static String m9312b(GameRequest gameRequest) {
        return C1304w.m6614a((Object) gameRequest).m6612a("Game", gameRequest.mo1564d()).m6612a("Sender", gameRequest.mo1565e()).m6612a("Recipients", gameRequest.mo1570k()).m6612a("Data", gameRequest.mo1566g()).m6612a("RequestId", gameRequest.mo1563c()).m6612a("Type", Integer.valueOf(gameRequest.mo1567h())).m6612a("CreationTimestamp", Long.valueOf(gameRequest.mo1568i())).m6612a("ExpirationTimestamp", Long.valueOf(gameRequest.mo1569j())).toString();
    }

    private static int[] m9313c(GameRequest gameRequest) {
        List k = gameRequest.mo1570k();
        int size = k.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = gameRequest.mo1562a(((Player) k.get(i)).mo1227a());
        }
        return iArr;
    }

    public int m9314a() {
        return this.f5695a;
    }

    public int mo1562a(String str) {
        return this.f5704j.getInt(str, 0);
    }

    public int m9316b() {
        return this.f5705k;
    }

    public String mo1563c() {
        return this.f5699e;
    }

    public Game mo1564d() {
        return this.f5696b;
    }

    public int describeContents() {
        return 0;
    }

    public Player mo1565e() {
        return this.f5697c;
    }

    public boolean equals(Object obj) {
        return m9311a(this, obj);
    }

    public Bundle m9320f() {
        return this.f5704j;
    }

    public byte[] mo1566g() {
        return this.f5698d;
    }

    public int mo1567h() {
        return this.f5701g;
    }

    public int hashCode() {
        return m9310a((GameRequest) this);
    }

    public long mo1568i() {
        return this.f5702h;
    }

    public long mo1569j() {
        return this.f5703i;
    }

    public List<Player> mo1570k() {
        return new ArrayList(this.f5700f);
    }

    public String toString() {
        return m9312b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1877a.m9326a(this, parcel, i);
    }
}
