package com.google.android.gms.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class GoogleSignInAccount implements SafeParcelable {
    public static final Creator<GoogleSignInAccount> CREATOR = new C1909a();
    final int f5855a;
    private String f5856b;
    private String f5857c;
    private String f5858d;
    private String f5859e;
    private Uri f5860f;

    GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri) {
        this.f5855a = i;
        this.f5856b = C1305x.m6619a(str);
        this.f5857c = str2;
        this.f5858d = str3;
        this.f5859e = str4;
        this.f5860f = uri;
    }

    public String m9598a() {
        return this.f5856b;
    }

    public String m9599b() {
        return this.f5857c;
    }

    public String m9600c() {
        return this.f5858d;
    }

    public String m9601d() {
        return this.f5859e;
    }

    public int describeContents() {
        return 0;
    }

    public Uri m9602e() {
        return this.f5860f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1909a.m9603a(this, parcel, i);
    }
}
