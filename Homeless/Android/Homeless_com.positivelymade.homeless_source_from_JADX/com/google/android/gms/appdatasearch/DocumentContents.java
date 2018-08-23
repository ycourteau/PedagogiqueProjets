package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class DocumentContents implements SafeParcelable {
    public static final C0789b CREATOR = new C0789b();
    final int f2265a;
    final DocumentSection[] f2266b;
    public final String f2267c;
    public final boolean f2268d;
    public final Account f2269e;

    DocumentContents(int i, DocumentSection[] documentSectionArr, String str, boolean z, Account account) {
        this.f2265a = i;
        this.f2266b = documentSectionArr;
        this.f2267c = str;
        this.f2268d = z;
        this.f2269e = account;
    }

    public DocumentSection m3662a(String str) {
        C1305x.m6619a(str);
        if (this.f2266b == null) {
            return null;
        }
        for (DocumentSection documentSection : this.f2266b) {
            if (str.equals(documentSection.m3664a().f2324b)) {
                return documentSection;
            }
        }
        return null;
    }

    public String m3663a() {
        DocumentSection a = m3662a("web_url");
        return a != null ? a.f2277c : null;
    }

    public int describeContents() {
        C0789b c0789b = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0789b c0789b = CREATOR;
        C0789b.m3727a(this, parcel, i);
    }
}
