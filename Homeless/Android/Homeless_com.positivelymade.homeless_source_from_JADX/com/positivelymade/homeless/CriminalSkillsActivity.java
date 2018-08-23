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

public class CriminalSkillsActivity extends Activity {
    public boolean f6083A;
    public Typeface f6084B;
    public Typeface f6085C;
    public AdView f6086D;
    public Button f6087E;
    public ListView f6088F;
    public C2094h f6089G;
    public TextView f6090H;
    public TextView f6091I;
    public TextView f6092J;
    public TextView f6093K;
    public Toast f6094L;
    public Toast f6095M;
    public Toast f6096N;
    public Toast f6097O;
    public Toast f6098P;
    public Toast f6099Q;
    public Toast f6100R;
    public AudioManager f6101S;
    public SoundPool f6102T;
    public int f6103U;
    public float f6104V;
    public boolean f6105W;
    public String f6106a;
    public String f6107b;
    public int f6108c;
    public int f6109d;
    public int f6110e;
    public int f6111f;
    public int f6112g;
    public int f6113h;
    public boolean f6114i;
    public boolean f6115j;
    public boolean f6116k;
    public boolean f6117l;
    public boolean f6118m;
    public boolean f6119n;
    public int f6120o;
    public int f6121p;
    public int f6122q;
    public int f6123r;
    public int f6124s;
    public boolean f6125t;
    public boolean f6126u;
    public boolean f6127v;
    public boolean f6128w;
    public boolean f6129x;
    public boolean f6130y;
    public boolean f6131z;

    class C19571 extends C0427a {
        final /* synthetic */ CriminalSkillsActivity f6080a;

        C19571(CriminalSkillsActivity criminalSkillsActivity) {
            this.f6080a = criminalSkillsActivity;
        }

        public void mo322a() {
            Log.e("CriminalSkillsActivity", "Google onAdLoaded");
        }

        public void mo323a(int i) {
            Log.e("CriminalSkillsActivity", "Google onAdFailedToLoad: " + this.f6080a.m9753a(i));
        }

        public void mo324b() {
            Log.e("CriminalSkillsActivity", "Google onAdOpened");
        }

        public void mo325c() {
            Log.e("CriminalSkillsActivity", "Google onAdClosed");
        }

        public void mo326d() {
            Log.d("CriminalSkillsActivity", "Google onAdLeftApplication");
        }
    }

    class C19582 implements OnItemClickListener {
        final /* synthetic */ CriminalSkillsActivity f6081a;

