package com.positivelymade.homeless;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnShowListener;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Typeface;
import android.media.AudioManager;
import android.media.SoundPool;
import android.media.SoundPool.OnLoadCompleteListener;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.ads.C0476c.C0472a;
import com.google.android.gms.ads.C0486e;
import com.google.android.gms.common.C1241e;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1180c;
import com.google.android.gms.common.api.C1180c.C0650b;
import com.google.android.gms.common.api.C1180c.C0651c;
import com.google.android.gms.common.api.C1180c.C1176a;
import com.google.android.gms.drive.C1631a;
import com.google.android.gms.games.C1776b;
import com.google.android.gms.plus.C1889d;
import com.google.android.gms.plus.p043a.p044a.C1886a;
import java.util.Map.Entry;

public class MainActivity extends Activity implements C0650b, C0651c {
    public boolean f6529A;
    public boolean f6530B;
    public boolean f6531C;
    public boolean f6532D;
    public boolean f6533E;
    public boolean f6534F;
    public boolean f6535G;
    public boolean f6536H;
    public boolean f6537I;
    public boolean f6538J;
    public boolean f6539K;
    public boolean f6540L;
    public boolean f6541M;
    public int f6542N;
    public int f6543O;
    public boolean f6544P;
    public boolean f6545Q;
    public boolean f6546R;
    public boolean f6547S;
    public boolean f6548T;
    public boolean f6549U;
    public boolean f6550V;
    public boolean f6551W;
    public boolean f6552X;
    public boolean f6553Y;
    public boolean f6554Z;
    public Typeface f6555a;
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
    public Button aW;
    public Button aX;
    public Button aY;
    public Button aZ;
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
    public Typeface f6556b;
    public Button ba;
    public Button bb;
    public Button bc;
    public C0486e bd;
    public AudioManager be;
    public SoundPool bf;
    public int bg;
    public float bh;
    public boolean bi;
    public boolean bj;
    public Toast bk;
    public Toast bl;
    public Toast bm;
    public ImageView bn;
    public ImageView bo;
    private C1180c bp;
    private boolean bq;
    public String f6557c;
    public String f6558d;
    public String f6559e;
    public int f6560f;
    public int f6561g;
    public int f6562h;
    public int f6563i;
    public int f6564j;
    public int f6565k;
    public int f6566l;
    public boolean f6567m;
    public boolean f6568n;
    public boolean f6569o;
    public boolean f6570p;
    public boolean f6571q;
    public boolean f6572r;
    public boolean f6573s;
    public boolean f6574t;
    public boolean f6575u;
    public boolean f6576v;
    public boolean f6577w;
    public boolean f6578x;
    public boolean f6579y;
    public boolean f6580z;

    class C19951 implements OnLoadCompleteListener {
        final /* synthetic */ MainActivity f6524a;

        C19951(MainActivity mainActivity) {
            this.f6524a = mainActivity;
        }

        public void onLoadComplete(SoundPool soundPool, int i, int i2) {
            Log.e("MainActivity", "Sound Loaded");
            this.f6524a.bi = true;
        }
    }

    class C19962 implements OnClickListener {
        final /* synthetic */ MainActivity f6525a;

        C19962(MainActivity mainActivity) {
            this.f6525a = mainActivity;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f6525a.f6568n = false;
            this.f6525a.bj = false;
            if (!this.f6525a.m9905i()) {
                return;
            }
            if (this.f6525a.m9916h()) {
                this.f6525a.bp.mo883b();
                return;
            }
            this.f6525a.m9908a(this.f6525a.bk, this.f6525a.getResources().getString(R.string.no_internet), R.drawable.notice);
            this.f6525a.f6567m = false;
        }
    }

    class C19973 implements OnClickListener {
        final /* synthetic */ MainActivity f6526a;

        C19973(MainActivity mainActivity) {
            this.f6526a = mainActivity;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f6526a.f6568n = false;
            this.f6526a.bj = false;
            dialogInterface.dismiss();
        }
    }

    class C19984 implements OnShowListener {
        final /* synthetic */ MainActivity f6527a;

        C19984(MainActivity mainActivity) {
            this.f6527a = mainActivity;
        }

        public void onShow(DialogInterface dialogInterface) {
            AlertDialog alertDialog = (AlertDialog) dialogInterface;
            alertDialog.getButton(-1).setTypeface(this.f6527a.f6556b);
            alertDialog.getButton(-2).setTypeface(this.f6527a.f6556b);
        }
    }

