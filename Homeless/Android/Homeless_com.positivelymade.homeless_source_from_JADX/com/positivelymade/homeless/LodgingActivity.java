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

public class LodgingActivity extends Activity {
    public ListView f6481A;
    public C2105o f6482B;
    public TextView f6483C;
    public TextView f6484D;
    public TextView f6485E;
    public TextView f6486F;
    public Toast f6487G;
    public Toast f6488H;
    public Toast f6489I;
    public Toast f6490J;
    public Toast f6491K;
    public Toast f6492L;
    public AudioManager f6493M;
    public SoundPool f6494N;
    public int f6495O;
    public float f6496P;
    public boolean f6497Q;
    public String f6498a;
    public String f6499b;
    public String f6500c;
    public int f6501d;
    public int f6502e;
    public int f6503f;
    public int f6504g;
    public int f6505h;
    public int f6506i;
    public boolean f6507j;
    public boolean f6508k;
    public boolean f6509l;
    public boolean f6510m;
    public boolean f6511n;
    public boolean f6512o;
    public int f6513p;
    public int f6514q;
    public int f6515r;
    public int f6516s;
    public int f6517t;
    public boolean f6518u;
    public boolean f6519v;
    public Typeface f6520w;
    public Typeface f6521x;
    public AdView f6522y;
    public Button f6523z;

    class C19921 extends C0427a {
        final /* synthetic */ LodgingActivity f6478a;

        C19921(LodgingActivity lodgingActivity) {
            this.f6478a = lodgingActivity;
        }

        public void mo322a() {
            Log.e("LodgingActivity", "Google onAdLoaded");
        }

        public void mo323a(int i) {
            Log.e("LodgingActivity", "Google onAdFailedToLoad: " + this.f6478a.m9893a(i));
        }

        public void mo324b() {
            Log.e("LodgingActivity", "Google onAdOpened");
        }

        public void mo325c() {
            Log.e("LodgingActivity", "Google onAdClosed");
        }

        public void mo326d() {
            Log.d("LodgingActivity", "Google onAdLeftApplication");
        }
    }

    class C19932 implements OnItemClickListener {
        final /* synthetic */ LodgingActivity f6479a;

