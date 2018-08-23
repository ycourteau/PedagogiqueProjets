package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse.C1520a;

public class ConverterWrapper implements SafeParcelable {
    public static final C1521a CREATOR = new C1521a();
    private final int f4525a;
    private final StringToIntConverter f4526b;

    ConverterWrapper(int i, StringToIntConverter stringToIntConverter) {
        this.f4525a = i;
        this.f4526b = stringToIntConverter;
    }

    private ConverterWrapper(StringToIntConverter stringToIntConverter) {
        this.f4525a = 1;
        this.f4526b = stringToIntConverter;
    }

    public static ConverterWrapper m6835a(C1520a<?, ?> c1520a) {
        if (c1520a instanceof StringToIntConverter) {
            return new ConverterWrapper((StringToIntConverter) c1520a);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    int m6836a() {
        return this.f4525a;
    }

    StringToIntConverter m6837b() {
        return this.f4526b;
    }

    public C1520a<?, ?> m6838c() {
        if (this.f4526b != null) {
            return this.f4526b;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    public int describeContents() {
        C1521a c1521a = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1521a c1521a = CREATOR;
        C1521a.m6850a(this, parcel, i);
    }
}
