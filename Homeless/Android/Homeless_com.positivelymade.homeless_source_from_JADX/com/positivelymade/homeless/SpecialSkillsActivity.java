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

public class SpecialSkillsActivity extends Activity {
    public boolean f6688A;
    public Typeface f6689B;
    public Typeface f6690C;
    public AdView f6691D;
    public Button f6692E;
    public ListView f6693F;
    public C2096i f6694G;
    public TextView f6695H;
    public TextView f6696I;
    public TextView f6697J;
    public TextView f6698K;
    public Toast f6699L;
    public Toast f6700M;
    public Toast f6701N;
    public Toast f6702O;
    public Toast f6703P;
    public Toast f6704Q;
    public Toast f6705R;
    public AudioManager f6706S;
    public SoundPool f6707T;
    public int f6708U;
    public float f6709V;
    public boolean f6710W;
    public String f6711a;
    public String f6712b;
    public int f6713c;
    public int f6714d;
    public int f6715e;
    public int f6716f;
    public int f6717g;
    public int f6718h;
    public boolean f6719i;
    public boolean f6720j;
    public boolean f6721k;
    public boolean f6722l;
    public boolean f6723m;
    public boolean f6724n;
    public int f6725o;
    public int f6726p;
    public int f6727q;
    public int f6728r;
    public int f6729s;
    public boolean f6730t;
    public boolean f6731u;
    public boolean f6732v;
    public boolean f6733w;
    public boolean f6734x;
    public boolean f6735y;
    public boolean f6736z;

    class C20171 extends C0427a {
        final /* synthetic */ SpecialSkillsActivity f6685a;

        C20171(SpecialSkillsActivity specialSkillsActivity) {
            this.f6685a = specialSkillsActivity;
        }

        public void mo322a() {
            Log.e("SpecialSkillsActivity", "Google onAdLoaded");
        }

        public void mo323a(int i) {
            Log.e("SpecialSkillsActivity", "Google onAdFailedToLoad: " + this.f6685a.m9971a(i));
        }

        public void mo324b() {
            Log.e("SpecialSkillsActivity", "Google onAdOpened");
        }

        public void mo325c() {
            Log.e("SpecialSkillsActivity", "Google onAdClosed");
        }

        public void mo326d() {
            Log.d("SpecialSkillsActivity", "Google onAdLeftApplication");
        }
    }

    class C20182 implements OnItemClickListener {
        final /* synthetic */ SpecialSkillsActivity f6686a;

