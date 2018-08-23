package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C1305x;

public final class RealTimeMessage implements Parcelable {
    public static final Creator<RealTimeMessage> CREATOR = new C18741();
    private final String f5682a;
    private final byte[] f5683b;
    private final int f5684c;

    static class C18741 implements Creator<RealTimeMessage> {
        C18741() {
        }

        public RealTimeMessage m9280a(Parcel parcel) {
            return new RealTimeMessage(parcel);
        }

        public RealTimeMessage[] m9281a(int i) {
            return new RealTimeMessage[i];
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m9280a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m9281a(i);
        }
    }

    private RealTimeMessage(Parcel parcel) {
        this(parcel.readString(), parcel.createByteArray(), parcel.readInt());
    }

    public RealTimeMessage(String str, byte[] bArr, int i) {
        this.f5682a = (String) C1305x.m6617a((Object) str);
        this.f5683b = (byte[]) ((byte[]) C1305x.m6617a((Object) bArr)).clone();
        this.f5684c = i;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5682a);
        parcel.writeByteArray(this.f5683b);
        parcel.writeInt(this.f5684c);
    }
}
