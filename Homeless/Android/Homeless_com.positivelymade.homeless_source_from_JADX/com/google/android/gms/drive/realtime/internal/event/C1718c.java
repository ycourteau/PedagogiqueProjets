package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import java.util.List;

public class C1718c implements Creator<ParcelableEvent> {
    static void m8008a(ParcelableEvent parcelableEvent, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, parcelableEvent.f5374a);
        C1295b.m6505a(parcel, 2, parcelableEvent.f5375b, false);
        C1295b.m6505a(parcel, 3, parcelableEvent.f5376c, false);
        C1295b.m6506a(parcel, 4, parcelableEvent.f5377d, false);
        C1295b.m6507a(parcel, 5, parcelableEvent.f5378e);
        C1295b.m6505a(parcel, 6, parcelableEvent.f5381h, false);
        C1295b.m6505a(parcel, 7, parcelableEvent.f5382i, false);
        C1295b.m6501a(parcel, 8, parcelableEvent.f5383j, i, false);
        C1295b.m6501a(parcel, 9, parcelableEvent.f5384k, i, false);
        C1295b.m6501a(parcel, 10, parcelableEvent.f5385l, i, false);
        C1295b.m6501a(parcel, 11, parcelableEvent.f5386m, i, false);
        C1295b.m6501a(parcel, 12, parcelableEvent.f5387n, i, false);
        C1295b.m6501a(parcel, 13, parcelableEvent.f5388o, i, false);
        C1295b.m6501a(parcel, 14, parcelableEvent.f5389p, i, false);
        C1295b.m6501a(parcel, 15, parcelableEvent.f5390q, i, false);
        C1295b.m6507a(parcel, 17, parcelableEvent.f5380g);
        C1295b.m6507a(parcel, 16, parcelableEvent.f5379f);
        C1295b.m6501a(parcel, 18, parcelableEvent.f5391r, i, false);
        C1295b.m6494a(parcel, a);
    }

    public ParcelableEvent m8009a(Parcel parcel) {
        int b = C1294a.m6465b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        List list = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        String str3 = null;
        String str4 = null;
        TextInsertedDetails textInsertedDetails = null;
        TextDeletedDetails textDeletedDetails = null;
        ValuesAddedDetails valuesAddedDetails = null;
        ValuesRemovedDetails valuesRemovedDetails = null;
        ValuesSetDetails valuesSetDetails = null;
        ValueChangedDetails valueChangedDetails = null;
        ReferenceShiftedDetails referenceShiftedDetails = null;
        ObjectChangedDetails objectChangedDetails = null;
        FieldChangedDetails fieldChangedDetails = null;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    str = C1294a.m6479m(parcel, a);
                    break;
                case 3:
                    str2 = C1294a.m6479m(parcel, a);
                    break;
                case 4:
                    list = C1294a.m6491y(parcel, a);
                    break;
                case 5:
                    z = C1294a.m6469c(parcel, a);
                    break;
                case 6:
                    str3 = C1294a.m6479m(parcel, a);
                    break;
                case 7:
                    str4 = C1294a.m6479m(parcel, a);
                    break;
                case 8:
                    textInsertedDetails = (TextInsertedDetails) C1294a.m6462a(parcel, a, TextInsertedDetails.CREATOR);
                    break;
                case 9:
                    textDeletedDetails = (TextDeletedDetails) C1294a.m6462a(parcel, a, TextDeletedDetails.CREATOR);
                    break;
                case 10:
                    valuesAddedDetails = (ValuesAddedDetails) C1294a.m6462a(parcel, a, ValuesAddedDetails.CREATOR);
                    break;
                case 11:
                    valuesRemovedDetails = (ValuesRemovedDetails) C1294a.m6462a(parcel, a, ValuesRemovedDetails.CREATOR);
                    break;
                case 12:
                    valuesSetDetails = (ValuesSetDetails) C1294a.m6462a(parcel, a, ValuesSetDetails.CREATOR);
                    break;
                case 13:
                    valueChangedDetails = (ValueChangedDetails) C1294a.m6462a(parcel, a, ValueChangedDetails.CREATOR);
                    break;
                case 14:
                    referenceShiftedDetails = (ReferenceShiftedDetails) C1294a.m6462a(parcel, a, ReferenceShiftedDetails.CREATOR);
                    break;
                case 15:
                    objectChangedDetails = (ObjectChangedDetails) C1294a.m6462a(parcel, a, ObjectChangedDetails.CREATOR);
                    break;
                case 16:
                    z2 = C1294a.m6469c(parcel, a);
                    break;
                case 17:
                    z3 = C1294a.m6469c(parcel, a);
                    break;
                case 18:
                    fieldChangedDetails = (FieldChangedDetails) C1294a.m6462a(parcel, a, FieldChangedDetails.CREATOR);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ParcelableEvent(i, str, str2, list, z, z2, z3, str3, str4, textInsertedDetails, textDeletedDetails, valuesAddedDetails, valuesRemovedDetails, valuesSetDetails, valueChangedDetails, referenceShiftedDetails, objectChangedDetails, fieldChangedDetails);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public ParcelableEvent[] m8010a(int i) {
        return new ParcelableEvent[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m8009a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m8010a(i);
    }
}
