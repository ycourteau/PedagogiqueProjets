package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DriveSpace implements SafeParcelable {
    public static final Creator<DriveSpace> CREATOR = new C1678j();
    public static final DriveSpace f5027a = new DriveSpace("DRIVE");
    public static final DriveSpace f5028b = new DriveSpace("APP_DATA_FOLDER");
    public static final DriveSpace f5029c = new DriveSpace("PHOTOS");
    public static final Set<DriveSpace> f5030d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new DriveSpace[]{f5027a, f5028b, f5029c})));
    public static final String f5031e = TextUtils.join(",", f5030d.toArray());
    final int f5032f;
    private final String f5033g;

    DriveSpace(int i, String str) {
        this.f5032f = i;
        this.f5033g = (String) C1305x.m6617a((Object) str);
    }

    private DriveSpace(String str) {
        this(1, str);
    }

    public String m7516a() {
        return this.f5033g;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return (obj == null || obj.getClass() != DriveSpace.class) ? false : this.f5033g.equals(((DriveSpace) obj).f5033g);
    }

    public int hashCode() {
        return 1247068382 ^ this.f5033g.hashCode();
    }

    public String toString() {
        return this.f5033g;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1678j.m7872a(this, parcel, i);
    }
}
