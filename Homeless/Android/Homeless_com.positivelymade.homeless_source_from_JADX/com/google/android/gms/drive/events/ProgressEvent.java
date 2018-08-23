package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C1304w;
import com.google.android.gms.drive.DriveId;

public final class ProgressEvent implements DriveEvent {
    public static final Creator<ProgressEvent> CREATOR = new C1640e();
    final int f5080a;
    final DriveId f5081b;
    final int f5082c;
    final long f5083d;
    final long f5084e;
    final int f5085f;

    ProgressEvent(int i, DriveId driveId, int i2, long j, long j2, int i3) {
        this.f5080a = i;
        this.f5081b = driveId;
        this.f5082c = i2;
        this.f5083d = j;
        this.f5084e = j2;
        this.f5085f = i3;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ProgressEvent progressEvent = (ProgressEvent) obj;
        return C1304w.m6615a(this.f5081b, progressEvent.f5081b) && this.f5082c == progressEvent.f5082c && this.f5083d == progressEvent.f5083d && this.f5084e == progressEvent.f5084e;
    }

    public int hashCode() {
        return C1304w.m6613a(this.f5081b, Integer.valueOf(this.f5082c), Long.valueOf(this.f5083d), Long.valueOf(this.f5084e));
    }

    public String toString() {
        return String.format("ProgressEvent[DriveId: %s, status: %d, bytes transferred: %d, total bytes: %d]", new Object[]{this.f5081b, Integer.valueOf(this.f5082c), Long.valueOf(this.f5083d), Long.valueOf(this.f5084e)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1640e.m7554a(this, parcel, i);
    }
}
