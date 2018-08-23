package com.google.android.gms.drive.events;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.List;
import java.util.Locale;

public final class CompletionEvent implements SafeParcelable, ResourceEvent {
    public static final Creator<CompletionEvent> CREATOR = new C1639d();
    final int f5068a;
    final DriveId f5069b;
    final String f5070c;
    final ParcelFileDescriptor f5071d;
    final ParcelFileDescriptor f5072e;
    final MetadataBundle f5073f;
    final List<String> f5074g;
    final int f5075h;
    final IBinder f5076i;
    private boolean f5077j = false;
    private boolean f5078k = false;
    private boolean f5079l = false;

    CompletionEvent(int i, DriveId driveId, String str, ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2, MetadataBundle metadataBundle, List<String> list, int i2, IBinder iBinder) {
        this.f5068a = i;
        this.f5069b = driveId;
        this.f5070c = str;
        this.f5071d = parcelFileDescriptor;
        this.f5072e = parcelFileDescriptor2;
        this.f5073f = metadataBundle;
        this.f5074g = list;
        this.f5075h = i2;
        this.f5076i = iBinder;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        String str = this.f5074g == null ? "<null>" : "'" + TextUtils.join("','", this.f5074g) + "'";
        return String.format(Locale.US, "CompletionEvent [id=%s, status=%s, trackingTag=%s]", new Object[]{this.f5069b, Integer.valueOf(this.f5075h), str});
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1639d.m7551a(this, parcel, i | 1);
    }
}
