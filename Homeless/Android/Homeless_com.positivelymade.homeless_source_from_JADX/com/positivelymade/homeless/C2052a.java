package com.positivelymade.homeless;

import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.app.C0018f;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
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
import java.net.URL;

public class C2052a extends C0018f implements C0650b, C0651c {
    public Typeface f6952a;
    public boolean aA;
    public boolean aB;
    public boolean aC;
    public boolean aD;
    public boolean aE;
    public int aF;
    public TextView aG;
    public ImageView aH;
    public ImageView aI;
    public LinearLayout aJ;
    public TextView aK;
    public Toast aL;
    private C1180c aM;
    private boolean aN;
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
    public Typeface f6953b;
    public ListView f6954c;
    public C2102m f6955d;
    public String f6956e;
    public String f6957f;
    public boolean f6958g;
    public boolean f6959h;
    public boolean f6960i;

    class C20411 implements OnItemClickListener {
        final /* synthetic */ C2052a f6937a;

        C20411(C2052a c2052a) {
            this.f6937a = c2052a;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            String a = ((C2103n) this.f6937a.f6955d.m10180a().get(i)).m10183a();
            Object obj = -1;
            switch (a.hashCode()) {
                case -268832185:
                    if (a.equals("Central Bank")) {
                        obj = 2;
                        break;
                    }
                    break;
                case 2314358:
                    if (a.equals("Jobs")) {
                        obj = null;
                        break;
                    }
                    break;
                case 649705971:
                    if (a.equals("Criminal Jobs")) {
                        obj = 1;
                        break;
                    }
                    break;
            }
            switch (obj) {
                case null:
                    this.f6937a.m102a(new Intent(this.f6937a.m130g(), JobActivity.class));
                    return;
                case 1:
                    this.f6937a.m102a(new Intent(this.f6937a.m130g(), CriminalJobActivity.class));
                    return;
                case 2:
                    this.f6937a.m102a(new Intent(this.f6937a.m130g(), CentralBankActivity.class));
                    return;
                default:
                    return;
            }
        }
    }

    class C20422 implements C1105h<C1766a> {
        final /* synthetic */ C2052a f6938a;

        C20422(C2052a c2052a) {
            this.f6938a = c2052a;
        }

        public void m10061a(C1766a c1766a) {
            if (c1766a.mo558a().m5972f() == 0) {
                this.f6938a.au = true;
                Log.e("BusinessFragment", "A10");
            }
        }
    }

    class C20433 implements C1105h<C1766a> {
        final /* synthetic */ C2052a f6939a;

        C20433(C2052a c2052a) {
            this.f6939a = c2052a;
        }

        public void m10063a(C1766a c1766a) {
            if (c1766a.mo558a().m5972f() == 0) {
                this.f6939a.aw = true;
                Log.e("BusinessFragment", "A11");
            }
        }
    }

    class C20444 implements C1105h<C1766a> {
        final /* synthetic */ C2052a f6940a;

        C20444(C2052a c2052a) {
            this.f6940a = c2052a;
        }

        public void m10065a(C1766a c1766a) {
            if (c1766a.mo558a().m5972f() == 0) {
                this.f6940a.ay = true;
                Log.e("BusinessFragment", "A12");
            }
        }
    }

    class C20455 implements OnClickListener {
        final /* synthetic */ C2052a f6941a;

        C20455(C2052a c2052a) {
            this.f6941a = c2052a;
        }

        public void onClick(View view) {
            this.f6941a.m102a(new Intent(this.f6941a.m130g(), GoogleActivity.class));
        }
    }

    class C20476 implements Runnable {
        final /* synthetic */ C2052a f6946a;

        C20476(C2052a c2052a) {
            this.f6946a = c2052a;
        }

