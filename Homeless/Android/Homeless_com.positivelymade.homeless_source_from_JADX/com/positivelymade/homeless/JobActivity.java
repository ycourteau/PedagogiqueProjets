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

public class JobActivity extends Activity {
    public boolean f6353A;
    public boolean f6354B;
    public int f6355C;
    public int f6356D;
    public int f6357E;
    public int f6358F;
    public int f6359G;
    public int f6360H;
    public boolean f6361I;
    public boolean f6362J;
    public boolean f6363K;
    public boolean f6364L;
    public boolean f6365M;
    public boolean f6366N;
    public int f6367O;
    public int f6368P;
    public int f6369Q;
    public int f6370R;
    public int f6371S;
    public int f6372T;
    public boolean f6373U;
    public boolean f6374V;
    public boolean f6375W;
    public boolean f6376X;
    public boolean f6377Y;
    public boolean f6378Z;
    public String f6379a;
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
    public String f6380b;
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
    public String f6381c;
    public int f6382d;
    public int f6383e;
    public int f6384f;
    public int f6385g;
    public int f6386h;
    public int f6387i;
    public int f6388j;
    public boolean f6389k;
    public boolean f6390l;
    public boolean f6391m;
    public boolean f6392n;
    public boolean f6393o;
    public boolean f6394p;
    public int f6395q;
    public int f6396r;
    public int f6397s;
    public int f6398t;
    public int f6399u;
    public boolean f6400v;
    public boolean f6401w;
    public boolean f6402x;
    public boolean f6403y;
    public boolean f6404z;

    class C19791 extends C0427a {
        final /* synthetic */ JobActivity f6341a;

        C19791(JobActivity jobActivity) {
            this.f6341a = jobActivity;
        }

        public void mo322a() {
            Log.e("JobActivity", "Google onAdLoaded");
        }

        public void mo323a(int i) {
            Log.e("JobActivity", "Google onAdFailedToLoad: " + this.f6341a.m9845a(i));
        }

        public void mo324b() {
            Log.e("JobActivity", "Google onAdOpened");
        }

        public void mo325c() {
            Log.e("JobActivity", "Google onAdClosed");
        }

        public void mo326d() {
            Log.d("JobActivity", "Google onAdLeftApplication");
        }
    }

    class C19802 implements OnItemClickListener {
        final /* synthetic */ JobActivity f6342a;

