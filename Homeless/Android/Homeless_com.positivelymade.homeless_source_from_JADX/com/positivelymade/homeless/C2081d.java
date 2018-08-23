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

public class C2081d extends C0018f implements C0650b, C0651c {
    public Typeface f7022a;
    public Toast aA;
    private C1180c aB;
    private boolean aC;
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
    public int at;
    public TextView au;
    public ImageView av;
    public ImageView aw;
    public LinearLayout ax;
    public LinearLayout ay;
    public TextView az;
    public Typeface f7023b;
    public ListView f7024c;
    public C2102m f7025d;
    public String f7026e;
    public String f7027f;
    public boolean f7028g;
    public boolean f7029h;
    public boolean f7030i;

    class C20731 implements OnItemClickListener {
        final /* synthetic */ C2081d f7010a;

        C20731(C2081d c2081d) {
            this.f7010a = c2081d;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            String a = ((C2103n) this.f7010a.f7025d.m10180a().get(i)).m10183a();
            Object obj = -1;
            switch (a.hashCode()) {
                case -1707954628:
                    if (a.equals("Weapon")) {
                        obj = 2;
                        break;
                    }
                    break;
                case -1238034679:
                    if (a.equals("Transport")) {
                        obj = 1;
                        break;
                    }
                    break;
                case 2004163772:
                    if (a.equals("Lodging")) {
                        obj = null;
                        break;
                    }
                    break;
            }
            switch (obj) {
                case null:
                    this.f7010a.m102a(new Intent(this.f7010a.m130g(), LodgingActivity.class));
                    return;
                case 1:
                    this.f7010a.m102a(new Intent(this.f7010a.m130g(), TransportActivity.class));
                    return;
                case 2:
                    this.f7010a.m102a(new Intent(this.f7010a.m130g(), WeaponActivity.class));
                    return;
                default:
                    return;
            }
        }
    }

    class C20742 implements OnClickListener {
        final /* synthetic */ C2081d f7011a;

        C20742(C2081d c2081d) {
            this.f7011a = c2081d;
        }

        public void onClick(View view) {
            this.f7011a.m102a(new Intent(this.f7011a.m130g(), GoogleActivity.class));
        }
    }

    class C20763 implements Runnable {
        final /* synthetic */ C2081d f7016a;

        C20763(C2081d c2081d) {
            this.f7016a = c2081d;
        }

        public void run() {
            Bitmap decodeResource = BitmapFactory.decodeResource(this.f7016a.m132h(), R.drawable.p_image1);
            final C2103n c2103n = new C2103n();
            c2103n.m10185a(this.f7016a.m97a((int) R.string.possessions_1));
            c2103n.m10184a(Bitmap.createScaledBitmap(decodeResource, decodeResource.getWidth(), decodeResource.getHeight(), false));
            decodeResource = BitmapFactory.decodeResource(this.f7016a.m132h(), R.drawable.p_image2);
            final C2103n c2103n2 = new C2103n();
            c2103n2.m10185a(this.f7016a.m97a((int) R.string.possessions_2));
            c2103n2.m10184a(Bitmap.createScaledBitmap(decodeResource, decodeResource.getWidth(), decodeResource.getHeight(), false));
            decodeResource = BitmapFactory.decodeResource(this.f7016a.m132h(), R.drawable.p_image3);
            final C2103n c2103n3 = new C2103n();
            c2103n3.m10185a(this.f7016a.m97a((int) R.string.possessions_3));
            c2103n3.m10184a(Bitmap.createScaledBitmap(decodeResource, decodeResource.getWidth(), decodeResource.getHeight(), false));
            this.f7016a.m130g().runOnUiThread(new Runnable(this) {
                final /* synthetic */ C20763 f7015d;

                public void run() {
                    if (Looper.getMainLooper() == Looper.myLooper()) {
                        Log.e("PossessionsFragment", "uPossessions runOnUiThread");
                        this.f7015d.f7016a.au.setText(this.f7015d.f7016a.f7026e);
                        if (!this.f7015d.f7016a.f7027f.equals("")) {
                            new C2080a(this.f7015d.f7016a, this.f7015d.f7016a.av).execute(new String[]{this.f7015d.f7016a.f7027f});
                        }
                        try {
                            this.f7015d.f7016a.f7025d.m10181a(c2103n);
                            this.f7015d.f7016a.f7025d.m10181a(c2103n2);
                            this.f7015d.f7016a.f7025d.m10181a(c2103n3);
                        } catch (Exception e) {
                            Log.e("PossessionsFragment", "Error: " + e);
                        }
                    }
                }
            });
        }
    }

