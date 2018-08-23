package android.support.v4.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;

final class FragmentState implements Parcelable {
    public static final Creator<FragmentState> CREATOR = new C00061();
    final String f22a;
    final int f23b;
    final boolean f24c;
    final int f25d;
    final int f26e;
    final String f27f;
    final boolean f28g;
    final boolean f29h;
    final Bundle f30i;
    Bundle f31j;
    C0018f f32k;

    static class C00061 implements Creator<FragmentState> {
        C00061() {
        }

        public FragmentState m24a(Parcel parcel) {
            return new FragmentState(parcel);
        }

        public FragmentState[] m25a(int i) {
            return new FragmentState[i];
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m24a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m25a(i);
        }
    }

    public FragmentState(Parcel parcel) {
        boolean z = true;
        this.f22a = parcel.readString();
        this.f23b = parcel.readInt();
        this.f24c = parcel.readInt() != 0;
        this.f25d = parcel.readInt();
        this.f26e = parcel.readInt();
        this.f27f = parcel.readString();
        this.f28g = parcel.readInt() != 0;
        if (parcel.readInt() == 0) {
            z = false;
        }
        this.f29h = z;
        this.f30i = parcel.readBundle();
        this.f31j = parcel.readBundle();
    }

    public FragmentState(C0018f c0018f) {
        this.f22a = c0018f.getClass().getName();
        this.f23b = c0018f.f117p;
        this.f24c = c0018f.f126y;
        this.f25d = c0018f.f92G;
        this.f26e = c0018f.f93H;
        this.f27f = c0018f.f94I;
        this.f28g = c0018f.f97L;
        this.f29h = c0018f.f96K;
        this.f30i = c0018f.f119r;
    }

    public C0018f m26a(C0026g c0026g, C0018f c0018f) {
        if (this.f32k != null) {
            return this.f32k;
        }
        if (this.f30i != null) {
            this.f30i.setClassLoader(c0026g.getClassLoader());
        }
        this.f32k = C0018f.m82a((Context) c0026g, this.f22a, this.f30i);
        if (this.f31j != null) {
            this.f31j.setClassLoader(c0026g.getClassLoader());
            this.f32k.f115n = this.f31j;
        }
        this.f32k.m99a(this.f23b, c0018f);
        this.f32k.f126y = this.f24c;
        this.f32k.f86A = true;
        this.f32k.f92G = this.f25d;
        this.f32k.f93H = this.f26e;
        this.f32k.f94I = this.f27f;
        this.f32k.f97L = this.f28g;
        this.f32k.f96K = this.f29h;
        this.f32k.f88C = c0026g.f146b;
        if (C0034j.f168a) {
            Log.v("FragmentManager", "Instantiated fragment " + this.f32k);
        }
        return this.f32k;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = 1;
        parcel.writeString(this.f22a);
        parcel.writeInt(this.f23b);
        parcel.writeInt(this.f24c ? 1 : 0);
        parcel.writeInt(this.f25d);
        parcel.writeInt(this.f26e);
        parcel.writeString(this.f27f);
        parcel.writeInt(this.f28g ? 1 : 0);
        if (!this.f29h) {
            i2 = 0;
        }
        parcel.writeInt(i2);
        parcel.writeBundle(this.f30i);
        parcel.writeBundle(this.f31j);
    }
}