        C20182(SpecialSkillsActivity specialSkillsActivity) {
            this.f6686a = specialSkillsActivity;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            String b = ((C2097j) this.f6686a.f6694G.m10164a().get(i)).m10170b();
            int i2 = -1;
            switch (b.hashCode()) {
                case 1123023:
                    if (b.equals("$300")) {
                        i2 = 0;
                        break;
                    }
                    break;
                case 1127828:
                    if (b.equals("$800")) {
                        boolean z = true;
                        break;
                    }
                    break;
                case 34932925:
                    if (b.equals("$7000")) {
                        i2 = 2;
                        break;
                    }
                    break;
                case 1077439179:
                    if (b.equals("$12000")) {
                        i2 = 3;
                        break;
                    }
                    break;
                case 1077468970:
                    if (b.equals("$13000")) {
                        i2 = 4;
                        break;
                    }
                    break;
                case 1078452073:
                    if (b.equals("$25000")) {
                        i2 = 5;
                        break;
                    }
                    break;
            }
            SpecialSkillsActivity specialSkillsActivity;
            switch (i2) {
                case 0:
                    if (this.f6686a.f6713c < 300 || this.f6686a.f6730t) {
                        if (!this.f6686a.f6730t) {
                            this.f6686a.m9976a(this.f6686a.f6705R, this.f6686a.getResources().getString(R.string.no_cash), R.drawable.money);
                            break;
                        } else {
                            this.f6686a.m9976a(this.f6686a.f6699L, this.f6686a.getResources().getString(R.string.have_driving_s1), R.drawable.money);
                            break;
                        }
                    }
                    specialSkillsActivity = this.f6686a;
                    specialSkillsActivity.f6713c -= 300;
                    this.f6686a.f6730t = true;
                    specialSkillsActivity = this.f6686a;
                    specialSkillsActivity.f6716f++;
                    this.f6686a.m9978c();
                    this.f6686a.m9976a(this.f6686a.f6699L, this.f6686a.getResources().getString(R.string.have_driving_s), R.drawable.money);
                    break;
                    break;
                case 1:
                    if (this.f6686a.f6713c < 800 || this.f6686a.f6731u) {
                        if (!this.f6686a.f6731u) {
                            this.f6686a.m9976a(this.f6686a.f6705R, this.f6686a.getResources().getString(R.string.no_cash), R.drawable.money);
                            break;
                        } else {
                            this.f6686a.m9976a(this.f6686a.f6700M, this.f6686a.getResources().getString(R.string.have_liquor_s1), R.drawable.money);
                            break;
                        }
                    }
                    specialSkillsActivity = this.f6686a;
                    specialSkillsActivity.f6713c -= 800;
                    this.f6686a.f6731u = true;
                    specialSkillsActivity = this.f6686a;
                    specialSkillsActivity.f6716f++;
                    this.f6686a.m9978c();
                    this.f6686a.m9976a(this.f6686a.f6700M, this.f6686a.getResources().getString(R.string.have_liquor_s), R.drawable.money);
                    break;
                case 2:
                    if (this.f6686a.f6713c < 7000 || this.f6686a.f6732v) {
                        if (!this.f6686a.f6732v) {
                            this.f6686a.m9976a(this.f6686a.f6705R, this.f6686a.getResources().getString(R.string.no_cash), R.drawable.money);
                            break;
                        } else {
                            this.f6686a.m9976a(this.f6686a.f6701N, this.f6686a.getResources().getString(R.string.have_business_s1), R.drawable.money);
                            break;
                        }
                    }
                    specialSkillsActivity = this.f6686a;
                    specialSkillsActivity.f6713c -= 7000;
                    this.f6686a.f6732v = true;
                    specialSkillsActivity = this.f6686a;
                    specialSkillsActivity.f6716f++;
                    this.f6686a.m9978c();
                    this.f6686a.m9976a(this.f6686a.f6701N, this.f6686a.getResources().getString(R.string.have_business_s), R.drawable.money);
                    break;
                case 3:
                    if (this.f6686a.f6713c < 12000 || this.f6686a.f6733w) {
                        if (!this.f6686a.f6733w) {
                            this.f6686a.m9976a(this.f6686a.f6705R, this.f6686a.getResources().getString(R.string.no_cash), R.drawable.money);
                            break;
                        } else {
                            this.f6686a.m9976a(this.f6686a.f6702O, this.f6686a.getResources().getString(R.string.have_laws_s1), R.drawable.money);
                            break;
                        }
                    }
                    specialSkillsActivity = this.f6686a;
                    specialSkillsActivity.f6713c -= 12000;
                    this.f6686a.f6733w = true;
                    specialSkillsActivity = this.f6686a;
                    specialSkillsActivity.f6716f++;
                    this.f6686a.m9978c();
                    this.f6686a.m9976a(this.f6686a.f6702O, this.f6686a.getResources().getString(R.string.have_laws_s), R.drawable.money);
                    break;
                case 4:
                    if (this.f6686a.f6713c < 13000 || this.f6686a.f6734x) {
                        if (!this.f6686a.f6734x) {
                            this.f6686a.m9976a(this.f6686a.f6705R, this.f6686a.getResources().getString(R.string.no_cash), R.drawable.money);
                            break;
                        } else {
                            this.f6686a.m9976a(this.f6686a.f6703P, this.f6686a.getResources().getString(R.string.have_accounting_s1), R.drawable.money);
                            break;
                        }
                    }
                    specialSkillsActivity = this.f6686a;
                    specialSkillsActivity.f6713c -= 13000;
                    this.f6686a.f6734x = true;
                    specialSkillsActivity = this.f6686a;
                    specialSkillsActivity.f6716f++;
                    this.f6686a.m9978c();
                    this.f6686a.m9976a(this.f6686a.f6703P, this.f6686a.getResources().getString(R.string.have_accounting_s), R.drawable.money);
                    break;
                case 5:
                    if (this.f6686a.f6713c < 25000 || this.f6686a.f6735y) {
                        if (!this.f6686a.f6735y) {
                            this.f6686a.m9976a(this.f6686a.f6705R, this.f6686a.getResources().getString(R.string.no_cash), R.drawable.money);
                            break;
                        } else {
                            this.f6686a.m9976a(this.f6686a.f6704Q, this.f6686a.getResources().getString(R.string.have_management_s1), R.drawable.money);
                            break;
                        }
                    }
                    specialSkillsActivity = this.f6686a;
                    specialSkillsActivity.f6713c -= 25000;
                    this.f6686a.f6735y = true;
                    specialSkillsActivity = this.f6686a;
                    specialSkillsActivity.f6716f++;
                    this.f6686a.m9978c();
                    this.f6686a.m9976a(this.f6686a.f6704Q, this.f6686a.getResources().getString(R.string.have_management_s), R.drawable.money);
                    break;
                    break;
            }
            this.f6686a.f6695H.setText("$" + String.format("%,d", new Object[]{Integer.valueOf(this.f6686a.f6713c)}).replace(',', ' '));
            this.f6686a.f6697J.setText("$" + String.format("%,d", new Object[]{Integer.valueOf(this.f6686a.f6714d)}).replace(',', ' '));
            this.f6686a.m9974f();
        }
    }

