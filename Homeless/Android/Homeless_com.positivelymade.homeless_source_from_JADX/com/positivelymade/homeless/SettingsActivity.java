package com.positivelymade.homeless;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Typeface;
import android.media.AudioManager;
import android.media.SoundPool;
import android.media.SoundPool.OnLoadCompleteListener;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.C0427a;
import com.google.android.gms.ads.C0476c.C0472a;

public class SettingsActivity extends Activity {
    public Typeface f6662a;
    public Typeface f6663b;
    public AdView f6664c;
    public TextView f6665d;
    public TextView f6666e;
    public TextView f6667f;
    public TextView f6668g;
    public TextView f6669h;
    public TextView f6670i;
    public TextView f6671j;
    public ImageView f6672k;
    public ImageView f6673l;
    public ImageView f6674m;
    public ImageView f6675n;
    public ImageView f6676o;
    public ImageView f6677p;
    public ImageView f6678q;
    public boolean f6679r;
    public AudioManager f6680s;
    public SoundPool f6681t;
    public int f6682u;
    public float f6683v;
    public boolean f6684w;

    class C20081 extends C0427a {
        final /* synthetic */ SettingsActivity f6653a;

        C20081(SettingsActivity settingsActivity) {
            this.f6653a = settingsActivity;
        }

        public void mo322a() {
            Log.e("SettingsActivity", "Google onAdLoaded");
        }

        public void mo323a(int i) {
            Log.e("SettingsActivity", "Google onAdFailedToLoad: " + this.f6653a.m9953a(i));
        }

        public void mo324b() {
            Log.e("SettingsActivity", "Google onAdOpened");
        }

        public void mo325c() {
            Log.e("SettingsActivity", "Google onAdClosed");
        }

        public void mo326d() {
            Log.d("SettingsActivity", "Google onAdLeftApplication");
        }
    }

    class C20092 implements OnClickListener {
        final /* synthetic */ SettingsActivity f6654a;

        C20092(SettingsActivity settingsActivity) {
            this.f6654a = settingsActivity;
        }

        public void onClick(View view) {
            this.f6654a.m9961g();
        }
    }

    class C20103 implements OnClickListener {
        final /* synthetic */ SettingsActivity f6655a;

        C20103(SettingsActivity settingsActivity) {
            this.f6655a = settingsActivity;
        }

        public void onClick(View view) {
            this.f6655a.m9961g();
        }
    }

    class C20114 implements OnClickListener {
        final /* synthetic */ SettingsActivity f6656a;

        C20114(SettingsActivity settingsActivity) {
            this.f6656a = settingsActivity;
        }

        public void onClick(View view) {
            this.f6656a.m9962h();
        }
    }

    class C20125 implements OnClickListener {
        final /* synthetic */ SettingsActivity f6657a;

        C20125(SettingsActivity settingsActivity) {
            this.f6657a = settingsActivity;
        }

        public void onClick(View view) {
            this.f6657a.m9962h();
        }
    }

    class C20136 implements OnClickListener {
        final /* synthetic */ SettingsActivity f6658a;

        C20136(SettingsActivity settingsActivity) {
            this.f6658a = settingsActivity;
        }

        public void onClick(View view) {
            this.f6658a.m9963i();
        }
    }

    class C20147 implements OnClickListener {
        final /* synthetic */ SettingsActivity f6659a;

        C20147(SettingsActivity settingsActivity) {
            this.f6659a = settingsActivity;
        }

        public void onClick(View view) {
            this.f6659a.m9963i();
        }
    }

    class C20158 implements OnLoadCompleteListener {
        final /* synthetic */ SettingsActivity f6660a;

        C20158(SettingsActivity settingsActivity) {
            this.f6660a = settingsActivity;
        }

        public void onLoadComplete(SoundPool soundPool, int i, int i2) {
            Log.e("SettingsActivity", "Sound Loaded");
            this.f6660a.f6684w = true;
        }
    }

    class C20169 implements OnClickListener {
        final /* synthetic */ SettingsActivity f6661a;

        C20169(SettingsActivity settingsActivity) {
            this.f6661a = settingsActivity;
        }

        public void onClick(View view) {
            this.f6661a.m9957c();
        }
    }

