package com.positivelymade.homeless;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.media.AudioManager;
import android.media.SoundPool;
import android.media.SoundPool.OnLoadCompleteListener;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.app.C0018f;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.net.URL;
import java.util.Map.Entry;

public class C2072c extends C0018f {
    public Typeface f7001a;
    public boolean aA;
    public boolean aB;
    public boolean aC;
    public boolean aD;
    public boolean aE;
    public boolean aF;
    public boolean aG;
    public boolean aH;
    public boolean aI;
    public boolean aJ;
    public boolean aK;
    public int aL;
    public int aM;
    public boolean aN;
    public boolean aO;
    public boolean aP;
    public boolean aQ;
    public boolean aR;
    public boolean aS;
    public boolean aT;
    public boolean aU;
    public boolean aV;
    public boolean aW;
    public boolean aX;
    public boolean aY;
    public int aZ;
    public int aj;
    public int ak;
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
    public Typeface f7002b;
    public int bA;
    public int bB;
    public int bC;
    public boolean bD;
    public boolean bE;
    public boolean bF;
    public boolean bG;
    public boolean bH;
    public boolean bI;
    public boolean bJ;
    public boolean bK;
    public boolean bL;
    public boolean bM;
    public boolean bN;
    public boolean bO;
    public boolean bP;
    public boolean bQ;
    public boolean bR;
    public boolean bS;
    public boolean bT;
    public TextView bU;
    public TextView bV;
    public TextView bW;
    public TextView bX;
    public TextView bY;
    public TextView bZ;
    public int ba;
    public int bb;
    public int bc;
    public int bd;
    public boolean be;
    public boolean bf;
    public boolean bg;
    public boolean bh;
    public boolean bi;
    public boolean bj;
    public boolean bk;
    public int bl;
    public int bm;
    public int bn;
    public int bo;
    public int bp;
    public int bq;
    public boolean br;
    public boolean bs;
    public boolean bt;
    public boolean bu;
    public boolean bv;
    public boolean bw;
    public int bx;
    public int by;
    public int bz;
    public String f7003c;
    public TextView ca;
    public TextView cb;
    public TextView cc;
    public ImageView cd;
    public ImageView ce;
    public ImageView cf;
    public ImageView cg;
    public ImageView ch;
    public ImageView ci;
    public ImageView cj;
    public ImageView ck;
    public ImageView cl;
    public LinearLayout cm;
    public AudioManager cn;
    public SoundPool co;
    public int cp;
    public float cq;
    public boolean cr;
    public String f7004d;
    public int f7005e;
    public int f7006f;
    public int f7007g;
    public int f7008h;
    public int f7009i;

    class C20611 implements OnClickListener {
        final /* synthetic */ C2072c f6989a;

        C20611(C2072c c2072c) {
            this.f6989a = c2072c;
        }

        public void onClick(View view) {
            this.f6989a.m10109M();
        }
    }

    class C20622 implements OnClickListener {
        final /* synthetic */ C2072c f6990a;

        C20622(C2072c c2072c) {
            this.f6990a = c2072c;
        }

        public void onClick(View view) {
            this.f6990a.m10113Q();
        }
    }

    class C20633 implements OnClickListener {
        final /* synthetic */ C2072c f6991a;

        C20633(C2072c c2072c) {
            this.f6991a = c2072c;
        }

        public void onClick(View view) {
            this.f6991a.m10114R();
        }
    }

    class C20644 implements OnClickListener {
        final /* synthetic */ C2072c f6992a;

        C20644(C2072c c2072c) {
            this.f6992a = c2072c;
        }

        public void onClick(View view) {
            this.f6992a.m10114R();
        }
    }

    class C20655 implements OnClickListener {
        final /* synthetic */ C2072c f6993a;

        C20655(C2072c c2072c) {
            this.f6993a = c2072c;
        }

        public void onClick(View view) {
            this.f6993a.m10115S();
        }
    }

