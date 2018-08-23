package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.app.C0017d.C0014a;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

final class BackStackState implements Parcelable {
    public static final Creator<BackStackState> CREATOR = new C00041();
    final int[] f8a;
    final int f9b;
    final int f10c;
    final String f11d;
    final int f12e;
    final int f13f;
    final CharSequence f14g;
    final int f15h;
    final CharSequence f16i;
    final ArrayList<String> f17j;
    final ArrayList<String> f18k;

    static class C00041 implements Creator<BackStackState> {
        C00041() {
        }

        public BackStackState m19a(Parcel parcel) {
            return new BackStackState(parcel);
        }

        public BackStackState[] m20a(int i) {
            return new BackStackState[i];
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m19a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m20a(i);
        }
    }

    public BackStackState(Parcel parcel) {
        this.f8a = parcel.createIntArray();
        this.f9b = parcel.readInt();
        this.f10c = parcel.readInt();
        this.f11d = parcel.readString();
        this.f12e = parcel.readInt();
        this.f13f = parcel.readInt();
        this.f14g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f15h = parcel.readInt();
        this.f16i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f17j = parcel.createStringArrayList();
        this.f18k = parcel.createStringArrayList();
    }

    public BackStackState(C0034j c0034j, C0017d c0017d) {
        int i = 0;
        for (C0014a c0014a = c0017d.f64c; c0014a != null; c0014a = c0014a.f48a) {
            if (c0014a.f56i != null) {
                i += c0014a.f56i.size();
            }
        }
        this.f8a = new int[(i + (c0017d.f66e * 7))];
        if (c0017d.f73l) {
            i = 0;
            for (C0014a c0014a2 = c0017d.f64c; c0014a2 != null; c0014a2 = c0014a2.f48a) {
                int i2 = i + 1;
                this.f8a[i] = c0014a2.f50c;
                int i3 = i2 + 1;
                this.f8a[i2] = c0014a2.f51d != null ? c0014a2.f51d.f117p : -1;
                int i4 = i3 + 1;
                this.f8a[i3] = c0014a2.f52e;
                i2 = i4 + 1;
                this.f8a[i4] = c0014a2.f53f;
                i4 = i2 + 1;
                this.f8a[i2] = c0014a2.f54g;
                i2 = i4 + 1;
                this.f8a[i4] = c0014a2.f55h;
                if (c0014a2.f56i != null) {
                    int size = c0014a2.f56i.size();
                    i4 = i2 + 1;
                    this.f8a[i2] = size;
                    i2 = 0;
                    while (i2 < size) {
                        i3 = i4 + 1;
                        this.f8a[i4] = ((C0018f) c0014a2.f56i.get(i2)).f117p;
                        i2++;
                        i4 = i3;
                    }
                    i = i4;
                } else {
                    i = i2 + 1;
                    this.f8a[i2] = 0;
                }
            }
            this.f9b = c0017d.f71j;
            this.f10c = c0017d.f72k;
            this.f11d = c0017d.f75n;
            this.f12e = c0017d.f77p;
            this.f13f = c0017d.f78q;
            this.f14g = c0017d.f79r;
            this.f15h = c0017d.f80s;
            this.f16i = c0017d.f81t;
            this.f17j = c0017d.f82u;
            this.f18k = c0017d.f83v;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public C0017d m21a(C0034j c0034j) {
        C0017d c0017d = new C0017d(c0034j);
        int i = 0;
        int i2 = 0;
        while (i2 < this.f8a.length) {
            C0014a c0014a = new C0014a();
            int i3 = i2 + 1;
            c0014a.f50c = this.f8a[i2];
            if (C0034j.f168a) {
                Log.v("FragmentManager", "Instantiate " + c0017d + " op #" + i + " base fragment #" + this.f8a[i3]);
            }
            int i4 = i3 + 1;
            i2 = this.f8a[i3];
            if (i2 >= 0) {
                c0014a.f51d = (C0018f) c0034j.f174f.get(i2);
            } else {
                c0014a.f51d = null;
            }
            i3 = i4 + 1;
            c0014a.f52e = this.f8a[i4];
            i4 = i3 + 1;
            c0014a.f53f = this.f8a[i3];
            i3 = i4 + 1;
            c0014a.f54g = this.f8a[i4];
            int i5 = i3 + 1;
            c0014a.f55h = this.f8a[i3];
            i4 = i5 + 1;
            int i6 = this.f8a[i5];
            if (i6 > 0) {
                c0014a.f56i = new ArrayList(i6);
                i3 = 0;
                while (i3 < i6) {
                    if (C0034j.f168a) {
                        Log.v("FragmentManager", "Instantiate " + c0017d + " set remove fragment #" + this.f8a[i4]);
                    }
                    i5 = i4 + 1;
                    c0014a.f56i.add((C0018f) c0034j.f174f.get(this.f8a[i4]));
                    i3++;
                    i4 = i5;
                }
            }
            c0017d.m73a(c0014a);
            i++;
            i2 = i4;
        }
        c0017d.f71j = this.f9b;
        c0017d.f72k = this.f10c;
        c0017d.f75n = this.f11d;
        c0017d.f77p = this.f12e;
        c0017d.f73l = true;
        c0017d.f78q = this.f13f;
        c0017d.f79r = this.f14g;
        c0017d.f80s = this.f15h;
        c0017d.f81t = this.f16i;
        c0017d.f82u = this.f17j;
        c0017d.f83v = this.f18k;
        c0017d.m72a(1);
        return c0017d;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f8a);
        parcel.writeInt(this.f9b);
        parcel.writeInt(this.f10c);
        parcel.writeString(this.f11d);
        parcel.writeInt(this.f12e);
        parcel.writeInt(this.f13f);
        TextUtils.writeToParcel(this.f14g, parcel, 0);
        parcel.writeInt(this.f15h);
        TextUtils.writeToParcel(this.f16i, parcel, 0);
        parcel.writeStringList(this.f17j);
        parcel.writeStringList(this.f18k);
    }
}
