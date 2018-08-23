package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C1304w;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class Permission implements SafeParcelable {
    public static final Creator<Permission> CREATOR = new C1679k();
    final int f5034a;
    private String f5035b;
    private int f5036c;
    private String f5037d;
    private String f5038e;
    private int f5039f;
    private boolean f5040g;

    Permission(int i, String str, int i2, String str2, String str3, int i3, boolean z) {
        this.f5034a = i;
        this.f5035b = str;
        this.f5036c = i2;
        this.f5037d = str2;
        this.f5038e = str3;
        this.f5039f = i3;
        this.f5040g = z;
    }

    public static boolean m7517a(int i) {
        switch (i) {
            case 256:
            case 257:
            case 258:
                return true;
            default:
                return false;
        }
    }

    public static boolean m7518b(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
                return true;
            default:
                return false;
        }
    }

    public String m7519a() {
        return !m7517a(this.f5036c) ? null : this.f5035b;
    }

    public int m7520b() {
        return !m7517a(this.f5036c) ? -1 : this.f5036c;
    }

    public String m7521c() {
        return this.f5037d;
    }

    public String m7522d() {
        return this.f5038e;
    }

    public int describeContents() {
        return 0;
    }

    public int m7523e() {
        return !m7518b(this.f5039f) ? -1 : this.f5039f;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        Permission permission = (Permission) obj;
        return C1304w.m6615a(this.f5035b, permission.f5035b) && this.f5036c == permission.f5036c && this.f5039f == permission.f5039f && this.f5040g == permission.f5040g;
    }

    public boolean m7524f() {
        return this.f5040g;
    }

    public int hashCode() {
        return C1304w.m6613a(this.f5035b, Integer.valueOf(this.f5036c), Integer.valueOf(this.f5039f), Boolean.valueOf(this.f5040g));
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1679k.m7875a(this, parcel, i);
    }
}