        C19802(JobActivity jobActivity) {
            this.f6342a = jobActivity;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            String b = ((C2107q) this.f6342a.aZ.m10158a().get(i)).m10198b();
            int i2 = -1;
            switch (b.hashCode()) {
                case 1165:
                    if (b.equals("$1")) {
                        i2 = 0;
                        break;
                    }
                    break;
                case 1169:
                    if (b.equals("$5")) {
                        i2 = 1;
                        break;
                    }
                    break;
                case 36194:
                    if (b.equals("$20")) {
                        i2 = 2;
                        break;
                    }
                    break;
                case 36287:
                    if (b.equals("$50")) {
                        i2 = 3;
                        break;
                    }
                    break;
                case 1121101:
                    if (b.equals("$100")) {
                        i2 = 4;
                        break;
                    }
                    break;
                case 1121256:
                    if (b.equals("$150")) {
                        i2 = 5;
                        break;
                    }
                    break;
                case 1124945:
                    if (b.equals("$500")) {
                        i2 = 6;
                        break;
                    }
                    break;
                case 1127828:
                    if (b.equals("$800")) {
                        i2 = 7;
                        break;
                    }
                    break;
                case 34783970:
                    if (b.equals("$2000")) {
                        i2 = 8;
                        break;
                    }
                    break;
                case 34843552:
                    if (b.equals("$4000")) {
                        i2 = 9;
                        break;
                    }
                    break;
                case 1077379597:
                    if (b.equals("$10000")) {
                        i2 = 10;
                        break;
                    }
                    break;
                case 1081073681:
                    if (b.equals("$50000")) {
                        i2 = 11;
                        break;
                    }
                    break;
            }
            JobActivity jobActivity;
            switch (i2) {
                case 0:
                    jobActivity = this.f6342a;
                    jobActivity.f6387i -= 5;
                    jobActivity = this.f6342a;
                    jobActivity.f6388j -= 5;
                    jobActivity = this.f6342a;
                    jobActivity.f6383e++;
                    this.f6342a.f6382d++;
                    jobActivity = this.f6342a;
                    jobActivity.f6386h++;
                    this.f6342a.m9856c();
                    break;
                case 1:
                    if (!this.f6342a.bm) {
                        this.f6342a.m9854a(this.f6342a.bP, this.f6342a.getResources().getString(R.string.job_need) + this.f6342a.getResources().getString(R.string.p29), (int) R.drawable.notice);
                        break;
                    }
                    jobActivity = this.f6342a;
                    jobActivity.f6387i -= 7;
                    jobActivity = this.f6342a;
                    jobActivity.f6388j -= 7;
                    jobActivity = this.f6342a;
                    jobActivity.f6383e += 5;
                    this.f6342a.f6382d += 5;
                    jobActivity = this.f6342a;
                    jobActivity.f6386h++;
                    this.f6342a.m9856c();
                    break;
                case 2:
                    if (!this.f6342a.bm || ((!this.f6342a.by && !this.f6342a.bz && !this.f6342a.bA && !this.f6342a.bB && !this.f6342a.bC) || (!this.f6342a.bg && !this.f6342a.bh && !this.f6342a.bi && !this.f6342a.bj && !this.f6342a.bk))) {
                        this.f6342a.m9854a(this.f6342a.bP, this.f6342a.getResources().getString(R.string.job_need) + this.f6342a.getResources().getString(R.string.p29) + "\n" + this.f6342a.getResources().getString(R.string.p23) + "\n" + this.f6342a.getResources().getString(R.string.d41), (int) R.drawable.notice);
                        break;
                    }
                    jobActivity = this.f6342a;
                    jobActivity.f6387i -= 9;
                    jobActivity = this.f6342a;
                    jobActivity.f6388j -= 9;
                    jobActivity = this.f6342a;
                    jobActivity.f6383e += 20;
                    this.f6342a.f6382d += 20;
                    jobActivity = this.f6342a;
                    jobActivity.f6386h++;
                    this.f6342a.m9856c();
                    break;
                case 3:
                    if (!this.f6342a.bm || ((!this.f6342a.by && !this.f6342a.bz && !this.f6342a.bA && !this.f6342a.bB && !this.f6342a.bC) || ((!this.f6342a.bg && !this.f6342a.bh && !this.f6342a.bi && !this.f6342a.bj && !this.f6342a.bk) || (!this.f6342a.bn && !this.f6342a.bo && !this.f6342a.bp && !this.f6342a.bq && !this.f6342a.br)))) {
                        this.f6342a.m9854a(this.f6342a.bP, this.f6342a.getResources().getString(R.string.job_need) + this.f6342a.getResources().getString(R.string.p29) + "\n" + this.f6342a.getResources().getString(R.string.p30) + "\n" + this.f6342a.getResources().getString(R.string.p23) + "\n" + this.f6342a.getResources().getString(R.string.d41), (int) R.drawable.notice);
                        break;
                    }
                    jobActivity = this.f6342a;
                    jobActivity.f6387i -= 11;
                    jobActivity = this.f6342a;
                    jobActivity.f6388j -= 9;
                    jobActivity = this.f6342a;
                    jobActivity.f6383e += 50;
                    this.f6342a.f6382d += 50;
                    jobActivity = this.f6342a;
                    jobActivity.f6386h++;
                    this.f6342a.m9856c();
                    break;
                    break;
                case 4:
                    if (!this.f6342a.bm || ((!this.f6342a.by && !this.f6342a.bz && !this.f6342a.bA && !this.f6342a.bB && !this.f6342a.bC) || ((!this.f6342a.bg && !this.f6342a.bh && !this.f6342a.bi && !this.f6342a.bj && !this.f6342a.bk) || ((!this.f6342a.bo && !this.f6342a.bp && !this.f6342a.bq) || !this.f6342a.bJ)))) {
                        this.f6342a.m9854a(this.f6342a.bP, this.f6342a.getResources().getString(R.string.job_need) + this.f6342a.getResources().getString(R.string.p29) + "\n" + this.f6342a.getResources().getString(R.string.p31) + "\n" + this.f6342a.getResources().getString(R.string.p23) + "\n" + this.f6342a.getResources().getString(R.string.d41) + "\n" + this.f6342a.getResources().getString(R.string.d52), (int) R.drawable.notice);
                        break;
                    }
                    jobActivity = this.f6342a;
                    jobActivity.f6387i -= 13;
                    jobActivity = this.f6342a;
                    jobActivity.f6388j -= 11;
                    jobActivity = this.f6342a;
                    jobActivity.f6383e += 100;
                    this.f6342a.f6382d += 100;
                    jobActivity = this.f6342a;
                    jobActivity.f6386h++;
                    this.f6342a.m9856c();
                    break;
                    break;
                case 5:
                    if (!this.f6342a.bm || !this.f6342a.bA || ((!this.f6342a.bg && !this.f6342a.bh && !this.f6342a.bi && !this.f6342a.bj && !this.f6342a.bk) || ((!this.f6342a.bo && !this.f6342a.bp && !this.f6342a.bq) || !this.f6342a.bJ))) {
                        this.f6342a.m9854a(this.f6342a.bP, this.f6342a.getResources().getString(R.string.job_need) + this.f6342a.getResources().getString(R.string.p29) + "\n" + this.f6342a.getResources().getString(R.string.p31) + "\n" + this.f6342a.getResources().getString(R.string.p23) + "\n" + this.f6342a.getResources().getString(R.string.d43) + "\n" + this.f6342a.getResources().getString(R.string.d52), (int) R.drawable.notice);
                        break;
                    }
                    jobActivity = this.f6342a;
                    jobActivity.f6387i -= 15;
                    jobActivity = this.f6342a;
                    jobActivity.f6388j -= 13;
                    jobActivity = this.f6342a;
                    jobActivity.f6383e += 150;
                    this.f6342a.f6382d += 150;
                    jobActivity = this.f6342a;
                    jobActivity.f6386h++;
                    this.f6342a.m9856c();
                    break;
                case 6:
                    if (!this.f6342a.bm || ((!this.f6342a.bB && !this.f6342a.bC) || ((!this.f6342a.bh && !this.f6342a.bi && !this.f6342a.bj && !this.f6342a.bk) || ((!this.f6342a.bo && !this.f6342a.bp && !this.f6342a.bq && !this.f6342a.br) || !this.f6342a.bJ)))) {
                        this.f6342a.m9854a(this.f6342a.bP, this.f6342a.getResources().getString(R.string.job_need) + this.f6342a.getResources().getString(R.string.p29) + "\n" + this.f6342a.getResources().getString(R.string.p31) + "\n" + this.f6342a.getResources().getString(R.string.p24) + "\n" + this.f6342a.getResources().getString(R.string.d44) + "\n" + this.f6342a.getResources().getString(R.string.d52), (int) R.drawable.notice);
                        break;
                    }
                    jobActivity = this.f6342a;
                    jobActivity.f6387i -= 20;
                    jobActivity = this.f6342a;
                    jobActivity.f6388j -= 13;
                    jobActivity = this.f6342a;
                    jobActivity.f6383e += 500;
                    this.f6342a.f6382d += 500;
                    jobActivity = this.f6342a;
                    jobActivity.f6386h++;
                    this.f6342a.m9856c();
                    break;
                    break;
                case 7:
                    if (!this.f6342a.bm || ((!this.f6342a.bB && !this.f6342a.bC) || ((!this.f6342a.bh && !this.f6342a.bi && !this.f6342a.bj && !this.f6342a.bk) || ((!this.f6342a.bo && !this.f6342a.bp && !this.f6342a.bq && !this.f6342a.br) || !this.f6342a.bJ)))) {
                        this.f6342a.m9854a(this.f6342a.bP, this.f6342a.getResources().getString(R.string.job_need) + this.f6342a.getResources().getString(R.string.p29) + "\n" + this.f6342a.getResources().getString(R.string.p31) + "\n" + this.f6342a.getResources().getString(R.string.p24) + "\n" + this.f6342a.getResources().getString(R.string.d44) + "\n" + this.f6342a.getResources().getString(R.string.d52), (int) R.drawable.notice);
                        break;
                    }
                    jobActivity = this.f6342a;
                    jobActivity.f6387i -= 22;
                    jobActivity = this.f6342a;
                    jobActivity.f6388j -= 15;
                    jobActivity = this.f6342a;
                    jobActivity.f6383e += 800;
                    this.f6342a.f6382d += 800;
                    jobActivity = this.f6342a;
                    jobActivity.f6386h++;
                    this.f6342a.m9856c();
                    break;
                    break;
                case 8:
                    if (!this.f6342a.bm || ((!this.f6342a.bB && !this.f6342a.bC) || ((!this.f6342a.bi && !this.f6342a.bj && !this.f6342a.bk) || ((!this.f6342a.bp && !this.f6342a.bq && !this.f6342a.br) || !this.f6342a.bJ || !this.f6342a.bK)))) {
                        this.f6342a.m9854a(this.f6342a.bP, this.f6342a.getResources().getString(R.string.job_need) + this.f6342a.getResources().getString(R.string.p29) + "\n" + this.f6342a.getResources().getString(R.string.p32) + "\n" + this.f6342a.getResources().getString(R.string.p25) + "\n" + this.f6342a.getResources().getString(R.string.d44) + "\n" + this.f6342a.getResources().getString(R.string.d52) + "\n" + this.f6342a.getResources().getString(R.string.d53), (int) R.drawable.notice);
                        break;
                    }
                    jobActivity = this.f6342a;
                    jobActivity.f6387i -= 24;
                    jobActivity = this.f6342a;
                    jobActivity.f6388j -= 20;
                    jobActivity = this.f6342a;
                    jobActivity.f6383e += 2000;
                    this.f6342a.f6382d += 2000;
                    jobActivity = this.f6342a;
                    jobActivity.f6386h++;
                    this.f6342a.m9856c();
                    break;
                case 9:
                    if (!this.f6342a.bm || ((!this.f6342a.bB && !this.f6342a.bC) || ((!this.f6342a.bi && !this.f6342a.bj && !this.f6342a.bk) || ((!this.f6342a.bp && !this.f6342a.bq && !this.f6342a.br) || !this.f6342a.bJ || !this.f6342a.bK || !this.f6342a.bL)))) {
                        this.f6342a.m9854a(this.f6342a.bP, this.f6342a.getResources().getString(R.string.job_need) + this.f6342a.getResources().getString(R.string.p29) + "\n" + this.f6342a.getResources().getString(R.string.p32) + "\n" + this.f6342a.getResources().getString(R.string.p25) + "\n" + this.f6342a.getResources().getString(R.string.d44) + "\n" + this.f6342a.getResources().getString(R.string.d52) + "\n" + this.f6342a.getResources().getString(R.string.d53) + "\n" + this.f6342a.getResources().getString(R.string.d54), (int) R.drawable.notice);
                        break;
                    }
                    jobActivity = this.f6342a;
                    jobActivity.f6387i -= 26;
                    jobActivity = this.f6342a;
                    jobActivity.f6388j -= 22;
                    jobActivity = this.f6342a;
                    jobActivity.f6383e += 4000;
                    this.f6342a.f6382d += 4000;
                    jobActivity = this.f6342a;
                    jobActivity.f6386h++;
                    this.f6342a.m9856c();
                    break;
                case 10:
                    if (!this.f6342a.bm || !this.f6342a.bC || ((!this.f6342a.bj && !this.f6342a.bk) || ((!this.f6342a.bq && !this.f6342a.br) || !this.f6342a.bL || (!this.f6342a.bM && !this.f6342a.bN)))) {
                        this.f6342a.m9854a(this.f6342a.bP, this.f6342a.getResources().getString(R.string.job_need) + this.f6342a.getResources().getString(R.string.p29) + "\n" + this.f6342a.getResources().getString(R.string.p33) + "\n" + this.f6342a.getResources().getString(R.string.p26) + "\n" + this.f6342a.getResources().getString(R.string.d45) + "\n" + this.f6342a.getResources().getString(R.string.d54) + "\n" + this.f6342a.getResources().getString(R.string.d55), (int) R.drawable.notice);
                        break;
                    }
                    jobActivity = this.f6342a;
                    jobActivity.f6387i -= 28;
                    jobActivity = this.f6342a;
                    jobActivity.f6388j -= 28;
                    jobActivity = this.f6342a;
                    jobActivity.f6383e += 10000;
                    this.f6342a.f6382d += 10000;
                    jobActivity = this.f6342a;
                    jobActivity.f6386h++;
                    this.f6342a.m9856c();
                    break;
                    break;
                case 11:
                    if (!this.f6342a.bm || !this.f6342a.bC || !this.f6342a.bk || !this.f6342a.br || !this.f6342a.bL || ((!this.f6342a.bM && !this.f6342a.bN) || !this.f6342a.bO)) {
                        this.f6342a.m9854a(this.f6342a.bP, this.f6342a.getResources().getString(R.string.job_need) + this.f6342a.getResources().getString(R.string.p29) + "\n" + this.f6342a.getResources().getString(R.string.p34) + "\n" + this.f6342a.getResources().getString(R.string.p27) + "\n" + this.f6342a.getResources().getString(R.string.d45) + "\n" + this.f6342a.getResources().getString(R.string.d54) + "\n" + this.f6342a.getResources().getString(R.string.d55) + "\n" + this.f6342a.getResources().getString(R.string.d57), (int) R.drawable.notice);
                        break;
                    }
                    jobActivity = this.f6342a;
                    jobActivity.f6387i -= 30;
                    jobActivity = this.f6342a;
                    jobActivity.f6388j -= 30;
                    jobActivity = this.f6342a;
                    jobActivity.f6383e += 50000;
                    this.f6342a.f6382d += 50000;
                    jobActivity = this.f6342a;
                    jobActivity.f6386h++;
                    this.f6342a.m9856c();
                    break;
                    break;
            }
            if (this.f6342a.f6388j <= 0) {
                this.f6342a.f6388j = 0;
                this.f6342a.m9854a(this.f6342a.bS, this.f6342a.getResources().getString(R.string.toast_dead_health), (int) R.drawable.dead);
                this.f6342a.m9852l();
            } else if (this.f6342a.f6387i <= 0) {
                this.f6342a.f6387i = 0;
                this.f6342a.m9854a(this.f6342a.bS, this.f6342a.getResources().getString(R.string.toast_dead_hunger), (int) R.drawable.dead);
                this.f6342a.m9852l();
            } else if (this.f6342a.f6388j < 25) {
                this.f6342a.m9854a(this.f6342a.bQ, this.f6342a.getResources().getString(R.string.toast_health), (int) R.drawable.low_health);
            } else if (this.f6342a.f6387i < 25) {
                this.f6342a.m9854a(this.f6342a.bR, this.f6342a.getResources().getString(R.string.toast_hunger), (int) R.drawable.low_hunger);
            }
            if (this.f6342a.f6387i >= 300) {
                this.f6342a.f6387i = 300;
            }
            if (this.f6342a.f6388j >= 300) {
                this.f6342a.f6388j = 300;
            }
            this.f6342a.m9847a(this.f6342a.f6387i, this.f6342a.f6388j);
            this.f6342a.bc.setText("$" + String.format("%,d", new Object[]{Integer.valueOf(this.f6342a.f6383e)}).replace(',', ' '));
            this.f6342a.be.setText("$" + String.format("%,d", new Object[]{Integer.valueOf(this.f6342a.f6384f)}).replace(',', ' '));
            this.f6342a.m9853a();
        }
    }

