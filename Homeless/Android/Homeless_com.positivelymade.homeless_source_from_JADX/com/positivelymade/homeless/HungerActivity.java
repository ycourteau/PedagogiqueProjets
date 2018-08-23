package com.positivelymade.homeless;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.media.AudioManager;
import android.media.SoundPool;
import android.media.SoundPool.OnLoadCompleteListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.p010b.C0275a.C0274i;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.C0427a;
import com.google.android.gms.ads.C0476c.C0472a;
import com.google.android.gms.ads.C0486e;

public class HungerActivity extends Activity {
    public boolean f6289A;
    public boolean f6290B;
    public boolean f6291C;
    public boolean f6292D;
    public boolean f6293E;
    public boolean f6294F;
    public boolean f6295G;
    public boolean f6296H;
    public int f6297I;
    public int f6298J;
    public boolean f6299K;
    public boolean f6300L;
    public boolean f6301M;
    public boolean f6302N;
    public boolean f6303O;
    public boolean f6304P;
    public boolean f6305Q;
    public boolean f6306R;
    public boolean f6307S;
    public boolean f6308T;
    public boolean f6309U;
    public boolean f6310V;
    public boolean f6311W;
    public int f6312X;
    public int f6313Y;
    public int f6314Z;
    public String f6315a;
    public int aA;
    public boolean aB;
    public boolean aC;
    public boolean aD;
    public boolean aE;
    public boolean aF;
    public boolean aG;
    public boolean aH;
    public boolean aI;
    public boolean aJ;
    public boolean aK;
    public boolean aL;
    public boolean aM;
    public boolean aN;
    public boolean aO;
    public boolean aP;
    public boolean aQ;
    public boolean aR;
    public Typeface aS;
    public Typeface aT;
    public AdView aU;
    public Button aV;
    public ListView aW;
    public ListView aX;
    public C2109r aY;
    public C2092g aZ;
    public int aa;
    public int ab;
    public boolean ac;
    public boolean ad;
    public boolean ae;
    public boolean af;
    public boolean ag;
    public boolean ah;
    public boolean ai;
    public int aj;
    public int ak;
    public int al;
    public int am;
    public int an;
    public int ao;
    public boolean ap;
    public boolean aq;
    public boolean ar;
    public boolean as;
    public boolean at;
    public boolean au;
    public int av;
    public int aw;
    public int ax;
    public int ay;
    public int az;
    public String f6316b;
    public ProgressBar ba;
    public ProgressBar bb;
    public TextView bc;
    public TextView bd;
    public TextView be;
    public TextView bf;
    public Toast bg;
    public Toast bh;
    public Toast bi;
    public Toast bj;
    public AudioManager bk;
    public SoundPool bl;
    public int bm;
    public int bn;
    public float bo;
    public boolean bp;
    public C0486e bq;
    public String f6317c;
    public int f6318d;
    public int f6319e;
    public int f6320f;
    public int f6321g;
    public int f6322h;
    public int f6323i;
    public int f6324j;
    public boolean f6325k;
    public boolean f6326l;
    public boolean f6327m;
    public boolean f6328n;
    public boolean f6329o;
    public boolean f6330p;
    public boolean f6331q;
    public boolean f6332r;
    public boolean f6333s;
    public boolean f6334t;
    public boolean f6335u;
    public boolean f6336v;
    public boolean f6337w;
    public boolean f6338x;
    public boolean f6339y;
    public boolean f6340z;

    class C19731 extends C0427a {
        final /* synthetic */ HungerActivity f6277a;

        C19731(HungerActivity hungerActivity) {
            this.f6277a = hungerActivity;
        }

        public void mo322a() {
            Log.e("HungerActivity", "Google onAdLoaded");
        }

        public void mo323a(int i) {
            Log.e("HungerActivity", "Google onAdFailedToLoad: " + this.f6277a.m9823a(i));
        }

        public void mo324b() {
            Log.e("HungerActivity", "Google onAdOpened");
        }

        public void mo325c() {
            Log.e("HungerActivity", "Google onAdClosed");
        }

        public void mo326d() {
            Log.d("HungerActivity", "Google onAdLeftApplication");
        }
    }

    class C19742 implements OnItemClickListener {
        final /* synthetic */ HungerActivity f6278a;

