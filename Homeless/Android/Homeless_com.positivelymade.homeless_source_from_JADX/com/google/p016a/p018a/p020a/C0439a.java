package com.google.p016a.p018a.p020a;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.p017d.C0435c;
import com.google.android.gms.ads.p017d.C0436e;
import com.google.p016a.p018a.C0438a;

public final class C0439a extends C0438a implements C0435c, C0436e {
    protected Bundle mo338a(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putInt("gw", 1);
        bundle.putString("mad_hac", bundle2.getString("mad_hac"));
        if (!TextUtils.isEmpty(bundle2.getString("adJson"))) {
            bundle.putString("_ad", bundle2.getString("adJson"));
        }
        bundle.putBoolean("_noRefresh", true);
        return bundle;
    }
}