    class C20774 implements C1105h<C1766a> {
        final /* synthetic */ C2081d f7017a;

        C20774(C2081d c2081d) {
            this.f7017a = c2081d;
        }

        public void m10124a(C1766a c1766a) {
            if (c1766a.mo558a().m5972f() == 0) {
                this.f7017a.f7030i = true;
                Log.e("PossessionsFragment", "A6");
            }
        }
    }

    class C20785 implements C1105h<C1766a> {
        final /* synthetic */ C2081d f7018a;

        C20785(C2081d c2081d) {
            this.f7018a = c2081d;
        }

        public void m10126a(C1766a c1766a) {
            if (c1766a.mo558a().m5972f() == 0) {
                this.f7018a.ak = true;
                Log.e("PossessionsFragment", "A9");
            }
        }
    }

    class C20796 implements C1105h<C1766a> {
        final /* synthetic */ C2081d f7019a;

        C20796(C2081d c2081d) {
            this.f7019a = c2081d;
        }

        public void m10128a(C1766a c1766a) {
            if (c1766a.mo558a().m5972f() == 0) {
                this.f7019a.am = true;
                Log.e("PossessionsFragment", "A12");
            }
        }
    }

    private class C2080a extends AsyncTask<String, Void, Bitmap> {
        ImageView f7020a;
        final /* synthetic */ C2081d f7021b;

        public C2080a(C2081d c2081d, ImageView imageView) {
            this.f7021b = c2081d;
            this.f7020a = imageView;
        }

        protected Bitmap m10129a(String... strArr) {
            Bitmap bitmap = null;
            try {
                bitmap = BitmapFactory.decodeStream(new URL(strArr[0]).openStream());
            } catch (Exception e) {
                Log.e("Error", e.getMessage());
                e.printStackTrace();
            }
            return bitmap;
        }

        protected void m10130a(Bitmap bitmap) {
            this.f7020a.setImageBitmap(bitmap);
        }

        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return m10129a((String[]) objArr);
        }

