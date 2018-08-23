package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.ChangeSequenceNumber;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.WriteAwareParcelable;
import java.util.List;

public class OnChangesResponse extends WriteAwareParcelable implements SafeParcelable {
    public static final Creator<OnChangesResponse> CREATOR = new C1669r();
    final int f5181a;
    final DataHolder f5182b;
    final List<DriveId> f5183c;
    final ChangeSequenceNumber f5184d;
    final boolean f5185e;

    OnChangesResponse(int i, DataHolder dataHolder, List<DriveId> list, ChangeSequenceNumber changeSequenceNumber, boolean z) {
        this.f5181a = i;
        this.f5182b = dataHolder;
        this.f5183c = list;
        this.f5184d = changeSequenceNumber;
        this.f5185e = z;
    }

    protected void mo1046a(Parcel parcel, int i) {
        C1669r.m7845a(this, parcel, i | 1);
    }

    public int describeContents() {
        return 0;
    }
}