        C19742(HungerActivity hungerActivity) {
            this.f6278a = hungerActivity;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            String b = ((C2107q) this.f6278a.aZ.m10158a().get(i)).m10198b();
            int i2 = -1;
            switch (b.hashCode()) {
                case 1164:
                    if (b.equals("$0")) {
                        i2 = 0;
                        break;
                    }
                    break;
                case 1166:
                    if (b.equals("$2")) {
                        i2 = 1;
                        break;
                    }
                    break;
                case 1169:
                    if (b.equals("$5")) {
                        i2 = 2;
                        break;
                    }
                    break;
                case 36194:
                    if (b.equals("$20")) {
                        i2 = 3;
                        break;
                    }
                    break;
                case 36349:
                    if (b.equals("$70")) {
                        i2 = 4;
                        break;
                    }
                    break;
                case 1121225:
                    if (b.equals("$140")) {
                        i2 = 5;
                        break;
                    }
                    break;
                case 1122062:
                    if (b.equals("$200")) {
                        i2 = 6;
                        break;
                    }
                    break;
            }
            HungerActivity hungerActivity;
            switch (i2) {
                case 0:
                    hungerActivity = this.f6278a;
                    hungerActivity.f6323i += 10;
                    hungerActivity = this.f6278a;
                    hungerActivity.f6324j -= 5;
                    hungerActivity = this.f6278a;
                    hungerActivity.f6318d += 0;
                    hungerActivity = this.f6278a;
                    hungerActivity.f6322h++;
                    this.f6278a.m9833c();
                    break;
                case 1:
                    if (this.f6278a.f6318d < 2) {
                        if (this.f6278a.f6319e < C0274i.Theme_editTextStyle) {
                            this.f6278a.m9831a(this.f6278a.bg, this.f6278a.getResources().getString(R.string.toast_cash), (int) R.drawable.money);
                            break;
                        } else {
                            this.f6278a.m9831a(this.f6278a.bh, this.f6278a.getResources().getString(R.string.toast_bank), (int) R.drawable.money);
                            break;
                        }
                    }
                    hungerActivity = this.f6278a;
                    hungerActivity.f6323i += 15;
                    hungerActivity = this.f6278a;
                    hungerActivity.f6324j -= 5;
                    hungerActivity = this.f6278a;
                    hungerActivity.f6318d -= 2;
                    hungerActivity = this.f6278a;
                    hungerActivity.f6322h++;
                    this.f6278a.m9833c();
                    break;
                case 2:
                    if (this.f6278a.f6318d < 5) {
                        if (this.f6278a.f6319e < C0274i.Theme_spinnerStyle) {
                            this.f6278a.m9831a(this.f6278a.bg, this.f6278a.getResources().getString(R.string.toast_cash), (int) R.drawable.money);
                            break;
                        } else {
                            this.f6278a.m9831a(this.f6278a.bh, this.f6278a.getResources().getString(R.string.toast_bank), (int) R.drawable.money);
                            break;
                        }
                    }
                    hungerActivity = this.f6278a;
                    hungerActivity.f6323i += 20;
                    hungerActivity = this.f6278a;
                    hungerActivity.f6324j -= 5;
                    hungerActivity = this.f6278a;
                    hungerActivity.f6318d -= 5;
                    hungerActivity = this.f6278a;
                    hungerActivity.f6322h++;
                    this.f6278a.m9833c();
                    break;
                case 3:
                    if (this.f6278a.f6318d < 20) {
                        if (this.f6278a.f6319e < 120) {
                            this.f6278a.m9831a(this.f6278a.bg, this.f6278a.getResources().getString(R.string.toast_cash), (int) R.drawable.money);
                            break;
                        } else {
                            this.f6278a.m9831a(this.f6278a.bh, this.f6278a.getResources().getString(R.string.toast_bank), (int) R.drawable.money);
                            break;
                        }
                    }
                    hungerActivity = this.f6278a;
                    hungerActivity.f6323i += 40;
                    hungerActivity = this.f6278a;
                    hungerActivity.f6324j -= 4;
                    hungerActivity = this.f6278a;
                    hungerActivity.f6318d -= 20;
                    hungerActivity = this.f6278a;
                    hungerActivity.f6322h++;
                    this.f6278a.m9833c();
                    break;
                case 4:
                    if (this.f6278a.f6318d < 70) {
                        if (this.f6278a.f6319e < 170) {
                            this.f6278a.m9831a(this.f6278a.bg, this.f6278a.getResources().getString(R.string.toast_cash), (int) R.drawable.money);
                            break;
                        } else {
                            this.f6278a.m9831a(this.f6278a.bh, this.f6278a.getResources().getString(R.string.toast_bank), (int) R.drawable.money);
                            break;
                        }
                    }
                    hungerActivity = this.f6278a;
                    hungerActivity.f6323i += 120;
                    hungerActivity = this.f6278a;
                    hungerActivity.f6324j -= 4;
                    hungerActivity = this.f6278a;
                    hungerActivity.f6318d -= 70;
                    hungerActivity = this.f6278a;
                    hungerActivity.f6322h++;
                    this.f6278a.m9833c();
                    break;
                case 5:
                    if (this.f6278a.f6318d < 140) {
                        if (this.f6278a.f6319e < 240) {
                            this.f6278a.m9831a(this.f6278a.bg, this.f6278a.getResources().getString(R.string.toast_cash), (int) R.drawable.money);
                            break;
                        } else {
                            this.f6278a.m9831a(this.f6278a.bh, this.f6278a.getResources().getString(R.string.toast_bank), (int) R.drawable.money);
                            break;
                        }
                    }
                    hungerActivity = this.f6278a;
                    hungerActivity.f6323i += 150;
                    hungerActivity = this.f6278a;
                    hungerActivity.f6324j -= 3;
                    hungerActivity = this.f6278a;
                    hungerActivity.f6318d -= 140;
                    hungerActivity = this.f6278a;
                    hungerActivity.f6322h++;
                    this.f6278a.m9833c();
                    break;
                case 6:
                    if (this.f6278a.f6318d < 200) {
                        if (this.f6278a.f6319e < 300) {
                            this.f6278a.m9831a(this.f6278a.bg, this.f6278a.getResources().getString(R.string.toast_cash), (int) R.drawable.money);
                            break;
                        } else {
                            this.f6278a.m9831a(this.f6278a.bh, this.f6278a.getResources().getString(R.string.toast_bank), (int) R.drawable.money);
                            break;
                        }
                    }
                    hungerActivity = this.f6278a;
                    hungerActivity.f6323i += 200;
                    hungerActivity = this.f6278a;
                    hungerActivity.f6324j -= 3;
                    hungerActivity = this.f6278a;
                    hungerActivity.f6318d -= 200;
                    hungerActivity = this.f6278a;
                    hungerActivity.f6322h++;
                    this.f6278a.m9833c();
                    break;
            }
            if (this.f6278a.f6324j <= 0) {
                this.f6278a.f6324j = 0;
                this.f6278a.m9831a(this.f6278a.bj, this.f6278a.getResources().getString(R.string.toast_dead_health), (int) R.drawable.dead);
                this.f6278a.m9829k();
            } else if (this.f6278a.f6324j < 25) {
                this.f6278a.m9831a(this.f6278a.bi, this.f6278a.getResources().getString(R.string.toast_health), (int) R.drawable.low_health);
            }
            if (this.f6278a.f6323i >= 300) {
                this.f6278a.f6323i = 300;
            }
            this.f6278a.m9825a(this.f6278a.f6323i, this.f6278a.f6324j);
            this.f6278a.bc.setText("$" + String.format("%,d", new Object[]{Integer.valueOf(this.f6278a.f6318d)}).replace(',', ' '));
            this.f6278a.be.setText("$" + String.format("%,d", new Object[]{Integer.valueOf(this.f6278a.f6319e)}).replace(',', ' '));
        }
    }

