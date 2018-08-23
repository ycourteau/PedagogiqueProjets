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

public class WeaponActivity extends Activity {
    public int f6882A;
    public int f6883B;
    public int f6884C;
    public int f6885D;
    public int f6886E;
    public int f6887F;
    public boolean f6888G;
    public boolean f6889H;
    public Typeface f6890I;
    public Typeface f6891J;
    public AdView f6892K;
    public Button f6893L;
    public ListView f6894M;
    public C2105o f6895N;
    public TextView f6896O;
    public TextView f6897P;
    public TextView f6898Q;
    public TextView f6899R;
    public Toast f6900S;
    public Toast f6901T;
    public Toast f6902U;
    public Toast f6903V;
    public Toast f6904W;
    public Toast f6905X;
    public Toast f6906Y;
    public AudioManager f6907Z;
    public String f6908a;
    public SoundPool aa;
    public int ab;
    public float ac;
    public boolean ad;
    public String f6909b;
    public String f6910c;
    public int f6911d;
    public int f6912e;
    public int f6913f;
    public int f6914g;
    public int f6915h;
    public int f6916i;
    public boolean f6917j;
    public boolean f6918k;
    public boolean f6919l;
    public boolean f6920m;
    public boolean f6921n;
    public boolean f6922o;
    public int f6923p;
    public int f6924q;
    public int f6925r;
    public int f6926s;
    public int f6927t;
    public boolean f6928u;
    public boolean f6929v;
    public boolean f6930w;
    public boolean f6931x;
    public boolean f6932y;
    public boolean f6933z;

    class C20381 extends C0427a {
        final /* synthetic */ WeaponActivity f6879a;

        C20381(WeaponActivity weaponActivity) {
            this.f6879a = weaponActivity;
        }

        public void mo322a() {
            Log.e("WeaponActivity", "Google onAdLoaded");
        }

        public void mo323a(int i) {
            Log.e("WeaponActivity", "Google onAdFailedToLoad: " + this.f6879a.m10044a(i));
        }

        public void mo324b() {
            Log.e("WeaponActivity", "Google onAdOpened");
        }

        public void mo325c() {
            Log.e("WeaponActivity", "Google onAdClosed");
        }

        public void mo326d() {
            Log.d("WeaponActivity", "Google onAdLeftApplication");
        }
    }

    class C20392 implements OnItemClickListener {
        final /* synthetic */ WeaponActivity f6880a;