    class C20193 implements OnLoadCompleteListener {
        final /* synthetic */ SpecialSkillsActivity f6687a;

        C20193(SpecialSkillsActivity specialSkillsActivity) {
            this.f6687a = specialSkillsActivity;
        }

        public void onLoadComplete(SoundPool soundPool, int i, int i2) {
            Log.e("SpecialSkillsActivity", "Sound Loaded");
            this.f6687a.f6710W = true;
        }
    }

    private String m9971a(int i) {
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

    private void m9974f() {
        this.f6694G.m10166b();
        Bitmap decodeResource = this.f6730t ? BitmapFactory.decodeResource(getResources(), R.drawable.active) : BitmapFactory.decodeResource(getResources(), R.drawable.not_active);
        C2097j c2097j = new C2097j();
        c2097j.m10169a(getString(R.string.development_s_1));
        c2097j.m10171b(getString(R.string.development_s_1p));
        c2097j.m10168a(Bitmap.createScaledBitmap(decodeResource, decodeResource.getWidth(), decodeResource.getHeight(), false));
        this.f6694G.m10165a(c2097j);
        decodeResource = this.f6731u ? BitmapFactory.decodeResource(getResources(), R.drawable.active) : BitmapFactory.decodeResource(getResources(), R.drawable.not_active);
        c2097j = new C2097j();
        c2097j.m10169a(getString(R.string.development_s_2));
        c2097j.m10171b(getString(R.string.development_s_2p));
        c2097j.m10168a(Bitmap.createScaledBitmap(decodeResource, decodeResource.getWidth(), decodeResource.getHeight(), false));
        this.f6694G.m10165a(c2097j);
        decodeResource = this.f6732v ? BitmapFactory.decodeResource(getResources(), R.drawable.active) : BitmapFactory.decodeResource(getResources(), R.drawable.not_active);
        c2097j = new C2097j();
        c2097j.m10169a(getString(R.string.development_s_3));
        c2097j.m10171b(getString(R.string.development_s_3p));
        c2097j.m10168a(Bitmap.createScaledBitmap(decodeResource, decodeResource.getWidth(), decodeResource.getHeight(), false));
        this.f6694G.m10165a(c2097j);
        decodeResource = this.f6733w ? BitmapFactory.decodeResource(getResources(), R.drawable.active) : BitmapFactory.decodeResource(getResources(), R.drawable.not_active);
        c2097j = new C2097j();
        c2097j.m10169a(getString(R.string.development_s_4));
        c2097j.m10171b(getString(R.string.development_s_4p));
        c2097j.m10168a(Bitmap.createScaledBitmap(decodeResource, decodeResource.getWidth(), decodeResource.getHeight(), false));
        this.f6694G.m10165a(c2097j);
        decodeResource = this.f6734x ? BitmapFactory.decodeResource(getResources(), R.drawable.active) : BitmapFactory.decodeResource(getResources(), R.drawable.not_active);
        c2097j = new C2097j();
        c2097j.m10169a(getString(R.string.development_s_5));
        c2097j.m10171b(getString(R.string.development_s_5p));
        c2097j.m10168a(Bitmap.createScaledBitmap(decodeResource, decodeResource.getWidth(), decodeResource.getHeight(), false));
        this.f6694G.m10165a(c2097j);
        decodeResource = this.f6735y ? BitmapFactory.decodeResource(getResources(), R.drawable.active) : BitmapFactory.decodeResource(getResources(), R.drawable.not_active);
        c2097j = new C2097j();
        c2097j.m10169a(getString(R.string.development_s_6));
        c2097j.m10171b(getString(R.string.development_s_6p));
        c2097j.m10168a(Bitmap.createScaledBitmap(decodeResource, decodeResource.getWidth(), decodeResource.getHeight(), false));
        this.f6694G.m10165a(c2097j);
    }

    public void m9975a() {
        Editor edit = getApplicationContext().getSharedPreferences(getString(R.string.preference_file_key), 0).edit();
        edit.putString("CODES", this.f6712b);
        edit.putBoolean("VOLUME", this.f6688A);
        edit.putBoolean("A12S", this.f6736z);
        edit.putString("NAME", this.f6711a);
        edit.putInt("CASH", this.f6713c);
        edit.putInt("BANK", this.f6714d);
        edit.putInt("BANK_DAYS", this.f6715e);
        edit.putInt("AGE", this.f6716f);
        edit.putInt("HUNGER", this.f6717g);
        edit.putInt("HEALTH", this.f6718h);
        edit.putBoolean("BOX", this.f6719i);
        edit.putBoolean("BASEMENT", this.f6720j);
        edit.putInt("BASEMENT_DAYS", this.f6725o);
        edit.putBoolean("APARTMENT", this.f6721k);
        edit.putInt("APARTMENT_DAYS", this.f6726p);
        edit.putBoolean("HOUSE", this.f6722l);
        edit.putInt("HOUSE_NO", this.f6727q);
        edit.putBoolean("CONDO", this.f6723m);
        edit.putInt("CONDO_NO", this.f6728r);
        edit.putBoolean("MANSION", this.f6724n);
        edit.putInt("MANSION_NO", this.f6729s);
        edit.putBoolean("DRIVING", this.f6730t);
        edit.putBoolean("LIQUOR", this.f6731u);
        edit.putBoolean("BUSINESS", this.f6732v);
        edit.putBoolean("LAWS", this.f6733w);
        edit.putBoolean("ACCOUNTING", this.f6734x);
        edit.putBoolean("MANAGEMENT", this.f6735y);
        edit.apply();
    }

    public void m9976a(Toast toast, String str, int i) {
        View inflate = getLayoutInflater().inflate(R.layout.toast_message, (ViewGroup) findViewById(R.id.toast_layout_root));
        ((ImageView) inflate.findViewById(R.id.toast_image)).setImageResource(i);
        ((TextView) inflate.findViewById(R.id.toast_text)).setText(str);
        if (toast.getView().getWindowVisibility() != 0) {
            Log.e("SpecialSkillsActivity", "Exists");
            toast.setDuration(0);
        }
        toast.setGravity(16, 0, 0);
        toast.setView(inflate);
        toast.show();
    }

    public void m9977b() {
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences(getString(R.string.preference_file_key), 0);
        this.f6712b = sharedPreferences.getString("CODES", "");
        this.f6688A = sharedPreferences.getBoolean("VOLUME", true);
        this.f6736z = sharedPreferences.getBoolean("A12S", false);
        this.f6711a = sharedPreferences.getString("NAME", "Unknown");
        this.f6713c = sharedPreferences.getInt("CASH", 0);
        this.f6714d = sharedPreferences.getInt("BANK", 0);
        this.f6715e = sharedPreferences.getInt("BANK_DAYS", 31);
        this.f6716f = sharedPreferences.getInt("AGE", 0);
        this.f6717g = sharedPreferences.getInt("HUNGER", 80);
        this.f6718h = sharedPreferences.getInt("HEALTH", 80);
        this.f6719i = sharedPreferences.getBoolean("BOX", true);
        this.f6720j = sharedPreferences.getBoolean("BASEMENT", false);
        this.f6725o = sharedPreferences.getInt("BASEMENT_DAYS", 0);
        this.f6721k = sharedPreferences.getBoolean("APARTMENT", false);
        this.f6726p = sharedPreferences.getInt("APARTMENT_DAYS", 0);
        this.f6722l = sharedPreferences.getBoolean("HOUSE", false);
        this.f6727q = sharedPreferences.getInt("HOUSE_NO", 0);
        this.f6723m = sharedPreferences.getBoolean("CONDO", false);
        this.f6728r = sharedPreferences.getInt("CONDO_NO", 0);
        this.f6724n = sharedPreferences.getBoolean("MANSION", false);
        this.f6729s = sharedPreferences.getInt("MANSION_NO", 0);
        this.f6730t = sharedPreferences.getBoolean("DRIVING", false);
        this.f6731u = sharedPreferences.getBoolean("LIQUOR", false);
        this.f6732v = sharedPreferences.getBoolean("BUSINESS", false);
        this.f6733w = sharedPreferences.getBoolean("LAWS", false);
        this.f6734x = sharedPreferences.getBoolean("ACCOUNTING", false);
        this.f6735y = sharedPreferences.getBoolean("MANAGEMENT", false);
    }

    public void m9978c() {
        if (this.f6714d == 0) {
            this.f6715e = 31;
        } else if (this.f6714d >= 100 && this.f6715e > 1) {
            this.f6715e--;
        } else if (this.f6714d >= 100 && this.f6715e <= 1) {
            this.f6715e = 30;
            this.f6714d += this.f6714d / 100;
        }
        if (this.f6720j && this.f6725o >= 1) {
            this.f6725o--;
        }
        if (this.f6720j && this.f6725o == 0) {
            this.f6720j = false;
            this.f6725o = 0;
        }
        if (this.f6721k && this.f6726p >= 1) {
            this.f6726p--;
        }
        if (this.f6721k && this.f6726p == 0) {
            this.f6721k = false;
            this.f6726p = 0;
        }
    }

    public void m9979d() {
        if (this.f6688A) {
            this.f6706S = (AudioManager) getSystemService("audio");
            this.f6709V = ((float) this.f6706S.getStreamVolume(3)) / ((float) this.f6706S.getStreamMaxVolume(3));
            this.f6707T = new SoundPool(10, 3, 0);
            this.f6707T.setOnLoadCompleteListener(new C20193(this));
            this.f6708U = this.f6707T.load(this, R.raw.click, 1);
            return;
        }
        Log.e("SpecialSkillsActivity", "Sound Not Loaded");
        this.f6710W = false;
    }

    public void m9980e() {
        try {
            this.f6707T.play(this.f6708U, this.f6709V, this.f6709V, 1, 0, 1.0f);
        } catch (Exception e) {
            Log.e("SpecialSkillsActivity", "Error Playing Sound");
        }
    }

    public void goBack(View view) {
        m9980e();
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.e("SpecialSkillsActivity", "onCreate");
        setContentView(R.layout.activity_education);
        this.f6689B = Typeface.createFromAsset(getAssets(), "fonts/caviar_dreams.ttf");
        this.f6690C = Typeface.createFromAsset(getAssets(), "fonts/caviar_dreams_bold.ttf");
        this.f6699L = Toast.makeText(this, "", 0);
        this.f6700M = Toast.makeText(this, "", 0);
        this.f6701N = Toast.makeText(this, "", 0);
        this.f6702O = Toast.makeText(this, "", 0);
        this.f6703P = Toast.makeText(this, "", 0);
        this.f6704Q = Toast.makeText(this, "", 0);
        this.f6705R = Toast.makeText(this, "", 0);
        this.f6691D = (AdView) findViewById(R.id.adView);
        this.f6691D.setAdListener(new C20171(this));
        this.f6691D.m2048a(new C0472a().m2094a());
        this.f6696I = (TextView) findViewById(R.id.cash_title);
        this.f6696I.setTypeface(this.f6690C);
        this.f6695H = (TextView) findViewById(R.id.cash_amount);
        this.f6695H.setTypeface(this.f6689B);
        this.f6698K = (TextView) findViewById(R.id.bank_title);
        this.f6698K.setTypeface(this.f6690C);
        this.f6697J = (TextView) findViewById(R.id.bank_amount);
        this.f6697J.setTypeface(this.f6689B);
        this.f6692E = (Button) findViewById(R.id.back);
        this.f6692E.setTypeface(this.f6690C);
        this.f6693F = (ListView) findViewById(R.id.education_list);
        this.f6694G = new C2096i(this);
        this.f6693F.setAdapter(this.f6694G);
        this.f6693F.setOnItemClickListener(new C20182(this));
    }

    public void onDestroy() {
        super.onDestroy();
        Log.e("SpecialSkillsActivity", "onDestroy");
        if (this.f6691D != null) {
            this.f6691D.m2047a();
        }
    }

    protected void onPause() {
        super.onPause();
        Log.e("SpecialSkillsActivity", "onPause");
        if (this.f6691D != null) {
            this.f6691D.m2049b();
        }
        if (this.f6699L != null) {
            this.f6699L.cancel();
        }
        if (this.f6700M != null) {
            this.f6700M.cancel();
        }
        if (this.f6701N != null) {
            this.f6701N.cancel();
        }
        if (this.f6702O != null) {
            this.f6702O.cancel();
        }
        if (this.f6703P != null) {
            this.f6703P.cancel();
        }
        if (this.f6704Q != null) {
            this.f6704Q.cancel();
        }
        if (this.f6705R != null) {
            this.f6705R.cancel();
        }
        if (this.f6707T != null) {
            this.f6707T.unload(this.f6708U);
            this.f6707T.release();
            this.f6707T = null;
        }
        if (this.f6730t && this.f6731u && this.f6732v && this.f6733w && this.f6734x && this.f6735y) {
            this.f6736z = true;
        }
        m9975a();
    }

    public void onResume() {
        super.onResume();
        Log.e("SpecialSkillsActivity", "onResume");
        if (this.f6691D != null) {
            this.f6691D.m2050c();
        }
        m9977b();
        m9979d();
        m9974f();
        this.f6695H.setText("$" + String.format("%,d", new Object[]{Integer.valueOf(this.f6713c)}).replace(',', ' '));
        this.f6697J.setText("$" + String.format("%,d", new Object[]{Integer.valueOf(this.f6714d)}).replace(',', ' '));
    }
}
