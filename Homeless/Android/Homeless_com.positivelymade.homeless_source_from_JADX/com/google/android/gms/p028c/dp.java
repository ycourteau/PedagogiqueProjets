package com.google.android.gms.p028c;

import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.ads.p017d.C0422g;
import com.google.android.gms.ads.p017d.C0435c;
import com.google.android.gms.ads.p017d.C0436e;
import com.google.android.gms.ads.p017d.C0437k;
import com.google.android.gms.ads.p017d.C0479d;
import com.google.android.gms.ads.p017d.C0480f;
import com.google.android.gms.ads.p017d.C0482l;
import com.google.android.gms.common.internal.C1305x;

@fn
public final class dp implements C0479d, C0480f, C0482l {
    private final dk f2774a;
    private C0422g f2775b;

    public dp(dk dkVar) {
        this.f2774a = dkVar;
    }

    public C0422g m4348a() {
        return this.f2775b;
    }

    public void mo692a(C0435c c0435c) {
        C1305x.m6624b("onAdLoaded must be called on the main UI thread.");
        C0691b.m3093a("Adapter called onAdLoaded.");
        try {
            this.f2774a.mo640e();
        } catch (Throwable e) {
            C0691b.m3102d("Could not call onAdLoaded.", e);
        }
    }

    public void mo693a(C0435c c0435c, int i) {
        C1305x.m6624b("onAdFailedToLoad must be called on the main UI thread.");
        C0691b.m3093a("Adapter called onAdFailedToLoad with error. " + i);
        try {
            this.f2774a.mo636a(i);
        } catch (Throwable e) {
            C0691b.m3102d("Could not call onAdFailedToLoad.", e);
        }
    }

    public void mo694a(C0436e c0436e) {
        C1305x.m6624b("onAdLoaded must be called on the main UI thread.");
        C0691b.m3093a("Adapter called onAdLoaded.");
        try {
            this.f2774a.mo640e();
        } catch (Throwable e) {
            C0691b.m3102d("Could not call onAdLoaded.", e);
        }
    }

    public void mo695a(C0436e c0436e, int i) {
        C1305x.m6624b("onAdFailedToLoad must be called on the main UI thread.");
        C0691b.m3093a("Adapter called onAdFailedToLoad with error " + i + ".");
        try {
            this.f2774a.mo636a(i);
        } catch (Throwable e) {
            C0691b.m3102d("Could not call onAdFailedToLoad.", e);
        }
    }

    public void mo696a(C0437k c0437k) {
        C1305x.m6624b("onAdOpened must be called on the main UI thread.");
        C0691b.m3093a("Adapter called onAdOpened.");
        try {
            this.f2774a.mo639d();
        } catch (Throwable e) {
            C0691b.m3102d("Could not call onAdOpened.", e);
        }
    }

    public void mo697a(C0437k c0437k, int i) {
        C1305x.m6624b("onAdFailedToLoad must be called on the main UI thread.");
        C0691b.m3093a("Adapter called onAdFailedToLoad with error " + i + ".");
        try {
            this.f2774a.mo636a(i);
        } catch (Throwable e) {
            C0691b.m3102d("Could not call onAdFailedToLoad.", e);
        }
    }

    public void mo698a(C0437k c0437k, C0422g c0422g) {
        C1305x.m6624b("onAdLoaded must be called on the main UI thread.");
        C0691b.m3093a("Adapter called onAdLoaded.");
        this.f2775b = c0422g;
        try {
            this.f2774a.mo640e();
        } catch (Throwable e) {
            C0691b.m3102d("Could not call onAdLoaded.", e);
        }
    }

    public void mo699b(C0435c c0435c) {
        C1305x.m6624b("onAdOpened must be called on the main UI thread.");
        C0691b.m3093a("Adapter called onAdOpened.");
        try {
            this.f2774a.mo639d();
        } catch (Throwable e) {
            C0691b.m3102d("Could not call onAdOpened.", e);
        }
    }

    public void mo700b(C0436e c0436e) {
        C1305x.m6624b("onAdOpened must be called on the main UI thread.");
        C0691b.m3093a("Adapter called onAdOpened.");
        try {
            this.f2774a.mo639d();
        } catch (Throwable e) {
            C0691b.m3102d("Could not call onAdOpened.", e);
        }
    }

    public void mo701b(C0437k c0437k) {
        C1305x.m6624b("onAdClosed must be called on the main UI thread.");
        C0691b.m3093a("Adapter called onAdClosed.");
        try {
            this.f2774a.mo637b();
        } catch (Throwable e) {
            C0691b.m3102d("Could not call onAdClosed.", e);
        }
    }

    public void mo702c(C0435c c0435c) {
        C1305x.m6624b("onAdClosed must be called on the main UI thread.");
        C0691b.m3093a("Adapter called onAdClosed.");
        try {
            this.f2774a.mo637b();
        } catch (Throwable e) {
            C0691b.m3102d("Could not call onAdClosed.", e);
        }
    }

    public void mo703c(C0436e c0436e) {
        C1305x.m6624b("onAdClosed must be called on the main UI thread.");
        C0691b.m3093a("Adapter called onAdClosed.");
        try {
            this.f2774a.mo637b();
        } catch (Throwable e) {
            C0691b.m3102d("Could not call onAdClosed.", e);
        }
    }

    public void mo704c(C0437k c0437k) {
        C1305x.m6624b("onAdLeftApplication must be called on the main UI thread.");
        C0691b.m3093a("Adapter called onAdLeftApplication.");
        try {
            this.f2774a.mo638c();
        } catch (Throwable e) {
            C0691b.m3102d("Could not call onAdLeftApplication.", e);
        }
    }

    public void mo705d(C0435c c0435c) {
        C1305x.m6624b("onAdLeftApplication must be called on the main UI thread.");
        C0691b.m3093a("Adapter called onAdLeftApplication.");
        try {
            this.f2774a.mo638c();
        } catch (Throwable e) {
            C0691b.m3102d("Could not call onAdLeftApplication.", e);
        }
    }

    public void mo706d(C0436e c0436e) {
        C1305x.m6624b("onAdLeftApplication must be called on the main UI thread.");
        C0691b.m3093a("Adapter called onAdLeftApplication.");
        try {
            this.f2774a.mo638c();
        } catch (Throwable e) {
            C0691b.m3102d("Could not call onAdLeftApplication.", e);
        }
    }

    public void mo707d(C0437k c0437k) {
        C1305x.m6624b("onAdClicked must be called on the main UI thread.");
        C0691b.m3093a("Adapter called onAdClicked.");
        try {
            this.f2774a.mo635a();
        } catch (Throwable e) {
            C0691b.m3102d("Could not call onAdClicked.", e);
        }
    }

    public void mo708e(C0435c c0435c) {
        C1305x.m6624b("onAdClicked must be called on the main UI thread.");
        C0691b.m3093a("Adapter called onAdClicked.");
        try {
            this.f2774a.mo635a();
        } catch (Throwable e) {
            C0691b.m3102d("Could not call onAdClicked.", e);
        }
    }

    public void mo709e(C0436e c0436e) {
        C1305x.m6624b("onAdClicked must be called on the main UI thread.");
        C0691b.m3093a("Adapter called onAdClicked.");
        try {
            this.f2774a.mo635a();
        } catch (Throwable e) {
            C0691b.m3102d("Could not call onAdClicked.", e);
        }
    }
}