        C19582(CriminalSkillsActivity criminalSkillsActivity) {
            this.f6081a = criminalSkillsActivity;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            String b = ((C2097j) this.f6081a.f6089G.m10161a().get(i)).m10170b();
            int i2 = -1;
            switch (b.hashCode()) {
                case 36354:
                    if (b.equals("$75")) {
                        i2 = 3;
                        break;
                    }
                    break;
                case 1121101:
                    if (b.equals("$100")) {
                        i2 = 0;
                        break;
                    }
                    break;
                case 1124945:
                    if (b.equals("$500")) {
                        i2 = 4;
                        break;
                    }
                    break;
                case 1125906:
                    if (b.equals("$600")) {
                        boolean z = true;
                        break;
                    }
                    break;
                case 34783970:
                    if (b.equals("$2000")) {
                        i2 = 5;
                        break;
                    }
                    break;
                case 34785892:
                    if (b.equals("$2200")) {
                        i2 = 2;
                        break;
                    }
                    break;
            }
            CriminalSkillsActivity criminalSkillsActivity;
            switch (i2) {
                case 0:
                    if (this.f6081a.f6108c < 100 || this.f6081a.f6125t) {
                        if (!this.f6081a.f6125t) {
                            this.f6081a.m9758a(this.f6081a.f6100R, this.f6081a.getResources().getString(R.string.no_cash), R.drawable.money);
                            break;
                        } else {
                            this.f6081a.m9758a(this.f6081a.f6094L, this.f6081a.getResources().getString(R.string.have_novice_s1), R.drawable.money);
                            break;
                        }
                    }
                    criminalSkillsActivity = this.f6081a;
                    criminalSkillsActivity.f6108c -= 100;
                    this.f6081a.f6125t = true;
                    criminalSkillsActivity = this.f6081a;
                    criminalSkillsActivity.f6111f++;
                    this.f6081a.m9760c();
                    this.f6081a.m9758a(this.f6081a.f6094L, this.f6081a.getResources().getString(R.string.have_novice_s), R.drawable.money);
                    break;
                    break;
                case 1:
                    if (this.f6081a.f6108c < 600 || this.f6081a.f6126u || !this.f6081a.f6125t) {
                        if (this.f6081a.f6125t) {
                            if (!this.f6081a.f6126u) {
                                this.f6081a.m9758a(this.f6081a.f6100R, this.f6081a.getResources().getString(R.string.no_cash), R.drawable.money);
                                break;
                            } else {
                                this.f6081a.m9758a(this.f6081a.f6095M, this.f6081a.getResources().getString(R.string.have_mobster_s1), R.drawable.money);
                                break;
                            }
                        }
                        this.f6081a.m9758a(this.f6081a.f6095M, this.f6081a.getResources().getString(R.string.have_mobster_s0), R.drawable.money);
                        break;
                    }
                    criminalSkillsActivity = this.f6081a;
                    criminalSkillsActivity.f6108c -= 600;
                    this.f6081a.f6126u = true;
                    criminalSkillsActivity = this.f6081a;
                    criminalSkillsActivity.f6111f++;
                    this.f6081a.m9760c();
                    this.f6081a.m9758a(this.f6081a.f6095M, this.f6081a.getResources().getString(R.string.have_mobster_s), R.drawable.money);
                    break;
                    break;
                case 2:
                    if (this.f6081a.f6108c < 2200 || this.f6081a.f6127v || !this.f6081a.f6126u) {
                        if (this.f6081a.f6126u) {
                            if (!this.f6081a.f6127v) {
                                this.f6081a.m9758a(this.f6081a.f6100R, this.f6081a.getResources().getString(R.string.no_cash), R.drawable.money);
                                break;
                            } else {
                                this.f6081a.m9758a(this.f6081a.f6096N, this.f6081a.getResources().getString(R.string.have_hitman_s1), R.drawable.money);
                                break;
                            }
                        }
                        this.f6081a.m9758a(this.f6081a.f6096N, this.f6081a.getResources().getString(R.string.have_hitman_s0), R.drawable.money);
                        break;
                    }
                    criminalSkillsActivity = this.f6081a;
                    criminalSkillsActivity.f6108c -= 2200;
                    this.f6081a.f6127v = true;
                    criminalSkillsActivity = this.f6081a;
                    criminalSkillsActivity.f6111f++;
                    this.f6081a.m9760c();
                    this.f6081a.m9758a(this.f6081a.f6096N, this.f6081a.getResources().getString(R.string.have_hitman_s), R.drawable.money);
                    break;
                case 3:
                    if (this.f6081a.f6108c < 75 || this.f6081a.f6128w) {
                        if (!this.f6081a.f6128w) {
                            this.f6081a.m9758a(this.f6081a.f6100R, this.f6081a.getResources().getString(R.string.no_cash), R.drawable.money);
                            break;
                        } else {
                            this.f6081a.m9758a(this.f6081a.f6097O, this.f6081a.getResources().getString(R.string.have_pickpocket_s1), R.drawable.money);
                            break;
                        }
                    }
                    criminalSkillsActivity = this.f6081a;
                    criminalSkillsActivity.f6108c -= 75;
                    this.f6081a.f6128w = true;
                    criminalSkillsActivity = this.f6081a;
                    criminalSkillsActivity.f6111f++;
                    this.f6081a.m9760c();
                    this.f6081a.m9758a(this.f6081a.f6097O, this.f6081a.getResources().getString(R.string.have_pickpocket_s), R.drawable.money);
                    break;
                    break;
                case 4:
                    if (this.f6081a.f6108c < 500 || this.f6081a.f6129x || !this.f6081a.f6128w) {
                        if (this.f6081a.f6128w) {
                            if (!this.f6081a.f6129x) {
                                this.f6081a.m9758a(this.f6081a.f6100R, this.f6081a.getResources().getString(R.string.no_cash), R.drawable.money);
                                break;
                            } else {
                                this.f6081a.m9758a(this.f6081a.f6098P, this.f6081a.getResources().getString(R.string.have_burglar_s1), R.drawable.money);
                                break;
                            }
                        }
                        this.f6081a.m9758a(this.f6081a.f6098P, this.f6081a.getResources().getString(R.string.have_burglar_s0), R.drawable.money);
                        break;
                    }
                    criminalSkillsActivity = this.f6081a;
                    criminalSkillsActivity.f6108c -= 500;
                    this.f6081a.f6129x = true;
                    criminalSkillsActivity = this.f6081a;
                    criminalSkillsActivity.f6111f++;
                    this.f6081a.m9760c();
                    this.f6081a.m9758a(this.f6081a.f6098P, this.f6081a.getResources().getString(R.string.have_burglar_s), R.drawable.money);
                    break;
                    break;
                case 5:
                    if (this.f6081a.f6108c < 2000 || this.f6081a.f6130y || !this.f6081a.f6129x) {
                        if (this.f6081a.f6129x) {
                            if (!this.f6081a.f6130y) {
                                this.f6081a.m9758a(this.f6081a.f6100R, this.f6081a.getResources().getString(R.string.no_cash), R.drawable.money);
                                break;
                            } else {
                                this.f6081a.m9758a(this.f6081a.f6099Q, this.f6081a.getResources().getString(R.string.have_master_s1), R.drawable.money);
                                break;
                            }
                        }
                        this.f6081a.m9758a(this.f6081a.f6099Q, this.f6081a.getResources().getString(R.string.have_master_s0), R.drawable.money);
                        break;
                    }
                    criminalSkillsActivity = this.f6081a;
                    criminalSkillsActivity.f6108c -= 2000;
                    this.f6081a.f6130y = true;
                    criminalSkillsActivity = this.f6081a;
                    criminalSkillsActivity.f6111f++;
                    this.f6081a.m9760c();
                    this.f6081a.m9758a(this.f6081a.f6099Q, this.f6081a.getResources().getString(R.string.have_master_s), R.drawable.money);
                    break;
            }
            this.f6081a.f6090H.setText("$" + String.format("%,d", new Object[]{Integer.valueOf(this.f6081a.f6108c)}).replace(',', ' '));
            this.f6081a.f6092J.setText("$" + String.format("%,d", new Object[]{Integer.valueOf(this.f6081a.f6109d)}).replace(',', ' '));
            this.f6081a.m9756f();
        }
    }

