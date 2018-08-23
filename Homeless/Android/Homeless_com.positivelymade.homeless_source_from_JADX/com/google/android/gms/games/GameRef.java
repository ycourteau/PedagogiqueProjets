package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.C1239e;
import com.google.android.gms.common.data.DataHolder;

public final class GameRef extends C1239e implements Game {
    public GameRef(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    public String mo1198a() {
        return m6264e("external_game_id");
    }

    public String mo1199b() {
        return m6264e("display_name");
    }

    public String mo1200c() {
        return m6264e("primary_category");
    }

    public String mo1201d() {
        return m6264e("secondary_category");
    }

    public int describeContents() {
        return 0;
    }

    public String mo1202e() {
        return m6264e("game_description");
    }

    public boolean equals(Object obj) {
        return GameEntity.m8218a(this, obj);
    }

    public String mo1203f() {
        return m6264e("developer_name");
    }

    public Uri mo1204g() {
        return m6266g("game_icon_image_uri");
    }

    public String mo1205h() {
        return m6264e("game_icon_image_url");
    }

    public int hashCode() {
        return GameEntity.m8217a((Game) this);
    }

    public Uri mo1206i() {
        return m6266g("game_hi_res_image_uri");
    }

    public String mo1207j() {
        return m6264e("game_hi_res_image_url");
    }

    public Uri mo1208k() {
        return m6266g("featured_image_uri");
    }

    public String mo1209l() {
        return m6264e("featured_image_url");
    }

    public boolean mo1210m() {
        return m6263d("play_enabled_game");
    }

    public boolean mo1211n() {
        return m6263d("muted");
    }

    public boolean mo1212o() {
        return m6263d("identity_sharing_confirmed");
    }

    public boolean mo1213p() {
        return m6262c("installed") > 0;
    }

    public String mo1214q() {
        return m6264e("package_name");
    }

    public int mo1215r() {
        return m6262c("gameplay_acl_status");
    }

    public int mo1216s() {
        return m6262c("achievement_total_count");
    }

    public int mo1217t() {
        return m6262c("leaderboard_count");
    }

    public String toString() {
        return GameEntity.m8220b((Game) this);
    }

    public boolean mo1218u() {
        return m6262c("real_time_support") > 0;
    }

    public boolean mo1219v() {
        return m6262c("turn_based_support") > 0;
    }

    public boolean mo1220w() {
        return m6262c("snapshots_enabled") > 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((GameEntity) m8273z()).writeToParcel(parcel, i);
    }

    public String mo1221x() {
        return m6264e("theme_color");
    }

    public boolean mo1222y() {
        return m6262c("gamepad_support") > 0;
    }

    public Game m8273z() {
        return new GameEntity(this);
    }
}