    private String m9953a(int i) {
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

    public void m9955a() {
        getApplicationContext().getSharedPreferences(getString(R.string.preference_file_key), 0).edit().putBoolean("VOLUME", this.f6679r);
    }

    public void m9956b() {
        this.f6679r = getApplicationContext().getSharedPreferences(getString(R.string.preference_file_key), 0).getBoolean("VOLUME", true);
    }

    public void m9957c() {
        m9965k();
        String string = getResources().getString(R.string.download_app_text);
        CharSequence string2 = getResources().getString(R.string.share_app_text);
        try {
            String str = string + " http://play.google.com/store/apps/details?id=" + getApplicationContext().getPackageName();
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", str);
            startActivity(Intent.createChooser(intent, string2));
        } catch (Exception e) {
            Log.e("SettingsActivity", "Share App Error");
            string = string + " http://play.google.com/store/apps/details?id=" + getApplicationContext().getPackageName();
            Intent intent2 = new Intent("android.intent.action.SEND");
            intent2.setType("text/plain");
            intent2.putExtra("android.intent.extra.TEXT", string);
            startActivity(Intent.createChooser(intent2, string2));
        }
    }

    public void m9958d() {
        m9965k();
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + getApplicationContext().getPackageName())));
        } catch (ActivityNotFoundException e) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + getApplicationContext().getPackageName())));
        }
    }

    public void m9959e() {
        m9965k();
        startActivity(new Intent(this, SaveGameActivity.class));
    }

    public void m9960f() {
        m9965k();
        startActivity(new Intent(this, LoadGameActivity.class));
    }

    public void m9961g() {
        m9965k();
        startActivity(new Intent(this, UnlockablesActivity.class));
    }

    public void goBack(View view) {
        m9965k();
        finish();
    }

    public void m9962h() {
        m9965k();
        startActivity(new Intent(this, TshirtActivity.class));
    }

    public void m9963i() {
        m9965k();
        startActivity(new Intent(this, DeveloperActivity.class));
    }

    public void m9964j() {
        if (this.f6679r) {
            this.f6680s = (AudioManager) getSystemService("audio");
            this.f6683v = ((float) this.f6680s.getStreamVolume(3)) / ((float) this.f6680s.getStreamMaxVolume(3));
            this.f6681t = new SoundPool(10, 3, 0);
            this.f6681t.setOnLoadCompleteListener(new C20158(this));
            this.f6682u = this.f6681t.load(this, R.raw.click, 1);
            return;
        }
        Log.e("SettingsActivity", "Sound Not Loaded");
        this.f6684w = false;
    }

    public void m9965k() {
        try {
            this.f6681t.play(this.f6682u, this.f6683v, this.f6683v, 1, 0, 1.0f);
        } catch (Exception e) {
            Log.e("SettingsActivity", "Error Playing Sound");
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.e("SettingsActivity", "onCreate");
        setContentView(R.layout.activity_settings);
        this.f6664c = (AdView) findViewById(R.id.adView);
        this.f6664c.setAdListener(new C20081(this));
        this.f6664c.m2048a(new C0472a().m2094a());
        this.f6662a = Typeface.createFromAsset(getApplicationContext().getAssets(), "fonts/caviar_dreams.ttf");
        this.f6663b = Typeface.createFromAsset(getApplicationContext().getAssets(), "fonts/caviar_dreams_bold.ttf");
        this.f6672k = (ImageView) findViewById(R.id.imageShare);
        this.f6665d = (TextView) findViewById(R.id.textShare);
        this.f6665d.setTypeface(this.f6663b);
        this.f6673l = (ImageView) findViewById(R.id.imageRate);
        this.f6666e = (TextView) findViewById(R.id.textRate);
        this.f6666e.setTypeface(this.f6663b);
        this.f6674m = (ImageView) findViewById(R.id.imageSave);
        this.f6667f = (TextView) findViewById(R.id.textSave);
        this.f6667f.setTypeface(this.f6663b);
        this.f6675n = (ImageView) findViewById(R.id.imageLoad);
        this.f6668g = (TextView) findViewById(R.id.textLoad);
        this.f6668g.setTypeface(this.f6663b);
        this.f6676o = (ImageView) findViewById(R.id.imageUnlock);
        this.f6669h = (TextView) findViewById(R.id.textUnlock);
        this.f6669h.setTypeface(this.f6663b);
        this.f6677p = (ImageView) findViewById(R.id.imageTshirt);
        this.f6670i = (TextView) findViewById(R.id.textTshirt);
        this.f6670i.setTypeface(this.f6663b);
        this.f6678q = (ImageView) findViewById(R.id.imageDeveloper);
        this.f6671j = (TextView) findViewById(R.id.textDeveloper);
        this.f6671j.setTypeface(this.f6663b);
        this.f6672k.setOnClickListener(new C20169(this));
        this.f6665d.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ SettingsActivity f6646a;

            {
                this.f6646a = r1;
            }

            public void onClick(View view) {
                this.f6646a.m9957c();
            }
        });
        this.f6673l.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ SettingsActivity f6647a;

            {
                this.f6647a = r1;
            }

            public void onClick(View view) {
                this.f6647a.m9958d();
            }
        });
        this.f6666e.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ SettingsActivity f6648a;

            {
                this.f6648a = r1;
            }

            public void onClick(View view) {
                this.f6648a.m9958d();
            }
        });
        this.f6674m.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ SettingsActivity f6649a;

            {
                this.f6649a = r1;
            }

            public void onClick(View view) {
                this.f6649a.m9959e();
            }
        });
        this.f6667f.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ SettingsActivity f6650a;

            {
                this.f6650a = r1;
            }

            public void onClick(View view) {
                this.f6650a.m9959e();
            }
        });
        this.f6675n.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ SettingsActivity f6651a;

            {
                this.f6651a = r1;
            }

            public void onClick(View view) {
                this.f6651a.m9960f();
            }
        });
        this.f6668g.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ SettingsActivity f6652a;

            {
                this.f6652a = r1;
            }

            public void onClick(View view) {
                this.f6652a.m9960f();
            }
        });
        this.f6676o.setOnClickListener(new C20092(this));
        this.f6669h.setOnClickListener(new C20103(this));
        this.f6677p.setOnClickListener(new C20114(this));
        this.f6670i.setOnClickListener(new C20125(this));
        this.f6678q.setOnClickListener(new C20136(this));
        this.f6671j.setOnClickListener(new C20147(this));
    }

    public void onDestroy() {
        super.onDestroy();
        Log.e("SettingsActivity", "onDestroy");
        if (this.f6664c != null) {
            this.f6664c.m2047a();
        }
    }

    protected void onPause() {
        super.onPause();
        Log.e("SettingsActivity", "onPause");
        if (this.f6664c != null) {
            this.f6664c.m2049b();
        }
        if (this.f6681t != null) {
            this.f6681t.unload(this.f6682u);
            this.f6681t.release();
            this.f6681t = null;
        }
        m9955a();
    }

    protected void onResume() {
        super.onResume();
        Log.e("SettingsActivity", "onResume");
        if (this.f6664c != null) {
            this.f6664c.m2050c();
        }
        m9956b();
        m9964j();
    }
}