        C20392(WeaponActivity weaponActivity) {
            this.f6880a = weaponActivity;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            String b = ((C2106p) this.f6880a.f6895N.m10187a().get(i)).m10193b();
            boolean z = true;
            switch (b.hashCode()) {
                case 36194:
                    if (b.equals("$20")) {
                        z = false;
                        break;
                    }
                    break;
                case 1123023:
                    if (b.equals("$300")) {
                        z = true;
                        break;
                    }
                    break;
                case 1127828:
                    if (b.equals("$800")) {
                        z = true;
                        break;
                    }
                    break;
                case 34756101:
                    if (b.equals("$1200")) {
                        z = true;
                        break;
                    }
                    break;
                case 34813761:
                    if (b.equals("$3000")) {
                        z = true;
                        break;
                    }
                    break;
                case 34873343:
                    if (b.equals("$5000")) {
                        z = true;
                        break;
                    }
                    break;
            }
            WeaponActivity weaponActivity;
            switch (z) {
                case false:
                    if (this.f6880a.f6911d < 20) {
                        if (this.f6880a.f6882A != 1) {
                            if (this.f6880a.f6882A <= 1) {
                                this.f6880a.m10049a(this.f6880a.f6906Y, this.f6880a.getResources().getString(R.string.no_cash), R.drawable.money);
                                break;
                            } else {
                                this.f6880a.m10049a(this.f6880a.f6900S, this.f6880a.getResources().getString(R.string.no_cash) + "\n\n" + this.f6880a.getResources().getString(R.string.have_knife_s) + this.f6880a.f6882A + this.f6880a.getResources().getString(R.string.have_knife_e2), R.drawable.money);
                                break;
                            }
                        }
                        this.f6880a.m10049a(this.f6880a.f6900S, this.f6880a.getResources().getString(R.string.no_cash) + "\n\n" + this.f6880a.getResources().getString(R.string.have_knife_s) + this.f6880a.f6882A + this.f6880a.getResources().getString(R.string.have_knife_e1), R.drawable.money);
                        break;
                    }
                    weaponActivity = this.f6880a;
                    weaponActivity.f6911d -= 20;
                    weaponActivity = this.f6880a;
                    weaponActivity.f6882A++;
                    this.f6880a.f6928u = true;
                    weaponActivity = this.f6880a;
                    weaponActivity.f6914g++;
                    this.f6880a.m10051c();
                    if (this.f6880a.f6882A != 1) {
                        this.f6880a.m10049a(this.f6880a.f6900S, this.f6880a.getResources().getString(R.string.have_knife_s) + this.f6880a.f6882A + this.f6880a.getResources().getString(R.string.have_knife_e2), R.drawable.money);
                        break;
                    } else {
                        this.f6880a.m10049a(this.f6880a.f6900S, this.f6880a.getResources().getString(R.string.have_knife_s) + this.f6880a.f6882A + this.f6880a.getResources().getString(R.string.have_knife_e1), R.drawable.money);
                        break;
                    }
                case true:
                    if (this.f6880a.f6911d < 300) {
                        if (this.f6880a.f6883B != 1) {
                            if (this.f6880a.f6883B <= 1) {
                                this.f6880a.m10049a(this.f6880a.f6906Y, this.f6880a.getResources().getString(R.string.no_cash), R.drawable.money);
                                break;
                            } else {
                                this.f6880a.m10049a(this.f6880a.f6901T, this.f6880a.getResources().getString(R.string.no_cash) + "\n\n" + this.f6880a.getResources().getString(R.string.have_gun_s) + this.f6880a.f6883B + this.f6880a.getResources().getString(R.string.have_gun_e2), R.drawable.money);
                                break;
                            }
                        }
                        this.f6880a.m10049a(this.f6880a.f6901T, this.f6880a.getResources().getString(R.string.no_cash) + "\n\n" + this.f6880a.getResources().getString(R.string.have_gun_s) + this.f6880a.f6883B + this.f6880a.getResources().getString(R.string.have_gun_e1), R.drawable.money);
                        break;
                    }
                    weaponActivity = this.f6880a;
                    weaponActivity.f6911d -= 300;
                    weaponActivity = this.f6880a;
                    weaponActivity.f6883B++;
                    this.f6880a.f6929v = true;
                    weaponActivity = this.f6880a;
                    weaponActivity.f6914g++;
                    this.f6880a.m10051c();
                    if (this.f6880a.f6883B != 1) {
                        this.f6880a.m10049a(this.f6880a.f6901T, this.f6880a.getResources().getString(R.string.have_gun_s) + this.f6880a.f6883B + this.f6880a.getResources().getString(R.string.have_gun_e2), R.drawable.money);
                        break;
                    } else {
                        this.f6880a.m10049a(this.f6880a.f6901T, this.f6880a.getResources().getString(R.string.have_gun_s) + this.f6880a.f6883B + this.f6880a.getResources().getString(R.string.have_gun_e1), R.drawable.money);
                        break;
                    }
                case true:
                    if (this.f6880a.f6911d < 800) {
                        if (this.f6880a.f6884C != 1) {
                            if (this.f6880a.f6884C <= 1) {
                                this.f6880a.m10049a(this.f6880a.f6906Y, this.f6880a.getResources().getString(R.string.no_cash), R.drawable.money);
                                break;
                            } else {
                                this.f6880a.m10049a(this.f6880a.f6902U, this.f6880a.getResources().getString(R.string.no_cash) + "\n\n" + this.f6880a.getResources().getString(R.string.have_shotgun_s) + this.f6880a.f6884C + this.f6880a.getResources().getString(R.string.have_shotgun_e2), R.drawable.money);
                                break;
                            }
                        }
                        this.f6880a.m10049a(this.f6880a.f6902U, this.f6880a.getResources().getString(R.string.no_cash) + "\n\n" + this.f6880a.getResources().getString(R.string.have_shotgun_s) + this.f6880a.f6884C + this.f6880a.getResources().getString(R.string.have_shotgun_e1), R.drawable.money);
                        break;
                    }
                    weaponActivity = this.f6880a;
                    weaponActivity.f6911d -= 800;
                    weaponActivity = this.f6880a;
                    weaponActivity.f6884C++;
                    this.f6880a.f6930w = true;
                    weaponActivity = this.f6880a;
                    weaponActivity.f6914g++;
                    this.f6880a.m10051c();
                    if (this.f6880a.f6884C != 1) {
                        this.f6880a.m10049a(this.f6880a.f6902U, this.f6880a.getResources().getString(R.string.have_shotgun_s) + this.f6880a.f6884C + this.f6880a.getResources().getString(R.string.have_shotgun_e2), R.drawable.money);
                        break;
                    } else {
                        this.f6880a.m10049a(this.f6880a.f6902U, this.f6880a.getResources().getString(R.string.have_shotgun_s) + this.f6880a.f6884C + this.f6880a.getResources().getString(R.string.have_shotgun_e1), R.drawable.money);
                        break;
                    }
                case true:
                    if (this.f6880a.f6911d < 1200) {
                        if (this.f6880a.f6885D != 1) {
                            if (this.f6880a.f6885D <= 1) {
                                this.f6880a.m10049a(this.f6880a.f6906Y, this.f6880a.getResources().getString(R.string.no_cash), R.drawable.money);
                                break;
                            } else {
                                this.f6880a.m10049a(this.f6880a.f6903V, this.f6880a.getResources().getString(R.string.no_cash) + "\n\n" + this.f6880a.getResources().getString(R.string.have_rifle_s) + this.f6880a.f6885D + this.f6880a.getResources().getString(R.string.have_rifle_e2), R.drawable.money);
                                break;
                            }
                        }
                        this.f6880a.m10049a(this.f6880a.f6903V, this.f6880a.getResources().getString(R.string.no_cash) + "\n\n" + this.f6880a.getResources().getString(R.string.have_rifle_s) + this.f6880a.f6885D + this.f6880a.getResources().getString(R.string.have_rifle_e1), R.drawable.money);
                        break;
                    }
                    weaponActivity = this.f6880a;
                    weaponActivity.f6911d -= 1200;
                    weaponActivity = this.f6880a;
                    weaponActivity.f6885D++;
                    this.f6880a.f6931x = true;
                    weaponActivity = this.f6880a;
                    weaponActivity.f6914g++;
                    this.f6880a.m10051c();
                    if (this.f6880a.f6885D != 1) {
                        this.f6880a.m10049a(this.f6880a.f6903V, this.f6880a.getResources().getString(R.string.have_rifle_s) + this.f6880a.f6885D + this.f6880a.getResources().getString(R.string.have_rifle_e2), R.drawable.money);
                        break;
                    } else {
                        this.f6880a.m10049a(this.f6880a.f6903V, this.f6880a.getResources().getString(R.string.have_rifle_s) + this.f6880a.f6885D + this.f6880a.getResources().getString(R.string.have_rifle_e1), R.drawable.money);
                        break;
                    }
                case true:
                    if (this.f6880a.f6911d < 3000) {
                        if (this.f6880a.f6886E != 1) {
                            if (this.f6880a.f6886E <= 1) {
                                this.f6880a.m10049a(this.f6880a.f6906Y, this.f6880a.getResources().getString(R.string.no_cash), R.drawable.money);
                                break;
                            } else {
                                this.f6880a.m10049a(this.f6880a.f6904W, this.f6880a.getResources().getString(R.string.no_cash) + "\n\n" + this.f6880a.getResources().getString(R.string.have_vest_s) + this.f6880a.f6886E + this.f6880a.getResources().getString(R.string.have_vest_e2), R.drawable.money);
                                break;
                            }
                        }
                        this.f6880a.m10049a(this.f6880a.f6904W, this.f6880a.getResources().getString(R.string.no_cash) + "\n\n" + this.f6880a.getResources().getString(R.string.have_vest_s) + this.f6880a.f6886E + this.f6880a.getResources().getString(R.string.have_vest_e1), R.drawable.money);
                        break;
                    }
                    weaponActivity = this.f6880a;
                    weaponActivity.f6911d -= 3000;
                    weaponActivity = this.f6880a;
                    weaponActivity.f6886E++;
                    this.f6880a.f6932y = true;
                    weaponActivity = this.f6880a;
                    weaponActivity.f6914g++;
                    this.f6880a.m10051c();
                    if (this.f6880a.f6886E != 1) {
                        this.f6880a.m10049a(this.f6880a.f6904W, this.f6880a.getResources().getString(R.string.have_vest_s) + this.f6880a.f6886E + this.f6880a.getResources().getString(R.string.have_vest_e2), R.drawable.money);
                        break;
                    } else {
                        this.f6880a.m10049a(this.f6880a.f6904W, this.f6880a.getResources().getString(R.string.have_vest_s) + this.f6880a.f6886E + this.f6880a.getResources().getString(R.string.have_vest_e1), R.drawable.money);
                        break;
                    }
                case true:
                    if (this.f6880a.f6911d < 5000) {
                        if (this.f6880a.f6887F != 1) {
                            if (this.f6880a.f6887F <= 1) {
                                this.f6880a.m10049a(this.f6880a.f6906Y, this.f6880a.getResources().getString(R.string.no_cash), R.drawable.money);
                                break;
                            } else {
                                this.f6880a.m10049a(this.f6880a.f6905X, this.f6880a.getResources().getString(R.string.no_cash) + "\n\n" + this.f6880a.getResources().getString(R.string.have_explosives_s) + this.f6880a.f6887F + this.f6880a.getResources().getString(R.string.have_explosives_e2), R.drawable.money);
                                break;
                            }
                        }
                        this.f6880a.m10049a(this.f6880a.f6905X, this.f6880a.getResources().getString(R.string.no_cash) + "\n\n" + this.f6880a.getResources().getString(R.string.have_explosives_s) + this.f6880a.f6887F + this.f6880a.getResources().getString(R.string.have_explosives_e1), R.drawable.money);
                        break;
                    }
                    weaponActivity = this.f6880a;
                    weaponActivity.f6911d -= 5000;
                    weaponActivity = this.f6880a;
                    weaponActivity.f6887F++;
                    this.f6880a.f6933z = true;
                    weaponActivity = this.f6880a;
                    weaponActivity.f6914g++;
                    this.f6880a.m10051c();
                    if (this.f6880a.f6887F != 1) {
                        this.f6880a.m10049a(this.f6880a.f6905X, this.f6880a.getResources().getString(R.string.have_explosives_s) + this.f6880a.f6887F + this.f6880a.getResources().getString(R.string.have_explosives_e2), R.drawable.money);
                        break;
                    } else {
                        this.f6880a.m10049a(this.f6880a.f6905X, this.f6880a.getResources().getString(R.string.have_explosives_s) + this.f6880a.f6887F + this.f6880a.getResources().getString(R.string.have_explosives_e1), R.drawable.money);
                        break;
                    }
            }
            this.f6880a.f6896O.setText("$" + String.format("%,d", new Object[]{Integer.valueOf(this.f6880a.f6911d)}).replace(',', ' '));
            this.f6880a.f6898Q.setText("$" + String.format("%,d", new Object[]{Integer.valueOf(this.f6880a.f6912e)}).replace(',', ' '));
            this.f6880a.m10047f();
        }
    }

