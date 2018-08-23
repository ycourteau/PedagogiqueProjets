package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.p028c.di;
import com.google.android.gms.p028c.di.C0899a;
import com.google.android.gms.p029b.C0799a;
import com.google.android.gms.p029b.C0799a.C0801a;

public interface C0542v extends IInterface {

    public static abstract class C0544a extends Binder implements C0542v {

        private static class C0543a implements C0542v {
            private IBinder f1458a;

            C0543a(IBinder iBinder) {
                this.f1458a = iBinder;
            }

            public IBinder mo404a(C0799a c0799a, AdSizeParcel adSizeParcel, String str, di diVar, int i) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    obtain.writeStrongBinder(c0799a != null ? c0799a.asBinder() : null);
                    if (adSizeParcel != null) {
                        obtain.writeInt(1);
                        adSizeParcel.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    if (diVar != null) {
                        iBinder = diVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    this.f1458a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    iBinder = obtain2.readStrongBinder();
                    return iBinder;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder mo405a(C0799a c0799a, AdSizeParcel adSizeParcel, String str, di diVar, int i, int i2) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    obtain.writeStrongBinder(c0799a != null ? c0799a.asBinder() : null);
                    if (adSizeParcel != null) {
                        obtain.writeInt(1);
                        adSizeParcel.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    if (diVar != null) {
                        iBinder = diVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f1458a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    iBinder = obtain2.readStrongBinder();
                    return iBinder;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f1458a;
            }
        }

        public static C0542v m2463a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0542v)) ? new C0543a(iBinder) : (C0542v) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            AdSizeParcel adSizeParcel = null;
            C0799a a;
            IBinder a2;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    a = C0801a.m3753a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        adSizeParcel = AdSizeParcel.CREATOR.m2392a(parcel);
                    }
                    a2 = mo404a(a, adSizeParcel, parcel.readString(), C0899a.m4225a(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a2);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    a = C0801a.m3753a(parcel.readStrongBinder());
                    if (parcel.readInt() != 0) {
                        adSizeParcel = AdSizeParcel.CREATOR.m2392a(parcel);
                    }
                    a2 = mo405a(a, adSizeParcel, parcel.readString(), C0899a.m4225a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(a2);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    IBinder mo404a(C0799a c0799a, AdSizeParcel adSizeParcel, String str, di diVar, int i);

    IBinder mo405a(C0799a c0799a, AdSizeParcel adSizeParcel, String str, di diVar, int i, int i2);
}