    class C19593 implements OnLoadCompleteListener {
        final /* synthetic */ CriminalSkillsActivity f6082a;

        C19593(CriminalSkillsActivity criminalSkillsActivity) {
            this.f6082a = criminalSkillsActivity;
        }

        public void onLoadComplete(SoundPool soundPool, int i, int i2) {
            Log.e("CriminalSkillsActivity", "Sound Loaded");
            this.f6082a.f6105W = true;
        }
    }

    private String m9753a(int i) {
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

    private void m9756f() {
        this.f6089G.m10163b();
        Bitmap decodeResource = this.f6125t ? BitmapFactory.decodeResource(getResources(), R.drawable.active) : BitmapFactory.decodeResource(getResources(), R.drawable.not_active);
        C2097j c2097j = new C2097j();
        c2097j.m10169a(getString(R.string.development_c_1));
        c2097j.m10171b(getString(R.string.development_c_1p));
        c2097j.m10168a(Bitmap.createScaledBitmap(decodeResource, decodeResource.getWidth(), decodeResource.getHeight(), false));
        this.f6089G.m10162a(c2097j);
        decodeResource = this.f6126u ? BitmapFactory.decodeResource(getResources(), R.drawable.active) : BitmapFactory.decodeResource(getResources(), R.drawable.not_active);
        c2097j = new C2097j();
        c2097j.m10169a(getString(R.string.development_c_2));
        c2097j.m10171b(getString(R.string.development_c_2p));
        c2097j.m10168a(Bitmap.createScaledBitmap(decodeResource, decodeResource.getWidth(), decodeResource.getHeight(), false));
        this.f6089G.m10162a(c2097j);
        decodeResource = this.f6127v ? BitmapFactory.decodeResource(getResources(), R.drawable.active) : BitmapFactory.decodeResource(getResources(), R.drawable.not_active);
        c2097j = new C2097j();
        c2097j.m10169a(getString(R.string.development_c_3));
        c2097j.m10171b(getString(R.string.development_c_3p));
        c2097j.m10168a(Bitmap.createScaledBitmap(decodeResource, decodeResource.getWidth(), decodeResource.getHeight(), false));
        this.f6089G.m10162a(c2097j);
        decodeResource = this.f6128w ? BitmapFactory.decodeResource(getResources(), R.drawable.active) : BitmapFactory.decodeResource(getResources(), R.drawable.not_active);
        c2097j = new C2097j();
        c2097j.m10169a(getString(R.string.development_c_4));
        c2097j.m10171b(getString(R.string.development_c_4p));
        c2097j.m10168a(Bitmap.createScaledBitmap(decodeResource, decodeResource.getWidth(), decodeResource.getHeight(), false));
        this.f6089G.m10162a(c2097j);
        decodeResource = this.f6129x ? BitmapFactory.decodeResource(getResources(), R.drawable.active) : BitmapFactory.decodeResource(getResources(), R.drawable.not_active);
        c2097j = new C2097j();
        c2097j.m10169a(getString(R.string.development_c_5));
        c2097j.m10171b(getString(R.string.development_c_5p));
        c2097j.m10168a(Bitmap.createScaledBitmap(decodeResource, decodeResource.getWidth(), decodeResource.getHeight(), false));
        this.f6089G.m10162a(c2097j);
        decodeResource = this.f6130y ? BitmapFactory.decodeResource(getResources(), R.drawable.active) : BitmapFactory.decodeResource(getResources(), R.drawable.not_active);
        c2097j = new C2097j();
        c2097j.m10169a(getString(R.string.development_c_6));
        c2097j.m10171b(getString(R.string.development_c_6p));
        c2097j.m10168a(Bitmap.createScaledBitmap(decodeResource, decodeResource.getWidth(), decodeResource.getHeight(), false));
        this.f6089G.m10162a(c2097j);
    }

    public void m9757a() {
        Editor edit = getApplicationContext().getSharedPreferences(getString(R.string.preference_file_key), 0).edit();
        edit.putString("CODES", this.f6107b);
        edit.putBoolean("VOLUME", this.f6083A);
        edit.putBoolean("A12C", this.f6131z);
        edit.putString("NAME", this.f6106a);
        edit.putInt("CASH", this.f6108c);
        edit.putInt("BANK", this.f6109d);
        edit.putInt("BANK_DAYS", this.f6110e);
        edit.putInt("AGE", this.f6111f);
        edit.putInt("HUNGER", this.f6112g);
        edit.putInt("HEALTH", this.f6113h);
        edit.putBoolean("BOX", this.f6114i);
        edit.putBoolean("BASEMENT", this.f6115j);
        edit.putInt("BASEMENT_DAYS", this.f6120o);
        edit.putBoolean("APARTMENT", this.f6116k);
        edit.putInt("APARTMENT_DAYS", this.f6121p);
        edit.putBoolean("HOUSE", this.f6117l);
        edit.putInt("HOUSE_NO", this.f6122q);
        edit.putBoolean("CONDO", this.f6118m);
        edit.putInt("CONDO_NO", this.f6123r);
        edit.putBoolean("MANSION", this.f6119n);
        edit.putInt("MANSION_NO", this.f6124s);
        edit.putBoolean("NOVICE", this.f6125t);
        edit.putBoolean("MOBSTER", this.f6126u);
        edit.putBoolean("HITMAN", this.f6127v);
        edit.putBoolean("PICKPOCKET", this.f6128w);
        edit.putBoolean("BURGLAR", this.f6129x);
        edit.putBoolean("MASTER", this.f6130y);
        edit.apply();
    }

    public void m9758a(Toast toast, String str, int i) {
        View inflate = getLayoutInflater().inflate(R.layout.toast_message, (ViewGroup) findViewById(R.id.toast_layout_root));
        ((ImageView) inflate.findViewById(R.id.toast_image)).setImageResource(i);
        ((TextView) inflate.findViewById(R.id.toast_text)).setText(str);
        if (toast.getView().getWindowVisibility() != 0) {
            Log.e("CriminalSkillsActivity", "Exists");
            toast.setDuration(0);
        }
        toast.setGravity(16, 0, 0);
        toast.setView(inflate);
        toast.show();
    }

    public void m9759b() {
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences(getString(R.string.preference_file_key), 0);
        this.f6107b = sharedPreferences.getString("CODES", "");
        this.f6083A = sharedPreferences.getBoolean("VOLUME", true);
        this.f6131z = sharedPreferences.getBoolean("A12C", false);
        this.f6106a = sharedPreferences.getString("NAME", "Unknown");
        this.f6108c = sharedPreferences.getInt("CASH", 0);
        this.f6109d = sharedPreferences.getInt("BANK", 0);
        this.f6110e = sharedPreferences.getInt("BANK_DAYS", 31);
        this.f6111f = sharedPreferences.getInt("AGE", 0);
        this.f6112g = sharedPreferences.getInt("HUNGER", 80);
        this.f6113h = sharedPreferences.getInt("HEALTH", 80);
        this.f6114i = sharedPreferences.getBoolean("BOX", true);
        this.f6115j = sharedPreferences.getBoolean("BASEMENT", false);
        this.f6120o = sharedPreferences.getInt("BASEMENT_DAYS", 0);
        this.f6116k = sharedPreferences.getBoolean("APARTMENT", false);
        this.f6121p = sharedPreferences.getInt("APARTMENT_DAYS", 0);
        this.f6117l = sharedPreferences.getBoolean("HOUSE", false);
        this.f6122q = sharedPreferences.getInt("HOUSE_NO", 0);
        this.f6118m = sharedPreferences.getBoolean("CONDO", false);
        this.f6123r = sharedPreferences.getInt("CONDO_NO", 0);
        this.f6119n = sharedPreferences.getBoolean("MANSION", false);
        this.f6124s = sharedPreferences.getInt("MANSION_NO", 0);
        this.f6125t = sharedPreferences.getBoolean("NOVICE", false);
        this.f6126u = sharedPreferences.getBoolean("MOBSTER", false);
        this.f6127v = sharedPreferences.getBoolean("HITMAN", false);
        this.f6128w = sharedPreferences.getBoolean("PICKPOCKET", false);
        this.f6129x = sharedPreferences.getBoolean("BURGLAR", false);
        this.f6130y = sharedPreferences.getBoolean("MASTER", false);
    }

    public void m9760c() {
        if (this.f6109d == 0) {
            this.f6110e = 31;
        } else if (this.f6109d >= 100 && this.f6110e > 1) {
            this.f6110e--;
        } else if (this.f6109d >= 100 && this.f6110e <= 1) {
            this.f6110e = 30;
            this.f6109d += this.f6109d / 100;
        }
        if (this.f6115j && this.f6120o >= 1) {
            this.f6120o--;
        }
        if (this.f6115j && this.f6120o == 0) {
            this.f6115j = false;
            this.f6120o = 0;
        }
        if (this.f6116k && this.f6121p >= 1) {
            this.f6121p--;
        }
        if (this.f6116k && this.f6121p == 0) {
            this.f6116k = false;
            this.f6121p = 0;
        }
    }

    public void m9761d() {
        if (this.f6083A) {
            this.f6101S = (AudioManager) getSystemService("audio");
            this.f6104V = ((float) this.f6101S.getStreamVolume(3)) / ((float) this.f6101S.getStreamMaxVolume(3));
            this.f6102T = new SoundPool(10, 3, 0);
            this.f6102T.setOnLoadCompleteListener(new C19593(this));
            this.f6103U = this.f6102T.load(this, R.raw.click, 1);
            return;
        }
        Log.e("CriminalSkillsActivity", "Sound Not Loaded");
        this.f6105W = false;
    }

    public void m9762e() {
        try {
            this.f6102T.play(this.f6103U, this.f6104V, this.f6104V, 1, 0, 1.0f);
        } catch (Exception e) {
            Log.e("CriminalSkillsActivity", "Error Playing Sound");
        }
    }

    public void goBack(View view) {
        m9762e();
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.e("CriminalSkillsActivity", "onCreate");
        setContentView(R.layout.activity_criminalskills);
        this.f6084B = Typeface.createFromAsset(getAssets(), "fonts/caviar_dreams.ttf");
        this.f6085C = Typeface.createFromAsset(getAssets(), "fonts/caviar_dreams_bold.ttf");
        this.f6094L = Toast.makeText(this, "", 0);
        this.f6095M = Toast.makeText(this, "", 0);
        this.f6096N = Toast.makeText(this, "", 0);
        this.f6097O = Toast.makeText(this, "", 0);
        this.f6098P = Toast.makeText(this, "", 0);
        this.f6099Q = Toast.makeText(this, "", 0);
        this.f6100R = Toast.makeText(this, "", 0);
        this.f6086D = (AdView) findViewById(R.id.adView);
        this.f6086D.setAdListener(new C19571(this));
        this.f6086D.m2048a(new C0472a().m2094a());
        this.f6091I = (TextView) findViewById(R.id.cash_title);
        this.f6091I.setTypeface(this.f6085C);
        this.f6090H = (TextView) findViewById(R.id.cash_amount);
        this.f6090H.setTypeface(this.f6084B);
        this.f6093K = (TextView) findViewById(R.id.bank_title);
        this.f6093K.setTypeface(this.f6085C);
        this.f6092J = (TextView) findViewById(R.id.bank_amount);
        this.f6092J.setTypeface(this.f6084B);
        this.f6087E = (Button) findViewById(R.id.back);
        this.f6087E.setTypeface(this.f6085C);
        this.f6088F = (ListView) findViewById(R.id.criminalskills_list);
        this.f6089G = new C2094h(this);
        this.f6088F.setAdapter(this.f6089G);
        this.f6088F.setOnItemClickListener(new C19582(this));
    }

    public void onDestroy() {
        super.onDestroy();
        Log.e("CriminalSkillsActivity", "onDestroy");
        if (this.f6086D != null) {
            this.f6086D.m2047a();
        }
    }

    protected void onPause() {
        super.onPause();
        Log.e("CriminalSkillsActivity", "onPause");
        if (this.f6086D != null) {
            this.f6086D.m2049b();
        }
        if (this.f6094L != null) {
            this.f6094L.cancel();
        }
        if (this.f6095M != null) {
            this.f6095M.cancel();
        }
        if (this.f6096N != null) {
            this.f6096N.cancel();
        }
        if (this.f6097O != null) {
            this.f6097O.cancel();
        }
        if (this.f6098P != null) {
            this.f6098P.cancel();
        }
        if (this.f6099Q != null) {
            this.f6099Q.cancel();
        }
        if (this.f6100R != null) {
            this.f6100R.cancel();
        }
        if (this.f6102T != null) {
            this.f6102T.unload(this.f6103U);
            this.f6102T.release();
            this.f6102T = null;
        }
        if (this.f6125t && this.f6126u && this.f6127v && this.f6128w && this.f6129x && this.f6130y) {
            this.f6131z = true;
        }
        m9757a();
    }

    public void onResume() {
        super.onResume();
        Log.e("CriminalSkillsActivity", "onResume");
        if (this.f6086D != null) {
            this.f6086D.m2050c();
        }
        m9759b();
        m9761d();
        m9756f();
        this.f6090H.setText("$" + String.format("%,d", new Object[]{Integer.valueOf(this.f6108c)}).replace(',', ' '));
        this.f6092J.setText("$" + String.format("%,d", new Object[]{Integer.valueOf(this.f6109d)}).replace(',', ' '));
    }
}
