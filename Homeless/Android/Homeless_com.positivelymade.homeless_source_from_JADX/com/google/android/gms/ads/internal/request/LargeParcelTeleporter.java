package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.ParcelFileDescriptor.AutoCloseOutputStream;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.C0618p;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.p028c.io;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;

public final class LargeParcelTeleporter implements SafeParcelable {
    public static final Creator<LargeParcelTeleporter> CREATOR = new C0667l();
    final int f1896a;
    ParcelFileDescriptor f1897b;
    private Parcelable f1898c;
    private boolean f1899d;

    LargeParcelTeleporter(int i, ParcelFileDescriptor parcelFileDescriptor) {
        this.f1896a = i;
        this.f1897b = parcelFileDescriptor;
        this.f1898c = null;
        this.f1899d = true;
    }

    public LargeParcelTeleporter(SafeParcelable safeParcelable) {
        this.f1896a = 1;
        this.f1897b = null;
        this.f1898c = safeParcelable;
        this.f1899d = false;
    }

    protected <T> ParcelFileDescriptor m2907a(final byte[] bArr) {
        try {
            ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
            final OutputStream autoCloseOutputStream = new AutoCloseOutputStream(createPipe[1]);
            new Thread(new Runnable(this) {
                final /* synthetic */ LargeParcelTeleporter f1895c;

                public void run() {
                    Closeable dataOutputStream = new DataOutputStream(autoCloseOutputStream);
                    try {
                        dataOutputStream.writeInt(bArr.length);
                        dataOutputStream.write(bArr);
                    } catch (Throwable e) {
                        C0691b.m3098b("Error transporting the ad response", e);
                        C0618p.m2799h().m4781a(e, true);
                    } finally {
                        io.m5278a(dataOutputStream);
                    }
                }
            }).start();
            return createPipe[0];
        } catch (Throwable e) {
            C0691b.m3098b("Error transporting the ad response", e);
            C0618p.m2799h().m4781a(e, true);
            return null;
        }
    }

    public <T extends SafeParcelable> T m2908a(Creator<T> creator) {
        if (this.f1899d) {
            if (this.f1897b == null) {
                C0691b.m3097b("File descriptor is empty, returning null.");
                return null;
            }
            Closeable dataInputStream = new DataInputStream(new AutoCloseInputStream(this.f1897b));
            try {
                byte[] bArr = new byte[dataInputStream.readInt()];
                dataInputStream.readFully(bArr, 0, bArr.length);
                io.m5278a(dataInputStream);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.unmarshall(bArr, 0, bArr.length);
                    obtain.setDataPosition(0);
                    this.f1898c = (SafeParcelable) creator.createFromParcel(obtain);
                    this.f1899d = false;
                } finally {
                    obtain.recycle();
                }
            } catch (Throwable e) {
                throw new IllegalStateException("Could not read from parcel file descriptor", e);
            } catch (Throwable th) {
                io.m5278a(dataInputStream);
            }
        }
        return (SafeParcelable) this.f1898c;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (this.f1897b == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.f1898c.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                this.f1897b = m2907a(marshall);
            } finally {
                obtain.recycle();
            }
        }
        C0667l.m3020a(this, parcel, i);
    }
}
