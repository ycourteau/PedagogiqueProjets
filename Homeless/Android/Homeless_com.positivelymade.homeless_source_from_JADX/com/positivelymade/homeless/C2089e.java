package com.positivelymade.homeless;

import android.content.Intent;
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
import android.widget.ProgressBar;
import android.widget.TextView;
import java.net.URL;

public class C2089e extends C0018f {
    public String f7045a;
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
    public int aL;
    public int aM;
    public int aN;
    public int aO;
    public int aP;
    public int aQ;
    public boolean aR;
    public boolean aS;
    public boolean aT;
    public boolean aU;
    public boolean aV;
    public boolean aW;
    public boolean aX;
    public boolean aY;
    public boolean aZ;
    public boolean aj;
    public boolean ak;
    public boolean al;
    public boolean am;
    public int an;
    public int ao;
    public int ap;
    public int aq;
    public int ar;
    public boolean as;
    public boolean at;
    public boolean au;
    public boolean av;
    public boolean aw;
    public boolean ax;
    public boolean ay;
    public int az;
    public String f7046b;
    public TextView bA;
    public TextView bB;
    public TextView bC;
    public LinearLayout bD;
    public boolean ba;
    public boolean bb;
    public boolean bc;
    public boolean bd;
    public boolean be;
    public boolean bf;
    public boolean bg;
    public boolean bh;
    public boolean bi;
    public Typeface bj;
    public Typeface bk;
    public ListView bl;
    public C2109r bm;
    public ProgressBar bn;
    public ProgressBar bo;
    public TextView bp;
    public ImageView bq;
    public ImageView br;
    public TextView bs;
    public TextView bt;
    public TextView bu;
    public TextView bv;
    public TextView bw;
    public TextView bx;
    public TextView by;
    public TextView bz;
    public int f7047c;
    public int f7048d;
    public int f7049e;
    public int f7050f;
    public int f7051g;
    public boolean f7052h;
    public boolean f7053i;

    class C20821 implements OnItemClickListener {
        final /* synthetic */ C2089e f7031a;

        C20821(C2089e c2089e) {
            this.f7031a = c2089e;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            String a = ((C2110s) this.f7031a.bm.m10200a().get(i)).m10203a();
            if (a.equals("Hunger")) {
                this.f7031a.m102a(new Intent(this.f7031a.m130g(), HungerActivity.class));
            } else if (a.equals("Health")) {
                this.f7031a.m102a(new Intent(this.f7031a.m130g(), HealthActivity.class));
            }
        }
    }

    class C20832 implements OnClickListener {
        final /* synthetic */ C2089e f7032a;

        C20832(C2089e c2089e) {
            this.f7032a = c2089e;
        }

        public void onClick(View view) {
            this.f7032a.m102a(new Intent(this.f7032a.m130g(), GoogleActivity.class));
        }
    }

    class C20853 implements Runnable {
        final /* synthetic */ C2089e f7034a;

        class C20841 implements Runnable {
            final /* synthetic */ C20853 f7033a;

            C20841(C20853 c20853) {
                this.f7033a = c20853;
            }