        public void run() {
            Bitmap decodeResource = BitmapFactory.decodeResource(this.f6946a.m132h(), R.drawable.job_image1);
            final C2103n c2103n = new C2103n();
            c2103n.m10185a(this.f6946a.m97a((int) R.string.business_job_1));
            c2103n.m10184a(Bitmap.createScaledBitmap(decodeResource, decodeResource.getWidth(), decodeResource.getHeight(), false));
            decodeResource = BitmapFactory.decodeResource(this.f6946a.m132h(), R.drawable.job_image2);
            final C2103n c2103n2 = new C2103n();
            c2103n2.m10185a(this.f6946a.m97a((int) R.string.business_job_2));
            c2103n2.m10184a(Bitmap.createScaledBitmap(decodeResource, decodeResource.getWidth(), decodeResource.getHeight(), false));
            decodeResource = BitmapFactory.decodeResource(this.f6946a.m132h(), R.drawable.job_image3);
            final C2103n c2103n3 = new C2103n();
            c2103n3.m10185a(this.f6946a.m97a((int) R.string.business_job_3));
            c2103n3.m10184a(Bitmap.createScaledBitmap(decodeResource, decodeResource.getWidth(), decodeResource.getHeight(), false));
            this.f6946a.m130g().runOnUiThread(new Runnable(this) {
                final /* synthetic */ C20476 f6945d;

                public void run() {
                    if (Looper.getMainLooper() == Looper.myLooper()) {
                        Log.e("BusinessFragment", "uBusiness runOnUiThread");
                        this.f6945d.f6946a.aG.setText(this.f6945d.f6946a.f6956e);
                        if (!this.f6945d.f6946a.f6957f.equals("")) {
                            new C2051a(this.f6945d.f6946a, this.f6945d.f6946a.aH).execute(new String[]{this.f6945d.f6946a.f6957f});
                        }
                        try {
                            this.f6945d.f6946a.f6955d.m10181a(c2103n);
                            this.f6945d.f6946a.f6955d.m10181a(c2103n2);
                            this.f6945d.f6946a.f6955d.m10181a(c2103n3);
                        } catch (Exception e) {
                            Log.e("BusinessFragment", "Error: " + e);
                        }
                    }
                }
            });
        }
    }

    class C20487 implements C1105h<C1766a> {
        final /* synthetic */ C2052a f6947a;

        C20487(C2052a c2052a) {
            this.f6947a = c2052a;
        }

        public void m10067a(C1766a c1766a) {
            if (c1766a.mo558a().m5972f() == 0) {
                this.f6947a.f6960i = true;
                Log.e("BusinessFragment", "A2");
            }
        }
    }

    class C20498 implements C1105h<C1766a> {
        final /* synthetic */ C2052a f6948a;

        C20498(C2052a c2052a) {
            this.f6948a = c2052a;
        }

        public void m10069a(C1766a c1766a) {
            if (c1766a.mo558a().m5972f() == 0) {
                this.f6948a.ak = true;
                Log.e("BusinessFragment", "A3");
            }
        }
    }

    class C20509 implements C1105h<C1766a> {
        final /* synthetic */ C2052a f6949a;

        C20509(C2052a c2052a) {
            this.f6949a = c2052a;
        }

        public void m10071a(C1766a c1766a) {
            if (c1766a.mo558a().m5972f() == 0) {
                this.f6949a.am = true;
                Log.e("BusinessFragment", "A4");
            }
        }
    }

    private class C2051a extends AsyncTask<String, Void, Bitmap> {
        ImageView f6950a;
        final /* synthetic */ C2052a f6951b;

        public C2051a(C2052a c2052a, ImageView imageView) {
            this.f6951b = c2052a;
            this.f6950a = imageView;
        }

        protected Bitmap m10072a(String... strArr) {
            Bitmap bitmap = null;
            try {
                bitmap = BitmapFactory.decodeStream(new URL(strArr[0]).openStream());
            } catch (Exception e) {
                Log.e("Error", e.getMessage());
                e.printStackTrace();
            }
            return bitmap;
        }

        protected void m10073a(Bitmap bitmap) {
            this.f6950a.setImageBitmap(bitmap);
        }

        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return m10072a((String[]) objArr);
        }

