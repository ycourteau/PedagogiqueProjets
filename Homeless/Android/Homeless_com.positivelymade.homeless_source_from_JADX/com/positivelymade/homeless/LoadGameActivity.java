package com.positivelymade.homeless;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.common.C1241e;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1180c;
import com.google.android.gms.common.api.C1180c.C0650b;
import com.google.android.gms.common.api.C1180c.C0651c;
import com.google.android.gms.common.api.C1180c.C1176a;
import com.google.android.gms.drive.C1631a;
import com.google.android.gms.games.C1776b;
import com.google.android.gms.games.snapshot.C1823g.C1821c;
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.plus.C1889d;
import com.google.android.gms.plus.p043a.p044a.C1886a;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Map.Entry;
import java.util.Random;

public class LoadGameActivity extends Activity implements C0650b, C0651c {
    public boolean f6426A;
    public boolean f6427B;
    public boolean f6428C;
    public boolean f6429D;
    public boolean f6430E;
    public boolean f6431F;
    public boolean f6432G;
    public boolean f6433H;
    public boolean f6434I;
    public boolean f6435J;
    public boolean f6436K;
    public boolean f6437L;
    public boolean f6438M;
    public int f6439N;
    public int f6440O;
    public boolean f6441P;
    public boolean f6442Q;
    public boolean f6443R;
    public boolean f6444S;
    public boolean f6445T;
    public boolean f6446U;
    public boolean f6447V;
    public boolean f6448W;
    public boolean f6449X;
    public boolean f6450Y;
    public boolean f6451Z;
    public Typeface f6452a;
    public int aA;
    public int aB;
    public int aC;
    public int aD;
    public int aE;
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
    public boolean aS;
    public boolean aT;
    public boolean aU;
    public boolean aV;
    public String aW = "saveHomeless";
    C2090f aX;
    public ProgressDialog aY;
    public Toast aZ;
    public boolean aa;
    public int ab;
    public int ac;
    public int ad;
    public int ae;
    public int af;
    public boolean ag;
    public boolean ah;
    public boolean ai;
    public boolean aj;
    public boolean ak;
    public boolean al;
    public boolean am;
    public int an;
    public int ao;
    public int ap;
    public int aq;
    public int ar;
    public int as;
    public boolean at;
    public boolean au;
    public boolean av;
    public boolean aw;
    public boolean ax;
    public boolean ay;
    public int az;
    public Typeface f6453b;
    public Toast ba;
    public Toast bb;
    public Toast bc;
    private C1180c bd;
    private boolean be;
    public String f6454c;
    public String f6455d;
    public String f6456e;
    public String f6457f;
    public int f6458g;
    public int f6459h;
    public int f6460i;
    public int f6461j;
    public int f6462k;
    public int f6463l;
    public int f6464m;
    public boolean f6465n;
    public boolean f6466o;
    public boolean f6467p;
    public boolean f6468q;
    public boolean f6469r;
    public boolean f6470s;
    public boolean f6471t;
    public boolean f6472u;
    public boolean f6473v;
    public boolean f6474w;
    public boolean f6475x;
    public boolean f6476y;
    public boolean f6477z;

    class C19871 extends Thread {
        final /* synthetic */ LoadGameActivity f6420a;

        C19871(LoadGameActivity loadGameActivity) {
            this.f6420a = loadGameActivity;
        }

