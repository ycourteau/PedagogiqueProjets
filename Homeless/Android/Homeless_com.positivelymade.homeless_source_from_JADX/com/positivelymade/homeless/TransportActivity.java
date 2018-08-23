package com.positivelymade.homeless;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.media.AudioManager;
import android.media.SoundPool;
import android.media.SoundPool.OnLoadCompleteListener;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.C0427a;
import com.google.android.gms.ads.C0476c.C0472a;

public class TransportActivity extends Activity {
    public boolean f6740A;
    public int f6741B;
    public int f6742C;
    public int f6743D;
    public int f6744E;
    public int f6745F;
    public int f6746G;
    public boolean f6747H;
    public boolean f6748I;
    public boolean f6749J;
    public boolean f6750K;
    public Typeface f6751L;
    public Typeface f6752M;
    public AdView f6753N;
    public Button f6754O;
    public ListView f6755P;
    public C2105o f6756Q;
    public TextView f6757R;
    public TextView f6758S;
    public TextView f6759T;
    public TextView f6760U;
    public Toast f6761V;
    public Toast f6762W;
    public Toast f6763X;
    public Toast f6764Y;
    public Toast f6765Z;
    public String f6766a;
    public Toast aa;
    public Toast ab;
    public AudioManager ac;
    public SoundPool ad;
    public int ae;
    public float af;
    public boolean ag;
    public String f6767b;
    public String f6768c;
    public int f6769d;
    public int f6770e;
    public int f6771f;
    public int f6772g;
    public int f6773h;
    public int f6774i;
    public boolean f6775j;
    public boolean f6776k;
    public boolean f6777l;
    public boolean f6778m;
    public boolean f6779n;
    public boolean f6780o;
    public int f6781p;
    public int f6782q;
    public int f6783r;
    public int f6784s;
    public int f6785t;
    public boolean f6786u;
    public boolean f6787v;
    public boolean f6788w;
    public boolean f6789x;
    public boolean f6790y;
    public boolean f6791z;

    class C20201 extends C0427a {
        final /* synthetic */ TransportActivity f6737a;

        C20201(TransportActivity transportActivity) {
            this.f6737a = transportActivity;
        }

        public void mo322a() {
            Log.e("TransportActivity", "Google onAdLoaded");
        }

        public void mo323a(int i) {
            Log.e("TransportActivity", "Google onAdFailedToLoad: " + this.f6737a.m9986a(i));
        }

        public void mo324b() {
            Log.e("TransportActivity", "Google onAdOpened");
        }

        public void mo325c() {
            Log.e("TransportActivity", "Google onAdClosed");
        }

        public void mo326d() {
            Log.d("TransportActivity", "Google onAdLeftApplication");
        }
    }

    class C20212 implements OnItemClickListener {
        final /* synthetic */ TransportActivity f6738a;

