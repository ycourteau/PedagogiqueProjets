package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p029b.C0799a;
import com.google.android.gms.p029b.C0799a.C0801a;

public interface C0549z extends IInterface {

    public static abstract class C0551a extends Binder implements C0549z {

        private static class C0550a implements C0549z {
            private IBinder f1461a;

            C0550a(IBinder iBinder) {
                this.f1461a = iBinder;
            }

            public IBinder mo406a(C0799a c0799a, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                    obtain.writeStrongBinder(c0799a != null ? c0799a.asBinder() : null);
                    obtain.writeInt(i);
                    this.f1461a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    IBinder readStrongBinder = obtain2.readStrongBinder();
                    return readStrongBinder;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f1461a;
            }
        }

        public static C0549z m2469a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0549z)) ? new C0550a(iBinder) : (C0549z) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                    IBinder a = mo406a(C0801a.m3753a(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    IBinder mo406a(C0799a c0799a, int i);
}