    class C19774 implements OnLoadCompleteListener {
        final /* synthetic */ HungerActivity f6287a;

        C19774(HungerActivity hungerActivity) {
            this.f6287a = hungerActivity;
        }

        public void onLoadComplete(SoundPool soundPool, int i, int i2) {
            Log.e("HungerActivity", "Sound Loaded");
            this.f6287a.bp = true;
        }
    }

    class C19785 implements Runnable {
        final /* synthetic */ HungerActivity f6288a;

        C19785(HungerActivity hungerActivity) {
            this.f6288a = hungerActivity;
        }

        public void run() {
            this.f6288a.m9838h();
        }
    }

    private String m9823a(int i) {
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

    private void m9825a(int i, int i2) {
        final Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.hunger);
        final C2110s c2110s = new C2110s();
        final Bitmap decodeResource2 = BitmapFactory.decodeResource(getResources(), R.drawable.health);
        final C2110s c2110s2 = new C2110s();
        final int i3 = i;
        final int i4 = i2;
        new Thread(new Runnable(this) {
            final /* synthetic */ HungerActivity f6286g;

            class C19751 implements Runnable {
                final /* synthetic */ C19763 f6279a;

                C19751(C19763 c19763) {
                    this.f6279a = c19763;
                }

                public void run() {
                    if (Looper.getMainLooper() == Looper.myLooper()) {
                        Log.e("HungerActivity", "uVitals runOnUiThread");
                        try {
                            this.f6279a.f6286g.aY.m10202b();
                            this.f6279a.f6286g.aY.m10201a(c2110s);
                            this.f6279a.f6286g.aY.m10201a(c2110s2);
                        } catch (Exception e) {
                            Log.e("HungerActivity", "Error: " + e);
                        }
                    }
                }
            }

            public void run() {
                c2110s.m10204a(Bitmap.createScaledBitmap(decodeResource, decodeResource.getWidth(), decodeResource.getHeight(), false));
                c2110s.m10206a("Hunger");
                c2110s.m10208b(String.valueOf(i3) + "/300");
                c2110s.m10205a(this.f6286g.ba);
                c2110s2.m10204a(Bitmap.createScaledBitmap(decodeResource2, decodeResource2.getWidth(), decodeResource2.getHeight(), false));
                c2110s2.m10206a("Health");
                c2110s2.m10208b(String.valueOf(i4) + "/300");
                c2110s2.m10205a(this.f6286g.bb);
                this.f6286g.runOnUiThread(new C19751(this));
            }
        }).start();
    }

