package android.support.v4.p005d;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

class C0076e<T> implements ClassLoaderCreator<T> {
    private final C0075d<T> f253a;

    public C0076e(C0075d<T> c0075d) {
        this.f253a = c0075d;
    }

    public T createFromParcel(Parcel parcel) {
        return this.f253a.mo64a(parcel, null);
    }

    public T createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return this.f253a.mo64a(parcel, classLoader);
    }

    public T[] newArray(int i) {
        return this.f253a.mo65a(i);
    }
}