        C19932(LodgingActivity lodgingActivity) {
            this.f6479a = lodgingActivity;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            String b = ((C2106p) this.f6479a.f6482B.m10187a().get(i)).m10193b();
            boolean z = true;
            switch (b.hashCode()) {
                case -956353208:
                    if (b.equals("$150000")) {
                        z = true;
                        break;
                    }
                    break;
                case -846454209:
                    if (b.equals("$500000")) {
                        z = true;
                        break;
                    }
                    break;
                case 34932955:
                    if (b.equals("$70/m")) {
                        z = false;
                        break;
                    }
                    break;
                case 1080150160:
                    if (b.equals("$40000")) {
                        z = true;
                        break;
                    }
                    break;
                case 1081073711:
                    if (b.equals("$500/m")) {
                        z = true;
                        break;
                    }
                    break;
            }
            LodgingActivity lodgingActivity;
            switch (z) {
                case false:
                    if (this.f6479a.f6501d < 70) {
                        if (this.f6479a.f6513p != 1) {
                            if (this.f6479a.f6513p <= 1) {
                                this.f6479a.m9898a(this.f6479a.f6492L, this.f6479a.getResources().getString(R.string.no_cash), R.drawable.money);
                                break;
                            } else {
                                this.f6479a.m9898a(this.f6479a.f6487G, this.f6479a.getResources().getString(R.string.no_cash) + "\n\n" + this.f6479a.getResources().getString(R.string.have_basement_s) + this.f6479a.f6513p + this.f6479a.getResources().getString(R.string.have_basement_e2), R.drawable.money);
                                break;
                            }
                        }
                        this.f6479a.m9898a(this.f6479a.f6487G, this.f6479a.getResources().getString(R.string.no_cash) + "\n\n" + this.f6479a.getResources().getString(R.string.have_basement_s) + this.f6479a.f6513p + this.f6479a.getResources().getString(R.string.have_basement_e1), R.drawable.money);
                        break;
                    }
                    lodgingActivity = this.f6479a;
                    lodgingActivity.f6501d -= 70;
                    this.f6479a.m9900c();
                    lodgingActivity = this.f6479a;
                    lodgingActivity.f6513p += 30;
                    this.f6479a.f6508k = true;
                    lodgingActivity = this.f6479a;
                    lodgingActivity.f6504g++;
                    if (this.f6479a.f6513p != 1) {
                        this.f6479a.m9898a(this.f6479a.f6487G, this.f6479a.getResources().getString(R.string.have_basement_s) + this.f6479a.f6513p + this.f6479a.getResources().getString(R.string.have_basement_e2), R.drawable.money);
                        break;
                    } else {
                        this.f6479a.m9898a(this.f6479a.f6487G, this.f6479a.getResources().getString(R.string.have_basement_s) + this.f6479a.f6513p + this.f6479a.getResources().getString(R.string.have_basement_e1), R.drawable.money);
                        break;
                    }
                case true:
                    if (this.f6479a.f6501d < 500) {
                        if (this.f6479a.f6514q != 1) {
                            if (this.f6479a.f6514q <= 1) {
                                this.f6479a.m9898a(this.f6479a.f6492L, this.f6479a.getResources().getString(R.string.no_cash), R.drawable.money);
                                break;
                            } else {
                                this.f6479a.m9898a(this.f6479a.f6488H, this.f6479a.getResources().getString(R.string.no_cash) + "\n\n" + this.f6479a.getResources().getString(R.string.have_apartment_s) + this.f6479a.f6514q + this.f6479a.getResources().getString(R.string.have_apartment_e2), R.drawable.money);
                                break;
                            }
                        }
                        this.f6479a.m9898a(this.f6479a.f6488H, this.f6479a.getResources().getString(R.string.no_cash) + "\n\n" + this.f6479a.getResources().getString(R.string.have_apartment_s) + this.f6479a.f6514q + this.f6479a.getResources().getString(R.string.have_apartment_e1), R.drawable.money);
                        break;
                    }
                    lodgingActivity = this.f6479a;
                    lodgingActivity.f6501d -= 500;
                    this.f6479a.m9900c();
                    lodgingActivity = this.f6479a;
                    lodgingActivity.f6514q += 30;
                    this.f6479a.f6509l = true;
                    lodgingActivity = this.f6479a;
                    lodgingActivity.f6504g++;
                    if (this.f6479a.f6514q != 1) {
                        this.f6479a.m9898a(this.f6479a.f6488H, this.f6479a.getResources().getString(R.string.have_apartment_s) + this.f6479a.f6514q + this.f6479a.getResources().getString(R.string.have_apartment_e2), R.drawable.money);
                        break;
                    } else {
                        this.f6479a.m9898a(this.f6479a.f6488H, this.f6479a.getResources().getString(R.string.have_apartment_s) + this.f6479a.f6514q + this.f6479a.getResources().getString(R.string.have_apartment_e1), R.drawable.money);
                        break;
                    }
                case true:
                    if (this.f6479a.f6501d < 40000) {
                        if (this.f6479a.f6515r != 1) {
                            if (this.f6479a.f6515r <= 1) {
                                this.f6479a.m9898a(this.f6479a.f6492L, this.f6479a.getResources().getString(R.string.no_cash), R.drawable.money);
                                break;
                            } else {
                                this.f6479a.m9898a(this.f6479a.f6489I, this.f6479a.getResources().getString(R.string.no_cash) + "\n\n" + this.f6479a.getResources().getString(R.string.have_house_s) + this.f6479a.f6515r + this.f6479a.getResources().getString(R.string.have_house_e2), R.drawable.money);
                                break;
                            }
                        }
                        this.f6479a.m9898a(this.f6479a.f6489I, this.f6479a.getResources().getString(R.string.no_cash) + "\n\n" + this.f6479a.getResources().getString(R.string.have_house_s) + this.f6479a.f6515r + this.f6479a.getResources().getString(R.string.have_house_e1), R.drawable.money);
                        break;
                    }
                    lodgingActivity = this.f6479a;
                    lodgingActivity.f6501d -= 40000;
                    lodgingActivity = this.f6479a;
                    lodgingActivity.f6515r++;
                    this.f6479a.f6510m = true;
                    lodgingActivity = this.f6479a;
                    lodgingActivity.f6504g++;
                    this.f6479a.m9900c();
                    if (this.f6479a.f6515r != 1) {
                        this.f6479a.m9898a(this.f6479a.f6489I, this.f6479a.getResources().getString(R.string.have_house_s) + this.f6479a.f6515r + this.f6479a.getResources().getString(R.string.have_house_e2), R.drawable.money);
                        break;
                    } else {
                        this.f6479a.m9898a(this.f6479a.f6489I, this.f6479a.getResources().getString(R.string.have_house_s) + this.f6479a.f6515r + this.f6479a.getResources().getString(R.string.have_house_e1), R.drawable.money);
                        break;
                    }
                case true:
                    if (this.f6479a.f6501d < 150000) {
                        if (this.f6479a.f6516s != 1) {
                            if (this.f6479a.f6516s <= 1) {
                                this.f6479a.m9898a(this.f6479a.f6492L, this.f6479a.getResources().getString(R.string.no_cash), R.drawable.money);
                                break;
                            } else {
                                this.f6479a.m9898a(this.f6479a.f6490J, this.f6479a.getResources().getString(R.string.no_cash) + "\n\n" + this.f6479a.getResources().getString(R.string.have_condo_s) + this.f6479a.f6516s + this.f6479a.getResources().getString(R.string.have_condo_e2), R.drawable.money);
                                break;
                            }
                        }
                        this.f6479a.m9898a(this.f6479a.f6490J, this.f6479a.getResources().getString(R.string.no_cash) + "\n\n" + this.f6479a.getResources().getString(R.string.have_condo_s) + this.f6479a.f6516s + this.f6479a.getResources().getString(R.string.have_condo_e1), R.drawable.money);
                        break;
                    }
                    lodgingActivity = this.f6479a;
                    lodgingActivity.f6501d -= 150000;
                    lodgingActivity = this.f6479a;
                    lodgingActivity.f6516s++;
                    this.f6479a.f6511n = true;
                    lodgingActivity = this.f6479a;
                    lodgingActivity.f6504g++;
                    this.f6479a.m9900c();
                    if (this.f6479a.f6516s != 1) {
                        this.f6479a.m9898a(this.f6479a.f6490J, this.f6479a.getResources().getString(R.string.have_condo_s) + this.f6479a.f6516s + this.f6479a.getResources().getString(R.string.have_condo_e2), R.drawable.money);
                        break;
                    } else {
                        this.f6479a.m9898a(this.f6479a.f6490J, this.f6479a.getResources().getString(R.string.have_condo_s) + this.f6479a.f6516s + this.f6479a.getResources().getString(R.string.have_condo_e1), R.drawable.money);
                        break;
                    }
                case true:
                    if (this.f6479a.f6501d < 500000) {
                        if (this.f6479a.f6517t != 1) {
                            if (this.f6479a.f6517t <= 1) {
                                this.f6479a.m9898a(this.f6479a.f6492L, this.f6479a.getResources().getString(R.string.no_cash), R.drawable.money);
                                break;
                            } else {
                                this.f6479a.m9898a(this.f6479a.f6491K, this.f6479a.getResources().getString(R.string.no_cash) + "\n\n" + this.f6479a.getResources().getString(R.string.have_mansion_s) + this.f6479a.f6517t + this.f6479a.getResources().getString(R.string.have_mansion_e2), R.drawable.money);
                                break;
                            }
                        }
                        this.f6479a.m9898a(this.f6479a.f6491K, this.f6479a.getResources().getString(R.string.no_cash) + "\n\n" + this.f6479a.getResources().getString(R.string.have_mansion_s) + this.f6479a.f6517t + this.f6479a.getResources().getString(R.string.have_mansion_e1), R.drawable.money);
                        break;
                    }
                    lodgingActivity = this.f6479a;
                    lodgingActivity.f6501d -= 500000;
                    lodgingActivity = this.f6479a;
                    lodgingActivity.f6517t++;
                    this.f6479a.f6512o = true;
                    lodgingActivity = this.f6479a;
                    lodgingActivity.f6504g++;
                    this.f6479a.m9900c();
                    if (this.f6479a.f6517t != 1) {
                        this.f6479a.m9898a(this.f6479a.f6491K, this.f6479a.getResources().getString(R.string.have_mansion_s) + this.f6479a.f6517t + this.f6479a.getResources().getString(R.string.have_mansion_e2), R.drawable.money);
                        break;
                    } else {
                        this.f6479a.m9898a(this.f6479a.f6491K, this.f6479a.getResources().getString(R.string.have_mansion_s) + this.f6479a.f6517t + this.f6479a.getResources().getString(R.string.have_mansion_e1), R.drawable.money);
                        break;
                    }
            }
            this.f6479a.f6483C.setText("$" + String.format("%,d", new Object[]{Integer.valueOf(this.f6479a.f6501d)}).replace(',', ' '));
            this.f6479a.f6485E.setText("$" + String.format("%,d", new Object[]{Integer.valueOf(this.f6479a.f6502e)}).replace(',', ' '));
            this.f6479a.m9896f();
        }
    }

