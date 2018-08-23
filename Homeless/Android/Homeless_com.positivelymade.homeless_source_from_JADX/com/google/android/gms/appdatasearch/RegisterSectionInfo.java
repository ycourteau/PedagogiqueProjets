package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class RegisterSectionInfo implements SafeParcelable {
    public static final C0796i CREATOR = new C0796i();
    final int f2323a;
    public final String f2324b;
    public final String f2325c;
    public final boolean f2326d;
    public final int f2327e;
    public final boolean f2328f;
    public final String f2329g;
    public final Feature[] f2330h;
    final int[] f2331i;
    public final String f2332j;

    public static final class C0785a {
        private final String f2314a;
        private String f2315b;
        private boolean f2316c;
        private int f2317d = 1;
        private boolean f2318e;
        private String f2319f;
        private final List<Feature> f2320g = new ArrayList();
        private BitSet f2321h;
        private String f2322i;

        public C0785a(String str) {
            this.f2314a = str;
        }

        public C0785a m3718a(String str) {
            this.f2315b = str;
            return this;
        }

        public C0785a m3719a(boolean z) {
            this.f2316c = z;
            return this;
        }

        public RegisterSectionInfo m3720a() {
            int i = 0;
            int[] iArr = null;
            if (this.f2321h != null) {
                iArr = new int[this.f2321h.cardinality()];
                int nextSetBit = this.f2321h.nextSetBit(0);
                while (nextSetBit >= 0) {
                    int i2 = i + 1;
                    iArr[i] = nextSetBit;
                    nextSetBit = this.f2321h.nextSetBit(nextSetBit + 1);
                    i = i2;
                }
            }
            return new RegisterSectionInfo(this.f2314a, this.f2315b, this.f2316c, this.f2317d, this.f2318e, this.f2319f, (Feature[]) this.f2320g.toArray(new Feature[this.f2320g.size()]), iArr, this.f2322i);
        }
    }

    RegisterSectionInfo(int i, String str, String str2, boolean z, int i2, boolean z2, String str3, Feature[] featureArr, int[] iArr, String str4) {
        this.f2323a = i;
        this.f2324b = str;
        this.f2325c = str2;
        this.f2326d = z;
        this.f2327e = i2;
        this.f2328f = z2;
        this.f2329g = str3;
        this.f2330h = featureArr;
        this.f2331i = iArr;
        this.f2332j = str4;
    }

    RegisterSectionInfo(String str, String str2, boolean z, int i, boolean z2, String str3, Feature[] featureArr, int[] iArr, String str4) {
        this(2, str, str2, z, i, z2, str3, featureArr, iArr, str4);
    }

    public int describeContents() {
        C0796i c0796i = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0796i c0796i = CREATOR;
        C0796i.m3746a(this, parcel, i);
    }
}
