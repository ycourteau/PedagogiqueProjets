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
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
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
import com.google.android.gms.games.snapshot.C1878d.C1882a;
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.plus.C1889d;
import com.google.android.gms.plus.p043a.p044a.C1886a;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map.Entry;

public class SaveGameActivity extends Activity implements C0650b, C0651c {
    public boolean f6594A;
    public boolean f6595B;
    public boolean f6596C;
    public boolean f6597D;
    public boolean f6598E;
    public boolean f6599F;
    public boolean f6600G;
    public boolean f6601H;
    public boolean f6602I;
    public boolean f6603J;
    public boolean f6604K;
    public boolean f6605L;
    public boolean f6606M;
    public int f6607N;
    public int f6608O;
    public boolean f6609P;
    public boolean f6610Q;
    public boolean f6611R;
    public boolean f6612S;
    public boolean f6613T;
    public boolean f6614U;
    public boolean f6615V;
    public boolean f6616W;
    public boolean f6617X;
    public boolean f6618Y;
    public boolean f6619Z;
    public Typeface f6620a;
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
    public Typeface f6621b;
    public Toast ba;
    public Toast bb;
    public Toast bc;
    private C1180c bd;
    private boolean be;
    public String f6622c;
    public String f6623d;
    public String f6624e;
    public String f6625f;
    public int f6626g;
    public int f6627h;
    public int f6628i;
    public int f6629j;
    public int f6630k;
    public int f6631l;
    public int f6632m;
    public boolean f6633n;
    public boolean f6634o;
    public boolean f6635p;
    public boolean f6636q;
    public boolean f6637r;
    public boolean f6638s;
    public boolean f6639t;
    public boolean f6640u;
    public boolean f6641v;
    public boolean f6642w;
    public boolean f6643x;
    public boolean f6644y;
    public boolean f6645z;

    class C20031 extends Thread {
        final /* synthetic */ SaveGameActivity f6588a;

        C20031(SaveGameActivity saveGameActivity) {
            this.f6588a = saveGameActivity;
        }

        public void run() {
            try {
                Thread.sleep(2500);
                this.f6588a.m9946d();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    class C20042 implements OnCancelListener {
        final /* synthetic */ SaveGameActivity f6589a;

        C20042(SaveGameActivity saveGameActivity) {
            this.f6589a = saveGameActivity;
        }

        public void onCancel(DialogInterface dialogInterface) {
            this.f6589a.finish();
        }
    }

    class C20053 extends AsyncTask<Void, Void, C1821c> {
        final /* synthetic */ SaveGameActivity f6590a;

        C20053(SaveGameActivity saveGameActivity) {
            this.f6590a = saveGameActivity;
        }

        protected C1821c m9931a(Void... voidArr) {
            return (C1821c) C1776b.f5532s.mo1263a(this.f6590a.bd, this.f6590a.aW, true).mo563a();
        }

        protected void m9932a(C1821c c1821c) {
            Log.e("SaveGamesActivity", this.f6590a.m9934a(this.f6590a.m9938a(c1821c, 0)));
            this.f6590a.m9947e();
            this.f6590a.m9941a(this.f6590a.bc, this.f6590a.getResources().getString(R.string.finished_save), R.drawable.notice);
            this.f6590a.finish();
        }

        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return m9931a((Void[]) objArr);
        }

        protected /* synthetic */ void onPostExecute(Object obj) {
            m9932a((C1821c) obj);
        }
    }

    class C20075 implements Runnable {
        final /* synthetic */ SaveGameActivity f6593a;

        C20075(SaveGameActivity saveGameActivity) {
            this.f6593a = saveGameActivity;
        }

        public void run() {
            if (this.f6593a.aY != null && this.f6593a.aY.isShowing()) {
                this.f6593a.aY.dismiss();
            }
        }
    }

    private String m9934a(Snapshot snapshot) {
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.cover);
        String replace = new SimpleDateFormat("c MMM dd h:mm:ssa", Locale.ENGLISH).format(new Date()).replace("AM", "am").replace("PM", "pm");
        snapshot.mo1603b().mo1598a(this.aX.m10156a());
        C1776b.f5532s.mo1261a(this.bd, snapshot, new C1882a().m9409a(decodeResource).m9411a("Modified on: " + replace).m9412a());
        return snapshot.toString();
    }