    class C19834 implements OnLoadCompleteListener {
        final /* synthetic */ JobActivity f6351a;

        C19834(JobActivity jobActivity) {
            this.f6351a = jobActivity;
        }

        public void onLoadComplete(SoundPool soundPool, int i, int i2) {
            Log.e("JobActivity", "Sound Loaded");
            this.f6351a.bY = true;
        }
    }

    class C19845 implements Runnable {
        final /* synthetic */ JobActivity f6352a;

        C19845(JobActivity jobActivity) {
            this.f6352a = jobActivity;
        }

        public void run() {
            this.f6352a.m9861h();
        }
    }

    private String m9845a(int i) {
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

    private void m9847a(int i, int i2) {
        final Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.hunger);
        final C2110s c2110s = new C2110s();
        final Bitmap decodeResource2 = BitmapFactory.decodeResource(getResources(), R.drawable.health);
        final C2110s c2110s2 = new C2110s();
        final int i3 = i;
        final int i4 = i2;
        new Thread(new Runnable(this) {
            final /* synthetic */ JobActivity f6350g;

            class C19811 implements Runnable {
                final /* synthetic */ C19823 f6343a;

                C19811(C19823 c19823) {
                    this.f6343a = c19823;
                }

                public void run() {
                    if (Looper.getMainLooper() == Looper.myLooper()) {
                        Log.e("JobActivity", "uVitals runOnUiThread");
                        try {
                            this.f6343a.f6350g.aY.m10202b();
                            this.f6343a.f6350g.aY.m10201a(c2110s);
                            this.f6343a.f6350g.aY.m10201a(c2110s2);
                        } catch (Exception e) {
                            Log.e("JobActivity", "Error: " + e);
                        }
                    }
                }
            }

            public void run() {
                c2110s.m10204a(Bitmap.createScaledBitmap(decodeResource, decodeResource.getWidth(), decodeResource.getHeight(), false));
                c2110s.m10206a("Hunger");
                c2110s.m10208b(String.valueOf(i3) + "/300");
                c2110s.m10205a(this.f6350g.ba);
                c2110s2.m10204a(Bitmap.createScaledBitmap(decodeResource2, decodeResource2.getWidth(), decodeResource2.getHeight(), false));
                c2110s2.m10206a("Health");
                c2110s2.m10208b(String.valueOf(i4) + "/300");
                c2110s2.m10205a(this.f6350g.bb);
                this.f6350g.runOnUiThread(new C19811(this));
            }
        }).start();
    }

