package com.google.android.gms.ads.internal.request;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.request.C0658k.C0659a;

public interface C0663j extends IInterface {

    public static abstract class C0665a extends Binder implements C0663j {

        private static class C0664a implements C0663j {
            private IBinder f1947a;

            C0664a(IBinder iBinder) {
                this.f1947a = iBinder;
            }

            public AdResponseParcel mo519a(AdRequestInfoParcel adRequestInfoParcel) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdRequestService");
                    if (adRequestInfoParcel != null) {
                        obtain.writeInt(1);
                        adRequestInfoParcel.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1947a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    AdResponseParcel a = obtain2.readInt() != 0 ? AdResponseParcel.CREATOR.m3009a(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return a;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo520a(AdRequestInfoParcel adRequestInfoParcel, C0658k c0658k) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdRequestService");
                    if (adRequestInfoParcel != null) {
                        obtain.writeInt(1);
                        adRequestInfoParcel.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c0658k != null ? c0658k.asBinder() : null);
                    this.f1947a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f1947a;
            }
        }

        public C0665a() {
            attachInterface(this, "com.google.android.gms.ads.internal.request.IAdRequestService");
        }

        public static C0663j m3018a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0663j)) ? new C0664a(iBinder) : (C0663j) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            AdRequestInfoParcel adRequestInfoParcel = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
                    if (parcel.readInt() != 0) {
                        adRequestInfoParcel = AdRequestInfoParcel.CREATOR.m3003a(parcel);
                    }
                    AdResponseParcel a = mo519a(adRequestInfoParcel);
                    parcel2.writeNoException();
                    if (a != null) {
                        parcel2.writeInt(1);
                        a.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
                    if (parcel.readInt() != 0) {
                        adRequestInfoParcel = AdRequestInfoParcel.CREATOR.m3003a(parcel);
                    }
                    mo520a(adRequestInfoParcel, C0659a.m3006a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.ads.internal.request.IAdRequestService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    AdResponseParcel mo519a(AdRequestInfoParcel adRequestInfoParcel);

    void mo520a(AdRequestInfoParcel adRequestInfoParcel, C0658k c0658k);
}
