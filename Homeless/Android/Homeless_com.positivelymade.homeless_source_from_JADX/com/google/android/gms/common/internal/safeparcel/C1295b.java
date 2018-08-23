package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public class C1295b {
    public static int m6493a(Parcel parcel) {
        return C1295b.m6513b(parcel, 20293);
    }

    public static void m6494a(Parcel parcel, int i) {
        C1295b.m6516c(parcel, i);
    }

    public static void m6495a(Parcel parcel, int i, float f) {
        C1295b.m6514b(parcel, i, 4);
        parcel.writeFloat(f);
    }

    public static void m6496a(Parcel parcel, int i, int i2) {
        C1295b.m6514b(parcel, i, 4);
        parcel.writeInt(i2);
    }

    public static void m6497a(Parcel parcel, int i, long j) {
        C1295b.m6514b(parcel, i, 8);
        parcel.writeLong(j);
    }

    public static void m6498a(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle != null) {
            int b = C1295b.m6513b(parcel, i);
            parcel.writeBundle(bundle);
            C1295b.m6516c(parcel, b);
        } else if (z) {
            C1295b.m6514b(parcel, i, 0);
        }
    }

    public static void m6499a(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder != null) {
            int b = C1295b.m6513b(parcel, i);
            parcel.writeStrongBinder(iBinder);
            C1295b.m6516c(parcel, b);
        } else if (z) {
            C1295b.m6514b(parcel, i, 0);
        }
    }

    public static void m6500a(Parcel parcel, int i, Parcel parcel2, boolean z) {
        if (parcel2 != null) {
            int b = C1295b.m6513b(parcel, i);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            C1295b.m6516c(parcel, b);
        } else if (z) {
            C1295b.m6514b(parcel, i, 0);
        }
    }

    public static void m6501a(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable != null) {
            int b = C1295b.m6513b(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            C1295b.m6516c(parcel, b);
        } else if (z) {
            C1295b.m6514b(parcel, i, 0);
        }
    }

    public static void m6502a(Parcel parcel, int i, Boolean bool, boolean z) {
        int i2 = 0;
        if (bool != null) {
            C1295b.m6514b(parcel, i, 4);
            if (bool.booleanValue()) {
                i2 = 1;
            }
            parcel.writeInt(i2);
        } else if (z) {
            C1295b.m6514b(parcel, i, 0);
        }
    }

    public static void m6503a(Parcel parcel, int i, Integer num, boolean z) {
        if (num != null) {
            C1295b.m6514b(parcel, i, 4);
            parcel.writeInt(num.intValue());
        } else if (z) {
            C1295b.m6514b(parcel, i, 0);
        }
    }

    public static void m6504a(Parcel parcel, int i, Long l, boolean z) {
        if (l != null) {
            C1295b.m6514b(parcel, i, 8);
            parcel.writeLong(l.longValue());
        } else if (z) {
            C1295b.m6514b(parcel, i, 0);
        }
    }

    public static void m6505a(Parcel parcel, int i, String str, boolean z) {
        if (str != null) {
            int b = C1295b.m6513b(parcel, i);
            parcel.writeString(str);
            C1295b.m6516c(parcel, b);
        } else if (z) {
            C1295b.m6514b(parcel, i, 0);
        }
    }

    public static void m6506a(Parcel parcel, int i, List<String> list, boolean z) {
        if (list != null) {
            int b = C1295b.m6513b(parcel, i);
            parcel.writeStringList(list);
            C1295b.m6516c(parcel, b);
        } else if (z) {
            C1295b.m6514b(parcel, i, 0);
        }
    }

    public static void m6507a(Parcel parcel, int i, boolean z) {
        C1295b.m6514b(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void m6508a(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr != null) {
            int b = C1295b.m6513b(parcel, i);
            parcel.writeByteArray(bArr);
            C1295b.m6516c(parcel, b);
        } else if (z) {
            C1295b.m6514b(parcel, i, 0);
        }
    }

    public static void m6509a(Parcel parcel, int i, int[] iArr, boolean z) {
        if (iArr != null) {
            int b = C1295b.m6513b(parcel, i);
            parcel.writeIntArray(iArr);
            C1295b.m6516c(parcel, b);
        } else if (z) {
            C1295b.m6514b(parcel, i, 0);
        }
    }

    public static <T extends Parcelable> void m6510a(Parcel parcel, int i, T[] tArr, int i2, boolean z) {
        if (tArr != null) {
            int b = C1295b.m6513b(parcel, i);
            parcel.writeInt(r3);
            for (Parcelable parcelable : tArr) {
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    C1295b.m6512a(parcel, parcelable, i2);
                }
            }
            C1295b.m6516c(parcel, b);
        } else if (z) {
            C1295b.m6514b(parcel, i, 0);
        }
    }

    public static void m6511a(Parcel parcel, int i, String[] strArr, boolean z) {
        if (strArr != null) {
            int b = C1295b.m6513b(parcel, i);
            parcel.writeStringArray(strArr);
            C1295b.m6516c(parcel, b);
        } else if (z) {
            C1295b.m6514b(parcel, i, 0);
        }
    }

    private static <T extends Parcelable> void m6512a(Parcel parcel, T t, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    private static int m6513b(Parcel parcel, int i) {
        parcel.writeInt(-65536 | i);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void m6514b(Parcel parcel, int i, int i2) {
        if (i2 >= 65535) {
            parcel.writeInt(-65536 | i);
            parcel.writeInt(i2);
            return;
        }
        parcel.writeInt((i2 << 16) | i);
    }

    public static <T extends Parcelable> void m6515b(Parcel parcel, int i, List<T> list, boolean z) {
        if (list != null) {
            int b = C1295b.m6513b(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcelable parcelable = (Parcelable) list.get(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    C1295b.m6512a(parcel, parcelable, 0);
                }
            }
            C1295b.m6516c(parcel, b);
        } else if (z) {
            C1295b.m6514b(parcel, i, 0);
        }
    }

    private static void m6516c(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        int i2 = dataPosition - i;
        parcel.setDataPosition(i - 4);
        parcel.writeInt(i2);
        parcel.setDataPosition(dataPosition);
    }
}
