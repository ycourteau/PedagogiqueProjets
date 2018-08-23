package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class BinderWrapper implements Parcelable {
    public static final Creator<BinderWrapper> CREATOR = new C12451();
    private IBinder f4293a;

    static class C12451 implements Creator<BinderWrapper> {
        C12451() {
        }

        public BinderWrapper m6301a(Parcel parcel) {
            return new BinderWrapper(parcel);
        }

        public BinderWrapper[] m6302a(int i) {
            return new BinderWrapper[i];
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m6301a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m6302a(i);
        }
    }

    public BinderWrapper() {
        this.f4293a = null;
    }

    public BinderWrapper(IBinder iBinder) {
        this.f4293a = null;
        this.f4293a = iBinder;
    }

    private BinderWrapper(Parcel parcel) {
        this.f4293a = null;
        this.f4293a = parcel.readStrongBinder();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f4293a);
    }
}
