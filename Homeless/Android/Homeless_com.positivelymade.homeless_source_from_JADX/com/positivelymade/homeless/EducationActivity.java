package com.positivelymade.homeless;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.media.AudioManager;
import android.media.SoundPool;
import android.media.SoundPool.OnLoadCompleteListener;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.C0427a;
import com.google.android.gms.ads.C0476c.C0472a;

public class EducationActivity extends Activity {
    public boolean f6153A;
    public Typeface f6154B;
    public Typeface f6155C;
    public AdView f6156D;
    public Button f6157E;
    public ListView f6158F;
    public C2096i f6159G;
    public TextView f6160H;
    public TextView f6161I;
    public TextView f6162J;
    public TextView f6163K;
    public Toast f6164L;
    public Toast f6165M;
    public Toast f6166N;
    public Toast f6167O;
    public Toast f6168P;
    public Toast f6169Q;
    public AudioManager f6170R;
    public SoundPool f6171S;
    public int f6172T;
    public float f6173U;
    public boolean f6174V;
    public String f6175a;
    public String f6176b;
    public int f6177c;
    public int f6178d;
    public int f6179e;
    public int f6180f;
    public int f6181g;
    public int f6182h;
    public boolean f6183i;
    public boolean f6184j;
    public boolean f6185k;
    public boolean f6186l;
    public boolean f6187m;
    public boolean f6188n;
    public int f6189o;
    public int f6190p;
    public int f6191q;
    public int f6192r;
    public int f6193s;
    public boolean f6194t;
    public boolean f6195u;
    public boolean f6196v;
    public boolean f6197w;
    public boolean f6198x;
    public boolean f6199y;
    public boolean f6200z;

    class C19621 extends C0427a {
        final /* synthetic */ EducationActivity f6150a;

        C19621(EducationActivity educationActivity) {
            this.f6150a = educationActivity;
        }

        public void mo322a() {
            Log.e("EducationActivity", "Google onAdLoaded");
        }

        public void mo323a(int i) {
            Log.e("EducationActivity", "Google onAdFailedToLoad: " + this.f6150a.m9779a(i));
        }

        public void mo324b() {
            Log.e("EducationActivity", "Google onAdOpened");
        }

        public void mo325c() {
            Log.e("EducationActivity", "Google onAdClosed");
        }

        public void mo326d() {
            Log.d("EducationActivity", "Google onAdLeftApplication");
        }
    }

    class C19632 implements OnItemClickListener {
        final /* synthetic */ EducationActivity f6151a;

