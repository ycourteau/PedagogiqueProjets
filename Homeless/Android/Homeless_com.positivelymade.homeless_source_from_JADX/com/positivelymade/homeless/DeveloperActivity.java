package com.positivelymade.homeless;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Typeface;
import android.media.AudioManager;
import android.media.SoundPool;
import android.media.SoundPool.OnLoadCompleteListener;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.C0427a;
import com.google.android.gms.ads.C0476c.C0472a;

public class DeveloperActivity extends Activity {
    public Typeface f6134a;
    public Typeface f6135b;
    public AdView f6136c;
    public Button f6137d;
    public TextView f6138e;
    public TextView f6139f;
    public TextView f6140g;
    public TextView f6141h;
    public TextView f6142i;
    public String f6143j;
    public boolean f6144k;
    public AudioManager f6145l;
    public SoundPool f6146m;
    public int f6147n;
    public float f6148o;
    public boolean f6149p;

    class C19601 extends C0427a {
        final /* synthetic */ DeveloperActivity f6132a;

        C19601(DeveloperActivity developerActivity) {
            this.f6132a = developerActivity;
        }

        public void mo322a() {
            Log.e("DeveloperActivity", "Google onAdLoaded");
        }

        public void mo323a(int i) {
            Log.e("DeveloperActivity", "Google onAdFailedToLoad: " + this.f6132a.m9768a(i));
        }

        public void mo324b() {
            Log.e("DeveloperActivity", "Google onAdOpened");
        }

        public void mo325c() {
            Log.e("DeveloperActivity", "Google onAdClosed");
        }

        public void mo326d() {
            Log.d("DeveloperActivity", "Google onAdLeftApplication");
        }
    }

    class C19612 implements OnLoadCompleteListener {
        final /* synthetic */ DeveloperActivity f6133a;

        C19612(DeveloperActivity developerActivity) {
            this.f6133a = developerActivity;
        }

        public void onLoadComplete(SoundPool soundPool, int i, int i2) {
            Log.e("DeveloperActivity", "Sound Loaded");
            this.f6133a.f6149p = true;
        }
    }

    private String m9768a(int i) {
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

    public void m9770a() {
        Editor edit = getApplicationContext().getSharedPreferences(getString(R.string.preference_file_key), 0).edit();
        edit.putString("NAME", this.f6143j);
        edit.putBoolean("VOLUME", this.f6144k);
        edit.apply();
    }

    public void m9771b() {
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences(getString(R.string.preference_file_key), 0);
        this.f6143j = sharedPreferences.getString("NAME", "Unknown");
        this.f6144k = sharedPreferences.getBoolean("VOLUME", true);
    }

    public void m9772c() {
        if (this.f6144k) {
            this.f6145l = (AudioManager) getSystemService("audio");
            this.f6148o = ((float) this.f6145l.getStreamVolume(3)) / ((float) this.f6145l.getStreamMaxVolume(3));
            this.f6146m = new SoundPool(10, 3, 0);
            this.f6146m.setOnLoadCompleteListener(new C19612(this));
            this.f6147n = this.f6146m.load(this, R.raw.click, 1);
            return;
        }
        Log.e("DeveloperActivity", "Sound Not Loaded");
        this.f6149p = false;
    }

    public void m9773d() {
        try {
            this.f6146m.play(this.f6147n, this.f6148o, this.f6148o, 1, 0, 1.0f);
        } catch (Exception e) {
            Log.e("DeveloperActivity", "Error Playing Sound");
        }
    }

    public void goBack(View view) {
        m9773d();
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.e("DeveloperActivity", "onCreate");
        setContentView(R.layout.activity_developer);
        this.f6134a = Typeface.createFromAsset(getAssets(), "fonts/caviar_dreams.ttf");
        this.f6135b = Typeface.createFromAsset(getAssets(), "fonts/caviar_dreams_bold.ttf");
        this.f6136c = (AdView) findViewById(R.id.adView);
        this.f6136c.setAdListener(new C19601(this));
        this.f6136c.m2048a(new C0472a().m2094a());
        this.f6137d = (Button) findViewById(R.id.back);
        this.f6137d.setTypeface(this.f6135b);
        this.f6138e = (TextView) findViewById(R.id.textviewT);
        this.f6138e.setTypeface(this.f6135b);
        this.f6139f = (TextView) findViewById(R.id.textviewC);
        this.f6139f.setTypeface(this.f6134a);
        this.f6140g = (TextView) findViewById(R.id.textviewW);
        this.f6140g.setTypeface(this.f6135b);
        this.f6141h = (TextView) findViewById(R.id.textviewE);
        this.f6141h.setTypeface(this.f6135b);
        this.f6142i = (TextView) findViewById(R.id.textviewD);
        this.f6142i.setTypeface(this.f6135b);
    }

    public void onDestroy() {
        super.onDestroy();
        Log.e("DeveloperActivity", "onDestroy");
        if (this.f6136c != null) {
            this.f6136c.m2047a();
        }
    }

    protected void onPause() {
        super.onPause();
        Log.e("DeveloperActivity", "onPause");
        if (this.f6136c != null) {
            this.f6136c.m2049b();
        }
        if (this.f6146m != null) {
            this.f6146m.unload(this.f6147n);
            this.f6146m.release();
            this.f6146m = null;
        }
        m9770a();
    }

    public void onResume() {
        super.onResume();
        Log.e("DeveloperActivity", "onResume");
        if (this.f6136c != null) {
            this.f6136c.m2050c();
        }
        m9771b();
        m9772c();
    }

    public void pmD(View view) {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://smarturl.it/homeless-support")));
    }

    public void pmE(View view) {
        startActivity(new Intent("android.intent.action.SENDTO", Uri.parse("mailto:homeless@positivelymade.com")));
    }

    public void pmW(View view) {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/developer?id=Positively+Made")));
    }
}
