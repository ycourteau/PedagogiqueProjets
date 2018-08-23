package com.google.android.gms.p028c;

import java.nio.ByteBuffer;
import java.security.Key;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class C1145s {
    private final C1032q f4034a;
    private final SecureRandom f4035b;

    public class C1144a extends Exception {
        final /* synthetic */ C1145s f4033a;

        public C1144a(C1145s c1145s) {
            this.f4033a = c1145s;
        }

        public C1144a(C1145s c1145s, Throwable th) {
            this.f4033a = c1145s;
            super(th);
        }
    }

    public C1145s(C1032q c1032q, SecureRandom secureRandom) {
        this.f4034a = c1032q;
        this.f4035b = secureRandom;
    }

    static void m5863a(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = (byte) (bArr[i] ^ 68);
        }
    }

    public byte[] m5864a(String str) {
        try {
            byte[] a = this.f4034a.mo813a(str, false);
            if (a.length != 32) {
                throw new C1144a(this);
            }
            byte[] bArr = new byte[16];
            ByteBuffer.wrap(a, 4, 16).get(bArr);
            C1145s.m5863a(bArr);
            return bArr;
        } catch (Throwable e) {
            throw new C1144a(this, e);
        }
    }

    public byte[] m5865a(byte[] bArr, String str) {
        if (bArr.length != 16) {
            throw new C1144a(this);
        }
        try {
            byte[] a = this.f4034a.mo813a(str, false);
            if (a.length <= 16) {
                throw new C1144a(this);
            }
            ByteBuffer allocate = ByteBuffer.allocate(a.length);
            allocate.put(a);
            allocate.flip();
            byte[] bArr2 = new byte[16];
            a = new byte[(a.length - 16)];
            allocate.get(bArr2);
            allocate.get(a);
            Key secretKeySpec = new SecretKeySpec(bArr, "AES");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(2, secretKeySpec, new IvParameterSpec(bArr2));
            return instance.doFinal(a);
        } catch (Throwable e) {
            throw new C1144a(this, e);
        } catch (Throwable e2) {
            throw new C1144a(this, e2);
        } catch (Throwable e22) {
            throw new C1144a(this, e22);
        } catch (Throwable e222) {
            throw new C1144a(this, e222);
        } catch (Throwable e2222) {
            throw new C1144a(this, e2222);
        } catch (Throwable e22222) {
            throw new C1144a(this, e22222);
        } catch (Throwable e222222) {
            throw new C1144a(this, e222222);
        }
    }
}