    class C19943 implements OnLoadCompleteListener {
        final /* synthetic */ LodgingActivity f6480a;

        C19943(LodgingActivity lodgingActivity) {
            this.f6480a = lodgingActivity;
        }

        public void onLoadComplete(SoundPool soundPool, int i, int i2) {
            Log.e("LodgingActivity", "Sound Loaded");
            this.f6480a.f6497Q = true;
        }
    }

    private String m9893a(int i) {
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

    private void m9896f() {
        this.f6482B.m10189b();
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.active);
        C2106p c2106p = new C2106p();
        c2106p.m10192a(getString(R.string.possessions_l_1));
        c2106p.m10194b(getString(R.string.possessions_l_1p));
        c2106p.m10191a(Bitmap.createScaledBitmap(decodeResource, decodeResource.getWidth(), decodeResource.getHeight(), false));
        this.f6482B.m10188a(c2106p);
        decodeResource = this.f6508k ? BitmapFactory.decodeResource(getResources(), R.drawable.active) : BitmapFactory.decodeResource(getResources(), R.drawable.not_active);
        c2106p = new C2106p();
        c2106p.m10192a(getString(R.string.possessions_l_2));
        c2106p.m10194b(getString(R.string.possessions_l_2p));
        c2106p.m10191a(Bitmap.createScaledBitmap(decodeResource, decodeResource.getWidth(), decodeResource.getHeight(), false));
        this.f6482B.m10188a(c2106p);
        decodeResource = this.f6509l ? BitmapFactory.decodeResource(getResources(), R.drawable.active) : BitmapFactory.decodeResource(getResources(), R.drawable.not_active);
        c2106p = new C2106p();
        c2106p.m10192a(getString(R.string.possessions_l_3));
        c2106p.m10194b(getString(R.string.possessions_l_3p));
        c2106p.m10191a(Bitmap.createScaledBitmap(decodeResource, decodeResource.getWidth(), decodeResource.getHeight(), false));
        this.f6482B.m10188a(c2106p);
        Bitmap decodeResource2 = this.f6510m ? BitmapFactory.decodeResource(getResources(), R.drawable.active) : BitmapFactory.decodeResource(getResources(), R.drawable.not_active);
        C2106p c2106p2 = new C2106p();
        c2106p2.m10192a(getString(R.string.possessions_l_4));
        c2106p2.m10194b(getString(R.string.possessions_l_4p));
        c2106p2.m10191a(Bitmap.createScaledBitmap(decodeResource2, decodeResource2.getWidth(), decodeResource.getHeight(), false));
        this.f6482B.m10188a(c2106p2);
        decodeResource = this.f6511n ? BitmapFactory.decodeResource(getResources(), R.drawable.active) : BitmapFactory.decodeResource(getResources(), R.drawable.not_active);
        c2106p = new C2106p();
        c2106p.m10192a(getString(R.string.possessions_l_5));
        c2106p.m10194b(getString(R.string.possessions_l_5p));
        c2106p.m10191a(Bitmap.createScaledBitmap(decodeResource, decodeResource.getWidth(), decodeResource.getHeight(), false));
        this.f6482B.m10188a(c2106p);
        decodeResource = this.f6512o ? BitmapFactory.decodeResource(getResources(), R.drawable.active) : BitmapFactory.decodeResource(getResources(), R.drawable.not_active);
        c2106p = new C2106p();
        c2106p.m10192a(getString(R.string.possessions_l_6));
        c2106p.m10194b(getString(R.string.possessions_l_6p));
        c2106p.m10191a(Bitmap.createScaledBitmap(decodeResource, decodeResource.getWidth(), decodeResource.getHeight(), false));
        this.f6482B.m10188a(c2106p);
    }

