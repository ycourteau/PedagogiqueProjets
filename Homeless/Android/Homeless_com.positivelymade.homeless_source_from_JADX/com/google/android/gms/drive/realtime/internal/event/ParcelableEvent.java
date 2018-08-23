package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class ParcelableEvent implements SafeParcelable {
    public static final Creator<ParcelableEvent> CREATOR = new C1718c();
    final int f5374a;
    final String f5375b;
    final String f5376c;
    final List<String> f5377d;
    final boolean f5378e;
    final boolean f5379f;
    final boolean f5380g;
    final String f5381h;
    final String f5382i;
    final TextInsertedDetails f5383j;
    final TextDeletedDetails f5384k;
    final ValuesAddedDetails f5385l;
    final ValuesRemovedDetails f5386m;
    final ValuesSetDetails f5387n;
    final ValueChangedDetails f5388o;
    final ReferenceShiftedDetails f5389p;
    final ObjectChangedDetails f5390q;
    final FieldChangedDetails f5391r;

    ParcelableEvent(int i, String str, String str2, List<String> list, boolean z, boolean z2, boolean z3, String str3, String str4, TextInsertedDetails textInsertedDetails, TextDeletedDetails textDeletedDetails, ValuesAddedDetails valuesAddedDetails, ValuesRemovedDetails valuesRemovedDetails, ValuesSetDetails valuesSetDetails, ValueChangedDetails valueChangedDetails, ReferenceShiftedDetails referenceShiftedDetails, ObjectChangedDetails objectChangedDetails, FieldChangedDetails fieldChangedDetails) {
        this.f5374a = i;
        this.f5375b = str;
        this.f5376c = str2;
        this.f5377d = list;
        this.f5378e = z;
        this.f5379f = z2;
        this.f5380g = z3;
        this.f5381h = str3;
        this.f5382i = str4;
        this.f5383j = textInsertedDetails;
        this.f5384k = textDeletedDetails;
        this.f5385l = valuesAddedDetails;
        this.f5386m = valuesRemovedDetails;
        this.f5387n = valuesSetDetails;
        this.f5388o = valueChangedDetails;
        this.f5389p = referenceShiftedDetails;
        this.f5390q = objectChangedDetails;
        this.f5391r = fieldChangedDetails;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1718c.m8008a(this, parcel, i);
    }
}
