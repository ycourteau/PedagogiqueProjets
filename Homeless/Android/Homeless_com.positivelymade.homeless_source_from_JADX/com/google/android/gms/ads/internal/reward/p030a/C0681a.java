package com.google.android.gms.ads.internal.reward.p030a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p028c.di;
import com.google.android.gms.p028c.di.C0899a;
import com.google.android.gms.p029b.C0799a;
import com.google.android.gms.p029b.C0799a.C0801a;

public interface C0681a extends IInterface {

    public static abstract class C0683a extends Binder implements C0681a {

        private static class C0682a implements C0681a {
            private IBinder f1969a;

            C0682a(IBinder iBinder) {
                this.f1969a = iBinder;
            }

            public IBinder mo525a(C0799a c0799a, di diVar, int i) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
                    obtain.writeStrongBinder(c0799a != null ? c0799a.asBinder() : null);
                    if (diVar != null) {
                        iBinder = diVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    this.f1969a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    iBinder = obtain2.readStrongBinder();
                    return iBinder;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f1969a;
            }
        }

        public static C0681a m3051a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0681a)) ? new C0682a(iBinder) : (C0681a) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
                    IBinder a = mo525a(C0801a.m3753a(parcel.readStrongBinder()), C0899a.m4225a(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    IBinder mo525a(C0799a c0799a, di diVar, int i);
}