        C20212(TransportActivity transportActivity) {
            this.f6738a = transportActivity;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            String b = ((C2106p) this.f6738a.f6756Q.m10187a().get(i)).m10193b();
            boolean z = true;
            switch (b.hashCode()) {
                case -932341662:
                    if (b.equals("$200000")) {
                        z = true;
                        break;
                    }
                    break;
                case 36256:
                    if (b.equals("$40")) {
                        z = false;
                        break;
                    }
                    break;
                case 1123984:
                    if (b.equals("$400")) {
                        z = true;
                        break;
                    }
                    break;
                case 34873343:
                    if (b.equals("$5000")) {
                        z = true;
                        break;
                    }
                    break;
                case 1078303118:
                    if (b.equals("$20000")) {
                        z = true;
                        break;
                    }
                    break;
                case 1082920723:
                    if (b.equals("$70000")) {
                        z = true;
                        break;
                    }
                    break;
            }
            TransportActivity transportActivity;
            switch (z) {
                case false:
                    if (this.f6738a.f6769d < 40) {
                        if (this.f6738a.f6741B != 1) {
                            if (this.f6738a.f6741B <= 1) {
                                this.f6738a.m9991a(this.f6738a.ab, this.f6738a.getResources().getString(R.string.no_cash), R.drawable.money);
                                break;
                            } else {
                                this.f6738a.m9991a(this.f6738a.f6761V, this.f6738a.getResources().getString(R.string.no_cash) + "\n\n" + this.f6738a.getResources().getString(R.string.have_shoes_s) + this.f6738a.f6741B + this.f6738a.getResources().getString(R.string.have_shoes_e2), R.drawable.money);
                                break;
                            }
                        }
                        this.f6738a.m9991a(this.f6738a.f6761V, this.f6738a.getResources().getString(R.string.no_cash) + "\n\n" + this.f6738a.getResources().getString(R.string.have_shoes_s) + this.f6738a.f6741B + this.f6738a.getResources().getString(R.string.have_shoes_e1), R.drawable.money);
                        break;
                    }
                    transportActivity = this.f6738a;
                    transportActivity.f6769d -= 40;
                    transportActivity = this.f6738a;
                    transportActivity.f6741B++;
                    this.f6738a.f6787v = true;
                    transportActivity = this.f6738a;
                    transportActivity.f6772g++;
                    this.f6738a.m9993c();
                    if (this.f6738a.f6741B != 1) {
                        this.f6738a.m9991a(this.f6738a.f6761V, this.f6738a.getResources().getString(R.string.have_shoes_s) + this.f6738a.f6741B + this.f6738a.getResources().getString(R.string.have_shoes_e2), R.drawable.money);
                        break;
                    } else {
                        this.f6738a.m9991a(this.f6738a.f6761V, this.f6738a.getResources().getString(R.string.have_shoes_s) + this.f6738a.f6741B + this.f6738a.getResources().getString(R.string.have_shoes_e1), R.drawable.money);
                        break;
                    }
                case true:
                    if (this.f6738a.f6769d < 400) {
                        if (this.f6738a.f6742C != 1) {
                            if (this.f6738a.f6742C <= 1) {
                                this.f6738a.m9991a(this.f6738a.ab, this.f6738a.getResources().getString(R.string.no_cash), R.drawable.money);
                                break;
                            } else {
                                this.f6738a.m9991a(this.f6738a.f6762W, this.f6738a.getResources().getString(R.string.no_cash) + "\n\n" + this.f6738a.getResources().getString(R.string.have_bicycle_s) + this.f6738a.f6742C + this.f6738a.getResources().getString(R.string.have_bicycle_e2), R.drawable.money);
                                break;
                            }
                        }
                        this.f6738a.m9991a(this.f6738a.f6762W, this.f6738a.getResources().getString(R.string.no_cash) + "\n\n" + this.f6738a.getResources().getString(R.string.have_bicycle_s) + this.f6738a.f6742C + this.f6738a.getResources().getString(R.string.have_bicycle_e1), R.drawable.money);
                        break;
                    }
                    transportActivity = this.f6738a;
                    transportActivity.f6769d -= 400;
                    transportActivity = this.f6738a;
                    transportActivity.f6742C++;
                    this.f6738a.f6788w = true;
                    transportActivity = this.f6738a;
                    transportActivity.f6772g++;
                    this.f6738a.m9993c();
                    if (this.f6738a.f6742C != 1) {
                        this.f6738a.m9991a(this.f6738a.f6762W, this.f6738a.getResources().getString(R.string.have_bicycle_s) + this.f6738a.f6742C + this.f6738a.getResources().getString(R.string.have_bicycle_e2), R.drawable.money);
                        break;
                    } else {
                        this.f6738a.m9991a(this.f6738a.f6762W, this.f6738a.getResources().getString(R.string.have_bicycle_s) + this.f6738a.f6742C + this.f6738a.getResources().getString(R.string.have_bicycle_e1), R.drawable.money);
                        break;
                    }
                case true:
                    if (this.f6738a.f6769d < 5000) {
                        if (this.f6738a.f6743D != 1) {
                            if (this.f6738a.f6743D <= 1) {
                                this.f6738a.m9991a(this.f6738a.ab, this.f6738a.getResources().getString(R.string.no_cash), R.drawable.money);
                                break;
                            } else {
                                this.f6738a.m9991a(this.f6738a.f6763X, this.f6738a.getResources().getString(R.string.no_cash) + "\n\n" + this.f6738a.getResources().getString(R.string.have_car_s) + this.f6738a.f6743D + this.f6738a.getResources().getString(R.string.have_car_e2), R.drawable.money);
                                break;
                            }
                        }
                        this.f6738a.m9991a(this.f6738a.f6763X, this.f6738a.getResources().getString(R.string.no_cash) + "\n\n" + this.f6738a.getResources().getString(R.string.have_car_s) + this.f6738a.f6743D + this.f6738a.getResources().getString(R.string.have_car_e1), R.drawable.money);
                        break;
                    }
                    transportActivity = this.f6738a;
                    transportActivity.f6769d -= 5000;
                    transportActivity = this.f6738a;
                    transportActivity.f6743D++;
                    this.f6738a.f6789x = true;
                    transportActivity = this.f6738a;
                    transportActivity.f6772g++;
                    this.f6738a.m9993c();
                    if (this.f6738a.f6743D != 1) {
                        this.f6738a.m9991a(this.f6738a.f6763X, this.f6738a.getResources().getString(R.string.have_car_s) + this.f6738a.f6743D + this.f6738a.getResources().getString(R.string.have_car_e2), R.drawable.money);
                        break;
                    } else {
                        this.f6738a.m9991a(this.f6738a.f6763X, this.f6738a.getResources().getString(R.string.have_car_s) + this.f6738a.f6743D + this.f6738a.getResources().getString(R.string.have_car_e1), R.drawable.money);
                        break;
                    }
                case true:
                    if (this.f6738a.f6769d < 20000) {
                        if (this.f6738a.f6744E != 1) {
                            if (this.f6738a.f6744E <= 1) {
                                this.f6738a.m9991a(this.f6738a.ab, this.f6738a.getResources().getString(R.string.no_cash), R.drawable.money);
                                break;
                            } else {
                                this.f6738a.m9991a(this.f6738a.f6764Y, this.f6738a.getResources().getString(R.string.no_cash) + "\n\n" + this.f6738a.getResources().getString(R.string.have_truck_e2) + this.f6738a.f6744E + this.f6738a.getResources().getString(R.string.have_truck_e1), R.drawable.money);
                                break;
                            }
                        }
                        this.f6738a.m9991a(this.f6738a.f6764Y, this.f6738a.getResources().getString(R.string.no_cash) + "\n\n" + this.f6738a.getResources().getString(R.string.have_truck_s) + this.f6738a.f6744E + this.f6738a.getResources().getString(R.string.have_truck_e1), R.drawable.money);
                        break;
                    }
                    transportActivity = this.f6738a;
                    transportActivity.f6769d -= 20000;
                    transportActivity = this.f6738a;
                    transportActivity.f6744E++;
                    this.f6738a.f6790y = true;
                    transportActivity = this.f6738a;
                    transportActivity.f6772g++;
                    this.f6738a.m9993c();
                    if (this.f6738a.f6744E != 1) {
                        this.f6738a.m9991a(this.f6738a.f6764Y, this.f6738a.getResources().getString(R.string.have_truck_s) + this.f6738a.f6744E + this.f6738a.getResources().getString(R.string.have_truck_e2), R.drawable.money);
                        break;
                    } else {
                        this.f6738a.m9991a(this.f6738a.f6764Y, this.f6738a.getResources().getString(R.string.have_truck_s) + this.f6738a.f6744E + this.f6738a.getResources().getString(R.string.have_truck_e1), R.drawable.money);
                        break;
                    }
                case true:
                    if (this.f6738a.f6769d < 70000) {
                        if (this.f6738a.f6745F != 1) {
                            if (this.f6738a.f6745F <= 1) {
                                this.f6738a.m9991a(this.f6738a.ab, this.f6738a.getResources().getString(R.string.no_cash), R.drawable.money);
                                break;
                            } else {
                                this.f6738a.m9991a(this.f6738a.f6765Z, this.f6738a.getResources().getString(R.string.no_cash) + "\n\n" + this.f6738a.getResources().getString(R.string.have_towncar_s) + this.f6738a.f6745F + this.f6738a.getResources().getString(R.string.have_towncar_e2), R.drawable.money);
                                break;
                            }
                        }
                        this.f6738a.m9991a(this.f6738a.f6765Z, this.f6738a.getResources().getString(R.string.no_cash) + "\n\n" + this.f6738a.getResources().getString(R.string.have_towncar_s) + this.f6738a.f6745F + this.f6738a.getResources().getString(R.string.have_towncar_e1), R.drawable.money);
                        break;
                    }
                    transportActivity = this.f6738a;
                    transportActivity.f6769d -= 70000;
                    transportActivity = this.f6738a;
                    transportActivity.f6745F++;
                    this.f6738a.f6791z = true;
                    transportActivity = this.f6738a;
                    transportActivity.f6772g++;
                    this.f6738a.m9993c();
                    if (this.f6738a.f6745F != 1) {
                        this.f6738a.m9991a(this.f6738a.f6765Z, this.f6738a.getResources().getString(R.string.have_towncar_s) + this.f6738a.f6745F + this.f6738a.getResources().getString(R.string.have_towncar_e2), R.drawable.money);
                        break;
                    } else {
                        this.f6738a.m9991a(this.f6738a.f6765Z, this.f6738a.getResources().getString(R.string.have_towncar_s) + this.f6738a.f6745F + this.f6738a.getResources().getString(R.string.have_towncar_e1), R.drawable.money);
                        break;
                    }
                case true:
                    if (this.f6738a.f6769d < 200000) {
                        if (this.f6738a.f6746G != 1) {
                            if (this.f6738a.f6746G <= 1) {
                                this.f6738a.m9991a(this.f6738a.ab, this.f6738a.getResources().getString(R.string.no_cash), R.drawable.money);
                                break;
                            } else {
                                this.f6738a.m9991a(this.f6738a.aa, this.f6738a.getResources().getString(R.string.no_cash) + "\n\n" + this.f6738a.getResources().getString(R.string.have_helicopter_s) + this.f6738a.f6746G + this.f6738a.getResources().getString(R.string.have_helicopter_e2), R.drawable.money);
                                break;
                            }
                        }
                        this.f6738a.m9991a(this.f6738a.aa, this.f6738a.getResources().getString(R.string.no_cash) + "\n\n" + this.f6738a.getResources().getString(R.string.have_helicopter_s) + this.f6738a.f6746G + this.f6738a.getResources().getString(R.string.have_helicopter_e1), R.drawable.money);
                        break;
                    }
                    transportActivity = this.f6738a;
                    transportActivity.f6769d -= 200000;
                    transportActivity = this.f6738a;
                    transportActivity.f6746G++;
                    this.f6738a.f6740A = true;
                    transportActivity = this.f6738a;
                    transportActivity.f6772g++;
                    this.f6738a.m9993c();
                    if (this.f6738a.f6746G != 1) {
                        this.f6738a.m9991a(this.f6738a.aa, this.f6738a.getResources().getString(R.string.have_helicopter_s) + this.f6738a.f6746G + this.f6738a.getResources().getString(R.string.have_helicopter_e2), R.drawable.money);
                        break;
                    } else {
                        this.f6738a.m9991a(this.f6738a.aa, this.f6738a.getResources().getString(R.string.have_helicopter_s) + this.f6738a.f6746G + this.f6738a.getResources().getString(R.string.have_helicopter_e1), R.drawable.money);
                        break;
                    }
            }
            this.f6738a.f6757R.setText("$" + String.format("%,d", new Object[]{Integer.valueOf(this.f6738a.f6769d)}).replace(',', ' '));
            this.f6738a.f6759T.setText("$" + String.format("%,d", new Object[]{Integer.valueOf(this.f6738a.f6770e)}).replace(',', ' '));
            this.f6738a.m9989f();
        }
    }