    private void m9828j() {
        this.aZ.m10160b();
        C2107q c2107q = new C2107q();
        c2107q.m10197a(getString(R.string.hunger_list_1));
        c2107q.m10199b(getString(R.string.hunger_list_1p));
        this.aZ.m10159a(c2107q);
        c2107q = new C2107q();
        c2107q.m10197a(getString(R.string.hunger_list_2));
        c2107q.m10199b(getString(R.string.hunger_list_2p));
        this.aZ.m10159a(c2107q);
        c2107q = new C2107q();
        c2107q.m10197a(getString(R.string.hunger_list_3));
        c2107q.m10199b(getString(R.string.hunger_list_3p));
        this.aZ.m10159a(c2107q);
        c2107q = new C2107q();
        c2107q.m10197a(getString(R.string.hunger_list_4));
        c2107q.m10199b(getString(R.string.hunger_list_4p));
        this.aZ.m10159a(c2107q);
        c2107q = new C2107q();
        c2107q.m10197a(getString(R.string.hunger_list_5));
        c2107q.m10199b(getString(R.string.hunger_list_5p));
        this.aZ.m10159a(c2107q);
        c2107q = new C2107q();
        c2107q.m10197a(getString(R.string.hunger_list_6));
        c2107q.m10199b(getString(R.string.hunger_list_6p));
        this.aZ.m10159a(c2107q);
        c2107q = new C2107q();
        c2107q.m10197a(getString(R.string.hunger_list_7));
        c2107q.m10199b(getString(R.string.hunger_list_7p));
        this.aZ.m10159a(c2107q);
    }

    private void m9829k() {
        m9836f();
        this.f6316b = "";
        this.f6317c = "";
        this.f6299K = false;
        this.f6300L = false;
        this.f6301M = false;
        this.f6302N = false;
        this.f6303O = false;
        this.f6304P = false;
        this.f6297I = 0;
        this.f6298J = 0;
        this.f6325k = false;
        this.f6326l = false;
        this.f6327m = false;
        this.f6328n = false;
        this.f6329o = false;
        this.f6330p = false;
        this.f6331q = false;
        this.f6332r = false;
        this.f6333s = false;
        this.f6334t = false;
        this.f6335u = false;
        this.f6336v = false;
        this.f6337w = false;
        this.f6338x = false;
        this.f6339y = false;
        this.f6340z = false;
        this.f6289A = false;
        this.f6290B = false;
        this.f6291C = false;
        this.f6292D = false;
        this.f6293E = false;
        this.f6294F = false;
        this.f6295G = false;
        this.f6296H = false;
        this.f6318d = 0;
        this.f6319e = 0;
        this.f6320f = 0;
        this.f6321g = 31;
        this.f6322h = 0;
        this.f6323i = 80;
        this.f6324j = 80;
        this.f6306R = true;
        this.f6307S = false;
        this.f6312X = 0;
        this.f6308T = false;
        this.f6313Y = 0;
        this.f6309U = false;
        this.f6314Z = 0;
        this.f6310V = false;
        this.aa = 0;
        this.f6311W = false;
        this.ab = 0;
        this.ac = true;
        this.ad = false;
        this.aj = 0;
        this.ae = false;
        this.ak = 0;
        this.af = false;
        this.al = 0;
        this.ag = false;
        this.am = 0;
        this.ah = false;
        this.an = 0;
        this.ai = false;
        this.ao = 0;
        this.ap = false;
        this.av = 0;
        this.aq = false;
        this.aw = 0;
        this.ar = false;
        this.ax = 0;
        this.as = false;
        this.ay = 0;
        this.at = false;
        this.az = 0;
        this.au = false;
        this.aA = 0;
        this.aB = false;
        this.aC = false;
        this.aD = false;
        this.aE = false;
        this.aF = false;
        this.aG = false;
        this.aH = false;
        this.aI = false;
        this.aJ = false;
        this.aK = false;
        this.aL = false;
        this.aM = false;
        this.aN = false;
        this.aO = false;
        this.aP = false;
        this.aQ = false;
        this.aR = false;
        m9839i();
        Intent intent = new Intent(this, PlayActivity.class);
        finish();
        startActivity(intent);
    }

