package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;

public final class DataHolder implements SafeParcelable {
    public static final C1240f CREATOR = new C1240f();
    private static final C1233a f4262l = new C1233a(new String[0], null) {
    };
    Bundle f4263a;
    int[] f4264b;
    int f4265c;
    boolean f4266d = false;
    private final int f4267e;
    private final String[] f4268f;
    private final CursorWindow[] f4269g;
    private final int f4270h;
    private final Bundle f4271i;
    private Object f4272j;
    private boolean f4273k = true;

    public static class C1233a {
        private final String[] f4256a;
        private final ArrayList<HashMap<String, Object>> f4257b;
        private final String f4258c;
        private final HashMap<Object, Integer> f4259d;
        private boolean f4260e;
        private String f4261f;

        private C1233a(String[] strArr, String str) {
            this.f4256a = (String[]) C1305x.m6617a((Object) strArr);
            this.f4257b = new ArrayList();
            this.f4258c = str;
            this.f4259d = new HashMap();
            this.f4260e = false;
            this.f4261f = null;
        }
    }

    DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.f4267e = i;
        this.f4268f = strArr;
        this.f4269g = cursorWindowArr;
        this.f4270h = i2;
        this.f4271i = bundle;
    }

    private void m6232a(String str, int i) {
        if (this.f4263a == null || !this.f4263a.containsKey(str)) {
            throw new IllegalArgumentException("No such column: " + str);
        } else if (m6250h()) {
            throw new IllegalArgumentException("Buffer is closed.");
        } else if (i < 0 || i >= this.f4265c) {
            throw new CursorIndexOutOfBoundsException(i, this.f4265c);
        }
    }

    public int m6233a(int i) {
        int i2 = 0;
        boolean z = i >= 0 && i < this.f4265c;
        C1305x.m6621a(z);
        while (i2 < this.f4264b.length) {
            if (i < this.f4264b[i2]) {
                i2--;
                break;
            }
            i2++;
        }
        return i2 == this.f4264b.length ? i2 - 1 : i2;
    }

    public long m6234a(String str, int i, int i2) {
        m6232a(str, i);
        return this.f4269g[i2].getLong(i, this.f4263a.getInt(str));
    }

    public void m6235a() {
        int i;
        int i2 = 0;
        this.f4263a = new Bundle();
        for (i = 0; i < this.f4268f.length; i++) {
            this.f4263a.putInt(this.f4268f[i], i);
        }
        this.f4264b = new int[this.f4269g.length];
        i = 0;
        while (i2 < this.f4269g.length) {
            this.f4264b[i2] = i;
            i += this.f4269g[i2].getNumRows() - (i - this.f4269g[i2].getStartPosition());
            i2++;
        }
        this.f4265c = i;
    }

    public void m6236a(Object obj) {
        this.f4272j = obj;
    }

    public boolean m6237a(String str) {
        return this.f4263a.containsKey(str);
    }

    int m6238b() {
        return this.f4267e;
    }

    public int m6239b(String str, int i, int i2) {
        m6232a(str, i);
        return this.f4269g[i2].getInt(i, this.f4263a.getInt(str));
    }

    public String m6240c(String str, int i, int i2) {
        m6232a(str, i);
        return this.f4269g[i2].getString(i, this.f4263a.getInt(str));
    }

    String[] m6241c() {
        return this.f4268f;
    }

    public boolean m6242d(String str, int i, int i2) {
        m6232a(str, i);
        return Long.valueOf(this.f4269g[i2].getLong(i, this.f4263a.getInt(str))).longValue() == 1;
    }

    CursorWindow[] m6243d() {
        return this.f4269g;
    }

    public int describeContents() {
        return 0;
    }

    public float m6244e(String str, int i, int i2) {
        m6232a(str, i);
        return this.f4269g[i2].getFloat(i, this.f4263a.getInt(str));
    }

    public int m6245e() {
        return this.f4270h;
    }

    public Uri m6246f(String str, int i, int i2) {
        String c = m6240c(str, i, i2);
        return c == null ? null : Uri.parse(c);
    }

    public Bundle m6247f() {
        return this.f4271i;
    }

    protected void finalize() {
        try {
            if (this.f4273k && this.f4269g.length > 0 && !m6250h()) {
                Log.e("DataBuffer", "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (" + (this.f4272j == null ? "internal object: " + toString() : this.f4272j.toString()) + ")");
                m6251i();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
        }
    }

    public int m6248g() {
        return this.f4265c;
    }

    public boolean m6249g(String str, int i, int i2) {
        m6232a(str, i);
        return this.f4269g[i2].isNull(i, this.f4263a.getInt(str));
    }

    public boolean m6250h() {
        boolean z;
        synchronized (this) {
            z = this.f4266d;
        }
        return z;
    }

    public void m6251i() {
        synchronized (this) {
            if (!this.f4266d) {
                this.f4266d = true;
                for (CursorWindow close : this.f4269g) {
                    close.close();
                }
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1240f.m6268a(this, parcel, i);
    }
}
