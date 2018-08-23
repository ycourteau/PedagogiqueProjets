package com.google.android.gms.p028c;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p029b.C0799a;
import com.google.android.gms.p029b.C0799a.C0801a;

public interface bo extends IInterface {

    public static abstract class C0836a extends Binder implements bo {

        private static class C0835a implements bo {
            private IBinder f2544a;

            C0835a(IBinder iBinder) {
                this.f2544a = iBinder;
            }

            public IBinder mo600a(C0799a c0799a, C0799a c0799a2, C0799a c0799a3, int i) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
                    obtain.writeStrongBinder(c0799a != null ? c0799a.asBinder() : null);
                    obtain.writeStrongBinder(c0799a2 != null ? c0799a2.asBinder() : null);
                    if (c0799a3 != null) {
                        iBinder = c0799a3.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    this.f2544a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    iBinder = obtain2.readStrongBinder();
                    return iBinder;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f2544a;
            }
        }

        public static bo m3952a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof bo)) ? new C0835a(iBinder) : (bo) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
                    IBinder a = mo600a(C0801a.m3753a(parcel.readStrongBinder()), C0801a.m3753a(parcel.readStrongBinder()), C0801a.m3753a(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    IBinder mo600a(C0799a c0799a, C0799a c0799a2, C0799a c0799a3, int i);
}