    class C20666 implements OnClickListener {
        final /* synthetic */ C2072c f6994a;

        C20666(C2072c c2072c) {
            this.f6994a = c2072c;
        }

        public void onClick(View view) {
            this.f6994a.m10115S();
        }
    }

    class C20677 implements OnClickListener {
        final /* synthetic */ C2072c f6995a;

        C20677(C2072c c2072c) {
            this.f6995a = c2072c;
        }

        public void onClick(View view) {
            this.f6995a.m102a(new Intent(this.f6995a.m130g(), GoogleActivity.class));
        }
    }

    class C20698 implements Runnable {
        final /* synthetic */ C2072c f6997a;

        class C20681 implements Runnable {
            final /* synthetic */ C20698 f6996a;

            C20681(C20698 c20698) {
                this.f6996a = c20698;
            }

            public void run() {
                if (Looper.getMainLooper() == Looper.myLooper()) {
                    Log.e("MiscFragment", "uMisc runOnUiThread");
                    try {
                        this.f6996a.f6997a.bU.setText(this.f6996a.f6997a.f7003c);
                        if (!this.f6996a.f6997a.f7004d.equals("")) {
                            new C2071a(this.f6996a.f6997a, this.f6996a.f6997a.cd).execute(new String[]{this.f6996a.f6997a.f7004d});
                        }
                    } catch (Exception e) {
                        Log.e("MiscFragment", "Error: " + e);
                    }
                }
            }
        }

        C20698(C2072c c2072c) {
            this.f6997a = c2072c;
        }

        public void run() {
            this.f6997a.m130g().runOnUiThread(new C20681(this));
        }
    }

    class C20709 implements OnLoadCompleteListener {
        final /* synthetic */ C2072c f6998a;

        C20709(C2072c c2072c) {
            this.f6998a = c2072c;
        }

        public void onLoadComplete(SoundPool soundPool, int i, int i2) {
            Log.e("MiscFragment", "Sound Loaded");
            this.f6998a.cr = true;
        }
    }

    private class C2071a extends AsyncTask<String, Void, Bitmap> {
        ImageView f6999a;
        final /* synthetic */ C2072c f7000b;

        public C2071a(C2072c c2072c, ImageView imageView) {
            this.f7000b = c2072c;
            this.f6999a = imageView;
        }

        protected Bitmap m10104a(String... strArr) {
            Bitmap bitmap = null;
            try {
                bitmap = BitmapFactory.decodeStream(new URL(strArr[0]).openStream());
            } catch (Exception e) {
                Log.e("Error", e.getMessage());
                e.printStackTrace();
            }
            return bitmap;
        }

        protected void m10105a(Bitmap bitmap) {
            this.f6999a.setImageBitmap(bitmap);
        }

        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return m10104a((String[]) objArr);
        }

