package com.google.android.gms.games.request;

import android.os.Parcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Player;
import java.util.List;

public interface GameRequest extends Parcelable {
    int mo1562a(String str);

    String mo1563c();

    Game mo1564d();

    Player mo1565e();

    byte[] mo1566g();

    int mo1567h();

    long mo1568i();

    long mo1569j();

    List<Player> mo1570k();
}
