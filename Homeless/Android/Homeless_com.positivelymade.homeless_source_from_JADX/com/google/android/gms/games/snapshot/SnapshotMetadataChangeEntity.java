package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class SnapshotMetadataChangeEntity extends C1878d implements SafeParcelable {
    public static final C1883e CREATOR = new C1883e();
    private final int f5713b;
    private final String f5714c;
    private final Long f5715d;
    private final Uri f5716e;
    private BitmapTeleporter f5717f;
    private final Long f5718g;

    SnapshotMetadataChangeEntity() {
        this(5, null, null, null, null, null);
    }

    SnapshotMetadataChangeEntity(int i, String str, Long l, BitmapTeleporter bitmapTeleporter, Uri uri, Long l2) {
        boolean z = true;
        this.f5713b = i;
        this.f5714c = str;
        this.f5715d = l;
        this.f5717f = bitmapTeleporter;
        this.f5716e = uri;
        this.f5718g = l2;
        if (this.f5717f != null) {
            if (this.f5716e != null) {
                z = false;
            }
            C1305x.m6622a(z, (Object) "Cannot set both a URI and an image");
        } else if (this.f5716e != null) {
            if (this.f5717f != null) {
                z = false;
            }
            C1305x.m6622a(z, (Object) "Cannot set both a URI and an image");
        }
    }

    SnapshotMetadataChangeEntity(String str, Long l, BitmapTeleporter bitmapTeleporter, Uri uri, Long l2) {
        this(5, str, l, bitmapTeleporter, uri, l2);
    }

    public BitmapTeleporter mo1604a() {
        return this.f5717f;
    }

    public int m9365b() {
        return this.f5713b;
    }

    public String m9366c() {
        return this.f5714c;
    }

    public Long m9367d() {
        return this.f5715d;
    }

    public int describeContents() {
        return 0;
    }

    public Long m9368e() {
        return this.f5718g;
    }

    public Uri m9369f() {
        return this.f5716e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1883e.m9413a(this, parcel, i);
    }
}
