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

public class C2060b extends C0018f implements C0650b, C0651c {
    public Typeface f6972a;
    public boolean aj;
    public boolean ak;
    public boolean al;
    public boolean am;
    public boolean an;
    public boolean ao;
    public boolean ap;
    public boolean aq;
    public int ar;
    public TextView as;
    public ImageView at;
    public ImageView au;
    public LinearLayout av;
    public TextView aw;
    public Toast ax;
    private C1180c ay;
    private boolean az;
    public Typeface f6973b;
    public ListView f6974c;
    public C2099k f6975d;
    public String f6976e;
    public String f6977f;
    public boolean f6978g;
    public boolean f6979h;
    public boolean f6980i;

    class C20531 implements OnItemClickListener {
        final /* synthetic */ C2060b f6961a;

        C20531(C2060b c2060b) {
            this.f6961a = c2060b;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            String a = ((C2100l) this.f6961a.f6975d.m10173a().get(i)).m10176a();
            Object obj = -1;
            switch (a.hashCode()) {
                case -1790063159:
                    if (a.equals("Special Skills")) {
                        obj = 2;
                        break;
                    }
                    break;
                case 1713211272:
                    if (a.equals("Education")) {
                        obj = null;
                        break;
                    }
                    break;
                case 1851353759:
                    if (a.equals("Criminal Skills")) {
                        obj = 1;
                        break;
                    }
                    break;
            }
            switch (obj) {
                case null:
                    this.f6961a.m102a(new Intent(this.f6961a.m130g(), EducationActivity.class));
                    return;
                case 1:
                    this.f6961a.m102a(new Intent(this.f6961a.m130g(), CriminalSkillsActivity.class));
                    return;
                case 2:
                    this.f6961a.m102a(new Intent(this.f6961a.m130g(), SpecialSkillsActivity.class));
                    return;
                default:
                    return;
            }
        }
    }

    class C20542 implements OnClickListener {
        final /* synthetic */ C2060b f6962a;

        C20542(C2060b c2060b) {
            this.f6962a = c2060b;
        }

        public void onClick(View view) {
            this.f6962a.m102a(new Intent(this.f6962a.m130g(), GoogleActivity.class));
        }
    }

    class C20563 implements Runnable {
        final /* synthetic */ C2060b f6967a;

        C20563(C2060b c2060b) {
            this.f6967a = c2060b;
        }

        public void run() {
            Bitmap decodeResource = BitmapFactory.decodeResource(this.f6967a.m132h(), R.drawable.d_image1);
            final C2100l c2100l = new C2100l();
            c2100l.m10178a(this.f6967a.m97a((int) R.string.development_1));
            c2100l.m10177a(Bitmap.createScaledBitmap(decodeResource, decodeResource.getWidth(), decodeResource.getHeight(), false));
            decodeResource = BitmapFactory.decodeResource(this.f6967a.m132h(), R.drawable.d_image2);
            final C2100l c2100l2 = new C2100l();
            c2100l2.m10178a(this.f6967a.m97a((int) R.string.development_2));
            c2100l2.m10177a(Bitmap.createScaledBitmap(decodeResource, decodeResource.getWidth(), decodeResource.getHeight(), false));
            decodeResource = BitmapFactory.decodeResource(this.f6967a.m132h(), R.drawable.d_image3);
            final C2100l c2100l3 = new C2100l();
            c2100l3.m10178a(this.f6967a.m97a((int) R.string.development_3));
            c2100l3.m10177a(Bitmap.createScaledBitmap(decodeResource, decodeResource.getWidth(), decodeResource.getHeight(), false));
            this.f6967a.m130g().runOnUiThread(new Runnable(this) {
                final /* synthetic */ C20563 f6966d;

                public void run() {
                    if (Looper.getMainLooper() == Looper.myLooper()) {
                        Log.e("DevelopmentFragment", "uDevelopment runOnUiThread");
                        this.f6966d.f6967a.as.setText(this.f6966d.f6967a.f6976e);
                        if (!this.f6966d.f6967a.f6977f.equals("")) {
                            new C2059a(this.f6966d.f6967a, this.f6966d.f6967a.at).execute(new String[]{this.f6966d.f6967a.f6977f});
                        }
                        try {
                            this.f6966d.f6967a.f6975d.m10174a(c2100l);
                            this.f6966d.f6967a.f6975d.m10174a(c2100l2);
                            this.f6966d.f6967a.f6975d.m10174a(c2100l3);
                        } catch (Exception e) {
                            Log.e("DevelopmentFragment", "Error: " + e);
                        }
                    }
                }
            });
        }
    }

    class C20574 implements C1105h<C1766a> {
        final /* synthetic */ C2060b f6968a;

        C20574(C2060b c2060b) {
            this.f6968a = c2060b;
        }

        public void m10087a(C1766a c1766a) {
            if (c1766a.mo558a().m5972f() == 0) {
                this.f6968a.f6980i = true;
                Log.e("DevelopmentFragment", "A1");
            }
        }
    }