    private void m9850j() {
        this.aZ.m10160b();
        C2107q c2107q = new C2107q();
        c2107q.m10197a(getString(R.string.business_j_1));
        c2107q.m10199b(getString(R.string.business_j_1p));
        this.aZ.m10159a(c2107q);
        c2107q = new C2107q();
        c2107q.m10197a(getString(R.string.business_j_2));
        c2107q.m10199b(getString(R.string.business_j_2p));
        this.aZ.m10159a(c2107q);
        c2107q = new C2107q();
        c2107q.m10197a(getString(R.string.business_j_3));
        c2107q.m10199b(getString(R.string.business_j_3p));
        this.aZ.m10159a(c2107q);
        c2107q = new C2107q();
        c2107q.m10197a(getString(R.string.business_j_4));
        c2107q.m10199b(getString(R.string.business_j_4p));
        this.aZ.m10159a(c2107q);
        c2107q = new C2107q();
        c2107q.m10197a(getString(R.string.business_j_5));
        c2107q.m10199b(getString(R.string.business_j_5p));
        this.aZ.m10159a(c2107q);
        c2107q = new C2107q();
        c2107q.m10197a(getString(R.string.business_j_6));
        c2107q.m10199b(getString(R.string.business_j_6p));
        this.aZ.m10159a(c2107q);
        c2107q = new C2107q();
        c2107q.m10197a(getString(R.string.business_j_7));
        c2107q.m10199b(getString(R.string.business_j_7p));
        this.aZ.m10159a(c2107q);
        c2107q = new C2107q();
        c2107q.m10197a(getString(R.string.business_j_8));
        c2107q.m10199b(getString(R.string.business_j_8p));
        this.aZ.m10159a(c2107q);
        c2107q = new C2107q();
        c2107q.m10197a(getString(R.string.business_j_9));
        c2107q.m10199b(getString(R.string.business_j_9p));
        this.aZ.m10159a(c2107q);
        c2107q = new C2107q();
        c2107q.m10197a(getString(R.string.business_j_10));
        c2107q.m10199b(getString(R.string.business_j_10p));
        this.aZ.m10159a(c2107q);
        c2107q = new C2107q();
        c2107q.m10197a(getString(R.string.business_j_11));
        c2107q.m10199b(getString(R.string.business_j_11p));
        this.aZ.m10159a(c2107q);
        c2107q = new C2107q();
        c2107q.m10197a(getString(R.string.business_j_12));
        c2107q.m10199b(getString(R.string.business_j_12p));
        this.aZ.m10159a(c2107q);
    }

