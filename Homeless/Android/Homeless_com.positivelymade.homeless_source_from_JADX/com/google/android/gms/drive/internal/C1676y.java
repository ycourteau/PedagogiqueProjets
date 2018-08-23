package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.ChangesAvailableEvent;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.drive.events.ProgressEvent;
import com.google.android.gms.drive.events.QueryResultEventParcelable;

public class C1676y implements Creator<OnEventResponse> {
    static void m7866a(OnEventResponse onEventResponse, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, onEventResponse.f5198a);
        C1295b.m6496a(parcel, 2, onEventResponse.f5199b);
        C1295b.m6501a(parcel, 3, onEventResponse.f5200c, i, false);
        C1295b.m6501a(parcel, 5, onEventResponse.f5201d, i, false);
        C1295b.m6501a(parcel, 6, onEventResponse.f5202e, i, false);
        C1295b.m6501a(parcel, 7, onEventResponse.f5203f, i, false);
        C1295b.m6501a(parcel, 8, onEventResponse.f5204g, i, false);
        C1295b.m6494a(parcel, a);
    }

    public OnEventResponse m7867a(Parcel parcel) {
        int i = 0;
        ProgressEvent progressEvent = null;
        int b = C1294a.m6465b(parcel);
        ChangesAvailableEvent changesAvailableEvent = null;
        QueryResultEventParcelable queryResultEventParcelable = null;
        CompletionEvent completionEvent = null;
        ChangeEvent changeEvent = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i2 = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 3:
                    changeEvent = (ChangeEvent) C1294a.m6462a(parcel, a, ChangeEvent.CREATOR);
                    break;
                case 5:
                    completionEvent = (CompletionEvent) C1294a.m6462a(parcel, a, CompletionEvent.CREATOR);
                    break;
                case 6:
                    queryResultEventParcelable = (QueryResultEventParcelable) C1294a.m6462a(parcel, a, QueryResultEventParcelable.CREATOR);
                    break;
                case 7:
                    changesAvailableEvent = (ChangesAvailableEvent) C1294a.m6462a(parcel, a, ChangesAvailableEvent.CREATOR);
                    break;
                case 8:
                    progressEvent = (ProgressEvent) C1294a.m6462a(parcel, a, ProgressEvent.CREATOR);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new OnEventResponse(i2, i, changeEvent, completionEvent, queryResultEventParcelable, changesAvailableEvent, progressEvent);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public OnEventResponse[] m7868a(int i) {
        return new OnEventResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7867a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7868a(i);
    }
}