        C19632(EducationActivity educationActivity) {
            this.f6151a = educationActivity;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            String b = ((C2097j) this.f6151a.f6159G.m10164a().get(i)).m10170b();
            int i2 = -1;
            switch (b.hashCode()) {
                case -960970813:
                    if (b.equals("$100000")) {
                        i2 = 4;
                        break;
                    }
                    break;
                case 1121101:
                    if (b.equals("$100")) {
                        i2 = 0;
                        break;
                    }
                    break;
                case 34937730:
                    if (b.equals("$7500")) {
                        boolean z = true;
                        break;
                    }
                    break;
                case 1077528552:
                    if (b.equals("$15000")) {
                        i2 = 2;
                        break;
                    }
                    break;
                case 1078452073:
                    if (b.equals("$25000")) {
                        i2 = 3;
                        break;
                    }
                    break;
            }
            EducationActivity educationActivity;
            switch (i2) {
                case 0:
                    if (this.f6151a.f6177c < 100 || this.f6151a.f6194t) {
                        if (!this.f6151a.f6194t) {
                            this.f6151a.m9784a(this.f6151a.f6169Q, this.f6151a.getResources().getString(R.string.no_cash), R.drawable.money);
                            break;
                        } else {
                            this.f6151a.m9784a(this.f6151a.f6164L, this.f6151a.getResources().getString(R.string.have_math_s1), R.drawable.money);
                            break;
                        }
                    }
                    educationActivity = this.f6151a;
                    educationActivity.f6177c -= 100;
                    this.f6151a.f6194t = true;
                    educationActivity = this.f6151a;
                    educationActivity.f6180f++;
                    this.f6151a.m9786c();
                    this.f6151a.m9784a(this.f6151a.f6164L, this.f6151a.getResources().getString(R.string.have_math_s), R.drawable.money);
                    break;
                case 1:
                    if (this.f6151a.f6177c < 7500 || this.f6151a.f6195u) {
                        if (!this.f6151a.f6195u) {
                            this.f6151a.m9784a(this.f6151a.f6169Q, this.f6151a.getResources().getString(R.string.no_cash), R.drawable.money);
                            break;
                        } else {
                            this.f6151a.m9784a(this.f6151a.f6165M, this.f6151a.getResources().getString(R.string.have_school_s1), R.drawable.money);
                            break;
                        }
                    }
                    educationActivity = this.f6151a;
                    educationActivity.f6177c -= 7500;
                    this.f6151a.f6195u = true;
                    educationActivity = this.f6151a;
                    educationActivity.f6180f++;
                    this.f6151a.m9786c();
                    this.f6151a.m9784a(this.f6151a.f6165M, this.f6151a.getResources().getString(R.string.have_school_s), R.drawable.money);
                    break;
                case 2:
                    if (this.f6151a.f6177c < 15000 || this.f6151a.f6196v) {
                        if (!this.f6151a.f6196v) {
                            this.f6151a.m9784a(this.f6151a.f6169Q, this.f6151a.getResources().getString(R.string.no_cash), R.drawable.money);
                            break;
                        } else {
                            this.f6151a.m9784a(this.f6151a.f6166N, this.f6151a.getResources().getString(R.string.have_masonry_s1), R.drawable.money);
                            break;
                        }
                    }
                    educationActivity = this.f6151a;
                    educationActivity.f6177c -= 15000;
                    this.f6151a.f6196v = true;
                    educationActivity = this.f6151a;
                    educationActivity.f6180f++;
                    this.f6151a.m9786c();
                    this.f6151a.m9784a(this.f6151a.f6166N, this.f6151a.getResources().getString(R.string.have_masonry_s), R.drawable.money);
                    break;
                    break;
                case 3:
                    if (this.f6151a.f6177c < 25000 || this.f6151a.f6197w) {
                        if (!this.f6151a.f6197w) {
                            this.f6151a.m9784a(this.f6151a.f6169Q, this.f6151a.getResources().getString(R.string.no_cash), R.drawable.money);
                            break;
                        } else {
                            this.f6151a.m9784a(this.f6151a.f6167O, this.f6151a.getResources().getString(R.string.have_college_s1), R.drawable.money);
                            break;
                        }
                    }
                    educationActivity = this.f6151a;
                    educationActivity.f6177c -= 25000;
                    this.f6151a.f6197w = true;
                    educationActivity = this.f6151a;
                    educationActivity.f6180f++;
                    this.f6151a.m9786c();
                    this.f6151a.m9784a(this.f6151a.f6167O, this.f6151a.getResources().getString(R.string.have_college_s), R.drawable.money);
                    break;
                    break;
                case 4:
                    if (this.f6151a.f6177c < 100000 || this.f6151a.f6198x) {
                        if (!this.f6151a.f6198x) {
                            this.f6151a.m9784a(this.f6151a.f6169Q, this.f6151a.getResources().getString(R.string.no_cash), R.drawable.money);
                            break;
                        } else {
                            this.f6151a.m9784a(this.f6151a.f6168P, this.f6151a.getResources().getString(R.string.have_university_s1), R.drawable.money);
                            break;
                        }
                    }
                    educationActivity = this.f6151a;
                    educationActivity.f6177c -= 100000;
                    this.f6151a.f6198x = true;
                    educationActivity = this.f6151a;
                    educationActivity.f6180f++;
                    this.f6151a.m9786c();
                    this.f6151a.m9784a(this.f6151a.f6168P, this.f6151a.getResources().getString(R.string.have_university_s), R.drawable.money);
                    break;
                    break;
            }
            this.f6151a.f6160H.setText("$" + String.format("%,d", new Object[]{Integer.valueOf(this.f6151a.f6177c)}).replace(',', ' '));
            this.f6151a.f6162J.setText("$" + String.format("%,d", new Object[]{Integer.valueOf(this.f6151a.f6178d)}).replace(',', ' '));
            this.f6151a.m9782f();
        }
    }

    class C19643 implements OnLoadCompleteListener {
        final /* synthetic */ EducationActivity f6152a;