    private void m9851k() {
        this.bg = this.f6390l;
        this.bh = this.f6391m;
        this.bi = this.f6392n;
        this.bj = this.f6393o;
        this.bk = this.f6394p;
        this.bl = this.f6400v;
        this.bm = this.f6401w;
        this.bn = this.f6402x;
        this.bo = this.f6403y;
        this.bp = this.f6404z;
        this.bq = this.f6353A;
        this.br = this.f6354B;
        this.bs = this.f6361I;
        this.bt = this.f6362J;
        this.bu = this.f6363K;
        this.bv = this.f6364L;
        this.bw = this.f6365M;
        this.bx = this.f6366N;
        this.by = this.f6373U;
        this.bz = this.f6374V;
        this.bA = this.f6375W;
        this.bB = this.f6376X;
        this.bC = this.f6377Y;
        this.bD = this.f6378Z;
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

    private void m9852l() {
        m9859f();
        this.f6380b = "";
        this.f6381c = "";
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
        this.f6383e = 0;
        this.f6384f = 0;
        this.f6382d = 0;
        this.f6385g = 31;
        this.f6386h = 0;
        this.f6387i = 80;
        this.f6388j = 80;
        this.f6389k = true;
        this.f6390l = false;
        this.f6395q = 0;
        this.f6391m = false;
        this.f6396r = 0;
        this.f6392n = false;
        this.f6397s = 0;
        this.f6393o = false;
        this.f6398t = 0;
        this.f6394p = false;
        this.f6399u = 0;
        this.f6400v = true;
        this.f6401w = false;
        this.f6355C = 0;
        this.f6402x = false;
        this.f6356D = 0;
        this.f6403y = false;
        this.f6357E = 0;
        this.f6404z = false;
        this.f6358F = 0;
        this.f6353A = false;
        this.f6359G = 0;
        this.f6354B = false;
        this.f6360H = 0;
        this.f6361I = false;
        this.f6367O = 0;
        this.f6362J = false;
        this.f6368P = 0;
        this.f6363K = false;
        this.f6369Q = 0;
        this.f6364L = false;
        this.f6370R = 0;
        this.f6365M = false;
        this.f6371S = 0;
        this.f6366N = false;
        this.f6372T = 0;
        this.f6373U = false;
        this.f6374V = false;
        this.f6375W = false;
        this.f6376X = false;
        this.f6377Y = false;
        this.f6378Z = false;
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
        m9862i();
        Intent intent = new Intent(this, PlayActivity.class);
        finish();
        startActivity(intent);
    }

    public void m9853a() {
        Editor edit = getApplicationContext().getSharedPreferences(getString(R.string.preference_file_key), 0).edit();
        edit.putString("CODES", this.f6380b);
        edit.putBoolean("VOLUME", this.aJ);
        edit.putString("DATES", this.f6381c);
        edit.putInt("MONEY", this.f6382d);
        edit.putString("NAME", this.f6379a);
        edit.putInt("CASH", this.f6383e);
        edit.putInt("BANK", this.f6384f);
        edit.putInt("BANK_DAYS", this.f6385g);
        edit.putInt("AGE", this.f6386h);
        edit.putInt("HUNGER", this.f6387i);
        edit.putInt("HEALTH", this.f6388j);
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
        edit.putBoolean("BOX", this.f6389k);
        edit.putBoolean("BASEMENT", this.f6390l);
        edit.putInt("BASEMENT_DAYS", this.f6395q);
        edit.putBoolean("APARTMENT", this.f6391m);
        edit.putInt("APARTMENT_DAYS", this.f6396r);
        edit.putBoolean("HOUSE", this.f6392n);
        edit.putInt("HOUSE_NO", this.f6397s);
        edit.putBoolean("CONDO", this.f6393o);
        edit.putInt("CONDO_NO", this.f6398t);
        edit.putBoolean("MANSION", this.f6394p);
        edit.putInt("MANSION_NO", this.f6399u);
        edit.putBoolean("BAREFOOT", this.f6400v);
        edit.putBoolean("SHOES", this.f6401w);
        edit.putInt("SHOES_NO", this.f6355C);
        edit.putBoolean("BICYCLE", this.f6402x);
        edit.putInt("BICYCLE_NO", this.f6356D);
        edit.putBoolean("CAR", this.f6403y);
        edit.putInt("CAR_NO", this.f6357E);
        edit.putBoolean("TRUCK", this.f6404z);
        edit.putInt("TRUCK_NO", this.f6358F);
        edit.putBoolean("TOWNCAR", this.f6353A);
        edit.putInt("TOWNCAR_NO", this.f6359G);
        edit.putBoolean("HELICOPTER", this.f6354B);
        edit.putInt("HELICOPTER_NO", this.f6360H);
        edit.putBoolean("KNIFE", this.f6361I);
        edit.putInt("KNIFE_NO", this.f6367O);
        edit.putBoolean("GUN", this.f6362J);
        edit.putInt("GUN_NO", this.f6368P);
        edit.putBoolean("SHOTGUN", this.f6363K);
        edit.putInt("SHOTGUN_NO", this.f6369Q);
        edit.putBoolean("RIFLE", this.f6364L);
        edit.putInt("RIFLE_NO", this.f6370R);
        edit.putBoolean("VEST", this.f6365M);
        edit.putInt("VEST_NO", this.f6371S);
        edit.putBoolean("EXPLOSIVES", this.f6366N);
        edit.putInt("EXPLOSIVES_NO", this.f6372T);
        edit.putBoolean("MATH", this.f6373U);
        edit.putBoolean("SCHOOL", this.f6374V);
        edit.putBoolean("MASONRY", this.f6375W);
        edit.putBoolean("COLLEGE", this.f6376X);
        edit.putBoolean("UNIVERSITY", this.f6377Y);
        edit.putBoolean("NOVICE", this.f6378Z);
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

    public void m9854a(Toast toast, String str, int i) {
        View inflate = getLayoutInflater().inflate(R.layout.toast_message, (ViewGroup) findViewById(R.id.toast_layout_root));
        ((ImageView) inflate.findViewById(R.id.toast_image)).setImageResource(i);
        ((TextView) inflate.findViewById(R.id.toast_text)).setText(str);
        if (toast.getView().getWindowVisibility() != 0) {
            Log.e("JobActivity", "Exists");
            toast.setDuration(1);
        }
        toast.setGravity(16, 0, 0);
        toast.setView(inflate);
        toast.show();
    }

    public void m9855b() {
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences(getString(R.string.preference_file_key), 0);
        this.f6380b = sharedPreferences.getString("CODES", "");
        this.aJ = sharedPreferences.getBoolean("VOLUME", true);
        this.f6381c = sharedPreferences.getString("DATES", "");
        this.f6382d = sharedPreferences.getInt("MONEY", 0);
        this.f6379a = sharedPreferences.getString("NAME", "Unknown");
        this.f6383e = sharedPreferences.getInt("CASH", 0);
        this.f6384f = sharedPreferences.getInt("BANK", 0);
        this.f6385g = sharedPreferences.getInt("BANK_DAYS", 31);
        this.f6386h = sharedPreferences.getInt("AGE", 0);
        this.f6387i = sharedPreferences.getInt("HUNGER", 80);
        this.f6388j = sharedPreferences.getInt("HEALTH", 80);
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
        this.f6389k = sharedPreferences.getBoolean("BOX", true);
        this.f6390l = sharedPreferences.getBoolean("BASEMENT", false);
        this.f6395q = sharedPreferences.getInt("BASEMENT_DAYS", 0);
        this.f6391m = sharedPreferences.getBoolean("APARTMENT", false);
        this.f6396r = sharedPreferences.getInt("APARTMENT_DAYS", 0);
        this.f6392n = sharedPreferences.getBoolean("HOUSE", false);
        this.f6397s = sharedPreferences.getInt("HOUSE_NO", 0);
        this.f6393o = sharedPreferences.getBoolean("CONDO", false);
        this.f6398t = sharedPreferences.getInt("CONDO_NO", 0);
        this.f6394p = sharedPreferences.getBoolean("MANSION", false);
        this.f6399u = sharedPreferences.getInt("MANSION_NO", 0);
        this.f6400v = sharedPreferences.getBoolean("BAREFOOT", true);
        this.f6401w = sharedPreferences.getBoolean("SHOES", false);
        this.f6355C = sharedPreferences.getInt("SHOES_NO", 0);
        this.f6402x = sharedPreferences.getBoolean("BICYCLE", false);
        this.f6356D = sharedPreferences.getInt("BICYCLE_NO", 0);
        this.f6403y = sharedPreferences.getBoolean("CAR", false);
        this.f6357E = sharedPreferences.getInt("CAR_NO", 0);
        this.f6404z = sharedPreferences.getBoolean("TRUCK", false);
        this.f6358F = sharedPreferences.getInt("TRUCK_NO", 0);
        this.f6353A = sharedPreferences.getBoolean("TOWNCAR", false);
        this.f6359G = sharedPreferences.getInt("TOWNCAR_NO", 0);
        this.f6354B = sharedPreferences.getBoolean("HELICOPTER", false);
        this.f6360H = sharedPreferences.getInt("HELICOPTER_NO", 0);
        this.f6361I = sharedPreferences.getBoolean("KNIFE", false);
        this.f6367O = sharedPreferences.getInt("KNIFE_NO", 0);
        this.f6362J = sharedPreferences.getBoolean("GUN", false);
        this.f6368P = sharedPreferences.getInt("GUN_NO", 0);
        this.f6363K = sharedPreferences.getBoolean("SHOTGUN", false);
        this.f6369Q = sharedPreferences.getInt("SHOTGUN_NO", 0);
        this.f6364L = sharedPreferences.getBoolean("RIFLE", false);
        this.f6370R = sharedPreferences.getInt("RIFLE_NO", 0);
        this.f6365M = sharedPreferences.getBoolean("VEST", false);
        this.f6371S = sharedPreferences.getInt("VEST_NO", 0);
        this.f6366N = sharedPreferences.getBoolean("EXPLOSIVES", false);
        this.f6372T = sharedPreferences.getInt("EXPLOSIVES_NO", 0);
        this.f6373U = sharedPreferences.getBoolean("MATH", false);
        this.f6374V = sharedPreferences.getBoolean("SCHOOL", false);
        this.f6375W = sharedPreferences.getBoolean("MASONRY", false);
        this.f6376X = sharedPreferences.getBoolean("COLLEGE", false);
        this.f6377Y = sharedPreferences.getBoolean("UNIVERSITY", false);
        this.f6378Z = sharedPreferences.getBoolean("NOVICE", false);
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

    public void m9856c() {
        this.aK++;
        if (this.f6384f == 0) {
            this.f6385g = 31;
        } else if (this.f6384f >= 100 && this.f6385g > 1) {
            this.f6385g--;
        } else if (this.f6384f >= 100 && this.f6385g <= 1) {
            this.f6385g = 30;
            this.f6384f += this.f6384f / 100;
        }
        if (this.f6390l && this.f6395q >= 1) {
            this.f6395q--;
        }
        if (this.f6390l && this.f6395q == 0) {
            this.f6390l = false;
            this.f6395q = 0;
        }
        if (this.f6391m && this.f6396r >= 1) {
            this.f6396r--;
        }
        if (this.f6391m && this.f6396r == 0) {
            this.f6391m = false;
            this.f6396r = 0;
        }
    }

    public void m9857d() {
        if (this.aJ) {
            this.bT = (AudioManager) getSystemService("audio");
            this.bX = ((float) this.bT.getStreamVolume(3)) / ((float) this.bT.getStreamMaxVolume(3));
            this.bU = new SoundPool(10, 3, 0);
            this.bU.setOnLoadCompleteListener(new C19834(this));
            this.bW = this.bU.load(this, R.raw.dead, 1);
            this.bV = this.bU.load(this, R.raw.click, 1);
            return;
        }
        Log.e("JobActivity", "Sound Not Loaded");
        this.bY = false;
    }

    public void m9858e() {
        try {
            this.bU.play(this.bV, this.bX, this.bX, 1, 0, 1.0f);
        } catch (Exception e) {
            Log.e("JobActivity", "Error Playing Sound");
        }
    }

    public void m9859f() {
        try {
            this.bU.play(this.bW, this.bX, this.bX, 1, 0, 1.0f);
        } catch (Exception e) {
            Log.e("JobActivity", "Error Playing Sound");
        }
    }

    public void m9860g() {
        this.bZ = new C0486e(this);
        this.bZ.m2147a(getString(R.string.interstitial_ad_unit_id));
        this.bZ.m2146a(new C0472a().m2094a());
    }

    public void goBack(View view) {
        m9858e();
        finish();
    }

    public void m9861h() {
        if (this.bZ == null || !this.bZ.m2148a()) {
            Log.e("JobActivity", "Ad Not Ready.");
        } else {
            this.bZ.m2149b();
        }
    }

    public void m9862i() {
        new Handler().postDelayed(new C19845(this), 5000);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.e("JobActivity", "onCreate");
        setContentView(R.layout.activity_job);
        this.aS = Typeface.createFromAsset(getAssets(), "fonts/caviar_dreams.ttf");
        this.aT = Typeface.createFromAsset(getAssets(), "fonts/caviar_dreams_bold.ttf");
        this.bP = Toast.makeText(this, "", 1);
        this.bQ = Toast.makeText(this, "", 1);
        this.bR = Toast.makeText(this, "", 1);
        this.bS = Toast.makeText(this, "", 1);
        this.aU = (AdView) findViewById(R.id.adView);
        this.aU.setAdListener(new C19791(this));
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
        this.aX.setOnItemClickListener(new C19802(this));
    }

    public void onDestroy() {
        super.onDestroy();
        Log.e("JobActivity", "onDestroy");
        if (this.aU != null) {
            this.aU.m2047a();
        }
    }

    protected void onPause() {
        boolean z = true;
        super.onPause();
        Log.e("JobActivity", "onPause");
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
        this.am = this.aK >= 2000;
        this.ap = this.f6383e >= 1000;
        this.ar = this.f6383e >= 10000;
        this.as = this.f6383e >= 100000;
        this.au = this.f6383e >= 1000000;
        if (this.f6383e < 10000000) {
            z = false;
        }
        this.av = z;
        m9853a();
    }

    public void onResume() {
        super.onResume();
        Log.e("JobActivity", "onResume");
        if (this.aU != null) {
            this.aU.m2050c();
        }
        m9855b();
        m9857d();
        m9860g();
        m9847a(this.f6387i, this.f6388j);
        m9850j();
        m9851k();
        this.bc.setText("$" + String.format("%,d", new Object[]{Integer.valueOf(this.f6383e)}).replace(',', ' '));
        this.be.setText("$" + String.format("%,d", new Object[]{Integer.valueOf(this.f6384f)}).replace(',', ' '));
    }
}
