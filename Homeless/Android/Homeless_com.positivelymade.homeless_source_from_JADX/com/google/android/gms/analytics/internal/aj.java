package com.google.android.gms.analytics.internal;

import android.os.Build.VERSION;
import java.io.File;

public class aj {
    public static int m3331a() {
        try {
            return Integer.parseInt(VERSION.SDK);
        } catch (NumberFormatException e) {
            C0732f.m3385a("Invalid version number", VERSION.SDK);
            return 0;
        }
    }

    public static boolean m3332a(String str) {
        if (m3331a() < 9) {
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
