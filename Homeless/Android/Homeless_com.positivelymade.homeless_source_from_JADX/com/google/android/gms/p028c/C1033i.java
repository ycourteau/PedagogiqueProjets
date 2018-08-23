package com.google.android.gms.p028c;

import android.util.Base64;

class C1033i implements C1032q {
    C1033i() {
    }

    public String mo812a(byte[] bArr, boolean z) {
        return Base64.encodeToString(bArr, z ? 11 : 2);
    }

    public byte[] mo813a(String str, boolean z) {
        return Base64.decode(str, z ? 11 : 2);
    }
}
