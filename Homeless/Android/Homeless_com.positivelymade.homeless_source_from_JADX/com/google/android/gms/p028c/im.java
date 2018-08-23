package com.google.android.gms.p028c;

import android.content.res.Configuration;
import android.content.res.Resources;

public final class im {
    public static boolean m5272a(Resources resources) {
        if (resources == null) {
            return false;
        }
        return (is.m5284a() && ((resources.getConfiguration().screenLayout & 15) > 3)) || im.m5273b(resources);
    }

    private static boolean m5273b(Resources resources) {
        Configuration configuration = resources.getConfiguration();
        return is.m5287c() && (configuration.screenLayout & 15) <= 3 && configuration.smallestScreenWidthDp >= 600;
    }
}
