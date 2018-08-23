package com.google.android.gms.p032d;

import android.os.Build.VERSION;
import java.io.File;

class C1618p {
    public static int m7487a() {
        try {
            return Integer.parseInt(VERSION.SDK);
        } catch (NumberFormatException e) {
            aj.m7036a("Invalid version number: " + VERSION.SDK);
            return 0;
        }
    }

    static boolean m7488a(String str) {
        if (C1618p.m7487a() < 9) {
            return false;
        }
        File file = new File(str);
        file.setReadable(false, false);
        file.setWritable(false, false);
        file.setReadable(true, true);
        file.setWritable(true, true);
        return true;
    }
}
