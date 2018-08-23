package com.positivelymade.homeless;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnShowListener;
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
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.C0427a;
import com.google.android.gms.ads.C0476c.C0472a;
import com.google.android.gms.ads.C0486e;

public class CriminalJobActivity extends Activity {
    public boolean f6028A;
    public boolean f6029B;
    public int f6030C;
    public int f6031D;
    public int f6032E;
    public int f6033F;
    public int f6034G;
    public int f6035H;
    public boolean f6036I;
    public boolean f6037J;
    public boolean f6038K;
    public boolean f6039L;
    public boolean f6040M;
    public boolean f6041N;
    public int f6042O;
    public int f6043P;
    public int f6044Q;
    public int f6045R;
    public int f6046S;
    public int f6047T;
    public boolean f6048U;
    public boolean f6049V;
    public boolean f6050W;
    public boolean f6051X;
    public boolean f6052Y;
    public boolean f6053Z;
    public String f6054a;
    public boolean aA;
    public boolean aB;
    public boolean aC;
    public boolean aD;
    public boolean aE;
    public boolean aF;
    public boolean aG;
    public boolean aH;
    public boolean aI;
    public boolean aJ;
    public int aK;
    public int aL;
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
    public boolean aa;
    public boolean ab;
    public boolean ac;
    public boolean ad;
    public boolean ae;
    public boolean af;
    public boolean ag;
    public boolean ah;
    public boolean ai;
    public boolean aj;
    public boolean ak;
    public boolean al;
    public boolean am;
    public boolean an;
    public boolean ao;
    public boolean ap;
    public boolean aq;
    public boolean ar;
    public boolean as;
    public boolean at;
    public boolean au;
    public boolean av;
    public boolean aw;
    public boolean ax;
    public boolean ay;
    public boolean az;
    public String f6055b;
    public boolean bA;
    public boolean bB;
    public boolean bC;
    public boolean bD;
    public boolean bE;
    public boolean bF;
    public boolean bG;
    public boolean bH;
    public boolean bI;
    public boolean bJ;
    public boolean bK;
    public boolean bL;
    public boolean bM;
    public boolean bN;
    public boolean bO;
    public Toast bP;
    public Toast bQ;
    public Toast bR;
    public Toast bS;
    public AudioManager bT;
    public SoundPool bU;
    public int bV;
    public int bW;
    public float bX;
    public boolean bY;
    public C0486e bZ;
    public ProgressBar ba;
    public ProgressBar bb;
    public TextView bc;
    public TextView bd;
    public TextView be;
    public TextView bf;
    public boolean bg;
    public boolean bh;
    public boolean bi;
    public boolean bj;
    public boolean bk;
    public boolean bl;
    public boolean bm;
    public boolean bn;
    public boolean bo;
    public boolean bp;
    public boolean bq;
    public boolean br;
    public boolean bs;
    public boolean bt;
    public boolean bu;
    public boolean bv;
    public boolean bw;
    public boolean bx;
    public boolean by;
    public boolean bz;
    public String f6056c;
    public int f6057d;
    public int f6058e;
    public int f6059f;
    public int f6060g;
    public int f6061h;
    public int f6062i;
    public int f6063j;
    public boolean f6064k;
    public boolean f6065l;
    public boolean f6066m;
    public boolean f6067n;
    public boolean f6068o;
    public boolean f6069p;
    public int f6070q;
    public int f6071r;
    public int f6072s;
    public int f6073t;
    public int f6074u;
    public boolean f6075v;
    public boolean f6076w;
    public boolean f6077x;
    public boolean f6078y;
    public boolean f6079z;

    class C19491 extends C0427a {
        final /* synthetic */ CriminalJobActivity f6014a;

        C19491(CriminalJobActivity criminalJobActivity) {
            this.f6014a = criminalJobActivity;
        }

        public void mo322a() {
            Log.e("CriminalJobActivity", "Google onAdLoaded");
        }

        public void mo323a(int i) {
            Log.e("CriminalJobActivity", "Google onAdFailedToLoad: " + this.f6014a.m9729a(i));
        }

        public void mo324b() {
            Log.e("CriminalJobActivity", "Google onAdOpened");
        }

        public void mo325c() {
            Log.e("CriminalJobActivity", "Google onAdClosed");
        }

        public void mo326d() {
            Log.d("CriminalJobActivity", "Google onAdLeftApplication");
        }
    }

    class C19502 implements OnItemClickListener {
        final /* synthetic */ CriminalJobActivity f6015a;