    public void m9897a() {
        Editor edit = getApplicationContext().getSharedPreferences(getString(R.string.preference_file_key), 0).edit();
        edit.putString("CODES", this.f6500c);
        edit.putBoolean("VOLUME", this.f6519v);
        edit.putBoolean("A12L", this.f6518u);
        edit.putString("NAME", this.f6498a);
        edit.putString("LOCATION", this.f6499b);
        edit.putInt("CASH", this.f6501d);
        edit.putInt("BANK", this.f6502e);
        edit.putInt("BANK_DAYS", this.f6503f);
        edit.putInt("AGE", this.f6504g);
        edit.putInt("HUNGER", this.f6505h);
        edit.putInt("HEALTH", this.f6506i);
        edit.putBoolean("BOX", this.f6507j);
        edit.putBoolean("BASEMENT", this.f6508k);
        edit.putInt("BASEMENT_DAYS", this.f6513p);
        edit.putBoolean("APARTMENT", this.f6509l);
        edit.putInt("APARTMENT_DAYS", this.f6514q);
        edit.putBoolean("HOUSE", this.f6510m);
        edit.putInt("HOUSE_NO", this.f6515r);
        edit.putBoolean("CONDO", this.f6511n);
        edit.putInt("CONDO_NO", this.f6516s);
        edit.putBoolean("MANSION", this.f6512o);
        edit.putInt("MANSION_NO", this.f6517t);
        edit.apply();
    }

