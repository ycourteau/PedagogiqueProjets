package com.positivelymade.homeless;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Typeface;
import android.media.AudioManager;
import android.media.SoundPool;
import android.media.SoundPool.OnLoadCompleteListener;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.C0427a;
import com.google.android.gms.ads.C0476c.C0472a;

public class TshirtActivity extends Activity {
    public Typeface f6796a;
    public Typeface f6797b;
    public AdView f6798c;
    public Button f6799d;
    public Button f6800e;
    public TextView f6801f;
    public TextView f6802g;
    public Spinner f6803h;
    public ImageView f6804i;
    public String f6805j;
    public boolean f6806k;
    public Toast f6807l;
    public AudioManager f6808m;
    public SoundPool f6809n;
    public int f6810o;
    public float f6811p;
    public boolean f6812q;

    class C20231 extends C0427a {
        final /* synthetic */ TshirtActivity f6792a;

        C20231(TshirtActivity tshirtActivity) {
            this.f6792a = tshirtActivity;
        }

        public void mo322a() {
            Log.e("TshirtActivity", "Google onAdLoaded");
        }

        public void mo323a(int i) {
            Log.e("TshirtActivity", "Google onAdFailedToLoad: " + this.f6792a.m10001a(i));
        }

        public void mo324b() {
            Log.e("TshirtActivity", "Google onAdOpened");
        }

        public void mo325c() {
            Log.e("TshirtActivity", "Google onAdClosed");
        }

        public void mo326d() {
            Log.d("TshirtActivity", "Google onAdLeftApplication");
        }
    }

    class C20242 implements OnClickListener {
        final /* synthetic */ TshirtActivity f6793a;

        C20242(TshirtActivity tshirtActivity) {
            this.f6793a = tshirtActivity;
        }

        public void onClick(View view) {
            String valueOf = String.valueOf(this.f6793a.f6803h.getSelectedItem());
            Object obj = -1;
            switch (valueOf.hashCode()) {
                case -1339669588:
                    if (valueOf.equals("SM  @   US$33")) {
                        obj = null;
                        break;
                    }
                    break;
                case -1162959502:
                    if (valueOf.equals("L     @   US$33")) {
                        obj = 2;
                        break;
                    }
                    break;
                case -1048081639:
                    if (valueOf.equals("M    @   US$33")) {
                        obj = 1;
                        break;
                    }
                    break;
                case 1151744114:
                    if (valueOf.equals("XXL @   US$33")) {
                        obj = 4;
                        break;
                    }
                    break;
                case 1955877658:
                    if (valueOf.equals("XL   @   US$33")) {
                        obj = 3;
                        break;
                    }
                    break;
            }
            switch (obj) {
                case null:
                    this.f6793a.m10004a(this.f6793a.f6807l, String.valueOf(this.f6793a.f6803h.getSelectedItem()), R.drawable.notice);
                    return;
                case 1:
                    this.f6793a.m10004a(this.f6793a.f6807l, String.valueOf(this.f6793a.f6803h.getSelectedItem()), R.drawable.notice);
                    return;
                case 2:
                    this.f6793a.m10004a(this.f6793a.f6807l, String.valueOf(this.f6793a.f6803h.getSelectedItem()), R.drawable.notice);
                    return;
                case 3:
                    this.f6793a.m10004a(this.f6793a.f6807l, String.valueOf(this.f6793a.f6803h.getSelectedItem()), R.drawable.notice);
                    return;
                case 4:
                    this.f6793a.m10004a(this.f6793a.f6807l, String.valueOf(this.f6793a.f6803h.getSelectedItem()), R.drawable.notice);
                    return;
                default:
                    return;
            }
        }
    }

    class C20253 implements OnClickListener {
        final /* synthetic */ TshirtActivity f6794a;

        C20253(TshirtActivity tshirtActivity) {
            this.f6794a = tshirtActivity;
        }

        public void onClick(View view) {
        }
    }

    class C20264 implements OnLoadCompleteListener {
        final /* synthetic */ TshirtActivity f6795a;

        C20264(TshirtActivity tshirtActivity) {
            this.f6795a = tshirtActivity;
        }

        public void onLoadComplete(SoundPool soundPool, int i, int i2) {
            Log.e("TshirtActivity", "Sound Loaded");
            this.f6795a.f6812q = true;
        }
    }