            public void run() {
                if (Looper.getMainLooper() == Looper.myLooper()) {
                    Log.e("ProfileFragment", "uValues runOnUiThread");
                    this.f7033a.f7034a.bp.setText(this.f7033a.f7034a.f7045a);
                    if (!this.f7033a.f7034a.f7046b.equals("")) {
                        new C2088a(this.f7033a.f7034a, this.f7033a.f7034a.bq).execute(new String[]{this.f7033a.f7034a.f7046b});
                    }
                    this.f7033a.f7034a.bw.setText("$" + String.format("%,d", new Object[]{Integer.valueOf(this.f7033a.f7034a.f7047c)}).replace(',', ' '));
                    if (this.f7033a.f7034a.am) {
                        this.f7033a.f7034a.by.setText("Mansion");
                    } else if (this.f7033a.f7034a.al) {
                        this.f7033a.f7034a.by.setText("Condo");
                    } else if (this.f7033a.f7034a.ak) {
                        this.f7033a.f7034a.by.setText("House");
                    } else if (this.f7033a.f7034a.aj && this.f7033a.f7034a.ao > 1) {
                        this.f7033a.f7034a.by.setText("Apartment  " + this.f7033a.f7034a.ao + " days left");
                    } else if (this.f7033a.f7034a.aj && this.f7033a.f7034a.ao == 1) {
                        this.f7033a.f7034a.by.setText("Apartment  " + this.f7033a.f7034a.ao + " day left");
                    } else if (this.f7033a.f7034a.f7053i && this.f7033a.f7034a.an > 1) {
                        this.f7033a.f7034a.by.setText("Basement  " + this.f7033a.f7034a.an + " days left");
                    } else if (this.f7033a.f7034a.f7053i && this.f7033a.f7034a.an == 1) {
                        this.f7033a.f7034a.by.setText("Basement  " + this.f7033a.f7034a.an + " day left");
                    } else {
                        this.f7033a.f7034a.by.setText("Cardboard Box");
                    }
                    if (this.f7033a.f7034a.ay) {
                        this.f7033a.f7034a.bA.setText("Helicopter");
                    } else if (this.f7033a.f7034a.ax) {
                        this.f7033a.f7034a.bA.setText("Town Car");
                    } else if (this.f7033a.f7034a.aw) {
                        this.f7033a.f7034a.bA.setText("Truck");
                    } else if (this.f7033a.f7034a.av) {
                        this.f7033a.f7034a.bA.setText("Car");
                    } else if (this.f7033a.f7034a.au) {
                        this.f7033a.f7034a.bA.setText("Bicycle");
                    } else if (this.f7033a.f7034a.at) {
                        this.f7033a.f7034a.bA.setText("Shoes");
                    } else {
                        this.f7033a.f7034a.bA.setText("Barefoot");
                    }
                    if (this.f7033a.f7034a.aV) {
                        this.f7033a.f7034a.bC.setText("University");
                    } else if (this.f7033a.f7034a.aU) {
                        this.f7033a.f7034a.bC.setText("College");
                    } else if (this.f7033a.f7034a.aT) {
                        this.f7033a.f7034a.bC.setText("Masonry");
                    } else if (this.f7033a.f7034a.aS) {
                        this.f7033a.f7034a.bC.setText("School");
                    } else if (this.f7033a.f7034a.aR) {
                        this.f7033a.f7034a.bC.setText("Basic Mathematics");
                    }
                    if (this.f7033a.f7034a.f7049e >= 365) {
                        int i = (this.f7033a.f7034a.f7049e / 365) + 18;
                        int i2 = this.f7033a.f7034a.f7049e % 365;
                        if (i2 == 1) {
                            this.f7033a.f7034a.bu.setText(String.valueOf(i + " years  " + i2 + " day"));
                        } else {
                            this.f7033a.f7034a.bu.setText(String.valueOf(i + " years  " + i2 + " days"));
                        }
                    } else if (this.f7033a.f7034a.f7049e == 1) {
                        this.f7033a.f7034a.bu.setText(String.valueOf("18 years  " + this.f7033a.f7034a.f7049e + " day"));
                    } else {
                        this.f7033a.f7034a.bu.setText(String.valueOf("18 years  " + this.f7033a.f7034a.f7049e + " days"));
                    }
                }
            }
        }

        C20853(C2089e c2089e) {
            this.f7034a = c2089e;
        }

        public void run() {
            this.f7034a.m130g().runOnUiThread(new C20841(this));
        }
    }

    private class C2088a extends AsyncTask<String, Void, Bitmap> {
        ImageView f7043a;
        final /* synthetic */ C2089e f7044b;

        public C2088a(C2089e c2089e, ImageView imageView) {
            this.f7044b = c2089e;
            this.f7043a = imageView;
        }

        protected Bitmap m10143a(String... strArr) {
            Bitmap bitmap = null;
            try {
                bitmap = BitmapFactory.decodeStream(new URL(strArr[0]).openStream());
            } catch (Exception e) {
                Log.e("Error", e.getMessage());
                e.printStackTrace();
            }
            return bitmap;
        }

        protected void m10144a(Bitmap bitmap) {
            this.f7043a.setImageBitmap(bitmap);
        }

        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return m10143a((String[]) objArr);
        }

