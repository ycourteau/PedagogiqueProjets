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

public class HealthActivity extends Activity {
    public boolean f6225A;
    public boolean f6226B;
    public boolean f6227C;
    public boolean f6228D;
    public boolean f6229E;
    public boolean f6230F;
    public boolean f6231G;
    public boolean f6232H;
    public int f6233I;
    public int f6234J;
    public boolean f6235K;
    public boolean f6236L;
    public boolean f6237M;
    public boolean f6238N;
    public boolean f6239O;
    public boolean f6240P;
    public boolean f6241Q;
    public boolean f6242R;
    public boolean f6243S;
    public boolean f6244T;
    public boolean f6245U;
    public boolean f6246V;
    public boolean f6247W;
    public int f6248X;
    public int f6249Y;
    public int f6250Z;
    public String f6251a;
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
    public String f6252b;
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
    public String f6253c;
    public int f6254d;
    public int f6255e;
    public int f6256f;
    public int f6257g;
    public int f6258h;
    public int f6259i;
    public int f6260j;
    public boolean f6261k;
    public boolean f6262l;
    public boolean f6263m;
    public boolean f6264n;
    public boolean f6265o;
    public boolean f6266p;
    public boolean f6267q;
    public boolean f6268r;
    public boolean f6269s;
    public boolean f6270t;
    public boolean f6271u;
    public boolean f6272v;
    public boolean f6273w;
    public boolean f6274x;
    public boolean f6275y;
    public boolean f6276z;

    class C19671 extends C0427a {
        final /* synthetic */ HealthActivity f6213a;

        C19671(HealthActivity healthActivity) {
            this.f6213a = healthActivity;
        }

        public void mo322a() {
            Log.e("HealthActivity", "Google onAdLoaded");
        }

        public void mo323a(int i) {
            Log.e("HealthActivity", "Google onAdFailedToLoad: " + this.f6213a.m9801a(i));
        }

        public void mo324b() {
            Log.e("HealthActivity", "Google onAdOpened");
        }

        public void mo325c() {
            Log.e("HealthActivity", "Google onAdClosed");
        }

        public void mo326d() {
            Log.d("HealthActivity", "Google onAdLeftApplication");
        }
    }

    class C19682 implements OnItemClickListener {
        final /* synthetic */ HealthActivity f6214a;

