package com.positivelymade.homeless;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnShowListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Typeface;
import android.media.AudioManager;
import android.media.SoundPool;
import android.media.SoundPool.OnLoadCompleteListener;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.C0427a;
import com.google.android.gms.ads.C0476c.C0472a;
import java.util.Map.Entry;

public class CentralBankActivity extends Activity {
    public Typeface f5962A;
    public Typeface f5963B;
    public AdView f5964C;
    public Button f5965D;
    public TextView f5966E;
    public TextView f5967F;
    public TextView f5968G;
    public TextView f5969H;
    public TextView f5970I;
    public TextView f5971J;
    public LinearLayout f5972K;
    public View f5973L;
    public Button f5974M;
    public Button f5975N;
    public AudioManager f5976O;
    public SoundPool f5977P;
    public int f5978Q;
    public int f5979R;
    public float f5980S;
    public boolean f5981T;
    public boolean f5982U;
    public Toast f5983V;
    public Toast f5984W;
    public Toast f5985X;
    public Toast f5986Y;
    public Toast f5987Z;
    public String f5988a;
    public Toast aa;
    public String f5989b;
    public int f5990c;
    public int f5991d;
    public int f5992e;
    public int f5993f;
    public int f5994g;
    public int f5995h;
    public int f5996i;
    public boolean f5997j;
    public boolean f5998k;
    public boolean f5999l;
    public boolean f6000m;
    public boolean f6001n;
    public boolean f6002o;
    public int f6003p;
    public int f6004q;
    public int f6005r;
    public int f6006s;
    public int f6007t;
    public boolean f6008u;
    public boolean f6009v;
    public boolean f6010w;
    public boolean f6011x;
    public boolean f6012y;
    public boolean f6013z;

    class C19431 extends C0427a {
        final /* synthetic */ CentralBankActivity f5956a;

        C19431(CentralBankActivity centralBankActivity) {
            this.f5956a = centralBankActivity;
        }

        public void mo322a() {
            Log.e("CentralBankActivity", "Google onAdLoaded");
        }

        public void mo323a(int i) {
            Log.e("CentralBankActivity", "Google onAdFailedToLoad: " + this.f5956a.m9713a(i));
        }

        public void mo324b() {
            Log.e("CentralBankActivity", "Google onAdOpened");
        }

        public void mo325c() {
            Log.e("CentralBankActivity", "Google onAdClosed");
        }

        public void mo326d() {
            Log.d("CentralBankActivity", "Google onAdLeftApplication");
        }
    }

    class C19442 implements OnEditorActionListener {
        final /* synthetic */ CentralBankActivity f5957a;

        C19442(CentralBankActivity centralBankActivity) {
            this.f5957a = centralBankActivity;
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            switch (i & 255) {
                case 6:
                    ((InputMethodManager) this.f5957a.getSystemService("input_method")).hideSoftInputFromWindow(this.f5957a.f5971J.getWindowToken(), 0);
                    break;
            }
            return true;
        }
    }

    class C19453 implements OnClickListener {
        final /* synthetic */ CentralBankActivity f5958a;

        C19453(CentralBankActivity centralBankActivity) {
            this.f5958a = centralBankActivity;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            int i2 = this.f5958a.f5992e;
            this.f5958a.f5991d += i2;
            this.f5958a.f5992e = 0;
            CentralBankActivity centralBankActivity = this.f5958a;
            centralBankActivity.f5994g++;
            this.f5958a.m9720e();
            this.f5958a.m9722g();
            this.f5958a.f5971J.setText("");
            this.f5958a.f5966E.setText("$" + String.format("%,d", new Object[]{Integer.valueOf(this.f5958a.f5991d)}).replace(',', ' '));
            this.f5958a.f5968G.setText("$" + String.format("%,d", new Object[]{Integer.valueOf(this.f5958a.f5992e)}).replace(',', ' '));
            this.f5958a.f5970I.setText(this.f5958a.getResources().getString(R.string.bank_info));
            this.f5958a.m9716a(this.f5958a.aa, "$" + i2 + " " + this.f5958a.getResources().getString(R.string.bank_w_2) + "\n\n" + this.f5958a.getResources().getString(R.string.bank_w_4), R.drawable.money);
        }
    }

    class C19464 implements OnClickListener {
        final /* synthetic */ CentralBankActivity f5959a;

