package com.google.android.gms.analytics.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class Command implements Parcelable {
    @Deprecated
    public static final Creator<Command> CREATOR = new C07201();
    private String f2047a;
    private String f2048b;
    private String f2049c;

    static class C07201 implements Creator<Command> {
        C07201() {
        }

        @Deprecated
        public Command m3253a(Parcel parcel) {
            return new Command(parcel);
        }

        @Deprecated
        public Command[] m3254a(int i) {
            return new Command[i];
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m3253a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m3254a(i);
        }
    }

    @Deprecated
    Command(Parcel parcel) {
        m3255a(parcel);
    }

    @Deprecated
    private void m3255a(Parcel parcel) {
        this.f2047a = parcel.readString();
        this.f2048b = parcel.readString();
        this.f2049c = parcel.readString();
    }

    public String m3256a() {
        return this.f2047a;
    }

    public String m3257b() {
        return this.f2049c;
    }

    @Deprecated
    public int describeContents() {
        return 0;
    }

    @Deprecated
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2047a);
        parcel.writeString(this.f2048b);
        parcel.writeString(this.f2049c);
    }
}
