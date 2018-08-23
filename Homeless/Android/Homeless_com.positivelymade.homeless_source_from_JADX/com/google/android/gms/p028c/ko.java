package com.google.android.gms.p028c;

import com.google.android.gms.p028c.kr.C1117c;
import com.google.android.gms.p028c.kr.C1121g;
import com.google.android.gms.p032d.aj;
import org.json.JSONException;

public final class ko {
    public static kn f3860a = new C11111();

    static class C11111 implements kn {
        C11111() {
        }

        public Object mo837a(byte[] bArr) {
            if (bArr == null) {
                throw new C1121g("Cannot parse a null byte[]");
            } else if (bArr.length == 0) {
                throw new C1121g("Cannot parse a 0 length byte[]");
            } else {
                try {
                    C1117c a = kl.m5551a(new String(bArr));
                    if (a != null) {
                        aj.m7041d("The container was successfully parsed from the resource");
                    }
                    return a;
                } catch (JSONException e) {
                    throw new C1121g("The resource data is corrupted. The container cannot be extracted from the binary data");
                } catch (C1121g e2) {
                    throw new C1121g("The resource data is invalid. The container cannot be extracted from the binary data");
                }
            }
        }
    }
}
