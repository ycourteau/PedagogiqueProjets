package com.positivelymade.homeless;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.C0018f;
import android.support.v4.app.C0026g;
import android.support.v4.app.C0028i;
import android.support.v4.app.C0036k;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.C0108f;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabHost.TabContentFactory;
import android.widget.TabHost.TabSpec;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.C0427a;
import com.google.android.gms.ads.C0476c.C0472a;

public class PlayActivity extends C0026g implements C0108f, OnTabChangeListener {
    public C2002a f6583n;
    public AdView f6584o;
    private ViewPager f6585p;
    private TabHost f6586q;
    private TabContentFactory f6587r = new C20001(this);

    class C20001 implements TabContentFactory {
        final /* synthetic */ PlayActivity f6581a;

        C20001(PlayActivity playActivity) {
            this.f6581a = playActivity;
        }

        public View createTabContent(String str) {
            View view = new View(this.f6581a);
            view.setMinimumHeight(0);
            view.setMinimumWidth(0);
            return view;
        }
    }

    class C20012 extends C0427a {
        final /* synthetic */ PlayActivity f6582a;

        C20012(PlayActivity playActivity) {
            this.f6582a = playActivity;
        }

        public void mo322a() {
            Log.e("PlayActivity", "Google onAdLoaded");
        }

        public void mo323a(int i) {
            Log.e("PlayActivity", "Google onAdFailedToLoad: " + this.f6582a.m9927d(i));
        }

        public void mo324b() {
            Log.e("PlayActivity", "Google onAdOpened");
        }

        public void mo325c() {
            Log.e("PlayActivity", "Google onAdClosed");
        }

        public void mo326d() {
            Log.d("PlayActivity", "Google onAdLeftApplication");
        }
    }

    private static class C2002a extends C0036k {
        public C2002a(C0028i c0028i) {
            super(c0028i);
        }

        public C0018f mo1670a(int i) {
            switch (i) {
                case 0:
                    return C2089e.m10147b(i);
                case 1:
                    return C2052a.m10075b(i);
                case 2:
                    return C2081d.m10132b(i);
                case 3:
                    return C2060b.m10093b(i);
                case 4:
                    return C2072c.m10107b(i);
                default:
                    return C2089e.m10147b(i);
            }
        }

        public int mo1671b() {
            return 5;
        }
    }

    private View m9924a(Context context, int i) {
        View inflate = View.inflate(context, R.layout.tab_layout, null);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.imageView);
        if (i == 0) {
            imageView.setImageResource(R.drawable.profile);
        } else if (i == 1) {
            imageView.setImageResource(R.drawable.business);
        } else if (i == 2) {
            imageView.setImageResource(R.drawable.possessions);
        } else if (i == 3) {
            imageView.setImageResource(R.drawable.development);
        } else if (i == 4) {
            imageView.setImageResource(R.drawable.misc);
        }
        return inflate;
    }

    private void m9926c(int i) {
        TabSpec newTabSpec = this.f6586q.newTabSpec("Tab" + i);
        if (i == 0) {
            newTabSpec.setIndicator(m9924a(getApplicationContext(), i));
        } else if (i == 1) {
            newTabSpec.setIndicator(m9924a(getApplicationContext(), i));
        } else if (i == 2) {
            newTabSpec.setIndicator(m9924a(getApplicationContext(), i));
        } else if (i == 3) {
            newTabSpec.setIndicator(m9924a(getApplicationContext(), i));
        } else if (i == 4) {
            newTabSpec.setIndicator(m9924a(getApplicationContext(), i));
        }
        newTabSpec.setContent(this.f6587r);
        this.f6586q.addTab(newTabSpec);
    }

    private String m9927d(int i) {
        String str = "";
        switch (i) {
            case 0:
                return "Internal error";
            case 1:
                return "Invalid request";
            case 2:
                return "Network Error";
            case 3:
                return "No fill";
            default:
                return str;
        }
    }

    public void mo1672a(int i) {
        this.f6586q.setCurrentTab(i);
    }

    public void mo1673a(int i, float f, int i2) {
    }

    public void mo1674b(int i) {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.e("PlayActivity", "onCreate");
        setContentView(R.layout.activity_play);
        this.f6585p = (ViewPager) findViewById(R.id.viewPager);
        this.f6585p.setOnPageChangeListener(this);
        this.f6583n = new C2002a(m187f());
        this.f6585p.setAdapter(this.f6583n);
        this.f6586q = (TabHost) findViewById(16908306);
        this.f6586q.setup();
        this.f6586q.setOnTabChangedListener(this);
        for (int i = 0; i < this.f6583n.mo1671b(); i++) {
            m9926c(i);
        }
        this.f6584o = (AdView) findViewById(R.id.adView);
        this.f6584o.setAdListener(new C20012(this));
        this.f6584o.m2048a(new C0472a().m2094a());
    }

    public void onDestroy() {
        super.onDestroy();
        Log.e("PlayActivity", "onDestroy");
        if (this.f6584o != null) {
            this.f6584o.m2047a();
        }
    }

    protected void onPause() {
        super.onPause();
        Log.e("PlayActivity", "onPause");
        if (this.f6584o != null) {
            this.f6584o.m2049b();
        }
    }

    protected void onResume() {
        super.onResume();
        Log.e("PlayActivity", "onResume");
        if (this.f6584o != null) {
            this.f6584o.m2050c();
        }
    }

    public void onTabChanged(String str) {
        int i = -1;
        if (str.endsWith("0")) {
            i = 0;
        } else if (str.endsWith("1")) {
            i = 1;
        } else if (str.endsWith("2")) {
            i = 2;
        } else if (str.endsWith("3")) {
            i = 3;
        } else if (str.endsWith("4")) {
            i = 4;
        }
        this.f6585p.setCurrentItem(i);
    }
}