        C19682(HealthActivity healthActivity) {
            this.f6214a = healthActivity;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            String b = ((C2107q) this.f6214a.aZ.m10158a().get(i)).m10198b();
            int i2 = -1;
            switch (b.hashCode()) {
                case 1164:
                    if (b.equals("$0")) {
                        i2 = 0;
                        break;
                    }
                    break;
                case 1167:
                    if (b.equals("$3")) {
                        i2 = 1;
                        break;
                    }
                    break;
                case 36168:
                    if (b.equals("$15")) {
                        i2 = 2;
                        break;
                    }
                    break;
                case 36199:
                    if (b.equals("$25")) {
                        i2 = 3;
                        break;
                    }
                    break;
                case 36287:
                    if (b.equals("$50")) {
                        i2 = 4;
                        break;
                    }
                    break;
                case 36380:
                    if (b.equals("$80")) {
                        i2 = 5;
                        break;
                    }
                    break;
                case 1121225:
                    if (b.equals("$140")) {
                        i2 = 6;
                        break;
                    }
                    break;
            }
            HealthActivity healthActivity;
            switch (i2) {
                case 0:
                    healthActivity = this.f6214a;
                    healthActivity.f6259i -= 5;
                    healthActivity = this.f6214a;
                    healthActivity.f6260j += 10;
                    healthActivity = this.f6214a;
                    healthActivity.f6254d += 0;
                    healthActivity = this.f6214a;
                    healthActivity.f6258h++;
                    this.f6214a.m9811c();
                    break;
                case 1:
                    if (this.f6214a.f6254d < 3) {
                        if (this.f6214a.f6255e < C0274i.Theme_radioButtonStyle) {
                            this.f6214a.m9809a(this.f6214a.bg, this.f6214a.getResources().getString(R.string.toast_cash), (int) R.drawable.money);
                            break;
                        } else {
                            this.f6214a.m9809a(this.f6214a.bh, this.f6214a.getResources().getString(R.string.toast_bank), (int) R.drawable.money);
                            break;
                        }
                    }
                    healthActivity = this.f6214a;
                    healthActivity.f6259i -= 5;
                    healthActivity = this.f6214a;
                    healthActivity.f6260j += 20;
                    healthActivity = this.f6214a;
                    healthActivity.f6254d -= 3;
                    healthActivity = this.f6214a;
                    healthActivity.f6258h++;
                    this.f6214a.m9811c();
                    break;
                case 2:
                    if (this.f6214a.f6254d < 15) {
                        if (this.f6214a.f6255e < 115) {
                            this.f6214a.m9809a(this.f6214a.bg, this.f6214a.getResources().getString(R.string.toast_cash), (int) R.drawable.money);
                            break;
                        } else {
                            this.f6214a.m9809a(this.f6214a.bh, this.f6214a.getResources().getString(R.string.toast_bank), (int) R.drawable.money);
                            break;
                        }
                    }
                    healthActivity = this.f6214a;
                    healthActivity.f6259i -= 5;
                    healthActivity = this.f6214a;
                    healthActivity.f6260j += 40;
                    healthActivity = this.f6214a;
                    healthActivity.f6254d -= 15;
                    healthActivity = this.f6214a;
                    healthActivity.f6258h++;
                    this.f6214a.m9811c();
                    break;
                case 3:
                    if (this.f6214a.f6254d < 25) {
                        if (this.f6214a.f6255e < 125) {
                            this.f6214a.m9809a(this.f6214a.bg, this.f6214a.getResources().getString(R.string.toast_cash), (int) R.drawable.money);
                            break;
                        } else {
                            this.f6214a.m9809a(this.f6214a.bh, this.f6214a.getResources().getString(R.string.toast_bank), (int) R.drawable.money);
                            break;
                        }
                    }
                    healthActivity = this.f6214a;
                    healthActivity.f6259i -= 4;
                    healthActivity = this.f6214a;
                    healthActivity.f6260j += 70;
                    healthActivity = this.f6214a;
                    healthActivity.f6254d -= 25;
                    healthActivity = this.f6214a;
                    healthActivity.f6258h++;
                    this.f6214a.m9811c();
                    break;
                case 4:
                    if (this.f6214a.f6254d < 50) {
                        if (this.f6214a.f6255e < 150) {
                            this.f6214a.m9809a(this.f6214a.bg, this.f6214a.getResources().getString(R.string.toast_cash), (int) R.drawable.money);
                            break;
                        } else {
                            this.f6214a.m9809a(this.f6214a.bh, this.f6214a.getResources().getString(R.string.toast_bank), (int) R.drawable.money);
                            break;
                        }
                    }
                    healthActivity = this.f6214a;
                    healthActivity.f6259i -= 4;
                    healthActivity = this.f6214a;
                    healthActivity.f6260j += 100;
                    healthActivity = this.f6214a;
                    healthActivity.f6254d -= 50;
                    healthActivity = this.f6214a;
                    healthActivity.f6258h++;
                    this.f6214a.m9811c();
                    break;
                case 5:
                    if (this.f6214a.f6254d < 80) {
                        if (this.f6214a.f6255e < 180) {
                            this.f6214a.m9809a(this.f6214a.bg, this.f6214a.getResources().getString(R.string.toast_cash), (int) R.drawable.money);
                            break;
                        } else {
                            this.f6214a.m9809a(this.f6214a.bh, this.f6214a.getResources().getString(R.string.toast_bank), (int) R.drawable.money);
                            break;
                        }
                    }
                    healthActivity = this.f6214a;
                    healthActivity.f6259i -= 3;
                    healthActivity = this.f6214a;
                    healthActivity.f6260j += 150;
                    healthActivity = this.f6214a;
                    healthActivity.f6254d -= 80;
                    healthActivity = this.f6214a;
                    healthActivity.f6258h++;
                    this.f6214a.m9811c();
                    break;
                case 6:
                    if (this.f6214a.f6254d < 140) {
                        if (this.f6214a.f6255e < 240) {
                            this.f6214a.m9809a(this.f6214a.bg, this.f6214a.getResources().getString(R.string.toast_cash), (int) R.drawable.money);
                            break;
                        } else {
                            this.f6214a.m9809a(this.f6214a.bh, this.f6214a.getResources().getString(R.string.toast_bank), (int) R.drawable.money);
                            break;
                        }
                    }
                    healthActivity = this.f6214a;
                    healthActivity.f6259i -= 3;
                    healthActivity = this.f6214a;
                    healthActivity.f6260j += 200;
                    healthActivity = this.f6214a;
                    healthActivity.f6254d -= 140;
                    healthActivity = this.f6214a;
                    healthActivity.f6258h++;
                    this.f6214a.m9811c();
                    break;
            }
            if (this.f6214a.f6259i <= 0) {
                this.f6214a.f6259i = 0;
                this.f6214a.m9809a(this.f6214a.bj, this.f6214a.getResources().getString(R.string.toast_dead_hunger), (int) R.drawable.dead);
                this.f6214a.m9807k();
            } else if (this.f6214a.f6259i < 25) {
                this.f6214a.m9809a(this.f6214a.bi, this.f6214a.getResources().getString(R.string.toast_hunger), (int) R.drawable.low_hunger);
            }
            if (this.f6214a.f6260j >= 300) {
                this.f6214a.f6260j = 300;
            }
            this.f6214a.m9803a(this.f6214a.f6259i, this.f6214a.f6260j);
            this.f6214a.bc.setText("$" + String.format("%,d", new Object[]{Integer.valueOf(this.f6214a.f6254d)}).replace(',', ' '));
            this.f6214a.be.setText("$" + String.format("%,d", new Object[]{Integer.valueOf(this.f6214a.f6255e)}).replace(',', ' '));
        }
    }