    private String m10001a(int i) {
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

    public void m10003a() {
        Editor edit = getApplicationContext().getSharedPreferences(getString(R.string.preference_file_key), 0).edit();
        edit.putString("NAME", this.f6805j);
        edit.putBoolean("VOLUME", this.f6806k);
        edit.apply();
    }

    public void m10004a(Toast toast, String str, int i) {
        View inflate = getLayoutInflater().inflate(R.layout.toast_message, (ViewGroup) findViewById(R.id.toast_layout_root));
        ((ImageView) inflate.findViewById(R.id.toast_image)).setImageResource(i);
        ((TextView) inflate.findViewById(R.id.toast_text)).setText(str);
        if (toast.getView().getWindowVisibility() != 0) {
            Log.e("TshirtActivity", "Exists");
            toast.setDuration(1);
        }
        toast.setGravity(16, 0, 0);
        toast.setView(inflate);
        toast.show();
    }

    public void m10005b() {
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences(getString(R.string.preference_file_key), 0);
        this.f6805j = sharedPreferences.getString("NAME", "Unknown");
        this.f6806k = sharedPreferences.getBoolean("VOLUME", true);
    }

    public void m10006c() {
        if (this.f6806k) {
            this.f6808m = (AudioManager) getSystemService("audio");
            this.f6811p = ((float) this.f6808m.getStreamVolume(3)) / ((float) this.f6808m.getStreamMaxVolume(3));
            this.f6809n = new SoundPool(10, 3, 0);
            this.f6809n.setOnLoadCompleteListener(new C20264(this));
            this.f6810o = this.f6809n.load(this, R.raw.click, 1);
            return;
        }
        Log.e("TshirtActivity", "Sound Not Loaded");
        this.f6812q = false;
    }

    public void m10007d() {
        try {
            this.f6809n.play(this.f6810o, this.f6811p, this.f6811p, 1, 0, 1.0f);
        } catch (Exception e) {
            Log.e("TshirtActivity", "Error Playing Sound");
        }
    }

    public void goBack(View view) {
        m10007d();
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.e("TshirtActivity", "onCreate");
        setContentView(R.layout.activity_tshirt);
        this.f6796a = Typeface.createFromAsset(getAssets(), "fonts/caviar_dreams.ttf");
        this.f6797b = Typeface.createFromAsset(getAssets(), "fonts/caviar_dreams_bold.ttf");
        this.f6807l = Toast.makeText(this, "", 1);
        this.f6798c = (AdView) findViewById(R.id.adView);
        this.f6798c.setAdListener(new C20231(this));
        this.f6798c.m2048a(new C0472a().m2094a());
        this.f6799d = (Button) findViewById(R.id.back);
        this.f6799d.setTypeface(this.f6797b);
        this.f6801f = (TextView) findViewById(R.id.app_tshirt_title);
        this.f6801f.setTypeface(this.f6797b);
        this.f6802g = (TextView) findViewById(R.id.tshirt_title_text);
        this.f6802g.setTypeface(this.f6797b);
        this.f6800e = (Button) findViewById(R.id.tshirt_button);
        this.f6800e.setTypeface(this.f6797b);
        this.f6803h = (Spinner) findViewById(R.id.tshirt_spinner);
        this.f6800e.setOnClickListener(new C20242(this));
        this.f6804i = (ImageView) findViewById(R.id.tshirt_image);
        this.f6804i.setOnClickListener(new C20253(this));
    }

    public void onDestroy() {
        super.onDestroy();
        Log.e("TshirtActivity", "onDestroy");
        if (this.f6798c != null) {
            this.f6798c.m2047a();
        }
    }

    protected void onPause() {
        super.onPause();
        Log.e("TshirtActivity", "onPause");
        if (this.f6798c != null) {
            this.f6798c.m2049b();
        }
        if (this.f6809n != null) {
            this.f6809n.unload(this.f6810o);
            this.f6809n.release();
            this.f6809n = null;
        }
        m10003a();
    }

    public void onResume() {
        super.onResume();
        Log.e("TshirtActivity", "onResume");
        if (this.f6798c != null) {
            this.f6798c.m2050c();
        }
        m10005b();
        m10006c();
    }
}