    class C20585 implements C1105h<C1766a> {
        final /* synthetic */ C2060b f6969a;

        C20585(C2060b c2060b) {
            this.f6969a = c2060b;
        }

        public void m10089a(C1766a c1766a) {
            if (c1766a.mo558a().m5972f() == 0) {
                this.f6969a.ak = true;
                Log.e("DevelopmentFragment", "A12");
            }
        }
    }

    private class C2059a extends AsyncTask<String, Void, Bitmap> {
        ImageView f6970a;
        final /* synthetic */ C2060b f6971b;

        public C2059a(C2060b c2060b, ImageView imageView) {
            this.f6971b = c2060b;
            this.f6970a = imageView;
        }

        protected Bitmap m10090a(String... strArr) {
            Bitmap bitmap = null;
            try {
                bitmap = BitmapFactory.decodeStream(new URL(strArr[0]).openStream());
            } catch (Exception e) {
                Log.e("Error", e.getMessage());
                e.printStackTrace();
            }
            return bitmap;
        }

        protected void m10091a(Bitmap bitmap) {
            this.f6970a.setImageBitmap(bitmap);
        }

        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return m10090a((String[]) objArr);
        }

        protected /* synthetic */ void onPostExecute(Object obj) {
            m10091a((Bitmap) obj);
        }
    }

    private void m10092M() {
        new Thread(new C20563(this)).start();
    }

    public static C0018f m10093b(int i) {
        C0018f c2060b = new C2060b();
        Bundle bundle = new Bundle();
        bundle.putInt("identify", i);
        c2060b.m131g(bundle);
        return c2060b;
    }

    public void m10094L() {
        SharedPreferences sharedPreferences = m130g().getSharedPreferences(m97a((int) R.string.preference_file_key), 0);
        this.aj = sharedPreferences.getBoolean("A12", false);
        this.ak = sharedPreferences.getBoolean("A12U", false);
        this.al = sharedPreferences.getBoolean("A12L", false);
        this.am = sharedPreferences.getBoolean("A12T", false);
        this.an = sharedPreferences.getBoolean("A12W", false);
        this.ao = sharedPreferences.getBoolean("A12E", false);
        this.ap = sharedPreferences.getBoolean("A12C", false);
        this.aq = sharedPreferences.getBoolean("A12S", false);
        this.ar = sharedPreferences.getInt("BANK", 0);
        this.f6978g = sharedPreferences.getBoolean("GOOGLE", false);
        this.f6976e = sharedPreferences.getString("NAME", "Unknown");
        this.f6977f = sharedPreferences.getString("IMAGE", "");
        this.f6979h = sharedPreferences.getBoolean("A1", false);
        this.f6980i = sharedPreferences.getBoolean("A1U", false);
    }

    public View mo1679a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_development, viewGroup, false);
        this.f6972a = Typeface.createFromAsset(m130g().getAssets(), "fonts/caviar_dreams.ttf");
        this.f6973b = Typeface.createFromAsset(m130g().getAssets(), "fonts/caviar_dreams_bold.ttf");
        this.ax = Toast.makeText(m130g(), "", 1);
        this.as = (TextView) inflate.findViewById(R.id.profile_name);
        this.as.setTypeface(this.f6973b);
        this.at = (ImageView) inflate.findViewById(R.id.profile_image);
        this.au = (ImageView) inflate.findViewById(R.id.google_image);
        this.aw = (TextView) inflate.findViewById(R.id.google_text);
        this.aw.setTypeface(this.f6973b);
        this.av = (LinearLayout) inflate.findViewById(R.id.google);
        this.f6974c = (ListView) inflate.findViewById(R.id.list);
        this.f6975d = new C2099k(inflate.getContext());
        this.f6974c.setAdapter(this.f6975d);
        this.f6974c.setOnItemClickListener(new C20531(this));
        this.av.setOnClickListener(new C20542(this));
        return inflate;
    }

    public void m10096a() {
        Editor edit = m130g().getSharedPreferences(m97a((int) R.string.preference_file_key), 0).edit();
        edit.putBoolean("A12", this.aj);
        edit.putBoolean("A12U", this.ak);
        edit.putBoolean("A12L", this.al);
        edit.putBoolean("A12T", this.am);
        edit.putBoolean("A12W", this.an);
        edit.putBoolean("A12E", this.ao);
        edit.putBoolean("A12C", this.ap);
        edit.putBoolean("A12S", this.aq);
        edit.putInt("BANK", this.ar);
        edit.putBoolean("GOOGLE", this.f6978g);
        edit.putString("NAME", this.f6976e);
        edit.putString("IMAGE", this.f6977f);
        edit.putBoolean("A1", this.f6979h);
        edit.putBoolean("A1U", this.f6980i);
        edit.apply();
    }

    public void mo890a(int i, int i2, Intent intent) {
        super.mo890a(i, i2, intent);
        if (i == 9001) {
            Log.e("DevelopmentFragment", "RC_SIGN_IN - " + i2);
            this.az = false;
            if (i2 == -1) {
                Log.e("DevelopmentFragment", "RC_SIGN_IN - RESULT_OK");
                if (!this.ay.mo888d()) {
                    this.ay.mo883b();
                }
            } else if (i2 == 0) {
                Log.e("DevelopmentFragment", "RC_SIGN_IN - RESULT_CANCELED");
                m130g().finish();
            } else if (i2 == 10002) {
                Log.e("DevelopmentFragment", "RC_SIGN_IN - RESULT_SIGN_IN_FAILED");
                m10099a(this.ax, m132h().getString(R.string.google_play_problem), (int) R.drawable.notice);
                if (!this.ay.mo888d()) {
                    this.ay.mo883b();
                }
            }
        }
    }

    public void mo503a(Bundle bundle) {
        Log.e("DevelopmentFragment", "onConnected(): mGoogleApiClient");
        this.f6978g = true;
        if (C1889d.f5748g.mo832a(this.ay) != null) {
            C1886a a = C1889d.f5748g.mo832a(this.ay);
            this.f6976e = a.mo1654e();
            this.f6977f = a.mo1655f().mo1653e();
            this.as.setText(this.f6976e);
            if (!this.f6977f.equals("")) {
                new C2059a(this, this.at).execute(new String[]{this.f6977f});
            }
        }
        this.au.setImageResource(R.drawable.google_plus_active);
        this.aw.setText(R.string.sign_out);
        if (this.f6979h && !this.f6980i) {
            C1776b.f5520g.mo1254a(this.ay, m132h().getString(R.string.achievements_a1)).mo565a(new C20574(this));
        }
        if (this.aj && !this.ak) {
            C1776b.f5520g.mo1254a(this.ay, m132h().getString(R.string.achievements_a12)).mo565a(new C20585(this));
        }
        m10096a();
    }

    public void m10099a(Toast toast, String str, int i) {
        View inflate = m130g().getLayoutInflater().inflate(R.layout.toast_message, (ViewGroup) m130g().findViewById(R.id.toast_layout_root));
        ((ImageView) inflate.findViewById(R.id.toast_image)).setImageResource(i);
        ((TextView) inflate.findViewById(R.id.toast_text)).setText(str);
        if (toast.getView().getWindowVisibility() != 0) {
            Log.e("DevelopmentFragment", "Exists");
            toast.setDuration(1);
        }
        toast.setGravity(16, 0, 0);
        toast.setView(inflate);
        toast.show();
    }

    public void mo504a(ConnectionResult connectionResult) {
        Log.e("DevelopmentFragment", "onConnectionFailed(): " + connectionResult.toString());
        this.f6978g = false;
        this.au.setImageResource(R.drawable.google_plus_inactive);
        this.aw.setText(R.string.sign_in);
        if (!this.az && connectionResult.m5960a()) {
            try {
                this.az = true;
                m130g().startIntentSenderForResult(connectionResult.m5963d().getIntentSender(), 9001, null, 0, 0, 0);
            } catch (SendIntentException e) {
                this.az = false;
                this.ay.mo883b();
            }
        }
    }

    public void a_(int i) {
        Log.e("DevelopmentFragment", "onConnectionSuspended(): mGoogleApiClient attempting to connect");
        this.ay.mo883b();
    }

    public void a_(Bundle bundle) {
        super.a_(bundle);
        Log.e("DevelopmentFragment", "onCreate");
        this.ay = new C1176a(m130g()).m5993a((C0650b) this).m5994a((C0651c) this).m5992a(C1889d.f5744c).m5991a(C1889d.f5745d).m5992a(C1776b.f5516c).m5991a(C1776b.f5515b).m5992a(C1631a.f5051f).m5991a(C1631a.f5048c).m5996b();
    }

    public void mo14d() {
        super.mo14d();
        Log.e("DevelopmentFragment", "onStop");
        this.ay.mo887c();
    }

    public void mo1680p() {
        super.mo1680p();
        Log.e("DevelopmentFragment", "onResume");
        m10094L();
        this.f6975d.m10175b();
        m10092M();
        if (this.f6978g) {
            this.f6978g = true;
            this.au.setImageResource(R.drawable.google_plus_active);
            this.aw.setText(R.string.sign_out);
        } else {
            this.f6978g = false;
            this.f6976e = "Unknown";
            this.f6977f = "";
            this.as.setText(this.f6976e);
            this.at.setImageResource(R.drawable.logo2);
            this.au.setImageResource(R.drawable.google_plus_inactive);
            this.aw.setText(R.string.sign_in);
        }
        if (this.al && this.am && this.an && this.ao && this.ap && this.aq && this.ar >= 100) {
            this.aj = true;
        }
        if (this.f6978g && this.f6979h && !this.f6980i) {
            this.ay.mo883b();
        } else if (this.f6978g && this.aj && !this.ak) {
            this.ay.mo883b();
        }
    }

    public void mo1681q() {
        Log.e("DevelopmentFragment", "onPause");
        m10096a();
        super.mo1681q();
    }
}