        C19502(CriminalJobActivity criminalJobActivity) {
            this.f6015a = criminalJobActivity;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            String b = ((C2107q) this.f6015a.aZ.m10158a().get(i)).m10198b();
            int i2 = -1;
            switch (b.hashCode()) {
                case 36225:
                    if (b.equals("$30")) {
                        i2 = 0;
                        break;
                    }
                    break;
                case 36354:
                    if (b.equals("$75")) {
                        i2 = 1;
                        break;
                    }
                    break;
                case 1122062:
                    if (b.equals("$200")) {
                        i2 = 2;
                        break;
                    }
                    break;
                case 1123984:
                    if (b.equals("$400")) {
                        i2 = 3;
                        break;
                    }
                    break;
                case 1127828:
                    if (b.equals("$800")) {
                        i2 = 4;
                        break;
                    }
                    break;
                case 34756101:
                    if (b.equals("$1200")) {
                        i2 = 5;
                        break;
                    }
                    break;
                case 34761867:
                    if (b.equals("$1800")) {
                        i2 = 6;
                        break;
                    }
                    break;
                case 1077379597:
                    if (b.equals("$10000")) {
                        i2 = 7;
                        break;
                    }
                    break;
            }
            CriminalJobActivity criminalJobActivity;
            switch (i2) {
                case 0:
                    if (!this.f6015a.bm || ((!this.f6015a.bs && !this.f6015a.bt && !this.f6015a.bu && !this.f6015a.bv) || !this.f6015a.bG)) {
                        this.f6015a.m9738a(this.f6015a.bP, this.f6015a.getResources().getString(R.string.job_need) + this.f6015a.getResources().getString(R.string.p29) + "\n" + this.f6015a.getResources().getString(R.string.p35) + "\n" + this.f6015a.getResources().getString(R.string.d49), (int) R.drawable.notice);
                        break;
                    }
                    criminalJobActivity = this.f6015a;
                    criminalJobActivity.f6062i -= 6;
                    criminalJobActivity = this.f6015a;
                    criminalJobActivity.f6063j -= 6;
                    criminalJobActivity = this.f6015a;
                    criminalJobActivity.f6058e += 30;
                    this.f6015a.f6057d += 30;
                    criminalJobActivity = this.f6015a;
                    criminalJobActivity.f6061h++;
                    this.f6015a.m9740c();
                    break;
                    break;
                case 1:
                    if (!this.f6015a.bm || ((!this.f6015a.bt && !this.f6015a.bu && !this.f6015a.bv) || !this.f6015a.bD || !this.f6015a.bG || (!this.f6015a.bg && !this.f6015a.bh && !this.f6015a.bi && !this.f6015a.bj && !this.f6015a.bk))) {
                        this.f6015a.m9738a(this.f6015a.bP, this.f6015a.getResources().getString(R.string.job_need) + this.f6015a.getResources().getString(R.string.p29) + "\n" + this.f6015a.getResources().getString(R.string.p23) + "\n" + this.f6015a.getResources().getString(R.string.p36) + "\n" + this.f6015a.getResources().getString(R.string.d46) + "\n" + this.f6015a.getResources().getString(R.string.d49), (int) R.drawable.notice);
                        break;
                    }
                    criminalJobActivity = this.f6015a;
                    criminalJobActivity.f6062i -= 8;
                    criminalJobActivity = this.f6015a;
                    criminalJobActivity.f6063j -= 8;
                    criminalJobActivity = this.f6015a;
                    criminalJobActivity.f6058e += 75;
                    this.f6015a.f6057d += 75;
                    criminalJobActivity = this.f6015a;
                    criminalJobActivity.f6061h++;
                    this.f6015a.m9740c();
                    break;
                case 2:
                    if (!this.f6015a.bm || ((!this.f6015a.bt && !this.f6015a.bu && !this.f6015a.bv) || !this.f6015a.bD || !this.f6015a.bG || !this.f6015a.bJ)) {
                        this.f6015a.m9738a(this.f6015a.bP, this.f6015a.getResources().getString(R.string.job_need) + this.f6015a.getResources().getString(R.string.p29) + "\n" + this.f6015a.getResources().getString(R.string.p36) + "\n" + this.f6015a.getResources().getString(R.string.d46) + "\n" + this.f6015a.getResources().getString(R.string.d49) + "\n" + this.f6015a.getResources().getString(R.string.d52), (int) R.drawable.notice);
                        break;
                    }
                    criminalJobActivity = this.f6015a;
                    criminalJobActivity.f6062i -= 10;
                    criminalJobActivity = this.f6015a;
                    criminalJobActivity.f6063j -= 10;
                    criminalJobActivity = this.f6015a;
                    criminalJobActivity.f6058e += 200;
                    this.f6015a.f6057d += 200;
                    criminalJobActivity = this.f6015a;
                    criminalJobActivity.f6061h++;
                    this.f6015a.m9740c();
                    break;
                    break;
                case 3:
                    if (!this.f6015a.bm || ((!this.f6015a.bt && !this.f6015a.bu && !this.f6015a.bv) || !this.f6015a.bG || !this.f6015a.bE || (!this.f6015a.bh && !this.f6015a.bi && !this.f6015a.bj && !this.f6015a.bk))) {
                        this.f6015a.m9738a(this.f6015a.bP, this.f6015a.getResources().getString(R.string.job_need) + this.f6015a.getResources().getString(R.string.p29) + "\n" + this.f6015a.getResources().getString(R.string.p36) + "\n" + this.f6015a.getResources().getString(R.string.p24) + "\n" + this.f6015a.getResources().getString(R.string.d47) + "\n" + this.f6015a.getResources().getString(R.string.d49), (int) R.drawable.notice);
                        break;
                    }
                    criminalJobActivity = this.f6015a;
                    criminalJobActivity.f6062i -= 13;
                    criminalJobActivity = this.f6015a;
                    criminalJobActivity.f6063j -= 13;
                    criminalJobActivity = this.f6015a;
                    criminalJobActivity.f6058e += 400;
                    this.f6015a.f6057d += 400;
                    criminalJobActivity = this.f6015a;
                    criminalJobActivity.f6061h++;
                    this.f6015a.m9740c();
                    break;
                case 4:
                    if (!this.f6015a.bm || ((!this.f6015a.bt && !this.f6015a.bu && !this.f6015a.bv) || !this.f6015a.bE || !this.f6015a.bH || (!this.f6015a.bh && !this.f6015a.bi && !this.f6015a.bj && !this.f6015a.bk))) {
                        this.f6015a.m9738a(this.f6015a.bP, this.f6015a.getResources().getString(R.string.job_need) + this.f6015a.getResources().getString(R.string.p29) + "\n" + this.f6015a.getResources().getString(R.string.p36) + "\n" + this.f6015a.getResources().getString(R.string.p24) + "\n" + this.f6015a.getResources().getString(R.string.d47) + "\n" + this.f6015a.getResources().getString(R.string.d50), (int) R.drawable.notice);
                        break;
                    }
                    criminalJobActivity = this.f6015a;
                    criminalJobActivity.f6062i -= 16;
                    criminalJobActivity = this.f6015a;
                    criminalJobActivity.f6063j -= 16;
                    criminalJobActivity = this.f6015a;
                    criminalJobActivity.f6058e += 800;
                    this.f6015a.f6057d += 800;
                    criminalJobActivity = this.f6015a;
                    criminalJobActivity.f6061h++;
                    this.f6015a.m9740c();
                    break;
                    break;
                case 5:
                    if (!this.f6015a.bm || ((!this.f6015a.bt && !this.f6015a.bu && !this.f6015a.bv) || !this.f6015a.bJ || !this.f6015a.bE || !this.f6015a.bH || ((!this.f6015a.bo && !this.f6015a.bp && !this.f6015a.bq) || (!this.f6015a.bi && !this.f6015a.bj && !this.f6015a.bk)))) {
                        this.f6015a.m9738a(this.f6015a.bP, this.f6015a.getResources().getString(R.string.job_need) + this.f6015a.getResources().getString(R.string.p29) + "\n" + this.f6015a.getResources().getString(R.string.p31) + "\n" + this.f6015a.getResources().getString(R.string.p36) + "\n" + this.f6015a.getResources().getString(R.string.p25) + "\n" + this.f6015a.getResources().getString(R.string.d47) + "\n" + this.f6015a.getResources().getString(R.string.d50) + "\n" + this.f6015a.getResources().getString(R.string.d52), (int) R.drawable.notice);
                        break;
                    }
                    criminalJobActivity = this.f6015a;
                    criminalJobActivity.f6062i -= 19;
                    criminalJobActivity = this.f6015a;
                    criminalJobActivity.f6063j -= 19;
                    criminalJobActivity = this.f6015a;
                    criminalJobActivity.f6058e += 1200;
                    this.f6015a.f6057d += 1200;
                    criminalJobActivity = this.f6015a;
                    criminalJobActivity.f6061h++;
                    this.f6015a.m9740c();
                    break;
                case 6:
                    if (!this.f6015a.bm || !this.f6015a.bv || !this.f6015a.bw || !this.f6015a.bF || !this.f6015a.bI || (!this.f6015a.bi && !this.f6015a.bj && !this.f6015a.bk)) {
                        this.f6015a.m9738a(this.f6015a.bP, this.f6015a.getResources().getString(R.string.job_need) + this.f6015a.getResources().getString(R.string.p29) + "\n" + this.f6015a.getResources().getString(R.string.p38) + "\n" + this.f6015a.getResources().getString(R.string.p25) + "\n" + this.f6015a.getResources().getString(R.string.p39) + "\n" + this.f6015a.getResources().getString(R.string.d48) + "\n" + this.f6015a.getResources().getString(R.string.d51), (int) R.drawable.notice);
                        break;
                    }
                    criminalJobActivity = this.f6015a;
                    criminalJobActivity.f6062i -= 22;
                    criminalJobActivity = this.f6015a;
                    criminalJobActivity.f6063j -= 22;
                    criminalJobActivity = this.f6015a;
                    criminalJobActivity.f6058e += 1800;
                    this.f6015a.f6057d += 1800;
                    criminalJobActivity = this.f6015a;
                    criminalJobActivity.f6061h++;
                    this.f6015a.m9740c();
                    break;
                case 7:
                    if (!this.f6015a.bm || ((!this.f6015a.bt && !this.f6015a.bu && !this.f6015a.bv) || !this.f6015a.bw || !this.f6015a.bx || !this.f6015a.bF || ((!this.f6015a.bi && !this.f6015a.bj && !this.f6015a.bk) || ((!this.f6015a.bo && !this.f6015a.bp && !this.f6015a.bq && !this.f6015a.br) || !this.f6015a.bI || !this.f6015a.bJ)))) {
                        this.f6015a.m9738a(this.f6015a.bP, this.f6015a.getResources().getString(R.string.job_need) + this.f6015a.getResources().getString(R.string.p29) + "\n" + this.f6015a.getResources().getString(R.string.p31) + "\n" + this.f6015a.getResources().getString(R.string.p25) + "\n" + this.f6015a.getResources().getString(R.string.p36) + "\n" + this.f6015a.getResources().getString(R.string.p39) + "\n" + this.f6015a.getResources().getString(R.string.p40) + "\n" + this.f6015a.getResources().getString(R.string.d48) + "\n" + this.f6015a.getResources().getString(R.string.d51) + "\n" + this.f6015a.getResources().getString(R.string.d52), (int) R.drawable.notice);
                        break;
                    }
                    criminalJobActivity = this.f6015a;
                    criminalJobActivity.f6062i -= 25;
                    criminalJobActivity = this.f6015a;
                    criminalJobActivity.f6063j -= 25;
                    criminalJobActivity = this.f6015a;
                    criminalJobActivity.f6058e += 10000;
                    this.f6015a.f6057d += 10000;
                    criminalJobActivity = this.f6015a;
                    criminalJobActivity.f6061h++;
                    this.f6015a.m9740c();
                    break;
                    break;
            }
            if (this.f6015a.f6063j <= 0) {
                this.f6015a.f6063j = 0;
                this.f6015a.m9738a(this.f6015a.bS, this.f6015a.getResources().getString(R.string.toast_dead_health), (int) R.drawable.dead);
                this.f6015a.m9736m();
            } else if (this.f6015a.f6062i <= 0) {
                this.f6015a.f6062i = 0;
                this.f6015a.m9738a(this.f6015a.bS, this.f6015a.getResources().getString(R.string.toast_dead_hunger), (int) R.drawable.dead);
                this.f6015a.m9736m();
            } else if (this.f6015a.f6063j < 25) {
                this.f6015a.m9738a(this.f6015a.bQ, this.f6015a.getResources().getString(R.string.toast_health), (int) R.drawable.low_health);
            } else if (this.f6015a.f6062i < 25) {
                this.f6015a.m9738a(this.f6015a.bR, this.f6015a.getResources().getString(R.string.toast_hunger), (int) R.drawable.low_hunger);
            }
            if (this.f6015a.f6062i >= 300) {
                this.f6015a.f6062i = 300;
            }
            if (this.f6015a.f6063j >= 300) {
                this.f6015a.f6063j = 300;
            }
            this.f6015a.m9731a(this.f6015a.f6062i, this.f6015a.f6063j);
            this.f6015a.bc.setText("$" + String.format("%,d", new Object[]{Integer.valueOf(this.f6015a.f6058e)}).replace(',', ' '));
            this.f6015a.be.setText("$" + String.format("%,d", new Object[]{Integer.valueOf(this.f6015a.f6059f)}).replace(',', ' '));
            this.f6015a.m9737a();
        }
    }