    class C19714 implements OnLoadCompleteListener {
        final /* synthetic */ HealthActivity f6223a;

        C19714(HealthActivity healthActivity) {
            this.f6223a = healthActivity;
        }

        public void onLoadComplete(SoundPool soundPool, int i, int i2) {
            Log.e("HealthActivity", "Sound Loaded");
            this.f6223a.bp = true;
        }
    }

    class C19725 implements Runnable {
        final /* synthetic */ HealthActivity f6224a;

        C19725(HealthActivity healthActivity) {
            this.f6224a = healthActivity;
        }

        public void run() {
            this.f6224a.m9816h();
        }
    }

    private String m9801a(int i) {
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

    private void m9803a(int i, int i2) {
        final Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.hunger);
        final C2110s c2110s = new C2110s();
        final Bitmap decodeResource2 = BitmapFactory.decodeResource(getResources(), R.drawable.health);
        final C2110s c2110s2 = new C2110s();
        final int i3 = i;
        final int i4 = i2;
        new Thread(new Runnable(this) {
            final /* synthetic */ HealthActivity f6222g;

            class C19691 implements Runnable {
                final /* synthetic */ C19703 f6215a;

                C19691(C19703 c19703) {
                    this.f6215a = c19703;
                }

                public void run() {
                    if (Looper.getMainLooper() == Looper.myLooper()) {
                        Log.e("HealthActivity", "uVitals runOnUiThread");
                        try {
                            this.f6215a.f6222g.aY.m10202b();
                            this.f6215a.f6222g.aY.m10201a(c2110s);
                            this.f6215a.f6222g.aY.m10201a(c2110s2);
                        } catch (Exception e) {
                            Log.e("HealthActivity", "Error: " + e);
                        }
                    }
                }
            }

            public void run() {
                c2110s.m10204a(Bitmap.createScaledBitmap(decodeResource, decodeResource.getWidth(), decodeResource.getHeight(), false));
                c2110s.m10206a("Hunger");
                c2110s.m10208b(String.valueOf(i3) + "/300");
                c2110s.m10205a(this.f6222g.ba);
                c2110s2.m10204a(Bitmap.createScaledBitmap(decodeResource2, decodeResource2.getWidth(), decodeResource2.getHeight(), false));
                c2110s2.m10206a("Health");
                c2110s2.m10208b(String.valueOf(i4) + "/300");
                c2110s2.m10205a(this.f6222g.bb);
                this.f6222g.runOnUiThread(new C19691(this));
            }
        }).start();
    }

