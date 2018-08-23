package com.positivelymade.homeless;

import android.app.Activity;
import android.app.Dialog;
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
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.common.C1241e;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1105h;
import com.google.android.gms.common.api.C1180c;
import com.google.android.gms.common.api.C1180c.C0650b;
import com.google.android.gms.common.api.C1180c.C0651c;
import com.google.android.gms.common.api.C1180c.C1176a;
import com.google.android.gms.drive.C1631a;
import com.google.android.gms.games.C1776b;
import com.google.android.gms.games.achievement.C1767b.C1766a;
import com.google.android.gms.plus.C1889d;
import com.google.android.gms.plus.p043a.p044a.C1886a;

public class AchievementsActivity extends Activity implements C0650b, C0651c {
    public boolean f5921A;
    public boolean f5922B;
    public boolean f5923C;
    public boolean f5924D;
    public Toast f5925E;
    public Toast f5926F;
    public Toast f5927G;
    private C1180c f5928H;
    private boolean f5929I;
    public Typeface f5930a;
    public Typeface f5931b;
    public boolean f5932c;
    public String f5933d;
    public String f5934e;
    public String f5935f;
    public boolean f5936g;
    public boolean f5937h;
    public boolean f5938i;
    public boolean f5939j;
    public boolean f5940k;
    public boolean f5941l;
    public boolean f5942m;
    public boolean f5943n;
    public boolean f5944o;
    public boolean f5945p;
    public boolean f5946q;
    public boolean f5947r;
    public boolean f5948s;
    public boolean f5949t;
    public boolean f5950u;
    public boolean f5951v;
    public boolean f5952w;
    public boolean f5953x;
    public boolean f5954y;
    public boolean f5955z;

    class C19321 implements C1105h<C1766a> {
        final /* synthetic */ AchievementsActivity f5908a;

        C19321(AchievementsActivity achievementsActivity) {
            this.f5908a = achievementsActivity;
        }

        public void m9685a(C1766a c1766a) {
            if (c1766a.mo558a().m5972f() == 0) {
                this.f5908a.f5948s = true;
            }
        }
    }

    class C19332 implements C1105h<C1766a> {
        final /* synthetic */ AchievementsActivity f5909a;

        C19332(AchievementsActivity achievementsActivity) {
            this.f5909a = achievementsActivity;
        }

        public void m9687a(C1766a c1766a) {
            if (c1766a.mo558a().m5972f() == 0) {
                this.f5909a.f5922B = true;
            }
        }
    }

    class C19343 implements C1105h<C1766a> {
        final /* synthetic */ AchievementsActivity f5910a;

        C19343(AchievementsActivity achievementsActivity) {
            this.f5910a = achievementsActivity;
        }

        public void m9689a(C1766a c1766a) {
            if (c1766a.mo558a().m5972f() == 0) {
                this.f5910a.f5923C = true;
            }
        }
    }

    class C19354 implements C1105h<C1766a> {
        final /* synthetic */ AchievementsActivity f5911a;

        C19354(AchievementsActivity achievementsActivity) {
            this.f5911a = achievementsActivity;
        }

        public void m9691a(C1766a c1766a) {
            if (c1766a.mo558a().m5972f() == 0) {
                this.f5911a.f5924D = true;
            }
        }
    }

    class C19365 implements OnCancelListener {
        final /* synthetic */ AchievementsActivity f5912a;

        C19365(AchievementsActivity achievementsActivity) {
            this.f5912a = achievementsActivity;
        }

        public void onCancel(DialogInterface dialogInterface) {
            this.f5912a.finish();
        }
    }

    class C19376 implements C1105h<C1766a> {
        final /* synthetic */ AchievementsActivity f5913a;

        C19376(AchievementsActivity achievementsActivity) {
            this.f5913a = achievementsActivity;
        }

        public void m9693a(C1766a c1766a) {
            if (c1766a.mo558a().m5972f() == 0) {
                this.f5913a.f5949t = true;
            }
        }
    }

    class C19387 implements C1105h<C1766a> {
        final /* synthetic */ AchievementsActivity f5914a;

        C19387(AchievementsActivity achievementsActivity) {
            this.f5914a = achievementsActivity;
        }