        C19464(CentralBankActivity centralBankActivity) {
            this.f5959a = centralBankActivity;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    class C19475 implements OnShowListener {
        final /* synthetic */ CentralBankActivity f5960a;

        C19475(CentralBankActivity centralBankActivity) {
            this.f5960a = centralBankActivity;
        }

        public void onShow(DialogInterface dialogInterface) {
            AlertDialog alertDialog = (AlertDialog) dialogInterface;
            alertDialog.getButton(-1).setTypeface(this.f5960a.f5963B);
            alertDialog.getButton(-2).setTypeface(this.f5960a.f5963B);
        }
    }

    class C19486 implements OnLoadCompleteListener {
        final /* synthetic */ CentralBankActivity f5961a;

        C19486(CentralBankActivity centralBankActivity) {
            this.f5961a = centralBankActivity;
        }

        public void onLoadComplete(SoundPool soundPool, int i, int i2) {
            Log.e("CentralBankActivity", "Sound Loaded");
            this.f5961a.f5981T = true;
        }
    }

    private String m9713a(int i) {
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

    public void m9715a() {
        ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(getCurrentFocus() == null ? null : getCurrentFocus().getWindowToken(), 2);
    }

    public void m9716a(Toast toast, String str, int i) {
        View inflate = getLayoutInflater().inflate(R.layout.toast_message, (ViewGroup) findViewById(R.id.toast_layout_root));
        ((ImageView) inflate.findViewById(R.id.toast_image)).setImageResource(i);
        ((TextView) inflate.findViewById(R.id.toast_text)).setText(str);
        if (toast.getView().getWindowVisibility() != 0) {
            Log.e("CentralBankActivity", "Exists");
            toast.setDuration(1);
        }
        toast.setGravity(16, 0, 0);
        toast.setView(inflate);
        toast.show();
    }

    public void m9717b() {
        View inflate = getLayoutInflater().inflate(R.layout.bank_dialog_close, new LinearLayout(getApplicationContext()), false);
        Builder builder = new Builder(this);
        builder.setCustomTitle(getLayoutInflater().inflate(R.layout.bank_title_close, new RelativeLayout(getApplicationContext()), false));
        builder.setView(inflate);
        builder.setCancelable(false);
        TextView textView = (TextView) inflate.findViewById(R.id.bank_close);
        textView.setTypeface(this.f5963B);
        textView.setText(getResources().getString(R.string.bank_w_3) + this.f5992e + getResources().getString(R.string.bank_w_3b));
        builder.setPositiveButton("Yes", new C19453(this));
        builder.setNegativeButton("Cancel", new C19464(this));
        Dialog create = builder.create();
        create.setOnShowListener(new C19475(this));
        create.getWindow().setSoftInputMode(4);
        create.show();
        create.findViewById(create.getContext().getResources().getIdentifier("android:id/titleDivider", null, null)).setBackgroundColor(getResources().getColor(R.color.greyc));
        ((TextView) create.findViewById(R.id.bank_close_title)).setTypeface(this.f5963B);
    }

    public void bankDeposit(View view) {
        int parseInt = this.f5971J.getText().toString().equals("") ? 0 : Integer.parseInt(this.f5971J.getText().toString());
        if (parseInt < 100 && this.f5992e < 100) {
            m9716a(this.f5983V, getResources().getString(R.string.bank_d_1), R.drawable.money);
        } else if (parseInt > 0 && parseInt <= this.f5991d && this.f5992e >= 100) {
            m9716a(this.f5985X, "$" + String.valueOf(parseInt) + " " + getResources().getString(R.string.bank_d_3), R.drawable.money);
            this.f5992e += parseInt;
            this.f5991d -= parseInt;
            this.f5994g++;
            m9720e();
            this.f5971J.setText("");
            m9715a();
            m9722g();
        } else if (parseInt < 100 || parseInt > this.f5991d || this.f5992e >= 100) {
            m9716a(this.f5984W, getResources().getString(R.string.bank_d_2), R.drawable.money);
        } else {
            m9716a(this.f5985X, "$" + String.valueOf(parseInt) + " " + getResources().getString(R.string.bank_d_3), R.drawable.money);
            this.f5992e += parseInt;
            this.f5991d -= parseInt;
            this.f5994g++;
            m9720e();
            this.f5971J.setText("");
            m9715a();
            m9722g();
        }
        this.f5966E.setText("$" + String.format("%,d", new Object[]{Integer.valueOf(this.f5991d)}).replace(',', ' '));
        this.f5968G.setText("$" + String.format("%,d", new Object[]{Integer.valueOf(this.f5992e)}).replace(',', ' '));
        if (this.f5992e < 100) {
            this.f5970I.setText(getResources().getString(R.string.bank_info));
        } else if (this.f5993f == 1) {
            this.f5970I.setText(getResources().getString(R.string.bank_rate) + " " + String.valueOf(this.f5993f) + " day");
        } else if (this.f5993f > 1) {
            this.f5970I.setText(getResources().getString(R.string.bank_rate) + " " + String.valueOf(this.f5993f) + " days");
        } else if (this.f5993f < 1) {
            this.f5993f = 31;
            this.f5970I.setText(getResources().getString(R.string.bank_rate) + " " + String.valueOf(this.f5993f) + " days");
        }
    }

    public void bankWithdraw(View view) {
        int parseInt = this.f5971J.getText().toString().equals("") ? 0 : Integer.parseInt(this.f5971J.getText().toString());
        if (parseInt > 0 && parseInt <= this.f5992e && this.f5992e >= parseInt + 100) {
            m9716a(this.f5987Z, "$" + parseInt + " " + getResources().getString(R.string.bank_w_2), R.drawable.money);
            this.f5992e -= parseInt;
            this.f5991d = parseInt + this.f5991d;
            this.f5994g++;
            m9720e();
            this.f5971J.setText("");
            m9715a();
            m9722g();
        } else if (parseInt <= 0 || parseInt > this.f5992e || this.f5992e < 100) {
            m9716a(this.f5986Y, getResources().getString(R.string.bank_w_1), R.drawable.money);
        } else {
            m9717b();
            m9715a();
        }
        this.f5966E.setText("$" + String.format("%,d", new Object[]{Integer.valueOf(this.f5991d)}).replace(',', ' '));
        this.f5968G.setText("$" + String.format("%,d", new Object[]{Integer.valueOf(this.f5992e)}).replace(',', ' '));
        if (this.f5992e < 100) {
            this.f5970I.setText(getResources().getString(R.string.bank_info));
        } else if (this.f5993f == 1) {
            this.f5970I.setText(getResources().getString(R.string.bank_rate) + " " + String.valueOf(this.f5993f) + " day");
        } else if (this.f5993f > 1) {
            this.f5970I.setText(getResources().getString(R.string.bank_rate) + " " + String.valueOf(this.f5993f) + " days");
        } else if (this.f5993f < 1) {
            this.f5993f = 31;
            this.f5970I.setText(getResources().getString(R.string.bank_rate) + " " + String.valueOf(this.f5993f) + " days");
        }
    }

    public void m9718c() {
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences(getString(R.string.preference_file_key), 0);
        Editor edit = sharedPreferences.edit();
        edit.putString("CODES", this.f5989b);
        edit.putBoolean("A4", this.f6008u);
        edit.putBoolean("A5", this.f6009v);
        edit.putBoolean("A7", this.f6010w);
        edit.putBoolean("A8", this.f6011x);
        edit.putBoolean("A10", this.f6012y);
        edit.putBoolean("A11", this.f6013z);
        edit.putInt("MONEY", this.f5990c);
        edit.putString("NAME", this.f5988a);
        edit.putInt("CASH", this.f5991d);
        edit.putInt("BANK", this.f5992e);
        edit.putInt("BANK_DAYS", this.f5993f);
        edit.putInt("AGE", this.f5994g);
        edit.putInt("HUNGER", this.f5995h);
        edit.putInt("HEALTH", this.f5996i);
        edit.putBoolean("VOLUME", this.f5982U);
        edit.putBoolean("BOX", this.f5997j);
        edit.putBoolean("BASEMENT", this.f5998k);
        edit.putInt("BASEMENT_DAYS", this.f6003p);
        edit.putBoolean("APARTMENT", this.f5999l);
        edit.putInt("APARTMENT_DAYS", this.f6004q);
        edit.putBoolean("HOUSE", this.f6000m);
        edit.putInt("HOUSE_NO", this.f6005r);
        edit.putBoolean("CONDO", this.f6001n);
        edit.putInt("CONDO_NO", this.f6006s);
        edit.putBoolean("MANSION", this.f6002o);
        edit.putInt("MANSION_NO", this.f6007t);
        edit.apply();
        for (Entry entry : sharedPreferences.getAll().entrySet()) {
            Log.e("CentralBankActivity", "SAVE " + ((String) entry.getKey()) + ": " + entry.getValue().toString());
        }
    }

    public void m9719d() {
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences(getString(R.string.preference_file_key), 0);
        this.f5989b = sharedPreferences.getString("CODES", "");
        this.f6008u = sharedPreferences.getBoolean("A4", false);
        this.f6009v = sharedPreferences.getBoolean("A5", false);
        this.f6010w = sharedPreferences.getBoolean("A7", false);
        this.f6011x = sharedPreferences.getBoolean("A8", false);
        this.f6012y = sharedPreferences.getBoolean("A10", false);
        this.f6013z = sharedPreferences.getBoolean("A11", false);
        this.f5990c = sharedPreferences.getInt("MONEY", 0);
        this.f5988a = sharedPreferences.getString("NAME", "Unknown");
        this.f5991d = sharedPreferences.getInt("CASH", 0);
        this.f5992e = sharedPreferences.getInt("BANK", 0);
        this.f5993f = sharedPreferences.getInt("BANK_DAYS", 31);
        this.f5994g = sharedPreferences.getInt("AGE", 0);
        this.f5995h = sharedPreferences.getInt("HUNGER", 80);
        this.f5996i = sharedPreferences.getInt("HEALTH", 80);
        this.f5982U = sharedPreferences.getBoolean("VOLUME", true);
        this.f5997j = sharedPreferences.getBoolean("BOX", true);
        this.f5998k = sharedPreferences.getBoolean("BASEMENT", false);
        this.f6003p = sharedPreferences.getInt("BASEMENT_DAYS", 0);
        this.f5999l = sharedPreferences.getBoolean("APARTMENT", false);
        this.f6004q = sharedPreferences.getInt("APARTMENT_DAYS", 0);
        this.f6000m = sharedPreferences.getBoolean("HOUSE", false);
        this.f6005r = sharedPreferences.getInt("HOUSE_NO", 0);
        this.f6001n = sharedPreferences.getBoolean("CONDO", false);
        this.f6006s = sharedPreferences.getInt("CONDO_NO", 0);
        this.f6002o = sharedPreferences.getBoolean("MANSION", false);
        this.f6007t = sharedPreferences.getInt("MANSION_NO", 0);
    }

    public void m9720e() {
        this.f5990c = this.f5991d > this.f5990c ? this.f5991d : this.f5990c;
        Log.e("CentralBankActivity", String.valueOf(this.f5993f));
        if (this.f5992e == 0) {
            this.f5993f = 31;
        } else if (this.f5992e >= 100 && this.f5993f >= 1) {
            this.f5993f--;
        }
        if (this.f5992e >= 100 && this.f5993f == 1) {
            this.f5970I.setText(getResources().getString(R.string.bank_rate) + " " + String.valueOf(this.f5993f) + " day");
        } else if (this.f5992e >= 100 && this.f5993f > 1) {
            this.f5970I.setText(getResources().getString(R.string.bank_rate) + " " + String.valueOf(this.f5993f) + " days");
        } else if (this.f5992e >= 100 && this.f5993f < 1) {
            this.f5993f = 30;
            this.f5970I.setText(getResources().getString(R.string.bank_rate) + " " + String.valueOf(this.f5993f) + " days");
            this.f5992e += this.f5992e / 100;
        }
        if (this.f5998k && this.f6003p >= 1) {
            this.f6003p--;
        }
        if (this.f5998k && this.f6003p == 0) {
            this.f5998k = false;
            this.f6003p = 0;
        }
        if (this.f5999l && this.f6004q >= 1) {
            this.f6004q--;
        }
        if (this.f5999l && this.f6004q == 0) {
            this.f5999l = false;
            this.f6004q = 0;
        }
    }

    public void m9721f() {
        if (this.f5982U) {
            this.f5976O = (AudioManager) getSystemService("audio");
            this.f5980S = ((float) this.f5976O.getStreamVolume(3)) / ((float) this.f5976O.getStreamMaxVolume(3));
            this.f5977P = new SoundPool(10, 3, 0);
            this.f5977P.setOnLoadCompleteListener(new C19486(this));
            this.f5978Q = this.f5977P.load(this, R.raw.register, 1);
            this.f5979R = this.f5977P.load(this, R.raw.click, 1);
            return;
        }
        Log.e("CentralBankActivity", "Sound Not Loaded");
        this.f5981T = false;
    }

    public void m9722g() {
        if (this.f5982U) {
            try {
                this.f5977P.play(this.f5978Q, this.f5980S, this.f5980S, 1, 0, 1.0f);
            } catch (Exception e) {
                Log.e("CentralBankActivity", "Error Playing Sound");
            }
        }
    }

    public void goBack(View view) {
        m9723h();
        finish();
    }

    public void m9723h() {
        if (this.f5982U) {
            try {
                this.f5977P.play(this.f5979R, this.f5980S, this.f5980S, 1, 0, 1.0f);
            } catch (Exception e) {
                Log.e("CentralBankActivity", "Error Playing Sound");
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.e("CentralBankActivity", "onCreate");
        setContentView(R.layout.activity_central_bank);
        this.f5962A = Typeface.createFromAsset(getAssets(), "fonts/caviar_dreams.ttf");
        this.f5963B = Typeface.createFromAsset(getAssets(), "fonts/caviar_dreams_bold.ttf");
        this.f5983V = Toast.makeText(this, "", 1);
        this.f5984W = Toast.makeText(this, "", 1);
        this.f5985X = Toast.makeText(this, "", 1);
        this.f5986Y = Toast.makeText(this, "", 1);
        this.f5987Z = Toast.makeText(this, "", 1);
        this.aa = Toast.makeText(this, "", 1);
        this.f5964C = (AdView) findViewById(R.id.adView);
        this.f5964C.setAdListener(new C19431(this));
        this.f5964C.m2048a(new C0472a().m2094a());
        this.f5967F = (TextView) findViewById(R.id.hunger_cash_title);
        this.f5967F.setTypeface(this.f5963B);
        this.f5966E = (TextView) findViewById(R.id.hunger_cash_amount);
        this.f5966E.setTypeface(this.f5962A);
        this.f5969H = (TextView) findViewById(R.id.hunger_bank_title);
        this.f5969H.setTypeface(this.f5963B);
        this.f5968G = (TextView) findViewById(R.id.hunger_bank_amount);
        this.f5968G.setTypeface(this.f5962A);
        this.f5972K = (LinearLayout) findViewById(R.id.bank_info_b);
        this.f5973L = findViewById(R.id.bank_d);
        this.f5970I = (TextView) findViewById(R.id.bank_info);
        this.f5970I.setTypeface(this.f5963B);
        this.f5971J = (TextView) findViewById(R.id.bank_edittext);
        this.f5971J.setTypeface(this.f5962A);
        this.f5974M = (Button) findViewById(R.id.bank_withdraw);
        this.f5974M.setTypeface(this.f5963B);
        this.f5975N = (Button) findViewById(R.id.bank_deposit);
        this.f5975N.setTypeface(this.f5963B);
        this.f5965D = (Button) findViewById(R.id.back);
        this.f5965D.setTypeface(this.f5963B);
        this.f5971J.setOnEditorActionListener(new C19442(this));
    }

    public void onDestroy() {
        super.onDestroy();
        Log.e("CentralBankActivity", "onDestroy");
        if (this.f5964C != null) {
            this.f5964C.m2047a();
        }
    }

    protected void onPause() {
        boolean z = true;
        super.onPause();
        Log.e("CentralBankActivity", "onPause");
        if (this.f5964C != null) {
            this.f5964C.m2049b();
        }
        if (this.f5983V != null) {
            this.f5983V.cancel();
        }
        if (this.f5984W != null) {
            this.f5984W.cancel();
        }
        if (this.f5985X != null) {
            this.f5985X.cancel();
        }
        if (this.f5986Y != null) {
            this.f5986Y.cancel();
        }
        if (this.f5987Z != null) {
            this.f5987Z.cancel();
        }
        if (this.aa != null) {
            this.aa.cancel();
        }
        if (this.f5977P != null) {
            this.f5977P.unload(this.f5978Q);
            this.f5977P.unload(this.f5979R);
            this.f5977P.release();
            this.f5977P = null;
        }
        this.f6008u = this.f5992e >= 100;
        this.f6009v = this.f5991d >= 1000;
        this.f6010w = this.f5991d >= 10000;
        this.f6011x = this.f5991d >= 100000;
        this.f6012y = this.f5991d >= 1000000;
        if (this.f5991d < 10000000) {
            z = false;
        }
        this.f6013z = z;
        m9718c();
    }

    public void onResume() {
        super.onResume();
        Log.e("CentralBankActivity", "onResume");
        if (this.f5964C != null) {
            this.f5964C.m2050c();
        }
        m9719d();
        m9721f();
        if (this.f5992e < 100) {
            this.f5970I.setText(getResources().getString(R.string.bank_info));
        } else if (this.f5993f == 1) {
            this.f5970I.setText(getResources().getString(R.string.bank_rate) + " " + String.valueOf(this.f5993f) + " day");
        } else if (this.f5993f > 1) {
            this.f5970I.setText(getResources().getString(R.string.bank_rate) + " " + String.valueOf(this.f5993f) + " days");
        } else if (this.f5993f < 1) {
            this.f5993f = 30;
            this.f5970I.setText(getResources().getString(R.string.bank_rate) + " " + String.valueOf(this.f5993f) + " days");
        }
        this.f5966E.setText("$" + String.format("%,d", new Object[]{Integer.valueOf(this.f5991d)}).replace(',', ' '));
        this.f5968G.setText("$" + String.format("%,d", new Object[]{Integer.valueOf(this.f5992e)}).replace(',', ' '));
    }
}
