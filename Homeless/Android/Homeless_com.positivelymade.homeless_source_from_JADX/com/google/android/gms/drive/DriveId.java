package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Base64;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.internal.C1668q;
import com.google.android.gms.drive.internal.bi;
import com.google.android.gms.p028c.lk;

public class DriveId implements SafeParcelable {
    public static final Creator<DriveId> CREATOR = new C1643g();
    final int f5018a;
    final String f5019b;
    final long f5020c;
    final long f5021d;
    final int f5022e;
    private volatile String f5023f = null;
    private volatile String f5024g = null;

    DriveId(int i, String str, long j, long j2, int i2) {
        boolean z = false;
        this.f5018a = i;
        this.f5019b = str;
        C1305x.m6625b(!"".equals(str));
        if (!(str == null && j == -1)) {
            z = true;
        }
        C1305x.m6625b(z);
        this.f5020c = j;
        this.f5021d = j2;
        this.f5022e = i2;
    }

    public final String m7514a() {
        if (this.f5023f == null) {
            this.f5023f = "DriveId:" + Base64.encodeToString(m7515b(), 10);
        }
        return this.f5023f;
    }

    final byte[] m7515b() {
        lk c1668q = new C1668q();
        c1668q.f5279a = this.f5018a;
        c1668q.f5280b = this.f5019b == null ? "" : this.f5019b;
        c1668q.f5281c = this.f5020c;
        c1668q.f5282d = this.f5021d;
        c1668q.f5283e = this.f5022e;
        return lk.m4708a(c1668q);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (!(obj instanceof DriveId)) {
            return false;
        }
        DriveId driveId = (DriveId) obj;
        if (driveId.f5021d != this.f5021d) {
            bi.m7679a("DriveId", "Attempt to compare invalid DriveId detected. Has local storage been cleared?");
            return false;
        } else if (driveId.f5020c == -1 && this.f5020c == -1) {
            return driveId.f5019b.equals(this.f5019b);
        } else {
            if (this.f5019b == null || driveId.f5019b == null) {
                if (driveId.f5020c != this.f5020c) {
                    z = false;
                }
                return z;
            } else if (driveId.f5020c != this.f5020c) {
                return false;
            } else {
                if (driveId.f5019b.equals(this.f5019b)) {
                    return true;
                }
                bi.m7679a("DriveId", "Unexpected unequal resourceId for same DriveId object.");
                return false;
            }
        }
    }

    public int hashCode() {
        return this.f5020c == -1 ? this.f5019b.hashCode() : (String.valueOf(this.f5021d) + String.valueOf(this.f5020c)).hashCode();
    }

    public String toString() {
        return m7514a();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1643g.m7560a(this, parcel, i);
    }
}
