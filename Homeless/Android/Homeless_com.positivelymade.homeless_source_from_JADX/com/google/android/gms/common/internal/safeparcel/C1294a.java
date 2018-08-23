package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class C1294a {

    public static class C1293a extends RuntimeException {
        public C1293a(String str, Parcel parcel) {
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        }
    }

    public static Parcel[] m6458A(Parcel parcel, int i) {
        int a = C1294a.m6461a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        Parcel[] parcelArr = new Parcel[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                parcelArr[i2] = obtain;
                parcel.setDataPosition(readInt2 + dataPosition2);
            } else {
                parcelArr[i2] = null;
            }
        }
        parcel.setDataPosition(dataPosition + a);
        return parcelArr;
    }

    public static int m6459a(int i) {
        return 65535 & i;
    }

    public static int m6460a(Parcel parcel) {
        return parcel.readInt();
    }

    public static int m6461a(Parcel parcel, int i) {
        return (i & -65536) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
    }

    public static <T extends Parcelable> T m6462a(Parcel parcel, int i, Creator<T> creator) {
        int a = C1294a.m6461a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(a + dataPosition);
        return parcelable;
    }

    private static void m6463a(Parcel parcel, int i, int i2) {
        int a = C1294a.m6461a(parcel, i);
        if (a != i2) {
            throw new C1293a("Expected size " + i2 + " got " + a + " (0x" + Integer.toHexString(a) + ")", parcel);
        }
    }

    private static void m6464a(Parcel parcel, int i, int i2, int i3) {
        if (i2 != i3) {
            throw new C1293a("Expected size " + i3 + " got " + i2 + " (0x" + Integer.toHexString(i2) + ")", parcel);
        }
    }

    public static int m6465b(Parcel parcel) {
        int a = C1294a.m6460a(parcel);
        int a2 = C1294a.m6461a(parcel, a);
        int dataPosition = parcel.dataPosition();
        if (C1294a.m6459a(a) != 20293) {
            throw new C1293a("Expected object header. Got 0x" + Integer.toHexString(a), parcel);
        }
        a = dataPosition + a2;
        if (a >= dataPosition && a <= parcel.dataSize()) {
            return a;
        }
        throw new C1293a("Size read is invalid start=" + dataPosition + " end=" + a, parcel);
    }

    public static void m6466b(Parcel parcel, int i) {
        parcel.setDataPosition(C1294a.m6461a(parcel, i) + parcel.dataPosition());
    }

    public static <T> T[] m6467b(Parcel parcel, int i, Creator<T> creator) {
        int a = C1294a.m6461a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(a + dataPosition);
        return createTypedArray;
    }

    public static <T> ArrayList<T> m6468c(Parcel parcel, int i, Creator<T> creator) {
        int a = C1294a.m6461a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(a + dataPosition);
        return createTypedArrayList;
    }

    public static boolean m6469c(Parcel parcel, int i) {
        C1294a.m6463a(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean m6470d(Parcel parcel, int i) {
        int a = C1294a.m6461a(parcel, i);
        if (a == 0) {
            return null;
        }
        C1294a.m6464a(parcel, i, a, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static int m6471e(Parcel parcel, int i) {
        C1294a.m6463a(parcel, i, 4);
        return parcel.readInt();
    }

    public static Integer m6472f(Parcel parcel, int i) {
        int a = C1294a.m6461a(parcel, i);
        if (a == 0) {
            return null;
        }
        C1294a.m6464a(parcel, i, a, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long m6473g(Parcel parcel, int i) {
        C1294a.m6463a(parcel, i, 8);
        return parcel.readLong();
    }

    public static Long m6474h(Parcel parcel, int i) {
        int a = C1294a.m6461a(parcel, i);
        if (a == 0) {
            return null;
        }
        C1294a.m6464a(parcel, i, a, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static BigInteger m6475i(Parcel parcel, int i) {
        int a = C1294a.m6461a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(a + dataPosition);
        return new BigInteger(createByteArray);
    }

    public static float m6476j(Parcel parcel, int i) {
        C1294a.m6463a(parcel, i, 4);
        return parcel.readFloat();
    }

    public static double m6477k(Parcel parcel, int i) {
        C1294a.m6463a(parcel, i, 8);
        return parcel.readDouble();
    }

    public static BigDecimal m6478l(Parcel parcel, int i) {
        int a = C1294a.m6461a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(a + dataPosition);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    public static String m6479m(Parcel parcel, int i) {
        int a = C1294a.m6461a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(a + dataPosition);
        return readString;
    }

    public static IBinder m6480n(Parcel parcel, int i) {
        int a = C1294a.m6461a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(a + dataPosition);
        return readStrongBinder;
    }

    public static Bundle m6481o(Parcel parcel, int i) {
        int a = C1294a.m6461a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(a + dataPosition);
        return readBundle;
    }

    public static byte[] m6482p(Parcel parcel, int i) {
        int a = C1294a.m6461a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(a + dataPosition);
        return createByteArray;
    }

    public static boolean[] m6483q(Parcel parcel, int i) {
        int a = C1294a.m6461a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        boolean[] createBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(a + dataPosition);
        return createBooleanArray;
    }

    public static int[] m6484r(Parcel parcel, int i) {
        int a = C1294a.m6461a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(a + dataPosition);
        return createIntArray;
    }

    public static long[] m6485s(Parcel parcel, int i) {
        int a = C1294a.m6461a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(a + dataPosition);
        return createLongArray;
    }

    public static BigInteger[] m6486t(Parcel parcel, int i) {
        int a = C1294a.m6461a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            bigIntegerArr[i2] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + a);
        return bigIntegerArr;
    }

    public static float[] m6487u(Parcel parcel, int i) {
        int a = C1294a.m6461a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        float[] createFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(a + dataPosition);
        return createFloatArray;
    }

    public static double[] m6488v(Parcel parcel, int i) {
        int a = C1294a.m6461a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        double[] createDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(a + dataPosition);
        return createDoubleArray;
    }

    public static BigDecimal[] m6489w(Parcel parcel, int i) {
        int a = C1294a.m6461a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            byte[] createByteArray = parcel.createByteArray();
            bigDecimalArr[i2] = new BigDecimal(new BigInteger(createByteArray), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + a);
        return bigDecimalArr;
    }

    public static String[] m6490x(Parcel parcel, int i) {
        int a = C1294a.m6461a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(a + dataPosition);
        return createStringArray;
    }

    public static ArrayList<String> m6491y(Parcel parcel, int i) {
        int a = C1294a.m6461a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(a + dataPosition);
        return createStringArrayList;
    }

    public static Parcel m6492z(Parcel parcel, int i) {
        int a = C1294a.m6461a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, a);
        parcel.setDataPosition(a + dataPosition);
        return obtain;
    }
}