        protected /* synthetic */ void onPostExecute(Object obj) {
            m10105a((Bitmap) obj);
        }
    }

    private void m10106V() {
        new Thread(new C20698(this)).start();
    }

    public static C0018f m10107b(int i) {
        C0018f c2072c = new C2072c();
        Bundle bundle = new Bundle();
        bundle.putInt("identify", i);
        c2072c.m131g(bundle);
        return c2072c;
    }

    public void m10108L() {
        SharedPreferences sharedPreferences = m130g().getSharedPreferences(m97a((int) R.string.preference_file_key), 0);
        this.al = sharedPreferences.getBoolean("GOOGLE", false);
        this.f7003c = sharedPreferences.getString("NAME", "Unknown");
        this.f7004d = sharedPreferences.getString("IMAGE", "");
        this.f7005e = sharedPreferences.getInt("MONEY", 0);
        this.f7006f = sharedPreferences.getInt("CASH", 0);
        this.f7007g = sharedPreferences.getInt("BANK", 0);
        this.f7008h = sharedPreferences.getInt("BANK_DAYS", 31);
        this.f7009i = sharedPreferences.getInt("AGE", 0);
        this.aj = sharedPreferences.getInt("HUNGER", 80);
        this.ak = sharedPreferences.getInt("HEALTH", 80);
        this.am = sharedPreferences.getBoolean("VOLUME", true);
        this.aL = sharedPreferences.getInt("A2C", 0);
        this.aM = sharedPreferences.getInt("A3C", 0);
        this.an = sharedPreferences.getBoolean("A1", false);
        this.ao = sharedPreferences.getBoolean("A2", false);
        this.ap = sharedPreferences.getBoolean("A3", false);
        this.aq = sharedPreferences.getBoolean("A4", false);
        this.ar = sharedPreferences.getBoolean("A5", false);
        this.as = sharedPreferences.getBoolean("A6", false);
        this.at = sharedPreferences.getBoolean("A7", false);
        this.au = sharedPreferences.getBoolean("A8", false);
        this.av = sharedPreferences.getBoolean("A9", false);
        this.aw = sharedPreferences.getBoolean("A10", false);
        this.ax = sharedPreferences.getBoolean("A11", false);
        this.ay = sharedPreferences.getBoolean("A12", false);
        this.az = sharedPreferences.getBoolean("A1U", false);
        this.aA = sharedPreferences.getBoolean("A2U", false);
        this.aB = sharedPreferences.getBoolean("A3U", false);
        this.aC = sharedPreferences.getBoolean("A4U", false);
        this.aD = sharedPreferences.getBoolean("A5U", false);
        this.aE = sharedPreferences.getBoolean("A6U", false);
        this.aF = sharedPreferences.getBoolean("A7U", false);
        this.aG = sharedPreferences.getBoolean("A8U", false);
        this.aH = sharedPreferences.getBoolean("A9U", false);
        this.aI = sharedPreferences.getBoolean("A10U", false);
        this.aJ = sharedPreferences.getBoolean("A11U", false);
        this.aK = sharedPreferences.getBoolean("A12U", false);
        this.aN = sharedPreferences.getBoolean("A12L", false);
        this.aO = sharedPreferences.getBoolean("A12T", false);
        this.aP = sharedPreferences.getBoolean("A12W", false);
        this.aQ = sharedPreferences.getBoolean("A12E", false);
        this.aR = sharedPreferences.getBoolean("A12C", false);
        this.aS = sharedPreferences.getBoolean("A12S", false);
        this.aT = sharedPreferences.getBoolean("BOX", true);
        this.aU = sharedPreferences.getBoolean("BASEMENT", false);
        this.aZ = sharedPreferences.getInt("BASEMENT_DAYS", 0);
        this.aV = sharedPreferences.getBoolean("APARTMENT", false);
        this.ba = sharedPreferences.getInt("APARTMENT_DAYS", 0);
        this.aW = sharedPreferences.getBoolean("HOUSE", false);
        this.bb = sharedPreferences.getInt("HOUSE_NO", 0);
        this.aX = sharedPreferences.getBoolean("CONDO", false);
        this.bc = sharedPreferences.getInt("CONDO_NO", 0);
        this.aY = sharedPreferences.getBoolean("MANSION", false);
        this.bd = sharedPreferences.getInt("MANSION_NO", 0);
        this.be = sharedPreferences.getBoolean("BAREFOOT", true);
        this.bf = sharedPreferences.getBoolean("SHOES", false);
        this.bl = sharedPreferences.getInt("SHOES_NO", 0);
        this.bg = sharedPreferences.getBoolean("BICYCLE", false);
        this.bm = sharedPreferences.getInt("BICYCLE_NO", 0);
        this.bh = sharedPreferences.getBoolean("CAR", false);
        this.bn = sharedPreferences.getInt("CAR_NO", 0);
        this.bi = sharedPreferences.getBoolean("TRUCK", false);
        this.bo = sharedPreferences.getInt("TRUCK_NO", 0);
        this.bj = sharedPreferences.getBoolean("TOWNCAR", false);
        this.bp = sharedPreferences.getInt("TOWNCAR_NO", 0);
        this.bk = sharedPreferences.getBoolean("HELICOPTER", false);
        this.bq = sharedPreferences.getInt("HELICOPTER_NO", 0);
        this.br = sharedPreferences.getBoolean("KNIFE", false);
        this.bx = sharedPreferences.getInt("KNIFE_NO", 0);
        this.bs = sharedPreferences.getBoolean("GUN", false);
        this.by = sharedPreferences.getInt("GUN_NO", 0);
        this.bt = sharedPreferences.getBoolean("SHOTGUN", false);
        this.bz = sharedPreferences.getInt("SHOTGUN_NO", 0);
        this.bu = sharedPreferences.getBoolean("RIFLE", false);
        this.bA = sharedPreferences.getInt("RIFLE_NO", 0);
        this.bv = sharedPreferences.getBoolean("VEST", false);
        this.bB = sharedPreferences.getInt("VEST_NO", 0);
        this.bw = sharedPreferences.getBoolean("EXPLOSIVES", false);
        this.bC = sharedPreferences.getInt("EXPLOSIVES_NO", 0);
        this.bD = sharedPreferences.getBoolean("MATH", false);
        this.bE = sharedPreferences.getBoolean("SCHOOL", false);
        this.bF = sharedPreferences.getBoolean("MASONRY", false);
        this.bG = sharedPreferences.getBoolean("COLLEGE", false);
        this.bH = sharedPreferences.getBoolean("UNIVERSITY", false);
        this.bI = sharedPreferences.getBoolean("NOVICE", false);
        this.bJ = sharedPreferences.getBoolean("MOBSTER", false);
        this.bK = sharedPreferences.getBoolean("HITMAN", false);
        this.bL = sharedPreferences.getBoolean("PICKPOCKET", false);
        this.bM = sharedPreferences.getBoolean("BURGLAR", false);
        this.bN = sharedPreferences.getBoolean("MASTER", false);
        this.bO = sharedPreferences.getBoolean("DRIVING", false);
        this.bP = sharedPreferences.getBoolean("LIQUOR", false);
        this.bQ = sharedPreferences.getBoolean("BUSINESS", false);
        this.bR = sharedPreferences.getBoolean("LAWS", false);
        this.bS = sharedPreferences.getBoolean("ACCOUNTING", false);
        this.bT = sharedPreferences.getBoolean("MANAGEMENT", false);
        for (Entry entry : sharedPreferences.getAll().entrySet()) {
            Log.e("MiscFragment", "RESTART " + ((String) entry.getKey()) + ": " + entry.getValue().toString());
        }
    }

    public void m10109M() {
        m10117U();
        String string = m132h().getString(R.string.download_app_text);
        CharSequence string2 = m132h().getString(R.string.share_app_text);
        try {
            String str = string + " http://play.google.com/store/apps/details?id=" + m130g().getPackageName();
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", str);
            m102a(Intent.createChooser(intent, string2));
        } catch (Exception e) {
            Log.e("MiscFragment", "Share App Error");
            string = string + " http://play.google.com/store/apps/details?id=" + m130g().getPackageName();
            Intent intent2 = new Intent("android.intent.action.SEND");
            intent2.setType("text/plain");
            intent2.putExtra("android.intent.extra.TEXT", string);
            m102a(Intent.createChooser(intent2, string2));
        }
    }

    public void m10110N() {
        m10117U();
        try {
            m102a(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + m130g().getPackageName())));
        } catch (ActivityNotFoundException e) {
            m102a(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + m130g().getPackageName())));
        }
    }

    public void m10111O() {
        m10117U();
        m102a(new Intent(m130g(), SaveGameActivity.class));
    }

    public void m10112P() {
        m10117U();
        m102a(new Intent(m130g(), LoadGameActivity.class));
    }

    public void m10113Q() {
        m10117U();
        m102a(new Intent(m130g(), UnlockablesActivity.class));
    }

    public void m10114R() {
        m10117U();
        m102a(new Intent(m130g(), TshirtActivity.class));
    }

    public void m10115S() {
        m10117U();
        m102a(new Intent(m130g(), DeveloperActivity.class));
    }

    public void m10116T() {
        if (this.am) {
            this.cn = (AudioManager) m130g().getSystemService("audio");
            this.cq = ((float) this.cn.getStreamVolume(3)) / ((float) this.cn.getStreamMaxVolume(3));
            this.co = new SoundPool(10, 3, 0);
            this.co.setOnLoadCompleteListener(new C20709(this));
            this.cp = this.co.load(m130g(), R.raw.click, 1);
            return;
        }
        Log.e("MiscFragment", "Sound Not Loaded");
        this.cr = false;
    }

    public void m10117U() {
        try {
            this.co.play(this.cp, this.cq, this.cq, 1, 0, 1.0f);
        } catch (Exception e) {
            Log.e("MiscFragment", "Error Playing Sound");
        }
    }

    public View mo1679a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_misc, viewGroup, false);
        this.f7001a = Typeface.createFromAsset(m130g().getAssets(), "fonts/caviar_dreams.ttf");
        this.f7002b = Typeface.createFromAsset(m130g().getAssets(), "fonts/caviar_dreams_bold.ttf");
        this.bU = (TextView) inflate.findViewById(R.id.profile_name);
        this.bU.setTypeface(this.f7002b);
        this.cd = (ImageView) inflate.findViewById(R.id.profile_image);
        this.ce = (ImageView) inflate.findViewById(R.id.google_image);
        this.bV = (TextView) inflate.findViewById(R.id.google_text);
        this.bV.setTypeface(this.f7002b);
        this.cm = (LinearLayout) inflate.findViewById(R.id.google);
        this.cf = (ImageView) inflate.findViewById(R.id.imageShare);
        this.bW = (TextView) inflate.findViewById(R.id.textShare);
        this.bW.setTypeface(this.f7002b);
        this.cg = (ImageView) inflate.findViewById(R.id.imageRate);
        this.bX = (TextView) inflate.findViewById(R.id.textRate);
        this.bX.setTypeface(this.f7002b);
        this.ch = (ImageView) inflate.findViewById(R.id.imageSave);
        this.bY = (TextView) inflate.findViewById(R.id.textSave);
        this.bY.setTypeface(this.f7002b);
        this.ci = (ImageView) inflate.findViewById(R.id.imageLoad);
        this.bZ = (TextView) inflate.findViewById(R.id.textLoad);
        this.bZ.setTypeface(this.f7002b);
        this.cj = (ImageView) inflate.findViewById(R.id.imageUnlock);
        this.ca = (TextView) inflate.findViewById(R.id.textUnlock);
        this.ca.setTypeface(this.f7002b);
        this.ck = (ImageView) inflate.findViewById(R.id.imageTshirt);
        this.cb = (TextView) inflate.findViewById(R.id.textTshirt);
        this.cb.setTypeface(this.f7002b);
        this.cl = (ImageView) inflate.findViewById(R.id.imageDeveloper);
        this.cc = (TextView) inflate.findViewById(R.id.textDeveloper);
        this.cc.setTypeface(this.f7002b);
        this.cf.setOnClickListener(new C20611(this));
        this.bW.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ C2072c f6981a;

            {
                this.f6981a = r1;
            }

            public void onClick(View view) {
                this.f6981a.m10109M();
            }
        });
        this.cg.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ C2072c f6982a;

            {
                this.f6982a = r1;
            }

            public void onClick(View view) {
                this.f6982a.m10110N();
            }
        });
        this.bX.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ C2072c f6983a;

            {
                this.f6983a = r1;
            }

            public void onClick(View view) {
                this.f6983a.m10110N();
            }
        });
        this.ch.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ C2072c f6984a;

            {
                this.f6984a = r1;
            }

            public void onClick(View view) {
                this.f6984a.m10111O();
            }
        });
        this.bY.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ C2072c f6985a;

            {
                this.f6985a = r1;
            }

            public void onClick(View view) {
                this.f6985a.m10111O();
            }
        });
        this.ci.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ C2072c f6986a;

            {
                this.f6986a = r1;
            }

            public void onClick(View view) {
                this.f6986a.m10112P();
            }
        });
        this.bZ.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ C2072c f6987a;

            {
                this.f6987a = r1;
            }

            public void onClick(View view) {
                this.f6987a.m10112P();
            }
        });
        this.cj.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ C2072c f6988a;

            {
                this.f6988a = r1;
            }

            public void onClick(View view) {
                this.f6988a.m10113Q();
            }
        });
        this.ca.setOnClickListener(new C20622(this));
        this.ck.setOnClickListener(new C20633(this));
        this.cb.setOnClickListener(new C20644(this));
        this.cl.setOnClickListener(new C20655(this));
        this.cc.setOnClickListener(new C20666(this));
        this.cm.setOnClickListener(new C20677(this));
        return inflate;
    }

    public void m10119a() {
        SharedPreferences sharedPreferences = m130g().getSharedPreferences(m97a((int) R.string.preference_file_key), 0);
        Editor edit = sharedPreferences.edit();
        edit.putBoolean("GOOGLE", this.al);
        edit.putString("NAME", this.f7003c);
        edit.putString("IMAGE", this.f7004d);
        edit.putInt("MONEY", this.f7005e);
        edit.putInt("CASH", this.f7006f);
        edit.putInt("BANK", this.f7007g);
        edit.putInt("BANK_DAYS", this.f7008h);
        edit.putInt("AGE", this.f7009i);
        edit.putInt("HUNGER", this.aj);
        edit.putInt("HEALTH", this.ak);
        edit.putBoolean("VOLUME", this.am);
        edit.putInt("A2C", this.aL);
        edit.putInt("A3C", this.aM);
        edit.putBoolean("A1", this.an);
        edit.putBoolean("A2", this.ao);
        edit.putBoolean("A3", this.ap);
        edit.putBoolean("A4", this.aq);
        edit.putBoolean("A5", this.ar);
        edit.putBoolean("A6", this.as);
        edit.putBoolean("A7", this.at);
        edit.putBoolean("A8", this.au);
        edit.putBoolean("A9", this.av);
        edit.putBoolean("A10", this.aw);
        edit.putBoolean("A11", this.ax);
        edit.putBoolean("A12", this.ay);
        edit.putBoolean("A1U", this.az);
        edit.putBoolean("A2U", this.aA);
        edit.putBoolean("A3U", this.aB);
        edit.putBoolean("A4U", this.aC);
        edit.putBoolean("A5U", this.aD);
        edit.putBoolean("A6U", this.aE);
        edit.putBoolean("A7U", this.aF);
        edit.putBoolean("A8U", this.aG);
        edit.putBoolean("A9U", this.aH);
        edit.putBoolean("A10U", this.aI);
        edit.putBoolean("A11U", this.aJ);
        edit.putBoolean("A12U", this.aK);
        edit.putBoolean("A12L", this.aN);
        edit.putBoolean("A12T", this.aO);
        edit.putBoolean("A12W", this.aP);
        edit.putBoolean("A12E", this.aQ);
        edit.putBoolean("A12C", this.aR);
        edit.putBoolean("A12S", this.aS);
        edit.putBoolean("BOX", this.aT);
        edit.putBoolean("BASEMENT", this.aU);
        edit.putInt("BASEMENT_DAYS", this.aZ);
        edit.putBoolean("APARTMENT", this.aV);
        edit.putInt("APARTMENT_DAYS", this.ba);
        edit.putBoolean("HOUSE", this.aW);
        edit.putInt("HOUSE_NO", this.bb);
        edit.putBoolean("CONDO", this.aX);
        edit.putInt("CONDO_NO", this.bc);
        edit.putBoolean("MANSION", this.aY);
        edit.putInt("MANSION_NO", this.bd);
        edit.putBoolean("BAREFOOT", this.be);
        edit.putBoolean("SHOES", this.bf);
        edit.putInt("SHOES_NO", this.bl);
        edit.putBoolean("BICYCLE", this.bg);
        edit.putInt("BICYCLE_NO", this.bm);
        edit.putBoolean("CAR", this.bh);
        edit.putInt("CAR_NO", this.bn);
        edit.putBoolean("TRUCK", this.bi);
        edit.putInt("TRUCK_NO", this.bo);
        edit.putBoolean("TOWNCAR", this.bj);
        edit.putInt("TOWNCAR_NO", this.bp);
        edit.putBoolean("HELICOPTER", this.bk);
        edit.putInt("HELICOPTER_NO", this.bq);
        edit.putBoolean("KNIFE", this.br);
        edit.putInt("KNIFE_NO", this.bx);
        edit.putBoolean("GUN", this.bs);
        edit.putInt("GUN_NO", this.by);
        edit.putBoolean("SHOTGUN", this.bt);
        edit.putInt("SHOTGUN_NO", this.bz);
        edit.putBoolean("RIFLE", this.bu);
        edit.putInt("RIFLE_NO", this.bA);
        edit.putBoolean("VEST", this.bv);
        edit.putInt("VEST_NO", this.bB);
        edit.putBoolean("EXPLOSIVES", this.bw);
        edit.putInt("EXPLOSIVES_NO", this.bC);
        edit.putBoolean("MATH", this.bD);
        edit.putBoolean("SCHOOL", this.bE);
        edit.putBoolean("MASONRY", this.bF);
        edit.putBoolean("COLLEGE", this.bG);
        edit.putBoolean("UNIVERSITY", this.bH);
        edit.putBoolean("NOVICE", this.bI);
        edit.putBoolean("MOBSTER", this.bJ);
        edit.putBoolean("HITMAN", this.bK);
        edit.putBoolean("PICKPOCKET", this.bL);
        edit.putBoolean("BURGLAR", this.bM);
        edit.putBoolean("MASTER", this.bN);
        edit.putBoolean("DRIVING", this.bO);
        edit.putBoolean("LIQUOR", this.bP);
        edit.putBoolean("BUSINESS", this.bQ);
        edit.putBoolean("LAWS", this.bR);
        edit.putBoolean("ACCOUNTING", this.bS);
        edit.putBoolean("MANAGEMENT", this.bT);
        edit.apply();
        for (Entry entry : sharedPreferences.getAll().entrySet()) {
            Log.e("MiscFragment", "SAVE " + ((String) entry.getKey()) + ": " + entry.getValue().toString());
        }
    }

    public void a_(Bundle bundle) {
        super.a_(bundle);
        Log.e("MiscFragment", "onCreate");
    }

    public void mo14d() {
        super.mo14d();
        Log.e("MiscFragment", "onStop");
        m10119a();
    }

    public void mo1680p() {
        super.mo1680p();
        Log.e("MiscFragment", "onResume");
        m10108L();
        m10116T();
        m10106V();
        if (this.al) {
            this.al = true;
            this.ce.setImageResource(R.drawable.google_plus_active);
            this.bV.setText(R.string.sign_out);
            return;
        }
        this.al = false;
        this.f7003c = "Unknown";
        this.f7004d = "";
        this.bU.setText(this.f7003c);
        this.cd.setImageResource(R.drawable.logo2);
        this.ce.setImageResource(R.drawable.google_plus_inactive);
        this.bV.setText(R.string.sign_in);
    }

    public void mo1681q() {
        super.mo1681q();
        Log.e("MiscFragment", "onPause");
        if (this.co != null) {
            this.co.unload(this.cp);
            this.co.release();
            this.co = null;
        }
        m10119a();
    }
}