        C19643(EducationActivity educationActivity) {
            this.f6152a = educationActivity;
        }

        public void onLoadComplete(SoundPool soundPool, int i, int i2) {
            Log.e("EducationActivity", "Sound Loaded");
            this.f6152a.f6174V = true;
        }
    }

    private String m9779a(int i) {
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

    private void m9782f() {
        this.f6159G.m10166b();
        Bitmap decodeResource = this.f6194t ? BitmapFactory.decodeResource(getResources(), R.drawable.active) : BitmapFactory.decodeResource(getResources(), R.drawable.not_active);
        C2097j c2097j = new C2097j();
        c2097j.m10169a(getString(R.string.development_e_1));
        c2097j.m10171b(getString(R.string.development_e_1p));
        c2097j.m10168a(Bitmap.createScaledBitmap(decodeResource, decodeResource.getWidth(), decodeResource.getHeight(), false));
        this.f6159G.m10165a(c2097j);
        decodeResource = this.f6195u ? BitmapFactory.decodeResource(getResources(), R.drawable.active) : BitmapFactory.decodeResource(getResources(), R.drawable.not_active);
        c2097j = new C2097j();
        c2097j.m10169a(getString(R.string.development_e_2));
        c2097j.m10171b(getString(R.string.development_e_2p));
        c2097j.m10168a(Bitmap.createScaledBitmap(decodeResource, decodeResource.getWidth(), decodeResource.getHeight(), false));
        this.f6159G.m10165a(c2097j);
        decodeResource = this.f6196v ? BitmapFactory.decodeResource(getResources(), R.drawable.active) : BitmapFactory.decodeResource(getResources(), R.drawable.not_active);
        c2097j = new C2097j();
        c2097j.m10169a(getString(R.string.development_e_3));
        c2097j.m10171b(getString(R.string.development_e_3p));
        c2097j.m10168a(Bitmap.createScaledBitmap(decodeResource, decodeResource.getWidth(), decodeResource.getHeight(), false));
        this.f6159G.m10165a(c2097j);
        decodeResource = this.f6197w ? BitmapFactory.decodeResource(getResources(), R.drawable.active) : BitmapFactory.decodeResource(getResources(), R.drawable.not_active);
        c2097j = new C2097j();
        c2097j.m10169a(getString(R.string.development_e_4));
        c2097j.m10171b(getString(R.string.development_e_4p));
        c2097j.m10168a(Bitmap.createScaledBitmap(decodeResource, decodeResource.getWidth(), decodeResource.getHeight(), false));
        this.f6159G.m10165a(c2097j);
        decodeResource = this.f6198x ? BitmapFactory.decodeResource(getResources(), R.drawable.active) : BitmapFactory.decodeResource(getResources(), R.drawable.not_active);
        c2097j = new C2097j();
        c2097j.m10169a(getString(R.string.development_e_5));
        c2097j.m10171b(getString(R.string.development_e_5p));
        c2097j.m10168a(Bitmap.createScaledBitmap(decodeResource, decodeResource.getWidth(), decodeResource.getHeight(), false));
        this.f6159G.m10165a(c2097j);
    }

    public void m9783a() {
        Editor edit = getApplicationContext().getSharedPreferences(getString(R.string.preference_file_key), 0).edit();
        edit.putString("CODES", this.f6176b);
        edit.putBoolean("VOLUME", this.f6153A);
        edit.putBoolean("A1", this.f6199y);
        edit.putBoolean("A12E", this.f6200z);
        edit.putString("NAME", this.f6175a);
        edit.putInt("CASH", this.f6177c);
        edit.putInt("BANK", this.f6178d);
        edit.putInt("BANK_DAYS", this.f6179e);
        edit.putInt("AGE", this.f6180f);
        edit.putInt("HUNGER", this.f6181g);
        edit.putInt("HEALTH", this.f6182h);
        edit.putBoolean("BOX", this.f6183i);
        edit.putBoolean("BASEMENT", this.f6184j);
        edit.putInt("BASEMENT_DAYS", this.f6189o);
        edit.putBoolean("APARTMENT", this.f6185k);
        edit.putInt("APARTMENT_DAYS", this.f6190p);
        edit.putBoolean("HOUSE", this.f6186l);
        edit.putInt("HOUSE_NO", this.f6191q);
        edit.putBoolean("CONDO", this.f6187m);
        edit.putInt("CONDO_NO", this.f6192r);
        edit.putBoolean("MANSION", this.f6188n);
        edit.putInt("MANSION_NO", this.f6193s);
        edit.putBoolean("MATH", this.f6194t);
        edit.putBoolean("SCHOOL", this.f6195u);
        edit.putBoolean("MASONRY", this.f6196v);
        edit.putBoolean("COLLEGE", this.f6197w);
        edit.putBoolean("UNIVERSITY", this.f6198x);
        edit.apply();
    }

    public void m9784a(Toast toast, String str, int i) {
        View inflate = getLayoutInflater().inflate(R.layout.toast_message, (ViewGroup) findViewById(R.id.toast_layout_root));
        ((ImageView) inflate.findViewById(R.id.toast_image)).setImageResource(i);
        ((TextView) inflate.findViewById(R.id.toast_text)).setText(str);
        if (toast.getView().getWindowVisibility() != 0) {
            Log.e("EducationActivity", "Exists");
            toast.setDuration(0);
        }
        toast.setGravity(16, 0, 0);
        toast.setView(inflate);
        toast.show();
    }

    public void m9785b() {
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences(getString(R.string.preference_file_key), 0);
        this.f6176b = sharedPreferences.getString("CODES", "");
        this.f6153A = sharedPreferences.getBoolean("VOLUME", true);
        this.f6199y = sharedPreferences.getBoolean("A1", false);
        this.f6200z = sharedPreferences.getBoolean("A12E", false);
        this.f6175a = sharedPreferences.getString("NAME", "Unknown");
        this.f6177c = sharedPreferences.getInt("CASH", 0);
        this.f6178d = sharedPreferences.getInt("BANK", 0);
        this.f6179e = sharedPreferences.getInt("BANK_DAYS", 31);
        this.f6180f = sharedPreferences.getInt("AGE", 0);
        this.f6181g = sharedPreferences.getInt("HUNGER", 80);
        this.f6182h = sharedPreferences.getInt("HEALTH", 80);
        this.f6183i = sharedPreferences.getBoolean("BOX", true);
        this.f6184j = sharedPreferences.getBoolean("BASEMENT", false);
        this.f6189o = sharedPreferences.getInt("BASEMENT_DAYS", 0);
        this.f6185k = sharedPreferences.getBoolean("APARTMENT", false);
        this.f6190p = sharedPreferences.getInt("APARTMENT_DAYS", 0);
        this.f6186l = sharedPreferences.getBoolean("HOUSE", false);
        this.f6191q = sharedPreferences.getInt("HOUSE_NO", 0);
        this.f6187m = sharedPreferences.getBoolean("CONDO", false);
        this.f6192r = sharedPreferences.getInt("CONDO_NO", 0);
        this.f6188n = sharedPreferences.getBoolean("MANSION", false);
        this.f6193s = sharedPreferences.getInt("MANSION_NO", 0);
        this.f6194t = sharedPreferences.getBoolean("MATH", false);
        this.f6195u = sharedPreferences.getBoolean("SCHOOL", false);
        this.f6196v = sharedPreferences.getBoolean("MASONRY", false);
        this.f6197w = sharedPreferences.getBoolean("COLLEGE", false);
        this.f6198x = sharedPreferences.getBoolean("UNIVERSITY", false);
    }

    public void m9786c() {
        if (this.f6178d == 0) {
            this.f6179e = 31;
        } else if (this.f6178d >= 100 && this.f6179e > 1) {
            this.f6179e--;
        } else if (this.f6178d >= 100 && this.f6179e <= 1) {
            this.f6179e = 30;
            this.f6178d += this.f6178d / 100;
        }
        if (this.f6184j && this.f6189o >= 1) {
            this.f6189o--;
        }
        if (this.f6184j && this.f6189o == 0) {
            this.f6184j = false;
            this.f6189o = 0;
        }
        if (this.f6185k && this.f6190p >= 1) {
            this.f6190p--;
        }
        if (this.f6185k && this.f6190p == 0) {
            this.f6185k = false;
            this.f6190p = 0;
        }
    }

    public void m9787d() {
        if (this.f6153A) {
            this.f6170R = (AudioManager) getSystemService("audio");
            this.f6173U = ((float) this.f6170R.getStreamVolume(3)) / ((float) this.f6170R.getStreamMaxVolume(3));
            this.f6171S = new SoundPool(10, 3, 0);
            this.f6171S.setOnLoadCompleteListener(new C19643(this));
            this.f6172T = this.f6171S.load(this, R.raw.click, 1);
            return;
        }
        Log.e("EducationActivity", "Sound Not Loaded");
        this.f6174V = false;
    }

    public void m9788e() {
        try {
            this.f6171S.play(this.f6172T, this.f6173U, this.f6173U, 1, 0, 1.0f);
        } catch (Exception e) {
            Log.e("EducationActivity", "Error Playing Sound");
        }
    }

    public void goBack(View view) {
        m9788e();
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.e("EducationActivity", "onCreate");
        setContentView(R.layout.activity_education);
        this.f6154B = Typeface.createFromAsset(getAssets(), "fonts/caviar_dreams.ttf");
        this.f6155C = Typeface.createFromAsset(getAssets(), "fonts/caviar_dreams_bold.ttf");
        this.f6164L = Toast.makeText(this, "", 0);
        this.f6165M = Toast.makeText(this, "", 0);
        this.f6166N = Toast.makeText(this, "", 0);
        this.f6167O = Toast.makeText(this, "", 0);
        this.f6168P = Toast.makeText(this, "", 0);
        this.f6169Q = Toast.makeText(this, "", 0);
        this.f6156D = (AdView) findViewById(R.id.adView);
        this.f6156D.setAdListener(new C19621(this));
        this.f6156D.m2048a(new C0472a().m2094a());
        this.f6161I = (TextView) findViewById(R.id.cash_title);
        this.f6161I.setTypeface(this.f6155C);
        this.f6160H = (TextView) findViewById(R.id.cash_amount);
        this.f6160H.setTypeface(this.f6154B);
        this.f6163K = (TextView) findViewById(R.id.bank_title);
        this.f6163K.setTypeface(this.f6155C);
        this.f6162J = (TextView) findViewById(R.id.bank_amount);
        this.f6162J.setTypeface(this.f6154B);
        this.f6157E = (Button) findViewById(R.id.back);
        this.f6157E.setTypeface(this.f6155C);
        this.f6158F = (ListView) findViewById(R.id.education_list);
        this.f6159G = new C2096i(this);
        this.f6158F.setAdapter(this.f6159G);
        this.f6158F.setOnItemClickListener(new C19632(this));
    }

    public void onDestroy() {
        super.onDestroy();
        Log.e("EducationActivity", "onDestroy");
        if (this.f6156D != null) {
            this.f6156D.m2047a();
        }
    }

    protected void onPause() {
        super.onPause();
        Log.e("EducationActivity", "onPause");
        if (this.f6156D != null) {
            this.f6156D.m2049b();
        }
        if (this.f6164L != null) {
            this.f6164L.cancel();
        }
        if (this.f6165M != null) {
            this.f6165M.cancel();
        }
        if (this.f6166N != null) {
            this.f6166N.cancel();
        }
        if (this.f6167O != null) {
            this.f6167O.cancel();
        }
        if (this.f6168P != null) {
            this.f6168P.cancel();
        }
        if (this.f6169Q != null) {
            this.f6169Q.cancel();
        }
        if (this.f6171S != null) {
            this.f6171S.unload(this.f6172T);
            this.f6171S.release();
            this.f6171S = null;
        }
        if (this.f6194t || this.f6195u || this.f6196v || this.f6197w || this.f6198x) {
            this.f6199y = true;
        }
        if (this.f6194t && this.f6195u && this.f6196v && this.f6197w && this.f6198x) {
            this.f6200z = true;
        }
        m9783a();
    }

    public void onResume() {
        super.onResume();
        Log.e("EducationActivity", "onResume");
        if (this.f6156D != null) {
            this.f6156D.m2050c();
        }
        m9785b();
        m9787d();
        m9782f();
        this.f6160H.setText("$" + String.format("%,d", new Object[]{Integer.valueOf(this.f6177c)}).replace(',', ' '));
        this.f6162J.setText("$" + String.format("%,d", new Object[]{Integer.valueOf(this.f6178d)}).replace(',', ' '));
    }
}