    private void m9806j() {
        this.aZ.m10160b();
        C2107q c2107q = new C2107q();
        c2107q.m10197a(getString(R.string.health_list_1));
        c2107q.m10199b(getString(R.string.health_list_1p));
        this.aZ.m10159a(c2107q);
        c2107q = new C2107q();
        c2107q.m10197a(getString(R.string.health_list_2));
        c2107q.m10199b(getString(R.string.health_list_2p));
        this.aZ.m10159a(c2107q);
        c2107q = new C2107q();
        c2107q.m10197a(getString(R.string.health_list_3));
        c2107q.m10199b(getString(R.string.health_list_3p));
        this.aZ.m10159a(c2107q);
        c2107q = new C2107q();
        c2107q.m10197a(getString(R.string.health_list_4));
        c2107q.m10199b(getString(R.string.health_list_4p));
        this.aZ.m10159a(c2107q);
        c2107q = new C2107q();
        c2107q.m10197a(getString(R.string.health_list_5));
        c2107q.m10199b(getString(R.string.health_list_5p));
        this.aZ.m10159a(c2107q);
        c2107q = new C2107q();
        c2107q.m10197a(getString(R.string.health_list_6));
        c2107q.m10199b(getString(R.string.health_list_6p));
        this.aZ.m10159a(c2107q);
        c2107q = new C2107q();
        c2107q.m10197a(getString(R.string.health_list_7));
        c2107q.m10199b(getString(R.string.health_list_7p));
        this.aZ.m10159a(c2107q);
    }

    private void m9807k() {
        m9814f();
        this.f6252b = "";
        this.f6253c = "";
        this.f6235K = false;
        this.f6236L = false;
        this.f6237M = false;
        this.f6238N = false;
        this.f6239O = false;
        this.f6240P = false;
        this.f6233I = 0;
        this.f6234J = 0;
        this.f6261k = false;
        this.f6262l = false;
        this.f6263m = false;
        this.f6264n = false;
        this.f6265o = false;
        this.f6266p = false;
        this.f6267q = false;
        this.f6268r = false;
        this.f6269s = false;
        this.f6270t = false;
        this.f6271u = false;
        this.f6272v = false;
        this.f6273w = false;
        this.f6274x = false;
        this.f6275y = false;
        this.f6276z = false;
        this.f6225A = false;
        this.f6226B = false;
        this.f6227C = false;
        this.f6228D = false;
        this.f6229E = false;
        this.f6230F = false;
        this.f6231G = false;
        this.f6232H = false;
        this.f6254d = 0;
        this.f6255e = 0;
        this.f6256f = 0;
        this.f6257g = 31;
        this.f6258h = 0;
        this.f6259i = 80;
        this.f6260j = 80;
        this.f6242R = true;
        this.f6243S = false;
        this.f6248X = 0;
        this.f6244T = false;
        this.f6249Y = 0;
        this.f6245U = false;
        this.f6250Z = 0;
        this.f6246V = false;
        this.aa = 0;
        this.f6247W = false;
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
        m9817i();
        Intent intent = new Intent(this, PlayActivity.class);
        finish();
        startActivity(intent);
    }

