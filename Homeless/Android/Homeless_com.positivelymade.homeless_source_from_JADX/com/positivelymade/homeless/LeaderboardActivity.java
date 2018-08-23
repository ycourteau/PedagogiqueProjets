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
import com.google.android.gms.common.api.C1180c;
import com.google.android.gms.common.api.C1180c.C0650b;
import com.google.android.gms.common.api.C1180c.C0651c;
import com.google.android.gms.common.api.C1180c.C1176a;
import com.google.android.gms.drive.C1631a;
import com.google.android.gms.games.C1776b;
import com.google.android.gms.plus.C1889d;
import com.google.android.gms.plus.p043a.p044a.C1886a;

public class LeaderboardActivity extends Activity implements C0650b, C0651c {
    public Typeface f6408a;
    public Typeface f6409b;
    public boolean f6410c;
    public String f6411d;
    public String f6412e;
    public String f6413f;
    public int f6414g;
    public Toast f6415h;
    public Toast f6416i;
    public Toast f6417j;
    private C1180c f6418k;
    private boolean f6419l;

    class C19862 implements OnCancelListener {
        final /* synthetic */ LeaderboardActivity f6407a;

        C19862(LeaderboardActivity leaderboardActivity) {
            this.f6407a = leaderboardActivity;
        }

        public void onCancel(DialogInterface dialogInterface) {
            this.f6407a.finish();
        }
    }

    private boolean m9864d() {
        int a = C1241e.m6271a((Context) this);
        if (a == 0) {
            return true;
        }
        if (C1241e.m6285b(a)) {
            Dialog a2 = C1241e.m6272a(a, (Activity) this, 1000);
            a2.setOnCancelListener(new C19862(this));
            a2.show();
        } else {
            m9867a(this.f6417j, getResources().getString(R.string.google_play_services), R.drawable.notice);
            finish();
        }
        return false;
    }

    public void m9865a() {
        Editor edit = getApplicationContext().getSharedPreferences(getString(R.string.preference_file_key), 0).edit();
        edit.putBoolean("GOOGLE", this.f6410c);
        edit.putString("CODES", this.f6411d);
        edit.putInt("MONEY", this.f6414g);
        edit.putString("NAME", this.f6412e);
        edit.putString("IMAGE", this.f6413f);
        edit.apply();
    }