        public void run() {
            try {
                Thread.sleep(2500);
                this.f6420a.m9877g();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    class C19882 implements OnCancelListener {
        final /* synthetic */ LoadGameActivity f6421a;

        C19882(LoadGameActivity loadGameActivity) {
            this.f6421a = loadGameActivity;
        }

        public void onCancel(DialogInterface dialogInterface) {
            this.f6421a.finish();
        }
    }

    class C19893 extends AsyncTask<Void, Void, Integer> {
        final /* synthetic */ LoadGameActivity f6422a;

        C19893(LoadGameActivity loadGameActivity) {
            this.f6422a = loadGameActivity;
        }

        protected Integer m9871a(Void... voidArr) {
            C1821c c1821c = (C1821c) C1776b.f5532s.mo1263a(this.f6422a.bd, this.f6422a.aW, true).mo563a();
            if (c1821c.mo558a().m5971e()) {
                Snapshot c = c1821c.mo1257c();
                try {
                    this.f6422a.aX = new C2090f(c.mo1603b().mo1601d());
                } catch (IOException e) {
                    Log.e("LoadGameActivity", "Error while reading Snapshot." + e);
                }
            } else {
                Log.e("LoadGameActivity", "Error while loading: " + c1821c.mo558a().m5972f());
            }
            return Integer.valueOf(c1821c.mo558a().m5972f());
        }

        protected void m9872a(Integer num) {
            Log.e("LoadGameActivity", "Finished Loading");
            this.f6422a.m9878h();
            this.f6422a.m9887e();
            this.f6422a.m9881a(this.f6422a.bc, this.f6422a.getResources().getString(R.string.finish_load), R.drawable.notice);
            this.f6422a.finish();
        }

        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return m9871a((Void[]) objArr);
        }

        protected /* synthetic */ void onPostExecute(Object obj) {
            m9872a((Integer) obj);
        }
    }

    class C19915 implements Runnable {
        final /* synthetic */ LoadGameActivity f6425a;

        C19915(LoadGameActivity loadGameActivity) {
            this.f6425a = loadGameActivity;
        }

        public void run() {
            if (this.f6425a.aY != null && this.f6425a.aY.isShowing()) {
                this.f6425a.aY.dismiss();
            }
        }
    }

    private boolean m9876f() {
        int a = C1241e.m6271a((Context) this);
        if (a == 0) {
            return true;
        }
        if (C1241e.m6285b(a)) {
            Dialog a2 = C1241e.m6272a(a, (Activity) this, 1000);
            a2.setOnCancelListener(new C19882(this));
            a2.show();
        } else {
            m9881a(this.bb, getResources().getString(R.string.google_play_services), R.drawable.notice);
            finish();
        }
        return false;
    }

    private void m9877g() {
        startActivityForResult(C1776b.f5532s.mo1260a(this.bd, "Saved Games", false, true, 3), 9009);
    }

    private void m9878h() {
        this.f6456e = this.aX.m10157b("CODES");
        this.f6457f = this.aX.m10157b("DATES");
        this.f6458g = Integer.parseInt(this.aX.m10157b("MONEY"));
        this.f6459h = Integer.parseInt(this.aX.m10157b("CASH"));
        this.f6460i = Integer.parseInt(this.aX.m10157b("BANK"));
        this.f6461j = Integer.parseInt(this.aX.m10157b("BANK_DAYS"));
        this.f6462k = Integer.parseInt(this.aX.m10157b("AGE"));
        this.f6463l = Integer.parseInt(this.aX.m10157b("HUNGER"));
        this.f6464m = Integer.parseInt(this.aX.m10157b("HEALTH"));
        this.f6466o = Boolean.parseBoolean(this.aX.m10157b("VOLUME"));
        this.f6439N = Integer.parseInt(this.aX.m10157b("A2C"));
        this.f6440O = Integer.parseInt(this.aX.m10157b("A3C"));
        this.f6467p = Boolean.parseBoolean(this.aX.m10157b("A1"));
        this.f6468q = Boolean.parseBoolean(this.aX.m10157b("A2"));
        this.f6469r = Boolean.parseBoolean(this.aX.m10157b("A3"));
        this.f6470s = Boolean.parseBoolean(this.aX.m10157b("A4"));
        this.f6471t = Boolean.parseBoolean(this.aX.m10157b("A5"));
        this.f6472u = Boolean.parseBoolean(this.aX.m10157b("A6"));
        this.f6473v = Boolean.parseBoolean(this.aX.m10157b("A7"));
        this.f6474w = Boolean.parseBoolean(this.aX.m10157b("A8"));
        this.f6475x = Boolean.parseBoolean(this.aX.m10157b("A9"));
        this.f6476y = Boolean.parseBoolean(this.aX.m10157b("A10"));
        this.f6477z = Boolean.parseBoolean(this.aX.m10157b("A11"));
        this.f6426A = Boolean.parseBoolean(this.aX.m10157b("A12"));
        this.f6427B = Boolean.parseBoolean(this.aX.m10157b("A1U"));
        this.f6428C = Boolean.parseBoolean(this.aX.m10157b("A2U"));
        this.f6429D = Boolean.parseBoolean(this.aX.m10157b("A3U"));
        this.f6430E = Boolean.parseBoolean(this.aX.m10157b("A4U"));
        this.f6431F = Boolean.parseBoolean(this.aX.m10157b("A5U"));
        this.f6432G = Boolean.parseBoolean(this.aX.m10157b("A6U"));
        this.f6433H = Boolean.parseBoolean(this.aX.m10157b("A7U"));
        this.f6434I = Boolean.parseBoolean(this.aX.m10157b("A8U"));
        this.f6435J = Boolean.parseBoolean(this.aX.m10157b("A9U"));
        this.f6436K = Boolean.parseBoolean(this.aX.m10157b("A10U"));
        this.f6437L = Boolean.parseBoolean(this.aX.m10157b("A11U"));
        this.f6438M = Boolean.parseBoolean(this.aX.m10157b("A12U"));
        this.f6441P = Boolean.parseBoolean(this.aX.m10157b("A12L"));
        this.f6442Q = Boolean.parseBoolean(this.aX.m10157b("A12T"));
        this.f6443R = Boolean.parseBoolean(this.aX.m10157b("A12W"));
        this.f6444S = Boolean.parseBoolean(this.aX.m10157b("A12E"));
        this.f6445T = Boolean.parseBoolean(this.aX.m10157b("A12C"));
        this.f6446U = Boolean.parseBoolean(this.aX.m10157b("A12S"));
        this.f6447V = Boolean.parseBoolean(this.aX.m10157b("BOX"));
        this.f6448W = Boolean.parseBoolean(this.aX.m10157b("BASEMENT"));
        this.ab = Integer.parseInt(this.aX.m10157b("BASEMENT_DAYS"));
        this.f6449X = Boolean.parseBoolean(this.aX.m10157b("APARTMENT"));
        this.ac = Integer.parseInt(this.aX.m10157b("APARTMENT_DAYS"));
        this.f6450Y = Boolean.parseBoolean(this.aX.m10157b("HOUSE"));
        this.ad = Integer.parseInt(this.aX.m10157b("HOUSE_NO"));
        this.f6451Z = Boolean.parseBoolean(this.aX.m10157b("CONDO"));
        this.ae = Integer.parseInt(this.aX.m10157b("CONDO_NO"));
        this.aa = Boolean.parseBoolean(this.aX.m10157b("MANSION"));
        this.af = Integer.parseInt(this.aX.m10157b("MANSION_NO"));
        this.ag = Boolean.parseBoolean(this.aX.m10157b("BAREFOOT"));
        this.ah = Boolean.parseBoolean(this.aX.m10157b("SHOES"));
        this.an = Integer.parseInt(this.aX.m10157b("SHOES_NO"));
        this.ai = Boolean.parseBoolean(this.aX.m10157b("BICYCLE"));
        this.ao = Integer.parseInt(this.aX.m10157b("BICYCLE_NO"));
        this.aj = Boolean.parseBoolean(this.aX.m10157b("CAR"));
        this.ap = Integer.parseInt(this.aX.m10157b("CAR_NO"));
        this.ak = Boolean.parseBoolean(this.aX.m10157b("TRUCK"));
        this.aq = Integer.parseInt(this.aX.m10157b("TRUCK_NO"));
        this.al = Boolean.parseBoolean(this.aX.m10157b("TOWNCAR"));
        this.ar = Integer.parseInt(this.aX.m10157b("TOWNCAR_NO"));
        this.am = Boolean.parseBoolean(this.aX.m10157b("HELICOPTER"));
        this.as = Integer.parseInt(this.aX.m10157b("HELICOPTER_NO"));
        this.at = Boolean.parseBoolean(this.aX.m10157b("KNIFE"));
        this.az = Integer.parseInt(this.aX.m10157b("KNIFE_NO"));
        this.au = Boolean.parseBoolean(this.aX.m10157b("GUN"));
        this.aA = Integer.parseInt(this.aX.m10157b("GUN_NO"));
        this.av = Boolean.parseBoolean(this.aX.m10157b("SHOTGUN"));
        this.aB = Integer.parseInt(this.aX.m10157b("SHOTGUN_NO"));
        this.aw = Boolean.parseBoolean(this.aX.m10157b("RIFLE"));
        this.aC = Integer.parseInt(this.aX.m10157b("RIFLE_NO"));
        this.ax = Boolean.parseBoolean(this.aX.m10157b("VEST"));
        this.aD = Integer.parseInt(this.aX.m10157b("VEST_NO"));
        this.ay = Boolean.parseBoolean(this.aX.m10157b("EXPLOSIVES"));
        this.aE = Integer.parseInt(this.aX.m10157b("EXPLOSIVES_NO"));
        this.aF = Boolean.parseBoolean(this.aX.m10157b("MATH"));
        this.aG = Boolean.parseBoolean(this.aX.m10157b("SCHOOL"));
        this.aH = Boolean.parseBoolean(this.aX.m10157b("MASONRY"));
        this.aI = Boolean.parseBoolean(this.aX.m10157b("COLLEGE"));
        this.aJ = Boolean.parseBoolean(this.aX.m10157b("UNIVERSITY"));
        this.aK = Boolean.parseBoolean(this.aX.m10157b("NOVICE"));
        this.aL = Boolean.parseBoolean(this.aX.m10157b("MOBSTER"));
        this.aM = Boolean.parseBoolean(this.aX.m10157b("HITMAN"));
        this.aN = Boolean.parseBoolean(this.aX.m10157b("PICKPOCKET"));
        this.aO = Boolean.parseBoolean(this.aX.m10157b("BURGLAR"));
        this.aP = Boolean.parseBoolean(this.aX.m10157b("MASTER"));
        this.aQ = Boolean.parseBoolean(this.aX.m10157b("DRIVING"));
        this.aR = Boolean.parseBoolean(this.aX.m10157b("LIQUOR"));
        this.aS = Boolean.parseBoolean(this.aX.m10157b("BUSINESS"));
        this.aT = Boolean.parseBoolean(this.aX.m10157b("LAWS"));
        this.aU = Boolean.parseBoolean(this.aX.m10157b("ACCOUNTING"));
        this.aV = Boolean.parseBoolean(this.aX.m10157b("MANAGEMENT"));
        m9879a();
    }

    public void m9879a() {
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences(getString(R.string.preference_file_key), 0);
        Editor edit = sharedPreferences.edit();
        edit.putBoolean("GOOGLE", this.f6465n);
        edit.putString("CODES", this.f6456e);
        edit.putString("DATES", this.f6457f);
        edit.putString("NAME", this.f6454c);
        edit.putString("IMAGE", this.f6455d);
        edit.putInt("MONEY", this.f6458g);
        edit.putInt("CASH", this.f6459h);
        edit.putInt("BANK", this.f6460i);
        edit.putInt("BANK_DAYS", this.f6461j);
        edit.putInt("AGE", this.f6462k);
        edit.putInt("HUNGER", this.f6463l);
        edit.putInt("HEALTH", this.f6464m);
        edit.putBoolean("VOLUME", this.f6466o);
        edit.putInt("A2C", this.f6439N);
        edit.putInt("A3C", this.f6440O);
        edit.putBoolean("A1", this.f6467p);
        edit.putBoolean("A2", this.f6468q);
        edit.putBoolean("A3", this.f6469r);
        edit.putBoolean("A4", this.f6470s);
        edit.putBoolean("A5", this.f6471t);
        edit.putBoolean("A6", this.f6472u);
        edit.putBoolean("A7", this.f6473v);
        edit.putBoolean("A8", this.f6474w);
        edit.putBoolean("A9", this.f6475x);
        edit.putBoolean("A10", this.f6476y);
        edit.putBoolean("A11", this.f6477z);
        edit.putBoolean("A12", this.f6426A);
        edit.putBoolean("A1U", this.f6427B);
        edit.putBoolean("A2U", this.f6428C);
        edit.putBoolean("A3U", this.f6429D);
        edit.putBoolean("A4U", this.f6430E);
        edit.putBoolean("A5U", this.f6431F);
        edit.putBoolean("A6U", this.f6432G);
        edit.putBoolean("A7U", this.f6433H);
        edit.putBoolean("A8U", this.f6434I);
        edit.putBoolean("A9U", this.f6435J);
        edit.putBoolean("A10U", this.f6436K);
        edit.putBoolean("A11U", this.f6437L);
        edit.putBoolean("A12U", this.f6438M);
        edit.putBoolean("A12L", this.f6441P);
        edit.putBoolean("A12T", this.f6442Q);
        edit.putBoolean("A12W", this.f6443R);
        edit.putBoolean("A12E", this.f6444S);
        edit.putBoolean("A12C", this.f6445T);
        edit.putBoolean("A12S", this.f6446U);
        edit.putBoolean("BOX", this.f6447V);
        edit.putBoolean("BASEMENT", this.f6448W);
        edit.putInt("BASEMENT_DAYS", this.ab);
        edit.putBoolean("APARTMENT", this.f6449X);
        edit.putInt("APARTMENT_DAYS", this.ac);
        edit.putBoolean("HOUSE", this.f6450Y);
        edit.putInt("HOUSE_NO", this.ad);
        edit.putBoolean("CONDO", this.f6451Z);
        edit.putInt("CONDO_NO", this.ae);
        edit.putBoolean("MANSION", this.aa);
        edit.putInt("MANSION_NO", this.af);
        edit.putBoolean("BAREFOOT", this.ag);
        edit.putBoolean("SHOES", this.ah);
        edit.putInt("SHOES_NO", this.an);
        edit.putBoolean("BICYCLE", this.ai);
        edit.putInt("BICYCLE_NO", this.ao);
        edit.putBoolean("CAR", this.aj);
        edit.putInt("CAR_NO", this.ap);
        edit.putBoolean("TRUCK", this.ak);
        edit.putInt("TRUCK_NO", this.aq);
        edit.putBoolean("TOWNCAR", this.al);
        edit.putInt("TOWNCAR_NO", this.ar);
        edit.putBoolean("HELICOPTER", this.am);
        edit.putInt("HELICOPTER_NO", this.as);
        edit.putBoolean("KNIFE", this.at);
        edit.putInt("KNIFE_NO", this.az);
        edit.putBoolean("GUN", this.au);
        edit.putInt("GUN_NO", this.aA);
        edit.putBoolean("SHOTGUN", this.av);
        edit.putInt("SHOTGUN_NO", this.aB);
        edit.putBoolean("RIFLE", this.aw);
        edit.putInt("RIFLE_NO", this.aC);
        edit.putBoolean("VEST", this.ax);
        edit.putInt("VEST_NO", this.aD);
        edit.putBoolean("EXPLOSIVES", this.ay);
        edit.putInt("EXPLOSIVES_NO", this.aE);
        edit.putBoolean("MATH", this.aF);
        edit.putBoolean("SCHOOL", this.aG);
        edit.putBoolean("MASONRY", this.aH);
        edit.putBoolean("COLLEGE", this.aI);
        edit.putBoolean("UNIVERSITY", this.aJ);
        edit.putBoolean("NOVICE", this.aK);
        edit.putBoolean("MOBSTER", this.aL);
        edit.putBoolean("HITMAN", this.aM);
        edit.putBoolean("PICKPOCKET", this.aN);
        edit.putBoolean("BURGLAR", this.aO);
        edit.putBoolean("MASTER", this.aP);
        edit.putBoolean("DRIVING", this.aQ);
        edit.putBoolean("LIQUOR", this.aR);
        edit.putBoolean("BUSINESS", this.aS);
        edit.putBoolean("LAWS", this.aT);
        edit.putBoolean("ACCOUNTING", this.aU);
        edit.putBoolean("MANAGEMENT", this.aV);
        edit.apply();
        for (Entry entry : sharedPreferences.getAll().entrySet()) {
            Log.e("LoadGameActivity", "SAVE " + ((String) entry.getKey()) + ": " + entry.getValue().toString());
        }
    }

    public void mo503a(Bundle bundle) {
        Log.e("LoadGameActivity", "onConnected(): mGoogleApiClient");
        if (C1889d.f5748g.mo832a(this.bd) != null) {
            C1886a a = C1889d.f5748g.mo832a(this.bd);
            this.f6454c = a.mo1654e();
            this.f6455d = a.mo1655f().mo1653e();
        }
        Thread c19871 = new C19871(this);
        if (this.f6465n) {
            m9877g();
            return;
        }
        this.f6465n = true;
        c19871.start();
    }

    public void m9881a(Toast toast, String str, int i) {
        View inflate = getLayoutInflater().inflate(R.layout.toast_message, (ViewGroup) findViewById(R.id.toast_layout_root));
        ((ImageView) inflate.findViewById(R.id.toast_image)).setImageResource(i);
        ((TextView) inflate.findViewById(R.id.toast_text)).setText(str);
        if (toast.getView().getWindowVisibility() != 0) {
            Log.e("LoadGameActivity", "Exists");
            toast.setDuration(1);
        }
        toast.setGravity(16, 0, 0);
        toast.setView(inflate);
        toast.show();
    }

    public void mo504a(ConnectionResult connectionResult) {
        Log.e("LoadGameActivity", "onConnectionFailed(): " + connectionResult.toString());
        if (!this.be && connectionResult.m5960a()) {
            try {
                this.be = true;
                startIntentSenderForResult(connectionResult.m5963d().getIntentSender(), 9001, null, 0, 0, 0);
            } catch (SendIntentException e) {
                this.be = false;
                this.bd.mo883b();
            }
        }
    }

    public void m9883a(final String str) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ LoadGameActivity f6424b;

            public void run() {
                this.f6424b.aY = new ProgressDialog(this.f6424b, R.style.NewDialog);
                this.f6424b.aY.setCancelable(false);
                this.f6424b.aY.setProgressStyle(16973854);
                this.f6424b.aY.setMessage(str);
                this.f6424b.aY.show();
            }
        });
    }

    public void a_(int i) {
        Log.e("LoadGameActivity", "onConnectionSuspended(): mGoogleApiClient attempting to connect");
        this.bd.mo883b();
    }

    public void m9884b() {
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences(getString(R.string.preference_file_key), 0);
        this.f6465n = sharedPreferences.getBoolean("GOOGLE", false);
        this.f6456e = sharedPreferences.getString("CODES", "");
        this.f6457f = sharedPreferences.getString("DATES", "");
        this.f6454c = sharedPreferences.getString("NAME", "Unknown");
        this.f6455d = sharedPreferences.getString("IMAGE", "");
        this.f6458g = sharedPreferences.getInt("MONEY", 0);
        this.f6459h = sharedPreferences.getInt("CASH", 0);
        this.f6460i = sharedPreferences.getInt("BANK", 0);
        this.f6461j = sharedPreferences.getInt("BANK_DAYS", 31);
        this.f6462k = sharedPreferences.getInt("AGE", 0);
        this.f6463l = sharedPreferences.getInt("HUNGER", 80);
        this.f6464m = sharedPreferences.getInt("HEALTH", 80);
        this.f6466o = sharedPreferences.getBoolean("VOLUME", true);
        this.f6439N = sharedPreferences.getInt("A2C", 0);
        this.f6440O = sharedPreferences.getInt("A3C", 0);
        this.f6467p = sharedPreferences.getBoolean("A1", false);
        this.f6468q = sharedPreferences.getBoolean("A2", false);
        this.f6469r = sharedPreferences.getBoolean("A3", false);
        this.f6470s = sharedPreferences.getBoolean("A4", false);
        this.f6471t = sharedPreferences.getBoolean("A5", false);
        this.f6472u = sharedPreferences.getBoolean("A6", false);
        this.f6473v = sharedPreferences.getBoolean("A7", false);
        this.f6474w = sharedPreferences.getBoolean("A8", false);
        this.f6475x = sharedPreferences.getBoolean("A9", false);
        this.f6476y = sharedPreferences.getBoolean("A10", false);
        this.f6477z = sharedPreferences.getBoolean("A11", false);
        this.f6426A = sharedPreferences.getBoolean("A12", false);
        this.f6427B = sharedPreferences.getBoolean("A1U", false);
        this.f6428C = sharedPreferences.getBoolean("A2U", false);
        this.f6429D = sharedPreferences.getBoolean("A3U", false);
        this.f6430E = sharedPreferences.getBoolean("A4U", false);
        this.f6431F = sharedPreferences.getBoolean("A5U", false);
        this.f6432G = sharedPreferences.getBoolean("A6U", false);
        this.f6433H = sharedPreferences.getBoolean("A7U", false);
        this.f6434I = sharedPreferences.getBoolean("A8U", false);
        this.f6435J = sharedPreferences.getBoolean("A9U", false);
        this.f6436K = sharedPreferences.getBoolean("A10U", false);
        this.f6437L = sharedPreferences.getBoolean("A11U", false);
        this.f6438M = sharedPreferences.getBoolean("A12U", false);
        this.f6441P = sharedPreferences.getBoolean("A12L", false);
        this.f6442Q = sharedPreferences.getBoolean("A12T", false);
        this.f6443R = sharedPreferences.getBoolean("A12W", false);
        this.f6444S = sharedPreferences.getBoolean("A12E", false);
        this.f6445T = sharedPreferences.getBoolean("A12C", false);
        this.f6446U = sharedPreferences.getBoolean("A12S", false);
        this.f6447V = sharedPreferences.getBoolean("BOX", true);
        this.f6448W = sharedPreferences.getBoolean("BASEMENT", false);
        this.ab = sharedPreferences.getInt("BASEMENT_DAYS", 0);
        this.f6449X = sharedPreferences.getBoolean("APARTMENT", false);
        this.ac = sharedPreferences.getInt("APARTMENT_DAYS", 0);
        this.f6450Y = sharedPreferences.getBoolean("HOUSE", false);
        this.ad = sharedPreferences.getInt("HOUSE_NO", 0);
        this.f6451Z = sharedPreferences.getBoolean("CONDO", false);
        this.ae = sharedPreferences.getInt("CONDO_NO", 0);
        this.aa = sharedPreferences.getBoolean("MANSION", false);
        this.af = sharedPreferences.getInt("MANSION_NO", 0);
        this.ag = sharedPreferences.getBoolean("BAREFOOT", true);
        this.ah = sharedPreferences.getBoolean("SHOES", false);
        this.an = sharedPreferences.getInt("SHOES_NO", 0);
        this.ai = sharedPreferences.getBoolean("BICYCLE", false);
        this.ao = sharedPreferences.getInt("BICYCLE_NO", 0);
        this.aj = sharedPreferences.getBoolean("CAR", false);
        this.ap = sharedPreferences.getInt("CAR_NO", 0);
        this.ak = sharedPreferences.getBoolean("TRUCK", false);
        this.aq = sharedPreferences.getInt("TRUCK_NO", 0);
        this.al = sharedPreferences.getBoolean("TOWNCAR", false);
        this.ar = sharedPreferences.getInt("TOWNCAR_NO", 0);
        this.am = sharedPreferences.getBoolean("HELICOPTER", false);
        this.as = sharedPreferences.getInt("HELICOPTER_NO", 0);
        this.at = sharedPreferences.getBoolean("KNIFE", false);
        this.az = sharedPreferences.getInt("KNIFE_NO", 0);
        this.au = sharedPreferences.getBoolean("GUN", false);
        this.aA = sharedPreferences.getInt("GUN_NO", 0);
        this.av = sharedPreferences.getBoolean("SHOTGUN", false);
        this.aB = sharedPreferences.getInt("SHOTGUN_NO", 0);
        this.aw = sharedPreferences.getBoolean("RIFLE", false);
        this.aC = sharedPreferences.getInt("RIFLE_NO", 0);
        this.ax = sharedPreferences.getBoolean("VEST", false);
        this.aD = sharedPreferences.getInt("VEST_NO", 0);
        this.ay = sharedPreferences.getBoolean("EXPLOSIVES", false);
        this.aE = sharedPreferences.getInt("EXPLOSIVES_NO", 0);
        this.aF = sharedPreferences.getBoolean("MATH", false);
        this.aG = sharedPreferences.getBoolean("SCHOOL", false);
        this.aH = sharedPreferences.getBoolean("MASONRY", false);
        this.aI = sharedPreferences.getBoolean("COLLEGE", false);
        this.aJ = sharedPreferences.getBoolean("UNIVERSITY", false);
        this.aK = sharedPreferences.getBoolean("NOVICE", false);
        this.aL = sharedPreferences.getBoolean("MOBSTER", false);
        this.aM = sharedPreferences.getBoolean("HITMAN", false);
        this.aN = sharedPreferences.getBoolean("PICKPOCKET", false);
        this.aO = sharedPreferences.getBoolean("BURGLAR", false);
        this.aP = sharedPreferences.getBoolean("MASTER", false);
        this.aQ = sharedPreferences.getBoolean("DRIVING", false);
        this.aR = sharedPreferences.getBoolean("LIQUOR", false);
        this.aS = sharedPreferences.getBoolean("BUSINESS", false);
        this.aT = sharedPreferences.getBoolean("LAWS", false);
        this.aU = sharedPreferences.getBoolean("ACCOUNTING", false);
        this.aV = sharedPreferences.getBoolean("MANAGEMENT", false);
        for (Entry entry : sharedPreferences.getAll().entrySet()) {
            Log.e("LoadGameActivity", "RESTART " + ((String) entry.getKey()) + ": " + entry.getValue().toString());
        }
    }

    public boolean m9885c() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    public void m9886d() {
        Log.e("LoadGameActivity", "Started Loading");
        m9883a(getResources().getString(R.string.starting_load));
        new C19893(this).execute(new Void[0]);
    }

    public void m9887e() {
        runOnUiThread(new C19915(this));
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 9001) {
            Log.e("LoadGameActivity", "RC_SIGN_IN - " + i2);
            this.be = false;
            if (i2 == -1) {
                Log.e("LoadGameActivity", "RC_SIGN_IN - RESULT_OK");
                if (!this.bd.mo888d()) {
                    this.bd.mo883b();
                }
            } else if (i2 == 0) {
                Log.e("LoadGameActivity", "RC_SIGN_IN - RESULT_CANCELED");
                finish();
            } else if (i2 == 10002) {
                Log.e("LoadGameActivity", "RC_SIGN_IN - RESULT_SIGN_IN_FAILED");
                m9881a(this.ba, getResources().getString(R.string.google_play_problem), R.drawable.notice);
                if (!this.bd.mo888d()) {
                    this.bd.mo883b();
                }
            }
        } else if (i == 9009) {
            Log.e("LoadGameActivity", "RC_SAVED_GAMES - " + i2);
            if (i2 == -1) {
                Log.e("LoadGameActivity", "RC_SAVED_GAMES - RESULT_OK");
                if (intent == null) {
                    return;
                }
                if (intent.hasExtra("com.google.android.gms.games.SNAPSHOT_METADATA")) {
                    this.aW = ((SnapshotMetadata) intent.getParcelableExtra("com.google.android.gms.games.SNAPSHOT_METADATA")).mo1611g();
                    m9886d();
                    Log.e("LoadGameActivity", "RC_SAVED_GAMES - EXTRA_SNAPSHOT_METADATA");
                } else if (intent.hasExtra("com.google.android.gms.games.SNAPSHOT_NEW")) {
                    this.aW = "snapshotTemp-" + new BigInteger(281, new Random()).toString(13);
                    Log.e("LoadGameActivity", "RC_SAVED_GAMES - EXTRA_SNAPSHOT_NEW");
                }
            } else if (i2 == 0) {
                Log.e("LoadGameActivity", "RC_SAVED_GAMES - RESULT_CANCELED");
                finish();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.e("LoadGameActivity", "onCreate");
        setContentView(R.layout.activity_leaderboard);
        this.f6452a = Typeface.createFromAsset(getAssets(), "fonts/caviar_dreams.ttf");
        this.f6453b = Typeface.createFromAsset(getAssets(), "fonts/caviar_dreams_bold.ttf");
        this.aZ = Toast.makeText(this, "", 1);
        this.ba = Toast.makeText(this, "", 1);
        this.bb = Toast.makeText(this, "", 1);
        this.bc = Toast.makeText(this, "", 1);
        this.bd = new C1176a(getApplicationContext()).m5993a((C0650b) this).m5994a((C0651c) this).m5992a(C1889d.f5744c).m5991a(C1889d.f5745d).m5992a(C1776b.f5516c).m5991a(C1776b.f5515b).m5992a(C1631a.f5051f).m5991a(C1631a.f5048c).m5990a(findViewById(16908290)).m5996b();
        this.aX = new C2090f();
    }

    public void onPause() {
        super.onPause();
        Log.e("LoadGameActivity", "onPause");
        m9879a();
    }

    public void onResume() {
        super.onResume();
        Log.e("LoadGameActivity", "onResume");
        m9884b();
        if (!m9876f()) {
            return;
        }
        if (m9885c()) {
            this.bd.mo883b();
            return;
        }
        this.f6465n = false;
        m9881a(this.aZ, getResources().getString(R.string.no_internet), R.drawable.notice);
        finish();
    }

    protected void onStop() {
        super.onStop();
        if (this.bd.mo888d()) {
            if (this.f6465n) {
                this.bd.mo887c();
            } else {
                C1889d.f5749h.mo831a(this.bd);
                this.bd.mo887c();
            }
        }
        m9879a();
    }
}
