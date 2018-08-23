package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.internal.C1853d;
import com.google.android.gms.p028c.io;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;

public final class SnapshotContentsEntity implements SafeParcelable, SnapshotContents {
    public static final C1879a CREATOR = new C1879a();
    private static final Object f5706a = new Object();
    private final int f5707b;
    private Contents f5708c;

    SnapshotContentsEntity(int i, Contents contents) {
        this.f5707b = i;
        this.f5708c = contents;
    }

    public SnapshotContentsEntity(Contents contents) {
        this(1, contents);
    }

    private boolean m9336a(int i, byte[] bArr, int i2, int i3, boolean z) {
        C1305x.m6622a(!mo1600c(), (Object) "Must provide a previously opened SnapshotContents");
        synchronized (f5706a) {
            OutputStream fileOutputStream = new FileOutputStream(this.f5708c.m7512a().getFileDescriptor());
            OutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            try {
                FileChannel channel = fileOutputStream.getChannel();
                channel.position((long) i);
                bufferedOutputStream.write(bArr, i2, i3);
                if (z) {
                    channel.truncate((long) bArr.length);
                }
                bufferedOutputStream.flush();
            } catch (Throwable e) {
                C1853d.m8648a("SnapshotContentsEntity", "Failed to write snapshot data", e);
                return false;
            }
        }
        return true;
    }

    public Contents mo1597a() {
        return this.f5708c;
    }

    public boolean mo1598a(byte[] bArr) {
        return m9336a(0, bArr, 0, bArr.length, true);
    }

    public void mo1599b() {
        this.f5708c = null;
    }

    public boolean mo1600c() {
        return this.f5708c == null;
    }

    public byte[] mo1601d() {
        byte[] a;
        boolean z = false;
        if (!mo1600c()) {
            z = true;
        }
        C1305x.m6622a(z, (Object) "Must provide a previously opened Snapshot");
        synchronized (f5706a) {
            InputStream fileInputStream = new FileInputStream(this.f5708c.m7512a().getFileDescriptor());
            InputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            try {
                fileInputStream.getChannel().position(0);
                a = io.m5280a(bufferedInputStream, false);
                fileInputStream.getChannel().position(0);
            } catch (Throwable e) {
                C1853d.m8650b("SnapshotContentsEntity", "Failed to read snapshot data", e);
                throw e;
            }
        }
        return a;
    }

    public int describeContents() {
        return 0;
    }

    public int m9342e() {
        return this.f5707b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1879a.m9401a(this, parcel, i);
    }
}
