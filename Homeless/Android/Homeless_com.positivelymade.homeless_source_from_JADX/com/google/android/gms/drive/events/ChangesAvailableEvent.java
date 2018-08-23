package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C1304w;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;

public final class ChangesAvailableEvent implements SafeParcelable, DriveEvent {
    public static final Creator<ChangesAvailableEvent> CREATOR = new C1637b();
    final int f5060a;
    final String f5061b;
    final ChangesAvailableOptions f5062c;

    ChangesAvailableEvent(int i, String str, ChangesAvailableOptions changesAvailableOptions) {
        this.f5060a = i;
        this.f5061b = str;
        this.f5062c = changesAvailableOptions;
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
        ChangesAvailableEvent changesAvailableEvent = (ChangesAvailableEvent) obj;
        return C1304w.m6615a(this.f5062c, changesAvailableEvent.f5062c) && C1304w.m6615a(this.f5061b, changesAvailableEvent.f5061b);
    }

    public int hashCode() {
        return C1304w.m6613a(this.f5062c, this.f5061b);
    }

    public String toString() {
        return String.format(Locale.US, "ChangesAvailableEvent [changesAvailableOptions=%s]", new Object[]{this.f5062c});
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1637b.m7545a(this, parcel, i);
    }
}