    class C19534 implements OnClickListener {
        final /* synthetic */ CriminalJobActivity f6024a;

        C19534(CriminalJobActivity criminalJobActivity) {
            this.f6024a = criminalJobActivity;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    class C19545 implements OnShowListener {
        final /* synthetic */ CriminalJobActivity f6025a;

        C19545(CriminalJobActivity criminalJobActivity) {
            this.f6025a = criminalJobActivity;
        }

        public void onShow(DialogInterface dialogInterface) {
            ((AlertDialog) dialogInterface).getButton(-1).setTypeface(this.f6025a.aT);
        }
    }

    class C19556 implements OnLoadCompleteListener {
        final /* synthetic */ CriminalJobActivity f6026a;

        C19556(CriminalJobActivity criminalJobActivity) {
            this.f6026a = criminalJobActivity;
        }

        public void onLoadComplete(SoundPool soundPool, int i, int i2) {
            Log.e("CriminalJobActivity", "Sound Loaded");
            this.f6026a.bY = true;
        }
    }

    class C19567 implements Runnable {
        final /* synthetic */ CriminalJobActivity f6027a;

        C19567(CriminalJobActivity criminalJobActivity) {
            this.f6027a = criminalJobActivity;
        }

        public void run() {
            this.f6027a.m9746i();
        }
    }

    private String m9729a(int i) {
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

    private void m9731a(int i, int i2) {
        final Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.hunger);
        final C2110s c2110s = new C2110s();
        final Bitmap decodeResource2 = BitmapFactory.decodeResource(getResources(), R.drawable.health);
        final C2110s c2110s2 = new C2110s();
        final int i3 = i;
        final int i4 = i2;
        new Thread(new Runnable(this) {
            final /* synthetic */ CriminalJobActivity f6023g;

            class C19511 implements Runnable {
                final /* synthetic */ C19523 f6016a;

                C19511(C19523 c19523) {
                    this.f6016a = c19523;
                }

                public void run() {
                    if (Looper.getMainLooper() == Looper.myLooper()) {
                        Log.e("CriminalJobActivity", "uVitals runOnUiThread");
                        try {
                            this.f6016a.f6023g.aY.m10202b();
                            this.f6016a.f6023g.aY.m10201a(c2110s);
                            this.f6016a.f6023g.aY.m10201a(c2110s2);
                        } catch (Exception e) {
                            Log.e("CriminalJobActivity", "Error: " + e);
                        }
                    }
                }
            }

            public void run() {
                c2110s.m10204a(Bitmap.createScaledBitmap(decodeResource, decodeResource.getWidth(), decodeResource.getHeight(), false));
                c2110s.m10206a("Hunger");
                c2110s.m10208b(String.valueOf(i3) + "/300");
                c2110s.m10205a(this.f6023g.ba);
                c2110s2.m10204a(Bitmap.createScaledBitmap(decodeResource2, decodeResource2.getWidth(), decodeResource2.getHeight(), false));
                c2110s2.m10206a("Health");
                c2110s2.m10208b(String.valueOf(i4) + "/300");
                c2110s2.m10205a(this.f6023g.bb);
                this.f6023g.runOnUiThread(new C19511(this));
            }
        }).start();
    }

    private void m9734k() {
        this.aZ.m10160b();
        C2107q c2107q = new C2107q();
        c2107q.m10197a(getString(R.string.business_cj_1));
        c2107q.m10199b(getString(R.string.business_cj_1p));
        this.aZ.m10159a(c2107q);
        c2107q = new C2107q();
        c2107q.m10197a(getString(R.string.business_cj_2));
        c2107q.m10199b(getString(R.string.business_cj_2p));
        this.aZ.m10159a(c2107q);
        c2107q = new C2107q();
        c2107q.m10197a(getString(R.string.business_cj_3));
        c2107q.m10199b(getString(R.string.business_cj_3p));
        this.aZ.m10159a(c2107q);
        c2107q = new C2107q();
        c2107q.m10197a(getString(R.string.business_cj_4));
        c2107q.m10199b(getString(R.string.business_cj_4p));
        this.aZ.m10159a(c2107q);
        c2107q = new C2107q();
        c2107q.m10197a(getString(R.string.business_cj_5));
        c2107q.m10199b(getString(R.string.business_cj_5p));
        this.aZ.m10159a(c2107q);
        c2107q = new C2107q();
        c2107q.m10197a(getString(R.string.business_cj_6));
        c2107q.m10199b(getString(R.string.business_cj_6p));
        this.aZ.m10159a(c2107q);
        c2107q = new C2107q();
        c2107q.m10197a(getString(R.string.business_cj_7));
        c2107q.m10199b(getString(R.string.business_cj_7p));
        this.aZ.m10159a(c2107q);
        c2107q = new C2107q();
        c2107q.m10197a(getString(R.string.business_cj_8));
        c2107q.m10199b(getString(R.string.business_cj_8p));
        this.aZ.m10159a(c2107q);
    }

    private void m9735l() {
        this.bg = this.f6065l;
        this.bh = this.f6066m;
        this.bi = this.f6067n;
        this.bj = this.f6068o;
        this.bk = this.f6069p;
        this.bl = this.f6075v;
        this.bm = this.f6076w;
        this.bn = this.f6077x;
        this.bo = this.f6078y;
        this.bp = this.f6079z;
        this.bq = this.f6028A;
        this.br = this.f6029B;
        this.bs = this.f6036I;
        this.bt = this.f6037J;
        this.bu = this.f6038K;
        this.bv = this.f6039L;
        this.bw = this.f6040M;
        this.bx = this.f6041N;
        this.by = this.f6048U;
        this.bz = this.f6049V;
        this.bA = this.f6050W;
        this.bB = this.f6051X;
        this.bC = this.f6052Y;
        this.bD = this.f6053Z;
        this.bE = this.aa;
        this.bF = this.ab;
        this.bG = this.ac;
        this.bH = this.ad;
        this.bI = this.ae;
        this.bJ = this.af;
        this.bK = this.ag;
        this.bL = this.ah;
        this.bM = this.ai;
        this.bN = this.aj;
        this.bO = this.ak;
    }

    private void m9736m() {
        m9744g();
        this.f6055b = "";
        this.f6056c = "";
        this.aM = false;
        this.aN = false;
        this.aO = false;
        this.aP = false;
        this.aQ = false;
        this.aR = false;
        this.aK = 0;
        this.aL = 0;
        this.al = false;
        this.am = false;
        this.an = false;
        this.ao = false;
        this.ap = false;
        this.aq = false;
        this.ar = false;
        this.as = false;
        this.at = false;
        this.au = false;
        this.av = false;
        this.aw = false;
        this.ax = false;
        this.ay = false;
        this.az = false;
        this.aA = false;
        this.aB = false;
        this.aC = false;
        this.aD = false;
        this.aE = false;
        this.aF = false;
        this.aG = false;
        this.aH = false;
        this.aI = false;
        this.f6058e = 0;
        this.f6059f = 0;
        this.f6057d = 0;
        this.f6060g = 31;
        this.f6061h = 0;
        this.f6062i = 80;
        this.f6063j = 80;
        this.f6064k = true;
        this.f6065l = false;
        this.f6070q = 0;
        this.f6066m = false;
        this.f6071r = 0;
        this.f6067n = false;
        this.f6072s = 0;
        this.f6068o = false;
        this.f6073t = 0;
        this.f6069p = false;
        this.f6074u = 0;
        this.f6075v = true;
        this.f6076w = false;
        this.f6030C = 0;
        this.f6077x = false;
        this.f6031D = 0;
        this.f6078y = false;
        this.f6032E = 0;
        this.f6079z = false;
        this.f6033F = 0;
        this.f6028A = false;
        this.f6034G = 0;
        this.f6029B = false;
        this.f6035H = 0;
        this.f6036I = false;
        this.f6042O = 0;
        this.f6037J = false;
        this.f6043P = 0;
        this.f6038K = false;
        this.f6044Q = 0;
        this.f6039L = false;
        this.f6045R = 0;
        this.f6040M = false;
        this.f6046S = 0;
        this.f6041N = false;
        this.f6047T = 0;
        this.f6048U = false;
        this.f6049V = false;
        this.f6050W = false;
        this.f6051X = false;
        this.f6052Y = false;
        this.f6053Z = false;
        this.aa = false;
        this.ab = false;
        this.ac = false;
        this.ad = false;
        this.ae = false;
        this.af = false;
        this.ag = false;
        this.ah = false;
        this.ai = false;
        this.aj = false;
        this.ak = false;
        m9747j();
        Intent intent = new Intent(this, PlayActivity.class);
        finish();
        startActivity(intent);
    }

    public void m9737a() {
        Editor edit = getApplicationContext().getSharedPreferences(getString(R.string.preference_file_key), 0).edit();
        edit.putString("CODES", this.f6055b);
        edit.putBoolean("VOLUME", this.aJ);
        edit.putString("DATES", this.f6056c);
        edit.putInt("MONEY", this.f6057d);
        edit.putString("NAME", this.f6054a);
        edit.putInt("CASH", this.f6058e);
        edit.putInt("BANK", this.f6059f);
        edit.putInt("BANK_DAYS", this.f6060g);
        edit.putInt("AGE", this.f6061h);
        edit.putInt("HUNGER", this.f6062i);
        edit.putInt("HEALTH", this.f6063j);
        edit.putInt("A2C", this.aK);
        edit.putInt("A3C", this.aL);
        edit.putBoolean("A1", this.al);
        edit.putBoolean("A2", this.am);
        edit.putBoolean("A3", this.an);
        edit.putBoolean("A4", this.ao);
        edit.putBoolean("A5", this.ap);
        edit.putBoolean("A6", this.aq);
        edit.putBoolean("A7", this.ar);
        edit.putBoolean("A8", this.as);
        edit.putBoolean("A9", this.at);
        edit.putBoolean("A10", this.au);
        edit.putBoolean("A11", this.av);
        edit.putBoolean("A12", this.aw);
        edit.putBoolean("A1U", this.ax);
        edit.putBoolean("A2U", this.ay);
        edit.putBoolean("A3U", this.az);
        edit.putBoolean("A4U", this.aA);
        edit.putBoolean("A5U", this.aB);
        edit.putBoolean("A6U", this.aC);
        edit.putBoolean("A7U", this.aD);
        edit.putBoolean("A8U", this.aE);
        edit.putBoolean("A9U", this.aF);
        edit.putBoolean("A10U", this.aG);
        edit.putBoolean("A11U", this.aH);
        edit.putBoolean("A12U", this.aI);
        edit.putBoolean("A12L", this.aM);
        edit.putBoolean("A12T", this.aN);
        edit.putBoolean("A12W", this.aO);
        edit.putBoolean("A12E", this.aP);
        edit.putBoolean("A12C", this.aQ);
        edit.putBoolean("A12S", this.aR);
        edit.putBoolean("BOX", this.f6064k);
        edit.putBoolean("BASEMENT", this.f6065l);
        edit.putInt("BASEMENT_DAYS", this.f6070q);
        edit.putBoolean("APARTMENT", this.f6066m);
        edit.putInt("APARTMENT_DAYS", this.f6071r);
        edit.putBoolean("HOUSE", this.f6067n);
        edit.putInt("HOUSE_NO", this.f6072s);
        edit.putBoolean("CONDO", this.f6068o);
        edit.putInt("CONDO_NO", this.f6073t);
        edit.putBoolean("MANSION", this.f6069p);
        edit.putInt("MANSION_NO", this.f6074u);
        edit.putBoolean("BAREFOOT", this.f6075v);
        edit.putBoolean("SHOES", this.f6076w);
        edit.putInt("SHOES_NO", this.f6030C);
        edit.putBoolean("BICYCLE", this.f6077x);
        edit.putInt("BICYCLE_NO", this.f6031D);
        edit.putBoolean("CAR", this.f6078y);
        edit.putInt("CAR_NO", this.f6032E);
        edit.putBoolean("TRUCK", this.f6079z);
        edit.putInt("TRUCK_NO", this.f6033F);
        edit.putBoolean("TOWNCAR", this.f6028A);
        edit.putInt("TOWNCAR_NO", this.f6034G);
        edit.putBoolean("HELICOPTER", this.f6029B);
        edit.putInt("HELICOPTER_NO", this.f6035H);
        edit.putBoolean("KNIFE", this.f6036I);
        edit.putInt("KNIFE_NO", this.f6042O);
        edit.putBoolean("GUN", this.f6037J);
        edit.putInt("GUN_NO", this.f6043P);
        edit.putBoolean("SHOTGUN", this.f6038K);
        edit.putInt("SHOTGUN_NO", this.f6044Q);
        edit.putBoolean("RIFLE", this.f6039L);
        edit.putInt("RIFLE_NO", this.f6045R);
        edit.putBoolean("VEST", this.f6040M);
        edit.putInt("VEST_NO", this.f6046S);
        edit.putBoolean("EXPLOSIVES", this.f6041N);
        edit.putInt("EXPLOSIVES_NO", this.f6047T);
        edit.putBoolean("MATH", this.f6048U);
        edit.putBoolean("SCHOOL", this.f6049V);
        edit.putBoolean("MASONRY", this.f6050W);
        edit.putBoolean("COLLEGE", this.f6051X);
        edit.putBoolean("UNIVERSITY", this.f6052Y);
        edit.putBoolean("NOVICE", this.f6053Z);
        edit.putBoolean("MOBSTER", this.aa);
        edit.putBoolean("HITMAN", this.ab);
        edit.putBoolean("PICKPOCKET", this.ac);
        edit.putBoolean("BURGLAR", this.ad);
        edit.putBoolean("MASTER", this.ae);
        edit.putBoolean("DRIVING", this.af);
        edit.putBoolean("LIQUOR", this.ag);
        edit.putBoolean("BUSINESS", this.ah);
        edit.putBoolean("LAWS", this.ai);
        edit.putBoolean("ACCOUNTING", this.aj);
        edit.putBoolean("MANAGEMENT", this.ak);
        edit.apply();
    }

    public void m9738a(Toast toast, String str, int i) {
        View inflate = getLayoutInflater().inflate(R.layout.toast_message, (ViewGroup) findViewById(R.id.toast_layout_root));
        ((ImageView) inflate.findViewById(R.id.toast_image)).setImageResource(i);
        ((TextView) inflate.findViewById(R.id.toast_text)).setText(str);
        if (toast.getView().getWindowVisibility() != 0) {
            Log.e("CriminalJobActivity", "Exists");
            toast.setDuration(1);
        }
        toast.setGravity(16, 0, 0);
        toast.setView(inflate);
        toast.show();
    }

    public void m9739b() {
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences(getString(R.string.preference_file_key), 0);
        this.f6055b = sharedPreferences.getString("CODES", "");
        this.aJ = sharedPreferences.getBoolean("VOLUME", true);
        this.f6056c = sharedPreferences.getString("DATES", "");
        this.f6057d = sharedPreferences.getInt("MONEY", 0);
        this.f6054a = sharedPreferences.getString("NAME", "Unknown");
        this.f6058e = sharedPreferences.getInt("CASH", 0);
        this.f6059f = sharedPreferences.getInt("BANK", 0);
        this.f6060g = sharedPreferences.getInt("BANK_DAYS", 31);
        this.f6061h = sharedPreferences.getInt("AGE", 0);
        this.f6062i = sharedPreferences.getInt("HUNGER", 80);
        this.f6063j = sharedPreferences.getInt("HEALTH", 80);
        this.aK = sharedPreferences.getInt("A2C", 0);
        this.aL = sharedPreferences.getInt("A3C", 0);
        this.al = sharedPreferences.getBoolean("A1", false);
        this.am = sharedPreferences.getBoolean("A2", false);
        this.an = sharedPreferences.getBoolean("A3", false);
        this.ao = sharedPreferences.getBoolean("A4", false);
        this.ap = sharedPreferences.getBoolean("A5", false);
        this.aq = sharedPreferences.getBoolean("A6", false);
        this.ar = sharedPreferences.getBoolean("A7", false);
        this.as = sharedPreferences.getBoolean("A8", false);
        this.at = sharedPreferences.getBoolean("A9", false);
        this.au = sharedPreferences.getBoolean("A10", false);
        this.av = sharedPreferences.getBoolean("A11", false);
        this.aw = sharedPreferences.getBoolean("A12", false);
        this.ax = sharedPreferences.getBoolean("A1U", false);
        this.ay = sharedPreferences.getBoolean("A2U", false);
        this.az = sharedPreferences.getBoolean("A3U", false);
        this.aA = sharedPreferences.getBoolean("A4U", false);
        this.aB = sharedPreferences.getBoolean("A5U", false);
        this.aC = sharedPreferences.getBoolean("A6U", false);
        this.aD = sharedPreferences.getBoolean("A7U", false);
        this.aE = sharedPreferences.getBoolean("A8U", false);
        this.aF = sharedPreferences.getBoolean("A9U", false);
        this.aG = sharedPreferences.getBoolean("A10U", false);
        this.aH = sharedPreferences.getBoolean("A11U", false);
        this.aI = sharedPreferences.getBoolean("A12U", false);
        this.aM = sharedPreferences.getBoolean("A12L", false);
        this.aN = sharedPreferences.getBoolean("A12T", false);
        this.aO = sharedPreferences.getBoolean("A12W", false);
        this.aP = sharedPreferences.getBoolean("A12E", false);
        this.aQ = sharedPreferences.getBoolean("A12C", false);
        this.aR = sharedPreferences.getBoolean("A12S", false);
        this.f6064k = sharedPreferences.getBoolean("BOX", true);
        this.f6065l = sharedPreferences.getBoolean("BASEMENT", false);
        this.f6070q = sharedPreferences.getInt("BASEMENT_DAYS", 0);
        this.f6066m = sharedPreferences.getBoolean("APARTMENT", false);
        this.f6071r = sharedPreferences.getInt("APARTMENT_DAYS", 0);
        this.f6067n = sharedPreferences.getBoolean("HOUSE", false);
        this.f6072s = sharedPreferences.getInt("HOUSE_NO", 0);
        this.f6068o = sharedPreferences.getBoolean("CONDO", false);
        this.f6073t = sharedPreferences.getInt("CONDO_NO", 0);
        this.f6069p = sharedPreferences.getBoolean("MANSION", false);
        this.f6074u = sharedPreferences.getInt("MANSION_NO", 0);
        this.f6075v = sharedPreferences.getBoolean("BAREFOOT", true);
        this.f6076w = sharedPreferences.getBoolean("SHOES", false);
        this.f6030C = sharedPreferences.getInt("SHOES_NO", 0);
        this.f6077x = sharedPreferences.getBoolean("BICYCLE", false);
        this.f6031D = sharedPreferences.getInt("BICYCLE_NO", 0);
        this.f6078y = sharedPreferences.getBoolean("CAR", false);
        this.f6032E = sharedPreferences.getInt("CAR_NO", 0);
        this.f6079z = sharedPreferences.getBoolean("TRUCK", false);
        this.f6033F = sharedPreferences.getInt("TRUCK_NO", 0);
        this.f6028A = sharedPreferences.getBoolean("TOWNCAR", false);
        this.f6034G = sharedPreferences.getInt("TOWNCAR_NO", 0);
        this.f6029B = sharedPreferences.getBoolean("HELICOPTER", false);
        this.f6035H = sharedPreferences.getInt("HELICOPTER_NO", 0);
        this.f6036I = sharedPreferences.getBoolean("KNIFE", false);
        this.f6042O = sharedPreferences.getInt("KNIFE_NO", 0);
        this.f6037J = sharedPreferences.getBoolean("GUN", false);
        this.f6043P = sharedPreferences.getInt("GUN_NO", 0);
        this.f6038K = sharedPreferences.getBoolean("SHOTGUN", false);
        this.f6044Q = sharedPreferences.getInt("SHOTGUN_NO", 0);
        this.f6039L = sharedPreferences.getBoolean("RIFLE", false);
        this.f6045R = sharedPreferences.getInt("RIFLE_NO", 0);
        this.f6040M = sharedPreferences.getBoolean("VEST", false);
        this.f6046S = sharedPreferences.getInt("VEST_NO", 0);
        this.f6041N = sharedPreferences.getBoolean("EXPLOSIVES", false);
        this.f6047T = sharedPreferences.getInt("EXPLOSIVES_NO", 0);
        this.f6048U = sharedPreferences.getBoolean("MATH", false);
        this.f6049V = sharedPreferences.getBoolean("SCHOOL", false);
        this.f6050W = sharedPreferences.getBoolean("MASONRY", false);
        this.f6051X = sharedPreferences.getBoolean("COLLEGE", false);
        this.f6052Y = sharedPreferences.getBoolean("UNIVERSITY", false);
        this.f6053Z = sharedPreferences.getBoolean("NOVICE", false);
        this.aa = sharedPreferences.getBoolean("MOBSTER", false);
        this.ab = sharedPreferences.getBoolean("HITMAN", false);
        this.ac = sharedPreferences.getBoolean("PICKPOCKET", false);
        this.ad = sharedPreferences.getBoolean("BURGLAR", false);
        this.ae = sharedPreferences.getBoolean("MASTER", false);
        this.af = sharedPreferences.getBoolean("DRIVING", false);
        this.ag = sharedPreferences.getBoolean("LIQUOR", false);
        this.ah = sharedPreferences.getBoolean("BUSINESS", false);
        this.ai = sharedPreferences.getBoolean("LAWS", false);
        this.aj = sharedPreferences.getBoolean("ACCOUNTING", false);
        this.ak = sharedPreferences.getBoolean("MANAGEMENT", false);
    }

    public void m9740c() {
        this.aL++;
        if (this.aL > 0 && this.aL % 25 == 0) {
            this.f6041N = false;
            this.f6040M = false;
            this.f6039L = false;
            this.f6038K = false;
            this.f6037J = false;
            this.f6036I = false;
            this.f6047T = 0;
            this.f6046S = 0;
            this.f6045R = 0;
            this.f6044Q = 0;
            this.f6043P = 0;
            this.f6042O = 0;
            this.f6058e = 0;
            m9746i();
            m9741d();
        }
        if (this.f6059f == 0) {
            this.f6060g = 31;
        } else if (this.f6059f >= 100 && this.f6060g > 1) {
            this.f6060g--;
        } else if (this.f6059f >= 100 && this.f6060g <= 1) {
            this.f6060g = 30;
            this.f6059f += this.f6059f / 100;
        }
        if (this.f6065l && this.f6070q >= 1) {
            this.f6070q--;
        }
        if (this.f6065l && this.f6070q == 0) {
            this.f6065l = false;
            this.f6070q = 0;
        }
        if (this.f6066m && this.f6071r >= 1) {
            this.f6071r--;
        }
        if (this.f6066m && this.f6071r == 0) {
            this.f6066m = false;
            this.f6071r = 0;
        }
        m9737a();
    }

    public void m9741d() {
        View inflate = getLayoutInflater().inflate(R.layout.police_dialog, new LinearLayout(getApplicationContext()), false);
        Builder builder = new Builder(this);
        builder.setCustomTitle(getLayoutInflater().inflate(R.layout.police_title, new RelativeLayout(getApplicationContext()), false));
        builder.setView(inflate);
        builder.setCancelable(false);
        TextView textView = (TextView) inflate.findViewById(R.id.police_dialog);
        textView.setTypeface(this.aT);
        textView.setText(getResources().getString(R.string.police_dialog));
        builder.setPositiveButton("Continue", new C19534(this));
        Dialog create = builder.create();
        create.setOnShowListener(new C19545(this));
        create.getWindow().setSoftInputMode(4);
        create.show();
        create.findViewById(create.getContext().getResources().getIdentifier("android:id/titleDivider", null, null)).setBackgroundColor(getResources().getColor(R.color.greyc));
        ((TextView) create.findViewById(R.id.police_title)).setTypeface(this.aT);
    }

    public void m9742e() {
        if (this.aJ) {
            this.bT = (AudioManager) getSystemService("audio");
            this.bX = ((float) this.bT.getStreamVolume(3)) / ((float) this.bT.getStreamMaxVolume(3));
            this.bU = new SoundPool(10, 3, 0);
            this.bU.setOnLoadCompleteListener(new C19556(this));
            this.bW = this.bU.load(this, R.raw.dead, 1);
            this.bV = this.bU.load(this, R.raw.click, 1);
            return;
        }
        Log.e("CriminalJobActivity", "Sound Not Loaded");
        this.bY = false;
    }

    public void m9743f() {
        try {
            this.bU.play(this.bV, this.bX, this.bX, 1, 0, 1.0f);
        } catch (Exception e) {
            Log.e("CriminalJobActivity", "Error Playing Sound");
        }
    }

    public void m9744g() {
        try {
            this.bU.play(this.bW, this.bX, this.bX, 1, 0, 1.0f);
        } catch (Exception e) {
            Log.e("CriminalJobActivity", "Error Playing Sound");
        }
    }

    public void goBack(View view) {
        m9743f();
        finish();
    }

    public void m9745h() {
        this.bZ = new C0486e(this);
        this.bZ.m2147a(getString(R.string.interstitial_ad_unit_id));
        this.bZ.m2146a(new C0472a().m2094a());
    }

    public void m9746i() {
        if (this.bZ == null || !this.bZ.m2148a()) {
            Log.e("CriminalJobActivity", "Ad Not Ready.");
        } else {
            this.bZ.m2149b();
        }
    }

    public void m9747j() {
        new Handler().postDelayed(new C19567(this), 5000);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.e("CriminalJobActivity", "onCreate");
        setContentView(R.layout.activity_job);
        this.aS = Typeface.createFromAsset(getAssets(), "fonts/caviar_dreams.ttf");
        this.aT = Typeface.createFromAsset(getAssets(), "fonts/caviar_dreams_bold.ttf");
        this.bP = Toast.makeText(this, "", 1);
        this.bQ = Toast.makeText(this, "", 1);
        this.bR = Toast.makeText(this, "", 1);
        this.bS = Toast.makeText(this, "", 1);
        this.aU = (AdView) findViewById(R.id.adView);
        this.aU.setAdListener(new C19491(this));
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
        this.aX = (ListView) findViewById(R.id.job_list);
        this.aZ = new C2092g(this);
        this.aX.setAdapter(this.aZ);
        this.aX.setOnItemClickListener(new C19502(this));
    }

    public void onDestroy() {
        super.onDestroy();
        Log.e("CriminalJobActivity", "onDestroy");
        if (this.aU != null) {
            this.aU.m2047a();
        }
    }

    protected void onPause() {
        boolean z = true;
        super.onPause();
        Log.e("CriminalJobActivity", "onPause");
        if (this.aU != null) {
            this.aU.m2049b();
        }
        if (this.bP != null) {
            this.bP.cancel();
        }
        if (this.bR != null) {
            this.bR.cancel();
        }
        if (this.bQ != null) {
            this.bQ.cancel();
        }
        if (this.bU != null) {
            this.bU.unload(this.bV);
            this.bU.unload(this.bW);
            this.bU.release();
            this.bU = null;
        }
        this.an = this.aL >= 1000;
        this.ap = this.f6058e >= 1000;
        this.ar = this.f6058e >= 10000;
        this.as = this.f6058e >= 100000;
        this.au = this.f6058e >= 1000000;
        if (this.f6058e < 10000000) {
            z = false;
        }
        this.av = z;
        m9737a();
    }

    public void onResume() {
        super.onResume();
        Log.e("CriminalJobActivity", "onResume");
        if (this.aU != null) {
            this.aU.m2050c();
        }
        m9739b();
        m9742e();
        m9745h();
        m9731a(this.f6062i, this.f6063j);
        m9734k();
        m9735l();
        this.bc.setText("$" + String.format("%,d", new Object[]{Integer.valueOf(this.f6058e)}).replace(',', ' '));
        this.be.setText("$" + String.format("%,d", new Object[]{Integer.valueOf(this.f6059f)}).replace(',', ' '));
    }
}
