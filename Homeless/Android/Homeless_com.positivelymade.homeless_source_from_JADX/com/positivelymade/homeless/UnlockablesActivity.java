package com.positivelymade.homeless;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnShowListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Typeface;
import android.media.AudioManager;
import android.media.SoundPool;
import android.media.SoundPool.OnLoadCompleteListener;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.C0427a;
import com.google.android.gms.ads.C0476c.C0472a;
import com.google.android.gms.ads.C0486e;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

public class UnlockablesActivity extends Activity {
    public int f6839A;
    public C0486e f6840B;
    public ProgressDialog f6841C;
    HttpClient f6842D;
    HttpPost f6843E;
    List<NameValuePair> f6844F;
    public Toast f6845G;
    public Toast f6846H;
    public Toast f6847I;
    public AudioManager f6848J;
    public SoundPool f6849K;
    public int f6850L;
    public float f6851M;
    public boolean f6852N;
    public Typeface f6853a;
    public Typeface f6854b;
    public AdView f6855c;
    public Button f6856d;
    public TextView f6857e;
    public TextView f6858f;
    public TextView f6859g;
    public TextView f6860h;
    public TextView f6861i;
    public TextView f6862j;
    public TextView f6863k;
    public Spinner f6864l;
    public Button f6865m;
    public Button f6866n;
    public EditText f6867o;
    public LinearLayout f6868p;
    public LinearLayout f6869q;
    public View f6870r;
    public String f6871s;
    public String f6872t;
    public String f6873u;
    public boolean f6874v;
    public boolean f6875w;
    public boolean f6876x;
    public int f6877y;
    public int f6878z;

    class C20291 extends C0427a {
        final /* synthetic */ UnlockablesActivity f6830a;

        C20291(UnlockablesActivity unlockablesActivity) {
            this.f6830a = unlockablesActivity;
        }

        public void mo322a() {
            Log.e("UnlockablesActivity", "Google onAdLoaded");
        }

        public void mo323a(int i) {
            Log.e("UnlockablesActivity", "Google onAdFailedToLoad: " + this.f6830a.m10017b(i));
        }

        public void mo324b() {
            Log.e("UnlockablesActivity", "Google onAdOpened");
        }

        public void mo325c() {
            Log.e("UnlockablesActivity", "Google onAdClosed");
        }

        public void mo326d() {
            Log.d("UnlockablesActivity", "Google onAdLeftApplication");
        }
    }

    class C20302 implements Runnable {
        final /* synthetic */ UnlockablesActivity f6831a;

        C20302(UnlockablesActivity unlockablesActivity) {
            this.f6831a = unlockablesActivity;
        }

        public void run() {
            this.f6831a.m10033f();
        }
    }

    class C20313 implements Runnable {
        final /* synthetic */ UnlockablesActivity f6832a;

        C20313(UnlockablesActivity unlockablesActivity) {
            this.f6832a = unlockablesActivity;
        }

        public void run() {
            this.f6832a.m10033f();
        }
    }

    class C20324 implements OnClickListener {
        final /* synthetic */ UnlockablesActivity f6833a;

