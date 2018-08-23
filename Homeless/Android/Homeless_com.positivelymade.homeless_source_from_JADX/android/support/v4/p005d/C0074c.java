package android.support.v4.p005d;

import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public class C0074c {

    static class C0073a<T> implements Creator<T> {
        final C0075d<T> f252a;

        public C0073a(C0075d<T> c0075d) {
            this.f252a = c0075d;
        }

        public T createFromParcel(Parcel parcel) {
            return this.f252a.mo64a(parcel, null);
        }

        public T[] newArray(int i) {
            return this.f252a.mo65a(i);
        }
    }

    public static <T> Creator<T> m414a(C0075d<T> c0075d) {
        return VERSION.SDK_INT >= 13 ? C0077f.m417a(c0075d) : new C0073a(c0075d);
    }
}
