package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class RealtimeDocumentSyncRequest implements SafeParcelable {
    public static final Creator<RealtimeDocumentSyncRequest> CREATOR = new C1680l();
    final int f5041a;
    final List<String> f5042b;
    final List<String> f5043c;

    RealtimeDocumentSyncRequest(int i, List<String> list, List<String> list2) {
        this.f5041a = i;
        this.f5042b = (List) C1305x.m6617a((Object) list);
        this.f5043c = (List) C1305x.m6617a((Object) list2);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1680l.m7878a(this, parcel, i);
    }
}
