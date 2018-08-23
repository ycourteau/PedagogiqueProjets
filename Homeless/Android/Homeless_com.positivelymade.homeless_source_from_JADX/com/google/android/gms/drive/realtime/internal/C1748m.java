package com.google.android.gms.drive.realtime.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.v7.p010b.C0275a.C0274i;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.realtime.internal.C1707c.C1709a;
import com.google.android.gms.drive.realtime.internal.C1710d.C1712a;
import com.google.android.gms.drive.realtime.internal.C1713e.C1715a;
import com.google.android.gms.drive.realtime.internal.C1727f.C1729a;
import com.google.android.gms.drive.realtime.internal.C1730g.C1732a;
import com.google.android.gms.drive.realtime.internal.C1733h.C1735a;
import com.google.android.gms.drive.realtime.internal.C1736i.C1738a;
import com.google.android.gms.drive.realtime.internal.C1739j.C1741a;
import com.google.android.gms.drive.realtime.internal.C1742k.C1744a;
import com.google.android.gms.drive.realtime.internal.C1745l.C1747a;
import com.google.android.gms.drive.realtime.internal.C1751n.C1753a;
import com.google.android.gms.drive.realtime.internal.C1754o.C1756a;

public interface C1748m extends IInterface {

    public static abstract class C1750a extends Binder implements C1748m {

        private static class C1749a implements C1748m {
            private IBinder f5434a;

            C1749a(IBinder iBinder) {
                this.f5434a = iBinder;
            }

