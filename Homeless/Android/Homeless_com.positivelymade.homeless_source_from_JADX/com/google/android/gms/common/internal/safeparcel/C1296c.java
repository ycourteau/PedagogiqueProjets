package com.google.android.gms.common.internal.safeparcel;

import android.os.Parcel;

public final class C1296c {
    public static <T extends SafeParcelable> byte[] m6517a(T t) {
        Parcel obtain = Parcel.obtain();
        t.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }
}
