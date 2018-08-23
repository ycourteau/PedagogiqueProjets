package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C1304w;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class ConnectionResult implements SafeParcelable {
    public static final Creator<ConnectionResult> CREATOR = new C1244i();
    public static final ConnectionResult f4086a = new ConnectionResult(0, null);
    final int f4087b;
    private final int f4088c;
    private final PendingIntent f4089d;

    ConnectionResult(int i, int i2, PendingIntent pendingIntent) {
        this.f4087b = i;
        this.f4088c = i2;
        this.f4089d = pendingIntent;
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(1, i, pendingIntent);
    }

    static String m5958a(int i) {
        switch (i) {
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            case 13:
                return "CANCELED";
            case 14:
                return "TIMEOUT";
            case 15:
                return "INTERRUPTED";
            case 16:
                return "API_UNAVAILABLE";
            case 17:
                return "SIGN_IN_FAILED";
            case 18:
                return "SERVICE_UPDATING";
            default:
                return "UNKNOWN_ERROR_CODE(" + i + ")";
        }
    }

    public void m5959a(Activity activity, int i) {
        if (m5960a()) {
            activity.startIntentSenderForResult(this.f4089d.getIntentSender(), i, null, 0, 0, 0);
        }
    }

    public boolean m5960a() {
        return (this.f4088c == 0 || this.f4089d == null) ? false : true;
    }

    public boolean m5961b() {
        return this.f4088c == 0;
    }

    public int m5962c() {
        return this.f4088c;
    }

    public PendingIntent m5963d() {
        return this.f4089d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f4088c == connectionResult.f4088c && C1304w.m6615a(this.f4089d, connectionResult.f4089d);
    }

    public int hashCode() {
        return C1304w.m6613a(Integer.valueOf(this.f4088c), this.f4089d);
    }

    public String toString() {
        return C1304w.m6614a((Object) this).m6612a("statusCode", m5958a(this.f4088c)).m6612a("resolution", this.f4089d).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1244i.m6298a(this, parcel, i);
    }
}