            public void mo1142a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    this.f5434a.transact(44, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1143a(int i, C1739j c1739j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeInt(i);
                    obtain.writeStrongBinder(c1739j != null ? c1739j.asBinder() : null);
                    this.f5434a.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1144a(int i, C1754o c1754o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeInt(i);
                    obtain.writeStrongBinder(c1754o != null ? c1754o.asBinder() : null);
                    this.f5434a.transact(50, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1145a(DriveId driveId, C1754o c1754o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    if (driveId != null) {
                        obtain.writeInt(1);
                        driveId.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c1754o != null ? c1754o.asBinder() : null);
                    this.f5434a.transact(48, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1146a(BeginCompoundOperationRequest beginCompoundOperationRequest, C1754o c1754o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    if (beginCompoundOperationRequest != null) {
                        obtain.writeInt(1);
                        beginCompoundOperationRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c1754o != null ? c1754o.asBinder() : null);
                    this.f5434a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1147a(EndCompoundOperationRequest endCompoundOperationRequest, C1739j c1739j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    if (endCompoundOperationRequest != null) {
                        obtain.writeInt(1);
                        endCompoundOperationRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c1739j != null ? c1739j.asBinder() : null);
                    this.f5434a.transact(41, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1148a(EndCompoundOperationRequest endCompoundOperationRequest, C1754o c1754o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    if (endCompoundOperationRequest != null) {
                        obtain.writeInt(1);
                        endCompoundOperationRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c1754o != null ? c1754o.asBinder() : null);
                    this.f5434a.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1149a(ParcelableIndexReference parcelableIndexReference, C1751n c1751n) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    if (parcelableIndexReference != null) {
                        obtain.writeInt(1);
                        parcelableIndexReference.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c1751n != null ? c1751n.asBinder() : null);
                    this.f5434a.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1150a(C1707c c1707c) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(c1707c != null ? c1707c.asBinder() : null);
                    this.f5434a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1151a(C1710d c1710d) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(c1710d != null ? c1710d.asBinder() : null);
                    this.f5434a.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1152a(C1713e c1713e) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(c1713e != null ? c1713e.asBinder() : null);
                    this.f5434a.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1153a(C1733h c1733h) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(c1733h != null ? c1733h.asBinder() : null);
                    this.f5434a.transact(36, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1154a(C1736i c1736i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(c1736i != null ? c1736i.asBinder() : null);
                    this.f5434a.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1155a(C1739j c1739j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(c1739j != null ? c1739j.asBinder() : null);
                    this.f5434a.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1156a(C1745l c1745l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(c1745l != null ? c1745l.asBinder() : null);
                    this.f5434a.transact(40, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1157a(C1754o c1754o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(c1754o != null ? c1754o.asBinder() : null);
                    this.f5434a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1158a(String str, int i, int i2, C1730g c1730g) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeStrongBinder(c1730g != null ? c1730g.asBinder() : null);
                    this.f5434a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1159a(String str, int i, int i2, C1739j c1739j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeStrongBinder(c1739j != null ? c1739j.asBinder() : null);
                    this.f5434a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1160a(String str, int i, DataHolder dataHolder, C1730g c1730g) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c1730g != null ? c1730g.asBinder() : null);
                    this.f5434a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1161a(String str, int i, DataHolder dataHolder, C1739j c1739j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c1739j != null ? c1739j.asBinder() : null);
                    this.f5434a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1162a(String str, int i, C1751n c1751n) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeStrongBinder(c1751n != null ? c1751n.asBinder() : null);
                    this.f5434a.transact(46, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1163a(String str, int i, C1754o c1754o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeStrongBinder(c1754o != null ? c1754o.asBinder() : null);
                    this.f5434a.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1164a(String str, int i, String str2, int i2, C1739j c1739j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    obtain.writeInt(i2);
                    obtain.writeStrongBinder(c1739j != null ? c1739j.asBinder() : null);
                    this.f5434a.transact(37, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1165a(String str, int i, String str2, C1739j c1739j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    obtain.writeStrongBinder(c1739j != null ? c1739j.asBinder() : null);
                    this.f5434a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1166a(String str, DataHolder dataHolder, C1739j c1739j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c1739j != null ? c1739j.asBinder() : null);
                    this.f5434a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1167a(String str, C1727f c1727f) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(c1727f != null ? c1727f.asBinder() : null);
                    this.f5434a.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1168a(String str, C1739j c1739j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(c1739j != null ? c1739j.asBinder() : null);
                    this.f5434a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1169a(String str, C1742k c1742k) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(c1742k != null ? c1742k.asBinder() : null);
                    this.f5434a.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1170a(String str, C1745l c1745l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(c1745l != null ? c1745l.asBinder() : null);
                    this.f5434a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1171a(String str, C1751n c1751n) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(c1751n != null ? c1751n.asBinder() : null);
                    this.f5434a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1172a(String str, C1754o c1754o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(c1754o != null ? c1754o.asBinder() : null);
                    this.f5434a.transact(38, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1173a(String str, String str2, DataHolder dataHolder, C1739j c1739j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (dataHolder != null) {
                        obtain.writeInt(1);
                        dataHolder.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(c1739j != null ? c1739j.asBinder() : null);
                    this.f5434a.transact(43, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1174a(String str, String str2, C1727f c1727f) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStrongBinder(c1727f != null ? c1727f.asBinder() : null);
                    this.f5434a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1175a(String str, String str2, C1730g c1730g) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStrongBinder(c1730g != null ? c1730g.asBinder() : null);
                    this.f5434a.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1176a(String str, String str2, C1739j c1739j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStrongBinder(c1739j != null ? c1739j.asBinder() : null);
                    this.f5434a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1177a(boolean z, C1754o c1754o) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    obtain.writeStrongBinder(c1754o != null ? c1754o.asBinder() : null);
                    this.f5434a.transact(47, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f5434a;
            }

            public void mo1178b(C1707c c1707c) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(c1707c != null ? c1707c.asBinder() : null);
                    this.f5434a.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1179b(C1739j c1739j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(c1739j != null ? c1739j.asBinder() : null);
                    this.f5434a.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1180b(C1745l c1745l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(c1745l != null ? c1745l.asBinder() : null);
                    this.f5434a.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1181b(C1754o c1754o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(c1754o != null ? c1754o.asBinder() : null);
                    this.f5434a.transact(35, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1182b(String str, C1727f c1727f) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(c1727f != null ? c1727f.asBinder() : null);
                    this.f5434a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1183b(String str, C1745l c1745l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(c1745l != null ? c1745l.asBinder() : null);
                    this.f5434a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1184b(String str, C1751n c1751n) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(c1751n != null ? c1751n.asBinder() : null);
                    this.f5434a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1185b(String str, C1754o c1754o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(c1754o != null ? c1754o.asBinder() : null);
                    this.f5434a.transact(39, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1186b(String str, String str2, C1727f c1727f) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStrongBinder(c1727f != null ? c1727f.asBinder() : null);
                    this.f5434a.transact(42, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1187c(C1707c c1707c) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(c1707c != null ? c1707c.asBinder() : null);
                    this.f5434a.transact(45, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1188c(C1754o c1754o) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(c1754o != null ? c1754o.asBinder() : null);
                    this.f5434a.transact(49, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1189c(String str, C1745l c1745l) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(c1745l != null ? c1745l.asBinder() : null);
                    this.f5434a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1190d(C1707c c1707c) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(c1707c != null ? c1707c.asBinder() : null);
                    this.f5434a.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mo1191e(C1707c c1707c) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    obtain.writeStrongBinder(c1707c != null ? c1707c.asBinder() : null);
                    this.f5434a.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static C1748m m8166a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1748m)) ? new C1749a(iBinder) : (C1748m) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            EndCompoundOperationRequest endCompoundOperationRequest = null;
            String readString;
            DataHolder a;
            int readInt;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    mo1171a(parcel.readString(), C1753a.m8171a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    mo1150a(C1709a.m7991a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    mo1157a(C1756a.m8176a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    mo1174a(parcel.readString(), parcel.readString(), C1729a.m8039a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    mo1170a(parcel.readString(), C1747a.m8065a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    readString = parcel.readString();
                    if (parcel.readInt() != 0) {
                        a = DataHolder.CREATOR.m6269a(parcel);
                    }
                    mo1166a(readString, a, C1741a.m8055a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    mo1168a(parcel.readString(), C1741a.m8055a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    mo1183b(parcel.readString(), C1747a.m8065a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    mo1184b(parcel.readString(), C1753a.m8171a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    mo1165a(parcel.readString(), parcel.readInt(), parcel.readString(), C1741a.m8055a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    mo1159a(parcel.readString(), parcel.readInt(), parcel.readInt(), C1741a.m8055a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    mo1176a(parcel.readString(), parcel.readString(), C1741a.m8055a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    mo1182b(parcel.readString(), C1729a.m8039a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    mo1189c(parcel.readString(), C1747a.m8065a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    readString = parcel.readString();
                    readInt = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        a = DataHolder.CREATOR.m6269a(parcel);
                    }
                    mo1161a(readString, readInt, a, C1741a.m8055a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    readString = parcel.readString();
                    readInt = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        a = DataHolder.CREATOR.m6269a(parcel);
                    }
                    mo1160a(readString, readInt, a, C1732a.m8044a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 17:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    mo1158a(parcel.readString(), parcel.readInt(), parcel.readInt(), C1732a.m8044a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 18:
                    BeginCompoundOperationRequest beginCompoundOperationRequest;
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    if (parcel.readInt() != 0) {
                        beginCompoundOperationRequest = (BeginCompoundOperationRequest) BeginCompoundOperationRequest.CREATOR.createFromParcel(parcel);
                    }
                    mo1146a(beginCompoundOperationRequest, C1756a.m8176a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 19:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    if (parcel.readInt() != 0) {
                        endCompoundOperationRequest = (EndCompoundOperationRequest) EndCompoundOperationRequest.CREATOR.createFromParcel(parcel);
                    }
                    mo1148a(endCompoundOperationRequest, C1756a.m8176a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 20:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    mo1167a(parcel.readString(), C1729a.m8039a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 21:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    mo1175a(parcel.readString(), parcel.readString(), C1732a.m8044a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 22:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    mo1155a(C1741a.m8055a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 23:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    mo1179b(C1741a.m8055a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 24:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    mo1190d(C1709a.m7991a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 25:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    mo1191e(C1709a.m7991a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 26:
                    ParcelableIndexReference parcelableIndexReference;
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    if (parcel.readInt() != 0) {
                        parcelableIndexReference = (ParcelableIndexReference) ParcelableIndexReference.CREATOR.createFromParcel(parcel);
                    }
                    mo1149a(parcelableIndexReference, C1753a.m8171a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case C0274i.Theme_actionModeStyle /*27*/:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    mo1169a(parcel.readString(), C1744a.m8060a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case C0274i.Theme_actionModeCloseButtonStyle /*28*/:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    mo1163a(parcel.readString(), parcel.readInt(), C1756a.m8176a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case C0274i.Theme_actionModeBackground /*29*/:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    mo1180b(C1747a.m8065a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case C0274i.Theme_actionModeSplitBackground /*30*/:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    mo1143a(parcel.readInt(), C1741a.m8055a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case C0274i.Theme_actionModeCloseDrawable /*31*/:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    mo1152a(C1715a.m8001a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case C0274i.Theme_actionModeCutDrawable /*32*/:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    mo1151a(C1712a.m7996a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case C0274i.Theme_actionModeCopyDrawable /*33*/:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    mo1178b(C1709a.m7991a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case C0274i.Theme_actionModePasteDrawable /*34*/:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    mo1154a(C1738a.m8050a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case C0274i.Theme_actionModeSelectAllDrawable /*35*/:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    mo1181b(C1756a.m8176a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case C0274i.Theme_actionModeShareDrawable /*36*/:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    mo1153a(C1735a.m8047a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case C0274i.Theme_actionModeFindDrawable /*37*/:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    mo1164a(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt(), C1741a.m8055a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case C0274i.Theme_actionModeWebSearchDrawable /*38*/:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    mo1172a(parcel.readString(), C1756a.m8176a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case C0274i.Theme_actionModePopupWindowStyle /*39*/:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    mo1185b(parcel.readString(), C1756a.m8176a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case C0274i.Theme_textAppearanceLargePopupMenu /*40*/:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    mo1156a(C1747a.m8065a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case C0274i.Theme_textAppearanceSmallPopupMenu /*41*/:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    if (parcel.readInt() != 0) {
                        endCompoundOperationRequest = (EndCompoundOperationRequest) EndCompoundOperationRequest.CREATOR.createFromParcel(parcel);
                    }
                    mo1147a(endCompoundOperationRequest, C1741a.m8055a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case C0274i.Theme_dialogTheme /*42*/:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    mo1186b(parcel.readString(), parcel.readString(), C1729a.m8039a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case C0274i.Theme_dialogPreferredPadding /*43*/:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    readString = parcel.readString();
                    String readString2 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        a = DataHolder.CREATOR.m6269a(parcel);
                    }
                    mo1173a(readString, readString2, a, C1741a.m8055a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case C0274i.Theme_listDividerAlertDialog /*44*/:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    mo1142a();
                    parcel2.writeNoException();
                    return true;
                case C0274i.Theme_actionDropDownStyle /*45*/:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    mo1187c(C1709a.m7991a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case C0274i.Theme_dropdownListPreferredItemHeight /*46*/:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    mo1162a(parcel.readString(), parcel.readInt(), C1753a.m8171a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case C0274i.Theme_spinnerDropDownItemStyle /*47*/:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    mo1177a(parcel.readInt() != 0, C1756a.m8176a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case C0274i.Theme_homeAsUpIndicator /*48*/:
                    DriveId driveId;
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    if (parcel.readInt() != 0) {
                        driveId = (DriveId) DriveId.CREATOR.createFromParcel(parcel);
                    }
                    mo1145a(driveId, C1756a.m8176a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case C0274i.Theme_actionButtonStyle /*49*/:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    mo1188c(C1756a.m8176a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case C0274i.Theme_buttonBarStyle /*50*/:
                    parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    mo1144a(parcel.readInt(), C1756a.m8176a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void mo1142a();

    void mo1143a(int i, C1739j c1739j);

    void mo1144a(int i, C1754o c1754o);

    void mo1145a(DriveId driveId, C1754o c1754o);

    void mo1146a(BeginCompoundOperationRequest beginCompoundOperationRequest, C1754o c1754o);

    void mo1147a(EndCompoundOperationRequest endCompoundOperationRequest, C1739j c1739j);

    void mo1148a(EndCompoundOperationRequest endCompoundOperationRequest, C1754o c1754o);

    void mo1149a(ParcelableIndexReference parcelableIndexReference, C1751n c1751n);

    void mo1150a(C1707c c1707c);

    void mo1151a(C1710d c1710d);

    void mo1152a(C1713e c1713e);

    void mo1153a(C1733h c1733h);

    void mo1154a(C1736i c1736i);

    void mo1155a(C1739j c1739j);

    void mo1156a(C1745l c1745l);

    void mo1157a(C1754o c1754o);

    void mo1158a(String str, int i, int i2, C1730g c1730g);

    void mo1159a(String str, int i, int i2, C1739j c1739j);

    void mo1160a(String str, int i, DataHolder dataHolder, C1730g c1730g);

    void mo1161a(String str, int i, DataHolder dataHolder, C1739j c1739j);

    void mo1162a(String str, int i, C1751n c1751n);

    void mo1163a(String str, int i, C1754o c1754o);

    void mo1164a(String str, int i, String str2, int i2, C1739j c1739j);

    void mo1165a(String str, int i, String str2, C1739j c1739j);

    void mo1166a(String str, DataHolder dataHolder, C1739j c1739j);

    void mo1167a(String str, C1727f c1727f);

    void mo1168a(String str, C1739j c1739j);

    void mo1169a(String str, C1742k c1742k);

    void mo1170a(String str, C1745l c1745l);

    void mo1171a(String str, C1751n c1751n);

    void mo1172a(String str, C1754o c1754o);

    void mo1173a(String str, String str2, DataHolder dataHolder, C1739j c1739j);

    void mo1174a(String str, String str2, C1727f c1727f);

    void mo1175a(String str, String str2, C1730g c1730g);

    void mo1176a(String str, String str2, C1739j c1739j);

    void mo1177a(boolean z, C1754o c1754o);

    void mo1178b(C1707c c1707c);

    void mo1179b(C1739j c1739j);

    void mo1180b(C1745l c1745l);

    void mo1181b(C1754o c1754o);

    void mo1182b(String str, C1727f c1727f);

    void mo1183b(String str, C1745l c1745l);

    void mo1184b(String str, C1751n c1751n);

    void mo1185b(String str, C1754o c1754o);

    void mo1186b(String str, String str2, C1727f c1727f);

    void mo1187c(C1707c c1707c);

    void mo1188c(C1754o c1754o);

    void mo1189c(String str, C1745l c1745l);

    void mo1190d(C1707c c1707c);

    void mo1191e(C1707c c1707c);
}
