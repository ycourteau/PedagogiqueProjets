package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.C1239e;
import com.google.android.gms.common.data.DataHolder;

public final class MostRecentGameInfoRef extends C1239e implements MostRecentGameInfo {
    private final C1867b f5627c;

    public MostRecentGameInfoRef(DataHolder dataHolder, int i, C1867b c1867b) {
        super(dataHolder, i);
        this.f5627c = c1867b;
    }

    public String mo1556a() {
        return m6264e(this.f5627c.f5647t);
    }

    public String mo1557b() {
        return m6264e(this.f5627c.f5648u);
    }

    public long mo1558c() {
        return m6261b(this.f5627c.f5649v);
    }

    public Uri mo1559d() {
        return m6266g(this.f5627c.f5650w);
    }

    public int describeContents() {
        return 0;
    }

    public Uri mo1560e() {
        return m6266g(this.f5627c.f5651x);
    }

    public boolean equals(Object obj) {
        return MostRecentGameInfoEntity.m9175a(this, obj);
    }

    public Uri mo1561f() {
        return m6266g(this.f5627c.f5652y);
    }

    public MostRecentGameInfo m9190g() {
        return new MostRecentGameInfoEntity(this);
    }

    public int hashCode() {
        return MostRecentGameInfoEntity.m9174a(this);
    }

    public String toString() {
        return MostRecentGameInfoEntity.m9176b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((MostRecentGameInfoEntity) m9190g()).writeToParcel(parcel, i);
    }
}
