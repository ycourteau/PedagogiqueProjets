package com.google.android.gms.drive.internal;

import android.content.IntentSender;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.v7.p010b.C0275a.C0274i;
import com.google.android.gms.drive.RealtimeDocumentSyncRequest;
import com.google.android.gms.drive.internal.C1659l.C1661a;
import com.google.android.gms.drive.internal.C1662m.C1664a;

public interface C1656k extends IInterface {

    public static abstract class C1658a extends Binder implements C1656k {

        private static class C1657a implements C1656k {
            private IBinder f5272a;

            C1657a(IBinder iBinder) {
                this.f5272a = iBinder;
            }

            public IntentSender mo1050a(CreateFileIntentSenderRequest createFileIntentSenderRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (createFileIntentSenderRequest != null) {
                        obtain.writeInt(1);
                        createFileIntentSenderRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f5272a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    IntentSender intentSender = obtain2.readInt() != 0 ? (IntentSender) IntentSender.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return intentSender;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IntentSender mo1051a(OpenFileIntentSenderRequest openFileIntentSenderRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (openFileIntentSenderRequest != null) {
                        obtain.writeInt(1);
                        openFileIntentSenderRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f5272a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    IntentSender intentSender = obtain2.readInt() != 0 ? (IntentSender) IntentSender.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return intentSender;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public DriveServiceResponse mo1052a(OpenContentsRequest openContentsRequest, C1659l c1659l) {
                DriveServiceResponse driveServiceResponse = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (openContentsRequest != null) {
                        obtain.writeInt(1);
                        openContentsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c1659l != null ? c1659l.asBinder() : null);
                    this.f5272a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        driveServiceResponse = (DriveServiceResponse) DriveServiceResponse.CREATOR.createFromParcel(obtain2);
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return driveServiceResponse;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1053a(RealtimeDocumentSyncRequest realtimeDocumentSyncRequest, C1659l c1659l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (realtimeDocumentSyncRequest != null) {
                        obtain.writeInt(1);
                        realtimeDocumentSyncRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c1659l != null ? c1659l.asBinder() : null);
                    this.f5272a.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1054a(AddEventListenerRequest addEventListenerRequest, C1662m c1662m, String str, C1659l c1659l) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (addEventListenerRequest != null) {
                        obtain.writeInt(1);
                        addEventListenerRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c1662m != null ? c1662m.asBinder() : null);
                    obtain.writeString(str);
                    if (c1659l != null) {
                        iBinder = c1659l.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f5272a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1055a(AddPermissionRequest addPermissionRequest, C1659l c1659l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (addPermissionRequest != null) {
                        obtain.writeInt(1);
                        addPermissionRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c1659l != null ? c1659l.asBinder() : null);
                    this.f5272a.transact(48, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1056a(AuthorizeAccessRequest authorizeAccessRequest, C1659l c1659l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (authorizeAccessRequest != null) {
                        obtain.writeInt(1);
                        authorizeAccessRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c1659l != null ? c1659l.asBinder() : null);
                    this.f5272a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1057a(CancelPendingActionsRequest cancelPendingActionsRequest, C1659l c1659l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (cancelPendingActionsRequest != null) {
                        obtain.writeInt(1);
                        cancelPendingActionsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c1659l != null ? c1659l.asBinder() : null);
                    this.f5272a.transact(37, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1058a(CheckResourceIdsExistRequest checkResourceIdsExistRequest, C1659l c1659l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (checkResourceIdsExistRequest != null) {
                        obtain.writeInt(1);
                        checkResourceIdsExistRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c1659l != null ? c1659l.asBinder() : null);
                    this.f5272a.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1059a(CloseContentsAndUpdateMetadataRequest closeContentsAndUpdateMetadataRequest, C1659l c1659l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (closeContentsAndUpdateMetadataRequest != null) {
                        obtain.writeInt(1);
                        closeContentsAndUpdateMetadataRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c1659l != null ? c1659l.asBinder() : null);
                    this.f5272a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1060a(CloseContentsRequest closeContentsRequest, C1659l c1659l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (closeContentsRequest != null) {
                        obtain.writeInt(1);
                        closeContentsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c1659l != null ? c1659l.asBinder() : null);
                    this.f5272a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1061a(ControlProgressRequest controlProgressRequest, C1659l c1659l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (controlProgressRequest != null) {
                        obtain.writeInt(1);
                        controlProgressRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c1659l != null ? c1659l.asBinder() : null);
                    this.f5272a.transact(53, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1062a(CreateContentsRequest createContentsRequest, C1659l c1659l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (createContentsRequest != null) {
                        obtain.writeInt(1);
                        createContentsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c1659l != null ? c1659l.asBinder() : null);
                    this.f5272a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1063a(CreateFileRequest createFileRequest, C1659l c1659l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (createFileRequest != null) {
                        obtain.writeInt(1);
                        createFileRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c1659l != null ? c1659l.asBinder() : null);
                    this.f5272a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1064a(CreateFolderRequest createFolderRequest, C1659l c1659l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (createFolderRequest != null) {
                        obtain.writeInt(1);
                        createFolderRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c1659l != null ? c1659l.asBinder() : null);
                    this.f5272a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1065a(DeleteResourceRequest deleteResourceRequest, C1659l c1659l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (deleteResourceRequest != null) {
                        obtain.writeInt(1);
                        deleteResourceRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c1659l != null ? c1659l.asBinder() : null);
                    this.f5272a.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1066a(DisconnectRequest disconnectRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (disconnectRequest != null) {
                        obtain.writeInt(1);
                        disconnectRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f5272a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1067a(FetchThumbnailRequest fetchThumbnailRequest, C1659l c1659l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (fetchThumbnailRequest != null) {
                        obtain.writeInt(1);
                        fetchThumbnailRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c1659l != null ? c1659l.asBinder() : null);
                    this.f5272a.transact(42, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1068a(GetChangesRequest getChangesRequest, C1659l c1659l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (getChangesRequest != null) {
                        obtain.writeInt(1);
                        getChangesRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c1659l != null ? c1659l.asBinder() : null);
                    this.f5272a.transact(44, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1069a(GetDriveIdFromUniqueIdentifierRequest getDriveIdFromUniqueIdentifierRequest, C1659l c1659l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (getDriveIdFromUniqueIdentifierRequest != null) {
                        obtain.writeInt(1);
                        getDriveIdFromUniqueIdentifierRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c1659l != null ? c1659l.asBinder() : null);
                    this.f5272a.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1070a(GetMetadataRequest getMetadataRequest, C1659l c1659l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (getMetadataRequest != null) {
                        obtain.writeInt(1);
                        getMetadataRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c1659l != null ? c1659l.asBinder() : null);
                    this.f5272a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1071a(GetPermissionsRequest getPermissionsRequest, C1659l c1659l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (getPermissionsRequest != null) {
                        obtain.writeInt(1);
                        getPermissionsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c1659l != null ? c1659l.asBinder() : null);
                    this.f5272a.transact(47, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1072a(ListParentsRequest listParentsRequest, C1659l c1659l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (listParentsRequest != null) {
                        obtain.writeInt(1);
                        listParentsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c1659l != null ? c1659l.asBinder() : null);
                    this.f5272a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1073a(LoadRealtimeRequest loadRealtimeRequest, C1659l c1659l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (loadRealtimeRequest != null) {
                        obtain.writeInt(1);
                        loadRealtimeRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c1659l != null ? c1659l.asBinder() : null);
                    this.f5272a.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1074a(QueryRequest queryRequest, C1659l c1659l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (queryRequest != null) {
                        obtain.writeInt(1);
                        queryRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c1659l != null ? c1659l.asBinder() : null);
                    this.f5272a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1075a(QueryRequest queryRequest, C1662m c1662m, C1659l c1659l) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (queryRequest != null) {
                        obtain.writeInt(1);
                        queryRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c1662m != null ? c1662m.asBinder() : null);
                    if (c1659l != null) {
                        iBinder = c1659l.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f5272a.transact(51, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1076a(RemoveEventListenerRequest removeEventListenerRequest, C1662m c1662m, String str, C1659l c1659l) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (removeEventListenerRequest != null) {
                        obtain.writeInt(1);
                        removeEventListenerRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c1662m != null ? c1662m.asBinder() : null);
                    obtain.writeString(str);
                    if (c1659l != null) {
                        iBinder = c1659l.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f5272a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1077a(RemovePermissionRequest removePermissionRequest, C1659l c1659l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (removePermissionRequest != null) {
                        obtain.writeInt(1);
                        removePermissionRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c1659l != null ? c1659l.asBinder() : null);
                    this.f5272a.transact(50, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1078a(SetDrivePreferencesRequest setDrivePreferencesRequest, C1659l c1659l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (setDrivePreferencesRequest != null) {
                        obtain.writeInt(1);
                        setDrivePreferencesRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c1659l != null ? c1659l.asBinder() : null);
                    this.f5272a.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1079a(SetFileUploadPreferencesRequest setFileUploadPreferencesRequest, C1659l c1659l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (setFileUploadPreferencesRequest != null) {
                        obtain.writeInt(1);
                        setFileUploadPreferencesRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c1659l != null ? c1659l.asBinder() : null);
                    this.f5272a.transact(36, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1080a(SetResourceParentsRequest setResourceParentsRequest, C1659l c1659l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (setResourceParentsRequest != null) {
                        obtain.writeInt(1);
                        setResourceParentsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c1659l != null ? c1659l.asBinder() : null);
                    this.f5272a.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1081a(TrashResourceRequest trashResourceRequest, C1659l c1659l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (trashResourceRequest != null) {
                        obtain.writeInt(1);
                        trashResourceRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c1659l != null ? c1659l.asBinder() : null);
                    this.f5272a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1082a(UnsubscribeResourceRequest unsubscribeResourceRequest, C1659l c1659l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (unsubscribeResourceRequest != null) {
                        obtain.writeInt(1);
                        unsubscribeResourceRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c1659l != null ? c1659l.asBinder() : null);
                    this.f5272a.transact(46, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1083a(UntrashResourceRequest untrashResourceRequest, C1659l c1659l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (untrashResourceRequest != null) {
                        obtain.writeInt(1);
                        untrashResourceRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c1659l != null ? c1659l.asBinder() : null);
                    this.f5272a.transact(38, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1084a(UpdateMetadataRequest updateMetadataRequest, C1659l c1659l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (updateMetadataRequest != null) {
                        obtain.writeInt(1);
                        updateMetadataRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c1659l != null ? c1659l.asBinder() : null);
                    this.f5272a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1085a(UpdatePermissionRequest updatePermissionRequest, C1659l c1659l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (updatePermissionRequest != null) {
                        obtain.writeInt(1);
                        updatePermissionRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c1659l != null ? c1659l.asBinder() : null);
                    this.f5272a.transact(49, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1086a(C1659l c1659l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    obtain.writeStrongBinder(c1659l != null ? c1659l.asBinder() : null);
                    this.f5272a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1087a(C1662m c1662m, C1659l c1659l) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    obtain.writeStrongBinder(c1662m != null ? c1662m.asBinder() : null);
                    if (c1659l != null) {
                        iBinder = c1659l.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f5272a.transact(52, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f5272a;
            }

            public void mo1088b(QueryRequest queryRequest, C1659l c1659l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if (queryRequest != null) {
                        obtain.writeInt(1);
                        queryRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c1659l != null ? c1659l.asBinder() : null);
                    this.f5272a.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1089b(C1659l c1659l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    obtain.writeStrongBinder(c1659l != null ? c1659l.asBinder() : null);
                    this.f5272a.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1090c(C1659l c1659l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    obtain.writeStrongBinder(c1659l != null ? c1659l.asBinder() : null);
                    this.f5272a.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1091d(C1659l c1659l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    obtain.writeStrongBinder(c1659l != null ? c1659l.asBinder() : null);
                    this.f5272a.transact(35, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1092e(C1659l c1659l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    obtain.writeStrongBinder(c1659l != null ? c1659l.asBinder() : null);
                    this.f5272a.transact(41, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1093f(C1659l c1659l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    obtain.writeStrongBinder(c1659l != null ? c1659l.asBinder() : null);
                    this.f5272a.transact(43, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static C1656k m7792a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.internal.IDriveService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1656k)) ? new C1657a(iBinder) : (C1656k) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            ControlProgressRequest controlProgressRequest = null;
            QueryRequest queryRequest;
            IntentSender a;
            switch (i) {
                case 1:
                    GetMetadataRequest getMetadataRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        getMetadataRequest = (GetMetadataRequest) GetMetadataRequest.CREATOR.createFromParcel(parcel);
                    }
                    mo1070a(getMetadataRequest, C1661a.m7829a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        queryRequest = (QueryRequest) QueryRequest.CREATOR.createFromParcel(parcel);
                    }
                    mo1074a(queryRequest, C1661a.m7829a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    UpdateMetadataRequest updateMetadataRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        updateMetadataRequest = (UpdateMetadataRequest) UpdateMetadataRequest.CREATOR.createFromParcel(parcel);
                    }
                    mo1084a(updateMetadataRequest, C1661a.m7829a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    CreateContentsRequest createContentsRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        createContentsRequest = (CreateContentsRequest) CreateContentsRequest.CREATOR.createFromParcel(parcel);
                    }
                    mo1062a(createContentsRequest, C1661a.m7829a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    CreateFileRequest createFileRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        createFileRequest = (CreateFileRequest) CreateFileRequest.CREATOR.createFromParcel(parcel);
                    }
                    mo1063a(createFileRequest, C1661a.m7829a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    CreateFolderRequest createFolderRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        createFolderRequest = (CreateFolderRequest) CreateFolderRequest.CREATOR.createFromParcel(parcel);
                    }
                    mo1064a(createFolderRequest, C1661a.m7829a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    OpenContentsRequest openContentsRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        openContentsRequest = (OpenContentsRequest) OpenContentsRequest.CREATOR.createFromParcel(parcel);
                    }
                    DriveServiceResponse a2 = mo1052a(openContentsRequest, C1661a.m7829a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    if (a2 != null) {
                        parcel2.writeInt(1);
                        a2.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 8:
                    CloseContentsRequest closeContentsRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        closeContentsRequest = (CloseContentsRequest) CloseContentsRequest.CREATOR.createFromParcel(parcel);
                    }
                    mo1060a(closeContentsRequest, C1661a.m7829a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    mo1086a(C1661a.m7829a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 10:
                    OpenFileIntentSenderRequest openFileIntentSenderRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        openFileIntentSenderRequest = (OpenFileIntentSenderRequest) OpenFileIntentSenderRequest.CREATOR.createFromParcel(parcel);
                    }
                    a = mo1051a(openFileIntentSenderRequest);
                    parcel2.writeNoException();
                    if (a != null) {
                        parcel2.writeInt(1);
                        a.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 11:
                    CreateFileIntentSenderRequest createFileIntentSenderRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        createFileIntentSenderRequest = (CreateFileIntentSenderRequest) CreateFileIntentSenderRequest.CREATOR.createFromParcel(parcel);
                    }
                    a = mo1050a(createFileIntentSenderRequest);
                    parcel2.writeNoException();
                    if (a != null) {
                        parcel2.writeInt(1);
                        a.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 12:
                    AuthorizeAccessRequest authorizeAccessRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        authorizeAccessRequest = (AuthorizeAccessRequest) AuthorizeAccessRequest.CREATOR.createFromParcel(parcel);
                    }
                    mo1056a(authorizeAccessRequest, C1661a.m7829a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 13:
                    ListParentsRequest listParentsRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        listParentsRequest = (ListParentsRequest) ListParentsRequest.CREATOR.createFromParcel(parcel);
                    }
                    mo1072a(listParentsRequest, C1661a.m7829a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 14:
                    AddEventListenerRequest addEventListenerRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        addEventListenerRequest = (AddEventListenerRequest) AddEventListenerRequest.CREATOR.createFromParcel(parcel);
                    }
                    mo1054a(addEventListenerRequest, C1664a.m7832a(parcel.readStrongBinder()), parcel.readString(), C1661a.m7829a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 15:
                    RemoveEventListenerRequest removeEventListenerRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        removeEventListenerRequest = (RemoveEventListenerRequest) RemoveEventListenerRequest.CREATOR.createFromParcel(parcel);
                    }
                    mo1076a(removeEventListenerRequest, C1664a.m7832a(parcel.readStrongBinder()), parcel.readString(), C1661a.m7829a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 16:
                    DisconnectRequest disconnectRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        disconnectRequest = (DisconnectRequest) DisconnectRequest.CREATOR.createFromParcel(parcel);
                    }
                    mo1066a(disconnectRequest);
                    parcel2.writeNoException();
                    return true;
                case 17:
                    TrashResourceRequest trashResourceRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        trashResourceRequest = (TrashResourceRequest) TrashResourceRequest.CREATOR.createFromParcel(parcel);
                    }
                    mo1081a(trashResourceRequest, C1661a.m7829a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 18:
                    CloseContentsAndUpdateMetadataRequest closeContentsAndUpdateMetadataRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        closeContentsAndUpdateMetadataRequest = (CloseContentsAndUpdateMetadataRequest) CloseContentsAndUpdateMetadataRequest.CREATOR.createFromParcel(parcel);
                    }
                    mo1059a(closeContentsAndUpdateMetadataRequest, C1661a.m7829a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 19:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        queryRequest = (QueryRequest) QueryRequest.CREATOR.createFromParcel(parcel);
                    }
                    mo1088b(queryRequest, C1661a.m7829a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 24:
                    DeleteResourceRequest deleteResourceRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        deleteResourceRequest = (DeleteResourceRequest) DeleteResourceRequest.CREATOR.createFromParcel(parcel);
                    }
                    mo1065a(deleteResourceRequest, C1661a.m7829a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case C0274i.Theme_actionModeStyle /*27*/:
                    LoadRealtimeRequest loadRealtimeRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        loadRealtimeRequest = (LoadRealtimeRequest) LoadRealtimeRequest.CREATOR.createFromParcel(parcel);
                    }
                    mo1073a(loadRealtimeRequest, C1661a.m7829a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case C0274i.Theme_actionModeCloseButtonStyle /*28*/:
                    SetResourceParentsRequest setResourceParentsRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        setResourceParentsRequest = (SetResourceParentsRequest) SetResourceParentsRequest.CREATOR.createFromParcel(parcel);
                    }
                    mo1080a(setResourceParentsRequest, C1661a.m7829a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case C0274i.Theme_actionModeBackground /*29*/:
                    GetDriveIdFromUniqueIdentifierRequest getDriveIdFromUniqueIdentifierRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        getDriveIdFromUniqueIdentifierRequest = (GetDriveIdFromUniqueIdentifierRequest) GetDriveIdFromUniqueIdentifierRequest.CREATOR.createFromParcel(parcel);
                    }
                    mo1069a(getDriveIdFromUniqueIdentifierRequest, C1661a.m7829a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case C0274i.Theme_actionModeSplitBackground /*30*/:
                    CheckResourceIdsExistRequest checkResourceIdsExistRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        checkResourceIdsExistRequest = (CheckResourceIdsExistRequest) CheckResourceIdsExistRequest.CREATOR.createFromParcel(parcel);
                    }
                    mo1058a(checkResourceIdsExistRequest, C1661a.m7829a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case C0274i.Theme_actionModeCloseDrawable /*31*/:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    mo1089b(C1661a.m7829a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case C0274i.Theme_actionModeCutDrawable /*32*/:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    mo1090c(C1661a.m7829a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case C0274i.Theme_actionModeCopyDrawable /*33*/:
                    SetDrivePreferencesRequest setDrivePreferencesRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        setDrivePreferencesRequest = (SetDrivePreferencesRequest) SetDrivePreferencesRequest.CREATOR.createFromParcel(parcel);
                    }
                    mo1078a(setDrivePreferencesRequest, C1661a.m7829a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case C0274i.Theme_actionModePasteDrawable /*34*/:
                    RealtimeDocumentSyncRequest realtimeDocumentSyncRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        realtimeDocumentSyncRequest = (RealtimeDocumentSyncRequest) RealtimeDocumentSyncRequest.CREATOR.createFromParcel(parcel);
                    }
                    mo1053a(realtimeDocumentSyncRequest, C1661a.m7829a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case C0274i.Theme_actionModeSelectAllDrawable /*35*/:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    mo1091d(C1661a.m7829a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case C0274i.Theme_actionModeShareDrawable /*36*/:
                    SetFileUploadPreferencesRequest setFileUploadPreferencesRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        setFileUploadPreferencesRequest = (SetFileUploadPreferencesRequest) SetFileUploadPreferencesRequest.CREATOR.createFromParcel(parcel);
                    }
                    mo1079a(setFileUploadPreferencesRequest, C1661a.m7829a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case C0274i.Theme_actionModeFindDrawable /*37*/:
                    CancelPendingActionsRequest cancelPendingActionsRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        cancelPendingActionsRequest = (CancelPendingActionsRequest) CancelPendingActionsRequest.CREATOR.createFromParcel(parcel);
                    }
                    mo1057a(cancelPendingActionsRequest, C1661a.m7829a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case C0274i.Theme_actionModeWebSearchDrawable /*38*/:
                    UntrashResourceRequest untrashResourceRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        untrashResourceRequest = (UntrashResourceRequest) UntrashResourceRequest.CREATOR.createFromParcel(parcel);
                    }
                    mo1083a(untrashResourceRequest, C1661a.m7829a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case C0274i.Theme_textAppearanceSmallPopupMenu /*41*/:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    mo1092e(C1661a.m7829a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case C0274i.Theme_dialogTheme /*42*/:
                    FetchThumbnailRequest fetchThumbnailRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        fetchThumbnailRequest = (FetchThumbnailRequest) FetchThumbnailRequest.CREATOR.createFromParcel(parcel);
                    }
                    mo1067a(fetchThumbnailRequest, C1661a.m7829a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case C0274i.Theme_dialogPreferredPadding /*43*/:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    mo1093f(C1661a.m7829a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case C0274i.Theme_listDividerAlertDialog /*44*/:
                    GetChangesRequest getChangesRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        getChangesRequest = (GetChangesRequest) GetChangesRequest.CREATOR.createFromParcel(parcel);
                    }
                    mo1068a(getChangesRequest, C1661a.m7829a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case C0274i.Theme_dropdownListPreferredItemHeight /*46*/:
                    UnsubscribeResourceRequest unsubscribeResourceRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        unsubscribeResourceRequest = (UnsubscribeResourceRequest) UnsubscribeResourceRequest.CREATOR.createFromParcel(parcel);
                    }
                    mo1082a(unsubscribeResourceRequest, C1661a.m7829a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case C0274i.Theme_spinnerDropDownItemStyle /*47*/:
                    GetPermissionsRequest getPermissionsRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        getPermissionsRequest = (GetPermissionsRequest) GetPermissionsRequest.CREATOR.createFromParcel(parcel);
                    }
                    mo1071a(getPermissionsRequest, C1661a.m7829a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case C0274i.Theme_homeAsUpIndicator /*48*/:
                    AddPermissionRequest addPermissionRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        addPermissionRequest = (AddPermissionRequest) AddPermissionRequest.CREATOR.createFromParcel(parcel);
                    }
                    mo1055a(addPermissionRequest, C1661a.m7829a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case C0274i.Theme_actionButtonStyle /*49*/:
                    UpdatePermissionRequest updatePermissionRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        updatePermissionRequest = (UpdatePermissionRequest) UpdatePermissionRequest.CREATOR.createFromParcel(parcel);
                    }
                    mo1085a(updatePermissionRequest, C1661a.m7829a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case C0274i.Theme_buttonBarStyle /*50*/:
                    RemovePermissionRequest removePermissionRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        removePermissionRequest = (RemovePermissionRequest) RemovePermissionRequest.CREATOR.createFromParcel(parcel);
                    }
                    mo1077a(removePermissionRequest, C1661a.m7829a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case C0274i.Theme_buttonBarButtonStyle /*51*/:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        queryRequest = (QueryRequest) QueryRequest.CREATOR.createFromParcel(parcel);
                    }
                    mo1075a(queryRequest, C1664a.m7832a(parcel.readStrongBinder()), C1661a.m7829a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case C0274i.Theme_selectableItemBackground /*52*/:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    mo1087a(C1664a.m7832a(parcel.readStrongBinder()), C1661a.m7829a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case C0274i.Theme_selectableItemBackgroundBorderless /*53*/:
                    parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if (parcel.readInt() != 0) {
                        controlProgressRequest = (ControlProgressRequest) ControlProgressRequest.CREATOR.createFromParcel(parcel);
                    }
                    mo1061a(controlProgressRequest, C1661a.m7829a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.drive.internal.IDriveService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    IntentSender mo1050a(CreateFileIntentSenderRequest createFileIntentSenderRequest);

    IntentSender mo1051a(OpenFileIntentSenderRequest openFileIntentSenderRequest);

    DriveServiceResponse mo1052a(OpenContentsRequest openContentsRequest, C1659l c1659l);

    void mo1053a(RealtimeDocumentSyncRequest realtimeDocumentSyncRequest, C1659l c1659l);

    void mo1054a(AddEventListenerRequest addEventListenerRequest, C1662m c1662m, String str, C1659l c1659l);

    void mo1055a(AddPermissionRequest addPermissionRequest, C1659l c1659l);

    void mo1056a(AuthorizeAccessRequest authorizeAccessRequest, C1659l c1659l);

    void mo1057a(CancelPendingActionsRequest cancelPendingActionsRequest, C1659l c1659l);

    void mo1058a(CheckResourceIdsExistRequest checkResourceIdsExistRequest, C1659l c1659l);

    void mo1059a(CloseContentsAndUpdateMetadataRequest closeContentsAndUpdateMetadataRequest, C1659l c1659l);

    void mo1060a(CloseContentsRequest closeContentsRequest, C1659l c1659l);

    void mo1061a(ControlProgressRequest controlProgressRequest, C1659l c1659l);

    void mo1062a(CreateContentsRequest createContentsRequest, C1659l c1659l);

    void mo1063a(CreateFileRequest createFileRequest, C1659l c1659l);

    void mo1064a(CreateFolderRequest createFolderRequest, C1659l c1659l);

    void mo1065a(DeleteResourceRequest deleteResourceRequest, C1659l c1659l);

    void mo1066a(DisconnectRequest disconnectRequest);

    void mo1067a(FetchThumbnailRequest fetchThumbnailRequest, C1659l c1659l);

    void mo1068a(GetChangesRequest getChangesRequest, C1659l c1659l);

    void mo1069a(GetDriveIdFromUniqueIdentifierRequest getDriveIdFromUniqueIdentifierRequest, C1659l c1659l);

    void mo1070a(GetMetadataRequest getMetadataRequest, C1659l c1659l);

    void mo1071a(GetPermissionsRequest getPermissionsRequest, C1659l c1659l);

    void mo1072a(ListParentsRequest listParentsRequest, C1659l c1659l);

    void mo1073a(LoadRealtimeRequest loadRealtimeRequest, C1659l c1659l);

    void mo1074a(QueryRequest queryRequest, C1659l c1659l);

    void mo1075a(QueryRequest queryRequest, C1662m c1662m, C1659l c1659l);

    void mo1076a(RemoveEventListenerRequest removeEventListenerRequest, C1662m c1662m, String str, C1659l c1659l);

    void mo1077a(RemovePermissionRequest removePermissionRequest, C1659l c1659l);

    void mo1078a(SetDrivePreferencesRequest setDrivePreferencesRequest, C1659l c1659l);

    void mo1079a(SetFileUploadPreferencesRequest setFileUploadPreferencesRequest, C1659l c1659l);

    void mo1080a(SetResourceParentsRequest setResourceParentsRequest, C1659l c1659l);

    void mo1081a(TrashResourceRequest trashResourceRequest, C1659l c1659l);

    void mo1082a(UnsubscribeResourceRequest unsubscribeResourceRequest, C1659l c1659l);

    void mo1083a(UntrashResourceRequest untrashResourceRequest, C1659l c1659l);

    void mo1084a(UpdateMetadataRequest updateMetadataRequest, C1659l c1659l);

    void mo1085a(UpdatePermissionRequest updatePermissionRequest, C1659l c1659l);

    void mo1086a(C1659l c1659l);

    void mo1087a(C1662m c1662m, C1659l c1659l);

    void mo1088b(QueryRequest queryRequest, C1659l c1659l);

    void mo1089b(C1659l c1659l);

    void mo1090c(C1659l c1659l);

    void mo1091d(C1659l c1659l);

    void mo1092e(C1659l c1659l);

    void mo1093f(C1659l c1659l);
}