    class C20223 implements OnLoadCompleteListener {
        final /* synthetic */ TransportActivity f6739a;

        C20223(TransportActivity transportActivity) {
            this.f6739a = transportActivity;
        }

        public void onLoadComplete(SoundPool soundPool, int i, int i2) {
            Log.e("TransportActivity", "Sound Loaded");
            this.f6739a.ag = true;
        }
    }

    private String m9986a(int i) {
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

    private void m9989f() {
        this.f6756Q.m10189b();
        Bitmap decodeResource = this.f6786u ? BitmapFactory.decodeResource(getResources(), R.drawable.active) : BitmapFactory.decodeResource(getResources(), R.drawable.not_active);
        C2106p c2106p = new C2106p();
        c2106p.m10192a(getString(R.string.possessions_t_1));
        c2106p.m10194b(getString(R.string.possessions_t_1p));
        c2106p.m10191a(Bitmap.createScaledBitmap(decodeResource, decodeResource.getWidth(), decodeResource.getHeight(), false));
        this.f6756Q.m10188a(c2106p);
        decodeResource = this.f6787v ? BitmapFactory.decodeResource(getResources(), R.drawable.active) : BitmapFactory.decodeResource(getResources(), R.drawable.not_active);
        c2106p = new C2106p();
        c2106p.m10192a(getString(R.string.possessions_t_2));
        c2106p.m10194b(getString(R.string.possessions_t_2p));
        c2106p.m10191a(Bitmap.createScaledBitmap(decodeResource, decodeResource.getWidth(), decodeResource.getHeight(), false));
        this.f6756Q.m10188a(c2106p);
        decodeResource = this.f6788w ? BitmapFactory.decodeResource(getResources(), R.drawable.active) : BitmapFactory.decodeResource(getResources(), R.drawable.not_active);
        c2106p = new C2106p();
        c2106p.m10192a(getString(R.string.possessions_t_3));
        c2106p.m10194b(getString(R.string.possessions_t_3p));
        c2106p.m10191a(Bitmap.createScaledBitmap(decodeResource, decodeResource.getWidth(), decodeResource.getHeight(), false));
        this.f6756Q.m10188a(c2106p);
        Bitmap decodeResource2 = this.f6789x ? BitmapFactory.decodeResource(getResources(), R.drawable.active) : BitmapFactory.decodeResource(getResources(), R.drawable.not_active);
        C2106p c2106p2 = new C2106p();
        c2106p2.m10192a(getString(R.string.possessions_t_4));
        c2106p2.m10194b(getString(R.string.possessions_t_4p));
        c2106p2.m10191a(Bitmap.createScaledBitmap(decodeResource2, decodeResource2.getWidth(), decodeResource.getHeight(), false));
        this.f6756Q.m10188a(c2106p2);
        decodeResource = this.f6790y ? BitmapFactory.decodeResource(getResources(), R.drawable.active) : BitmapFactory.decodeResource(getResources(), R.drawable.not_active);
        c2106p = new C2106p();
        c2106p.m10192a(getString(R.string.possessions_t_5));
        c2106p.m10194b(getString(R.string.possessions_t_5p));
        c2106p.m10191a(Bitmap.createScaledBitmap(decodeResource, decodeResource.getWidth(), decodeResource.getHeight(), false));
        this.f6756Q.m10188a(c2106p);
        decodeResource = this.f6791z ? BitmapFactory.decodeResource(getResources(), R.drawable.active) : BitmapFactory.decodeResource(getResources(), R.drawable.not_active);
        c2106p = new C2106p();
        c2106p.m10192a(getString(R.string.possessions_t_6));
        c2106p.m10194b(getString(R.string.possessions_t_6p));
        c2106p.m10191a(Bitmap.createScaledBitmap(decodeResource, decodeResource.getWidth(), decodeResource.getHeight(), false));
        this.f6756Q.m10188a(c2106p);
        decodeResource = this.f6740A ? BitmapFactory.decodeResource(getResources(), R.drawable.active) : BitmapFactory.decodeResource(getResources(), R.drawable.not_active);
        c2106p = new C2106p();
        c2106p.m10192a(getString(R.string.possessions_t_7));
        c2106p.m10194b(getString(R.string.possessions_t_7p));
        c2106p.m10191a(Bitmap.createScaledBitmap(decodeResource, decodeResource.getWidth(), decodeResource.getHeight(), false));
        this.f6756Q.m10188a(c2106p);
    }

    public void m9990a() {
        Editor edit = getApplicationContext().getSharedPreferences(getString(R.string.preference_file_key), 0).edit();
        edit.putString("CODES", this.f6768c);
        edit.putBoolean("VOLUME", this.f6750K);
        edit.putBoolean("A6", this.f6747H);
        edit.putBoolean("A9", this.f6748I);
        edit.putBoolean("A12T", this.f6749J);
        edit.putString("NAME", this.f6766a);
        edit.putString("LOCATION", this.f6767b);
        edit.putInt("CASH", this.f6769d);
        edit.putInt("BANK", this.f6770e);
        edit.putInt("BANK_DAYS", this.f6771f);
        edit.putInt("AGE", this.f6772g);
        edit.putInt("HUNGER", this.f6773h);
        edit.putInt("HEALTH", this.f6774i);
        edit.putBoolean("BOX", this.f6775j);
        edit.putBoolean("BASEMENT", this.f6776k);
        edit.putInt("BASEMENT_DAYS", this.f6781p);
        edit.putBoolean("APARTMENT", this.f6777l);
        edit.putInt("APARTMENT_DAYS", this.f6782q);
        edit.putBoolean("HOUSE", this.f6778m);
        edit.putInt("HOUSE_NO", this.f6783r);
        edit.putBoolean("CONDO", this.f6779n);
        edit.putInt("CONDO_NO", this.f6784s);
        edit.putBoolean("MANSION", this.f6780o);
        edit.putInt("MANSION_NO", this.f6785t);
        edit.putBoolean("BAREFOOT", this.f6786u);
        edit.putBoolean("SHOES", this.f6787v);
        edit.putInt("SHOES_NO", this.f6741B);
        edit.putBoolean("BICYCLE", this.f6788w);
        edit.putInt("BICYCLE_NO", this.f6742C);
        edit.putBoolean("CAR", this.f6789x);
        edit.putInt("CAR_NO", this.f6743D);
        edit.putBoolean("TRUCK", this.f6790y);
        edit.putInt("TRUCK_NO", this.f6744E);
        edit.putBoolean("TOWNCAR", this.f6791z);
        edit.putInt("TOWNCAR_NO", this.f6745F);
        edit.putBoolean("HELICOPTER", this.f6740A);
        edit.putInt("HELICOPTER_NO", this.f6746G);
        edit.apply();
    }

    public void m9991a(Toast toast, String str, int i) {
        View inflate = getLayoutInflater().inflate(R.layout.toast_message, (ViewGroup) findViewById(R.id.toast_layout_root));
        ((ImageView) inflate.findViewById(R.id.toast_image)).setImageResource(i);
        ((TextView) inflate.findViewById(R.id.toast_text)).setText(str);
        if (toast.getView().getWindowVisibility() != 0) {
            Log.e("TransportActivity", "Exists");
            toast.setDuration(0);
        }
        toast.setGravity(16, 0, 0);
        toast.setView(inflate);
        toast.show();
    }

    public void m9992b() {
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences(getString(R.string.preference_file_key), 0);
        this.f6768c = sharedPreferences.getString("CODES", "");
        this.f6750K = sharedPreferences.getBoolean("VOLUME", true);
        this.f6747H = sharedPreferences.getBoolean("A6", false);
        this.f6748I = sharedPreferences.getBoolean("A9", false);
        this.f6749J = sharedPreferences.getBoolean("A12T", false);
        this.f6766a = sharedPreferences.getString("NAME", "Unknown");
        this.f6767b = sharedPreferences.getString("LOCATION", "n/a");
        this.f6769d = sharedPreferences.getInt("CASH", 0);
        this.f6770e = sharedPreferences.getInt("BANK", 0);
        this.f6771f = sharedPreferences.getInt("BANK_DAYS", 31);
        this.f6772g = sharedPreferences.getInt("AGE", 0);
        this.f6773h = sharedPreferences.getInt("HUNGER", 80);
        this.f6774i = sharedPreferences.getInt("HEALTH", 80);
        this.f6775j = sharedPreferences.getBoolean("BOX", true);
        this.f6776k = sharedPreferences.getBoolean("BASEMENT", false);
        this.f6781p = sharedPreferences.getInt("BASEMENT_DAYS", 0);
        this.f6777l = sharedPreferences.getBoolean("APARTMENT", false);
        this.f6782q = sharedPreferences.getInt("APARTMENT_DAYS", 0);
        this.f6778m = sharedPreferences.getBoolean("HOUSE", false);
        this.f6783r = sharedPreferences.getInt("HOUSE_NO", 0);
        this.f6779n = sharedPreferences.getBoolean("CONDO", false);
        this.f6784s = sharedPreferences.getInt("CONDO_NO", 0);
        this.f6780o = sharedPreferences.getBoolean("MANSION", false);
        this.f6785t = sharedPreferences.getInt("MANSION_NO", 0);
        this.f6786u = sharedPreferences.getBoolean("BAREFOOT", true);
        this.f6787v = sharedPreferences.getBoolean("SHOES", false);
        this.f6741B = sharedPreferences.getInt("SHOES_NO", 0);
        this.f6788w = sharedPreferences.getBoolean("BICYCLE", false);
        this.f6742C = sharedPreferences.getInt("BICYCLE_NO", 0);
        this.f6789x = sharedPreferences.getBoolean("CAR", false);
        this.f6743D = sharedPreferences.getInt("CAR_NO", 0);
        this.f6790y = sharedPreferences.getBoolean("TRUCK", false);
        this.f6744E = sharedPreferences.getInt("TRUCK_NO", 0);
        this.f6791z = sharedPreferences.getBoolean("TOWNCAR", false);
        this.f6745F = sharedPreferences.getInt("TOWNCAR_NO", 0);
        this.f6740A = sharedPreferences.getBoolean("HELICOPTER", false);
        this.f6746G = sharedPreferences.getInt("HELICOPTER_NO", 0);
    }

    public void m9993c() {
        if (this.f6770e == 0) {
            this.f6771f = 31;
        } else if (this.f6770e >= 100 && this.f6771f > 1) {
            this.f6771f--;
        } else if (this.f6770e >= 100 && this.f6771f <= 1) {
            this.f6771f = 30;
            this.f6770e += this.f6770e / 100;
        }
        if (this.f6776k && this.f6781p >= 1) {
            this.f6781p--;
        }
        if (this.f6776k && this.f6781p == 0) {
            this.f6776k = false;
            this.f6781p = 0;
        }
        if (this.f6777l && this.f6782q >= 1) {
            this.f6782q--;
        }
        if (this.f6777l && this.f6782q == 0) {
            this.f6777l = false;
            this.f6782q = 0;
        }
    }

    public void m9994d() {
        if (this.f6750K) {
            this.ac = (AudioManager) getSystemService("audio");
            this.af = ((float) this.ac.getStreamVolume(3)) / ((float) this.ac.getStreamMaxVolume(3));
            this.ad = new SoundPool(10, 3, 0);
            this.ad.setOnLoadCompleteListener(new C20223(this));
            this.ae = this.ad.load(this, R.raw.click, 1);
            return;
        }
        Log.e("TransportActivity", "Sound Not Loaded");
        this.ag = false;
    }

    public void m9995e() {
        try {
            this.ad.play(this.ae, this.af, this.af, 1, 0, 1.0f);
        } catch (Exception e) {
            Log.e("TransportActivity", "Error Playing Sound");
        }
    }

    public void goBack(View view) {
        m9995e();
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.e("TransportActivity", "onCreate");
        setContentView(R.layout.activity_transport);
        this.f6751L = Typeface.createFromAsset(getAssets(), "fonts/caviar_dreams.ttf");
        this.f6752M = Typeface.createFromAsset(getAssets(), "fonts/caviar_dreams_bold.ttf");
        this.f6761V = Toast.makeText(this, "", 0);
        this.f6762W = Toast.makeText(this, "", 0);
        this.f6763X = Toast.makeText(this, "", 0);
        this.f6764Y = Toast.makeText(this, "", 0);
        this.f6765Z = Toast.makeText(this, "", 0);
        this.aa = Toast.makeText(this, "", 0);
        this.ab = Toast.makeText(this, "", 0);
        this.f6753N = (AdView) findViewById(R.id.adView);
        this.f6753N.setAdListener(new C20201(this));
        this.f6753N.m2048a(new C0472a().m2094a());
        this.f6758S = (TextView) findViewById(R.id.cash_title);
        this.f6758S.setTypeface(this.f6752M);
        this.f6757R = (TextView) findViewById(R.id.cash_amount);
        this.f6757R.setTypeface(this.f6751L);
        this.f6760U = (TextView) findViewById(R.id.bank_title);
        this.f6760U.setTypeface(this.f6752M);
        this.f6759T = (TextView) findViewById(R.id.bank_amount);
        this.f6759T.setTypeface(this.f6751L);
        this.f6754O = (Button) findViewById(R.id.back);
        this.f6754O.setTypeface(this.f6752M);
        this.f6755P = (ListView) findViewById(R.id.transport_list);
        this.f6756Q = new C2105o(this);
        this.f6755P.setAdapter(this.f6756Q);
        this.f6755P.setOnItemClickListener(new C20212(this));
    }

    public void onDestroy() {
        super.onDestroy();
        Log.e("TransportActivity", "onDestroy");
        if (this.f6753N != null) {
            this.f6753N.m2047a();
        }
    }

    protected void onPause() {
        super.onPause();
        Log.e("TransportActivity", "onPause");
        if (this.f6753N != null) {
            this.f6753N.m2049b();
        }
        if (this.f6761V != null) {
            this.f6761V.cancel();
        }
        if (this.f6762W != null) {
            this.f6762W.cancel();
        }
        if (this.f6763X != null) {
            this.f6763X.cancel();
        }
        if (this.f6764Y != null) {
            this.f6764Y.cancel();
        }
        if (this.f6765Z != null) {
            this.f6765Z.cancel();
        }
        if (this.aa != null) {
            this.aa.cancel();
        }
        if (this.ab != null) {
            this.ab.cancel();
        }
        if (this.ad != null) {
            this.ad.unload(this.ae);
            this.ad.release();
            this.ad = null;
        }
        if (this.f6789x || this.f6790y || this.f6791z) {
            this.f6747H = true;
        }
        this.f6748I = this.f6740A;
        if (this.f6786u && this.f6787v && this.f6788w && this.f6789x && this.f6790y && this.f6791z && this.f6740A) {
            this.f6749J = true;
        }
        m9990a();
    }

    public void onResume() {
        super.onResume();
        Log.e("TransportActivity", "onResume");
        if (this.f6753N != null) {
            this.f6753N.m2050c();
        }
        m9992b();
        m9994d();
        m9989f();
        this.f6757R.setText("$" + String.format("%,d", new Object[]{Integer.valueOf(this.f6769d)}).replace(',', ' '));
        this.f6759T.setText("$" + String.format("%,d", new Object[]{Integer.valueOf(this.f6770e)}).replace(',', ' '));
    }
}