    private boolean m9936f() {
        int a = C1241e.m6271a((Context) this);
        if (a == 0) {
            return true;
        }
        if (C1241e.m6285b(a)) {
            Dialog a2 = C1241e.m6272a(a, (Activity) this, 1000);
            a2.setOnCancelListener(new C20042(this));
            a2.show();
        } else {
            m9941a(this.bb, getResources().getString(R.string.google_play_services), R.drawable.notice);
            finish();
        }
        return false;
    }

    private void m9937g() {
        this.aX.m10155a("CODES", String.valueOf(this.f6624e));
        this.aX.m10155a("DATES", String.valueOf(this.f6625f));
        this.aX.m10155a("MONEY", String.valueOf(this.f6626g));
        this.aX.m10155a("CASH", String.valueOf(this.f6627h));
        this.aX.m10155a("BANK", String.valueOf(this.f6628i));
        this.aX.m10155a("BANK_DAYS", String.valueOf(this.f6629j));
        this.aX.m10155a("AGE", String.valueOf(this.f6630k));
        this.aX.m10155a("HUNGER", String.valueOf(this.f6631l));
        this.aX.m10155a("HEALTH", String.valueOf(this.f6632m));
        this.aX.m10155a("VOLUME", String.valueOf(this.f6634o));
        this.aX.m10155a("A2C", String.valueOf(this.f6607N));
        this.aX.m10155a("A3C", String.valueOf(this.f6608O));
        this.aX.m10155a("A1", String.valueOf(this.f6635p));
        this.aX.m10155a("A2", String.valueOf(this.f6636q));
        this.aX.m10155a("A3", String.valueOf(this.f6637r));
        this.aX.m10155a("A4", String.valueOf(this.f6638s));
        this.aX.m10155a("A5", String.valueOf(this.f6639t));
        this.aX.m10155a("A6", String.valueOf(this.f6640u));
        this.aX.m10155a("A7", String.valueOf(this.f6641v));
        this.aX.m10155a("A8", String.valueOf(this.f6642w));
        this.aX.m10155a("A9", String.valueOf(this.f6643x));
        this.aX.m10155a("A10", String.valueOf(this.f6644y));
        this.aX.m10155a("A11", String.valueOf(this.f6645z));
        this.aX.m10155a("A12", String.valueOf(this.f6594A));
        this.aX.m10155a("A1U", String.valueOf(this.f6595B));
        this.aX.m10155a("A2U", String.valueOf(this.f6596C));
        this.aX.m10155a("A3U", String.valueOf(this.f6597D));
        this.aX.m10155a("A4U", String.valueOf(this.f6598E));
        this.aX.m10155a("A5U", String.valueOf(this.f6599F));
        this.aX.m10155a("A6U", String.valueOf(this.f6600G));
        this.aX.m10155a("A7U", String.valueOf(this.f6601H));
        this.aX.m10155a("A8U", String.valueOf(this.f6602I));
        this.aX.m10155a("A9U", String.valueOf(this.f6603J));
        this.aX.m10155a("A10U", String.valueOf(this.f6604K));
        this.aX.m10155a("A11U", String.valueOf(this.f6605L));
        this.aX.m10155a("A12U", String.valueOf(this.f6606M));
        this.aX.m10155a("A12L", String.valueOf(this.f6609P));
        this.aX.m10155a("A12T", String.valueOf(this.f6610Q));
        this.aX.m10155a("A12W", String.valueOf(this.f6611R));
        this.aX.m10155a("A12E", String.valueOf(this.f6612S));
        this.aX.m10155a("A12C", String.valueOf(this.f6613T));
        this.aX.m10155a("A12S", String.valueOf(this.f6614U));
        this.aX.m10155a("BOX", String.valueOf(this.f6615V));
        this.aX.m10155a("BASEMENT", String.valueOf(this.f6616W));
        this.aX.m10155a("BASEMENT_DAYS", String.valueOf(this.ab));
        this.aX.m10155a("APARTMENT", String.valueOf(this.f6617X));
        this.aX.m10155a("APARTMENT_DAYS", String.valueOf(this.ac));
        this.aX.m10155a("HOUSE", String.valueOf(this.f6618Y));
        this.aX.m10155a("HOUSE_NO", String.valueOf(this.ad));
        this.aX.m10155a("CONDO", String.valueOf(this.f6619Z));
        this.aX.m10155a("CONDO_NO", String.valueOf(this.ae));
        this.aX.m10155a("MANSION", String.valueOf(this.aa));
        this.aX.m10155a("MANSION_NO", String.valueOf(this.af));
        this.aX.m10155a("BAREFOOT", String.valueOf(this.ag));
        this.aX.m10155a("SHOES", String.valueOf(this.ah));
        this.aX.m10155a("SHOES_NO", String.valueOf(this.an));
        this.aX.m10155a("BICYCLE", String.valueOf(this.ai));
        this.aX.m10155a("BICYCLE_NO", String.valueOf(this.ao));
        this.aX.m10155a("CAR", String.valueOf(this.aj));
        this.aX.m10155a("CAR_NO", String.valueOf(this.ap));
        this.aX.m10155a("TRUCK", String.valueOf(this.ak));
        this.aX.m10155a("TRUCK_NO", String.valueOf(this.aq));
        this.aX.m10155a("TOWNCAR", String.valueOf(this.al));
        this.aX.m10155a("TOWNCAR_NO", String.valueOf(this.ar));
        this.aX.m10155a("HELICOPTER", String.valueOf(this.am));
        this.aX.m10155a("HELICOPTER_NO", String.valueOf(this.as));
        this.aX.m10155a("KNIFE", String.valueOf(this.at));
        this.aX.m10155a("KNIFE_NO", String.valueOf(this.az));
        this.aX.m10155a("GUN", String.valueOf(this.au));
        this.aX.m10155a("GUN_NO", String.valueOf(this.aA));
        this.aX.m10155a("SHOTGUN", String.valueOf(this.av));
        this.aX.m10155a("SHOTGUN_NO", String.valueOf(this.aB));
        this.aX.m10155a("RIFLE", String.valueOf(this.aw));
        this.aX.m10155a("RIFLE_NO", String.valueOf(this.aC));
        this.aX.m10155a("VEST", String.valueOf(this.ax));
        this.aX.m10155a("VEST_NO", String.valueOf(this.aD));
        this.aX.m10155a("EXPLOSIVES", String.valueOf(this.ay));
        this.aX.m10155a("EXPLOSIVES_NO", String.valueOf(this.aE));
        this.aX.m10155a("MATH", String.valueOf(this.aF));
        this.aX.m10155a("SCHOOL", String.valueOf(this.aG));
        this.aX.m10155a("MASONRY", String.valueOf(this.aH));
        this.aX.m10155a("COLLEGE", String.valueOf(this.aI));
        this.aX.m10155a("UNIVERSITY", String.valueOf(this.aJ));
        this.aX.m10155a("NOVICE", String.valueOf(this.aK));
        this.aX.m10155a("MOBSTER", String.valueOf(this.aL));
        this.aX.m10155a("HITMAN", String.valueOf(this.aM));
        this.aX.m10155a("PICKPOCKET", String.valueOf(this.aN));
        this.aX.m10155a("BURGLAR", String.valueOf(this.aO));
        this.aX.m10155a("MASTER", String.valueOf(this.aP));
        this.aX.m10155a("DRIVING", String.valueOf(this.aQ));
        this.aX.m10155a("LIQUOR", String.valueOf(this.aR));
        this.aX.m10155a("BUSINESS", String.valueOf(this.aS));
        this.aX.m10155a("LAWS", String.valueOf(this.aT));
        this.aX.m10155a("ACCOUNTING", String.valueOf(this.aU));
        this.aX.m10155a("MANAGEMENT", String.valueOf(this.aV));
    }