        public void m9695a(C1766a c1766a) {
            if (c1766a.mo558a().m5972f() == 0) {
                this.f5914a.f5950u = true;
            }
        }
    }

    class C19398 implements C1105h<C1766a> {
        final /* synthetic */ AchievementsActivity f5915a;

        C19398(AchievementsActivity achievementsActivity) {
            this.f5915a = achievementsActivity;
        }

        public void m9697a(C1766a c1766a) {
            if (c1766a.mo558a().m5972f() == 0) {
                this.f5915a.f5951v = true;
            }
        }
    }

    class C19409 implements C1105h<C1766a> {
        final /* synthetic */ AchievementsActivity f5916a;

        C19409(AchievementsActivity achievementsActivity) {
            this.f5916a = achievementsActivity;
        }

        public void m9699a(C1766a c1766a) {
            if (c1766a.mo558a().m5972f() == 0) {
                this.f5916a.f5952w = true;
            }
        }
    }

    public class C1941a implements Runnable {
        final /* synthetic */ AchievementsActivity f5917a;
        private int f5918b;

        public C1941a(AchievementsActivity achievementsActivity, int i) {
            this.f5917a = achievementsActivity;
            this.f5918b = i;
        }

        public void run() {
            try {
                Thread.sleep((long) (this.f5918b + 2000));
                this.f5917a.startActivityForResult(C1776b.f5520g.mo1253a(this.f5917a.f5928H), 18);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public class C1942b implements Runnable {
        final /* synthetic */ AchievementsActivity f5919a;
        private int f5920b;

        public C1942b(AchievementsActivity achievementsActivity, int i) {
            this.f5919a = achievementsActivity;
            this.f5920b = i;
        }

        public void run() {
            try {
                Thread.sleep((long) this.f5920b);
                this.f5919a.startActivityForResult(C1776b.f5520g.mo1253a(this.f5919a.f5928H), 18);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private boolean m9701d() {
        int a = C1241e.m6271a((Context) this);
        if (a == 0) {
            return true;
        }
        if (C1241e.m6285b(a)) {
            Dialog a2 = C1241e.m6272a(a, (Activity) this, 1000);
            a2.setOnCancelListener(new C19365(this));
            a2.show();
        } else {
            m9704a(this.f5927G, getResources().getString(R.string.google_play_services), R.drawable.notice);
            finish();
        }
        return false;
    }

    public void m9702a() {
        Editor edit = getApplicationContext().getSharedPreferences(getString(R.string.preference_file_key), 0).edit();
        edit.putBoolean("GOOGLE", this.f5932c);
        edit.putString("CODES", this.f5933d);
        edit.putString("NAME", this.f5934e);
        edit.putString("IMAGE", this.f5935f);
        edit.putBoolean("A1", this.f5936g);
        edit.putBoolean("A2", this.f5937h);
        edit.putBoolean("A3", this.f5938i);
        edit.putBoolean("A4", this.f5939j);
        edit.putBoolean("A5", this.f5940k);
        edit.putBoolean("A6", this.f5941l);
        edit.putBoolean("A7", this.f5942m);
        edit.putBoolean("A8", this.f5943n);
        edit.putBoolean("A9", this.f5944o);
        edit.putBoolean("A10", this.f5945p);
        edit.putBoolean("A11", this.f5946q);
        edit.putBoolean("A12", this.f5947r);
        edit.putBoolean("A1U", this.f5948s);
        edit.putBoolean("A2U", this.f5949t);
        edit.putBoolean("A3U", this.f5950u);
        edit.putBoolean("A4U", this.f5951v);
        edit.putBoolean("A5U", this.f5952w);
        edit.putBoolean("A6U", this.f5953x);
        edit.putBoolean("A7U", this.f5954y);
        edit.putBoolean("A8U", this.f5955z);
        edit.putBoolean("A9U", this.f5921A);
        edit.putBoolean("A10U", this.f5922B);
        edit.putBoolean("A11U", this.f5923C);
        edit.putBoolean("A12U", this.f5924D);
        edit.apply();
    }

    public void mo503a(Bundle bundle) {
        Log.e("AchievementsActivity", "onConnected(): mGoogleApiClient");
        if (C1889d.f5748g.mo832a(this.f5928H) != null) {
            C1886a a = C1889d.f5748g.mo832a(this.f5928H);
            this.f5934e = a.mo1654e();
            this.f5935f = a.mo1655f().mo1653e();
        } else {
            this.f5934e = "Unknown";
            this.f5935f = "";
        }
        int i = 0;
        if (this.f5936g && !this.f5948s) {
            Log.e("AchievementsActivity", "1");
            this.f5932c = true;
            i = 5000;
            C1776b.f5520g.mo1254a(this.f5928H, getResources().getString(R.string.achievements_a1)).mo565a(new C19321(this));
        }
        if (this.f5937h && !this.f5949t) {
            Log.e("AchievementsActivity", "2");
            this.f5932c = true;
            i = i == 0 ? i + 5000 : i + 5500;
            C1776b.f5520g.mo1254a(this.f5928H, getResources().getString(R.string.achievements_a2)).mo565a(new C19376(this));
        }
        if (this.f5938i && !this.f5950u) {
            Log.e("AchievementsActivity", "3");
            this.f5932c = true;
            i = i == 0 ? i + 5000 : i + 5500;
            C1776b.f5520g.mo1254a(this.f5928H, getResources().getString(R.string.achievements_a3)).mo565a(new C19387(this));
        }
        if (this.f5939j && !this.f5951v) {
            Log.e("AchievementsActivity", "4");
            this.f5932c = true;
            i = i == 0 ? i + 5000 : i + 5500;
            C1776b.f5520g.mo1254a(this.f5928H, getResources().getString(R.string.achievements_a4)).mo565a(new C19398(this));
        }
        if (this.f5940k && !this.f5952w) {
            Log.e("AchievementsActivity", "5");
            this.f5932c = true;
            i = i == 0 ? i + 5000 : i + 5500;
            C1776b.f5520g.mo1254a(this.f5928H, getResources().getString(R.string.achievements_a5)).mo565a(new C19409(this));
        }
        if (this.f5941l && !this.f5953x) {
            Log.e("AchievementsActivity", "6");
            this.f5932c = true;
            i = i == 0 ? i + 5000 : i + 5500;
            C1776b.f5520g.mo1254a(this.f5928H, getResources().getString(R.string.achievements_a6)).mo565a(new C1105h<C1766a>(this) {
                final /* synthetic */ AchievementsActivity f5904a;

                {
                    this.f5904a = r1;
                }

                public void m9677a(C1766a c1766a) {
                    if (c1766a.mo558a().m5972f() == 0) {
                        this.f5904a.f5953x = true;
                    }
                }
            });
        }
        if (this.f5942m && !this.f5954y) {
            Log.e("AchievementsActivity", "7");
            this.f5932c = true;
            i = i == 0 ? i + 5000 : i + 5500;
            C1776b.f5520g.mo1254a(this.f5928H, getResources().getString(R.string.achievements_a7)).mo565a(new C1105h<C1766a>(this) {
                final /* synthetic */ AchievementsActivity f5905a;

                {
                    this.f5905a = r1;
                }

                public void m9679a(C1766a c1766a) {
                    if (c1766a.mo558a().m5972f() == 0) {
                        this.f5905a.f5954y = true;
                    }
                }
            });
        }
        if (this.f5943n && !this.f5955z) {
            Log.e("AchievementsActivity", "8");
            this.f5932c = true;
            i = i == 0 ? i + 5000 : i + 5500;
            C1776b.f5520g.mo1254a(this.f5928H, getResources().getString(R.string.achievements_a8)).mo565a(new C1105h<C1766a>(this) {
                final /* synthetic */ AchievementsActivity f5906a;

                {
                    this.f5906a = r1;
                }

                public void m9681a(C1766a c1766a) {
                    if (c1766a.mo558a().m5972f() == 0) {
                        this.f5906a.f5955z = true;
                    }
                }
            });
        }
        if (this.f5944o && !this.f5921A) {
            Log.e("AchievementsActivity", "9");
            this.f5932c = true;
            i = i == 0 ? i + 5000 : i + 5500;
            C1776b.f5520g.mo1254a(this.f5928H, getResources().getString(R.string.achievements_a9)).mo565a(new C1105h<C1766a>(this) {
                final /* synthetic */ AchievementsActivity f5907a;

                {
                    this.f5907a = r1;
                }

                public void m9683a(C1766a c1766a) {
                    if (c1766a.mo558a().m5972f() == 0) {
                        this.f5907a.f5921A = true;
                    }
                }
            });
        }
        if (this.f5945p && !this.f5922B) {
            Log.e("AchievementsActivity", "10");
            this.f5932c = true;
            i = i == 0 ? i + 5000 : i + 5500;
            C1776b.f5520g.mo1254a(this.f5928H, getResources().getString(R.string.achievements_a10)).mo565a(new C19332(this));
        }
        if (this.f5946q && !this.f5923C) {
            Log.e("AchievementsActivity", "11");
            this.f5932c = true;
            i = i == 0 ? i + 5000 : i + 5500;
            C1776b.f5520g.mo1254a(this.f5928H, getResources().getString(R.string.achievements_a11)).mo565a(new C19343(this));
        }
        if (this.f5947r && !this.f5924D) {
            Log.e("AchievementsActivity", "12");
            this.f5932c = true;
            i = i == 0 ? i + 5000 : i + 5500;
            C1776b.f5520g.mo1254a(this.f5928H, getResources().getString(R.string.achievements_a12)).mo565a(new C19354(this));
        }
        if (this.f5932c) {
            Log.e("AchievementsActivity", "Short Time " + String.valueOf(i));
            new Thread(new C1942b(this, i)).start();
        } else {
            Log.e("AchievementsActivity", "Long Time " + String.valueOf(i));
            this.f5932c = true;
            new Thread(new C1941a(this, i)).start();
        }
        m9702a();
    }

    public void m9704a(Toast toast, String str, int i) {
        View inflate = getLayoutInflater().inflate(R.layout.toast_message, (ViewGroup) findViewById(R.id.toast_layout_root));
        ((ImageView) inflate.findViewById(R.id.toast_image)).setImageResource(i);
        ((TextView) inflate.findViewById(R.id.toast_text)).setText(str);
        if (toast.getView().getWindowVisibility() != 0) {
            Log.e("AchievementsActivity", "Exists");
            toast.setDuration(1);
        }
        toast.setGravity(16, 0, 0);
        toast.setView(inflate);
        toast.show();
    }

    public void mo504a(ConnectionResult connectionResult) {
        Log.e("AchievementsActivity", "onConnectionFailed(): " + connectionResult.toString());
        if (!this.f5929I && connectionResult.m5960a()) {
            try {
                this.f5929I = true;
                startIntentSenderForResult(connectionResult.m5963d().getIntentSender(), 9001, null, 0, 0, 0);
            } catch (SendIntentException e) {
                this.f5929I = false;
                this.f5928H.mo883b();
            }
        }
    }

    public void a_(int i) {
        Log.e("AchievementsActivity", "onConnectionSuspended(): mGoogleApiClient attempting to connect");
        this.f5928H.mo883b();
    }

    public void m9706b() {
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences(getString(R.string.preference_file_key), 0);
        this.f5932c = sharedPreferences.getBoolean("GOOGLE", false);
        this.f5933d = sharedPreferences.getString("CODES", "");
        this.f5934e = sharedPreferences.getString("NAME", "Unknown");
        this.f5935f = sharedPreferences.getString("IMAGE", "");
        this.f5936g = sharedPreferences.getBoolean("A1", false);
        this.f5937h = sharedPreferences.getBoolean("A2", false);
        this.f5938i = sharedPreferences.getBoolean("A3", false);
        this.f5939j = sharedPreferences.getBoolean("A4", false);
        this.f5940k = sharedPreferences.getBoolean("A5", false);
        this.f5941l = sharedPreferences.getBoolean("A6", false);
        this.f5942m = sharedPreferences.getBoolean("A7", false);
        this.f5943n = sharedPreferences.getBoolean("A8", false);
        this.f5944o = sharedPreferences.getBoolean("A9", false);
        this.f5945p = sharedPreferences.getBoolean("A10", false);
        this.f5946q = sharedPreferences.getBoolean("A11", false);
        this.f5947r = sharedPreferences.getBoolean("A12", false);
        this.f5948s = sharedPreferences.getBoolean("A1U", false);
        this.f5949t = sharedPreferences.getBoolean("A2U", false);
        this.f5950u = sharedPreferences.getBoolean("A3U", false);
        this.f5951v = sharedPreferences.getBoolean("A4U", false);
        this.f5952w = sharedPreferences.getBoolean("A5U", false);
        this.f5953x = sharedPreferences.getBoolean("A6U", false);
        this.f5954y = sharedPreferences.getBoolean("A7U", false);
        this.f5955z = sharedPreferences.getBoolean("A8U", false);
        this.f5921A = sharedPreferences.getBoolean("A9U", false);
        this.f5922B = sharedPreferences.getBoolean("A10U", false);
        this.f5923C = sharedPreferences.getBoolean("A11U", false);
        this.f5924D = sharedPreferences.getBoolean("A12U", false);
    }

    public boolean m9707c() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 9001) {
            Log.e("AchievementsActivity", "RC_SIGN_IN - " + i2);
            this.f5929I = false;
            if (i2 == -1) {
                Log.e("AchievementsActivity", "RC_SIGN_IN - RESULT_OK");
                if (!this.f5928H.mo888d()) {
                    this.f5928H.mo883b();
                }
            } else if (i2 == 0) {
                Log.e("AchievementsActivity", "RC_SIGN_IN - RESULT_CANCELED");
                finish();
            } else if (i2 == 10002) {
                Log.e("AchievementsActivity", "RC_SIGN_IN - RESULT_SIGN_IN_FAILED");
                m9704a(this.f5926F, getResources().getString(R.string.google_play_problem), R.drawable.notice);
                if (!this.f5928H.mo888d()) {
                    this.f5928H.mo883b();
                }
            }
        }
        if (i == 18) {
            Log.e("AchievementsActivity", "ACHIEVEMENTS_INTENT - " + i2);
            if (i2 == -1) {
                Log.e("AchievementsActivity", "ACHIEVEMENTS_INTENT - RESULT_OK");
                finish();
            } else if (i2 == 0) {
                Log.e("AchievementsActivity", "ACHIEVEMENTS_INTENT - RESULT_CANCELED");
                finish();
            } else if (i2 == 10001) {
                Log.e("AchievementsActivity", "ACHIEVEMENTS_INTENT - RESULT_RECONNECT_REQUIRED");
                this.f5932c = false;
                this.f5934e = "Unknown";
                this.f5935f = "";
                m9702a();
                finish();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.e("AchievementsActivity", "onCreate");
        setContentView(R.layout.activity_achievements);
        this.f5930a = Typeface.createFromAsset(getAssets(), "fonts/caviar_dreams.ttf");
        this.f5931b = Typeface.createFromAsset(getAssets(), "fonts/caviar_dreams_bold.ttf");
        this.f5925E = Toast.makeText(this, "", 1);
        this.f5926F = Toast.makeText(this, "", 1);
        this.f5927G = Toast.makeText(this, "", 1);
        this.f5928H = new C1176a(this).m5993a((C0650b) this).m5994a((C0651c) this).m5992a(C1889d.f5744c).m5991a(C1889d.f5745d).m5992a(C1776b.f5516c).m5991a(C1776b.f5515b).m5992a(C1631a.f5051f).m5991a(C1631a.f5048c).m5990a(findViewById(16908290)).m5996b();
    }

    public void onPause() {
        super.onPause();
        Log.e("AchievementsActivity", "onPause");
        m9702a();
    }

    public void onResume() {
        super.onResume();
        Log.e("AchievementsActivity", "onResume");
        m9706b();
        if (!m9701d()) {
            return;
        }
        if (m9707c()) {
            this.f5928H.mo883b();
            return;
        }
        this.f5932c = false;
        m9704a(this.f5925E, getResources().getString(R.string.no_internet), R.drawable.notice);
        finish();
    }

    protected void onStop() {
        super.onStop();
        if (this.f5928H.mo888d()) {
            if (this.f5932c) {
                this.f5928H.mo887c();
            } else {
                C1889d.f5749h.mo831a(this.f5928H);
                this.f5928H.mo887c();
            }
        }
        m9702a();
    }
}