    public void m9830a() {
        Editor edit = getApplicationContext().getSharedPreferences(getString(R.string.preference_file_key), 0).edit();
        edit.putString("NAME", this.f6315a);
        edit.putString("CODES", this.f6316b);
        edit.putString("DATES", this.f6317c);
        edit.putInt("MONEY", this.f6320f);
        edit.putInt("CASH", this.f6318d);
        edit.putInt("BANK", this.f6319e);
        edit.putInt("BANK_DAYS", this.f6321g);
        edit.putInt("AGE", this.f6322h);
        edit.putInt("HUNGER", this.f6323i);
        edit.putInt("HEALTH", this.f6324j);
        edit.putBoolean("VOLUME", this.f6305Q);
        edit.putInt("A2C", this.f6297I);
        edit.putInt("A3C", this.f6298J);
        edit.putBoolean("A1", this.f6325k);
        edit.putBoolean("A2", this.f6326l);
        edit.putBoolean("A3", this.f6327m);
        edit.putBoolean("A4", this.f6328n);
        edit.putBoolean("A5", this.f6329o);
        edit.putBoolean("A6", this.f6330p);
        edit.putBoolean("A7", this.f6331q);
        edit.putBoolean("A8", this.f6332r);
        edit.putBoolean("A9", this.f6333s);
        edit.putBoolean("A10", this.f6334t);
        edit.putBoolean("A11", this.f6335u);
        edit.putBoolean("A12", this.f6336v);
        edit.putBoolean("A1U", this.f6337w);
        edit.putBoolean("A2U", this.f6338x);
        edit.putBoolean("A3U", this.f6339y);
        edit.putBoolean("A4U", this.f6340z);
        edit.putBoolean("A5U", this.f6289A);
        edit.putBoolean("A6U", this.f6290B);
        edit.putBoolean("A7U", this.f6291C);
        edit.putBoolean("A8U", this.f6292D);
        edit.putBoolean("A9U", this.f6293E);
        edit.putBoolean("A10U", this.f6294F);
        edit.putBoolean("A11U", this.f6295G);
        edit.putBoolean("A12U", this.f6296H);
        edit.putBoolean("A12L", this.f6299K);
        edit.putBoolean("A12T", this.f6300L);
        edit.putBoolean("A12W", this.f6301M);
        edit.putBoolean("A12E", this.f6302N);
        edit.putBoolean("A12C", this.f6303O);
        edit.putBoolean("A12S", this.f6304P);
        edit.putBoolean("BOX", this.f6306R);
        edit.putBoolean("BASEMENT", this.f6307S);
        edit.putInt("BASEMENT_DAYS", this.f6312X);
        edit.putBoolean("APARTMENT", this.f6308T);
        edit.putInt("APARTMENT_DAYS", this.f6313Y);
        edit.putBoolean("HOUSE", this.f6309U);
        edit.putInt("HOUSE_NO", this.f6314Z);
        edit.putBoolean("CONDO", this.f6310V);
        edit.putInt("CONDO_NO", this.aa);
        edit.putBoolean("MANSION", this.f6311W);
        edit.putInt("MANSION_NO", this.ab);
        edit.putBoolean("BAREFOOT", this.ac);
        edit.putBoolean("SHOES", this.ad);
        edit.putInt("SHOES_NO", this.aj);
        edit.putBoolean("BICYCLE", this.ae);
        edit.putInt("BICYCLE_NO", this.ak);
        edit.putBoolean("CAR", this.af);
        edit.putInt("CAR_NO", this.al);
        edit.putBoolean("TRUCK", this.ag);
        edit.putInt("TRUCK_NO", this.am);
        edit.putBoolean("TOWNCAR", this.ah);
        edit.putInt("TOWNCAR_NO", this.an);
        edit.putBoolean("HELICOPTER", this.ai);
        edit.putInt("HELICOPTER_NO", this.ao);
        edit.putBoolean("KNIFE", this.ap);
        edit.putInt("KNIFE_NO", this.av);
        edit.putBoolean("GUN", this.aq);
        edit.putInt("GUN_NO", this.aw);
        edit.putBoolean("SHOTGUN", this.ar);
        edit.putInt("SHOTGUN_NO", this.ax);
        edit.putBoolean("RIFLE", this.as);
        edit.putInt("RIFLE_NO", this.ay);
        edit.putBoolean("VEST", this.at);
        edit.putInt("VEST_NO", this.az);
        edit.putBoolean("EXPLOSIVES", this.au);
        edit.putInt("EXPLOSIVES_NO", this.aA);
        edit.putBoolean("MATH", this.aB);
        edit.putBoolean("SCHOOL", this.aC);
        edit.putBoolean("MASONRY", this.aD);
        edit.putBoolean("COLLEGE", this.aE);
        edit.putBoolean("UNIVERSITY", this.aF);
        edit.putBoolean("NOVICE", this.aG);
        edit.putBoolean("MOBSTER", this.aH);
        edit.putBoolean("HITMAN", this.aI);
        edit.putBoolean("PICKPOCKET", this.aJ);
        edit.putBoolean("BURGLAR", this.aK);
        edit.putBoolean("MASTER", this.aL);
        edit.putBoolean("DRIVING", this.aM);
        edit.putBoolean("LIQUOR", this.aN);
        edit.putBoolean("BUSINESS", this.aO);
        edit.putBoolean("LAWS", this.aP);
        edit.putBoolean("ACCOUNTING", this.aQ);
        edit.putBoolean("MANAGEMENT", this.aR);
        edit.apply();
    }