    class C19995 implements OnCancelListener {
        final /* synthetic */ MainActivity f6528a;

        C19995(MainActivity mainActivity) {
            this.f6528a = mainActivity;
        }

        public void onCancel(DialogInterface dialogInterface) {
            this.f6528a.finish();
        }
    }

    private boolean m9905i() {
        int a = C1241e.m6271a((Context) this);
        if (a == 0) {
            return true;
        }
        if (C1241e.m6285b(a)) {
            Dialog a2 = C1241e.m6272a(a, (Activity) this, 1000);
            a2.setOnCancelListener(new C19995(this));
            a2.show();
        } else {
            m9908a(this.bm, getResources().getString(R.string.google_play_services), R.drawable.notice);
            finish();
        }
        return false;
    }

    public void m9906a() {
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences(getString(R.string.preference_file_key), 0);
        Editor edit = sharedPreferences.edit();
        edit.putBoolean("GOOGLE", this.f6567m);
        edit.putString("CODES", this.f6559e);
        edit.putString("NAME", this.f6557c);
        edit.putString("IMAGE", this.f6558d);
        edit.putInt("MONEY", this.f6560f);
        edit.putInt("CASH", this.f6561g);
        edit.putInt("BANK", this.f6562h);
        edit.putInt("BANK_DAYS", this.f6563i);
        edit.putInt("AGE", this.f6564j);
        edit.putInt("HUNGER", this.f6565k);
        edit.putInt("HEALTH", this.f6566l);
        edit.putBoolean("VOLUME", this.f6569o);
        edit.putInt("A2C", this.f6542N);
        edit.putInt("A3C", this.f6543O);
        edit.putBoolean("A1", this.f6570p);
        edit.putBoolean("A2", this.f6571q);
        edit.putBoolean("A3", this.f6572r);
        edit.putBoolean("A4", this.f6573s);
        edit.putBoolean("A5", this.f6574t);
        edit.putBoolean("A6", this.f6575u);
        edit.putBoolean("A7", this.f6576v);
        edit.putBoolean("A8", this.f6577w);
        edit.putBoolean("A9", this.f6578x);
        edit.putBoolean("A10", this.f6579y);
        edit.putBoolean("A11", this.f6580z);
        edit.putBoolean("A12", this.f6529A);
        edit.putBoolean("A1U", this.f6530B);
        edit.putBoolean("A2U", this.f6531C);
        edit.putBoolean("A3U", this.f6532D);
        edit.putBoolean("A4U", this.f6533E);
        edit.putBoolean("A5U", this.f6534F);
        edit.putBoolean("A6U", this.f6535G);
        edit.putBoolean("A7U", this.f6536H);
        edit.putBoolean("A8U", this.f6537I);
        edit.putBoolean("A9U", this.f6538J);
        edit.putBoolean("A10U", this.f6539K);
        edit.putBoolean("A11U", this.f6540L);
        edit.putBoolean("A12U", this.f6541M);
        edit.putBoolean("A12L", this.f6544P);
        edit.putBoolean("A12T", this.f6545Q);
        edit.putBoolean("A12W", this.f6546R);
        edit.putBoolean("A12E", this.f6547S);
        edit.putBoolean("A12C", this.f6548T);
        edit.putBoolean("A12S", this.f6549U);
        edit.putBoolean("BOX", this.f6550V);
        edit.putBoolean("BASEMENT", this.f6551W);
        edit.putInt("BASEMENT_DAYS", this.ab);
        edit.putBoolean("APARTMENT", this.f6552X);
        edit.putInt("APARTMENT_DAYS", this.ac);
        edit.putBoolean("HOUSE", this.f6553Y);
        edit.putInt("HOUSE_NO", this.ad);
        edit.putBoolean("CONDO", this.f6554Z);
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
            Log.e("MainActivity", "SAVE " + ((String) entry.getKey()) + ": " + entry.getValue().toString());
        }
    }

    public void mo503a(Bundle bundle) {
        Log.e("MainActivity", "onConnected(): mGoogleApiClient");
        this.f6567m = true;
        if (C1889d.f5748g.mo832a(this.bp) != null) {
            C1886a a = C1889d.f5748g.mo832a(this.bp);
            this.f6557c = a.mo1654e();
            this.f6558d = a.mo1655f().mo1653e();
        }
        m9906a();
    }

    public void m9908a(Toast toast, String str, int i) {
        View inflate = getLayoutInflater().inflate(R.layout.toast_message, (ViewGroup) findViewById(R.id.toast_layout_root));
        ((ImageView) inflate.findViewById(R.id.toast_image)).setImageResource(i);
        ((TextView) inflate.findViewById(R.id.toast_text)).setText(str);
        if (toast.getView().getWindowVisibility() != 0) {
            Log.e("MainActivity", "Exists");
            toast.setDuration(1);
        }
        toast.setGravity(16, 0, 0);
        toast.setView(inflate);
        toast.show();
    }

    public void mo504a(ConnectionResult connectionResult) {
        Log.e("MainActivity", "onConnectionFailed(): " + connectionResult.toString());
        this.f6567m = false;
        if (!this.bq && connectionResult.m5960a()) {
            try {
                this.bq = true;
                startIntentSenderForResult(connectionResult.m5963d().getIntentSender(), 9001, null, 0, 0, 0);
            } catch (SendIntentException e) {
                this.bq = false;
                this.bp.mo883b();
            }
        }
    }

    public void a_(int i) {
        Log.e("MainActivity", "onConnectionSuspended(): mGoogleApiClient attempting to connect");
        this.bp.mo883b();
    }

    public void m9910b() {
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences(getString(R.string.preference_file_key), 0);
        this.f6567m = sharedPreferences.getBoolean("GOOGLE", false);
        this.f6559e = sharedPreferences.getString("CODES", "");
        this.f6557c = sharedPreferences.getString("NAME", "Unknown");
        this.f6558d = sharedPreferences.getString("IMAGE", "");
        this.f6560f = sharedPreferences.getInt("MONEY", 0);
        this.f6561g = sharedPreferences.getInt("CASH", 0);
        this.f6562h = sharedPreferences.getInt("BANK", 0);
        this.f6563i = sharedPreferences.getInt("BANK_DAYS", 31);
        this.f6564j = sharedPreferences.getInt("AGE", 0);
        this.f6565k = sharedPreferences.getInt("HUNGER", 80);
        this.f6566l = sharedPreferences.getInt("HEALTH", 80);
        this.f6569o = sharedPreferences.getBoolean("VOLUME", true);
        this.f6542N = sharedPreferences.getInt("A2C", 0);
        this.f6543O = sharedPreferences.getInt("A3C", 0);
        this.f6570p = sharedPreferences.getBoolean("A1", false);
        this.f6571q = sharedPreferences.getBoolean("A2", false);
        this.f6572r = sharedPreferences.getBoolean("A3", false);
        this.f6573s = sharedPreferences.getBoolean("A4", false);
        this.f6574t = sharedPreferences.getBoolean("A5", false);
        this.f6575u = sharedPreferences.getBoolean("A6", false);
        this.f6576v = sharedPreferences.getBoolean("A7", false);
        this.f6577w = sharedPreferences.getBoolean("A8", false);
        this.f6578x = sharedPreferences.getBoolean("A9", false);
        this.f6579y = sharedPreferences.getBoolean("A10", false);
        this.f6580z = sharedPreferences.getBoolean("A11", false);
        this.f6529A = sharedPreferences.getBoolean("A12", false);
        this.f6530B = sharedPreferences.getBoolean("A1U", false);
        this.f6531C = sharedPreferences.getBoolean("A2U", false);
        this.f6532D = sharedPreferences.getBoolean("A3U", false);
        this.f6533E = sharedPreferences.getBoolean("A4U", false);
        this.f6534F = sharedPreferences.getBoolean("A5U", false);
        this.f6535G = sharedPreferences.getBoolean("A6U", false);
        this.f6536H = sharedPreferences.getBoolean("A7U", false);
        this.f6537I = sharedPreferences.getBoolean("A8U", false);
        this.f6538J = sharedPreferences.getBoolean("A9U", false);
        this.f6539K = sharedPreferences.getBoolean("A10U", false);
        this.f6540L = sharedPreferences.getBoolean("A11U", false);
        this.f6541M = sharedPreferences.getBoolean("A12U", false);
        this.f6544P = sharedPreferences.getBoolean("A12L", false);
        this.f6545Q = sharedPreferences.getBoolean("A12T", false);
        this.f6546R = sharedPreferences.getBoolean("A12W", false);
        this.f6547S = sharedPreferences.getBoolean("A12E", false);
        this.f6548T = sharedPreferences.getBoolean("A12C", false);
        this.f6549U = sharedPreferences.getBoolean("A12S", false);
        this.f6550V = sharedPreferences.getBoolean("BOX", true);
        this.f6551W = sharedPreferences.getBoolean("BASEMENT", false);
        this.ab = sharedPreferences.getInt("BASEMENT_DAYS", 0);
        this.f6552X = sharedPreferences.getBoolean("APARTMENT", false);
        this.ac = sharedPreferences.getInt("APARTMENT_DAYS", 0);
        this.f6553Y = sharedPreferences.getBoolean("HOUSE", false);
        this.ad = sharedPreferences.getInt("HOUSE_NO", 0);
        this.f6554Z = sharedPreferences.getBoolean("CONDO", false);
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
            Log.e("MainActivity", "RESTART " + ((String) entry.getKey()) + ": " + entry.getValue().toString());
        }
    }

    public void m9911c() {
        this.bd = new C0486e(this);
        this.bd.m2147a(getString(R.string.interstitial_ad_unit_id));
        this.bd.m2146a(new C0472a().m2094a());
    }

    public void m9912d() {
        if (this.bd == null || !this.bd.m2148a()) {
            Log.e("MainActivity", "Ad Not Ready.");
        } else {
            this.bd.m2149b();
        }
    }

    public void m9913e() {
        if (this.f6569o) {
            this.bb.setVisibility(0);
            this.bc.setVisibility(8);
            this.be = (AudioManager) getSystemService("audio");
            this.bh = ((float) this.be.getStreamVolume(3)) / ((float) this.be.getStreamMaxVolume(3));
            this.bf = new SoundPool(10, 3, 0);
            this.bf.setOnLoadCompleteListener(new C19951(this));
            this.bg = this.bf.load(this, R.raw.click, 1);
            return;
        }
        Log.e("MainActivity", "Sound Not Loaded");
        this.bb.setVisibility(8);
        this.bc.setVisibility(0);
        this.bi = false;
    }

    public void m9914f() {
        try {
            this.bf.play(this.bg, this.bh, this.bh, 1, 0, 1.0f);
        } catch (Exception e) {
            Log.e("MainActivity", "Error Playing Sound");
        }
    }

    public void m9915g() {
        View inflate = getLayoutInflater().inflate(R.layout.google_dialog, new LinearLayout(getApplicationContext()), false);
        Builder builder = new Builder(this);
        builder.setCustomTitle(getLayoutInflater().inflate(R.layout.google_title, new RelativeLayout(getApplicationContext()), false));
        builder.setView(inflate);
        builder.setCancelable(false);
        TextView textView = (TextView) inflate.findViewById(R.id.google_dialog);
        textView.setTypeface(this.f6556b);
        textView.setText(getResources().getString(R.string.google_dialog));
        builder.setPositiveButton("Sign In", new C19962(this));
        builder.setNegativeButton("Cancel", new C19973(this));
        Dialog create = builder.create();
        create.setOnShowListener(new C19984(this));
        create.getWindow().setSoftInputMode(4);
        create.show();
        create.findViewById(create.getContext().getResources().getIdentifier("android:id/titleDivider", null, null)).setBackgroundColor(getResources().getColor(R.color.greyc));
        ((TextView) create.findViewById(R.id.google_title)).setTypeface(this.f6556b);
        this.bj = true;
    }

    public boolean m9916h() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    public void menuAchievements(View view) {
        if (this.bi && this.f6569o) {
            m9914f();
        }
        startActivity(new Intent(this, AchievementsActivity.class));
    }

    public void menuLeaderboard(View view) {
        if (this.bi && this.f6569o) {
            m9914f();
        }
        startActivity(new Intent(this, LeaderboardActivity.class));
    }

    public void menuLoadGames(View view) {
        if (this.bi && this.f6569o) {
            m9914f();
        }
        startActivity(new Intent(this, LoadGameActivity.class));
    }

    public void menuPlay(View view) {
        if (this.bi && this.f6569o) {
            m9914f();
        }
        startActivity(new Intent(this, PlayActivity.class));
    }

    public void menuSettings(View view) {
        if (this.bi && this.f6569o) {
            m9914f();
        }
        startActivity(new Intent(this, SettingsActivity.class));
    }

    public void menuVolumeOff(View view) {
        Log.e("MainActivity", "Sound Volume Off");
        if (this.bi && this.f6569o) {
            m9914f();
        }
        this.f6569o = false;
        this.bi = false;
        m9913e();
    }

    public void menuVolumeOn(View view) {
        Log.e("MainActivity", "Sound Volume On");
        if (this.bi && this.f6569o) {
            m9914f();
            return;
        }
        this.f6569o = true;
        this.bi = true;
        m9913e();
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 9001) {
            Log.e("MainActivity", "RC_SIGN_IN - " + i2);
            this.bq = false;
            if (i2 == -1) {
                Log.e("MainActivity", "RC_SIGN_IN - RESULT_OK");
                if (!this.bp.mo888d()) {
                    this.bp.mo883b();
                }
            } else if (i2 == 0) {
                Log.e("MainActivity", "RC_SIGN_IN - RESULT_CANCELED");
            } else if (i2 == 10002) {
                Log.e("MainActivity", "RC_SIGN_IN - RESULT_SIGN_IN_FAILED");
                m9908a(this.bl, getResources().getString(R.string.google_play_problem), R.drawable.notice);
                if (!this.bp.mo888d()) {
                    this.bp.mo883b();
                }
            }
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.e("MainActivity", "onCreate");
        setContentView(R.layout.activity_main);
        this.f6555a = Typeface.createFromAsset(getAssets(), "fonts/caviar_dreams.ttf");
        this.f6556b = Typeface.createFromAsset(getAssets(), "fonts/caviar_dreams_bold.ttf");
        this.bk = Toast.makeText(this, "", 1);
        this.bl = Toast.makeText(this, "", 1);
        this.bm = Toast.makeText(this, "", 1);
        this.bn = (ImageView) findViewById(R.id.imageTitle);
        this.bo = (ImageView) findViewById(R.id.imageView);
        this.aX = (Button) findViewById(R.id.menu_play);
        this.aZ = (Button) findViewById(R.id.menu_achievements);
        this.aW = (Button) findViewById(R.id.menu_leaderboard);
        this.aY = (Button) findViewById(R.id.menu_savedgames);
        this.ba = (Button) findViewById(R.id.menu_settings);
        this.bb = (Button) findViewById(R.id.menu_volume_on);
        this.bc = (Button) findViewById(R.id.menu_volume_off);
        this.aX.setTypeface(this.f6556b);
        this.aZ.setTypeface(this.f6556b);
        this.aW.setTypeface(this.f6556b);
        this.aY.setTypeface(this.f6556b);
        this.bp = new C1176a(this).m5993a((C0650b) this).m5994a((C0651c) this).m5992a(C1889d.f5744c).m5991a(C1889d.f5745d).m5992a(C1776b.f5516c).m5991a(C1776b.f5515b).m5992a(C1631a.f5051f).m5991a(C1631a.f5048c).m5990a(findViewById(16908290)).m5996b();
        this.f6568n = true;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.action_settings:
                m9912d();
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    public void onPause() {
        super.onPause();
        Log.e("MainActivity", "onPause");
        if (this.bf != null) {
            this.bf.unload(this.bg);
            this.bf.release();
            this.bf = null;
        }
        if (this.bk != null) {
            this.bk.cancel();
        }
        if (this.bl != null) {
            this.bl.cancel();
        }
        if (this.bm != null) {
            this.bm.cancel();
        }
        m9906a();
    }

    public void onResume() {
        super.onResume();
        Log.e("MainActivity", "onResume");
        m9910b();
        m9913e();
        m9911c();
        if (!this.f6567m && this.f6568n && !this.bj) {
            m9915g();
        } else if (!this.f6567m || !this.f6568n || this.bp.mo888d() || !m9905i()) {
        } else {
            if (m9916h()) {
                this.bp.mo883b();
                return;
            }
            m9908a(this.bk, getResources().getString(R.string.no_internet), R.drawable.notice);
            this.f6567m = false;
        }
    }

    public void onStop() {
        super.onStop();
        Log.e("MainActivity", "onStop");
        if (!this.bp.mo888d()) {
            return;
        }
        if (this.f6567m) {
            this.bp.mo887c();
            return;
        }
        C1889d.f5749h.mo831a(this.bp);
        C1776b.m8389b(this.bp);
        this.bp.mo887c();
    }
}
