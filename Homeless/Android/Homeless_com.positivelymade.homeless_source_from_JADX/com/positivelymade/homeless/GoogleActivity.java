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

public class GoogleActivity extends Activity implements C0650b, C0651c {
    public Typeface f6203a;
    public Typeface f6204b;
    public boolean f6205c;
    public String f6206d;
    public String f6207e;
    public Toast f6208f;
    public Toast f6209g;
    public Toast f6210h;
    private C1180c f6211i;
    private boolean f6212j;

    class C19651 extends Thread {
        final /* synthetic */ GoogleActivity f6201a;

        C19651(GoogleActivity googleActivity) {
            this.f6201a = googleActivity;
        }

        public void run() {
            try {
                Thread.sleep(2500);
                this.f6201a.finish();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    class C19662 implements OnCancelListener {
        final /* synthetic */ GoogleActivity f6202a;

        C19662(GoogleActivity googleActivity) {
            this.f6202a = googleActivity;
        }

        public void onCancel(DialogInterface dialogInterface) {
            this.f6202a.finish();
        }
    }

    private boolean m9789d() {
        int a = C1241e.m6271a((Context) this);
        if (a == 0) {
            return true;
        }
        if (C1241e.m6285b(a)) {
            Dialog a2 = C1241e.m6272a(a, (Activity) this, 1000);
            a2.setOnCancelListener(new C19662(this));
            a2.show();
        } else {
            m9792a(this.f6210h, getResources().getString(R.string.google_play_services), R.drawable.notice);
            finish();
        }
        return false;
    }

    public void m9790a() {
        Editor edit = getApplicationContext().getSharedPreferences(getString(R.string.preference_file_key), 0).edit();
        edit.putBoolean("GOOGLE", this.f6205c);
        edit.putString("NAME", this.f6206d);
        edit.putString("IMAGE", this.f6207e);
        edit.apply();
    }

    public void mo503a(Bundle bundle) {
        Log.e("GoogleActivity", "onConnected(): mGoogleApiClient");
        this.f6205c = !this.f6205c;
        if (C1889d.f5748g.mo832a(this.f6211i) != null) {
            C1886a a = C1889d.f5748g.mo832a(this.f6211i);
            this.f6206d = a.mo1654e();
            this.f6207e = a.mo1655f().mo1653e();
        } else {
            this.f6206d = "Unknown";
            this.f6207e = "";
        }
        Thread c19651 = new C19651(this);
        if (this.f6205c) {
            c19651.start();
        } else {
            finish();
        }
    }

    public void m9792a(Toast toast, String str, int i) {
        View inflate = getLayoutInflater().inflate(R.layout.toast_message, (ViewGroup) findViewById(R.id.toast_layout_root));
        ((ImageView) inflate.findViewById(R.id.toast_image)).setImageResource(i);
        ((TextView) inflate.findViewById(R.id.toast_text)).setText(str);
        if (toast.getView().getWindowVisibility() != 0) {
            Log.e("GoogleActivity", "Exists");
            toast.setDuration(1);
        }
        toast.setGravity(16, 0, 0);
        toast.setView(inflate);
        toast.show();
    }

    public void mo504a(ConnectionResult connectionResult) {
        Log.e("GoogleActivity", "onConnectionFailed(): " + connectionResult.toString());
        if (!this.f6212j && connectionResult.m5960a()) {
            try {
                this.f6212j = true;
                startIntentSenderForResult(connectionResult.m5963d().getIntentSender(), 9001, null, 0, 0, 0);
            } catch (SendIntentException e) {
                this.f6212j = false;
                this.f6211i.mo883b();
            }
        }
    }

    public void a_(int i) {
        Log.e("GoogleActivity", "onConnectionSuspended(): mGoogleApiClient attempting to connect");
        this.f6211i.mo883b();
    }

    public void m9794b() {
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences(getString(R.string.preference_file_key), 0);
        this.f6205c = sharedPreferences.getBoolean("GOOGLE", false);
        this.f6206d = sharedPreferences.getString("NAME", "Unknown");
        this.f6207e = sharedPreferences.getString("IMAGE", "");
    }

    public boolean m9795c() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 9001) {
            Log.e("GoogleActivity", "RC_SIGN_IN - " + i2);
            this.f6212j = false;
            if (i2 == -1) {
                Log.e("GoogleActivity", "RC_SIGN_IN - RESULT_OK");
                if (!this.f6211i.mo888d()) {
                    this.f6211i.mo883b();
                }
            } else if (i2 == 0) {
                Log.e("GoogleActivity", "RC_SIGN_IN - RESULT_CANCELED");
                finish();
            } else if (i2 == 10002) {
                Log.e("GoogleActivity", "RC_SIGN_IN - RESULT_SIGN_IN_FAILED");
                m9792a(this.f6209g, getResources().getString(R.string.google_play_problem), R.drawable.notice);
                if (!this.f6211i.mo888d()) {
                    this.f6211i.mo883b();
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.e("GoogleActivity", "onCreate");
        setContentView(R.layout.activity_google);
        this.f6203a = Typeface.createFromAsset(getAssets(), "fonts/caviar_dreams.ttf");
        this.f6204b = Typeface.createFromAsset(getAssets(), "fonts/caviar_dreams_bold.ttf");
        this.f6208f = Toast.makeText(this, "", 1);
        this.f6209g = Toast.makeText(this, "", 1);
        this.f6210h = Toast.makeText(this, "", 1);
        this.f6211i = new C1176a(getApplicationContext()).m5993a((C0650b) this).m5994a((C0651c) this).m5992a(C1889d.f5744c).m5991a(C1889d.f5745d).m5992a(C1776b.f5516c).m5991a(C1776b.f5515b).m5992a(C1631a.f5051f).m5991a(C1631a.f5048c).m5990a(findViewById(16908290)).m5996b();
    }

    public void onPause() {
        super.onPause();
        Log.e("GoogleActivity", "onPause");
        m9790a();
    }

    public void onResume() {
        super.onResume();
        Log.e("GoogleActivity", "onResume");
        m9794b();
        if (!m9789d()) {
            return;
        }
        if (m9795c()) {
            this.f6211i.mo883b();
            return;
        }
        this.f6205c = false;
        m9792a(this.f6208f, getResources().getString(R.string.no_internet), R.drawable.notice);
        finish();
    }

    protected void onStop() {
        super.onStop();
        if (!this.f6211i.mo888d()) {
            return;
        }
        if (this.f6205c) {
            this.f6211i.mo887c();
            return;
        }
        C1889d.f5749h.mo831a(this.f6211i);
        C1776b.m8389b(this.f6211i);
        this.f6211i.mo887c();
    }
}