        protected /* synthetic */ void onPostExecute(Object obj) {
            m10073a((Bitmap) obj);
        }
    }

    private void m10074M() {
        new Thread(new C20476(this)).start();
    }

    public static C0018f m10075b(int i) {
        C0018f c2052a = new C2052a();
        Bundle bundle = new Bundle();
        bundle.putInt("identify", i);
        c2052a.m131g(bundle);
        return c2052a;
    }

    public void m10076L() {
        SharedPreferences sharedPreferences = m130g().getSharedPreferences(m97a((int) R.string.preference_file_key), 0);
        this.f6958g = sharedPreferences.getBoolean("GOOGLE", false);
        this.f6956e = sharedPreferences.getString("NAME", "Unknown");
        this.f6957f = sharedPreferences.getString("IMAGE", "");
        this.aF = sharedPreferences.getInt("BANK", 0);
        this.f6959h = sharedPreferences.getBoolean("A2", false);
        this.f6960i = sharedPreferences.getBoolean("A2U", false);
        this.aj = sharedPreferences.getBoolean("A3", false);
        this.ak = sharedPreferences.getBoolean("A3U", false);
        this.al = sharedPreferences.getBoolean("A4", false);
        this.am = sharedPreferences.getBoolean("A4U", false);
        this.an = sharedPreferences.getBoolean("A5", false);
        this.ao = sharedPreferences.getBoolean("A5U", false);
        this.ap = sharedPreferences.getBoolean("A7", false);
        this.aq = sharedPreferences.getBoolean("A7U", false);
        this.ar = sharedPreferences.getBoolean("A8", false);
        this.as = sharedPreferences.getBoolean("A8U", false);
        this.at = sharedPreferences.getBoolean("A10", false);
        this.au = sharedPreferences.getBoolean("A10U", false);
        this.av = sharedPreferences.getBoolean("A11", false);
        this.aw = sharedPreferences.getBoolean("A11U", false);
        this.ax = sharedPreferences.getBoolean("A12", false);
        this.ay = sharedPreferences.getBoolean("A12U", false);
        this.az = sharedPreferences.getBoolean("A12L", false);
        this.aA = sharedPreferences.getBoolean("A12T", false);
        this.aB = sharedPreferences.getBoolean("A12W", false);
        this.aC = sharedPreferences.getBoolean("A12E", false);
        this.aD = sharedPreferences.getBoolean("A12C", false);
        this.aE = sharedPreferences.getBoolean("A12S", false);
    }

    public View mo1679a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log.e("BusinessFragment", "onCreateView");
        View inflate = layoutInflater.inflate(R.layout.fragment_business, viewGroup, false);
        this.f6952a = Typeface.createFromAsset(m130g().getAssets(), "fonts/caviar_dreams.ttf");
        this.f6953b = Typeface.createFromAsset(m130g().getAssets(), "fonts/caviar_dreams_bold.ttf");
        this.aL = Toast.makeText(m130g(), "", 1);
        this.aG = (TextView) inflate.findViewById(R.id.profile_name);
        this.aG.setTypeface(this.f6953b);
        this.aH = (ImageView) inflate.findViewById(R.id.profile_image);
        this.aI = (ImageView) inflate.findViewById(R.id.google_image);
        this.aK = (TextView) inflate.findViewById(R.id.google_text);
        this.aK.setTypeface(this.f6953b);
        this.aJ = (LinearLayout) inflate.findViewById(R.id.google);
        this.f6954c = (ListView) inflate.findViewById(R.id.list);
        this.f6955d = new C2102m(inflate.getContext());
        this.f6954c.setAdapter(this.f6955d);
        this.f6954c.setOnItemClickListener(new C20411(this));
        this.aJ.setOnClickListener(new C20455(this));
        return inflate;
    }

    public void m10078a() {
        Editor edit = m130g().getSharedPreferences(m97a((int) R.string.preference_file_key), 0).edit();
        edit.putBoolean("GOOGLE", this.f6958g);
        edit.putString("NAME", this.f6956e);
        edit.putString("IMAGE", this.f6957f);
        edit.putInt("BANK", this.aF);
        edit.putBoolean("A2", this.f6959h);
        edit.putBoolean("A2U", this.f6960i);
        edit.putBoolean("A3", this.aj);
        edit.putBoolean("A3U", this.ak);
        edit.putBoolean("A4", this.al);
        edit.putBoolean("A4U", this.am);
        edit.putBoolean("A5", this.an);
        edit.putBoolean("A5U", this.ao);
        edit.putBoolean("A7", this.ap);
        edit.putBoolean("A7U", this.aq);
        edit.putBoolean("A8", this.ar);
        edit.putBoolean("A8U", this.as);
        edit.putBoolean("A10", this.at);
        edit.putBoolean("A10U", this.au);
        edit.putBoolean("A11", this.av);
        edit.putBoolean("A11U", this.aw);
        edit.putBoolean("A12", this.ax);
        edit.putBoolean("A12U", this.ay);
        edit.putBoolean("A12L", this.az);
        edit.putBoolean("A12T", this.aA);
        edit.putBoolean("A12W", this.aB);
        edit.putBoolean("A12E", this.aC);
        edit.putBoolean("A12C", this.aD);
        edit.putBoolean("A12S", this.aE);
        edit.apply();
    }

    public void mo890a(int i, int i2, Intent intent) {
        super.mo890a(i, i2, intent);
        if (i == 9001) {
            Log.e("BusinessFragment", "RC_SIGN_IN - " + i2);
            this.aN = false;
            if (i2 == -1) {
                Log.e("BusinessFragment", "RC_SIGN_IN - RESULT_OK");
                if (!this.aM.mo888d()) {
                    this.aM.mo883b();
                }
            } else if (i2 == 0) {
                Log.e("BusinessFragment", "RC_SIGN_IN - RESULT_CANCELED");
                m130g().finish();
            } else if (i2 == 10002) {
                Log.e("BusinessFragment", "RC_SIGN_IN - RESULT_SIGN_IN_FAILED");
                m10081a(this.aL, m132h().getString(R.string.google_play_problem), (int) R.drawable.notice);
                if (!this.aM.mo888d()) {
                    this.aM.mo883b();
                }
            }
        }
    }

    public void mo503a(Bundle bundle) {
        Log.e("BusinessFragment", "onConnected(): mGoogleApiClient");
        this.f6958g = true;
        if (C1889d.f5748g.mo832a(this.aM) != null) {
            C1886a a = C1889d.f5748g.mo832a(this.aM);
            this.f6956e = a.mo1654e();
            this.f6957f = a.mo1655f().mo1653e();
            this.aG.setText(this.f6956e);
            if (!this.f6957f.equals("")) {
                new C2051a(this, this.aH).execute(new String[]{this.f6957f});
            }
        }
        this.aI.setImageResource(R.drawable.google_plus_active);
        this.aK.setText(R.string.sign_out);
        if (this.f6959h && !this.f6960i) {
            C1776b.f5520g.mo1254a(this.aM, m132h().getString(R.string.achievements_a2)).mo565a(new C20487(this));
        }
        if (this.aj && !this.ak) {
            C1776b.f5520g.mo1254a(this.aM, m132h().getString(R.string.achievements_a3)).mo565a(new C20498(this));
        }
        if (this.al && !this.am) {
            C1776b.f5520g.mo1254a(this.aM, m132h().getString(R.string.achievements_a4)).mo565a(new C20509(this));
        }
        if (this.an && !this.ao) {
            C1776b.f5520g.mo1254a(this.aM, m132h().getString(R.string.achievements_a5)).mo565a(new C1105h<C1766a>(this) {
                final /* synthetic */ C2052a f6934a;

                {
                    this.f6934a = r1;
                }

                public void m10055a(C1766a c1766a) {
                    if (c1766a.mo558a().m5972f() == 0) {
                        this.f6934a.ao = true;
                        Log.e("BusinessFragment", "A5");
                    }
                }
            });
        }
        if (this.ap && !this.aq) {
            C1776b.f5520g.mo1254a(this.aM, m132h().getString(R.string.achievements_a7)).mo565a(new C1105h<C1766a>(this) {
                final /* synthetic */ C2052a f6935a;

                {
                    this.f6935a = r1;
                }

                public void m10057a(C1766a c1766a) {
                    if (c1766a.mo558a().m5972f() == 0) {
                        this.f6935a.aq = true;
                        Log.e("BusinessFragment", "A7");
                    }
                }
            });
        }
        if (this.ar && !this.as) {
            C1776b.f5520g.mo1254a(this.aM, m132h().getString(R.string.achievements_a8)).mo565a(new C1105h<C1766a>(this) {
                final /* synthetic */ C2052a f6936a;

                {
                    this.f6936a = r1;
                }

                public void m10059a(C1766a c1766a) {
                    if (c1766a.mo558a().m5972f() == 0) {
                        this.f6936a.as = true;
                        Log.e("BusinessFragment", "A8");
                    }
                }
            });
        }
        if (this.at && !this.au) {
            C1776b.f5520g.mo1254a(this.aM, m132h().getString(R.string.achievements_a10)).mo565a(new C20422(this));
        }
        if (this.av && !this.aw) {
            C1776b.f5520g.mo1254a(this.aM, m132h().getString(R.string.achievements_a11)).mo565a(new C20433(this));
        }
        if (this.ax && !this.ay) {
            C1776b.f5520g.mo1254a(this.aM, m132h().getString(R.string.achievements_a12)).mo565a(new C20444(this));
        }
        m10078a();
    }

    public void m10081a(Toast toast, String str, int i) {
        View inflate = m130g().getLayoutInflater().inflate(R.layout.toast_message, (ViewGroup) m130g().findViewById(R.id.toast_layout_root));
        ((ImageView) inflate.findViewById(R.id.toast_image)).setImageResource(i);
        ((TextView) inflate.findViewById(R.id.toast_text)).setText(str);
        if (toast.getView().getWindowVisibility() != 0) {
            Log.e("BusinessFragment", "Exists");
            toast.setDuration(1);
        }
        toast.setGravity(16, 0, 0);
        toast.setView(inflate);
        toast.show();
    }

    public void mo504a(ConnectionResult connectionResult) {
        Log.e("BusinessFragment", "onConnectionFailed(): " + connectionResult.toString());
        this.f6958g = false;
        this.aI.setImageResource(R.drawable.google_plus_inactive);
        this.aK.setText(R.string.sign_in);
        if (!this.aN && connectionResult.m5960a()) {
            try {
                this.aN = true;
                m130g().startIntentSenderForResult(connectionResult.m5963d().getIntentSender(), 9001, null, 0, 0, 0);
            } catch (SendIntentException e) {
                this.aN = false;
                this.aM.mo883b();
            }
        }
    }

    public void a_(int i) {
        Log.e("BusinessFragment", "onConnectionSuspended(): mGoogleApiClient attempting to connect");
        this.aM.mo883b();
    }

    public void a_(Bundle bundle) {
        super.a_(bundle);
        Log.e("BusinessFragment", "onCreate");
        this.aM = new C1176a(m130g()).m5993a((C0650b) this).m5994a((C0651c) this).m5992a(C1889d.f5744c).m5991a(C1889d.f5745d).m5992a(C1776b.f5516c).m5991a(C1776b.f5515b).m5992a(C1631a.f5051f).m5991a(C1631a.f5048c).m5996b();
    }

    public void mo14d() {
        super.mo14d();
        Log.e("BusinessFragment", "onStop");
        this.aM.mo887c();
    }

    public void mo1680p() {
        super.mo1680p();
        Log.e("BusinessFragment", "onResume");
        m10076L();
        this.f6955d.m10182b();
        m10074M();
        if (this.f6958g) {
            this.f6958g = true;
            this.aI.setImageResource(R.drawable.google_plus_active);
            this.aK.setText(R.string.sign_out);
        } else {
            this.f6958g = false;
            this.f6956e = "Unknown";
            this.f6957f = "";
            this.aG.setText(this.f6956e);
            this.aH.setImageResource(R.drawable.logo2);
            this.aI.setImageResource(R.drawable.google_plus_inactive);
            this.aK.setText(R.string.sign_in);
        }
        if (this.az && this.aA && this.aB && this.aC && this.aD && this.aE && this.aF >= 100) {
            this.ax = true;
        }
        if (this.f6958g && this.f6959h && !this.f6960i) {
            this.aM.mo883b();
        } else if (this.f6958g && this.aj && !this.ak) {
            this.aM.mo883b();
        } else if (this.f6958g && this.al && !this.am) {
            this.aM.mo883b();
        } else if (this.f6958g && this.an && !this.ao) {
            this.aM.mo883b();
        } else if (this.f6958g && this.ap && !this.aq) {
            this.aM.mo883b();
        } else if (this.f6958g && this.ar && !this.as) {
            this.aM.mo883b();
        } else if (this.f6958g && this.at && !this.au) {
            this.aM.mo883b();
        } else if (this.f6958g && this.av && !this.aw) {
            this.aM.mo883b();
        } else if (this.f6958g && this.ax && !this.ay) {
            this.aM.mo883b();
        }
    }

    public void mo1681q() {
        Log.e("BusinessFragment", "onPause");
        m10078a();
        super.mo1681q();
    }
}