    public void m9898a(Toast toast, String str, int i) {
        View inflate = getLayoutInflater().inflate(R.layout.toast_message, (ViewGroup) findViewById(R.id.toast_layout_root));
        ((ImageView) inflate.findViewById(R.id.toast_image)).setImageResource(i);
        ((TextView) inflate.findViewById(R.id.toast_text)).setText(str);
        if (toast.getView().getWindowVisibility() != 0) {
            Log.e("LodgingActivity", "Exists");
            toast.setDuration(0);
        }
        toast.setGravity(16, 0, 0);
        toast.setView(inflate);
        toast.show();
    }

    public void m9899b() {
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences(getString(R.string.preference_file_key), 0);
        this.f6500c = sharedPreferences.getString("CODES", "");
        this.f6519v = sharedPreferences.getBoolean("VOLUME", true);
        this.f6518u = sharedPreferences.getBoolean("A12L", false);
        this.f6498a = sharedPreferences.getString("NAME", "Unknown");
        this.f6499b = sharedPreferences.getString("LOCATION", "n/a");
        this.f6501d = sharedPreferences.getInt("CASH", 0);
        this.f6502e = sharedPreferences.getInt("BANK", 0);
        this.f6503f = sharedPreferences.getInt("BANK_DAYS", 31);
        this.f6504g = sharedPreferences.getInt("AGE", 0);
        this.f6505h = sharedPreferences.getInt("HUNGER", 80);
        this.f6506i = sharedPreferences.getInt("HEALTH", 80);
        this.f6507j = sharedPreferences.getBoolean("BOX", true);
        this.f6508k = sharedPreferences.getBoolean("BASEMENT", false);
        this.f6513p = sharedPreferences.getInt("BASEMENT_DAYS", 0);
        this.f6509l = sharedPreferences.getBoolean("APARTMENT", false);
        this.f6514q = sharedPreferences.getInt("APARTMENT_DAYS", 0);
        this.f6510m = sharedPreferences.getBoolean("HOUSE", false);
        this.f6515r = sharedPreferences.getInt("HOUSE_NO", 0);
        this.f6511n = sharedPreferences.getBoolean("CONDO", false);
        this.f6516s = sharedPreferences.getInt("CONDO_NO", 0);
        this.f6512o = sharedPreferences.getBoolean("MANSION", false);
        this.f6517t = sharedPreferences.getInt("MANSION_NO", 0);
    }

    public void m9900c() {
        if (this.f6502e == 0) {
            this.f6503f = 31;
        } else if (this.f6502e >= 100 && this.f6503f > 1) {
            this.f6503f--;
        } else if (this.f6502e >= 100 && this.f6503f <= 1) {
            this.f6503f = 30;
            this.f6502e += this.f6502e / 100;
        }
        if (this.f6508k && this.f6513p >= 1) {
            this.f6513p--;
        }
        if (this.f6508k && this.f6513p == 0) {
            this.f6508k = false;
            this.f6513p = 0;
        }
        if (this.f6509l && this.f6514q >= 1) {
            this.f6514q--;
        }
        if (this.f6509l && this.f6514q == 0) {
            this.f6509l = false;
            this.f6514q = 0;
        }
    }

