package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Base64;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.internal.C1667p;
import com.google.android.gms.p028c.lk;

public class ChangeSequenceNumber implements SafeParcelable {
    public static final Creator<ChangeSequenceNumber> CREATOR = new C1634d();
    final int f5006a;
    final long f5007b;
    final long f5008c;
    final long f5009d;
    private volatile String f5010e = null;

    ChangeSequenceNumber(int i, long j, long j2, long j3) {
        boolean z = true;
        C1305x.m6625b(j != -1);
        C1305x.m6625b(j2 != -1);
        if (j3 == -1) {
            z = false;
        }
        C1305x.m6625b(z);
        this.f5006a = i;
        this.f5007b = j;
        this.f5008c = j2;
        this.f5009d = j3;
    }

    public final String m7510a() {
        if (this.f5010e == null) {
            this.f5010e = "ChangeSequenceNumber:" + Base64.encodeToString(m7511b(), 10);
        }
        return this.f5010e;
    }

    final byte[] m7511b() {
        lk c1667p = new C1667p();
        c1667p.f5275a = this.f5006a;
        c1667p.f5276b = this.f5007b;
        c1667p.f5277c = this.f5008c;
        c1667p.f5278d = this.f5009d;
        return lk.m4708a(c1667p);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ChangeSequenceNumber)) {
            return false;
        }
        ChangeSequenceNumber changeSequenceNumber = (ChangeSequenceNumber) obj;
        return changeSequenceNumber.f5008c == this.f5008c && changeSequenceNumber.f5009d == this.f5009d && changeSequenceNumber.f5007b == this.f5007b;
    }

    public int hashCode() {
        return (String.valueOf(this.f5007b) + String.valueOf(this.f5008c) + String.valueOf(this.f5009d)).hashCode();
    }

    public String toString() {
        return m7510a();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1634d.m7535a(this, parcel, i);
    }
}
