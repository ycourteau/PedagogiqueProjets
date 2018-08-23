package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ParcelableCollaborator implements SafeParcelable {
    public static final Creator<ParcelableCollaborator> CREATOR = new C1758q();
    final int f5353a;
    final boolean f5354b;
    final boolean f5355c;
    final String f5356d;
    final String f5357e;
    final String f5358f;
    final String f5359g;
    final String f5360h;

    ParcelableCollaborator(int i, boolean z, boolean z2, String str, String str2, String str3, String str4, String str5) {
        this.f5353a = i;
        this.f5354b = z;
        this.f5355c = z2;
        this.f5356d = str;
        this.f5357e = str2;
        this.f5358f = str3;
        this.f5359g = str4;
        this.f5360h = str5;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParcelableCollaborator)) {
            return false;
        }
        return this.f5356d.equals(((ParcelableCollaborator) obj).f5356d);
    }

    public int hashCode() {
        return this.f5356d.hashCode();
    }

    public String toString() {
        return "Collaborator [isMe=" + this.f5354b + ", isAnonymous=" + this.f5355c + ", sessionId=" + this.f5356d + ", userId=" + this.f5357e + ", displayName=" + this.f5358f + ", color=" + this.f5359g + ", photoUrl=" + this.f5360h + "]";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1758q.m8180a(this, parcel, i);
    }
}