    public Snapshot m9938a(C1821c c1821c, int i) {
        int i2 = i + 1;
        int f = c1821c.mo558a().m5972f();
        Log.e("SaveGamesActivity", "Save Result status: " + f);
        if (f == 0) {
            return c1821c.mo1257c();
        }
        if (f == 4002) {
            return c1821c.mo1257c();
        }
        if (f == 4004) {
            Snapshot c = c1821c.mo1257c();
            Snapshot e = c1821c.mo1259e();
            if (c.mo1602a().mo1614j() >= e.mo1602a().mo1614j()) {
                e = c;
            }
            C1821c c1821c2 = (C1821c) C1776b.f5532s.mo1262a(this.bd, c1821c.mo1258d(), e).mo563a();
            if (i2 < 3) {
                return m9938a(c1821c2, i2);
            }
            CharSequence charSequence = "Could not resolve snapshot conflicts";
            Log.e("SaveGamesActivity", charSequence);
            Toast.makeText(getApplicationContext(), charSequence, 1).show();
        }
        return null;
    }

    public void m9939a() {
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences(getString(R.string.preference_file_key), 0);
        Editor edit = sharedPreferences.edit();
        edit.putBoolean("GOOGLE", this.f6633n);
        edit.putString("CODES", this.f6624e);
        edit.putString("DATES", this.f6625f);
        edit.putString("NAME", this.f6622c);
        edit.putString("IMAGE", this.f6623d);
        edit.putInt("MONEY", this.f6626g);
        edit.putInt("CASH", this.f6627h);
        edit.putInt("BANK", this.f6628i);
        edit.putInt("BANK_DAYS", this.f6629j);
        edit.putInt("AGE", this.f6630k);
        edit.putInt("HUNGER", this.f6631l);
        edit.putInt("HEALTH", this.f6632m);
        edit.putBoolean("VOLUME", this.f6634o);
        edit.putInt("A2C", this.f6607N);
        edit.putInt("A3C", this.f6608O);
        edit.putBoolean("A1", this.f6635p);
        edit.putBoolean("A2", this.f6636q);
        edit.putBoolean("A3", this.f6637r);
        edit.putBoolean("A4", this.f6638s);
        edit.putBoolean("A5", this.f6639t);
        edit.putBoolean("A6", this.f6640u);
        edit.putBoolean("A7", this.f6641v);
        edit.putBoolean("A8", this.f6642w);
        edit.putBoolean("A9", this.f6643x);
        edit.putBoolean("A10", this.f6644y);
        edit.putBoolean("A11", this.f6645z);
        edit.putBoolean("A12", this.f6594A);
        edit.putBoolean("A1U", this.f6595B);
        edit.putBoolean("A2U", this.f6596C);
        edit.putBoolean("A3U", this.f6597D);
        edit.putBoolean("A4U", this.f6598E);
        edit.putBoolean("A5U", this.f6599F);
        edit.putBoolean("A6U", this.f6600G);
        edit.putBoolean("A7U", this.f6601H);
        edit.putBoolean("A8U", this.f6602I);
        edit.putBoolean("A9U", this.f6603J);
        edit.putBoolean("A10U", this.f6604K);
        edit.putBoolean("A11U", this.f6605L);
        edit.putBoolean("A12U", this.f6606M);
        edit.putBoolean("A12L", this.f6609P);
        edit.putBoolean("A12T", this.f6610Q);
        edit.putBoolean("A12W", this.f6611R);
        edit.putBoolean("A12E", this.f6612S);
        edit.putBoolean("A12C", this.f6613T);
        edit.putBoolean("A12S", this.f6614U);
        edit.putBoolean("BOX", this.f6615V);
        edit.putBoolean("BASEMENT", this.f6616W);
        edit.putInt("BASEMENT_DAYS", this.ab);
        edit.putBoolean("APARTMENT", this.f6617X);
        edit.putInt("APARTMENT_DAYS", this.ac);
        edit.putBoolean("HOUSE", this.f6618Y);
        edit.putInt("HOUSE_NO", this.ad);
        edit.putBoolean("CONDO", this.f6619Z);
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
            Log.e("SaveGamesActivity", "SAVE " + ((String) entry.getKey()) + ": " + entry.getValue().toString());
        }
    }