    public void m9831a(Toast toast, String str, int i) {
        View inflate = getLayoutInflater().inflate(R.layout.toast_message, (ViewGroup) findViewById(R.id.toast_layout_root));
        ((ImageView) inflate.findViewById(R.id.toast_image)).setImageResource(i);
        ((TextView) inflate.findViewById(R.id.toast_text)).setText(str);
        if (toast.getView().getWindowVisibility() != 0) {
            Log.e("HungerActivity", "Exists");
            toast.setDuration(1);
        }
        toast.setGravity(16, 0, 0);
        toast.setView(inflate);
        toast.show();
    }

    public void m9832b() {
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences(getString(R.string.preference_file_key), 0);
        this.f6315a = sharedPreferences.getString("NAME", "Unknown");
        this.f6316b = sharedPreferences.getString("CODES", "");
        this.f6317c = sharedPreferences.getString("DATES", "");
        this.f6320f = sharedPreferences.getInt("MONEY", 0);
        this.f6318d = sharedPreferences.getInt("CASH", 0);
        this.f6319e = sharedPreferences.getInt("BANK", 0);
        this.f6321g = sharedPreferences.getInt("BANK_DAYS", 31);
        this.f6322h = sharedPreferences.getInt("AGE", 0);
        this.f6323i = sharedPreferences.getInt("HUNGER", 80);
        this.f6324j = sharedPreferences.getInt("HEALTH", 80);
        this.f6305Q = sharedPreferences.getBoolean("VOLUME", true);
        this.f6297I = sharedPreferences.getInt("A2C", 0);
        this.f6298J = sharedPreferences.getInt("A3C", 0);
        this.f6325k = sharedPreferences.getBoolean("A1", false);
        this.f6326l = sharedPreferences.getBoolean("A2", false);
        this.f6327m = sharedPreferences.getBoolean("A3", false);
        this.f6328n = sharedPreferences.getBoolean("A4", false);
        this.f6329o = sharedPreferences.getBoolean("A5", false);
        this.f6330p = sharedPreferences.getBoolean("A6", false);
        this.f6331q = sharedPreferences.getBoolean("A7", false);
        this.f6332r = sharedPreferences.getBoolean("A8", false);
        this.f6333s = sharedPreferences.getBoolean("A9", false);
        this.f6334t = sharedPreferences.getBoolean("A10", false);
        this.f6335u = sharedPreferences.getBoolean("A11", false);
        this.f6336v = sharedPreferences.getBoolean("A12", false);
        this.f6337w = sharedPreferences.getBoolean("A1U", false);
        this.f6338x = sharedPreferences.getBoolean("A2U", false);
        this.f6339y = sharedPreferences.getBoolean("A3U", false);
        this.f6340z = sharedPreferences.getBoolean("A4U", false);
        this.f6289A = sharedPreferences.getBoolean("A5U", false);
        this.f6290B = sharedPreferences.getBoolean("A6U", false);
        this.f6291C = sharedPreferences.getBoolean("A7U", false);
        this.f6292D = sharedPreferences.getBoolean("A8U", false);
        this.f6293E = sharedPreferences.getBoolean("A9U", false);
        this.f6294F = sharedPreferences.getBoolean("A10U", false);
        this.f6295G = sharedPreferences.getBoolean("A11U", false);
        this.f6296H = sharedPreferences.getBoolean("A12U", false);
        this.f6299K = sharedPreferences.getBoolean("A12L", false);
        this.f6300L = sharedPreferences.getBoolean("A12T", false);
        this.f6301M = sharedPreferences.getBoolean("A12W", false);
        this.f6302N = sharedPreferences.getBoolean("A12E", false);
        this.f6303O = sharedPreferences.getBoolean("A12C", false);
        this.f6304P = sharedPreferences.getBoolean("A12S", false);
        this.f6306R = sharedPreferences.getBoolean("BOX", true);
        this.f6307S = sharedPreferences.getBoolean("BASEMENT", false);
        this.f6312X = sharedPreferences.getInt("BASEMENT_DAYS", 0);
        this.f6308T = sharedPreferences.getBoolean("APARTMENT", false);
        this.f6313Y = sharedPreferences.getInt("APARTMENT_DAYS", 0);
        this.f6309U = sharedPreferences.getBoolean("HOUSE", false);
        this.f6314Z = sharedPreferences.getInt("HOUSE_NO", 0);
        this.f6310V = sharedPreferences.getBoolean("CONDO", false);
        this.aa = sharedPreferences.getInt("CONDO_NO", 0);
        this.f6311W = sharedPreferences.getBoolean("MANSION", false);
        this.ab = sharedPreferences.getInt("MANSION_NO", 0);
        this.ac = sharedPreferences.getBoolean("BAREFOOT", true);
        this.ad = sharedPreferences.getBoolean("SHOES", false);
        this.aj = sharedPreferences.getInt("SHOES_NO", 0);
        this.ae = sharedPreferences.getBoolean("BICYCLE", false);
        this.ak = sharedPreferences.getInt("BICYCLE_NO", 0);
        this.af = sharedPreferences.getBoolean("CAR", false);
        this.al = sharedPreferences.getInt("CAR_NO", 0);
        this.ag = sharedPreferences.getBoolean("TRUCK", false);
        this.am = sharedPreferences.getInt("TRUCK_NO", 0);
        this.ah = sharedPreferences.getBoolean("TOWNCAR", false);
        this.an = sharedPreferences.getInt("TOWNCAR_NO", 0);
        this.ai = sharedPreferences.getBoolean("HELICOPTER", false);
        this.ao = sharedPreferences.getInt("HELICOPTER_NO", 0);
        this.ap = sharedPreferences.getBoolean("KNIFE", false);
        this.av = sharedPreferences.getInt("KNIFE_NO", 0);
        this.aq = sharedPreferences.getBoolean("GUN", false);
        this.aw = sharedPreferences.getInt("GUN_NO", 0);
        this.ar = sharedPreferences.getBoolean("SHOTGUN", false);
        this.ax = sharedPreferences.getInt("SHOTGUN_NO", 0);
        this.as = sharedPreferences.getBoolean("RIFLE", false);
        this.ay = sharedPreferences.getInt("RIFLE_NO", 0);
        this.at = sharedPreferences.getBoolean("VEST", false);
        this.az = sharedPreferences.getInt("VEST_NO", 0);
        this.au = sharedPreferences.getBoolean("EXPLOSIVES", false);
        this.aA = sharedPreferences.getInt("EXPLOSIVES_NO", 0);
        this.aB = sharedPreferences.getBoolean("MATH", false);
        this.aC = sharedPreferences.getBoolean("SCHOOL", false);
        this.aD = sharedPreferences.getBoolean("MASONRY", false);
        this.aE = sharedPreferences.getBoolean("COLLEGE", false);
        this.aF = sharedPreferences.getBoolean("UNIVERSITY", false);
        this.aG = sharedPreferences.getBoolean("NOVICE", false);
        this.aH = sharedPreferences.getBoolean("MOBSTER", false);
        this.aI = sharedPreferences.getBoolean("HITMAN", false);
        this.aJ = sharedPreferences.getBoolean("PICKPOCKET", false);
        this.aK = sharedPreferences.getBoolean("BURGLAR", false);
        this.aL = sharedPreferences.getBoolean("MASTER", false);
        this.aM = sharedPreferences.getBoolean("DRIVING", false);
        this.aN = sharedPreferences.getBoolean("LIQUOR", false);
        this.aO = sharedPreferences.getBoolean("BUSINESS", false);
        this.aP = sharedPreferences.getBoolean("LAWS", false);
        this.aQ = sharedPreferences.getBoolean("ACCOUNTING", false);
        this.aR = sharedPreferences.getBoolean("MANAGEMENT", false);
    }