    class C20403 implements OnLoadCompleteListener {
        final /* synthetic */ WeaponActivity f6881a;

        C20403(WeaponActivity weaponActivity) {
            this.f6881a = weaponActivity;
        }

        public void onLoadComplete(SoundPool soundPool, int i, int i2) {
            Log.e("WeaponActivity", "Sound Loaded");
            this.f6881a.ad = true;
        }
    }

    private String m10044a(int i) {
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

    private void m10047f() {
        this.f6895N.m10189b();
        Bitmap decodeResource = this.f6928u ? BitmapFactory.decodeResource(getResources(), R.drawable.active) : BitmapFactory.decodeResource(getResources(), R.drawable.not_active);
        C2106p c2106p = new C2106p();
        c2106p.m10192a(getString(R.string.possessions_w_1));
        c2106p.m10194b(getString(R.string.possessions_w_1p));
        c2106p.m10191a(Bitmap.createScaledBitmap(decodeResource, decodeResource.getWidth(), decodeResource.getHeight(), false));
        this.f6895N.m10188a(c2106p);
        decodeResource = this.f6929v ? BitmapFactory.decodeResource(getResources(), R.drawable.active) : BitmapFactory.decodeResource(getResources(), R.drawable.not_active);
        c2106p = new C2106p();
        c2106p.m10192a(getString(R.string.possessions_w_2));
        c2106p.m10194b(getString(R.string.possessions_w_2p));
        c2106p.m10191a(Bitmap.createScaledBitmap(decodeResource, decodeResource.getWidth(), decodeResource.getHeight(), false));
        this.f6895N.m10188a(c2106p);
        decodeResource = this.f6930w ? BitmapFactory.decodeResource(getResources(), R.drawable.active) : BitmapFactory.decodeResource(getResources(), R.drawable.not_active);
        c2106p = new C2106p();
        c2106p.m10192a(getString(R.string.possessions_w_3));
        c2106p.m10194b(getString(R.string.possessions_w_3p));
        c2106p.m10191a(Bitmap.createScaledBitmap(decodeResource, decodeResource.getWidth(), decodeResource.getHeight(), false));
        this.f6895N.m10188a(c2106p);
        decodeResource = this.f6931x ? BitmapFactory.decodeResource(getResources(), R.drawable.active) : BitmapFactory.decodeResource(getResources(), R.drawable.not_active);
        c2106p = new C2106p();
        c2106p.m10192a(getString(R.string.possessions_w_4));
        c2106p.m10194b(getString(R.string.possessions_w_4p));
        c2106p.m10191a(Bitmap.createScaledBitmap(decodeResource, decodeResource.getWidth(), decodeResource.getHeight(), false));
        this.f6895N.m10188a(c2106p);
        decodeResource = this.f6932y ? BitmapFactory.decodeResource(getResources(), R.drawable.active) : BitmapFactory.decodeResource(getResources(), R.drawable.not_active);
        c2106p = new C2106p();
        c2106p.m10192a(getString(R.string.possessions_w_5));
        c2106p.m10194b(getString(R.string.possessions_w_5p));
        c2106p.m10191a(Bitmap.createScaledBitmap(decodeResource, decodeResource.getWidth(), decodeResource.getHeight(), false));
        this.f6895N.m10188a(c2106p);
        decodeResource = this.f6933z ? BitmapFactory.decodeResource(getResources(), R.drawable.active) : BitmapFactory.decodeResource(getResources(), R.drawable.not_active);
        c2106p = new C2106p();
        c2106p.m10192a(getString(R.string.possessions_w_6));
        c2106p.m10194b(getString(R.string.possessions_w_6p));
        c2106p.m10191a(Bitmap.createScaledBitmap(decodeResource, decodeResource.getWidth(), decodeResource.getHeight(), false));
        this.f6895N.m10188a(c2106p);
    }

    public void m10048a() {
        Editor edit = getApplicationContext().getSharedPreferences(getString(R.string.preference_file_key), 0).edit();
        edit.putString("CODES", this.f6910c);
        edit.putBoolean("VOLUME", this.f6889H);
        edit.putBoolean("A12W", this.f6888G);
        edit.putString("NAME", this.f6908a);
        edit.putString("LOCATION", this.f6909b);
        edit.putInt("CASH", this.f6911d);
        edit.putInt("BANK", this.f6912e);
        edit.putInt("BANK_DAYS", this.f6913f);
        edit.putInt("AGE", this.f6914g);
        edit.putInt("HUNGER", this.f6915h);
        edit.putInt("HEALTH", this.f6916i);
        edit.putBoolean("BOX", this.f6917j);
        edit.putBoolean("BASEMENT", this.f6918k);
        edit.putInt("BASEMENT_DAYS", this.f6923p);
        edit.putBoolean("APARTMENT", this.f6919l);
        edit.putInt("APARTMENT_DAYS", this.f6924q);
        edit.putBoolean("HOUSE", this.f6920m);
        edit.putInt("HOUSE_NO", this.f6925r);
        edit.putBoolean("CONDO", this.f6921n);
        edit.putInt("CONDO_NO", this.f6926s);
        edit.putBoolean("MANSION", this.f6922o);
        edit.putInt("MANSION_NO", this.f6927t);
        edit.putBoolean("KNIFE", this.f6928u);
        edit.putInt("KNIFE_NO", this.f6882A);
        edit.putBoolean("GUN", this.f6929v);
        edit.putInt("GUN_NO", this.f6883B);
        edit.putBoolean("SHOTGUN", this.f6930w);
        edit.putInt("SHOTGUN_NO", this.f6884C);
        edit.putBoolean("RIFLE", this.f6931x);
        edit.putInt("RIFLE_NO", this.f6885D);
        edit.putBoolean("VEST", this.f6932y);
        edit.putInt("VEST_NO", this.f6886E);
        edit.putBoolean("EXPLOSIVES", this.f6933z);
        edit.putInt("EXPLOSIVES_NO", this.f6887F);
        edit.apply();
    }

    public void m10049a(Toast toast, String str, int i) {
        View inflate = getLayoutInflater().inflate(R.layout.toast_message, (ViewGroup) findViewById(R.id.toast_layout_root));
        ((ImageView) inflate.findViewById(R.id.toast_image)).setImageResource(i);
        ((TextView) inflate.findViewById(R.id.toast_text)).setText(str);
        if (toast.getView().getWindowVisibility() != 0) {
            Log.e("WeaponActivity", "Exists");
            toast.setDuration(0);
        }
        toast.setGravity(16, 0, 0);
        toast.setView(inflate);
        toast.show();
    }

    public void m10050b() {
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences(getString(R.string.preference_file_key), 0);
        this.f6910c = sharedPreferences.getString("CODES", "");
        this.f6889H = sharedPreferences.getBoolean("VOLUME", true);
        this.f6888G = sharedPreferences.getBoolean("A12W", false);
        this.f6908a = sharedPreferences.getString("NAME", "Unknown");
        this.f6909b = sharedPreferences.getString("LOCATION", "n/a");
        this.f6911d = sharedPreferences.getInt("CASH", 0);
        this.f6912e = sharedPreferences.getInt("BANK", 0);
        this.f6913f = sharedPreferences.getInt("BANK_DAYS", 31);
        this.f6914g = sharedPreferences.getInt("AGE", 0);
        this.f6915h = sharedPreferences.getInt("HUNGER", 80);
        this.f6916i = sharedPreferences.getInt("HEALTH", 80);
        this.f6917j = sharedPreferences.getBoolean("BOX", true);
        this.f6918k = sharedPreferences.getBoolean("BASEMENT", false);
        this.f6923p = sharedPreferences.getInt("BASEMENT_DAYS", 0);
        this.f6919l = sharedPreferences.getBoolean("APARTMENT", false);
        this.f6924q = sharedPreferences.getInt("APARTMENT_DAYS", 0);
        this.f6920m = sharedPreferences.getBoolean("HOUSE", false);
        this.f6925r = sharedPreferences.getInt("HOUSE_NO", 0);
        this.f6921n = sharedPreferences.getBoolean("CONDO", false);
        this.f6926s = sharedPreferences.getInt("CONDO_NO", 0);
        this.f6922o = sharedPreferences.getBoolean("MANSION", false);
        this.f6927t = sharedPreferences.getInt("MANSION_NO", 0);
        this.f6928u = sharedPreferences.getBoolean("KNIFE", false);
        this.f6882A = sharedPreferences.getInt("KNIFE_NO", 0);
        this.f6929v = sharedPreferences.getBoolean("GUN", false);
        this.f6883B = sharedPreferences.getInt("GUN_NO", 0);
        this.f6930w = sharedPreferences.getBoolean("SHOTGUN", false);
        this.f6884C = sharedPreferences.getInt("SHOTGUN_NO", 0);
        this.f6931x = sharedPreferences.getBoolean("RIFLE", false);
        this.f6885D = sharedPreferences.getInt("RIFLE_NO", 0);
        this.f6932y = sharedPreferences.getBoolean("VEST", false);
        this.f6886E = sharedPreferences.getInt("VEST_NO", 0);
        this.f6933z = sharedPreferences.getBoolean("EXPLOSIVES", false);
        this.f6887F = sharedPreferences.getInt("EXPLOSIVES_NO", 0);
    }

    public void m10051c() {
        if (this.f6912e == 0) {
            this.f6913f = 31;
        } else if (this.f6912e >= 100 && this.f6913f > 1) {
            this.f6913f--;
        } else if (this.f6912e >= 100 && this.f6913f <= 1) {
            this.f6913f = 30;
            this.f6912e += this.f6912e / 100;
        }
        if (this.f6918k && this.f6923p >= 1) {
            this.f6923p--;
        }
        if (this.f6918k && this.f6923p == 0) {
            this.f6918k = false;
            this.f6923p = 0;
        }
        if (this.f6919l && this.f6924q >= 1) {
            this.f6924q--;
        }
        if (this.f6919l && this.f6924q == 0) {
            this.f6919l = false;
            this.f6924q = 0;
        }
    }

    public void m10052d() {
        if (this.f6889H) {
            this.f6907Z = (AudioManager) getSystemService("audio");
            this.ac = ((float) this.f6907Z.getStreamVolume(3)) / ((float) this.f6907Z.getStreamMaxVolume(3));
            this.aa = new SoundPool(10, 3, 0);
            this.aa.setOnLoadCompleteListener(new C20403(this));
            this.ab = this.aa.load(this, R.raw.click, 1);
            return;
        }
        Log.e("WeaponActivity", "Sound Not Loaded");
        this.ad = false;
    }

    public void m10053e() {
        try {
            this.aa.play(this.ab, this.ac, this.ac, 1, 0, 1.0f);
        } catch (Exception e) {
            Log.e("WeaponActivity", "Error Playing Sound");
        }
    }

    public void goBack(View view) {
        m10053e();
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.e("WeaponActivity", "onCreate");
        setContentView(R.layout.activity_weapon);
        this.f6890I = Typeface.createFromAsset(getAssets(), "fonts/caviar_dreams.ttf");
        this.f6891J = Typeface.createFromAsset(getAssets(), "fonts/caviar_dreams_bold.ttf");
        this.f6900S = Toast.makeText(this, "", 0);
        this.f6901T = Toast.makeText(this, "", 0);
        this.f6902U = Toast.makeText(this, "", 0);
        this.f6903V = Toast.makeText(this, "", 0);
        this.f6904W = Toast.makeText(this, "", 0);
        this.f6905X = Toast.makeText(this, "", 0);
        this.f6906Y = Toast.makeText(this, "", 0);
        this.f6892K = (AdView) findViewById(R.id.adView);
        this.f6892K.setAdListener(new C20381(this));
        this.f6892K.m2048a(new C0472a().m2094a());
        this.f6897P = (TextView) findViewById(R.id.cash_title);
        this.f6897P.setTypeface(this.f6891J);
        this.f6896O = (TextView) findViewById(R.id.cash_amount);
        this.f6896O.setTypeface(this.f6890I);
        this.f6899R = (TextView) findViewById(R.id.bank_title);
        this.f6899R.setTypeface(this.f6891J);
        this.f6898Q = (TextView) findViewById(R.id.bank_amount);
        this.f6898Q.setTypeface(this.f6890I);
        this.f6893L = (Button) findViewById(R.id.back);
        this.f6893L.setTypeface(this.f6891J);
        this.f6894M = (ListView) findViewById(R.id.weapon_list);
        this.f6895N = new C2105o(this);
        this.f6894M.setAdapter(this.f6895N);
        this.f6894M.setOnItemClickListener(new C20392(this));
    }

    public void onDestroy() {
        super.onDestroy();
        Log.e("WeaponActivity", "onDestroy");
        if (this.f6892K != null) {
            this.f6892K.m2047a();
        }
    }

    protected void onPause() {
        super.onPause();
        Log.e("WeaponActivity", "onPause");
        if (this.f6892K != null) {
            this.f6892K.m2049b();
        }
        if (this.f6900S != null) {
            this.f6900S.cancel();
        }
        if (this.f6901T != null) {
            this.f6901T.cancel();
        }
        if (this.f6902U != null) {
            this.f6902U.cancel();
        }
        if (this.f6903V != null) {
            this.f6903V.cancel();
        }
        if (this.f6904W != null) {
            this.f6904W.cancel();
        }
        if (this.f6905X != null) {
            this.f6905X.cancel();
        }
        if (this.f6906Y != null) {
            this.f6906Y.cancel();
        }
        if (this.aa != null) {
            this.aa.unload(this.ab);
            this.aa.release();
            this.aa = null;
        }
        if (this.f6928u && this.f6929v && this.f6930w && this.f6931x && this.f6932y && this.f6933z) {
            this.f6888G = true;
        }
        m10048a();
    }

    public void onResume() {
        super.onResume();
        Log.e("WeaponActivity", "onResume");
        if (this.f6892K != null) {
            this.f6892K.m2050c();
        }
        m10050b();
        m10052d();
        m10047f();
        this.f6896O.setText("$" + String.format("%,d", new Object[]{Integer.valueOf(this.f6911d)}).replace(',', ' '));
        this.f6898Q.setText("$" + String.format("%,d", new Object[]{Integer.valueOf(this.f6912e)}).replace(',', ' '));
    }
}
