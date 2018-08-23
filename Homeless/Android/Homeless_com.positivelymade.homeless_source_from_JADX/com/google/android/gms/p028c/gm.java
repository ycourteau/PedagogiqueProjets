package com.google.android.gms.p028c;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import java.util.concurrent.Future;

@fn
public final class gm {

    public interface C0975b {
        void mo736a(Bundle bundle);
    }

    private static abstract class C0977a extends gk {
        private C0977a() {
        }

        public void mo487b() {
        }
    }

    public static Future m4814a(final Context context, final int i) {
        return new C0977a() {
            public void mo486a() {
                Editor edit = gm.m4817b(context).edit();
                edit.putInt("webview_cache_version", i);
                edit.apply();
            }
        }.m2829g();
    }

    public static Future m4815a(final Context context, final C0975b c0975b) {
        return new C0977a() {
            public void mo486a() {
                SharedPreferences a = gm.m4817b(context);
                Bundle bundle = new Bundle();
                bundle.putBoolean("use_https", a.getBoolean("use_https", true));
                if (c0975b != null) {
                    c0975b.mo736a(bundle);
                }
            }
        }.m2829g();
    }

    public static Future m4816a(final Context context, final boolean z) {
        return new C0977a() {
            public void mo486a() {
                Editor edit = gm.m4817b(context).edit();
                edit.putBoolean("use_https", z);
                edit.apply();
            }
        }.m2829g();
    }

    private static SharedPreferences m4817b(Context context) {
        return context.getSharedPreferences("admob", 0);
    }

    public static Future m4818b(final Context context, final C0975b c0975b) {
        return new C0977a() {
            public void mo486a() {
                SharedPreferences a = gm.m4817b(context);
                Bundle bundle = new Bundle();
                bundle.putInt("webview_cache_version", a.getInt("webview_cache_version", 0));
                if (c0975b != null) {
                    c0975b.mo736a(bundle);
                }
            }
        }.m2829g();
    }
}