        protected /* synthetic */ void onPostExecute(Object obj) {
            m10130a((Bitmap) obj);
        }
    }

    private void m10131M() {
        new Thread(new C20763(this)).start();
    }

    public static C0018f m10132b(int i) {
        C0018f c2081d = new C2081d();
        Bundle bundle = new Bundle();
        bundle.putInt("identify", i);
        c2081d.m131g(bundle);
        return c2081d;
    }

    public void m10133L() {
        SharedPreferences sharedPreferences = m130g().getSharedPreferences(m97a((int) R.string.preference_file_key), 0);
        this.al = sharedPreferences.getBoolean("A12", false);
        this.am = sharedPreferences.getBoolean("A12U", false);
        this.an = sharedPreferences.getBoolean("A12L", false);
        this.ao = sharedPreferences.getBoolean("A12T", false);
        this.ap = sharedPreferences.getBoolean("A12W", false);
        this.aq = sharedPreferences.getBoolean("A12E", false);
        this.ar = sharedPreferences.getBoolean("A12C", false);
        this.as = sharedPreferences.getBoolean("A12S", false);
        this.at = sharedPreferences.getInt("BANK", 0);
        this.f7028g = sharedPreferences.getBoolean("GOOGLE", false);
        this.f7026e = sharedPreferences.getString("NAME", "Unknown");
        this.f7027f = sharedPreferences.getString("IMAGE", "");
        this.f7029h = sharedPreferences.getBoolean("A6", false);
        this.f7030i = sharedPreferences.getBoolean("A6U", false);
        this.aj = sharedPreferences.getBoolean("A9", false);
        this.ak = sharedPreferences.getBoolean("A9U", false);
    }

    public View mo1679a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_possessions, viewGroup, false);
        this.ay = (LinearLayout) inflate.findViewById(R.id.f2);
        this.f7022a = Typeface.createFromAsset(m130g().getAssets(), "fonts/caviar_dreams.ttf");
        this.f7023b = Typeface.createFromAsset(m130g().getAssets(), "fonts/caviar_dreams_bold.ttf");
        this.aA = Toast.makeText(m130g(), "", 1);
        this.au = (TextView) inflate.findViewById(R.id.profile_name);
        this.au.setTypeface(this.f7023b);
        this.av = (ImageView) inflate.findViewById(R.id.profile_image);
        this.aw = (ImageView) inflate.findViewById(R.id.google_image);
        this.az = (TextView) inflate.findViewById(R.id.google_text);
        this.az.setTypeface(this.f7023b);
        this.ax = (LinearLayout) inflate.findViewById(R.id.google);
        this.f7024c = (ListView) inflate.findViewById(R.id.list);
        this.f7025d = new C2102m(inflate.getContext());
        this.f7024c.setAdapter(this.f7025d);
        this.f7024c.setOnItemClickListener(new C20731(this));
        this.ax.setOnClickListener(new C20742(this));
        return inflate;
    }

    public void m10135a() {
        Editor edit = m130g().getSharedPreferences(m97a((int) R.string.preference_file_key), 0).edit();
        edit.putBoolean("A12", this.al);
        edit.putBoolean("A12U", this.am);
        edit.putBoolean("A12L", this.an);
        edit.putBoolean("A12T", this.ao);
        edit.putBoolean("A12W", this.ap);
        edit.putBoolean("A12E", this.aq);
        edit.putBoolean("A12C", this.ar);
        edit.putBoolean("A12S", this.as);
        edit.putInt("BANK", this.at);
        edit.putBoolean("GOOGLE", this.f7028g);
        edit.putString("NAME", this.f7026e);
        edit.putString("IMAGE", this.f7027f);
        edit.putBoolean("A6", this.f7029h);
        edit.putBoolean("A6U", this.f7030i);
        edit.putBoolean("A9", this.aj);
        edit.putBoolean("A9U", this.ak);
        edit.apply();
    }

    public void mo890a(int i, int i2, Intent intent) {
        super.mo890a(i, i2, intent);
        if (i == 9001) {
            Log.e("PossessionsFragment", "RC_SIGN_IN - " + i2);
            this.aC = false;
            if (i2 == -1) {
                Log.e("PossessionsFragment", "RC_SIGN_IN - RESULT_OK");
                if (!this.aB.mo888d()) {
                    this.aB.mo883b();
                }
            } else if (i2 == 0) {
                Log.e("PossessionsFragment", "RC_SIGN_IN - RESULT_CANCELED");
                m130g().finish();
            } else if (i2 == 10002) {
                Log.e("PossessionsFragment", "RC_SIGN_IN - RESULT_SIGN_IN_FAILED");
                m10138a(this.aA, m132h().getString(R.string.google_play_problem), (int) R.drawable.notice);
                if (!this.aB.mo888d()) {
                    this.aB.mo883b();
                }
            }
        }
    }

    public void mo503a(Bundle bundle) {
        Log.e("PossessionsFragment", "onConnected(): mGoogleApiClient");
        this.f7028g = true;
        if (C1889d.f5748g.mo832a(this.aB) != null) {
            C1886a a = C1889d.f5748g.mo832a(this.aB);
            this.f7026e = a.mo1654e();
            this.f7027f = a.mo1655f().mo1653e();
            this.au.setText(this.f7026e);
            if (!this.f7027f.equals("")) {
                new C2080a(this, this.av).execute(new String[]{this.f7027f});
            }
        }
        this.aw.setImageResource(R.drawable.google_plus_active);
        this.az.setText(R.string.sign_out);
        if (this.f7029h && !this.f7030i) {
            C1776b.f5520g.mo1254a(this.aB, m132h().getString(R.string.achievements_a6)).mo565a(new C20774(this));
        }
        if (this.aj && !this.ak) {
            C1776b.f5520g.mo1254a(this.aB, m132h().getString(R.string.achievements_a9)).mo565a(new C20785(this));
        }
        if (this.al && !this.am) {
            C1776b.f5520g.mo1254a(this.aB, m132h().getString(R.string.achievements_a12)).mo565a(new C20796(this));
        }
        m10135a();
    }

    public void m10138a(Toast toast, String str, int i) {
        View inflate = m130g().getLayoutInflater().inflate(R.layout.toast_message, (ViewGroup) m130g().findViewById(R.id.toast_layout_root));
        ((ImageView) inflate.findViewById(R.id.toast_image)).setImageResource(i);
        ((TextView) inflate.findViewById(R.id.toast_text)).setText(str);
        if (toast.getView().getWindowVisibility() != 0) {
            Log.e("PossessionsFragment", "Exists");
            toast.setDuration(1);
        }
        toast.setGravity(16, 0, 0);
        toast.setView(inflate);
        toast.show();
    }

    public void mo504a(ConnectionResult connectionResult) {
        Log.e("PossessionsFragment", "onConnectionFailed(): " + connectionResult.toString());
        this.f7028g = false;
        this.aw.setImageResource(R.drawable.google_plus_inactive);
        this.az.setText(R.string.sign_in);
        if (!this.aC && connectionResult.m5960a()) {
            try {
                this.aC = true;
                m130g().startIntentSenderForResult(connectionResult.m5963d().getIntentSender(), 9001, null, 0, 0, 0);
            } catch (SendIntentException e) {
                this.aC = false;
                this.aB.mo883b();
            }
        }
    }

    public void a_(int i) {
        Log.e("PossessionsFragment", "onConnectionSuspended(): mGoogleApiClient attempting to connect");
        this.aB.mo883b();
    }

    public void a_(Bundle bundle) {
        super.a_(bundle);
        Log.e("PossessionsFragment", "onCreate");
        this.aB = new C1176a(m130g()).m5993a((C0650b) this).m5994a((C0651c) this).m5992a(C1889d.f5744c).m5991a(C1889d.f5745d).m5992a(C1776b.f5516c).m5991a(C1776b.f5515b).m5992a(C1631a.f5051f).m5991a(C1631a.f5048c).m5996b();
    }

    public void mo14d() {
        super.mo14d();
        Log.e("PossessionsFragment", "onStop");
        this.aB.mo887c();
    }

    public void mo1680p() {
        super.mo1680p();
        Log.e("PossessionsFragment", "onResume");
        m10133L();
        this.f7025d.m10182b();
        m10131M();
        if (this.f7028g) {
            this.f7028g = true;
            this.aw.setImageResource(R.drawable.google_plus_active);
            this.az.setText(R.string.sign_out);
        } else {
            this.f7028g = false;
            this.f7026e = "Unknown";
            this.f7027f = "";
            this.au.setText(this.f7026e);
            this.av.setImageResource(R.drawable.logo2);
            this.aw.setImageResource(R.drawable.google_plus_inactive);
            this.az.setText(R.string.sign_in);
        }
        if (this.an && this.ao && this.ap && this.aq && this.ar && this.as && this.at >= 100) {
            this.al = true;
        }
        if (this.f7028g && this.f7029h && !this.f7030i) {
            this.aB.mo883b();
        } else if (this.f7028g && this.aj && !this.ak) {
            this.aB.mo883b();
        } else if (this.f7028g && this.al && !this.am) {
            this.aB.mo883b();
        }
    }

    public void mo1681q() {
        super.mo1681q();
        Log.e("PossessionsFragment", "onPause");
        m10135a();
    }
}