    public void mo503a(Bundle bundle) {
        Log.e("LeaderboardActivity", "onConnected(): mGoogleApiClient");
        final long j = ((long) this.f6414g) * 1000000;
        if (C1889d.f5748g.mo832a(this.f6418k) != null) {
            C1886a a = C1889d.f5748g.mo832a(this.f6418k);
            this.f6412e = a.mo1654e();
            this.f6413f = a.mo1655f().mo1653e();
        } else {
            this.f6412e = "Unknown";
            this.f6413f = "";
        }
        Thread c19851 = new Thread(this) {
            final /* synthetic */ LeaderboardActivity f6406b;

            public void run() {
                try {
                    Thread.sleep(2500);
                    C1776b.f5523j.mo1256a(this.f6406b.f6418k, this.f6406b.getString(R.string.leaderboard), j);
                    this.f6406b.startActivityForResult(C1776b.f5523j.mo1255a(this.f6406b.f6418k, this.f6406b.getString(R.string.leaderboard)), 17);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        if (this.f6410c) {
            C1776b.f5523j.mo1256a(this.f6418k, getString(R.string.leaderboard), j);
            startActivityForResult(C1776b.f5523j.mo1255a(this.f6418k, getString(R.string.leaderboard)), 17);
            return;
        }
        this.f6410c = true;
        c19851.start();
    }

    public void m9867a(Toast toast, String str, int i) {
        View inflate = getLayoutInflater().inflate(R.layout.toast_message, (ViewGroup) findViewById(R.id.toast_layout_root));
        ((ImageView) inflate.findViewById(R.id.toast_image)).setImageResource(i);
        ((TextView) inflate.findViewById(R.id.toast_text)).setText(str);
        if (toast.getView().getWindowVisibility() != 0) {
            Log.e("LeaderboardActivity", "Exists");
            toast.setDuration(1);
        }
        toast.setGravity(16, 0, 0);
        toast.setView(inflate);
        toast.show();
    }

    public void mo504a(ConnectionResult connectionResult) {
        Log.e("LeaderboardActivity", "onConnectionFailed(): " + connectionResult.toString());
        if (!this.f6419l && connectionResult.m5960a()) {
            try {
                this.f6419l = true;
                startIntentSenderForResult(connectionResult.m5963d().getIntentSender(), 9001, null, 0, 0, 0);
            } catch (SendIntentException e) {
                this.f6419l = false;
                this.f6418k.mo883b();
            }
        }
    }

    public void a_(int i) {
        Log.e("LeaderboardActivity", "onConnectionSuspended(): mGoogleApiClient attempting to connect");
        this.f6418k.mo883b();
    }

    public void m9869b() {
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences(getString(R.string.preference_file_key), 0);
        this.f6410c = sharedPreferences.getBoolean("GOOGLE", false);
        this.f6411d = sharedPreferences.getString("CODES", "");
        this.f6414g = sharedPreferences.getInt("MONEY", 0);
        this.f6412e = sharedPreferences.getString("NAME", "Unknown");
        this.f6413f = sharedPreferences.getString("IMAGE", "");
    }

    public boolean m9870c() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 9001) {
            Log.e("LeaderboardActivity", "RC_SIGN_IN - " + i2);
            this.f6419l = false;
            if (i2 == -1) {
                Log.e("LeaderboardActivity", "RC_SIGN_IN - RESULT_OK");
                if (!this.f6418k.mo888d()) {
                    this.f6418k.mo883b();
                }
            } else if (i2 == 0) {
                Log.e("LeaderboardActivity", "RC_SIGN_IN - RESULT_CANCELED");
                finish();
            } else if (i2 == 10002) {
                Log.e("LeaderboardActivity", "RC_SIGN_IN - RESULT_SIGN_IN_FAILED");
                m9867a(this.f6416i, getResources().getString(R.string.google_play_problem), R.drawable.notice);
                if (!this.f6418k.mo888d()) {
                    this.f6418k.mo883b();
                }
            }
        }
        if (i == 17) {
            Log.e("LeaderboardActivity", "LEADERBOARD_INTENT - " + i2);
            if (i2 == -1) {
                Log.e("LeaderboardActivity", "LEADERBOARD_INTENT - RESULT_OK");
                finish();
            } else if (i2 == 0) {
                Log.e("LeaderboardActivity", "LEADERBOARD_INTENT - RESULT_CANCELED");
                finish();
            } else if (i2 == 10001) {
                Log.e("LeaderboardActivity", "LEADERBOARD_INTENT - RESULT_RECONNECT_REQUIRED");
                this.f6410c = false;
                this.f6412e = "Unknown";
                this.f6413f = "";
                m9865a();
                finish();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.e("LeaderboardActivity", "onCreate");
        setContentView(R.layout.activity_leaderboard);
        this.f6408a = Typeface.createFromAsset(getAssets(), "fonts/caviar_dreams.ttf");
        this.f6409b = Typeface.createFromAsset(getAssets(), "fonts/caviar_dreams_bold.ttf");
        this.f6415h = Toast.makeText(this, "", 1);
        this.f6416i = Toast.makeText(this, "", 1);
        this.f6417j = Toast.makeText(this, "", 1);
        this.f6418k = new C1176a(getApplicationContext()).m5993a((C0650b) this).m5994a((C0651c) this).m5992a(C1889d.f5744c).m5991a(C1889d.f5745d).m5992a(C1776b.f5516c).m5991a(C1776b.f5515b).m5992a(C1631a.f5051f).m5991a(C1631a.f5048c).m5990a(findViewById(16908290)).m5996b();
    }

    public void onPause() {
        super.onPause();
        Log.e("LeaderboardActivity", "onPause");
        m9865a();
    }

    public void onResume() {
        super.onResume();
        Log.e("LeaderboardActivity", "onResume");
        m9869b();
        if (!m9864d()) {
            return;
        }
        if (m9870c()) {
            this.f6418k.mo883b();
            return;
        }
        this.f6410c = false;
        m9867a(this.f6415h, getResources().getString(R.string.no_internet), R.drawable.notice);
        finish();
    }

    protected void onStop() {
        super.onStop();
        if (this.f6418k.mo888d()) {
            if (this.f6410c) {
                this.f6418k.mo887c();
            } else {
                C1889d.f5749h.mo831a(this.f6418k);
                this.f6418k.mo887c();
            }
        }
        m9865a();
    }
}
