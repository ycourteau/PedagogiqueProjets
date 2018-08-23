package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.ChangesAvailableEvent;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.drive.events.ProgressEvent;
import com.google.android.gms.drive.events.QueryResultEventParcelable;

public class OnEventResponse implements SafeParcelable {
    public static final Creator<OnEventResponse> CREATOR = new C1676y();
    final int f5198a;
    final int f5199b;
    final ChangeEvent f5200c;
    final CompletionEvent f5201d;
    final QueryResultEventParcelable f5202e;
    final ChangesAvailableEvent f5203f;
    final ProgressEvent f5204g;

    OnEventResponse(int i, int i2, ChangeEvent changeEvent, CompletionEvent completionEvent, QueryResultEventParcelable queryResultEventParcelable, ChangesAvailableEvent changesAvailableEvent, ProgressEvent progressEvent) {
        this.f5198a = i;
        this.f5199b = i2;
        this.f5200c = changeEvent;
        this.f5201d = completionEvent;
        this.f5202e = queryResultEventParcelable;
        this.f5203f = changesAvailableEvent;
        this.f5204g = progressEvent;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1676y.m7866a(this, parcel, i);
    }
}