        C20324(UnlockablesActivity unlockablesActivity) {
            this.f6833a = unlockablesActivity;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    class C20335 implements OnShowListener {
        final /* synthetic */ UnlockablesActivity f6834a;

        C20335(UnlockablesActivity unlockablesActivity) {
            this.f6834a = unlockablesActivity;
        }

        public void onShow(DialogInterface dialogInterface) {
            ((AlertDialog) dialogInterface).getButton(-1).setTypeface(this.f6834a.f6854b);
        }
    }

    class C20346 implements OnClickListener {
        final /* synthetic */ UnlockablesActivity f6835a;

        C20346(UnlockablesActivity unlockablesActivity) {
            this.f6835a = unlockablesActivity;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    class C20357 implements OnShowListener {
        final /* synthetic */ UnlockablesActivity f6836a;

        C20357(UnlockablesActivity unlockablesActivity) {
            this.f6836a = unlockablesActivity;
        }

        public void onShow(DialogInterface dialogInterface) {
            ((AlertDialog) dialogInterface).getButton(-1).setTypeface(this.f6836a.f6854b);
        }
    }

    class C20368 implements OnClickListener {
        final /* synthetic */ UnlockablesActivity f6837a;

        C20368(UnlockablesActivity unlockablesActivity) {
            this.f6837a = unlockablesActivity;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    class C20379 implements OnShowListener {
        final /* synthetic */ UnlockablesActivity f6838a;

        C20379(UnlockablesActivity unlockablesActivity) {
            this.f6838a = unlockablesActivity;
        }

        public void onShow(DialogInterface dialogInterface) {
            ((AlertDialog) dialogInterface).getButton(-1).setTypeface(this.f6838a.f6854b);
        }
    }

    private String m10017b(int i) {
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

    private String m10018c(String str) {
        return ("" + str.substring(1)).replace(".", "\n");
    }

    private String m10019l() {
        String str = "";
        for (Account account : ((AccountManager) getSystemService("account")).getAccounts()) {
            if (account.type.equalsIgnoreCase("com.google")) {
                return account.name;
            }
        }
        return str;
    }

    private String m10020m() {
        return new SimpleDateFormat("dd-MM-yy", Locale.ENGLISH).format(Calendar.getInstance().getTime());
    }

    public void m10021a() {
        Editor edit = getApplicationContext().getSharedPreferences(getString(R.string.preference_file_key), 0).edit();
        edit.putString("DATES", this.f6873u);
        edit.putString("CODES", this.f6872t);
        edit.putString("NAME", this.f6871s);
        edit.putInt("CASH", this.f6877y);
        edit.putInt("MONEY", this.f6878z);
        edit.putBoolean("VOLUME", this.f6876x);
        edit.putBoolean("CAR", this.f6874v);
        edit.putInt("CAR_NO", this.f6839A);
        edit.putBoolean("UNIVERSITY", this.f6875w);
        edit.apply();
    }

    public void m10022a(int i) {
        View inflate = getLayoutInflater().inflate(R.layout.lottery_dialog, new LinearLayout(getApplicationContext()), false);
        Builder builder = new Builder(this);
        builder.setCustomTitle(getLayoutInflater().inflate(R.layout.lottery_title, new RelativeLayout(getApplicationContext()), false));
        builder.setView(inflate);
        builder.setCancelable(false);
        TextView textView = (TextView) inflate.findViewById(R.id.lottery_dialog);
        textView.setTypeface(this.f6854b);
        textView.setText(getResources().getString(R.string.unlock_lottery_dialog) + "\n\nYou Won $" + String.valueOf(i) + " Cash!");
        builder.setPositiveButton("Continue", new C20324(this));
        Dialog create = builder.create();
        create.setOnShowListener(new C20335(this));
        create.getWindow().setSoftInputMode(4);
        create.show();
        create.findViewById(create.getContext().getResources().getIdentifier("android:id/titleDivider", null, null)).setBackgroundColor(getResources().getColor(R.color.greyc));
        ((TextView) create.findViewById(R.id.lottery_title)).setTypeface(this.f6854b);
    }

    public void m10023a(Toast toast, String str, int i) {
        View inflate = getLayoutInflater().inflate(R.layout.toast_message, (ViewGroup) findViewById(R.id.toast_layout_root));
        ((ImageView) inflate.findViewById(R.id.toast_image)).setImageResource(i);
        ((TextView) inflate.findViewById(R.id.toast_text)).setText(str);
        if (toast.getView().getWindowVisibility() != 0) {
            Log.e("UnlockablesActivity", "Exists");
            toast.setDuration(1);
        }
        toast.setGravity(16, 0, 0);
        toast.setView(inflate);
        toast.show();
    }

    public void m10024a(final String str, String str2) {
        View inflate = getLayoutInflater().inflate(R.layout.payment_dialog, new LinearLayout(getApplicationContext()), false);
        Builder builder = new Builder(this);
        builder.setCustomTitle(getLayoutInflater().inflate(R.layout.payment_title, new RelativeLayout(getApplicationContext()), false));
        builder.setView(inflate);
        builder.setCancelable(false);
        TextView textView = (TextView) inflate.findViewById(R.id.payment_dialog);
        textView.setTypeface(this.f6854b);
        textView.setText(getResources().getString(R.string.unlock_payment_dialog1) + "(" + str2 + ")" + getResources().getString(R.string.unlock_payment_dialog2));
        builder.setPositiveButton("Continue", new OnClickListener(this) {
            final /* synthetic */ UnlockablesActivity f6817b;

            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                this.f6817b.startActivity(intent);
            }
        });
        builder.setNegativeButton("Cancel", new OnClickListener(this) {
            final /* synthetic */ UnlockablesActivity f6818a;

            {
                this.f6818a = r1;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        Dialog create = builder.create();
        create.setOnShowListener(new OnShowListener(this) {
            final /* synthetic */ UnlockablesActivity f6819a;

            {
                this.f6819a = r1;
            }

            public void onShow(DialogInterface dialogInterface) {
                AlertDialog alertDialog = (AlertDialog) dialogInterface;
                alertDialog.getButton(-1).setTypeface(this.f6819a.f6854b);
                alertDialog.getButton(-2).setTypeface(this.f6819a.f6854b);
            }
        });
        create.getWindow().setSoftInputMode(4);
        create.show();
        create.findViewById(create.getContext().getResources().getIdentifier("android:id/titleDivider", null, null)).setBackgroundColor(getResources().getColor(R.color.greyc));
        ((TextView) create.findViewById(R.id.payment_title)).setTypeface(this.f6854b);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void m10025a(java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        /*
        r8 = this;
        r6 = 2500; // 0x9c4 float:3.503E-42 double:1.235E-320;
        r4 = 2130837632; // 0x7f020080 float:1.7280224E38 double:1.052773671E-314;
        r5 = 100000; // 0x186a0 float:1.4013E-40 double:4.94066E-319;
        r3 = 1;
        r1 = 0;
        r0 = r11.toLowerCase();
        r2 = r10.toLowerCase();
        r0 = r0.contains(r2);
        if (r0 == 0) goto L_0x015d;
    L_0x0018:
        r0 = r8.f6872t;
        r0 = r0.toLowerCase();
        r2 = r9.toLowerCase();
        r0 = r0.contains(r2);
        if (r0 != 0) goto L_0x0127;
    L_0x0028:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = r8.f6872t;
        r0 = r0.append(r2);
        r2 = ".";
        r0 = r0.append(r2);
        r0 = r0.append(r9);
        r0 = r0.toString();
        r8.f6872t = r0;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = r8.f6873u;
        r0 = r0.append(r2);
        r2 = ".";
        r0 = r0.append(r2);
        r2 = r8.m10020m();
        r0 = r0.append(r2);
        r0 = r0.toString();
        r8.f6873u = r0;
        r0 = r8.f6868p;
        r0.setVisibility(r1);
        r0 = r8.f6869q;
        r0.setVisibility(r1);
        r0 = r8.f6870r;
        r0.setVisibility(r1);
        r0 = r8.f6862j;
        r2 = r8.f6872t;
        r2 = r8.m10018c(r2);
        r0.setText(r2);
        r0 = r8.f6863k;
        r2 = r8.f6873u;
        r2 = r8.m10018c(r2);
        r0.setText(r2);
        r0 = "";
        r2 = r9.length();
        r4 = 7;
        if (r2 != r4) goto L_0x009a;
    L_0x0090:
        r0 = r9.length();
        r0 = r0 + -2;
        r0 = r9.substring(r0);
    L_0x009a:
        r2 = -1;
        r4 = r0.hashCode();
        switch(r4) {
            case 1567: goto L_0x00b1;
            case 1568: goto L_0x00bb;
            case 1569: goto L_0x00c5;
            case 1570: goto L_0x00cf;
            case 1571: goto L_0x00d9;
            default: goto L_0x00a2;
        };
    L_0x00a2:
        r0 = r2;
    L_0x00a3:
        switch(r0) {
            case 0: goto L_0x00e3;
            case 1: goto L_0x00f5;
            case 2: goto L_0x0107;
            case 3: goto L_0x0115;
            case 4: goto L_0x0121;
            default: goto L_0x00a6;
        };
    L_0x00a6:
        r0 = r8.f6867o;
        r1 = "";
        r0.setText(r1);
    L_0x00ad:
        r8.m10021a();
        return;
    L_0x00b1:
        r4 = "10";
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x00a2;
    L_0x00b9:
        r0 = r1;
        goto L_0x00a3;
    L_0x00bb:
        r1 = "11";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x00a2;
    L_0x00c3:
        r0 = r3;
        goto L_0x00a3;
    L_0x00c5:
        r1 = "12";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x00a2;
    L_0x00cd:
        r0 = 2;
        goto L_0x00a3;
    L_0x00cf:
        r1 = "13";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x00a2;
    L_0x00d7:
        r0 = 3;
        goto L_0x00a3;
    L_0x00d9:
        r1 = "14";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x00a2;
    L_0x00e1:
        r0 = 4;
        goto L_0x00a3;
    L_0x00e3:
        r0 = r8.f6877y;
        r0 = r0 + 1000;
        r8.f6877y = r0;
        r0 = r8.f6878z;
        r0 = r0 + 1000;
        r8.f6878z = r0;
        r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r8.m10022a(r0);
        goto L_0x00a6;
    L_0x00f5:
        r0 = r8.f6877y;
        r0 = r0 + 10000;
        r8.f6877y = r0;
        r0 = r8.f6878z;
        r0 = r0 + 10000;
        r8.f6878z = r0;
        r0 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
        r8.m10022a(r0);
        goto L_0x00a6;
    L_0x0107:
        r0 = r8.f6877y;
        r0 = r0 + r5;
        r8.f6877y = r0;
        r0 = r8.f6878z;
        r0 = r0 + r5;
        r8.f6878z = r0;
        r8.m10022a(r5);
        goto L_0x00a6;
    L_0x0115:
        r8.f6874v = r3;
        r0 = r8.f6839A;
        r0 = r0 + 1;
        r8.f6839A = r0;
        r8.m10035h();
        goto L_0x00a6;
    L_0x0121:
        r8.f6875w = r3;
        r8.m10036i();
        goto L_0x00a6;
    L_0x0127:
        r0 = r8.f6846H;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = r8.getResources();
        r3 = 2131165614; // 0x7f0701ae float:1.794545E38 double:1.0529357155E-314;
        r2 = r2.getString(r3);
        r1 = r1.append(r2);
        r2 = " ";
        r1 = r1.append(r2);
        r1 = r1.append(r9);
        r1 = r1.toString();
        r8.m10023a(r0, r1, r4);
        r0 = new android.os.Handler;
        r0.<init>();
        r1 = new com.positivelymade.homeless.UnlockablesActivity$2;
        r1.<init>(r8);
        r0.postDelayed(r1, r6);
        goto L_0x00ad;
    L_0x015d:
        r0 = r8.f6847I;
        r1 = r8.getResources();
        r2 = 2131165612; // 0x7f0701ac float:1.7945446E38 double:1.0529357145E-314;
        r1 = r1.getString(r2);
        r8.m10023a(r0, r1, r4);
        r0 = new android.os.Handler;
        r0.<init>();
        r1 = new com.positivelymade.homeless.UnlockablesActivity$3;
        r1.<init>(r8);
        r0.postDelayed(r1, r6);
        goto L_0x00ad;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.positivelymade.homeless.UnlockablesActivity.a(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public boolean m10026a(String str) {
        if (!m10030c()) {
            return false;
        }
        boolean find = Pattern.compile("[^a-zA-Z0-9]").matcher(str).find();
        if (str.length() != 7 || find) {
            Log.e("UnlockablesActivity", "Redeem Code - Invalid");
            return false;
        }
        Log.e("UnlockablesActivity", "Redeem Code - Valid");
        return true;
    }

    public void m10027b() {
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences(getString(R.string.preference_file_key), 0);
        this.f6872t = sharedPreferences.getString("CODES", "");
        this.f6873u = sharedPreferences.getString("DATES", "");
        this.f6871s = sharedPreferences.getString("NAME", "Unknown");
        this.f6877y = sharedPreferences.getInt("CASH", 0);
        this.f6878z = sharedPreferences.getInt("MONEY", 0);
        this.f6876x = sharedPreferences.getBoolean("VOLUME", true);
        this.f6874v = sharedPreferences.getBoolean("CAR", false);
        this.f6839A = sharedPreferences.getInt("CAR_NO", 0);
        this.f6875w = sharedPreferences.getBoolean("UNIVERSITY", false);
    }

    void m10028b(final String str) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ UnlockablesActivity f6821b;

            public void run() {
                this.f6821b.f6841C = new ProgressDialog(this.f6821b, R.style.NewDialog);
                this.f6821b.f6841C.setCancelable(false);
                this.f6821b.f6841C.setProgressStyle(16973854);
                this.f6821b.f6841C.setMessage(str);
                this.f6821b.f6841C.show();
            }
        });
    }

    void m10029b(final String str, final String str2) {
        m10034g();
        m10028b("Validating Code...");
        new AsyncTask<Void, Void, String>(this) {
            final /* synthetic */ UnlockablesActivity f6828c;
            private final Handler f6829d = new C20281(this);

            class C20281 extends Handler {
                final /* synthetic */ AnonymousClass18 f6825a;

                C20281(AnonymousClass18 anonymousClass18) {
                    this.f6825a = anonymousClass18;
                }

                public void handleMessage(Message message) {
                    final String str = (String) message.obj;
                    new Handler().postDelayed(new Runnable(this) {
                        final /* synthetic */ C20281 f6824b;

                        public void run() {
                            this.f6824b.f6825a.f6828c.m10034g();
                            if (str.contains("Valid-New")) {
                                this.f6824b.f6825a.f6828c.m10025a(str, str2, str);
                            } else if (str.contains("Valid-Old")) {
                                this.f6824b.f6825a.f6828c.m10025a(str, str2, str);
                            } else {
                                this.f6824b.f6825a.f6828c.m10033f();
                            }
                        }
                    }, 1000);
                }
            }

            protected String m10008a(Void... voidArr) {
                String str;
                Exception e;
                String str2 = "";
                try {
                    this.f6828c.f6842D = new DefaultHttpClient();
                    this.f6828c.f6843E = new HttpPost("http://www.positivelymade.com/db/homeless-code.php");
                    this.f6828c.f6844F = new ArrayList(1);
                    this.f6828c.f6844F.add(new BasicNameValuePair("code", str));
                    this.f6828c.f6844F.add(new BasicNameValuePair("email", str2));
                    this.f6828c.f6844F.add(new BasicNameValuePair("name", this.f6828c.f6871s));
                    this.f6828c.f6843E.setEntity(new UrlEncodedFormEntity(this.f6828c.f6844F));
                    str = (String) this.f6828c.f6842D.execute(this.f6828c.f6843E, new BasicResponseHandler());
                    try {
                        Log.e("UnlockablesActivity", "Response: " + str);
                    } catch (Exception e2) {
                        e = e2;
                        Log.e("UnlockablesActivity", "Error: " + e.getMessage());
                        return str;
                    }
                } catch (Exception e3) {
                    Exception exception = e3;
                    str = str2;
                    e = exception;
                    Log.e("UnlockablesActivity", "Error: " + e.getMessage());
                    return str;
                }
                return str;
            }

            protected void m10009a(String str) {
                Message obtain;
                if (str.contains("Valid-Old")) {
                    try {
                        obtain = Message.obtain();
                        obtain.obj = str;
                        obtain.setTarget(this.f6829d);
                        obtain.sendToTarget();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else if (str.contains("Valid-New")) {
                    try {
                        obtain = Message.obtain();
                        obtain.obj = str;
                        obtain.setTarget(this.f6829d);
                        obtain.sendToTarget();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                } else {
                    try {
                        obtain = Message.obtain();
                        obtain.obj = "";
                        obtain.setTarget(this.f6829d);
                        obtain.sendToTarget();
                    } catch (Exception e22) {
                        e22.printStackTrace();
                    }
                }
            }

            protected /* synthetic */ Object doInBackground(Object[] objArr) {
                return m10008a((Void[]) objArr);
            }

            protected /* synthetic */ void onPostExecute(Object obj) {
                m10009a((String) obj);
            }
        }.execute(new Void[]{null, null, null});
    }

    public boolean m10030c() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    public void m10031d() {
        ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(getCurrentFocus() == null ? null : getCurrentFocus().getWindowToken(), 2);
    }

    void m10032e() {
        this.f6840B = new C0486e(this);
        this.f6840B.m2147a(getString(R.string.interstitial_ad_unit_id));
        this.f6840B.m2146a(new C0472a().m2094a());
    }

    void m10033f() {
        if (this.f6840B == null || !this.f6840B.m2148a()) {
            Log.e("UnlockablesActivity", "Ad Not Ready.");
        } else {
            this.f6840B.m2149b();
        }
    }

    void m10034g() {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ UnlockablesActivity f6822a;

            {
                this.f6822a = r1;
            }

            public void run() {
                if (this.f6822a.f6841C != null && this.f6822a.f6841C.isShowing()) {
                    this.f6822a.f6841C.dismiss();
                }
            }
        });
    }

    public void goBack(View view) {
        m10038k();
        finish();
    }

    public void m10035h() {
        View inflate = getLayoutInflater().inflate(R.layout.car_dialog, new LinearLayout(getApplicationContext()), false);
        Builder builder = new Builder(this);
        builder.setCustomTitle(getLayoutInflater().inflate(R.layout.car_title, new RelativeLayout(getApplicationContext()), false));
        builder.setView(inflate);
        builder.setCancelable(false);
        TextView textView = (TextView) inflate.findViewById(R.id.car_dialog);
        textView.setTypeface(this.f6854b);
        textView.setText(getResources().getString(R.string.unlock_car_dialog));
        builder.setPositiveButton("Continue", new C20346(this));
        Dialog create = builder.create();
        create.setOnShowListener(new C20357(this));
        create.getWindow().setSoftInputMode(4);
        create.show();
        create.findViewById(create.getContext().getResources().getIdentifier("android:id/titleDivider", null, null)).setBackgroundColor(getResources().getColor(R.color.greyc));
        ((TextView) create.findViewById(R.id.car_title)).setTypeface(this.f6854b);
    }

    public void m10036i() {
        View inflate = getLayoutInflater().inflate(R.layout.university_dialog, new LinearLayout(getApplicationContext()), false);
        Builder builder = new Builder(this);
        builder.setCustomTitle(getLayoutInflater().inflate(R.layout.university_title, new RelativeLayout(getApplicationContext()), false));
        builder.setView(inflate);
        builder.setCancelable(false);
        TextView textView = (TextView) inflate.findViewById(R.id.university_dialog);
        textView.setTypeface(this.f6854b);
        textView.setText(getResources().getString(R.string.unlock_university_dialog));
        builder.setPositiveButton("Continue", new C20368(this));
        Dialog create = builder.create();
        create.setOnShowListener(new C20379(this));
        create.getWindow().setSoftInputMode(4);
        create.show();
        create.findViewById(create.getContext().getResources().getIdentifier("android:id/titleDivider", null, null)).setBackgroundColor(getResources().getColor(R.color.greyc));
        ((TextView) create.findViewById(R.id.university_title)).setTypeface(this.f6854b);
    }

    public void m10037j() {
        if (this.f6876x) {
            this.f6848J = (AudioManager) getSystemService("audio");
            this.f6851M = ((float) this.f6848J.getStreamVolume(3)) / ((float) this.f6848J.getStreamMaxVolume(3));
            this.f6849K = new SoundPool(10, 3, 0);
            this.f6849K.setOnLoadCompleteListener(new OnLoadCompleteListener(this) {
                final /* synthetic */ UnlockablesActivity f6813a;

                {
                    this.f6813a = r1;
                }

                public void onLoadComplete(SoundPool soundPool, int i, int i2) {
                    Log.e("UnlockablesActivity", "Sound Loaded");
                    this.f6813a.f6852N = true;
                }
            });
            this.f6850L = this.f6849K.load(this, R.raw.click, 1);
            return;
        }
        Log.e("UnlockablesActivity", "Sound Not Loaded");
        this.f6852N = false;
    }

    public void m10038k() {
        try {
            this.f6849K.play(this.f6850L, this.f6851M, this.f6851M, 1, 0, 1.0f);
        } catch (Exception e) {
            Log.e("UnlockablesActivity", "Error Playing Sound");
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.e("UnlockablesActivity", "onCreate");
        setContentView(R.layout.activity_unlockables);
        this.f6853a = Typeface.createFromAsset(getAssets(), "fonts/caviar_dreams.ttf");
        this.f6854b = Typeface.createFromAsset(getAssets(), "fonts/caviar_dreams_bold.ttf");
        this.f6845G = Toast.makeText(this, "", 1);
        this.f6846H = Toast.makeText(this, "", 1);
        this.f6847I = Toast.makeText(this, "", 1);
        this.f6855c = (AdView) findViewById(R.id.adView);
        this.f6855c.setAdListener(new C20291(this));
        this.f6855c.m2048a(new C0472a().m2094a());
        this.f6856d = (Button) findViewById(R.id.back);
        this.f6856d.setTypeface(this.f6854b);
        this.f6857e = (TextView) findViewById(R.id.app_unlock_title);
        this.f6857e.setTypeface(this.f6854b);
        this.f6858f = (TextView) findViewById(R.id.unlock_title_text);
        this.f6858f.setTypeface(this.f6854b);
        this.f6859g = (TextView) findViewById(R.id.redeem_title_text);
        this.f6859g.setTypeface(this.f6854b);
        this.f6864l = (Spinner) findViewById(R.id.unlock_spinner);
        this.f6865m = (Button) findViewById(R.id.unlock_button);
        this.f6865m.setTypeface(this.f6854b);
        this.f6865m.setOnClickListener(new View.OnClickListener(this) {
            final /* synthetic */ UnlockablesActivity f6814a;

            {
                this.f6814a = r1;
            }

            public void onClick(View view) {
                String valueOf = String.valueOf(this.f6814a.f6864l.getSelectedItem());
                Object obj = -1;
                switch (valueOf.hashCode()) {
                    case -2099199740:
                        if (valueOf.equals("$100000 @ US$3.99")) {
                            obj = 2;
                            break;
                        }
                        break;
                    case -1794310353:
                        if (valueOf.equals("$10000   @ US$2.99")) {
                            obj = 1;
                            break;
                        }
                        break;
                    case -1756737289:
                        if (valueOf.equals("Car             @ US$1.99")) {
                            obj = 3;
                            break;
                        }
                        break;
                    case -169678384:
                        if (valueOf.equals("University @ US$2.99")) {
                            obj = 4;
                            break;
                        }
                        break;
                    case 632546694:
                        if (valueOf.equals("$1000     @ US$1.99")) {
                            obj = null;
                            break;
                        }
                        break;
                }
                switch (obj) {
                    case null:
                        this.f6814a.m10024a("http://smarturl.it/homeless-1000-cash", String.valueOf(this.f6814a.f6864l.getSelectedItem()));
                        return;
                    case 1:
                        this.f6814a.m10024a("http://smarturl.it/homeless-10000-cash", String.valueOf(this.f6814a.f6864l.getSelectedItem()));
                        return;
                    case 2:
                        this.f6814a.m10024a("http://smarturl.it/homeless-100000-cash", String.valueOf(this.f6814a.f6864l.getSelectedItem()));
                        return;
                    case 3:
                        this.f6814a.m10024a("http://smarturl.it/homeless-car", String.valueOf(this.f6814a.f6864l.getSelectedItem()));
                        return;
                    case 4:
                        this.f6814a.m10024a("http://smarturl.it/homeless-university", String.valueOf(this.f6814a.f6864l.getSelectedItem()));
                        return;
                    default:
                        return;
                }
            }
        });
        this.f6867o = (EditText) findViewById(R.id.redeem_edit);
        this.f6866n = (Button) findViewById(R.id.redeem_button);
        this.f6866n.setTypeface(this.f6854b);
        this.f6866n.setOnClickListener(new View.OnClickListener(this) {
            final /* synthetic */ UnlockablesActivity f6815a;

            {
                this.f6815a = r1;
            }

            public void onClick(View view) {
                this.f6815a.m10031d();
                String obj = this.f6815a.f6867o.getText().toString();
                if (!this.f6815a.m10030c()) {
                    this.f6815a.m10023a(this.f6815a.f6845G, this.f6815a.getResources().getString(R.string.no_internet), (int) R.drawable.notice);
                } else if (this.f6815a.m10026a(obj)) {
                    this.f6815a.m10029b(obj, this.f6815a.m10019l());
                } else {
                    this.f6815a.m10033f();
                }
            }
        });
        this.f6860h = (TextView) findViewById(R.id.unlocked_title);
        this.f6860h.setTypeface(this.f6854b);
        this.f6861i = (TextView) findViewById(R.id.unlocked_date);
        this.f6861i.setTypeface(this.f6854b);
        this.f6862j = (TextView) findViewById(R.id.unlocked_code_list_text);
        this.f6862j.setTypeface(this.f6853a);
        this.f6863k = (TextView) findViewById(R.id.unlocked_code_list_date);
        this.f6863k.setTypeface(this.f6853a);
        this.f6868p = (LinearLayout) findViewById(R.id.unlocked_code);
        this.f6870r = findViewById(R.id.unlocked_code_div);
        this.f6869q = (LinearLayout) findViewById(R.id.unlocked_code_list);
    }

    public void onDestroy() {
        super.onDestroy();
        Log.e("UnlockablesActivity", "onDestroy");
        if (this.f6855c != null) {
            this.f6855c.m2047a();
        }
    }

    protected void onPause() {
        super.onPause();
        Log.e("UnlockablesActivity", "onPause");
        if (this.f6855c != null) {
            this.f6855c.m2049b();
        }
        if (this.f6846H != null) {
            this.f6846H.cancel();
        }
        if (this.f6847I != null) {
            this.f6847I.cancel();
        }
        if (this.f6849K != null) {
            this.f6849K.unload(this.f6850L);
            this.f6849K.release();
            this.f6849K = null;
        }
        m10021a();
    }

    public void onResume() {
        super.onResume();
        Log.e("UnlockablesActivity", "onResume");
        if (this.f6855c != null) {
            this.f6855c.m2050c();
        }
        m10027b();
        m10037j();
        m10032e();
        if (this.f6872t.equals("")) {
            this.f6868p.setVisibility(8);
            this.f6869q.setVisibility(8);
            this.f6870r.setVisibility(8);
            return;
        }
        this.f6868p.setVisibility(0);
        this.f6869q.setVisibility(0);
        this.f6870r.setVisibility(0);
        this.f6862j.setText(m10018c(this.f6872t));
        this.f6863k.setText(m10018c(this.f6873u));
    }
}
