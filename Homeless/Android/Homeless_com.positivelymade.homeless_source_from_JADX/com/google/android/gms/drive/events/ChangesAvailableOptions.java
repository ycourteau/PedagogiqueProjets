package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C1304w;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveSpace;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public final class ChangesAvailableOptions implements SafeParcelable {
    public static final Creator<ChangesAvailableOptions> CREATOR = new C1638c();
    final int f5063a;
    final int f5064b;
    final boolean f5065c;
    final List<DriveSpace> f5066d;
    private final Set<DriveSpace> f5067e;

    ChangesAvailableOptions(int i, int i2, boolean z, List<DriveSpace> list) {
        this(i, i2, z, list, list == null ? null : new HashSet(list));
    }

    private ChangesAvailableOptions(int i, int i2, boolean z, List<DriveSpace> list, Set<DriveSpace> set) {
        this.f5063a = i;
        this.f5064b = i2;
        this.f5065c = z;
        this.f5066d = list;
        this.f5067e = set;
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
        ChangesAvailableOptions changesAvailableOptions = (ChangesAvailableOptions) obj;
        return C1304w.m6615a(this.f5067e, changesAvailableOptions.f5067e) && this.f5064b == changesAvailableOptions.f5064b && this.f5065c == changesAvailableOptions.f5065c;
    }

    public int hashCode() {
        return C1304w.m6613a(this.f5067e, Integer.valueOf(this.f5064b), Boolean.valueOf(this.f5065c));
    }

    public String toString() {
        return String.format(Locale.US, "ChangesAvailableOptions[ChangesSizeLimit=%d, Repeats=%s, Spaces=%s]", new Object[]{Integer.valueOf(this.f5064b), Boolean.valueOf(this.f5065c), this.f5066d});
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1638c.m7548a(this, parcel, i);
    }
}
