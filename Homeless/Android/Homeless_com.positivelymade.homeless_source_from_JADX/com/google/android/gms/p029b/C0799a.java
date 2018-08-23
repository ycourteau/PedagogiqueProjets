package com.google.android.gms.p029b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface C0799a extends IInterface {

    public static abstract class C0801a extends Binder implements C0799a {

        private static class C0800a implements C0799a {
            private IBinder f2348a;

            C0800a(IBinder iBinder) {
                this.f2348a = iBinder;
            }

            public IBinder asBinder() {
                return this.f2348a;
            }
        }

        public C0801a() {
            attachInterface(this, "com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static C0799a m3753a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0799a)) ? new C0800a(iBinder) : (C0799a) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.dynamic.IObjectWrapper");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }
}