    public void m9901d() {
        if (this.f6519v) {
            this.f6493M = (AudioManager) getSystemService("audio");
            this.f6496P = ((float) this.f6493M.getStreamVolume(3)) / ((float) this.f6493M.getStreamMaxVolume(3));
            this.f6494N = new SoundPool(10, 3, 0);
            this.f6494N.setOnLoadCompleteListener(new C19943(this));
            this.f6495O = this.f6494N.load(this, R.raw.click, 1);
            return;
        }
        Log.e("LodgingActivity", "Sound Not Loaded");
        this.f6497Q = false;
    }

    public void m9902e() {
        try {
            this.f6494N.play(this.f6495O, this.f6496P, this.f6496P, 1, 0, 1.0f);
        } catch (Exception e) {
            Log.e("LodgingActivity", "Error Playing Sound");
        }
    }

    public void goBack(View view) {
        m9902e();
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.e("LodgingActivity", "onCreate");
        setContentView(R.layout.activity_lodging);
        this.f6520w = Typeface.createFromAsset(getAssets(), "fonts/caviar_dreams.ttf");
        this.f6521x = Typeface.createFromAsset(getAssets(), "fonts/caviar_dreams_bold.ttf");
        this.f6487G = Toast.makeText(this, "", 0);
        this.f6488H = Toast.makeText(this, "", 0);
        this.f6489I = Toast.makeText(this, "", 0);
        this.f6490J = Toast.makeText(this, "", 0);
        this.f6491K = Toast.makeText(this, "", 0);
        this.f6492L = Toast.makeText(this, "", 0);
        this.f6522y = (AdView) findViewById(R.id.adView);
        this.f6522y.setAdListener(new C19921(this));
        this.f6522y.m2048a(new C0472a().m2094a());
        this.f6484D = (TextView) findViewById(R.id.cash_title);
        this.f6484D.setTypeface(this.f6521x);
        this.f6483C = (TextView) findViewById(R.id.cash_amount);
        this.f6483C.setTypeface(this.f6520w);
        this.f6486F = (TextView) findViewById(R.id.bank_title);
        this.f6486F.setTypeface(this.f6521x);
        this.f6485E = (TextView) findViewById(R.id.bank_amount);
        this.f6485E.setTypeface(this.f6520w);
        this.f6523z = (Button) findViewById(R.id.back);
        this.f6523z.setTypeface(this.f6521x);
        this.f6481A = (ListView) findViewById(R.id.lodging_list);
        this.f6482B = new C2105o(this);
        this.f6481A.setAdapter(this.f6482B);
        this.f6481A.setOnItemClickListener(new C19932(this));
    }

    public void onDestroy() {
        super.onDestroy();
        Log.e("LodgingActivity", "onDestroy");
        if (this.f6522y != null) {
            this.f6522y.m2047a();
        }
    }

    protected void onPause() {
        super.onPause();
        Log.e("LodgingActivity", "onPause");
        if (this.f6522y != null) {
            this.f6522y.m2049b();
        }
        if (this.f6487G != null) {
            this.f6487G.cancel();
        }
        if (this.f6488H != null) {
            this.f6488H.cancel();
        }
        if (this.f6489I != null) {
            this.f6489I.cancel();
        }
        if (this.f6490J != null) {
            this.f6490J.cancel();
        }
        if (this.f6491K != null) {
            this.f6491K.cancel();
        }
        if (this.f6492L != null) {
            this.f6492L.cancel();
        }
        if (this.f6494N != null) {
            this.f6494N.unload(this.f6495O);
            this.f6494N.release();
            this.f6494N = null;
        }
        if (this.f6507j && this.f6508k && this.f6509l && this.f6510m && this.f6511n && this.f6512o) {
            this.f6518u = true;
        }
        m9897a();
    }

    public void onResume() {
        super.onResume();
        Log.e("LodgingActivity", "onResume");
        if (this.f6522y != null) {
            this.f6522y.m2050c();
        }
        m9899b();
        m9901d();
        m9896f();
        this.f6483C.setText("$" + String.format("%,d", new Object[]{Integer.valueOf(this.f6501d)}).replace(',', ' '));
        this.f6485E.setText("$" + String.format("%,d", new Object[]{Integer.valueOf(this.f6502e)}).replace(',', ' '));
    }
}
