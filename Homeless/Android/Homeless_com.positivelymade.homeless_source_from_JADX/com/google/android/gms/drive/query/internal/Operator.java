package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class Operator implements SafeParcelable {
    public static final Creator<Operator> CREATOR = new C1703m();
    public static final Operator f5333a = new Operator("=");
    public static final Operator f5334b = new Operator("<");
    public static final Operator f5335c = new Operator("<=");
    public static final Operator f5336d = new Operator(">");
    public static final Operator f5337e = new Operator(">=");
    public static final Operator f5338f = new Operator("and");
    public static final Operator f5339g = new Operator("or");
    public static final Operator f5340h = new Operator("not");
    public static final Operator f5341i = new Operator("contains");
    final String f5342j;
    final int f5343k;

    Operator(int i, String str) {
        this.f5343k = i;
        this.f5342j = str;
    }

    private Operator(String str) {
        this(1, str);
    }

    public String m7942a() {
        return this.f5342j;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Operator operator = (Operator) obj;
        return this.f5342j == null ? operator.f5342j == null : this.f5342j.equals(operator.f5342j);
    }

    public int hashCode() {
        return (this.f5342j == null ? 0 : this.f5342j.hashCode()) + 31;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1703m.m7975a(this, parcel, i);
    }
}
