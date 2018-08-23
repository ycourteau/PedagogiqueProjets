package com.google.android.gms.p028c;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.UUID;

public abstract class C1126l implements C0572k {
    protected MotionEvent f3927a;
    protected DisplayMetrics f3928b;
    protected C1032q f3929c;
    private C1143r f3930d;

    protected C1126l(Context context, C1032q c1032q, C1143r c1143r) {
        this.f3929c = c1032q;
        this.f3930d = c1143r;
        try {
            this.f3928b = context.getResources().getDisplayMetrics();
        } catch (UnsupportedOperationException e) {
            this.f3928b = new DisplayMetrics();
            this.f3928b.density = 1.0f;
        }
    }

    private String m5659a(Context context, String str, boolean z) {
        try {
            byte[] b;
            synchronized (this) {
                m5660a();
                if (z) {
                    mo846c(context);
                } else {
                    mo845b(context);
                }
                b = m5661b();
            }
            return b.length == 0 ? Integer.toString(5) : m5665a(b, str);
        } catch (NoSuchAlgorithmException e) {
            return Integer.toString(7);
        } catch (UnsupportedEncodingException e2) {
            return Integer.toString(7);
        } catch (IOException e3) {
            return Integer.toString(3);
        }
    }

    private void m5660a() {
        this.f3930d.mo847a();
    }

    private byte[] m5661b() {
        return this.f3930d.mo850b();
    }

    public String mo438a(Context context) {
        return m5659a(context, null, false);
    }

    public String mo439a(Context context, String str) {
        return m5659a(context, str, true);
    }

    protected String m5664a(String str) {
        if (str == null || !str.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            return str;
        }
        UUID fromString = UUID.fromString(str);
        byte[] bArr = new byte[16];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(fromString.getMostSignificantBits());
        wrap.putLong(fromString.getLeastSignificantBits());
        return this.f3929c.mo812a(bArr, true);
    }

    String m5665a(byte[] bArr, String str) {
        byte[] bArr2;
        if (bArr.length > 239) {
            m5660a();
            m5667a(20, 1);
            bArr = m5661b();
        }
        if (bArr.length < 239) {
            bArr2 = new byte[(239 - bArr.length)];
            new SecureRandom().nextBytes(bArr2);
            bArr2 = ByteBuffer.allocate(240).put((byte) bArr.length).put(bArr).put(bArr2).array();
        } else {
            bArr2 = ByteBuffer.allocate(240).put((byte) bArr.length).put(bArr).array();
        }
        MessageDigest instance = MessageDigest.getInstance("MD5");
        instance.update(bArr2);
        bArr2 = ByteBuffer.allocate(256).put(instance.digest()).put(bArr2).array();
        byte[] bArr3 = new byte[256];
        new C1082j().m5346a(bArr2, bArr3);
        if (str != null && str.length() > 0) {
            m5670a(str, bArr3);
        }
        return this.f3929c.mo812a(bArr3, true);
    }

    public void mo440a(int i, int i2, int i3) {
        if (this.f3927a != null) {
            this.f3927a.recycle();
        }
        this.f3927a = MotionEvent.obtain(0, (long) i3, 1, ((float) i) * this.f3928b.density, ((float) i2) * this.f3928b.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
    }

    protected void m5667a(int i, long j) {
        this.f3930d.mo848a(i, j);
    }

    protected void m5668a(int i, String str) {
        this.f3930d.mo849a(i, str);
    }

    public void mo441a(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.f3927a != null) {
                this.f3927a.recycle();
            }
            this.f3927a = MotionEvent.obtain(motionEvent);
        }
    }

    void m5670a(String str, byte[] bArr) {
        if (str.length() > 32) {
            str = str.substring(0, 32);
        }
        new ld(str.getBytes("UTF-8")).m5677a(bArr);
    }

    protected abstract void mo845b(Context context);

    protected abstract void mo846c(Context context);
}