    public void m9833c() {
        if (this.f6319e == 0) {
            this.f6321g = 31;
        } else if (this.f6319e >= 100 && this.f6321g > 1) {
            this.f6321g--;
        } else if (this.f6319e >= 100 && this.f6321g <= 1) {
            this.f6321g = 30;
            this.f6319e += this.f6319e / 100;
        }
        if (this.f6307S && this.f6312X >= 1) {
            this.f6312X--;
        }
        if (this.f6307S && this.f6312X == 0) {
            this.f6307S = false;
            this.f6312X = 0;
        }
        if (this.f6308T && this.f6313Y >= 1) {
            this.f6313Y--;
        }
        if (this.f6308T && this.f6313Y == 0) {
            this.f6308T = false;
            this.f6313Y = 0;
        }
    }

    public void m9834d() {
        if (this.f6305Q) {
            this.bk = (AudioManager) getSystemService("audio");
            this.bo = ((float) this.bk.getStreamVolume(3)) / ((float) this.bk.getStreamMaxVolume(3));
            this.bl = new SoundPool(10, 3, 0);
            this.bl.setOnLoadCompleteListener(new C19774(this));
            this.bn = this.bl.load(this, R.raw.dead, 1);
            this.bm = this.bl.load(this, R.raw.click, 1);
            return;
        }
        Log.e("HungerActivity", "Sound Not Loaded");
        this.bp = false;
    }

