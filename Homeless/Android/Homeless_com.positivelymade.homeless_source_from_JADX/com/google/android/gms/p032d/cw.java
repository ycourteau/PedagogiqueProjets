package com.google.android.gms.p032d;

import android.os.Build.VERSION;

class cw<K, V> {
    final C1566a<K, V> f4881a = new C15911(this);

    public interface C1566a<K, V> {
        int mo1017a(K k, V v);
    }

    class C15911 implements C1566a<K, V> {
        final /* synthetic */ cw f4880a;

        C15911(cw cwVar) {
            this.f4880a = cwVar;
        }

        public int mo1017a(K k, V v) {
            return 1;
        }
    }

    int m7386a() {
        return VERSION.SDK_INT;
    }

    public cv<K, V> m7387a(int i, C1566a<K, V> c1566a) {
        if (i > 0) {
            return m7386a() < 12 ? new bz(i, c1566a) : new ae(i, c1566a);
        } else {
            throw new IllegalArgumentException("maxSize <= 0");
        }
    }
}
