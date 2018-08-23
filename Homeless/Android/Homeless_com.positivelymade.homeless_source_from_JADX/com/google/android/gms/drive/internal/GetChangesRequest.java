package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.ChangeSequenceNumber;
import com.google.android.gms.drive.DriveSpace;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GetChangesRequest implements SafeParcelable {
    public static final Creator<GetChangesRequest> CREATOR = new C1651f();
    final int f5156a;
    final ChangeSequenceNumber f5157b;
    final int f5158c;
    final List<DriveSpace> f5159d;
    private final Set<DriveSpace> f5160e;

    GetChangesRequest(int i, ChangeSequenceNumber changeSequenceNumber, int i2, List<DriveSpace> list) {
        this(i, changeSequenceNumber, i2, list, list == null ? null : new HashSet(list));
    }

    private GetChangesRequest(int i, ChangeSequenceNumber changeSequenceNumber, int i2, List<DriveSpace> list, Set<DriveSpace> set) {
        this.f5156a = i;
        this.f5157b = changeSequenceNumber;
        this.f5158c = i2;
        this.f5159d = list;
        this.f5160e = set;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1651f.m7689a(this, parcel, i);
    }
}
