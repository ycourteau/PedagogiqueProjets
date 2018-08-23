package com.google.android.gms.p032d;

class bf {
    private static bf f4698a;
    private volatile C1559a f4699b;
    private volatile String f4700c;
    private volatile String f4701d;
    private volatile String f4702e;

    enum C1559a {
        NONE,
        CONTAINER,
        CONTAINER_DEBUG
    }

    bf() {
        m7154e();
    }

    static bf m7150a() {
        bf bfVar;
        synchronized (bf.class) {
            if (f4698a == null) {
                f4698a = new bf();
            }
            bfVar = f4698a;
        }
        return bfVar;
    }

    C1559a m7151b() {
        return this.f4699b;
    }

    String m7152c() {
        return this.f4701d;
    }

    String m7153d() {
        return this.f4700c;
    }

    void m7154e() {
        this.f4699b = C1559a.NONE;
        this.f4701d = null;
        this.f4700c = null;
        this.f4702e = null;
    }
}