    public void m9835e() {
        try {
            this.bl.play(this.bm, this.bo, this.bo, 1, 0, 1.0f);
        } catch (Exception e) {
            Log.e("HungerActivity", "Error Playing Sound");
        }
    }

    public void m9836f() {
        try {
            this.bl.play(this.bn, this.bo, this.bo, 1, 0, 1.0f);
        } catch (Exception e) {
            Log.e("HungerActivity", "Error Playing Sound");
        }
    }

    public void m9837g() {
        this.bq = new C0486e(this);
        this.bq.m2147a(getString(R.string.interstitial_ad_unit_id));
        this.bq.m2146a(new C0472a().m2094a());
    }

    public void goBack(View view) {
        m9835e();
        finish();
    }

    public void m9838h() {
        if (this.bq == null || !this.bq.m2148a()) {
            Log.e("HungerActivity", "Ad Not Ready.");
        } else {
            this.bq.m2149b();
        }
    }

    public void m9839i() {
        new Handler().postDelayed(new C19785(this), 5000);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.e("HungerActivity", "onCreate");
        setContentView(R.layout.activity_hunger);
        this.aS = Typeface.createFromAsset(getAssets(), "fonts/caviar_dreams.ttf");
        this.aT = Typeface.createFromAsset(getAssets(), "fonts/caviar_dreams_bold.ttf");
        this.bg = Toast.makeText(this, "", 1);
        this.bh = Toast.makeText(this, "", 1);
        this.bi = Toast.makeText(this, "", 1);
        this.bj = Toast.makeText(this, "", 1);
        this.aU = (AdView) findViewById(R.id.adView);
        this.aU.setAdListener(new C19731(this));
        this.aU.m2048a(new C0472a().m2094a());
        this.bd = (TextView) findViewById(R.id.hunger_cash_title);
        this.bd.setTypeface(this.aT);
        this.bc = (TextView) findViewById(R.id.hunger_cash_amount);
        this.bc.setTypeface(this.aS);
        this.bf = (TextView) findViewById(R.id.hunger_bank_title);
        this.bf.setTypeface(this.aT);
        this.be = (TextView) findViewById(R.id.hunger_bank_amount);
        this.be.setTypeface(this.aS);
        this.aV = (Button) findViewById(R.id.back);
        this.aV.setTypeface(this.aT);
        this.aW = (ListView) findViewById(R.id.list);
        this.aY = new C2109r(this);
        this.aW.setAdapter(this.aY);
        this.aX = (ListView) findViewById(R.id.hunger_list);
        this.aZ = new C2092g(this);
        this.aX.setAdapter(this.aZ);
        this.aX.setOnItemClickListener(new C19742(this));
    }

    public void onDestroy() {
        super.onDestroy();
        Log.e("HungerActivity", "onDestroy");
        if (this.aU != null) {
            this.aU.m2047a();
        }
    }

    protected void onPause() {
        super.onPause();
        Log.e("HungerActivity", "onPause");
        if (this.aU != null) {
            this.aU.m2049b();
        }
        if (this.bg != null) {
            this.bg.cancel();
        }
        if (this.bh != null) {
            this.bh.cancel();
        }
        if (this.bi != null) {
            this.bi.cancel();
        }
        if (this.bl != null) {
            this.bl.unload(this.bm);
            this.bl.unload(this.bn);
            this.bl.release();
            this.bl = null;
        }
        m9830a();
    }

    public void onResume() {
        super.onResume();
        Log.e("HungerActivity", "onResume");
        if (this.aU != null) {
            this.aU.m2050c();
        }
        m9832b();
        m9834d();
        m9837g();
        m9825a(this.f6323i, this.f6324j);
        m9828j();
        this.bc.setText("$" + String.format("%,d", new Object[]{Integer.valueOf(this.f6318d)}).replace(',', ' '));
        this.be.setText("$" + String.format("%,d", new Object[]{Integer.valueOf(this.f6319e)}).replace(',', ' '));
    }
}
