package com.google.android.gms.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1909a implements Creator<GoogleSignInAccount> {
    static void m9603a(GoogleSignInAccount googleSignInAccount, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, googleSignInAccount.f5855a);
        C1295b.m6505a(parcel, 2, googleSignInAccount.m9598a(), false);
        C1295b.m6505a(parcel, 3, googleSignInAccount.m9599b(), false);
        C1295b.m6505a(parcel, 4, googleSignInAccount.m9600c(), false);
        C1295b.m6505a(parcel, 5, googleSignInAccount.m9601d(), false);
        C1295b.m6501a(parcel, 6, googleSignInAccount.m9602e(), i, false);
        C1295b.m6494a(parcel, a);
    }

    public GoogleSignInAccount m9604a(Parcel parcel) {
        Uri uri = null;
        int b = C1294a.m6465b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    str4 = C1294a.m6479m(parcel, a);
                    break;
                case 3:
                    str3 = C1294a.m6479m(parcel, a);
                    break;
                case 4:
                    str2 = C1294a.m6479m(parcel, a);
                    break;
                case 5:
                    str = C1294a.m6479m(parcel, a);
                    break;
                case 6:
                    uri = (Uri) C1294a.m6462a(parcel, a, Uri.CREATOR);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GoogleSignInAccount(i, str4, str3, str2, str, uri);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public GoogleSignInAccount[] m9605a(int i) {
        return new GoogleSignInAccount[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m9604a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m9605a(i);
    }
}