        protected /* synthetic */ void onPostExecute(Object obj) {
            m10144a((Bitmap) obj);
        }
    }

    private void m10145M() {
        new Thread(new C20853(this)).start();
    }

    private void m10146a(int i, int i2) {
        final Bitmap decodeResource = BitmapFactory.decodeResource(m132h(), R.drawable.hunger);
        final C2110s c2110s = new C2110s();
        final Bitmap decodeResource2 = BitmapFactory.decodeResource(m132h(), R.drawable.health);
        final C2110s c2110s2 = new C2110s();
        final int i3 = i;
        final int i4 = i2;
        new Thread(new Runnable(this) {
            final /* synthetic */ C2089e f7042g;

            class C20861 implements Runnable {
                final /* synthetic */ C20874 f7035a;

                C20861(C20874 c20874) {
                    this.f7035a = c20874;
                }

                public void run() {
                    if (Looper.getMainLooper() == Looper.myLooper()) {
                        Log.e("ProfileFragment", "uVitals runOnUiThread");
                        try {
                            this.f7035a.f7042g.bm.m10201a(c2110s);
                            this.f7035a.f7042g.bm.m10201a(c2110s2);
                        } catch (Exception e) {
                            Log.e("ProfileFragment", "Error: " + e);
                        }
                    }
                }
            }

            public void run() {
                c2110s.m10204a(Bitmap.createScaledBitmap(decodeResource, decodeResource.getWidth(), decodeResource.getHeight(), false));
                c2110s.m10206a("Hunger");
                c2110s.m10208b(String.valueOf(i3) + "/300");
                c2110s.m10205a(this.f7042g.bn);
                c2110s2.m10204a(Bitmap.createScaledBitmap(decodeResource2, decodeResource2.getWidth(), decodeResource2.getHeight(), false));
                c2110s2.m10206a("Health");
                c2110s2.m10208b(String.valueOf(i4) + "/300");
                c2110s2.m10205a(this.f7042g.bo);
                this.f7042g.m130g().runOnUiThread(new C20861(this));
            }
        }).start();
    }

    public static C0018f m10147b(int i) {
        C0018f c2089e = new C2089e();
        Bundle bundle = new Bundle();
        bundle.putInt("identify", i);
        c2089e.m131g(bundle);
        return c2089e;
    }

    public void m10148L() {
        SharedPreferences sharedPreferences = m130g().getSharedPreferences(m97a((int) R.string.preference_file_key), 0);
        this.bi = sharedPreferences.getBoolean("GOOGLE", false);
        this.f7045a = sharedPreferences.getString("NAME", "Unknown");
        this.f7046b = sharedPreferences.getString("IMAGE", "");
        this.f7047c = sharedPreferences.getInt("CASH", 0);
        this.f7048d = sharedPreferences.getInt("BANK", 0);
        this.f7049e = sharedPreferences.getInt("AGE", 0);
        this.f7050f = sharedPreferences.getInt("HUNGER", 80);
        this.f7051g = sharedPreferences.getInt("HEALTH", 80);
        this.f7052h = sharedPreferences.getBoolean("BOX", true);
        this.f7053i = sharedPreferences.getBoolean("BASEMENT", false);
        this.an = sharedPreferences.getInt("BASEMENT_DAYS", 0);
        this.aj = sharedPreferences.getBoolean("APARTMENT", false);
        this.ao = sharedPreferences.getInt("APARTMENT_DAYS", 0);
        this.ak = sharedPreferences.getBoolean("HOUSE", false);
        this.ap = sharedPreferences.getInt("HOUSE_NO", 0);
        this.al = sharedPreferences.getBoolean("CONDO", false);
        this.aq = sharedPreferences.getInt("CONDO_NO", 0);
        this.am = sharedPreferences.getBoolean("MANSION", false);
        this.ar = sharedPreferences.getInt("MANSION_NO", 0);
        this.as = sharedPreferences.getBoolean("BAREFOOT", true);
        this.at = sharedPreferences.getBoolean("SHOES", false);
        this.az = sharedPreferences.getInt("SHOES_NO", 0);
        this.au = sharedPreferences.getBoolean("BICYCLE", false);
        this.aA = sharedPreferences.getInt("BICYCLE_NO", 0);
        this.av = sharedPreferences.getBoolean("CAR", false);
        this.aB = sharedPreferences.getInt("CAR_NO", 0);
        this.aw = sharedPreferences.getBoolean("TRUCK", false);
        this.aC = sharedPreferences.getInt("TRUCK_NO", 0);
        this.ax = sharedPreferences.getBoolean("TOWNCAR", false);
        this.aD = sharedPreferences.getInt("TOWNCAR_NO", 0);
        this.ay = sharedPreferences.getBoolean("HELICOPTER", false);
        this.aE = sharedPreferences.getInt("HELICOPTER_NO", 0);
        this.aF = sharedPreferences.getBoolean("KNIFE", false);
        this.aL = sharedPreferences.getInt("KNIFE_NO", 0);
        this.aG = sharedPreferences.getBoolean("GUN", false);
        this.aM = sharedPreferences.getInt("GUN_NO", 0);
        this.aH = sharedPreferences.getBoolean("SHOTGUN", false);
        this.aN = sharedPreferences.getInt("SHOTGUN_NO", 0);
        this.aI = sharedPreferences.getBoolean("RIFLE", false);
        this.aO = sharedPreferences.getInt("RIFLE_NO", 0);
        this.aJ = sharedPreferences.getBoolean("VEST", false);
        this.aP = sharedPreferences.getInt("VEST_NO", 0);
        this.aK = sharedPreferences.getBoolean("EXPLOSIVES", false);
        this.aQ = sharedPreferences.getInt("EXPLOSIVES_NO", 0);
        this.aR = sharedPreferences.getBoolean("MATH", false);
        this.aS = sharedPreferences.getBoolean("SCHOOL", false);
        this.aT = sharedPreferences.getBoolean("MASONRY", false);
        this.aU = sharedPreferences.getBoolean("COLLEGE", false);
        this.aV = sharedPreferences.getBoolean("UNIVERSITY", false);
        this.aW = sharedPreferences.getBoolean("NOVICE", false);
        this.aX = sharedPreferences.getBoolean("MOBSTER", false);
        this.aY = sharedPreferences.getBoolean("HITMAN", false);
        this.aZ = sharedPreferences.getBoolean("PICKPOCKET", false);
        this.ba = sharedPreferences.getBoolean("BURGLAR", false);
        this.bb = sharedPreferences.getBoolean("MASTER", false);
        this.bc = sharedPreferences.getBoolean("DRIVING", false);
        this.bd = sharedPreferences.getBoolean("LIQUOR", false);
        this.be = sharedPreferences.getBoolean("BUSINESS", false);
        this.bf = sharedPreferences.getBoolean("LAWS", false);
        this.bg = sharedPreferences.getBoolean("ACCOUNTING", false);
        this.bh = sharedPreferences.getBoolean("MANAGEMENT", false);
    }

    public View mo1679a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log.e("ProfileFragment", "onCreateView");
        View inflate = layoutInflater.inflate(R.layout.fragment_profile, viewGroup, false);
        this.bj = Typeface.createFromAsset(m130g().getAssets(), "fonts/caviar_dreams.ttf");
        this.bk = Typeface.createFromAsset(m130g().getAssets(), "fonts/caviar_dreams_bold.ttf");
        this.bp = (TextView) inflate.findViewById(R.id.profile_name);
        this.bp.setTypeface(this.bk);
        this.bq = (ImageView) inflate.findViewById(R.id.profile_image);
        this.br = (ImageView) inflate.findViewById(R.id.google_image);
        this.bs = (TextView) inflate.findViewById(R.id.google_text);
        this.bs.setTypeface(this.bk);
        this.bt = (TextView) inflate.findViewById(R.id.profile_Age);
        this.bt.setTypeface(this.bk);
        this.bu = (TextView) inflate.findViewById(R.id.profile_age);
        this.bu.setTypeface(this.bj);
        this.bv = (TextView) inflate.findViewById(R.id.profile_Cash);
        this.bv.setTypeface(this.bk);
        this.bw = (TextView) inflate.findViewById(R.id.profile_cash);
        this.bw.setTypeface(this.bj);
        this.bx = (TextView) inflate.findViewById(R.id.profile_Lodging);
        this.bx.setTypeface(this.bk);
        this.by = (TextView) inflate.findViewById(R.id.profile_lodging);
        this.by.setTypeface(this.bj);
        this.bz = (TextView) inflate.findViewById(R.id.profile_Transport);
        this.bz.setTypeface(this.bk);
        this.bA = (TextView) inflate.findViewById(R.id.profile_transport);
        this.bA.setTypeface(this.bj);
        this.bB = (TextView) inflate.findViewById(R.id.profile_Education);
        this.bB.setTypeface(this.bk);
        this.bC = (TextView) inflate.findViewById(R.id.profile_education);
        this.bC.setTypeface(this.bj);
        this.bD = (LinearLayout) inflate.findViewById(R.id.google);
        this.bl = (ListView) inflate.findViewById(R.id.list);
        this.bm = new C2109r(inflate.getContext());
        this.bl.setAdapter(this.bm);
        this.bl.setOnItemClickListener(new C20821(this));
        this.bD.setOnClickListener(new C20832(this));
        return inflate;
    }

    public void m10150a() {
        Editor edit = m130g().getSharedPreferences(m97a((int) R.string.preference_file_key), 0).edit();
        edit.putBoolean("GOOGLE", this.bi);
        edit.putString("NAME", this.f7045a);
        edit.putString("IMAGE", this.f7046b);
        edit.putInt("CASH", this.f7047c);
        edit.putInt("BANK", this.f7048d);
        edit.putInt("AGE", this.f7049e);
        edit.putInt("HUNGER", this.f7050f);
        edit.putInt("HEALTH", this.f7051g);
        edit.putBoolean("BOX", this.f7052h);
        edit.putBoolean("BASEMENT", this.f7053i);
        edit.putInt("BASEMENT_DAYS", this.an);
        edit.putBoolean("APARTMENT", this.aj);
        edit.putInt("APARTMENT_DAYS", this.ao);
        edit.putBoolean("HOUSE", this.ak);
        edit.putInt("HOUSE_NO", this.ap);
        edit.putBoolean("CONDO", this.al);
        edit.putInt("CONDO_NO", this.aq);
        edit.putBoolean("MANSION", this.am);
        edit.putInt("MANSION_NO", this.ar);
        edit.putBoolean("BAREFOOT", this.as);
        edit.putBoolean("SHOES", this.at);
        edit.putInt("SHOES_NO", this.az);
        edit.putBoolean("BICYCLE", this.au);
        edit.putInt("BICYCLE_NO", this.aA);
        edit.putBoolean("CAR", this.av);
        edit.putInt("CAR_NO", this.aB);
        edit.putBoolean("TRUCK", this.aw);
        edit.putInt("TRUCK_NO", this.aC);
        edit.putBoolean("TOWNCAR", this.ax);
        edit.putInt("TOWNCAR_NO", this.aD);
        edit.putBoolean("HELICOPTER", this.ay);
        edit.putInt("HELICOPTER_NO", this.aE);
        edit.putBoolean("KNIFE", this.aF);
        edit.putInt("KNIFE_NO", this.aL);
        edit.putBoolean("GUN", this.aG);
        edit.putInt("GUN_NO", this.aM);
        edit.putBoolean("SHOTGUN", this.aH);
        edit.putInt("SHOTGUN_NO", this.aN);
        edit.putBoolean("RIFLE", this.aI);
        edit.putInt("RIFLE_NO", this.aO);
        edit.putBoolean("VEST", this.aJ);
        edit.putInt("VEST_NO", this.aP);
        edit.putBoolean("EXPLOSIVES", this.aK);
        edit.putInt("EXPLOSIVES_NO", this.aQ);
        edit.putBoolean("MATH", this.aR);
        edit.putBoolean("SCHOOL", this.aS);
        edit.putBoolean("MASONRY", this.aT);
        edit.putBoolean("COLLEGE", this.aU);
        edit.putBoolean("UNIVERSITY", this.aV);
        edit.putBoolean("NOVICE", this.aW);
        edit.putBoolean("MOBSTER", this.aX);
        edit.putBoolean("HITMAN", this.aY);
        edit.putBoolean("PICKPOCKET", this.aZ);
        edit.putBoolean("BURGLAR", this.ba);
        edit.putBoolean("MASTER", this.bb);
        edit.putBoolean("DRIVING", this.bc);
        edit.putBoolean("LIQUOR", this.bd);
        edit.putBoolean("BUSINESS", this.be);
        edit.putBoolean("LAWS", this.bf);
        edit.putBoolean("ACCOUNTING", this.bg);
        edit.putBoolean("MANAGEMENT", this.bh);
        edit.apply();
    }

    public void a_(Bundle bundle) {
        super.a_(bundle);
        Log.e("ProfileFragment", "onCreate");
    }

    public void mo14d() {
        super.mo14d();
        Log.e("ProfileFragment", "onStop");
        m10150a();
    }

    public void mo1680p() {
        super.mo1680p();
        Log.e("ProfileFragment", "onResume");
        m10148L();
        m10145M();
        this.bm.m10202b();
        m10146a(this.f7050f, this.f7051g);
        if (this.bi) {
            this.bi = true;
            this.br.setImageResource(R.drawable.google_plus_active);
            this.bs.setText(R.string.sign_out);
            return;
        }
        this.bi = false;
        this.f7045a = "Unknown";
        this.f7046b = "";
        this.bp.setText(this.f7045a);
        this.bq.setImageResource(R.drawable.logo2);
        this.br.setImageResource(R.drawable.google_plus_inactive);
        this.bs.setText(R.string.sign_in);
    }

    public void mo1681q() {
        super.mo1681q();
        Log.e("ProfileFragment", "onPause");
        m10150a();
    }
}