    public void m9808a() {
        Editor edit = getApplicationContext().getSharedPreferences(getString(R.string.preference_file_key), 0).edit();
        edit.putString("NAME", this.f6251a);
        edit.putString("CODES", this.f6252b);
        edit.putString("DATES", this.f6253c);
        edit.putInt("MONEY", this.f6256f);
        edit.putInt("CASH", this.f6254d);
        edit.putInt("BANK", this.f6255e);
        edit.putInt("BANK_DAYS", this.f6257g);
        edit.putInt("AGE", this.f6258h);
        edit.putInt("HUNGER", this.f6259i);
        edit.putInt("HEALTH", this.f6260j);
        edit.putBoolean("VOLUME", this.f6241Q);
        edit.putInt("A2C", this.f6233I);
        edit.putInt("A3C", this.f6234J);
        edit.putBoolean("A1", this.f6261k);
        edit.putBoolean("A2", this.f6262l);
        edit.putBoolean("A3", this.f6263m);
        edit.putBoolean("A4", this.f6264n);
        edit.putBoolean("A5", this.f6265o);
        edit.putBoolean("A6", this.f6266p);
        edit.putBoolean("A7", this.f6267q);
        edit.putBoolean("A8", this.f6268r);
        edit.putBoolean("A9", this.f6269s);
        edit.putBoolean("A10", this.f6270t);
        edit.putBoolean("A11", this.f6271u);
        edit.putBoolean("A12", this.f6272v);
        edit.putBoolean("A1U", this.f6273w);
        edit.putBoolean("A2U", this.f6274x);
        edit.putBoolean("A3U", this.f6275y);
        edit.putBoolean("A4U", this.f6276z);
        edit.putBoolean("A5U", this.f6225A);
        edit.putBoolean("A6U", this.f6226B);
        edit.putBoolean("A7U", this.f6227C);
        edit.putBoolean("A8U", this.f6228D);
        edit.putBoolean("A9U", this.f6229E);
        edit.putBoolean("A10U", this.f6230F);
        edit.putBoolean("A11U", this.f6231G);
        edit.putBoolean("A12U", this.f6232H);
        edit.putBoolean("A12L", this.f6235K);
        edit.putBoolean("A12T", this.f6236L);
        edit.putBoolean("A12W", this.f6237M);
        edit.putBoolean("A12E", this.f6238N);
        edit.putBoolean("A12C", this.f6239O);
        edit.putBoolean("A12S", this.f6240P);
        edit.putBoolean("BOX", this.f6242R);
        edit.putBoolean("BASEMENT", this.f6243S);
        edit.putInt("BASEMENT_DAYS", this.f6248X);
        edit.putBoolean("APARTMENT", this.f6244T);
        edit.putInt("APARTMENT_DAYS", this.f6249Y);
        edit.putBoolean("HOUSE", this.f6245U);
        edit.putInt("HOUSE_NO", this.f6250Z);
        edit.putBoolean("CONDO", this.f6246V);
        edit.putInt("CONDO_NO", this.aa);
        edit.putBoolean("MANSION", this.f6247W);
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

    public void m9809a(Toast toast, String str, int i) {
        View inflate = getLayoutInflater().inflate(R.layout.toast_message, (ViewGroup) findViewById(R.id.toast_layout_root));
        ((ImageView) inflate.findViewById(R.id.toast_image)).setImageResource(i);
        ((TextView) inflate.findViewById(R.id.toast_text)).setText(str);
        if (toast.getView().getWindowVisibility() != 0) {
            Log.e("HealthActivity", "Exists");
            toast.setDuration(1);
        }
        toast.setGravity(16, 0, 0);
        toast.setView(inflate);
        toast.show();
    }

    public void m9810b() {
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences(getString(R.string.preference_file_key), 0);
        this.f6251a = sharedPreferences.getString("NAME", "Unknown");
        this.f6252b = sharedPreferences.getString("CODES", "");
        this.f6253c = sharedPreferences.getString("DATES", "");
        this.f6256f = sharedPreferences.getInt("MONEY", 0);
        this.f6254d = sharedPreferences.getInt("CASH", 0);
        this.f6255e = sharedPreferences.getInt("BANK", 0);
        this.f6257g = sharedPreferences.getInt("BANK_DAYS", 31);
        this.f6258h = sharedPreferences.getInt("AGE", 0);
        this.f6259i = sharedPreferences.getInt("HUNGER", 80);
        this.f6260j = sharedPreferences.getInt("HEALTH", 80);
        this.f6241Q = sharedPreferences.getBoolean("VOLUME", true);
        this.f6233I = sharedPreferences.getInt("A2C", 0);
        this.f6234J = sharedPreferences.getInt("A3C", 0);
        this.f6261k = sharedPreferences.getBoolean("A1", false);
        this.f6262l = sharedPreferences.getBoolean("A2", false);
        this.f6263m = sharedPreferences.getBoolean("A3", false);
        this.f6264n = sharedPreferences.getBoolean("A4", false);
        this.f6265o = sharedPreferences.getBoolean("A5", false);
        this.f6266p = sharedPreferences.getBoolean("A6", false);
        this.f6267q = sharedPreferences.getBoolean("A7", false);
        this.f6268r = sharedPreferences.getBoolean("A8", false);
        this.f6269s = sharedPreferences.getBoolean("A9", false);
        this.f6270t = sharedPreferences.getBoolean("A10", false);
        this.f6271u = sharedPreferences.getBoolean("A11", false);
        this.f6272v = sharedPreferences.getBoolean("A12", false);
        this.f6273w = sharedPreferences.getBoolean("A1U", false);
        this.f6274x = sharedPreferences.getBoolean("A2U", false);
        this.f6275y = sharedPreferences.getBoolean("A3U", false);
        this.f6276z = sharedPreferences.getBoolean("A4U", false);
        this.f6225A = sharedPreferences.getBoolean("A5U", false);
        this.f6226B = sharedPreferences.getBoolean("A6U", false);
        this.f6227C = sharedPreferences.getBoolean("A7U", false);
        this.f6228D = sharedPreferences.getBoolean("A8U", false);
        this.f6229E = sharedPreferences.getBoolean("A9U", false);
        this.f6230F = sharedPreferences.getBoolean("A10U", false);
        this.f6231G = sharedPreferences.getBoolean("A11U", false);
        this.f6232H = sharedPreferences.getBoolean("A12U", false);
        this.f6235K = sharedPreferences.getBoolean("A12L", false);
        this.f6236L = sharedPreferences.getBoolean("A12T", false);
        this.f6237M = sharedPreferences.getBoolean("A12W", false);
        this.f6238N = sharedPreferences.getBoolean("A12E", false);
        this.f6239O = sharedPreferences.getBoolean("A12C", false);
        this.f6240P = sharedPreferences.getBoolean("A12S", false);
        this.f6242R = sharedPreferences.getBoolean("BOX", true);
        this.f6243S = sharedPreferences.getBoolean("BASEMENT", false);
        this.f6248X = sharedPreferences.getInt("BASEMENT_DAYS", 0);
        this.f6244T = sharedPreferences.getBoolean("APARTMENT", false);
        this.f6249Y = sharedPreferences.getInt("APARTMENT_DAYS", 0);
        this.f6245U = sharedPreferences.getBoolean("HOUSE", false);
        this.f6250Z = sharedPreferences.getInt("HOUSE_NO", 0);
        this.f6246V = sharedPreferences.getBoolean("CONDO", false);
        this.aa = sharedPreferences.getInt("CONDO_NO", 0);
        this.f6247W = sharedPreferences.getBoolean("MANSION", false);
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

    public void m9811c() {
        if (this.f6255e == 0) {
            this.f6257g = 31;
        } else if (this.f6255e >= 100 && this.f6257g > 1) {
            this.f6257g--;
        } else if (this.f6255e >= 100 && this.f6257g <= 1) {
            this.f6257g = 30;
            this.f6255e += this.f6255e / 100;
        }
        if (this.f6243S && this.f6248X >= 1) {
            this.f6248X--;
        }
        if (this.f6243S && this.f6248X == 0) {
            this.f6243S = false;
            this.f6248X = 0;
        }
        if (this.f6244T && this.f6249Y >= 1) {
            this.f6249Y--;
        }
        if (this.f6244T && this.f6249Y == 0) {
            this.f6244T = false;
            this.f6249Y = 0;
        }
    }

    public void m9812d() {
        if (this.f6241Q) {
            this.bk = (AudioManager) getSystemService("audio");
            this.bo = ((float) this.bk.getStreamVolume(3)) / ((float) this.bk.getStreamMaxVolume(3));
            this.bl = new SoundPool(10, 3, 0);
            this.bl.setOnLoadCompleteListener(new C19714(this));
            this.bn = this.bl.load(this, R.raw.dead, 1);
            this.bm = this.bl.load(this, R.raw.click, 1);
            return;
        }
        Log.e("HealthActivity", "Sound Not Loaded");
        this.bp = false;
    }

    public void m9813e() {
        try {
            this.bl.play(this.bm, this.bo, this.bo, 1, 0, 1.0f);
        } catch (Exception e) {
            Log.e("HealthActivity", "Error Playing Sound");
        }
    }

    public void m9814f() {
        try {
            this.bl.play(this.bn, this.bo, this.bo, 1, 0, 1.0f);
        } catch (Exception e) {
            Log.e("HealthActivity", "Error Playing Sound");
        }
    }

    public void m9815g() {
        this.bq = new C0486e(this);
        this.bq.m2147a(getString(R.string.interstitial_ad_unit_id));
        this.bq.m2146a(new C0472a().m2094a());
    }

    public void goBack(View view) {
        m9813e();
        finish();
    }

    public void m9816h() {
        if (this.bq == null || !this.bq.m2148a()) {
            Log.e("HealthActivity", "Ad Not Ready.");
        } else {
            this.bq.m2149b();
        }
    }

    public void m9817i() {
        new Handler().postDelayed(new C19725(this), 5000);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.e("HealthActivity", "onCreate");
        setContentView(R.layout.activity_health);
        this.aS = Typeface.createFromAsset(getAssets(), "fonts/caviar_dreams.ttf");
        this.aT = Typeface.createFromAsset(getAssets(), "fonts/caviar_dreams_bold.ttf");
        this.bg = Toast.makeText(this, "", 1);
        this.bh = Toast.makeText(this, "", 1);
        this.bi = Toast.makeText(this, "", 1);
        this.bj = Toast.makeText(this, "", 1);
        this.aU = (AdView) findViewById(R.id.adView);
        this.aU.setAdListener(new C19671(this));
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
        this.aX = (ListView) findViewById(R.id.health_list);
        this.aZ = new C2092g(this);
        this.aX.setAdapter(this.aZ);
        this.aX.setOnItemClickListener(new C19682(this));
    }

    public void onDestroy() {
        super.onDestroy();
        Log.e("HealthActivity", "onDestroy");
        if (this.aU != null) {
            this.aU.m2047a();
        }
    }

    protected void onPause() {
        Log.e("HealthActivity", "onPause");
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
        m9808a();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        Log.e("HealthActivity", "onResume");
        if (this.aU != null) {
            this.aU.m2050c();
        }
        m9810b();
        m9812d();
        m9815g();
        m9803a(this.f6259i, this.f6260j);
        m9806j();
        this.bc.setText("$" + String.format("%,d", new Object[]{Integer.valueOf(this.f6254d)}).replace(',', ' '));
        this.be.setText("$" + String.format("%,d", new Object[]{Integer.valueOf(this.f6255e)}).replace(',', ' '));
    }
}
