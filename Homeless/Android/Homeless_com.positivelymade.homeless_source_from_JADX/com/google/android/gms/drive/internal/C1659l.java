package com.google.android.gms.drive.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.ChangeSequenceNumber;
import com.google.android.gms.drive.realtime.internal.C1748m;
import com.google.android.gms.drive.realtime.internal.C1748m.C1750a;

public interface C1659l extends IInterface {

    public static abstract class C1661a extends Binder implements C1659l {

        private static class C1660a implements C1659l {
            private IBinder f5273a;

            C1660a(IBinder iBinder) {
                this.f5273a = iBinder;
            }

            public void mo1094a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    this.f5273a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1095a(Status status) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (status != null) {
                        obtain.writeInt(1);
                        status.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f5273a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1096a(ChangeSequenceNumber changeSequenceNumber) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (changeSequenceNumber != null) {
                        obtain.writeInt(1);
                        changeSequenceNumber.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f5273a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1097a(GetPermissionsResponse getPermissionsResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (getPermissionsResponse != null) {
                        obtain.writeInt(1);
                        getPermissionsResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f5273a.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1098a(OnChangesResponse onChangesResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (onChangesResponse != null) {
                        obtain.writeInt(1);
                        onChangesResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f5273a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1099a(OnContentsResponse onContentsResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (onContentsResponse != null) {
                        obtain.writeInt(1);
                        onContentsResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f5273a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1100a(OnDeviceUsagePreferenceResponse onDeviceUsagePreferenceResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (onDeviceUsagePreferenceResponse != null) {
                        obtain.writeInt(1);
                        onDeviceUsagePreferenceResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f5273a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1101a(OnDownloadProgressResponse onDownloadProgressResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (onDownloadProgressResponse != null) {
                        obtain.writeInt(1);
                        onDownloadProgressResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f5273a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1102a(OnDriveIdResponse onDriveIdResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (onDriveIdResponse != null) {
                        obtain.writeInt(1);
                        onDriveIdResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f5273a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1103a(OnDrivePreferencesResponse onDrivePreferencesResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (onDrivePreferencesResponse != null) {
                        obtain.writeInt(1);
                        onDrivePreferencesResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f5273a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1104a(OnFetchThumbnailResponse onFetchThumbnailResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (onFetchThumbnailResponse != null) {
                        obtain.writeInt(1);
                        onFetchThumbnailResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f5273a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1105a(OnListEntriesResponse onListEntriesResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (onListEntriesResponse != null) {
                        obtain.writeInt(1);
                        onListEntriesResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f5273a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1106a(OnListParentsResponse onListParentsResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (onListParentsResponse != null) {
                        obtain.writeInt(1);
                        onListParentsResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f5273a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1107a(OnLoadRealtimeResponse onLoadRealtimeResponse, C1748m c1748m) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (onLoadRealtimeResponse != null) {
                        obtain.writeInt(1);
                        onLoadRealtimeResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c1748m != null ? c1748m.asBinder() : null);
                    this.f5273a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1108a(OnMetadataResponse onMetadataResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (onMetadataResponse != null) {
                        obtain.writeInt(1);
                        onMetadataResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f5273a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1109a(OnResourceIdSetResponse onResourceIdSetResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (onResourceIdSetResponse != null) {
                        obtain.writeInt(1);
                        onResourceIdSetResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f5273a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1110a(OnSyncMoreResponse onSyncMoreResponse) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (onSyncMoreResponse != null) {
                        obtain.writeInt(1);
                        onSyncMoreResponse.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f5273a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1111a(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f5273a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f5273a;
            }
        }

        public static C1659l m7829a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1659l)) ? new C1660a(iBinder) : (C1659l) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            GetPermissionsResponse getPermissionsResponse = null;
            switch (i) {
                case 1:
                    OnDownloadProgressResponse onDownloadProgressResponse;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (parcel.readInt() != 0) {
                        onDownloadProgressResponse = (OnDownloadProgressResponse) OnDownloadProgressResponse.CREATOR.createFromParcel(parcel);
                    }
                    mo1101a(onDownloadProgressResponse);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    OnListEntriesResponse onListEntriesResponse;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (parcel.readInt() != 0) {
                        onListEntriesResponse = (OnListEntriesResponse) OnListEntriesResponse.CREATOR.createFromParcel(parcel);
                    }
                    mo1105a(onListEntriesResponse);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    OnDriveIdResponse onDriveIdResponse;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (parcel.readInt() != 0) {
                        onDriveIdResponse = (OnDriveIdResponse) OnDriveIdResponse.CREATOR.createFromParcel(parcel);
                    }
                    mo1102a(onDriveIdResponse);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    OnMetadataResponse onMetadataResponse;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (parcel.readInt() != 0) {
                        onMetadataResponse = (OnMetadataResponse) OnMetadataResponse.CREATOR.createFromParcel(parcel);
                    }
                    mo1108a(onMetadataResponse);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    OnContentsResponse onContentsResponse;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (parcel.readInt() != 0) {
                        onContentsResponse = (OnContentsResponse) OnContentsResponse.CREATOR.createFromParcel(parcel);
                    }
                    mo1099a(onContentsResponse);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    Status status;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (parcel.readInt() != 0) {
                        status = (Status) Status.CREATOR.createFromParcel(parcel);
                    }
                    mo1095a(status);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    mo1094a();
                    parcel2.writeNoException();
                    return true;
                case 8:
                    OnListParentsResponse onListParentsResponse;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (parcel.readInt() != 0) {
                        onListParentsResponse = (OnListParentsResponse) OnListParentsResponse.CREATOR.createFromParcel(parcel);
                    }
                    mo1106a(onListParentsResponse);
                    parcel2.writeNoException();
                    return true;
                case 9:
                    OnSyncMoreResponse onSyncMoreResponse;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (parcel.readInt() != 0) {
                        onSyncMoreResponse = (OnSyncMoreResponse) OnSyncMoreResponse.CREATOR.createFromParcel(parcel);
                    }
                    mo1110a(onSyncMoreResponse);
                    parcel2.writeNoException();
                    return true;
                case 11:
                    OnLoadRealtimeResponse onLoadRealtimeResponse;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (parcel.readInt() != 0) {
                        onLoadRealtimeResponse = (OnLoadRealtimeResponse) OnLoadRealtimeResponse.CREATOR.createFromParcel(parcel);
                    }
                    mo1107a(onLoadRealtimeResponse, C1750a.m8166a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 12:
                    OnResourceIdSetResponse onResourceIdSetResponse;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (parcel.readInt() != 0) {
                        onResourceIdSetResponse = (OnResourceIdSetResponse) OnResourceIdSetResponse.CREATOR.createFromParcel(parcel);
                    }
                    mo1109a(onResourceIdSetResponse);
                    parcel2.writeNoException();
                    return true;
                case 13:
                    OnDrivePreferencesResponse onDrivePreferencesResponse;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (parcel.readInt() != 0) {
                        onDrivePreferencesResponse = (OnDrivePreferencesResponse) OnDrivePreferencesResponse.CREATOR.createFromParcel(parcel);
                    }
                    mo1103a(onDrivePreferencesResponse);
                    parcel2.writeNoException();
                    return true;
                case 14:
                    OnDeviceUsagePreferenceResponse onDeviceUsagePreferenceResponse;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (parcel.readInt() != 0) {
                        onDeviceUsagePreferenceResponse = (OnDeviceUsagePreferenceResponse) OnDeviceUsagePreferenceResponse.CREATOR.createFromParcel(parcel);
                    }
                    mo1100a(onDeviceUsagePreferenceResponse);
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    mo1111a(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 16:
                    OnFetchThumbnailResponse onFetchThumbnailResponse;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (parcel.readInt() != 0) {
                        onFetchThumbnailResponse = (OnFetchThumbnailResponse) OnFetchThumbnailResponse.CREATOR.createFromParcel(parcel);
                    }
                    mo1104a(onFetchThumbnailResponse);
                    parcel2.writeNoException();
                    return true;
                case 17:
                    ChangeSequenceNumber changeSequenceNumber;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (parcel.readInt() != 0) {
                        changeSequenceNumber = (ChangeSequenceNumber) ChangeSequenceNumber.CREATOR.createFromParcel(parcel);
                    }
                    mo1096a(changeSequenceNumber);
                    parcel2.writeNoException();
                    return true;
                case 18:
                    OnChangesResponse onChangesResponse;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (parcel.readInt() != 0) {
                        onChangesResponse = (OnChangesResponse) OnChangesResponse.CREATOR.createFromParcel(parcel);
                    }
                    mo1098a(onChangesResponse);
                    parcel2.writeNoException();
                    return true;
                case 20:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if (parcel.readInt() != 0) {
                        getPermissionsResponse = (GetPermissionsResponse) GetPermissionsResponse.CREATOR.createFromParcel(parcel);
                    }
                    mo1097a(getPermissionsResponse);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void mo1094a();

    void mo1095a(Status status);

    void mo1096a(ChangeSequenceNumber changeSequenceNumber);

    void mo1097a(GetPermissionsResponse getPermissionsResponse);

    void mo1098a(OnChangesResponse onChangesResponse);

    void mo1099a(OnContentsResponse onContentsResponse);

    void mo1100a(OnDeviceUsagePreferenceResponse onDeviceUsagePreferenceResponse);

    void mo1101a(OnDownloadProgressResponse onDownloadProgressResponse);

    void mo1102a(OnDriveIdResponse onDriveIdResponse);

    void mo1103a(OnDrivePreferencesResponse onDrivePreferencesResponse);

    void mo1104a(OnFetchThumbnailResponse onFetchThumbnailResponse);

    void mo1105a(OnListEntriesResponse onListEntriesResponse);

    void mo1106a(OnListParentsResponse onListParentsResponse);

    void mo1107a(OnLoadRealtimeResponse onLoadRealtimeResponse, C1748m c1748m);

    void mo1108a(OnMetadataResponse onMetadataResponse);

    void mo1109a(OnResourceIdSetResponse onResourceIdSetResponse);

    void mo1110a(OnSyncMoreResponse onSyncMoreResponse);

    void mo1111a(boolean z);
}