    public void mo503a(Bundle bundle) {
        Log.e("SaveGamesActivity", "onConnected(): mGoogleApiClient");
        if (C1889d.f5748g.mo832a(this.bd) != null) {
            C1886a a = C1889d.f5748g.mo832a(this.bd);
            this.f6622c = a.mo1654e();
            this.f6623d = a.mo1655f().mo1653e();
        }
        Thread c20031 = new C20031(this);
        m9937g();
        m9943a(getResources().getString(R.string.starting_save));
        if (this.f6633n) {
            m9946d();
            return;
        }
        this.f6633n = true;
        c20031.start();
    }

    public void m9941a(Toast toast, String str, int i) {
        View inflate = getLayoutInflater().inflate(R.layout.toast_message, (ViewGroup) findViewById(R.id.toast_layout_root));
        ((ImageView) inflate.findViewById(R.id.toast_image)).setImageResource(i);
        ((TextView) inflate.findViewById(R.id.toast_text)).setText(str);
        if (toast.getView().getWindowVisibility() != 0) {
            Log.e("SaveGamesActivity", "Exists");
            toast.setDuration(1);
        }
        toast.setGravity(16, 0, 0);
        toast.setView(inflate);
        toast.show();
    }

    public void mo504a(ConnectionResult connectionResult) {
        Log.e("SaveGamesActivity", "onConnectionFailed(): " + connectionResult.toString());
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

    public void m9943a(final String str) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ SaveGameActivity f6592b;

            public void run() {
                this.f6592b.aY = new ProgressDialog(this.f6592b, R.style.NewDialog);
                this.f6592b.aY.setCancelable(false);
                this.f6592b.aY.setProgressStyle(16973854);
                this.f6592b.aY.setMessage(str);
                this.f6592b.aY.show();
            }
        });
    }

    public void a_(int i) {
        Log.e("SaveGamesActivity", "onConnectionSuspended(): mGoogleApiClient attempting to connect");
        this.bd.mo883b();
    }

    public void m9944b() {
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences(getString(R.string.preference_file_key), 0);
        this.f6633n = sharedPreferences.getBoolean("GOOGLE", false);
        this.f6624e = sharedPreferences.getString("CODES", "");
        this.f6625f = sharedPreferences.getString("DATES", "");
        this.f6622c = sharedPreferences.getString("NAME", "Unknown");
        this.f6623d = sharedPreferences.getString("IMAGE", "");
        this.f6626g = sharedPreferences.getInt("MONEY", 0);
        this.f6627h = sharedPreferences.getInt("CASH", 0);
        this.f6628i = sharedPreferences.getInt("BANK", 0);
        this.f6629j = sharedPreferences.getInt("BANK_DAYS", 31);
        this.f6630k = sharedPreferences.getInt("AGE", 0);
        this.f6631l = sharedPreferences.getInt("HUNGER", 80);
        this.f6632m = sharedPreferences.getInt("HEALTH", 80);
        this.f6634o = sharedPreferences.getBoolean("VOLUME", true);
        this.f6607N = sharedPreferences.getInt("A2C", 0);
        this.f6608O = sharedPreferences.getInt("A3C", 0);
        this.f6635p = sharedPreferences.getBoolean("A1", false);
        this.f6636q = sharedPreferences.getBoolean("A2", false);
        this.f6637r = sharedPreferences.getBoolean("A3", false);
        this.f6638s = sharedPreferences.getBoolean("A4", false);
        this.f6639t = sharedPreferences.getBoolean("A5", false);
        this.f6640u = sharedPreferences.getBoolean("A6", false);
        this.f6641v = sharedPreferences.getBoolean("A7", false);
        this.f6642w = sharedPreferences.getBoolean("A8", false);
        this.f6643x = sharedPreferences.getBoolean("A9", false);
        this.f6644y = sharedPreferences.getBoolean("A10", false);
        this.f6645z = sharedPreferences.getBoolean("A11", false);
        this.f6594A = sharedPreferences.getBoolean("A12", false);
        this.f6595B = sharedPreferences.getBoolean("A1U", false);
        this.f6596C = sharedPreferences.getBoolean("A2U", false);
        this.f6597D = sharedPreferences.getBoolean("A3U", false);
        this.f6598E = sharedPreferences.getBoolean("A4U", false);
        this.f6599F = sharedPreferences.getBoolean("A5U", false);
        this.f6600G = sharedPreferences.getBoolean("A6U", false);
        this.f6601H = sharedPreferences.getBoolean("A7U", false);
        this.f6602I = sharedPreferences.getBoolean("A8U", false);
        this.f6603J = sharedPreferences.getBoolean("A9U", false);
        this.f6604K = sharedPreferences.getBoolean("A10U", false);
        this.f6605L = sharedPreferences.getBoolean("A11U", false);
        this.f6606M = sharedPreferences.getBoolean("A12U", false);
        this.f6609P = sharedPreferences.getBoolean("A12L", false);
        this.f6610Q = sharedPreferences.getBoolean("A12T", false);
        this.f6611R = sharedPreferences.getBoolean("A12W", false);
        this.f6612S = sharedPreferences.getBoolean("A12E", false);
        this.f6613T = sharedPreferences.getBoolean("A12C", false);
        this.f6614U = sharedPreferences.getBoolean("A12S", false);
        this.f6615V = sharedPreferences.getBoolean("BOX", true);
        this.f6616W = sharedPreferences.getBoolean("BASEMENT", false);
        this.ab = sharedPreferences.getInt("BASEMENT_DAYS", 0);
        this.f6617X = sharedPreferences.getBoolean("APARTMENT", false);
        this.ac = sharedPreferences.getInt("APARTMENT_DAYS", 0);
        this.f6618Y = sharedPreferences.getBoolean("HOUSE", false);
        this.ad = sharedPreferences.getInt("HOUSE_NO", 0);
        this.f6619Z = sharedPreferences.getBoolean("CONDO", false);
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
            Log.e("SaveGamesActivity", "RESTART " + ((String) entry.getKey()) + ": " + entry.getValue().toString());
        }
    }

    public boolean m9945c() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    public void m9946d() {
        new C20053(this).execute(new Void[0]);
    }

    public void m9947e() {
        runOnUiThread(new C20075(this));
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 9001) {
            Log.e("SaveGamesActivity", "RC_SIGN_IN - " + i2);
            this.be = false;
            if (i2 == -1) {
                Log.e("SaveGamesActivity", "RC_SIGN_IN - RESULT_OK");
                if (!this.bd.mo888d()) {
                    this.bd.mo883b();
                }
            } else if (i2 == 0) {
                Log.e("SaveGamesActivity", "RC_SIGN_IN - RESULT_CANCELED");
                finish();
            } else if (i2 == 10002) {
                Log.e("SaveGamesActivity", "RC_SIGN_IN - RESULT_SIGN_IN_FAILED");
                m9941a(this.ba, getResources().getString(R.string.google_play_problem), R.drawable.notice);
                if (!this.bd.mo888d()) {
                    this.bd.mo883b();
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.e("SaveGamesActivity", "onCreate");
        setContentView(R.layout.activity_leaderboard);
        this.f6620a = Typeface.createFromAsset(getAssets(), "fonts/caviar_dreams.ttf");
        this.f6621b = Typeface.createFromAsset(getAssets(), "fonts/caviar_dreams_bold.ttf");
        this.aZ = Toast.makeText(this, "", 1);
        this.ba = Toast.makeText(this, "", 1);
        this.bb = Toast.makeText(this, "", 1);
        this.bc = Toast.makeText(this, "", 1);
        this.bd = new C1176a(getApplicationContext()).m5993a((C0650b) this).m5994a((C0651c) this).m5992a(C1889d.f5744c).m5991a(C1889d.f5745d).m5992a(C1776b.f5516c).m5991a(C1776b.f5515b).m5992a(C1631a.f5051f).m5991a(C1631a.f5048c).m5990a(findViewById(16908290)).m5996b();
        this.aX = new C2090f();
    }

    public void onPause() {
        super.onPause();
        Log.e("SaveGamesActivity", "onPause");
        m9939a();
    }

    public void onResume() {
        super.onResume();
        Log.e("SaveGamesActivity", "onResume");
        m9944b();
        if (!m9936f()) {
            return;
        }
        if (m9945c()) {
            this.bd.mo883b();
            return;
        }
        this.f6633n = false;
        m9941a(this.aZ, getResources().getString(R.string.no_internet), R.drawable.notice);
        finish();
    }

    protected void onStop() {
        super.onStop();
        if (this.bd.mo888d()) {
            if (this.f6633n) {
                this.bd.mo887c();
            } else {
                C1889d.f5749h.mo831a(this.bd);
                this.bd.mo887c();
            }
        }
        m9939a();
    }
}
